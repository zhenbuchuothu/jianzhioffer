package com.test;

import jdk.nashorn.internal.objects.annotations.Constructor;

@FunctionalInterface
public interface MyPredicate <T>{
    public boolean test(T t);
}
