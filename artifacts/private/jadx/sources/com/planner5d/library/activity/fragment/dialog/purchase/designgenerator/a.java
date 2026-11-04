package com.planner5d.library.activity.fragment.dialog.purchase.designgenerator;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class a extends androidx.recyclerview.widget.k.f<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f132540a = 0;

    @Override // androidx.recyclerview.widget.k.f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NotNull c oldItem, @NotNull c newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.r(), newItem.r()) && oldItem.n() == newItem.n() && oldItem.q() == newItem.q();
    }

    @Override // androidx.recyclerview.widget.k.f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(@NotNull c oldItem, @NotNull c newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.p(), newItem.p());
    }
}
