package com.planner5d.library.userimporteddata;

import com.planner5d.library.services.z;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class m implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z> f235830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.filedownloader.c> f235831b;

    public m(ij.c<z> cVar, ij.c<com.planner5d.library.services.filedownloader.c> cVar2) {
        this.f235830a = cVar;
        this.f235831b = cVar2;
    }

    public static m a(ij.c<z> cVar, ij.c<com.planner5d.library.services.filedownloader.c> cVar2) {
        return new m(cVar, cVar2);
    }

    public static l c(z zVar, com.planner5d.library.services.filedownloader.c cVar) {
        return new l(zVar, cVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f235830a.get(), this.f235831b.get());
    }
}
