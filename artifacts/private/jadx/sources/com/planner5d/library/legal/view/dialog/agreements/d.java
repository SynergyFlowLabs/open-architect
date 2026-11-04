package com.planner5d.library.legal.view.dialog.agreements;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@r
@e
@s
public final class d implements h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.legal.model.manager.a> f180436a;

    public d(ij.c<com.planner5d.library.legal.model.manager.a> cVar) {
        this.f180436a = cVar;
    }

    public static d a(ij.c<com.planner5d.library.legal.model.manager.a> cVar) {
        return new d(cVar);
    }

    public static c c(com.planner5d.library.legal.model.manager.a aVar) {
        return new c(aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f180436a.get());
    }
}
