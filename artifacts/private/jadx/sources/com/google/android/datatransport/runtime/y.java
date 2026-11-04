package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@com.google.android.datatransport.runtime.dagger.internal.g("javax.inject.Singleton")
@com.google.android.datatransport.runtime.dagger.internal.a
public final class y implements com.google.android.datatransport.runtime.dagger.internal.c<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.time.a> f103820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.time.a> f103821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.scheduling.e> f103822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> f103823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.w> f103824e;

    public y(ij.c<com.google.android.datatransport.runtime.time.a> cVar, ij.c<com.google.android.datatransport.runtime.time.a> cVar2, ij.c<com.google.android.datatransport.runtime.scheduling.e> cVar3, ij.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> cVar4, ij.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.w> cVar5) {
        this.f103820a = cVar;
        this.f103821b = cVar2;
        this.f103822c = cVar3;
        this.f103823d = cVar4;
        this.f103824e = cVar5;
    }

    public static y a(ij.c<com.google.android.datatransport.runtime.time.a> cVar, ij.c<com.google.android.datatransport.runtime.time.a> cVar2, ij.c<com.google.android.datatransport.runtime.scheduling.e> cVar3, ij.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> cVar4, ij.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.w> cVar5) {
        return new y(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static w c(com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.scheduling.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.s sVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.w wVar) {
        return new w(aVar, aVar2, eVar, sVar, wVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f103820a.get(), this.f103821b.get(), this.f103822c.get(), this.f103823d.get(), this.f103824e.get());
    }
}
