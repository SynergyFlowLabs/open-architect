package com.planner5d.library.project.fragment.aidesigner;

import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends f2 implements StatisticsEventAiDesigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ StatisticsEventAiDesigner f223694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private StatisticsEventAiDesigner.EventData f223695b;

    @ij.a
    public f(@NotNull StatisticsEventAiDesigner statisticsEventAiDesigner) {
        Intrinsics.checkNotNullParameter(statisticsEventAiDesigner, "statisticsEventAiDesigner");
        this.f223694a = statisticsEventAiDesigner;
        this.f223695b = new StatisticsEventAiDesigner.EventData(null, null, null, null, null, null, null, 127, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner
    public void F0(@NotNull StatisticsEventAiDesigner.a action, @Nullable StatisticsEventAiDesigner.d dVar, @Nullable StatisticsEventAiDesigner.g gVar, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable StatisticsEventAiDesigner.e eVar, @Nullable String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f223694a.F0(action, dVar, gVar, num, num2, num3, eVar, str);
    }

    public final void U(@NotNull StatisticsEventAiDesigner.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        i(action, this.f223695b);
    }

    @NotNull
    public final List<b.a> V() {
        return CollectionsKt.listOf((Object[]) new b.a[]{new b.a(md.b.h.E0, md.b.s.B0, md.b.s.C0, false, 8, null), new b.a(md.b.h.F0, md.b.s.D0, md.b.s.E0, false, 8, null), new b.a(md.b.h.D0, md.b.s.f326972z0, md.b.s.A0, true)});
    }

    @NotNull
    public final StatisticsEventAiDesigner.EventData W() {
        return this.f223695b;
    }

    public final void X(@NotNull StatisticsEventAiDesigner.EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "<set-?>");
        this.f223695b = eventData;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner
    public void i(@NotNull StatisticsEventAiDesigner.a action, @NotNull StatisticsEventAiDesigner.EventData parameters) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f223694a.i(action, parameters);
    }
}
