package com.cache.interfaces;

import com.cache.dto.CacheEntryList;

public interface RapidCache<K, V> {

    //Removes content from caching proxy immediately. When the client requests the data again, it is fetched from the application and stored in the caching proxy.
    // This method removes all variants of the cached content
    void purge(K key);

    //Fetches requested content from the application, even if cached content is available. The content previously stored in the cache is replaced with a new version from the application.
    // This method affects only one variant of the cached content.
    void refresh(K key);

    void purgeAll();

    void refreshAll();

    CacheEntryList<K,V> getAllEntries();

    V getValue(K key);

}
