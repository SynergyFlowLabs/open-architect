package com.planner5d.library.activity.fragment.profile.orders;

import com.planner5d.library.modules.user.user.t;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class c implements dagger.internal.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t> f134754a;

    public c(ij.c<t> cVar) {
        this.f134754a = cVar;
    }

    public static c a(ij.c<t> cVar) {
        return new c(cVar);
    }

    public static b c(fg.e<t> eVar) {
        return new b(eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(dagger.internal.g.a(this.f134754a));
    }
}
