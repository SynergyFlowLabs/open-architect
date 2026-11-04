package com.squareup.moshi;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes13.dex */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface g {
    public static final String Z2 = "\u0000";

    boolean ignore() default false;

    String name() default "\u0000";
}
