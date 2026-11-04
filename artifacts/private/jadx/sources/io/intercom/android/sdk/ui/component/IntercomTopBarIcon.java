package io.intercom.android.sdk.ui.component;

import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class IntercomTopBarIcon {
    public static final int $stable = 0;

    @Nullable
    private final String contentDescription;
    private final int iconRes;

    @NotNull
    private final Function0<Unit> onClick;

    public IntercomTopBarIcon(@androidx.annotation.v int i10, @Nullable String str, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.iconRes = i10;
        this.contentDescription = str;
        this.onClick = onClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntercomTopBarIcon copy$default(IntercomTopBarIcon intercomTopBarIcon, int i10, String str, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = intercomTopBarIcon.iconRes;
        }
        if ((i11 & 2) != 0) {
            str = intercomTopBarIcon.contentDescription;
        }
        if ((i11 & 4) != 0) {
            function0 = intercomTopBarIcon.onClick;
        }
        return intercomTopBarIcon.copy(i10, str, function0);
    }

    public final int component1() {
        return this.iconRes;
    }

    @Nullable
    public final String component2() {
        return this.contentDescription;
    }

    @NotNull
    public final Function0<Unit> component3() {
        return this.onClick;
    }

    @NotNull
    public final IntercomTopBarIcon copy(@androidx.annotation.v int i10, @Nullable String str, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new IntercomTopBarIcon(i10, str, onClick);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomTopBarIcon)) {
            return false;
        }
        IntercomTopBarIcon intercomTopBarIcon = (IntercomTopBarIcon) obj;
        return this.iconRes == intercomTopBarIcon.iconRes && Intrinsics.areEqual(this.contentDescription, intercomTopBarIcon.contentDescription) && Intrinsics.areEqual(this.onClick, intercomTopBarIcon.onClick);
    }

    @Nullable
    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    @NotNull
    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2 = Integer.hashCode(this.iconRes) * 31;
        String str = this.contentDescription;
        if (str == null) {
            iHashCode = 0;
            int i10 = 6 & 0;
        } else {
            iHashCode = str.hashCode();
        }
        return ((iHashCode2 + iHashCode) * 31) + this.onClick.hashCode();
    }

    @NotNull
    public String toString() {
        return "IntercomTopBarIcon(iconRes=" + this.iconRes + ", contentDescription=" + this.contentDescription + ", onClick=" + this.onClick + ')';
    }
}
