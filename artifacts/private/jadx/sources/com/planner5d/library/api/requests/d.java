package com.planner5d.library.api.requests;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@e
@s
public final class d implements h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<a> f142344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.b> f142345b;

    public d(ij.c<a> cVar, ij.c<com.planner5d.library.api.b> cVar2) {
        this.f142344a = cVar;
        this.f142345b = cVar2;
    }

    public static d a(ij.c<a> cVar, ij.c<com.planner5d.library.api.b> cVar2) {
        return new d(cVar, cVar2);
    }

    public static c c(a aVar, com.planner5d.library.api.b bVar) {
        return new c(aVar, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f142344a.get(), this.f142345b.get());
    }
}
