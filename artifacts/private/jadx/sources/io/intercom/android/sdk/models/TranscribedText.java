package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class TranscribedText {
    public static final int $stable = 0;

    @c("text")
    @NotNull
    private final String text;

    public TranscribedText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
    }

    public static /* synthetic */ TranscribedText copy$default(TranscribedText transcribedText, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = transcribedText.text;
        }
        return transcribedText.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.text;
    }

    @NotNull
    public final TranscribedText copy(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TranscribedText(text);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TranscribedText) && Intrinsics.areEqual(this.text, ((TranscribedText) obj).text);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    @NotNull
    public String toString() {
        return "TranscribedText(text=" + this.text + ')';
    }
}
