package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@com.google.android.datatransport.runtime.dagger.internal.g
@com.google.android.datatransport.runtime.dagger.internal.a
public final class t implements com.google.android.datatransport.runtime.dagger.internal.c<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Context> f103688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.backends.e> f103689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.scheduling.persistence.d> f103690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<y> f103691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<Executor> f103692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<b6.b> f103693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.time.a> f103694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.time.a> f103695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.scheduling.persistence.c> f103696i;

    public t(ij.c<Context> cVar, ij.c<com.google.android.datatransport.runtime.backends.e> cVar2, ij.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar3, ij.c<y> cVar4, ij.c<Executor> cVar5, ij.c<b6.b> cVar6, ij.c<com.google.android.datatransport.runtime.time.a> cVar7, ij.c<com.google.android.datatransport.runtime.time.a> cVar8, ij.c<com.google.android.datatransport.runtime.scheduling.persistence.c> cVar9) {
        this.f103688a = cVar;
        this.f103689b = cVar2;
        this.f103690c = cVar3;
        this.f103691d = cVar4;
        this.f103692e = cVar5;
        this.f103693f = cVar6;
        this.f103694g = cVar7;
        this.f103695h = cVar8;
        this.f103696i = cVar9;
    }

    public static t a(ij.c<Context> cVar, ij.c<com.google.android.datatransport.runtime.backends.e> cVar2, ij.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar3, ij.c<y> cVar4, ij.c<Executor> cVar5, ij.c<b6.b> cVar6, ij.c<com.google.android.datatransport.runtime.time.a> cVar7, ij.c<com.google.android.datatransport.runtime.time.a> cVar8, ij.c<com.google.android.datatransport.runtime.scheduling.persistence.c> cVar9) {
        return new t(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static s c(Context context, com.google.android.datatransport.runtime.backends.e eVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, y yVar, Executor executor, b6.b bVar, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.scheduling.persistence.c cVar) {
        return new s(context, eVar, dVar, yVar, executor, bVar, aVar, aVar2, cVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c(this.f103688a.get(), this.f103689b.get(), this.f103690c.get(), this.f103691d.get(), this.f103692e.get(), this.f103693f.get(), this.f103694g.get(), this.f103695h.get(), this.f103696i.get());
    }
}
