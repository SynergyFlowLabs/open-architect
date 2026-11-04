package com.planner5d.library.activity.fragment.dialog.authentication;

import com.planner5d.library.services.exceptions.ErrorMessageParser;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w0 implements dagger.internal.h<v0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f132017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f132018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.b> f132019c;

    public w0(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<ErrorMessageParser> cVar2, ij.c<com.planner5d.library.modules.user.user.b> cVar3) {
        this.f132017a = cVar;
        this.f132018b = cVar2;
        this.f132019c = cVar3;
    }

    public static w0 a(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<ErrorMessageParser> cVar2, ij.c<com.planner5d.library.modules.user.user.b> cVar3) {
        return new w0(cVar, cVar2, cVar3);
    }

    public static v0 c(com.planner5d.library.modules.user.user.t tVar, ErrorMessageParser errorMessageParser, com.planner5d.library.modules.user.user.b bVar) {
        return new v0(tVar, errorMessageParser, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v0 get() {
        return c(this.f132017a.get(), this.f132018b.get(), this.f132019c.get());
    }
}
