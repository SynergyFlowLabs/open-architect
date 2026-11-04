package com.planner5d.library.contest.application;

import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class o implements dagger.internal.h<f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148461a;

    public o(b bVar) {
        this.f148461a = bVar;
    }

    public static o a(b bVar) {
        return new o(bVar);
    }

    public static f1 c(b bVar) {
        return (f1) dagger.internal.p.f(bVar.m());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f1 get() {
        return c(this.f148461a);
    }
}
