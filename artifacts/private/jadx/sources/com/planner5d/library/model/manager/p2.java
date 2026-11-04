package com.planner5d.library.model.manager;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class p2 implements com.planner5d.library.model.manager.payments.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f192246a = 0;

    @Override // com.planner5d.library.model.manager.payments.b0
    public void a(@NotNull androidx.fragment.app.s activity, @NotNull FragmentManager fragmentManager, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a placementName, @Nullable Bundle bundle, @NotNull Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
    }
}
