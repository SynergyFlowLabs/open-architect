package com.android.volley;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s<T> f89653a;

    public u(s<T> sVar) {
        this.f89653a = sVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public int a(u<?> uVar) {
        return this.f89653a.compareTo((s) uVar.f89653a);
    }
}
