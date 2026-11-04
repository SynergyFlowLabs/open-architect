package cj;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface h {
    public static final String K = "none";
    public static final String L = "custom";
    public static final String M = "io.reactivex:computation";
    public static final String N = "io.reactivex:io";
    public static final String O = "io.reactivex:new-thread";
    public static final String P = "io.reactivex:trampoline";
    public static final String Q = "io.reactivex:single";

    String value();
}
