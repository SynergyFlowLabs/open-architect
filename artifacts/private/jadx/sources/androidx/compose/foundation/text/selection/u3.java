package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.b8;
import androidx.compose.foundation.text.i5;
import androidx.compose.foundation.text.k5;
import androidx.compose.foundation.text.n5;
import androidx.compose.foundation.text.x6;
import androidx.compose.foundation.text.x7;
import androidx.compose.foundation.text.y6;
import androidx.compose.runtime.d7;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,1348:1\n85#2:1349\n117#2,2:1350\n85#2:1352\n117#2,2:1353\n85#2:1355\n117#2,2:1356\n85#2:1358\n117#2,2:1359\n85#2:1361\n117#2,2:1362\n1#3:1364\n30#4:1365\n30#4:1376\n30#4:1383\n53#5,3:1366\n53#5,3:1377\n70#5:1381\n53#5,3:1384\n70#5:1388\n60#5:1391\n60#5:1394\n70#5:1397\n604#6,7:1369\n69#7:1380\n69#7:1387\n65#7:1390\n65#7:1393\n69#7:1396\n22#8:1382\n22#8:1389\n22#8:1392\n22#8:1395\n22#8:1398\n113#9:1399\n85#10,5:1400\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n141#1:1349\n141#1:1350,2\n144#1:1352\n144#1:1353,2\n172#1:1355\n172#1:1356,2\n176#1:1358\n176#1:1359,2\n208#1:1361\n208#1:1362,2\n936#1:1365\n1088#1:1376\n1098#1:1383\n936#1:1366,3\n1088#1:1377,3\n1093#1:1381\n1098#1:1384,3\n1103#1:1388\n1105#1:1391\n1106#1:1394\n1109#1:1397\n956#1:1369,7\n1093#1:1380\n1103#1:1387\n1105#1:1390\n1106#1:1393\n1109#1:1396\n1093#1:1382\n1103#1:1389\n1105#1:1392\n1106#1:1395\n1109#1:1398\n1109#1:1399\n233#1:1400,5\n*E\n"})
public final class u3 {
    public static final int D = 8;

    @NotNull
    private final k5 A;

