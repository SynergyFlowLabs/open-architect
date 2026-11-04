package com.planner5d.library.dgenerator.fragment.list;

import com.planner5d.library.database.model.AutoStyle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends androidx.recyclerview.widget.k.f<AutoStyle> {
    @Override // androidx.recyclerview.widget.k.f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NotNull AutoStyle oldItem, @NotNull AutoStyle newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.z(), newItem.z()) && Intrinsics.areEqual(oldItem.y(), newItem.y()) && Intrinsics.areEqual(oldItem.A(), newItem.A()) && oldItem.C() == newItem.C() && oldItem.t() == newItem.t();
    }

    @Override // androidx.recyclerview.widget.k.f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(@NotNull AutoStyle oldItem, @NotNull AutoStyle newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.getId(), newItem.getId());
    }
}
