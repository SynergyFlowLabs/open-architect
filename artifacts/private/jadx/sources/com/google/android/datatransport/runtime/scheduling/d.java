package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.f
@com.google.android.datatransport.runtime.dagger.internal.g
@com.google.android.datatransport.runtime.dagger.internal.a
public final class d implements com.google.android.datatransport.runtime.dagger.internal.c<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Executor> f103604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.backends.e> f103605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<y> f103606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.scheduling.persistence.d> f103607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<b6.b> f103608e;

    public d(ij.c<Executor> cVar, ij.c<com.google.android.datatransport.runtime.backends.e> cVar2, ij.c<y> cVar3, ij.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar4, ij.c<b6.b> cVar5) {
        this.f103604a = cVar;
        this.f103605b = cVar2;
        this.f103606c = cVar3;
        this.f103607d = cVar4;
        this.f103608e = cVar5;
    }

    public static d a(ij.c<Executor> cVar, ij.c<com.google.android.datatransport.runtime.backends.e> cVar2, ij.c<y> cVar3, ij.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar4, ij.c<b6.b> cVar5) {
        return new d(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static c c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, y yVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, b6.b bVar) {
        return new c(executor, eVar, yVar, dVar, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f103604a.get(), this.f103605b.get(), this.f103606c.get(), this.f103607d.get(), this.f103608e.get());
    }
}
