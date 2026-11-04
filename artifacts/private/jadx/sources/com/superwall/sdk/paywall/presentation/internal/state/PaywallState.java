package com.superwall.sdk.paywall.presentation.internal.state;

import com.superwall.sdk.paywall.presentation.PaywallInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PaywallState {

    public static final class Dismissed extends PaywallState {

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final PaywallResult paywallResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dismissed(@NotNull PaywallInfo paywallInfo, @NotNull PaywallResult paywallResult) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            Intrinsics.checkNotNullParameter(paywallResult, "paywallResult");
            this.paywallInfo = paywallInfo;
            this.paywallResult = paywallResult;
        }

        public static /* synthetic */ Dismissed copy$default(Dismissed dismissed, PaywallInfo paywallInfo, PaywallResult paywallResult, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallInfo = dismissed.paywallInfo;
            }
            if ((i10 & 2) != 0) {
                paywallResult = dismissed.paywallResult;
            }
            return dismissed.copy(paywallInfo, paywallResult);
        }

        @NotNull
        public final PaywallInfo component1() {
            return this.paywallInfo;
        }

        @NotNull
        public final PaywallResult component2() {
            return this.paywallResult;
        }

        @NotNull
        public final Dismissed copy(@NotNull PaywallInfo paywallInfo, @NotNull PaywallResult paywallResult) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            Intrinsics.checkNotNullParameter(paywallResult, "paywallResult");
            return new Dismissed(paywallInfo, paywallResult);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dismissed)) {
                return false;
            }
            Dismissed dismissed = (Dismissed) obj;
            return Intrinsics.areEqual(this.paywallInfo, dismissed.paywallInfo) && Intrinsics.areEqual(this.paywallResult, dismissed.paywallResult);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final PaywallResult getPaywallResult() {
            return this.paywallResult;
        }

        public int hashCode() {
            return (this.paywallInfo.hashCode() * 31) + this.paywallResult.hashCode();
        }

        @NotNull
        public String toString() {
            return "Dismissed(paywallInfo=" + this.paywallInfo + ", paywallResult=" + this.paywallResult + ")";
        }
    }

    public static final class PresentationError extends PaywallState {

        @NotNull
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentationError(@NotNull Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public static /* synthetic */ PresentationError copy$default(PresentationError presentationError, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = presentationError.error;
            }
            return presentationError.copy(th2);
        }

        @NotNull
        public final Throwable component1() {
            return this.error;
        }

        @NotNull
        public final PresentationError copy(@NotNull Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new PresentationError(error);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PresentationError) && Intrinsics.areEqual(this.error, ((PresentationError) obj).error);
        }

        @NotNull
        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "PresentationError(error=" + this.error + ")";
        }
    }

    public static final class Presented extends PaywallState {

        @NotNull
        private final PaywallInfo paywallInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Presented(@NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            int i10 = 7 & 0;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ Presented copy$default(Presented presented, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallInfo = presented.paywallInfo;
            }
            return presented.copy(paywallInfo);
        }

        @NotNull
        public final PaywallInfo component1() {
            return this.paywallInfo;
        }

        @NotNull
        public final Presented copy(@NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new Presented(paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Presented) && Intrinsics.areEqual(this.paywallInfo, ((Presented) obj).paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        public int hashCode() {
            return this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "Presented(paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class Skipped extends PaywallState {

        @NotNull
        private final PaywallSkippedReason paywallSkippedReason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Skipped(@NotNull PaywallSkippedReason paywallSkippedReason) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallSkippedReason, "paywallSkippedReason");
            this.paywallSkippedReason = paywallSkippedReason;
        }

        public static /* synthetic */ Skipped copy$default(Skipped skipped, PaywallSkippedReason paywallSkippedReason, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallSkippedReason = skipped.paywallSkippedReason;
            }
            return skipped.copy(paywallSkippedReason);
        }

        @NotNull
        public final PaywallSkippedReason component1() {
            return this.paywallSkippedReason;
        }

        @NotNull
        public final Skipped copy(@NotNull PaywallSkippedReason paywallSkippedReason) {
            Intrinsics.checkNotNullParameter(paywallSkippedReason, "paywallSkippedReason");
            return new Skipped(paywallSkippedReason);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Skipped) && Intrinsics.areEqual(this.paywallSkippedReason, ((Skipped) obj).paywallSkippedReason);
        }

        @NotNull
        public final PaywallSkippedReason getPaywallSkippedReason() {
            return this.paywallSkippedReason;
        }

        public int hashCode() {
            return this.paywallSkippedReason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Skipped(paywallSkippedReason=" + this.paywallSkippedReason + ")";
        }
    }

    public /* synthetic */ PaywallState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaywallState() {
    }
}
