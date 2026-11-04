package com.planner5d.library.spaces.view.dashboard;

import android.graphics.Bitmap;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.layout.a1;
import androidx.media3.exoplayer.a5;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nSpacesDashboardTopPart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesDashboardTopPart.kt\ncom/planner5d/library/spaces/view/dashboard/SpacesDashboardTopPartKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,70:1\n1282#2,6:71\n1282#2,6:77\n1282#2,6:83\n99#3:89\n95#3,10:90\n106#3:259\n80#4,6:100\n87#4,3:115\n90#4,2:124\n80#4,6:137\n87#4,3:152\n90#4,2:161\n94#4:166\n80#4,6:184\n87#4,3:199\n90#4,2:208\n94#4:213\n80#4,6:225\n87#4,3:240\n90#4,2:249\n94#4:254\n94#4:258\n391#5,9:106\n400#5:126\n391#5,9:143\n400#5,3:163\n391#5,9:190\n400#5,3:210\n391#5,9:231\n400#5,3:251\n401#5,2:256\n4360#6,6:118\n4360#6,6:155\n4360#6,6:202\n4360#6,6:243\n87#7:127\n84#7,9:128\n94#7:167\n87#7:174\n84#7,9:175\n94#7:214\n87#7:215\n84#7,9:216\n94#7:255\n113#8:168\n113#8:169\n188#8:170\n53#9,3:171\n*S KotlinDebug\n*F\n+ 1 SpacesDashboardTopPart.kt\ncom/planner5d/library/spaces/view/dashboard/SpacesDashboardTopPartKt\n*L\n26#1:71,6\n27#1:77,6\n28#1:83,6\n30#1:89\n30#1:90,10\n30#1:259\n30#1:100,6\n30#1:115,3\n30#1:124,2\n31#1:137,6\n31#1:152,3\n31#1:161,2\n31#1:166\n38#1:184,6\n38#1:199,3\n38#1:208,2\n38#1:213\n61#1:225,6\n61#1:240,3\n61#1:249,2\n61#1:254\n30#1:258\n30#1:106,9\n30#1:126\n31#1:143,9\n31#1:163,3\n38#1:190,9\n38#1:210,3\n61#1:231,9\n61#1:251,3\n30#1:256,2\n30#1:118,6\n31#1:155,6\n38#1:202,6\n61#1:243,6\n31#1:127\n31#1:128,9\n31#1:167\n38#1:174\n38#1:175,9\n38#1:214\n61#1:215\n61#1:216,9\n61#1:255\n50#1:168\n52#1:169\n52#1:170\n52#1:171,3\n*E\n"})
public final class c0 {
    /* JADX WARN: Code duplicated, block: B:101:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:104:0x0216  */
    /* JADX WARN: Code duplicated, block: B:107:0x0222  */
    /* JADX WARN: Code duplicated, block: B:108:0x0226  */
    /* JADX WARN: Code duplicated, block: B:111:0x0245  */
    /* JADX WARN: Code duplicated, block: B:113:0x0253  */
    /* JADX WARN: Code duplicated, block: B:116:0x0289  */
    /* JADX WARN: Code duplicated, block: B:118:0x0299  */
    /* JADX WARN: Code duplicated, block: B:121:0x0340  */
    /* JADX WARN: Code duplicated, block: B:124:0x034c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0350  */
    /* JADX WARN: Code duplicated, block: B:128:0x036f  */
    /* JADX WARN: Code duplicated, block: B:130:0x037d  */
    /* JADX WARN: Code duplicated, block: B:133:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:135:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:138:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:139:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:142:0x041e  */
    /* JADX WARN: Code duplicated, block: B:144:0x042c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0454  */
    /* JADX WARN: Code duplicated, block: B:152:0x0463  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110  */
    /* JADX WARN: Code duplicated, block: B:82:0x0114  */
    /* JADX WARN: Code duplicated, block: B:84:0x0126  */
    /* JADX WARN: Code duplicated, block: B:86:0x0138  */
    /* JADX WARN: Code duplicated, block: B:89:0x0140  */
    /* JADX WARN: Code duplicated, block: B:92:0x0176  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:96:0x0186  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a5  */
    @androidx.compose.runtime.o
    @d1.c(backgroundColor = 4294309365L, showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void e(@Nullable Bitmap bitmap, boolean z10, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Bitmap bitmap2;
        int i12;
        boolean z11;
        int i13;
        Function0<Unit> function3;
        int i14;
        int i15;
        Function0<Unit> function4;
        int i16;
        int i17;
        Function0<Unit> function5;
        int i18;
        Bitmap bitmap3;
        Function0<Unit> function6;
        Function0<Unit> function7;
        Function0<Unit> function8;
        androidx.compose.ui.e.a aVar;
        androidx.compose.ui.a0.a aVar2;
        androidx.compose.foundation.layout.q qVar;
        int iHashCode;
        androidx.compose.ui.node.g.a aVar3;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        int iHashCode2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        int i19;
        int iHashCode3;
        Function0<androidx.compose.ui.node.g> function0A3;
        androidx.compose.runtime.c0 c0VarD3;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3;
        final Function0<Unit> function9;
        final Function0<Unit> function10;
        final Function0<Unit> function11;
        int iHashCode4;
        Function0<androidx.compose.ui.node.g> function0A4;
        androidx.compose.runtime.c0 c0VarD4;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4;
        Object objI0;
        Object objI1;
        Object objI2;
        s5 s5VarT;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(839576949);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
            bitmap2 = bitmap;
        } else if ((i10 & 6) == 0) {
            bitmap2 = bitmap;
            i12 = (c0VarR.k0(bitmap2) ? 4 : 2) | i10;
        } else {
            bitmap2 = bitmap;
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 48) == 0) {
                z11 = z10;
                i12 |= c0VarR.G(z11) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & a5.S0) == 0) {
                    function3 = function0;
                    if (c0VarR.k0(function3)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        function4 = function1;
                        if (c0VarR.k0(function4)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            function5 = function2;
                            if (c0VarR.k0(function5)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i12 & 9363) == 9362 || !c0VarR.d()) {
                            if (i20 != 0) {
                                bitmap3 = null;
                            } else {
                                bitmap3 = bitmap2;
                            }
                            if (i21 != 0) {
                                z11 = false;
                            }
                            if (i13 != 0) {
                                c0VarR.E(-689613989);
                                objI2 = c0VarR.i0();
                                if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return c0.f();
                                        }
                                    };
                                    c0VarR.Y(objI2);
                                }
                                c0VarR.A();
                                function6 = (Function0) objI2;
                            } else {
                                function6 = function3;
                            }
                            if (i15 != 0) {
                                c0VarR.E(-689612933);
                                objI1 = c0VarR.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return c0.h();
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                c0VarR.A();
                                function7 = (Function0) objI1;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                c0VarR.E(-689611813);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return c0.i();
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                function8 = (Function0) objI0;
                            } else {
                                function8 = function5;
                            }
                            if (m0.l0()) {
                                m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                            }
                            aVar = androidx.compose.ui.e.f37317a;
                            androidx.compose.ui.e.c cVarQ = aVar.q();
                            aVar2 = androidx.compose.ui.a0.E;
                            qVar = androidx.compose.foundation.layout.q.f16330a;
                            a1 a1VarE = u5.e(qVar.w(), cVarQ, c0VarR, 48);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar2);
                            aVar3 = androidx.compose.ui.node.g.I;
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
                            y7.n(c0VarD, a1VarE, aVar3.e());
                            y7.n(c0VarD, b1VarK, aVar3.g());
                            function2B = aVar3.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN, aVar3.f());
                            y5 y5Var = y5.f16577a;
                            androidx.compose.ui.a0 a0VarJ = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                            a1 a1VarB = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK2 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarJ);
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
                            y7.n(c0VarD2, a1VarB, aVar3.e());
                            y7.n(c0VarD2, b1VarK2, aVar3.g());
                            function2B2 = aVar3.b();
                            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                c0VarD2.Y(Integer.valueOf(iHashCode2));
                                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                            }
                            y7.n(c0VarD2, a0VarN2, aVar3.f());
                            n0 n0Var = n0.f16227a;
                            x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                            c0VarR.o();
                            float fB = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                            float fB2 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                            float fB3 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                            if (z11) {
                                c0VarR.E(648460991);
                                i19 = de.b.f.f271670yd;
                            } else {
                                c0VarR.E(648462436);
                                i19 = de.b.f.Kd;
                            }
                            float fB4 = u0.f.b(i19, c0VarR, 0);
                            c0VarR.A();
                            androidx.compose.ui.a0 a0VarU = d5.u(aVar2, fB3, fB, fB4, fB2);
                            androidx.compose.foundation.shape.n nVarH = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                            float fB5 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                            float f10 = 0;
                            float fR = androidx.compose.ui.unit.h.r(f10);
                            androidx.compose.ui.a0 a0VarQ = x5.q(y5Var, i1.j(androidx.compose.ui.draw.x.a(a0VarU, nVarH, new androidx.compose.ui.graphics.shadow.j(fB5, s0.b(436207616), fR, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f10))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                            a1 a1VarB2 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
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
                            v.b(c0VarR, 0);
                            c0VarR.o();
                            c0VarR.E(648476468);
                            if (!z11) {
                                androidx.compose.ui.a0 a0VarV = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                                a1 a1VarB3 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                                iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                                b1 b1VarK4 = c0VarR.k();
                                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarV);
                                function0A4 = aVar3.a();
                                if (c0VarR.S() == null) {
                                    androidx.compose.runtime.v.r();
                                }
                                c0VarR.q();
                                if (c0VarR.P()) {
                                    c0VarR.q0(function0A4);
                                } else {
                                    c0VarR.l();
                                }
                                c0VarD4 = y7.d(c0VarR);
                                y7.n(c0VarD4, a1VarB3, aVar3.e());
                                y7.n(c0VarD4, b1VarK4, aVar3.g());
                                function2B4 = aVar3.b();
                                if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iHashCode4))) {
                                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                                }
                                y7.n(c0VarD4, a0VarN4, aVar3.f());
                                e0.b(c0VarR, 0);
                                c0VarR.o();
                            }
                            c0VarR.A();
                            c0VarR.o();
                            if (m0.l0()) {
                                m0.z0();
                            }
                            function9 = function6;
                            function10 = function7;
                            function11 = function8;
                        } else {
                            c0VarR.u();
                            bitmap3 = bitmap2;
                            function9 = function3;
                            function10 = function4;
                            function11 = function5;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final Bitmap bitmap4 = bitmap3;
                            final boolean z12 = z11;
                            s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return c0.g(bitmap4, z12, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 24576;
                    function5 = function2;
                    if ((i12 & 9363) == 9362) {
                        if (i20 != 0) {
                            bitmap3 = null;
                        } else {
                            bitmap3 = bitmap2;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        }
                        if (i13 != 0) {
                            c0VarR.E(-689613989);
                            objI2 = c0VarR.i0();
                            if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.f();
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            c0VarR.A();
                            function6 = (Function0) objI2;
                        } else {
                            function6 = function3;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-689612933);
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.h();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            c0VarR.A();
                            function7 = (Function0) objI1;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            c0VarR.E(-689611813);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.i();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            function8 = (Function0) objI0;
                        } else {
                            function8 = function5;
                        }
                        if (m0.l0()) {
                            m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                        }
                        aVar = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ2 = aVar.q();
                        aVar2 = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE2 = u5.e(qVar.w(), cVarQ2, c0VarR, 48);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, aVar2);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, a1VarE2, aVar3.e());
                        y7.n(c0VarD, b1VarK5, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN5, aVar3.f());
                        y5 y5Var2 = y5.f16577a;
                        androidx.compose.ui.a0 a0VarJ2 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                        a1 a1VarB4 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK6 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarJ2);
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
                        y7.n(c0VarD2, a1VarB4, aVar3.e());
                        y7.n(c0VarD2, b1VarK6, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN6, aVar3.f());
                        n0 n0Var2 = n0.f16227a;
                        x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                        c0VarR.o();
                        float fB6 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB7 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB8 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                        if (z11) {
                            c0VarR.E(648460991);
                            i19 = de.b.f.f271670yd;
                        } else {
                            c0VarR.E(648462436);
                            i19 = de.b.f.Kd;
                        }
                        float fB9 = u0.f.b(i19, c0VarR, 0);
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarU2 = d5.u(aVar2, fB8, fB6, fB9, fB7);
                        androidx.compose.foundation.shape.n nVarH2 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                        float fB10 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                        float f11 = 0;
                        float fR2 = androidx.compose.ui.unit.h.r(f11);
                        androidx.compose.ui.a0 a0VarQ2 = x5.q(y5Var2, i1.j(androidx.compose.ui.draw.x.a(a0VarU2, nVarH2, new androidx.compose.ui.graphics.shadow.j(fB10, s0.b(436207616), fR2, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f11))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                        a1 a1VarB5 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK7 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarQ2);
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
                        y7.n(c0VarD3, a1VarB5, aVar3.e());
                        y7.n(c0VarD3, b1VarK7, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN7, aVar3.f());
                        v.b(c0VarR, 0);
                        c0VarR.o();
                        c0VarR.E(648476468);
                        if (!z11) {
                            androidx.compose.ui.a0 a0VarV2 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                            a1 a1VarB6 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK8 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarV2);
                            function0A4 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A4);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD4 = y7.d(c0VarR);
                            y7.n(c0VarD4, a1VarB6, aVar3.e());
                            y7.n(c0VarD4, b1VarK8, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN8, aVar3.f());
                            e0.b(c0VarR, 0);
                            c0VarR.o();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        function9 = function6;
                        function10 = function7;
                        function11 = function8;
                    } else {
                        if (i20 != 0) {
                            bitmap3 = null;
                        } else {
                            bitmap3 = bitmap2;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        }
                        if (i13 != 0) {
                            c0VarR.E(-689613989);
                            objI2 = c0VarR.i0();
                            if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.f();
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            c0VarR.A();
                            function6 = (Function0) objI2;
                        } else {
                            function6 = function3;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-689612933);
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.h();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            c0VarR.A();
                            function7 = (Function0) objI1;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            c0VarR.E(-689611813);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.i();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            function8 = (Function0) objI0;
                        } else {
                            function8 = function5;
                        }
                        if (m0.l0()) {
                            m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                        }
                        aVar = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ3 = aVar.q();
                        aVar2 = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE3 = u5.e(qVar.w(), cVarQ3, c0VarR, 48);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK9 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, aVar2);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, b1VarK9, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN9, aVar3.f());
                        y5 y5Var3 = y5.f16577a;
                        androidx.compose.ui.a0 a0VarJ3 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                        a1 a1VarB7 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK10 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarJ3);
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
                        y7.n(c0VarD2, a1VarB7, aVar3.e());
                        y7.n(c0VarD2, b1VarK10, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN10, aVar3.f());
                        n0 n0Var3 = n0.f16227a;
                        x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                        c0VarR.o();
                        float fB11 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB12 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB13 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                        if (z11) {
                            c0VarR.E(648460991);
                            i19 = de.b.f.f271670yd;
                        } else {
                            c0VarR.E(648462436);
                            i19 = de.b.f.Kd;
                        }
                        float fB14 = u0.f.b(i19, c0VarR, 0);
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarU3 = d5.u(aVar2, fB13, fB11, fB14, fB12);
                        androidx.compose.foundation.shape.n nVarH3 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                        float fB15 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                        float f12 = 0;
                        float fR3 = androidx.compose.ui.unit.h.r(f12);
                        androidx.compose.ui.a0 a0VarQ3 = x5.q(y5Var3, i1.j(androidx.compose.ui.draw.x.a(a0VarU3, nVarH3, new androidx.compose.ui.graphics.shadow.j(fB15, s0.b(436207616), fR3, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f12))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                        a1 a1VarB8 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarQ3);
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
                        y7.n(c0VarD3, a1VarB8, aVar3.e());
                        y7.n(c0VarD3, b1VarK11, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN11, aVar3.f());
                        v.b(c0VarR, 0);
                        c0VarR.o();
                        c0VarR.E(648476468);
                        if (!z11) {
                            androidx.compose.ui.a0 a0VarV3 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                            a1 a1VarB9 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK12 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarV3);
                            function0A4 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A4);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD4 = y7.d(c0VarR);
                            y7.n(c0VarD4, a1VarB9, aVar3.e());
                            y7.n(c0VarD4, b1VarK12, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN12, aVar3.f());
                            e0.b(c0VarR, 0);
                            c0VarR.o();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        function9 = function6;
                        function10 = function7;
                        function11 = function8;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final Bitmap bitmap5 = bitmap3;
                        final boolean z13 = z11;
                        s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return c0.g(bitmap5, z13, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                function4 = function1;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        function5 = function2;
                        if (c0VarR.k0(function5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) == 9362) {
                        if (i20 != 0) {
                            bitmap3 = null;
                        } else {
                            bitmap3 = bitmap2;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        }
                        if (i13 != 0) {
                            c0VarR.E(-689613989);
                            objI2 = c0VarR.i0();
                            if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.f();
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            c0VarR.A();
                            function6 = (Function0) objI2;
                        } else {
                            function6 = function3;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-689612933);
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.h();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            c0VarR.A();
                            function7 = (Function0) objI1;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            c0VarR.E(-689611813);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.i();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            function8 = (Function0) objI0;
                        } else {
                            function8 = function5;
                        }
                        if (m0.l0()) {
                            m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                        }
                        aVar = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ4 = aVar.q();
                        aVar2 = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE4 = u5.e(qVar.w(), cVarQ4, c0VarR, 48);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK13 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, aVar2);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, a1VarE4, aVar3.e());
                        y7.n(c0VarD, b1VarK13, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN13, aVar3.f());
                        y5 y5Var4 = y5.f16577a;
                        androidx.compose.ui.a0 a0VarJ4 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                        a1 a1VarB10 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK14 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarJ4);
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
                        y7.n(c0VarD2, a1VarB10, aVar3.e());
                        y7.n(c0VarD2, b1VarK14, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN14, aVar3.f());
                        n0 n0Var4 = n0.f16227a;
                        x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                        c0VarR.o();
                        float fB16 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB17 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB18 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                        if (z11) {
                            c0VarR.E(648460991);
                            i19 = de.b.f.f271670yd;
                        } else {
                            c0VarR.E(648462436);
                            i19 = de.b.f.Kd;
                        }
                        float fB19 = u0.f.b(i19, c0VarR, 0);
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarU4 = d5.u(aVar2, fB18, fB16, fB19, fB17);
                        androidx.compose.foundation.shape.n nVarH4 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                        float fB110 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                        float f13 = 0;
                        float fR4 = androidx.compose.ui.unit.h.r(f13);
                        androidx.compose.ui.a0 a0VarQ4 = x5.q(y5Var4, i1.j(androidx.compose.ui.draw.x.a(a0VarU4, nVarH4, new androidx.compose.ui.graphics.shadow.j(fB110, s0.b(436207616), fR4, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f13))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                        a1 a1VarB11 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK15 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarQ4);
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
                        y7.n(c0VarD3, a1VarB11, aVar3.e());
                        y7.n(c0VarD3, b1VarK15, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN15, aVar3.f());
                        v.b(c0VarR, 0);
                        c0VarR.o();
                        c0VarR.E(648476468);
                        if (!z11) {
                            androidx.compose.ui.a0 a0VarV4 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                            a1 a1VarB12 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK16 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarV4);
                            function0A4 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A4);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD4 = y7.d(c0VarR);
                            y7.n(c0VarD4, a1VarB12, aVar3.e());
                            y7.n(c0VarD4, b1VarK16, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN16, aVar3.f());
                            e0.b(c0VarR, 0);
                            c0VarR.o();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        function9 = function6;
                        function10 = function7;
                        function11 = function8;
                    } else {
                        if (i20 != 0) {
                            bitmap3 = null;
                        } else {
                            bitmap3 = bitmap2;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        }
                        if (i13 != 0) {
                            c0VarR.E(-689613989);
                            objI2 = c0VarR.i0();
                            if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.f();
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            c0VarR.A();
                            function6 = (Function0) objI2;
                        } else {
                            function6 = function3;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-689612933);
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.h();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            c0VarR.A();
                            function7 = (Function0) objI1;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            c0VarR.E(-689611813);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.i();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            function8 = (Function0) objI0;
                        } else {
                            function8 = function5;
                        }
                        if (m0.l0()) {
                            m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                        }
                        aVar = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ5 = aVar.q();
                        aVar2 = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE5 = u5.e(qVar.w(), cVarQ5, c0VarR, 48);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK17 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, aVar2);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, a1VarE5, aVar3.e());
                        y7.n(c0VarD, b1VarK17, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN17, aVar3.f());
                        y5 y5Var5 = y5.f16577a;
                        androidx.compose.ui.a0 a0VarJ5 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                        a1 a1VarB13 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK18 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarJ5);
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
                        y7.n(c0VarD2, a1VarB13, aVar3.e());
                        y7.n(c0VarD2, b1VarK18, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN18, aVar3.f());
                        n0 n0Var5 = n0.f16227a;
                        x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                        c0VarR.o();
                        float fB111 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB112 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB113 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                        if (z11) {
                            c0VarR.E(648460991);
                            i19 = de.b.f.f271670yd;
                        } else {
                            c0VarR.E(648462436);
                            i19 = de.b.f.Kd;
                        }
                        float fB114 = u0.f.b(i19, c0VarR, 0);
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarU5 = d5.u(aVar2, fB113, fB111, fB114, fB112);
                        androidx.compose.foundation.shape.n nVarH5 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                        float fB115 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                        float f14 = 0;
                        float fR5 = androidx.compose.ui.unit.h.r(f14);
                        androidx.compose.ui.a0 a0VarQ5 = x5.q(y5Var5, i1.j(androidx.compose.ui.draw.x.a(a0VarU5, nVarH5, new androidx.compose.ui.graphics.shadow.j(fB115, s0.b(436207616), fR5, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f14))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                        a1 a1VarB14 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK19 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarQ5);
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
                        y7.n(c0VarD3, a1VarB14, aVar3.e());
                        y7.n(c0VarD3, b1VarK19, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN19, aVar3.f());
                        v.b(c0VarR, 0);
                        c0VarR.o();
                        c0VarR.E(648476468);
                        if (!z11) {
                            androidx.compose.ui.a0 a0VarV5 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                            a1 a1VarB15 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK110 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, a0VarV5);
                            function0A4 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A4);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD4 = y7.d(c0VarR);
                            y7.n(c0VarD4, a1VarB15, aVar3.e());
                            y7.n(c0VarD4, b1VarK110, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN110, aVar3.f());
                            e0.b(c0VarR, 0);
                            c0VarR.o();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        function9 = function6;
                        function10 = function7;
                        function11 = function8;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final Bitmap bitmap6 = bitmap3;
                        final boolean z14 = z11;
                        s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return c0.g(bitmap6, z14, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function5 = function2;
                if ((i12 & 9363) == 9362) {
                    if (i20 != 0) {
                        bitmap3 = null;
                    } else {
                        bitmap3 = bitmap2;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    }
                    if (i13 != 0) {
                        c0VarR.E(-689613989);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.f();
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        function6 = (Function0) objI2;
                    } else {
                        function6 = function3;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-689612933);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.h();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        function7 = (Function0) objI1;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        c0VarR.E(-689611813);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.i();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function8 = (Function0) objI0;
                    } else {
                        function8 = function5;
                    }
                    if (m0.l0()) {
                        m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ6 = aVar.q();
                    aVar2 = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE6 = u5.e(qVar.w(), cVarQ6, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE6, aVar3.e());
                    y7.n(c0VarD, b1VarK111, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN111, aVar3.f());
                    y5 y5Var6 = y5.f16577a;
                    androidx.compose.ui.a0 a0VarJ6 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                    a1 a1VarB16 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarJ6);
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
                    y7.n(c0VarD2, a1VarB16, aVar3.e());
                    y7.n(c0VarD2, b1VarK112, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN112, aVar3.f());
                    n0 n0Var6 = n0.f16227a;
                    x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                    c0VarR.o();
                    float fB116 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB117 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB118 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                    if (z11) {
                        c0VarR.E(648460991);
                        i19 = de.b.f.f271670yd;
                    } else {
                        c0VarR.E(648462436);
                        i19 = de.b.f.Kd;
                    }
                    float fB119 = u0.f.b(i19, c0VarR, 0);
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarU6 = d5.u(aVar2, fB118, fB116, fB119, fB117);
                    androidx.compose.foundation.shape.n nVarH6 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                    float fB1110 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                    float f15 = 0;
                    float fR6 = androidx.compose.ui.unit.h.r(f15);
                    androidx.compose.ui.a0 a0VarQ6 = x5.q(y5Var6, i1.j(androidx.compose.ui.draw.x.a(a0VarU6, nVarH6, new androidx.compose.ui.graphics.shadow.j(fB1110, s0.b(436207616), fR6, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f15))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                    a1 a1VarB17 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK113 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, a0VarQ6);
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
                    y7.n(c0VarD3, a1VarB17, aVar3.e());
                    y7.n(c0VarD3, b1VarK113, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN113, aVar3.f());
                    v.b(c0VarR, 0);
                    c0VarR.o();
                    c0VarR.E(648476468);
                    if (!z11) {
                        androidx.compose.ui.a0 a0VarV6 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                        a1 a1VarB18 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK114 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, a0VarV6);
                        function0A4 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A4);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD4 = y7.d(c0VarR);
                        y7.n(c0VarD4, a1VarB18, aVar3.e());
                        y7.n(c0VarD4, b1VarK114, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN114, aVar3.f());
                        e0.b(c0VarR, 0);
                        c0VarR.o();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function9 = function6;
                    function10 = function7;
                    function11 = function8;
                } else {
                    if (i20 != 0) {
                        bitmap3 = null;
                    } else {
                        bitmap3 = bitmap2;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    }
                    if (i13 != 0) {
                        c0VarR.E(-689613989);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.f();
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        function6 = (Function0) objI2;
                    } else {
                        function6 = function3;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-689612933);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.h();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        function7 = (Function0) objI1;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        c0VarR.E(-689611813);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.i();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function8 = (Function0) objI0;
                    } else {
                        function8 = function5;
                    }
                    if (m0.l0()) {
                        m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ7 = aVar.q();
                    aVar2 = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE7 = u5.e(qVar.w(), cVarQ7, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK115 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE7, aVar3.e());
                    y7.n(c0VarD, b1VarK115, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN115, aVar3.f());
                    y5 y5Var7 = y5.f16577a;
                    androidx.compose.ui.a0 a0VarJ7 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                    a1 a1VarB19 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK116 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, a0VarJ7);
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
                    y7.n(c0VarD2, a1VarB19, aVar3.e());
                    y7.n(c0VarD2, b1VarK116, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN116, aVar3.f());
                    n0 n0Var7 = n0.f16227a;
                    x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                    c0VarR.o();
                    float fB1111 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB1112 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB1113 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                    if (z11) {
                        c0VarR.E(648460991);
                        i19 = de.b.f.f271670yd;
                    } else {
                        c0VarR.E(648462436);
                        i19 = de.b.f.Kd;
                    }
                    float fB1114 = u0.f.b(i19, c0VarR, 0);
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarU7 = d5.u(aVar2, fB1113, fB1111, fB1114, fB1112);
                    androidx.compose.foundation.shape.n nVarH7 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                    float fB1115 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                    float f16 = 0;
                    float fR7 = androidx.compose.ui.unit.h.r(f16);
                    androidx.compose.ui.a0 a0VarQ7 = x5.q(y5Var7, i1.j(androidx.compose.ui.draw.x.a(a0VarU7, nVarH7, new androidx.compose.ui.graphics.shadow.j(fB1115, s0.b(436207616), fR7, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f16))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                    a1 a1VarB110 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK117 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, a0VarQ7);
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
                    y7.n(c0VarD3, a1VarB110, aVar3.e());
                    y7.n(c0VarD3, b1VarK117, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN117, aVar3.f());
                    v.b(c0VarR, 0);
                    c0VarR.o();
                    c0VarR.E(648476468);
                    if (!z11) {
                        androidx.compose.ui.a0 a0VarV7 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                        a1 a1VarB111 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK118 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, a0VarV7);
                        function0A4 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A4);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD4 = y7.d(c0VarR);
                        y7.n(c0VarD4, a1VarB111, aVar3.e());
                        y7.n(c0VarD4, b1VarK118, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN118, aVar3.f());
                        e0.b(c0VarR, 0);
                        c0VarR.o();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function9 = function6;
                    function10 = function7;
                    function11 = function8;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final Bitmap bitmap7 = bitmap3;
                    final boolean z15 = z11;
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return c0.g(bitmap7, z15, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            function3 = function0;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    function4 = function1;
                    if (c0VarR.k0(function4)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        function5 = function2;
                        if (c0VarR.k0(function5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) == 9362) {
                        if (i20 != 0) {
                            bitmap3 = null;
                        } else {
                            bitmap3 = bitmap2;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        }
                        if (i13 != 0) {
                            c0VarR.E(-689613989);
                            objI2 = c0VarR.i0();
                            if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.f();
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            c0VarR.A();
                            function6 = (Function0) objI2;
                        } else {
                            function6 = function3;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-689612933);
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.h();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            c0VarR.A();
                            function7 = (Function0) objI1;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            c0VarR.E(-689611813);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.i();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            function8 = (Function0) objI0;
                        } else {
                            function8 = function5;
                        }
                        if (m0.l0()) {
                            m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                        }
                        aVar = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ8 = aVar.q();
                        aVar2 = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE8 = u5.e(qVar.w(), cVarQ8, c0VarR, 48);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK119 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, aVar2);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, a1VarE8, aVar3.e());
                        y7.n(c0VarD, b1VarK119, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN119, aVar3.f());
                        y5 y5Var8 = y5.f16577a;
                        androidx.compose.ui.a0 a0VarJ8 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                        a1 a1VarB112 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1110 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, a0VarJ8);
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
                        y7.n(c0VarD2, a1VarB112, aVar3.e());
                        y7.n(c0VarD2, b1VarK1110, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN1110, aVar3.f());
                        n0 n0Var8 = n0.f16227a;
                        x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                        c0VarR.o();
                        float fB1116 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB1117 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB1118 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                        if (z11) {
                            c0VarR.E(648460991);
                            i19 = de.b.f.f271670yd;
                        } else {
                            c0VarR.E(648462436);
                            i19 = de.b.f.Kd;
                        }
                        float fB1119 = u0.f.b(i19, c0VarR, 0);
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarU8 = d5.u(aVar2, fB1118, fB1116, fB1119, fB1117);
                        androidx.compose.foundation.shape.n nVarH8 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                        float fB11110 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                        float f17 = 0;
                        float fR8 = androidx.compose.ui.unit.h.r(f17);
                        androidx.compose.ui.a0 a0VarQ8 = x5.q(y5Var8, i1.j(androidx.compose.ui.draw.x.a(a0VarU8, nVarH8, new androidx.compose.ui.graphics.shadow.j(fB11110, s0.b(436207616), fR8, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f17))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                        a1 a1VarB113 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1111 = androidx.compose.ui.m.n(c0VarR, a0VarQ8);
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
                        y7.n(c0VarD3, a1VarB113, aVar3.e());
                        y7.n(c0VarD3, b1VarK1111, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN1111, aVar3.f());
                        v.b(c0VarR, 0);
                        c0VarR.o();
                        c0VarR.E(648476468);
                        if (!z11) {
                            androidx.compose.ui.a0 a0VarV8 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                            a1 a1VarB114 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK1112 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN1112 = androidx.compose.ui.m.n(c0VarR, a0VarV8);
                            function0A4 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A4);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD4 = y7.d(c0VarR);
                            y7.n(c0VarD4, a1VarB114, aVar3.e());
                            y7.n(c0VarD4, b1VarK1112, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN1112, aVar3.f());
                            e0.b(c0VarR, 0);
                            c0VarR.o();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        function9 = function6;
                        function10 = function7;
                        function11 = function8;
                    } else {
                        if (i20 != 0) {
                            bitmap3 = null;
                        } else {
                            bitmap3 = bitmap2;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        }
                        if (i13 != 0) {
                            c0VarR.E(-689613989);
                            objI2 = c0VarR.i0();
                            if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.f();
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            c0VarR.A();
                            function6 = (Function0) objI2;
                        } else {
                            function6 = function3;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-689612933);
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.h();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            c0VarR.A();
                            function7 = (Function0) objI1;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            c0VarR.E(-689611813);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.i();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            function8 = (Function0) objI0;
                        } else {
                            function8 = function5;
                        }
                        if (m0.l0()) {
                            m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                        }
                        aVar = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ9 = aVar.q();
                        aVar2 = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE9 = u5.e(qVar.w(), cVarQ9, c0VarR, 48);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1113 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1113 = androidx.compose.ui.m.n(c0VarR, aVar2);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, a1VarE9, aVar3.e());
                        y7.n(c0VarD, b1VarK1113, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN1113, aVar3.f());
                        y5 y5Var9 = y5.f16577a;
                        androidx.compose.ui.a0 a0VarJ9 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                        a1 a1VarB115 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1114 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1114 = androidx.compose.ui.m.n(c0VarR, a0VarJ9);
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
                        y7.n(c0VarD2, a1VarB115, aVar3.e());
                        y7.n(c0VarD2, b1VarK1114, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN1114, aVar3.f());
                        n0 n0Var9 = n0.f16227a;
                        x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                        c0VarR.o();
                        float fB11111 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB11112 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB11113 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                        if (z11) {
                            c0VarR.E(648460991);
                            i19 = de.b.f.f271670yd;
                        } else {
                            c0VarR.E(648462436);
                            i19 = de.b.f.Kd;
                        }
                        float fB11114 = u0.f.b(i19, c0VarR, 0);
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarU9 = d5.u(aVar2, fB11113, fB11111, fB11114, fB11112);
                        androidx.compose.foundation.shape.n nVarH9 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                        float fB11115 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                        float f18 = 0;
                        float fR9 = androidx.compose.ui.unit.h.r(f18);
                        androidx.compose.ui.a0 a0VarQ9 = x5.q(y5Var9, i1.j(androidx.compose.ui.draw.x.a(a0VarU9, nVarH9, new androidx.compose.ui.graphics.shadow.j(fB11115, s0.b(436207616), fR9, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f18))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                        a1 a1VarB116 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1115 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1115 = androidx.compose.ui.m.n(c0VarR, a0VarQ9);
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
                        y7.n(c0VarD3, a1VarB116, aVar3.e());
                        y7.n(c0VarD3, b1VarK1115, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN1115, aVar3.f());
                        v.b(c0VarR, 0);
                        c0VarR.o();
                        c0VarR.E(648476468);
                        if (!z11) {
                            androidx.compose.ui.a0 a0VarV9 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                            a1 a1VarB117 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK1116 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN1116 = androidx.compose.ui.m.n(c0VarR, a0VarV9);
                            function0A4 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A4);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD4 = y7.d(c0VarR);
                            y7.n(c0VarD4, a1VarB117, aVar3.e());
                            y7.n(c0VarD4, b1VarK1116, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN1116, aVar3.f());
                            e0.b(c0VarR, 0);
                            c0VarR.o();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        function9 = function6;
                        function10 = function7;
                        function11 = function8;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final Bitmap bitmap8 = bitmap3;
                        final boolean z16 = z11;
                        s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return c0.g(bitmap8, z16, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function5 = function2;
                if ((i12 & 9363) == 9362) {
                    if (i20 != 0) {
                        bitmap3 = null;
                    } else {
                        bitmap3 = bitmap2;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    }
                    if (i13 != 0) {
                        c0VarR.E(-689613989);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.f();
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        function6 = (Function0) objI2;
                    } else {
                        function6 = function3;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-689612933);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.h();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        function7 = (Function0) objI1;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        c0VarR.E(-689611813);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.i();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function8 = (Function0) objI0;
                    } else {
                        function8 = function5;
                    }
                    if (m0.l0()) {
                        m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ10 = aVar.q();
                    aVar2 = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE10 = u5.e(qVar.w(), cVarQ10, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1117 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1117 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE10, aVar3.e());
                    y7.n(c0VarD, b1VarK1117, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1117, aVar3.f());
                    y5 y5Var10 = y5.f16577a;
                    androidx.compose.ui.a0 a0VarJ10 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                    a1 a1VarB118 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1118 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1118 = androidx.compose.ui.m.n(c0VarR, a0VarJ10);
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
                    y7.n(c0VarD2, a1VarB118, aVar3.e());
                    y7.n(c0VarD2, b1VarK1118, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN1118, aVar3.f());
                    n0 n0Var10 = n0.f16227a;
                    x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                    c0VarR.o();
                    float fB11116 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB11117 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB11118 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                    if (z11) {
                        c0VarR.E(648460991);
                        i19 = de.b.f.f271670yd;
                    } else {
                        c0VarR.E(648462436);
                        i19 = de.b.f.Kd;
                    }
                    float fB11119 = u0.f.b(i19, c0VarR, 0);
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarU10 = d5.u(aVar2, fB11118, fB11116, fB11119, fB11117);
                    androidx.compose.foundation.shape.n nVarH10 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                    float fB111110 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                    float f19 = 0;
                    float fR10 = androidx.compose.ui.unit.h.r(f19);
                    androidx.compose.ui.a0 a0VarQ10 = x5.q(y5Var10, i1.j(androidx.compose.ui.draw.x.a(a0VarU10, nVarH10, new androidx.compose.ui.graphics.shadow.j(fB111110, s0.b(436207616), fR10, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f19))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                    a1 a1VarB119 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1119 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1119 = androidx.compose.ui.m.n(c0VarR, a0VarQ10);
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
                    y7.n(c0VarD3, a1VarB119, aVar3.e());
                    y7.n(c0VarD3, b1VarK1119, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN1119, aVar3.f());
                    v.b(c0VarR, 0);
                    c0VarR.o();
                    c0VarR.E(648476468);
                    if (!z11) {
                        androidx.compose.ui.a0 a0VarV10 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                        a1 a1VarB1110 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11110 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11110 = androidx.compose.ui.m.n(c0VarR, a0VarV10);
                        function0A4 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A4);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD4 = y7.d(c0VarR);
                        y7.n(c0VarD4, a1VarB1110, aVar3.e());
                        y7.n(c0VarD4, b1VarK11110, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN11110, aVar3.f());
                        e0.b(c0VarR, 0);
                        c0VarR.o();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function9 = function6;
                    function10 = function7;
                    function11 = function8;
                } else {
                    if (i20 != 0) {
                        bitmap3 = null;
                    } else {
                        bitmap3 = bitmap2;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    }
                    if (i13 != 0) {
                        c0VarR.E(-689613989);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.f();
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        function6 = (Function0) objI2;
                    } else {
                        function6 = function3;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-689612933);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.h();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        function7 = (Function0) objI1;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        c0VarR.E(-689611813);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.i();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function8 = (Function0) objI0;
                    } else {
                        function8 = function5;
                    }
                    if (m0.l0()) {
                        m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ11 = aVar.q();
                    aVar2 = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE11 = u5.e(qVar.w(), cVarQ11, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE11, aVar3.e());
                    y7.n(c0VarD, b1VarK11111, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11111, aVar3.f());
                    y5 y5Var11 = y5.f16577a;
                    androidx.compose.ui.a0 a0VarJ11 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                    a1 a1VarB1111 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11112 = androidx.compose.ui.m.n(c0VarR, a0VarJ11);
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
                    y7.n(c0VarD2, a1VarB1111, aVar3.e());
                    y7.n(c0VarD2, b1VarK11112, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11112, aVar3.f());
                    n0 n0Var11 = n0.f16227a;
                    x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                    c0VarR.o();
                    float fB111111 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB111112 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB111113 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                    if (z11) {
                        c0VarR.E(648460991);
                        i19 = de.b.f.f271670yd;
                    } else {
                        c0VarR.E(648462436);
                        i19 = de.b.f.Kd;
                    }
                    float fB111114 = u0.f.b(i19, c0VarR, 0);
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarU11 = d5.u(aVar2, fB111113, fB111111, fB111114, fB111112);
                    androidx.compose.foundation.shape.n nVarH11 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                    float fB111115 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                    float f110 = 0;
                    float fR11 = androidx.compose.ui.unit.h.r(f110);
                    androidx.compose.ui.a0 a0VarQ11 = x5.q(y5Var11, i1.j(androidx.compose.ui.draw.x.a(a0VarU11, nVarH11, new androidx.compose.ui.graphics.shadow.j(fB111115, s0.b(436207616), fR11, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f110))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                    a1 a1VarB1112 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11113 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11113 = androidx.compose.ui.m.n(c0VarR, a0VarQ11);
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
                    y7.n(c0VarD3, a1VarB1112, aVar3.e());
                    y7.n(c0VarD3, b1VarK11113, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN11113, aVar3.f());
                    v.b(c0VarR, 0);
                    c0VarR.o();
                    c0VarR.E(648476468);
                    if (!z11) {
                        androidx.compose.ui.a0 a0VarV11 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                        a1 a1VarB1113 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11114 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11114 = androidx.compose.ui.m.n(c0VarR, a0VarV11);
                        function0A4 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A4);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD4 = y7.d(c0VarR);
                        y7.n(c0VarD4, a1VarB1113, aVar3.e());
                        y7.n(c0VarD4, b1VarK11114, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN11114, aVar3.f());
                        e0.b(c0VarR, 0);
                        c0VarR.o();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function9 = function6;
                    function10 = function7;
                    function11 = function8;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final Bitmap bitmap9 = bitmap3;
                    final boolean z17 = z11;
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return c0.g(bitmap9, z17, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            function4 = function1;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    function5 = function2;
                    if (c0VarR.k0(function5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) == 9362) {
                    if (i20 != 0) {
                        bitmap3 = null;
                    } else {
                        bitmap3 = bitmap2;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    }
                    if (i13 != 0) {
                        c0VarR.E(-689613989);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.f();
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        function6 = (Function0) objI2;
                    } else {
                        function6 = function3;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-689612933);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.h();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        function7 = (Function0) objI1;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        c0VarR.E(-689611813);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.i();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function8 = (Function0) objI0;
                    } else {
                        function8 = function5;
                    }
                    if (m0.l0()) {
                        m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ12 = aVar.q();
                    aVar2 = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE12 = u5.e(qVar.w(), cVarQ12, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11115 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11115 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE12, aVar3.e());
                    y7.n(c0VarD, b1VarK11115, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11115, aVar3.f());
                    y5 y5Var12 = y5.f16577a;
                    androidx.compose.ui.a0 a0VarJ12 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                    a1 a1VarB1114 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11116 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11116 = androidx.compose.ui.m.n(c0VarR, a0VarJ12);
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
                    y7.n(c0VarD2, a1VarB1114, aVar3.e());
                    y7.n(c0VarD2, b1VarK11116, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11116, aVar3.f());
                    n0 n0Var12 = n0.f16227a;
                    x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                    c0VarR.o();
                    float fB111116 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB111117 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB111118 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                    if (z11) {
                        c0VarR.E(648460991);
                        i19 = de.b.f.f271670yd;
                    } else {
                        c0VarR.E(648462436);
                        i19 = de.b.f.Kd;
                    }
                    float fB111119 = u0.f.b(i19, c0VarR, 0);
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarU12 = d5.u(aVar2, fB111118, fB111116, fB111119, fB111117);
                    androidx.compose.foundation.shape.n nVarH12 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                    float fB1111110 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                    float f111 = 0;
                    float fR12 = androidx.compose.ui.unit.h.r(f111);
                    androidx.compose.ui.a0 a0VarQ12 = x5.q(y5Var12, i1.j(androidx.compose.ui.draw.x.a(a0VarU12, nVarH12, new androidx.compose.ui.graphics.shadow.j(fB1111110, s0.b(436207616), fR12, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f111))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                    a1 a1VarB1115 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11117 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11117 = androidx.compose.ui.m.n(c0VarR, a0VarQ12);
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
                    y7.n(c0VarD3, a1VarB1115, aVar3.e());
                    y7.n(c0VarD3, b1VarK11117, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN11117, aVar3.f());
                    v.b(c0VarR, 0);
                    c0VarR.o();
                    c0VarR.E(648476468);
                    if (!z11) {
                        androidx.compose.ui.a0 a0VarV12 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                        a1 a1VarB1116 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11118 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11118 = androidx.compose.ui.m.n(c0VarR, a0VarV12);
                        function0A4 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A4);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD4 = y7.d(c0VarR);
                        y7.n(c0VarD4, a1VarB1116, aVar3.e());
                        y7.n(c0VarD4, b1VarK11118, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN11118, aVar3.f());
                        e0.b(c0VarR, 0);
                        c0VarR.o();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function9 = function6;
                    function10 = function7;
                    function11 = function8;
                } else {
                    if (i20 != 0) {
                        bitmap3 = null;
                    } else {
                        bitmap3 = bitmap2;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    }
                    if (i13 != 0) {
                        c0VarR.E(-689613989);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.f();
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        function6 = (Function0) objI2;
                    } else {
                        function6 = function3;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-689612933);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.h();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        function7 = (Function0) objI1;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        c0VarR.E(-689611813);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.i();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function8 = (Function0) objI0;
                    } else {
                        function8 = function5;
                    }
                    if (m0.l0()) {
                        m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ13 = aVar.q();
                    aVar2 = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE13 = u5.e(qVar.w(), cVarQ13, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11119 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11119 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE13, aVar3.e());
                    y7.n(c0VarD, b1VarK11119, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11119, aVar3.f());
                    y5 y5Var13 = y5.f16577a;
                    androidx.compose.ui.a0 a0VarJ13 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                    a1 a1VarB1117 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111110 = androidx.compose.ui.m.n(c0VarR, a0VarJ13);
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
                    y7.n(c0VarD2, a1VarB1117, aVar3.e());
                    y7.n(c0VarD2, b1VarK111110, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN111110, aVar3.f());
                    n0 n0Var13 = n0.f16227a;
                    x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                    c0VarR.o();
                    float fB1111111 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB1111112 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB1111113 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                    if (z11) {
                        c0VarR.E(648460991);
                        i19 = de.b.f.f271670yd;
                    } else {
                        c0VarR.E(648462436);
                        i19 = de.b.f.Kd;
                    }
                    float fB1111114 = u0.f.b(i19, c0VarR, 0);
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarU13 = d5.u(aVar2, fB1111113, fB1111111, fB1111114, fB1111112);
                    androidx.compose.foundation.shape.n nVarH13 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                    float fB1111115 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                    float f112 = 0;
                    float fR13 = androidx.compose.ui.unit.h.r(f112);
                    androidx.compose.ui.a0 a0VarQ13 = x5.q(y5Var13, i1.j(androidx.compose.ui.draw.x.a(a0VarU13, nVarH13, new androidx.compose.ui.graphics.shadow.j(fB1111115, s0.b(436207616), fR13, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f112))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                    a1 a1VarB1118 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111111 = androidx.compose.ui.m.n(c0VarR, a0VarQ13);
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
                    y7.n(c0VarD3, a1VarB1118, aVar3.e());
                    y7.n(c0VarD3, b1VarK111111, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN111111, aVar3.f());
                    v.b(c0VarR, 0);
                    c0VarR.o();
                    c0VarR.E(648476468);
                    if (!z11) {
                        androidx.compose.ui.a0 a0VarV13 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                        a1 a1VarB1119 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK111112 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN111112 = androidx.compose.ui.m.n(c0VarR, a0VarV13);
                        function0A4 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A4);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD4 = y7.d(c0VarR);
                        y7.n(c0VarD4, a1VarB1119, aVar3.e());
                        y7.n(c0VarD4, b1VarK111112, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN111112, aVar3.f());
                        e0.b(c0VarR, 0);
                        c0VarR.o();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function9 = function6;
                    function10 = function7;
                    function11 = function8;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final Bitmap bitmap10 = bitmap3;
                    final boolean z18 = z11;
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return c0.g(bitmap10, z18, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function5 = function2;
            if ((i12 & 9363) == 9362) {
                if (i20 != 0) {
                    bitmap3 = null;
                } else {
                    bitmap3 = bitmap2;
                }
                if (i21 != 0) {
                    z11 = false;
                }
                if (i13 != 0) {
                    c0VarR.E(-689613989);
                    objI2 = c0VarR.i0();
                    if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.f();
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    function6 = (Function0) objI2;
                } else {
                    function6 = function3;
                }
                if (i15 != 0) {
                    c0VarR.E(-689612933);
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.h();
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    function7 = (Function0) objI1;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    c0VarR.E(-689611813);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.i();
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    function8 = (Function0) objI0;
                } else {
                    function8 = function5;
                }
                if (m0.l0()) {
                    m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                }
                aVar = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ14 = aVar.q();
                aVar2 = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE14 = u5.e(qVar.w(), cVarQ14, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111113 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111113 = androidx.compose.ui.m.n(c0VarR, aVar2);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE14, aVar3.e());
                y7.n(c0VarD, b1VarK111113, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111113, aVar3.f());
                y5 y5Var14 = y5.f16577a;
                androidx.compose.ui.a0 a0VarJ14 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                a1 a1VarB11110 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111114 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111114 = androidx.compose.ui.m.n(c0VarR, a0VarJ14);
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
                y7.n(c0VarD2, a1VarB11110, aVar3.e());
                y7.n(c0VarD2, b1VarK111114, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111114, aVar3.f());
                n0 n0Var14 = n0.f16227a;
                x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                c0VarR.o();
                float fB1111116 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB1111117 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB1111118 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                if (z11) {
                    c0VarR.E(648460991);
                    i19 = de.b.f.f271670yd;
                } else {
                    c0VarR.E(648462436);
                    i19 = de.b.f.Kd;
                }
                float fB1111119 = u0.f.b(i19, c0VarR, 0);
                c0VarR.A();
                androidx.compose.ui.a0 a0VarU14 = d5.u(aVar2, fB1111118, fB1111116, fB1111119, fB1111117);
                androidx.compose.foundation.shape.n nVarH14 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                float fB11111110 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                float f113 = 0;
                float fR14 = androidx.compose.ui.unit.h.r(f113);
                androidx.compose.ui.a0 a0VarQ14 = x5.q(y5Var14, i1.j(androidx.compose.ui.draw.x.a(a0VarU14, nVarH14, new androidx.compose.ui.graphics.shadow.j(fB11111110, s0.b(436207616), fR14, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f113))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                a1 a1VarB11111 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111115 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111115 = androidx.compose.ui.m.n(c0VarR, a0VarQ14);
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
                y7.n(c0VarD3, a1VarB11111, aVar3.e());
                y7.n(c0VarD3, b1VarK111115, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN111115, aVar3.f());
                v.b(c0VarR, 0);
                c0VarR.o();
                c0VarR.E(648476468);
                if (!z11) {
                    androidx.compose.ui.a0 a0VarV14 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                    a1 a1VarB11112 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111116 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111116 = androidx.compose.ui.m.n(c0VarR, a0VarV14);
                    function0A4 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A4);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD4 = y7.d(c0VarR);
                    y7.n(c0VarD4, a1VarB11112, aVar3.e());
                    y7.n(c0VarD4, b1VarK111116, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN111116, aVar3.f());
                    e0.b(c0VarR, 0);
                    c0VarR.o();
                }
                c0VarR.A();
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                function9 = function6;
                function10 = function7;
                function11 = function8;
            } else {
                if (i20 != 0) {
                    bitmap3 = null;
                } else {
                    bitmap3 = bitmap2;
                }
                if (i21 != 0) {
                    z11 = false;
                }
                if (i13 != 0) {
                    c0VarR.E(-689613989);
                    objI2 = c0VarR.i0();
                    if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.f();
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    function6 = (Function0) objI2;
                } else {
                    function6 = function3;
                }
                if (i15 != 0) {
                    c0VarR.E(-689612933);
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.h();
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    function7 = (Function0) objI1;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    c0VarR.E(-689611813);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.i();
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    function8 = (Function0) objI0;
                } else {
                    function8 = function5;
                }
                if (m0.l0()) {
                    m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                }
                aVar = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ15 = aVar.q();
                aVar2 = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE15 = u5.e(qVar.w(), cVarQ15, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111117 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111117 = androidx.compose.ui.m.n(c0VarR, aVar2);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE15, aVar3.e());
                y7.n(c0VarD, b1VarK111117, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111117, aVar3.f());
                y5 y5Var15 = y5.f16577a;
                androidx.compose.ui.a0 a0VarJ15 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                a1 a1VarB11113 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111118 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111118 = androidx.compose.ui.m.n(c0VarR, a0VarJ15);
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
                y7.n(c0VarD2, a1VarB11113, aVar3.e());
                y7.n(c0VarD2, b1VarK111118, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111118, aVar3.f());
                n0 n0Var15 = n0.f16227a;
                x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                c0VarR.o();
                float fB11111111 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB11111112 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB11111113 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                if (z11) {
                    c0VarR.E(648460991);
                    i19 = de.b.f.f271670yd;
                } else {
                    c0VarR.E(648462436);
                    i19 = de.b.f.Kd;
                }
                float fB11111114 = u0.f.b(i19, c0VarR, 0);
                c0VarR.A();
                androidx.compose.ui.a0 a0VarU15 = d5.u(aVar2, fB11111113, fB11111111, fB11111114, fB11111112);
                androidx.compose.foundation.shape.n nVarH15 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                float fB11111115 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                float f114 = 0;
                float fR15 = androidx.compose.ui.unit.h.r(f114);
                androidx.compose.ui.a0 a0VarQ15 = x5.q(y5Var15, i1.j(androidx.compose.ui.draw.x.a(a0VarU15, nVarH15, new androidx.compose.ui.graphics.shadow.j(fB11111115, s0.b(436207616), fR15, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f114))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                a1 a1VarB11114 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111119 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111119 = androidx.compose.ui.m.n(c0VarR, a0VarQ15);
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
                y7.n(c0VarD3, a1VarB11114, aVar3.e());
                y7.n(c0VarD3, b1VarK111119, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN111119, aVar3.f());
                v.b(c0VarR, 0);
                c0VarR.o();
                c0VarR.E(648476468);
                if (!z11) {
                    androidx.compose.ui.a0 a0VarV15 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                    a1 a1VarB11115 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111110 = androidx.compose.ui.m.n(c0VarR, a0VarV15);
                    function0A4 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A4);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD4 = y7.d(c0VarR);
                    y7.n(c0VarD4, a1VarB11115, aVar3.e());
                    y7.n(c0VarD4, b1VarK1111110, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN1111110, aVar3.f());
                    e0.b(c0VarR, 0);
                    c0VarR.o();
                }
                c0VarR.A();
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                function9 = function6;
                function10 = function7;
                function11 = function8;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final Bitmap bitmap11 = bitmap3;
                final boolean z19 = z11;
                s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return c0.g(bitmap11, z19, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        z11 = z10;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & a5.S0) == 0) {
                function3 = function0;
                if (c0VarR.k0(function3)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    function4 = function1;
                    if (c0VarR.k0(function4)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        function5 = function2;
                        if (c0VarR.k0(function5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) == 9362) {
                        if (i20 != 0) {
                            bitmap3 = null;
                        } else {
                            bitmap3 = bitmap2;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        }
                        if (i13 != 0) {
                            c0VarR.E(-689613989);
                            objI2 = c0VarR.i0();
                            if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.f();
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            c0VarR.A();
                            function6 = (Function0) objI2;
                        } else {
                            function6 = function3;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-689612933);
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.h();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            c0VarR.A();
                            function7 = (Function0) objI1;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            c0VarR.E(-689611813);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.i();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            function8 = (Function0) objI0;
                        } else {
                            function8 = function5;
                        }
                        if (m0.l0()) {
                            m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                        }
                        aVar = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ16 = aVar.q();
                        aVar2 = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE16 = u5.e(qVar.w(), cVarQ16, c0VarR, 48);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111111 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1111111 = androidx.compose.ui.m.n(c0VarR, aVar2);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, a1VarE16, aVar3.e());
                        y7.n(c0VarD, b1VarK1111111, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN1111111, aVar3.f());
                        y5 y5Var16 = y5.f16577a;
                        androidx.compose.ui.a0 a0VarJ16 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                        a1 a1VarB11116 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111112 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1111112 = androidx.compose.ui.m.n(c0VarR, a0VarJ16);
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
                        y7.n(c0VarD2, a1VarB11116, aVar3.e());
                        y7.n(c0VarD2, b1VarK1111112, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN1111112, aVar3.f());
                        n0 n0Var16 = n0.f16227a;
                        x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                        c0VarR.o();
                        float fB11111116 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB11111117 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB11111118 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                        if (z11) {
                            c0VarR.E(648460991);
                            i19 = de.b.f.f271670yd;
                        } else {
                            c0VarR.E(648462436);
                            i19 = de.b.f.Kd;
                        }
                        float fB11111119 = u0.f.b(i19, c0VarR, 0);
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarU16 = d5.u(aVar2, fB11111118, fB11111116, fB11111119, fB11111117);
                        androidx.compose.foundation.shape.n nVarH16 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                        float fB111111110 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                        float f115 = 0;
                        float fR16 = androidx.compose.ui.unit.h.r(f115);
                        androidx.compose.ui.a0 a0VarQ16 = x5.q(y5Var16, i1.j(androidx.compose.ui.draw.x.a(a0VarU16, nVarH16, new androidx.compose.ui.graphics.shadow.j(fB111111110, s0.b(436207616), fR16, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f115))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                        a1 a1VarB11117 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111113 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1111113 = androidx.compose.ui.m.n(c0VarR, a0VarQ16);
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
                        y7.n(c0VarD3, a1VarB11117, aVar3.e());
                        y7.n(c0VarD3, b1VarK1111113, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN1111113, aVar3.f());
                        v.b(c0VarR, 0);
                        c0VarR.o();
                        c0VarR.E(648476468);
                        if (!z11) {
                            androidx.compose.ui.a0 a0VarV16 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                            a1 a1VarB11118 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK1111114 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN1111114 = androidx.compose.ui.m.n(c0VarR, a0VarV16);
                            function0A4 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A4);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD4 = y7.d(c0VarR);
                            y7.n(c0VarD4, a1VarB11118, aVar3.e());
                            y7.n(c0VarD4, b1VarK1111114, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN1111114, aVar3.f());
                            e0.b(c0VarR, 0);
                            c0VarR.o();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        function9 = function6;
                        function10 = function7;
                        function11 = function8;
                    } else {
                        if (i20 != 0) {
                            bitmap3 = null;
                        } else {
                            bitmap3 = bitmap2;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        }
                        if (i13 != 0) {
                            c0VarR.E(-689613989);
                            objI2 = c0VarR.i0();
                            if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.f();
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            c0VarR.A();
                            function6 = (Function0) objI2;
                        } else {
                            function6 = function3;
                        }
                        if (i15 != 0) {
                            c0VarR.E(-689612933);
                            objI1 = c0VarR.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.h();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            c0VarR.A();
                            function7 = (Function0) objI1;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            c0VarR.E(-689611813);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c0.i();
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            function8 = (Function0) objI0;
                        } else {
                            function8 = function5;
                        }
                        if (m0.l0()) {
                            m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                        }
                        aVar = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ17 = aVar.q();
                        aVar2 = androidx.compose.ui.a0.E;
                        qVar = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE17 = u5.e(qVar.w(), cVarQ17, c0VarR, 48);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111115 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1111115 = androidx.compose.ui.m.n(c0VarR, aVar2);
                        aVar3 = androidx.compose.ui.node.g.I;
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
                        y7.n(c0VarD, a1VarE17, aVar3.e());
                        y7.n(c0VarD, b1VarK1111115, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN1111115, aVar3.f());
                        y5 y5Var17 = y5.f16577a;
                        androidx.compose.ui.a0 a0VarJ17 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                        a1 a1VarB11119 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111116 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1111116 = androidx.compose.ui.m.n(c0VarR, a0VarJ17);
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
                        y7.n(c0VarD2, a1VarB11119, aVar3.e());
                        y7.n(c0VarD2, b1VarK1111116, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN1111116, aVar3.f());
                        n0 n0Var17 = n0.f16227a;
                        x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                        c0VarR.o();
                        float fB111111111 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB111111112 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                        float fB111111113 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                        if (z11) {
                            c0VarR.E(648460991);
                            i19 = de.b.f.f271670yd;
                        } else {
                            c0VarR.E(648462436);
                            i19 = de.b.f.Kd;
                        }
                        float fB111111114 = u0.f.b(i19, c0VarR, 0);
                        c0VarR.A();
                        androidx.compose.ui.a0 a0VarU17 = d5.u(aVar2, fB111111113, fB111111111, fB111111114, fB111111112);
                        androidx.compose.foundation.shape.n nVarH17 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                        float fB111111115 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                        float f116 = 0;
                        float fR17 = androidx.compose.ui.unit.h.r(f116);
                        androidx.compose.ui.a0 a0VarQ17 = x5.q(y5Var17, i1.j(androidx.compose.ui.draw.x.a(a0VarU17, nVarH17, new androidx.compose.ui.graphics.shadow.j(fB111111115, s0.b(436207616), fR17, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f116))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                        a1 a1VarB111110 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111117 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1111117 = androidx.compose.ui.m.n(c0VarR, a0VarQ17);
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
                        y7.n(c0VarD3, a1VarB111110, aVar3.e());
                        y7.n(c0VarD3, b1VarK1111117, aVar3.g());
                        function2B3 = aVar3.b();
                        if (c0VarD3.P()) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        } else {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN1111117, aVar3.f());
                        v.b(c0VarR, 0);
                        c0VarR.o();
                        c0VarR.E(648476468);
                        if (!z11) {
                            androidx.compose.ui.a0 a0VarV17 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                            a1 a1VarB111111 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                            iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK1111118 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN1111118 = androidx.compose.ui.m.n(c0VarR, a0VarV17);
                            function0A4 = aVar3.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A4);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD4 = y7.d(c0VarR);
                            y7.n(c0VarD4, a1VarB111111, aVar3.e());
                            y7.n(c0VarD4, b1VarK1111118, aVar3.g());
                            function2B4 = aVar3.b();
                            if (c0VarD4.P()) {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            } else {
                                c0VarD4.Y(Integer.valueOf(iHashCode4));
                                c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                            }
                            y7.n(c0VarD4, a0VarN1111118, aVar3.f());
                            e0.b(c0VarR, 0);
                            c0VarR.o();
                        }
                        c0VarR.A();
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        function9 = function6;
                        function10 = function7;
                        function11 = function8;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final Bitmap bitmap12 = bitmap3;
                        final boolean z110 = z11;
                        s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return c0.g(bitmap12, z110, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function5 = function2;
                if ((i12 & 9363) == 9362) {
                    if (i20 != 0) {
                        bitmap3 = null;
                    } else {
                        bitmap3 = bitmap2;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    }
                    if (i13 != 0) {
                        c0VarR.E(-689613989);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.f();
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        function6 = (Function0) objI2;
                    } else {
                        function6 = function3;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-689612933);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.h();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        function7 = (Function0) objI1;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        c0VarR.E(-689611813);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.i();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function8 = (Function0) objI0;
                    } else {
                        function8 = function5;
                    }
                    if (m0.l0()) {
                        m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ18 = aVar.q();
                    aVar2 = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE18 = u5.e(qVar.w(), cVarQ18, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111119 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111119 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE18, aVar3.e());
                    y7.n(c0VarD, b1VarK1111119, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1111119, aVar3.f());
                    y5 y5Var18 = y5.f16577a;
                    androidx.compose.ui.a0 a0VarJ18 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                    a1 a1VarB111112 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111110 = androidx.compose.ui.m.n(c0VarR, a0VarJ18);
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
                    y7.n(c0VarD2, a1VarB111112, aVar3.e());
                    y7.n(c0VarD2, b1VarK11111110, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11111110, aVar3.f());
                    n0 n0Var18 = n0.f16227a;
                    x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                    c0VarR.o();
                    float fB111111116 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB111111117 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB111111118 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                    if (z11) {
                        c0VarR.E(648460991);
                        i19 = de.b.f.f271670yd;
                    } else {
                        c0VarR.E(648462436);
                        i19 = de.b.f.Kd;
                    }
                    float fB111111119 = u0.f.b(i19, c0VarR, 0);
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarU18 = d5.u(aVar2, fB111111118, fB111111116, fB111111119, fB111111117);
                    androidx.compose.foundation.shape.n nVarH18 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                    float fB1111111110 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                    float f117 = 0;
                    float fR18 = androidx.compose.ui.unit.h.r(f117);
                    androidx.compose.ui.a0 a0VarQ18 = x5.q(y5Var18, i1.j(androidx.compose.ui.draw.x.a(a0VarU18, nVarH18, new androidx.compose.ui.graphics.shadow.j(fB1111111110, s0.b(436207616), fR18, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f117))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                    a1 a1VarB111113 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111111 = androidx.compose.ui.m.n(c0VarR, a0VarQ18);
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
                    y7.n(c0VarD3, a1VarB111113, aVar3.e());
                    y7.n(c0VarD3, b1VarK11111111, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN11111111, aVar3.f());
                    v.b(c0VarR, 0);
                    c0VarR.o();
                    c0VarR.E(648476468);
                    if (!z11) {
                        androidx.compose.ui.a0 a0VarV18 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                        a1 a1VarB111114 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11111112 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11111112 = androidx.compose.ui.m.n(c0VarR, a0VarV18);
                        function0A4 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A4);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD4 = y7.d(c0VarR);
                        y7.n(c0VarD4, a1VarB111114, aVar3.e());
                        y7.n(c0VarD4, b1VarK11111112, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN11111112, aVar3.f());
                        e0.b(c0VarR, 0);
                        c0VarR.o();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function9 = function6;
                    function10 = function7;
                    function11 = function8;
                } else {
                    if (i20 != 0) {
                        bitmap3 = null;
                    } else {
                        bitmap3 = bitmap2;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    }
                    if (i13 != 0) {
                        c0VarR.E(-689613989);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.f();
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        function6 = (Function0) objI2;
                    } else {
                        function6 = function3;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-689612933);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.h();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        function7 = (Function0) objI1;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        c0VarR.E(-689611813);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.i();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function8 = (Function0) objI0;
                    } else {
                        function8 = function5;
                    }
                    if (m0.l0()) {
                        m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ19 = aVar.q();
                    aVar2 = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE19 = u5.e(qVar.w(), cVarQ19, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111113 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111113 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE19, aVar3.e());
                    y7.n(c0VarD, b1VarK11111113, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11111113, aVar3.f());
                    y5 y5Var19 = y5.f16577a;
                    androidx.compose.ui.a0 a0VarJ19 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                    a1 a1VarB111115 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111114 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111114 = androidx.compose.ui.m.n(c0VarR, a0VarJ19);
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
                    y7.n(c0VarD2, a1VarB111115, aVar3.e());
                    y7.n(c0VarD2, b1VarK11111114, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11111114, aVar3.f());
                    n0 n0Var19 = n0.f16227a;
                    x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                    c0VarR.o();
                    float fB1111111111 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB1111111112 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB1111111113 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                    if (z11) {
                        c0VarR.E(648460991);
                        i19 = de.b.f.f271670yd;
                    } else {
                        c0VarR.E(648462436);
                        i19 = de.b.f.Kd;
                    }
                    float fB1111111114 = u0.f.b(i19, c0VarR, 0);
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarU19 = d5.u(aVar2, fB1111111113, fB1111111111, fB1111111114, fB1111111112);
                    androidx.compose.foundation.shape.n nVarH19 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                    float fB1111111115 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                    float f118 = 0;
                    float fR19 = androidx.compose.ui.unit.h.r(f118);
                    androidx.compose.ui.a0 a0VarQ19 = x5.q(y5Var19, i1.j(androidx.compose.ui.draw.x.a(a0VarU19, nVarH19, new androidx.compose.ui.graphics.shadow.j(fB1111111115, s0.b(436207616), fR19, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f118))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                    a1 a1VarB111116 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111115 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111115 = androidx.compose.ui.m.n(c0VarR, a0VarQ19);
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
                    y7.n(c0VarD3, a1VarB111116, aVar3.e());
                    y7.n(c0VarD3, b1VarK11111115, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN11111115, aVar3.f());
                    v.b(c0VarR, 0);
                    c0VarR.o();
                    c0VarR.E(648476468);
                    if (!z11) {
                        androidx.compose.ui.a0 a0VarV19 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                        a1 a1VarB111117 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11111116 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11111116 = androidx.compose.ui.m.n(c0VarR, a0VarV19);
                        function0A4 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A4);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD4 = y7.d(c0VarR);
                        y7.n(c0VarD4, a1VarB111117, aVar3.e());
                        y7.n(c0VarD4, b1VarK11111116, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN11111116, aVar3.f());
                        e0.b(c0VarR, 0);
                        c0VarR.o();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function9 = function6;
                    function10 = function7;
                    function11 = function8;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final Bitmap bitmap13 = bitmap3;
                    final boolean z111 = z11;
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return c0.g(bitmap13, z111, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            function4 = function1;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    function5 = function2;
                    if (c0VarR.k0(function5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) == 9362) {
                    if (i20 != 0) {
                        bitmap3 = null;
                    } else {
                        bitmap3 = bitmap2;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    }
                    if (i13 != 0) {
                        c0VarR.E(-689613989);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.f();
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        function6 = (Function0) objI2;
                    } else {
                        function6 = function3;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-689612933);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.h();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        function7 = (Function0) objI1;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        c0VarR.E(-689611813);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.i();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function8 = (Function0) objI0;
                    } else {
                        function8 = function5;
                    }
                    if (m0.l0()) {
                        m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ110 = aVar.q();
                    aVar2 = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE110 = u5.e(qVar.w(), cVarQ110, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111117 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111117 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE110, aVar3.e());
                    y7.n(c0VarD, b1VarK11111117, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11111117, aVar3.f());
                    y5 y5Var110 = y5.f16577a;
                    androidx.compose.ui.a0 a0VarJ110 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                    a1 a1VarB111118 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111118 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111118 = androidx.compose.ui.m.n(c0VarR, a0VarJ110);
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
                    y7.n(c0VarD2, a1VarB111118, aVar3.e());
                    y7.n(c0VarD2, b1VarK11111118, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11111118, aVar3.f());
                    n0 n0Var110 = n0.f16227a;
                    x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                    c0VarR.o();
                    float fB1111111116 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB1111111117 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB1111111118 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                    if (z11) {
                        c0VarR.E(648460991);
                        i19 = de.b.f.f271670yd;
                    } else {
                        c0VarR.E(648462436);
                        i19 = de.b.f.Kd;
                    }
                    float fB1111111119 = u0.f.b(i19, c0VarR, 0);
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarU110 = d5.u(aVar2, fB1111111118, fB1111111116, fB1111111119, fB1111111117);
                    androidx.compose.foundation.shape.n nVarH110 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                    float fB11111111110 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                    float f119 = 0;
                    float fR110 = androidx.compose.ui.unit.h.r(f119);
                    androidx.compose.ui.a0 a0VarQ110 = x5.q(y5Var110, i1.j(androidx.compose.ui.draw.x.a(a0VarU110, nVarH110, new androidx.compose.ui.graphics.shadow.j(fB11111111110, s0.b(436207616), fR110, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f119))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                    a1 a1VarB111119 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111119 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111119 = androidx.compose.ui.m.n(c0VarR, a0VarQ110);
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
                    y7.n(c0VarD3, a1VarB111119, aVar3.e());
                    y7.n(c0VarD3, b1VarK11111119, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN11111119, aVar3.f());
                    v.b(c0VarR, 0);
                    c0VarR.o();
                    c0VarR.E(648476468);
                    if (!z11) {
                        androidx.compose.ui.a0 a0VarV110 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                        a1 a1VarB1111110 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK111111110 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN111111110 = androidx.compose.ui.m.n(c0VarR, a0VarV110);
                        function0A4 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A4);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD4 = y7.d(c0VarR);
                        y7.n(c0VarD4, a1VarB1111110, aVar3.e());
                        y7.n(c0VarD4, b1VarK111111110, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN111111110, aVar3.f());
                        e0.b(c0VarR, 0);
                        c0VarR.o();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function9 = function6;
                    function10 = function7;
                    function11 = function8;
                } else {
                    if (i20 != 0) {
                        bitmap3 = null;
                    } else {
                        bitmap3 = bitmap2;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    }
                    if (i13 != 0) {
                        c0VarR.E(-689613989);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.f();
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        function6 = (Function0) objI2;
                    } else {
                        function6 = function3;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-689612933);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.h();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        function7 = (Function0) objI1;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        c0VarR.E(-689611813);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.i();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function8 = (Function0) objI0;
                    } else {
                        function8 = function5;
                    }
                    if (m0.l0()) {
                        m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ111 = aVar.q();
                    aVar2 = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE111 = u5.e(qVar.w(), cVarQ111, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111111111 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE111, aVar3.e());
                    y7.n(c0VarD, b1VarK111111111, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN111111111, aVar3.f());
                    y5 y5Var111 = y5.f16577a;
                    androidx.compose.ui.a0 a0VarJ111 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                    a1 a1VarB1111111 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111111112 = androidx.compose.ui.m.n(c0VarR, a0VarJ111);
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
                    y7.n(c0VarD2, a1VarB1111111, aVar3.e());
                    y7.n(c0VarD2, b1VarK111111112, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN111111112, aVar3.f());
                    n0 n0Var111 = n0.f16227a;
                    x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                    c0VarR.o();
                    float fB11111111111 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB11111111112 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB11111111113 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                    if (z11) {
                        c0VarR.E(648460991);
                        i19 = de.b.f.f271670yd;
                    } else {
                        c0VarR.E(648462436);
                        i19 = de.b.f.Kd;
                    }
                    float fB11111111114 = u0.f.b(i19, c0VarR, 0);
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarU111 = d5.u(aVar2, fB11111111113, fB11111111111, fB11111111114, fB11111111112);
                    androidx.compose.foundation.shape.n nVarH111 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                    float fB11111111115 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                    float f1110 = 0;
                    float fR111 = androidx.compose.ui.unit.h.r(f1110);
                    androidx.compose.ui.a0 a0VarQ111 = x5.q(y5Var111, i1.j(androidx.compose.ui.draw.x.a(a0VarU111, nVarH111, new androidx.compose.ui.graphics.shadow.j(fB11111111115, s0.b(436207616), fR111, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1110))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                    a1 a1VarB1111112 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111113 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111111113 = androidx.compose.ui.m.n(c0VarR, a0VarQ111);
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
                    y7.n(c0VarD3, a1VarB1111112, aVar3.e());
                    y7.n(c0VarD3, b1VarK111111113, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN111111113, aVar3.f());
                    v.b(c0VarR, 0);
                    c0VarR.o();
                    c0VarR.E(648476468);
                    if (!z11) {
                        androidx.compose.ui.a0 a0VarV111 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                        a1 a1VarB1111113 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK111111114 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN111111114 = androidx.compose.ui.m.n(c0VarR, a0VarV111);
                        function0A4 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A4);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD4 = y7.d(c0VarR);
                        y7.n(c0VarD4, a1VarB1111113, aVar3.e());
                        y7.n(c0VarD4, b1VarK111111114, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN111111114, aVar3.f());
                        e0.b(c0VarR, 0);
                        c0VarR.o();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function9 = function6;
                    function10 = function7;
                    function11 = function8;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final Bitmap bitmap14 = bitmap3;
                    final boolean z112 = z11;
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return c0.g(bitmap14, z112, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function5 = function2;
            if ((i12 & 9363) == 9362) {
                if (i20 != 0) {
                    bitmap3 = null;
                } else {
                    bitmap3 = bitmap2;
                }
                if (i21 != 0) {
                    z11 = false;
                }
                if (i13 != 0) {
                    c0VarR.E(-689613989);
                    objI2 = c0VarR.i0();
                    if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.f();
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    function6 = (Function0) objI2;
                } else {
                    function6 = function3;
                }
                if (i15 != 0) {
                    c0VarR.E(-689612933);
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.h();
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    function7 = (Function0) objI1;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    c0VarR.E(-689611813);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.i();
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    function8 = (Function0) objI0;
                } else {
                    function8 = function5;
                }
                if (m0.l0()) {
                    m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                }
                aVar = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ112 = aVar.q();
                aVar2 = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE112 = u5.e(qVar.w(), cVarQ112, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111115 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111115 = androidx.compose.ui.m.n(c0VarR, aVar2);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE112, aVar3.e());
                y7.n(c0VarD, b1VarK111111115, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111111115, aVar3.f());
                y5 y5Var112 = y5.f16577a;
                androidx.compose.ui.a0 a0VarJ112 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                a1 a1VarB1111114 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111116 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111116 = androidx.compose.ui.m.n(c0VarR, a0VarJ112);
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
                y7.n(c0VarD2, a1VarB1111114, aVar3.e());
                y7.n(c0VarD2, b1VarK111111116, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111111116, aVar3.f());
                n0 n0Var112 = n0.f16227a;
                x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                c0VarR.o();
                float fB11111111116 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB11111111117 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB11111111118 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                if (z11) {
                    c0VarR.E(648460991);
                    i19 = de.b.f.f271670yd;
                } else {
                    c0VarR.E(648462436);
                    i19 = de.b.f.Kd;
                }
                float fB11111111119 = u0.f.b(i19, c0VarR, 0);
                c0VarR.A();
                androidx.compose.ui.a0 a0VarU112 = d5.u(aVar2, fB11111111118, fB11111111116, fB11111111119, fB11111111117);
                androidx.compose.foundation.shape.n nVarH112 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                float fB111111111110 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                float f1111 = 0;
                float fR112 = androidx.compose.ui.unit.h.r(f1111);
                androidx.compose.ui.a0 a0VarQ112 = x5.q(y5Var112, i1.j(androidx.compose.ui.draw.x.a(a0VarU112, nVarH112, new androidx.compose.ui.graphics.shadow.j(fB111111111110, s0.b(436207616), fR112, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1111))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                a1 a1VarB1111115 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111117 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111117 = androidx.compose.ui.m.n(c0VarR, a0VarQ112);
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
                y7.n(c0VarD3, a1VarB1111115, aVar3.e());
                y7.n(c0VarD3, b1VarK111111117, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN111111117, aVar3.f());
                v.b(c0VarR, 0);
                c0VarR.o();
                c0VarR.E(648476468);
                if (!z11) {
                    androidx.compose.ui.a0 a0VarV112 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                    a1 a1VarB1111116 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111118 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111111118 = androidx.compose.ui.m.n(c0VarR, a0VarV112);
                    function0A4 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A4);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD4 = y7.d(c0VarR);
                    y7.n(c0VarD4, a1VarB1111116, aVar3.e());
                    y7.n(c0VarD4, b1VarK111111118, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN111111118, aVar3.f());
                    e0.b(c0VarR, 0);
                    c0VarR.o();
                }
                c0VarR.A();
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                function9 = function6;
                function10 = function7;
                function11 = function8;
            } else {
                if (i20 != 0) {
                    bitmap3 = null;
                } else {
                    bitmap3 = bitmap2;
                }
                if (i21 != 0) {
                    z11 = false;
                }
                if (i13 != 0) {
                    c0VarR.E(-689613989);
                    objI2 = c0VarR.i0();
                    if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.f();
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    function6 = (Function0) objI2;
                } else {
                    function6 = function3;
                }
                if (i15 != 0) {
                    c0VarR.E(-689612933);
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.h();
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    function7 = (Function0) objI1;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    c0VarR.E(-689611813);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.i();
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    function8 = (Function0) objI0;
                } else {
                    function8 = function5;
                }
                if (m0.l0()) {
                    m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                }
                aVar = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ113 = aVar.q();
                aVar2 = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE113 = u5.e(qVar.w(), cVarQ113, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111119 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111119 = androidx.compose.ui.m.n(c0VarR, aVar2);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE113, aVar3.e());
                y7.n(c0VarD, b1VarK111111119, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111111119, aVar3.f());
                y5 y5Var113 = y5.f16577a;
                androidx.compose.ui.a0 a0VarJ113 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                a1 a1VarB1111117 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1111111110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1111111110 = androidx.compose.ui.m.n(c0VarR, a0VarJ113);
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
                y7.n(c0VarD2, a1VarB1111117, aVar3.e());
                y7.n(c0VarD2, b1VarK1111111110, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN1111111110, aVar3.f());
                n0 n0Var113 = n0.f16227a;
                x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                c0VarR.o();
                float fB111111111111 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB111111111112 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB111111111113 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                if (z11) {
                    c0VarR.E(648460991);
                    i19 = de.b.f.f271670yd;
                } else {
                    c0VarR.E(648462436);
                    i19 = de.b.f.Kd;
                }
                float fB111111111114 = u0.f.b(i19, c0VarR, 0);
                c0VarR.A();
                androidx.compose.ui.a0 a0VarU113 = d5.u(aVar2, fB111111111113, fB111111111111, fB111111111114, fB111111111112);
                androidx.compose.foundation.shape.n nVarH113 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                float fB111111111115 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                float f1112 = 0;
                float fR113 = androidx.compose.ui.unit.h.r(f1112);
                androidx.compose.ui.a0 a0VarQ113 = x5.q(y5Var113, i1.j(androidx.compose.ui.draw.x.a(a0VarU113, nVarH113, new androidx.compose.ui.graphics.shadow.j(fB111111111115, s0.b(436207616), fR113, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1112))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                a1 a1VarB1111118 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1111111111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1111111111 = androidx.compose.ui.m.n(c0VarR, a0VarQ113);
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
                y7.n(c0VarD3, a1VarB1111118, aVar3.e());
                y7.n(c0VarD3, b1VarK1111111111, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN1111111111, aVar3.f());
                v.b(c0VarR, 0);
                c0VarR.o();
                c0VarR.E(648476468);
                if (!z11) {
                    androidx.compose.ui.a0 a0VarV113 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                    a1 a1VarB1111119 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111111112 = androidx.compose.ui.m.n(c0VarR, a0VarV113);
                    function0A4 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A4);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD4 = y7.d(c0VarR);
                    y7.n(c0VarD4, a1VarB1111119, aVar3.e());
                    y7.n(c0VarD4, b1VarK1111111112, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN1111111112, aVar3.f());
                    e0.b(c0VarR, 0);
                    c0VarR.o();
                }
                c0VarR.A();
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                function9 = function6;
                function10 = function7;
                function11 = function8;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final Bitmap bitmap15 = bitmap3;
                final boolean z113 = z11;
                s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return c0.g(bitmap15, z113, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        function3 = function0;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                function4 = function1;
                if (c0VarR.k0(function4)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    function5 = function2;
                    if (c0VarR.k0(function5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) == 9362) {
                    if (i20 != 0) {
                        bitmap3 = null;
                    } else {
                        bitmap3 = bitmap2;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    }
                    if (i13 != 0) {
                        c0VarR.E(-689613989);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.f();
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        function6 = (Function0) objI2;
                    } else {
                        function6 = function3;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-689612933);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.h();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        function7 = (Function0) objI1;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        c0VarR.E(-689611813);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.i();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function8 = (Function0) objI0;
                    } else {
                        function8 = function5;
                    }
                    if (m0.l0()) {
                        m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ114 = aVar.q();
                    aVar2 = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE114 = u5.e(qVar.w(), cVarQ114, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111113 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111111113 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE114, aVar3.e());
                    y7.n(c0VarD, b1VarK1111111113, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1111111113, aVar3.f());
                    y5 y5Var114 = y5.f16577a;
                    androidx.compose.ui.a0 a0VarJ114 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                    a1 a1VarB11111110 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111114 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111111114 = androidx.compose.ui.m.n(c0VarR, a0VarJ114);
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
                    y7.n(c0VarD2, a1VarB11111110, aVar3.e());
                    y7.n(c0VarD2, b1VarK1111111114, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN1111111114, aVar3.f());
                    n0 n0Var114 = n0.f16227a;
                    x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                    c0VarR.o();
                    float fB111111111116 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB111111111117 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB111111111118 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                    if (z11) {
                        c0VarR.E(648460991);
                        i19 = de.b.f.f271670yd;
                    } else {
                        c0VarR.E(648462436);
                        i19 = de.b.f.Kd;
                    }
                    float fB111111111119 = u0.f.b(i19, c0VarR, 0);
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarU114 = d5.u(aVar2, fB111111111118, fB111111111116, fB111111111119, fB111111111117);
                    androidx.compose.foundation.shape.n nVarH114 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                    float fB1111111111110 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                    float f1113 = 0;
                    float fR114 = androidx.compose.ui.unit.h.r(f1113);
                    androidx.compose.ui.a0 a0VarQ114 = x5.q(y5Var114, i1.j(androidx.compose.ui.draw.x.a(a0VarU114, nVarH114, new androidx.compose.ui.graphics.shadow.j(fB1111111111110, s0.b(436207616), fR114, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1113))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                    a1 a1VarB11111111 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111115 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111111115 = androidx.compose.ui.m.n(c0VarR, a0VarQ114);
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
                    y7.n(c0VarD3, a1VarB11111111, aVar3.e());
                    y7.n(c0VarD3, b1VarK1111111115, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN1111111115, aVar3.f());
                    v.b(c0VarR, 0);
                    c0VarR.o();
                    c0VarR.E(648476468);
                    if (!z11) {
                        androidx.compose.ui.a0 a0VarV114 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                        a1 a1VarB11111112 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111111116 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1111111116 = androidx.compose.ui.m.n(c0VarR, a0VarV114);
                        function0A4 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A4);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD4 = y7.d(c0VarR);
                        y7.n(c0VarD4, a1VarB11111112, aVar3.e());
                        y7.n(c0VarD4, b1VarK1111111116, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN1111111116, aVar3.f());
                        e0.b(c0VarR, 0);
                        c0VarR.o();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function9 = function6;
                    function10 = function7;
                    function11 = function8;
                } else {
                    if (i20 != 0) {
                        bitmap3 = null;
                    } else {
                        bitmap3 = bitmap2;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    }
                    if (i13 != 0) {
                        c0VarR.E(-689613989);
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.f();
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        c0VarR.A();
                        function6 = (Function0) objI2;
                    } else {
                        function6 = function3;
                    }
                    if (i15 != 0) {
                        c0VarR.E(-689612933);
                        objI1 = c0VarR.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.h();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        c0VarR.A();
                        function7 = (Function0) objI1;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        c0VarR.E(-689611813);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c0.i();
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function8 = (Function0) objI0;
                    } else {
                        function8 = function5;
                    }
                    if (m0.l0()) {
                        m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ115 = aVar.q();
                    aVar2 = androidx.compose.ui.a0.E;
                    qVar = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE115 = u5.e(qVar.w(), cVarQ115, c0VarR, 48);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111117 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111111117 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    aVar3 = androidx.compose.ui.node.g.I;
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
                    y7.n(c0VarD, a1VarE115, aVar3.e());
                    y7.n(c0VarD, b1VarK1111111117, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1111111117, aVar3.f());
                    y5 y5Var115 = y5.f16577a;
                    androidx.compose.ui.a0 a0VarJ115 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                    a1 a1VarB11111113 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111118 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111111118 = androidx.compose.ui.m.n(c0VarR, a0VarJ115);
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
                    y7.n(c0VarD2, a1VarB11111113, aVar3.e());
                    y7.n(c0VarD2, b1VarK1111111118, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN1111111118, aVar3.f());
                    n0 n0Var115 = n0.f16227a;
                    x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                    c0VarR.o();
                    float fB1111111111111 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB1111111111112 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                    float fB1111111111113 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                    if (z11) {
                        c0VarR.E(648460991);
                        i19 = de.b.f.f271670yd;
                    } else {
                        c0VarR.E(648462436);
                        i19 = de.b.f.Kd;
                    }
                    float fB1111111111114 = u0.f.b(i19, c0VarR, 0);
                    c0VarR.A();
                    androidx.compose.ui.a0 a0VarU115 = d5.u(aVar2, fB1111111111113, fB1111111111111, fB1111111111114, fB1111111111112);
                    androidx.compose.foundation.shape.n nVarH115 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                    float fB1111111111115 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                    float f1114 = 0;
                    float fR115 = androidx.compose.ui.unit.h.r(f1114);
                    androidx.compose.ui.a0 a0VarQ115 = x5.q(y5Var115, i1.j(androidx.compose.ui.draw.x.a(a0VarU115, nVarH115, new androidx.compose.ui.graphics.shadow.j(fB1111111111115, s0.b(436207616), fR115, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1114))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                    a1 a1VarB11111114 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1111111119 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1111111119 = androidx.compose.ui.m.n(c0VarR, a0VarQ115);
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
                    y7.n(c0VarD3, a1VarB11111114, aVar3.e());
                    y7.n(c0VarD3, b1VarK1111111119, aVar3.g());
                    function2B3 = aVar3.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iHashCode3));
                        c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                    }
                    y7.n(c0VarD3, a0VarN1111111119, aVar3.f());
                    v.b(c0VarR, 0);
                    c0VarR.o();
                    c0VarR.E(648476468);
                    if (!z11) {
                        androidx.compose.ui.a0 a0VarV115 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                        a1 a1VarB11111115 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                        iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11111111110 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11111111110 = androidx.compose.ui.m.n(c0VarR, a0VarV115);
                        function0A4 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A4);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD4 = y7.d(c0VarR);
                        y7.n(c0VarD4, a1VarB11111115, aVar3.e());
                        y7.n(c0VarD4, b1VarK11111111110, aVar3.g());
                        function2B4 = aVar3.b();
                        if (c0VarD4.P()) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        } else {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN11111111110, aVar3.f());
                        e0.b(c0VarR, 0);
                        c0VarR.o();
                    }
                    c0VarR.A();
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    function9 = function6;
                    function10 = function7;
                    function11 = function8;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final Bitmap bitmap16 = bitmap3;
                    final boolean z114 = z11;
                    s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return c0.g(bitmap16, z114, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function5 = function2;
            if ((i12 & 9363) == 9362) {
                if (i20 != 0) {
                    bitmap3 = null;
                } else {
                    bitmap3 = bitmap2;
                }
                if (i21 != 0) {
                    z11 = false;
                }
                if (i13 != 0) {
                    c0VarR.E(-689613989);
                    objI2 = c0VarR.i0();
                    if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.f();
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    function6 = (Function0) objI2;
                } else {
                    function6 = function3;
                }
                if (i15 != 0) {
                    c0VarR.E(-689612933);
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.h();
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    function7 = (Function0) objI1;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    c0VarR.E(-689611813);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.i();
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    function8 = (Function0) objI0;
                } else {
                    function8 = function5;
                }
                if (m0.l0()) {
                    m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                }
                aVar = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ116 = aVar.q();
                aVar2 = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE116 = u5.e(qVar.w(), cVarQ116, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11111111111 = androidx.compose.ui.m.n(c0VarR, aVar2);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE116, aVar3.e());
                y7.n(c0VarD, b1VarK11111111111, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11111111111, aVar3.f());
                y5 y5Var116 = y5.f16577a;
                androidx.compose.ui.a0 a0VarJ116 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                a1 a1VarB11111116 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111112 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11111111112 = androidx.compose.ui.m.n(c0VarR, a0VarJ116);
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
                y7.n(c0VarD2, a1VarB11111116, aVar3.e());
                y7.n(c0VarD2, b1VarK11111111112, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN11111111112, aVar3.f());
                n0 n0Var116 = n0.f16227a;
                x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                c0VarR.o();
                float fB1111111111116 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB1111111111117 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB1111111111118 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                if (z11) {
                    c0VarR.E(648460991);
                    i19 = de.b.f.f271670yd;
                } else {
                    c0VarR.E(648462436);
                    i19 = de.b.f.Kd;
                }
                float fB1111111111119 = u0.f.b(i19, c0VarR, 0);
                c0VarR.A();
                androidx.compose.ui.a0 a0VarU116 = d5.u(aVar2, fB1111111111118, fB1111111111116, fB1111111111119, fB1111111111117);
                androidx.compose.foundation.shape.n nVarH116 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                float fB11111111111110 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                float f1115 = 0;
                float fR116 = androidx.compose.ui.unit.h.r(f1115);
                androidx.compose.ui.a0 a0VarQ116 = x5.q(y5Var116, i1.j(androidx.compose.ui.draw.x.a(a0VarU116, nVarH116, new androidx.compose.ui.graphics.shadow.j(fB11111111111110, s0.b(436207616), fR116, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1115))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                a1 a1VarB11111117 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111113 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11111111113 = androidx.compose.ui.m.n(c0VarR, a0VarQ116);
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
                y7.n(c0VarD3, a1VarB11111117, aVar3.e());
                y7.n(c0VarD3, b1VarK11111111113, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN11111111113, aVar3.f());
                v.b(c0VarR, 0);
                c0VarR.o();
                c0VarR.E(648476468);
                if (!z11) {
                    androidx.compose.ui.a0 a0VarV116 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                    a1 a1VarB11111118 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111111114 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111111114 = androidx.compose.ui.m.n(c0VarR, a0VarV116);
                    function0A4 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A4);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD4 = y7.d(c0VarR);
                    y7.n(c0VarD4, a1VarB11111118, aVar3.e());
                    y7.n(c0VarD4, b1VarK11111111114, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN11111111114, aVar3.f());
                    e0.b(c0VarR, 0);
                    c0VarR.o();
                }
                c0VarR.A();
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                function9 = function6;
                function10 = function7;
                function11 = function8;
            } else {
                if (i20 != 0) {
                    bitmap3 = null;
                } else {
                    bitmap3 = bitmap2;
                }
                if (i21 != 0) {
                    z11 = false;
                }
                if (i13 != 0) {
                    c0VarR.E(-689613989);
                    objI2 = c0VarR.i0();
                    if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.f();
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    function6 = (Function0) objI2;
                } else {
                    function6 = function3;
                }
                if (i15 != 0) {
                    c0VarR.E(-689612933);
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.h();
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    function7 = (Function0) objI1;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    c0VarR.E(-689611813);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.i();
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    function8 = (Function0) objI0;
                } else {
                    function8 = function5;
                }
                if (m0.l0()) {
                    m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                }
                aVar = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ117 = aVar.q();
                aVar2 = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE117 = u5.e(qVar.w(), cVarQ117, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111115 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11111111115 = androidx.compose.ui.m.n(c0VarR, aVar2);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE117, aVar3.e());
                y7.n(c0VarD, b1VarK11111111115, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11111111115, aVar3.f());
                y5 y5Var117 = y5.f16577a;
                androidx.compose.ui.a0 a0VarJ117 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                a1 a1VarB11111119 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111116 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11111111116 = androidx.compose.ui.m.n(c0VarR, a0VarJ117);
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
                y7.n(c0VarD2, a1VarB11111119, aVar3.e());
                y7.n(c0VarD2, b1VarK11111111116, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN11111111116, aVar3.f());
                n0 n0Var117 = n0.f16227a;
                x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                c0VarR.o();
                float fB11111111111111 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB11111111111112 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB11111111111113 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                if (z11) {
                    c0VarR.E(648460991);
                    i19 = de.b.f.f271670yd;
                } else {
                    c0VarR.E(648462436);
                    i19 = de.b.f.Kd;
                }
                float fB11111111111114 = u0.f.b(i19, c0VarR, 0);
                c0VarR.A();
                androidx.compose.ui.a0 a0VarU117 = d5.u(aVar2, fB11111111111113, fB11111111111111, fB11111111111114, fB11111111111112);
                androidx.compose.foundation.shape.n nVarH117 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                float fB11111111111115 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                float f1116 = 0;
                float fR117 = androidx.compose.ui.unit.h.r(f1116);
                androidx.compose.ui.a0 a0VarQ117 = x5.q(y5Var117, i1.j(androidx.compose.ui.draw.x.a(a0VarU117, nVarH117, new androidx.compose.ui.graphics.shadow.j(fB11111111111115, s0.b(436207616), fR117, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1116))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                a1 a1VarB111111110 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111117 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11111111117 = androidx.compose.ui.m.n(c0VarR, a0VarQ117);
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
                y7.n(c0VarD3, a1VarB111111110, aVar3.e());
                y7.n(c0VarD3, b1VarK11111111117, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN11111111117, aVar3.f());
                v.b(c0VarR, 0);
                c0VarR.o();
                c0VarR.E(648476468);
                if (!z11) {
                    androidx.compose.ui.a0 a0VarV117 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                    a1 a1VarB111111111 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111111118 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111111118 = androidx.compose.ui.m.n(c0VarR, a0VarV117);
                    function0A4 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A4);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD4 = y7.d(c0VarR);
                    y7.n(c0VarD4, a1VarB111111111, aVar3.e());
                    y7.n(c0VarD4, b1VarK11111111118, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN11111111118, aVar3.f());
                    e0.b(c0VarR, 0);
                    c0VarR.o();
                }
                c0VarR.A();
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                function9 = function6;
                function10 = function7;
                function11 = function8;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final Bitmap bitmap17 = bitmap3;
                final boolean z115 = z11;
                s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return c0.g(bitmap17, z115, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        function4 = function1;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                function5 = function2;
                if (c0VarR.k0(function5)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i12 & 9363) == 9362) {
                if (i20 != 0) {
                    bitmap3 = null;
                } else {
                    bitmap3 = bitmap2;
                }
                if (i21 != 0) {
                    z11 = false;
                }
                if (i13 != 0) {
                    c0VarR.E(-689613989);
                    objI2 = c0VarR.i0();
                    if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.f();
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    function6 = (Function0) objI2;
                } else {
                    function6 = function3;
                }
                if (i15 != 0) {
                    c0VarR.E(-689612933);
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.h();
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    function7 = (Function0) objI1;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    c0VarR.E(-689611813);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.i();
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    function8 = (Function0) objI0;
                } else {
                    function8 = function5;
                }
                if (m0.l0()) {
                    m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                }
                aVar = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ118 = aVar.q();
                aVar2 = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE118 = u5.e(qVar.w(), cVarQ118, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11111111119 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11111111119 = androidx.compose.ui.m.n(c0VarR, aVar2);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE118, aVar3.e());
                y7.n(c0VarD, b1VarK11111111119, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11111111119, aVar3.f());
                y5 y5Var118 = y5.f16577a;
                androidx.compose.ui.a0 a0VarJ118 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                a1 a1VarB111111112 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111111110 = androidx.compose.ui.m.n(c0VarR, a0VarJ118);
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
                y7.n(c0VarD2, a1VarB111111112, aVar3.e());
                y7.n(c0VarD2, b1VarK111111111110, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111111111110, aVar3.f());
                n0 n0Var118 = n0.f16227a;
                x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                c0VarR.o();
                float fB11111111111116 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB11111111111117 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB11111111111118 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                if (z11) {
                    c0VarR.E(648460991);
                    i19 = de.b.f.f271670yd;
                } else {
                    c0VarR.E(648462436);
                    i19 = de.b.f.Kd;
                }
                float fB11111111111119 = u0.f.b(i19, c0VarR, 0);
                c0VarR.A();
                androidx.compose.ui.a0 a0VarU118 = d5.u(aVar2, fB11111111111118, fB11111111111116, fB11111111111119, fB11111111111117);
                androidx.compose.foundation.shape.n nVarH118 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                float fB111111111111110 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                float f1117 = 0;
                float fR118 = androidx.compose.ui.unit.h.r(f1117);
                androidx.compose.ui.a0 a0VarQ118 = x5.q(y5Var118, i1.j(androidx.compose.ui.draw.x.a(a0VarU118, nVarH118, new androidx.compose.ui.graphics.shadow.j(fB111111111111110, s0.b(436207616), fR118, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1117))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                a1 a1VarB111111113 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111111111 = androidx.compose.ui.m.n(c0VarR, a0VarQ118);
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
                y7.n(c0VarD3, a1VarB111111113, aVar3.e());
                y7.n(c0VarD3, b1VarK111111111111, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN111111111111, aVar3.f());
                v.b(c0VarR, 0);
                c0VarR.o();
                c0VarR.E(648476468);
                if (!z11) {
                    androidx.compose.ui.a0 a0VarV118 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                    a1 a1VarB111111114 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111111112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111111111112 = androidx.compose.ui.m.n(c0VarR, a0VarV118);
                    function0A4 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A4);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD4 = y7.d(c0VarR);
                    y7.n(c0VarD4, a1VarB111111114, aVar3.e());
                    y7.n(c0VarD4, b1VarK111111111112, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN111111111112, aVar3.f());
                    e0.b(c0VarR, 0);
                    c0VarR.o();
                }
                c0VarR.A();
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                function9 = function6;
                function10 = function7;
                function11 = function8;
            } else {
                if (i20 != 0) {
                    bitmap3 = null;
                } else {
                    bitmap3 = bitmap2;
                }
                if (i21 != 0) {
                    z11 = false;
                }
                if (i13 != 0) {
                    c0VarR.E(-689613989);
                    objI2 = c0VarR.i0();
                    if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.f();
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    function6 = (Function0) objI2;
                } else {
                    function6 = function3;
                }
                if (i15 != 0) {
                    c0VarR.E(-689612933);
                    objI1 = c0VarR.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.h();
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    function7 = (Function0) objI1;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    c0VarR.E(-689611813);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c0.i();
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    function8 = (Function0) objI0;
                } else {
                    function8 = function5;
                }
                if (m0.l0()) {
                    m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
                }
                aVar = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ119 = aVar.q();
                aVar2 = androidx.compose.ui.a0.E;
                qVar = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE119 = u5.e(qVar.w(), cVarQ119, c0VarR, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111113 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111111113 = androidx.compose.ui.m.n(c0VarR, aVar2);
                aVar3 = androidx.compose.ui.node.g.I;
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
                y7.n(c0VarD, a1VarE119, aVar3.e());
                y7.n(c0VarD, b1VarK111111111113, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111111111113, aVar3.f());
                y5 y5Var119 = y5.f16577a;
                androidx.compose.ui.a0 a0VarJ119 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
                a1 a1VarB111111115 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111114 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111111114 = androidx.compose.ui.m.n(c0VarR, a0VarJ119);
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
                y7.n(c0VarD2, a1VarB111111115, aVar3.e());
                y7.n(c0VarD2, b1VarK111111111114, aVar3.g());
                function2B2 = aVar3.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111111111114, aVar3.f());
                n0 n0Var119 = n0.f16227a;
                x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
                c0VarR.o();
                float fB111111111111111 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB111111111111112 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
                float fB111111111111113 = u0.f.b(de.b.f.Kd, c0VarR, 0);
                if (z11) {
                    c0VarR.E(648460991);
                    i19 = de.b.f.f271670yd;
                } else {
                    c0VarR.E(648462436);
                    i19 = de.b.f.Kd;
                }
                float fB111111111111114 = u0.f.b(i19, c0VarR, 0);
                c0VarR.A();
                androidx.compose.ui.a0 a0VarU119 = d5.u(aVar2, fB111111111111113, fB111111111111111, fB111111111111114, fB111111111111112);
                androidx.compose.foundation.shape.n nVarH119 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
                float fB111111111111115 = u0.f.b(de.b.f.Tc, c0VarR, 0);
                float f1118 = 0;
                float fR119 = androidx.compose.ui.unit.h.r(f1118);
                androidx.compose.ui.a0 a0VarQ119 = x5.q(y5Var119, i1.j(androidx.compose.ui.draw.x.a(a0VarU119, nVarH119, new androidx.compose.ui.graphics.shadow.j(fB111111111111115, s0.b(436207616), fR119, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1118))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
                a1 a1VarB111111116 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111111115 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111111115 = androidx.compose.ui.m.n(c0VarR, a0VarQ119);
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
                y7.n(c0VarD3, a1VarB111111116, aVar3.e());
                y7.n(c0VarD3, b1VarK111111111115, aVar3.g());
                function2B3 = aVar3.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN111111111115, aVar3.f());
                v.b(c0VarR, 0);
                c0VarR.o();
                c0VarR.E(648476468);
                if (!z11) {
                    androidx.compose.ui.a0 a0VarV119 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                    a1 a1VarB111111117 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                    iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111111111116 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111111111116 = androidx.compose.ui.m.n(c0VarR, a0VarV119);
                    function0A4 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A4);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD4 = y7.d(c0VarR);
                    y7.n(c0VarD4, a1VarB111111117, aVar3.e());
                    y7.n(c0VarD4, b1VarK111111111116, aVar3.g());
                    function2B4 = aVar3.b();
                    if (c0VarD4.P()) {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    } else {
                        c0VarD4.Y(Integer.valueOf(iHashCode4));
                        c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                    }
                    y7.n(c0VarD4, a0VarN111111111116, aVar3.f());
                    e0.b(c0VarR, 0);
                    c0VarR.o();
                }
                c0VarR.A();
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                function9 = function6;
                function10 = function7;
                function11 = function8;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final Bitmap bitmap18 = bitmap3;
                final boolean z116 = z11;
                s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return c0.g(bitmap18, z116, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function5 = function2;
        if ((i12 & 9363) == 9362) {
            if (i20 != 0) {
                bitmap3 = null;
            } else {
                bitmap3 = bitmap2;
            }
            if (i21 != 0) {
                z11 = false;
            }
            if (i13 != 0) {
                c0VarR.E(-689613989);
                objI2 = c0VarR.i0();
                if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return c0.f();
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                function6 = (Function0) objI2;
            } else {
                function6 = function3;
            }
            if (i15 != 0) {
                c0VarR.E(-689612933);
                objI1 = c0VarR.i0();
                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return c0.h();
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                function7 = (Function0) objI1;
            } else {
                function7 = function4;
            }
            if (i17 != 0) {
                c0VarR.E(-689611813);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return c0.i();
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                function8 = (Function0) objI0;
            } else {
                function8 = function5;
            }
            if (m0.l0()) {
                m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
            }
            aVar = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.e.c cVarQ1110 = aVar.q();
            aVar2 = androidx.compose.ui.a0.E;
            qVar = androidx.compose.foundation.layout.q.f16330a;
            a1 a1VarE1110 = u5.e(qVar.w(), cVarQ1110, c0VarR, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK111111111117 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN111111111117 = androidx.compose.ui.m.n(c0VarR, aVar2);
            aVar3 = androidx.compose.ui.node.g.I;
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
            y7.n(c0VarD, a1VarE1110, aVar3.e());
            y7.n(c0VarD, b1VarK111111111117, aVar3.g());
            function2B = aVar3.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN111111111117, aVar3.f());
            y5 y5Var1110 = y5.f16577a;
            androidx.compose.ui.a0 a0VarJ1110 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
            a1 a1VarB111111118 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK111111111118 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN111111111118 = androidx.compose.ui.m.n(c0VarR, a0VarJ1110);
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
            y7.n(c0VarD2, a1VarB111111118, aVar3.e());
            y7.n(c0VarD2, b1VarK111111111118, aVar3.g());
            function2B2 = aVar3.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN111111111118, aVar3.f());
            n0 n0Var1110 = n0.f16227a;
            x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
            c0VarR.o();
            float fB111111111111116 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
            float fB111111111111117 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
            float fB111111111111118 = u0.f.b(de.b.f.Kd, c0VarR, 0);
            if (z11) {
                c0VarR.E(648460991);
                i19 = de.b.f.f271670yd;
            } else {
                c0VarR.E(648462436);
                i19 = de.b.f.Kd;
            }
            float fB111111111111119 = u0.f.b(i19, c0VarR, 0);
            c0VarR.A();
            androidx.compose.ui.a0 a0VarU1110 = d5.u(aVar2, fB111111111111118, fB111111111111116, fB111111111111119, fB111111111111117);
            androidx.compose.foundation.shape.n nVarH1110 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
            float fB1111111111111110 = u0.f.b(de.b.f.Tc, c0VarR, 0);
            float f1119 = 0;
            float fR1110 = androidx.compose.ui.unit.h.r(f1119);
            androidx.compose.ui.a0 a0VarQ1110 = x5.q(y5Var1110, i1.j(androidx.compose.ui.draw.x.a(a0VarU1110, nVarH1110, new androidx.compose.ui.graphics.shadow.j(fB1111111111111110, s0.b(436207616), fR1110, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f1119))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
            a1 a1VarB111111119 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK111111111119 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN111111111119 = androidx.compose.ui.m.n(c0VarR, a0VarQ1110);
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
            y7.n(c0VarD3, a1VarB111111119, aVar3.e());
            y7.n(c0VarD3, b1VarK111111111119, aVar3.g());
            function2B3 = aVar3.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN111111111119, aVar3.f());
            v.b(c0VarR, 0);
            c0VarR.o();
            c0VarR.E(648476468);
            if (!z11) {
                androidx.compose.ui.a0 a0VarV1110 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                a1 a1VarB1111111110 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1111111111110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1111111111110 = androidx.compose.ui.m.n(c0VarR, a0VarV1110);
                function0A4 = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A4);
                } else {
                    c0VarR.l();
                }
                c0VarD4 = y7.d(c0VarR);
                y7.n(c0VarD4, a1VarB1111111110, aVar3.e());
                y7.n(c0VarD4, b1VarK1111111111110, aVar3.g());
                function2B4 = aVar3.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN1111111111110, aVar3.f());
                e0.b(c0VarR, 0);
                c0VarR.o();
            }
            c0VarR.A();
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
            function9 = function6;
            function10 = function7;
            function11 = function8;
        } else {
            if (i20 != 0) {
                bitmap3 = null;
            } else {
                bitmap3 = bitmap2;
            }
            if (i21 != 0) {
                z11 = false;
            }
            if (i13 != 0) {
                c0VarR.E(-689613989);
                objI2 = c0VarR.i0();
                if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI2 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return c0.f();
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                function6 = (Function0) objI2;
            } else {
                function6 = function3;
            }
            if (i15 != 0) {
                c0VarR.E(-689612933);
                objI1 = c0VarR.i0();
                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return c0.h();
                        }
                    };
                    c0VarR.Y(objI1);
                }
                c0VarR.A();
                function7 = (Function0) objI1;
            } else {
                function7 = function4;
            }
            if (i17 != 0) {
                c0VarR.E(-689611813);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.a0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return c0.i();
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                function8 = (Function0) objI0;
            } else {
                function8 = function5;
            }
            if (m0.l0()) {
                m0.A0(839576949, i12, -1, "com.planner5d.library.spaces.view.dashboard.TopPart (SpacesDashboardTopPart.kt:28)");
            }
            aVar = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.e.c cVarQ1111 = aVar.q();
            aVar2 = androidx.compose.ui.a0.E;
            qVar = androidx.compose.foundation.layout.q.f16330a;
            a1 a1VarE1111 = u5.e(qVar.w(), cVarQ1111, c0VarR, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1111111111111 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1111111111111 = androidx.compose.ui.m.n(c0VarR, aVar2);
            aVar3 = androidx.compose.ui.node.g.I;
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
            y7.n(c0VarD, a1VarE1111, aVar3.e());
            y7.n(c0VarD, b1VarK1111111111111, aVar3.g());
            function2B = aVar3.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN1111111111111, aVar3.f());
            y5 y5Var1111 = y5.f16577a;
            androidx.compose.ui.a0 a0VarJ1111 = i1.j(d5.v(aVar2, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, function6, 15, null);
            a1 a1VarB1111111111 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1111111111112 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1111111111112 = androidx.compose.ui.m.n(c0VarR, a0VarJ1111);
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
            y7.n(c0VarD2, a1VarB1111111111, aVar3.e());
            y7.n(c0VarD2, b1VarK1111111111112, aVar3.g());
            function2B2 = aVar3.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN1111111111112, aVar3.f());
            n0 n0Var1111 = n0.f16227a;
            x.b(bitmap3, 0.0f, c0VarR, i12 & 14, 2);
            c0VarR.o();
            float fB1111111111111111 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
            float fB1111111111111112 = u0.f.b(de.b.f.f271670yd, c0VarR, 0);
            float fB1111111111111113 = u0.f.b(de.b.f.Kd, c0VarR, 0);
            if (z11) {
                c0VarR.E(648460991);
                i19 = de.b.f.f271670yd;
            } else {
                c0VarR.E(648462436);
                i19 = de.b.f.Kd;
            }
            float fB1111111111111114 = u0.f.b(i19, c0VarR, 0);
            c0VarR.A();
            androidx.compose.ui.a0 a0VarU1111 = d5.u(aVar2, fB1111111111111113, fB1111111111111111, fB1111111111111114, fB1111111111111112);
            androidx.compose.foundation.shape.n nVarH1111 = androidx.compose.foundation.shape.o.h(u0.f.b(de.b.f.Tc, c0VarR, 0));
            float fB1111111111111115 = u0.f.b(de.b.f.Tc, c0VarR, 0);
            float f11110 = 0;
            float fR1111 = androidx.compose.ui.unit.h.r(f11110);
            androidx.compose.ui.a0 a0VarQ1111 = x5.q(y5Var1111, i1.j(androidx.compose.ui.draw.x.a(a0VarU1111, nVarH1111, new androidx.compose.ui.graphics.shadow.j(fB1111111111111115, s0.b(436207616), fR1111, androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.h.r(f11110))) << 32)), 0.0f, 0, 48, (DefaultConstructorMarker) null)), false, null, null, null, function7, 15, null), 1.0f, false, 2, null);
            a1 a1VarB1111111112 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
            iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1111111111113 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1111111111113 = androidx.compose.ui.m.n(c0VarR, a0VarQ1111);
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
            y7.n(c0VarD3, a1VarB1111111112, aVar3.e());
            y7.n(c0VarD3, b1VarK1111111111113, aVar3.g());
            function2B3 = aVar3.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN1111111111113, aVar3.f());
            v.b(c0VarR, 0);
            c0VarR.o();
            c0VarR.E(648476468);
            if (!z11) {
                androidx.compose.ui.a0 a0VarV1111 = d5.v(i1.j(aVar2, false, null, null, null, function8, 15, null), 0.0f, 0.0f, u0.f.b(de.b.f.f271670yd, c0VarR, 0), 0.0f, 11, null);
                a1 a1VarB1111111113 = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
                iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1111111111114 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1111111111114 = androidx.compose.ui.m.n(c0VarR, a0VarV1111);
                function0A4 = aVar3.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A4);
                } else {
                    c0VarR.l();
                }
                c0VarD4 = y7.d(c0VarR);
                y7.n(c0VarD4, a1VarB1111111113, aVar3.e());
                y7.n(c0VarD4, b1VarK1111111111114, aVar3.g());
                function2B4 = aVar3.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN1111111111114, aVar3.f());
                e0.b(c0VarR, 0);
                c0VarR.o();
            }
            c0VarR.A();
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
            function9 = function6;
            function10 = function7;
            function11 = function8;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final Bitmap bitmap19 = bitmap3;
            final boolean z117 = z11;
            s5VarT.a(new Function2() { // from class: com.planner5d.library.spaces.view.dashboard.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return c0.g(bitmap19, z117, function9, function10, function11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Bitmap bitmap, boolean z10, Function0 function0, Function0 function1, Function0 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        e(bitmap, z10, function0, function1, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i() {
        return Unit.f312394a;
    }
}
