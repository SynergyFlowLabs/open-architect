package com.planner5d.library.dgenerator.fragment.gallery;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends androidx.recyclerview.widget.k.f<p> {
    @Override // androidx.recyclerview.widget.k.f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NotNull p oldItem, @NotNull p newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.e().n() == newItem.e().n() && Intrinsics.areEqual(oldItem.d(), newItem.d());
    }

    @Override // androidx.recyclerview.widget.k.f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(@NotNull p oldItem, @NotNull p newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.d(), newItem.d());
    }
}
