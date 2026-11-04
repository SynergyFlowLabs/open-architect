package io.intercom.android.sdk.m5.home.data;

import androidx.compose.runtime.internal.w0;
import com.google.firebase.messaging.e;
import com.google.gson.annotations.c;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class SpaceItem {
    public static final int $stable = 0;

    @c(MetricTracker.Object.BADGE)
    @Nullable
    private final Badge badge;

    @c(e.f.f123534d)
    @NotNull
    private final String label;

    @c("type")
    @NotNull
    private final SpaceItemType type;

    public SpaceItem(@Nullable Badge badge, @NotNull String label, @NotNull SpaceItemType type) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type, "type");
        this.badge = badge;
        this.label = label;
        this.type = type;
    }

    public static /* synthetic */ SpaceItem copy$default(SpaceItem spaceItem, Badge badge, String str, SpaceItemType spaceItemType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            badge = spaceItem.badge;
        }
        if ((i10 & 2) != 0) {
            str = spaceItem.label;
        }
        if ((i10 & 4) != 0) {
            spaceItemType = spaceItem.type;
        }
        return spaceItem.copy(badge, str, spaceItemType);
    }

    @Nullable
    public final Badge component1() {
        return this.badge;
    }

    @NotNull
    public final String component2() {
        return this.label;
    }

    @NotNull
    public final SpaceItemType component3() {
        return this.type;
    }

    @NotNull
    public final SpaceItem copy(@Nullable Badge badge, @NotNull String label, @NotNull SpaceItemType type) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type, "type");
        return new SpaceItem(badge, label, type);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpaceItem)) {
            return false;
        }
        SpaceItem spaceItem = (SpaceItem) obj;
        if (Intrinsics.areEqual(this.badge, spaceItem.badge) && Intrinsics.areEqual(this.label, spaceItem.label) && this.type == spaceItem.type) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final SpaceItemType getType() {
        return this.type;
    }

    public int hashCode() {
        Badge badge = this.badge;
        return ((((badge == null ? 0 : badge.hashCode()) * 31) + this.label.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "SpaceItem(badge=" + this.badge + ", label=" + this.label + ", type=" + this.type + ')';
    }
}
