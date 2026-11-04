package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.f({"javax.inject.Named"})
@com.google.android.datatransport.runtime.dagger.internal.g
@com.google.android.datatransport.runtime.dagger.internal.a
public final class x0 implements com.google.android.datatransport.runtime.dagger.internal.c<w0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Context> f103804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<String> f103805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<Integer> f103806c;

    public x0(ij.c<Context> cVar, ij.c<String> cVar2, ij.c<Integer> cVar3) {
        this.f103804a = cVar;
        this.f103805b = cVar2;
        this.f103806c = cVar3;
    }

    public static x0 a(ij.c<Context> cVar, ij.c<String> cVar2, ij.c<Integer> cVar3) {
        return new x0(cVar, cVar2, cVar3);
    }

    public static w0 c(Context context, String str, int i10) {
        return new w0(context, str, i10);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w0 get() {
        return c(this.f103804a.get(), this.f103805b.get(), this.f103806c.get().intValue());
    }
}
