package com.planner5d.library.model.manager.payments;

import android.app.Application;
import com.planner5d.library.model.manager.u1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class f implements dagger.internal.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f192276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<u1> f192277b;

    public f(ij.c<Application> cVar, ij.c<u1> cVar2) {
        this.f192276a = cVar;
        this.f192277b = cVar2;
    }

    public static f a(ij.c<Application> cVar, ij.c<u1> cVar2) {
        return new f(cVar, cVar2);
    }

    public static e c(Application application, fg.e<u1> eVar) {
        return new e(application, eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f192276a.get(), dagger.internal.g.a(this.f192277b));
    }
}
