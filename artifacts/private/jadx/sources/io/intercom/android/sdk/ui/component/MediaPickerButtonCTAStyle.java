package io.intercom.android.sdk.ui.component;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface MediaPickerButtonCTAStyle {

    @w0(parameters = 1)
    public static final class None implements MediaPickerButtonCTAStyle {
        public static final int $stable = 0;

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof None);
        }

        public int hashCode() {
            return 1542232760;
        }

        @NotNull
        public String toString() {
            return "None";
        }
    }

    @w0(parameters = 1)
    public static final class TextButton implements MediaPickerButtonCTAStyle {
        public static final int $stable = 0;

        @NotNull
        private final String ctaText;

        public TextButton(@NotNull String ctaText) {
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            this.ctaText = ctaText;
        }

        public static /* synthetic */ TextButton copy$default(TextButton textButton, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = textButton.ctaText;
            }
            return textButton.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.ctaText;
        }

        @NotNull
        public final TextButton copy(@NotNull String ctaText) {
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            return new TextButton(ctaText);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TextButton) && Intrinsics.areEqual(this.ctaText, ((TextButton) obj).ctaText);
        }

        @NotNull
        public final String getCtaText() {
            return this.ctaText;
        }

        public int hashCode() {
            return this.ctaText.hashCode();
        }

        @NotNull
        public String toString() {
            return "TextButton(ctaText=" + this.ctaText + ')';
        }
    }

    @w0(parameters = 1)
    public static final class TopBarButton implements MediaPickerButtonCTAStyle {
        public static final int $stable = 0;

        @NotNull
        public static final TopBarButton INSTANCE = new TopBarButton();

        private TopBarButton() {
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj && !(obj instanceof TopBarButton)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1620873520;
        }

        @NotNull
        public String toString() {
            return "TopBarButton";
        }
    }
}
