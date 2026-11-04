package androidx.compose.material;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,173:1\n1282#2,6:174\n79#3,6:180\n86#3,3:195\n89#3,2:204\n79#3,6:216\n86#3,3:231\n89#3,2:240\n93#3:245\n79#3,6:257\n86#3,3:272\n89#3,2:281\n93#3:286\n93#3:290\n79#3,6:298\n86#3,3:313\n89#3,2:322\n93#3:327\n347#4,9:186\n356#4:206\n347#4,9:222\n356#4,3:242\n347#4,9:263\n356#4,3:283\n357#4,2:288\n347#4,9:304\n356#4,3:324\n4206#5,6:198\n4206#5,6:234\n4206#5,6:275\n4206#5,6:316\n70#6:207\n68#6,8:208\n77#6:246\n70#6:247\n67#6,9:248\n77#6:287\n68#7:291\n55#7:333\n55#7:335\n99#8,6:292\n106#8:328\n113#9:329\n113#9:330\n113#9:331\n113#9:332\n113#9:334\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt\n*L\n73#1:174,6\n63#1:180,6\n63#1:195,3\n63#1:204,2\n65#1:216,6\n65#1:231,3\n65#1:240,2\n65#1:245\n70#1:257,6\n70#1:272,3\n70#1:281,2\n70#1:286\n63#1:290\n135#1:298,6\n135#1:313,3\n135#1:322,2\n135#1:327\n63#1:186,9\n63#1:206\n65#1:222,9\n65#1:242,3\n70#1:263,9\n70#1:283,3\n63#1:288,2\n135#1:304,9\n135#1:324,3\n63#1:198,6\n65#1:234,6\n70#1:275,6\n135#1:316,6\n65#1:207\n65#1:208,8\n65#1:246\n70#1:247\n70#1:248,9\n70#1:287\n138#1:291\n168#1:333\n172#1:335\n135#1:292,6\n135#1:328\n155#1:329\n158#1:330\n164#1:331\n168#1:332\n172#1:334\n*E\n"})
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f25770a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f25773d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f25775f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f25771b = androidx.compose.ui.unit.h.r(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f25772c = androidx.compose.ui.unit.a0.m(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f25774e = androidx.compose.ui.unit.h.r(-androidx.compose.ui.unit.h.r(6));

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f25776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.x5 f25777b;

        /* JADX INFO: renamed from: androidx.compose.material.z1$a$a, reason: collision with other inner class name */
        static final class C0205a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f25778a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.x5 f25779b;

            /* JADX WARN: Multi-variable type inference failed */
            C0205a(pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.foundation.layout.x5 x5Var) {
                this.f25778a = nVar;
                this.f25779b = x5Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2001396045, i10, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:147)");
                }
                this.f25778a.invoke(this.f25779b, c0Var, 0);
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
        a(pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.foundation.layout.x5 x5Var) {
            this.f25776a = nVar;
            this.f25777b = x5Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1185347010, i10, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous> (Badge.kt:146)");
            }
            wk.l(androidx.compose.ui.text.y3.m(x9.f25488a.c(c0Var, 6).e(), 0L, z1.f25772c, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), androidx.compose.runtime.internal.w.e(-2001396045, true, new C0205a(this.f25776a, this.f25777b), c0Var, 54), c0Var, 48);
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

    @SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt$BadgedBox$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,173:1\n563#2,2:174\n34#2,6:176\n565#2:182\n563#2,2:183\n34#2,6:185\n565#2:191\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt$BadgedBox$2$1\n*L\n76#1:174,2\n76#1:176,6\n76#1:182\n84#1:183,2\n84#1:185,6\n84#1:191\n*E\n"})
    static final class b implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25780a = new b();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.ui.layout.i2.a aVar) {
            float fJ = i2Var.h1() > c1Var.g6(z1.i()) * 2 ? z1.j() : z1.h();
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, 0, 0, 0.0f, 4, null);
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, i2Var2.h1() + c1Var.g6(fJ), (-i2Var.c1()) / 2, 0.0f, 4, null);
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(final androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.layout.z0 z0Var = list.get(i10);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), MetricTracker.Object.BADGE)) {
                    final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 11, null));
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        androidx.compose.ui.layout.z0 z0Var2 = list.get(i11);
                        if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), io.ktor.http.t1.a.f296107c)) {
                            final androidx.compose.ui.layout.i2 i2VarP1 = z0Var2.P0(j10);
                            return c1Var.S6(i2VarP1.h1(), i2VarP1.c1(), MapsKt.mapOf(TuplesKt.to(androidx.compose.ui.layout.b.a(), Integer.valueOf(i2VarP1.M(androidx.compose.ui.layout.b.a()))), TuplesKt.to(androidx.compose.ui.layout.b.b(), Integer.valueOf(i2VarP1.M(androidx.compose.ui.layout.b.b())))), new Function1() { // from class: androidx.compose.material.a2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return z1.b.g(i2VarP0, c1Var, i2VarP1, (androidx.compose.ui.layout.i2.a) obj);
                                }
                            });
                        }
                    }
                    androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                    throw new kotlin.a0();
                }
            }
            androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
            throw new kotlin.a0();
        }
    }

    static {
        float f10 = 4;
        f25770a = androidx.compose.ui.unit.h.r(f10);
        f25773d = androidx.compose.ui.unit.h.r(f10);
        f25775f = androidx.compose.ui.unit.h.r(-androidx.compose.ui.unit.h.r(f10));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x0139  */
    /* JADX WARN: Code duplicated, block: B:84:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x0149  */
    /* JADX WARN: Code duplicated, block: B:90:0x0176  */
    /* JADX WARN: Code duplicated, block: B:93:0x018f  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:97:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d2  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void c(@Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, @Nullable pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        long jD;
        long jD2;
        pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        boolean z10;
        androidx.compose.ui.a0 a0Var3;
        final long j12;
        final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3;
        androidx.compose.runtime.s5 s5VarT;
        float f10;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.foundation.layout.y5 y5Var;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1356170301);
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
        if ((i10 & 48) == 0) {
            jD = j10;
            i12 |= ((i11 & 2) == 0 && c0VarR.L(jD)) ? 32 : 16;
        } else {
            jD = j10;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            jD2 = j11;
            i12 |= ((i11 & 4) == 0 && c0VarR.L(jD2)) ? 256 : 128;
        } else {
            jD2 = j11;
        }
        int i14 = i11 & 8;
        if (i14 == 0) {
            if ((i10 & 3072) == 0) {
                nVar2 = nVar;
                i12 |= c0VarR.k0(nVar2) ? 2048 : 1024;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i13 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jD = x9.f25488a.a(c0VarR, 6).d();
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jD2 = n4.d(jD, c0VarR, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i14 != 0) {
                        nVar2 = null;
                    }
                } else {
                    c0VarR.u();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    a0Var3 = a0Var2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1356170301, i12, -1, "androidx.compose.material.Badge (Badge.kt:129)");
                }
                if (nVar2 != null) {
                    f10 = f25771b;
                } else {
                    f10 = f25770a;
                }
                androidx.compose.foundation.shape.n nVarH = androidx.compose.foundation.shape.o.h(f10);
                float f11 = f10 * 2;
                androidx.compose.ui.a0 a0VarT = androidx.compose.foundation.layout.d5.t(androidx.compose.ui.draw.j.a(androidx.compose.foundation.v.c(androidx.compose.foundation.layout.i6.a(a0Var3, androidx.compose.ui.unit.h.r(f11), androidx.compose.ui.unit.h.r(f11)), jD, nVarH), nVarH), f25773d, 0.0f, 2, null);
                androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarT);
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
                y5Var = androidx.compose.foundation.layout.y5.f16577a;
                if (nVar2 != null) {
                    c0VarR.E(749640967);
                    androidx.compose.runtime.a1.e(x4.a().f(androidx.compose.ui.graphics.q0.n(jD2)), androidx.compose.runtime.internal.w.e(1185347010, true, new a(nVar2, y5Var), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                    c0VarR.A();
                } else {
                    c0VarR.E(749906203);
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
            j12 = jD2;
            nVar3 = nVar2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var4 = a0Var3;
                final long j13 = jD;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.y1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return z1.d(a0Var4, j13, j12, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        nVar2 = nVar;
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jD = x9.f25488a.a(c0VarR, 6).d();
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jD2 = n4.d(jD, c0VarR, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i14 != 0) {
                    nVar2 = null;
                }
            } else {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jD = x9.f25488a.a(c0VarR, 6).d();
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jD2 = n4.d(jD, c0VarR, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i14 != 0) {
                    nVar2 = null;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1356170301, i12, -1, "androidx.compose.material.Badge (Badge.kt:129)");
            }
            if (nVar2 != null) {
                f10 = f25771b;
            } else {
                f10 = f25770a;
            }
            androidx.compose.foundation.shape.n nVarH2 = androidx.compose.foundation.shape.o.h(f10);
            float f12 = f10 * 2;
            androidx.compose.ui.a0 a0VarT2 = androidx.compose.foundation.layout.d5.t(androidx.compose.ui.draw.j.a(androidx.compose.foundation.v.c(androidx.compose.foundation.layout.i6.a(a0Var3, androidx.compose.ui.unit.h.r(f12), androidx.compose.ui.unit.h.r(f12)), jD, nVarH2), nVarH2), f25773d, 0.0f, 2, null);
            androidx.compose.ui.layout.a1 a1VarE2 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarT2);
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
            y5Var = androidx.compose.foundation.layout.y5.f16577a;
            if (nVar2 != null) {
                c0VarR.E(749640967);
                androidx.compose.runtime.a1.e(x4.a().f(androidx.compose.ui.graphics.q0.n(jD2)), androidx.compose.runtime.internal.w.e(1185347010, true, new a(nVar2, y5Var), c0VarR, 54), c0VarR, androidx.compose.runtime.n4.f36267i | 48);
                c0VarR.A();
            } else {
                c0VarR.E(749906203);
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
        j12 = jD2;
        nVar3 = nVar2;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var5 = a0Var3;
            final long j14 = jD;
            s5VarT.a(new Function2() { // from class: androidx.compose.material.y1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z1.d(a0Var5, j14, j12, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(androidx.compose.ui.a0 a0Var, long j10, long j11, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        c(a0Var, j10, j11, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0136  */
    /* JADX WARN: Code duplicated, block: B:67:0x013a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0167  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x0224  */
    /* JADX WARN: Code duplicated, block: B:88:0x0228  */
    /* JADX WARN: Code duplicated, block: B:91:0x0233  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void e(@NotNull final pj.n<? super androidx.compose.foundation.layout.c0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.ui.a0 a0Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.c0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z10;
        androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.s5 s5VarT;
        Object objI0;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        int iJ2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        int iJ3;
        Function0<androidx.compose.ui.node.g> function0A3;
        androidx.compose.runtime.c0 c0VarD3;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(898422008);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= androidx.media3.exoplayer.a5.S0;
            } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i14 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(898422008, i12, -1, "androidx.compose.material.BadgedBox (Badge.kt:61)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = b.f25780a;
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarB = androidx.compose.ui.layout.i0.b(aVar2, io.ktor.http.t1.a.f296107c);
                androidx.compose.ui.e.a aVar3 = androidx.compose.ui.e.f37317a;
                int i15 = ((i12 << 3) & 7168) | 54;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar3.i(), false);
                iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarB);
                function0A2 = aVar.a();
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
                androidx.compose.runtime.y7.n(c0VarD2, a1VarK, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar.g());
                function2B2 = aVar.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                nVar2.invoke(d0Var, c0VarR, Integer.valueOf(((i15 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.ui.layout.i0.b(aVar2, MetricTracker.Object.BADGE);
                int i16 = ((i12 << 9) & 7168) | 6;
                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar3.C(), false);
                iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarB2);
                function0A3 = aVar.a();
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
                androidx.compose.runtime.y7.n(c0VarD3, a1VarK2, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar.g());
                function2B3 = aVar.b();
                if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                    c0VarD3.Y(Integer.valueOf(iJ3));
                    c0VarD3.f(Integer.valueOf(iJ3), function2B3);
                }
                androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar.f());
                nVar.invoke(d0Var, c0VarR, Integer.valueOf(((i16 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var4 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.x1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return z1.f(nVar, a0Var4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if (c0VarR.k0(nVar2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i14 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(898422008, i12, -1, "androidx.compose.material.BadgedBox (Badge.kt:61)");
            }
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = b.f25780a;
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var2 = (androidx.compose.ui.layout.a1) objI0;
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
            androidx.compose.runtime.y7.n(c0VarD, a1Var2, aVar4.e());
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
            androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarB3 = androidx.compose.ui.layout.i0.b(aVar5, io.ktor.http.t1.a.f296107c);
            androidx.compose.ui.e.a aVar6 = androidx.compose.ui.e.f37317a;
            int i17 = ((i12 << 3) & 7168) | 54;
            androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar6.i(), false);
            iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarB3);
            function0A2 = aVar4.a();
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
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK3, aVar4.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK5, aVar4.g());
            function2B2 = aVar4.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN5, aVar4.f());
            androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
            nVar2.invoke(d0Var2, c0VarR, Integer.valueOf(((i17 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
            c0VarR.o();
            androidx.compose.ui.a0 a0VarB4 = androidx.compose.ui.layout.i0.b(aVar5, MetricTracker.Object.BADGE);
            int i18 = ((i12 << 9) & 7168) | 6;
            androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(aVar6.C(), false);
            iJ3 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarB4);
            function0A3 = aVar4.a();
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
            androidx.compose.runtime.y7.n(c0VarD3, a1VarK4, aVar4.e());
            androidx.compose.runtime.y7.n(c0VarD3, b1VarK6, aVar4.g());
            function2B3 = aVar4.b();
            if (c0VarD3.P()) {
                c0VarD3.Y(Integer.valueOf(iJ3));
                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
            } else {
                c0VarD3.Y(Integer.valueOf(iJ3));
                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
            }
            androidx.compose.runtime.y7.n(c0VarD3, a0VarN6, aVar4.f());
            nVar.invoke(d0Var2, c0VarR, Integer.valueOf(((i18 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
            c0VarR.o();
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var5 = a0Var3;
            s5VarT.a(new Function2() { // from class: androidx.compose.material.x1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z1.f(nVar, a0Var5, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(pj.n nVar, androidx.compose.ui.a0 a0Var, pj.n nVar2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        e(nVar, a0Var, nVar2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    public static final float h() {
        return f25775f;
    }

    public static final float i() {
        return f25770a;
    }

    public static final float j() {
        return f25774e;
    }

    public static final float k() {
        return f25773d;
    }

    public static final float l() {
        return f25771b;
    }
}
