package androidx.compose.material3;

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
@SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,235:1\n1282#2,6:236\n79#3,6:242\n86#3,3:257\n89#3,2:266\n79#3,6:278\n86#3,3:293\n89#3,2:302\n93#3:307\n79#3,6:319\n86#3,3:334\n89#3,2:343\n93#3:348\n93#3:352\n79#3,6:359\n86#3,3:374\n89#3,2:383\n93#3:388\n347#4,9:248\n356#4:268\n347#4,9:284\n356#4,3:304\n347#4,9:325\n356#4,3:345\n357#4,2:350\n347#4,9:365\n356#4,3:385\n4206#5,6:260\n4206#5,6:296\n4206#5,6:337\n4206#5,6:377\n70#6:269\n68#6,8:270\n77#6:308\n70#6:309\n67#6,9:310\n77#6:349\n99#7,6:353\n106#7:389\n54#8:390\n85#9:391\n113#10:392\n113#10:393\n113#10:394\n113#10:395\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt\n*L\n79#1:236,6\n69#1:242,6\n69#1:257,3\n69#1:266,2\n72#1:278,6\n72#1:293,3\n72#1:302,2\n72#1:307\n77#1:319,6\n77#1:334,3\n77#1:343,2\n77#1:348\n69#1:352\n166#1:359,6\n166#1:374,3\n166#1:383,2\n166#1:388\n69#1:248,9\n69#1:268\n72#1:284,9\n72#1:304,3\n77#1:325,9\n77#1:345,3\n69#1:350,2\n166#1:365,9\n166#1:385,3\n69#1:260,6\n72#1:296,6\n77#1:337,6\n166#1:377,6\n72#1:269\n72#1:270,8\n72#1:308\n77#1:309\n77#1:310,9\n77#1:349\n166#1:353,6\n166#1:389\n228#1:390\n228#1:391\n201#1:392\n207#1:393\n208#1:394\n214#1:395\n*E\n"})
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f29569a = androidx.compose.ui.unit.h.r(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f29570b = androidx.compose.ui.unit.h.r(12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f29571c = androidx.compose.ui.unit.h.r(14);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f29572d = androidx.compose.ui.unit.h.r(6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.layout.t f29573e = new androidx.compose.ui.layout.t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.layout.i3 f29574f = new androidx.compose.ui.layout.i3();

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f29575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.x5 f29576b;

        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.foundation.layout.x5 x5Var) {
            this.f29575a = nVar;
            this.f29576b = x5Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(541712501, i10, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous> (Badge.kt:184)");
            }
            this.f29575a.invoke(this.f29576b, c0Var, 0);
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

    @SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt$BadgedBox$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,235:1\n563#2,2:236\n34#2,6:238\n565#2:244\n563#2,2:245\n34#2,6:247\n565#2:253\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt$BadgedBox$1$1\n*L\n82#1:236,2\n82#1:238,6\n82#1:244\n90#1:245,2\n90#1:247,6\n90#1:253\n*E\n"})
    static final class b implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29577a = new b();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.ui.layout.i2.a aVar) {
            boolean z10 = i2Var.h1() > c1Var.g6(d0.h.f268141a.h());
            float fQ = z10 ? j2.q() : j2.o();
            float fS = z10 ? j2.s() : j2.o();
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, 0, 0, 0.0f, 4, null);
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, Math.min(i2Var2.h1() - c1Var.g6(fQ), ((int) aVar.I(j2.n(), Float.POSITIVE_INFINITY)) - i2Var.h1()), Math.max((-i2Var.c1()) + c1Var.g6(fS), (int) aVar.I(j2.p(), Float.NEGATIVE_INFINITY)), 0.0f, 4, null);
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
                            return c1Var.S6(i2VarP1.h1(), i2VarP1.c1(), MapsKt.mapOf(TuplesKt.to(androidx.compose.ui.layout.b.a(), Integer.valueOf(i2VarP1.M(androidx.compose.ui.layout.b.a()))), TuplesKt.to(androidx.compose.ui.layout.b.b(), Integer.valueOf(i2VarP1.M(androidx.compose.ui.layout.b.b())))), new Function1() { // from class: androidx.compose.material3.k2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j2.b.g(i2VarP0, c1Var, i2VarP1, (androidx.compose.ui.layout.i2.a) obj);
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

    /* JADX WARN: Code duplicated, block: B:101:0x01af  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:105:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:108:0x0205  */
    /* JADX WARN: Code duplicated, block: B:111:0x0212  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x0101  */
    /* JADX WARN: Code duplicated, block: B:85:0x011e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0128  */
    /* JADX WARN: Code duplicated, block: B:89:0x0159  */
    /* JADX WARN: Code duplicated, block: B:92:0x0165  */
    /* JADX WARN: Code duplicated, block: B:93:0x0169  */
    /* JADX WARN: Code duplicated, block: B:98:0x0196  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void f(@Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, @Nullable pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        long jA;
        long jG;
        pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        final long j13;
        final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        d0.h hVar;
        float fH;
        androidx.compose.ui.graphics.q3 q3VarI;
        androidx.compose.ui.a0 a0VarT;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.foundation.layout.y5 y5Var;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1428256508);
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
            jA = j10;
            i12 |= ((i11 & 2) == 0 && c0VarR.L(jA)) ? 32 : 16;
        } else {
            jA = j10;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            jG = j11;
            i12 |= ((i11 & 4) == 0 && c0VarR.L(jG)) ? 256 : 128;
        } else {
            jG = j11;
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
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = d2.f26967a.a(c0VarR, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jG = o6.g(jA, c0VarR, (i12 >> 3) & 14);
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
                    a0Var4 = a0Var2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1428256508, i12, -1, "androidx.compose.material3.Badge (Badge.kt:155)");
                }
                hVar = d0.h.f268141a;
                if (nVar2 != null) {
                    fH = hVar.f();
                } else {
                    fH = hVar.h();
                }
                if (nVar2 != null) {
                    c0VarR.E(-1051012910);
                    q3VarI = cx.i(d0.h.f268141a.e(), c0VarR, 6);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1050955529);
                    q3VarI = cx.i(d0.h.f268141a.g(), c0VarR, 6);
                    c0VarR.A();
                }
                androidx.compose.ui.a0 a0VarC = androidx.compose.foundation.v.c(androidx.compose.foundation.layout.i6.a(a0Var4, fH, fH), jA, q3VarI);
                if (nVar2 != null) {
                    a0VarT = androidx.compose.foundation.layout.d5.t(androidx.compose.ui.a0.E, f29569a, 0.0f, 2, null);
                } else {
                    a0VarT = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB2 = a0VarC.B2(a0VarT);
                androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarB2);
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
                    c0VarR.E(1345815094);
                    androidx.compose.material3.internal.k3.b(jG, la0.e(d0.h.f268141a.d(), c0VarR, 6), androidx.compose.runtime.internal.w.e(541712501, true, new a(nVar2, y5Var), c0VarR, 54), c0VarR, ((i12 >> 6) & 14) | androidx.media3.exoplayer.a5.S0);
                    c0Var2 = c0VarR;
                    c0Var2.A();
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.E(1346141834);
                    c0Var2.A();
                }
                c0Var2.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
            }
            j12 = jA;
            j13 = jG;
            nVar3 = nVar2;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.g2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return j2.g(a0Var3, j12, j13, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jA = d2.f26967a.a(c0VarR, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jG = o6.g(jA, c0VarR, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i14 != 0) {
                    nVar2 = null;
                }
            } else {
                if (i13 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jA = d2.f26967a.a(c0VarR, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jG = o6.g(jA, c0VarR, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i14 != 0) {
                    nVar2 = null;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1428256508, i12, -1, "androidx.compose.material3.Badge (Badge.kt:155)");
            }
            hVar = d0.h.f268141a;
            if (nVar2 != null) {
                fH = hVar.f();
            } else {
                fH = hVar.h();
            }
            if (nVar2 != null) {
                c0VarR.E(-1051012910);
                q3VarI = cx.i(d0.h.f268141a.e(), c0VarR, 6);
                c0VarR.A();
            } else {
                c0VarR.E(-1050955529);
                q3VarI = cx.i(d0.h.f268141a.g(), c0VarR, 6);
                c0VarR.A();
            }
            androidx.compose.ui.a0 a0VarC2 = androidx.compose.foundation.v.c(androidx.compose.foundation.layout.i6.a(a0Var4, fH, fH), jA, q3VarI);
            if (nVar2 != null) {
                a0VarT = androidx.compose.foundation.layout.d5.t(androidx.compose.ui.a0.E, f29569a, 0.0f, 2, null);
            } else {
                a0VarT = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0VarB3 = a0VarC2.B2(a0VarT);
            androidx.compose.ui.layout.a1 a1VarE2 = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.m(), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarB3);
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
                c0VarR.E(1345815094);
                androidx.compose.material3.internal.k3.b(jG, la0.e(d0.h.f268141a.d(), c0VarR, 6), androidx.compose.runtime.internal.w.e(541712501, true, new a(nVar2, y5Var), c0VarR, 54), c0VarR, ((i12 >> 6) & 14) | androidx.media3.exoplayer.a5.S0);
                c0Var2 = c0VarR;
                c0Var2.A();
            } else {
                c0Var2 = c0VarR;
                c0Var2.E(1346141834);
                c0Var2.A();
            }
            c0Var2.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
        }
        j12 = jA;
        j13 = jG;
        nVar3 = nVar2;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.g2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j2.g(a0Var3, j12, j13, nVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(androidx.compose.ui.a0 a0Var, long j10, long j11, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        f(a0Var, j10, j11, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x0130  */
    /* JADX WARN: Code duplicated, block: B:66:0x013c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x016d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x022a  */
    /* JADX WARN: Code duplicated, block: B:88:0x022e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0238  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void h(@NotNull final pj.n<? super androidx.compose.foundation.layout.c0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.ui.a0 a0Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.c0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
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
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1693825945);
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
                    androidx.compose.runtime.m0.A0(-1693825945, i12, -1, "androidx.compose.material3.BadgedBox (Badge.kt:67)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = b.f29577a;
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
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.e2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return j2.i(nVar, a0Var4, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                androidx.compose.runtime.m0.A0(-1693825945, i12, -1, "androidx.compose.material3.BadgedBox (Badge.kt:67)");
            }
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = b.f29577a;
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.e2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j2.i(nVar, a0Var5, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(pj.n nVar, androidx.compose.ui.a0 a0Var, pj.n nVar2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        h(nVar, a0Var, nVar2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var) {
        return androidx.compose.ui.layout.q0.a(a0Var, new pj.n() { // from class: androidx.compose.material3.f2
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return j2.k((androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 k(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(bVar.x());
        return androidx.compose.ui.layout.c1.J4(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material3.h2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j2.l((androidx.compose.ui.layout.v2) obj);
            }
        }, new Function1() { // from class: androidx.compose.material3.i2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j2.m(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.compose.ui.layout.v2 v2Var) {
        v2Var.e2(f29574f, (int) (v2Var.n().a() >> 32));
        v2Var.e2(f29573e, 0.0f);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.ui.layout.i3 n() {
        return f29574f;
    }

    public static final float o() {
        return f29572d;
    }

    @NotNull
    public static final androidx.compose.ui.layout.t p() {
        return f29573e;
    }

    public static final float q() {
        return f29570b;
    }

    public static final float r() {
        return f29569a;
    }

    public static final float s() {
        return f29571c;
    }
}
