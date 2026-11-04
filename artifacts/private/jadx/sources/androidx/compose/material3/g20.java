package androidx.compose.material3;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,394:1\n1282#2,6:395\n1282#2,6:401\n1282#2,6:408\n1282#2,6:414\n1282#2,6:498\n1282#2,6:549\n1282#2,6:555\n75#3:407\n70#4:420\n67#4,9:421\n77#4:548\n79#5,6:430\n86#5,3:445\n89#5,2:454\n79#5,6:467\n86#5,3:482\n89#5,2:491\n93#5:496\n79#5,6:514\n86#5,3:529\n89#5,2:538\n93#5:543\n93#5:547\n347#6,9:436\n356#6:456\n347#6,9:473\n356#6,3:493\n347#6,9:520\n356#6,3:540\n357#6,2:545\n4206#7,6:448\n4206#7,6:485\n4206#7,6:532\n99#8:457\n96#8,9:458\n106#8:497\n99#8:504\n96#8,9:505\n106#8:544\n54#9:561\n85#10:562\n113#11:563\n*S KotlinDebug\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxKt\n*L\n247#1:395,6\n271#1:401,6\n283#1:408,6\n312#1:414,6\n335#1:498,6\n351#1:549,6\n389#1:555,6\n275#1:407\n315#1:420\n315#1:421,9\n315#1:548\n315#1:430,6\n315#1:445,3\n315#1:454,2\n331#1:467,6\n331#1:482,3\n331#1:491,2\n331#1:496\n332#1:514,6\n332#1:529,3\n332#1:538,2\n332#1:543\n315#1:547\n315#1:436,9\n315#1:456\n331#1:473,9\n331#1:493,3\n332#1:520,9\n332#1:540,3\n315#1:545,2\n315#1:448,6\n331#1:485,6\n332#1:532,6\n331#1:457\n331#1:458,9\n331#1:497\n332#1:504\n332#1:505,9\n332#1:544\n339#1:561\n339#1:562\n393#1:563\n*E\n"})
public final class g20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f27820a = androidx.compose.ui.unit.h.r(125);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$3$1", f = "SwipeToDismissBox.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n20 f27822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<o20, Unit> f27823c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(n20 n20Var, Function1<? super o20, Unit> function1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f27822b = n20Var;
            this.f27823c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f27822b, this.f27823c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f27821a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (this.f27822b.m() != o20.Settled) {
                this.f27823c.invoke(this.f27822b.h());
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0122  */
    /* JADX WARN: Code duplicated, block: B:102:0x0126  */
    /* JADX WARN: Code duplicated, block: B:103:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0139  */
    /* JADX WARN: Code duplicated, block: B:109:0x0144  */
    /* JADX WARN: Code duplicated, block: B:112:0x014b  */
    /* JADX WARN: Code duplicated, block: B:115:0x015c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0169  */
    /* JADX WARN: Code duplicated, block: B:121:0x0172  */
    /* JADX WARN: Code duplicated, block: B:122:0x019b  */
    /* JADX WARN: Code duplicated, block: B:125:0x01da  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:132:0x0209  */
    /* JADX WARN: Code duplicated, block: B:134:0x0217  */
    /* JADX WARN: Code duplicated, block: B:137:0x0263  */
    /* JADX WARN: Code duplicated, block: B:140:0x026f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0273  */
    /* JADX WARN: Code duplicated, block: B:144:0x0294  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:153:0x02de  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:162:0x032a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0336  */
    /* JADX WARN: Code duplicated, block: B:166:0x033a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0359  */
    /* JADX WARN: Code duplicated, block: B:171:0x0367  */
    /* JADX WARN: Code duplicated, block: B:174:0x039e  */
    /* JADX WARN: Code duplicated, block: B:175:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:180:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:183:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:185:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:188:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
    /* JADX WARN: Code duplicated, block: B:97:0x011c  */
    /* JADX WARN: Code duplicated, block: B:99:0x011f  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void j(@NotNull final n20 n20Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, boolean z12, @Nullable Function1<? super o20, Unit> function1, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z14;
        int i18;
        int i19;
        final Function1<? super o20, Unit> function2;
        int i20;
        int i21;
        boolean z15;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z16;
        final boolean z17;
        final boolean z18;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        final boolean z19;
        final boolean z20;
        boolean z21;
        Function1<? super o20, Unit> function3;
        boolean z22;
        boolean z23;
        androidx.compose.foundation.gestures.e5 e5Var;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        int iJ2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        boolean z24;
        boolean z25;
        boolean zK0;
        Object objI0;
        int iJ3;
        Function0<androidx.compose.ui.node.g> function0A3;
        androidx.compose.runtime.c0 c0VarD3;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3;
        boolean z26;
        boolean z27;
        Object objI1;
        Object objI2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-741495334);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(n20Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(nVar) ? 32 : 16;
        }
        int i22 = i11 & 4;
        if (i22 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z13 = z10;
                    if (c0VarR.G(z13)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.G(z11)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        z14 = z12;
                    } else {
                        z14 = z12;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.G(z14)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                    }
                    i19 = i11 & 64;
                    if (i19 != 0) {
                        i12 |= 1572864;
                        function2 = function1;
                    } else {
                        function2 = function1;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(function2)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                    }
                    if ((i11 & 128) != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i12 |= i21;
                    }
                    if ((4793491 & i12) != 4793490) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z19 = true;
                        } else {
                            z19 = z13;
                        }
                        if (i15 != 0) {
                            z20 = true;
                        } else {
                            z20 = z11;
                        }
                        if (i17 != 0) {
                            z21 = true;
                        } else {
                            z21 = z14;
                        }
                        if (i19 != 0) {
                            objI2 = c0VarR.i0();
                            if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI2 = new Function1() { // from class: androidx.compose.material3.b20
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g20.q((o20) obj);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            function3 = (Function1) objI2;
                        } else {
                            function3 = function2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-741495334, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                        }
                        androidx.compose.foundation.gestures.b0<o20> b0VarF = n20Var.f();
                        androidx.compose.foundation.gestures.q3 q3Var = androidx.compose.foundation.gestures.q3.Horizontal;
                        if (z21 || n20Var.m() != o20.Settled) {
                            z22 = false;
                        } else {
                            z22 = true;
                        }
                        if (n20Var.o()) {
                            c0VarR.E(387581105);
                            z23 = true;
                            androidx.compose.foundation.gestures.e5 e5VarC = androidx.compose.foundation.gestures.d.f14520a.c(n20Var.f(), n20Var.j(), null, c0VarR, androidx.compose.foundation.gestures.d.f14524e << 9, 4);
                            c0VarR.A();
                            e5Var = e5VarC;
                        } else {
                            z23 = true;
                            c0VarR.E(-869685853);
                            c0VarR.A();
                            e5Var = null;
                        }
                        androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.gestures.k.B(a0Var4, b0VarF, q3Var, z22, null, null, e5Var, 24, null);
                        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), z23);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarB);
                        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                        boolean z28 = z21;
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar2.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
                        function2B = aVar2.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
                        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.a0 a0VarJ = d0Var.j(aVar3);
                        int i23 = (i12 << 6) & 7168;
                        androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                        androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(qVar.w(), aVar.w(), c0VarR, 0);
                        iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarJ);
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
                        androidx.compose.runtime.y7.n(c0VarD2, a1VarE, aVar2.e());
                        androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar2.g());
                        function2B2 = aVar2.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                            c0VarD2.Y(Integer.valueOf(iJ2));
                            c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                        }
                        androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar2.f());
                        androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
                        nVar.invoke(y5Var, c0VarR, Integer.valueOf(((i23 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                        c0VarR.o();
                        androidx.compose.foundation.gestures.b0<o20> b0VarF2 = n20Var.f();
                        if ((i12 & 7168) == 2048) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if ((57344 & i12) == 16384) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        zK0 = z25 | z24 | c0VarR.k0(n20Var);
                        objI0 = c0VarR.i0();
                        if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function2() { // from class: androidx.compose.material3.c20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.ui.a0 a0VarA = androidx.compose.material3.internal.d2.a(aVar3, b0VarF2, q3Var, (Function2) objI0);
                        int i24 = (i12 >> 12) & 7168;
                        androidx.compose.ui.layout.a1 a1VarE2 = androidx.compose.foundation.layout.u5.e(qVar.w(), aVar.w(), c0VarR, 0);
                        iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarA);
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
                        androidx.compose.runtime.y7.n(c0VarD3, a1VarE2, aVar2.e());
                        androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar2.g());
                        function2B3 = aVar2.b();
                        if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                            c0VarD3.Y(Integer.valueOf(iJ3));
                            c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                        }
                        androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar2.f());
                        nVar2.invoke(y5Var, c0VarR, Integer.valueOf(((i24 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                        c0VarR.o();
                        c0VarR.o();
                        o20 o20VarM = n20Var.m();
                        boolean zK1 = c0VarR.k0(n20Var);
                        if ((3670016 & i12) == 1048576) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = zK1 | z26;
                        objI1 = c0VarR.i0();
                        if (z27 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = new a(n20Var, function3, null);
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.runtime.b2.h(o20VarM, function3, (Function2) objI1, c0VarR, (i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z18 = z20;
                        function2 = function3;
                        a0Var3 = a0Var4;
                        z17 = z28;
                        z16 = z19;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z16 = z13;
                        z17 = z14;
                        z18 = z11;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.d20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.n(n20Var, nVar, a0Var3, z16, z18, z17, function2, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.G(z14)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
                if ((4793491 & i12) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z19 = true;
                    } else {
                        z19 = z13;
                    }
                    if (i15 != 0) {
                        z20 = true;
                    } else {
                        z20 = z11;
                    }
                    if (i17 != 0) {
                        z21 = true;
                    } else {
                        z21 = z14;
                    }
                    if (i19 != 0) {
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function1() { // from class: androidx.compose.material3.b20
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g20.q((o20) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        function3 = (Function1) objI2;
                    } else {
                        function3 = function2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-741495334, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                    }
                    androidx.compose.foundation.gestures.b0<o20> b0VarF3 = n20Var.f();
                    androidx.compose.foundation.gestures.q3 q3Var2 = androidx.compose.foundation.gestures.q3.Horizontal;
                    if (z21) {
                        z22 = false;
                    } else {
                        z22 = false;
                    }
                    if (n20Var.o()) {
                        c0VarR.E(387581105);
                        z23 = true;
                        androidx.compose.foundation.gestures.e5 e5VarC2 = androidx.compose.foundation.gestures.d.f14520a.c(n20Var.f(), n20Var.j(), null, c0VarR, androidx.compose.foundation.gestures.d.f14524e << 9, 4);
                        c0VarR.A();
                        e5Var = e5VarC2;
                    } else {
                        z23 = true;
                        c0VarR.E(-869685853);
                        c0VarR.A();
                        e5Var = null;
                    }
                    androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.gestures.k.B(a0Var4, b0VarF3, q3Var2, z22, null, null, e5Var, 24, null);
                    androidx.compose.ui.e.a aVar4 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar4.C(), z23);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarB2);
                    androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                    boolean z29 = z21;
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK2, aVar5.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK4, aVar5.g());
                    function2B = aVar5.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN4, aVar5.f());
                    androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarJ2 = d0Var2.j(aVar6);
                    int i25 = (i12 << 6) & 7168;
                    androidx.compose.foundation.layout.q qVar2 = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.ui.layout.a1 a1VarE3 = androidx.compose.foundation.layout.u5.e(qVar2.w(), aVar4.w(), c0VarR, 0);
                    iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarJ2);
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
                    c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD2, a1VarE3, aVar5.e());
                    androidx.compose.runtime.y7.n(c0VarD2, b1VarK5, aVar5.g());
                    function2B2 = aVar5.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD2, a0VarN5, aVar5.f());
                    androidx.compose.foundation.layout.y5 y5Var2 = androidx.compose.foundation.layout.y5.f16577a;
                    nVar.invoke(y5Var2, c0VarR, Integer.valueOf(((i25 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                    c0VarR.o();
                    androidx.compose.foundation.gestures.b0<o20> b0VarF4 = n20Var.f();
                    if ((i12 & 7168) == 2048) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((57344 & i12) == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zK0 = z25 | z24 | c0VarR.k0(n20Var);
                    objI0 = c0VarR.i0();
                    if (zK0) {
                        objI0 = new Function2() { // from class: androidx.compose.material3.c20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function2() { // from class: androidx.compose.material3.c20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarA2 = androidx.compose.material3.internal.d2.a(aVar6, b0VarF4, q3Var2, (Function2) objI0);
                    int i26 = (i12 >> 12) & 7168;
                    androidx.compose.ui.layout.a1 a1VarE4 = androidx.compose.foundation.layout.u5.e(qVar2.w(), aVar4.w(), c0VarR, 0);
                    iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarA2);
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
                    c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD3, a1VarE4, aVar5.e());
                    androidx.compose.runtime.y7.n(c0VarD3, b1VarK6, aVar5.g());
                    function2B3 = aVar5.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    }
                    androidx.compose.runtime.y7.n(c0VarD3, a0VarN6, aVar5.f());
                    nVar2.invoke(y5Var2, c0VarR, Integer.valueOf(((i26 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                    c0VarR.o();
                    c0VarR.o();
                    o20 o20VarM2 = n20Var.m();
                    boolean zK2 = c0VarR.k0(n20Var);
                    if ((3670016 & i12) == 1048576) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = zK2 | z26;
                    objI1 = c0VarR.i0();
                    if (z27) {
                        objI1 = new a(n20Var, function3, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new a(n20Var, function3, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.h(o20VarM2, function3, (Function2) objI1, c0VarR, (i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z18 = z20;
                    function2 = function3;
                    a0Var3 = a0Var4;
                    z17 = z29;
                    z16 = z19;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z16 = z13;
                    z17 = z14;
                    z18 = z11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.d20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.n(n20Var, nVar, a0Var3, z16, z18, z17, function2, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z13 = z10;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.G(z11)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.G(z14)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
                if ((4793491 & i12) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z19 = true;
                    } else {
                        z19 = z13;
                    }
                    if (i15 != 0) {
                        z20 = true;
                    } else {
                        z20 = z11;
                    }
                    if (i17 != 0) {
                        z21 = true;
                    } else {
                        z21 = z14;
                    }
                    if (i19 != 0) {
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function1() { // from class: androidx.compose.material3.b20
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g20.q((o20) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        function3 = (Function1) objI2;
                    } else {
                        function3 = function2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-741495334, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                    }
                    androidx.compose.foundation.gestures.b0<o20> b0VarF5 = n20Var.f();
                    androidx.compose.foundation.gestures.q3 q3Var3 = androidx.compose.foundation.gestures.q3.Horizontal;
                    if (z21) {
                        z22 = false;
                    } else {
                        z22 = false;
                    }
                    if (n20Var.o()) {
                        c0VarR.E(387581105);
                        z23 = true;
                        androidx.compose.foundation.gestures.e5 e5VarC3 = androidx.compose.foundation.gestures.d.f14520a.c(n20Var.f(), n20Var.j(), null, c0VarR, androidx.compose.foundation.gestures.d.f14524e << 9, 4);
                        c0VarR.A();
                        e5Var = e5VarC3;
                    } else {
                        z23 = true;
                        c0VarR.E(-869685853);
                        c0VarR.A();
                        e5Var = null;
                    }
                    androidx.compose.ui.a0 a0VarB3 = androidx.compose.foundation.gestures.k.B(a0Var4, b0VarF5, q3Var3, z22, null, null, e5Var, 24, null);
                    androidx.compose.ui.e.a aVar7 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar7.C(), z23);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarB3);
                    androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                    boolean z210 = z21;
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK3, aVar8.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK7, aVar8.g());
                    function2B = aVar8.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN7, aVar8.f());
                    androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.ui.a0.a aVar9 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarJ3 = d0Var3.j(aVar9);
                    int i27 = (i12 << 6) & 7168;
                    androidx.compose.foundation.layout.q qVar3 = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.ui.layout.a1 a1VarE5 = androidx.compose.foundation.layout.u5.e(qVar3.w(), aVar7.w(), c0VarR, 0);
                    iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarJ3);
                    function0A2 = aVar8.a();
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
                    androidx.compose.runtime.y7.n(c0VarD2, a1VarE5, aVar8.e());
                    androidx.compose.runtime.y7.n(c0VarD2, b1VarK8, aVar8.g());
                    function2B2 = aVar8.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD2, a0VarN8, aVar8.f());
                    androidx.compose.foundation.layout.y5 y5Var3 = androidx.compose.foundation.layout.y5.f16577a;
                    nVar.invoke(y5Var3, c0VarR, Integer.valueOf(((i27 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                    c0VarR.o();
                    androidx.compose.foundation.gestures.b0<o20> b0VarF6 = n20Var.f();
                    if ((i12 & 7168) == 2048) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((57344 & i12) == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zK0 = z25 | z24 | c0VarR.k0(n20Var);
                    objI0 = c0VarR.i0();
                    if (zK0) {
                        objI0 = new Function2() { // from class: androidx.compose.material3.c20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function2() { // from class: androidx.compose.material3.c20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarA3 = androidx.compose.material3.internal.d2.a(aVar9, b0VarF6, q3Var3, (Function2) objI0);
                    int i28 = (i12 >> 12) & 7168;
                    androidx.compose.ui.layout.a1 a1VarE6 = androidx.compose.foundation.layout.u5.e(qVar3.w(), aVar7.w(), c0VarR, 0);
                    iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarA3);
                    function0A3 = aVar8.a();
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
                    androidx.compose.runtime.y7.n(c0VarD3, a1VarE6, aVar8.e());
                    androidx.compose.runtime.y7.n(c0VarD3, b1VarK9, aVar8.g());
                    function2B3 = aVar8.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    }
                    androidx.compose.runtime.y7.n(c0VarD3, a0VarN9, aVar8.f());
                    nVar2.invoke(y5Var3, c0VarR, Integer.valueOf(((i28 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                    c0VarR.o();
                    c0VarR.o();
                    o20 o20VarM3 = n20Var.m();
                    boolean zK3 = c0VarR.k0(n20Var);
                    if ((3670016 & i12) == 1048576) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = zK3 | z26;
                    objI1 = c0VarR.i0();
                    if (z27) {
                        objI1 = new a(n20Var, function3, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new a(n20Var, function3, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.h(o20VarM3, function3, (Function2) objI1, c0VarR, (i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z18 = z20;
                    function2 = function3;
                    a0Var3 = a0Var4;
                    z17 = z210;
                    z16 = z19;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z16 = z13;
                    z17 = z14;
                    z18 = z11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.d20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.n(n20Var, nVar, a0Var3, z16, z18, z17, function2, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z14)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
            if ((4793491 & i12) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i12 & 1)) {
                if (i22 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z19 = true;
                } else {
                    z19 = z13;
                }
                if (i15 != 0) {
                    z20 = true;
                } else {
                    z20 = z11;
                }
                if (i17 != 0) {
                    z21 = true;
                } else {
                    z21 = z14;
                }
                if (i19 != 0) {
                    objI2 = c0VarR.i0();
                    if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.b20
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g20.q((o20) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    function3 = (Function1) objI2;
                } else {
                    function3 = function2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-741495334, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                }
                androidx.compose.foundation.gestures.b0<o20> b0VarF7 = n20Var.f();
                androidx.compose.foundation.gestures.q3 q3Var4 = androidx.compose.foundation.gestures.q3.Horizontal;
                if (z21) {
                    z22 = false;
                } else {
                    z22 = false;
                }
                if (n20Var.o()) {
                    c0VarR.E(387581105);
                    z23 = true;
                    androidx.compose.foundation.gestures.e5 e5VarC4 = androidx.compose.foundation.gestures.d.f14520a.c(n20Var.f(), n20Var.j(), null, c0VarR, androidx.compose.foundation.gestures.d.f14524e << 9, 4);
                    c0VarR.A();
                    e5Var = e5VarC4;
                } else {
                    z23 = true;
                    c0VarR.E(-869685853);
                    c0VarR.A();
                    e5Var = null;
                }
                androidx.compose.ui.a0 a0VarB4 = androidx.compose.foundation.gestures.k.B(a0Var4, b0VarF7, q3Var4, z22, null, null, e5Var, 24, null);
                androidx.compose.ui.e.a aVar10 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(aVar10.C(), z23);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarB4);
                androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                boolean z211 = z21;
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
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK4, aVar11.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK10, aVar11.g());
                function2B = aVar11.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN10, aVar11.f());
                androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.ui.a0.a aVar12 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarJ4 = d0Var4.j(aVar12);
                int i29 = (i12 << 6) & 7168;
                androidx.compose.foundation.layout.q qVar4 = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.ui.layout.a1 a1VarE7 = androidx.compose.foundation.layout.u5.e(qVar4.w(), aVar10.w(), c0VarR, 0);
                iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarJ4);
                function0A2 = aVar11.a();
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
                androidx.compose.runtime.y7.n(c0VarD2, a1VarE7, aVar11.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK11, aVar11.g());
                function2B2 = aVar11.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN11, aVar11.f());
                androidx.compose.foundation.layout.y5 y5Var4 = androidx.compose.foundation.layout.y5.f16577a;
                nVar.invoke(y5Var4, c0VarR, Integer.valueOf(((i29 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                androidx.compose.foundation.gestures.b0<o20> b0VarF8 = n20Var.f();
                if ((i12 & 7168) == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if ((57344 & i12) == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zK0 = z25 | z24 | c0VarR.k0(n20Var);
                objI0 = c0VarR.i0();
                if (zK0) {
                    objI0 = new Function2() { // from class: androidx.compose.material3.c20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function2() { // from class: androidx.compose.material3.c20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarA4 = androidx.compose.material3.internal.d2.a(aVar12, b0VarF8, q3Var4, (Function2) objI0);
                int i210 = (i12 >> 12) & 7168;
                androidx.compose.ui.layout.a1 a1VarE8 = androidx.compose.foundation.layout.u5.e(qVar4.w(), aVar10.w(), c0VarR, 0);
                iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarA4);
                function0A3 = aVar11.a();
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
                androidx.compose.runtime.y7.n(c0VarD3, a1VarE8, aVar11.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK12, aVar11.g());
                function2B3 = aVar11.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN12, aVar11.f());
                nVar2.invoke(y5Var4, c0VarR, Integer.valueOf(((i210 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                c0VarR.o();
                o20 o20VarM4 = n20Var.m();
                boolean zK4 = c0VarR.k0(n20Var);
                if ((3670016 & i12) == 1048576) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = zK4 | z26;
                objI1 = c0VarR.i0();
                if (z27) {
                    objI1 = new a(n20Var, function3, null);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new a(n20Var, function3, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.h(o20VarM4, function3, (Function2) objI1, c0VarR, (i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z18 = z20;
                function2 = function3;
                a0Var3 = a0Var4;
                z17 = z211;
                z16 = z19;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z16 = z13;
                z17 = z14;
                z18 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.d20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g20.n(n20Var, nVar, a0Var3, z16, z18, z17, function2, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z13 = z10;
                if (c0VarR.G(z13)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.G(z11)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.G(z14)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
                if ((4793491 & i12) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z19 = true;
                    } else {
                        z19 = z13;
                    }
                    if (i15 != 0) {
                        z20 = true;
                    } else {
                        z20 = z11;
                    }
                    if (i17 != 0) {
                        z21 = true;
                    } else {
                        z21 = z14;
                    }
                    if (i19 != 0) {
                        objI2 = c0VarR.i0();
                        if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI2 = new Function1() { // from class: androidx.compose.material3.b20
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g20.q((o20) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        function3 = (Function1) objI2;
                    } else {
                        function3 = function2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-741495334, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                    }
                    androidx.compose.foundation.gestures.b0<o20> b0VarF9 = n20Var.f();
                    androidx.compose.foundation.gestures.q3 q3Var5 = androidx.compose.foundation.gestures.q3.Horizontal;
                    if (z21) {
                        z22 = false;
                    } else {
                        z22 = false;
                    }
                    if (n20Var.o()) {
                        c0VarR.E(387581105);
                        z23 = true;
                        androidx.compose.foundation.gestures.e5 e5VarC5 = androidx.compose.foundation.gestures.d.f14520a.c(n20Var.f(), n20Var.j(), null, c0VarR, androidx.compose.foundation.gestures.d.f14524e << 9, 4);
                        c0VarR.A();
                        e5Var = e5VarC5;
                    } else {
                        z23 = true;
                        c0VarR.E(-869685853);
                        c0VarR.A();
                        e5Var = null;
                    }
                    androidx.compose.ui.a0 a0VarB5 = androidx.compose.foundation.gestures.k.B(a0Var4, b0VarF9, q3Var5, z22, null, null, e5Var, 24, null);
                    androidx.compose.ui.e.a aVar13 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(aVar13.C(), z23);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarB5);
                    androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                    boolean z212 = z21;
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK5, aVar14.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK13, aVar14.g());
                    function2B = aVar14.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN13, aVar14.f());
                    androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.ui.a0.a aVar15 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.a0 a0VarJ5 = d0Var5.j(aVar15);
                    int i211 = (i12 << 6) & 7168;
                    androidx.compose.foundation.layout.q qVar5 = androidx.compose.foundation.layout.q.f16330a;
                    androidx.compose.ui.layout.a1 a1VarE9 = androidx.compose.foundation.layout.u5.e(qVar5.w(), aVar13.w(), c0VarR, 0);
                    iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarJ5);
                    function0A2 = aVar14.a();
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
                    androidx.compose.runtime.y7.n(c0VarD2, a1VarE9, aVar14.e());
                    androidx.compose.runtime.y7.n(c0VarD2, b1VarK14, aVar14.g());
                    function2B2 = aVar14.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD2, a0VarN14, aVar14.f());
                    androidx.compose.foundation.layout.y5 y5Var5 = androidx.compose.foundation.layout.y5.f16577a;
                    nVar.invoke(y5Var5, c0VarR, Integer.valueOf(((i211 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                    c0VarR.o();
                    androidx.compose.foundation.gestures.b0<o20> b0VarF10 = n20Var.f();
                    if ((i12 & 7168) == 2048) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((57344 & i12) == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zK0 = z25 | z24 | c0VarR.k0(n20Var);
                    objI0 = c0VarR.i0();
                    if (zK0) {
                        objI0 = new Function2() { // from class: androidx.compose.material3.c20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function2() { // from class: androidx.compose.material3.c20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarA5 = androidx.compose.material3.internal.d2.a(aVar15, b0VarF10, q3Var5, (Function2) objI0);
                    int i212 = (i12 >> 12) & 7168;
                    androidx.compose.ui.layout.a1 a1VarE10 = androidx.compose.foundation.layout.u5.e(qVar5.w(), aVar13.w(), c0VarR, 0);
                    iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarA5);
                    function0A3 = aVar14.a();
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
                    androidx.compose.runtime.y7.n(c0VarD3, a1VarE10, aVar14.e());
                    androidx.compose.runtime.y7.n(c0VarD3, b1VarK15, aVar14.g());
                    function2B3 = aVar14.b();
                    if (c0VarD3.P()) {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    } else {
                        c0VarD3.Y(Integer.valueOf(iJ3));
                        c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                    }
                    androidx.compose.runtime.y7.n(c0VarD3, a0VarN15, aVar14.f());
                    nVar2.invoke(y5Var5, c0VarR, Integer.valueOf(((i212 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                    c0VarR.o();
                    c0VarR.o();
                    o20 o20VarM5 = n20Var.m();
                    boolean zK5 = c0VarR.k0(n20Var);
                    if ((3670016 & i12) == 1048576) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = zK5 | z26;
                    objI1 = c0VarR.i0();
                    if (z27) {
                        objI1 = new a(n20Var, function3, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new a(n20Var, function3, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.h(o20VarM5, function3, (Function2) objI1, c0VarR, (i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z18 = z20;
                    function2 = function3;
                    a0Var3 = a0Var4;
                    z17 = z212;
                    z16 = z19;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z16 = z13;
                    z17 = z14;
                    z18 = z11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.d20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.n(n20Var, nVar, a0Var3, z16, z18, z17, function2, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z14)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
            if ((4793491 & i12) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i12 & 1)) {
                if (i22 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z19 = true;
                } else {
                    z19 = z13;
                }
                if (i15 != 0) {
                    z20 = true;
                } else {
                    z20 = z11;
                }
                if (i17 != 0) {
                    z21 = true;
                } else {
                    z21 = z14;
                }
                if (i19 != 0) {
                    objI2 = c0VarR.i0();
                    if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.b20
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g20.q((o20) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    function3 = (Function1) objI2;
                } else {
                    function3 = function2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-741495334, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                }
                androidx.compose.foundation.gestures.b0<o20> b0VarF11 = n20Var.f();
                androidx.compose.foundation.gestures.q3 q3Var6 = androidx.compose.foundation.gestures.q3.Horizontal;
                if (z21) {
                    z22 = false;
                } else {
                    z22 = false;
                }
                if (n20Var.o()) {
                    c0VarR.E(387581105);
                    z23 = true;
                    androidx.compose.foundation.gestures.e5 e5VarC6 = androidx.compose.foundation.gestures.d.f14520a.c(n20Var.f(), n20Var.j(), null, c0VarR, androidx.compose.foundation.gestures.d.f14524e << 9, 4);
                    c0VarR.A();
                    e5Var = e5VarC6;
                } else {
                    z23 = true;
                    c0VarR.E(-869685853);
                    c0VarR.A();
                    e5Var = null;
                }
                androidx.compose.ui.a0 a0VarB6 = androidx.compose.foundation.gestures.k.B(a0Var4, b0VarF11, q3Var6, z22, null, null, e5Var, 24, null);
                androidx.compose.ui.e.a aVar16 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(aVar16.C(), z23);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarB6);
                androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
                boolean z213 = z21;
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
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK6, aVar17.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK16, aVar17.g());
                function2B = aVar17.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN16, aVar17.f());
                androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.ui.a0.a aVar18 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarJ6 = d0Var6.j(aVar18);
                int i213 = (i12 << 6) & 7168;
                androidx.compose.foundation.layout.q qVar6 = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.ui.layout.a1 a1VarE11 = androidx.compose.foundation.layout.u5.e(qVar6.w(), aVar16.w(), c0VarR, 0);
                iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK17 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, a0VarJ6);
                function0A2 = aVar17.a();
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
                androidx.compose.runtime.y7.n(c0VarD2, a1VarE11, aVar17.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK17, aVar17.g());
                function2B2 = aVar17.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN17, aVar17.f());
                androidx.compose.foundation.layout.y5 y5Var6 = androidx.compose.foundation.layout.y5.f16577a;
                nVar.invoke(y5Var6, c0VarR, Integer.valueOf(((i213 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                androidx.compose.foundation.gestures.b0<o20> b0VarF12 = n20Var.f();
                if ((i12 & 7168) == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if ((57344 & i12) == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zK0 = z25 | z24 | c0VarR.k0(n20Var);
                objI0 = c0VarR.i0();
                if (zK0) {
                    objI0 = new Function2() { // from class: androidx.compose.material3.c20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function2() { // from class: androidx.compose.material3.c20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarA6 = androidx.compose.material3.internal.d2.a(aVar18, b0VarF12, q3Var6, (Function2) objI0);
                int i214 = (i12 >> 12) & 7168;
                androidx.compose.ui.layout.a1 a1VarE12 = androidx.compose.foundation.layout.u5.e(qVar6.w(), aVar16.w(), c0VarR, 0);
                iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK18 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarA6);
                function0A3 = aVar17.a();
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
                androidx.compose.runtime.y7.n(c0VarD3, a1VarE12, aVar17.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK18, aVar17.g());
                function2B3 = aVar17.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN18, aVar17.f());
                nVar2.invoke(y5Var6, c0VarR, Integer.valueOf(((i214 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                c0VarR.o();
                o20 o20VarM6 = n20Var.m();
                boolean zK6 = c0VarR.k0(n20Var);
                if ((3670016 & i12) == 1048576) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = zK6 | z26;
                objI1 = c0VarR.i0();
                if (z27) {
                    objI1 = new a(n20Var, function3, null);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new a(n20Var, function3, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.h(o20VarM6, function3, (Function2) objI1, c0VarR, (i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z18 = z20;
                function2 = function3;
                a0Var3 = a0Var4;
                z17 = z213;
                z16 = z19;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z16 = z13;
                z17 = z14;
                z18 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.d20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g20.n(n20Var, nVar, a0Var3, z16, z18, z17, function2, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z13 = z10;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                if (c0VarR.G(z11)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z14)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            }
            if ((4793491 & i12) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i12 & 1)) {
                if (i22 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z19 = true;
                } else {
                    z19 = z13;
                }
                if (i15 != 0) {
                    z20 = true;
                } else {
                    z20 = z11;
                }
                if (i17 != 0) {
                    z21 = true;
                } else {
                    z21 = z14;
                }
                if (i19 != 0) {
                    objI2 = c0VarR.i0();
                    if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.b20
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g20.q((o20) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    function3 = (Function1) objI2;
                } else {
                    function3 = function2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-741495334, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
                }
                androidx.compose.foundation.gestures.b0<o20> b0VarF13 = n20Var.f();
                androidx.compose.foundation.gestures.q3 q3Var7 = androidx.compose.foundation.gestures.q3.Horizontal;
                if (z21) {
                    z22 = false;
                } else {
                    z22 = false;
                }
                if (n20Var.o()) {
                    c0VarR.E(387581105);
                    z23 = true;
                    androidx.compose.foundation.gestures.e5 e5VarC7 = androidx.compose.foundation.gestures.d.f14520a.c(n20Var.f(), n20Var.j(), null, c0VarR, androidx.compose.foundation.gestures.d.f14524e << 9, 4);
                    c0VarR.A();
                    e5Var = e5VarC7;
                } else {
                    z23 = true;
                    c0VarR.E(-869685853);
                    c0VarR.A();
                    e5Var = null;
                }
                androidx.compose.ui.a0 a0VarB7 = androidx.compose.foundation.gestures.k.B(a0Var4, b0VarF13, q3Var7, z22, null, null, e5Var, 24, null);
                androidx.compose.ui.e.a aVar19 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(aVar19.C(), z23);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK19 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarB7);
                androidx.compose.ui.node.g.a aVar110 = androidx.compose.ui.node.g.I;
                boolean z214 = z21;
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
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK7, aVar110.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK19, aVar110.g());
                function2B = aVar110.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN19, aVar110.f());
                androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.ui.a0.a aVar111 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarJ7 = d0Var7.j(aVar111);
                int i215 = (i12 << 6) & 7168;
                androidx.compose.foundation.layout.q qVar7 = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.ui.layout.a1 a1VarE13 = androidx.compose.foundation.layout.u5.e(qVar7.w(), aVar19.w(), c0VarR, 0);
                iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, a0VarJ7);
                function0A2 = aVar110.a();
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
                androidx.compose.runtime.y7.n(c0VarD2, a1VarE13, aVar110.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK110, aVar110.g());
                function2B2 = aVar110.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN110, aVar110.f());
                androidx.compose.foundation.layout.y5 y5Var7 = androidx.compose.foundation.layout.y5.f16577a;
                nVar.invoke(y5Var7, c0VarR, Integer.valueOf(((i215 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                androidx.compose.foundation.gestures.b0<o20> b0VarF14 = n20Var.f();
                if ((i12 & 7168) == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if ((57344 & i12) == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zK0 = z25 | z24 | c0VarR.k0(n20Var);
                objI0 = c0VarR.i0();
                if (zK0) {
                    objI0 = new Function2() { // from class: androidx.compose.material3.c20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function2() { // from class: androidx.compose.material3.c20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarA7 = androidx.compose.material3.internal.d2.a(aVar111, b0VarF14, q3Var7, (Function2) objI0);
                int i216 = (i12 >> 12) & 7168;
                androidx.compose.ui.layout.a1 a1VarE14 = androidx.compose.foundation.layout.u5.e(qVar7.w(), aVar19.w(), c0VarR, 0);
                iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, a0VarA7);
                function0A3 = aVar110.a();
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
                androidx.compose.runtime.y7.n(c0VarD3, a1VarE14, aVar110.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK111, aVar110.g());
                function2B3 = aVar110.b();
                if (c0VarD3.P()) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                } else {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN111, aVar110.f());
                nVar2.invoke(y5Var7, c0VarR, Integer.valueOf(((i216 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                c0VarR.o();
                o20 o20VarM7 = n20Var.m();
                boolean zK7 = c0VarR.k0(n20Var);
                if ((3670016 & i12) == 1048576) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = zK7 | z26;
                objI1 = c0VarR.i0();
                if (z27) {
                    objI1 = new a(n20Var, function3, null);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new a(n20Var, function3, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.h(o20VarM7, function3, (Function2) objI1, c0VarR, (i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z18 = z20;
                function2 = function3;
                a0Var3 = a0Var4;
                z17 = z214;
                z16 = z19;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z16 = z13;
                z17 = z14;
                z18 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.d20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g20.n(n20Var, nVar, a0Var3, z16, z18, z17, function2, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        i17 = i11 & 32;
        if (i17 != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            z14 = z12;
        } else {
            z14 = z12;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.G(z14)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
        }
        i19 = i11 & 64;
        if (i19 != 0) {
            i12 |= 1572864;
            function2 = function1;
        } else {
            function2 = function1;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function2)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.k0(nVar2)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i12 |= i21;
        }
        if ((4793491 & i12) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c0VarR.h(z15, i12 & 1)) {
            if (i22 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                z19 = true;
            } else {
                z19 = z13;
            }
            if (i15 != 0) {
                z20 = true;
            } else {
                z20 = z11;
            }
            if (i17 != 0) {
                z21 = true;
            } else {
                z21 = z14;
            }
            if (i19 != 0) {
                objI2 = c0VarR.i0();
                if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.b20
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return g20.q((o20) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                function3 = (Function1) objI2;
            } else {
                function3 = function2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-741495334, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:313)");
            }
            androidx.compose.foundation.gestures.b0<o20> b0VarF15 = n20Var.f();
            androidx.compose.foundation.gestures.q3 q3Var8 = androidx.compose.foundation.gestures.q3.Horizontal;
            if (z21) {
                z22 = false;
            } else {
                z22 = false;
            }
            if (n20Var.o()) {
                c0VarR.E(387581105);
                z23 = true;
                androidx.compose.foundation.gestures.e5 e5VarC8 = androidx.compose.foundation.gestures.d.f14520a.c(n20Var.f(), n20Var.j(), null, c0VarR, androidx.compose.foundation.gestures.d.f14524e << 9, 4);
                c0VarR.A();
                e5Var = e5VarC8;
            } else {
                z23 = true;
                c0VarR.E(-869685853);
                c0VarR.A();
                e5Var = null;
            }
            androidx.compose.ui.a0 a0VarB8 = androidx.compose.foundation.gestures.k.B(a0Var4, b0VarF15, q3Var8, z22, null, null, e5Var, 24, null);
            androidx.compose.ui.e.a aVar112 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(aVar112.C(), z23);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK112 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarB8);
            androidx.compose.ui.node.g.a aVar113 = androidx.compose.ui.node.g.I;
            boolean z215 = z21;
            function0A = aVar113.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK8, aVar113.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK112, aVar113.g());
            function2B = aVar113.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN112, aVar113.f());
            androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.ui.a0.a aVar114 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarJ8 = d0Var8.j(aVar114);
            int i217 = (i12 << 6) & 7168;
            androidx.compose.foundation.layout.q qVar8 = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.ui.layout.a1 a1VarE15 = androidx.compose.foundation.layout.u5.e(qVar8.w(), aVar112.w(), c0VarR, 0);
            iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK113 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, a0VarJ8);
            function0A2 = aVar113.a();
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
            androidx.compose.runtime.y7.n(c0VarD2, a1VarE15, aVar113.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK113, aVar113.g());
            function2B2 = aVar113.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN113, aVar113.f());
            androidx.compose.foundation.layout.y5 y5Var8 = androidx.compose.foundation.layout.y5.f16577a;
            nVar.invoke(y5Var8, c0VarR, Integer.valueOf(((i217 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
            c0VarR.o();
            androidx.compose.foundation.gestures.b0<o20> b0VarF16 = n20Var.f();
            if ((i12 & 7168) == 2048) {
                z24 = true;
            } else {
                z24 = false;
            }
            if ((57344 & i12) == 16384) {
                z25 = true;
            } else {
                z25 = false;
            }
            zK0 = z25 | z24 | c0VarR.k0(n20Var);
            objI0 = c0VarR.i0();
            if (zK0) {
                objI0 = new Function2() { // from class: androidx.compose.material3.c20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function2() { // from class: androidx.compose.material3.c20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g20.l(n20Var, z19, z20, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarA8 = androidx.compose.material3.internal.d2.a(aVar114, b0VarF16, q3Var8, (Function2) objI0);
            int i218 = (i12 >> 12) & 7168;
            androidx.compose.ui.layout.a1 a1VarE16 = androidx.compose.foundation.layout.u5.e(qVar8.w(), aVar112.w(), c0VarR, 0);
            iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK114 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, a0VarA8);
            function0A3 = aVar113.a();
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
            androidx.compose.runtime.y7.n(c0VarD3, a1VarE16, aVar113.e());
            androidx.compose.runtime.y7.n(c0VarD3, b1VarK114, aVar113.g());
            function2B3 = aVar113.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iJ3));
                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iJ3));
                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
            }
            androidx.compose.runtime.y7.n(c0VarD3, a0VarN114, aVar113.f());
            nVar2.invoke(y5Var8, c0VarR, Integer.valueOf(((i218 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
            c0VarR.o();
            c0VarR.o();
            o20 o20VarM8 = n20Var.m();
            boolean zK8 = c0VarR.k0(n20Var);
            if ((3670016 & i12) == 1048576) {
                z26 = true;
            } else {
                z26 = false;
            }
            z27 = zK8 | z26;
            objI1 = c0VarR.i0();
            if (z27) {
                objI1 = new a(n20Var, function3, null);
                c0VarR.Y(objI1);
            } else {
                objI1 = new a(n20Var, function3, null);
                c0VarR.Y(objI1);
            }
            androidx.compose.runtime.b2.h(o20VarM8, function3, (Function2) objI1, c0VarR, (i12 >> 15) & com.planner5d.library.engine.input.f.b.B);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            z18 = z20;
            function2 = function3;
            a0Var3 = a0Var4;
            z17 = z215;
            z16 = z19;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z16 = z13;
            z17 = z14;
            z18 = z11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.d20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g20.n(n20Var, nVar, a0Var3, z16, z18, z17, function2, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0158  */
    /* JADX WARN: Code duplicated, block: B:107:0x0161  */
    /* JADX WARN: Code duplicated, block: B:110:0x0177  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:96:0x0102  */
    /* JADX WARN: Code duplicated, block: B:99:0x010a  */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility. Use updated signature with onDismissed parameter.")
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final /* synthetic */ void k(final n20 n20Var, final pj.n nVar, androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, boolean z12, final pj.n nVar2, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        n20 n20Var2;
        int i12;
        pj.n nVar3;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z14;
        androidx.compose.runtime.c0 c0Var2;
        final boolean z15;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z16;
        final boolean z17;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        boolean z18;
        boolean z19;
        boolean z20;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1807005299);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            n20Var2 = n20Var;
        } else {
            n20Var2 = n20Var;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(n20Var2) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
            nVar3 = nVar;
        } else {
            nVar3 = nVar;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(nVar3) ? 32 : 16;
            }
        }
        int i20 = i11 & 4;
        if (i20 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z13 = z10;
                    if (c0VarR.G(z13)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.G(z11)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            if (c0VarR.G(z12)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 64) != 0) {
                            if ((i10 & 1572864) == 0) {
                                if (c0VarR.k0(nVar2)) {
                                    i19 = 1048576;
                                } else {
                                    i19 = 524288;
                                }
                                i12 |= i19;
                            }
                            if ((i12 & 599187) != 599186) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (c0VarR.h(z14, i12 & 1)) {
                                if (i20 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i13 != 0) {
                                    z18 = true;
                                } else {
                                    z18 = z13;
                                }
                                if (i15 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = z11;
                                }
                                if (i17 != 0) {
                                    z20 = true;
                                } else {
                                    z20 = z12;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                                }
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return g20.o((o20) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                c0Var2 = c0VarR;
                                j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var4;
                                z16 = z18;
                                z15 = z19;
                                z17 = z20;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                z15 = z11;
                                a0Var3 = a0Var2;
                                z16 = z13;
                                z17 = z12;
                            }
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= 1572864;
                        if ((i12 & 599187) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z18 = true;
                            } else {
                                z18 = z13;
                            }
                            if (i15 != 0) {
                                z19 = true;
                            } else {
                                z19 = z11;
                            }
                            if (i17 != 0) {
                                z20 = true;
                            } else {
                                z20 = z12;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                            }
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g20.o((o20) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0Var2 = c0VarR;
                            j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            z16 = z18;
                            z15 = z19;
                            z17 = z20;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            z15 = z11;
                            a0Var3 = a0Var2;
                            z16 = z13;
                            z17 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                        if ((i12 & 599187) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z18 = true;
                            } else {
                                z18 = z13;
                            }
                            if (i15 != 0) {
                                z19 = true;
                            } else {
                                z19 = z11;
                            }
                            if (i17 != 0) {
                                z20 = true;
                            } else {
                                z20 = z12;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                            }
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g20.o((o20) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0Var2 = c0VarR;
                            j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            z16 = z18;
                            z15 = z19;
                            z17 = z20;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            z15 = z11;
                            a0Var3 = a0Var2;
                            z16 = z13;
                            z17 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    if ((i12 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i15 != 0) {
                            z19 = true;
                        } else {
                            z19 = z11;
                        }
                        if (i17 != 0) {
                            z20 = true;
                        } else {
                            z20 = z12;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g20.o((o20) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0Var2 = c0VarR;
                        j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z16 = z18;
                        z15 = z19;
                        z17 = z20;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z15 = z11;
                        a0Var3 = a0Var2;
                        z16 = z13;
                        z17 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                        if ((i12 & 599187) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z18 = true;
                            } else {
                                z18 = z13;
                            }
                            if (i15 != 0) {
                                z19 = true;
                            } else {
                                z19 = z11;
                            }
                            if (i17 != 0) {
                                z20 = true;
                            } else {
                                z20 = z12;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                            }
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g20.o((o20) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0Var2 = c0VarR;
                            j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            z16 = z18;
                            z15 = z19;
                            z17 = z20;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            z15 = z11;
                            a0Var3 = a0Var2;
                            z16 = z13;
                            z17 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    if ((i12 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i15 != 0) {
                            z19 = true;
                        } else {
                            z19 = z11;
                        }
                        if (i17 != 0) {
                            z20 = true;
                        } else {
                            z20 = z12;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g20.o((o20) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0Var2 = c0VarR;
                        j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z16 = z18;
                        z15 = z19;
                        z17 = z20;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z15 = z11;
                        a0Var3 = a0Var2;
                        z16 = z13;
                        z17 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i15 != 0) {
                            z19 = true;
                        } else {
                            z19 = z11;
                        }
                        if (i17 != 0) {
                            z20 = true;
                        } else {
                            z20 = z12;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g20.o((o20) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0Var2 = c0VarR;
                        j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z16 = z18;
                        z15 = z19;
                        z17 = z20;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z15 = z11;
                        a0Var3 = a0Var2;
                        z16 = z13;
                        z17 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i15 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i17 != 0) {
                        z20 = true;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.z10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g20.o((o20) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0Var2 = c0VarR;
                    j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z16 = z18;
                    z15 = z19;
                    z17 = z20;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z11;
                    a0Var3 = a0Var2;
                    z16 = z13;
                    z17 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z13 = z10;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.G(z11)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                        if ((i12 & 599187) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z18 = true;
                            } else {
                                z18 = z13;
                            }
                            if (i15 != 0) {
                                z19 = true;
                            } else {
                                z19 = z11;
                            }
                            if (i17 != 0) {
                                z20 = true;
                            } else {
                                z20 = z12;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                            }
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g20.o((o20) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0Var2 = c0VarR;
                            j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            z16 = z18;
                            z15 = z19;
                            z17 = z20;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            z15 = z11;
                            a0Var3 = a0Var2;
                            z16 = z13;
                            z17 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    if ((i12 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i15 != 0) {
                            z19 = true;
                        } else {
                            z19 = z11;
                        }
                        if (i17 != 0) {
                            z20 = true;
                        } else {
                            z20 = z12;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g20.o((o20) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0Var2 = c0VarR;
                        j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z16 = z18;
                        z15 = z19;
                        z17 = z20;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z15 = z11;
                        a0Var3 = a0Var2;
                        z16 = z13;
                        z17 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i15 != 0) {
                            z19 = true;
                        } else {
                            z19 = z11;
                        }
                        if (i17 != 0) {
                            z20 = true;
                        } else {
                            z20 = z12;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g20.o((o20) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0Var2 = c0VarR;
                        j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z16 = z18;
                        z15 = z19;
                        z17 = z20;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z15 = z11;
                        a0Var3 = a0Var2;
                        z16 = z13;
                        z17 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i15 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i17 != 0) {
                        z20 = true;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.z10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g20.o((o20) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0Var2 = c0VarR;
                    j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z16 = z18;
                    z15 = z19;
                    z17 = z20;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z11;
                    a0Var3 = a0Var2;
                    z16 = z13;
                    z17 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i15 != 0) {
                            z19 = true;
                        } else {
                            z19 = z11;
                        }
                        if (i17 != 0) {
                            z20 = true;
                        } else {
                            z20 = z12;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g20.o((o20) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0Var2 = c0VarR;
                        j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z16 = z18;
                        z15 = z19;
                        z17 = z20;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z15 = z11;
                        a0Var3 = a0Var2;
                        z16 = z13;
                        z17 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i15 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i17 != 0) {
                        z20 = true;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.z10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g20.o((o20) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0Var2 = c0VarR;
                    j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z16 = z18;
                    z15 = z19;
                    z17 = z20;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z11;
                    a0Var3 = a0Var2;
                    z16 = z13;
                    z17 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i15 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i17 != 0) {
                        z20 = true;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.z10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g20.o((o20) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0Var2 = c0VarR;
                    j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z16 = z18;
                    z15 = z19;
                    z17 = z20;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z11;
                    a0Var3 = a0Var2;
                    z16 = z13;
                    z17 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((i12 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z18 = true;
                } else {
                    z18 = z13;
                }
                if (i15 != 0) {
                    z19 = true;
                } else {
                    z19 = z11;
                }
                if (i17 != 0) {
                    z20 = true;
                } else {
                    z20 = z12;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.z10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return g20.o((o20) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0Var2 = c0VarR;
                j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z16 = z18;
                z15 = z19;
                z17 = z20;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z15 = z11;
                a0Var3 = a0Var2;
                z16 = z13;
                z17 = z12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z13 = z10;
                if (c0VarR.G(z13)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.G(z11)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c0VarR.G(z12)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(nVar2)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                        if ((i12 & 599187) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z18 = true;
                            } else {
                                z18 = z13;
                            }
                            if (i15 != 0) {
                                z19 = true;
                            } else {
                                z19 = z11;
                            }
                            if (i17 != 0) {
                                z20 = true;
                            } else {
                                z20 = z12;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                            }
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g20.o((o20) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0Var2 = c0VarR;
                            j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            z16 = z18;
                            z15 = z19;
                            z17 = z20;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            z15 = z11;
                            a0Var3 = a0Var2;
                            z16 = z13;
                            z17 = z12;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    if ((i12 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i15 != 0) {
                            z19 = true;
                        } else {
                            z19 = z11;
                        }
                        if (i17 != 0) {
                            z20 = true;
                        } else {
                            z20 = z12;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g20.o((o20) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0Var2 = c0VarR;
                        j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z16 = z18;
                        z15 = z19;
                        z17 = z20;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z15 = z11;
                        a0Var3 = a0Var2;
                        z16 = z13;
                        z17 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i15 != 0) {
                            z19 = true;
                        } else {
                            z19 = z11;
                        }
                        if (i17 != 0) {
                            z20 = true;
                        } else {
                            z20 = z12;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g20.o((o20) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0Var2 = c0VarR;
                        j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z16 = z18;
                        z15 = z19;
                        z17 = z20;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z15 = z11;
                        a0Var3 = a0Var2;
                        z16 = z13;
                        z17 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i15 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i17 != 0) {
                        z20 = true;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.z10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g20.o((o20) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0Var2 = c0VarR;
                    j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z16 = z18;
                    z15 = z19;
                    z17 = z20;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z11;
                    a0Var3 = a0Var2;
                    z16 = z13;
                    z17 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i15 != 0) {
                            z19 = true;
                        } else {
                            z19 = z11;
                        }
                        if (i17 != 0) {
                            z20 = true;
                        } else {
                            z20 = z12;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g20.o((o20) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0Var2 = c0VarR;
                        j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z16 = z18;
                        z15 = z19;
                        z17 = z20;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z15 = z11;
                        a0Var3 = a0Var2;
                        z16 = z13;
                        z17 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i15 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i17 != 0) {
                        z20 = true;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.z10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g20.o((o20) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0Var2 = c0VarR;
                    j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z16 = z18;
                    z15 = z19;
                    z17 = z20;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z11;
                    a0Var3 = a0Var2;
                    z16 = z13;
                    z17 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i15 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i17 != 0) {
                        z20 = true;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.z10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g20.o((o20) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0Var2 = c0VarR;
                    j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z16 = z18;
                    z15 = z19;
                    z17 = z20;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z11;
                    a0Var3 = a0Var2;
                    z16 = z13;
                    z17 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((i12 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z18 = true;
                } else {
                    z18 = z13;
                }
                if (i15 != 0) {
                    z19 = true;
                } else {
                    z19 = z11;
                }
                if (i17 != 0) {
                    z20 = true;
                } else {
                    z20 = z12;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.z10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return g20.o((o20) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0Var2 = c0VarR;
                j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z16 = z18;
                z15 = z19;
                z17 = z20;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z15 = z11;
                a0Var3 = a0Var2;
                z16 = z13;
                z17 = z12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z13 = z10;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                if (c0VarR.G(z11)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c0VarR.G(z12)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i15 != 0) {
                            z19 = true;
                        } else {
                            z19 = z11;
                        }
                        if (i17 != 0) {
                            z20 = true;
                        } else {
                            z20 = z12;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.z10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g20.o((o20) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0Var2 = c0VarR;
                        j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z16 = z18;
                        z15 = z19;
                        z17 = z20;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        z15 = z11;
                        a0Var3 = a0Var2;
                        z16 = z13;
                        z17 = z12;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i15 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i17 != 0) {
                        z20 = true;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.z10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g20.o((o20) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0Var2 = c0VarR;
                    j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z16 = z18;
                    z15 = z19;
                    z17 = z20;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z11;
                    a0Var3 = a0Var2;
                    z16 = z13;
                    z17 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i15 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i17 != 0) {
                        z20 = true;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.z10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g20.o((o20) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0Var2 = c0VarR;
                    j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z16 = z18;
                    z15 = z19;
                    z17 = z20;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z11;
                    a0Var3 = a0Var2;
                    z16 = z13;
                    z17 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((i12 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z18 = true;
                } else {
                    z18 = z13;
                }
                if (i15 != 0) {
                    z19 = true;
                } else {
                    z19 = z11;
                }
                if (i17 != 0) {
                    z20 = true;
                } else {
                    z20 = z12;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.z10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return g20.o((o20) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0Var2 = c0VarR;
                j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z16 = z18;
                z15 = z19;
                z17 = z20;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z15 = z11;
                a0Var3 = a0Var2;
                z16 = z13;
                z17 = z12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        i17 = i11 & 32;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                if (c0VarR.G(z12)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i15 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i17 != 0) {
                        z20 = true;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.z10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g20.o((o20) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0Var2 = c0VarR;
                    j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z16 = z18;
                    z15 = z19;
                    z17 = z20;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    z15 = z11;
                    a0Var3 = a0Var2;
                    z16 = z13;
                    z17 = z12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((i12 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z18 = true;
                } else {
                    z18 = z13;
                }
                if (i15 != 0) {
                    z19 = true;
                } else {
                    z19 = z11;
                }
                if (i17 != 0) {
                    z20 = true;
                } else {
                    z20 = z12;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.z10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return g20.o((o20) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0Var2 = c0VarR;
                j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z16 = z18;
                z15 = z19;
                z17 = z20;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z15 = z11;
                a0Var3 = a0Var2;
                z16 = z13;
                z17 = z12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        if ((i11 & 64) != 0) {
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((i12 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z18 = true;
                } else {
                    z18 = z13;
                }
                if (i15 != 0) {
                    z19 = true;
                } else {
                    z19 = z11;
                }
                if (i17 != 0) {
                    z20 = true;
                } else {
                    z20 = z12;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.z10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return g20.o((o20) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0Var2 = c0VarR;
                j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z16 = z18;
                z15 = z19;
                z17 = z20;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                z15 = z11;
                a0Var3 = a0Var2;
                z16 = z13;
                z17 = z12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        if ((i12 & 599187) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i12 & 1)) {
            if (i20 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                z18 = true;
            } else {
                z18 = z13;
            }
            if (i15 != 0) {
                z19 = true;
            } else {
                z19 = z11;
            }
            if (i17 != 0) {
                z20 = true;
            } else {
                z20 = z12;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1807005299, i12, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:381)");
            }
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.z10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g20.o((o20) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0Var2 = c0VarR;
            j(n20Var2, nVar3, a0Var4, z18, z19, z20, (Function1) objI0, nVar2, c0Var2, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 3) & 29360128), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            z16 = z18;
            z15 = z19;
            z17 = z20;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            z15 = z11;
            a0Var3 = a0Var2;
            z16 = z13;
            z17 = z12;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g20.p(n20Var, nVar, a0Var3, z16, z15, z17, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair l(n20 n20Var, final boolean z10, final boolean z11, final androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.b bVar) {
        return TuplesKt.to(androidx.compose.foundation.gestures.k.o(new Function1() { // from class: androidx.compose.material3.e20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g20.m(uVar, z10, z11, (androidx.compose.foundation.gestures.u2) obj);
            }
        }), n20Var.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(androidx.compose.ui.unit.u uVar, boolean z10, boolean z11, androidx.compose.foundation.gestures.u2 u2Var) {
        float fQ = (int) (uVar.q() >> 32);
        u2Var.a(o20.Settled, 0.0f);
        if (z10) {
            u2Var.a(o20.StartToEnd, fQ);
        }
        if (z11) {
            u2Var.a(o20.EndToStart, -fQ);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(n20 n20Var, pj.n nVar, androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, boolean z12, Function1 function1, pj.n nVar2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        j(n20Var, nVar, a0Var, z10, z11, z12, function1, nVar2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(o20 o20Var) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(n20 n20Var, pj.n nVar, androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, boolean z12, pj.n nVar2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        k(n20Var, nVar, a0Var, z10, z11, z12, nVar2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(o20 o20Var) {
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n20 s(@Nullable final o20 o20Var, @Nullable final Function1<? super Float, Float> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            o20Var = o20.Settled;
        }
        if ((i11 & 2) != 0) {
            function1 = w10.f34055a.c(c0Var, 6);
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-470572556, i10, -1, "androidx.compose.material3.rememberSwipeToDismissBoxState (SwipeToDismissBox.kt:243)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<n20, o20> c0VarE = n20.f30904c.e(function1);
        boolean z10 = true;
        boolean z11 = ((6 ^ (i10 & 14)) > 4 && c0Var.K(o20Var.ordinal())) || (i10 & 6) == 4;
        if ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.D(function1)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI0 = c0Var.i0();
        if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.material3.f20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g20.u(o20Var, function1);
                }
            };
            c0Var.Y(objI0);
        }
        n20 n20Var = (n20) androidx.compose.runtime.saveable.i.j(objArr, c0VarE, (Function0) objI0, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n20Var;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.WARNING, message = androidx.compose.material3.internal.d2.f28796a, replaceWith = @kotlin.b1(expression = "rememberSwipeToDismissBoxState(initialValue, positionalThreshold)", imports = {}))
    @NotNull
    public static final n20 t(@Nullable final o20 o20Var, @Nullable final Function1<? super o20, Boolean> function1, @Nullable final Function1<? super Float, Float> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            o20Var = o20.Settled;
        }
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.x10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(g20.v((o20) obj));
                    }
                };
                c0Var.Y(objI0);
            }
            function1 = (Function1) objI0;
        }
        if ((i11 & 4) != 0) {
            function2 = w10.f34055a.c(c0Var, 6);
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-246335487, i10, -1, "androidx.compose.material3.rememberSwipeToDismissBoxState (SwipeToDismissBox.kt:273)");
        }
        final androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<n20, o20> c0VarF = n20.f30904c.f(function1, function2, dVar);
        boolean z10 = true;
        boolean zD = (((6 ^ (i10 & 14)) > 4 && c0Var.K(o20Var.ordinal())) || (i10 & 6) == 4) | c0Var.D(dVar) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(function1)) || (i10 & 48) == 32);
        if ((((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 || !c0Var.D(function2)) && (i10 & androidx.media3.exoplayer.a5.S0) != 256) {
            z10 = false;
        }
        boolean z11 = zD | z10;
        Object objI1 = c0Var.i0();
        if (z11 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function0() { // from class: androidx.compose.material3.y10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g20.w(o20Var, dVar, function1, function2);
                }
            };
            c0Var.Y(objI1);
        }
        n20 n20Var = (n20) androidx.compose.runtime.saveable.i.j(objArr, c0VarF, (Function0) objI1, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n20 u(o20 o20Var, Function1 function1) {
        return new n20(o20Var, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(o20 o20Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n20 w(o20 o20Var, androidx.compose.ui.unit.d dVar, Function1 function1, Function1 function2) {
        return new n20(o20Var, dVar, function1, function2);
    }
}
