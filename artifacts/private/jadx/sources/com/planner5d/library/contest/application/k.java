package com.planner5d.library.contest.application;

import com.planner5d.library.services.exceptions.ErrorMessageParser;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k implements dagger.internal.h<ErrorMessageParser> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148457a;

    public k(b bVar) {
        this.f148457a = bVar;
    }

    public static k a(b bVar) {
        return new k(bVar);
    }

    public static ErrorMessageParser c(b bVar) {
        return (ErrorMessageParser) dagger.internal.p.f(bVar.i());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ErrorMessageParser get() {
        return c(this.f148457a);
    }
}
