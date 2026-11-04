package com.planner5d.library.activity.fragment.dialog.authentication.onelink;

import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f131896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f131897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f131898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c2> f131899d;

    public m(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2, ij.c<ErrorMessageParser> cVar3, ij.c<c2> cVar4) {
        this.f131896a = cVar;
        this.f131897b = cVar2;
        this.f131898c = cVar3;
        this.f131899d = cVar4;
    }

    public static m a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2, ij.c<ErrorMessageParser> cVar3, ij.c<c2> cVar4) {
        return new m(cVar, cVar2, cVar3, cVar4);
    }

    public static l c(com.planner5d.library.application.b bVar, com.planner5d.library.modules.user.user.t tVar, ErrorMessageParser errorMessageParser, c2 c2Var) {
        return new l(bVar, tVar, errorMessageParser, c2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f131896a.get(), this.f131897b.get(), this.f131898c.get(), this.f131899d.get());
    }
}
