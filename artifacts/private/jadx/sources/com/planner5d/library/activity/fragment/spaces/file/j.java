package com.planner5d.library.activity.fragment.spaces.file;

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
    private final ij.c<com.planner5d.library.model.manager.spaces.documents.c> f136315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.r> f136316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<n3> f136317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<m3> f136318d;

    public j(ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVar, ij.c<com.planner5d.library.activity.helper.r> cVar2, ij.c<n3> cVar3, ij.c<m3> cVar4) {
        this.f136315a = cVar;
        this.f136316b = cVar2;
        this.f136317c = cVar3;
        this.f136318d = cVar4;
    }

    public static j a(ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVar, ij.c<com.planner5d.library.activity.helper.r> cVar2, ij.c<n3> cVar3, ij.c<m3> cVar4) {
        return new j(cVar, cVar2, cVar3, cVar4);
    }

    public static i c(com.planner5d.library.model.manager.spaces.documents.c cVar, com.planner5d.library.activity.helper.r rVar, n3 n3Var, m3 m3Var) {
        return new i(cVar, rVar, n3Var, m3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f136315a.get(), this.f136316b.get(), this.f136317c.get(), this.f136318d.get());
    }
}
