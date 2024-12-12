package com.generation.blogpessoal.security;

import java.security.SecureRandom;
import java.util.Base64;

public class KeyGenerator {
	public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        byte[] key = new byte[32]; // 256 bits
        random.nextBytes(key);
        String encodedKey = Base64.getEncoder().encodeToString(key);
        System.out.println("Generated Key: " + encodedKey);
    }
}
