package com.planner5d.library.model.manager.builtin.materialsmetadataloading;

import android.app.Application;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.i1;
import com.planner5d.library.services.z;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@r
@dagger.internal.e
@s
public final class c implements h<b.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f181125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.bitmaploader.d.g> f181126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<c2> f181127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<i1> f181128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<z> f181129e;

    public c(ij.c<Application> cVar, ij.c<com.planner5d.library.services.bitmaploader.d.g> cVar2, ij.c<c2> cVar3, ij.c<i1> cVar4, ij.c<z> cVar5) {
        this.f181125a = cVar;
        this.f181126b = cVar2;
        this.f181127c = cVar3;
        this.f181128d = cVar4;
        this.f181129e = cVar5;
    }

    public static c a(ij.c<Application> cVar, ij.c<com.planner5d.library.services.bitmaploader.d.g> cVar2, ij.c<c2> cVar3, ij.c<i1> cVar4, ij.c<z> cVar5) {
        return new c(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static b.a c(Application application, com.planner5d.library.services.bitmaploader.d.g gVar, c2 c2Var, i1 i1Var, z zVar) {
        return new b.a(application, gVar, c2Var, i1Var, zVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b.a get() {
        return c(this.f181125a.get(), this.f181126b.get(), this.f181127c.get(), this.f181128d.get(), this.f181129e.get());
    }
}
