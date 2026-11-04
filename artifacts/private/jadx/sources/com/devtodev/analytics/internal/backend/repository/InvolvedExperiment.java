package com.devtodev.analytics.internal.backend.repository;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class InvolvedExperiment {

    @NotNull
    private final String group;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f98053id;

    public InvolvedExperiment(long j10, @NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.f98053id = j10;
        this.group = group;
    }

    public static /* synthetic */ InvolvedExperiment copy$default(InvolvedExperiment involvedExperiment, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = involvedExperiment.f98053id;
        }
        if ((i10 & 2) != 0) {
            str = involvedExperiment.group;
        }
        return involvedExperiment.copy(j10, str);
    }

    public final long component1() {
        return this.f98053id;
    }

    @NotNull
    public final String component2() {
        return this.group;
    }

    @NotNull
    public final InvolvedExperiment copy(long j10, @NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        return new InvolvedExperiment(j10, group);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvolvedExperiment)) {
            return false;
        }
        InvolvedExperiment involvedExperiment = (InvolvedExperiment) obj;
        return this.f98053id == involvedExperiment.f98053id && Intrinsics.areEqual(this.group, involvedExperiment.group);
    }

    @NotNull
    public final String getGroup() {
        return this.group;
    }

    public final long getId() {
        return this.f98053id;
    }

    public int hashCode() {
        return this.group.hashCode() + (Long.hashCode(this.f98053id) * 31);
    }

    @NotNull
    public String toString() {
        return "InvolvedExperiment(id=" + this.f98053id + ", group=" + this.group + ")";
    }
}
