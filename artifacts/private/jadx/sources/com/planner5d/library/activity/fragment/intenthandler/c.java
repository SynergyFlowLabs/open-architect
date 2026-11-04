package com.planner5d.library.activity.fragment.intenthandler;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@e
@s
public final class c implements h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<le.e> f133966a;

    public c(ij.c<le.e> cVar) {
        this.f133966a = cVar;
    }

    public static c a(ij.c<le.e> cVar) {
        return new c(cVar);
    }

    public static b c(le.e eVar) {
        return new b(eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f133966a.get());
    }
}
