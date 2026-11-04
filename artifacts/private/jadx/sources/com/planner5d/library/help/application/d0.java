package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.statistics.events.v3;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d0 implements dagger.internal.h<v3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f179974a;

    public d0(i iVar) {
        this.f179974a = iVar;
    }

    public static d0 a(i iVar) {
        return new d0(iVar);
    }

    public static v3 c(i iVar) {
        return (v3) dagger.internal.p.f(iVar.u());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v3 get() {
        return c(this.f179974a);
    }
}
