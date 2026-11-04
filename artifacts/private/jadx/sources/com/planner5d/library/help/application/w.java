package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.h2;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w implements dagger.internal.h<h2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180022a;

    public w(i iVar) {
        this.f180022a = iVar;
    }

    public static w a(i iVar) {
        return new w(iVar);
    }

    public static h2 c(i iVar) {
        return (h2) dagger.internal.p.f(iVar.n());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h2 get() {
        return c(this.f180022a);
    }
}
