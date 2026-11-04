package io.intercom.android.sdk.ui.common;

import androidx.annotation.v;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class IntercomTopBarState {
    public static final int $stable = 0;

    @Nullable
    private final q0 backgroundColor;

    @Nullable
    private final q0 contentColor;

    @Nullable
    private final Integer navIcon;

    @Nullable
    private final String subTitle;

    @Nullable
    private final q0 subTitleColor;

    @Nullable
    private final String title;

    public /* synthetic */ IntercomTopBarState(@v Integer num, String str, String str2, q0 q0Var, q0 q0Var2, q0 q0Var3, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, q0Var, q0Var2, q0Var3);
    }

    /* JADX INFO: renamed from: copy-K74yeK8$default, reason: not valid java name */
    public static /* synthetic */ IntercomTopBarState m564copyK74yeK8$default(IntercomTopBarState intercomTopBarState, Integer num, String str, String str2, q0 q0Var, q0 q0Var2, q0 q0Var3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = intercomTopBarState.navIcon;
        }
        if ((i10 & 2) != 0) {
            str = intercomTopBarState.title;
        }
        if ((i10 & 4) != 0) {
            str2 = intercomTopBarState.subTitle;
        }
        if ((i10 & 8) != 0) {
            q0Var = intercomTopBarState.backgroundColor;
        }
        if ((i10 & 16) != 0) {
            q0Var2 = intercomTopBarState.contentColor;
        }
        if ((i10 & 32) != 0) {
            q0Var3 = intercomTopBarState.subTitleColor;
        }
        q0 q0Var4 = q0Var2;
        q0 q0Var5 = q0Var3;
        return intercomTopBarState.m568copyK74yeK8(num, str, str2, q0Var, q0Var4, q0Var5);
    }

    @Nullable
    public final Integer component1() {
        return this.navIcon;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4-QN2ZGVo, reason: not valid java name */
    public final q0 m565component4QN2ZGVo() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component5-QN2ZGVo, reason: not valid java name */
    public final q0 m566component5QN2ZGVo() {
        return this.contentColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component6-QN2ZGVo, reason: not valid java name */
    public final q0 m567component6QN2ZGVo() {
        return this.subTitleColor;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-K74yeK8, reason: not valid java name */
    public final IntercomTopBarState m568copyK74yeK8(@v @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable q0 q0Var, @Nullable q0 q0Var2, @Nullable q0 q0Var3) {
        return new IntercomTopBarState(num, str, str2, q0Var, q0Var2, q0Var3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomTopBarState)) {
            return false;
        }
        IntercomTopBarState intercomTopBarState = (IntercomTopBarState) obj;
        return Intrinsics.areEqual(this.navIcon, intercomTopBarState.navIcon) && Intrinsics.areEqual(this.title, intercomTopBarState.title) && Intrinsics.areEqual(this.subTitle, intercomTopBarState.subTitle) && Intrinsics.areEqual(this.backgroundColor, intercomTopBarState.backgroundColor) && Intrinsics.areEqual(this.contentColor, intercomTopBarState.contentColor) && Intrinsics.areEqual(this.subTitleColor, intercomTopBarState.subTitleColor);
    }

    @Nullable
    /* JADX INFO: renamed from: getBackgroundColor-QN2ZGVo, reason: not valid java name */
    public final q0 m569getBackgroundColorQN2ZGVo() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: getContentColor-QN2ZGVo, reason: not valid java name */
    public final q0 m570getContentColorQN2ZGVo() {
        return this.contentColor;
    }

    @Nullable
    public final Integer getNavIcon() {
        return this.navIcon;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: getSubTitleColor-QN2ZGVo, reason: not valid java name */
    public final q0 m571getSubTitleColorQN2ZGVo() {
        return this.subTitleColor;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.navIcon;
        int iK = 0;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        q0 q0Var = this.backgroundColor;
        int iK2 = (iHashCode3 + (q0Var == null ? 0 : q0.K(q0Var.M()))) * 31;
        q0 q0Var2 = this.contentColor;
        int iK3 = (iK2 + (q0Var2 == null ? 0 : q0.K(q0Var2.M()))) * 31;
        q0 q0Var3 = this.subTitleColor;
        if (q0Var3 != null) {
            iK = q0.K(q0Var3.M());
        }
        return iK3 + iK;
    }

    @NotNull
    public String toString() {
        return "IntercomTopBarState(navIcon=" + this.navIcon + ", title=" + this.title + ", subTitle=" + this.subTitle + ", backgroundColor=" + this.backgroundColor + ", contentColor=" + this.contentColor + ", subTitleColor=" + this.subTitleColor + ')';
    }

    private IntercomTopBarState(Integer num, String str, String str2, q0 q0Var, q0 q0Var2, q0 q0Var3) {
        this.navIcon = num;
        this.title = str;
        this.subTitle = str2;
        this.backgroundColor = q0Var;
        this.contentColor = q0Var2;
        this.subTitleColor = q0Var3;
    }

    public /* synthetic */ IntercomTopBarState(Integer num, String str, String str2, q0 q0Var, q0 q0Var2, q0 q0Var3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : q0Var, (i10 & 16) != 0 ? null : q0Var2, (i10 & 32) != 0 ? null : q0Var3, null);
    }
}
