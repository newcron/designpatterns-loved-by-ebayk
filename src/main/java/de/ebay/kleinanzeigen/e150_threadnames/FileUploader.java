package de.ebay.kleinanzeigen.e150_threadnames;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newCachedThreadPool;

public class FileUploader {

    private ExecutorService executors = newCachedThreadPool(
            new ThreadFactoryBuilder()
                    .setNameFormat("fileuploader-thread-%s")
                    .setDaemon(true)
                    .build());

    void upload(byte[] image) {
        executors.submit(() -> {
                System.out.println("uploaded image successfully");
        });
    }

    public static void main(String... args) {
        new FileUploader().upload("my image data".getBytes());
    }
}
