// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.other.utils.function.juc;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

import static java.util.concurrent.CompletableFuture.supplyAsync;

/**
 * @author mxl
 * @version 1.0
 * 2021/8/2 下午10:53
 **/
@Slf4j
public class JucTest {
    private ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(8, 8, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(500), new ThreadPoolExecutor.CallerRunsPolicy());

    public void multiGetList(List<Long> productIds) {
        if (productIds.isEmpty())
            return;
        List<List<Long>> partition = Lists.partition(productIds, 10);
        List<CompletableFuture<List<Long>>> completableFutureList = new ArrayList<>();

        // 多线程查询优惠信息
        for (List<Long> products : partition) {
            CompletableFuture<List<Long>> promotionFuture = CompletableFuture
                                                                .supplyAsync(() -> getInfos(products), poolExecutor)
                                                                .exceptionally(e -> {
                                                                    log.error("multiGetPromotionListByProductIdList -> error, 请求参数{}", products, e);
                                                                    return Collections.EMPTY_LIST;
                                                                });
            completableFutureList.add(promotionFuture);
        }
        for (CompletableFuture<List<Long>> future : completableFutureList) {
            try {
                List<Long> products = future.get();
            } catch (Exception e) {
                log.error("multiGetList, error ->", e);
            }
        }

    }

    public List<Long> getInfos(List<Long> productIds) {
        return productIds;
    }
}
