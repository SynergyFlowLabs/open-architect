package jl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.y;

/* JADX INFO: loaded from: classes14.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@y(qualifier = i.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface j {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @y(qualifier = i.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        j[] value();
    }

    String[] value();
}
