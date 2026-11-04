package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.g5;
import androidx.compose.ui.graphics.q3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class FinRowStyle {
    public static final int $stable = 0;

    @NotNull
    private final BubbleStyle bubbleStyle;

    @NotNull
    private final q3 contentShape;

    @NotNull
    private final androidx.compose.ui.e.b rowAlignment;

    @NotNull
    private final g5 rowPadding;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class BubbleStyle {
        public static final int $stable = 0;

        @NotNull
        private final androidx.compose.foundation.a1 borderStroke;
        private final long color;

        @NotNull
        private final g5 padding;

        @NotNull
        private final q3 shape;

        public /* synthetic */ BubbleStyle(long j10, g5 g5Var, q3 q3Var, androidx.compose.foundation.a1 a1Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, g5Var, q3Var, a1Var);
        }

        /* JADX INFO: renamed from: copy-Iv8Zu3U$default, reason: not valid java name */
        public static /* synthetic */ BubbleStyle m312copyIv8Zu3U$default(BubbleStyle bubbleStyle, long j10, g5 g5Var, q3 q3Var, androidx.compose.foundation.a1 a1Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = bubbleStyle.color;
            }
            long j11 = j10;
            if ((i10 & 2) != 0) {
                g5Var = bubbleStyle.padding;
            }
            g5 g5Var2 = g5Var;
            if ((i10 & 4) != 0) {
                q3Var = bubbleStyle.shape;
            }
            q3 q3Var2 = q3Var;
            if ((i10 & 8) != 0) {
                a1Var = bubbleStyle.borderStroke;
            }
            return bubbleStyle.m314copyIv8Zu3U(j11, g5Var2, q3Var2, a1Var);
        }

        /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m313component10d7_KjU() {
            return this.color;
        }

        @NotNull
        public final g5 component2() {
            return this.padding;
        }

        @NotNull
        public final q3 component3() {
            return this.shape;
        }

        @NotNull
        public final androidx.compose.foundation.a1 component4() {
            return this.borderStroke;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-Iv8Zu3U, reason: not valid java name */
        public final BubbleStyle m314copyIv8Zu3U(long j10, @NotNull g5 padding, @NotNull q3 shape, @NotNull androidx.compose.foundation.a1 borderStroke) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(borderStroke, "borderStroke");
            return new BubbleStyle(j10, padding, shape, borderStroke, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BubbleStyle)) {
                return false;
            }
            BubbleStyle bubbleStyle = (BubbleStyle) obj;
            return androidx.compose.ui.graphics.q0.y(this.color, bubbleStyle.color) && Intrinsics.areEqual(this.padding, bubbleStyle.padding) && Intrinsics.areEqual(this.shape, bubbleStyle.shape) && Intrinsics.areEqual(this.borderStroke, bubbleStyle.borderStroke);
        }

        @NotNull
        public final androidx.compose.foundation.a1 getBorderStroke() {
            return this.borderStroke;
        }

        /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m315getColor0d7_KjU() {
            return this.color;
        }

        @NotNull
        public final g5 getPadding() {
            return this.padding;
        }

        @NotNull
        public final q3 getShape() {
            return this.shape;
        }

        public int hashCode() {
            return (((((androidx.compose.ui.graphics.q0.K(this.color) * 31) + this.padding.hashCode()) * 31) + this.shape.hashCode()) * 31) + this.borderStroke.hashCode();
        }

        @NotNull
        public String toString() {
            return "BubbleStyle(color=" + ((Object) androidx.compose.ui.graphics.q0.L(this.color)) + ", padding=" + this.padding + ", shape=" + this.shape + ", borderStroke=" + this.borderStroke + ')';
        }

        private BubbleStyle(long j10, g5 padding, q3 shape, androidx.compose.foundation.a1 borderStroke) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(borderStroke, "borderStroke");
            this.color = j10;
            this.padding = padding;
            this.shape = shape;
            this.borderStroke = borderStroke;
        }
    }

    public FinRowStyle(@NotNull BubbleStyle bubbleStyle, @NotNull androidx.compose.ui.e.b rowAlignment, @NotNull g5 rowPadding, @NotNull q3 contentShape) {
        Intrinsics.checkNotNullParameter(bubbleStyle, "bubbleStyle");
        Intrinsics.checkNotNullParameter(rowAlignment, "rowAlignment");
        Intrinsics.checkNotNullParameter(rowPadding, "rowPadding");
        Intrinsics.checkNotNullParameter(contentShape, "contentShape");
        this.bubbleStyle = bubbleStyle;
        this.rowAlignment = rowAlignment;
        this.rowPadding = rowPadding;
        this.contentShape = contentShape;
    }

    public static /* synthetic */ FinRowStyle copy$default(FinRowStyle finRowStyle, BubbleStyle bubbleStyle, androidx.compose.ui.e.b bVar, g5 g5Var, q3 q3Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bubbleStyle = finRowStyle.bubbleStyle;
        }
        if ((i10 & 2) != 0) {
            bVar = finRowStyle.rowAlignment;
        }
        if ((i10 & 4) != 0) {
            g5Var = finRowStyle.rowPadding;
        }
        if ((i10 & 8) != 0) {
            q3Var = finRowStyle.contentShape;
        }
        return finRowStyle.copy(bubbleStyle, bVar, g5Var, q3Var);
    }

    @NotNull
    public final BubbleStyle component1() {
        return this.bubbleStyle;
    }

    @NotNull
    public final androidx.compose.ui.e.b component2() {
        return this.rowAlignment;
    }

    @NotNull
    public final g5 component3() {
        return this.rowPadding;
    }

    @NotNull
    public final q3 component4() {
        return this.contentShape;
    }

    @NotNull
    public final FinRowStyle copy(@NotNull BubbleStyle bubbleStyle, @NotNull androidx.compose.ui.e.b rowAlignment, @NotNull g5 rowPadding, @NotNull q3 contentShape) {
        Intrinsics.checkNotNullParameter(bubbleStyle, "bubbleStyle");
        Intrinsics.checkNotNullParameter(rowAlignment, "rowAlignment");
        Intrinsics.checkNotNullParameter(rowPadding, "rowPadding");
        Intrinsics.checkNotNullParameter(contentShape, "contentShape");
        return new FinRowStyle(bubbleStyle, rowAlignment, rowPadding, contentShape);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinRowStyle)) {
            return false;
        }
        FinRowStyle finRowStyle = (FinRowStyle) obj;
        return Intrinsics.areEqual(this.bubbleStyle, finRowStyle.bubbleStyle) && Intrinsics.areEqual(this.rowAlignment, finRowStyle.rowAlignment) && Intrinsics.areEqual(this.rowPadding, finRowStyle.rowPadding) && Intrinsics.areEqual(this.contentShape, finRowStyle.contentShape);
    }

    @NotNull
    public final BubbleStyle getBubbleStyle() {
        return this.bubbleStyle;
    }

    @NotNull
    public final q3 getContentShape() {
        return this.contentShape;
    }

    @NotNull
    public final androidx.compose.ui.e.b getRowAlignment() {
        return this.rowAlignment;
    }

    @NotNull
    public final g5 getRowPadding() {
        return this.rowPadding;
    }

    public int hashCode() {
        return (((((this.bubbleStyle.hashCode() * 31) + this.rowAlignment.hashCode()) * 31) + this.rowPadding.hashCode()) * 31) + this.contentShape.hashCode();
    }

    @NotNull
    public String toString() {
        return "FinRowStyle(bubbleStyle=" + this.bubbleStyle + ", rowAlignment=" + this.rowAlignment + ", rowPadding=" + this.rowPadding + ", contentShape=" + this.contentShape + ')';
    }
}
