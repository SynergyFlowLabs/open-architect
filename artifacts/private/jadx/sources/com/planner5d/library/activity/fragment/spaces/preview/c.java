package com.planner5d.library.activity.fragment.spaces.preview;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@e
@s
public final class c implements h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.spaces.documents.c> f136388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.r> f136389b;

    public c(ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVar, ij.c<com.planner5d.library.activity.helper.r> cVar2) {
        this.f136388a = cVar;
        this.f136389b = cVar2;
    }

    public static c a(ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVar, ij.c<com.planner5d.library.activity.helper.r> cVar2) {
        return new c(cVar, cVar2);
    }

    public static b c(com.planner5d.library.model.manager.spaces.documents.c cVar, com.planner5d.library.activity.helper.r rVar) {
        return new b(cVar, rVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f136388a.get(), this.f136389b.get());
    }
}
