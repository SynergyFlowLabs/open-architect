package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/OneLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,444:1\n99#2:445\n96#2,9:446\n106#2:607\n79#3,6:455\n86#3,3:470\n89#3,2:479\n79#3,6:492\n86#3,3:507\n89#3,2:516\n93#3:521\n79#3,6:532\n86#3,3:547\n89#3,2:556\n93#3:561\n79#3,6:573\n86#3,3:588\n89#3,2:597\n93#3:602\n93#3:606\n347#4,9:461\n356#4:481\n347#4,9:498\n356#4,3:518\n347#4,9:538\n356#4,3:558\n347#4,9:579\n356#4,3:599\n357#4,2:604\n4206#5,6:473\n4206#5,6:510\n4206#5,6:550\n4206#5,6:591\n49#6:482\n70#7:483\n68#7,8:484\n77#7:522\n70#7:523\n68#7,8:524\n77#7:562\n70#7:563\n67#7,9:564\n77#7:603\n113#8:608\n113#8:609\n113#8:610\n113#8:611\n113#8:612\n113#8:613\n113#8:614\n113#8:615\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/OneLine\n*L\n150#1:445\n150#1:446,9\n150#1:607\n150#1:455,6\n150#1:470,3\n150#1:479,2\n152#1:492,6\n152#1:507,3\n152#1:516,2\n152#1:521\n165#1:532,6\n165#1:547,3\n165#1:556,2\n165#1:561\n174#1:573,6\n174#1:588,3\n174#1:597,2\n174#1:602\n150#1:606\n150#1:461,9\n150#1:481\n152#1:498,9\n152#1:518,3\n165#1:538,9\n165#1:558,3\n174#1:579,9\n174#1:599,3\n150#1:604,2\n150#1:473,6\n152#1:510,6\n165#1:550,6\n174#1:591,6\n154#1:482\n152#1:483\n152#1:484,8\n152#1:522\n165#1:523\n165#1:524,8\n165#1:562\n174#1:563\n174#1:564,9\n174#1:603\n127#1:608\n128#1:609\n131#1:610\n132#1:611\n133#1:612\n136#1:613\n137#1:614\n140#1:615\n*E\n"})
final class vb {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f25281e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f25283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f25284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f25285i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final vb f25277a = new vb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f25278b = androidx.compose.ui.unit.h.r(48);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f25279c = androidx.compose.ui.unit.h.r(56);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f25280d = androidx.compose.ui.unit.h.r(40);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f25282f = androidx.compose.ui.unit.h.r(8);

    static {
        float f10 = 16;
        f25281e = androidx.compose.ui.unit.h.r(f10);
        f25283g = androidx.compose.ui.unit.h.r(f10);
        f25284h = androidx.compose.ui.unit.h.r(f10);
        f25285i = androidx.compose.ui.unit.h.r(f10);
    }

