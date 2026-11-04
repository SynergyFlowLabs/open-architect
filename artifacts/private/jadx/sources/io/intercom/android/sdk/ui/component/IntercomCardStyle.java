package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.a1;
import androidx.compose.foundation.b1;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.q3;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nIntercomCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomCard.kt\nio/intercom/android/sdk/ui/component/IntercomCardStyle\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,128:1\n113#2:129\n113#2:130\n113#2:131\n113#2:132\n113#2:133\n*S KotlinDebug\n*F\n+ 1 IntercomCard.kt\nio/intercom/android/sdk/ui/component/IntercomCardStyle\n*L\n97#1:129\n98#1:130\n114#1:131\n117#1:132\n118#1:133\n*E\n"})
public final class IntercomCardStyle {
    public static final int $stable = 0;

    @NotNull
    public static final IntercomCardStyle INSTANCE = new IntercomCardStyle();

    @w0(parameters = 1)
    public static final class Style {
        public static final int $stable = 0;
        private final long backgroundColor;

        @NotNull
        private final a1 border;
        private final long contentColor;
        private final float elevation;

        @Nullable
        private final q0 shadowColor;

        @NotNull
        private final q3 shape;

        public /* synthetic */ Style(q3 q3Var, long j10, long j11, float f10, a1 a1Var, q0 q0Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(q3Var, j10, j11, f10, a1Var, q0Var);
        }

        /* JADX INFO: renamed from: copy-UBuVVS8$default, reason: not valid java name */
        public static /* synthetic */ Style m598copyUBuVVS8$default(Style style, q3 q3Var, long j10, long j11, float f10, a1 a1Var, q0 q0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                q3Var = style.shape;
            }
            if ((i10 & 2) != 0) {
                j10 = style.backgroundColor;
            }
            if ((i10 & 4) != 0) {
                j11 = style.contentColor;
            }
            if ((i10 & 8) != 0) {
                f10 = style.elevation;
            }
            if ((i10 & 16) != 0) {
                a1Var = style.border;
            }
            if ((i10 & 32) != 0) {
                q0Var = style.shadowColor;
            }
            q0 q0Var2 = q0Var;
            float f11 = f10;
            long j12 = j11;
            return style.m603copyUBuVVS8(q3Var, j10, j12, f11, a1Var, q0Var2);
        }

        @NotNull
        public final q3 component1() {
            return this.shape;
        }

        /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
        public final long m599component20d7_KjU() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
        public final long m600component30d7_KjU() {
            return this.contentColor;
        }

        /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name */
        public final float m601component4D9Ej5fM() {
            return this.elevation;
        }

        @NotNull
        public final a1 component5() {
            return this.border;
        }

