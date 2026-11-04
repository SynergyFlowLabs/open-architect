package com.planner5d.library.model.manager.statistics.events;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Bundle f216934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final StatisticsEventAiDesigner.EventData f216935b;

    /* JADX WARN: Multi-variable type inference failed */
    public f3() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final Bundle a() {
        return new com.planner5d.library.services.utility.i(this.f216934a).i(com.planner5d.library.services.r.aiDesignerStatistics, this.f216935b).a();
    }

    public f3(@Nullable Bundle bundle, @Nullable StatisticsEventAiDesigner.EventData eventData) {
        this.f216934a = bundle;
        this.f216935b = eventData;
    }

    public /* synthetic */ f3(Bundle bundle, StatisticsEventAiDesigner.EventData eventData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bundle, (i10 & 2) != 0 ? null : eventData);
    }
}
