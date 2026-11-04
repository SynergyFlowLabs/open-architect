package com.planner5d.library.project.application;

import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class m implements dagger.internal.h<ce.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f223670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.smartwizard.interactor.g> f223671b;

    public m(k kVar, ij.c<com.planner5d.library.smartwizard.interactor.g> cVar) {
        this.f223670a = kVar;
        this.f223671b = cVar;
    }

    public static m a(k kVar, ij.c<com.planner5d.library.smartwizard.interactor.g> cVar) {
        return new m(kVar, cVar);
    }

    public static ce.c c(k kVar, com.planner5d.library.smartwizard.interactor.g gVar) {
        return (ce.c) p.f(kVar.b(gVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ce.c get() {
        return c(this.f223670a, this.f223671b.get());
    }
}
