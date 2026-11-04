package com.google.firebase.perf.metrics;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes5.dex */
@Retention(RetentionPolicy.CLASS)
public @interface a {
    boolean enabled() default true;

    String name();
}
