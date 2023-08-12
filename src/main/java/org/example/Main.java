package org.example;

import org.springframework.web.reactive.function.client.WebClient;

public class Main {
    public static void main(String[] args) {
        var client = WebClient.builder().build();
        client.get().uri("localhost:1337").retrieve().bodyToMono(String.class).block();
    }
}