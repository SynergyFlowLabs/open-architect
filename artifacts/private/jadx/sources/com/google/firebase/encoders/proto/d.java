package com.google.firebase.encoders.proto;

/* JADX INFO: loaded from: classes5.dex */
@k8.b
public @interface d {

    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
