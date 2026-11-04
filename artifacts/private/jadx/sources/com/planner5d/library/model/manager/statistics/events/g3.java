package com.planner5d.library.model.manager.statistics.events;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nEventDataParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventDataParser.kt\ncom/planner5d/library/model/manager/statistics/events/EventDataParser\n+ 2 BundleParser.kt\ncom/planner5d/library/services/utility/BundleParser\n*L\n1#1,13:1\n57#2,18:14\n*S KotlinDebug\n*F\n+ 1 EventDataParser.kt\ncom/planner5d/library/model/manager/statistics/events/EventDataParser\n*L\n11#1:14,18\n*E\n"})
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g3 f216952a = new g3();

    private g3() {
    }

    @NotNull
    public final StatisticsEventAiDesigner.EventData a(@Nullable Bundle bundle) {
        return b(new com.planner5d.library.services.utility.j(bundle));
    }

    @NotNull
    public final StatisticsEventAiDesigner.EventData b(@NotNull com.planner5d.library.services.utility.j parser) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(parser, "parser");
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.aiDesignerStatistics;
        try {
            parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) parser.g().getParcelable(rVar.f224891a, StatisticsEventAiDesigner.EventData.class) : parser.g().getParcelable(rVar.f224891a);
            if (parcelable == null || !(parcelable instanceof StatisticsEventAiDesigner.EventData)) {
                parcelable = null;
            }
        } catch (ClassCastException unused) {
        }
        StatisticsEventAiDesigner.EventData eventData = (StatisticsEventAiDesigner.EventData) (parcelable != null ? parcelable : null);
        if (eventData != null) {
            return eventData;
        }
        int i10 = 6 | 0;
        return new StatisticsEventAiDesigner.EventData(null, null, null, null, null, null, null, 127, null);
    }
}
