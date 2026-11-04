package com.planner5d.library.uploadplan.view.dialog;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f230937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<c2> f230938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<ke.a> f230939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<b2> f230940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f230941e;

    public b(ij.c<com.planner5d.library.application.b> cVar, ij.c<c2> cVar2, ij.c<ke.a> cVar3, ij.c<b2> cVar4, ij.c<ErrorMessageParser> cVar5) {
        this.f230937a = cVar;
        this.f230938b = cVar2;
        this.f230939c = cVar3;
        this.f230940d = cVar4;
        this.f230941e = cVar5;
    }

    public static b a(ij.c<com.planner5d.library.application.b> cVar, ij.c<c2> cVar2, ij.c<ke.a> cVar3, ij.c<b2> cVar4, ij.c<ErrorMessageParser> cVar5) {
        return new b(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static a c(com.planner5d.library.application.b bVar, c2 c2Var, ke.a aVar, b2 b2Var, ErrorMessageParser errorMessageParser) {
        return new a(bVar, c2Var, aVar, b2Var, errorMessageParser);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f230937a.get(), this.f230938b.get(), this.f230939c.get(), this.f230940d.get(), this.f230941e.get());
    }
}
