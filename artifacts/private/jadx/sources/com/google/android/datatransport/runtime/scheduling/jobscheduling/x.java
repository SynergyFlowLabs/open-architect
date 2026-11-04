package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.f
@com.google.android.datatransport.runtime.dagger.internal.g
@com.google.android.datatransport.runtime.dagger.internal.a
public final class x implements com.google.android.datatransport.runtime.dagger.internal.c<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Executor> f103703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.scheduling.persistence.d> f103704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<y> f103705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<b6.b> f103706d;

    public x(ij.c<Executor> cVar, ij.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar2, ij.c<y> cVar3, ij.c<b6.b> cVar4) {
        this.f103703a = cVar;
        this.f103704b = cVar2;
        this.f103705c = cVar3;
        this.f103706d = cVar4;
    }

    public static x a(ij.c<Executor> cVar, ij.c<com.google.android.datatransport.runtime.scheduling.persistence.d> cVar2, ij.c<y> cVar3, ij.c<b6.b> cVar4) {
        return new x(cVar, cVar2, cVar3, cVar4);
    }

    public static w c(Executor executor, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, y yVar, b6.b bVar) {
        return new w(executor, dVar, yVar, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f103703a.get(), this.f103704b.get(), this.f103705c.get(), this.f103706d.get());
    }
}
