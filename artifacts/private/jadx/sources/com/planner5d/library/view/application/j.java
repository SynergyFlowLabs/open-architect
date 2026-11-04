package com.planner5d.library.view.application;

import com.planner5d.library.model.manager.u1;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes12.dex */
@r
@dagger.internal.e
@s
public final class j implements dagger.internal.h<u1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f244844a;

    public j(d dVar) {
        this.f244844a = dVar;
    }

    public static j a(d dVar) {
        return new j(dVar);
    }

    public static u1 c(d dVar) {
        return (u1) p.f(dVar.f());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u1 get() {
        return c(this.f244844a);
    }
}
