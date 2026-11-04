package com.google.api.client.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.FIELD})
@com.google.api.client.util.f
@Retention(RetentionPolicy.RUNTIME)
public @interface h {

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        String key();

        Class<?> ref();
    }

    a[] typeDefinitions();
}
