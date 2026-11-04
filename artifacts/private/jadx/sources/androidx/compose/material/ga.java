package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,386:1\n1925#2:387\n1923#2:388\n1832#2,7:389\n1925#2:396\n1923#2:397\n1832#2,7:398\n1282#3,6:405\n99#4:411\n96#4,9:412\n106#4:451\n79#5,6:421\n86#5,3:436\n89#5,2:445\n93#5:450\n347#6,9:427\n356#6,3:447\n4206#7,6:439\n85#8:452\n85#8:453\n113#9:454\n113#9:455\n113#9:456\n113#9:457\n113#9:458\n113#9:459\n113#9:460\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n*L\n160#1:387\n160#1:388\n160#1:389,7\n181#1:396\n181#1:397\n181#1:398,7\n202#1:405,6\n231#1:411\n231#1:412,9\n231#1:451\n231#1:421,6\n231#1:436,3\n231#1:445,2\n231#1:450\n231#1:427,9\n231#1:447,3\n231#1:439,6\n160#1:452\n181#1:453\n269#1:454\n270#1:455\n271#1:456\n272#1:457\n273#1:458\n274#1:459\n275#1:460\n*E\n"})
public final class ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f22874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f22875b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f22877d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f22880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f22881h = 120;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f22882i = 75;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f22876c = androidx.compose.ui.unit.h.r(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f22878e = androidx.compose.ui.unit.h.r(com.planner5d.library.engine.input.f.b.B);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f22879f = androidx.compose.ui.unit.h.r(280);

    @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt$DropdownMenuContent$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,386:1\n87#2:387\n84#2,9:388\n94#2:427\n79#3,6:397\n86#3,3:412\n89#3,2:421\n93#3:426\n347#4,9:403\n356#4,3:423\n4206#5,6:415\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt$DropdownMenuContent$2\n*L\n210#1:387\n210#1:388,9\n210#1:427\n210#1:397,6\n210#1:412,3\n210#1:421,2\n210#1:426\n210#1:403,9\n210#1:423,3\n210#1:415,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f22883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.b5 f22884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f22885c;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.a0 a0Var, androidx.compose.foundation.b5 b5Var, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f22883a = a0Var;
            this.f22884b = b5Var;
            this.f22885c = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-707086267, i10, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:209)");
            }
            androidx.compose.ui.a0 a0VarM = androidx.compose.foundation.q4.m(androidx.compose.foundation.layout.c4.d(androidx.compose.foundation.layout.d5.t(this.f22883a, 0.0f, ga.m(), 1, null), androidx.compose.foundation.layout.e4.Max), this.f22884b, false, null, false, 14, null);
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f22885c;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarM);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            nVar.invoke(androidx.compose.foundation.layout.n0.f16227a, c0Var, 6);
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

    static final class b implements pj.n<androidx.compose.animation.core.l3.b<Boolean>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f22886a = new b();

        b() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final androidx.compose.animation.core.y0<Float> c(androidx.compose.animation.core.l3.b<Boolean> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(701003475);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(701003475, i10, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:182)");
            }
            androidx.compose.animation.core.y3 y3VarT = bVar.f(Boolean.FALSE, Boolean.TRUE) ? androidx.compose.animation.core.p.t(30, 0, null, 6, null) : androidx.compose.animation.core.p.t(75, 0, null, 6, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return y3VarT;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<Float> invoke(androidx.compose.animation.core.l3.b<Boolean> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(bVar, c0Var, num.intValue());
        }
    }

    static final class c implements pj.n<androidx.compose.animation.core.l3.b<Boolean>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f22887a = new c();

        c() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final androidx.compose.animation.core.y0<Float> c(androidx.compose.animation.core.l3.b<Boolean> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(445475263);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(445475263, i10, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:161)");
            }
            androidx.compose.animation.core.y3 y3VarT = bVar.f(Boolean.FALSE, Boolean.TRUE) ? androidx.compose.animation.core.p.t(120, 0, androidx.compose.animation.core.u0.f(), 2, null) : androidx.compose.animation.core.p.t(1, 74, null, 4, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return y3VarT;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<Float> invoke(androidx.compose.animation.core.l3.b<Boolean> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(bVar, c0Var, num.intValue());
        }
    }

    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f22888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f22889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.x5 f22890c;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f22891a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.x5 f22892b;

            /* JADX WARN: Multi-variable type inference failed */
            a(pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.foundation.layout.x5 x5Var) {
                this.f22891a = nVar;
                this.f22892b = x5Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                int i11 = 7 << 0;
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-308149173, i10, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:252)");
                }
                this.f22891a.invoke(this.f22892b, c0Var, 0);
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

        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z10, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.foundation.layout.x5 x5Var) {
            this.f22888a = z10;
            this.f22889b = nVar;
            this.f22890c = x5Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            float fB;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-77738101, i10, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:251)");
            }
            if (this.f22888a) {
                c0Var.E(-1691869137);
                fB = u4.f25148a.c(c0Var, 6);
            } else {
                c0Var.E(-1691868397);
                fB = u4.f25148a.b(c0Var, 6);
            }
            c0Var.A();
            androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), androidx.compose.runtime.internal.w.e(-308149173, true, new a(this.f22889b, this.f22890c), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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
        float f10 = 8;
        f22874a = androidx.compose.ui.unit.h.r(f10);
        float f11 = 48;
        f22875b = androidx.compose.ui.unit.h.r(f11);
        f22877d = androidx.compose.ui.unit.h.r(f10);
        f22880g = androidx.compose.ui.unit.h.r(f11);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01af  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:116:0x022d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0233  */
    /* JADX WARN: Code duplicated, block: B:121:0x023d  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:78:0x0101  */
    /* JADX WARN: Code duplicated, block: B:81:0x011e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0123  */
    /* JADX WARN: Code duplicated, block: B:86:0x012b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0172  */
    /* JADX WARN: Code duplicated, block: B:92:0x0179  */
    /* JADX WARN: Code duplicated, block: B:93:0x017c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0184  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a1  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void d(@NotNull final androidx.compose.animation.core.w1<Boolean> w1Var, @NotNull final androidx.compose.runtime.n3<androidx.compose.ui.graphics.z3> n3Var, @NotNull final androidx.compose.foundation.b5 b5Var, @Nullable androidx.compose.ui.a0 a0Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        boolean zBooleanValue;
        float f10;
        final androidx.compose.runtime.n7 n7VarD;
        boolean zBooleanValue2;
        float f11;
        final androidx.compose.runtime.n7 n7VarD2;
        boolean zD;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1077393800);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0VarR.D(w1Var) : c0VarR.k0(w1Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(n3Var) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.D(b5Var) ? 256 : 128;
        }
        int i14 = i11 & 8;
        if (i14 == 0) {
            if ((i10 & 3072) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 2048 : 1024;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
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
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1077393800, i12, -1, "androidx.compose.material.DropdownMenuContent (Menu.kt:154)");
                }
                androidx.compose.animation.core.l3 l3VarG = androidx.compose.animation.core.w3.G(w1Var, "DropDownMenu", c0VarR, androidx.compose.animation.core.w1.f13348e | 48 | (i12 & 14), 0);
                c cVar = c.f22887a;
                kotlin.jvm.internal.z zVar = kotlin.jvm.internal.z.f312833a;
                androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP = androidx.compose.animation.core.t4.P(zVar);
                zBooleanValue = ((Boolean) l3VarG.p()).booleanValue();
                c0VarR.E(-1833869404);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1833869404, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:170)");
                }
                if (zBooleanValue) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.8f;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0VarR.A();
                Float fValueOf = Float.valueOf(f10);
                boolean zBooleanValue3 = ((Boolean) l3VarG.y()).booleanValue();
                c0VarR.E(-1833869404);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1833869404, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:170)");
                }
                float f12 = zBooleanValue3 ? 1.0f : 0.8f;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0VarR.A();
                int i15 = i12;
                androidx.compose.ui.a0 a0Var5 = a0Var4;
                n7VarD = androidx.compose.animation.core.w3.D(l3VarG, fValueOf, Float.valueOf(f12), cVar.invoke(l3VarG.w(), c0VarR, 0), z3VarP, "FloatAnimation", c0VarR, 0);
                b bVar = b.f22886a;
                androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP2 = androidx.compose.animation.core.t4.P(zVar);
                zBooleanValue2 = ((Boolean) l3VarG.p()).booleanValue();
                c0VarR.E(-1578341192);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1578341192, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:191)");
                }
                if (zBooleanValue2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0VarR.A();
                Float fValueOf2 = Float.valueOf(f11);
                boolean zBooleanValue4 = ((Boolean) l3VarG.y()).booleanValue();
                c0VarR.E(-1578341192);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1578341192, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:191)");
                }
                float f13 = zBooleanValue4 ? 1.0f : 0.0f;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0VarR.A();
                n7VarD2 = androidx.compose.animation.core.w3.D(l3VarG, fValueOf2, Float.valueOf(f13), bVar.invoke(l3VarG.w(), c0VarR, 0), z3VarP2, "FloatAnimation", c0VarR, 0);
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                zD = ((i15 & com.planner5d.library.engine.input.f.b.B) == 32) | c0VarR.D(n7VarD) | c0VarR.D(n7VarD2);
                objI0 = c0VarR.i0();
                if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.ea
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ga.g(n3Var, n7VarD, n7VarD2, (androidx.compose.ui.graphics.r1) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                u3.a(androidx.compose.ui.graphics.q1.a(aVar, (Function1) objI0), null, 0L, 0L, null, f22874a, androidx.compose.runtime.internal.w.e(-707086267, true, new a(a0Var5, b5Var, nVar), c0VarR, 54), c0VarR, 1769472, 30);
                c0VarR = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.fa
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ga.h(w1Var, n3Var, b5Var, a0Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
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
            if (i14 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1077393800, i12, -1, "androidx.compose.material.DropdownMenuContent (Menu.kt:154)");
            }
            androidx.compose.animation.core.l3 l3VarG2 = androidx.compose.animation.core.w3.G(w1Var, "DropDownMenu", c0VarR, androidx.compose.animation.core.w1.f13348e | 48 | (i12 & 14), 0);
            c cVar2 = c.f22887a;
            kotlin.jvm.internal.z zVar2 = kotlin.jvm.internal.z.f312833a;
            androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP3 = androidx.compose.animation.core.t4.P(zVar2);
            zBooleanValue = ((Boolean) l3VarG2.p()).booleanValue();
            c0VarR.E(-1833869404);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1833869404, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:170)");
            }
            if (zBooleanValue) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            Float fValueOf3 = Float.valueOf(f10);
            boolean zBooleanValue5 = ((Boolean) l3VarG2.y()).booleanValue();
            c0VarR.E(-1833869404);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1833869404, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:170)");
            }
            if (zBooleanValue5) {
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            int i16 = i12;
            androidx.compose.ui.a0 a0Var6 = a0Var4;
            n7VarD = androidx.compose.animation.core.w3.D(l3VarG2, fValueOf3, Float.valueOf(f12), cVar2.invoke(l3VarG2.w(), c0VarR, 0), z3VarP3, "FloatAnimation", c0VarR, 0);
            b bVar2 = b.f22886a;
            androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP4 = androidx.compose.animation.core.t4.P(zVar2);
            zBooleanValue2 = ((Boolean) l3VarG2.p()).booleanValue();
            c0VarR.E(-1578341192);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1578341192, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:191)");
            }
            if (zBooleanValue2) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            Float fValueOf4 = Float.valueOf(f11);
            boolean zBooleanValue6 = ((Boolean) l3VarG2.y()).booleanValue();
            c0VarR.E(-1578341192);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1578341192, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:191)");
            }
            if (zBooleanValue6) {
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            n7VarD2 = androidx.compose.animation.core.w3.D(l3VarG2, fValueOf4, Float.valueOf(f13), bVar2.invoke(l3VarG2.w(), c0VarR, 0), z3VarP4, "FloatAnimation", c0VarR, 0);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            zD = ((i16 & com.planner5d.library.engine.input.f.b.B) == 32) | c0VarR.D(n7VarD) | c0VarR.D(n7VarD2);
            objI0 = c0VarR.i0();
            if (zD) {
                objI0 = new Function1() { // from class: androidx.compose.material.ea
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ga.g(n3Var, n7VarD, n7VarD2, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: androidx.compose.material.ea
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ga.g(n3Var, n7VarD, n7VarD2, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            u3.a(androidx.compose.ui.graphics.q1.a(aVar2, (Function1) objI0), null, 0L, 0L, null, f22874a, androidx.compose.runtime.internal.w.e(-707086267, true, new a(a0Var6, b5Var, nVar), c0VarR, 54), c0VarR, 1769472, 30);
            c0VarR = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var6;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.fa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ga.h(w1Var, n3Var, b5Var, a0Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float e(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    private static final float f(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(androidx.compose.runtime.n3 n3Var, androidx.compose.runtime.n7 n7Var, androidx.compose.runtime.n7 n7Var2, androidx.compose.ui.graphics.r1 r1Var) {
        r1Var.z(e(n7Var));
        r1Var.C(e(n7Var));
        r1Var.setAlpha(f(n7Var2));
        r1Var.W1(((androidx.compose.ui.graphics.z3) n3Var.getValue()).o());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(androidx.compose.animation.core.w1 w1Var, androidx.compose.runtime.n3 n3Var, androidx.compose.foundation.b5 b5Var, androidx.compose.ui.a0 a0Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        d(w1Var, n3Var, b5Var, a0Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019a  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01de  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x015d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0169  */
    /* JADX WARN: Code duplicated, block: B:96:0x016d  */
    /* JADX WARN: Code duplicated, block: B:99:0x018c  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void i(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.foundation.layout.g5 g5Var, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        int i14;
        int i15;
        androidx.compose.foundation.layout.g5 g5Var2;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        final boolean z12;
        final androidx.compose.foundation.interaction.j jVar2;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.foundation.layout.g5 g5VarA;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        boolean z13;
        androidx.compose.foundation.interaction.j jVar3;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-674391690);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.G(z10)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        g5Var2 = g5Var;
                        if (c0VarR.D(g5Var2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            if (c0VarR.D(jVar)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            i12 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                        if ((74899 & i12) != 74898) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (c0VarR.h(z11, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i15 != 0) {
                                g5VarA = ca.f22312a.a();
                            } else {
                                g5VarA = g5Var2;
                            }
                            if (i17 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                            }
                            androidx.compose.ui.a0 a0VarP = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarP);
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
                            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                            function2B = aVar.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                            wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            jVar2 = jVar3;
                            z12 = z13;
                        } else {
                            c0VarR.u();
                            z12 = z10;
                            jVar2 = jVar;
                            a0Var3 = a0Var2;
                            g5VarA = g5Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 24576;
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i15 != 0) {
                            g5VarA = ca.f22312a.a();
                        } else {
                            g5VarA = g5Var2;
                        }
                        if (i17 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                        }
                        androidx.compose.ui.a0 a0VarP2 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                        androidx.compose.ui.layout.a1 a1VarE2 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarP2);
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
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarE2, aVar2.e());
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
                        wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        jVar2 = jVar3;
                        z12 = z13;
                    } else {
                        c0VarR.u();
                        z12 = z10;
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        g5VarA = g5Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                g5Var2 = g5Var;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(jVar)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i15 != 0) {
                            g5VarA = ca.f22312a.a();
                        } else {
                            g5VarA = g5Var2;
                        }
                        if (i17 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                        }
                        androidx.compose.ui.a0 a0VarP3 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                        androidx.compose.ui.layout.a1 a1VarE3 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarP3);
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
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarE3, aVar3.e());
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
                        wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        jVar2 = jVar3;
                        z12 = z13;
                    } else {
                        c0VarR.u();
                        z12 = z10;
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        g5VarA = g5Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i15 != 0) {
                        g5VarA = ca.f22312a.a();
                    } else {
                        g5VarA = g5Var2;
                    }
                    if (i17 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                    }
                    androidx.compose.ui.a0 a0VarP4 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                    androidx.compose.ui.layout.a1 a1VarE4 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarP4);
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarE4, aVar4.e());
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
                    wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    jVar2 = jVar3;
                    z12 = z13;
                } else {
                    c0VarR.u();
                    z12 = z10;
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    g5VarA = g5Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    g5Var2 = g5Var;
                    if (c0VarR.D(g5Var2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(jVar)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i15 != 0) {
                            g5VarA = ca.f22312a.a();
                        } else {
                            g5VarA = g5Var2;
                        }
                        if (i17 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                        }
                        androidx.compose.ui.a0 a0VarP5 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                        androidx.compose.ui.layout.a1 a1VarE5 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarP5);
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
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarE5, aVar5.e());
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
                        wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        jVar2 = jVar3;
                        z12 = z13;
                    } else {
                        c0VarR.u();
                        z12 = z10;
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        g5VarA = g5Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i15 != 0) {
                        g5VarA = ca.f22312a.a();
                    } else {
                        g5VarA = g5Var2;
                    }
                    if (i17 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                    }
                    androidx.compose.ui.a0 a0VarP6 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                    androidx.compose.ui.layout.a1 a1VarE6 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarP6);
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarE6, aVar6.e());
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
                    wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    jVar2 = jVar3;
                    z12 = z13;
                } else {
                    c0VarR.u();
                    z12 = z10;
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    g5VarA = g5Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            g5Var2 = g5Var;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(jVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i15 != 0) {
                        g5VarA = ca.f22312a.a();
                    } else {
                        g5VarA = g5Var2;
                    }
                    if (i17 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                    }
                    androidx.compose.ui.a0 a0VarP7 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                    androidx.compose.ui.layout.a1 a1VarE7 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarP7);
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarE7, aVar7.e());
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
                    wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    jVar2 = jVar3;
                    z12 = z13;
                } else {
                    c0VarR.u();
                    z12 = z10;
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    g5VarA = g5Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((74899 & i12) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i15 != 0) {
                    g5VarA = ca.f22312a.a();
                } else {
                    g5VarA = g5Var2;
                }
                if (i17 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                }
                androidx.compose.ui.a0 a0VarP8 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                androidx.compose.ui.layout.a1 a1VarE8 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarP8);
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
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarE8, aVar8.e());
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
                wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                jVar2 = jVar3;
                z12 = z13;
            } else {
                c0VarR.u();
                z12 = z10;
                jVar2 = jVar;
                a0Var3 = a0Var2;
                g5VarA = g5Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.G(z10)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    g5Var2 = g5Var;
                    if (c0VarR.D(g5Var2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(jVar)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i15 != 0) {
                            g5VarA = ca.f22312a.a();
                        } else {
                            g5VarA = g5Var2;
                        }
                        if (i17 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                        }
                        androidx.compose.ui.a0 a0VarP9 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                        androidx.compose.ui.layout.a1 a1VarE9 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarP9);
                        androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
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
                        androidx.compose.runtime.y7.n(c0VarD, a1VarE9, aVar9.e());
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
                        wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        jVar2 = jVar3;
                        z12 = z13;
                    } else {
                        c0VarR.u();
                        z12 = z10;
                        jVar2 = jVar;
                        a0Var3 = a0Var2;
                        g5VarA = g5Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i15 != 0) {
                        g5VarA = ca.f22312a.a();
                    } else {
                        g5VarA = g5Var2;
                    }
                    if (i17 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                    }
                    androidx.compose.ui.a0 a0VarP10 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                    androidx.compose.ui.layout.a1 a1VarE10 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarP10);
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarE10, aVar10.e());
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
                    wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    jVar2 = jVar3;
                    z12 = z13;
                } else {
                    c0VarR.u();
                    z12 = z10;
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    g5VarA = g5Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            g5Var2 = g5Var;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(jVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i15 != 0) {
                        g5VarA = ca.f22312a.a();
                    } else {
                        g5VarA = g5Var2;
                    }
                    if (i17 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                    }
                    androidx.compose.ui.a0 a0VarP11 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                    androidx.compose.ui.layout.a1 a1VarE11 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarP11);
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
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarE11, aVar11.e());
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
                    wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    jVar2 = jVar3;
                    z12 = z13;
                } else {
                    c0VarR.u();
                    z12 = z10;
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    g5VarA = g5Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((74899 & i12) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i15 != 0) {
                    g5VarA = ca.f22312a.a();
                } else {
                    g5VarA = g5Var2;
                }
                if (i17 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                }
                androidx.compose.ui.a0 a0VarP12 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                androidx.compose.ui.layout.a1 a1VarE12 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarP12);
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
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarE12, aVar12.e());
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
                wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                jVar2 = jVar3;
                z12 = z13;
            } else {
                c0VarR.u();
                z12 = z10;
                jVar2 = jVar;
                a0Var3 = a0Var2;
                g5VarA = g5Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                g5Var2 = g5Var;
                if (c0VarR.D(g5Var2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(jVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i15 != 0) {
                        g5VarA = ca.f22312a.a();
                    } else {
                        g5VarA = g5Var2;
                    }
                    if (i17 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                    }
                    androidx.compose.ui.a0 a0VarP13 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                    androidx.compose.ui.layout.a1 a1VarE13 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarP13);
                    androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarE13, aVar13.e());
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
                    wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    jVar2 = jVar3;
                    z12 = z13;
                } else {
                    c0VarR.u();
                    z12 = z10;
                    jVar2 = jVar;
                    a0Var3 = a0Var2;
                    g5VarA = g5Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((74899 & i12) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i15 != 0) {
                    g5VarA = ca.f22312a.a();
                } else {
                    g5VarA = g5Var2;
                }
                if (i17 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                }
                androidx.compose.ui.a0 a0VarP14 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                androidx.compose.ui.layout.a1 a1VarE14 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarP14);
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
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarE14, aVar14.e());
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
                wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                jVar2 = jVar3;
                z12 = z13;
            } else {
                c0VarR.u();
                z12 = z10;
                jVar2 = jVar;
                a0Var3 = a0Var2;
                g5VarA = g5Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        g5Var2 = g5Var;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                if (c0VarR.D(jVar)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((74899 & i12) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i15 != 0) {
                    g5VarA = ca.f22312a.a();
                } else {
                    g5VarA = g5Var2;
                }
                if (i17 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                }
                androidx.compose.ui.a0 a0VarP15 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
                androidx.compose.ui.layout.a1 a1VarE15 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarP15);
                androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarE15, aVar15.e());
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
                wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                jVar2 = jVar3;
                z12 = z13;
            } else {
                c0VarR.u();
                z12 = z10;
                jVar2 = jVar;
                a0Var3 = a0Var2;
                g5VarA = g5Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.k0(nVar)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i12 |= i19;
        }
        if ((74899 & i12) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i12 & 1)) {
            if (i20 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                z13 = true;
            } else {
                z13 = z10;
            }
            if (i15 != 0) {
                g5VarA = ca.f22312a.a();
            } else {
                g5VarA = g5Var2;
            }
            if (i17 != 0) {
                jVar3 = null;
            } else {
                jVar3 = jVar;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-674391690, i12, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
            }
            androidx.compose.ui.a0 a0VarP16 = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.A(androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.i1.f(a0Var4, jVar3, wd.h(true, 0.0f, 0L, 6, null), z13, null, null, function1, 24, null), 0.0f, 1, null), f22878e, f22880g, f22879f, 0.0f, 8, null), g5VarA);
            androidx.compose.ui.layout.a1 a1VarE16 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), androidx.compose.ui.e.f37317a.q(), c0VarR, 48);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarP16);
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
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarE16, aVar16.e());
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
            wk.l(x9.f25488a.c(c0VarR, 6).n(), androidx.compose.runtime.internal.w.e(-77738101, true, new d(z13, nVar, androidx.compose.foundation.layout.y5.f16577a), c0VarR, 54), c0VarR, 48);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            jVar2 = jVar3;
            z12 = z13;
        } else {
            c0VarR.u();
            z12 = z10;
            jVar2 = jVar;
            a0Var3 = a0Var2;
            g5VarA = g5Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.da
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ga.j(function0, a0Var3, z12, g5VarA, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.foundation.layout.g5 g5Var, androidx.compose.foundation.interaction.j jVar, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(function0, a0Var, z10, g5Var, jVar, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0060  */
    public static final long l(@NotNull androidx.compose.ui.unit.s sVar, @NotNull androidx.compose.ui.unit.s sVar2) {
        float fMax;
        float fMax2 = 1.0f;
        if (sVar2.t() < sVar.x()) {
            if (sVar2.x() <= sVar.t()) {
                fMax = 1.0f;
            } else {
                fMax = sVar2.G() == 0 ? 0.0f : (((Math.max(sVar.t(), sVar2.t()) + Math.min(sVar.x(), sVar2.x())) / 2) - sVar2.t()) / sVar2.G();
            }
        }
        if (sVar2.B() >= sVar.j()) {
            fMax2 = 0.0f;
        } else if (sVar2.j() > sVar.B()) {
            if (sVar2.r() == 0) {
                fMax2 = 0.0f;
            } else {
                fMax2 = (((Math.max(sVar.B(), sVar2.B()) + Math.min(sVar.j(), sVar2.j())) / 2) - sVar2.B()) / sVar2.r();
            }
        }
        return androidx.compose.ui.graphics.a4.a(fMax, fMax2);
    }

    public static final float m() {
        return f22877d;
    }

    public static final float n() {
        return f22875b;
    }
}
