package com.planner5d.library.widget.editor.interactor;

import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.model.manager.synchronization.i;
import com.planner5d.library.services.utility.t;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class d implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i> f256911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<d0> f256912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t> f256913c;

    public d(ij.c<i> cVar, ij.c<d0> cVar2, ij.c<t> cVar3) {
        this.f256911a = cVar;
        this.f256912b = cVar2;
        this.f256913c = cVar3;
    }

    public static d a(ij.c<i> cVar, ij.c<d0> cVar2, ij.c<t> cVar3) {
        return new d(cVar, cVar2, cVar3);
    }

    public static a c(i iVar, d0 d0Var, t tVar) {
        return new a(iVar, d0Var, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f256911a.get(), this.f256912b.get(), this.f256913c.get());
    }
}
