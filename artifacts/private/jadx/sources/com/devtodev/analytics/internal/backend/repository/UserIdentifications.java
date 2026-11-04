package com.devtodev.analytics.internal.backend.repository;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBackendUserData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackendUserData.kt\ncom/devtodev/analytics/internal/backend/repository/UserIdentifications\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class UserIdentifications extends BackendUserData {

    @Nullable
    private final Long crossPlatformDevtodevId;

    @Nullable
    private final Long devtodevId;

    @Nullable
    private final Long devtodevIdTimestamp;

    public UserIdentifications() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UserIdentifications copy$default(UserIdentifications userIdentifications, Long l10, Long l11, Long l12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = userIdentifications.devtodevId;
        }
        if ((i10 & 2) != 0) {
            l11 = userIdentifications.crossPlatformDevtodevId;
        }
        if ((i10 & 4) != 0) {
            l12 = userIdentifications.devtodevIdTimestamp;
        }
        return userIdentifications.copy(l10, l11, l12);
    }

    @Nullable
    public final Long component1() {
        return this.devtodevId;
    }

    @Nullable
    public final Long component2() {
        return this.crossPlatformDevtodevId;
    }

    @Nullable
    public final Long component3() {
        return this.devtodevIdTimestamp;
    }

    @NotNull
    public final UserIdentifications copy(@Nullable Long l10, @Nullable Long l11, @Nullable Long l12) {
        return new UserIdentifications(l10, l11, l12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserIdentifications)) {
            return false;
        }
        UserIdentifications userIdentifications = (UserIdentifications) obj;
        return Intrinsics.areEqual(this.devtodevId, userIdentifications.devtodevId) && Intrinsics.areEqual(this.crossPlatformDevtodevId, userIdentifications.crossPlatformDevtodevId) && Intrinsics.areEqual(this.devtodevIdTimestamp, userIdentifications.devtodevIdTimestamp);
    }

    @Nullable
    public final Long getCrossPlatformDevtodevId() {
        return this.crossPlatformDevtodevId;
    }

    @Nullable
    public final Long getDevtodevId() {
        return this.devtodevId;
    }

    @Nullable
    public final Long getDevtodevIdTimestamp() {
        return this.devtodevIdTimestamp;
    }

    public int hashCode() {
        Long l10 = this.devtodevId;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.crossPlatformDevtodevId;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.devtodevIdTimestamp;
        return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Long l10 = this.devtodevId;
        if (l10 != null) {
            stringBuffer.append("\tdevtodevId: " + l10 + "\n");
        }
        Long l11 = this.crossPlatformDevtodevId;
        if (l11 != null) {
            stringBuffer.append("\tcrossPlatformDevtodevId: " + l11 + "\n");
        }
        Long l12 = this.devtodevIdTimestamp;
        if (l12 != null) {
            stringBuffer.append("\tdevtodevIdTimestamp: " + l12 + "\n");
        }
        if (stringBuffer.length() == 0) {
            return "Empty failed";
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public /* synthetic */ UserIdentifications(Long l10, Long l11, Long l12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : l11, (i10 & 4) != 0 ? null : l12);
    }

    public UserIdentifications(@Nullable Long l10, @Nullable Long l11, @Nullable Long l12) {
        super(null);
        this.devtodevId = l10;
        this.crossPlatformDevtodevId = l11;
        this.devtodevIdTimestamp = l12;
    }
}
