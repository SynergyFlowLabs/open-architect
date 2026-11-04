package androidx.compose.material3;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 13 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 14 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1537:1\n75#2:1538\n75#2:1564\n1#3:1539\n1282#4,6:1540\n1282#4,6:1546\n1282#4,6:1552\n1282#4,6:1558\n1282#4,6:1568\n1282#4,6:1574\n1282#4,6:1580\n1282#4,6:1586\n1282#4,6:1633\n1282#4,6:1639\n1282#4,6:1645\n66#5:1565\n69#5:1566\n72#5:1567\n70#6:1592\n67#6,9:1593\n77#6:1632\n79#7,6:1602\n86#7,3:1617\n89#7,2:1626\n93#7:1631\n347#8,9:1608\n356#8,3:1628\n4206#9,6:1620\n85#10:1651\n117#10,2:1652\n78#11:1654\n111#11,2:1655\n78#11:1657\n111#11,2:1658\n54#12:1660\n85#13:1661\n113#14:1662\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt\n*L\n144#1:1538\n153#1:1564\n148#1:1540,6\n149#1:1546,6\n150#1:1552,6\n152#1:1558,6\n157#1:1568,6\n160#1:1574,6\n163#1:1580,6\n218#1:1586,6\n233#1:1633,6\n243#1:1639,6\n247#1:1645,6\n154#1:1565\n155#1:1566\n156#1:1567\n217#1:1592\n217#1:1593,9\n217#1:1632\n217#1:1602,6\n217#1:1617,3\n217#1:1626,2\n217#1:1631\n217#1:1608,9\n217#1:1628,3\n217#1:1620,6\n148#1:1651\n148#1:1652,2\n149#1:1654\n149#1:1655,2\n150#1:1657\n150#1:1658,2\n220#1:1660\n220#1:1661\n1536#1:1662\n*E\n"})
public final class ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f26044a = androidx.compose.ui.unit.h.r(16);

    public static final class a extends lf {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.g0 f26045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<Boolean> f26047d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f26048e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f26049f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f26050g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.z3 f26051h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<df> f26052i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f26053j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l3 f26054k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l3 f26055l;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.focus.g0 g0Var, boolean z10, androidx.compose.runtime.n3<Boolean> n3Var, String str, String str2, String str3, androidx.compose.ui.platform.z3 z3Var, androidx.compose.runtime.n3<df> n3Var2, Function1<? super Boolean, Unit> function1, androidx.compose.runtime.l3 l3Var, androidx.compose.runtime.l3 l3Var2) {
            this.f26045b = g0Var;
            this.f26046c = z10;
            this.f26047d = n3Var;
            this.f26048e = str;
            this.f26049f = str2;
            this.f26050g = str3;
            this.f26051h = z3Var;
            this.f26052i = n3Var2;
            this.f26053j = function1;
            this.f26054k = l3Var;
            this.f26055l = l3Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit A(String str, androidx.compose.runtime.n3 n3Var) {
            if (ag.G(str, ((df) n3Var.getValue()).j())) {
                n3Var.setValue(df.d(str));
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit B(androidx.compose.runtime.n3 n3Var, String str, Function1 function1, boolean z10) {
            n3Var.setValue(df.d(str));
            function1.invoke(Boolean.valueOf(!z10));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.layout.b1 y(boolean z10, androidx.compose.runtime.l3 l3Var, androidx.compose.runtime.l3 l3Var2, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
            int i10 = androidx.compose.ui.unit.c.i(bVar.x(), ag.p(l3Var));
            int iH = androidx.compose.ui.unit.c.h(bVar.x(), ag.r(l3Var2));
            int iR = z10 ? i10 : androidx.compose.ui.unit.b.r(bVar.x());
            if (!z10) {
                i10 = androidx.compose.ui.unit.b.p(bVar.x());
            }
            final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(bVar.x(), iR, i10, 0, iH, 4, null));
            return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material3.xf
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ag.a.z(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit z(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
            int i10 = 6 << 0;
            androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
            return Unit.f312394a;
        }

        @Override // androidx.compose.material3.kf
        public androidx.compose.ui.a0 n(androidx.compose.ui.a0 a0Var, final boolean z10) {
            final androidx.compose.runtime.l3 l3Var = this.f26054k;
            final androidx.compose.runtime.l3 l3Var2 = this.f26055l;
            return androidx.compose.ui.layout.q0.a(a0Var, new pj.n() { // from class: androidx.compose.material3.wf
                @Override // pj.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ag.a.y(z10, l3Var, l3Var2, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
                }
            });
        }

        @Override // androidx.compose.material3.kf
        public boolean p() {
            return this.f26047d.getValue().booleanValue();
        }

        @Override // androidx.compose.material3.kf
        public String q() {
            return this.f26052i.getValue().j();
        }

        @Override // androidx.compose.material3.kf
        public androidx.compose.ui.a0 s(androidx.compose.ui.a0 a0Var, final String str, boolean z10) {
            androidx.compose.ui.a0 a0VarC;
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.focus.j0.a(a0Var, this.f26045b);
            final androidx.compose.runtime.n3<df> n3Var = this.f26052i;
            androidx.compose.ui.a0 a0VarB2 = a0VarA.B2(new ExposedDropdownMenuAnchorElement(new Function0() { // from class: androidx.compose.material3.yf
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ag.a.A(str, n3Var);
                }
            }));
            if (z10) {
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                final boolean z11 = this.f26046c;
                final androidx.compose.runtime.n3<df> n3Var2 = this.f26052i;
                final Function1<Boolean, Unit> function1 = this.f26053j;
                a0VarC = ag.C(aVar, z11, new Function0() { // from class: androidx.compose.material3.zf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ag.a.B(n3Var2, str, function1, z11);
                    }
                }, str, this.f26047d, this.f26048e, this.f26049f, this.f26050g, this.f26051h);
            } else {
                a0VarC = androidx.compose.ui.a0.E;
            }
            return a0VarB2.B2(a0VarC);
        }
    }

    static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26057b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", i = {0}, l = {1426, 1430}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f26058a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f26059b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f26060c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f26061d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Function0<Unit> function0, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f26060c = str;
                this.f26061d = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f26060c, this.f26061d, dVar);
                aVar.f26059b = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
            
                if (r12 == r0) goto L19;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r10 = 7
                    int r1 = r11.f26058a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L29
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L15
                    kotlin.ResultKt.m(r12)
                    r7 = r11
                    r10 = 6
                    goto L6b
                L15:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r10 = 5
                    r11.<init>(r12)
                    r10 = 4
                    throw r11
                L1f:
                    r10 = 3
                    java.lang.Object r1 = r11.f26059b
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    kotlin.ResultKt.m(r12)
                    r7 = r11
                    goto L45
                L29:
                    r10 = 1
                    kotlin.ResultKt.m(r12)
                    java.lang.Object r12 = r11.f26059b
                    r4 = r12
                    r10 = 1
                    androidx.compose.ui.input.pointer.c r4 = (androidx.compose.ui.input.pointer.c) r4
                    androidx.compose.ui.input.pointer.s r6 = androidx.compose.ui.input.pointer.s.Initial
                    r11.f26059b = r4
                    r11.f26058a = r3
                    r5 = 0
                    r8 = 1
                    r9 = 0
                    r7 = r11
                    java.lang.Object r12 = androidx.compose.foundation.gestures.c5.g(r4, r5, r6, r7, r8, r9)
                    if (r12 != r0) goto L44
                    goto L69
                L44:
                    r1 = r4
                L45:
                    r10 = 1
                    androidx.compose.ui.input.pointer.c0 r12 = (androidx.compose.ui.input.pointer.c0) r12
                    java.lang.String r11 = r7.f26060c
                    r10 = 5
                    androidx.compose.material3.df$a r3 = androidx.compose.material3.df.f27099b
                    java.lang.String r3 = r3.c()
                    boolean r11 = androidx.compose.material3.df.g(r11, r3)
                    r10 = 3
                    if (r11 == 0) goto L5b
                    r12.a()
                L5b:
                    androidx.compose.ui.input.pointer.s r11 = androidx.compose.ui.input.pointer.s.Initial
                    r12 = 0
                    r10 = r12
                    r7.f26059b = r12
                    r7.f26058a = r2
                    java.lang.Object r12 = androidx.compose.foundation.gestures.c5.B(r1, r11, r7)
                    if (r12 != r0) goto L6b
                L69:
                    r10 = 6
                    return r0
                L6b:
                    androidx.compose.ui.input.pointer.c0 r12 = (androidx.compose.ui.input.pointer.c0) r12
                    r10 = 4
                    if (r12 == 0) goto L76
                    kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r7.f26061d
                    r10 = 3
                    r11.invoke()
                L76:
                    r10 = 1
                    kotlin.Unit r11 = kotlin.Unit.f312394a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ag.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        b(String str, Function0<Unit> function0) {
            this.f26056a = str;
            this.f26057b = function0;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objE = androidx.compose.foundation.gestures.e3.e(l0Var, new a(this.f26056a, this.f26057b, null), dVar);
            return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
        }
    }

    static final class c implements Function1<androidx.compose.ui.input.key.c, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<Boolean> f26065d;

        c(String str, Function0<Unit> function0, boolean z10, androidx.compose.runtime.n3<Boolean> n3Var) {
            this.f26062a = str;
            this.f26063b = function0;
            this.f26064c = z10;
            this.f26065d = n3Var;
        }

        public final Boolean c(KeyEvent keyEvent) {
            if (ag.H(keyEvent)) {
                if (!df.g(this.f26062a, df.f27099b.a())) {
                    this.f26063b.invoke();
                } else if (ag.I(keyEvent)) {
                    this.f26063b.invoke();
                    return Boolean.TRUE;
                }
            }
            if (df.g(this.f26062a, df.f27099b.a()) && this.f26064c) {
                long jA = androidx.compose.ui.input.key.e.a(keyEvent);
                androidx.compose.ui.input.key.b.a aVar = androidx.compose.ui.input.key.b.f38761b;
                if (androidx.compose.ui.input.key.b.E4(jA, aVar.y3()) || androidx.compose.ui.input.key.b.E4(androidx.compose.ui.input.key.e.a(keyEvent), aVar.r0()) || androidx.compose.ui.input.key.b.E4(androidx.compose.ui.input.key.e.a(keyEvent), aVar.w0())) {
                    androidx.compose.runtime.n3<Boolean> n3Var = this.f26065d;
                    Boolean bool = Boolean.TRUE;
                    n3Var.setValue(bool);
                    return bool;
                }
            }
            androidx.compose.runtime.n3<Boolean> n3Var2 = this.f26065d;
            Boolean bool2 = Boolean.FALSE;
            n3Var2.setValue(bool2);
            return bool2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
            return c(cVar.h());
        }
    }

    private static final int B(androidx.compose.ui.unit.s sVar, n0.j jVar, int i10) {
        if (jVar == null) {
            return 0;
        }
        int iB = sVar.B() + i10;
        int iJ = sVar.j() - i10;
        return Math.max((jVar.B() > ((float) sVar.j()) || jVar.j() < ((float) sVar.B())) ? iJ - iB : kotlin.math.b.L0(Math.max(jVar.B() - iB, iJ - jVar.j())), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.a0 C(androidx.compose.ui.a0 a0Var, final boolean z10, final Function0<Unit> function0, final String str, androidx.compose.runtime.n3<Boolean> n3Var, final String str2, final String str3, final String str4, final androidx.compose.ui.platform.z3 z3Var) {
        return androidx.compose.ui.semantics.t.f(androidx.compose.ui.input.key.f.b(androidx.compose.ui.input.pointer.w0.e(a0Var, function0, new b(str, function0)), new c(str, function0, z10, n3Var)), false, new Function1() { // from class: androidx.compose.material3.vf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ag.D(str, z10, str2, str3, str4, function0, z3Var, (androidx.compose.ui.semantics.e0) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(final String str, boolean z10, String str2, String str3, String str4, final Function0 function0, final androidx.compose.ui.platform.z3 z3Var, androidx.compose.ui.semantics.e0 e0Var) {
        if (df.g(str, df.f27099b.c())) {
            androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.a());
            if (!z10) {
                str2 = str3;
            }
            androidx.compose.ui.semantics.b0.R1(e0Var, str2);
            androidx.compose.ui.semantics.b0.v1(e0Var, str4);
        } else {
            androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.d());
        }
        androidx.compose.ui.semantics.b0.Q0(e0Var, null, new Function0() { // from class: androidx.compose.material3.pf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ag.E(function0, str, z3Var));
            }
        }, 1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(Function0 function0, String str, androidx.compose.ui.platform.z3 z3Var) {
        function0.invoke();
        if (df.g(str, df.f27099b.a()) && z3Var != null) {
            z3Var.a();
        }
        return true;
    }

    private static final n0.j F(androidx.compose.ui.layout.g0 g0Var) {
        return (g0Var == null || !g0Var.I()) ? n0.j.f332705e.a() : n0.k.c(androidx.compose.ui.layout.h0.g(g0Var), androidx.compose.ui.unit.v.h(g0Var.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G(String str, String str2) {
        df.a aVar = df.f27099b;
        if (df.g(str, aVar.b()) || df.g(str, aVar.a())) {
            return true;
        }
        if (df.g(str, aVar.c())) {
            return df.g(str2, aVar.c());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(KeyEvent keyEvent) {
        if (androidx.compose.ui.input.key.d.g(androidx.compose.ui.input.key.e.b(keyEvent), androidx.compose.ui.input.key.d.f38913b.b())) {
            return I(keyEvent) || androidx.compose.ui.input.key.b.E4(androidx.compose.ui.input.key.e.a(keyEvent), androidx.compose.ui.input.key.b.f38761b.m3());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I(KeyEvent keyEvent) {
        long jA = androidx.compose.ui.input.key.e.a(keyEvent);
        androidx.compose.ui.input.key.b.a aVar = androidx.compose.ui.input.key.b.f38761b;
        return androidx.compose.ui.input.key.b.E4(jA, aVar.q0()) || androidx.compose.ui.input.key.b.E4(jA, aVar.E0()) || androidx.compose.ui.input.key.b.E4(jA, aVar.s2());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0245  */
    /* JADX WARN: Code duplicated, block: B:103:0x0251  */
    /* JADX WARN: Code duplicated, block: B:104:0x0255  */
    /* JADX WARN: Code duplicated, block: B:109:0x0284  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:119:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:130:0x030f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0314  */
    /* JADX WARN: Code duplicated, block: B:136:0x0321  */
    /* JADX WARN: Code duplicated, block: B:139:0x0335  */
    /* JADX WARN: Code duplicated, block: B:141:0x033a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0346  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:67:0x0102  */
    /* JADX WARN: Code duplicated, block: B:70:0x0140  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:74:0x0162  */
    /* JADX WARN: Code duplicated, block: B:75:0x0172  */
    /* JADX WARN: Code duplicated, block: B:78:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x017e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0187  */
    /* JADX WARN: Code duplicated, block: B:83:0x018a  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:97:0x0204  */
    @androidx.compose.runtime.o
    @af
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void h(boolean z10, @NotNull final Function1<? super Boolean, Unit> function1, @Nullable androidx.compose.ui.a0 a0Var, @NotNull pj.n<? super kf, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        final pj.n<? super kf, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        final androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        ec0 ec0VarK;
        final int iG6;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        final androidx.compose.runtime.n3 n3Var;
        Object objI1;
        androidx.compose.runtime.l3 l3Var;
        Object objI2;
        androidx.compose.runtime.l3 l3Var2;
        Object objI3;
        final androidx.compose.ui.focus.g0 g0Var;
        androidx.compose.ui.platform.z3 z3Var;
        String strB;
        String strB2;
        String strB3;
        Object objI4;
        androidx.compose.runtime.n3 n3Var2;
        Object objI5;
        androidx.compose.runtime.n3 n3Var3;
        int i14;
        boolean z12;
        int i15;
        boolean z13;
        boolean zD;
        Object aVar2;
        androidx.compose.runtime.l3 l3Var3;
        final androidx.compose.runtime.l3 l3Var4;
        final ec0 ec0Var;
        boolean zK0;
        Object objI6;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        boolean z14;
        Object objI7;
        boolean z15;
        Object objI8;
        boolean zK1;
        Object objI9;
        final boolean z16 = z10;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1597265892);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z16) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function1) ? 32 : 16;
        }
        int i16 = i11 & 4;
        if (i16 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c0VarR.k0(nVar)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 1171) != 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1597265892, i12, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:141)");
                }
                ec0VarK = gg.k(c0VarR, 0);
                androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
                iG6 = dVar.g6(bk.n());
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                    c0VarR.Y(objI0);
                }
                n3Var = (androidx.compose.runtime.n3) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.runtime.e6.b(0);
                    c0VarR.Y(objI1);
                }
                l3Var = (androidx.compose.runtime.l3) objI1;
                objI2 = c0VarR.i0();
                if (objI2 == aVar.a()) {
                    objI2 = androidx.compose.runtime.e6.b(0);
                    c0VarR.Y(objI2);
                }
                l3Var2 = (androidx.compose.runtime.l3) objI2;
                objI3 = c0VarR.i0();
                if (objI3 == aVar.a()) {
                    objI3 = new androidx.compose.ui.focus.g0();
                    c0VarR.Y(objI3);
                }
                g0Var = (androidx.compose.ui.focus.g0) objI3;
                z3Var = (androidx.compose.ui.platform.z3) c0VarR.W(androidx.compose.ui.platform.q1.y());
                androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.M), c0VarR, 0);
                strB2 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.L), c0VarR, 0);
                strB3 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.N), c0VarR, 0);
                objI4 = c0VarR.i0();
                if (objI4 == aVar.a()) {
                    objI4 = androidx.compose.runtime.d7.g(df.d(df.f27099b.b()), null, 2, null);
                    c0VarR.Y(objI4);
                }
                n3Var2 = (androidx.compose.runtime.n3) objI4;
                objI5 = c0VarR.i0();
                if (objI5 == aVar.a()) {
                    objI5 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI5);
                }
                n3Var3 = (androidx.compose.runtime.n3) objI5;
                i14 = i12 & 14;
                if (i14 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i15 = i12 & com.planner5d.library.engine.input.f.b.B;
                if (i15 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zD = c0VarR.D(dVar) | z12 | z13 | c0VarR.D(ec0VarK);
                Object objI10 = c0VarR.i0();
                if (!zD || objI10 == aVar.a()) {
                    l3Var3 = l3Var;
                    l3Var4 = l3Var2;
                    ec0Var = ec0VarK;
                    aVar2 = new a(g0Var, z10, n3Var3, strB, strB2, strB3, z3Var, n3Var2, function1, l3Var3, l3Var4);
                    g0Var = g0Var;
                    z16 = z10;
                    c0VarR.Y(aVar2);
                } else {
                    z16 = z10;
                    l3Var3 = l3Var;
                    ec0Var = ec0VarK;
                    aVar2 = objI10;
                    l3Var4 = l3Var2;
                }
                a aVar4 = (a) aVar2;
                zK0 = c0VarR.k0(ec0Var) | c0VarR.K(iG6);
                objI6 = c0VarR.i0();
                if (zK0 || objI6 == aVar.a()) {
                    final androidx.compose.runtime.l3 l3Var5 = l3Var3;
                    final androidx.compose.runtime.l3 l3Var6 = l3Var4;
                    final ec0 ec0Var2 = ec0Var;
                    objI6 = new Function1() { // from class: androidx.compose.material3.qf
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ag.i(ec0Var2, iG6, n3Var, l3Var5, l3Var6, (androidx.compose.ui.layout.g0) obj);
                        }
                    };
                    c0VarR.Y(objI6);
                }
                androidx.compose.ui.a0 a0VarA = androidx.compose.ui.layout.q1.a(a0Var4, (Function1) objI6);
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarA);
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar5.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar5.g());
                function2B = aVar5.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar5.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                nVar2 = nVar;
                nVar2.invoke(aVar4, c0VarR, Integer.valueOf((i12 >> 6) & com.planner5d.library.engine.input.f.b.B));
                c0VarR.o();
                if (z16) {
                    c0VarR.E(209894723);
                    zK1 = c0VarR.k0(ec0Var) | c0VarR.K(iG6);
                    objI9 = c0VarR.i0();
                    if (zK1 || objI9 == aVar.a()) {
                        objI9 = new Function0() { // from class: androidx.compose.material3.rf
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ag.j(ec0Var, iG6, n3Var, l3Var4);
                            }
                        };
                        c0VarR.Y(objI9);
                    }
                    gg.d((Function0) objI9, c0VarR, 0);
                    c0VarR.A();
                } else {
                    c0VarR.E(210228190);
                    c0VarR.A();
                }
                if (i14 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI7 = c0VarR.i0();
                if (z14 || objI7 == aVar.a()) {
                    objI7 = new Function0() { // from class: androidx.compose.material3.sf
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ag.l(z16, g0Var);
                        }
                    };
                    c0VarR.Y(objI7);
                }
                androidx.compose.runtime.b2.m((Function0) objI7, c0VarR, 0);
                if (i15 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objI8 = c0VarR.i0();
                if (z15 || objI8 == aVar.a()) {
                    objI8 = new Function0() { // from class: androidx.compose.material3.tf
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ag.m(function1);
                        }
                    };
                    c0VarR.Y(objI8);
                }
                androidx.compose.material3.internal.n0.c(z16, (Function0) objI8, c0VarR, i14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                nVar2 = nVar;
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ag.n(z16, function1, a0Var3, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c0VarR.k0(nVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i12 & 1)) {
            if (i16 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1597265892, i12, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:141)");
            }
            ec0VarK = gg.k(c0VarR, 0);
            androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            iG6 = dVar2.g6(bk.n());
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.d7.g(null, null, 2, null);
                c0VarR.Y(objI0);
            }
            n3Var = (androidx.compose.runtime.n3) objI0;
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = androidx.compose.runtime.e6.b(0);
                c0VarR.Y(objI1);
            }
            l3Var = (androidx.compose.runtime.l3) objI1;
            objI2 = c0VarR.i0();
            if (objI2 == aVar.a()) {
                objI2 = androidx.compose.runtime.e6.b(0);
                c0VarR.Y(objI2);
            }
            l3Var2 = (androidx.compose.runtime.l3) objI2;
            objI3 = c0VarR.i0();
            if (objI3 == aVar.a()) {
                objI3 = new androidx.compose.ui.focus.g0();
                c0VarR.Y(objI3);
            }
            g0Var = (androidx.compose.ui.focus.g0) objI3;
            z3Var = (androidx.compose.ui.platform.z3) c0VarR.W(androidx.compose.ui.platform.q1.y());
            androidx.compose.material3.internal.l3.a aVar6 = androidx.compose.material3.internal.l3.f29010b;
            strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.M), c0VarR, 0);
            strB2 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.L), c0VarR, 0);
            strB3 = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.N), c0VarR, 0);
            objI4 = c0VarR.i0();
            if (objI4 == aVar.a()) {
                objI4 = androidx.compose.runtime.d7.g(df.d(df.f27099b.b()), null, 2, null);
                c0VarR.Y(objI4);
            }
            n3Var2 = (androidx.compose.runtime.n3) objI4;
            objI5 = c0VarR.i0();
            if (objI5 == aVar.a()) {
                objI5 = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
                c0VarR.Y(objI5);
            }
            n3Var3 = (androidx.compose.runtime.n3) objI5;
            i14 = i12 & 14;
            if (i14 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            i15 = i12 & com.planner5d.library.engine.input.f.b.B;
            if (i15 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            zD = c0VarR.D(dVar2) | z12 | z13 | c0VarR.D(ec0VarK);
            Object objI11 = c0VarR.i0();
            if (zD) {
                l3Var3 = l3Var;
                l3Var4 = l3Var2;
                ec0Var = ec0VarK;
                aVar2 = new a(g0Var, z10, n3Var3, strB, strB2, strB3, z3Var, n3Var2, function1, l3Var3, l3Var4);
                g0Var = g0Var;
                z16 = z10;
                c0VarR.Y(aVar2);
            } else {
                l3Var3 = l3Var;
                l3Var4 = l3Var2;
                ec0Var = ec0VarK;
                aVar2 = new a(g0Var, z10, n3Var3, strB, strB2, strB3, z3Var, n3Var2, function1, l3Var3, l3Var4);
                g0Var = g0Var;
                z16 = z10;
                c0VarR.Y(aVar2);
            }
            a aVar7 = (a) aVar2;
            zK0 = c0VarR.k0(ec0Var) | c0VarR.K(iG6);
            objI6 = c0VarR.i0();
            if (zK0) {
                final androidx.compose.runtime.l3 l3Var7 = l3Var3;
                final androidx.compose.runtime.l3 l3Var8 = l3Var4;
                final ec0 ec0Var3 = ec0Var;
                objI6 = new Function1() { // from class: androidx.compose.material3.qf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ag.i(ec0Var3, iG6, n3Var, l3Var7, l3Var8, (androidx.compose.ui.layout.g0) obj);
                    }
                };
                c0VarR.Y(objI6);
            } else {
                final androidx.compose.runtime.l3 l3Var9 = l3Var3;
                final androidx.compose.runtime.l3 l3Var10 = l3Var4;
                final ec0 ec0Var4 = ec0Var;
                objI6 = new Function1() { // from class: androidx.compose.material3.qf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ag.i(ec0Var4, iG6, n3Var, l3Var9, l3Var10, (androidx.compose.ui.layout.g0) obj);
                    }
                };
                c0VarR.Y(objI6);
            }
            androidx.compose.ui.a0 a0VarA2 = androidx.compose.ui.layout.q1.a(a0Var4, (Function1) objI6);
            androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarA2);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK2, aVar8.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK2, aVar8.g());
            function2B = aVar8.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar8.f());
            androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
            nVar2 = nVar;
            nVar2.invoke(aVar7, c0VarR, Integer.valueOf((i12 >> 6) & com.planner5d.library.engine.input.f.b.B));
            c0VarR.o();
            if (z16) {
                c0VarR.E(209894723);
                zK1 = c0VarR.k0(ec0Var) | c0VarR.K(iG6);
                objI9 = c0VarR.i0();
                if (zK1) {
                    objI9 = new Function0() { // from class: androidx.compose.material3.rf
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ag.j(ec0Var, iG6, n3Var, l3Var4);
                        }
                    };
                    c0VarR.Y(objI9);
                } else {
                    objI9 = new Function0() { // from class: androidx.compose.material3.rf
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ag.j(ec0Var, iG6, n3Var, l3Var4);
                        }
                    };
                    c0VarR.Y(objI9);
                }
                gg.d((Function0) objI9, c0VarR, 0);
                c0VarR.A();
            } else {
                c0VarR.E(210228190);
                c0VarR.A();
            }
            if (i14 == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            objI7 = c0VarR.i0();
            if (z14) {
                objI7 = new Function0() { // from class: androidx.compose.material3.sf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ag.l(z16, g0Var);
                    }
                };
                c0VarR.Y(objI7);
            } else {
                objI7 = new Function0() { // from class: androidx.compose.material3.sf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ag.l(z16, g0Var);
                    }
                };
                c0VarR.Y(objI7);
            }
            androidx.compose.runtime.b2.m((Function0) objI7, c0VarR, 0);
            if (i15 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            objI8 = c0VarR.i0();
            if (z15) {
                objI8 = new Function0() { // from class: androidx.compose.material3.tf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ag.m(function1);
                    }
                };
                c0VarR.Y(objI8);
            } else {
                objI8 = new Function0() { // from class: androidx.compose.material3.tf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ag.m(function1);
                    }
                };
                c0VarR.Y(objI8);
            }
            androidx.compose.material3.internal.n0.c(z16, (Function0) objI8, c0VarR, i14, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
        } else {
            nVar2 = nVar;
            c0VarR.u();
            a0Var3 = a0Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.uf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ag.n(z16, function1, a0Var3, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(ec0 ec0Var, int i10, androidx.compose.runtime.n3 n3Var, androidx.compose.runtime.l3 l3Var, androidx.compose.runtime.l3 l3Var2, androidx.compose.ui.layout.g0 g0Var) {
        o(n3Var, g0Var);
        q(l3Var, (int) (g0Var.a() >> 32));
        s(l3Var2, B(ec0Var.a(), F(k(n3Var)), i10));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(ec0 ec0Var, int i10, androidx.compose.runtime.n3 n3Var, androidx.compose.runtime.l3 l3Var) {
        s(l3Var, B(ec0Var.a(), F(k(n3Var)), i10));
        return Unit.f312394a;
    }

    private static final androidx.compose.ui.layout.g0 k(androidx.compose.runtime.n3<androidx.compose.ui.layout.g0> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(boolean z10, androidx.compose.ui.focus.g0 g0Var) {
        if (z10) {
            int i10 = 2 | 0;
            androidx.compose.ui.focus.g0.k(g0Var, 0, 1, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(boolean z10, Function1 function1, androidx.compose.ui.a0 a0Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        h(z10, function1, a0Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final void o(androidx.compose.runtime.n3<androidx.compose.ui.layout.g0> n3Var, androidx.compose.ui.layout.g0 g0Var) {
        n3Var.setValue(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(androidx.compose.runtime.l3 l3Var) {
        return l3Var.m1();
    }

    private static final void q(androidx.compose.runtime.l3 l3Var, int i10) {
        l3Var.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(androidx.compose.runtime.l3 l3Var) {
        return l3Var.m1();
    }

    private static final void s(androidx.compose.runtime.l3 l3Var, int i10) {
        l3Var.j(i10);
    }

    @kotlin.l(message = "Renamed to ExposedDropdownMenuAnchorType", replaceWith = @kotlin.b1(expression = "ExposedDropdownMenuAnchorType", imports = {}))
    public static /* synthetic */ void t() {
    }
}
