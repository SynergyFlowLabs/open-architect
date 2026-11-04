package com.planner5d.library.database.model.chat;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class e implements dagger.internal.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b> f154133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ua.a> f154134b;

    public e(ij.c<b> chatMessageDaoProvider, ij.c<ua.a> converterProvider) {
        this.f154133a = chatMessageDaoProvider;
        this.f154134b = converterProvider;
    }

    public static e a(ij.c<b> chatMessageDaoProvider, ij.c<ua.a> converterProvider) {
        return new e(chatMessageDaoProvider, converterProvider);
    }

    public static d c(fg.e<b> chatMessageDao, ua.a converter) {
        return new d(chatMessageDao, converter);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(dagger.internal.g.a(this.f154133a), this.f154134b.get());
    }
}
