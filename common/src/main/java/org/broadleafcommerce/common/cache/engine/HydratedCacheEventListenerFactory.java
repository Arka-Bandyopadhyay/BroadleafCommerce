/*
 * #%L
 * BroadleafCommerce Common Libraries
 * %%
 * Copyright (C) 2009 - 2016 Broadleaf Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.broadleafcommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.broadleafcommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Broadleaf Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package org.broadleafcommerce.common.cache.engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.FactoryBuilder;
import javax.cache.configuration.MutableCacheEntryListenerConfiguration;
import javax.cache.spi.CachingProvider;

/**
 * 
 * @author jfischer
 *
 */
@Component("blHydratedCacheEventListenerFactory")
public class HydratedCacheEventListenerFactory {

    private static HydratedCacheManager manager = null;

    @Autowired
    public HydratedCacheEventListenerFactory(@Qualifier("blHydratedCacheMangager") HydratedCacheManager hydratedCacheManager, 
                                             @Value("${cache.hydratedCache.names}") List<String> cacheNames,
                                             @Value("${cache.hydratedCache.require.old.value:false}") Boolean oldValue,
                                             @Value("${cache.hydratedCache.require.synchronous:true}") Boolean synchronous) {
        // TODO 6.1 ehcache 3 should we attach the listeners here?
//        for (String cacheName : cacheNames) {
//            CachingProvider provider = Caching.getCachingProvider();
//            CacheManager cacheManager = provider.getCacheManager();
//            Cache cache = cacheManager.getCache(cacheName);
//            cache.registerCacheEntryListener(new MutableCacheEntryListenerConfiguration(FactoryBuilder.factoryOf(hydratedCacheManager), null, oldValue, synchronous));
//        }
//        manager = hydratedCacheManager;
    }

    public static HydratedCacheManager getConfiguredManager() {
        return manager;
    }
}
