package com.sdk.growthbook.utils;

import com.sdk.growthbook.serializable_model.SerializableGBTrackData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private com.sdk.growthbook.model.f f266509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private com.sdk.growthbook.model.g f266510b;

    public m(@NotNull com.sdk.growthbook.model.f experiment, @NotNull com.sdk.growthbook.model.g result) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f266509a = experiment;
        this.f266510b = result;
    }

    public static /* synthetic */ m d(m mVar, com.sdk.growthbook.model.f fVar, com.sdk.growthbook.model.g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = mVar.f266509a;
        }
        if ((i10 & 2) != 0) {
            gVar = mVar.f266510b;
        }
        return mVar.c(fVar, gVar);
    }

    @NotNull
    public final com.sdk.growthbook.model.f a() {
        return this.f266509a;
    }

    @NotNull
    public final com.sdk.growthbook.model.g b() {
        return this.f266510b;
    }

    @NotNull
    public final m c(@NotNull com.sdk.growthbook.model.f experiment, @NotNull com.sdk.growthbook.model.g result) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(result, "result");
        return new m(experiment, result);
    }

    @NotNull
    public final SerializableGBTrackData e() {
        return new SerializableGBTrackData(this.f266509a.x(), this.f266510b.o());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f266509a, mVar.f266509a) && Intrinsics.areEqual(this.f266510b, mVar.f266510b);
    }

    @NotNull
    public final com.sdk.growthbook.model.f f() {
        return this.f266509a;
    }

    @NotNull
    public final com.sdk.growthbook.model.g g() {
        return this.f266510b;
    }

    public final void h(@NotNull com.sdk.growthbook.model.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f266509a = fVar;
    }

    public int hashCode() {
        return (this.f266509a.hashCode() * 31) + this.f266510b.hashCode();
    }

    public final void i(@NotNull com.sdk.growthbook.model.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f266510b = gVar;
    }

    @NotNull
    public String toString() {
        return "GBTrackData(experiment=" + this.f266509a + ", result=" + this.f266510b + ")";
    }
}
