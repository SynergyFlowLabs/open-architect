package com.planner5d.planner5d;

import com.planner5d.library.model.manager.t1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@fg.h
@SourceDebugExtension({"SMAP\nExtendedMultipleFeatureConfigSourceModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtendedMultipleFeatureConfigSourceModule.kt\ncom/planner5d/planner5d/ExtendedMultipleFeatureConfigSourceModule\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,29:1\n37#2,2:30\n*S KotlinDebug\n*F\n+ 1 ExtendedMultipleFeatureConfigSourceModule.kt\ncom/planner5d/planner5d/ExtendedMultipleFeatureConfigSourceModule\n*L\n25#1:30,2\n*E\n"})
public final class f0 {
    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.config.source.j a(@NotNull t1 logRecordManager, @NotNull com.planner5d.library.model.manager.config.source.a applicationFeatureConfigs, @NotNull com.planner5d.library.model.manager.config.source.l serverConfigs, @NotNull hd.b overriddenFeatureConfigsStorage, @NotNull com.planner5d.library.model.manager.config.source.g.a firebaseConfigsProvider, @NotNull com.planner5d.library.model.manager.config.source.growthbook.d growthBookConfigsSource) {
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(applicationFeatureConfigs, "applicationFeatureConfigs");
        Intrinsics.checkNotNullParameter(serverConfigs, "serverConfigs");
        Intrinsics.checkNotNullParameter(overriddenFeatureConfigsStorage, "overriddenFeatureConfigsStorage");
        Intrinsics.checkNotNullParameter(firebaseConfigsProvider, "firebaseConfigsProvider");
        Intrinsics.checkNotNullParameter(growthBookConfigsSource, "growthBookConfigsSource");
        p1 p1Var = new p1(5);
        p1Var.a(applicationFeatureConfigs);
        p1Var.a(serverConfigs);
        p1Var.a(overriddenFeatureConfigsStorage);
        p1Var.b(CollectionsKt.listOfNotNull(firebaseConfigsProvider.a()).toArray(new com.planner5d.library.model.manager.config.source.g[0]));
        p1Var.a(growthBookConfigsSource);
        return new com.planner5d.library.model.manager.config.source.j(logRecordManager, (com.planner5d.library.model.manager.config.source.d[]) p1Var.d(new com.planner5d.library.model.manager.config.source.d[p1Var.c()]));
    }
}
