package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.g5;
import androidx.compose.ui.graphics.q3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBubbleMessageRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BubbleMessageRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,582:1\n113#2:583\n*S KotlinDebug\n*F\n+ 1 BubbleMessageRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle\n*L\n247#1:583\n*E\n"})
final class MessageStyle {

    @NotNull
    private final BubbleStyle bubbleStyle;

    @NotNull
    private final q3 defaultContentShape;

    @NotNull
    private final androidx.compose.ui.e.b rowAlignment;

    @NotNull
    private final g5 rowPadding;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class BubbleStyle {
        public static final int $stable = 0;

        @Nullable
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
        public static /* synthetic */ BubbleStyle m316copyIv8Zu3U$default(BubbleStyle bubbleStyle, long j10, g5 g5Var, q3 q3Var, androidx.compose.foundation.a1 a1Var, int i10, Object obj) {
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
            return bubbleStyle.m318copyIv8Zu3U(j11, g5Var2, q3Var2, a1Var);
        }

        /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m317component10d7_KjU() {
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

        @Nullable
        public final androidx.compose.foundation.a1 component4() {
            return this.borderStroke;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-Iv8Zu3U, reason: not valid java name */
        public final BubbleStyle m318copyIv8Zu3U(long j10, @NotNull g5 padding, @NotNull q3 shape, @Nullable androidx.compose.foundation.a1 a1Var) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            Intrinsics.checkNotNullParameter(shape, "shape");
            return new BubbleStyle(j10, padding, shape, a1Var, null);
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

        @Nullable
        public final androidx.compose.foundation.a1 getBorderStroke() {
            return this.borderStroke;
        }

        /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m319getColor0d7_KjU() {
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
            int iK = ((((androidx.compose.ui.graphics.q0.K(this.color) * 31) + this.padding.hashCode()) * 31) + this.shape.hashCode()) * 31;
            androidx.compose.foundation.a1 a1Var = this.borderStroke;
            return iK + (a1Var == null ? 0 : a1Var.hashCode());
        }

        @NotNull
        public String toString() {
            return "BubbleStyle(color=" + ((Object) androidx.compose.ui.graphics.q0.L(this.color)) + ", padding=" + this.padding + ", shape=" + this.shape + ", borderStroke=" + this.borderStroke + ')';
        }

        private BubbleStyle(long j10, g5 padding, q3 shape, androidx.compose.foundation.a1 a1Var) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            Intrinsics.checkNotNullParameter(shape, "shape");
            this.color = j10;
            this.padding = padding;
            this.shape = shape;
            this.borderStroke = a1Var;
        }
    }

    public MessageStyle(@NotNull BubbleStyle bubbleStyle, @NotNull androidx.compose.ui.e.b rowAlignment, @NotNull g5 rowPadding, @NotNull q3 defaultContentShape) {
        Intrinsics.checkNotNullParameter(bubbleStyle, "bubbleStyle");
        Intrinsics.checkNotNullParameter(rowAlignment, "rowAlignment");
        Intrinsics.checkNotNullParameter(rowPadding, "rowPadding");
        Intrinsics.checkNotNullParameter(defaultContentShape, "defaultContentShape");
        this.bubbleStyle = bubbleStyle;
        this.rowAlignment = rowAlignment;
        this.rowPadding = rowPadding;
        this.defaultContentShape = defaultContentShape;
    }

    private final q3 component4() {
        return this.defaultContentShape;
    }

    public static /* synthetic */ MessageStyle copy$default(MessageStyle messageStyle, BubbleStyle bubbleStyle, androidx.compose.ui.e.b bVar, g5 g5Var, q3 q3Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bubbleStyle = messageStyle.bubbleStyle;
        }
        if ((i10 & 2) != 0) {
            bVar = messageStyle.rowAlignment;
        }
        if ((i10 & 4) != 0) {
            g5Var = messageStyle.rowPadding;
        }
        if ((i10 & 8) != 0) {
            q3Var = messageStyle.defaultContentShape;
        }
        return messageStyle.copy(bubbleStyle, bVar, g5Var, q3Var);
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
    public final MessageStyle copy(@NotNull BubbleStyle bubbleStyle, @NotNull androidx.compose.ui.e.b rowAlignment, @NotNull g5 rowPadding, @NotNull q3 defaultContentShape) {
        Intrinsics.checkNotNullParameter(bubbleStyle, "bubbleStyle");
        Intrinsics.checkNotNullParameter(rowAlignment, "rowAlignment");
        Intrinsics.checkNotNullParameter(rowPadding, "rowPadding");
        Intrinsics.checkNotNullParameter(defaultContentShape, "defaultContentShape");
        return new MessageStyle(bubbleStyle, rowAlignment, rowPadding, defaultContentShape);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageStyle)) {
            return false;
        }
        MessageStyle messageStyle = (MessageStyle) obj;
        return Intrinsics.areEqual(this.bubbleStyle, messageStyle.bubbleStyle) && Intrinsics.areEqual(this.rowAlignment, messageStyle.rowAlignment) && Intrinsics.areEqual(this.rowPadding, messageStyle.rowPadding) && Intrinsics.areEqual(this.defaultContentShape, messageStyle.defaultContentShape);
    }

    @NotNull
    public final BubbleStyle getBubbleStyle() {
        return this.bubbleStyle;
    }

    @NotNull
    public final q3 getContentShape() {
        return androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(8));
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
        return (((((this.bubbleStyle.hashCode() * 31) + this.rowAlignment.hashCode()) * 31) + this.rowPadding.hashCode()) * 31) + this.defaultContentShape.hashCode();
    }

    @NotNull
    public String toString() {
        return "MessageStyle(bubbleStyle=" + this.bubbleStyle + ", rowAlignment=" + this.rowAlignment + ", rowPadding=" + this.rowPadding + ", defaultContentShape=" + this.defaultContentShape + ')';
    }
}
