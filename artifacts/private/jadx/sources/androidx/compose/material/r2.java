package androidx.compose.material;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,445:1\n75#2:446\n70#3:447\n68#3,8:448\n77#3:486\n70#3:523\n67#3,9:524\n77#3:563\n70#3:564\n67#3,9:565\n77#3:604\n79#4,6:456\n86#4,3:471\n89#4,2:480\n93#4:485\n79#4:493\n77#4,8:494\n86#4,3:511\n89#4,2:520\n79#4,6:533\n86#4,3:548\n89#4,2:557\n93#4:562\n79#4,6:574\n86#4,3:589\n89#4,2:598\n93#4:603\n93#4:607\n347#5,9:462\n356#5,3:482\n347#5,9:502\n356#5:522\n347#5,9:539\n356#5,3:559\n347#5,9:580\n356#5,3:600\n357#5,2:605\n4206#6,6:474\n4206#6,6:514\n4206#6,6:551\n4206#6,6:592\n1282#7,6:487\n85#8:608\n113#9:609\n113#9:610\n113#9:611\n113#9:612\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n*L\n207#1:446\n222#1:447\n222#1:448,8\n222#1:486\n314#1:523\n314#1:524,9\n314#1:563\n316#1:564\n316#1:565,9\n316#1:604\n222#1:456,6\n222#1:471,3\n222#1:480,2\n222#1:485\n313#1:493\n313#1:494,8\n313#1:511,3\n313#1:520,2\n314#1:533,6\n314#1:548,3\n314#1:557,2\n314#1:562\n316#1:574,6\n316#1:589,3\n316#1:598,2\n316#1:603\n313#1:607\n222#1:462,9\n222#1:482,3\n313#1:502,9\n313#1:522\n314#1:539,9\n314#1:559,3\n316#1:580,9\n316#1:600,3\n313#1:605,2\n222#1:474,6\n313#1:514,6\n314#1:551,6\n316#1:592,6\n324#1:487,6\n282#1:608\n433#1:609\n436#1:610\n442#1:611\n444#1:612\n*E\n"})
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.y3<Float> f24592a = new androidx.compose.animation.core.y3<>(300, 0, androidx.compose.animation.core.u0.d(), 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f24593b = androidx.compose.ui.unit.h.r(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f24594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f24595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.v6 f24596e;

    @SourceDebugExtension({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt$BottomNavigation$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,445:1\n99#2:446\n97#2,8:447\n106#2:485\n79#3,6:455\n86#3,3:470\n89#3,2:479\n93#3:484\n347#4,9:461\n356#4,3:481\n4206#5,6:473\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt$BottomNavigation$1\n*L\n114#1:446\n114#1:447,8\n114#1:485\n114#1:455,6\n114#1:470,3\n114#1:479,2\n114#1:484\n114#1:461,9\n114#1:481,3\n114#1:473,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.v6 f24597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f24598b;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.layout.v6 v6Var, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f24597a = v6Var;
            this.f24598b = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(807373717, i10, -1, "androidx.compose.material.BottomNavigation.<anonymous> (BottomNavigation.kt:113)");
            }
            androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.selection.b.b(androidx.compose.foundation.layout.i6.b(androidx.compose.foundation.layout.t7.h(androidx.compose.foundation.layout.i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), this.f24597a), 0.0f, r2.f24593b, 1, null));
            androidx.compose.foundation.layout.q.f fVarS = androidx.compose.foundation.layout.q.f16330a.s();
            pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f24598b;
            int i11 = 0 & 6;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(fVarS, androidx.compose.ui.e.f37317a.w(), c0Var, 6);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarB);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            nVar.invoke(androidx.compose.foundation.layout.y5.f16577a, c0Var, 6);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements pj.n<Float, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f24599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24601c;

        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f24599a = z10;
            this.f24600b = function2;
            this.f24601c = function3;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(float f10, androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= c0Var.I(f10) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2011119551, i10, -1, "androidx.compose.material.BottomNavigationItem.<anonymous>.<anonymous> (BottomNavigation.kt:236)");
            }
            if (this.f24599a) {
                f10 = 1.0f;
            }
            r2.k(this.f24600b, this.f24601c, f10, c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Float f10, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(f10.floatValue(), c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24602a;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f24602a = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2120789583, i10, -1, "androidx.compose.material.BottomNavigationItem.<anonymous>.<anonymous> (BottomNavigation.kt:212)");
            }
            wk.l(androidx.compose.ui.text.y3.m(x9.f25488a.c(c0Var, 6).f(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, androidx.compose.ui.text.style.j.f42206b.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), this.f24602a, c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt$BottomNavigationItemBaselineLayout$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,445:1\n563#2,2:446\n34#2,6:448\n565#2:454\n563#2,2:455\n34#2,6:457\n565#2:463\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt$BottomNavigationItemBaselineLayout$2$1\n*L\n325#1:446,2\n325#1:448,6\n325#1:454\n330#1:455,2\n330#1:457,6\n330#1:463\n*E\n"})
    static final class d implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f24603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f24604b;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, float f10) {
            this.f24603a = function2;
            this.f24604b = f10;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            androidx.compose.ui.layout.i2 i2VarP0;
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                androidx.compose.ui.layout.z0 z0Var = list.get(i11);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), "icon")) {
                    androidx.compose.ui.layout.i2 i2VarP1 = z0Var.P0(j10);
                    if (this.f24603a != null) {
                        int size2 = list.size();
                        while (true) {
                            if (i10 >= size2) {
                                androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                                throw new kotlin.a0();
                            }
                            androidx.compose.ui.layout.z0 z0Var2 = list.get(i10);
                            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), com.google.firebase.messaging.e.f.f123534d)) {
                                int i12 = 7 ^ 0;
                                int i13 = 0 >> 0;
                                i2VarP0 = z0Var2.P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 11, null));
                                break;
                            }
                            i10++;
                        }
                    } else {
                        i2VarP0 = null;
                    }
                    if (this.f24603a == null) {
                        return r2.x(c1Var, i2VarP1, j10);
                    }
                    Intrinsics.checkNotNull(i2VarP0);
                    return r2.z(c1Var, i2VarP0, i2VarP1, j10, this.f24604b);
                }
            }
            androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
            throw new kotlin.a0();
        }
    }

    static final class e implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<Float, androidx.compose.runtime.c0, Integer, Unit> f24605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Float> f24606b;

        /* JADX WARN: Multi-variable type inference failed */
        e(pj.n<? super Float, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.runtime.n7<Float> n7Var) {
            this.f24605a = nVar;
            this.f24606b = n7Var;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(343660833, i10, -1, "androidx.compose.material.BottomNavigationTransition.<anonymous> (BottomNavigation.kt:292)");
            }
            this.f24605a.invoke(Float.valueOf(r2.o(this.f24606b)), c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static {
        float f10 = 12;
        f24594c = androidx.compose.ui.unit.h.r(f10);
        f24595d = androidx.compose.ui.unit.h.r(f10);
        float f11 = 0;
        f24596e = androidx.compose.foundation.layout.b7.d(androidx.compose.ui.unit.h.r(f11), androidx.compose.ui.unit.h.r(f11), androidx.compose.ui.unit.h.r(f11), androidx.compose.ui.unit.h.r(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(float f10, androidx.compose.ui.layout.i2 i2Var, int i10, int i11, int i12, androidx.compose.ui.layout.i2 i2Var2, int i13, int i14, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a aVar2;
        if (f10 == 0.0f) {
            aVar2 = aVar;
        } else {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, i10, i11 + i12, 0.0f, 4, null);
            aVar2 = aVar;
        }
        androidx.compose.ui.layout.i2.a.e0(aVar2, i2Var2, i13, i14 + i12, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x0106  */
    /* JADX WARN: Code duplicated, block: B:89:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x0147  */
    /* JADX WARN: Code duplicated, block: B:94:0x014f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0160  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void h(@Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        long jH;
        long jD;
        float f11;
        int i13;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        final long j13;
        final float f12;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        long j14;
        float fA;
        long j15;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(783675913);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                jH = j10;
                int i15 = c0VarR.L(jH) ? 32 : 16;
                i12 |= i15;
            } else {
                jH = j10;
            }
            i12 |= i15;
        } else {
            jH = j10;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            jD = j11;
            i12 |= ((i11 & 4) == 0 && c0VarR.L(jD)) ? 256 : 128;
        } else {
            jD = j11;
        }
        int i16 = i11 & 8;
        if (i16 == 0) {
            if ((i10 & 3072) == 0) {
                f11 = f10;
                i12 |= c0VarR.I(f11) ? 2048 : 1024;
            }
            if ((i11 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i13 = 16384;
                    } else {
                        i13 = 8192;
                    }
                    i12 |= i13;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    int i17 = 6;
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 2) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                            i12 &= -897;
                        }
                        if (i16 != 0) {
                            j14 = jD;
                            fA = j2.f23258a.a();
                        } else {
                            j14 = jD;
                            fA = f11;
                        }
                        j15 = jH;
                    } else {
                        c0VarR.u();
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        fA = f11;
                        i17 = 6;
                        j15 = jH;
                        j14 = jD;
                        a0Var4 = a0Var2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(783675913, i12, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:161)");
                    }
                    int i18 = i12 << 3;
                    c0Var2 = c0VarR;
                    i(f24596e, a0Var4, j15, j14, fA, nVar, c0Var2, i17 | (i18 & com.planner5d.library.engine.input.f.b.B) | (i18 & 896) | (i18 & 7168) | (57344 & i18) | (i18 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    j12 = j15;
                    j13 = j14;
                    f12 = fA;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jH;
                    j13 = jD;
                    f12 = f11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.l2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return r2.q(a0Var3, j12, j13, f12, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                int i19 = 6;
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i16 != 0) {
                        j14 = jD;
                        fA = j2.f23258a.a();
                    } else {
                        j14 = jD;
                        fA = f11;
                    }
                    j15 = jH;
                } else {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i16 != 0) {
                        j14 = jD;
                        fA = j2.f23258a.a();
                    } else {
                        j14 = jD;
                        fA = f11;
                    }
                    j15 = jH;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(783675913, i12, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:161)");
                }
                int i110 = i12 << 3;
                c0Var2 = c0VarR;
                i(f24596e, a0Var4, j15, j14, fA, nVar, c0Var2, i19 | (i110 & com.planner5d.library.engine.input.f.b.B) | (i110 & 896) | (i110 & 7168) | (57344 & i110) | (i110 & 458752), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j12 = j15;
                j13 = j14;
                f12 = fA;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jH;
                j13 = jD;
                f12 = f11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.l2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r2.q(a0Var3, j12, j13, f12, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        f11 = f10;
        if ((i11 & 16) != 0) {
            if ((i10 & 24576) == 0) {
                if (c0VarR.k0(nVar)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i12 |= i13;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                int i111 = 6;
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i16 != 0) {
                        j14 = jD;
                        fA = j2.f23258a.a();
                    } else {
                        j14 = jD;
                        fA = f11;
                    }
                    j15 = jH;
                } else {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i16 != 0) {
                        j14 = jD;
                        fA = j2.f23258a.a();
                    } else {
                        j14 = jD;
                        fA = f11;
                    }
                    j15 = jH;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(783675913, i12, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:161)");
                }
                int i112 = i12 << 3;
                c0Var2 = c0VarR;
                i(f24596e, a0Var4, j15, j14, fA, nVar, c0Var2, i111 | (i112 & com.planner5d.library.engine.input.f.b.B) | (i112 & 896) | (i112 & 7168) | (57344 & i112) | (i112 & 458752), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j12 = j15;
                j13 = j14;
                f12 = fA;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jH;
                j13 = jD;
                f12 = f11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.l2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r2.q(a0Var3, j12, j13, f12, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            int i113 = 6;
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i16 != 0) {
                    j14 = jD;
                    fA = j2.f23258a.a();
                } else {
                    j14 = jD;
                    fA = f11;
                }
                j15 = jH;
            } else {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jD = n4.d(jH, c0VarR, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i16 != 0) {
                    j14 = jD;
                    fA = j2.f23258a.a();
                } else {
                    j14 = jD;
                    fA = f11;
                }
                j15 = jH;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(783675913, i12, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:161)");
            }
            int i114 = i12 << 3;
            c0Var2 = c0VarR;
            i(f24596e, a0Var4, j15, j14, fA, nVar, c0Var2, i113 | (i114 & com.planner5d.library.engine.input.f.b.B) | (i114 & 896) | (i114 & 7168) | (57344 & i114) | (i114 & 458752), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            j12 = j15;
            j13 = j14;
            f12 = fA;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j12 = jH;
            j13 = jD;
            f12 = f11;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.l2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r2.q(a0Var3, j12, j13, f12, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0167  */
    /* JADX WARN: Code duplicated, block: B:105:0x0176  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1 A[PHI: r3 r5 r6 r10
      0x00e1: PHI (r3v27 int) = (r3v20 int), (r3v28 int), (r3v29 int) binds: [B:93:0x010b, B:82:0x00dd, B:83:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r5v10 androidx.compose.ui.a0) = (r5v5 androidx.compose.ui.a0), (r5v2 androidx.compose.ui.a0), (r5v2 androidx.compose.ui.a0) binds: [B:93:0x010b, B:82:0x00dd, B:83:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r6v12 long) = (r6v7 long), (r6v6 long), (r6v6 long) binds: [B:93:0x010b, B:82:0x00dd, B:83:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r10v8 long) = (r10v4 long), (r10v2 long), (r10v2 long) binds: [B:93:0x010b, B:82:0x00dd, B:83:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0121  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void i(@NotNull final androidx.compose.foundation.layout.v6 v6Var, @Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        long jH;
        long jD;
        int i13;
        float f11;
        int i14;
        int i15;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        final long j13;
        final float f12;
        androidx.compose.runtime.s5 s5VarT;
        float fA;
        long j14;
        long j15;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-636542119);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(v6Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    jH = j10;
                    int i17 = c0VarR.L(jH) ? 256 : 128;
                    i12 |= i17;
                } else {
                    jH = j10;
                }
                i12 |= i17;
            } else {
                jH = j10;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    jD = j11;
                    int i18 = c0VarR.L(jD) ? 2048 : 1024;
                    i12 |= i18;
                } else {
                    jD = j11;
                }
                i12 |= i18;
            } else {
                jD = j11;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    f11 = f10;
                    if (c0VarR.I(f11)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i12 |= i15;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i16 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            jH = n4.h(x9.f25488a.a(c0VarR, 6));
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fA = j2.f23258a.a();
                            j14 = jH;
                            j15 = jD;
                            a0Var4 = a0Var2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-636542119, i12, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:106)");
                        }
                        c0Var2 = c0VarR;
                        ah.e(a0Var4, null, j14, j15, null, fA, androidx.compose.runtime.internal.w.e(807373717, true, new a(v6Var, nVar), c0VarR, 54), c0Var2, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 18);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        j12 = j14;
                        j13 = j15;
                        f12 = fA;
                    } else {
                        c0VarR.u();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                    }
                    j15 = jD;
                    fA = f11;
                    a0Var4 = a0Var2;
                    j14 = jH;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-636542119, i12, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:106)");
                    }
                    c0Var2 = c0VarR;
                    ah.e(a0Var4, null, j14, j15, null, fA, androidx.compose.runtime.internal.w.e(807373717, true, new a(v6Var, nVar), c0VarR, 54), c0Var2, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 18);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    j12 = j14;
                    j13 = j15;
                    f12 = fA;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jH;
                    j13 = jD;
                    f12 = f11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.p2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return r2.r(v6Var, a0Var3, j12, j13, f12, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            f11 = f10;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fA = j2.f23258a.a();
                        j14 = jH;
                        j15 = jD;
                        a0Var4 = a0Var2;
                    } else {
                        j15 = jD;
                        fA = f11;
                        a0Var4 = a0Var2;
                        j14 = jH;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fA = j2.f23258a.a();
                        j14 = jH;
                        j15 = jD;
                        a0Var4 = a0Var2;
                    } else {
                        j15 = jD;
                        fA = f11;
                        a0Var4 = a0Var2;
                        j14 = jH;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-636542119, i12, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:106)");
                }
                c0Var2 = c0VarR;
                ah.e(a0Var4, null, j14, j15, null, fA, androidx.compose.runtime.internal.w.e(807373717, true, new a(v6Var, nVar), c0VarR, 54), c0Var2, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 18);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j12 = j14;
                j13 = j15;
                f12 = fA;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jH;
                j13 = jD;
                f12 = f11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.p2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r2.r(v6Var, a0Var3, j12, j13, f12, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                jH = j10;
                if (c0VarR.L(jH)) {
                }
                i12 |= i17;
            } else {
                jH = j10;
            }
            i12 |= i17;
        } else {
            jH = j10;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                jD = j11;
                if (c0VarR.L(jD)) {
                }
                i12 |= i18;
            } else {
                jD = j11;
            }
            i12 |= i18;
        } else {
            jD = j11;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                f11 = f10;
                if (c0VarR.I(f11)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fA = j2.f23258a.a();
                        j14 = jH;
                        j15 = jD;
                        a0Var4 = a0Var2;
                    } else {
                        j15 = jD;
                        fA = f11;
                        a0Var4 = a0Var2;
                        j14 = jH;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        jH = n4.h(x9.f25488a.a(c0VarR, 6));
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fA = j2.f23258a.a();
                        j14 = jH;
                        j15 = jD;
                        a0Var4 = a0Var2;
                    } else {
                        j15 = jD;
                        fA = f11;
                        a0Var4 = a0Var2;
                        j14 = jH;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-636542119, i12, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:106)");
                }
                c0Var2 = c0VarR;
                ah.e(a0Var4, null, j14, j15, null, fA, androidx.compose.runtime.internal.w.e(807373717, true, new a(v6Var, nVar), c0VarR, 54), c0Var2, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 18);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j12 = j14;
                j13 = j15;
                f12 = fA;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jH;
                j13 = jD;
                f12 = f11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.p2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r2.r(v6Var, a0Var3, j12, j13, f12, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        f11 = f10;
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.k0(nVar)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
        }
        if ((74899 & i12) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fA = j2.f23258a.a();
                    j14 = jH;
                    j15 = jD;
                    a0Var4 = a0Var2;
                } else {
                    j15 = jD;
                    fA = f11;
                    a0Var4 = a0Var2;
                    j14 = jH;
                }
            } else {
                if (i16 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    jH = n4.h(x9.f25488a.a(c0VarR, 6));
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jD = n4.d(jH, c0VarR, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fA = j2.f23258a.a();
                    j14 = jH;
                    j15 = jD;
                    a0Var4 = a0Var2;
                } else {
                    j15 = jD;
                    fA = f11;
                    a0Var4 = a0Var2;
                    j14 = jH;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-636542119, i12, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:106)");
            }
            c0Var2 = c0VarR;
            ah.e(a0Var4, null, j14, j15, null, fA, androidx.compose.runtime.internal.w.e(807373717, true, new a(v6Var, nVar), c0VarR, 54), c0Var2, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 18);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            j12 = j14;
            j13 = j15;
            f12 = fA;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j12 = jH;
            j13 = jD;
            f12 = f11;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.p2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r2.r(v6Var, a0Var3, j12, j13, f12, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:103:0x012e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0131  */
    /* JADX WARN: Code duplicated, block: B:107:0x0139  */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    /* JADX WARN: Code duplicated, block: B:112:0x014a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0152  */
    /* JADX WARN: Code duplicated, block: B:117:0x0156  */
    /* JADX WARN: Code duplicated, block: B:120:0x016a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0172  */
    /* JADX WARN: Code duplicated, block: B:127:0x017b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0187  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01db  */
    /* JADX WARN: Code duplicated, block: B:157:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:161:0x021f  */
    /* JADX WARN: Code duplicated, block: B:164:0x022e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0238  */
    /* JADX WARN: Code duplicated, block: B:168:0x0248  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:174:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:175:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:178:0x0306  */
    /* JADX WARN: Code duplicated, block: B:180:0x0314  */
    /* JADX WARN: Code duplicated, block: B:183:0x036a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0378  */
    /* JADX WARN: Code duplicated, block: B:188:0x0393  */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void j(@NotNull final androidx.compose.foundation.layout.x5 x5Var, final boolean z10, @NotNull final Function0<Unit> function0, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, boolean z12, @Nullable androidx.compose.foundation.interaction.j jVar, long j10, long j11, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        boolean z13;
        Function0<Unit> function1;
        int i14;
        int i15;
        int i16;
        androidx.compose.ui.a0 a0Var2;
        int i17;
        int i18;
        boolean z14;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z15;
        androidx.compose.runtime.c0 c0Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        final boolean z16;
        final androidx.compose.foundation.interaction.j jVar2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z17;
        final long j12;
        final long j13;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.runtime.internal.c cVarE;
        androidx.compose.ui.a0 a0Var4;
        boolean z18;
        long jM;
        int i29;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        int i30;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1744464261);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.D(x5Var) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 1) == 0) {
            if ((i10 & 48) == 0) {
                z13 = z10;
                i13 |= c0VarR.G(z13) ? 32 : 16;
            }
            if ((i12 & 2) != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    function1 = function0;
                    if (c0VarR.k0(function1)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i13 |= i14;
                }
                if ((i12 & 4) != 0) {
                    i13 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (c0VarR.k0(function2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i10 & 24576) == 0) {
                        a0Var2 = a0Var;
                        if (c0VarR.D(a0Var2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        if ((196608 & i10) == 0) {
                            z14 = z11;
                            if (c0VarR.G(z14)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                        i20 = i12 & 32;
                        if (i20 != 0) {
                            i13 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(function3)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i13 |= i21;
                        }
                        i22 = i12 & 64;
                        if (i22 != 0) {
                            i13 |= 12582912;
                        } else if ((i10 & 12582912) == 0) {
                            if (c0VarR.G(z12)) {
                                i23 = 8388608;
                            } else {
                                i23 = 4194304;
                            }
                            i13 |= i23;
                        }
                        i24 = i12 & 128;
                        if (i24 != 0) {
                            i13 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(jVar)) {
                                i25 = 67108864;
                            } else {
                                i25 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i13 |= i25;
                        }
                        if ((i10 & 805306368) == 0) {
                            if ((i12 & 256) == 0) {
                                i26 = i24;
                                int i31 = c0VarR.L(j10) ? 536870912 : 268435456;
                                i13 |= i31;
                            } else {
                                i26 = i24;
                            }
                            i13 |= i31;
                        } else {
                            i26 = i24;
                        }
                        if ((i11 & 6) == 0) {
                            if ((i12 & 512) == 0 || !c0VarR.L(j11)) {
                                i30 = 2;
                            } else {
                                i30 = 4;
                            }
                            i27 = i11 | i30;
                        } else {
                            i27 = i11;
                        }
                        i28 = i27;
                        if ((i13 & 306783379) == 306783378 || (i28 & 3) != 2) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i13 & 1)) {
                            c0VarR.l0();
                            cVarE = null;
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i16 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i18 != 0) {
                                    z14 = true;
                                }
                                if (i20 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function3;
                                }
                                if (i22 != 0) {
                                    z18 = true;
                                } else {
                                    z18 = z12;
                                }
                                if (i26 != 0) {
                                    jVar = null;
                                } else {
                                    jVar = jVar;
                                }
                                if ((i12 & 256) != 0) {
                                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                    i13 &= -1879048193;
                                } else {
                                    jM = j10;
                                }
                                if ((i12 & 512) != 0) {
                                    long j14 = jM;
                                    j11 = androidx.compose.ui.graphics.q0.w(j14, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    j10 = j14;
                                    i29 = i28 & (-15);
                                } else {
                                    j10 = jM;
                                    j11 = j11;
                                    i29 = i28;
                                }
                            } else {
                                c0VarR.u();
                                if ((i12 & 256) != 0) {
                                    i13 &= -1879048193;
                                }
                                i29 = (i12 & 512) != 0 ? i28 & (-15) : i28;
                                a0Var4 = a0Var2;
                                z18 = z12;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                            }
                            if (function3 == null) {
                                c0VarR.E(-229962826);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-229962825);
                                cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                                c0VarR.A();
                            }
                            androidx.compose.runtime.internal.c cVar = cVarE;
                            androidx.compose.ui.a0 a0Var5 = a0Var4;
                            androidx.compose.ui.a0 a0VarQ = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var5, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarQ);
                            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                            int i32 = i29;
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
                            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                            function2B = aVar.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                            n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i32 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                            c0Var2 = c0VarR;
                            c0Var2.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var5;
                            function4 = function3;
                            z16 = z18;
                            jVar2 = jVar;
                            z17 = z14;
                            j13 = j11;
                            j12 = j10;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            function4 = function3;
                            z16 = z12;
                            jVar2 = jVar;
                            a0Var3 = a0Var2;
                            z17 = z14;
                            j12 = j10;
                            j13 = j11;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    z14 = z11;
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                    i22 = i12 & 64;
                    if (i22 != 0) {
                        i13 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.G(z12)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i13 |= i23;
                    }
                    i24 = i12 & 128;
                    if (i24 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i25 = 67108864;
                        } else {
                            i25 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i25;
                    }
                    if ((i10 & 805306368) == 0) {
                        if ((i12 & 256) == 0) {
                            i26 = i24;
                            if (c0VarR.L(j10)) {
                            }
                            i13 |= i31;
                        } else {
                            i26 = i24;
                        }
                        i13 |= i31;
                    } else {
                        i26 = i24;
                    }
                    if ((i11 & 6) == 0) {
                        if ((i12 & 512) == 0) {
                            i30 = 2;
                        } else {
                            i30 = 2;
                        }
                        i27 = i11 | i30;
                    } else {
                        i27 = i11;
                    }
                    i28 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (c0VarR.h(z15, i13 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i16 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if (i20 != 0) {
                                function3 = null;
                            } else {
                                function3 = function3;
                            }
                            if (i22 != 0) {
                                z18 = true;
                            } else {
                                z18 = z12;
                            }
                            if (i26 != 0) {
                                jVar = null;
                            } else {
                                jVar = jVar;
                            }
                            if ((i12 & 256) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i13 &= -1879048193;
                            } else {
                                jM = j10;
                            }
                            if ((i12 & 512) != 0) {
                                long j15 = jM;
                                j11 = androidx.compose.ui.graphics.q0.w(j15, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                j10 = j15;
                                i29 = i28 & (-15);
                            } else {
                                j10 = jM;
                                j11 = j11;
                                i29 = i28;
                            }
                        } else {
                            if (i16 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if (i20 != 0) {
                                function3 = null;
                            } else {
                                function3 = function3;
                            }
                            if (i22 != 0) {
                                z18 = true;
                            } else {
                                z18 = z12;
                            }
                            if (i26 != 0) {
                                jVar = null;
                            } else {
                                jVar = jVar;
                            }
                            if ((i12 & 256) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i13 &= -1879048193;
                            } else {
                                jM = j10;
                            }
                            if ((i12 & 512) != 0) {
                                long j16 = jM;
                                j11 = androidx.compose.ui.graphics.q0.w(j16, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                j10 = j16;
                                i29 = i28 & (-15);
                            } else {
                                j10 = jM;
                                j11 = j11;
                                i29 = i28;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                        }
                        if (function3 == null) {
                            c0VarR.E(-229962826);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-229962825);
                            cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                            c0VarR.A();
                        }
                        androidx.compose.runtime.internal.c cVar2 = cVarE;
                        androidx.compose.ui.a0 a0Var6 = a0Var4;
                        androidx.compose.ui.a0 a0VarQ2 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var6, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarQ2);
                        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                        int i33 = i29;
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK2, aVar2.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK2, aVar2.g());
                        function2B = aVar2.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar2.f());
                        androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                        n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar2), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i33 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var6;
                        function4 = function3;
                        z16 = z18;
                        jVar2 = jVar;
                        z17 = z14;
                        j13 = j11;
                        j12 = j10;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function4 = function3;
                        z16 = z12;
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z17 = z14;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                a0Var2 = a0Var;
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        z14 = z11;
                        if (c0VarR.G(z14)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                    i22 = i12 & 64;
                    if (i22 != 0) {
                        i13 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.G(z12)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i13 |= i23;
                    }
                    i24 = i12 & 128;
                    if (i24 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i25 = 67108864;
                        } else {
                            i25 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i25;
                    }
                    if ((i10 & 805306368) == 0) {
                        if ((i12 & 256) == 0) {
                            i26 = i24;
                            if (c0VarR.L(j10)) {
                            }
                            i13 |= i31;
                        } else {
                            i26 = i24;
                        }
                        i13 |= i31;
                    } else {
                        i26 = i24;
                    }
                    if ((i11 & 6) == 0) {
                        if ((i12 & 512) == 0) {
                            i30 = 2;
                        } else {
                            i30 = 2;
                        }
                        i27 = i11 | i30;
                    } else {
                        i27 = i11;
                    }
                    i28 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (c0VarR.h(z15, i13 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i16 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if (i20 != 0) {
                                function3 = null;
                            } else {
                                function3 = function3;
                            }
                            if (i22 != 0) {
                                z18 = true;
                            } else {
                                z18 = z12;
                            }
                            if (i26 != 0) {
                                jVar = null;
                            } else {
                                jVar = jVar;
                            }
                            if ((i12 & 256) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i13 &= -1879048193;
                            } else {
                                jM = j10;
                            }
                            if ((i12 & 512) != 0) {
                                long j17 = jM;
                                j11 = androidx.compose.ui.graphics.q0.w(j17, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                j10 = j17;
                                i29 = i28 & (-15);
                            } else {
                                j10 = jM;
                                j11 = j11;
                                i29 = i28;
                            }
                        } else {
                            if (i16 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if (i20 != 0) {
                                function3 = null;
                            } else {
                                function3 = function3;
                            }
                            if (i22 != 0) {
                                z18 = true;
                            } else {
                                z18 = z12;
                            }
                            if (i26 != 0) {
                                jVar = null;
                            } else {
                                jVar = jVar;
                            }
                            if ((i12 & 256) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i13 &= -1879048193;
                            } else {
                                jM = j10;
                            }
                            if ((i12 & 512) != 0) {
                                long j18 = jM;
                                j11 = androidx.compose.ui.graphics.q0.w(j18, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                j10 = j18;
                                i29 = i28 & (-15);
                            } else {
                                j10 = jM;
                                j11 = j11;
                                i29 = i28;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                        }
                        if (function3 == null) {
                            c0VarR.E(-229962826);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-229962825);
                            cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                            c0VarR.A();
                        }
                        androidx.compose.runtime.internal.c cVar3 = cVarE;
                        androidx.compose.ui.a0 a0Var7 = a0Var4;
                        androidx.compose.ui.a0 a0VarQ3 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var7, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarQ3);
                        androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                        int i34 = i29;
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
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK3, aVar3.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK3, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN3, aVar3.f());
                        androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                        n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar3), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i34 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var7;
                        function4 = function3;
                        z16 = z18;
                        jVar2 = jVar;
                        z17 = z14;
                        j13 = j11;
                        j12 = j10;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function4 = function3;
                        z16 = z12;
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z17 = z14;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z14 = z11;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z12)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 128;
                if (i24 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i25 = 67108864;
                    } else {
                        i25 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i25;
                }
                if ((i10 & 805306368) == 0) {
                    if ((i12 & 256) == 0) {
                        i26 = i24;
                        if (c0VarR.L(j10)) {
                        }
                        i13 |= i31;
                    } else {
                        i26 = i24;
                    }
                    i13 |= i31;
                } else {
                    i26 = i24;
                }
                if ((i11 & 6) == 0) {
                    if ((i12 & 512) == 0) {
                        i30 = 2;
                    } else {
                        i30 = 2;
                    }
                    i27 = i11 | i30;
                } else {
                    i27 = i11;
                }
                i28 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c0VarR.h(z15, i13 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function3;
                        }
                        if (i22 != 0) {
                            z18 = true;
                        } else {
                            z18 = z12;
                        }
                        if (i26 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if ((i12 & 256) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i13 &= -1879048193;
                        } else {
                            jM = j10;
                        }
                        if ((i12 & 512) != 0) {
                            long j19 = jM;
                            j11 = androidx.compose.ui.graphics.q0.w(j19, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            j10 = j19;
                            i29 = i28 & (-15);
                        } else {
                            j10 = jM;
                            j11 = j11;
                            i29 = i28;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function3;
                        }
                        if (i22 != 0) {
                            z18 = true;
                        } else {
                            z18 = z12;
                        }
                        if (i26 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if ((i12 & 256) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i13 &= -1879048193;
                        } else {
                            jM = j10;
                        }
                        if ((i12 & 512) != 0) {
                            long j110 = jM;
                            j11 = androidx.compose.ui.graphics.q0.w(j110, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            j10 = j110;
                            i29 = i28 & (-15);
                        } else {
                            j10 = jM;
                            j11 = j11;
                            i29 = i28;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                    }
                    if (function3 == null) {
                        c0VarR.E(-229962826);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-229962825);
                        cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVar4 = cVarE;
                    androidx.compose.ui.a0 a0Var8 = a0Var4;
                    androidx.compose.ui.a0 a0VarQ4 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var8, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarQ4);
                    androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                    int i35 = i29;
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK4, aVar4.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK4, aVar4.g());
                    function2B = aVar4.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN4, aVar4.f());
                    androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                    n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar4), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i35 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var8;
                    function4 = function3;
                    z16 = z18;
                    jVar2 = jVar;
                    z17 = z14;
                    j13 = j11;
                    j12 = j10;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function4 = function3;
                    z16 = z12;
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z17 = z14;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.media3.exoplayer.a5.S0;
            function1 = function0;
            if ((i12 & 4) != 0) {
                i13 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c0VarR.k0(function2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        z14 = z11;
                        if (c0VarR.G(z14)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                    i22 = i12 & 64;
                    if (i22 != 0) {
                        i13 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.G(z12)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i13 |= i23;
                    }
                    i24 = i12 & 128;
                    if (i24 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i25 = 67108864;
                        } else {
                            i25 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i25;
                    }
                    if ((i10 & 805306368) == 0) {
                        if ((i12 & 256) == 0) {
                            i26 = i24;
                            if (c0VarR.L(j10)) {
                            }
                            i13 |= i31;
                        } else {
                            i26 = i24;
                        }
                        i13 |= i31;
                    } else {
                        i26 = i24;
                    }
                    if ((i11 & 6) == 0) {
                        if ((i12 & 512) == 0) {
                            i30 = 2;
                        } else {
                            i30 = 2;
                        }
                        i27 = i11 | i30;
                    } else {
                        i27 = i11;
                    }
                    i28 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (c0VarR.h(z15, i13 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i16 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if (i20 != 0) {
                                function3 = null;
                            } else {
                                function3 = function3;
                            }
                            if (i22 != 0) {
                                z18 = true;
                            } else {
                                z18 = z12;
                            }
                            if (i26 != 0) {
                                jVar = null;
                            } else {
                                jVar = jVar;
                            }
                            if ((i12 & 256) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i13 &= -1879048193;
                            } else {
                                jM = j10;
                            }
                            if ((i12 & 512) != 0) {
                                long j111 = jM;
                                j11 = androidx.compose.ui.graphics.q0.w(j111, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                j10 = j111;
                                i29 = i28 & (-15);
                            } else {
                                j10 = jM;
                                j11 = j11;
                                i29 = i28;
                            }
                        } else {
                            if (i16 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if (i20 != 0) {
                                function3 = null;
                            } else {
                                function3 = function3;
                            }
                            if (i22 != 0) {
                                z18 = true;
                            } else {
                                z18 = z12;
                            }
                            if (i26 != 0) {
                                jVar = null;
                            } else {
                                jVar = jVar;
                            }
                            if ((i12 & 256) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i13 &= -1879048193;
                            } else {
                                jM = j10;
                            }
                            if ((i12 & 512) != 0) {
                                long j112 = jM;
                                j11 = androidx.compose.ui.graphics.q0.w(j112, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                j10 = j112;
                                i29 = i28 & (-15);
                            } else {
                                j10 = jM;
                                j11 = j11;
                                i29 = i28;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                        }
                        if (function3 == null) {
                            c0VarR.E(-229962826);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-229962825);
                            cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                            c0VarR.A();
                        }
                        androidx.compose.runtime.internal.c cVar5 = cVarE;
                        androidx.compose.ui.a0 a0Var9 = a0Var4;
                        androidx.compose.ui.a0 a0VarQ5 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var9, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarQ5);
                        androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                        int i36 = i29;
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK5, aVar5.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK5, aVar5.g());
                        function2B = aVar5.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN5, aVar5.f());
                        androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                        n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar5), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i36 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var9;
                        function4 = function3;
                        z16 = z18;
                        jVar2 = jVar;
                        z17 = z14;
                        j13 = j11;
                        j12 = j10;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function4 = function3;
                        z16 = z12;
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z17 = z14;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z14 = z11;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z12)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 128;
                if (i24 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i25 = 67108864;
                    } else {
                        i25 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i25;
                }
                if ((i10 & 805306368) == 0) {
                    if ((i12 & 256) == 0) {
                        i26 = i24;
                        if (c0VarR.L(j10)) {
                        }
                        i13 |= i31;
                    } else {
                        i26 = i24;
                    }
                    i13 |= i31;
                } else {
                    i26 = i24;
                }
                if ((i11 & 6) == 0) {
                    if ((i12 & 512) == 0) {
                        i30 = 2;
                    } else {
                        i30 = 2;
                    }
                    i27 = i11 | i30;
                } else {
                    i27 = i11;
                }
                i28 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c0VarR.h(z15, i13 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function3;
                        }
                        if (i22 != 0) {
                            z18 = true;
                        } else {
                            z18 = z12;
                        }
                        if (i26 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if ((i12 & 256) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i13 &= -1879048193;
                        } else {
                            jM = j10;
                        }
                        if ((i12 & 512) != 0) {
                            long j113 = jM;
                            j11 = androidx.compose.ui.graphics.q0.w(j113, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            j10 = j113;
                            i29 = i28 & (-15);
                        } else {
                            j10 = jM;
                            j11 = j11;
                            i29 = i28;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function3;
                        }
                        if (i22 != 0) {
                            z18 = true;
                        } else {
                            z18 = z12;
                        }
                        if (i26 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if ((i12 & 256) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i13 &= -1879048193;
                        } else {
                            jM = j10;
                        }
                        if ((i12 & 512) != 0) {
                            long j114 = jM;
                            j11 = androidx.compose.ui.graphics.q0.w(j114, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            j10 = j114;
                            i29 = i28 & (-15);
                        } else {
                            j10 = jM;
                            j11 = j11;
                            i29 = i28;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                    }
                    if (function3 == null) {
                        c0VarR.E(-229962826);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-229962825);
                        cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVar6 = cVarE;
                    androidx.compose.ui.a0 a0Var10 = a0Var4;
                    androidx.compose.ui.a0 a0VarQ6 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var10, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarQ6);
                    androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                    int i37 = i29;
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK6, aVar6.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK6, aVar6.g());
                    function2B = aVar6.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN6, aVar6.f());
                    androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                    n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar6), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i37 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var10;
                    function4 = function3;
                    z16 = z18;
                    jVar2 = jVar;
                    z17 = z14;
                    j13 = j11;
                    j12 = j10;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function4 = function3;
                    z16 = z12;
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z17 = z14;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            a0Var2 = a0Var;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((196608 & i10) == 0) {
                    z14 = z11;
                    if (c0VarR.G(z14)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z12)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 128;
                if (i24 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i25 = 67108864;
                    } else {
                        i25 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i25;
                }
                if ((i10 & 805306368) == 0) {
                    if ((i12 & 256) == 0) {
                        i26 = i24;
                        if (c0VarR.L(j10)) {
                        }
                        i13 |= i31;
                    } else {
                        i26 = i24;
                    }
                    i13 |= i31;
                } else {
                    i26 = i24;
                }
                if ((i11 & 6) == 0) {
                    if ((i12 & 512) == 0) {
                        i30 = 2;
                    } else {
                        i30 = 2;
                    }
                    i27 = i11 | i30;
                } else {
                    i27 = i11;
                }
                i28 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c0VarR.h(z15, i13 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function3;
                        }
                        if (i22 != 0) {
                            z18 = true;
                        } else {
                            z18 = z12;
                        }
                        if (i26 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if ((i12 & 256) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i13 &= -1879048193;
                        } else {
                            jM = j10;
                        }
                        if ((i12 & 512) != 0) {
                            long j115 = jM;
                            j11 = androidx.compose.ui.graphics.q0.w(j115, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            j10 = j115;
                            i29 = i28 & (-15);
                        } else {
                            j10 = jM;
                            j11 = j11;
                            i29 = i28;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function3;
                        }
                        if (i22 != 0) {
                            z18 = true;
                        } else {
                            z18 = z12;
                        }
                        if (i26 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if ((i12 & 256) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i13 &= -1879048193;
                        } else {
                            jM = j10;
                        }
                        if ((i12 & 512) != 0) {
                            long j116 = jM;
                            j11 = androidx.compose.ui.graphics.q0.w(j116, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            j10 = j116;
                            i29 = i28 & (-15);
                        } else {
                            j10 = jM;
                            j11 = j11;
                            i29 = i28;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                    }
                    if (function3 == null) {
                        c0VarR.E(-229962826);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-229962825);
                        cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVar7 = cVarE;
                    androidx.compose.ui.a0 a0Var11 = a0Var4;
                    androidx.compose.ui.a0 a0VarQ7 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var11, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarQ7);
                    androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                    int i38 = i29;
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK7, aVar7.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK7, aVar7.g());
                    function2B = aVar7.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN7, aVar7.f());
                    androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                    n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar7), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i38 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var11;
                    function4 = function3;
                    z16 = z18;
                    jVar2 = jVar;
                    z17 = z14;
                    j13 = j11;
                    j12 = j10;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function4 = function3;
                    z16 = z12;
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z17 = z14;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            z14 = z11;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function3)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            i22 = i12 & 64;
            if (i22 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.G(z12)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i13 |= i23;
            }
            i24 = i12 & 128;
            if (i24 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(jVar)) {
                    i25 = 67108864;
                } else {
                    i25 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i25;
            }
            if ((i10 & 805306368) == 0) {
                if ((i12 & 256) == 0) {
                    i26 = i24;
                    if (c0VarR.L(j10)) {
                    }
                    i13 |= i31;
                } else {
                    i26 = i24;
                }
                i13 |= i31;
            } else {
                i26 = i24;
            }
            if ((i11 & 6) == 0) {
                if ((i12 & 512) == 0) {
                    i30 = 2;
                } else {
                    i30 = 2;
                }
                i27 = i11 | i30;
            } else {
                i27 = i11;
            }
            i28 = i27;
            if ((i13 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c0VarR.h(z15, i13 & 1)) {
                c0VarR.l0();
                cVarE = null;
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    } else {
                        function3 = function3;
                    }
                    if (i22 != 0) {
                        z18 = true;
                    } else {
                        z18 = z12;
                    }
                    if (i26 != 0) {
                        jVar = null;
                    } else {
                        jVar = jVar;
                    }
                    if ((i12 & 256) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i13 &= -1879048193;
                    } else {
                        jM = j10;
                    }
                    if ((i12 & 512) != 0) {
                        long j117 = jM;
                        j11 = androidx.compose.ui.graphics.q0.w(j117, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        j10 = j117;
                        i29 = i28 & (-15);
                    } else {
                        j10 = jM;
                        j11 = j11;
                        i29 = i28;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    } else {
                        function3 = function3;
                    }
                    if (i22 != 0) {
                        z18 = true;
                    } else {
                        z18 = z12;
                    }
                    if (i26 != 0) {
                        jVar = null;
                    } else {
                        jVar = jVar;
                    }
                    if ((i12 & 256) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i13 &= -1879048193;
                    } else {
                        jM = j10;
                    }
                    if ((i12 & 512) != 0) {
                        long j118 = jM;
                        j11 = androidx.compose.ui.graphics.q0.w(j118, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        j10 = j118;
                        i29 = i28 & (-15);
                    } else {
                        j10 = jM;
                        j11 = j11;
                        i29 = i28;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                }
                if (function3 == null) {
                    c0VarR.E(-229962826);
                    c0VarR.A();
                } else {
                    c0VarR.E(-229962825);
                    cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                    c0VarR.A();
                }
                androidx.compose.runtime.internal.c cVar8 = cVarE;
                androidx.compose.ui.a0 a0Var12 = a0Var4;
                androidx.compose.ui.a0 a0VarQ8 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var12, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarQ8);
                androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                int i39 = i29;
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK8, aVar8.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK8, aVar8.g());
                function2B = aVar8.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN8, aVar8.f());
                androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
                n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar8), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i39 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                c0Var2 = c0VarR;
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var12;
                function4 = function3;
                z16 = z18;
                jVar2 = jVar;
                z17 = z14;
                j13 = j11;
                j12 = j10;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function4 = function3;
                z16 = z12;
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z17 = z14;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        z13 = z10;
        if ((i12 & 2) != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                function1 = function0;
                if (c0VarR.k0(function1)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i12 & 4) != 0) {
                i13 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c0VarR.k0(function2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        z14 = z11;
                        if (c0VarR.G(z14)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                    i22 = i12 & 64;
                    if (i22 != 0) {
                        i13 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.G(z12)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i13 |= i23;
                    }
                    i24 = i12 & 128;
                    if (i24 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(jVar)) {
                            i25 = 67108864;
                        } else {
                            i25 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i25;
                    }
                    if ((i10 & 805306368) == 0) {
                        if ((i12 & 256) == 0) {
                            i26 = i24;
                            if (c0VarR.L(j10)) {
                            }
                            i13 |= i31;
                        } else {
                            i26 = i24;
                        }
                        i13 |= i31;
                    } else {
                        i26 = i24;
                    }
                    if ((i11 & 6) == 0) {
                        if ((i12 & 512) == 0) {
                            i30 = 2;
                        } else {
                            i30 = 2;
                        }
                        i27 = i11 | i30;
                    } else {
                        i27 = i11;
                    }
                    i28 = i27;
                    if ((i13 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (c0VarR.h(z15, i13 & 1)) {
                        c0VarR.l0();
                        cVarE = null;
                        if ((i10 & 1) != 0) {
                            if (i16 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if (i20 != 0) {
                                function3 = null;
                            } else {
                                function3 = function3;
                            }
                            if (i22 != 0) {
                                z18 = true;
                            } else {
                                z18 = z12;
                            }
                            if (i26 != 0) {
                                jVar = null;
                            } else {
                                jVar = jVar;
                            }
                            if ((i12 & 256) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i13 &= -1879048193;
                            } else {
                                jM = j10;
                            }
                            if ((i12 & 512) != 0) {
                                long j119 = jM;
                                j11 = androidx.compose.ui.graphics.q0.w(j119, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                j10 = j119;
                                i29 = i28 & (-15);
                            } else {
                                j10 = jM;
                                j11 = j11;
                                i29 = i28;
                            }
                        } else {
                            if (i16 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            if (i20 != 0) {
                                function3 = null;
                            } else {
                                function3 = function3;
                            }
                            if (i22 != 0) {
                                z18 = true;
                            } else {
                                z18 = z12;
                            }
                            if (i26 != 0) {
                                jVar = null;
                            } else {
                                jVar = jVar;
                            }
                            if ((i12 & 256) != 0) {
                                jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                                i13 &= -1879048193;
                            } else {
                                jM = j10;
                            }
                            if ((i12 & 512) != 0) {
                                long j1110 = jM;
                                j11 = androidx.compose.ui.graphics.q0.w(j1110, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                j10 = j1110;
                                i29 = i28 & (-15);
                            } else {
                                j10 = jM;
                                j11 = j11;
                                i29 = i28;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                        }
                        if (function3 == null) {
                            c0VarR.E(-229962826);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-229962825);
                            cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                            c0VarR.A();
                        }
                        androidx.compose.runtime.internal.c cVar9 = cVarE;
                        androidx.compose.ui.a0 a0Var13 = a0Var4;
                        androidx.compose.ui.a0 a0VarQ9 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var13, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                        androidx.compose.ui.layout.a1 a1VarK9 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarQ9);
                        androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                        int i310 = i29;
                        function0A = aVar9.a();
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK9, aVar9.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK9, aVar9.g());
                        function2B = aVar9.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN9, aVar9.f());
                        androidx.compose.foundation.layout.d0 d0Var9 = androidx.compose.foundation.layout.d0.f15956a;
                        n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar9), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i310 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                        c0Var2 = c0VarR;
                        c0Var2.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var13;
                        function4 = function3;
                        z16 = z18;
                        jVar2 = jVar;
                        z17 = z14;
                        j13 = j11;
                        j12 = j10;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        function4 = function3;
                        z16 = z12;
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        z17 = z14;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                z14 = z11;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z12)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 128;
                if (i24 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i25 = 67108864;
                    } else {
                        i25 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i25;
                }
                if ((i10 & 805306368) == 0) {
                    if ((i12 & 256) == 0) {
                        i26 = i24;
                        if (c0VarR.L(j10)) {
                        }
                        i13 |= i31;
                    } else {
                        i26 = i24;
                    }
                    i13 |= i31;
                } else {
                    i26 = i24;
                }
                if ((i11 & 6) == 0) {
                    if ((i12 & 512) == 0) {
                        i30 = 2;
                    } else {
                        i30 = 2;
                    }
                    i27 = i11 | i30;
                } else {
                    i27 = i11;
                }
                i28 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c0VarR.h(z15, i13 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function3;
                        }
                        if (i22 != 0) {
                            z18 = true;
                        } else {
                            z18 = z12;
                        }
                        if (i26 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if ((i12 & 256) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i13 &= -1879048193;
                        } else {
                            jM = j10;
                        }
                        if ((i12 & 512) != 0) {
                            long j1111 = jM;
                            j11 = androidx.compose.ui.graphics.q0.w(j1111, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            j10 = j1111;
                            i29 = i28 & (-15);
                        } else {
                            j10 = jM;
                            j11 = j11;
                            i29 = i28;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function3;
                        }
                        if (i22 != 0) {
                            z18 = true;
                        } else {
                            z18 = z12;
                        }
                        if (i26 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if ((i12 & 256) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i13 &= -1879048193;
                        } else {
                            jM = j10;
                        }
                        if ((i12 & 512) != 0) {
                            long j1112 = jM;
                            j11 = androidx.compose.ui.graphics.q0.w(j1112, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            j10 = j1112;
                            i29 = i28 & (-15);
                        } else {
                            j10 = jM;
                            j11 = j11;
                            i29 = i28;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                    }
                    if (function3 == null) {
                        c0VarR.E(-229962826);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-229962825);
                        cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVar10 = cVarE;
                    androidx.compose.ui.a0 a0Var14 = a0Var4;
                    androidx.compose.ui.a0 a0VarQ10 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var14, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK10 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarQ10);
                    androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                    int i311 = i29;
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK10, aVar10.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK10, aVar10.g());
                    function2B = aVar10.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN10, aVar10.f());
                    androidx.compose.foundation.layout.d0 d0Var10 = androidx.compose.foundation.layout.d0.f15956a;
                    n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar10), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i311 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var14;
                    function4 = function3;
                    z16 = z18;
                    jVar2 = jVar;
                    z17 = z14;
                    j13 = j11;
                    j12 = j10;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function4 = function3;
                    z16 = z12;
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z17 = z14;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            a0Var2 = a0Var;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((196608 & i10) == 0) {
                    z14 = z11;
                    if (c0VarR.G(z14)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z12)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 128;
                if (i24 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i25 = 67108864;
                    } else {
                        i25 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i25;
                }
                if ((i10 & 805306368) == 0) {
                    if ((i12 & 256) == 0) {
                        i26 = i24;
                        if (c0VarR.L(j10)) {
                        }
                        i13 |= i31;
                    } else {
                        i26 = i24;
                    }
                    i13 |= i31;
                } else {
                    i26 = i24;
                }
                if ((i11 & 6) == 0) {
                    if ((i12 & 512) == 0) {
                        i30 = 2;
                    } else {
                        i30 = 2;
                    }
                    i27 = i11 | i30;
                } else {
                    i27 = i11;
                }
                i28 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c0VarR.h(z15, i13 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function3;
                        }
                        if (i22 != 0) {
                            z18 = true;
                        } else {
                            z18 = z12;
                        }
                        if (i26 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if ((i12 & 256) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i13 &= -1879048193;
                        } else {
                            jM = j10;
                        }
                        if ((i12 & 512) != 0) {
                            long j1113 = jM;
                            j11 = androidx.compose.ui.graphics.q0.w(j1113, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            j10 = j1113;
                            i29 = i28 & (-15);
                        } else {
                            j10 = jM;
                            j11 = j11;
                            i29 = i28;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function3;
                        }
                        if (i22 != 0) {
                            z18 = true;
                        } else {
                            z18 = z12;
                        }
                        if (i26 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if ((i12 & 256) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i13 &= -1879048193;
                        } else {
                            jM = j10;
                        }
                        if ((i12 & 512) != 0) {
                            long j1114 = jM;
                            j11 = androidx.compose.ui.graphics.q0.w(j1114, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            j10 = j1114;
                            i29 = i28 & (-15);
                        } else {
                            j10 = jM;
                            j11 = j11;
                            i29 = i28;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                    }
                    if (function3 == null) {
                        c0VarR.E(-229962826);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-229962825);
                        cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVar11 = cVarE;
                    androidx.compose.ui.a0 a0Var15 = a0Var4;
                    androidx.compose.ui.a0 a0VarQ11 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var15, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK11 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarQ11);
                    androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                    int i312 = i29;
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK11, aVar11.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK11, aVar11.g());
                    function2B = aVar11.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN11, aVar11.f());
                    androidx.compose.foundation.layout.d0 d0Var11 = androidx.compose.foundation.layout.d0.f15956a;
                    n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar11), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i312 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var15;
                    function4 = function3;
                    z16 = z18;
                    jVar2 = jVar;
                    z17 = z14;
                    j13 = j11;
                    j12 = j10;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function4 = function3;
                    z16 = z12;
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z17 = z14;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            z14 = z11;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function3)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            i22 = i12 & 64;
            if (i22 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.G(z12)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i13 |= i23;
            }
            i24 = i12 & 128;
            if (i24 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(jVar)) {
                    i25 = 67108864;
                } else {
                    i25 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i25;
            }
            if ((i10 & 805306368) == 0) {
                if ((i12 & 256) == 0) {
                    i26 = i24;
                    if (c0VarR.L(j10)) {
                    }
                    i13 |= i31;
                } else {
                    i26 = i24;
                }
                i13 |= i31;
            } else {
                i26 = i24;
            }
            if ((i11 & 6) == 0) {
                if ((i12 & 512) == 0) {
                    i30 = 2;
                } else {
                    i30 = 2;
                }
                i27 = i11 | i30;
            } else {
                i27 = i11;
            }
            i28 = i27;
            if ((i13 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c0VarR.h(z15, i13 & 1)) {
                c0VarR.l0();
                cVarE = null;
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    } else {
                        function3 = function3;
                    }
                    if (i22 != 0) {
                        z18 = true;
                    } else {
                        z18 = z12;
                    }
                    if (i26 != 0) {
                        jVar = null;
                    } else {
                        jVar = jVar;
                    }
                    if ((i12 & 256) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i13 &= -1879048193;
                    } else {
                        jM = j10;
                    }
                    if ((i12 & 512) != 0) {
                        long j1115 = jM;
                        j11 = androidx.compose.ui.graphics.q0.w(j1115, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        j10 = j1115;
                        i29 = i28 & (-15);
                    } else {
                        j10 = jM;
                        j11 = j11;
                        i29 = i28;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    } else {
                        function3 = function3;
                    }
                    if (i22 != 0) {
                        z18 = true;
                    } else {
                        z18 = z12;
                    }
                    if (i26 != 0) {
                        jVar = null;
                    } else {
                        jVar = jVar;
                    }
                    if ((i12 & 256) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i13 &= -1879048193;
                    } else {
                        jM = j10;
                    }
                    if ((i12 & 512) != 0) {
                        long j1116 = jM;
                        j11 = androidx.compose.ui.graphics.q0.w(j1116, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        j10 = j1116;
                        i29 = i28 & (-15);
                    } else {
                        j10 = jM;
                        j11 = j11;
                        i29 = i28;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                }
                if (function3 == null) {
                    c0VarR.E(-229962826);
                    c0VarR.A();
                } else {
                    c0VarR.E(-229962825);
                    cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                    c0VarR.A();
                }
                androidx.compose.runtime.internal.c cVar12 = cVarE;
                androidx.compose.ui.a0 a0Var16 = a0Var4;
                androidx.compose.ui.a0 a0VarQ12 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var16, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                androidx.compose.ui.layout.a1 a1VarK12 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarQ12);
                androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                int i313 = i29;
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
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK12, aVar12.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK12, aVar12.g());
                function2B = aVar12.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN12, aVar12.f());
                androidx.compose.foundation.layout.d0 d0Var12 = androidx.compose.foundation.layout.d0.f15956a;
                n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar12), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i313 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                c0Var2 = c0VarR;
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var16;
                function4 = function3;
                z16 = z18;
                jVar2 = jVar;
                z17 = z14;
                j13 = j11;
                j12 = j10;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function4 = function3;
                z16 = z12;
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z17 = z14;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        function1 = function0;
        if ((i12 & 4) != 0) {
            i13 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c0VarR.k0(function2)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i13 |= i15;
        }
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i10 & 24576) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((196608 & i10) == 0) {
                    z14 = z11;
                    if (c0VarR.G(z14)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z12)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 128;
                if (i24 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(jVar)) {
                        i25 = 67108864;
                    } else {
                        i25 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i25;
                }
                if ((i10 & 805306368) == 0) {
                    if ((i12 & 256) == 0) {
                        i26 = i24;
                        if (c0VarR.L(j10)) {
                        }
                        i13 |= i31;
                    } else {
                        i26 = i24;
                    }
                    i13 |= i31;
                } else {
                    i26 = i24;
                }
                if ((i11 & 6) == 0) {
                    if ((i12 & 512) == 0) {
                        i30 = 2;
                    } else {
                        i30 = 2;
                    }
                    i27 = i11 | i30;
                } else {
                    i27 = i11;
                }
                i28 = i27;
                if ((i13 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c0VarR.h(z15, i13 & 1)) {
                    c0VarR.l0();
                    cVarE = null;
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function3;
                        }
                        if (i22 != 0) {
                            z18 = true;
                        } else {
                            z18 = z12;
                        }
                        if (i26 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if ((i12 & 256) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i13 &= -1879048193;
                        } else {
                            jM = j10;
                        }
                        if ((i12 & 512) != 0) {
                            long j1117 = jM;
                            j11 = androidx.compose.ui.graphics.q0.w(j1117, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            j10 = j1117;
                            i29 = i28 & (-15);
                        } else {
                            j10 = jM;
                            j11 = j11;
                            i29 = i28;
                        }
                    } else {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i18 != 0) {
                            z14 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function3;
                        }
                        if (i22 != 0) {
                            z18 = true;
                        } else {
                            z18 = z12;
                        }
                        if (i26 != 0) {
                            jVar = null;
                        } else {
                            jVar = jVar;
                        }
                        if ((i12 & 256) != 0) {
                            jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                            i13 &= -1879048193;
                        } else {
                            jM = j10;
                        }
                        if ((i12 & 512) != 0) {
                            long j1118 = jM;
                            j11 = androidx.compose.ui.graphics.q0.w(j1118, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            j10 = j1118;
                            i29 = i28 & (-15);
                        } else {
                            j10 = jM;
                            j11 = j11;
                            i29 = i28;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                    }
                    if (function3 == null) {
                        c0VarR.E(-229962826);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-229962825);
                        cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                        c0VarR.A();
                    }
                    androidx.compose.runtime.internal.c cVar13 = cVarE;
                    androidx.compose.ui.a0 a0Var17 = a0Var4;
                    androidx.compose.ui.a0 a0VarQ13 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var17, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                    androidx.compose.ui.layout.a1 a1VarK13 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarQ13);
                    androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                    int i314 = i29;
                    function0A = aVar13.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK13, aVar13.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK13, aVar13.g());
                    function2B = aVar13.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN13, aVar13.f());
                    androidx.compose.foundation.layout.d0 d0Var13 = androidx.compose.foundation.layout.d0.f15956a;
                    n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar13), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i314 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                    c0Var2 = c0VarR;
                    c0Var2.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var17;
                    function4 = function3;
                    z16 = z18;
                    jVar2 = jVar;
                    z17 = z14;
                    j13 = j11;
                    j12 = j10;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    function4 = function3;
                    z16 = z12;
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    z17 = z14;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            z14 = z11;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function3)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            i22 = i12 & 64;
            if (i22 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.G(z12)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i13 |= i23;
            }
            i24 = i12 & 128;
            if (i24 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(jVar)) {
                    i25 = 67108864;
                } else {
                    i25 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i25;
            }
            if ((i10 & 805306368) == 0) {
                if ((i12 & 256) == 0) {
                    i26 = i24;
                    if (c0VarR.L(j10)) {
                    }
                    i13 |= i31;
                } else {
                    i26 = i24;
                }
                i13 |= i31;
            } else {
                i26 = i24;
            }
            if ((i11 & 6) == 0) {
                if ((i12 & 512) == 0) {
                    i30 = 2;
                } else {
                    i30 = 2;
                }
                i27 = i11 | i30;
            } else {
                i27 = i11;
            }
            i28 = i27;
            if ((i13 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c0VarR.h(z15, i13 & 1)) {
                c0VarR.l0();
                cVarE = null;
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    } else {
                        function3 = function3;
                    }
                    if (i22 != 0) {
                        z18 = true;
                    } else {
                        z18 = z12;
                    }
                    if (i26 != 0) {
                        jVar = null;
                    } else {
                        jVar = jVar;
                    }
                    if ((i12 & 256) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i13 &= -1879048193;
                    } else {
                        jM = j10;
                    }
                    if ((i12 & 512) != 0) {
                        long j1119 = jM;
                        j11 = androidx.compose.ui.graphics.q0.w(j1119, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        j10 = j1119;
                        i29 = i28 & (-15);
                    } else {
                        j10 = jM;
                        j11 = j11;
                        i29 = i28;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    } else {
                        function3 = function3;
                    }
                    if (i22 != 0) {
                        z18 = true;
                    } else {
                        z18 = z12;
                    }
                    if (i26 != 0) {
                        jVar = null;
                    } else {
                        jVar = jVar;
                    }
                    if ((i12 & 256) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i13 &= -1879048193;
                    } else {
                        jM = j10;
                    }
                    if ((i12 & 512) != 0) {
                        long j11110 = jM;
                        j11 = androidx.compose.ui.graphics.q0.w(j11110, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        j10 = j11110;
                        i29 = i28 & (-15);
                    } else {
                        j10 = jM;
                        j11 = j11;
                        i29 = i28;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                }
                if (function3 == null) {
                    c0VarR.E(-229962826);
                    c0VarR.A();
                } else {
                    c0VarR.E(-229962825);
                    cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                    c0VarR.A();
                }
                androidx.compose.runtime.internal.c cVar14 = cVarE;
                androidx.compose.ui.a0 a0Var18 = a0Var4;
                androidx.compose.ui.a0 a0VarQ14 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var18, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                androidx.compose.ui.layout.a1 a1VarK14 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarQ14);
                androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                int i315 = i29;
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK14, aVar14.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK14, aVar14.g());
                function2B = aVar14.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN14, aVar14.f());
                androidx.compose.foundation.layout.d0 d0Var14 = androidx.compose.foundation.layout.d0.f15956a;
                n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar14), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i315 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                c0Var2 = c0VarR;
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var18;
                function4 = function3;
                z16 = z18;
                jVar2 = jVar;
                z17 = z14;
                j13 = j11;
                j12 = j10;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function4 = function3;
                z16 = z12;
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z17 = z14;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        a0Var2 = a0Var;
        i18 = i12 & 16;
        if (i18 != 0) {
            if ((196608 & i10) == 0) {
                z14 = z11;
                if (c0VarR.G(z14)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function3)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            i22 = i12 & 64;
            if (i22 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.G(z12)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i13 |= i23;
            }
            i24 = i12 & 128;
            if (i24 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(jVar)) {
                    i25 = 67108864;
                } else {
                    i25 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i25;
            }
            if ((i10 & 805306368) == 0) {
                if ((i12 & 256) == 0) {
                    i26 = i24;
                    if (c0VarR.L(j10)) {
                    }
                    i13 |= i31;
                } else {
                    i26 = i24;
                }
                i13 |= i31;
            } else {
                i26 = i24;
            }
            if ((i11 & 6) == 0) {
                if ((i12 & 512) == 0) {
                    i30 = 2;
                } else {
                    i30 = 2;
                }
                i27 = i11 | i30;
            } else {
                i27 = i11;
            }
            i28 = i27;
            if ((i13 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c0VarR.h(z15, i13 & 1)) {
                c0VarR.l0();
                cVarE = null;
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    } else {
                        function3 = function3;
                    }
                    if (i22 != 0) {
                        z18 = true;
                    } else {
                        z18 = z12;
                    }
                    if (i26 != 0) {
                        jVar = null;
                    } else {
                        jVar = jVar;
                    }
                    if ((i12 & 256) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i13 &= -1879048193;
                    } else {
                        jM = j10;
                    }
                    if ((i12 & 512) != 0) {
                        long j11111 = jM;
                        j11 = androidx.compose.ui.graphics.q0.w(j11111, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        j10 = j11111;
                        i29 = i28 & (-15);
                    } else {
                        j10 = jM;
                        j11 = j11;
                        i29 = i28;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i18 != 0) {
                        z14 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    } else {
                        function3 = function3;
                    }
                    if (i22 != 0) {
                        z18 = true;
                    } else {
                        z18 = z12;
                    }
                    if (i26 != 0) {
                        jVar = null;
                    } else {
                        jVar = jVar;
                    }
                    if ((i12 & 256) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i13 &= -1879048193;
                    } else {
                        jM = j10;
                    }
                    if ((i12 & 512) != 0) {
                        long j11112 = jM;
                        j11 = androidx.compose.ui.graphics.q0.w(j11112, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        j10 = j11112;
                        i29 = i28 & (-15);
                    } else {
                        j10 = jM;
                        j11 = j11;
                        i29 = i28;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                }
                if (function3 == null) {
                    c0VarR.E(-229962826);
                    c0VarR.A();
                } else {
                    c0VarR.E(-229962825);
                    cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                    c0VarR.A();
                }
                androidx.compose.runtime.internal.c cVar15 = cVarE;
                androidx.compose.ui.a0 a0Var19 = a0Var4;
                androidx.compose.ui.a0 a0VarQ15 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var19, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
                androidx.compose.ui.layout.a1 a1VarK15 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarQ15);
                androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                int i316 = i29;
                function0A = aVar15.a();
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK15, aVar15.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK15, aVar15.g());
                function2B = aVar15.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN15, aVar15.f());
                androidx.compose.foundation.layout.d0 d0Var15 = androidx.compose.foundation.layout.d0.f15956a;
                n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar15), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i316 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
                c0Var2 = c0VarR;
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var19;
                function4 = function3;
                z16 = z18;
                jVar2 = jVar;
                z17 = z14;
                j13 = j11;
                j12 = j10;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                function4 = function3;
                z16 = z12;
                jVar2 = jVar;
                a0Var3 = a0Var2;
                z17 = z14;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.profileinstaller.n.c.f73814m;
        z14 = z11;
        i20 = i12 & 32;
        if (i20 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.k0(function3)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i13 |= i21;
        }
        i22 = i12 & 64;
        if (i22 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.G(z12)) {
                i23 = 8388608;
            } else {
                i23 = 4194304;
            }
            i13 |= i23;
        }
        i24 = i12 & 128;
        if (i24 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0VarR.D(jVar)) {
                i25 = 67108864;
            } else {
                i25 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i13 |= i25;
        }
        if ((i10 & 805306368) == 0) {
            if ((i12 & 256) == 0) {
                i26 = i24;
                if (c0VarR.L(j10)) {
                }
                i13 |= i31;
            } else {
                i26 = i24;
            }
            i13 |= i31;
        } else {
            i26 = i24;
        }
        if ((i11 & 6) == 0) {
            if ((i12 & 512) == 0) {
                i30 = 2;
            } else {
                i30 = 2;
            }
            i27 = i11 | i30;
        } else {
            i27 = i11;
        }
        i28 = i27;
        if ((i13 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (c0VarR.h(z15, i13 & 1)) {
            c0VarR.l0();
            cVarE = null;
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i18 != 0) {
                    z14 = true;
                }
                if (i20 != 0) {
                    function3 = null;
                } else {
                    function3 = function3;
                }
                if (i22 != 0) {
                    z18 = true;
                } else {
                    z18 = z12;
                }
                if (i26 != 0) {
                    jVar = null;
                } else {
                    jVar = jVar;
                }
                if ((i12 & 256) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    i13 &= -1879048193;
                } else {
                    jM = j10;
                }
                if ((i12 & 512) != 0) {
                    long j11113 = jM;
                    j11 = androidx.compose.ui.graphics.q0.w(j11113, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    j10 = j11113;
                    i29 = i28 & (-15);
                } else {
                    j10 = jM;
                    j11 = j11;
                    i29 = i28;
                }
            } else {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i18 != 0) {
                    z14 = true;
                }
                if (i20 != 0) {
                    function3 = null;
                } else {
                    function3 = function3;
                }
                if (i22 != 0) {
                    z18 = true;
                } else {
                    z18 = z12;
                }
                if (i26 != 0) {
                    jVar = null;
                } else {
                    jVar = jVar;
                }
                if ((i12 & 256) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    i13 &= -1879048193;
                } else {
                    jM = j10;
                }
                if ((i12 & 512) != 0) {
                    long j11114 = jM;
                    j11 = androidx.compose.ui.graphics.q0.w(j11114, u4.f25148a.d(c0VarR, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    j10 = j11114;
                    i29 = i28 & (-15);
                } else {
                    j10 = jM;
                    j11 = j11;
                    i29 = i28;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1744464261, i13, i29, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
            }
            if (function3 == null) {
                c0VarR.E(-229962826);
                c0VarR.A();
            } else {
                c0VarR.E(-229962825);
                cVarE = androidx.compose.runtime.internal.w.e(2120789583, true, new c(function3), c0VarR, 54);
                c0VarR.A();
            }
            androidx.compose.runtime.internal.c cVar16 = cVarE;
            androidx.compose.ui.a0 a0Var110 = a0Var4;
            androidx.compose.ui.a0 a0VarQ16 = androidx.compose.foundation.layout.x5.q(x5Var, androidx.compose.foundation.selection.c.a(a0Var110, z13, jVar, wd.h(false, 0.0f, j10, 2, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.h()), function1), 1.0f, false, 2, null);
            androidx.compose.ui.layout.a1 a1VarK16 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarQ16);
            androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
            int i317 = i29;
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
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK16, aVar16.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK16, aVar16.g());
            function2B = aVar16.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN16, aVar16.f());
            androidx.compose.foundation.layout.d0 d0Var16 = androidx.compose.foundation.layout.d0.f15956a;
            n(j10, j11, z10, androidx.compose.runtime.internal.w.e(2011119551, true, new b(z18, function2, cVar16), c0VarR, 54), c0VarR, ((i13 >> 27) & 14) | 3072 | ((i317 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i13 << 3) & 896));
            c0Var2 = c0VarR;
            c0Var2.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var110;
            function4 = function3;
            z16 = z18;
            jVar2 = jVar;
            z17 = z14;
            j13 = j11;
            j12 = j10;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            function4 = function3;
            z16 = z12;
            jVar2 = jVar;
            a0Var3 = a0Var2;
            z17 = z14;
            j12 = j10;
            j13 = j11;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.o2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r2.m(x5Var, z10, function0, function2, a0Var3, z17, function4, z16, jVar2, j12, j13, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void k(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @androidx.annotation.x(from = 0.0d, to = 1.0d) final float f10, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1481587758);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function3) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.I(f10) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1481587758, i11, -1, "androidx.compose.material.BottomNavigationItemBaselineLayout (BottomNavigation.kt:311)");
            }
            boolean z10 = ((i11 & com.planner5d.library.engine.input.f.b.B) == 32) | ((i11 & 896) == 256);
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new d(function3, f10);
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(aVar, "icon");
            androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarB);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0VarR, Integer.valueOf(i11 & 14));
            c0VarR.o();
            if (function3 != null) {
                c0VarR.E(1977704767);
                androidx.compose.ui.a0 a0VarT = androidx.compose.foundation.layout.d5.t(androidx.compose.ui.draw.a.a(androidx.compose.ui.layout.i0.b(aVar, com.google.firebase.messaging.e.f.f123534d), f10), f24594c, 0.0f, 2, null);
                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                int iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarT);
                Function0<androidx.compose.ui.node.g> function0A3 = aVar2.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                androidx.compose.runtime.c0 c0VarD3 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD3, a1VarK2, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar2.b();
                if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar2.f());
                function3.invoke(c0VarR, Integer.valueOf((i11 >> 3) & 14));
                c0VarR.o();
                c0VarR.A();
            } else {
                c0VarR.E(1977958471);
                c0VarR.A();
            }
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.q2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r2.l(function2, function3, f10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function2 function2, Function2 function3, float f10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        k(function2, function3, f10, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(androidx.compose.foundation.layout.x5 x5Var, boolean z10, Function0 function0, Function2 function2, androidx.compose.ui.a0 a0Var, boolean z11, Function2 function3, boolean z12, androidx.compose.foundation.interaction.j jVar, long j10, long j11, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        j(x5Var, z10, function0, function2, a0Var, z11, function3, z12, jVar, j10, j11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    private static final void n(final long j10, final long j11, final boolean z10, final pj.n<? super Float, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(616920545);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.L(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.L(j11) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.G(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.k0(nVar) ? 2048 : 1024;
        }
        if (c0VarR.h((i11 & 1171) != 1170, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(616920545, i11, -1, "androidx.compose.material.BottomNavigationTransition (BottomNavigation.kt:279)");
            }
            androidx.compose.runtime.n7<Float> n7VarF = androidx.compose.animation.core.f.f(z10 ? 1.0f : 0.0f, f24592a, 0.0f, null, null, c0VarR, 48, 28);
            long jQ = androidx.compose.ui.graphics.s0.q(j11, j10, o(n7VarF));
            androidx.compose.runtime.a1.f(new androidx.compose.runtime.n4[]{x4.a().f(androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.q0.w(jQ, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), w4.c().f(Float.valueOf(androidx.compose.ui.graphics.q0.A(jQ)))}, androidx.compose.runtime.internal.w.e(343660833, true, new e(nVar, n7VarF), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.k2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r2.p(j10, j11, z10, nVar, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float o(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(long j10, long j11, boolean z10, pj.n nVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        n(j10, j11, z10, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        h(a0Var, j10, j11, f10, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(androidx.compose.foundation.layout.v6 v6Var, androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(v6Var, a0Var, j10, j11, f10, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 x(androidx.compose.ui.layout.c1 c1Var, final androidx.compose.ui.layout.i2 i2Var, long j10) {
        int iH = androidx.compose.ui.unit.c.h(j10, c1Var.g6(f24593b));
        final int iC1 = (iH - i2Var.c1()) / 2;
        boolean z10 = true;
        return androidx.compose.ui.layout.c1.h6(c1Var, i2Var.h1(), iH, null, new Function1() { // from class: androidx.compose.material.n2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r2.y(i2Var, iC1, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(androidx.compose.ui.layout.i2 i2Var, int i10, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, i10, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 z(androidx.compose.ui.layout.c1 c1Var, final androidx.compose.ui.layout.i2 i2Var, final androidx.compose.ui.layout.i2 i2Var2, long j10, @androidx.annotation.x(from = 0.0d, to = 1.0d) final float f10) {
        int iG6 = c1Var.g6(f24595d) - i2Var.M(androidx.compose.ui.layout.b.a());
        int iC1 = i2Var2.c1() + i2Var.c1() + iG6;
        int iH = androidx.compose.ui.unit.c.h(j10, Math.max(iC1, c1Var.g6(f24593b)));
        final int iU = kotlin.ranges.r.u((iH - iC1) / 2, 0);
        int iC2 = (iH - i2Var2.c1()) / 2;
        final int iC3 = i2Var2.c1() + iU + iG6;
        int iMax = Math.max(i2Var.h1(), i2Var2.h1());
        final int iH1 = (iMax - i2Var.h1()) / 2;
        final int iH2 = (iMax - i2Var2.h1()) / 2;
        final int iL0 = kotlin.math.b.L0((iC2 - iU) * (1 - f10));
        return androidx.compose.ui.layout.c1.h6(c1Var, iMax, iH, null, new Function1() { // from class: androidx.compose.material.m2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r2.A(f10, i2Var, iH1, iC3, iL0, i2Var2, iH2, iU, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }
}
