package io.intercom.android.sdk.models;

import android.app.Activity;
import androidx.compose.runtime.internal.w0;
import e.a;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class OverlayState {
    private final int bottomPadding;

    @NotNull
    private final Carousel carousel;

    @NotNull
    private final List<Conversation> conversations;

    @NotNull
    private final Set<String> dismissedPartIds;

    @NotNull
    private final Intercom.Visibility inAppNotificationsVisibility;

    @NotNull
    private final Intercom.Visibility launcherVisibility;

    @Nullable
    private final Activity pausedHostActivity;

    @Nullable
    private final Activity resumedHostActivity;

    @NotNull
    private final SurveyData surveyData;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @f
    @NotNull
    public static final OverlayState NULL = new OverlayState(null, null, 0, null, null, null, null, null, null, 511, null);

    @a({"StaticFieldLeak"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OverlayState() {
        this(null, null, 0, null, null, null, null, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OverlayState copy$default(OverlayState overlayState, SurveyData surveyData, Carousel carousel, int i10, Intercom.Visibility visibility, Intercom.Visibility visibility2, List list, Set set, Activity activity, Activity activity2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            surveyData = overlayState.surveyData;
        }
        if ((i11 & 2) != 0) {
            carousel = overlayState.carousel;
        }
        if ((i11 & 4) != 0) {
            i10 = overlayState.bottomPadding;
        }
        if ((i11 & 8) != 0) {
            visibility = overlayState.launcherVisibility;
        }
        if ((i11 & 16) != 0) {
            visibility2 = overlayState.inAppNotificationsVisibility;
        }
        if ((i11 & 32) != 0) {
            list = overlayState.conversations;
        }
        if ((i11 & 64) != 0) {
            set = overlayState.dismissedPartIds;
        }
        if ((i11 & 128) != 0) {
            activity = overlayState.resumedHostActivity;
        }
        if ((i11 & 256) != 0) {
            activity2 = overlayState.pausedHostActivity;
        }
        Activity activity3 = activity;
        Activity activity4 = activity2;
        List list2 = list;
        Set set2 = set;
        Intercom.Visibility visibility3 = visibility2;
        int i12 = i10;
        return overlayState.copy(surveyData, carousel, i12, visibility, visibility3, list2, set2, activity3, activity4);
    }

    @NotNull
    public final SurveyData component1() {
        return this.surveyData;
    }

    @NotNull
    public final Carousel component2() {
        return this.carousel;
    }

    public final int component3() {
        return this.bottomPadding;
    }

    @NotNull
    public final Intercom.Visibility component4() {
        return this.launcherVisibility;
    }

    @NotNull
    public final Intercom.Visibility component5() {
        return this.inAppNotificationsVisibility;
    }

    @NotNull
    public final List<Conversation> component6() {
        return this.conversations;
    }

    @NotNull
    public final Set<String> component7() {
        return this.dismissedPartIds;
    }

    @Nullable
    public final Activity component8() {
        return this.resumedHostActivity;
    }

    @Nullable
    public final Activity component9() {
        return this.pausedHostActivity;
    }

    @NotNull
    public final OverlayState copy(@NotNull SurveyData surveyData, @NotNull Carousel carousel, int i10, @NotNull Intercom.Visibility launcherVisibility, @NotNull Intercom.Visibility inAppNotificationsVisibility, @NotNull List<Conversation> conversations, @NotNull Set<String> dismissedPartIds, @Nullable Activity activity, @Nullable Activity activity2) {
        Intrinsics.checkNotNullParameter(surveyData, "surveyData");
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        Intrinsics.checkNotNullParameter(launcherVisibility, "launcherVisibility");
        Intrinsics.checkNotNullParameter(inAppNotificationsVisibility, "inAppNotificationsVisibility");
        Intrinsics.checkNotNullParameter(conversations, "conversations");
        Intrinsics.checkNotNullParameter(dismissedPartIds, "dismissedPartIds");
        return new OverlayState(surveyData, carousel, i10, launcherVisibility, inAppNotificationsVisibility, conversations, dismissedPartIds, activity, activity2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverlayState)) {
            return false;
        }
        OverlayState overlayState = (OverlayState) obj;
        return Intrinsics.areEqual(this.surveyData, overlayState.surveyData) && Intrinsics.areEqual(this.carousel, overlayState.carousel) && this.bottomPadding == overlayState.bottomPadding && this.launcherVisibility == overlayState.launcherVisibility && this.inAppNotificationsVisibility == overlayState.inAppNotificationsVisibility && Intrinsics.areEqual(this.conversations, overlayState.conversations) && Intrinsics.areEqual(this.dismissedPartIds, overlayState.dismissedPartIds) && Intrinsics.areEqual(this.resumedHostActivity, overlayState.resumedHostActivity) && Intrinsics.areEqual(this.pausedHostActivity, overlayState.pausedHostActivity);
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final Carousel getCarousel() {
        return this.carousel;
    }

    @NotNull
    public final List<Conversation> getConversations() {
        return this.conversations;
    }

    @NotNull
    public final Set<String> getDismissedPartIds() {
        return this.dismissedPartIds;
    }

    @NotNull
    public final Intercom.Visibility getInAppNotificationsVisibility() {
        return this.inAppNotificationsVisibility;
    }

    @NotNull
    public final Intercom.Visibility getLauncherVisibility() {
        return this.launcherVisibility;
    }

    @Nullable
    public final Activity getPausedHostActivity() {
        return this.pausedHostActivity;
    }

    @Nullable
    public final Activity getResumedHostActivity() {
        return this.resumedHostActivity;
    }

    @NotNull
    public final SurveyData getSurveyData() {
        return this.surveyData;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.surveyData.hashCode() * 31) + this.carousel.hashCode()) * 31) + Integer.hashCode(this.bottomPadding)) * 31) + this.launcherVisibility.hashCode()) * 31) + this.inAppNotificationsVisibility.hashCode()) * 31) + this.conversations.hashCode()) * 31) + this.dismissedPartIds.hashCode()) * 31;
        Activity activity = this.resumedHostActivity;
        int iHashCode2 = (iHashCode + (activity == null ? 0 : activity.hashCode())) * 31;
        Activity activity2 = this.pausedHostActivity;
        return iHashCode2 + (activity2 != null ? activity2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OverlayState(surveyData=" + this.surveyData + ", carousel=" + this.carousel + ", bottomPadding=" + this.bottomPadding + ", launcherVisibility=" + this.launcherVisibility + ", inAppNotificationsVisibility=" + this.inAppNotificationsVisibility + ", conversations=" + this.conversations + ", dismissedPartIds=" + this.dismissedPartIds + ", resumedHostActivity=" + this.resumedHostActivity + ", pausedHostActivity=" + this.pausedHostActivity + ')';
    }

    public OverlayState(@NotNull SurveyData surveyData, @NotNull Carousel carousel, int i10, @NotNull Intercom.Visibility launcherVisibility, @NotNull Intercom.Visibility inAppNotificationsVisibility, @NotNull List<Conversation> conversations, @NotNull Set<String> dismissedPartIds, @Nullable Activity activity, @Nullable Activity activity2) {
        Intrinsics.checkNotNullParameter(surveyData, "surveyData");
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        Intrinsics.checkNotNullParameter(launcherVisibility, "launcherVisibility");
        Intrinsics.checkNotNullParameter(inAppNotificationsVisibility, "inAppNotificationsVisibility");
        Intrinsics.checkNotNullParameter(conversations, "conversations");
        Intrinsics.checkNotNullParameter(dismissedPartIds, "dismissedPartIds");
        this.surveyData = surveyData;
        this.carousel = carousel;
        this.bottomPadding = i10;
        this.launcherVisibility = launcherVisibility;
        this.inAppNotificationsVisibility = inAppNotificationsVisibility;
        this.conversations = conversations;
        this.dismissedPartIds = dismissedPartIds;
        this.resumedHostActivity = activity;
        this.pausedHostActivity = activity2;
    }

    public /* synthetic */ OverlayState(SurveyData surveyData, Carousel carousel, int i10, Intercom.Visibility visibility, Intercom.Visibility visibility2, List list, Set set, Activity activity, Activity activity2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? SurveyData.Companion.getNULL() : surveyData, (i11 & 2) != 0 ? Carousel.NULL : carousel, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? Intercom.Visibility.GONE : visibility, (i11 & 16) != 0 ? Intercom.Visibility.VISIBLE : visibility2, (i11 & 32) != 0 ? CollectionsKt.emptyList() : list, (i11 & 64) != 0 ? SetsKt.emptySet() : set, (i11 & 128) != 0 ? null : activity, (i11 & 256) != 0 ? null : activity2);
    }
}
