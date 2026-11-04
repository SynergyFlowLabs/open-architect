package io.intercom.android.sdk.survey.model;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class SurveySenderAvatar {
    public static final int $stable = 0;

    @c("square_128")
    @NotNull
    private final String squareImg128;

    /* JADX WARN: Multi-variable type inference failed */
    public SurveySenderAvatar() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SurveySenderAvatar copy$default(SurveySenderAvatar surveySenderAvatar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = surveySenderAvatar.squareImg128;
        }
        return surveySenderAvatar.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.squareImg128;
    }

    @NotNull
    public final SurveySenderAvatar copy(@NotNull String squareImg128) {
        Intrinsics.checkNotNullParameter(squareImg128, "squareImg128");
        return new SurveySenderAvatar(squareImg128);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SurveySenderAvatar) && Intrinsics.areEqual(this.squareImg128, ((SurveySenderAvatar) obj).squareImg128);
    }

    @NotNull
    public final String getSquareImg128() {
        return this.squareImg128;
    }

    public int hashCode() {
        return this.squareImg128.hashCode();
    }

    @NotNull
    public String toString() {
        return "SurveySenderAvatar(squareImg128=" + this.squareImg128 + ')';
    }

    public SurveySenderAvatar(@NotNull String squareImg128) {
        Intrinsics.checkNotNullParameter(squareImg128, "squareImg128");
        this.squareImg128 = squareImg128;
    }

    public /* synthetic */ SurveySenderAvatar(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
