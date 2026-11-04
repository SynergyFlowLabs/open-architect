package com.devtodev.analytics.internal.backend.repository;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class InvolvedExperiments extends AbTestOffer {

    @NotNull
    private List<InvolvedExperiment> involvedExperiments;

    public InvolvedExperiments() {
        super(null);
        this.involvedExperiments = CollectionsKt.emptyList();
    }

    @NotNull
    public final List<InvolvedExperiment> getInvolvedExperiments() {
        return this.involvedExperiments;
    }

    public final void setInvolvedExperiments(@NotNull List<InvolvedExperiment> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.involvedExperiments = list;
    }
}
