package com.planner5d.library.view.application;

import android.content.Context;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes12.dex */
@r
@dagger.internal.e
@s
public final class f implements dagger.internal.h<Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f244840a;

    public f(d dVar) {
        this.f244840a = dVar;
    }

    public static f a(d dVar) {
        return new f(dVar);
    }

    public static Context c(d dVar) {
        return (Context) p.f(dVar.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c(this.f244840a);
    }
}
