package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nEmptyState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptyState.kt\nio/intercom/android/sdk/m5/components/EmptyStateKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,107:1\n113#2:108\n113#2:142\n113#2:143\n113#2:144\n113#2:145\n87#3,6:109\n94#3:149\n80#4,6:115\n87#4,3:130\n90#4,2:139\n94#4:148\n391#5,9:121\n400#5:141\n401#5,2:146\n4360#6,6:133\n*S KotlinDebug\n*F\n+ 1 EmptyState.kt\nio/intercom/android/sdk/m5/components/EmptyStateKt\n*L\n34#1:108\n44#1:142\n46#1:143\n55#1:144\n64#1:145\n32#1:109,6\n32#1:149\n32#1:115,6\n32#1:130,3\n32#1:139,2\n32#1:148\n32#1:121,9\n32#1:141\n32#1:146,2\n32#1:133,6\n*E\n"})
public final class EmptyStateKt {
    /* JADX WARN: Code duplicated, block: B:102:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x011b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0127  */
    /* JADX WARN: Code duplicated, block: B:81:0x012b  */
    /* JADX WARN: Code duplicated, block: B:84:0x014a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0158  */
    /* JADX WARN: Code duplicated, block: B:90:0x0179  */
    /* JADX WARN: Code duplicated, block: B:93:0x022e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0234  */
    /* JADX WARN: Code duplicated, block: B:98:0x029f  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void EmptyState(@NotNull final String title, @Nullable androidx.compose.ui.a0 a0Var, @Nullable String str, @androidx.annotation.v @Nullable Integer num, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        String str2;
        int i14;
        int i15;
        Integer num2;
        int i16;
        int i17;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        int i18;
        androidx.compose.ui.a0 a0Var3;
        String str3;
        Integer num3;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        IntercomTheme intercomTheme;
        int i19;
        androidx.compose.ui.text.style.j.a aVar;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i20;
        final String str4;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        final Integer num4;
        final androidx.compose.ui.a0 a0Var4;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(title, "title");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(728499887);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(title) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    str2 = str;
                    if (c0VarR.D(str2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        num2 = num;
                        if (c0VarR.D(num2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((57344 & i10) == 0) {
                            function3 = function2;
                            if (c0VarR.k0(function3)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((46811 & i12) == 9362 || !c0VarR.d()) {
                            if (i21 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i13 != 0) {
                                str3 = null;
                            } else {
                                str3 = str2;
                            }
                            if (i15 != 0) {
                                num3 = null;
                            } else {
                                num3 = num2;
                            }
                            if (i17 != 0) {
                                function3 = null;
                            }
                            androidx.compose.ui.a0 a0VarF = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarF);
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
                            y7.n(c0VarD, a1VarB, aVar2.e());
                            y7.n(c0VarD, b1VarK, aVar2.g());
                            function2B = aVar2.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN, aVar2.f());
                            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                            c0VarR.E(-1239346793);
                            if (num3 != null) {
                                androidx.compose.ui.graphics.painter.b bVarC = u0.e.c(num3.intValue(), c0VarR, 0);
                                long jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                                androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                                ni.o(bVarC, null, i6.w(aVar3, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU, c0VarR, 440, 0);
                                l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                            }
                            c0VarR.A();
                            intercomTheme = IntercomTheme.INSTANCE;
                            i19 = IntercomTheme.$stable;
                            y3 type03 = intercomTheme.getTypography(c0VarR, i19).getType03();
                            aVar = androidx.compose.ui.text.style.j.f42206b;
                            function4 = function3;
                            androidx.compose.ui.a0 a0Var5 = a0Var3;
                            q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type03, c0VarR, i12 & 14, 0, 130042);
                            c0VarR = c0VarR;
                            c0VarR.E(-1239330071);
                            if (str3 == null) {
                                str4 = str3;
                                i20 = 6;
                            } else {
                                i20 = 6;
                                l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                                str4 = str3;
                                q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                                c0VarR = c0VarR;
                            }
                            c0VarR.A();
                            c0VarR.E(-1239320282);
                            if (function4 != null) {
                                l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                                function4.invoke(c0VarR, 0);
                            }
                            c0VarR.A();
                            c0VarR.o();
                            function5 = function4;
                            num4 = num3;
                            a0Var4 = a0Var5;
                        } else {
                            c0VarR.u();
                            a0Var4 = a0Var2;
                            str4 = str2;
                            num4 = num2;
                            function5 = function3;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 24576;
                    function3 = function2;
                    if ((46811 & i12) == 9362) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            function3 = null;
                        }
                        androidx.compose.ui.a0 a0VarF2 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                        androidx.compose.ui.layout.a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarF2);
                        androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                        function0A = aVar4.a();
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
                        y7.n(c0VarD, a1VarB2, aVar4.e());
                        y7.n(c0VarD, b1VarK2, aVar4.g());
                        function2B = aVar4.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN2, aVar4.f());
                        androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
                        c0VarR.E(-1239346793);
                        if (num3 != null) {
                            androidx.compose.ui.graphics.painter.b bVarC2 = u0.e.c(num3.intValue(), c0VarR, 0);
                            long jM714getPrimaryText0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                            androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
                            ni.o(bVarC2, null, i6.w(aVar5, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU2, c0VarR, 440, 0);
                            l6.a(i6.i(aVar5, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                        }
                        c0VarR.A();
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        y3 type04 = intercomTheme.getTypography(c0VarR, i19).getType03();
                        aVar = androidx.compose.ui.text.style.j.f42206b;
                        function4 = function3;
                        androidx.compose.ui.a0 a0Var6 = a0Var3;
                        q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type04, c0VarR, i12 & 14, 0, 130042);
                        c0VarR = c0VarR;
                        c0VarR.E(-1239330071);
                        if (str3 == null) {
                            str4 = str3;
                            i20 = 6;
                        } else {
                            i20 = 6;
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                            str4 = str3;
                            q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                            c0VarR = c0VarR;
                        }
                        c0VarR.A();
                        c0VarR.E(-1239320282);
                        if (function4 != null) {
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                            function4.invoke(c0VarR, 0);
                        }
                        c0VarR.A();
                        c0VarR.o();
                        function5 = function4;
                        num4 = num3;
                        a0Var4 = a0Var6;
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            function3 = null;
                        }
                        androidx.compose.ui.a0 a0VarF3 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                        androidx.compose.ui.layout.a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarF3);
                        androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                        function0A = aVar6.a();
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
                        y7.n(c0VarD, a1VarB3, aVar6.e());
                        y7.n(c0VarD, b1VarK3, aVar6.g());
                        function2B = aVar6.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN3, aVar6.f());
                        androidx.compose.foundation.layout.n0 n0Var3 = androidx.compose.foundation.layout.n0.f16227a;
                        c0VarR.E(-1239346793);
                        if (num3 != null) {
                            androidx.compose.ui.graphics.painter.b bVarC3 = u0.e.c(num3.intValue(), c0VarR, 0);
                            long jM714getPrimaryText0d7_KjU3 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                            androidx.compose.ui.a0.a aVar7 = androidx.compose.ui.a0.E;
                            ni.o(bVarC3, null, i6.w(aVar7, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU3, c0VarR, 440, 0);
                            l6.a(i6.i(aVar7, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                        }
                        c0VarR.A();
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        y3 type05 = intercomTheme.getTypography(c0VarR, i19).getType03();
                        aVar = androidx.compose.ui.text.style.j.f42206b;
                        function4 = function3;
                        androidx.compose.ui.a0 a0Var7 = a0Var3;
                        q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type05, c0VarR, i12 & 14, 0, 130042);
                        c0VarR = c0VarR;
                        c0VarR.E(-1239330071);
                        if (str3 == null) {
                            str4 = str3;
                            i20 = 6;
                        } else {
                            i20 = 6;
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                            str4 = str3;
                            q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                            c0VarR = c0VarR;
                        }
                        c0VarR.A();
                        c0VarR.E(-1239320282);
                        if (function4 != null) {
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                            function4.invoke(c0VarR, 0);
                        }
                        c0VarR.A();
                        c0VarR.o();
                        function5 = function4;
                        num4 = num3;
                        a0Var4 = a0Var7;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                num2 = num;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((46811 & i12) == 9362) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            function3 = null;
                        }
                        androidx.compose.ui.a0 a0VarF4 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                        androidx.compose.ui.layout.a1 a1VarB4 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarF4);
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
                        y7.n(c0VarD, a1VarB4, aVar8.e());
                        y7.n(c0VarD, b1VarK4, aVar8.g());
                        function2B = aVar8.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN4, aVar8.f());
                        androidx.compose.foundation.layout.n0 n0Var4 = androidx.compose.foundation.layout.n0.f16227a;
                        c0VarR.E(-1239346793);
                        if (num3 != null) {
                            androidx.compose.ui.graphics.painter.b bVarC4 = u0.e.c(num3.intValue(), c0VarR, 0);
                            long jM714getPrimaryText0d7_KjU4 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                            androidx.compose.ui.a0.a aVar9 = androidx.compose.ui.a0.E;
                            ni.o(bVarC4, null, i6.w(aVar9, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU4, c0VarR, 440, 0);
                            l6.a(i6.i(aVar9, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                        }
                        c0VarR.A();
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        y3 type06 = intercomTheme.getTypography(c0VarR, i19).getType03();
                        aVar = androidx.compose.ui.text.style.j.f42206b;
                        function4 = function3;
                        androidx.compose.ui.a0 a0Var8 = a0Var3;
                        q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type06, c0VarR, i12 & 14, 0, 130042);
                        c0VarR = c0VarR;
                        c0VarR.E(-1239330071);
                        if (str3 == null) {
                            str4 = str3;
                            i20 = 6;
                        } else {
                            i20 = 6;
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                            str4 = str3;
                            q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                            c0VarR = c0VarR;
                        }
                        c0VarR.A();
                        c0VarR.E(-1239320282);
                        if (function4 != null) {
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                            function4.invoke(c0VarR, 0);
                        }
                        c0VarR.A();
                        c0VarR.o();
                        function5 = function4;
                        num4 = num3;
                        a0Var4 = a0Var8;
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            function3 = null;
                        }
                        androidx.compose.ui.a0 a0VarF5 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                        androidx.compose.ui.layout.a1 a1VarB5 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarF5);
                        androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                        function0A = aVar10.a();
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
                        y7.n(c0VarD, a1VarB5, aVar10.e());
                        y7.n(c0VarD, b1VarK5, aVar10.g());
                        function2B = aVar10.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN5, aVar10.f());
                        androidx.compose.foundation.layout.n0 n0Var5 = androidx.compose.foundation.layout.n0.f16227a;
                        c0VarR.E(-1239346793);
                        if (num3 != null) {
                            androidx.compose.ui.graphics.painter.b bVarC5 = u0.e.c(num3.intValue(), c0VarR, 0);
                            long jM714getPrimaryText0d7_KjU5 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                            androidx.compose.ui.a0.a aVar11 = androidx.compose.ui.a0.E;
                            ni.o(bVarC5, null, i6.w(aVar11, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU5, c0VarR, 440, 0);
                            l6.a(i6.i(aVar11, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                        }
                        c0VarR.A();
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        y3 type07 = intercomTheme.getTypography(c0VarR, i19).getType03();
                        aVar = androidx.compose.ui.text.style.j.f42206b;
                        function4 = function3;
                        androidx.compose.ui.a0 a0Var9 = a0Var3;
                        q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type07, c0VarR, i12 & 14, 0, 130042);
                        c0VarR = c0VarR;
                        c0VarR.E(-1239330071);
                        if (str3 == null) {
                            str4 = str3;
                            i20 = 6;
                        } else {
                            i20 = 6;
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                            str4 = str3;
                            q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                            c0VarR = c0VarR;
                        }
                        c0VarR.A();
                        c0VarR.E(-1239320282);
                        if (function4 != null) {
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                            function4.invoke(c0VarR, 0);
                        }
                        c0VarR.A();
                        c0VarR.o();
                        function5 = function4;
                        num4 = num3;
                        a0Var4 = a0Var9;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function3 = function2;
                if ((46811 & i12) == 9362) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        function3 = null;
                    }
                    androidx.compose.ui.a0 a0VarF6 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                    androidx.compose.ui.layout.a1 a1VarB6 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarF6);
                    androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                    function0A = aVar12.a();
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
                    y7.n(c0VarD, a1VarB6, aVar12.e());
                    y7.n(c0VarD, b1VarK6, aVar12.g());
                    function2B = aVar12.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN6, aVar12.f());
                    androidx.compose.foundation.layout.n0 n0Var6 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(-1239346793);
                    if (num3 != null) {
                        androidx.compose.ui.graphics.painter.b bVarC6 = u0.e.c(num3.intValue(), c0VarR, 0);
                        long jM714getPrimaryText0d7_KjU6 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        androidx.compose.ui.a0.a aVar13 = androidx.compose.ui.a0.E;
                        ni.o(bVarC6, null, i6.w(aVar13, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU6, c0VarR, 440, 0);
                        l6.a(i6.i(aVar13, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                    }
                    c0VarR.A();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    y3 type08 = intercomTheme.getTypography(c0VarR, i19).getType03();
                    aVar = androidx.compose.ui.text.style.j.f42206b;
                    function4 = function3;
                    androidx.compose.ui.a0 a0Var10 = a0Var3;
                    q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type08, c0VarR, i12 & 14, 0, 130042);
                    c0VarR = c0VarR;
                    c0VarR.E(-1239330071);
                    if (str3 == null) {
                        str4 = str3;
                        i20 = 6;
                    } else {
                        i20 = 6;
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                        str4 = str3;
                        q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                        c0VarR = c0VarR;
                    }
                    c0VarR.A();
                    c0VarR.E(-1239320282);
                    if (function4 != null) {
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                        function4.invoke(c0VarR, 0);
                    }
                    c0VarR.A();
                    c0VarR.o();
                    function5 = function4;
                    num4 = num3;
                    a0Var4 = a0Var10;
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        function3 = null;
                    }
                    androidx.compose.ui.a0 a0VarF7 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                    androidx.compose.ui.layout.a1 a1VarB7 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarF7);
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
                    y7.n(c0VarD, a1VarB7, aVar14.e());
                    y7.n(c0VarD, b1VarK7, aVar14.g());
                    function2B = aVar14.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN7, aVar14.f());
                    androidx.compose.foundation.layout.n0 n0Var7 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(-1239346793);
                    if (num3 != null) {
                        androidx.compose.ui.graphics.painter.b bVarC7 = u0.e.c(num3.intValue(), c0VarR, 0);
                        long jM714getPrimaryText0d7_KjU7 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        androidx.compose.ui.a0.a aVar15 = androidx.compose.ui.a0.E;
                        ni.o(bVarC7, null, i6.w(aVar15, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU7, c0VarR, 440, 0);
                        l6.a(i6.i(aVar15, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                    }
                    c0VarR.A();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    y3 type09 = intercomTheme.getTypography(c0VarR, i19).getType03();
                    aVar = androidx.compose.ui.text.style.j.f42206b;
                    function4 = function3;
                    androidx.compose.ui.a0 a0Var11 = a0Var3;
                    q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type09, c0VarR, i12 & 14, 0, 130042);
                    c0VarR = c0VarR;
                    c0VarR.E(-1239330071);
                    if (str3 == null) {
                        str4 = str3;
                        i20 = 6;
                    } else {
                        i20 = 6;
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                        str4 = str3;
                        q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                        c0VarR = c0VarR;
                    }
                    c0VarR.A();
                    c0VarR.E(-1239320282);
                    if (function4 != null) {
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                        function4.invoke(c0VarR, 0);
                    }
                    c0VarR.A();
                    c0VarR.o();
                    function5 = function4;
                    num4 = num3;
                    a0Var4 = a0Var11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            str2 = str;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    num2 = num;
                    if (c0VarR.D(num2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((46811 & i12) == 9362) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            function3 = null;
                        }
                        androidx.compose.ui.a0 a0VarF8 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                        androidx.compose.ui.layout.a1 a1VarB8 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarF8);
                        androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
                        function0A = aVar16.a();
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
                        y7.n(c0VarD, a1VarB8, aVar16.e());
                        y7.n(c0VarD, b1VarK8, aVar16.g());
                        function2B = aVar16.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN8, aVar16.f());
                        androidx.compose.foundation.layout.n0 n0Var8 = androidx.compose.foundation.layout.n0.f16227a;
                        c0VarR.E(-1239346793);
                        if (num3 != null) {
                            androidx.compose.ui.graphics.painter.b bVarC8 = u0.e.c(num3.intValue(), c0VarR, 0);
                            long jM714getPrimaryText0d7_KjU8 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                            androidx.compose.ui.a0.a aVar17 = androidx.compose.ui.a0.E;
                            ni.o(bVarC8, null, i6.w(aVar17, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU8, c0VarR, 440, 0);
                            l6.a(i6.i(aVar17, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                        }
                        c0VarR.A();
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        y3 type010 = intercomTheme.getTypography(c0VarR, i19).getType03();
                        aVar = androidx.compose.ui.text.style.j.f42206b;
                        function4 = function3;
                        androidx.compose.ui.a0 a0Var12 = a0Var3;
                        q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type010, c0VarR, i12 & 14, 0, 130042);
                        c0VarR = c0VarR;
                        c0VarR.E(-1239330071);
                        if (str3 == null) {
                            str4 = str3;
                            i20 = 6;
                        } else {
                            i20 = 6;
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                            str4 = str3;
                            q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                            c0VarR = c0VarR;
                        }
                        c0VarR.A();
                        c0VarR.E(-1239320282);
                        if (function4 != null) {
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                            function4.invoke(c0VarR, 0);
                        }
                        c0VarR.A();
                        c0VarR.o();
                        function5 = function4;
                        num4 = num3;
                        a0Var4 = a0Var12;
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            function3 = null;
                        }
                        androidx.compose.ui.a0 a0VarF9 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                        androidx.compose.ui.layout.a1 a1VarB9 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarF9);
                        androidx.compose.ui.node.g.a aVar18 = androidx.compose.ui.node.g.I;
                        function0A = aVar18.a();
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
                        y7.n(c0VarD, a1VarB9, aVar18.e());
                        y7.n(c0VarD, b1VarK9, aVar18.g());
                        function2B = aVar18.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN9, aVar18.f());
                        androidx.compose.foundation.layout.n0 n0Var9 = androidx.compose.foundation.layout.n0.f16227a;
                        c0VarR.E(-1239346793);
                        if (num3 != null) {
                            androidx.compose.ui.graphics.painter.b bVarC9 = u0.e.c(num3.intValue(), c0VarR, 0);
                            long jM714getPrimaryText0d7_KjU9 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                            androidx.compose.ui.a0.a aVar19 = androidx.compose.ui.a0.E;
                            ni.o(bVarC9, null, i6.w(aVar19, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU9, c0VarR, 440, 0);
                            l6.a(i6.i(aVar19, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                        }
                        c0VarR.A();
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        y3 type011 = intercomTheme.getTypography(c0VarR, i19).getType03();
                        aVar = androidx.compose.ui.text.style.j.f42206b;
                        function4 = function3;
                        androidx.compose.ui.a0 a0Var13 = a0Var3;
                        q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type011, c0VarR, i12 & 14, 0, 130042);
                        c0VarR = c0VarR;
                        c0VarR.E(-1239330071);
                        if (str3 == null) {
                            str4 = str3;
                            i20 = 6;
                        } else {
                            i20 = 6;
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                            str4 = str3;
                            q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                            c0VarR = c0VarR;
                        }
                        c0VarR.A();
                        c0VarR.E(-1239320282);
                        if (function4 != null) {
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                            function4.invoke(c0VarR, 0);
                        }
                        c0VarR.A();
                        c0VarR.o();
                        function5 = function4;
                        num4 = num3;
                        a0Var4 = a0Var13;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function3 = function2;
                if ((46811 & i12) == 9362) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        function3 = null;
                    }
                    androidx.compose.ui.a0 a0VarF10 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                    androidx.compose.ui.layout.a1 a1VarB10 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarF10);
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
                    y7.n(c0VarD, a1VarB10, aVar110.e());
                    y7.n(c0VarD, b1VarK10, aVar110.g());
                    function2B = aVar110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN10, aVar110.f());
                    androidx.compose.foundation.layout.n0 n0Var10 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(-1239346793);
                    if (num3 != null) {
                        androidx.compose.ui.graphics.painter.b bVarC10 = u0.e.c(num3.intValue(), c0VarR, 0);
                        long jM714getPrimaryText0d7_KjU10 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        androidx.compose.ui.a0.a aVar111 = androidx.compose.ui.a0.E;
                        ni.o(bVarC10, null, i6.w(aVar111, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU10, c0VarR, 440, 0);
                        l6.a(i6.i(aVar111, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                    }
                    c0VarR.A();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    y3 type012 = intercomTheme.getTypography(c0VarR, i19).getType03();
                    aVar = androidx.compose.ui.text.style.j.f42206b;
                    function4 = function3;
                    androidx.compose.ui.a0 a0Var14 = a0Var3;
                    q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type012, c0VarR, i12 & 14, 0, 130042);
                    c0VarR = c0VarR;
                    c0VarR.E(-1239330071);
                    if (str3 == null) {
                        str4 = str3;
                        i20 = 6;
                    } else {
                        i20 = 6;
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                        str4 = str3;
                        q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                        c0VarR = c0VarR;
                    }
                    c0VarR.A();
                    c0VarR.E(-1239320282);
                    if (function4 != null) {
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                        function4.invoke(c0VarR, 0);
                    }
                    c0VarR.A();
                    c0VarR.o();
                    function5 = function4;
                    num4 = num3;
                    a0Var4 = a0Var14;
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        function3 = null;
                    }
                    androidx.compose.ui.a0 a0VarF11 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                    androidx.compose.ui.layout.a1 a1VarB11 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarF11);
                    androidx.compose.ui.node.g.a aVar112 = androidx.compose.ui.node.g.I;
                    function0A = aVar112.a();
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
                    y7.n(c0VarD, a1VarB11, aVar112.e());
                    y7.n(c0VarD, b1VarK11, aVar112.g());
                    function2B = aVar112.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11, aVar112.f());
                    androidx.compose.foundation.layout.n0 n0Var11 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(-1239346793);
                    if (num3 != null) {
                        androidx.compose.ui.graphics.painter.b bVarC11 = u0.e.c(num3.intValue(), c0VarR, 0);
                        long jM714getPrimaryText0d7_KjU11 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        androidx.compose.ui.a0.a aVar113 = androidx.compose.ui.a0.E;
                        ni.o(bVarC11, null, i6.w(aVar113, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU11, c0VarR, 440, 0);
                        l6.a(i6.i(aVar113, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                    }
                    c0VarR.A();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    y3 type013 = intercomTheme.getTypography(c0VarR, i19).getType03();
                    aVar = androidx.compose.ui.text.style.j.f42206b;
                    function4 = function3;
                    androidx.compose.ui.a0 a0Var15 = a0Var3;
                    q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type013, c0VarR, i12 & 14, 0, 130042);
                    c0VarR = c0VarR;
                    c0VarR.E(-1239330071);
                    if (str3 == null) {
                        str4 = str3;
                        i20 = 6;
                    } else {
                        i20 = 6;
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                        str4 = str3;
                        q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                        c0VarR = c0VarR;
                    }
                    c0VarR.A();
                    c0VarR.E(-1239320282);
                    if (function4 != null) {
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                        function4.invoke(c0VarR, 0);
                    }
                    c0VarR.A();
                    c0VarR.o();
                    function5 = function4;
                    num4 = num3;
                    a0Var4 = a0Var15;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            num2 = num;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((46811 & i12) == 9362) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        function3 = null;
                    }
                    androidx.compose.ui.a0 a0VarF12 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                    androidx.compose.ui.layout.a1 a1VarB12 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarF12);
                    androidx.compose.ui.node.g.a aVar114 = androidx.compose.ui.node.g.I;
                    function0A = aVar114.a();
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
                    y7.n(c0VarD, a1VarB12, aVar114.e());
                    y7.n(c0VarD, b1VarK12, aVar114.g());
                    function2B = aVar114.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN12, aVar114.f());
                    androidx.compose.foundation.layout.n0 n0Var12 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(-1239346793);
                    if (num3 != null) {
                        androidx.compose.ui.graphics.painter.b bVarC12 = u0.e.c(num3.intValue(), c0VarR, 0);
                        long jM714getPrimaryText0d7_KjU12 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        androidx.compose.ui.a0.a aVar115 = androidx.compose.ui.a0.E;
                        ni.o(bVarC12, null, i6.w(aVar115, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU12, c0VarR, 440, 0);
                        l6.a(i6.i(aVar115, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                    }
                    c0VarR.A();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    y3 type014 = intercomTheme.getTypography(c0VarR, i19).getType03();
                    aVar = androidx.compose.ui.text.style.j.f42206b;
                    function4 = function3;
                    androidx.compose.ui.a0 a0Var16 = a0Var3;
                    q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type014, c0VarR, i12 & 14, 0, 130042);
                    c0VarR = c0VarR;
                    c0VarR.E(-1239330071);
                    if (str3 == null) {
                        str4 = str3;
                        i20 = 6;
                    } else {
                        i20 = 6;
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                        str4 = str3;
                        q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                        c0VarR = c0VarR;
                    }
                    c0VarR.A();
                    c0VarR.E(-1239320282);
                    if (function4 != null) {
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                        function4.invoke(c0VarR, 0);
                    }
                    c0VarR.A();
                    c0VarR.o();
                    function5 = function4;
                    num4 = num3;
                    a0Var4 = a0Var16;
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        function3 = null;
                    }
                    androidx.compose.ui.a0 a0VarF13 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                    androidx.compose.ui.layout.a1 a1VarB13 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarF13);
                    androidx.compose.ui.node.g.a aVar116 = androidx.compose.ui.node.g.I;
                    function0A = aVar116.a();
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
                    y7.n(c0VarD, a1VarB13, aVar116.e());
                    y7.n(c0VarD, b1VarK13, aVar116.g());
                    function2B = aVar116.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN13, aVar116.f());
                    androidx.compose.foundation.layout.n0 n0Var13 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(-1239346793);
                    if (num3 != null) {
                        androidx.compose.ui.graphics.painter.b bVarC13 = u0.e.c(num3.intValue(), c0VarR, 0);
                        long jM714getPrimaryText0d7_KjU13 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        androidx.compose.ui.a0.a aVar117 = androidx.compose.ui.a0.E;
                        ni.o(bVarC13, null, i6.w(aVar117, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU13, c0VarR, 440, 0);
                        l6.a(i6.i(aVar117, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                    }
                    c0VarR.A();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    y3 type015 = intercomTheme.getTypography(c0VarR, i19).getType03();
                    aVar = androidx.compose.ui.text.style.j.f42206b;
                    function4 = function3;
                    androidx.compose.ui.a0 a0Var17 = a0Var3;
                    q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type015, c0VarR, i12 & 14, 0, 130042);
                    c0VarR = c0VarR;
                    c0VarR.E(-1239330071);
                    if (str3 == null) {
                        str4 = str3;
                        i20 = 6;
                    } else {
                        i20 = 6;
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                        str4 = str3;
                        q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                        c0VarR = c0VarR;
                    }
                    c0VarR.A();
                    c0VarR.E(-1239320282);
                    if (function4 != null) {
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                        function4.invoke(c0VarR, 0);
                    }
                    c0VarR.A();
                    c0VarR.o();
                    function5 = function4;
                    num4 = num3;
                    a0Var4 = a0Var17;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function3 = function2;
            if ((46811 & i12) == 9362) {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    function3 = null;
                }
                androidx.compose.ui.a0 a0VarF14 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                androidx.compose.ui.layout.a1 a1VarB14 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarF14);
                androidx.compose.ui.node.g.a aVar118 = androidx.compose.ui.node.g.I;
                function0A = aVar118.a();
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
                y7.n(c0VarD, a1VarB14, aVar118.e());
                y7.n(c0VarD, b1VarK14, aVar118.g());
                function2B = aVar118.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN14, aVar118.f());
                androidx.compose.foundation.layout.n0 n0Var14 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(-1239346793);
                if (num3 != null) {
                    androidx.compose.ui.graphics.painter.b bVarC14 = u0.e.c(num3.intValue(), c0VarR, 0);
                    long jM714getPrimaryText0d7_KjU14 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    androidx.compose.ui.a0.a aVar119 = androidx.compose.ui.a0.E;
                    ni.o(bVarC14, null, i6.w(aVar119, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU14, c0VarR, 440, 0);
                    l6.a(i6.i(aVar119, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                }
                c0VarR.A();
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                y3 type016 = intercomTheme.getTypography(c0VarR, i19).getType03();
                aVar = androidx.compose.ui.text.style.j.f42206b;
                function4 = function3;
                androidx.compose.ui.a0 a0Var18 = a0Var3;
                q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type016, c0VarR, i12 & 14, 0, 130042);
                c0VarR = c0VarR;
                c0VarR.E(-1239330071);
                if (str3 == null) {
                    str4 = str3;
                    i20 = 6;
                } else {
                    i20 = 6;
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                    str4 = str3;
                    q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                    c0VarR = c0VarR;
                }
                c0VarR.A();
                c0VarR.E(-1239320282);
                if (function4 != null) {
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                    function4.invoke(c0VarR, 0);
                }
                c0VarR.A();
                c0VarR.o();
                function5 = function4;
                num4 = num3;
                a0Var4 = a0Var18;
            } else {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    function3 = null;
                }
                androidx.compose.ui.a0 a0VarF15 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                androidx.compose.ui.layout.a1 a1VarB15 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarF15);
                androidx.compose.ui.node.g.a aVar1110 = androidx.compose.ui.node.g.I;
                function0A = aVar1110.a();
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
                y7.n(c0VarD, a1VarB15, aVar1110.e());
                y7.n(c0VarD, b1VarK15, aVar1110.g());
                function2B = aVar1110.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN15, aVar1110.f());
                androidx.compose.foundation.layout.n0 n0Var15 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(-1239346793);
                if (num3 != null) {
                    androidx.compose.ui.graphics.painter.b bVarC15 = u0.e.c(num3.intValue(), c0VarR, 0);
                    long jM714getPrimaryText0d7_KjU15 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    androidx.compose.ui.a0.a aVar1111 = androidx.compose.ui.a0.E;
                    ni.o(bVarC15, null, i6.w(aVar1111, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU15, c0VarR, 440, 0);
                    l6.a(i6.i(aVar1111, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                }
                c0VarR.A();
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                y3 type017 = intercomTheme.getTypography(c0VarR, i19).getType03();
                aVar = androidx.compose.ui.text.style.j.f42206b;
                function4 = function3;
                androidx.compose.ui.a0 a0Var19 = a0Var3;
                q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type017, c0VarR, i12 & 14, 0, 130042);
                c0VarR = c0VarR;
                c0VarR.E(-1239330071);
                if (str3 == null) {
                    str4 = str3;
                    i20 = 6;
                } else {
                    i20 = 6;
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                    str4 = str3;
                    q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                    c0VarR = c0VarR;
                }
                c0VarR.A();
                c0VarR.E(-1239320282);
                if (function4 != null) {
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                    function4.invoke(c0VarR, 0);
                }
                c0VarR.A();
                c0VarR.o();
                function5 = function4;
                num4 = num3;
                a0Var4 = a0Var19;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                str2 = str;
                if (c0VarR.D(str2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    num2 = num;
                    if (c0VarR.D(num2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((46811 & i12) == 9362) {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            function3 = null;
                        }
                        androidx.compose.ui.a0 a0VarF16 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                        androidx.compose.ui.layout.a1 a1VarB16 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarF16);
                        androidx.compose.ui.node.g.a aVar1112 = androidx.compose.ui.node.g.I;
                        function0A = aVar1112.a();
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
                        y7.n(c0VarD, a1VarB16, aVar1112.e());
                        y7.n(c0VarD, b1VarK16, aVar1112.g());
                        function2B = aVar1112.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN16, aVar1112.f());
                        androidx.compose.foundation.layout.n0 n0Var16 = androidx.compose.foundation.layout.n0.f16227a;
                        c0VarR.E(-1239346793);
                        if (num3 != null) {
                            androidx.compose.ui.graphics.painter.b bVarC16 = u0.e.c(num3.intValue(), c0VarR, 0);
                            long jM714getPrimaryText0d7_KjU16 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                            androidx.compose.ui.a0.a aVar1113 = androidx.compose.ui.a0.E;
                            ni.o(bVarC16, null, i6.w(aVar1113, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU16, c0VarR, 440, 0);
                            l6.a(i6.i(aVar1113, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                        }
                        c0VarR.A();
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        y3 type018 = intercomTheme.getTypography(c0VarR, i19).getType03();
                        aVar = androidx.compose.ui.text.style.j.f42206b;
                        function4 = function3;
                        androidx.compose.ui.a0 a0Var110 = a0Var3;
                        q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type018, c0VarR, i12 & 14, 0, 130042);
                        c0VarR = c0VarR;
                        c0VarR.E(-1239330071);
                        if (str3 == null) {
                            str4 = str3;
                            i20 = 6;
                        } else {
                            i20 = 6;
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                            str4 = str3;
                            q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                            c0VarR = c0VarR;
                        }
                        c0VarR.A();
                        c0VarR.E(-1239320282);
                        if (function4 != null) {
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                            function4.invoke(c0VarR, 0);
                        }
                        c0VarR.A();
                        c0VarR.o();
                        function5 = function4;
                        num4 = num3;
                        a0Var4 = a0Var110;
                    } else {
                        if (i21 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            function3 = null;
                        }
                        androidx.compose.ui.a0 a0VarF17 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                        androidx.compose.ui.layout.a1 a1VarB17 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK17 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, a0VarF17);
                        androidx.compose.ui.node.g.a aVar1114 = androidx.compose.ui.node.g.I;
                        function0A = aVar1114.a();
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
                        y7.n(c0VarD, a1VarB17, aVar1114.e());
                        y7.n(c0VarD, b1VarK17, aVar1114.g());
                        function2B = aVar1114.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN17, aVar1114.f());
                        androidx.compose.foundation.layout.n0 n0Var17 = androidx.compose.foundation.layout.n0.f16227a;
                        c0VarR.E(-1239346793);
                        if (num3 != null) {
                            androidx.compose.ui.graphics.painter.b bVarC17 = u0.e.c(num3.intValue(), c0VarR, 0);
                            long jM714getPrimaryText0d7_KjU17 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                            androidx.compose.ui.a0.a aVar1115 = androidx.compose.ui.a0.E;
                            ni.o(bVarC17, null, i6.w(aVar1115, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU17, c0VarR, 440, 0);
                            l6.a(i6.i(aVar1115, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                        }
                        c0VarR.A();
                        intercomTheme = IntercomTheme.INSTANCE;
                        i19 = IntercomTheme.$stable;
                        y3 type019 = intercomTheme.getTypography(c0VarR, i19).getType03();
                        aVar = androidx.compose.ui.text.style.j.f42206b;
                        function4 = function3;
                        androidx.compose.ui.a0 a0Var111 = a0Var3;
                        q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type019, c0VarR, i12 & 14, 0, 130042);
                        c0VarR = c0VarR;
                        c0VarR.E(-1239330071);
                        if (str3 == null) {
                            str4 = str3;
                            i20 = 6;
                        } else {
                            i20 = 6;
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                            str4 = str3;
                            q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                            c0VarR = c0VarR;
                        }
                        c0VarR.A();
                        c0VarR.E(-1239320282);
                        if (function4 != null) {
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                            function4.invoke(c0VarR, 0);
                        }
                        c0VarR.A();
                        c0VarR.o();
                        function5 = function4;
                        num4 = num3;
                        a0Var4 = a0Var111;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function3 = function2;
                if ((46811 & i12) == 9362) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        function3 = null;
                    }
                    androidx.compose.ui.a0 a0VarF18 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                    androidx.compose.ui.layout.a1 a1VarB18 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK18 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarF18);
                    androidx.compose.ui.node.g.a aVar1116 = androidx.compose.ui.node.g.I;
                    function0A = aVar1116.a();
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
                    y7.n(c0VarD, a1VarB18, aVar1116.e());
                    y7.n(c0VarD, b1VarK18, aVar1116.g());
                    function2B = aVar1116.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN18, aVar1116.f());
                    androidx.compose.foundation.layout.n0 n0Var18 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(-1239346793);
                    if (num3 != null) {
                        androidx.compose.ui.graphics.painter.b bVarC18 = u0.e.c(num3.intValue(), c0VarR, 0);
                        long jM714getPrimaryText0d7_KjU18 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        androidx.compose.ui.a0.a aVar1117 = androidx.compose.ui.a0.E;
                        ni.o(bVarC18, null, i6.w(aVar1117, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU18, c0VarR, 440, 0);
                        l6.a(i6.i(aVar1117, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                    }
                    c0VarR.A();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    y3 type0110 = intercomTheme.getTypography(c0VarR, i19).getType03();
                    aVar = androidx.compose.ui.text.style.j.f42206b;
                    function4 = function3;
                    androidx.compose.ui.a0 a0Var112 = a0Var3;
                    q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type0110, c0VarR, i12 & 14, 0, 130042);
                    c0VarR = c0VarR;
                    c0VarR.E(-1239330071);
                    if (str3 == null) {
                        str4 = str3;
                        i20 = 6;
                    } else {
                        i20 = 6;
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                        str4 = str3;
                        q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                        c0VarR = c0VarR;
                    }
                    c0VarR.A();
                    c0VarR.E(-1239320282);
                    if (function4 != null) {
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                        function4.invoke(c0VarR, 0);
                    }
                    c0VarR.A();
                    c0VarR.o();
                    function5 = function4;
                    num4 = num3;
                    a0Var4 = a0Var112;
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        function3 = null;
                    }
                    androidx.compose.ui.a0 a0VarF19 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                    androidx.compose.ui.layout.a1 a1VarB19 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK19 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarF19);
                    androidx.compose.ui.node.g.a aVar1118 = androidx.compose.ui.node.g.I;
                    function0A = aVar1118.a();
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
                    y7.n(c0VarD, a1VarB19, aVar1118.e());
                    y7.n(c0VarD, b1VarK19, aVar1118.g());
                    function2B = aVar1118.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN19, aVar1118.f());
                    androidx.compose.foundation.layout.n0 n0Var19 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(-1239346793);
                    if (num3 != null) {
                        androidx.compose.ui.graphics.painter.b bVarC19 = u0.e.c(num3.intValue(), c0VarR, 0);
                        long jM714getPrimaryText0d7_KjU19 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        androidx.compose.ui.a0.a aVar1119 = androidx.compose.ui.a0.E;
                        ni.o(bVarC19, null, i6.w(aVar1119, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU19, c0VarR, 440, 0);
                        l6.a(i6.i(aVar1119, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                    }
                    c0VarR.A();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    y3 type0111 = intercomTheme.getTypography(c0VarR, i19).getType03();
                    aVar = androidx.compose.ui.text.style.j.f42206b;
                    function4 = function3;
                    androidx.compose.ui.a0 a0Var113 = a0Var3;
                    q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type0111, c0VarR, i12 & 14, 0, 130042);
                    c0VarR = c0VarR;
                    c0VarR.E(-1239330071);
                    if (str3 == null) {
                        str4 = str3;
                        i20 = 6;
                    } else {
                        i20 = 6;
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                        str4 = str3;
                        q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                        c0VarR = c0VarR;
                    }
                    c0VarR.A();
                    c0VarR.E(-1239320282);
                    if (function4 != null) {
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                        function4.invoke(c0VarR, 0);
                    }
                    c0VarR.A();
                    c0VarR.o();
                    function5 = function4;
                    num4 = num3;
                    a0Var4 = a0Var113;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            num2 = num;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((46811 & i12) == 9362) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        function3 = null;
                    }
                    androidx.compose.ui.a0 a0VarF110 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                    androidx.compose.ui.layout.a1 a1VarB110 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, a0VarF110);
                    androidx.compose.ui.node.g.a aVar11110 = androidx.compose.ui.node.g.I;
                    function0A = aVar11110.a();
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
                    y7.n(c0VarD, a1VarB110, aVar11110.e());
                    y7.n(c0VarD, b1VarK110, aVar11110.g());
                    function2B = aVar11110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN110, aVar11110.f());
                    androidx.compose.foundation.layout.n0 n0Var110 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(-1239346793);
                    if (num3 != null) {
                        androidx.compose.ui.graphics.painter.b bVarC110 = u0.e.c(num3.intValue(), c0VarR, 0);
                        long jM714getPrimaryText0d7_KjU110 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        androidx.compose.ui.a0.a aVar11111 = androidx.compose.ui.a0.E;
                        ni.o(bVarC110, null, i6.w(aVar11111, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU110, c0VarR, 440, 0);
                        l6.a(i6.i(aVar11111, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                    }
                    c0VarR.A();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    y3 type0112 = intercomTheme.getTypography(c0VarR, i19).getType03();
                    aVar = androidx.compose.ui.text.style.j.f42206b;
                    function4 = function3;
                    androidx.compose.ui.a0 a0Var114 = a0Var3;
                    q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type0112, c0VarR, i12 & 14, 0, 130042);
                    c0VarR = c0VarR;
                    c0VarR.E(-1239330071);
                    if (str3 == null) {
                        str4 = str3;
                        i20 = 6;
                    } else {
                        i20 = 6;
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                        str4 = str3;
                        q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                        c0VarR = c0VarR;
                    }
                    c0VarR.A();
                    c0VarR.E(-1239320282);
                    if (function4 != null) {
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                        function4.invoke(c0VarR, 0);
                    }
                    c0VarR.A();
                    c0VarR.o();
                    function5 = function4;
                    num4 = num3;
                    a0Var4 = a0Var114;
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        function3 = null;
                    }
                    androidx.compose.ui.a0 a0VarF111 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                    androidx.compose.ui.layout.a1 a1VarB111 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, a0VarF111);
                    androidx.compose.ui.node.g.a aVar11112 = androidx.compose.ui.node.g.I;
                    function0A = aVar11112.a();
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
                    y7.n(c0VarD, a1VarB111, aVar11112.e());
                    y7.n(c0VarD, b1VarK111, aVar11112.g());
                    function2B = aVar11112.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN111, aVar11112.f());
                    androidx.compose.foundation.layout.n0 n0Var111 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(-1239346793);
                    if (num3 != null) {
                        androidx.compose.ui.graphics.painter.b bVarC111 = u0.e.c(num3.intValue(), c0VarR, 0);
                        long jM714getPrimaryText0d7_KjU111 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        androidx.compose.ui.a0.a aVar11113 = androidx.compose.ui.a0.E;
                        ni.o(bVarC111, null, i6.w(aVar11113, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU111, c0VarR, 440, 0);
                        l6.a(i6.i(aVar11113, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                    }
                    c0VarR.A();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    y3 type0113 = intercomTheme.getTypography(c0VarR, i19).getType03();
                    aVar = androidx.compose.ui.text.style.j.f42206b;
                    function4 = function3;
                    androidx.compose.ui.a0 a0Var115 = a0Var3;
                    q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type0113, c0VarR, i12 & 14, 0, 130042);
                    c0VarR = c0VarR;
                    c0VarR.E(-1239330071);
                    if (str3 == null) {
                        str4 = str3;
                        i20 = 6;
                    } else {
                        i20 = 6;
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                        str4 = str3;
                        q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                        c0VarR = c0VarR;
                    }
                    c0VarR.A();
                    c0VarR.E(-1239320282);
                    if (function4 != null) {
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                        function4.invoke(c0VarR, 0);
                    }
                    c0VarR.A();
                    c0VarR.o();
                    function5 = function4;
                    num4 = num3;
                    a0Var4 = a0Var115;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function3 = function2;
            if ((46811 & i12) == 9362) {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    function3 = null;
                }
                androidx.compose.ui.a0 a0VarF112 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                androidx.compose.ui.layout.a1 a1VarB112 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK112 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarF112);
                androidx.compose.ui.node.g.a aVar11114 = androidx.compose.ui.node.g.I;
                function0A = aVar11114.a();
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
                y7.n(c0VarD, a1VarB112, aVar11114.e());
                y7.n(c0VarD, b1VarK112, aVar11114.g());
                function2B = aVar11114.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN112, aVar11114.f());
                androidx.compose.foundation.layout.n0 n0Var112 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(-1239346793);
                if (num3 != null) {
                    androidx.compose.ui.graphics.painter.b bVarC112 = u0.e.c(num3.intValue(), c0VarR, 0);
                    long jM714getPrimaryText0d7_KjU112 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    androidx.compose.ui.a0.a aVar11115 = androidx.compose.ui.a0.E;
                    ni.o(bVarC112, null, i6.w(aVar11115, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU112, c0VarR, 440, 0);
                    l6.a(i6.i(aVar11115, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                }
                c0VarR.A();
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                y3 type0114 = intercomTheme.getTypography(c0VarR, i19).getType03();
                aVar = androidx.compose.ui.text.style.j.f42206b;
                function4 = function3;
                androidx.compose.ui.a0 a0Var116 = a0Var3;
                q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type0114, c0VarR, i12 & 14, 0, 130042);
                c0VarR = c0VarR;
                c0VarR.E(-1239330071);
                if (str3 == null) {
                    str4 = str3;
                    i20 = 6;
                } else {
                    i20 = 6;
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                    str4 = str3;
                    q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                    c0VarR = c0VarR;
                }
                c0VarR.A();
                c0VarR.E(-1239320282);
                if (function4 != null) {
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                    function4.invoke(c0VarR, 0);
                }
                c0VarR.A();
                c0VarR.o();
                function5 = function4;
                num4 = num3;
                a0Var4 = a0Var116;
            } else {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    function3 = null;
                }
                androidx.compose.ui.a0 a0VarF113 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                androidx.compose.ui.layout.a1 a1VarB113 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK113 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, a0VarF113);
                androidx.compose.ui.node.g.a aVar11116 = androidx.compose.ui.node.g.I;
                function0A = aVar11116.a();
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
                y7.n(c0VarD, a1VarB113, aVar11116.e());
                y7.n(c0VarD, b1VarK113, aVar11116.g());
                function2B = aVar11116.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN113, aVar11116.f());
                androidx.compose.foundation.layout.n0 n0Var113 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(-1239346793);
                if (num3 != null) {
                    androidx.compose.ui.graphics.painter.b bVarC113 = u0.e.c(num3.intValue(), c0VarR, 0);
                    long jM714getPrimaryText0d7_KjU113 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    androidx.compose.ui.a0.a aVar11117 = androidx.compose.ui.a0.E;
                    ni.o(bVarC113, null, i6.w(aVar11117, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU113, c0VarR, 440, 0);
                    l6.a(i6.i(aVar11117, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                }
                c0VarR.A();
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                y3 type0115 = intercomTheme.getTypography(c0VarR, i19).getType03();
                aVar = androidx.compose.ui.text.style.j.f42206b;
                function4 = function3;
                androidx.compose.ui.a0 a0Var117 = a0Var3;
                q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type0115, c0VarR, i12 & 14, 0, 130042);
                c0VarR = c0VarR;
                c0VarR.E(-1239330071);
                if (str3 == null) {
                    str4 = str3;
                    i20 = 6;
                } else {
                    i20 = 6;
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                    str4 = str3;
                    q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                    c0VarR = c0VarR;
                }
                c0VarR.A();
                c0VarR.E(-1239320282);
                if (function4 != null) {
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                    function4.invoke(c0VarR, 0);
                }
                c0VarR.A();
                c0VarR.o();
                function5 = function4;
                num4 = num3;
                a0Var4 = a0Var117;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        str2 = str;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                num2 = num;
                if (c0VarR.D(num2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((46811 & i12) == 9362) {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        function3 = null;
                    }
                    androidx.compose.ui.a0 a0VarF114 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                    androidx.compose.ui.layout.a1 a1VarB114 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK114 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, a0VarF114);
                    androidx.compose.ui.node.g.a aVar11118 = androidx.compose.ui.node.g.I;
                    function0A = aVar11118.a();
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
                    y7.n(c0VarD, a1VarB114, aVar11118.e());
                    y7.n(c0VarD, b1VarK114, aVar11118.g());
                    function2B = aVar11118.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN114, aVar11118.f());
                    androidx.compose.foundation.layout.n0 n0Var114 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(-1239346793);
                    if (num3 != null) {
                        androidx.compose.ui.graphics.painter.b bVarC114 = u0.e.c(num3.intValue(), c0VarR, 0);
                        long jM714getPrimaryText0d7_KjU114 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        androidx.compose.ui.a0.a aVar11119 = androidx.compose.ui.a0.E;
                        ni.o(bVarC114, null, i6.w(aVar11119, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU114, c0VarR, 440, 0);
                        l6.a(i6.i(aVar11119, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                    }
                    c0VarR.A();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    y3 type0116 = intercomTheme.getTypography(c0VarR, i19).getType03();
                    aVar = androidx.compose.ui.text.style.j.f42206b;
                    function4 = function3;
                    androidx.compose.ui.a0 a0Var118 = a0Var3;
                    q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type0116, c0VarR, i12 & 14, 0, 130042);
                    c0VarR = c0VarR;
                    c0VarR.E(-1239330071);
                    if (str3 == null) {
                        str4 = str3;
                        i20 = 6;
                    } else {
                        i20 = 6;
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                        str4 = str3;
                        q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                        c0VarR = c0VarR;
                    }
                    c0VarR.A();
                    c0VarR.E(-1239320282);
                    if (function4 != null) {
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                        function4.invoke(c0VarR, 0);
                    }
                    c0VarR.A();
                    c0VarR.o();
                    function5 = function4;
                    num4 = num3;
                    a0Var4 = a0Var118;
                } else {
                    if (i21 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        function3 = null;
                    }
                    androidx.compose.ui.a0 a0VarF115 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                    androidx.compose.ui.layout.a1 a1VarB115 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK115 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, a0VarF115);
                    androidx.compose.ui.node.g.a aVar111110 = androidx.compose.ui.node.g.I;
                    function0A = aVar111110.a();
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
                    y7.n(c0VarD, a1VarB115, aVar111110.e());
                    y7.n(c0VarD, b1VarK115, aVar111110.g());
                    function2B = aVar111110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN115, aVar111110.f());
                    androidx.compose.foundation.layout.n0 n0Var115 = androidx.compose.foundation.layout.n0.f16227a;
                    c0VarR.E(-1239346793);
                    if (num3 != null) {
                        androidx.compose.ui.graphics.painter.b bVarC115 = u0.e.c(num3.intValue(), c0VarR, 0);
                        long jM714getPrimaryText0d7_KjU115 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                        androidx.compose.ui.a0.a aVar111111 = androidx.compose.ui.a0.E;
                        ni.o(bVarC115, null, i6.w(aVar111111, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU115, c0VarR, 440, 0);
                        l6.a(i6.i(aVar111111, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                    }
                    c0VarR.A();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i19 = IntercomTheme.$stable;
                    y3 type0117 = intercomTheme.getTypography(c0VarR, i19).getType03();
                    aVar = androidx.compose.ui.text.style.j.f42206b;
                    function4 = function3;
                    androidx.compose.ui.a0 a0Var119 = a0Var3;
                    q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type0117, c0VarR, i12 & 14, 0, 130042);
                    c0VarR = c0VarR;
                    c0VarR.E(-1239330071);
                    if (str3 == null) {
                        str4 = str3;
                        i20 = 6;
                    } else {
                        i20 = 6;
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                        str4 = str3;
                        q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                        c0VarR = c0VarR;
                    }
                    c0VarR.A();
                    c0VarR.E(-1239320282);
                    if (function4 != null) {
                        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                        function4.invoke(c0VarR, 0);
                    }
                    c0VarR.A();
                    c0VarR.o();
                    function5 = function4;
                    num4 = num3;
                    a0Var4 = a0Var119;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function3 = function2;
            if ((46811 & i12) == 9362) {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    function3 = null;
                }
                androidx.compose.ui.a0 a0VarF116 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                androidx.compose.ui.layout.a1 a1VarB116 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK116 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, a0VarF116);
                androidx.compose.ui.node.g.a aVar111112 = androidx.compose.ui.node.g.I;
                function0A = aVar111112.a();
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
                y7.n(c0VarD, a1VarB116, aVar111112.e());
                y7.n(c0VarD, b1VarK116, aVar111112.g());
                function2B = aVar111112.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN116, aVar111112.f());
                androidx.compose.foundation.layout.n0 n0Var116 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(-1239346793);
                if (num3 != null) {
                    androidx.compose.ui.graphics.painter.b bVarC116 = u0.e.c(num3.intValue(), c0VarR, 0);
                    long jM714getPrimaryText0d7_KjU116 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    androidx.compose.ui.a0.a aVar111113 = androidx.compose.ui.a0.E;
                    ni.o(bVarC116, null, i6.w(aVar111113, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU116, c0VarR, 440, 0);
                    l6.a(i6.i(aVar111113, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                }
                c0VarR.A();
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                y3 type0118 = intercomTheme.getTypography(c0VarR, i19).getType03();
                aVar = androidx.compose.ui.text.style.j.f42206b;
                function4 = function3;
                androidx.compose.ui.a0 a0Var1110 = a0Var3;
                q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type0118, c0VarR, i12 & 14, 0, 130042);
                c0VarR = c0VarR;
                c0VarR.E(-1239330071);
                if (str3 == null) {
                    str4 = str3;
                    i20 = 6;
                } else {
                    i20 = 6;
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                    str4 = str3;
                    q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                    c0VarR = c0VarR;
                }
                c0VarR.A();
                c0VarR.E(-1239320282);
                if (function4 != null) {
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                    function4.invoke(c0VarR, 0);
                }
                c0VarR.A();
                c0VarR.o();
                function5 = function4;
                num4 = num3;
                a0Var4 = a0Var1110;
            } else {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    function3 = null;
                }
                androidx.compose.ui.a0 a0VarF117 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                androidx.compose.ui.layout.a1 a1VarB117 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK117 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, a0VarF117);
                androidx.compose.ui.node.g.a aVar111114 = androidx.compose.ui.node.g.I;
                function0A = aVar111114.a();
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
                y7.n(c0VarD, a1VarB117, aVar111114.e());
                y7.n(c0VarD, b1VarK117, aVar111114.g());
                function2B = aVar111114.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN117, aVar111114.f());
                androidx.compose.foundation.layout.n0 n0Var117 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(-1239346793);
                if (num3 != null) {
                    androidx.compose.ui.graphics.painter.b bVarC117 = u0.e.c(num3.intValue(), c0VarR, 0);
                    long jM714getPrimaryText0d7_KjU117 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    androidx.compose.ui.a0.a aVar111115 = androidx.compose.ui.a0.E;
                    ni.o(bVarC117, null, i6.w(aVar111115, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU117, c0VarR, 440, 0);
                    l6.a(i6.i(aVar111115, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                }
                c0VarR.A();
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                y3 type0119 = intercomTheme.getTypography(c0VarR, i19).getType03();
                aVar = androidx.compose.ui.text.style.j.f42206b;
                function4 = function3;
                androidx.compose.ui.a0 a0Var1111 = a0Var3;
                q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type0119, c0VarR, i12 & 14, 0, 130042);
                c0VarR = c0VarR;
                c0VarR.E(-1239330071);
                if (str3 == null) {
                    str4 = str3;
                    i20 = 6;
                } else {
                    i20 = 6;
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                    str4 = str3;
                    q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                    c0VarR = c0VarR;
                }
                c0VarR.A();
                c0VarR.E(-1239320282);
                if (function4 != null) {
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                    function4.invoke(c0VarR, 0);
                }
                c0VarR.A();
                c0VarR.o();
                function5 = function4;
                num4 = num3;
                a0Var4 = a0Var1111;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        num2 = num;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((57344 & i10) == 0) {
                function3 = function2;
                if (c0VarR.k0(function3)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((46811 & i12) == 9362) {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    function3 = null;
                }
                androidx.compose.ui.a0 a0VarF118 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                androidx.compose.ui.layout.a1 a1VarB118 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK118 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, a0VarF118);
                androidx.compose.ui.node.g.a aVar111116 = androidx.compose.ui.node.g.I;
                function0A = aVar111116.a();
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
                y7.n(c0VarD, a1VarB118, aVar111116.e());
                y7.n(c0VarD, b1VarK118, aVar111116.g());
                function2B = aVar111116.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN118, aVar111116.f());
                androidx.compose.foundation.layout.n0 n0Var118 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(-1239346793);
                if (num3 != null) {
                    androidx.compose.ui.graphics.painter.b bVarC118 = u0.e.c(num3.intValue(), c0VarR, 0);
                    long jM714getPrimaryText0d7_KjU118 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    androidx.compose.ui.a0.a aVar111117 = androidx.compose.ui.a0.E;
                    ni.o(bVarC118, null, i6.w(aVar111117, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU118, c0VarR, 440, 0);
                    l6.a(i6.i(aVar111117, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                }
                c0VarR.A();
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                y3 type01110 = intercomTheme.getTypography(c0VarR, i19).getType03();
                aVar = androidx.compose.ui.text.style.j.f42206b;
                function4 = function3;
                androidx.compose.ui.a0 a0Var1112 = a0Var3;
                q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type01110, c0VarR, i12 & 14, 0, 130042);
                c0VarR = c0VarR;
                c0VarR.E(-1239330071);
                if (str3 == null) {
                    str4 = str3;
                    i20 = 6;
                } else {
                    i20 = 6;
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                    str4 = str3;
                    q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                    c0VarR = c0VarR;
                }
                c0VarR.A();
                c0VarR.E(-1239320282);
                if (function4 != null) {
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                    function4.invoke(c0VarR, 0);
                }
                c0VarR.A();
                c0VarR.o();
                function5 = function4;
                num4 = num3;
                a0Var4 = a0Var1112;
            } else {
                if (i21 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    function3 = null;
                }
                androidx.compose.ui.a0 a0VarF119 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
                androidx.compose.ui.layout.a1 a1VarB119 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK119 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, a0VarF119);
                androidx.compose.ui.node.g.a aVar111118 = androidx.compose.ui.node.g.I;
                function0A = aVar111118.a();
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
                y7.n(c0VarD, a1VarB119, aVar111118.e());
                y7.n(c0VarD, b1VarK119, aVar111118.g());
                function2B = aVar111118.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN119, aVar111118.f());
                androidx.compose.foundation.layout.n0 n0Var119 = androidx.compose.foundation.layout.n0.f16227a;
                c0VarR.E(-1239346793);
                if (num3 != null) {
                    androidx.compose.ui.graphics.painter.b bVarC119 = u0.e.c(num3.intValue(), c0VarR, 0);
                    long jM714getPrimaryText0d7_KjU119 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    androidx.compose.ui.a0.a aVar111119 = androidx.compose.ui.a0.E;
                    ni.o(bVarC119, null, i6.w(aVar111119, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU119, c0VarR, 440, 0);
                    l6.a(i6.i(aVar111119, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
                }
                c0VarR.A();
                intercomTheme = IntercomTheme.INSTANCE;
                i19 = IntercomTheme.$stable;
                y3 type01111 = intercomTheme.getTypography(c0VarR, i19).getType03();
                aVar = androidx.compose.ui.text.style.j.f42206b;
                function4 = function3;
                androidx.compose.ui.a0 a0Var1113 = a0Var3;
                q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type01111, c0VarR, i12 & 14, 0, 130042);
                c0VarR = c0VarR;
                c0VarR.E(-1239330071);
                if (str3 == null) {
                    str4 = str3;
                    i20 = 6;
                } else {
                    i20 = 6;
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                    str4 = str3;
                    q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                    c0VarR = c0VarR;
                }
                c0VarR.A();
                c0VarR.E(-1239320282);
                if (function4 != null) {
                    l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                    function4.invoke(c0VarR, 0);
                }
                c0VarR.A();
                c0VarR.o();
                function5 = function4;
                num4 = num3;
                a0Var4 = a0Var1113;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function3 = function2;
        if ((46811 & i12) == 9362) {
            if (i21 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (i15 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i17 != 0) {
                function3 = null;
            }
            androidx.compose.ui.a0 a0VarF1110 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
            androidx.compose.ui.layout.a1 a1VarB1110 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK1110 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, a0VarF1110);
            androidx.compose.ui.node.g.a aVar1111110 = androidx.compose.ui.node.g.I;
            function0A = aVar1111110.a();
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
            y7.n(c0VarD, a1VarB1110, aVar1111110.e());
            y7.n(c0VarD, b1VarK1110, aVar1111110.g());
            function2B = aVar1111110.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN1110, aVar1111110.f());
            androidx.compose.foundation.layout.n0 n0Var1110 = androidx.compose.foundation.layout.n0.f16227a;
            c0VarR.E(-1239346793);
            if (num3 != null) {
                androidx.compose.ui.graphics.painter.b bVarC1110 = u0.e.c(num3.intValue(), c0VarR, 0);
                long jM714getPrimaryText0d7_KjU1110 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                androidx.compose.ui.a0.a aVar1111111 = androidx.compose.ui.a0.E;
                ni.o(bVarC1110, null, i6.w(aVar1111111, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU1110, c0VarR, 440, 0);
                l6.a(i6.i(aVar1111111, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
            }
            c0VarR.A();
            intercomTheme = IntercomTheme.INSTANCE;
            i19 = IntercomTheme.$stable;
            y3 type01112 = intercomTheme.getTypography(c0VarR, i19).getType03();
            aVar = androidx.compose.ui.text.style.j.f42206b;
            function4 = function3;
            androidx.compose.ui.a0 a0Var1114 = a0Var3;
            q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type01112, c0VarR, i12 & 14, 0, 130042);
            c0VarR = c0VarR;
            c0VarR.E(-1239330071);
            if (str3 == null) {
                str4 = str3;
                i20 = 6;
            } else {
                i20 = 6;
                l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                str4 = str3;
                q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                c0VarR = c0VarR;
            }
            c0VarR.A();
            c0VarR.E(-1239320282);
            if (function4 != null) {
                l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                function4.invoke(c0VarR, 0);
            }
            c0VarR.A();
            c0VarR.o();
            function5 = function4;
            num4 = num3;
            a0Var4 = a0Var1114;
        } else {
            if (i21 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (i15 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i17 != 0) {
                function3 = null;
            }
            androidx.compose.ui.a0 a0VarF1111 = i6.f(d5.r(a0Var3, androidx.compose.ui.unit.h.r(24)), 0.0f, 1, null);
            androidx.compose.ui.layout.a1 a1VarB1111 = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.m(), c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK1111 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1111 = androidx.compose.ui.m.n(c0VarR, a0VarF1111);
            androidx.compose.ui.node.g.a aVar1111112 = androidx.compose.ui.node.g.I;
            function0A = aVar1111112.a();
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
            y7.n(c0VarD, a1VarB1111, aVar1111112.e());
            y7.n(c0VarD, b1VarK1111, aVar1111112.g());
            function2B = aVar1111112.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN1111, aVar1111112.f());
            androidx.compose.foundation.layout.n0 n0Var1111 = androidx.compose.foundation.layout.n0.f16227a;
            c0VarR.E(-1239346793);
            if (num3 != null) {
                androidx.compose.ui.graphics.painter.b bVarC1111 = u0.e.c(num3.intValue(), c0VarR, 0);
                long jM714getPrimaryText0d7_KjU1111 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                androidx.compose.ui.a0.a aVar1111113 = androidx.compose.ui.a0.E;
                ni.o(bVarC1111, null, i6.w(aVar1111113, androidx.compose.ui.unit.h.r(32)), jM714getPrimaryText0d7_KjU1111, c0VarR, 440, 0);
                l6.a(i6.i(aVar1111113, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
            }
            c0VarR.A();
            intercomTheme = IntercomTheme.INSTANCE;
            i19 = IntercomTheme.$stable;
            y3 type01113 = intercomTheme.getTypography(c0VarR, i19).getType03();
            aVar = androidx.compose.ui.text.style.j.f42206b;
            function4 = function3;
            androidx.compose.ui.a0 a0Var1115 = a0Var3;
            q50.t(title, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, type01113, c0VarR, i12 & 14, 0, 130042);
            c0VarR = c0VarR;
            c0VarR.E(-1239330071);
            if (str3 == null) {
                str4 = str3;
                i20 = 6;
            } else {
                i20 = 6;
                l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(6)), c0VarR, 6);
                str4 = str3;
                q50.t(str4, null, intercomTheme.getColors(c0VarR, i19).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i19).getType04(), c0VarR, 0, 0, 130042);
                c0VarR = c0VarR;
            }
            c0VarR.A();
            c0VarR.E(-1239320282);
            if (function4 != null) {
                l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0VarR, i20);
                function4.invoke(c0VarR, 0);
            }
            c0VarR.A();
            c0VarR.o();
            function5 = function4;
            num4 = num3;
            a0Var4 = a0Var1115;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmptyStateKt.EmptyState$lambda$4(title, a0Var4, str4, num4, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyState$lambda$4(String title, androidx.compose.ui.a0 a0Var, String str, Integer num, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(title, "$title");
        EmptyState(title, a0Var, str, num, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void EmptyStatePreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1885515198);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$EmptyStateKt.INSTANCE.m123getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.f1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmptyStateKt.EmptyStatePreview$lambda$5(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyStatePreview$lambda$5(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        EmptyStatePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void EmptyStateWithOutlinedButtonPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-484307592);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$EmptyStateKt.INSTANCE.m126getLambda6$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.d1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmptyStateKt.EmptyStateWithOutlinedButtonPreview$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyStateWithOutlinedButtonPreview$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        EmptyStateWithOutlinedButtonPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