        @Nullable
        /* JADX INFO: renamed from: component6-QN2ZGVo, reason: not valid java name */
        public final q0 m602component6QN2ZGVo() {
            return this.shadowColor;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-UBuVVS8, reason: not valid java name */
        public final Style m603copyUBuVVS8(@NotNull q3 shape, long j10, long j11, float f10, @NotNull a1 border, @Nullable q0 q0Var) {
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(border, "border");
            return new Style(shape, j10, j11, f10, border, q0Var, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            if (Intrinsics.areEqual(this.shape, style.shape) && q0.y(this.backgroundColor, style.backgroundColor) && q0.y(this.contentColor, style.contentColor) && androidx.compose.ui.unit.h.x(this.elevation, style.elevation) && Intrinsics.areEqual(this.border, style.border) && Intrinsics.areEqual(this.shadowColor, style.shadowColor)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m604getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        @NotNull
        public final a1 getBorder() {
            return this.border;
        }

        /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
        public final long m605getContentColor0d7_KjU() {
            return this.contentColor;
        }

        /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
        public final float m606getElevationD9Ej5fM() {
            return this.elevation;
        }

        @Nullable
        /* JADX INFO: renamed from: getShadowColor-QN2ZGVo, reason: not valid java name */
        public final q0 m607getShadowColorQN2ZGVo() {
            return this.shadowColor;
        }

        @NotNull
        public final q3 getShape() {
            return this.shape;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.shape.hashCode() * 31) + q0.K(this.backgroundColor)) * 31) + q0.K(this.contentColor)) * 31) + androidx.compose.ui.unit.h.D(this.elevation)) * 31) + this.border.hashCode()) * 31;
            q0 q0Var = this.shadowColor;
            return iHashCode + (q0Var == null ? 0 : q0.K(q0Var.M()));
        }

        @NotNull
        public String toString() {
            return "Style(shape=" + this.shape + ", backgroundColor=" + ((Object) q0.L(this.backgroundColor)) + ", contentColor=" + ((Object) q0.L(this.contentColor)) + ", elevation=" + ((Object) androidx.compose.ui.unit.h.M(this.elevation)) + ", border=" + this.border + ", shadowColor=" + this.shadowColor + ')';
        }

        private Style(q3 shape, long j10, long j11, float f10, a1 border, q0 q0Var) {
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(border, "border");
            this.shape = shape;
            this.backgroundColor = j10;
            this.contentColor = j11;
            this.elevation = f10;
            this.border = border;
            this.shadowColor = q0Var;
        }
    }

    private IntercomCardStyle() {
    }

    @androidx.compose.runtime.o
    @NotNull
    /* JADX INFO: renamed from: conversationCardStyle-PEIptTM, reason: not valid java name */
    public final Style m596conversationCardStylePEIptTM(@Nullable q3 q3Var, long j10, long j11, float f10, @Nullable a1 a1Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        c0Var.E(-1707188824);
        if ((i11 & 1) != 0) {
            q3Var = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(20));
        }
        q3 q3Var2 = q3Var;
        if ((i11 & 2) != 0) {
            j10 = IntercomTheme.INSTANCE.getColors(c0Var, 6).m690getBackground0d7_KjU();
        }
        Style style = new Style(q3Var2, j10, (i11 & 4) != 0 ? IntercomTheme.INSTANCE.getColors(c0Var, 6).m714getPrimaryText0d7_KjU() : j11, (i11 & 8) != 0 ? androidx.compose.ui.unit.h.r(0) : f10, (i11 & 16) != 0 ? b1.a(androidx.compose.ui.unit.h.r(1), IntercomTheme.INSTANCE.getColors(c0Var, 6).m692getBorder0d7_KjU()) : a1Var, null, null);
        c0Var.A();
        return style;
    }

    @androidx.compose.runtime.o
    @NotNull
    /* JADX INFO: renamed from: defaultStyle-qUnfpCA, reason: not valid java name */
    public final Style m597defaultStyleqUnfpCA(@Nullable q3 q3Var, long j10, long j11, float f10, @Nullable a1 a1Var, long j12, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        c0Var.E(-952876659);
        Style style = new Style((i11 & 1) != 0 ? IntercomTheme.INSTANCE.getShapes(c0Var, 6).l() : q3Var, (i11 & 2) != 0 ? IntercomTheme.INSTANCE.getColors(c0Var, 6).m690getBackground0d7_KjU() : j10, (i11 & 4) != 0 ? IntercomTheme.INSTANCE.getColors(c0Var, 6).m714getPrimaryText0d7_KjU() : j11, (i11 & 8) != 0 ? androidx.compose.ui.unit.h.r(6) : f10, (i11 & 16) != 0 ? b1.a(androidx.compose.ui.unit.h.r(1), q0.w(IntercomTheme.INSTANCE.getColors(c0Var, 6).m692getBorder0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)) : a1Var, q0.n((i11 & 32) != 0 ? IntercomTheme.INSTANCE.getColors(c0Var, 6).m718getShadow0d7_KjU() : j12), null);
        c0Var.A();
        return style;
    }
}
