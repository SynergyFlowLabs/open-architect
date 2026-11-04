package com.planner5d.library.widget.editor.helper;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class t1 extends g1 {

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final int f256770h4 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(@NotNull com.planner5d.library.modules.user.user.t0 userPurchases, @NotNull com.planner5d.library.model.manager.synchronization.i synchronizationManager, @NotNull com.planner5d.library.widget.editor.facade.c0 interfaceManager, @NotNull com.planner5d.library.widget.editor.facade.s facadeFactory, @NotNull com.planner5d.library.model.manager.t1 logRecordManager, @NotNull com.planner5d.library.model.manager.performancetracing.e performanceTracing) {
        super(null, null, null, synchronizationManager, null, null, null, null, null, null, null, null, null, null, null, null, userPurchases, null, null, null, interfaceManager, null, logRecordManager, null, null, facadeFactory, null, null, null, performanceTracing, null, null, null, null, null, null, null);
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(synchronizationManager, "synchronizationManager");
        Intrinsics.checkNotNullParameter(interfaceManager, "interfaceManager");
        Intrinsics.checkNotNullParameter(facadeFactory, "facadeFactory");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(performanceTracing, "performanceTracing");
    }

    @Override // com.planner5d.library.widget.editor.helper.g1, com.planner5d.library.widget.editor.facade.f
    public boolean z1() {
        return true;
    }
}
