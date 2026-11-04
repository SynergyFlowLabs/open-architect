package com.planner5d.library.uploadplan.view.dialog;

import com.planner5d.library.activity.helper.m2;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f230982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ke.c> f230983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f230984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<a> f230985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.source.l> f230986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<u1> f230987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<n1> f230988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f230989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<c2> f230990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f230991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<m2> f230992k;

    public m(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar, ij.c<ke.c> cVar2, ij.c<b2> cVar3, ij.c<a> cVar4, ij.c<com.planner5d.library.model.manager.config.source.l> cVar5, ij.c<u1> cVar6, ij.c<n1> cVar7, ij.c<com.planner5d.library.application.b> cVar8, ij.c<c2> cVar9, ij.c<ErrorMessageParser> cVar10, ij.c<m2> cVar11) {
        this.f230982a = cVar;
        this.f230983b = cVar2;
        this.f230984c = cVar3;
        this.f230985d = cVar4;
        this.f230986e = cVar5;
        this.f230987f = cVar6;
        this.f230988g = cVar7;
        this.f230989h = cVar8;
        this.f230990i = cVar9;
        this.f230991j = cVar10;
        this.f230992k = cVar11;
    }

    public static m a(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar, ij.c<ke.c> cVar2, ij.c<b2> cVar3, ij.c<a> cVar4, ij.c<com.planner5d.library.model.manager.config.source.l> cVar5, ij.c<u1> cVar6, ij.c<n1> cVar7, ij.c<com.planner5d.library.application.b> cVar8, ij.c<c2> cVar9, ij.c<ErrorMessageParser> cVar10, ij.c<m2> cVar11) {
        return new m(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11);
    }

    public static l c(com.planner5d.library.activity.fragment.dialog.k kVar, ke.c cVar, b2 b2Var, a aVar, com.planner5d.library.model.manager.config.source.l lVar, u1 u1Var, n1 n1Var, com.planner5d.library.application.b bVar, c2 c2Var, ErrorMessageParser errorMessageParser, m2 m2Var) {
        return new l(kVar, cVar, b2Var, aVar, lVar, u1Var, n1Var, bVar, c2Var, errorMessageParser, m2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f230982a.get(), this.f230983b.get(), this.f230984c.get(), this.f230985d.get(), this.f230986e.get(), this.f230987f.get(), this.f230988g.get(), this.f230989h.get(), this.f230990i.get(), this.f230991j.get(), this.f230992k.get());
    }
}
