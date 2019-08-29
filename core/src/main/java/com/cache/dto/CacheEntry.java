package com.cache.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CacheEntry<K,V> {
    K key;
    V value;
}
