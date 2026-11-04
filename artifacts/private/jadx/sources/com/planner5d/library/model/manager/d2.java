package com.planner5d.library.model.manager;

import com.planner5d.library.services.exceptions.ErrorMessageParser;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class d2 implements dagger.internal.h<b2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f191255a;

    public d2(ij.c<ErrorMessageParser> cVar) {
        this.f191255a = cVar;
    }

    public static d2 a(ij.c<ErrorMessageParser> cVar) {
        return new d2(cVar);
    }

    public static b2 c(ErrorMessageParser errorMessageParser) {
        return new b2(errorMessageParser);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b2 get() {
        return c(this.f191255a.get());
    }
}
