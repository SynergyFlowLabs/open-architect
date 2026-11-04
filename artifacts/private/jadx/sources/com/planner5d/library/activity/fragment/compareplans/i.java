package com.planner5d.library.activity.fragment.compareplans;

import com.planner5d.library.model.manager.config.j;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@r
@dagger.internal.e
@s
public final class i implements dagger.internal.h<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<j> f131590a;

    public i(ij.c<j> cVar) {
        this.f131590a = cVar;
    }

    public static i a(ij.c<j> cVar) {
        return new i(cVar);
    }

    public static h c(fg.e<j> eVar) {
        return new h(eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(dagger.internal.g.a(this.f131590a));
    }
}
