package org.mql.pharmaciesoptimization.web;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class PharmaciesPathOptimizationAPI extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        set.add( PharmaciesPathOptimizationResources.class );
        return set;
    }
}
