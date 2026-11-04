package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.Monotonic"})
@com.google.android.datatransport.runtime.dagger.internal.g
@com.google.android.datatransport.runtime.dagger.internal.a
public final class i implements com.google.android.datatransport.runtime.dagger.internal.c<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Context> f103610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.scheduling.persistence.d> f103611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> f103612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.time.a> f103613d;

    public i(ij.c<Context> cVar, ij.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar2, ij.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> cVar3, ij.c<com.google.android.datatransport.runtime.time.a> cVar4) {
        this.f103610a = cVar;
        this.f103611b = cVar2;
        this.f103612c = cVar3;
        this.f103613d = cVar4;
    }

    public static i a(ij.c<Context> cVar, ij.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar2, ij.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> cVar3, ij.c<com.google.android.datatransport.runtime.time.a> cVar4) {
        return new i(cVar, cVar2, cVar3, cVar4);
    }

    public static y c(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.g gVar, com.google.android.datatransport.runtime.time.a aVar) {
        return (y) com.google.android.datatransport.runtime.dagger.internal.e.f(h.b(context, dVar, gVar, aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f103610a.get(), this.f103611b.get(), this.f103612c.get(), this.f103613d.get());
    }
}
