package com.planner5d.library.application.designoftheday;

import dagger.internal.h;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class c implements h<kc.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f142505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<f> f142506b;

    public c(a aVar, ij.c<f> cVar) {
        this.f142505a = aVar;
        this.f142506b = cVar;
    }

    public static c a(a aVar, ij.c<f> cVar) {
        return new c(aVar, cVar);
    }

    public static kc.a c(a aVar, f fVar) {
        return (kc.a) p.f(aVar.b(fVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public kc.a get() {
        return c(this.f142505a, this.f142506b.get());
    }
}
