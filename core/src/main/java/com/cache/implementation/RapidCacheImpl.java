package com.cache.implementation;

import com.cache.dto.CacheEntryList;
import com.cache.interfaces.RapidCache;


public class RapidCacheImpl<K,V> implements RapidCache<K,V> {


    @Override
    public void purge(K key) {

    }

    @Override
    public void refresh(K key) {

    }

    @Override
    public void purgeAll() {

    }

    @Override
    public void refreshAll() {

    }

    @Override
    public CacheEntryList<K, V> getAllEntries() {
        return null;
    }

    @Override
    public V getValue(K key) {
        return null;
    }
}
