package com.planner5d.library.activity.fragment.dialog.iteminfo;

import com.planner5d.library.model.manager.builtin.i;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class e implements h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i> f132103a;

    public e(ij.c<i> cVar) {
        this.f132103a = cVar;
    }

    public static e a(ij.c<i> cVar) {
        return new e(cVar);
    }

    public static d c(i iVar) {
        return new d(iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f132103a.get());
    }
}
