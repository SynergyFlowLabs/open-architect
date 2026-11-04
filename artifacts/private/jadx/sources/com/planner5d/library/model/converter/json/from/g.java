package com.planner5d.library.model.converter.json.from;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class g implements dagger.internal.h<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<o> f180591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<h> f180592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<s> f180593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<m> f180594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<j> f180595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<u> f180596f;

    public g(ij.c<o> cVar, ij.c<h> cVar2, ij.c<s> cVar3, ij.c<m> cVar4, ij.c<j> cVar5, ij.c<u> cVar6) {
        this.f180591a = cVar;
        this.f180592b = cVar2;
        this.f180593c = cVar3;
        this.f180594d = cVar4;
        this.f180595e = cVar5;
        this.f180596f = cVar6;
    }

    public static g a(ij.c<o> cVar, ij.c<h> cVar2, ij.c<s> cVar3, ij.c<m> cVar4, ij.c<j> cVar5, ij.c<u> cVar6) {
        return new g(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static f c(o oVar, h hVar, s sVar, m mVar, j jVar, u uVar) {
        return new f(oVar, hVar, sVar, mVar, jVar, uVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f180591a.get(), this.f180592b.get(), this.f180593c.get(), this.f180594d.get(), this.f180595e.get(), this.f180596f.get());
    }
}