    private vb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(vb vbVar, androidx.compose.ui.a0 a0Var, Function2 function2, Function2 function3, Function2 function4, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        vbVar.b(a0Var, function2, function3, function4, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0253  */
    /* JADX WARN: Code duplicated, block: B:102:0x0257  */
    /* JADX WARN: Code duplicated, block: B:107:0x0284  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:121:0x0325  */
    /* JADX WARN: Code duplicated, block: B:123:0x034c  */
    /* JADX WARN: Code duplicated, block: B:126:0x035e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0364  */
    /* JADX WARN: Code duplicated, block: B:131:0x036e  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:79:0x0129  */
    /* JADX WARN: Code duplicated, block: B:82:0x0142  */
    /* JADX WARN: Code duplicated, block: B:84:0x018f  */
    /* JADX WARN: Code duplicated, block: B:87:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:98:0x0247  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void b(@Nullable androidx.compose.ui.a0 a0Var, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        vb vbVar;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.s5 s5VarT;
        float f10;
        androidx.compose.ui.e.a aVar;
        int iJ;
        androidx.compose.ui.node.g.a aVar2;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.foundation.layout.y5 y5Var;
        androidx.compose.ui.a0.a aVar3;
        int iJ2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        int iJ3;
        Function0<androidx.compose.ui.node.g> function0A3;
        androidx.compose.runtime.c0 c0VarD3;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3;
        int iJ4;
        Function0<androidx.compose.ui.node.g> function0A4;
        androidx.compose.runtime.c0 c0VarD4;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(413592998);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.k0(function3) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0VarR.k0(function4) ? 2048 : 1024;
        }
        if ((i11 & 16) == 0) {
            if ((i10 & 24576) == 0) {
                vbVar = this;
                i12 |= c0VarR.D(vbVar) ? 16384 : 8192;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(413592998, i12, -1, "androidx.compose.material.OneLine.ListItem (ListItem.kt:147)");
                }
                if (function2 == null) {
                    f10 = f25278b;
                } else {
                    f10 = f25279c;
                }
                androidx.compose.ui.a0 a0VarK = androidx.compose.foundation.layout.i6.k(a0Var2, f10, 0.0f, 2, null);
                androidx.compose.foundation.layout.q.e eVarW = androidx.compose.foundation.layout.q.f16330a.w();
                aVar = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(eVarW, aVar.w(), c0VarR, 0);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarK);
                aVar2 = androidx.compose.ui.node.g.I;
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
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
                function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
                y5Var = androidx.compose.foundation.layout.y5.f16577a;
                if (function2 != null) {
                    c0VarR.E(-999770394);
                    androidx.compose.ui.a0 a0VarN2 = y5Var.n(androidx.compose.ui.a0.E, aVar.q());
                    float f11 = f25281e;
                    androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.layout.i6.D(a0VarN2, androidx.compose.ui.unit.h.r(f11 + f25280d), 0.0f, 2, null);
                    float f12 = f25282f;
                    androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(a0VarD, f11, f12, 0.0f, f12, 4, null);
                    androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.o(), false);
                    iJ4 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarV);
                    function0A4 = aVar2.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A4);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD4 = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD4, a1VarK, aVar2.e());
                    androidx.compose.runtime.y7.n(c0VarD4, b1VarK2, aVar2.g());
                    function2B4 = aVar2.b();
                    if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iJ4))) {
                        c0VarD4.Y(Integer.valueOf(iJ4));
                        c0VarD4.f(Integer.valueOf(iJ4), function2B4);
                    }
                    androidx.compose.runtime.y7.n(c0VarD4, a0VarN3, aVar2.f());
                    androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    function2.invoke(c0VarR, Integer.valueOf((i12 >> 3) & 14));
                    c0VarR.o();
                    c0VarR.A();
                } else {
                    c0VarR.E(-999261064);
                    c0VarR.A();
                }
                aVar3 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarV2 = androidx.compose.foundation.layout.d5.v(y5Var.n(androidx.compose.foundation.layout.x5.q(y5Var, aVar3, 1.0f, false, 2, null), aVar.q()), f25283g, 0.0f, f25284h, 0.0f, 10, null);
                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar.o(), false);
                iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarV2);
                function0A2 = aVar2.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD2, a1VarK2, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK3, aVar2.g());
                function2B2 = aVar2.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN4, aVar2.f());
                androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                function3.invoke(c0VarR, Integer.valueOf((i12 >> 6) & 14));
                c0VarR.o();
                if (function4 != null) {
                    c0VarR.E(-998918452);
                    androidx.compose.ui.a0 a0VarV3 = androidx.compose.foundation.layout.d5.v(y5Var.n(aVar3, aVar.q()), 0.0f, 0.0f, f25285i, 0.0f, 11, null);
                    androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                    iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarV3);
                    function0A3 = aVar2.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A3);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD3, a1VarK3, aVar2.e());
                    androidx.compose.runtime.y7.n(c0VarD3, b1VarK4, aVar2.g());
                    function2B3 = aVar2.b();
                    if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    }
                    androidx.compose.runtime.y7.n(c0VarD3, a0VarN5, aVar2.f());
                    function4.invoke(c0VarR, Integer.valueOf((i12 >> 9) & 14));
                    c0VarR.o();
                    c0VarR.A();
                } else {
                    c0VarR.E(-998722408);
                    c0VarR.A();
                }
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
            }
            a0Var3 = a0Var2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final vb vbVar2 = vbVar;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.ub
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return vb.c(this.f25163a, a0Var3, function2, function3, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        vbVar = this;
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i13 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(413592998, i12, -1, "androidx.compose.material.OneLine.ListItem (ListItem.kt:147)");
            }
            if (function2 == null) {
                f10 = f25278b;
            } else {
                f10 = f25279c;
            }
            androidx.compose.ui.a0 a0VarK2 = androidx.compose.foundation.layout.i6.k(a0Var2, f10, 0.0f, 2, null);
            androidx.compose.foundation.layout.q.e eVarW2 = androidx.compose.foundation.layout.q.f16330a.w();
            aVar = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarE2 = androidx.compose.foundation.layout.u5.e(eVarW2, aVar.w(), c0VarR, 0);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarK2);
            aVar2 = androidx.compose.ui.node.g.I;
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
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarE2, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK5, aVar2.g());
            function2B = aVar2.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN6, aVar2.f());
            y5Var = androidx.compose.foundation.layout.y5.f16577a;
            if (function2 != null) {
                c0VarR.E(-999770394);
                androidx.compose.ui.a0 a0VarN7 = y5Var.n(androidx.compose.ui.a0.E, aVar.q());
                float f13 = f25281e;
                androidx.compose.ui.a0 a0VarD2 = androidx.compose.foundation.layout.i6.D(a0VarN7, androidx.compose.ui.unit.h.r(f13 + f25280d), 0.0f, 2, null);
                float f14 = f25282f;
                androidx.compose.ui.a0 a0VarV4 = androidx.compose.foundation.layout.d5.v(a0VarD2, f13, f14, 0.0f, f14, 4, null);
                androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(aVar.o(), false);
                iJ4 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarV4);
                function0A4 = aVar2.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A4);
                } else {
                    c0VarR.l();
                }
                c0VarD4 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD4, a1VarK4, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD4, b1VarK6, aVar2.g());
                function2B4 = aVar2.b();
                if (c0VarD4.P()) {
                    c0VarD4.Y(Integer.valueOf(iJ4));
                    c0VarD4.f(Integer.valueOf(iJ4), function2B4);
                } else {
                    c0VarD4.Y(Integer.valueOf(iJ4));
                    c0VarD4.f(Integer.valueOf(iJ4), function2B4);
                }
                androidx.compose.runtime.y7.n(c0VarD4, a0VarN8, aVar2.f());
                androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                function2.invoke(c0VarR, Integer.valueOf((i12 >> 3) & 14));
                c0VarR.o();
                c0VarR.A();
            } else {
                c0VarR.E(-999261064);
                c0VarR.A();
            }
            aVar3 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarV5 = androidx.compose.foundation.layout.d5.v(y5Var.n(androidx.compose.foundation.layout.x5.q(y5Var, aVar3, 1.0f, false, 2, null), aVar.q()), f25283g, 0.0f, f25284h, 0.0f, 10, null);
            androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(aVar.o(), false);
            iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarV5);
            function0A2 = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK5, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK7, aVar2.g());
            function2B2 = aVar2.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN9, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
            function3.invoke(c0VarR, Integer.valueOf((i12 >> 6) & 14));
            c0VarR.o();
            if (function4 != null) {
                c0VarR.E(-998918452);
                androidx.compose.ui.a0 a0VarV6 = androidx.compose.foundation.layout.d5.v(y5Var.n(aVar3, aVar.q()), 0.0f, 0.0f, f25285i, 0.0f, 11, null);
                androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarV6);
                function0A3 = aVar2.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD3, a1VarK6, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK8, aVar2.g());
                function2B3 = aVar2.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN10, aVar2.f());
                function4.invoke(c0VarR, Integer.valueOf((i12 >> 9) & 14));
                c0VarR.o();
                c0VarR.A();
            } else {
                c0VarR.E(-998722408);
                c0VarR.A();
            }
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        a0Var3 = a0Var2;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final vb vbVar3 = vbVar;
            s5VarT.a(new Function2() { // from class: androidx.compose.material.ub
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return vb.c(this.f25163a, a0Var3, function2, function3, function4, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
