package io.intercom.android.sdk.m5.home.data;

import androidx.compose.runtime.internal.w0;
import com.google.firebase.messaging.e;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class Action {
    public static final int $stable = 0;

    @c("icon")
    @Nullable
    private final IconType icon;

    @c(e.f.f123534d)
    @NotNull
    private final String label;

    @c("subtitle")
    @Nullable
    private final String subtitle;

    public Action(@NotNull String label, @Nullable IconType iconType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.icon = iconType;
        this.subtitle = str;
    }

    public static /* synthetic */ Action copy$default(Action action, String str, IconType iconType, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = action.label;
        }
        if ((i10 & 2) != 0) {
            iconType = action.icon;
        }
        if ((i10 & 4) != 0) {
            str2 = action.subtitle;
        }
        return action.copy(str, iconType, str2);
    }

    @NotNull
    public final String component1() {
        return this.label;
    }

    @Nullable
    public final IconType component2() {
        return this.icon;
    }

    @Nullable
    public final String component3() {
        return this.subtitle;
    }

    @NotNull
    public final Action copy(@NotNull String label, @Nullable IconType iconType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new Action(label, iconType, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return Intrinsics.areEqual(this.label, action.label) && this.icon == action.icon && Intrinsics.areEqual(this.subtitle, action.subtitle);
    }

    @Nullable
    public final IconType getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        IconType iconType = this.icon;
        int iHashCode2 = (iHashCode + (iconType == null ? 0 : iconType.hashCode())) * 31;
        String str = this.subtitle;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Action(label=" + this.label + ", icon=" + this.icon + ", subtitle=" + this.subtitle + ')';
    }
}
