package com.planner5d.library.help.application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l implements dagger.internal.h<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180011a;

    public l(i iVar) {
        this.f180011a = iVar;
    }

    public static l a(i iVar) {
        return new l(iVar);
    }

    public static int c(i iVar) {
        return iVar.c();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c(this.f180011a));
    }
}
