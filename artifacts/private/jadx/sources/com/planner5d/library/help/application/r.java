package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.e1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class r implements dagger.internal.h<e1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180017a;

    public r(i iVar) {
        this.f180017a = iVar;
    }

    public static r a(i iVar) {
        return new r(iVar);
    }

    public static e1 c(i iVar) {
        return (e1) dagger.internal.p.f(iVar.i());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e1 get() {
        return c(this.f180017a);
    }
}
