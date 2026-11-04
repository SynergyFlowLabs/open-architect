package com.google.zxing;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f130148a;

    protected b(j jVar) {
        this.f130148a = jVar;
    }

    public abstract b a(j jVar);

    public abstract com.google.zxing.common.b b() throws m;

    public abstract com.google.zxing.common.a c(int i10, com.google.zxing.common.a aVar) throws m;

    public final int d() {
        return this.f130148a.b();
    }

    public final j e() {
        return this.f130148a;
    }

    public final int f() {
        return this.f130148a.e();
    }
}
