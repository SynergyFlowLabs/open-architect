package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class PrivacyNotice {
    public static final int $stable = 0;

    @c("is_dismissed")
    private final boolean isDismissed;

    @c("paragraph")
    @NotNull
    private final String text;

    public PrivacyNotice(boolean z10, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.isDismissed = z10;
        this.text = text;
    }

    public static /* synthetic */ PrivacyNotice copy$default(PrivacyNotice privacyNotice, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = privacyNotice.isDismissed;
        }
        if ((i10 & 2) != 0) {
            str = privacyNotice.text;
        }
        return privacyNotice.copy(z10, str);
    }

    public final boolean component1() {
        return this.isDismissed;
    }

    @NotNull
    public final String component2() {
        return this.text;
    }

    @NotNull
    public final PrivacyNotice copy(boolean z10, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new PrivacyNotice(z10, text);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyNotice)) {
            return false;
        }
        PrivacyNotice privacyNotice = (PrivacyNotice) obj;
        return this.isDismissed == privacyNotice.isDismissed && Intrinsics.areEqual(this.text, privacyNotice.text);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isDismissed) * 31) + this.text.hashCode();
    }

    public final boolean isDismissed() {
        return this.isDismissed;
    }

    @NotNull
    public String toString() {
        return "PrivacyNotice(isDismissed=" + this.isDismissed + ", text=" + this.text + ')';
    }
}
