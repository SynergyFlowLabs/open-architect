package com.planner5d.library.activity.fragment.dialog.authentication;

import com.planner5d.library.services.exceptions.ErrorMessageParser;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class g0 implements dagger.internal.h<f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f131786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f131787b;

    public g0(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<ErrorMessageParser> cVar2) {
        this.f131786a = cVar;
        this.f131787b = cVar2;
    }

    public static g0 a(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<ErrorMessageParser> cVar2) {
        return new g0(cVar, cVar2);
    }

    public static f0 c(com.planner5d.library.modules.user.user.t tVar, ErrorMessageParser errorMessageParser) {
        return new f0(tVar, errorMessageParser);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f0 get() {
        return c(this.f131786a.get(), this.f131787b.get());
    }
}
