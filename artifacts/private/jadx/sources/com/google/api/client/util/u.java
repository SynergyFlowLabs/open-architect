package com.google.api.client.util;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.api.client.repackaged.com.google.common.base.k f116178a;

    private u(com.google.api.client.repackaged.com.google.common.base.k kVar) {
        this.f116178a = kVar;
    }

    public static u b(char c10) {
        return new u(com.google.api.client.repackaged.com.google.common.base.k.o(c10));
    }

    public final String a(Iterable<?> iterable) {
        return this.f116178a.k(iterable);
    }
}
