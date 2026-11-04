package io.intercom.android.sdk.tickets;

import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class TicketTimelineCardState {
    public static final int $stable = 8;

    @NotNull
    private final List<AvatarWrapper> adminAvatars;
    private final long progressColor;

    @NotNull
    private final List<ProgressSection> progressSections;

    @NotNull
    private final String statusLabel;

    @NotNull
    private final String statusSubtitle;

    @NotNull
    private final String statusTitle;

    @Nullable
    private final Long timestamp;

    @kotlin.l(message = "Use StringProvider instead")
    @w0(parameters = 1)
    public static abstract class ActualStringOrRes {
        public static final int $stable = 0;

        @w0(parameters = 1)
        public static final class ActualString extends ActualStringOrRes {
            public static final int $stable = 0;

            @NotNull
            private final String string;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActualString(@NotNull String string) {
                super(null);
                Intrinsics.checkNotNullParameter(string, "string");
                this.string = string;
            }

            public static /* synthetic */ ActualString copy$default(ActualString actualString, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = actualString.string;
                }
                return actualString.copy(str);
            }

            @NotNull
            public final String component1() {
                return this.string;
            }

            @NotNull
            public final ActualString copy(@NotNull String string) {
                Intrinsics.checkNotNullParameter(string, "string");
                return new ActualString(string);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof ActualString) && Intrinsics.areEqual(this.string, ((ActualString) obj).string)) {
                    return true;
                }
                return false;
            }

            @NotNull
            public final String getString() {
                return this.string;
            }

            public int hashCode() {
                return this.string.hashCode();
            }

            @NotNull
            public String toString() {
                return "ActualString(string=" + this.string + ')';
            }
        }

        @w0(parameters = 1)
        public static final class StringRes extends ActualStringOrRes {
            public static final int $stable = 0;
            private final int stringRes;

            public StringRes(@f1 int i10) {
                super(null);
                this.stringRes = i10;
            }

            public static /* synthetic */ StringRes copy$default(StringRes stringRes, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = stringRes.stringRes;
                }
                return stringRes.copy(i10);
            }

            public final int component1() {
                return this.stringRes;
            }

            @NotNull
            public final StringRes copy(@f1 int i10) {
                return new StringRes(i10);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StringRes) && this.stringRes == ((StringRes) obj).stringRes;
            }

            public final int getStringRes() {
                return this.stringRes;
            }

            public int hashCode() {
                return Integer.hashCode(this.stringRes);
            }

            @NotNull
            public String toString() {
                return "StringRes(stringRes=" + this.stringRes + ')';
            }
        }

        public /* synthetic */ ActualStringOrRes(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @androidx.compose.runtime.o
        @NotNull
        public final String getText(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
            String strD;
            c0Var.E(796462681);
            if (this instanceof ActualString) {
                strD = ((ActualString) this).getString();
            } else {
                if (!(this instanceof StringRes)) {
                    throw new kotlin.k0();
                }
                strD = u0.i.d(((StringRes) this).getStringRes(), c0Var, 0);
            }
            c0Var.A();
            return strD;
        }

        private ActualStringOrRes() {
        }
    }

    @w0(parameters = 1)
    public static final class ProgressSection {
        public static final int $stable = 0;
        private final boolean isDone;
        private final boolean isLoading;

        public ProgressSection(boolean z10, boolean z11) {
            this.isDone = z10;
            this.isLoading = z11;
        }

        public static /* synthetic */ ProgressSection copy$default(ProgressSection progressSection, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = progressSection.isDone;
            }
            if ((i10 & 2) != 0) {
                z11 = progressSection.isLoading;
            }
            return progressSection.copy(z10, z11);
        }

        public final boolean component1() {
            return this.isDone;
        }

        public final boolean component2() {
            return this.isLoading;
        }

        @NotNull
        public final ProgressSection copy(boolean z10, boolean z11) {
            return new ProgressSection(z10, z11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressSection)) {
                return false;
            }
            ProgressSection progressSection = (ProgressSection) obj;
            return this.isDone == progressSection.isDone && this.isLoading == progressSection.isLoading;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isDone) * 31) + Boolean.hashCode(this.isLoading);
        }

        public final boolean isDone() {
            return this.isDone;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        @NotNull
        public String toString() {
            return "ProgressSection(isDone=" + this.isDone + ", isLoading=" + this.isLoading + ')';
        }
    }

    public /* synthetic */ TicketTimelineCardState(List list, String str, String str2, long j10, List list2, String str3, Long l10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, j10, list2, str3, l10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-ww6aTOc$default, reason: not valid java name */
    public static /* synthetic */ TicketTimelineCardState m544copyww6aTOc$default(TicketTimelineCardState ticketTimelineCardState, List list, String str, String str2, long j10, List list2, String str3, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = ticketTimelineCardState.adminAvatars;
        }
        if ((i10 & 2) != 0) {
            str = ticketTimelineCardState.statusTitle;
        }
        if ((i10 & 4) != 0) {
            str2 = ticketTimelineCardState.statusSubtitle;
        }
        if ((i10 & 8) != 0) {
            j10 = ticketTimelineCardState.progressColor;
        }
        if ((i10 & 16) != 0) {
            list2 = ticketTimelineCardState.progressSections;
        }
        if ((i10 & 32) != 0) {
            str3 = ticketTimelineCardState.statusLabel;
        }
        if ((i10 & 64) != 0) {
            l10 = ticketTimelineCardState.timestamp;
        }
        Long l11 = l10;
        List list3 = list2;
        long j11 = j10;
        String str4 = str2;
        return ticketTimelineCardState.m546copyww6aTOc(list, str, str4, j11, list3, str3, l11);
    }

    @NotNull
    public final List<AvatarWrapper> component1() {
        return this.adminAvatars;
    }

    @NotNull
    public final String component2() {
        return this.statusTitle;
    }

    @NotNull
    public final String component3() {
        return this.statusSubtitle;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m545component40d7_KjU() {
        return this.progressColor;
    }

    @NotNull
    public final List<ProgressSection> component5() {
        return this.progressSections;
    }

    @NotNull
    public final String component6() {
        return this.statusLabel;
    }

    @Nullable
    public final Long component7() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-ww6aTOc, reason: not valid java name */
    public final TicketTimelineCardState m546copyww6aTOc(@NotNull List<AvatarWrapper> adminAvatars, @NotNull String statusTitle, @NotNull String statusSubtitle, long j10, @NotNull List<ProgressSection> progressSections, @NotNull String statusLabel, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(adminAvatars, "adminAvatars");
        Intrinsics.checkNotNullParameter(statusTitle, "statusTitle");
        Intrinsics.checkNotNullParameter(statusSubtitle, "statusSubtitle");
        Intrinsics.checkNotNullParameter(progressSections, "progressSections");
        Intrinsics.checkNotNullParameter(statusLabel, "statusLabel");
        return new TicketTimelineCardState(adminAvatars, statusTitle, statusSubtitle, j10, progressSections, statusLabel, l10, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketTimelineCardState)) {
            return false;
        }
        TicketTimelineCardState ticketTimelineCardState = (TicketTimelineCardState) obj;
        return Intrinsics.areEqual(this.adminAvatars, ticketTimelineCardState.adminAvatars) && Intrinsics.areEqual(this.statusTitle, ticketTimelineCardState.statusTitle) && Intrinsics.areEqual(this.statusSubtitle, ticketTimelineCardState.statusSubtitle) && q0.y(this.progressColor, ticketTimelineCardState.progressColor) && Intrinsics.areEqual(this.progressSections, ticketTimelineCardState.progressSections) && Intrinsics.areEqual(this.statusLabel, ticketTimelineCardState.statusLabel) && Intrinsics.areEqual(this.timestamp, ticketTimelineCardState.timestamp);
    }

    @NotNull
    public final List<AvatarWrapper> getAdminAvatars() {
        return this.adminAvatars;
    }

    /* JADX INFO: renamed from: getProgressColor-0d7_KjU, reason: not valid java name */
    public final long m547getProgressColor0d7_KjU() {
        return this.progressColor;
    }

    @NotNull
    public final List<ProgressSection> getProgressSections() {
        return this.progressSections;
    }

    @NotNull
    public final String getStatusLabel() {
        return this.statusLabel;
    }

    @NotNull
    public final String getStatusSubtitle() {
        return this.statusSubtitle;
    }

    @NotNull
    public final String getStatusTitle() {
        return this.statusTitle;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.adminAvatars.hashCode() * 31) + this.statusTitle.hashCode()) * 31) + this.statusSubtitle.hashCode()) * 31) + q0.K(this.progressColor)) * 31) + this.progressSections.hashCode()) * 31) + this.statusLabel.hashCode()) * 31;
        Long l10 = this.timestamp;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    @NotNull
    public String toString() {
        return "TicketTimelineCardState(adminAvatars=" + this.adminAvatars + ", statusTitle=" + this.statusTitle + ", statusSubtitle=" + this.statusSubtitle + ", progressColor=" + ((Object) q0.L(this.progressColor)) + ", progressSections=" + this.progressSections + ", statusLabel=" + this.statusLabel + ", timestamp=" + this.timestamp + ')';
    }

    private TicketTimelineCardState(List<AvatarWrapper> adminAvatars, String statusTitle, String statusSubtitle, long j10, List<ProgressSection> progressSections, String statusLabel, Long l10) {
        Intrinsics.checkNotNullParameter(adminAvatars, "adminAvatars");
        Intrinsics.checkNotNullParameter(statusTitle, "statusTitle");
        Intrinsics.checkNotNullParameter(statusSubtitle, "statusSubtitle");
        Intrinsics.checkNotNullParameter(progressSections, "progressSections");
        Intrinsics.checkNotNullParameter(statusLabel, "statusLabel");
        this.adminAvatars = adminAvatars;
        this.statusTitle = statusTitle;
        this.statusSubtitle = statusSubtitle;
        this.progressColor = j10;
        this.progressSections = progressSections;
        this.statusLabel = statusLabel;
        this.timestamp = l10;
    }
}
