package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.a1;
import androidx.compose.foundation.b1;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q0;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nIntercomButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomButton.kt\nio/intercom/android/sdk/ui/component/IntercomButton\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,128:1\n113#2:129\n113#2:130\n*S KotlinDebug\n*F\n+ 1 IntercomButton.kt\nio/intercom/android/sdk/ui/component/IntercomButton\n*L\n71#1:129\n82#1:130\n*E\n"})
public final class IntercomButton {
    public static final int $stable = 0;

    @NotNull
    public static final IntercomButton INSTANCE = new IntercomButton();

    @w0(parameters = 1)
    public static final class Style {
        public static final int $stable = 0;
        private final long backgroundColor;

        @NotNull
        private final a1 border;
        private final long contentColor;

        public /* synthetic */ Style(long j10, long j11, a1 a1Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, a1Var);
        }

        /* JADX INFO: renamed from: copy-jxsXWHM$default, reason: not valid java name */
        public static /* synthetic */ Style m590copyjxsXWHM$default(Style style, long j10, long j11, a1 a1Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = style.backgroundColor;
            }
            long j12 = j10;
            if ((i10 & 2) != 0) {
                j11 = style.contentColor;
            }
            long j13 = j11;
            if ((i10 & 4) != 0) {
                a1Var = style.border;
            }
            return style.m593copyjxsXWHM(j12, j13, a1Var);
        }

        /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m591component10d7_KjU() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
        public final long m592component20d7_KjU() {
            return this.contentColor;
        }

        @NotNull
        public final a1 component3() {
            return this.border;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-jxsXWHM, reason: not valid java name */
        public final Style m593copyjxsXWHM(long j10, long j11, @NotNull a1 border) {
            Intrinsics.checkNotNullParameter(border, "border");
            return new Style(j10, j11, border, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            if (q0.y(this.backgroundColor, style.backgroundColor) && q0.y(this.contentColor, style.contentColor) && Intrinsics.areEqual(this.border, style.border)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m594getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        @NotNull
        public final a1 getBorder() {
            return this.border;
        }

        /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
        public final long m595getContentColor0d7_KjU() {
            return this.contentColor;
        }

        public int hashCode() {
            return (((q0.K(this.backgroundColor) * 31) + q0.K(this.contentColor)) * 31) + this.border.hashCode();
        }

        @NotNull
        public String toString() {
            return "Style(backgroundColor=" + ((Object) q0.L(this.backgroundColor)) + ", contentColor=" + ((Object) q0.L(this.contentColor)) + ", border=" + this.border + ')';
        }

        private Style(long j10, long j11, a1 border) {
            Intrinsics.checkNotNullParameter(border, "border");
            this.backgroundColor = j10;
            this.contentColor = j11;
            this.border = border;
        }
    }

    private IntercomButton() {
    }

    @androidx.compose.runtime.o
    @NotNull
    /* JADX INFO: renamed from: outlinedStyle-Klgx-Pg, reason: not valid java name */
    public final Style m588outlinedStyleKlgxPg(long j10, long j11, @Nullable a1 a1Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        c0Var.E(-1228695891);
        if ((i11 & 1) != 0) {
            j10 = IntercomTheme.INSTANCE.getColors(c0Var, 6).m690getBackground0d7_KjU();
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            j11 = IntercomTheme.INSTANCE.getColors(c0Var, 6).m714getPrimaryText0d7_KjU();
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            a1Var = b1.a(androidx.compose.ui.unit.h.r(1), IntercomTheme.INSTANCE.getColors(c0Var, 6).m692getBorder0d7_KjU());
        }
        Style style = new Style(j12, j13, a1Var, null);
        c0Var.A();
        return style;
    }

    @androidx.compose.runtime.o
    @NotNull
    /* JADX INFO: renamed from: primaryStyle-Klgx-Pg, reason: not valid java name */
    public final Style m589primaryStyleKlgxPg(long j10, long j11, @Nullable a1 a1Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        c0Var.E(-155594647);
        if ((i11 & 1) != 0) {
            j10 = IntercomTheme.INSTANCE.getColors(c0Var, 6).m690getBackground0d7_KjU();
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            j11 = IntercomTheme.INSTANCE.getColors(c0Var, 6).m714getPrimaryText0d7_KjU();
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            a1Var = b1.a(androidx.compose.ui.unit.h.r(1), IntercomTheme.INSTANCE.getColors(c0Var, 6).m692getBorder0d7_KjU());
        }
        Style style = new Style(j12, j13, a1Var, null);
        c0Var.A();
        return style;
    }
}
