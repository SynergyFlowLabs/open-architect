package io.intercom.android.sdk.m5.data;

import android.app.Activity;
import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.Conversation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class IntercomEvent {
    public static final int $stable = 0;

    @w0(parameters = 0)
    public static final class ActivityPaused extends IntercomEvent {
        public static final int $stable = 8;

        @NotNull
        private final Activity activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityPaused(@NotNull Activity activity) {
            super(null);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        public static /* synthetic */ ActivityPaused copy$default(ActivityPaused activityPaused, Activity activity, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                activity = activityPaused.activity;
            }
            return activityPaused.copy(activity);
        }

        @NotNull
        public final Activity component1() {
            return this.activity;
        }

        @NotNull
        public final ActivityPaused copy(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new ActivityPaused(activity);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityPaused) && Intrinsics.areEqual(this.activity, ((ActivityPaused) obj).activity);
        }

        @NotNull
        public final Activity getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        @NotNull
        public String toString() {
            return "ActivityPaused(activity=" + this.activity + ')';
        }
    }

    @w0(parameters = 0)
    public static final class ActivityReadyForViewAttachment extends IntercomEvent {
        public static final int $stable = 8;

        @NotNull
        private final Activity activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityReadyForViewAttachment(@NotNull Activity activity) {
            super(null);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        public static /* synthetic */ ActivityReadyForViewAttachment copy$default(ActivityReadyForViewAttachment activityReadyForViewAttachment, Activity activity, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                activity = activityReadyForViewAttachment.activity;
            }
            return activityReadyForViewAttachment.copy(activity);
        }

        @NotNull
        public final Activity component1() {
            return this.activity;
        }

        @NotNull
        public final ActivityReadyForViewAttachment copy(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new ActivityReadyForViewAttachment(activity);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityReadyForViewAttachment) && Intrinsics.areEqual(this.activity, ((ActivityReadyForViewAttachment) obj).activity);
        }

        @NotNull
        public final Activity getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        @NotNull
        public String toString() {
            return "ActivityReadyForViewAttachment(activity=" + this.activity + ')';
        }
    }

    @w0(parameters = 0)
    public static final class ActivityStopped extends IntercomEvent {
        public static final int $stable = 8;

        @NotNull
        private final Activity activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityStopped(@NotNull Activity activity) {
            super(null);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        public static /* synthetic */ ActivityStopped copy$default(ActivityStopped activityStopped, Activity activity, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                activity = activityStopped.activity;
            }
            return activityStopped.copy(activity);
        }

        @NotNull
        public final Activity component1() {
            return this.activity;
        }

        @NotNull
        public final ActivityStopped copy(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new ActivityStopped(activity);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityStopped) && Intrinsics.areEqual(this.activity, ((ActivityStopped) obj).activity);
        }

        @NotNull
        public final Activity getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        @NotNull
        public String toString() {
            return "ActivityStopped(activity=" + this.activity + ')';
        }
    }

    @w0(parameters = 1)
    public static final class AppEnteredBackground extends IntercomEvent {
        public static final int $stable = 0;
        private final long timestamp;

        public AppEnteredBackground(long j10) {
            super(null);
            this.timestamp = j10;
        }

        public static /* synthetic */ AppEnteredBackground copy$default(AppEnteredBackground appEnteredBackground, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = appEnteredBackground.timestamp;
            }
            return appEnteredBackground.copy(j10);
        }

        public final long component1() {
            return this.timestamp;
        }

        @NotNull
        public final AppEnteredBackground copy(long j10) {
            return new AppEnteredBackground(j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppEnteredBackground) && this.timestamp == ((AppEnteredBackground) obj).timestamp;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        @NotNull
        public String toString() {
            return "AppEnteredBackground(timestamp=" + this.timestamp + ')';
        }
    }

    @w0(parameters = 1)
    public static final class AppEnteredForeground extends IntercomEvent {
        public static final int $stable = 0;
        private final long timestamp;

        public AppEnteredForeground(long j10) {
            super(null);
            this.timestamp = j10;
        }

        public static /* synthetic */ AppEnteredForeground copy$default(AppEnteredForeground appEnteredForeground, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = appEnteredForeground.timestamp;
            }
            return appEnteredForeground.copy(j10);
        }

        public final long component1() {
            return this.timestamp;
        }

        @NotNull
        public final AppEnteredForeground copy(long j10) {
            return new AppEnteredForeground(j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppEnteredForeground) && this.timestamp == ((AppEnteredForeground) obj).timestamp;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        @NotNull
        public String toString() {
            return "AppEnteredForeground(timestamp=" + this.timestamp + ')';
        }
    }

    @w0(parameters = 0)
    public static final class BaseResponseReceived extends IntercomEvent {
        public static final int $stable = 8;

        @NotNull
        private final BaseResponse baseResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseResponseReceived(@NotNull BaseResponse baseResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(baseResponse, "baseResponse");
            this.baseResponse = baseResponse;
        }

        public static /* synthetic */ BaseResponseReceived copy$default(BaseResponseReceived baseResponseReceived, BaseResponse baseResponse, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                baseResponse = baseResponseReceived.baseResponse;
            }
            return baseResponseReceived.copy(baseResponse);
        }

        @NotNull
        public final BaseResponse component1() {
            return this.baseResponse;
        }

        @NotNull
        public final BaseResponseReceived copy(@NotNull BaseResponse baseResponse) {
            Intrinsics.checkNotNullParameter(baseResponse, "baseResponse");
            return new BaseResponseReceived(baseResponse);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BaseResponseReceived) && Intrinsics.areEqual(this.baseResponse, ((BaseResponseReceived) obj).baseResponse);
        }

        @NotNull
        public final BaseResponse getBaseResponse() {
            return this.baseResponse;
        }

        public int hashCode() {
            return this.baseResponse.hashCode();
        }

        @NotNull
        public String toString() {
            return "BaseResponseReceived(baseResponse=" + this.baseResponse + ')';
        }
    }

    @w0(parameters = 1)
    public static final class CardUpdated extends IntercomEvent {
        public static final int $stable = 0;

        @NotNull
        public static final CardUpdated INSTANCE = new CardUpdated();

        private CardUpdated() {
            super(null);
        }
    }

    @w0(parameters = 0)
    public static final class NewConversation extends IntercomEvent {
        public static final int $stable = 8;

        @NotNull
        private final Conversation conversation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewConversation(@NotNull Conversation conversation) {
            super(null);
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            this.conversation = conversation;
        }

        public static /* synthetic */ NewConversation copy$default(NewConversation newConversation, Conversation conversation, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                conversation = newConversation.conversation;
            }
            return newConversation.copy(conversation);
        }

        @NotNull
        public final Conversation component1() {
            return this.conversation;
        }

        @NotNull
        public final NewConversation copy(@NotNull Conversation conversation) {
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            return new NewConversation(conversation);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewConversation) && Intrinsics.areEqual(this.conversation, ((NewConversation) obj).conversation);
        }

        @NotNull
        public final Conversation getConversation() {
            return this.conversation;
        }

        public int hashCode() {
            return this.conversation.hashCode();
        }

        @NotNull
        public String toString() {
            return "NewConversation(conversation=" + this.conversation + ')';
        }
    }

    @w0(parameters = 1)
    public static final class SoftReset extends IntercomEvent {
        public static final int $stable = 0;

        @NotNull
        public static final SoftReset INSTANCE = new SoftReset();

        private SoftReset() {
            super(null);
        }
    }

    public /* synthetic */ IntercomEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IntercomEvent() {
    }
}
