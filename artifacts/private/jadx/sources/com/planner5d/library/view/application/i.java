package com.planner5d.library.view.application;

import com.planner5d.library.activity.fragment.x;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes12.dex */
@r
@dagger.internal.e
@s
public final class i implements dagger.internal.h<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f244843a;

    public i(d dVar) {
        this.f244843a = dVar;
    }

    public static i a(d dVar) {
        return new i(dVar);
    }

    public static x c(d dVar) {
        return (x) p.f(dVar.e());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f244843a);
    }
}
