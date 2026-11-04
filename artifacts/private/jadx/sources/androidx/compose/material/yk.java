package androidx.compose.material;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ThreeLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,444:1\n99#2:445\n96#2,9:446\n106#2:527\n79#3,6:455\n86#3,3:470\n89#3,2:479\n79#3,6:492\n86#3,3:507\n89#3,2:516\n93#3:521\n93#3:526\n347#4,9:461\n356#4:481\n347#4,9:498\n356#4,3:518\n357#4,2:524\n4206#5,6:473\n4206#5,6:510\n49#6:482\n52#6:523\n70#7:483\n68#7,8:484\n77#7:522\n113#8:528\n113#8:529\n113#8:530\n113#8:531\n113#8:532\n113#8:533\n113#8:534\n113#8:535\n113#8:536\n113#8:537\n113#8:538\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ThreeLine\n*L\n316#1:445\n316#1:446,9\n316#1:527\n316#1:455,6\n316#1:470,3\n316#1:479,2\n319#1:492,6\n319#1:507,3\n319#1:516,2\n319#1:521\n316#1:526\n316#1:461,9\n316#1:481\n319#1:498,9\n319#1:518,3\n316#1:524,2\n316#1:473,6\n319#1:510,6\n318#1:482\n345#1:523\n319#1:483\n319#1:484,8\n319#1:522\n289#1:528\n292#1:529\n293#1:530\n294#1:531\n297#1:532\n298#1:533\n299#1:534\n300#1:535\n301#1:536\n302#1:537\n305#1:538\n*E\n"})
final class yk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f25757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f25758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f25759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f25760g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f25762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f25763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f25764k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f25765l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final yk f25754a = new yk();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f25755b = androidx.compose.ui.unit.h.r(88);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f25756c = androidx.compose.ui.unit.h.r(40);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f25761h = androidx.compose.ui.unit.h.r(28);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25768c;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4) {
            this.f25766a = function2;
            this.f25767b = function3;
            this.f25768c = function4;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            boolean z10 = false;
            if ((i10 & 3) != 2) {
                z10 = true;
                int i11 = 2 >> 1;
            }
            if (!c0Var.h(z10, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-595668326, i10, -1, "androidx.compose.material.ThreeLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:338)");
            }
            if (this.f25766a != null) {
                c0Var.E(-1206609496);
                this.f25766a.invoke(c0Var, 0);
            } else {
                c0Var.E(1249824744);
            }
            c0Var.A();
            this.f25767b.invoke(c0Var, 0);
            this.f25768c.invoke(c0Var, 0);
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
        f25757d = androidx.compose.ui.unit.h.r(f10);
        f25758e = androidx.compose.ui.unit.h.r(f10);
        f25759f = androidx.compose.ui.unit.h.r(f10);
        f25760g = androidx.compose.ui.unit.h.r(f10);
        float f11 = 20;
        f25762i = androidx.compose.ui.unit.h.r(f11);
        f25763j = androidx.compose.ui.unit.h.r(f11);
        f25764k = androidx.compose.ui.unit.h.r(f10);
        f25765l = androidx.compose.ui.unit.h.r(f10);
    }

    private yk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(yk ykVar, androidx.compose.ui.a0 a0Var, Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function2 function6, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        ykVar.b(a0Var, function2, function3, function4, function5, function6, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void b(@Nullable androidx.compose.ui.a0 a0Var, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, @Nullable final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        yk ykVar;
        final androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1651890924);
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
            ykVar = this;
        } else {
            ykVar = this;
            if ((i10 & 1572864) == 0) {
                i12 |= c0VarR.D(ykVar) ? 1048576 : 524288;
            }
        }
        int i14 = i12;
        if (c0VarR.h((599187 & i14) != 599186, i14 & 1)) {
            a0Var3 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var2;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1651890924, i14, -1, "androidx.compose.material.ThreeLine.ListItem (ListItem.kt:314)");
            }
            androidx.compose.ui.a0 a0VarK = androidx.compose.foundation.layout.i6.k(a0Var3, f25755b, 0.0f, 2, null);
            androidx.compose.foundation.layout.q.e eVarW = androidx.compose.foundation.layout.q.f16330a.w();
            androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(eVarW, aVar.w(), c0VarR, 0);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarK);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            if (function2 != null) {
                c0VarR.E(2022185866);
                float f10 = f25757d;
                float fR = androidx.compose.ui.unit.h.r(f10 + f25756c);
                androidx.compose.ui.a0 a0VarA = androidx.compose.foundation.layout.i6.A(androidx.compose.ui.a0.E, fR, fR, 0.0f, 0.0f, 12, null);
                float f11 = f25758e;
                androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(a0VarA, f10, f11, 0.0f, f11, 4, null);
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.o(), false);
                int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarV);
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
                function2.invoke(c0VarR, Integer.valueOf((i14 >> 3) & 14));
                c0VarR.o();
                c0VarR.A();
            } else {
                c0VarR.E(2022716338);
                c0VarR.A();
            }
            float f12 = f25761h;
            List listListOf = CollectionsKt.listOf((Object[]) new androidx.compose.ui.unit.h[]{androidx.compose.ui.unit.h.o(f12), androidx.compose.ui.unit.h.o(f25762i), androidx.compose.ui.unit.h.o(f25763j)});
            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
            s9.e(listListOf, androidx.compose.foundation.layout.d5.v(androidx.compose.foundation.layout.x5.q(y5Var, aVar3, 1.0f, false, 2, null), f25759f, 0.0f, f25760g, 0.0f, 10, null), androidx.compose.runtime.internal.w.e(-595668326, true, new a(function5, function3, function4), c0VarR, 54), c0VarR, 390, 0);
            c0VarR = c0VarR;
            if (function6 != null) {
                c0VarR.E(2023227156);
                float f13 = f25764k;
                s9.j(androidx.compose.ui.unit.h.r(f12 - f13), androidx.compose.foundation.layout.d5.v(aVar3, 0.0f, f13, f25765l, 0.0f, 9, null), function6, c0VarR, ((i14 >> 9) & 896) | 54, 0);
                c0VarR.A();
            } else {
                c0VarR.E(2023502002);
                c0VarR.A();
            }
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final yk ykVar2 = ykVar;
            s5VarT.a(new Function2() { // from class: androidx.compose.material.xk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return yk.c(this.f25621a, a0Var3, function2, function3, function4, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
