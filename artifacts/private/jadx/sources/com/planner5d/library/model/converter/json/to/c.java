package com.planner5d.library.model.converter.json.to;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class c implements dagger.internal.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<m> f180644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<h> f180645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<d> f180646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<r> f180647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<k> f180648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<t> f180649f;

    public c(ij.c<m> cVar, ij.c<h> cVar2, ij.c<d> cVar3, ij.c<r> cVar4, ij.c<k> cVar5, ij.c<t> cVar6) {
        this.f180644a = cVar;
        this.f180645b = cVar2;
        this.f180646c = cVar3;
        this.f180647d = cVar4;
        this.f180648e = cVar5;
        this.f180649f = cVar6;
    }

    public static c a(ij.c<m> cVar, ij.c<h> cVar2, ij.c<d> cVar3, ij.c<r> cVar4, ij.c<k> cVar5, ij.c<t> cVar6) {
        return new c(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static b c(m mVar, h hVar, d dVar, r rVar, k kVar, t tVar) {
        return new b(mVar, hVar, dVar, rVar, kVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f180644a.get(), this.f180645b.get(), this.f180646c.get(), this.f180647d.get(), this.f180648e.get(), this.f180649f.get());
    }
}
