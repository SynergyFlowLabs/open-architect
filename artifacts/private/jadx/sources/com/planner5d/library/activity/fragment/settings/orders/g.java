package com.planner5d.library.activity.fragment.settings.orders;

import android.app.Application;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.s2;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.services.utility.p0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class g implements dagger.internal.h<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f135313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p0> f135314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t> f135315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<b4> f135316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<s2> f135317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<t0> f135318f;

    public g(ij.c<Application> cVar, ij.c<p0> cVar2, ij.c<t> cVar3, ij.c<b4> cVar4, ij.c<s2> cVar5, ij.c<t0> cVar6) {
        this.f135313a = cVar;
        this.f135314b = cVar2;
        this.f135315c = cVar3;
        this.f135316d = cVar4;
        this.f135317e = cVar5;
        this.f135318f = cVar6;
    }

    public static g a(ij.c<Application> cVar, ij.c<p0> cVar2, ij.c<t> cVar3, ij.c<b4> cVar4, ij.c<s2> cVar5, ij.c<t0> cVar6) {
        return new g(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static f c(Application application, p0 p0Var, t tVar, b4 b4Var, s2 s2Var, t0 t0Var) {
        return new f(application, p0Var, tVar, b4Var, s2Var, t0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f135313a.get(), this.f135314b.get(), this.f135315c.get(), this.f135316d.get(), this.f135317e.get(), this.f135318f.get());
    }
}
