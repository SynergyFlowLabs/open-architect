package com.planner5d.library.contest.view.archive;

import com.planner5d.library.services.exceptions.ErrorMessageParser;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class o implements dagger.internal.h<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.contest.data.i> f153477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f153478b;

    public o(ij.c<com.planner5d.library.contest.data.i> cVar, ij.c<ErrorMessageParser> cVar2) {
        this.f153477a = cVar;
        this.f153478b = cVar2;
    }

    public static o a(ij.c<com.planner5d.library.contest.data.i> cVar, ij.c<ErrorMessageParser> cVar2) {
        return new o(cVar, cVar2);
    }

    public static n c(com.planner5d.library.contest.data.i iVar, ErrorMessageParser errorMessageParser) {
        return new n(iVar, errorMessageParser);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f153477a.get(), this.f153478b.get());
    }
}
