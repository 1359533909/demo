// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.other.utils.function.downLoad;

import org.springframework.util.FileCopyUtils;

import javax.net.ssl.HttpsURLConnection;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @author mxl
 * @version 1.0
 * 2021/5/19 下午5:28
 **/
public class ImageDownLoad {
    public static void main(String[] args) {
        String image = "https://p0.meituan.net/enhancedimage/acdf8f3834f043c69719b9e14f3963d343331.jpg";
        try {
            URL url = new URL(image);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            InputStream inputStream = conn.getInputStream();
            byte[] bytes = FileCopyUtils.copyToByteArray(inputStream);
            File out = new File("testImage.jpg");
            FileCopyUtils.copy(bytes, out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
