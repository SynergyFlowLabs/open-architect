package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic", "javax.inject.Named"})
@com.google.android.datatransport.runtime.dagger.internal.g("javax.inject.Singleton")
@com.google.android.datatransport.runtime.dagger.internal.a
public final class o0 implements com.google.android.datatransport.runtime.dagger.internal.c<n0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.time.a> f103756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.time.a> f103757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<e> f103758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<w0> f103759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<String> f103760e;

    public o0(ij.c<com.google.android.datatransport.runtime.time.a> cVar, ij.c<com.google.android.datatransport.runtime.time.a> cVar2, ij.c<e> cVar3, ij.c<w0> cVar4, ij.c<String> cVar5) {
        this.f103756a = cVar;
        this.f103757b = cVar2;
        this.f103758c = cVar3;
        this.f103759d = cVar4;
        this.f103760e = cVar5;
    }

    public static o0 a(ij.c<com.google.android.datatransport.runtime.time.a> cVar, ij.c<com.google.android.datatransport.runtime.time.a> cVar2, ij.c<e> cVar3, ij.c<w0> cVar4, ij.c<String> cVar5) {
        return new o0(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static n0 c(com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, Object obj, Object obj2, ij.c<String> cVar) {
        return new n0(aVar, aVar2, (e) obj, (w0) obj2, cVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return c(this.f103756a.get(), this.f103757b.get(), this.f103758c.get(), this.f103759d.get(), this.f103760e);
    }
}
