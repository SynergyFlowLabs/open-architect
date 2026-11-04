package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes14.dex */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface a {
    public static final String M3 = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";
    public static final String N3 = "this";
    public static final String O3 = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";
    public static final String P3 = "The return value of this method";
    public static final String Q3 = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}
