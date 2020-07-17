package com.example.spring.listener.cache;

import lombok.extern.slf4j.Slf4j;
import net.sf.ehcache.CacheException;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import net.sf.ehcache.event.CacheEventListener;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description: ehcache event listener (create log)
 * @author: hcy
 * @create: 2020-07-17 15:56
 **/

@Component
@Slf4j
public class EhcacheEventListener implements CacheEventListener {

    @Override
    public void notifyElementRemoved(Ehcache ehcache, Element element) throws CacheException {

    }

    @Override
    public void notifyElementPut(Ehcache ehcache, Element element) throws CacheException {
        log.info(element.toString() + " saved to ehcache.");
    }

    @Override
    public void notifyElementUpdated(Ehcache ehcache, Element element) throws CacheException {

    }

    @Override
    public void notifyElementExpired(Ehcache ehcache, Element element) {

    }

    @Override
    public void notifyElementEvicted(Ehcache ehcache, Element element) {

    }

    @Override
    public void notifyRemoveAll(Ehcache ehcache) {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    public void dispose() {

    }
}
