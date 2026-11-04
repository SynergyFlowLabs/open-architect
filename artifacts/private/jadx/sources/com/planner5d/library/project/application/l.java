package com.planner5d.library.project.application;

import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class l implements dagger.internal.h<le.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f223668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.smartwizard.interactor.c> f223669b;

    public l(k kVar, ij.c<com.planner5d.library.smartwizard.interactor.c> cVar) {
        this.f223668a = kVar;
        this.f223669b = cVar;
    }

    public static l a(k kVar, ij.c<com.planner5d.library.smartwizard.interactor.c> cVar) {
        return new l(kVar, cVar);
    }

    public static le.c c(k kVar, com.planner5d.library.smartwizard.interactor.c cVar) {
        return (le.c) p.f(kVar.a(cVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.c get() {
        return c(this.f223668a, this.f223669b.get());
    }
}
