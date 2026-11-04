package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public abstract class ErrorState {
    public static final int $stable = 0;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class WithoutCTA extends ErrorState {
        public static final int $stable = 0;

        @Nullable
        private final Integer additionalMessageResId;
        private final int iconId;
        private final int messageResId;

        public WithoutCTA() {
            this(0, 0, null, 7, null);
        }

        public static /* synthetic */ WithoutCTA copy$default(WithoutCTA withoutCTA, int i10, int i11, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = withoutCTA.iconId;
            }
            if ((i12 & 2) != 0) {
                i11 = withoutCTA.messageResId;
            }
            if ((i12 & 4) != 0) {
                num = withoutCTA.additionalMessageResId;
            }
            return withoutCTA.copy(i10, i11, num);
        }

        public final int component1() {
            return this.iconId;
        }

        public final int component2() {
            return this.messageResId;
        }

        @Nullable
        public final Integer component3() {
            return this.additionalMessageResId;
        }

        @NotNull
        public final WithoutCTA copy(@androidx.annotation.v int i10, @androidx.annotation.f1 int i11, @androidx.annotation.f1 @Nullable Integer num) {
            return new WithoutCTA(i10, i11, num);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithoutCTA)) {
                return false;
            }
            WithoutCTA withoutCTA = (WithoutCTA) obj;
            return this.iconId == withoutCTA.iconId && this.messageResId == withoutCTA.messageResId && Intrinsics.areEqual(this.additionalMessageResId, withoutCTA.additionalMessageResId);
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        @Nullable
        public Integer getAdditionalMessageResId() {
            return this.additionalMessageResId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getIconId() {
            return this.iconId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getMessageResId() {
            return this.messageResId;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.iconId) * 31) + Integer.hashCode(this.messageResId)) * 31;
            Integer num = this.additionalMessageResId;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "WithoutCTA(iconId=" + this.iconId + ", messageResId=" + this.messageResId + ", additionalMessageResId=" + this.additionalMessageResId + ')';
        }

        public /* synthetic */ WithoutCTA(int i10, int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? R.drawable.intercom_ic_warning : i10, (i12 & 2) != 0 ? R.string.intercom_spaces_error_title : i11, (i12 & 4) != 0 ? Integer.valueOf(R.string.intercom_spaces_error_description) : num);
        }

        public WithoutCTA(@androidx.annotation.v int i10, @androidx.annotation.f1 int i11, @androidx.annotation.f1 @Nullable Integer num) {
            super(null);
            this.iconId = i10;
            this.messageResId = i11;
            this.additionalMessageResId = num;
        }
    }

    public /* synthetic */ ErrorState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract Integer getAdditionalMessageResId();

    public abstract int getIconId();

    public abstract int getMessageResId();

    private ErrorState() {
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class WithCTA extends ErrorState {
        public static final int $stable = 0;

        @Nullable
        private final Integer additionalMessageResId;
        private final int ctaResId;
        private final int iconId;
        private final int messageResId;

        @NotNull
        private final Function0<Unit> onCtaClick;

        public /* synthetic */ WithCTA(int i10, int i11, Integer num, int i12, Function0 function0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? R.drawable.intercom_ic_warning : i10, (i13 & 2) != 0 ? R.string.intercom_spaces_error_title : i11, (i13 & 4) != 0 ? Integer.valueOf(R.string.intercom_spaces_error_description) : num, (i13 & 8) != 0 ? R.string.intercom_reload : i12, function0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WithCTA copy$default(WithCTA withCTA, int i10, int i11, Integer num, int i12, Function0 function0, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i10 = withCTA.iconId;
            }
            if ((i13 & 2) != 0) {
                i11 = withCTA.messageResId;
            }
            if ((i13 & 4) != 0) {
                num = withCTA.additionalMessageResId;
            }
            if ((i13 & 8) != 0) {
                i12 = withCTA.ctaResId;
            }
            if ((i13 & 16) != 0) {
                function0 = withCTA.onCtaClick;
            }
            Function0 function1 = function0;
            Integer num2 = num;
            return withCTA.copy(i10, i11, num2, i12, function1);
        }

        public final int component1() {
            return this.iconId;
        }

        public final int component2() {
            return this.messageResId;
        }

        @Nullable
        public final Integer component3() {
            return this.additionalMessageResId;
        }

        public final int component4() {
            return this.ctaResId;
        }

        @NotNull
        public final Function0<Unit> component5() {
            return this.onCtaClick;
        }

        @NotNull
        public final WithCTA copy(@androidx.annotation.v int i10, @androidx.annotation.f1 int i11, @androidx.annotation.f1 @Nullable Integer num, @androidx.annotation.f1 int i12, @NotNull Function0<Unit> onCtaClick) {
            Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
            return new WithCTA(i10, i11, num, i12, onCtaClick);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithCTA)) {
                return false;
            }
            WithCTA withCTA = (WithCTA) obj;
            return this.iconId == withCTA.iconId && this.messageResId == withCTA.messageResId && Intrinsics.areEqual(this.additionalMessageResId, withCTA.additionalMessageResId) && this.ctaResId == withCTA.ctaResId && Intrinsics.areEqual(this.onCtaClick, withCTA.onCtaClick);
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        @Nullable
        public Integer getAdditionalMessageResId() {
            return this.additionalMessageResId;
        }

        public final int getCtaResId() {
            return this.ctaResId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getIconId() {
            return this.iconId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getMessageResId() {
            return this.messageResId;
        }

        @NotNull
        public final Function0<Unit> getOnCtaClick() {
            return this.onCtaClick;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.iconId) * 31) + Integer.hashCode(this.messageResId)) * 31;
            Integer num = this.additionalMessageResId;
            return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.ctaResId)) * 31) + this.onCtaClick.hashCode();
        }

        @NotNull
        public String toString() {
            return "WithCTA(iconId=" + this.iconId + ", messageResId=" + this.messageResId + ", additionalMessageResId=" + this.additionalMessageResId + ", ctaResId=" + this.ctaResId + ", onCtaClick=" + this.onCtaClick + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithCTA(@androidx.annotation.v int i10, @androidx.annotation.f1 int i11, @androidx.annotation.f1 @Nullable Integer num, @androidx.annotation.f1 int i12, @NotNull Function0<Unit> onCtaClick) {
            super(null);
            Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
            this.iconId = i10;
            this.messageResId = i11;
            this.additionalMessageResId = num;
            this.ctaResId = i12;
            this.onCtaClick = onCtaClick;
        }
    }
}
