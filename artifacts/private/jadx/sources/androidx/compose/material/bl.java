package androidx.compose.material;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,444:1\n99#2:445\n96#2,9:446\n106#2:526\n79#3,6:455\n86#3,3:470\n89#3,2:479\n79#3,6:492\n86#3,3:507\n89#3,2:516\n93#3:521\n93#3:525\n347#4,9:461\n356#4:481\n347#4,9:498\n356#4,3:518\n357#4,2:523\n4206#5,6:473\n4206#5,6:510\n49#6:482\n70#7:483\n68#7,8:484\n77#7:522\n113#8:527\n113#8:528\n113#8:529\n113#8:530\n113#8:531\n113#8:532\n113#8:533\n113#8:534\n113#8:535\n113#8:536\n113#8:537\n113#8:538\n113#8:539\n113#8:540\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine\n*L\n217#1:445\n217#1:446,9\n217#1:526\n217#1:455,6\n217#1:470,3\n217#1:479,2\n222#1:492,6\n222#1:507,3\n222#1:516,2\n222#1:521\n217#1:525\n217#1:461,9\n217#1:481\n222#1:498,9\n222#1:518,3\n217#1:523,2\n217#1:473,6\n222#1:510,6\n224#1:482\n222#1:483\n222#1:484,8\n222#1:522\n186#1:527\n187#1:528\n190#1:529\n191#1:530\n192#1:531\n195#1:532\n196#1:533\n197#1:534\n198#1:535\n199#1:536\n200#1:537\n201#1:538\n202#1:539\n205#1:540\n*E\n"})
final class bl {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f22242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f22243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f22244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f22245h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f22247j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f22250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f22251n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f22252o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bl f22238a = new bl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f22239b = androidx.compose.ui.unit.h.r(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f22240c = androidx.compose.ui.unit.h.r(72);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f22241d = androidx.compose.ui.unit.h.r(40);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f22246i = androidx.compose.ui.unit.h.r(24);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f22248k = androidx.compose.ui.unit.h.r(28);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f22249l = androidx.compose.ui.unit.h.r(32);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22254b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f22253a = function2;
            this.f22254b = function3;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(979717374, i10, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:242)");
            }
            this.f22253a.invoke(c0Var, 0);
            this.f22254b.invoke(c0Var, 0);
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

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22256b;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f22255a = function2;
            this.f22256b = function3;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1888627961, i10, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:261)");
            }
            this.f22255a.invoke(c0Var, 0);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f22256b;
            Intrinsics.checkNotNull(function2);
            function2.invoke(c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine$ListItem$1$4\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,444:1\n70#2:445\n68#2,8:446\n77#2:484\n79#3,6:454\n86#3,3:469\n89#3,2:478\n93#3:483\n347#4,9:460\n356#4,3:480\n4206#5,6:472\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine$ListItem$1$4\n*L\n274#1:445\n274#1:446,8\n274#1:484\n274#1:454,6\n274#1:469,3\n274#1:478,2\n274#1:483\n274#1:460,9\n274#1:480,3\n274#1:472,6\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f22257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f22258b;

        /* JADX WARN: Multi-variable type inference failed */
        c(float f10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f22257a = f10;
            this.f22258b = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1476831345, i10, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:273)");
            }
            androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.foundation.layout.i6.k(androidx.compose.ui.a0.E, this.f22257a, 0.0f, 2, null), 0.0f, 0.0f, bl.f22252o, 0.0f, 11, null);
            androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f22258b;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarV);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0Var, 0);
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

    static {
        float f10 = 16;
        f22242e = androidx.compose.ui.unit.h.r(f10);
        f22243f = androidx.compose.ui.unit.h.r(f10);
        f22244g = androidx.compose.ui.unit.h.r(f10);
        f22245h = androidx.compose.ui.unit.h.r(f10);
        float f11 = 20;
        f22247j = androidx.compose.ui.unit.h.r(f11);
        f22250m = androidx.compose.ui.unit.h.r(f11);
        f22251n = androidx.compose.ui.unit.h.r(f11);
        f22252o = androidx.compose.ui.unit.h.r(f10);
    }

    private bl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(bl blVar, androidx.compose.ui.a0 a0Var, Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function2 function6, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        blVar.b(a0Var, function2, function3, function4, function5, function6, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void b(@Nullable androidx.compose.ui.a0 a0Var, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        bl blVar;
        final androidx.compose.ui.a0 a0Var3;
        boolean z10;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(598947838);
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
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= c0VarR.k0(function5) ? 16384 : 8192;
        }
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i12 |= c0VarR.k0(function6) ? 131072 : 65536;
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
            blVar = this;
        } else {
            blVar = this;
            if ((i10 & 1572864) == 0) {
                i12 |= c0VarR.D(blVar) ? 1048576 : 524288;
            }
        }
        if (c0VarR.h((599187 & i12) != 599186, i12 & 1)) {
            androidx.compose.ui.a0 a0Var4 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var2;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(598947838, i12, -1, "androidx.compose.material.TwoLine.ListItem (ListItem.kt:214)");
            }
            float f10 = function2 == null ? f22239b : f22240c;
            androidx.compose.ui.a0 a0VarK = androidx.compose.foundation.layout.i6.k(a0Var4, f10, 0.0f, 2, null);
            androidx.compose.foundation.layout.q.e eVarW = androidx.compose.foundation.layout.q.f16330a.w();
            androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(eVarW, aVar.w(), c0VarR, 0);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarK);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            float f11 = f10;
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
            androidx.compose.ui.a0 a0Var5 = a0Var4;
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.foundation.layout.x5.q(y5Var, aVar3, 1.0f, false, 2, null), f22244g, 0.0f, f22245h, 0.0f, 10, null);
            if (function2 != null) {
                c0VarR.E(1807018686);
                float f12 = f22242e;
                androidx.compose.ui.a0 a0VarA = androidx.compose.foundation.layout.i6.A(aVar3, androidx.compose.ui.unit.h.r(f12 + f22241d), f11, 0.0f, 0.0f, 12, null);
                float f13 = f22243f;
                androidx.compose.ui.a0 a0VarV2 = androidx.compose.foundation.layout.d5.v(a0VarA, f12, f13, 0.0f, f13, 4, null);
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarV2);
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
                function2.invoke(c0VarR, Integer.valueOf((i12 >> 3) & 14));
                c0VarR.o();
                c0VarR.A();
            } else {
                c0VarR.E(1807574144);
                c0VarR.A();
            }
            if (function5 != null) {
                c0VarR.E(1807622349);
                z10 = true;
                s9.e(CollectionsKt.listOf((Object[]) new androidx.compose.ui.unit.h[]{androidx.compose.ui.unit.h.o(f22246i), androidx.compose.ui.unit.h.o(f22247j)}), a0VarV, androidx.compose.runtime.internal.w.e(979717374, true, new a(function5, function3), c0VarR, 54), c0VarR, 390, 0);
                c0VarR.A();
            } else {
                z10 = true;
                c0VarR.E(1807914338);
                s9.e(CollectionsKt.listOf((Object[]) new androidx.compose.ui.unit.h[]{androidx.compose.ui.unit.h.o(function2 != null ? f22249l : f22248k), androidx.compose.ui.unit.h.o(function2 != null ? f22251n : f22250m)}), a0VarV, androidx.compose.runtime.internal.w.e(-1888627961, true, new b(function3, function4), c0VarR, 54), c0VarR, androidx.media3.exoplayer.a5.S0, 0);
                c0VarR.A();
            }
            if (function6 != null) {
                c0VarR.E(1808643799);
                s9.j(function2 != null ? f22249l : f22248k, null, androidx.compose.runtime.internal.w.e(-1476831345, z10, new c(f11, function6), c0VarR, 54), c0VarR, androidx.media3.exoplayer.a5.S0, 2);
                c0VarR.A();
            } else {
                c0VarR.E(1809267488);
                c0VarR.A();
            }
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final bl blVar2 = blVar;
            s5VarT.a(new Function2() { // from class: androidx.compose.material.al
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return bl.c(this.f22116a, a0Var3, function2, function3, function4, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
