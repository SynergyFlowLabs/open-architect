package com.planner5d.library.widget.editor.itemactionsbar;

import dagger.internal.r;
import dagger.internal.s;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class e implements dagger.internal.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<List<b>> f256952a;

    public e(ij.c<List<b>> cVar) {
        this.f256952a = cVar;
    }

    public static e a(ij.c<List<b>> cVar) {
        return new e(cVar);
    }

    public static d c(List<b> list) {
        return new d(list);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f256952a.get());
    }
}
