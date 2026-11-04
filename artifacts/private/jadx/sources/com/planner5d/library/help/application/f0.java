package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.z4;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f0 implements dagger.internal.h<z4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f179978a;

    public f0(i iVar) {
        this.f179978a = iVar;
    }

    public static f0 a(i iVar) {
        return new f0(iVar);
    }

    public static z4 c(i iVar) {
        return (z4) dagger.internal.p.f(iVar.w());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z4 get() {
        return c(this.f179978a);
    }
}
