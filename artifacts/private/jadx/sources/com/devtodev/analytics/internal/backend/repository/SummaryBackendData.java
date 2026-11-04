package com.devtodev.analytics.internal.backend.repository;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SummaryBackendData extends BackendUserData {

    @NotNull
    private final UserData userData;

    @NotNull
    private final UserIdentifications userIdentifications;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryBackendData(@NotNull UserIdentifications userIdentifications, @NotNull UserData userData) {
        super(null);
        Intrinsics.checkNotNullParameter(userIdentifications, "userIdentifications");
        Intrinsics.checkNotNullParameter(userData, "userData");
        this.userIdentifications = userIdentifications;
        this.userData = userData;
    }

    public static /* synthetic */ SummaryBackendData copy$default(SummaryBackendData summaryBackendData, UserIdentifications userIdentifications, UserData userData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            userIdentifications = summaryBackendData.userIdentifications;
        }
        if ((i10 & 2) != 0) {
            userData = summaryBackendData.userData;
        }
        return summaryBackendData.copy(userIdentifications, userData);
    }

    @NotNull
    public final UserIdentifications component1() {
        return this.userIdentifications;
    }

    @NotNull
    public final UserData component2() {
        return this.userData;
    }

    @NotNull
    public final SummaryBackendData copy(@NotNull UserIdentifications userIdentifications, @NotNull UserData userData) {
        Intrinsics.checkNotNullParameter(userIdentifications, "userIdentifications");
        Intrinsics.checkNotNullParameter(userData, "userData");
        return new SummaryBackendData(userIdentifications, userData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryBackendData)) {
            return false;
        }
        SummaryBackendData summaryBackendData = (SummaryBackendData) obj;
        return Intrinsics.areEqual(this.userIdentifications, summaryBackendData.userIdentifications) && Intrinsics.areEqual(this.userData, summaryBackendData.userData);
    }

    @NotNull
    public final UserData getUserData() {
        return this.userData;
    }

    @NotNull
    public final UserIdentifications getUserIdentifications() {
        return this.userIdentifications;
    }

    public int hashCode() {
        return this.userData.hashCode() + (this.userIdentifications.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SummaryBackendData(userIdentifications=" + this.userIdentifications + ", userData=" + this.userData + ")";
    }
}
