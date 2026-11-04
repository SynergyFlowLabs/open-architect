package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.c3;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSpecialNotice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialNotice.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/SpecialNoticeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,82:1\n113#2:83\n113#2:84\n113#2:85\n113#2:119\n113#2:120\n99#3,6:86\n106#3:125\n80#4,6:92\n87#4,3:107\n90#4,2:116\n94#4:124\n391#5,9:98\n400#5:118\n401#5,2:122\n4360#6,6:110\n75#7:121\n*S KotlinDebug\n*F\n+ 1 SpecialNotice.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/SpecialNoticeKt\n*L\n33#1:83\n40#1:84\n41#1:85\n46#1:119\n49#1:120\n34#1:86,6\n34#1:125\n34#1:92,6\n34#1:107,3\n34#1:116,2\n34#1:124\n34#1:98,9\n34#1:118\n34#1:122,2\n34#1:110,6\n53#1:121\n*E\n"})
public final class SpecialNoticeKt {
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x00de  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:42:0x010d  */
    /* JADX WARN: Code duplicated, block: B:44:0x011b  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SpecialNotice(@NotNull final String text, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        final androidx.compose.ui.a0 a0Var3;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0Var2;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(text, "text");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1272749637);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i12 & 91) == 18 || !c0VarR.d()) {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                androidx.compose.foundation.shape.n nVarH = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(20));
                androidx.compose.foundation.layout.q.e eVarW = androidx.compose.foundation.layout.q.f16330a.w();
                androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarW = aVar.w();
                androidx.compose.ui.a0 a0VarH = i6.h(a0Var3, 0.0f, 1, null);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i14 = IntercomTheme.$stable;
                float f10 = 16;
                androidx.compose.ui.a0 a0VarS = d5.s(androidx.compose.foundation.t0.i(androidx.compose.foundation.v.c(a0VarH, intercomTheme.getColors(c0VarR, i14).m720getSpecialNoticeBackground0d7_KjU(), nVarH), androidx.compose.ui.unit.h.r(1), intercomTheme.getColors(c0VarR, i14).m721getSpecialNoticeBorder0d7_KjU(), nVarH), androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(12));
                androidx.compose.ui.layout.a1 a1VarE = u5.e(eVarW, cVarW, c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarS);
                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                function0A = aVar2.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE, aVar2.e());
                y7.n(c0VarD, b1VarK, aVar2.g());
                function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar2.f());
                y5 y5Var = y5.f16577a;
                androidx.compose.ui.graphics.painter.b bVarC = u0.e.c(R.drawable.intercom_ic_info_filled, c0VarR, 0);
                androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                ni.o(bVarC, null, i6.w(aVar3, androidx.compose.ui.unit.h.r(f10)), intercomTheme.getColors(c0VarR, i14).m685getActionContrastWhite0d7_KjU(), c0VarR, 440, 0);
                l6.a(i6.B(aVar3, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                androidx.compose.ui.a0 a0VarN2 = y5Var.n(aVar3, aVar.q());
                Spanned spannedA = androidx.core.text.c.a(text, 0);
                Intrinsics.checkNotNullExpressionValue(spannedA, "fromHtml(...)");
                c0Var2 = c0VarR;
                q50.u(BlockExtensionsKt.toAnnotatedString(spannedA, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null), a0VarN2, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(c0VarR, i14).getType04Point5(), c0Var2, 0, 0, 262140);
                c0Var2.o();
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                c0Var2 = c0VarR;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.w1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SpecialNoticeKt.SpecialNotice$lambda$1(text, a0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i12 & 91) == 18) {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            androidx.compose.foundation.shape.n nVarH2 = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(20));
            androidx.compose.foundation.layout.q.e eVarW2 = androidx.compose.foundation.layout.q.f16330a.w();
            androidx.compose.ui.e.a aVar4 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.e.c cVarW2 = aVar4.w();
            androidx.compose.ui.a0 a0VarH2 = i6.h(a0Var3, 0.0f, 1, null);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            float f11 = 16;
            androidx.compose.ui.a0 a0VarS2 = d5.s(androidx.compose.foundation.t0.i(androidx.compose.foundation.v.c(a0VarH2, intercomTheme2.getColors(c0VarR, i15).m720getSpecialNoticeBackground0d7_KjU(), nVarH2), androidx.compose.ui.unit.h.r(1), intercomTheme2.getColors(c0VarR, i15).m721getSpecialNoticeBorder0d7_KjU(), nVarH2), androidx.compose.ui.unit.h.r(f11), androidx.compose.ui.unit.h.r(12));
            androidx.compose.ui.layout.a1 a1VarE2 = u5.e(eVarW2, cVarW2, c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarS2);
            androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
            function0A = aVar5.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE2, aVar5.e());
            y7.n(c0VarD, b1VarK2, aVar5.g());
            function2B = aVar5.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN3, aVar5.f());
            y5 y5Var2 = y5.f16577a;
            androidx.compose.ui.graphics.painter.b bVarC2 = u0.e.c(R.drawable.intercom_ic_info_filled, c0VarR, 0);
            androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
            ni.o(bVarC2, null, i6.w(aVar6, androidx.compose.ui.unit.h.r(f11)), intercomTheme2.getColors(c0VarR, i15).m685getActionContrastWhite0d7_KjU(), c0VarR, 440, 0);
            l6.a(i6.B(aVar6, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            androidx.compose.ui.a0 a0VarN4 = y5Var2.n(aVar6, aVar4.q());
            Spanned spannedA2 = androidx.core.text.c.a(text, 0);
            Intrinsics.checkNotNullExpressionValue(spannedA2, "fromHtml(...)");
            c0Var2 = c0VarR;
            q50.u(BlockExtensionsKt.toAnnotatedString(spannedA2, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null), a0VarN4, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme2.getTypography(c0VarR, i15).getType04Point5(), c0Var2, 0, 0, 262140);
            c0Var2.o();
        } else {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            androidx.compose.foundation.shape.n nVarH3 = androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(20));
            androidx.compose.foundation.layout.q.e eVarW3 = androidx.compose.foundation.layout.q.f16330a.w();
            androidx.compose.ui.e.a aVar7 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.e.c cVarW3 = aVar7.w();
            androidx.compose.ui.a0 a0VarH3 = i6.h(a0Var3, 0.0f, 1, null);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            float f12 = 16;
            androidx.compose.ui.a0 a0VarS3 = d5.s(androidx.compose.foundation.t0.i(androidx.compose.foundation.v.c(a0VarH3, intercomTheme3.getColors(c0VarR, i16).m720getSpecialNoticeBackground0d7_KjU(), nVarH3), androidx.compose.ui.unit.h.r(1), intercomTheme3.getColors(c0VarR, i16).m721getSpecialNoticeBorder0d7_KjU(), nVarH3), androidx.compose.ui.unit.h.r(f12), androidx.compose.ui.unit.h.r(12));
            androidx.compose.ui.layout.a1 a1VarE3 = u5.e(eVarW3, cVarW3, c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarS3);
            androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
            function0A = aVar8.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE3, aVar8.e());
            y7.n(c0VarD, b1VarK3, aVar8.g());
            function2B = aVar8.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN5, aVar8.f());
            y5 y5Var3 = y5.f16577a;
            androidx.compose.ui.graphics.painter.b bVarC3 = u0.e.c(R.drawable.intercom_ic_info_filled, c0VarR, 0);
            androidx.compose.ui.a0.a aVar9 = androidx.compose.ui.a0.E;
            ni.o(bVarC3, null, i6.w(aVar9, androidx.compose.ui.unit.h.r(f12)), intercomTheme3.getColors(c0VarR, i16).m685getActionContrastWhite0d7_KjU(), c0VarR, 440, 0);
            l6.a(i6.B(aVar9, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            androidx.compose.ui.a0 a0VarN6 = y5Var3.n(aVar9, aVar7.q());
            Spanned spannedA3 = androidx.core.text.c.a(text, 0);
            Intrinsics.checkNotNullExpressionValue(spannedA3, "fromHtml(...)");
            c0Var2 = c0VarR;
            q50.u(BlockExtensionsKt.toAnnotatedString(spannedA3, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null), a0VarN6, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme3.getTypography(c0VarR, i16).getType04Point5(), c0Var2, 0, 0, 262140);
            c0Var2.o();
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.w1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SpecialNoticeKt.SpecialNotice$lambda$1(text, a0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpecialNotice$lambda$1(String text, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(text, "$text");
        SpecialNotice(text, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SpecialNoticePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1291680485);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SpecialNoticeKt.INSTANCE.m301getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.u1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SpecialNoticeKt.SpecialNoticePreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpecialNoticePreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SpecialNoticePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SpecialNoticeShortTextPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(841465410);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SpecialNoticeKt.INSTANCE.m303getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.v1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SpecialNoticeKt.SpecialNoticeShortTextPreview$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpecialNoticeShortTextPreview$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SpecialNoticeShortTextPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
