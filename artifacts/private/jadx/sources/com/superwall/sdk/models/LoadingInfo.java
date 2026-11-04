package com.superwall.sdk.models;

import java.time.Instant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class LoadingInfo {

    @Nullable
    private final Instant endAt;

    @Nullable
    private final Instant failAt;

    @Nullable
    private final Instant startAt;

    public LoadingInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ LoadingInfo copy$default(LoadingInfo loadingInfo, Instant instant, Instant instant2, Instant instant3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            instant = loadingInfo.startAt;
        }
        if ((i10 & 2) != 0) {
            instant2 = loadingInfo.endAt;
        }
        if ((i10 & 4) != 0) {
            instant3 = loadingInfo.failAt;
        }
        return loadingInfo.copy(instant, instant2, instant3);
    }

    @Nullable
    public final Instant component1() {
        return this.startAt;
    }

    @Nullable
    public final Instant component2() {
        return this.endAt;
    }

    @Nullable
    public final Instant component3() {
        return this.failAt;
    }

    @NotNull
    public final LoadingInfo copy(@Nullable Instant instant, @Nullable Instant instant2, @Nullable Instant instant3) {
        return new LoadingInfo(instant, instant2, instant3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingInfo)) {
            return false;
        }
        LoadingInfo loadingInfo = (LoadingInfo) obj;
        return Intrinsics.areEqual(this.startAt, loadingInfo.startAt) && Intrinsics.areEqual(this.endAt, loadingInfo.endAt) && Intrinsics.areEqual(this.failAt, loadingInfo.failAt);
    }

    @Nullable
    public final Instant getEndAt() {
        return this.endAt;
    }

    @Nullable
    public final Instant getFailAt() {
        return this.failAt;
    }

    @Nullable
    public final Instant getStartAt() {
        return this.startAt;
    }

    public int hashCode() {
        Instant instant = this.startAt;
        int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
        Instant instant2 = this.endAt;
        int iHashCode2 = (iHashCode + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.failAt;
        return iHashCode2 + (instant3 != null ? instant3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LoadingInfo(startAt=" + this.startAt + ", endAt=" + this.endAt + ", failAt=" + this.failAt + ")";
    }

    public LoadingInfo(@Nullable Instant instant, @Nullable Instant instant2, @Nullable Instant instant3) {
        this.startAt = instant;
        this.endAt = instant2;
        this.failAt = instant3;
    }

    public /* synthetic */ LoadingInfo(Instant instant, Instant instant2, Instant instant3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : instant, (i10 & 2) != 0 ? null : instant2, (i10 & 4) != 0 ? null : instant3);
    }
}
