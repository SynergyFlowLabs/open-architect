package com.planner5d.library.interactor;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.uploadplan.g> f180062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f180063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f180064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<b2> f180065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<c2> f180066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f180067f;

    public b(ij.c<com.planner5d.library.model.manager.uploadplan.g> cVar, ij.c<com.planner5d.library.application.b> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<b2> cVar4, ij.c<c2> cVar5, ij.c<ErrorMessageParser> cVar6) {
        this.f180062a = cVar;
        this.f180063b = cVar2;
        this.f180064c = cVar3;
        this.f180065d = cVar4;
        this.f180066e = cVar5;
        this.f180067f = cVar6;
    }

    public static b a(ij.c<com.planner5d.library.model.manager.uploadplan.g> cVar, ij.c<com.planner5d.library.application.b> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<b2> cVar4, ij.c<c2> cVar5, ij.c<ErrorMessageParser> cVar6) {
        return new b(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static a c(com.planner5d.library.model.manager.uploadplan.g gVar, com.planner5d.library.application.b bVar, com.planner5d.library.api.requests.c cVar, b2 b2Var, c2 c2Var, ErrorMessageParser errorMessageParser) {
        return new a(gVar, bVar, cVar, b2Var, c2Var, errorMessageParser);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f180062a.get(), this.f180063b.get(), this.f180064c.get(), this.f180065d.get(), this.f180066e.get(), this.f180067f.get());
    }
}
