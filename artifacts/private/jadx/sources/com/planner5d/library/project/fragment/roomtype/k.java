package com.planner5d.library.project.fragment.roomtype;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends androidx.recyclerview.widget.k.f<j> {
    @Override // androidx.recyclerview.widget.k.f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NotNull j oldItem, @NotNull j newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.c(), newItem.c()) && Intrinsics.areEqual(oldItem.b(), newItem.b());
    }

    @Override // androidx.recyclerview.widget.k.f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(@NotNull j oldItem, @NotNull j newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.c(), newItem.c());
    }
}
