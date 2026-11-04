package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class ConversationUiEffect {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class LockScreenOrientation extends ConversationUiEffect {
        public static final int $stable = 0;

        @NotNull
        public static final LockScreenOrientation INSTANCE = new LockScreenOrientation();

        private LockScreenOrientation() {
            super(null);
        }
    }

    @w0(parameters = 1)
    public static final class ShowUploadSizeLimitDialog extends ConversationUiEffect {
        public static final int $stable = 0;

        @NotNull
        private final String uploadSizeLimitMB;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowUploadSizeLimitDialog(@NotNull String uploadSizeLimitMB) {
            super(null);
            Intrinsics.checkNotNullParameter(uploadSizeLimitMB, "uploadSizeLimitMB");
            this.uploadSizeLimitMB = uploadSizeLimitMB;
        }

        public static /* synthetic */ ShowUploadSizeLimitDialog copy$default(ShowUploadSizeLimitDialog showUploadSizeLimitDialog, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = showUploadSizeLimitDialog.uploadSizeLimitMB;
            }
            return showUploadSizeLimitDialog.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.uploadSizeLimitMB;
        }

        @NotNull
        public final ShowUploadSizeLimitDialog copy(@NotNull String uploadSizeLimitMB) {
            Intrinsics.checkNotNullParameter(uploadSizeLimitMB, "uploadSizeLimitMB");
            return new ShowUploadSizeLimitDialog(uploadSizeLimitMB);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowUploadSizeLimitDialog) && Intrinsics.areEqual(this.uploadSizeLimitMB, ((ShowUploadSizeLimitDialog) obj).uploadSizeLimitMB);
        }

        @NotNull
        public final String getUploadSizeLimitMB() {
            return this.uploadSizeLimitMB;
        }

        public int hashCode() {
            return this.uploadSizeLimitMB.hashCode();
        }

        @NotNull
        public String toString() {
            return "ShowUploadSizeLimitDialog(uploadSizeLimitMB=" + this.uploadSizeLimitMB + ')';
        }
    }

    @w0(parameters = 1)
    public static final class UnlockScreenOrientation extends ConversationUiEffect {
        public static final int $stable = 0;

        @NotNull
        public static final UnlockScreenOrientation INSTANCE = new UnlockScreenOrientation();

        private UnlockScreenOrientation() {
            super(null);
        }
    }

    public /* synthetic */ ConversationUiEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConversationUiEffect() {
    }
}
