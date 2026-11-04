package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
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
@SourceDebugExtension({"SMAP\nDayDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DayDivider.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/DayDividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,48:1\n113#2:49\n99#3,6:50\n106#3:86\n80#4,6:56\n87#4,3:71\n90#4,2:80\n94#4:85\n391#5,9:62\n400#5,3:82\n4360#6,6:74\n*S KotlinDebug\n*F\n+ 1 DayDivider.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/DayDividerKt\n*L\n30#1:49\n21#1:50,6\n21#1:86\n21#1:56,6\n21#1:71,3\n21#1:80,2\n21#1:85\n21#1:62,9\n21#1:82,3\n21#1:74,6\n*E\n"})
public final class DayDividerKt {
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:48:0x016e  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void DayDivider(@NotNull final String text, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.a0 a0Var2;
        androidx.compose.ui.a0 a0Var3;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0Var2;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(text, "text");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(600554765);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = i10 | (c0VarR.D(text) ? 4 : 2);
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
                androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
                androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                androidx.compose.ui.a0 a0VarH = i6.H(a0Var3, null, false, 3, null);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i14 = IntercomTheme.$stable;
                androidx.compose.ui.a0 a0VarS = d5.s(androidx.compose.foundation.v.c(a0VarH, intercomTheme.getColors(c0VarR, i14).m723getTimestampBackground0d7_KjU(), intercomTheme.getShapes(c0VarR, i14).m()), androidx.compose.ui.unit.h.r(12), androidx.compose.ui.unit.h.r(4));
                androidx.compose.ui.layout.a1 a1VarE = u5.e(fVarM, cVarQ, c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarS);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                function0A = aVar.a();
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
                y7.n(c0VarD, a1VarE, aVar.e());
                y7.n(c0VarD, b1VarK, aVar.g());
                function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar.f());
                y5 y5Var = y5.f16577a;
                c0Var2 = c0VarR;
                q50.t(text, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i14).getType04Point5(), c0Var2, i12 & 14, 0, 131070);
                c0Var2.o();
                a0Var2 = a0Var3;
            } else {
                c0VarR.u();
                c0Var2 = c0VarR;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.b0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DayDividerKt.DayDivider$lambda$1(text, a0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
            androidx.compose.foundation.layout.q.f fVarM2 = androidx.compose.foundation.layout.q.f16330a.m();
            androidx.compose.ui.e.c cVarQ2 = androidx.compose.ui.e.f37317a.q();
            androidx.compose.ui.a0 a0VarH2 = i6.H(a0Var3, null, false, 3, null);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            androidx.compose.ui.a0 a0VarS2 = d5.s(androidx.compose.foundation.v.c(a0VarH2, intercomTheme2.getColors(c0VarR, i15).m723getTimestampBackground0d7_KjU(), intercomTheme2.getShapes(c0VarR, i15).m()), androidx.compose.ui.unit.h.r(12), androidx.compose.ui.unit.h.r(4));
            androidx.compose.ui.layout.a1 a1VarE2 = u5.e(fVarM2, cVarQ2, c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarS2);
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
            y7.n(c0VarD, a1VarE2, aVar2.e());
            y7.n(c0VarD, b1VarK2, aVar2.g());
            function2B = aVar2.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN2, aVar2.f());
            y5 y5Var2 = y5.f16577a;
            c0Var2 = c0VarR;
            q50.t(text, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c0VarR, i15).getType04Point5(), c0Var2, i12 & 14, 0, 131070);
            c0Var2.o();
            a0Var2 = a0Var3;
        } else {
            if (i13 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            androidx.compose.foundation.layout.q.f fVarM3 = androidx.compose.foundation.layout.q.f16330a.m();
            androidx.compose.ui.e.c cVarQ3 = androidx.compose.ui.e.f37317a.q();
            androidx.compose.ui.a0 a0VarH3 = i6.H(a0Var3, null, false, 3, null);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            androidx.compose.ui.a0 a0VarS3 = d5.s(androidx.compose.foundation.v.c(a0VarH3, intercomTheme3.getColors(c0VarR, i16).m723getTimestampBackground0d7_KjU(), intercomTheme3.getShapes(c0VarR, i16).m()), androidx.compose.ui.unit.h.r(12), androidx.compose.ui.unit.h.r(4));
            androidx.compose.ui.layout.a1 a1VarE3 = u5.e(fVarM3, cVarQ3, c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarS3);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            function0A = aVar3.a();
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
            y7.n(c0VarD, a1VarE3, aVar3.e());
            y7.n(c0VarD, b1VarK3, aVar3.g());
            function2B = aVar3.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN3, aVar3.f());
            y5 y5Var3 = y5.f16577a;
            c0Var2 = c0VarR;
            q50.t(text, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c0VarR, i16).getType04Point5(), c0Var2, i12 & 14, 0, 131070);
            c0Var2.o();
            a0Var2 = a0Var3;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DayDividerKt.DayDivider$lambda$1(text, a0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DayDivider$lambda$1(String text, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(text, "$text");
        DayDivider(text, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void DayDividerPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(191155235);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DayDividerKt.INSTANCE.m282getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DayDividerKt.DayDividerPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DayDividerPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        DayDividerPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
