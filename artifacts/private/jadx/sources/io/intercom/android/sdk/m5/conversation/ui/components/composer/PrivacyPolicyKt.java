package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.q4;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.c3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
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
@SourceDebugExtension({"SMAP\nPrivacyPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyPolicy.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/PrivacyPolicyKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,80:1\n113#2:81\n113#2:82\n113#2:120\n113#2:121\n99#3:83\n97#3,8:84\n106#3:125\n80#4,6:92\n87#4,3:107\n90#4,2:116\n94#4:124\n391#5,9:98\n400#5:118\n401#5,2:122\n4360#6,6:110\n75#7:119\n*S KotlinDebug\n*F\n+ 1 PrivacyPolicy.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/PrivacyPolicyKt\n*L\n43#1:81\n44#1:82\n56#1:120\n59#1:121\n38#1:83\n38#1:84,8\n38#1:125\n38#1:92,6\n38#1:107,3\n38#1:116,2\n38#1:124\n38#1:98,9\n38#1:118\n38#1:122,2\n38#1:110,6\n47#1:119\n*E\n"})
public final class PrivacyPolicyKt {
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:56:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x0133  */
    /* JADX WARN: Code duplicated, block: B:62:0x024b  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void PrivacyPolicy(@NotNull final String text, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Function0<Unit> function0, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        Function0<Unit> function1;
        int i14;
        androidx.compose.ui.a0 a0Var3;
        Function0<Unit> function2;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        final androidx.compose.ui.a0 a0Var4;
        final Function0<Unit> function3;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(text, "text");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2047732965);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    function1 = function0;
                    if (c0VarR.k0(function1)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i12 & 731) == 146 || !c0VarR.d()) {
                    if (i15 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.i2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i16 = IntercomTheme.$stable;
                    androidx.compose.foundation.shape.e eVarM = intercomTheme.getShapes(c0VarR, i16).m();
                    androidx.compose.foundation.layout.q.f fVarS = androidx.compose.foundation.layout.q.f16330a.s();
                    Function0<Unit> function4 = function2;
                    androidx.compose.ui.a0 a0VarK = i6.k(d5.s(androidx.compose.foundation.v.c(i6.h(a0Var3, 0.0f, 1, null), intercomTheme.getColors(c0VarR, i16).m693getBubbleBackground0d7_KjU(), eVarM), androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12)), 0.0f, androidx.compose.ui.unit.h.r(70), 1, null);
                    androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.layout.a1 a1VarE = u5.e(fVarS, aVar.w(), c0VarR, 6);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarK);
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
                    Spanned spannedA = androidx.core.text.c.a(text, 0);
                    Intrinsics.checkNotNullExpressionValue(spannedA, "fromHtml(...)");
                    androidx.compose.ui.text.f annotatedString = BlockExtensionsKt.toAnnotatedString(spannedA, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                    androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                    q50.u(annotatedString, q4.m(x5.q(y5Var, aVar3, 1.0f, false, 2, null), q4.f(0, c0VarR, 0, 1), false, null, false, 14, null), intercomTheme.getColors(c0VarR, i16).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(c0VarR, i16).getType05(), c0VarR, 0, 0, 262136);
                    c0VarR = c0VarR;
                    l6.a(i6.B(aVar3, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    ni.o(u0.e.c(R.drawable.intercom_close, c0VarR, 0), u0.i.d(R.string.intercom_close, c0VarR, 0), androidx.compose.foundation.i1.j(y5Var.n(i6.w(aVar3, androidx.compose.ui.unit.h.r(10)), aVar.q()), false, null, null, null, function4, 15, null), intercomTheme.getColors(c0VarR, i16).m699getDescriptionText0d7_KjU(), c0VarR, 8, 0);
                    c0VarR.o();
                    a0Var4 = a0Var3;
                    function3 = function4;
                } else {
                    c0VarR.u();
                    a0Var4 = a0Var2;
                    function3 = function1;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PrivacyPolicyKt.PrivacyPolicy$lambda$2(text, a0Var4, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            function1 = function0;
            if ((i12 & 731) == 146) {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.i2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function2 = function1;
                }
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i17 = IntercomTheme.$stable;
                androidx.compose.foundation.shape.e eVarM2 = intercomTheme2.getShapes(c0VarR, i17).m();
                androidx.compose.foundation.layout.q.f fVarS2 = androidx.compose.foundation.layout.q.f16330a.s();
                Function0<Unit> function5 = function2;
                androidx.compose.ui.a0 a0VarK2 = i6.k(d5.s(androidx.compose.foundation.v.c(i6.h(a0Var3, 0.0f, 1, null), intercomTheme2.getColors(c0VarR, i17).m693getBubbleBackground0d7_KjU(), eVarM2), androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12)), 0.0f, androidx.compose.ui.unit.h.r(70), 1, null);
                androidx.compose.ui.e.a aVar4 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarE2 = u5.e(fVarS2, aVar4.w(), c0VarR, 6);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarK2);
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
                y7.n(c0VarD, a0VarN2, aVar5.f());
                y5 y5Var2 = y5.f16577a;
                Spanned spannedA2 = androidx.core.text.c.a(text, 0);
                Intrinsics.checkNotNullExpressionValue(spannedA2, "fromHtml(...)");
                androidx.compose.ui.text.f annotatedString2 = BlockExtensionsKt.toAnnotatedString(spannedA2, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
                q50.u(annotatedString2, q4.m(x5.q(y5Var2, aVar6, 1.0f, false, 2, null), q4.f(0, c0VarR, 0, 1), false, null, false, 14, null), intercomTheme2.getColors(c0VarR, i17).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme2.getTypography(c0VarR, i17).getType05(), c0VarR, 0, 0, 262136);
                c0VarR = c0VarR;
                l6.a(i6.B(aVar6, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                ni.o(u0.e.c(R.drawable.intercom_close, c0VarR, 0), u0.i.d(R.string.intercom_close, c0VarR, 0), androidx.compose.foundation.i1.j(y5Var2.n(i6.w(aVar6, androidx.compose.ui.unit.h.r(10)), aVar4.q()), false, null, null, null, function5, 15, null), intercomTheme2.getColors(c0VarR, i17).m699getDescriptionText0d7_KjU(), c0VarR, 8, 0);
                c0VarR.o();
                a0Var4 = a0Var3;
                function3 = function5;
            } else {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.i2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function2 = function1;
                }
                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                int i18 = IntercomTheme.$stable;
                androidx.compose.foundation.shape.e eVarM3 = intercomTheme3.getShapes(c0VarR, i18).m();
                androidx.compose.foundation.layout.q.f fVarS3 = androidx.compose.foundation.layout.q.f16330a.s();
                Function0<Unit> function6 = function2;
                androidx.compose.ui.a0 a0VarK3 = i6.k(d5.s(androidx.compose.foundation.v.c(i6.h(a0Var3, 0.0f, 1, null), intercomTheme3.getColors(c0VarR, i18).m693getBubbleBackground0d7_KjU(), eVarM3), androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12)), 0.0f, androidx.compose.ui.unit.h.r(70), 1, null);
                androidx.compose.ui.e.a aVar7 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarE3 = u5.e(fVarS3, aVar7.w(), c0VarR, 6);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarK3);
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
                y7.n(c0VarD, a0VarN3, aVar8.f());
                y5 y5Var3 = y5.f16577a;
                Spanned spannedA3 = androidx.core.text.c.a(text, 0);
                Intrinsics.checkNotNullExpressionValue(spannedA3, "fromHtml(...)");
                androidx.compose.ui.text.f annotatedString3 = BlockExtensionsKt.toAnnotatedString(spannedA3, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                androidx.compose.ui.a0.a aVar9 = androidx.compose.ui.a0.E;
                q50.u(annotatedString3, q4.m(x5.q(y5Var3, aVar9, 1.0f, false, 2, null), q4.f(0, c0VarR, 0, 1), false, null, false, 14, null), intercomTheme3.getColors(c0VarR, i18).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme3.getTypography(c0VarR, i18).getType05(), c0VarR, 0, 0, 262136);
                c0VarR = c0VarR;
                l6.a(i6.B(aVar9, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                ni.o(u0.e.c(R.drawable.intercom_close, c0VarR, 0), u0.i.d(R.string.intercom_close, c0VarR, 0), androidx.compose.foundation.i1.j(y5Var3.n(i6.w(aVar9, androidx.compose.ui.unit.h.r(10)), aVar7.q()), false, null, null, null, function6, 15, null), intercomTheme3.getColors(c0VarR, i18).m699getDescriptionText0d7_KjU(), c0VarR, 8, 0);
                c0VarR.o();
                a0Var4 = a0Var3;
                function3 = function6;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PrivacyPolicyKt.PrivacyPolicy$lambda$2(text, a0Var4, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                function1 = function0;
                if (c0VarR.k0(function1)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & 731) == 146) {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.i2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function2 = function1;
                }
                IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                int i19 = IntercomTheme.$stable;
                androidx.compose.foundation.shape.e eVarM4 = intercomTheme4.getShapes(c0VarR, i19).m();
                androidx.compose.foundation.layout.q.f fVarS4 = androidx.compose.foundation.layout.q.f16330a.s();
                Function0<Unit> function7 = function2;
                androidx.compose.ui.a0 a0VarK4 = i6.k(d5.s(androidx.compose.foundation.v.c(i6.h(a0Var3, 0.0f, 1, null), intercomTheme4.getColors(c0VarR, i19).m693getBubbleBackground0d7_KjU(), eVarM4), androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12)), 0.0f, androidx.compose.ui.unit.h.r(70), 1, null);
                androidx.compose.ui.e.a aVar10 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarE4 = u5.e(fVarS4, aVar10.w(), c0VarR, 6);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarK4);
                androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                function0A = aVar11.a();
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
                y7.n(c0VarD, a1VarE4, aVar11.e());
                y7.n(c0VarD, b1VarK4, aVar11.g());
                function2B = aVar11.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN4, aVar11.f());
                y5 y5Var4 = y5.f16577a;
                Spanned spannedA4 = androidx.core.text.c.a(text, 0);
                Intrinsics.checkNotNullExpressionValue(spannedA4, "fromHtml(...)");
                androidx.compose.ui.text.f annotatedString4 = BlockExtensionsKt.toAnnotatedString(spannedA4, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                androidx.compose.ui.a0.a aVar12 = androidx.compose.ui.a0.E;
                q50.u(annotatedString4, q4.m(x5.q(y5Var4, aVar12, 1.0f, false, 2, null), q4.f(0, c0VarR, 0, 1), false, null, false, 14, null), intercomTheme4.getColors(c0VarR, i19).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme4.getTypography(c0VarR, i19).getType05(), c0VarR, 0, 0, 262136);
                c0VarR = c0VarR;
                l6.a(i6.B(aVar12, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                ni.o(u0.e.c(R.drawable.intercom_close, c0VarR, 0), u0.i.d(R.string.intercom_close, c0VarR, 0), androidx.compose.foundation.i1.j(y5Var4.n(i6.w(aVar12, androidx.compose.ui.unit.h.r(10)), aVar10.q()), false, null, null, null, function7, 15, null), intercomTheme4.getColors(c0VarR, i19).m699getDescriptionText0d7_KjU(), c0VarR, 8, 0);
                c0VarR.o();
                a0Var4 = a0Var3;
                function3 = function7;
            } else {
                if (i15 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.i2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function2 = function1;
                }
                IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                int i110 = IntercomTheme.$stable;
                androidx.compose.foundation.shape.e eVarM5 = intercomTheme5.getShapes(c0VarR, i110).m();
                androidx.compose.foundation.layout.q.f fVarS5 = androidx.compose.foundation.layout.q.f16330a.s();
                Function0<Unit> function8 = function2;
                androidx.compose.ui.a0 a0VarK5 = i6.k(d5.s(androidx.compose.foundation.v.c(i6.h(a0Var3, 0.0f, 1, null), intercomTheme5.getColors(c0VarR, i110).m693getBubbleBackground0d7_KjU(), eVarM5), androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12)), 0.0f, androidx.compose.ui.unit.h.r(70), 1, null);
                androidx.compose.ui.e.a aVar13 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarE5 = u5.e(fVarS5, aVar13.w(), c0VarR, 6);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarK5);
                androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                function0A = aVar14.a();
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
                y7.n(c0VarD, a1VarE5, aVar14.e());
                y7.n(c0VarD, b1VarK5, aVar14.g());
                function2B = aVar14.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN5, aVar14.f());
                y5 y5Var5 = y5.f16577a;
                Spanned spannedA5 = androidx.core.text.c.a(text, 0);
                Intrinsics.checkNotNullExpressionValue(spannedA5, "fromHtml(...)");
                androidx.compose.ui.text.f annotatedString5 = BlockExtensionsKt.toAnnotatedString(spannedA5, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
                androidx.compose.ui.a0.a aVar15 = androidx.compose.ui.a0.E;
                q50.u(annotatedString5, q4.m(x5.q(y5Var5, aVar15, 1.0f, false, 2, null), q4.f(0, c0VarR, 0, 1), false, null, false, 14, null), intercomTheme5.getColors(c0VarR, i110).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme5.getTypography(c0VarR, i110).getType05(), c0VarR, 0, 0, 262136);
                c0VarR = c0VarR;
                l6.a(i6.B(aVar15, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                ni.o(u0.e.c(R.drawable.intercom_close, c0VarR, 0), u0.i.d(R.string.intercom_close, c0VarR, 0), androidx.compose.foundation.i1.j(y5Var5.n(i6.w(aVar15, androidx.compose.ui.unit.h.r(10)), aVar13.q()), false, null, null, null, function8, 15, null), intercomTheme5.getColors(c0VarR, i110).m699getDescriptionText0d7_KjU(), c0VarR, 8, 0);
                c0VarR.o();
                a0Var4 = a0Var3;
                function3 = function8;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PrivacyPolicyKt.PrivacyPolicy$lambda$2(text, a0Var4, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        function1 = function0;
        if ((i12 & 731) == 146) {
            if (i15 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.i2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function2 = function1;
            }
            IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
            int i111 = IntercomTheme.$stable;
            androidx.compose.foundation.shape.e eVarM6 = intercomTheme6.getShapes(c0VarR, i111).m();
            androidx.compose.foundation.layout.q.f fVarS6 = androidx.compose.foundation.layout.q.f16330a.s();
            Function0<Unit> function9 = function2;
            androidx.compose.ui.a0 a0VarK6 = i6.k(d5.s(androidx.compose.foundation.v.c(i6.h(a0Var3, 0.0f, 1, null), intercomTheme6.getColors(c0VarR, i111).m693getBubbleBackground0d7_KjU(), eVarM6), androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12)), 0.0f, androidx.compose.ui.unit.h.r(70), 1, null);
            androidx.compose.ui.e.a aVar16 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarE6 = u5.e(fVarS6, aVar16.w(), c0VarR, 6);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarK6);
            androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
            function0A = aVar17.a();
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
            y7.n(c0VarD, a1VarE6, aVar17.e());
            y7.n(c0VarD, b1VarK6, aVar17.g());
            function2B = aVar17.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN6, aVar17.f());
            y5 y5Var6 = y5.f16577a;
            Spanned spannedA6 = androidx.core.text.c.a(text, 0);
            Intrinsics.checkNotNullExpressionValue(spannedA6, "fromHtml(...)");
            androidx.compose.ui.text.f annotatedString6 = BlockExtensionsKt.toAnnotatedString(spannedA6, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
            androidx.compose.ui.a0.a aVar18 = androidx.compose.ui.a0.E;
            q50.u(annotatedString6, q4.m(x5.q(y5Var6, aVar18, 1.0f, false, 2, null), q4.f(0, c0VarR, 0, 1), false, null, false, 14, null), intercomTheme6.getColors(c0VarR, i111).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme6.getTypography(c0VarR, i111).getType05(), c0VarR, 0, 0, 262136);
            c0VarR = c0VarR;
            l6.a(i6.B(aVar18, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            ni.o(u0.e.c(R.drawable.intercom_close, c0VarR, 0), u0.i.d(R.string.intercom_close, c0VarR, 0), androidx.compose.foundation.i1.j(y5Var6.n(i6.w(aVar18, androidx.compose.ui.unit.h.r(10)), aVar16.q()), false, null, null, null, function9, 15, null), intercomTheme6.getColors(c0VarR, i111).m699getDescriptionText0d7_KjU(), c0VarR, 8, 0);
            c0VarR.o();
            a0Var4 = a0Var3;
            function3 = function9;
        } else {
            if (i15 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.i2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function2 = function1;
            }
            IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
            int i112 = IntercomTheme.$stable;
            androidx.compose.foundation.shape.e eVarM7 = intercomTheme7.getShapes(c0VarR, i112).m();
            androidx.compose.foundation.layout.q.f fVarS7 = androidx.compose.foundation.layout.q.f16330a.s();
            Function0<Unit> function10 = function2;
            androidx.compose.ui.a0 a0VarK7 = i6.k(d5.s(androidx.compose.foundation.v.c(i6.h(a0Var3, 0.0f, 1, null), intercomTheme7.getColors(c0VarR, i112).m693getBubbleBackground0d7_KjU(), eVarM7), androidx.compose.ui.unit.h.r(16), androidx.compose.ui.unit.h.r(12)), 0.0f, androidx.compose.ui.unit.h.r(70), 1, null);
            androidx.compose.ui.e.a aVar19 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarE7 = u5.e(fVarS7, aVar19.w(), c0VarR, 6);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarK7);
            androidx.compose.ui.node.g.a aVar110 = androidx.compose.ui.node.g.I;
            function0A = aVar110.a();
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
            y7.n(c0VarD, a1VarE7, aVar110.e());
            y7.n(c0VarD, b1VarK7, aVar110.g());
            function2B = aVar110.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN7, aVar110.f());
            y5 y5Var7 = y5.f16577a;
            Spanned spannedA7 = androidx.core.text.c.a(text, 0);
            Intrinsics.checkNotNullExpressionValue(spannedA7, "fromHtml(...)");
            androidx.compose.ui.text.f annotatedString7 = BlockExtensionsKt.toAnnotatedString(spannedA7, (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), (2 & 2) != 0 ? new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null) : null);
            androidx.compose.ui.a0.a aVar111 = androidx.compose.ui.a0.E;
            q50.u(annotatedString7, q4.m(x5.q(y5Var7, aVar111, 1.0f, false, 2, null), q4.f(0, c0VarR, 0, 1), false, null, false, 14, null), intercomTheme7.getColors(c0VarR, i112).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme7.getTypography(c0VarR, i112).getType05(), c0VarR, 0, 0, 262136);
            c0VarR = c0VarR;
            l6.a(i6.B(aVar111, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            ni.o(u0.e.c(R.drawable.intercom_close, c0VarR, 0), u0.i.d(R.string.intercom_close, c0VarR, 0), androidx.compose.foundation.i1.j(y5Var7.n(i6.w(aVar111, androidx.compose.ui.unit.h.r(10)), aVar19.q()), false, null, null, null, function10, 15, null), intercomTheme7.getColors(c0VarR, i112).m699getDescriptionText0d7_KjU(), c0VarR, 8, 0);
            c0VarR.o();
            a0Var4 = a0Var3;
            function3 = function10;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.j2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrivacyPolicyKt.PrivacyPolicy$lambda$2(text, a0Var4, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrivacyPolicy$lambda$2(String text, androidx.compose.ui.a0 a0Var, Function0 function0, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(text, "$text");
        PrivacyPolicy(text, a0Var, function0, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void PrivacyPolicyPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-520891099);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PrivacyPolicyKt.INSTANCE.m254getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrivacyPolicyKt.PrivacyPolicyPreview$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrivacyPolicyPreview$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PrivacyPolicyPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
