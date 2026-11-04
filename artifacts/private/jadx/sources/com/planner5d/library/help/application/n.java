package com.planner5d.library.help.application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class n implements dagger.internal.h<com.planner5d.library.activity.fragment.dialog.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180013a;

    public n(i iVar) {
        this.f180013a = iVar;
    }

    public static n a(i iVar) {
        return new n(iVar);
    }

    public static com.planner5d.library.activity.fragment.dialog.k c(i iVar) {
        return (com.planner5d.library.activity.fragment.dialog.k) dagger.internal.p.f(iVar.e());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.dialog.k get() {
        return c(this.f180013a);
    }
}
