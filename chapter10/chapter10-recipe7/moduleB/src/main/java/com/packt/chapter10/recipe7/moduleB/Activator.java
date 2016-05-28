package com.packt.chapter10.recipe7.moduleB;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public void start(BundleContext context) {
        System.out.println("OpenDaylight starting moduleB bundle");
    }

    public void stop(BundleContext context) {
        System.out.println("OpenDaylight stopping moduleB bundle");
    }

}
