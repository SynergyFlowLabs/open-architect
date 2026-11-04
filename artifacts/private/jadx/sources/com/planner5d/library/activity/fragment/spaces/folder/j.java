package com.planner5d.library.activity.fragment.spaces.folder;

import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.model.manager.statistics.events.m3;
import com.planner5d.library.model.manager.statistics.events.n3;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class j implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.spaces.documents.c> f136364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<k> f136365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f136366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<n3> f136367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<m3> f136368e;

    public j(ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVar, ij.c<k> cVar2, ij.c<com.planner5d.library.application.b> cVar3, ij.c<n3> cVar4, ij.c<m3> cVar5) {
        this.f136364a = cVar;
        this.f136365b = cVar2;
        this.f136366c = cVar3;
        this.f136367d = cVar4;
        this.f136368e = cVar5;
    }

    public static j a(ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVar, ij.c<k> cVar2, ij.c<com.planner5d.library.application.b> cVar3, ij.c<n3> cVar4, ij.c<m3> cVar5) {
        return new j(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static i c(com.planner5d.library.model.manager.spaces.documents.c cVar, k kVar, com.planner5d.library.application.b bVar, n3 n3Var, m3 m3Var) {
        return new i(cVar, kVar, bVar, n3Var, m3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f136364a.get(), this.f136365b.get(), this.f136366c.get(), this.f136367d.get(), this.f136368e.get());
    }
}
