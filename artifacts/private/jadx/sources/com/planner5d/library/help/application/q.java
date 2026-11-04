package com.planner5d.library.help.application;

import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class q implements dagger.internal.h<f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180016a;

    public q(i iVar) {
        this.f180016a = iVar;
    }

    public static q a(i iVar) {
        return new q(iVar);
    }

    public static f1 c(i iVar) {
        return (f1) dagger.internal.p.f(iVar.h());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f1 get() {
        return c(this.f180016a);
    }
}
