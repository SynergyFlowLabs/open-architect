package io.intercom.android.sdk.survey.block;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class SuffixText {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final SuffixText NO_SUFFIX = new SuffixText("", "", androidx.compose.ui.graphics.q0.f38131b.a(), null);
    private final long color;

    @NotNull
    private final String text;

    @NotNull
    private final String ttsText;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SuffixText getNO_SUFFIX() {
            return SuffixText.NO_SUFFIX;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SuffixText(String str, String str2, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10);
    }

    /* JADX INFO: renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ SuffixText m460copymxwnekA$default(SuffixText suffixText, String str, String str2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = suffixText.text;
        }
        if ((i10 & 2) != 0) {
            str2 = suffixText.ttsText;
        }
        if ((i10 & 4) != 0) {
            j10 = suffixText.color;
        }
        return suffixText.m462copymxwnekA(str, str2, j10);
    }

    @NotNull
    public final String component1() {
        return this.text;
    }

    @NotNull
    public final String component2() {
        return this.ttsText;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m461component30d7_KjU() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-mxwnekA, reason: not valid java name */
    public final SuffixText m462copymxwnekA(@NotNull String text, @NotNull String ttsText, long j10) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(ttsText, "ttsText");
        return new SuffixText(text, ttsText, j10, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuffixText)) {
            return false;
        }
        SuffixText suffixText = (SuffixText) obj;
        return Intrinsics.areEqual(this.text, suffixText.text) && Intrinsics.areEqual(this.ttsText, suffixText.ttsText) && androidx.compose.ui.graphics.q0.y(this.color, suffixText.color);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m463getColor0d7_KjU() {
        return this.color;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getTtsText() {
        return this.ttsText;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.ttsText.hashCode()) * 31) + androidx.compose.ui.graphics.q0.K(this.color);
    }

    @NotNull
    public String toString() {
        return "SuffixText(text=" + this.text + ", ttsText=" + this.ttsText + ", color=" + ((Object) androidx.compose.ui.graphics.q0.L(this.color)) + ')';
    }

    private SuffixText(String text, String ttsText, long j10) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(ttsText, "ttsText");
        this.text = text;
        this.ttsText = ttsText;
        this.color = j10;
    }
}
