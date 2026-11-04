package io.intercom.android.sdk.m5.home.data;

import androidx.compose.runtime.internal.w0;
import com.google.firebase.messaging.e;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class Badge {
    public static final int $stable = 0;

    @c("badge_type")
    @NotNull
    private final BadgeType badgeType;

    @c(e.f.f123534d)
    @Nullable
    private final String label;

    public Badge(@NotNull BadgeType badgeType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(badgeType, "badgeType");
        this.badgeType = badgeType;
        this.label = str;
    }

    public static /* synthetic */ Badge copy$default(Badge badge, BadgeType badgeType, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            badgeType = badge.badgeType;
        }
        if ((i10 & 2) != 0) {
            str = badge.label;
        }
        return badge.copy(badgeType, str);
    }

    @NotNull
    public final BadgeType component1() {
        return this.badgeType;
    }

    @Nullable
    public final String component2() {
        return this.label;
    }

    @NotNull
    public final Badge copy(@NotNull BadgeType badgeType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(badgeType, "badgeType");
        return new Badge(badgeType, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return this.badgeType == badge.badgeType && Intrinsics.areEqual(this.label, badge.label);
    }

    @NotNull
    public final BadgeType getBadgeType() {
        return this.badgeType;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iHashCode = this.badgeType.hashCode() * 31;
        String str = this.label;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "Badge(badgeType=" + this.badgeType + ", label=" + this.label + ')';
    }
}
