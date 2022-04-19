package com.hero.spa.core.ioc;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yx
 */
public class IocInit {

    public synchronized static void iocInit(Class mainClass){
        Set<String> scanPackage = new HashSet<>();
        scanPackage.add(mainClass.getPackage().getName());
        Initialize.init(scanPackage);
        Initialize.interflow();
    }
}
