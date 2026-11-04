package androidx.compose.material3;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAppBarRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarRow.kt\nandroidx/compose/material3/AppBarRowKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,100:1\n1282#2,6:101\n1282#2,6:107\n1282#2,6:113\n1247#2,6:124\n165#3,5:119\n79#3,6:130\n86#3,3:145\n89#3,2:154\n93#3:159\n171#3:160\n347#4,9:136\n356#4,3:156\n4206#5,6:148\n85#6:161\n*S KotlinDebug\n*F\n+ 1 AppBarRow.kt\nandroidx/compose/material3/AppBarRowKt\n*L\n59#1:101,6\n62#1:107,6\n65#1:113,6\n69#1:124,6\n69#1:119,5\n69#1:130,6\n69#1:145,3\n69#1:154,2\n69#1:159\n69#1:160\n69#1:136,9\n69#1:156,3\n69#1:148,6\n59#1:161\n*E\n"})
public final class w1 {

    @SourceDebugExtension({"SMAP\nAppBarRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarRow.kt\nandroidx/compose/material3/AppBarRowKt$AppBarRow$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,100:1\n34#2,6:101\n*S KotlinDebug\n*F\n+ 1 AppBarRow.kt\nandroidx/compose/material3/AppBarRowKt$AppBarRow$1\n*L\n72#1:101,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<z1> f34047a;

        a(androidx.compose.runtime.n7<z1> n7Var) {
            this.f34047a = n7Var;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(68955781, i10, -1, "androidx.compose.material3.AppBarRow.<anonymous> (AppBarRow.kt:71)");
            }
            List<b0> listA = w1.e(this.f34047a).a();
            int size = listA.size();
            for (int i11 = 0; i11 < size; i11++) {
                listA.get(i11).b(c0Var, 0);
            }
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

    @SourceDebugExtension({"SMAP\nAppBarRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarRow.kt\nandroidx/compose/material3/AppBarRowKt$AppBarRow$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,100:1\n70#2:101\n66#2,10:102\n77#2:148\n79#3,6:112\n86#3,3:127\n89#3,2:136\n93#3:147\n347#4,9:118\n356#4:138\n357#4,2:145\n4206#5,6:130\n1282#6,6:139\n*S KotlinDebug\n*F\n+ 1 AppBarRow.kt\nandroidx/compose/material3/AppBarRowKt$AppBarRow$2\n*L\n74#1:101\n74#1:102,10\n74#1:148\n74#1:112,6\n74#1:127,3\n74#1:136,2\n74#1:147\n74#1:118,9\n74#1:138\n74#1:145,2\n74#1:130,6\n78#1:139,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<p1, androidx.compose.runtime.c0, Integer, Unit> f34048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p1 f34049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q1 f34050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<z1> f34051d;

        @SourceDebugExtension({"SMAP\nAppBarRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarRow.kt\nandroidx/compose/material3/AppBarRowKt$AppBarRow$2$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,100:1\n34#2,6:101\n*S KotlinDebug\n*F\n+ 1 AppBarRow.kt\nandroidx/compose/material3/AppBarRowKt$AppBarRow$2$1$2\n*L\n85#1:101,6\n*E\n"})
        static final class a implements pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q1 f34052a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<z1> f34053b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p1 f34054c;

            a(q1 q1Var, androidx.compose.runtime.n7<z1> n7Var, p1 p1Var) {
                this.f34052a = q1Var;
                this.f34053b = n7Var;
                this.f34054c = p1Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 17) != 16, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1786124721, i10, -1, "androidx.compose.material3.AppBarRow.<anonymous>.<anonymous>.<anonymous> (AppBarRow.kt:79)");
                }
                List<b0> listSubList = w1.e(this.f34053b).a().subList(this.f34052a.d(), this.f34052a.a());
                p1 p1Var = this.f34054c;
                int size = listSubList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    listSubList.get(i11).a(p1Var, c0Var, 6);
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
                c(m0Var, c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(pj.n<? super p1, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, p1 p1Var, q1 q1Var, androidx.compose.runtime.n7<z1> n7Var) {
            this.f34048a = nVar;
            this.f34049b = p1Var;
            this.f34050c = q1Var;
            this.f34051d = n7Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(p1 p1Var) {
            p1Var.a();
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-815780026, i10, -1, "androidx.compose.material3.AppBarRow.<anonymous> (AppBarRow.kt:73)");
            }
            pj.n<p1, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f34048a;
            final p1 p1Var = this.f34049b;
            q1 q1Var = this.f34050c;
            androidx.compose.runtime.n7<z1> n7Var = this.f34051d;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            nVar.invoke(p1Var, c0Var, 6);
            boolean zB = p1Var.b();
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.x1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w1.b.f(p1Var);
                    }
                };
                c0Var.Y(objI0);
            }
            r.h(zB, (Function0) objI0, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(1786124721, true, new a(q1Var, n7Var, p1Var), c0Var, 54), c0Var, 48, 48, 2044);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:76:0x0138  */
    /* JADX WARN: Code duplicated, block: B:78:0x013e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0161  */
    /* JADX WARN: Code duplicated, block: B:84:0x016d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0171  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190  */
    /* JADX WARN: Code duplicated, block: B:90:0x019e  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d4  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void c(@NotNull final pj.n<? super p1, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.ui.a0 a0Var, int i10, @NotNull final Function1<? super y1, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        androidx.compose.ui.a0 a0Var3;
        final int i18;
        androidx.compose.runtime.s5 s5VarT;
        final androidx.compose.runtime.n7 n7VarW;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        Object objI1;
        q1 q1VarB;
        boolean z11;
        boolean z12;
        Object objI2;
        fr frVar;
        boolean zD;
        Object objI3;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1891322548);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.k0(nVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i19 = i12 & 2;
        if (i19 == 0) {
            if ((i11 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    i15 = i10;
                    if (c0VarR.K(i15)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i13 |= i16;
                }
                if ((i12 & 8) != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    if (c0VarR.k0(function1)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i13 & 1171) != 1170) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    if (i19 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1891322548, i13, -1, "androidx.compose.material3.AppBarRow (AppBarRow.kt:56)");
                    }
                    n7VarW = androidx.compose.runtime.w6.w(function1, c0VarR, (i13 >> 9) & 14);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material3.u1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return w1.d(n7VarW);
                            }
                        });
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.runtime.n7 n7Var = (androidx.compose.runtime.n7) objI0;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new p1();
                        c0VarR.Y(objI1);
                    }
                    p1 p1Var = (p1) objI1;
                    q1VarB = a0.b(c0VarR, 0);
                    boolean zD2 = c0VarR.D(q1VarB);
                    if ((i13 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | zD2;
                    objI2 = c0VarR.i0();
                    if (z12 || objI2 == aVar.a()) {
                        objI2 = new fr(q1VarB, i15, false);
                        c0VarR.Y(objI2);
                    }
                    frVar = (fr) objI2;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2E = androidx.compose.ui.layout.n0.e(CollectionsKt.listOf((Object[]) new Function2[]{androidx.compose.runtime.internal.w.e(68955781, true, new a(n7Var), c0VarR, 54), androidx.compose.runtime.internal.w.e(-815780026, true, new b(nVar, p1Var, q1VarB, n7Var), c0VarR, 54)}));
                    zD = c0VarR.D(frVar);
                    objI3 = c0VarR.i0();
                    if (zD || objI3 == aVar.a()) {
                        objI3 = androidx.compose.ui.layout.j1.a(frVar);
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI3;
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                    androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar2.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
                    function2B = aVar2.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
                    function2E.invoke(c0VarR, 0);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                }
                i18 = i15;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var4 = a0Var3;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.v1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return w1.f(nVar, a0Var4, i18, function1, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.media3.exoplayer.a5.S0;
            i15 = i10;
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if (c0VarR.k0(function1)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((i13 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i14 != 0) {
                    i15 = Integer.MAX_VALUE;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1891322548, i13, -1, "androidx.compose.material3.AppBarRow (AppBarRow.kt:56)");
                }
                n7VarW = androidx.compose.runtime.w6.w(function1, c0VarR, (i13 >> 9) & 14);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material3.u1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return w1.d(n7VarW);
                        }
                    });
                    c0VarR.Y(objI0);
                }
                androidx.compose.runtime.n7 n7Var2 = (androidx.compose.runtime.n7) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new p1();
                    c0VarR.Y(objI1);
                }
                p1 p1Var2 = (p1) objI1;
                q1VarB = a0.b(c0VarR, 0);
                boolean zD3 = c0VarR.D(q1VarB);
                if ((i13 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | zD3;
                objI2 = c0VarR.i0();
                if (z12) {
                    objI2 = new fr(q1VarB, i15, false);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new fr(q1VarB, i15, false);
                    c0VarR.Y(objI2);
                }
                frVar = (fr) objI2;
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2E2 = androidx.compose.ui.layout.n0.e(CollectionsKt.listOf((Object[]) new Function2[]{androidx.compose.runtime.internal.w.e(68955781, true, new a(n7Var2), c0VarR, 54), androidx.compose.runtime.internal.w.e(-815780026, true, new b(nVar, p1Var2, q1VarB, n7Var2), c0VarR, 54)}));
                zD = c0VarR.D(frVar);
                objI3 = c0VarR.i0();
                if (zD) {
                    objI3 = androidx.compose.ui.layout.j1.a(frVar);
                    c0VarR.Y(objI3);
                } else {
                    objI3 = androidx.compose.ui.layout.j1.a(frVar);
                    c0VarR.Y(objI3);
                }
                androidx.compose.ui.layout.a1 a1Var2 = (androidx.compose.ui.layout.a1) objI3;
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                androidx.compose.runtime.y7.n(c0VarD, a1Var2, aVar3.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK2, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar3.f());
                function2E2.invoke(c0VarR, 0);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            i18 = i15;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var5 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.v1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return w1.f(nVar, a0Var5, i18, function1, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                i15 = i10;
                if (c0VarR.K(i15)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i13 |= i16;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if (c0VarR.k0(function1)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((i13 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                if (i19 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i14 != 0) {
                    i15 = Integer.MAX_VALUE;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1891322548, i13, -1, "androidx.compose.material3.AppBarRow (AppBarRow.kt:56)");
                }
                n7VarW = androidx.compose.runtime.w6.w(function1, c0VarR, (i13 >> 9) & 14);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material3.u1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return w1.d(n7VarW);
                        }
                    });
                    c0VarR.Y(objI0);
                }
                androidx.compose.runtime.n7 n7Var3 = (androidx.compose.runtime.n7) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new p1();
                    c0VarR.Y(objI1);
                }
                p1 p1Var3 = (p1) objI1;
                q1VarB = a0.b(c0VarR, 0);
                boolean zD4 = c0VarR.D(q1VarB);
                if ((i13 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | zD4;
                objI2 = c0VarR.i0();
                if (z12) {
                    objI2 = new fr(q1VarB, i15, false);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new fr(q1VarB, i15, false);
                    c0VarR.Y(objI2);
                }
                frVar = (fr) objI2;
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2E3 = androidx.compose.ui.layout.n0.e(CollectionsKt.listOf((Object[]) new Function2[]{androidx.compose.runtime.internal.w.e(68955781, true, new a(n7Var3), c0VarR, 54), androidx.compose.runtime.internal.w.e(-815780026, true, new b(nVar, p1Var3, q1VarB, n7Var3), c0VarR, 54)}));
                zD = c0VarR.D(frVar);
                objI3 = c0VarR.i0();
                if (zD) {
                    objI3 = androidx.compose.ui.layout.j1.a(frVar);
                    c0VarR.Y(objI3);
                } else {
                    objI3 = androidx.compose.ui.layout.j1.a(frVar);
                    c0VarR.Y(objI3);
                }
                androidx.compose.ui.layout.a1 a1Var3 = (androidx.compose.ui.layout.a1) objI3;
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                androidx.compose.runtime.y7.n(c0VarD, a1Var3, aVar4.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK3, aVar4.g());
                function2B = aVar4.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN3, aVar4.f());
                function2E3.invoke(c0VarR, 0);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            i18 = i15;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var6 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.v1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return w1.f(nVar, a0Var6, i18, function1, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        i15 = i10;
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            if (c0VarR.k0(function1)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i13 |= i17;
        }
        if ((i13 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            if (i19 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i14 != 0) {
                i15 = Integer.MAX_VALUE;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1891322548, i13, -1, "androidx.compose.material3.AppBarRow (AppBarRow.kt:56)");
            }
            n7VarW = androidx.compose.runtime.w6.w(function1, c0VarR, (i13 >> 9) & 14);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material3.u1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w1.d(n7VarW);
                    }
                });
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.n7 n7Var4 = (androidx.compose.runtime.n7) objI0;
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new p1();
                c0VarR.Y(objI1);
            }
            p1 p1Var4 = (p1) objI1;
            q1VarB = a0.b(c0VarR, 0);
            boolean zD5 = c0VarR.D(q1VarB);
            if ((i13 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | zD5;
            objI2 = c0VarR.i0();
            if (z12) {
                objI2 = new fr(q1VarB, i15, false);
                c0VarR.Y(objI2);
            } else {
                objI2 = new fr(q1VarB, i15, false);
                c0VarR.Y(objI2);
            }
            frVar = (fr) objI2;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2E4 = androidx.compose.ui.layout.n0.e(CollectionsKt.listOf((Object[]) new Function2[]{androidx.compose.runtime.internal.w.e(68955781, true, new a(n7Var4), c0VarR, 54), androidx.compose.runtime.internal.w.e(-815780026, true, new b(nVar, p1Var4, q1VarB, n7Var4), c0VarR, 54)}));
            zD = c0VarR.D(frVar);
            objI3 = c0VarR.i0();
            if (zD) {
                objI3 = androidx.compose.ui.layout.j1.a(frVar);
                c0VarR.Y(objI3);
            } else {
                objI3 = androidx.compose.ui.layout.j1.a(frVar);
                c0VarR.Y(objI3);
            }
            androidx.compose.ui.layout.a1 a1Var4 = (androidx.compose.ui.layout.a1) objI3;
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
            androidx.compose.runtime.y7.n(c0VarD, a1Var4, aVar5.e());
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
            function2E4.invoke(c0VarR, 0);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
        }
        i18 = i15;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var7 = a0Var3;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.v1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w1.f(nVar, a0Var7, i18, function1, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z1 d(androidx.compose.runtime.n7 n7Var) {
        z1 z1Var = new z1(new b2());
        ((Function1) n7Var.getValue()).invoke(z1Var);
        return z1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z1 e(androidx.compose.runtime.n7<z1> n7Var) {
        return n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(pj.n nVar, androidx.compose.ui.a0 a0Var, int i10, Function1 function1, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        c(nVar, a0Var, i10, function1, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }
}
