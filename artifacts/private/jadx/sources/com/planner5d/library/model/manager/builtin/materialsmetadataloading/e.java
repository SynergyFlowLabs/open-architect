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
public final class e implements h<d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f181139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.bitmaploader.d.g> f181140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<c2> f181141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<i1> f181142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<z> f181143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.r> f181144f;

    public e(ij.c<Application> cVar, ij.c<com.planner5d.library.services.bitmaploader.d.g> cVar2, ij.c<c2> cVar3, ij.c<i1> cVar4, ij.c<z> cVar5, ij.c<com.planner5d.library.model.r> cVar6) {
        this.f181139a = cVar;
        this.f181140b = cVar2;
        this.f181141c = cVar3;
        this.f181142d = cVar4;
        this.f181143e = cVar5;
        this.f181144f = cVar6;
    }

    public static e a(ij.c<Application> cVar, ij.c<com.planner5d.library.services.bitmaploader.d.g> cVar2, ij.c<c2> cVar3, ij.c<i1> cVar4, ij.c<z> cVar5, ij.c<com.planner5d.library.model.r> cVar6) {
        return new e(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static d.a c(Application application, com.planner5d.library.services.bitmaploader.d.g gVar, c2 c2Var, i1 i1Var, z zVar, com.planner5d.library.model.r rVar) {
        return new d.a(application, gVar, c2Var, i1Var, zVar, rVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d.a get() {
        return c(this.f181139a.get(), this.f181140b.get(), this.f181141c.get(), this.f181142d.get(), this.f181143e.get(), this.f181144f.get());
    }
}
