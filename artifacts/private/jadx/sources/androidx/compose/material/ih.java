package androidx.compose.material;

import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,227:1\n1282#2,6:228\n1282#2,6:234\n1282#2,6:240\n113#3:246\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt\n*L\n135#1:228,6\n137#1:234,6\n161#1:240,6\n226#1:246\n*E\n"})
public final class ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f23151a = androidx.compose.ui.unit.h.r(56);

    @SourceDebugExtension({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt$SwipeToDismiss$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,227:1\n75#2:228\n1282#3,6:229\n1282#3,6:313\n70#4:235\n67#4,9:236\n77#4:363\n79#5,6:245\n86#5,3:260\n89#5,2:269\n79#5,6:282\n86#5,3:297\n89#5,2:306\n93#5:311\n79#5,6:329\n86#5,3:344\n89#5,2:353\n93#5:358\n93#5:362\n347#6,9:251\n356#6:271\n347#6,9:288\n356#6,3:308\n347#6,9:335\n356#6,3:355\n357#6,2:360\n4206#7,6:263\n4206#7,6:300\n4206#7,6:347\n99#8:272\n96#8,9:273\n106#8:312\n99#8:319\n96#8,9:320\n106#8:359\n32#9:364\n80#10:365\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt$SwipeToDismiss$2\n*L\n169#1:228\n175#1:229,6\n201#1:313,6\n182#1:235\n182#1:236,9\n182#1:363\n182#1:245,6\n182#1:260,3\n182#1:269,2\n198#1:282,6\n198#1:297,3\n198#1:306,2\n198#1:311\n199#1:329,6\n199#1:344,3\n199#1:353,2\n199#1:358\n182#1:362\n182#1:251,9\n182#1:271\n198#1:288,9\n198#1:308,3\n199#1:335,9\n199#1:355,3\n182#1:360,2\n182#1:263,6\n198#1:300,6\n199#1:347,6\n198#1:272\n198#1:273,9\n198#1:312\n199#1:319\n199#1:320,9\n199#1:359\n201#1:364\n201#1:365\n*E\n"})
    static final class a implements pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set<n5> f23152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<n5, zk> f23153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r5 f23154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f23155d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f23156e;

        /* JADX WARN: Multi-variable type inference failed */
        a(Set<? extends n5> set, Function1<? super n5, ? extends zk> function1, r5 r5Var, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2) {
            this.f23152a = set;
            this.f23153b = function1;
            this.f23154c = r5Var;
            this.f23155d = nVar;
            this.f23156e = nVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zk i(Function1 function1, s5 s5Var, s5 s5Var2) {
            n5 n5VarI = ih.i(s5Var, s5Var2);
            Intrinsics.checkNotNull(n5VarI);
            return (zk) function1.invoke(n5VarI);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.unit.q k(r5 r5Var, androidx.compose.ui.unit.d dVar) {
            return androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f((((long) kotlin.math.b.L0(r5Var.z().getValue().floatValue())) << 32) | (((long) 0) & com.rabbitmq.client.k0.f265952a)));
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void f(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.foundation.layout.h0 h0Var2;
            int i11;
            if ((i10 & 6) == 0) {
                h0Var2 = h0Var;
                i11 = i10 | (c0Var.D(h0Var2) ? 4 : 2);
            } else {
                h0Var2 = h0Var;
                i11 = i10;
            }
            if (!c0Var.h((i11 & 19) != 18, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1281726977, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:167)");
            }
            float fP = androidx.compose.ui.unit.b.p(h0Var2.h());
            boolean z10 = c0Var.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl;
            Float fValueOf = Float.valueOf(0.0f);
            s5 s5Var = s5.Default;
            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, s5Var));
            Set<n5> set = this.f23152a;
            n5 n5Var = n5.StartToEnd;
            if (set.contains(n5Var)) {
                Pair pair = TuplesKt.to(Float.valueOf(fP), s5.DismissedToEnd);
                mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
            }
            Set<n5> set2 = this.f23152a;
            n5 n5Var2 = n5.EndToStart;
            if (set2.contains(n5Var2)) {
                Pair pair2 = TuplesKt.to(Float.valueOf(-fP), s5.DismissedToStart);
                mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
            }
            boolean zD = c0Var.D(this.f23153b);
            final Function1<n5, zk> function1 = this.f23153b;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function2() { // from class: androidx.compose.material.gh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ih.a.i(function1, (s5) obj, (s5) obj2);
                    }
                };
                c0Var.Y(objI0);
            }
            Function2 function2 = (Function2) objI0;
            float f10 = this.f23152a.contains(n5Var2) ? 10.0f : 20.0f;
            float f11 = this.f23152a.contains(n5Var) ? 10.0f : 20.0f;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarT = ph.t(aVar, this.f23154c, mapMutableMapOf, androidx.compose.foundation.gestures.q3.Horizontal, (288 & 8) != 0 ? true : this.f23154c.t() == s5Var, (288 & 16) != 0 ? false : z10, (288 & 32) != 0 ? null : null, (288 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.oh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ph.v(obj, obj2);
                }
            } : function2, (288 & 128) != 0 ? jh.d(jh.f23346a, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new sd(fP, f10, f11), (288 & 256) != 0 ? jh.f23346a.b() : 0.0f);
            pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f23155d;
            final r5 r5Var = this.f23154c;
            pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> nVar2 = this.f23156e;
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarT);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.ui.a0 a0VarJ = androidx.compose.foundation.layout.d0.f15956a.j(aVar);
            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(qVar.w(), aVar2.w(), c0Var, 0);
            int iJ2 = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0Var.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, a0VarJ);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A2);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarE, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar3.f());
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            nVar.invoke(y5Var, c0Var, 6);
            c0Var.o();
            boolean zD2 = c0Var.D(r5Var);
            Object objI1 = c0Var.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material.hh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ih.a.k(r5Var, (androidx.compose.ui.unit.d) obj);
                    }
                };
                c0Var.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarJ2 = androidx.compose.foundation.layout.s4.j(aVar, (Function1) objI1);
            androidx.compose.ui.layout.a1 a1VarE2 = androidx.compose.foundation.layout.u5.e(qVar.w(), aVar2.w(), c0Var, 0);
            int iJ3 = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK3 = c0Var.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var, a0VarJ2);
            Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A3);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD3 = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD3, a1VarE2, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD3, b1VarK3, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iJ3))) {
                c0VarD3.Y(Integer.valueOf(iJ3));
                c0VarD3.f(Integer.valueOf(iJ3), function2B3);
            }
            androidx.compose.runtime.y7.n(c0VarD3, a0VarN3, aVar3.f());
            nVar2.invoke(y5Var, c0Var, 6);
            c0Var.o();
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            f(h0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x010b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0114  */
    /* JADX WARN: Code duplicated, block: B:91:0x0147  */
    /* JADX WARN: Code duplicated, block: B:93:0x014f  */
    /* JADX WARN: Code duplicated, block: B:96:0x015c  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @u7
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void e(@NotNull final r5 r5Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Set<? extends n5> set, @Nullable Function1<? super n5, ? extends zk> function1, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        r5 r5Var2;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        Set<? extends n5> set2;
        int i14;
        int i15;
        Function1<? super n5, ? extends zk> function2;
        int i16;
        pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3;
        int i17;
        pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar4;
        int i18;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final Set<? extends n5> set3;
        final Function1<? super n5, ? extends zk> function3;
        androidx.compose.runtime.s5 s5VarT;
        int i19;
        androidx.compose.ui.a0 a0Var4;
        Set<? extends n5> of2;
        boolean z11;
        Function1<? super n5, ? extends zk> function4;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-9746411);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            r5Var2 = r5Var;
        } else if ((i10 & 6) == 0) {
            r5Var2 = r5Var;
            i12 = (c0VarR.D(r5Var2) ? 4 : 2) | i10;
        } else {
            r5Var2 = r5Var;
            i12 = i10;
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
                    set2 = set;
                    if (c0VarR.k0(set2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        function2 = function1;
                        if (c0VarR.k0(function2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 16) != 0) {
                        if ((i10 & 24576) == 0) {
                            nVar3 = nVar;
                            if (c0VarR.k0(nVar3)) {
                                i17 = 16384;
                            } else {
                                i17 = 8192;
                            }
                            i12 |= i17;
                        }
                        if ((i11 & 32) != 0) {
                            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                                nVar4 = nVar2;
                                if (c0VarR.k0(nVar4)) {
                                    i18 = 131072;
                                } else {
                                    i18 = 65536;
                                }
                                i12 |= i18;
                            }
                            if ((74899 & i12) != 74898) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c0VarR.h(z10, i12 & 1)) {
                                if (i20 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                    i19 = i15;
                                } else {
                                    i19 = i15;
                                    a0Var4 = a0Var2;
                                }
                                if (i13 != 0) {
                                    of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                                } else {
                                    of2 = set2;
                                }
                                if (i19 != 0) {
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = new Function1() { // from class: androidx.compose.material.eh
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return ih.f((n5) obj);
                                            }
                                        };
                                        c0VarR.Y(objI0);
                                    }
                                    function4 = (Function1) objI0;
                                    z11 = true;
                                } else {
                                    z11 = true;
                                    function4 = function2;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                                }
                                Set<? extends n5> set4 = of2;
                                androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                set3 = set4;
                                a0Var3 = a0Var4;
                                function3 = function4;
                            } else {
                                c0VarR.u();
                                a0Var3 = a0Var2;
                                set3 = set2;
                                function3 = function2;
                            }
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        nVar4 = nVar2;
                        if ((74899 & i12) != 74898) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                                i19 = i15;
                            } else {
                                i19 = i15;
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                            } else {
                                of2 = set2;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material.eh
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return ih.f((n5) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                                z11 = true;
                            } else {
                                z11 = true;
                                function4 = function2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                            }
                            Set<? extends n5> set5 = of2;
                            androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            set3 = set5;
                            a0Var3 = a0Var4;
                            function3 = function4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            set3 = set2;
                            function3 = function2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 24576;
                    nVar3 = nVar;
                    if ((i11 & 32) != 0) {
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            nVar4 = nVar2;
                            if (c0VarR.k0(nVar4)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((74899 & i12) != 74898) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                                i19 = i15;
                            } else {
                                i19 = i15;
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                            } else {
                                of2 = set2;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material.eh
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return ih.f((n5) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                                z11 = true;
                            } else {
                                z11 = true;
                                function4 = function2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                            }
                            Set<? extends n5> set6 = of2;
                            androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            set3 = set6;
                            a0Var3 = a0Var4;
                            function3 = function4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            set3 = set2;
                            function3 = function2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar4 = nVar2;
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i19 = i15;
                        } else {
                            i19 = i15;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                        } else {
                            of2 = set2;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.eh
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ih.f((n5) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                            z11 = true;
                        } else {
                            z11 = true;
                            function4 = function2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                        }
                        Set<? extends n5> set7 = of2;
                        androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        set3 = set7;
                        a0Var3 = a0Var4;
                        function3 = function4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        set3 = set2;
                        function3 = function2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                function2 = function1;
                if ((i11 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        nVar3 = nVar;
                        if (c0VarR.k0(nVar3)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            nVar4 = nVar2;
                            if (c0VarR.k0(nVar4)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((74899 & i12) != 74898) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                                i19 = i15;
                            } else {
                                i19 = i15;
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                            } else {
                                of2 = set2;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material.eh
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return ih.f((n5) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                                z11 = true;
                            } else {
                                z11 = true;
                                function4 = function2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                            }
                            Set<? extends n5> set8 = of2;
                            androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            set3 = set8;
                            a0Var3 = a0Var4;
                            function3 = function4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            set3 = set2;
                            function3 = function2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar4 = nVar2;
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i19 = i15;
                        } else {
                            i19 = i15;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                        } else {
                            of2 = set2;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.eh
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ih.f((n5) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                            z11 = true;
                        } else {
                            z11 = true;
                            function4 = function2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                        }
                        Set<? extends n5> set9 = of2;
                        androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        set3 = set9;
                        a0Var3 = a0Var4;
                        function3 = function4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        set3 = set2;
                        function3 = function2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                nVar3 = nVar;
                if ((i11 & 32) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        nVar4 = nVar2;
                        if (c0VarR.k0(nVar4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i19 = i15;
                        } else {
                            i19 = i15;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                        } else {
                            of2 = set2;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.eh
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ih.f((n5) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                            z11 = true;
                        } else {
                            z11 = true;
                            function4 = function2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                        }
                        Set<? extends n5> set10 = of2;
                        androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        set3 = set10;
                        a0Var3 = a0Var4;
                        function3 = function4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        set3 = set2;
                        function3 = function2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar4 = nVar2;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i19 = i15;
                    } else {
                        i19 = i15;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                    } else {
                        of2 = set2;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.eh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ih.f((n5) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                        z11 = true;
                    } else {
                        z11 = true;
                        function4 = function2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                    }
                    Set<? extends n5> set11 = of2;
                    androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    set3 = set11;
                    a0Var3 = a0Var4;
                    function3 = function4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    set3 = set2;
                    function3 = function2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            set2 = set;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    function2 = function1;
                    if (c0VarR.k0(function2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        nVar3 = nVar;
                        if (c0VarR.k0(nVar3)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            nVar4 = nVar2;
                            if (c0VarR.k0(nVar4)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((74899 & i12) != 74898) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                                i19 = i15;
                            } else {
                                i19 = i15;
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                            } else {
                                of2 = set2;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material.eh
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return ih.f((n5) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                                z11 = true;
                            } else {
                                z11 = true;
                                function4 = function2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                            }
                            Set<? extends n5> set12 = of2;
                            androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            set3 = set12;
                            a0Var3 = a0Var4;
                            function3 = function4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            set3 = set2;
                            function3 = function2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar4 = nVar2;
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i19 = i15;
                        } else {
                            i19 = i15;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                        } else {
                            of2 = set2;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.eh
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ih.f((n5) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                            z11 = true;
                        } else {
                            z11 = true;
                            function4 = function2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                        }
                        Set<? extends n5> set13 = of2;
                        androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        set3 = set13;
                        a0Var3 = a0Var4;
                        function3 = function4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        set3 = set2;
                        function3 = function2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                nVar3 = nVar;
                if ((i11 & 32) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        nVar4 = nVar2;
                        if (c0VarR.k0(nVar4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i19 = i15;
                        } else {
                            i19 = i15;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                        } else {
                            of2 = set2;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.eh
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ih.f((n5) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                            z11 = true;
                        } else {
                            z11 = true;
                            function4 = function2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                        }
                        Set<? extends n5> set14 = of2;
                        androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        set3 = set14;
                        a0Var3 = a0Var4;
                        function3 = function4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        set3 = set2;
                        function3 = function2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar4 = nVar2;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i19 = i15;
                    } else {
                        i19 = i15;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                    } else {
                        of2 = set2;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.eh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ih.f((n5) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                        z11 = true;
                    } else {
                        z11 = true;
                        function4 = function2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                    }
                    Set<? extends n5> set15 = of2;
                    androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    set3 = set15;
                    a0Var3 = a0Var4;
                    function3 = function4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    set3 = set2;
                    function3 = function2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            function2 = function1;
            if ((i11 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    nVar3 = nVar;
                    if (c0VarR.k0(nVar3)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        nVar4 = nVar2;
                        if (c0VarR.k0(nVar4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i19 = i15;
                        } else {
                            i19 = i15;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                        } else {
                            of2 = set2;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.eh
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ih.f((n5) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                            z11 = true;
                        } else {
                            z11 = true;
                            function4 = function2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                        }
                        Set<? extends n5> set16 = of2;
                        androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        set3 = set16;
                        a0Var3 = a0Var4;
                        function3 = function4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        set3 = set2;
                        function3 = function2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar4 = nVar2;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i19 = i15;
                    } else {
                        i19 = i15;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                    } else {
                        of2 = set2;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.eh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ih.f((n5) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                        z11 = true;
                    } else {
                        z11 = true;
                        function4 = function2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                    }
                    Set<? extends n5> set17 = of2;
                    androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    set3 = set17;
                    a0Var3 = a0Var4;
                    function3 = function4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    set3 = set2;
                    function3 = function2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            nVar3 = nVar;
            if ((i11 & 32) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    nVar4 = nVar2;
                    if (c0VarR.k0(nVar4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i19 = i15;
                    } else {
                        i19 = i15;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                    } else {
                        of2 = set2;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.eh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ih.f((n5) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                        z11 = true;
                    } else {
                        z11 = true;
                        function4 = function2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                    }
                    Set<? extends n5> set18 = of2;
                    androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    set3 = set18;
                    a0Var3 = a0Var4;
                    function3 = function4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    set3 = set2;
                    function3 = function2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar4 = nVar2;
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i19 = i15;
                } else {
                    i19 = i15;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                } else {
                    of2 = set2;
                }
                if (i19 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.eh
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ih.f((n5) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    function4 = (Function1) objI0;
                    z11 = true;
                } else {
                    z11 = true;
                    function4 = function2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                }
                Set<? extends n5> set19 = of2;
                androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                set3 = set19;
                a0Var3 = a0Var4;
                function3 = function4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                set3 = set2;
                function3 = function2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                set2 = set;
                if (c0VarR.k0(set2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    function2 = function1;
                    if (c0VarR.k0(function2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        nVar3 = nVar;
                        if (c0VarR.k0(nVar3)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            nVar4 = nVar2;
                            if (c0VarR.k0(nVar4)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((74899 & i12) != 74898) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                                i19 = i15;
                            } else {
                                i19 = i15;
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                            } else {
                                of2 = set2;
                            }
                            if (i19 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material.eh
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return ih.f((n5) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                function4 = (Function1) objI0;
                                z11 = true;
                            } else {
                                z11 = true;
                                function4 = function2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                            }
                            Set<? extends n5> set110 = of2;
                            androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            set3 = set110;
                            a0Var3 = a0Var4;
                            function3 = function4;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            set3 = set2;
                            function3 = function2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    nVar4 = nVar2;
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i19 = i15;
                        } else {
                            i19 = i15;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                        } else {
                            of2 = set2;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.eh
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ih.f((n5) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                            z11 = true;
                        } else {
                            z11 = true;
                            function4 = function2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                        }
                        Set<? extends n5> set111 = of2;
                        androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        set3 = set111;
                        a0Var3 = a0Var4;
                        function3 = function4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        set3 = set2;
                        function3 = function2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                nVar3 = nVar;
                if ((i11 & 32) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        nVar4 = nVar2;
                        if (c0VarR.k0(nVar4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i19 = i15;
                        } else {
                            i19 = i15;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                        } else {
                            of2 = set2;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.eh
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ih.f((n5) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                            z11 = true;
                        } else {
                            z11 = true;
                            function4 = function2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                        }
                        Set<? extends n5> set112 = of2;
                        androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        set3 = set112;
                        a0Var3 = a0Var4;
                        function3 = function4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        set3 = set2;
                        function3 = function2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar4 = nVar2;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i19 = i15;
                    } else {
                        i19 = i15;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                    } else {
                        of2 = set2;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.eh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ih.f((n5) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                        z11 = true;
                    } else {
                        z11 = true;
                        function4 = function2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                    }
                    Set<? extends n5> set113 = of2;
                    androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    set3 = set113;
                    a0Var3 = a0Var4;
                    function3 = function4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    set3 = set2;
                    function3 = function2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            function2 = function1;
            if ((i11 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    nVar3 = nVar;
                    if (c0VarR.k0(nVar3)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        nVar4 = nVar2;
                        if (c0VarR.k0(nVar4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i19 = i15;
                        } else {
                            i19 = i15;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                        } else {
                            of2 = set2;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.eh
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ih.f((n5) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                            z11 = true;
                        } else {
                            z11 = true;
                            function4 = function2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                        }
                        Set<? extends n5> set114 = of2;
                        androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        set3 = set114;
                        a0Var3 = a0Var4;
                        function3 = function4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        set3 = set2;
                        function3 = function2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar4 = nVar2;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i19 = i15;
                    } else {
                        i19 = i15;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                    } else {
                        of2 = set2;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.eh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ih.f((n5) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                        z11 = true;
                    } else {
                        z11 = true;
                        function4 = function2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                    }
                    Set<? extends n5> set115 = of2;
                    androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    set3 = set115;
                    a0Var3 = a0Var4;
                    function3 = function4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    set3 = set2;
                    function3 = function2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            nVar3 = nVar;
            if ((i11 & 32) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    nVar4 = nVar2;
                    if (c0VarR.k0(nVar4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i19 = i15;
                    } else {
                        i19 = i15;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                    } else {
                        of2 = set2;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.eh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ih.f((n5) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                        z11 = true;
                    } else {
                        z11 = true;
                        function4 = function2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                    }
                    Set<? extends n5> set116 = of2;
                    androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    set3 = set116;
                    a0Var3 = a0Var4;
                    function3 = function4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    set3 = set2;
                    function3 = function2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar4 = nVar2;
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i19 = i15;
                } else {
                    i19 = i15;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                } else {
                    of2 = set2;
                }
                if (i19 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.eh
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ih.f((n5) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    function4 = (Function1) objI0;
                    z11 = true;
                } else {
                    z11 = true;
                    function4 = function2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                }
                Set<? extends n5> set117 = of2;
                androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                set3 = set117;
                a0Var3 = a0Var4;
                function3 = function4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                set3 = set2;
                function3 = function2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        set2 = set;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                function2 = function1;
                if (c0VarR.k0(function2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i11 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    nVar3 = nVar;
                    if (c0VarR.k0(nVar3)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        nVar4 = nVar2;
                        if (c0VarR.k0(nVar4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                            i19 = i15;
                        } else {
                            i19 = i15;
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                        } else {
                            of2 = set2;
                        }
                        if (i19 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.eh
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ih.f((n5) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            function4 = (Function1) objI0;
                            z11 = true;
                        } else {
                            z11 = true;
                            function4 = function2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                        }
                        Set<? extends n5> set118 = of2;
                        androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        set3 = set118;
                        a0Var3 = a0Var4;
                        function3 = function4;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        set3 = set2;
                        function3 = function2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVar4 = nVar2;
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i19 = i15;
                    } else {
                        i19 = i15;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                    } else {
                        of2 = set2;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.eh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ih.f((n5) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                        z11 = true;
                    } else {
                        z11 = true;
                        function4 = function2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                    }
                    Set<? extends n5> set119 = of2;
                    androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    set3 = set119;
                    a0Var3 = a0Var4;
                    function3 = function4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    set3 = set2;
                    function3 = function2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            nVar3 = nVar;
            if ((i11 & 32) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    nVar4 = nVar2;
                    if (c0VarR.k0(nVar4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i19 = i15;
                    } else {
                        i19 = i15;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                    } else {
                        of2 = set2;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.eh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ih.f((n5) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                        z11 = true;
                    } else {
                        z11 = true;
                        function4 = function2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                    }
                    Set<? extends n5> set1110 = of2;
                    androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    set3 = set1110;
                    a0Var3 = a0Var4;
                    function3 = function4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    set3 = set2;
                    function3 = function2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar4 = nVar2;
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i19 = i15;
                } else {
                    i19 = i15;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                } else {
                    of2 = set2;
                }
                if (i19 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.eh
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ih.f((n5) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    function4 = (Function1) objI0;
                    z11 = true;
                } else {
                    z11 = true;
                    function4 = function2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                }
                Set<? extends n5> set1111 = of2;
                androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                set3 = set1111;
                a0Var3 = a0Var4;
                function3 = function4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                set3 = set2;
                function3 = function2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        function2 = function1;
        if ((i11 & 16) != 0) {
            if ((i10 & 24576) == 0) {
                nVar3 = nVar;
                if (c0VarR.k0(nVar3)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i11 & 32) != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    nVar4 = nVar2;
                    if (c0VarR.k0(nVar4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                        i19 = i15;
                    } else {
                        i19 = i15;
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                    } else {
                        of2 = set2;
                    }
                    if (i19 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.eh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ih.f((n5) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function4 = (Function1) objI0;
                        z11 = true;
                    } else {
                        z11 = true;
                        function4 = function2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                    }
                    Set<? extends n5> set1112 = of2;
                    androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    set3 = set1112;
                    a0Var3 = a0Var4;
                    function3 = function4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    set3 = set2;
                    function3 = function2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar4 = nVar2;
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i19 = i15;
                } else {
                    i19 = i15;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                } else {
                    of2 = set2;
                }
                if (i19 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.eh
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ih.f((n5) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    function4 = (Function1) objI0;
                    z11 = true;
                } else {
                    z11 = true;
                    function4 = function2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                }
                Set<? extends n5> set1113 = of2;
                androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                set3 = set1113;
                a0Var3 = a0Var4;
                function3 = function4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                set3 = set2;
                function3 = function2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        nVar3 = nVar;
        if ((i11 & 32) != 0) {
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                nVar4 = nVar2;
                if (c0VarR.k0(nVar4)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                    i19 = i15;
                } else {
                    i19 = i15;
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
                } else {
                    of2 = set2;
                }
                if (i19 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.eh
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ih.f((n5) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    function4 = (Function1) objI0;
                    z11 = true;
                } else {
                    z11 = true;
                    function4 = function2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                }
                Set<? extends n5> set1114 = of2;
                androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                set3 = set1114;
                a0Var3 = a0Var4;
                function3 = function4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                set3 = set2;
                function3 = function2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        nVar4 = nVar2;
        if ((74899 & i12) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i20 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
                i19 = i15;
            } else {
                i19 = i15;
                a0Var4 = a0Var2;
            }
            if (i13 != 0) {
                of2 = SetsKt.setOf((Object[]) new n5[]{n5.EndToStart, n5.StartToEnd});
            } else {
                of2 = set2;
            }
            if (i19 != 0) {
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.eh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ih.f((n5) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                function4 = (Function1) objI0;
                z11 = true;
            } else {
                z11 = true;
                function4 = function2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-9746411, i12, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
            }
            Set<? extends n5> set1115 = of2;
            androidx.compose.foundation.layout.g0.c(a0Var4, null, false, androidx.compose.runtime.internal.w.e(-1281726977, z11, new a(of2, function4, r5Var2, nVar3, nVar4), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            set3 = set1115;
            a0Var3 = a0Var4;
            function3 = function4;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            set3 = set2;
            function3 = function2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.fh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ih.g(r5Var, a0Var3, set3, function3, nVar, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t8 f(n5 n5Var) {
        return new t8(f23151a, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(r5 r5Var, androidx.compose.ui.a0 a0Var, Set set, Function1 function1, pj.n nVar, pj.n nVar2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        e(r5Var, a0Var, set, function1, nVar, nVar2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n5 i(s5 s5Var, s5 s5Var2) {
        if (s5Var == s5Var2 && s5Var == s5.Default) {
            return null;
        }
        if (s5Var == s5Var2 && s5Var == s5.DismissedToEnd) {
            return n5.StartToEnd;
        }
        if (s5Var == s5Var2 && s5Var == s5.DismissedToStart) {
            return n5.EndToStart;
        }
        s5 s5Var3 = s5.Default;
        if (s5Var == s5Var3 && s5Var2 == s5.DismissedToEnd) {
            return n5.StartToEnd;
        }
        if (s5Var == s5Var3 && s5Var2 == s5.DismissedToStart) {
            return n5.EndToStart;
        }
        if (s5Var == s5.DismissedToEnd && s5Var2 == s5Var3) {
            return n5.StartToEnd;
        }
        if (s5Var == s5.DismissedToStart && s5Var2 == s5Var3) {
            return n5.EndToStart;
        }
        return null;
    }

    @androidx.compose.runtime.o
    @u7
    @NotNull
    public static final r5 j(@Nullable final s5 s5Var, @Nullable final Function1<? super s5, Boolean> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            s5Var = s5.Default;
        }
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.ch
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ih.k((s5) obj));
                    }
                };
                c0Var.Y(objI0);
            }
            function1 = (Function1) objI0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1753522702, i10, -1, "androidx.compose.material.rememberDismissState (SwipeToDismiss.kt:135)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<r5, s5> c0VarC = r5.f24624s.c(function1);
        boolean z10 = true;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && c0Var.K(s5Var.ordinal())) || (i10 & 6) == 4;
        if ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.D(function1)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function0() { // from class: androidx.compose.material.dh
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ih.l(s5Var, function1);
                }
            };
            c0Var.Y(objI1);
        }
        r5 r5Var = (r5) androidx.compose.runtime.saveable.i.j(objArr, c0VarC, (Function0) objI1, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(s5 s5Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r5 l(s5 s5Var, Function1 function1) {
        return new r5(s5Var, function1);
    }
}
