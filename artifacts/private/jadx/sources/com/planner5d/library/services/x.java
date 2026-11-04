package com.planner5d.library.services;

import androidx.paging.q2;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class x<T> extends q2<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<T> f229890h;

    public x(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f229890h = CollectionsKt.toList(list);
    }

    @Override // androidx.paging.q2
    public void A(@NotNull q2.c params, @NotNull q2.b<T> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int iW = q2.w(params, this.f229890h.size());
        List<T> list = this.f229890h;
        callback.b(list.subList(iW, q2.x(params, iW, list.size()) + iW), iW, this.f229890h.size());
    }

    @Override // androidx.paging.q2
    public void D(@NotNull q2.e params, @NotNull q2.d<T> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<T> list = this.f229890h;
        int i10 = params.f72497a;
        callback.a(list.subList(i10, kotlin.ranges.r.B(params.f72498b + i10, list.size())));
    }
}
