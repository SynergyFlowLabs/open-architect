package com.planner5d.library.application;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@fg.h
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nReducedMultipleFeatureConfigSourceModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReducedMultipleFeatureConfigSourceModule.kt\ncom/planner5d/library/application/ReducedMultipleFeatureConfigSourceModule\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,27:1\n37#2,2:28\n*S KotlinDebug\n*F\n+ 1 ReducedMultipleFeatureConfigSourceModule.kt\ncom/planner5d/library/application/ReducedMultipleFeatureConfigSourceModule\n*L\n23#1:28,2\n*E\n"})
public final class q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f148245a = 0;

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.config.source.j a(@NotNull com.planner5d.library.model.manager.t1 logRecordManager, @NotNull com.planner5d.library.model.manager.config.source.a applicationFeatureConfigs, @NotNull com.planner5d.library.model.manager.config.source.l serverConfigs, @NotNull hd.b overriddenFeatureConfigsStorage, @NotNull com.planner5d.library.model.manager.config.source.g.a firebaseConfigsProvider) {
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(applicationFeatureConfigs, "applicationFeatureConfigs");
        Intrinsics.checkNotNullParameter(serverConfigs, "serverConfigs");
        Intrinsics.checkNotNullParameter(overriddenFeatureConfigsStorage, "overriddenFeatureConfigsStorage");
        Intrinsics.checkNotNullParameter(firebaseConfigsProvider, "firebaseConfigsProvider");
        kotlin.jvm.internal.p1 p1Var = new kotlin.jvm.internal.p1(4);
        p1Var.a(applicationFeatureConfigs);
        p1Var.a(serverConfigs);
        p1Var.a(overriddenFeatureConfigsStorage);
        p1Var.b(CollectionsKt.listOfNotNull(firebaseConfigsProvider.a()).toArray(new com.planner5d.library.model.manager.config.source.g[0]));
        return new com.planner5d.library.model.manager.config.source.j(logRecordManager, (com.planner5d.library.model.manager.config.source.d[]) p1Var.d(new com.planner5d.library.model.manager.config.source.d[p1Var.c()]));
    }
}
