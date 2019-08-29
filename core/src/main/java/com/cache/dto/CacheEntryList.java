package com.cache.dto;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CacheEntryList<K,V> {

    List<CacheEntry<K,V>> cacheList;

}
