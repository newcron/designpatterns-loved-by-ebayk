package de.ebay.kleinanzeigen.e150_threadnames;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newCachedThreadPool;

public class FileUploader {

    private ExecutorService executors = newCachedThreadPool();

    void upload(byte[] image) {
        executors.submit(() -> {
                System.out.println("uploaded image successfully");
        });
    }

    public static void main(String... args) {
        new FileUploader().upload("my image data".getBytes());
    }
}
