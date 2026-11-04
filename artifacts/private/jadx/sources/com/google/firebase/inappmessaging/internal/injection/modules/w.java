package com.google.firebase.inappmessaging.internal.injection.modules;

import io.grpc.s1;

/* JADX INFO: loaded from: classes5.dex */
@q8.d
public class w {
    @q8.e
    @ij.f
    public io.grpc.f a(@ij.b("host") String str) {
        return s1.m(str).b();
    }

    @q8.e
    @ij.b("host")
    @ij.f
    public String b() {
        return "firebaseinappmessaging.googleapis.com";
    }
}
