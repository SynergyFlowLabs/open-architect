package com.planner5d.library.model.converter.json.to;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class a0 implements dagger.internal.h<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<w> f180641a;

    public a0(ij.c<w> cVar) {
        this.f180641a = cVar;
    }

    public static a0 a(ij.c<w> cVar) {
        return new a0(cVar);
    }

    public static z c() {
        return new z();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        z zVarC = c();
        b0.b(zVarC, this.f180641a.get());
        return zVarC;
    }
}
