package jl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.p;

/* JADX INFO: loaded from: classes14.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@p
@yl.c(qualifier = i.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface b {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @yl.c(qualifier = i.class)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        b[] value();
    }

    String[] expression();

    boolean result();
}
