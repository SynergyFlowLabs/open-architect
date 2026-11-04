package com.planner5d.library.contest.application;

import com.planner5d.library.activity.fragment.list.o1;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class c0 implements dagger.internal.h<o1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148425a;

    public c0(b bVar) {
        this.f148425a = bVar;
    }

    public static c0 a(b bVar) {
        return new c0(bVar);
    }

    public static o1 c(b bVar) {
        return (o1) dagger.internal.p.f(bVar.A());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o1 get() {
        return c(this.f148425a);
    }
}
