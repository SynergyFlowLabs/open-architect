package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.s4;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class f implements dagger.internal.h<s4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f179977a;

    public f(c cVar) {
        this.f179977a = cVar;
    }

    public static f a(c cVar) {
        return new f(cVar);
    }

    public static s4 c(c cVar) {
        return (s4) dagger.internal.p.f(cVar.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s4 get() {
        return c(this.f179977a);
    }
}
