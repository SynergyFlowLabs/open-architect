package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.font.v0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCollectionRowComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionRowComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/CollectionRowComponentKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,107:1\n1282#2,6:108\n113#3:114\n113#3:227\n113#3:228\n113#3:229\n113#3:234\n113#3:239\n87#4:115\n84#4,9:116\n87#4:190\n84#4,9:191\n94#4:233\n94#4:243\n80#5,6:125\n87#5,3:140\n90#5,2:149\n80#5,6:163\n87#5,3:178\n90#5,2:187\n80#5,6:200\n87#5,3:215\n90#5,2:224\n94#5:232\n94#5:237\n94#5:242\n391#6,9:131\n400#6:151\n391#6,9:169\n400#6:189\n391#6,9:206\n400#6:226\n401#6,2:230\n401#6,2:235\n401#6,2:240\n4360#7,6:143\n4360#7,6:181\n4360#7,6:218\n99#8:152\n95#8,10:153\n106#8:238\n*S KotlinDebug\n*F\n+ 1 CollectionRowComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/CollectionRowComponentKt\n*L\n34#1:108,6\n35#1:114\n49#1:227\n56#1:228\n58#1:229\n62#1:234\n64#1:239\n31#1:115\n31#1:116,9\n40#1:190\n40#1:191,9\n40#1:233\n31#1:243\n31#1:125,6\n31#1:140,3\n31#1:149,2\n37#1:163,6\n37#1:178,3\n37#1:187,2\n40#1:200,6\n40#1:215,3\n40#1:224,2\n40#1:232\n37#1:237\n31#1:242\n31#1:131,9\n31#1:151\n37#1:169,9\n37#1:189\n40#1:206,9\n40#1:226\n40#1:230,2\n37#1:235,2\n31#1:240,2\n31#1:143,6\n37#1:181,6\n40#1:218,6\n37#1:152\n37#1:153,10\n37#1:238\n*E\n"})
public final class CollectionRowComponentKt {
    /* JADX WARN: Code duplicated, block: B:101:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    /* JADX WARN: Code duplicated, block: B:58:0x010e  */
    /* JADX WARN: Code duplicated, block: B:61:0x011a  */
    /* JADX WARN: Code duplicated, block: B:62:0x011e  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:67:0x014b  */
    /* JADX WARN: Code duplicated, block: B:70:0x018c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0198  */
    /* JADX WARN: Code duplicated, block: B:74:0x019c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:82:0x021a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0226  */
    /* JADX WARN: Code duplicated, block: B:86:0x022a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0249  */
    /* JADX WARN: Code duplicated, block: B:91:0x0257  */
    /* JADX WARN: Code duplicated, block: B:94:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:97:0x0354  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void CollectionRowComponent(@NotNull final CollectionRowData rowData, @NotNull final Function1<? super String, Unit> onClick, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        androidx.compose.ui.a0 a0Var3;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objI0;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.ui.a0.a aVar;
        int iHashCode2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        int iHashCode3;
        Function0<androidx.compose.ui.node.g> function0A3;
        androidx.compose.runtime.c0 c0VarD3;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3;
        androidx.compose.runtime.c0 c0Var2;
        int i13;
        final androidx.compose.ui.a0 a0Var4;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(rowData, "rowData");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-471072842);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(rowData) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.k0(onClick) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 896) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i12 & 731) == 146 || !c0VarR.d()) {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                androidx.compose.ui.a0 a0VarH = i6.h(a0Var3, 0.0f, 1, null);
                c0VarR.E(1498669980);
                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | z10;
                objI0 = c0VarR.i0();
                if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CollectionRowComponentKt.CollectionRowComponent$lambda$1$lambda$0(onClick, rowData);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                float f10 = 16;
                androidx.compose.ui.a0 a0VarV = d5.v(i1.j(a0VarH, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10), 0.0f, 0.0f, 12, null);
                androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY = qVar.y();
                androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0VarR, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarV);
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
                y7.n(c0VarD, a1VarB, aVar3.e());
                y7.n(c0VarD, b1VarK, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar3.f());
                androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                androidx.compose.ui.e.c cVarQ = aVar2.q();
                aVar = androidx.compose.ui.a0.E;
                a1 a1VarE = u5.e(qVar.w(), cVarQ, c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar);
                function0A2 = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarE, aVar3.e());
                y7.n(c0VarD2, b1VarK2, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN2, aVar3.f());
                androidx.compose.ui.a0 a0VarQ = x5.q(y5.f16577a, aVar, 1.0f, false, 2, null);
                a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(qVar.y(), aVar2.u(), c0VarR, 0);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarQ);
                function0A3 = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = y7.d(c0VarR);
                y7.n(c0VarD3, a1VarB2, aVar3.e());
                y7.n(c0VarD3, b1VarK3, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN3, aVar3.f());
                String titleText = rowData.getTitleText();
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i15 = IntercomTheme.$stable;
                androidx.compose.ui.a0 a0Var5 = a0Var3;
                q50.t(titleText, null, 0L, null, 0L, null, v0.f41742b.o(), null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i15).getType04Point5(), c0VarR, 1572864, 0, 131006);
                c0Var2 = c0VarR;
                if (rowData.getDescriptionVisibility() == 0 || StringsKt.w3(rowData.getDescriptionText())) {
                    i13 = 6;
                    c0Var2.E(-515673200);
                    l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(4)), c0Var2, 6);
                    c0Var2.A();
                } else {
                    c0Var2.E(-516077564);
                    l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(4)), c0Var2, 6);
                    i13 = 6;
                    q50.t(rowData.getDescriptionText(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 3, 0, null, intercomTheme.getTypography(c0Var2, i15).getType04Point5(), c0Var2, 0, 24960, 110590);
                    c0Var2 = c0Var2;
                    l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(8)), c0Var2, 6);
                    c0Var2.A();
                }
                ArticleCountComponentKt.ArticleCountComponent(null, rowData.getArticlesCount(), c0Var2, 0, 1);
                c0Var2.o();
                IntercomChevronKt.IntercomChevron(d5.t(aVar, androidx.compose.ui.unit.h.r(22), 0.0f, 2, null), c0Var2, i13, 0);
                c0Var2.o();
                IntercomDividerKt.IntercomDivider(d5.v(aVar, 0.0f, androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10), 0.0f, 9, null), c0Var2, i13, 0);
                c0Var2.o();
                a0Var4 = a0Var5;
            } else {
                c0VarR.u();
                c0Var2 = c0VarR;
                a0Var4 = a0Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.u
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CollectionRowComponentKt.CollectionRowComponent$lambda$5(rowData, onClick, a0Var4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        a0Var2 = a0Var;
        if ((i12 & 731) == 146) {
            if (i14 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            androidx.compose.ui.a0 a0VarH2 = i6.h(a0Var3, 0.0f, 1, null);
            c0VarR.E(1498669980);
            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | z10;
            objI0 = c0VarR.i0();
            if (z12) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CollectionRowComponentKt.CollectionRowComponent$lambda$1$lambda$0(onClick, rowData);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CollectionRowComponentKt.CollectionRowComponent$lambda$1$lambda$0(onClick, rowData);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            float f11 = 16;
            androidx.compose.ui.a0 a0VarV2 = d5.v(i1.j(a0VarH2, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(f11), androidx.compose.ui.unit.h.r(f11), 0.0f, 0.0f, 12, null);
            androidx.compose.foundation.layout.q qVar2 = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY2 = qVar2.y();
            androidx.compose.ui.e.a aVar4 = androidx.compose.ui.e.f37317a;
            a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(mVarY2, aVar4.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK4 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarV2);
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
            y7.n(c0VarD, a1VarB3, aVar5.e());
            y7.n(c0VarD, b1VarK4, aVar5.g());
            function2B = aVar5.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN4, aVar5.f());
            androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
            androidx.compose.ui.e.c cVarQ2 = aVar4.q();
            aVar = androidx.compose.ui.a0.E;
            a1 a1VarE2 = u5.e(qVar2.w(), cVarQ2, c0VarR, 48);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK5 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, aVar);
            function0A2 = aVar5.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarE2, aVar5.e());
            y7.n(c0VarD2, b1VarK5, aVar5.g());
            function2B2 = aVar5.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN5, aVar5.f());
            androidx.compose.ui.a0 a0VarQ2 = x5.q(y5.f16577a, aVar, 1.0f, false, 2, null);
            a1 a1VarB4 = androidx.compose.foundation.layout.j0.b(qVar2.y(), aVar4.u(), c0VarR, 0);
            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK6 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarQ2);
            function0A3 = aVar5.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A3);
            } else {
                c0VarR.l();
            }
            c0VarD3 = y7.d(c0VarR);
            y7.n(c0VarD3, a1VarB4, aVar5.e());
            y7.n(c0VarD3, b1VarK6, aVar5.g());
            function2B3 = aVar5.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN6, aVar5.f());
            String titleText2 = rowData.getTitleText();
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            androidx.compose.ui.a0 a0Var6 = a0Var3;
            q50.t(titleText2, null, 0L, null, 0L, null, v0.f41742b.o(), null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c0VarR, i16).getType04Point5(), c0VarR, 1572864, 0, 131006);
            c0Var2 = c0VarR;
            if (rowData.getDescriptionVisibility() == 0) {
                i13 = 6;
                c0Var2.E(-515673200);
                l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(4)), c0Var2, 6);
                c0Var2.A();
            } else {
                i13 = 6;
                c0Var2.E(-515673200);
                l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(4)), c0Var2, 6);
                c0Var2.A();
            }
            ArticleCountComponentKt.ArticleCountComponent(null, rowData.getArticlesCount(), c0Var2, 0, 1);
            c0Var2.o();
            IntercomChevronKt.IntercomChevron(d5.t(aVar, androidx.compose.ui.unit.h.r(22), 0.0f, 2, null), c0Var2, i13, 0);
            c0Var2.o();
            IntercomDividerKt.IntercomDivider(d5.v(aVar, 0.0f, androidx.compose.ui.unit.h.r(f11), androidx.compose.ui.unit.h.r(f11), 0.0f, 9, null), c0Var2, i13, 0);
            c0Var2.o();
            a0Var4 = a0Var6;
        } else {
            if (i14 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            androidx.compose.ui.a0 a0VarH3 = i6.h(a0Var3, 0.0f, 1, null);
            c0VarR.E(1498669980);
            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i12 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | z10;
            objI0 = c0VarR.i0();
            if (z12) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CollectionRowComponentKt.CollectionRowComponent$lambda$1$lambda$0(onClick, rowData);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CollectionRowComponentKt.CollectionRowComponent$lambda$1$lambda$0(onClick, rowData);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            float f12 = 16;
            androidx.compose.ui.a0 a0VarV3 = d5.v(i1.j(a0VarH3, false, null, null, null, (Function0) objI0, 15, null), androidx.compose.ui.unit.h.r(f12), androidx.compose.ui.unit.h.r(f12), 0.0f, 0.0f, 12, null);
            androidx.compose.foundation.layout.q qVar3 = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.foundation.layout.q.m mVarY3 = qVar3.y();
            androidx.compose.ui.e.a aVar6 = androidx.compose.ui.e.f37317a;
            a1 a1VarB5 = androidx.compose.foundation.layout.j0.b(mVarY3, aVar6.u(), c0VarR, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK7 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarV3);
            androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
            function0A = aVar7.a();
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
            y7.n(c0VarD, a1VarB5, aVar7.e());
            y7.n(c0VarD, b1VarK7, aVar7.g());
            function2B = aVar7.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN7, aVar7.f());
            androidx.compose.foundation.layout.n0 n0Var3 = androidx.compose.foundation.layout.n0.f16227a;
            androidx.compose.ui.e.c cVarQ3 = aVar6.q();
            aVar = androidx.compose.ui.a0.E;
            a1 a1VarE3 = u5.e(qVar3.w(), cVarQ3, c0VarR, 48);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK8 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, aVar);
            function0A2 = aVar7.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarE3, aVar7.e());
            y7.n(c0VarD2, b1VarK8, aVar7.g());
            function2B2 = aVar7.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN8, aVar7.f());
            androidx.compose.ui.a0 a0VarQ3 = x5.q(y5.f16577a, aVar, 1.0f, false, 2, null);
            a1 a1VarB6 = androidx.compose.foundation.layout.j0.b(qVar3.y(), aVar6.u(), c0VarR, 0);
            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK9 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarQ3);
            function0A3 = aVar7.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A3);
            } else {
                c0VarR.l();
            }
            c0VarD3 = y7.d(c0VarR);
            y7.n(c0VarD3, a1VarB6, aVar7.e());
            y7.n(c0VarD3, b1VarK9, aVar7.g());
            function2B3 = aVar7.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN9, aVar7.f());
            String titleText3 = rowData.getTitleText();
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i17 = IntercomTheme.$stable;
            androidx.compose.ui.a0 a0Var7 = a0Var3;
            q50.t(titleText3, null, 0L, null, 0L, null, v0.f41742b.o(), null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c0VarR, i17).getType04Point5(), c0VarR, 1572864, 0, 131006);
            c0Var2 = c0VarR;
            if (rowData.getDescriptionVisibility() == 0) {
                i13 = 6;
                c0Var2.E(-515673200);
                l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(4)), c0Var2, 6);
                c0Var2.A();
            } else {
                i13 = 6;
                c0Var2.E(-515673200);
                l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(4)), c0Var2, 6);
                c0Var2.A();
            }
            ArticleCountComponentKt.ArticleCountComponent(null, rowData.getArticlesCount(), c0Var2, 0, 1);
            c0Var2.o();
            IntercomChevronKt.IntercomChevron(d5.t(aVar, androidx.compose.ui.unit.h.r(22), 0.0f, 2, null), c0Var2, i13, 0);
            c0Var2.o();
            IntercomDividerKt.IntercomDivider(d5.v(aVar, 0.0f, androidx.compose.ui.unit.h.r(f12), androidx.compose.ui.unit.h.r(f12), 0.0f, 9, null), c0Var2, i13, 0);
            c0Var2.o();
            a0Var4 = a0Var7;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CollectionRowComponentKt.CollectionRowComponent$lambda$5(rowData, onClick, a0Var4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CollectionRowComponent$lambda$1$lambda$0(Function1 onClick, CollectionRowData rowData) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        Intrinsics.checkNotNullParameter(rowData, "$rowData");
        onClick.invoke(rowData.getId());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CollectionRowComponent$lambda$5(CollectionRowData rowData, Function1 onClick, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(rowData, "$rowData");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        CollectionRowComponent(rowData, onClick, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void RowPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2042373209);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CollectionRowComponentKt.INSTANCE.m347getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CollectionRowComponentKt.RowPreview$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowPreview$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        RowPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void RowWithNoDescriptionPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-613238090);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CollectionRowComponentKt.INSTANCE.m349getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CollectionRowComponentKt.RowWithNoDescriptionPreview$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowWithNoDescriptionPreview$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        RowWithNoDescriptionPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
