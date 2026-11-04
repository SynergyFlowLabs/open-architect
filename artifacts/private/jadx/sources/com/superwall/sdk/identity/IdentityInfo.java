package com.superwall.sdk.identity;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class IdentityInfo {

    @NotNull
    private final String aliasId;

    @Nullable
    private final String appUserId;

    public IdentityInfo(@NotNull String aliasId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(aliasId, "aliasId");
        this.aliasId = aliasId;
        this.appUserId = str;
    }

    public static /* synthetic */ IdentityInfo copy$default(IdentityInfo identityInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = identityInfo.aliasId;
        }
        if ((i10 & 2) != 0) {
            str2 = identityInfo.appUserId;
        }
        return identityInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.aliasId;
    }

    @Nullable
    public final String component2() {
        return this.appUserId;
    }

    @NotNull
    public final IdentityInfo copy(@NotNull String aliasId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(aliasId, "aliasId");
        return new IdentityInfo(aliasId, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityInfo)) {
            return false;
        }
        IdentityInfo identityInfo = (IdentityInfo) obj;
        return Intrinsics.areEqual(this.aliasId, identityInfo.aliasId) && Intrinsics.areEqual(this.appUserId, identityInfo.appUserId);
    }

    @NotNull
    public final String getAliasId() {
        return this.aliasId;
    }

    @Nullable
    public final String getAppUserId() {
        return this.appUserId;
    }

    public int hashCode() {
        int iHashCode = this.aliasId.hashCode() * 31;
        String str = this.appUserId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "IdentityInfo(aliasId=" + this.aliasId + ", appUserId=" + this.appUserId + ")";
    }
}
