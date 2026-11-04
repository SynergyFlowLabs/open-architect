package com.planner5d.library.activity.fragment.profile.edit;

import com.planner5d.library.modules.user.user.g1;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.z;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class p implements dagger.internal.h<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f134672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f134673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<z> f134674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<g1> f134675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.imagechooser.j> f134676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f134677f;

    public p(ij.c<com.planner5d.library.application.b> cVar, ij.c<t> cVar2, ij.c<z> cVar3, ij.c<g1> cVar4, ij.c<com.planner5d.library.activity.helper.imagechooser.j> cVar5, ij.c<com.planner5d.library.model.manager.config.j> cVar6) {
        this.f134672a = cVar;
        this.f134673b = cVar2;
        this.f134674c = cVar3;
        this.f134675d = cVar4;
        this.f134676e = cVar5;
        this.f134677f = cVar6;
    }

    public static p a(ij.c<com.planner5d.library.application.b> cVar, ij.c<t> cVar2, ij.c<z> cVar3, ij.c<g1> cVar4, ij.c<com.planner5d.library.activity.helper.imagechooser.j> cVar5, ij.c<com.planner5d.library.model.manager.config.j> cVar6) {
        return new p(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static n c(com.planner5d.library.application.b bVar, t tVar, z zVar, g1 g1Var, com.planner5d.library.activity.helper.imagechooser.j jVar, com.planner5d.library.model.manager.config.j jVar2) {
        return new n(bVar, tVar, zVar, g1Var, jVar, jVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f134672a.get(), this.f134673b.get(), this.f134674c.get(), this.f134675d.get(), this.f134676e.get(), this.f134677f.get());
    }
}
