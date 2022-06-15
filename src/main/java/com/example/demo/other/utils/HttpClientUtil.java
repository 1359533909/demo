// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.other.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @author mxl
 * @version 1.0
 * 2021/1/28 下午7:23
 **/
public class HttpClientUtil {
    protected static Log logger = LogFactory.getLog(HttpClientUtil.class);

    private static PoolingHttpClientConnectionManager cm;
    private static String EMPTY_STR = "";
    private static String UTF_8 = "UTF-8";

    private static void init() {
        if (cm == null) {
            cm = new PoolingHttpClientConnectionManager();
            cm.setMaxTotal(50);// 整个连接池最大连接数
            cm.setDefaultMaxPerRoute(5);// 每路由最大连接数，默认值是2
        }
    }

    /**
     * 通过连接池获取HttpClient
     *
     * @return
     */
    public static CloseableHttpClient getHttpClient() {
        init();
        return HttpClients.custom().setConnectionManager(cm).build();
    }

    public static String httpGetRequest(String url) {
        HttpGet httpGet = new HttpGet(url);
        return getResult(httpGet);
    }

    public static String httpPostRequest(String url) {
        HttpPost httpPost = new HttpPost(url);
        return getResult(httpPost);
    }

    public static String httpPostRequest(String url, String strBody)
            throws Exception {
        HttpPost httpPost = new HttpPost(url);
        StringEntity stringEntity = new StringEntity(strBody, ContentType.APPLICATION_JSON);
        httpPost.setEntity(stringEntity);
        return getResult(httpPost);
    }

    private static String getResult(HttpRequestBase request) {

        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(60000)
                .setConnectionRequestTimeout(5000).setSocketTimeout(60000).build();
        request.setConfig(requestConfig);// 设置请求和传输超时时间

        // CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpClient httpClient = getHttpClient();
        try {
            CloseableHttpResponse response = httpClient.execute(request); //执行请求
            // response.getStatusLine().getStatusCode();
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                // long len = entity.getContentLength();// -1 表示长度未知
                String result = EntityUtils.toString(entity);
                response.close();
                // httpClient.close();
                return result;
            }
        } catch (ClientProtocolException e) {
            logger.error("[maperror] HttpClientUtil ClientProtocolException : " + e.getMessage());
        } catch (IOException e) {
            logger.error("[maperror] HttpClientUtil IOException : " + e.getMessage());
        } finally {

        }
        return EMPTY_STR;
    }
}
