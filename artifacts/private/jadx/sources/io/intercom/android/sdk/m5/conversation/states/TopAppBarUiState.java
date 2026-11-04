package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class TopAppBarUiState {

    @NotNull
    private final List<AvatarWrapper> avatars;

    @Nullable
    private final q0 backgroundColor;

    @Nullable
    private final q0 backgroundColorDark;

    @Nullable
    private final q0 contentColor;

    @Nullable
    private final q0 contentColorDark;
    private final boolean displayActiveIndicator;

    @NotNull
    private final List<HeaderMenuItem> headerMenuItems;

    @Nullable
    private final Integer navIcon;

    @Nullable
    private final PushNotificationsBannerState pushNotificationsBannerState;

    @Nullable
    private final StringProvider subTitle;

    @Nullable
    private final q0 subTitleColor;

    @Nullable
    private final q0 subTitleColorDark;

    @Nullable
    private final Integer subTitleLeadingIcon;

    @Nullable
    private final TicketProgressRowState ticketStatusState;

    @NotNull
    private final StringProvider title;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @NotNull
    private static final TopAppBarUiState f81default = new TopAppBarUiState(new StringProvider.ActualString(""), null, null, null, CollectionsKt.emptyList(), false, null, CollectionsKt.emptyList(), null, null, null, null, null, null, null, 16130, null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TopAppBarUiState getDefault() {
            return TopAppBarUiState.f81default;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z10, TicketProgressRowState ticketProgressRowState, List list2, q0 q0Var, q0 q0Var2, q0 q0Var3, q0 q0Var4, q0 q0Var5, q0 q0Var6, PushNotificationsBannerState pushNotificationsBannerState, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringProvider, num, stringProvider2, num2, list, z10, ticketProgressRowState, list2, q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, pushNotificationsBannerState);
    }

    @NotNull
    public final StringProvider component1() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component10-QN2ZGVo, reason: not valid java name */
    public final q0 m182component10QN2ZGVo() {
        return this.backgroundColorDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component11-QN2ZGVo, reason: not valid java name */
    public final q0 m183component11QN2ZGVo() {
        return this.contentColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component12-QN2ZGVo, reason: not valid java name */
    public final q0 m184component12QN2ZGVo() {
        return this.contentColorDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component13-QN2ZGVo, reason: not valid java name */
    public final q0 m185component13QN2ZGVo() {
        return this.subTitleColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component14-QN2ZGVo, reason: not valid java name */
    public final q0 m186component14QN2ZGVo() {
        return this.subTitleColorDark;
    }

    @Nullable
    public final PushNotificationsBannerState component15() {
        return this.pushNotificationsBannerState;
    }

    @Nullable
    public final Integer component2() {
        return this.navIcon;
    }

    @Nullable
    public final StringProvider component3() {
        return this.subTitle;
    }

    @Nullable
    public final Integer component4() {
        return this.subTitleLeadingIcon;
    }

    @NotNull
    public final List<AvatarWrapper> component5() {
        return this.avatars;
    }

    public final boolean component6() {
        return this.displayActiveIndicator;
    }

    @Nullable
    public final TicketProgressRowState component7() {
        return this.ticketStatusState;
    }

    @NotNull
    public final List<HeaderMenuItem> component8() {
        return this.headerMenuItems;
    }

    @Nullable
    /* JADX INFO: renamed from: component9-QN2ZGVo, reason: not valid java name */
    public final q0 m187component9QN2ZGVo() {
        return this.backgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-N4y9b34, reason: not valid java name */
    public final TopAppBarUiState m188copyN4y9b34(@NotNull StringProvider title, @Nullable Integer num, @Nullable StringProvider stringProvider, @Nullable Integer num2, @NotNull List<AvatarWrapper> avatars, boolean z10, @Nullable TicketProgressRowState ticketProgressRowState, @NotNull List<? extends HeaderMenuItem> headerMenuItems, @Nullable q0 q0Var, @Nullable q0 q0Var2, @Nullable q0 q0Var3, @Nullable q0 q0Var4, @Nullable q0 q0Var5, @Nullable q0 q0Var6, @Nullable PushNotificationsBannerState pushNotificationsBannerState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(headerMenuItems, "headerMenuItems");
        return new TopAppBarUiState(title, num, stringProvider, num2, avatars, z10, ticketProgressRowState, headerMenuItems, q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, pushNotificationsBannerState, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopAppBarUiState)) {
            return false;
        }
        TopAppBarUiState topAppBarUiState = (TopAppBarUiState) obj;
        return Intrinsics.areEqual(this.title, topAppBarUiState.title) && Intrinsics.areEqual(this.navIcon, topAppBarUiState.navIcon) && Intrinsics.areEqual(this.subTitle, topAppBarUiState.subTitle) && Intrinsics.areEqual(this.subTitleLeadingIcon, topAppBarUiState.subTitleLeadingIcon) && Intrinsics.areEqual(this.avatars, topAppBarUiState.avatars) && this.displayActiveIndicator == topAppBarUiState.displayActiveIndicator && Intrinsics.areEqual(this.ticketStatusState, topAppBarUiState.ticketStatusState) && Intrinsics.areEqual(this.headerMenuItems, topAppBarUiState.headerMenuItems) && Intrinsics.areEqual(this.backgroundColor, topAppBarUiState.backgroundColor) && Intrinsics.areEqual(this.backgroundColorDark, topAppBarUiState.backgroundColorDark) && Intrinsics.areEqual(this.contentColor, topAppBarUiState.contentColor) && Intrinsics.areEqual(this.contentColorDark, topAppBarUiState.contentColorDark) && Intrinsics.areEqual(this.subTitleColor, topAppBarUiState.subTitleColor) && Intrinsics.areEqual(this.subTitleColorDark, topAppBarUiState.subTitleColorDark) && Intrinsics.areEqual(this.pushNotificationsBannerState, topAppBarUiState.pushNotificationsBannerState);
    }

    @NotNull
    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    @Nullable
    /* JADX INFO: renamed from: getBackgroundColor-QN2ZGVo, reason: not valid java name */
    public final q0 m189getBackgroundColorQN2ZGVo() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: getBackgroundColorDark-QN2ZGVo, reason: not valid java name */
    public final q0 m190getBackgroundColorDarkQN2ZGVo() {
        return this.backgroundColorDark;
    }

    @Nullable
    /* JADX INFO: renamed from: getContentColor-QN2ZGVo, reason: not valid java name */
    public final q0 m191getContentColorQN2ZGVo() {
        return this.contentColor;
    }

    @Nullable
    /* JADX INFO: renamed from: getContentColorDark-QN2ZGVo, reason: not valid java name */
    public final q0 m192getContentColorDarkQN2ZGVo() {
        return this.contentColorDark;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    @NotNull
    public final List<HeaderMenuItem> getHeaderMenuItems() {
        return this.headerMenuItems;
    }

    @Nullable
    public final Integer getNavIcon() {
        return this.navIcon;
    }

    @Nullable
    public final PushNotificationsBannerState getPushNotificationsBannerState() {
        return this.pushNotificationsBannerState;
    }

    @Nullable
    public final StringProvider getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: getSubTitleColor-QN2ZGVo, reason: not valid java name */
    public final q0 m193getSubTitleColorQN2ZGVo() {
        return this.subTitleColor;
    }

    @Nullable
    /* JADX INFO: renamed from: getSubTitleColorDark-QN2ZGVo, reason: not valid java name */
    public final q0 m194getSubTitleColorDarkQN2ZGVo() {
        return this.subTitleColorDark;
    }

    @Nullable
    public final Integer getSubTitleLeadingIcon() {
        return this.subTitleLeadingIcon;
    }

    @Nullable
    public final TicketProgressRowState getTicketStatusState() {
        return this.ticketStatusState;
    }

    @NotNull
    public final StringProvider getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Integer num = this.navIcon;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        StringProvider stringProvider = this.subTitle;
        int iHashCode4 = (iHashCode3 + (stringProvider == null ? 0 : stringProvider.hashCode())) * 31;
        Integer num2 = this.subTitleLeadingIcon;
        int iHashCode5 = (((((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.avatars.hashCode()) * 31) + Boolean.hashCode(this.displayActiveIndicator)) * 31;
        TicketProgressRowState ticketProgressRowState = this.ticketStatusState;
        int iHashCode6 = (((iHashCode5 + (ticketProgressRowState == null ? 0 : ticketProgressRowState.hashCode())) * 31) + this.headerMenuItems.hashCode()) * 31;
        q0 q0Var = this.backgroundColor;
        int iK = (iHashCode6 + (q0Var == null ? 0 : q0.K(q0Var.M()))) * 31;
        q0 q0Var2 = this.backgroundColorDark;
        int iK2 = (iK + (q0Var2 == null ? 0 : q0.K(q0Var2.M()))) * 31;
        q0 q0Var3 = this.contentColor;
        int iK3 = (iK2 + (q0Var3 == null ? 0 : q0.K(q0Var3.M()))) * 31;
        q0 q0Var4 = this.contentColorDark;
        int iK4 = (iK3 + (q0Var4 == null ? 0 : q0.K(q0Var4.M()))) * 31;
        q0 q0Var5 = this.subTitleColor;
        int iK5 = (iK4 + (q0Var5 == null ? 0 : q0.K(q0Var5.M()))) * 31;
        q0 q0Var6 = this.subTitleColorDark;
        int iK6 = (iK5 + (q0Var6 == null ? 0 : q0.K(q0Var6.M()))) * 31;
        PushNotificationsBannerState pushNotificationsBannerState = this.pushNotificationsBannerState;
        if (pushNotificationsBannerState != null) {
            iHashCode2 = pushNotificationsBannerState.hashCode();
        }
        return iK6 + iHashCode2;
    }

    @NotNull
    public String toString() {
        return "TopAppBarUiState(title=" + this.title + ", navIcon=" + this.navIcon + ", subTitle=" + this.subTitle + ", subTitleLeadingIcon=" + this.subTitleLeadingIcon + ", avatars=" + this.avatars + ", displayActiveIndicator=" + this.displayActiveIndicator + ", ticketStatusState=" + this.ticketStatusState + ", headerMenuItems=" + this.headerMenuItems + ", backgroundColor=" + this.backgroundColor + ", backgroundColorDark=" + this.backgroundColorDark + ", contentColor=" + this.contentColor + ", contentColorDark=" + this.contentColorDark + ", subTitleColor=" + this.subTitleColor + ", subTitleColorDark=" + this.subTitleColorDark + ", pushNotificationsBannerState=" + this.pushNotificationsBannerState + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TopAppBarUiState(StringProvider title, Integer num, StringProvider stringProvider, Integer num2, List<AvatarWrapper> avatars, boolean z10, TicketProgressRowState ticketProgressRowState, List<? extends HeaderMenuItem> headerMenuItems, q0 q0Var, q0 q0Var2, q0 q0Var3, q0 q0Var4, q0 q0Var5, q0 q0Var6, PushNotificationsBannerState pushNotificationsBannerState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(headerMenuItems, "headerMenuItems");
        this.title = title;
        this.navIcon = num;
        this.subTitle = stringProvider;
        this.subTitleLeadingIcon = num2;
        this.avatars = avatars;
        this.displayActiveIndicator = z10;
        this.ticketStatusState = ticketProgressRowState;
        this.headerMenuItems = headerMenuItems;
        this.backgroundColor = q0Var;
        this.backgroundColorDark = q0Var2;
        this.contentColor = q0Var3;
        this.contentColorDark = q0Var4;
        this.subTitleColor = q0Var5;
        this.subTitleColorDark = q0Var6;
        this.pushNotificationsBannerState = pushNotificationsBannerState;
    }

    public /* synthetic */ TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z10, TicketProgressRowState ticketProgressRowState, List list2, q0 q0Var, q0 q0Var2, q0 q0Var3, q0 q0Var4, q0 q0Var5, q0 q0Var6, PushNotificationsBannerState pushNotificationsBannerState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringProvider, (i10 & 2) != 0 ? null : num, stringProvider2, num2, list, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? null : ticketProgressRowState, (i10 & 128) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 256) != 0 ? null : q0Var, (i10 & 512) != 0 ? null : q0Var2, (i10 & 1024) != 0 ? null : q0Var3, (i10 & 2048) != 0 ? null : q0Var4, (i10 & 4096) != 0 ? null : q0Var5, (i10 & 8192) != 0 ? null : q0Var6, (i10 & 16384) != 0 ? null : pushNotificationsBannerState, null);
    }
}
