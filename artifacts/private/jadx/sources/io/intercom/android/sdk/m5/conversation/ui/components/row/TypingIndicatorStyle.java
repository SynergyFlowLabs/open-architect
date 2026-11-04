package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.ui.graphics.q3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
final class TypingIndicatorStyle {

    @Nullable
    private final androidx.compose.foundation.a1 borderStroke;
    private final long color;

    @NotNull
    private final q3 shape;

    public /* synthetic */ TypingIndicatorStyle(q3 q3Var, androidx.compose.foundation.a1 a1Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q3Var, a1Var, j10);
    }

    /* JADX INFO: renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ TypingIndicatorStyle m322copymxwnekA$default(TypingIndicatorStyle typingIndicatorStyle, q3 q3Var, androidx.compose.foundation.a1 a1Var, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = typingIndicatorStyle.shape;
        }
        if ((i10 & 2) != 0) {
            a1Var = typingIndicatorStyle.borderStroke;
        }
        if ((i10 & 4) != 0) {
            j10 = typingIndicatorStyle.color;
        }
        return typingIndicatorStyle.m324copymxwnekA(q3Var, a1Var, j10);
    }

    @NotNull
    public final q3 component1() {
        return this.shape;
    }

    @Nullable
    public final androidx.compose.foundation.a1 component2() {
        return this.borderStroke;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m323component30d7_KjU() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-mxwnekA, reason: not valid java name */
    public final TypingIndicatorStyle m324copymxwnekA(@NotNull q3 shape, @Nullable androidx.compose.foundation.a1 a1Var, long j10) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        return new TypingIndicatorStyle(shape, a1Var, j10, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypingIndicatorStyle)) {
            return false;
        }
        TypingIndicatorStyle typingIndicatorStyle = (TypingIndicatorStyle) obj;
        return Intrinsics.areEqual(this.shape, typingIndicatorStyle.shape) && Intrinsics.areEqual(this.borderStroke, typingIndicatorStyle.borderStroke) && androidx.compose.ui.graphics.q0.y(this.color, typingIndicatorStyle.color);
    }

    @Nullable
    public final androidx.compose.foundation.a1 getBorderStroke() {
        return this.borderStroke;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m325getColor0d7_KjU() {
        return this.color;
    }

    @NotNull
    public final q3 getShape() {
        return this.shape;
    }

    public int hashCode() {
        int iHashCode = this.shape.hashCode() * 31;
        androidx.compose.foundation.a1 a1Var = this.borderStroke;
        return ((iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31) + androidx.compose.ui.graphics.q0.K(this.color);
    }

    @NotNull
    public String toString() {
        return "TypingIndicatorStyle(shape=" + this.shape + ", borderStroke=" + this.borderStroke + ", color=" + ((Object) androidx.compose.ui.graphics.q0.L(this.color)) + ')';
    }

    private TypingIndicatorStyle(q3 shape, androidx.compose.foundation.a1 a1Var, long j10) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.shape = shape;
        this.borderStroke = a1Var;
        this.color = j10;
    }
}