    @NotNull
    private final r B;
    private boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final x7 f21391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.input.m0 f21392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.text.input.y0, Unit> f21393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.text.g4 f21394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<androidx.compose.ui.text.input.y0> f21395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.input.j1 f21396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f21397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.platform.m1 f21398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.s0 f21399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private x f21400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.platform.e4 f21401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private p0.a f21402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.focus.g0 f21403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f21406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.text.w3 f21407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f21408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21409s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21410t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f21411u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.input.y0 f21412v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private o1 f21413w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.text.w3 f21414x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21415y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.text.contextmenu.modifier.o f21416z;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1", f = "TextFieldSelectionManager.kt", i = {}, l = {218, 219}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21417a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return u3.this.new a(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (r6.w0(r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r4 = 7
                int r1 = r5.f21417a
                r2 = 2
                r3 = 1
                r4 = 2
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r6)
                r4 = 7
                goto L40
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r4 = 0
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1e:
                r4 = 1
                kotlin.ResultKt.m(r6)
                r4 = 2
                goto L34
            L24:
                kotlin.ResultKt.m(r6)
                r4 = 6
                androidx.compose.foundation.text.selection.u3 r6 = androidx.compose.foundation.text.selection.u3.this
                r4 = 7
                r5.f21417a = r3
                java.lang.Object r6 = r6.a1(r5)
                if (r6 != r0) goto L34
                goto L3f
            L34:
                androidx.compose.foundation.text.selection.u3 r6 = androidx.compose.foundation.text.selection.u3.this
                r5.f21417a = r2
                r4 = 6
                java.lang.Object r5 = androidx.compose.foundation.text.selection.u3.j(r6, r5)
                if (r5 != r0) goto L40
            L3f:
                return r0
            L40:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.u3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2", f = "TextFieldSelectionManager.kt", i = {}, l = {225, 226}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21419a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return u3.this.new b(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            if (r6.w0(r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r4 = 1
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f21419a
                r4 = 3
                r2 = 2
                r4 = 5
                r3 = 1
                r4 = 6
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L16
                kotlin.ResultKt.m(r6)
                goto L3d
            L16:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r4 = 3
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1f:
                kotlin.ResultKt.m(r6)
                goto L32
            L23:
                kotlin.ResultKt.m(r6)
                androidx.compose.foundation.text.selection.u3 r6 = androidx.compose.foundation.text.selection.u3.this
                r5.f21419a = r3
                java.lang.Object r6 = r6.a1(r5)
                r4 = 6
                if (r6 != r0) goto L32
                goto L3c
            L32:
                androidx.compose.foundation.text.selection.u3 r6 = androidx.compose.foundation.text.selection.u3.this
                r5.f21419a = r2
                java.lang.Object r6 = androidx.compose.foundation.text.selection.u3.j(r6, r5)
                if (r6 != r0) goto L3d
            L3c:
                return r0
            L3d:
                r4 = 1
                androidx.compose.foundation.text.selection.u3 r5 = androidx.compose.foundation.text.selection.u3.this
                r5.U0(r3)
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.u3.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$3", f = "TextFieldSelectionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21421a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return u3.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21421a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            u3.this.U0(false);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", i = {}, l = {816}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21423a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f21425c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f21425c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u3.this.new d(this.f21425c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21423a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (androidx.compose.ui.text.w3.h(u3.this.p0().l())) {
                    return Unit.f312394a;
                }
                androidx.compose.ui.platform.m1 m1VarL = u3.this.L();
                if (m1VarL != null) {
                    androidx.compose.ui.platform.k1 k1VarF = androidx.compose.foundation.internal.b.f(androidx.compose.ui.text.input.z0.a(u3.this.p0()));
                    this.f21423a = 1;
                    if (m1VarL.c(k1VarF, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            if (!this.f21425c) {
                return Unit.f312394a;
            }
            int iK = androidx.compose.ui.text.w3.k(u3.this.p0().l());
            u3 u3Var = u3.this;
            androidx.compose.ui.text.input.y0 y0VarC = u3Var.C(u3Var.p0().j(), androidx.compose.ui.text.x3.b(iK, iK));
            u3.this.c0().invoke(y0VarC);
            u3.this.M0(androidx.compose.ui.text.w3.b(y0VarC.l()));
            u3.this.K0(androidx.compose.foundation.text.l3.None);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class e implements k5 {
        e() {
        }

        @Override // androidx.compose.foundation.text.k5
        public void a() {
            u3.this.G0(null);
            u3.this.E0(null);
        }

        @Override // androidx.compose.foundation.text.k5
        public void b(long j10) {
        }

        @Override // androidx.compose.foundation.text.k5
        public void c(long j10) {
            y6 y6VarN;
            p0.a aVarX;
            u3 u3Var = u3.this;
            u3Var.f21408r = n0.g.w(u3Var.f21408r, j10);
            androidx.compose.foundation.text.g4 g4VarF0 = u3.this.f0();
            if (g4VarF0 != null && (y6VarN = g4VarF0.n()) != null) {
                u3 u3Var2 = u3.this;
                u3Var2.E0(n0.g.d(n0.g.w(u3Var2.f21406p, u3Var2.f21408r)));
                androidx.compose.ui.text.input.m0 m0VarB0 = u3Var2.b0();
                n0.g gVarP = u3Var2.P();
                Intrinsics.checkNotNull(gVarP);
                int iA = m0VarB0.a(y6.h(y6VarN, gVarP.B(), false, 2, null));
                long jB = androidx.compose.ui.text.x3.b(iA, iA);
                if (!androidx.compose.ui.text.w3.g(jB, u3Var2.p0().l())) {
                    androidx.compose.foundation.text.g4 g4VarF1 = u3Var2.f0();
                    if ((g4VarF1 == null || g4VarF1.D()) && (aVarX = u3Var2.X()) != null) {
                        aVarX.a(p0.b.f340720b.j());
                    }
                    u3Var2.c0().invoke(u3Var2.C(u3Var2.p0().j(), jB));
                    u3Var2.M0(androidx.compose.ui.text.w3.b(jB));
                }
            }
        }

        @Override // androidx.compose.foundation.text.k5
        public void d(long j10) {
            y6 y6VarN;
            long jA = m1.a(u3.this.W(true));
            androidx.compose.foundation.text.g4 g4VarF0 = u3.this.f0();
            if (g4VarF0 != null && (y6VarN = g4VarF0.n()) != null) {
                long jN = y6VarN.n(jA);
                u3.this.f21406p = jN;
                u3.this.E0(n0.g.d(jN));
                u3.this.f21408r = n0.g.f332700b.e();
                u3.this.G0(androidx.compose.foundation.text.k3.Cursor);
                u3.this.b1(false);
            }
        }

        @Override // androidx.compose.foundation.text.k5
        public void e() {
            u3.this.G0(null);
            u3.this.E0(null);
        }

        @Override // androidx.compose.foundation.text.k5
        public void onCancel() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$cut$1", f = "TextFieldSelectionManager.kt", i = {}, l = {872}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21427a;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u3.this.new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21427a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (androidx.compose.ui.text.w3.h(u3.this.p0().l())) {
                    return Unit.f312394a;
                }
                androidx.compose.ui.platform.m1 m1VarL = u3.this.L();
                if (m1VarL != null) {
                    androidx.compose.ui.platform.k1 k1VarF = androidx.compose.foundation.internal.b.f(androidx.compose.ui.text.input.z0.a(u3.this.p0()));
                    this.f21427a = 1;
                    if (m1VarL.c(k1VarF, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            androidx.compose.ui.text.f fVarT = androidx.compose.ui.text.input.z0.c(u3.this.p0(), u3.this.p0().m().length()).t(androidx.compose.ui.text.input.z0.b(u3.this.p0(), u3.this.p0().m().length()));
            int iL = androidx.compose.ui.text.w3.l(u3.this.p0().l());
            androidx.compose.ui.text.input.y0 y0VarC = u3.this.C(fVarT, androidx.compose.ui.text.x3.b(iL, iL));
            u3.this.c0().invoke(y0VarC);
            u3.this.M0(androidx.compose.ui.text.w3.b(y0VarC.l()));
            u3.this.K0(androidx.compose.foundation.text.l3.None);
            x7 x7VarO0 = u3.this.o0();
            if (x7VarO0 != null) {
                x7VarO0.a();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class g implements k5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f21430b;

        g(boolean z10) {
            this.f21430b = z10;
        }

        @Override // androidx.compose.foundation.text.k5
        public void a() {
            u3.this.G0(null);
            u3.this.E0(null);
            u3.this.b1(true);
        }

        @Override // androidx.compose.foundation.text.k5
        public void b(long j10) {
            y6 y6VarN;
            u3.this.G0(this.f21430b ? androidx.compose.foundation.text.k3.SelectionStart : androidx.compose.foundation.text.k3.SelectionEnd);
            long jA = m1.a(u3.this.W(this.f21430b));
            androidx.compose.foundation.text.g4 g4VarF0 = u3.this.f0();
            if (g4VarF0 != null && (y6VarN = g4VarF0.n()) != null) {
                long jN = y6VarN.n(jA);
                u3.this.f21406p = jN;
                u3.this.E0(n0.g.d(jN));
                u3.this.f21408r = n0.g.f332700b.e();
                u3.this.f21411u = -1;
                androidx.compose.foundation.text.g4 g4VarF1 = u3.this.f0();
                if (g4VarF1 != null) {
                    g4VarF1.N(true);
                }
                u3.this.b1(false);
            }
        }

        @Override // androidx.compose.foundation.text.k5
        public void c(long j10) {
            u3 u3Var = u3.this;
            u3Var.f21408r = n0.g.w(u3Var.f21408r, j10);
            u3 u3Var2 = u3.this;
            u3Var2.E0(n0.g.d(n0.g.w(u3Var2.f21406p, u3.this.f21408r)));
            u3 u3Var3 = u3.this;
            androidx.compose.ui.text.input.y0 y0VarP0 = u3Var3.p0();
            n0.g gVarP = u3.this.P();
            Intrinsics.checkNotNull(gVarP);
            u3Var3.c1(y0VarP0, gVarP.B(), false, this.f21430b, n0.f21271a.l(), true);
            u3.this.b1(false);
        }

        @Override // androidx.compose.foundation.text.k5
        public void d(long j10) {
        }

        @Override // androidx.compose.foundation.text.k5
        public void e() {
            u3.this.G0(null);
            u3.this.E0(null);
            u3.this.b1(true);
        }

        @Override // androidx.compose.foundation.text.k5
        public void onCancel() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", f = "TextFieldSelectionManager.kt", i = {}, l = {539}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f21432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f21434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.w3 f21435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u3 f21436f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.m0 f21437g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(x xVar, String str, long j10, androidx.compose.ui.text.w3 w3Var, u3 u3Var, androidx.compose.ui.text.input.m0 m0Var, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f21432b = xVar;
            this.f21433c = str;
            this.f21434d = j10;
            this.f21435e = w3Var;
            this.f21436f = u3Var;
            this.f21437g = m0Var;
            int i10 = 3 >> 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(this.f21432b, this.f21433c, this.f21434d, this.f21435e, this.f21436f, this.f21437g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21431a;
            if (i10 == 0) {
                ResultKt.m(obj);
                x xVar = this.f21432b;
                String str = this.f21433c;
                long j10 = this.f21434d;
                this.f21431a = 1;
                obj = xVar.b(str, j10, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            androidx.compose.ui.text.w3 w3Var = (androidx.compose.ui.text.w3) obj;
            if (w3Var == null) {
                return Unit.f312394a;
            }
            androidx.compose.ui.text.input.m0 m0Var = this.f21437g;
            long jR = w3Var.r();
            long jB = androidx.compose.ui.text.x3.b(m0Var.a(androidx.compose.ui.text.w3.n(jR)), m0Var.a(androidx.compose.ui.text.w3.i(jR)));
            if (!androidx.compose.ui.text.w3.f(jB, this.f21435e) && Intrinsics.areEqual(this.f21436f.p0().m(), this.f21433c) && this.f21437g == this.f21436f.b0()) {
                Function1<androidx.compose.ui.text.input.y0, Unit> function1C0 = this.f21436f.c0();
                u3 u3Var = this.f21436f;
                function1C0.invoke(u3Var.C(u3Var.p0().j(), jB));
                this.f21436f.M0(androidx.compose.ui.text.w3.b(jB));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class i implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f21438a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.compose.ui.text.w3 f21439b;

        i() {
        }

        @Override // androidx.compose.foundation.text.selection.r
        public boolean a(long j10, n0 n0Var) {
            androidx.compose.foundation.text.g4 g4VarF0;
            if (u3.this.T() && u3.this.p0().m().length() != 0 && (g4VarF0 = u3.this.f0()) != null && g4VarF0.n() != null) {
                int i10 = 2 & 0;
                j(u3.this.p0(), j10, false, n0Var);
                return true;
            }
            return false;
        }

        @Override // androidx.compose.foundation.text.selection.r
        public boolean b(long j10, n0 n0Var, int i10) {
            androidx.compose.foundation.text.g4 g4VarF0;
            if (u3.this.T() && u3.this.p0().m().length() != 0 && (g4VarF0 = u3.this.f0()) != null && g4VarF0.n() != null) {
                androidx.compose.ui.focus.g0 g0VarU = u3.this.U();
                if (g0VarU != null) {
                    androidx.compose.ui.focus.g0.k(g0VarU, 0, 1, null);
                }
                u3.this.f21406p = j10;
                u3.this.f21411u = -1;
                u3.I(u3.this, false, 1, null);
                long j11 = j(u3.this.p0(), u3.this.f21406p, true, n0Var);
                if (i10 >= 2) {
                    this.f21438a = true;
                    this.f21439b = androidx.compose.ui.text.w3.b(j11);
                }
                return true;
            }
            return false;
        }

        @Override // androidx.compose.foundation.text.selection.r
        public void c() {
            if (this.f21438a) {
                u3.this.v0(this.f21439b);
            }
        }

        @Override // androidx.compose.foundation.text.selection.r
        public boolean d(long j10) {
            androidx.compose.foundation.text.g4 g4VarF0;
            if (!u3.this.T() || u3.this.p0().m().length() == 0 || (g4VarF0 = u3.this.f0()) == null || g4VarF0.n() == null) {
                return false;
            }
            j(u3.this.p0(), j10, false, n0.f21271a.m());
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.r
        public boolean e(long j10) {
            androidx.compose.foundation.text.g4 g4VarF0 = u3.this.f0();
            if (g4VarF0 != null && g4VarF0.n() != null && u3.this.T()) {
                u3.this.f21411u = -1;
                j(u3.this.p0(), j10, false, n0.f21271a.m());
                return true;
            }
            return false;
        }

        public final androidx.compose.ui.text.w3 f() {
            return this.f21439b;
        }

        public final boolean g() {
            return this.f21438a;
        }

        public final void h(boolean z10) {
            this.f21438a = z10;
        }

        public final void i(androidx.compose.ui.text.w3 w3Var) {
            this.f21439b = w3Var;
        }

        public final long j(androidx.compose.ui.text.input.y0 y0Var, long j10, boolean z10, n0 n0Var) {
            long jC1 = u3.this.c1(y0Var, j10, z10, false, n0Var, false);
            if (!androidx.compose.ui.text.w3.f(jC1, this.f21439b)) {
                this.f21438a = false;
            }
            u3.this.K0(androidx.compose.ui.text.w3.h(jC1) ? androidx.compose.foundation.text.l3.Cursor : androidx.compose.foundation.text.l3.Selection);
            return jC1;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager", f = "TextFieldSelectionManager.kt", i = {}, l = {783}, m = "notifyPlatformSelectionBehaviorsOnShowContextMenu", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f21441a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21443c;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21441a = obj;
            this.f21443c |= Integer.MIN_VALUE;
            return u3.this.w0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", i = {}, l = {841, 841}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21444a;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u3.this.new k(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        
            if (r6 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.u3.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1", f = "TextFieldSelectionManager.kt", i = {0, 0, 0, 0, 0, 0}, l = {992}, m = "invokeSuspend", n = {"this_$iv", "previousSnapshot$iv", "observer$iv", "newSnapshot$iv", "copy", "cut"}, s = {"L$0", "L$2", "L$3", "L$4", "L$5", "L$6"})
    @SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,1348:1\n604#2,7:1349\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1\n*L\n975#1:1349,7\n*E\n"})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f21447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f21448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f21449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f21450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f21451f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f21452g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f21453h;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1", f = "TextFieldSelectionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f21455a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u3 f21456b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u3 u3Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f21456b = u3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f21456b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f21455a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                u3.B(this.f21456b, false, 1, null);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$cut$1$1", f = "TextFieldSelectionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f21457a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u3 f21458b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(u3 u3Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f21458b = u3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f21458b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f21457a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f21458b.E();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$paste$1$1", f = "TextFieldSelectionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f21459a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u3 f21460b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(u3 u3Var, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f21460b = u3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new c(this.f21460b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f21459a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f21460b.y0();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            int i10 = 0 >> 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit A(u3 u3Var) {
            kotlinx.coroutines.s0 s0VarO = u3Var.O();
            if (s0VarO != null) {
                kotlinx.coroutines.k.f(s0VarO, null, kotlinx.coroutines.u0.UNDISPATCHED, new c(u3Var, null), 1, null);
            }
            u3Var.s0();
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit B(u3 u3Var) {
            u3Var.z0();
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit C(u3 u3Var) {
            u3Var.t();
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit y(u3 u3Var) {
            kotlinx.coroutines.s0 s0VarO = u3Var.O();
            if (s0VarO != null) {
                kotlinx.coroutines.k.f(s0VarO, null, kotlinx.coroutines.u0.UNDISPATCHED, new a(u3Var, null), 1, null);
            }
            u3Var.s0();
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit z(u3 u3Var) {
            kotlinx.coroutines.s0 s0VarO = u3Var.O();
            if (s0VarO != null) {
                kotlinx.coroutines.k.f(s0VarO, null, kotlinx.coroutines.u0.UNDISPATCHED, new b(u3Var, null), 1, null);
            }
            u3Var.s0();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u3.this.new l(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00aa A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:32:0x00a3, B:34:0x00aa, B:38:0x00bb, B:40:0x00c2, B:42:0x00cc, B:44:0x00d4, B:45:0x00da, B:47:0x00e2, B:48:0x00eb), top: B:53:0x00a3 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:40:0x00c2 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:32:0x00a3, B:34:0x00aa, B:38:0x00bb, B:40:0x00c2, B:42:0x00cc, B:44:0x00d4, B:45:0x00da, B:47:0x00e2, B:48:0x00eb), top: B:53:0x00a3 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:44:0x00d4 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:32:0x00a3, B:34:0x00aa, B:38:0x00bb, B:40:0x00c2, B:42:0x00cc, B:44:0x00d4, B:45:0x00da, B:47:0x00e2, B:48:0x00eb), top: B:53:0x00a3 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00e2 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:32:0x00a3, B:34:0x00aa, B:38:0x00bb, B:40:0x00c2, B:42:0x00cc, B:44:0x00d4, B:45:0x00da, B:47:0x00e2, B:48:0x00eb), top: B:53:0x00a3 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            androidx.compose.runtime.snapshots.m mVarG;
            Function1<Object, Unit> function1L;
            Throwable th2;
            androidx.compose.runtime.snapshots.m.a aVar;
            androidx.compose.runtime.snapshots.m mVar;
            Function0<Unit> function0;
            final u3 u3Var;
            Function0<Unit> function1;
            Function1<Object, Unit> function2;
            androidx.compose.runtime.snapshots.m mVar2;
            Function0<Unit> function3;
            Function0<Unit> function4;
            Function0<Unit> function5;
            androidx.compose.ui.platform.e4 e4VarG0;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21453h;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.runtime.snapshots.m.a aVar2 = androidx.compose.runtime.snapshots.m.f36535e;
                final u3 u3Var2 = u3.this;
                mVarG = aVar2.g();
                function1L = mVarG != null ? mVarG.l() : null;
                androidx.compose.runtime.snapshots.m mVarM = aVar2.m(mVarG);
                try {
                    Function0<Unit> function6 = u3Var2.v() ? new Function0() { // from class: androidx.compose.foundation.text.selection.v3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return u3.l.y(u3Var2);
                        }
                    } : null;
                    function0 = u3Var2.w() ? new Function0() { // from class: androidx.compose.foundation.text.selection.w3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return u3.l.z(u3Var2);
                        }
                    } : null;
                    this.f21446a = aVar2;
                    this.f21447b = u3Var2;
                    this.f21448c = mVarG;
                    this.f21449d = function1L;
                    this.f21450e = mVarM;
                    this.f21451f = function6;
                    this.f21452g = function0;
                    this.f21453h = 1;
                    if (u3Var2.a1(this) == objL) {
                        return objL;
                    }
                    aVar = aVar2;
                    mVar = mVarM;
                    u3Var = u3Var2;
                    function1 = function6;
                    function2 = function1L;
                    mVar2 = mVarG;
                    if (u3Var.x()) {
                        function3 = new Function0() { // from class: androidx.compose.foundation.text.selection.x3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return u3.l.A(u3Var);
                            }
                        };
                    } else {
                        function3 = null;
                    }
                    if (u3Var.y()) {
                        function4 = new Function0() { // from class: androidx.compose.foundation.text.selection.y3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return u3.l.B(u3Var);
                            }
                        };
                    } else {
                        function4 = null;
                    }
                    function5 = u3Var.u() ? new Function0() { // from class: androidx.compose.foundation.text.selection.z3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return u3.l.C(u3Var);
                        }
                    } : null;
                    e4VarG0 = u3Var.g0();
                    if (e4VarG0 != null) {
                        e4VarG0.x(u3Var.M(), function1, function3, function0, function4, function5);
                    }
                    Unit unit = Unit.f312394a;
                    aVar.x(mVar2, mVar, function2);
                    return unit;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar = aVar2;
                    mVar = mVarM;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Function0<Unit> function7 = (Function0) this.f21452g;
                Function0<Unit> function8 = (Function0) this.f21451f;
                mVar = (androidx.compose.runtime.snapshots.m) this.f21450e;
                function1L = (Function1) this.f21449d;
                mVarG = (androidx.compose.runtime.snapshots.m) this.f21448c;
                u3 u3Var3 = (u3) this.f21447b;
                aVar = (androidx.compose.runtime.snapshots.m.a) this.f21446a;
                try {
                    ResultKt.m(obj);
                    function0 = function7;
                    u3Var = u3Var3;
                    function1 = function8;
                    function2 = function1L;
                    mVar2 = mVarG;
                    try {
                        if (u3Var.x()) {
                            function3 = new Function0() { // from class: androidx.compose.foundation.text.selection.x3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return u3.l.A(u3Var);
                                }
                            };
                        } else {
                            function3 = null;
                        }
                        if (u3Var.y()) {
                            function4 = new Function0() { // from class: androidx.compose.foundation.text.selection.y3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return u3.l.B(u3Var);
                                }
                            };
                        } else {
                            function4 = null;
                        }
                        function5 = u3Var.u() ? new Function0() { // from class: androidx.compose.foundation.text.selection.z3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return u3.l.C(u3Var);
                            }
                        } : null;
                        e4VarG0 = u3Var.g0();
                        if (e4VarG0 != null) {
                            e4VarG0.x(u3Var.M(), function1, function3, function0, function4, function5);
                        }
                        Unit unit2 = Unit.f312394a;
                        aVar.x(mVar2, mVar, function2);
                        return unit2;
                    } catch (Throwable th4) {
                        function1L = function2;
                        th2 = th4;
                        mVarG = mVar2;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
            aVar.x(mVarG, mVar, function1L);
            throw th2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class m implements k5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f21461a = true;

        m() {
        }

        private final void f() {
            u3.this.G0(null);
            u3.this.E0(null);
            u3.this.b1(true);
            boolean zH = androidx.compose.ui.text.w3.h(u3.this.p0().l());
            u3.this.K0(zH ? androidx.compose.foundation.text.l3.Cursor : androidx.compose.foundation.text.l3.Selection);
            androidx.compose.foundation.text.g4 g4VarF0 = u3.this.f0();
            if (g4VarF0 != null) {
                g4VarF0.Y(!zH && b4.e(u3.this, true));
            }
            androidx.compose.foundation.text.g4 g4VarF1 = u3.this.f0();
            if (g4VarF1 != null) {
                g4VarF1.X(!zH && b4.e(u3.this, false));
            }
            androidx.compose.foundation.text.g4 g4VarF2 = u3.this.f0();
            if (g4VarF2 != null) {
                g4VarF2.V(zH && b4.e(u3.this, true));
            }
            if (this.f21461a) {
                u3 u3Var = u3.this;
                u3Var.v0(u3Var.f21407q);
            }
            u3.this.f21407q = null;
        }

        @Override // androidx.compose.foundation.text.k5
        public void a() {
            f();
        }

        @Override // androidx.compose.foundation.text.k5
        public void b(long j10) {
        }

        /* JADX WARN: Code duplicated, block: B:21:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:23:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:24:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:33:0x012e  */
        @Override // androidx.compose.foundation.text.k5
        public void c(long j10) {
            y6 y6VarN;
            u3 u3Var;
            androidx.compose.ui.text.w3 w3Var;
            int iG;
            long jC1;
            if (u3.this.T()) {
                if (u3.this.p0().m().length() == 0) {
                    return;
                }
                u3 u3Var2 = u3.this;
                u3Var2.f21408r = n0.g.w(u3Var2.f21408r, j10);
                androidx.compose.foundation.text.g4 g4VarF0 = u3.this.f0();
                if (g4VarF0 == null || (y6VarN = g4VarF0.n()) == null) {
                    u3.this.b1(false);
                } else {
                    u3 u3Var3 = u3.this;
                    u3Var3.E0(n0.g.d(n0.g.w(u3Var3.f21406p, u3Var3.f21408r)));
                    if (u3Var3.f21407q == null) {
                        n0.g gVarP = u3Var3.P();
                        Intrinsics.checkNotNull(gVarP);
                        if (y6VarN.j(gVarP.B())) {
                            u3Var = u3Var3;
                            w3Var = u3Var.f21407q;
                            if (w3Var != null) {
                                iG = androidx.compose.ui.text.w3.n(w3Var.r());
                            } else {
                                iG = y6VarN.g(u3Var.f21406p, false);
                            }
                            n0.g gVarP2 = u3Var.P();
                            Intrinsics.checkNotNull(gVarP2);
                            int iG2 = y6VarN.g(gVarP2.B(), false);
                            if (u3Var.f21407q == null || iG != iG2) {
                                androidx.compose.ui.text.input.y0 y0VarP0 = u3Var.p0();
                                n0.g gVarP3 = u3Var.P();
                                Intrinsics.checkNotNull(gVarP3);
                                jC1 = u3Var.c1(y0VarP0, gVarP3.B(), false, false, n0.f21271a.o(), true);
                            }
                        } else {
                            int i10 = (3 | 0) << 0;
                            int iA = u3Var3.b0().a(y6.h(y6VarN, u3Var3.f21406p, false, 2, null));
                            androidx.compose.ui.text.input.m0 m0VarB0 = u3Var3.b0();
                            n0.g gVarP4 = u3Var3.P();
                            Intrinsics.checkNotNull(gVarP4);
                            n0 n0VarM = iA == m0VarB0.a(y6.h(y6VarN, gVarP4.B(), false, 2, null)) ? n0.f21271a.m() : n0.f21271a.o();
                            androidx.compose.ui.text.input.y0 y0VarP1 = u3Var3.p0();
                            n0.g gVarP5 = u3Var3.P();
                            Intrinsics.checkNotNull(gVarP5);
                            u3Var = u3Var3;
                            jC1 = u3Var.c1(y0VarP1, gVarP5.B(), false, false, n0VarM, true);
                        }
                        if (!androidx.compose.ui.text.w3.f(jC1, u3Var.f21407q)) {
                            this.f21461a = false;
                        }
                        u3.this.b1(false);
                    } else {
                        u3Var = u3Var3;
                        w3Var = u3Var.f21407q;
                        if (w3Var != null) {
                            iG = androidx.compose.ui.text.w3.n(w3Var.r());
                        } else {
                            iG = y6VarN.g(u3Var.f21406p, false);
                        }
                        n0.g gVarP6 = u3Var.P();
                        Intrinsics.checkNotNull(gVarP6);
                        int iG3 = y6VarN.g(gVarP6.B(), false);
                        if (u3Var.f21407q == null) {
                        }
                        androidx.compose.ui.text.input.y0 y0VarP2 = u3Var.p0();
                        n0.g gVarP7 = u3Var.P();
                        Intrinsics.checkNotNull(gVarP7);
                        jC1 = u3Var.c1(y0VarP2, gVarP7.B(), false, false, n0.f21271a.o(), true);
                        if (!androidx.compose.ui.text.w3.f(jC1, u3Var.f21407q)) {
                            this.f21461a = false;
                        }
                        u3.this.b1(false);
                    }
                }
            }
        }

        @Override // androidx.compose.foundation.text.k5
        public void d(long j10) {
            long j11;
            y6 y6VarN;
            y6 y6VarN2;
            if (u3.this.T() && u3.this.R() == null) {
                u3.this.G0(androidx.compose.foundation.text.k3.SelectionEnd);
                int i10 = 4 | (-1);
                u3.this.f21411u = -1;
                this.f21461a = true;
                u3.this.s0();
                androidx.compose.foundation.text.g4 g4VarF0 = u3.this.f0();
                if (g4VarF0 == null || (y6VarN2 = g4VarF0.n()) == null || !y6VarN2.j(j10)) {
                    j11 = j10;
                    androidx.compose.foundation.text.g4 g4VarF1 = u3.this.f0();
                    if (g4VarF1 != null && (y6VarN = g4VarF1.n()) != null) {
                        u3 u3Var = u3.this;
                        int iA = u3Var.b0().a(y6.h(y6VarN, j11, false, 2, null));
                        androidx.compose.ui.text.input.y0 y0VarC = u3Var.C(u3Var.p0().j(), androidx.compose.ui.text.x3.b(iA, iA));
                        u3Var.H(false);
                        p0.a aVarX = u3Var.X();
                        if (aVarX != null) {
                            aVarX.a(p0.b.f340720b.j());
                        }
                        u3Var.c0().invoke(y0VarC);
                        u3Var.M0(androidx.compose.ui.text.w3.b(y0VarC.l()));
                    }
                    this.f21461a = false;
                } else {
                    if (u3.this.p0().m().length() == 0) {
                        return;
                    }
                    u3.this.H(false);
                    u3 u3Var2 = u3.this;
                    j11 = j10;
                    u3.this.f21407q = androidx.compose.ui.text.w3.b(u3Var2.c1(androidx.compose.ui.text.input.y0.h(u3Var2.p0(), null, androidx.compose.ui.text.w3.f42333b.a(), null, 5, null), j10, true, false, n0.f21271a.o(), true));
                }
                u3.this.K0(androidx.compose.foundation.text.l3.None);
                u3.this.f21406p = j11;
                u3 u3Var3 = u3.this;
                u3Var3.E0(n0.g.d(u3Var3.f21406p));
                u3.this.f21408r = n0.g.f332700b.e();
            }
        }

        @Override // androidx.compose.foundation.text.k5
        public void e() {
        }

        @Override // androidx.compose.foundation.text.k5
        public void onCancel() {
            f();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager", f = "TextFieldSelectionManager.kt", i = {}, l = {777}, m = "updateClipboardEntry$foundation_release", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f21464b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f21466d;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21464b = obj;
            this.f21466d |= Integer.MIN_VALUE;
            return u3.this.a1(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ kotlinx.coroutines.p2 B(u3 u3Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return u3Var.A(z10);
    }

    private final void B0(androidx.compose.ui.platform.k1 k1Var) {
        this.f21415y.setValue(k1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.text.input.y0 C(androidx.compose.ui.text.f fVar, long j10) {
        return new androidx.compose.ui.text.input.y0(fVar, j10, (androidx.compose.ui.text.w3) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(n0.g gVar) {
        this.f21410t.setValue(gVar);
    }

    public static /* synthetic */ void G(u3 u3Var, n0.g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = null;
        }
        u3Var.F(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G0(androidx.compose.foundation.text.k3 k3Var) {
        this.f21409s.setValue(k3Var);
    }

    public static /* synthetic */ void I(u3 u3Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        u3Var.H(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.ui.platform.k1 K() {
        return (androidx.compose.ui.platform.k1) this.f21415y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(androidx.compose.foundation.text.l3 l3Var) {
        androidx.compose.foundation.text.g4 g4Var = this.f21394d;
        if (g4Var != null) {
            if (g4Var.g() == l3Var) {
                g4Var = null;
            }
            if (g4Var != null) {
                g4Var.L(l3Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0.j M() {
        char c10;
        long j10;
        float fIntBitsToFloat;
        androidx.compose.ui.layout.g0 g0VarM;
        androidx.compose.ui.text.p3 p3VarI;
        n0.j jVarE;
        androidx.compose.ui.layout.g0 g0VarM2;
        androidx.compose.ui.text.p3 p3VarI2;
        n0.j jVarE2;
        androidx.compose.ui.layout.g0 g0VarM3;
        androidx.compose.ui.layout.g0 g0VarM4;
        androidx.compose.foundation.text.g4 g4Var = this.f21394d;
        if (g4Var != null) {
            if (g4Var.E()) {
                g4Var = null;
            }
            if (g4Var != null) {
                int iB = this.f21392b.b(androidx.compose.ui.text.w3.n(p0().l()));
                int iB2 = this.f21392b.b(androidx.compose.ui.text.w3.i(p0().l()));
                androidx.compose.foundation.text.g4 g4Var2 = this.f21394d;
                long jE = (g4Var2 == null || (g0VarM4 = g4Var2.m()) == null) ? n0.g.f332700b.e() : g0VarM4.k0(W(true));
                androidx.compose.foundation.text.g4 g4Var3 = this.f21394d;
                long jE2 = (g4Var3 == null || (g0VarM3 = g4Var3.m()) == null) ? n0.g.f332700b.e() : g0VarM3.k0(W(false));
                androidx.compose.foundation.text.g4 g4Var4 = this.f21394d;
                float fIntBitsToFloat2 = 0.0f;
                if (g4Var4 == null || (g0VarM2 = g4Var4.m()) == null) {
                    c10 = ' ';
                    j10 = com.rabbitmq.client.k0.f265952a;
                    fIntBitsToFloat = 0.0f;
                } else {
                    y6 y6VarN = g4Var.n();
                    float fB = (y6VarN == null || (p3VarI2 = y6VarN.i()) == null || (jVarE2 = p3VarI2.e(iB)) == null) ? 0.0f : jVarE2.B();
                    long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                    int iFloatToRawIntBits = Float.floatToRawIntBits(fB);
                    c10 = ' ';
                    j10 = com.rabbitmq.client.k0.f265952a;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (g0VarM2.k0(n0.g.g((((long) iFloatToRawIntBits) & com.rabbitmq.client.k0.f265952a) | (jFloatToRawIntBits << 32))) & com.rabbitmq.client.k0.f265952a));
                }
                androidx.compose.foundation.text.g4 g4Var5 = this.f21394d;
                if (g4Var5 != null && (g0VarM = g4Var5.m()) != null) {
                    y6 y6VarN2 = g4Var.n();
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (g0VarM.k0(n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << c10) | (((long) Float.floatToRawIntBits((y6VarN2 == null || (p3VarI = y6VarN2.i()) == null || (jVarE = p3VarI.e(iB2)) == null) ? 0.0f : jVarE.B())) & j10))) & j10));
                }
                int i10 = (int) (jE >> c10);
                int i11 = (int) (jE2 >> c10);
                return new n0.j(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat((int) (jE & j10)), Float.intBitsToFloat((int) (jE2 & j10))) + (androidx.compose.ui.unit.h.r(25) * g4Var.A().a().getDensity()));
            }
        }
        return n0.j.f332705e.a();
    }

    private final boolean Y() {
        return !androidx.compose.ui.text.w3.h(p0().l());
    }

    private final kotlinx.coroutines.p2 Z0() {
        kotlinx.coroutines.s0 s0Var = this.f21399i;
        if (s0Var == null) {
            return null;
        }
        int i10 = (5 ^ 1) >> 0;
        return kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new l(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b1(boolean z10) {
        androidx.compose.foundation.text.g4 g4Var = this.f21394d;
        if (g4Var != null) {
            g4Var.W(z10);
        }
        if (z10) {
            Y0();
        } else {
            s0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.j c(u3 u3Var, androidx.compose.ui.layout.g0 g0Var) {
        n0.j jVarM = u3Var.M();
        androidx.compose.foundation.text.g4 g4Var = u3Var.f21394d;
        androidx.compose.ui.layout.g0 g0VarM = g4Var != null ? g4Var.m() : null;
        if (g0VarM != null) {
            return androidx.compose.foundation.text.contextmenu.modifier.l.c(jVarM, g0VarM, g0Var);
        }
        androidx.compose.foundation.internal.e.j("Required value was null.");
        throw new kotlin.a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long c1(androidx.compose.ui.text.input.y0 y0Var, long j10, boolean z10, boolean z11, n0 n0Var, boolean z12) {
        y6 y6VarN;
        int i10;
        p0.a aVar;
        androidx.compose.foundation.text.g4 g4Var = this.f21394d;
        if (g4Var == null || (y6VarN = g4Var.n()) == null) {
            return androidx.compose.ui.text.w3.f42333b.a();
        }
        long jB = androidx.compose.ui.text.x3.b(this.f21392b.b(androidx.compose.ui.text.w3.n(y0Var.l())), this.f21392b.b(androidx.compose.ui.text.w3.i(y0Var.l())));
        boolean z13 = false;
        int iG = y6VarN.g(j10, false);
        int iN = (z11 || z10) ? iG : androidx.compose.ui.text.w3.n(jB);
        int i11 = (!z11 || z10) ? iG : androidx.compose.ui.text.w3.i(jB);
        o1 o1Var = this.f21413w;
        if (z10 || o1Var == null || (i10 = this.f21411u) == -1) {
            i10 = -1;
        }
        o1 o1VarB = r1.b(y6VarN.i(), iN, i11, i10, jB, z10, z11);
        if (!o1VarB.f(o1Var)) {
            return y0Var.l();
        }
        this.f21413w = o1VarB;
        this.f21411u = iG;
        h0 h0VarA = n0Var.a(o1VarB);
        long jB2 = androidx.compose.ui.text.x3.b(this.f21392b.a(h0VarA.h().g()), this.f21392b.a(h0VarA.f().g()));
        if (androidx.compose.ui.text.w3.g(jB2, y0Var.l())) {
            return y0Var.l();
        }
        boolean z14 = androidx.compose.ui.text.w3.m(jB2) != androidx.compose.ui.text.w3.m(y0Var.l()) && androidx.compose.ui.text.w3.g(androidx.compose.ui.text.x3.b(androidx.compose.ui.text.w3.i(jB2), androidx.compose.ui.text.w3.n(jB2)), y0Var.l());
        boolean z15 = androidx.compose.ui.text.w3.h(jB2) && androidx.compose.ui.text.w3.h(y0Var.l());
        if (z12 && y0Var.m().length() > 0 && !z14 && !z15 && (aVar = this.f21402l) != null) {
            aVar.a(p0.b.f340720b.j());
        }
        this.f21393c.invoke(C(y0Var.j(), jB2));
        this.f21414x = androidx.compose.ui.text.w3.b(jB2);
        if (!z12) {
            b1(!androidx.compose.ui.text.w3.h(jB2));
        }
        androidx.compose.foundation.text.g4 g4Var2 = this.f21394d;
        if (g4Var2 != null) {
            g4Var2.N(z12);
        }
        androidx.compose.foundation.text.g4 g4Var3 = this.f21394d;
        if (g4Var3 != null) {
            g4Var3.Y(!androidx.compose.ui.text.w3.h(jB2) && b4.e(this, true));
        }
        androidx.compose.foundation.text.g4 g4Var4 = this.f21394d;
        if (g4Var4 != null) {
            g4Var4.X(!androidx.compose.ui.text.w3.h(jB2) && b4.e(this, false));
        }
        androidx.compose.foundation.text.g4 g4Var5 = this.f21394d;
        if (g4Var5 != null) {
            if (androidx.compose.ui.text.w3.h(jB2) && b4.e(this, true)) {
                z13 = true;
            }
            g4Var5.V(z13);
        }
        return jB2;
    }

    public static /* synthetic */ void i0() {
    }

    @androidx.annotation.l1
    public static /* synthetic */ void l0() {
    }

    private final boolean t0() {
        return this.f21396f instanceof androidx.compose.ui.text.input.o0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(androidx.compose.ui.text.w3 w3Var) {
        x xVar;
        androidx.compose.ui.text.f fVarN0;
        String strM;
        kotlinx.coroutines.s0 s0Var;
        if (w3Var == null || (xVar = this.f21400j) == null || (fVarN0 = n0()) == null || (strM = fVarN0.m()) == null) {
            return;
        }
        androidx.compose.ui.text.input.m0 m0Var = this.f21392b;
        long jB = androidx.compose.ui.text.x3.b(m0Var.b(androidx.compose.ui.text.w3.n(w3Var.r())), m0Var.b(androidx.compose.ui.text.w3.i(w3Var.r())));
        if (strM.length() <= 0 || androidx.compose.ui.text.w3.h(jB) || (s0Var = this.f21399i) == null) {
            return;
        }
        kotlinx.coroutines.k.f(s0Var, null, null, new h(xVar, strM, jB, w3Var, this, m0Var, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object w0(kotlin.coroutines.d<? super Unit> dVar) {
        j jVar;
        String strM;
        androidx.compose.ui.text.w3 w3Var;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.f21443c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f21443c = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object obj = jVar.f21441a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = jVar.f21443c;
        if (i11 == 0) {
            ResultKt.m(obj);
            androidx.compose.ui.text.f fVarN0 = n0();
            if (fVarN0 != null && (strM = fVarN0.m()) != null && (w3Var = this.f21414x) != null) {
                long jR = w3Var.r();
                x xVar = this.f21400j;
                if (xVar != null) {
                    long jB = androidx.compose.ui.text.x3.b(this.f21392b.b(androidx.compose.ui.text.w3.n(jR)), this.f21392b.b(androidx.compose.ui.text.w3.i(jR)));
                    jVar.f21443c = 1;
                    if (xVar.a(strM, jB, jVar) == objL) {
                        return objL;
                    }
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x0(androidx.compose.ui.text.input.y0 y0Var) {
        return Unit.f312394a;
    }

    @Nullable
    public final kotlinx.coroutines.p2 A(boolean z10) {
        kotlinx.coroutines.s0 s0Var = this.f21399i;
        if (s0Var != null) {
            return kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new d(z10, null), 1, null);
        }
        return null;
    }

    public final void A0(long j10) {
        y6 y6VarN;
        androidx.compose.foundation.text.g4 g4Var = this.f21394d;
        if (g4Var != null && (y6VarN = g4Var.n()) != null && !x6.c(y6VarN.i(), y6VarN.m(j10), androidx.compose.ui.text.w3.b(p0().l()))) {
            c1(p0(), j10, true, false, n0.f21271a.o(), false);
        }
    }

    public final void C0(@Nullable androidx.compose.ui.platform.m1 m1Var) {
        this.f21398h = m1Var;
    }

    @NotNull
    public final k5 D() {
        return new e();
    }

    public final void D0(@Nullable kotlinx.coroutines.s0 s0Var) {
        this.f21399i = s0Var;
    }

    @Nullable
    public final kotlinx.coroutines.p2 E() {
        kotlinx.coroutines.s0 s0Var = this.f21399i;
        if (s0Var != null) {
            return kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new f(null), 1, null);
        }
        return null;
    }

    public final void F(@Nullable n0.g gVar) {
        if (!androidx.compose.ui.text.w3.h(p0().l())) {
            androidx.compose.foundation.text.g4 g4Var = this.f21394d;
            y6 y6VarN = g4Var != null ? g4Var.n() : null;
            int i10 = 5 << 0;
            androidx.compose.ui.text.input.y0 y0VarH = androidx.compose.ui.text.input.y0.h(p0(), null, androidx.compose.ui.text.x3.a((gVar == null || y6VarN == null) ? androidx.compose.ui.text.w3.k(p0().l()) : this.f21392b.a(y6.h(y6VarN, gVar.B(), false, 2, null))), null, 5, null);
            this.f21393c.invoke(y0VarH);
            this.f21414x = androidx.compose.ui.text.w3.b(y0VarH.l());
        }
        K0((gVar == null || p0().m().length() <= 0) ? androidx.compose.foundation.text.l3.None : androidx.compose.foundation.text.l3.Cursor);
        b1(false);
    }

    public final void F0(long j10) {
        androidx.compose.foundation.text.g4 g4Var = this.f21394d;
        if (g4Var != null) {
            g4Var.K(j10);
        }
        androidx.compose.foundation.text.g4 g4Var2 = this.f21394d;
        if (g4Var2 != null) {
            g4Var2.U(androidx.compose.ui.text.w3.f42333b.a());
        }
        if (androidx.compose.ui.text.w3.h(j10)) {
            return;
        }
        J();
    }

    public final void H(boolean z10) {
        androidx.compose.ui.focus.g0 g0Var;
        androidx.compose.foundation.text.g4 g4Var = this.f21394d;
        if (g4Var != null && !g4Var.h() && (g0Var = this.f21403m) != null) {
            androidx.compose.ui.focus.g0.k(g0Var, 0, 1, null);
        }
        this.f21412v = p0();
        b1(z10);
        K0(androidx.compose.foundation.text.l3.Selection);
    }

    public final void H0(boolean z10) {
        this.f21404n.setValue(Boolean.valueOf(z10));
    }

    public final void I0(boolean z10) {
        this.f21405o.setValue(Boolean.valueOf(z10));
    }

    public final void J() {
        b1(false);
        K0(androidx.compose.foundation.text.l3.None);
    }

    public final void J0(@Nullable androidx.compose.ui.focus.g0 g0Var) {
        this.f21403m = g0Var;
    }

    @Nullable
    public final androidx.compose.ui.platform.m1 L() {
        return this.f21398h;
    }

    public final void L0(@Nullable p0.a aVar) {
        this.f21402l = aVar;
    }

    public final void M0(@Nullable androidx.compose.ui.text.w3 w3Var) {
        this.f21414x = w3Var;
    }

    @NotNull
    public final androidx.compose.ui.a0 N() {
        return !T() ? androidx.compose.ui.a0.E : androidx.compose.foundation.text.contextmenu.modifier.l.a(androidx.compose.foundation.text.contextmenu.modifier.g.a(androidx.compose.ui.a0.E, new a(null)), this.f21416z, new b(null), new c(null), new Function1() { // from class: androidx.compose.foundation.text.selection.t3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u3.c(this.f21378a, (androidx.compose.ui.layout.g0) obj);
            }
        });
    }

    public final void N0(@NotNull androidx.compose.ui.text.input.m0 m0Var) {
        this.f21392b = m0Var;
    }

    @Nullable
    public final kotlinx.coroutines.s0 O() {
        return this.f21399i;
    }

    public final void O0(@NotNull Function1<? super androidx.compose.ui.text.input.y0, Unit> function1) {
        this.f21393c = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final n0.g P() {
        return (n0.g) this.f21410t.getValue();
    }

    public final void P0(@Nullable x xVar) {
        this.f21400j = xVar;
    }

    public final long Q(@NotNull androidx.compose.ui.unit.d dVar) {
        int iB = this.f21392b.b(androidx.compose.ui.text.w3.n(p0().l()));
        androidx.compose.foundation.text.g4 g4Var = this.f21394d;
        y6 y6VarN = g4Var != null ? g4Var.n() : null;
        Intrinsics.checkNotNull(y6VarN);
        androidx.compose.ui.text.p3 p3VarI = y6VarN.i();
        n0.j jVarE = p3VarI.e(kotlin.ranges.r.I(iB, 0, p3VarI.l().n().length()));
        return n0.g.g((((long) Float.floatToRawIntBits(jVarE.j())) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(jVarE.t() + (dVar.S7(n5.a()) / 2))) << 32));
    }

    public final void Q0(@Nullable Function0<Unit> function0) {
        this.f21397g = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final androidx.compose.foundation.text.k3 R() {
        return (androidx.compose.foundation.text.k3) this.f21409s.getValue();
    }

    public final void R0(long j10) {
        androidx.compose.foundation.text.g4 g4Var = this.f21394d;
        if (g4Var != null) {
            g4Var.U(j10);
        }
        androidx.compose.foundation.text.g4 g4Var2 = this.f21394d;
        if (g4Var2 != null) {
            g4Var2.K(androidx.compose.ui.text.w3.f42333b.a());
        }
        if (androidx.compose.ui.text.w3.h(j10)) {
            return;
        }
        J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean S() {
        return ((Boolean) this.f21404n.getValue()).booleanValue();
    }

    public final void S0(@Nullable androidx.compose.foundation.text.g4 g4Var) {
        this.f21394d = g4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean T() {
        return ((Boolean) this.f21405o.getValue()).booleanValue();
    }

    public final void T0(@Nullable androidx.compose.ui.platform.e4 e4Var) {
        this.f21401k = e4Var;
    }

    @Nullable
    public final androidx.compose.ui.focus.g0 U() {
        return this.f21403m;
    }

    public final void U0(boolean z10) {
        this.C = z10;
    }

    public final float V(boolean z10) {
        y6 y6VarN;
        androidx.compose.ui.text.p3 p3VarI;
        int iN = z10 ? androidx.compose.ui.text.w3.n(p0().l()) : androidx.compose.ui.text.w3.i(p0().l());
        androidx.compose.foundation.text.g4 g4Var = this.f21394d;
        if (g4Var == null || (y6VarN = g4Var.n()) == null || (p3VarI = y6VarN.i()) == null) {
            return 0.0f;
        }
        return x6.b(p3VarI, iN);
    }

    public final void V0(@NotNull androidx.compose.foundation.text.contextmenu.modifier.o oVar) {
        this.f21416z = oVar;
    }

    public final long W(boolean z10) {
        y6 y6VarN;
        androidx.compose.ui.text.p3 p3VarI;
        androidx.compose.foundation.text.g4 g4Var = this.f21394d;
        if (g4Var == null || (y6VarN = g4Var.n()) == null || (p3VarI = y6VarN.i()) == null) {
            return n0.g.f332700b.c();
        }
        androidx.compose.ui.text.f fVarN0 = n0();
        if (fVarN0 == null) {
            return n0.g.f332700b.c();
        }
        if (!Intrinsics.areEqual(fVarN0.m(), p3VarI.l().n().m())) {
            return n0.g.f332700b.c();
        }
        long jL = p0().l();
        return z4.b(p3VarI, this.f21392b.b(z10 ? androidx.compose.ui.text.w3.n(jL) : androidx.compose.ui.text.w3.i(jL)), z10, androidx.compose.ui.text.w3.m(p0().l()));
    }

    public final void W0(@NotNull androidx.compose.ui.text.input.y0 y0Var) {
        this.f21395e.setValue(y0Var);
        this.f21414x = androidx.compose.ui.text.w3.b(y0Var.l());
    }

    @Nullable
    public final p0.a X() {
        return this.f21402l;
    }

    public final void X0(@NotNull androidx.compose.ui.text.input.j1 j1Var) {
        this.f21396f = j1Var;
    }

    public final void Y0() {
        androidx.compose.foundation.text.g4 g4Var;
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            if (T() && ((g4Var = this.f21394d) == null || g4Var.D())) {
                Unit unit = Unit.f312394a;
                aVar.x(mVarG, mVarM, function1L);
                if (androidx.compose.foundation.s1.f18599d) {
                    this.f21416z.e();
                    return;
                } else {
                    Z0();
                    return;
                }
            }
            aVar.x(mVarG, mVarM, function1L);
        } catch (Throwable th2) {
            aVar.x(mVarG, mVarM, function1L);
            throw th2;
        }
    }

    @Nullable
    public final androidx.compose.ui.text.w3 Z() {
        return this.f21414x;
    }

    @NotNull
    public final r a0() {
        return this.B;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object a1(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        n nVar;
        androidx.compose.ui.platform.k1 k1Var;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i10 = nVar.f21466d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f21466d = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(dVar);
            }
        } else {
            nVar = new n(dVar);
        }
        Object objB = nVar.f21464b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = nVar.f21466d;
        if (i11 == 0) {
            ResultKt.m(objB);
            androidx.compose.ui.platform.m1 m1Var = this.f21398h;
            if (m1Var != null) {
                nVar.f21463a = this;
                nVar.f21466d = 1;
                objB = m1Var.b(nVar);
                if (objB == objL) {
                    return objL;
                }
            } else {
                k1Var = null;
            }
            this.B0(k1Var);
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this = (u3) nVar.f21463a;
        ResultKt.m(objB);
        k1Var = (androidx.compose.ui.platform.k1) objB;
        this.B0(k1Var);
        return Unit.f312394a;
    }

    @NotNull
    public final androidx.compose.ui.text.input.m0 b0() {
        return this.f21392b;
    }

    @NotNull
    public final Function1<androidx.compose.ui.text.input.y0, Unit> c0() {
        return this.f21393c;
    }

    @Nullable
    public final x d0() {
        return this.f21400j;
    }

    @Nullable
    public final Function0<Unit> e0() {
        return this.f21397g;
    }

    @Nullable
    public final androidx.compose.foundation.text.g4 f0() {
        return this.f21394d;
    }

    @Nullable
    public final androidx.compose.ui.platform.e4 g0() {
        return this.f21401k;
    }

    public final boolean h0() {
        if (androidx.compose.foundation.s1.f18599d) {
            return this.C;
        }
        androidx.compose.ui.platform.e4 e4Var = this.f21401k;
        return (e4Var != null ? e4Var.t() : null) == androidx.compose.ui.platform.g4.Shown;
    }

    public final boolean j0() {
        return this.C;
    }

    @NotNull
    public final androidx.compose.foundation.text.contextmenu.modifier.o k0() {
        return this.f21416z;
    }

    @NotNull
    public final k5 m0() {
        return this.A;
    }

    @Nullable
    public final androidx.compose.ui.text.f n0() {
        i5 i5VarA;
        androidx.compose.foundation.text.g4 g4Var = this.f21394d;
        if (g4Var == null || (i5VarA = g4Var.A()) == null) {
            return null;
        }
        return i5VarA.n();
    }

    @Nullable
    public final x7 o0() {
        return this.f21391a;
    }

    @NotNull
    public final androidx.compose.ui.text.input.y0 p0() {
        return this.f21395e.getValue();
    }

    @NotNull
    public final androidx.compose.ui.text.input.j1 q0() {
        return this.f21396f;
    }

    @NotNull
    public final k5 r0(boolean z10) {
        return new g(z10);
    }

    public final void s0() {
        androidx.compose.ui.platform.e4 e4Var;
        if (androidx.compose.foundation.s1.f18599d) {
            this.f21416z.b();
            return;
        }
        androidx.compose.ui.platform.e4 e4Var2 = this.f21401k;
        if ((e4Var2 != null ? e4Var2.t() : null) != androidx.compose.ui.platform.g4.Shown || (e4Var = this.f21401k) == null) {
            return;
        }
        e4Var.b();
    }

    public final void t() {
        Function0<Unit> function0 = this.f21397g;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean u() {
        return S() && androidx.compose.ui.text.w3.h(p0().l());
    }

    public final boolean u0() {
        return !Intrinsics.areEqual(this.f21412v.m(), p0().m());
    }

    public final boolean v() {
        return Y() && !t0();
    }

    public final boolean w() {
        return Y() && S() && !t0();
    }

    public final boolean x() {
        androidx.compose.ui.platform.k1 k1VarK;
        return S() && (k1VarK = K()) != null && androidx.compose.foundation.internal.b.c(k1VarK);
    }

    public final boolean y() {
        return androidx.compose.ui.text.w3.j(p0().l()) != p0().m().length();
    }

    @Nullable
    public final kotlinx.coroutines.p2 y0() {
        kotlinx.coroutines.s0 s0Var = this.f21399i;
        if (s0Var != null) {
            return kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new k(null), 1, null);
        }
        return null;
    }

    public final void z() {
        androidx.compose.foundation.text.g4 g4Var = this.f21394d;
        if (g4Var != null) {
            g4Var.K(androidx.compose.ui.text.w3.f42333b.a());
        }
        androidx.compose.foundation.text.g4 g4Var2 = this.f21394d;
        if (g4Var2 != null) {
            g4Var2.U(androidx.compose.ui.text.w3.f42333b.a());
        }
    }

    public final void z0() {
        int i10 = 4 << 0;
        androidx.compose.ui.text.input.y0 y0VarC = C(p0().j(), androidx.compose.ui.text.x3.b(0, p0().m().length()));
        this.f21393c.invoke(y0VarC);
        this.f21414x = androidx.compose.ui.text.w3.b(y0VarC.l());
        this.f21412v = androidx.compose.ui.text.input.y0.h(this.f21412v, null, y0VarC.l(), null, 5, null);
        H(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u3(@Nullable x7 x7Var) {
        this.f21391a = x7Var;
        this.f21392b = b8.d();
        this.f21393c = new Function1() { // from class: androidx.compose.foundation.text.selection.s3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u3.x0((androidx.compose.ui.text.input.y0) obj);
            }
        };
        boolean z10 = 7 | 0;
        this.f21395e = d7.g(new androidx.compose.ui.text.input.y0((String) null, 0L, (androidx.compose.ui.text.w3) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.f21396f = androidx.compose.ui.text.input.j1.f41895a.c();
        Boolean bool = Boolean.TRUE;
        this.f21404n = d7.g(bool, null, 2, null);
        this.f21405o = d7.g(bool, null, 2, null);
        n0.g.a aVar = n0.g.f332700b;
        this.f21406p = aVar.e();
        this.f21408r = aVar.e();
        this.f21409s = d7.g(null, null, 2, null);
        this.f21410t = d7.g(null, null, 2, null);
        this.f21411u = -1;
        this.f21412v = new androidx.compose.ui.text.input.y0((String) null, 0L, (androidx.compose.ui.text.w3) (0 == true ? 1 : 0), 7, (DefaultConstructorMarker) null);
        this.f21415y = d7.g(null, null, 2, null);
        this.f21416z = new androidx.compose.foundation.text.contextmenu.modifier.p();
        this.A = new m();
        this.B = new i();
    }

    public /* synthetic */ u3(x7 x7Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : x7Var);
    }
}
