package androidx.compose.ui.node;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMeasurePassDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePassDelegate.kt\nandroidx/compose/ui/node/MeasurePassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,911:1\n409#1:948\n410#1:958\n409#1:986\n410#1:996\n1085#2,2:912\n391#3:914\n392#3,6:921\n398#3,2:930\n210#4:915\n207#4:932\n1367#4,7:941\n207#4:949\n1367#4,7:959\n207#4:966\n1357#4,7:975\n207#4:987\n207#4:997\n207#4:1043\n207#4:1052\n207#4:1061\n436#5,5:916\n441#5,3:927\n424#5,8:933\n424#5,8:950\n424#5,8:967\n424#5,8:988\n424#5,8:998\n424#5,8:1044\n424#5,8:1053\n424#5,8:1062\n57#6,4:982\n57#6,4:1006\n103#6,4:1012\n57#6,4:1021\n57#6,4:1028\n103#6,4:1035\n57#6,4:1039\n1573#7,2:1010\n1575#7,3:1018\n1573#7,2:1025\n1575#7,3:1032\n30#8:1016\n80#9:1017\n1#10:1027\n*S KotlinDebug\n*F\n+ 1 MeasurePassDelegate.kt\nandroidx/compose/ui/node/MeasurePassDelegate\n*L\n271#1:948\n271#1:958\n395#1:986\n395#1:996\n145#1:912,2\n155#1:914\n155#1:921,6\n155#1:930,2\n155#1:915\n236#1:932\n263#1:941,7\n271#1:949\n291#1:959,7\n296#1:966\n349#1:975,7\n395#1:987\n409#1:997\n806#1:1043\n830#1:1052\n861#1:1061\n155#1:916,5\n155#1:927,3\n236#1:933,8\n271#1:950,8\n296#1:967,8\n395#1:988,8\n409#1:998,8\n806#1:1044,8\n830#1:1053,8\n861#1:1062,8\n375#1:982,4\n417#1:1006,4\n461#1:1012,4\n504#1:1021,4\n622#1:1028,4\n637#1:1035,4\n676#1:1039,4\n460#1:1010,2\n460#1:1018,3\n587#1:1025,2\n587#1:1032,3\n484#1:1016\n484#1:1017\n*E\n"})
public final class a1 extends androidx.compose.ui.layout.i2 implements androidx.compose.ui.layout.z0, androidx.compose.ui.node.b, f1 {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final int f39654v3 = 8;
    private boolean H1;

    @Nullable
    private Object X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final q0 f39655g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<a1> f39656g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39657h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f39658h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private boolean f39660i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private long f39662j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f39663k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f39664k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f39665l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f39666l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private float f39668m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f39669n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private boolean f39670n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f39671o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @Nullable
    private Function1<? super androidx.compose.ui.graphics.r1, Unit> f39672o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f39673p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f39674p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.a f39675p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.layer.c f39676p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private long f39677q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private float f39678r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Function1<? super androidx.compose.ui.graphics.r1, Unit> f39679s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f39680s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.layer.c f39681t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private boolean f39682t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private boolean f39683u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f39684v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f39685w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39659i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f39661j = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private l0.g f39667m = l0.g.NotUsed;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f39687b;

        static {
            int[] iArr = new int[l0.e.values().length];
            try {
                iArr[l0.e.Measuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l0.e.LayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39686a = iArr;
            int[] iArr2 = new int[l0.g.values().length];
            try {
                iArr2[l0.g.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[l0.g.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f39687b = iArr2;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.node.b, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39689a = new a();

            a() {
                super(1);
            }

            public final void c(androidx.compose.ui.node.b bVar) {
                bVar.x().y(false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.b bVar) {
                c(bVar);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.node.a1$b$b, reason: collision with other inner class name */
        static final class C0307b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.node.b, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0307b f39690a = new C0307b();

            C0307b() {
                super(1);
            }

            public final void c(androidx.compose.ui.node.b bVar) {
                bVar.x().v(bVar.x().o());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.b bVar) {
                c(bVar);
                return Unit.f312394a;
            }
        }

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a1.this.M1();
            a1.this.T0(a.f39689a);
            a1.this.J0().l2().y();
            a1.this.J1();
            a1.this.T0(C0307b.f39690a);
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a1.this.B2().P0(a1.this.f39662j3);
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            androidx.compose.ui.layout.i2.a placementScope;
            k1 k1VarA5 = a1.this.B2().a5();
            if (k1VarA5 == null || (placementScope = k1VarA5.t2()) == null) {
                placementScope = p0.c(a1.this.i4()).getPlacementScope();
            }
            androidx.compose.ui.layout.i2.a aVar = placementScope;
            a1 a1Var = a1.this;
            Function1<? super androidx.compose.ui.graphics.r1, Unit> function1 = a1Var.f39672o3;
            androidx.compose.ui.graphics.layer.c cVar = a1Var.f39676p3;
            if (cVar != null) {
                aVar.E0(a1Var.B2(), a1Var.f39677q3, cVar, a1Var.f39678r3);
            } else if (function1 == null) {
                aVar.U(a1Var.B2(), a1Var.f39677q3, a1Var.f39678r3);
            } else {
                aVar.D0(a1Var.B2(), a1Var.f39677q3, a1Var.f39678r3, function1);
            }
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.node.b, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f39693a = new e();

        e() {
            super(1);
        }

        public final void c(androidx.compose.ui.node.b bVar) {
            bVar.x().z(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.b bVar) {
            c(bVar);
            return Unit.f312394a;
        }
    }

    public a1(@NotNull q0 q0Var) {
        this.f39655g = q0Var;
        androidx.compose.ui.unit.q.a aVar = androidx.compose.ui.unit.q.f42709b;
        this.f39671o = aVar.b();
        this.f39685w = true;
        this.f39675p2 = new m0(this);
        this.f39656g3 = new androidx.compose.runtime.collection.d<>(new a1[16], 0);
        this.f39658h3 = true;
        this.f39662j3 = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);
        this.f39664k3 = new c();
        this.f39666l3 = new b();
        this.f39677q3 = aVar.b();
        this.f39680s3 = new d();
    }

    private final void B3(long j10, float f10, Function1<? super androidx.compose.ui.graphics.r1, Unit> function1, androidx.compose.ui.graphics.layer.c cVar) {
        if (i4().M()) {
            s0.a.g("place is called on a deactivated node");
        }
        S3(l0.e.LayingOut);
        this.f39671o = j10;
        this.f39684v = f10;
        this.f39679s = function1;
        this.f39681t = cVar;
        this.f39670n3 = false;
        x1 x1VarC = p0.c(i4());
        if (this.f39674p1 || !J()) {
            x().w(false);
            this.f39655g.N(false);
            this.f39672o3 = function1;
            this.f39677q3 = j10;
            this.f39678r3 = f10;
            this.f39676p3 = cVar;
            x1VarC.getSnapshotObserver().c(i4(), false, this.f39680s3);
        } else {
            B2().w6(j10, f10, function1, cVar);
            z3();
        }
        S3(l0.e.Idle);
        this.f39665l = true;
    }

    private final void C3(long j10, float f10, Function1<? super androidx.compose.ui.graphics.r1, Unit> function1, androidx.compose.ui.graphics.layer.c cVar) throws Throwable {
        androidx.compose.ui.layout.i2.a placementScope;
        l0 l0VarI4 = i4();
        boolean z10 = true;
        try {
            this.Z = true;
            if (!androidx.compose.ui.unit.q.k(j10, this.f39671o) || this.f39682t3) {
                if (this.f39655g.e() || this.f39655g.f() || this.f39682t3) {
                    this.f39674p1 = true;
                    this.f39682t3 = false;
                }
                o3();
            }
            x0 x0VarW2 = w2();
            if (x0VarW2 != null && x0VarW2.z2()) {
                k1 k1VarA5 = B2().a5();
                if (k1VarA5 == null || (placementScope = k1VarA5.t2()) == null) {
                    placementScope = p0.c(i4()).getPlacementScope();
                }
                androidx.compose.ui.layout.i2.a aVar = placementScope;
                x0 x0VarW3 = w2();
                Intrinsics.checkNotNull(x0VarW3);
                l0 l0VarJ0 = i4().J0();
                if (l0VarJ0 != null) {
                    l0VarJ0.k0().X(0);
                }
                x0VarW3.I3(Integer.MAX_VALUE);
                androidx.compose.ui.layout.i2.a.P(aVar, x0VarW3, androidx.compose.ui.unit.q.n(j10), androidx.compose.ui.unit.q.p(j10), 0.0f, 4, null);
            }
            x0 x0VarW4 = w2();
            if (x0VarW4 == null || x0VarW4.K2()) {
                z10 = false;
            }
            if (z10) {
                s0.a.i("Error: Placement happened before lookahead.");
            }
            B3(j10, f10, function1, cVar);
            Unit unit = Unit.f312394a;
        } catch (Throwable th2) {
            l0VarI4.Y1(th2);
            throw new kotlin.a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1() {
        l0 l0VarI4 = i4();
        androidx.compose.runtime.collection.d<l0> dVarQ0 = l0VarI4.Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var = l0VarArr[i10];
            if (l0Var.v0().f39659i != l0Var.K0()) {
                l0VarI4.E1();
                l0VarI4.X0();
                if (l0Var.K0() == Integer.MAX_VALUE) {
                    if (l0Var.k0().h()) {
                        x0 x0VarP0 = l0Var.p0();
                        Intrinsics.checkNotNull(x0VarP0);
                        x0VarP0.X2(false);
                    }
                    l0Var.v0().n3();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1() {
        this.f39655g.Y(0);
        androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            a1 a1VarV0 = l0VarArr[i10].v0();
            a1VarV0.f39659i = a1VarV0.f39661j;
            a1VarV0.f39661j = Integer.MAX_VALUE;
            a1VarV0.Z = false;
            if (a1VarV0.f39667m == l0.g.InLayoutBlock) {
                a1VarV0.f39667m = l0.g.NotUsed;
            }
        }
    }

    private final void R1(Function1<? super a1, Unit> function1) {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            function1.invoke(l0VarArr[i10].v0());
        }
    }

    private final void b4(l0 l0Var) {
        l0.g gVar;
        l0 l0VarJ0 = l0Var.J0();
        if (l0VarJ0 == null) {
            this.f39667m = l0.g.NotUsed;
            return;
        }
        if (!(this.f39667m == l0.g.NotUsed || l0Var.V())) {
            s0.a.i(r0.f39983a);
        }
        int i10 = a.f39686a[l0VarJ0.m0().ordinal()];
        if (i10 == 1) {
            gVar = l0.g.InMeasureBlock;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + l0VarJ0.m0());
            }
            gVar = l0.g.InLayoutBlock;
        }
        this.f39667m = gVar;
    }

    private final void m3() {
        boolean zJ = J();
        X3(true);
        l0 l0VarI4 = i4();
        if (!zJ) {
            l0VarI4.e0().d6();
            if (l0VarI4.w0()) {
                l0.U1(l0VarI4, true, false, false, 6, null);
            } else if (l0VarI4.o0()) {
                l0.Q1(l0VarI4, true, false, false, 6, null);
            }
        }
        k1 k1VarY4 = l0VarI4.e0().Y4();
        for (k1 k1VarF0 = l0VarI4.F0(); !Intrinsics.areEqual(k1VarF0, k1VarY4) && k1VarF0 != null; k1VarF0 = k1VarF0.Y4()) {
            if (k1VarF0.A4()) {
                k1VarF0.t5();
            }
        }
        androidx.compose.runtime.collection.d<l0> dVarQ0 = l0VarI4.Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var = l0VarArr[i10];
            if (l0Var.K0() != Integer.MAX_VALUE) {
                l0Var.v0().m3();
                l0VarI4.V1(l0Var);
            }
        }
    }

    private final void n3() {
        if (J()) {
            X3(false);
            l0 l0VarI4 = i4();
            k1 k1VarY4 = l0VarI4.e0().Y4();
            for (k1 k1VarF0 = l0VarI4.F0(); !Intrinsics.areEqual(k1VarF0, k1VarY4) && k1VarF0 != null; k1VarF0 = k1VarF0.Y4()) {
                k1VarF0.m6();
                k1VarF0.H6();
            }
            androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
            l0[] l0VarArr = dVarQ0.f35552a;
            int iR = dVarQ0.R();
            for (int i10 = 0; i10 < iR; i10++) {
                l0VarArr[i10].v0().n3();
            }
        }
    }

    private final void p3() {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var = l0VarArr[i10];
            if (l0Var.w0() && l0Var.x0() == l0.g.InMeasureBlock && l0.I1(l0Var, null, 1, null)) {
                l0.U1(i4(), false, false, false, 7, null);
            }
        }
    }

    private final void s3() {
        l0.g gVarI0;
        l0.U1(i4(), false, false, false, 7, null);
        l0 l0VarJ0 = i4().J0();
        if (l0VarJ0 == null || i4().i0() != l0.g.NotUsed) {
            return;
        }
        l0 l0VarI4 = i4();
        int i10 = a.f39686a[l0VarJ0.m0().ordinal()];
        if (i10 != 1) {
            gVarI0 = i10 != 2 ? l0VarJ0.i0() : l0.g.InLayoutBlock;
        } else {
            gVarI0 = l0.g.InMeasureBlock;
        }
        l0VarI4.e2(gVarI0);
    }

    private final x0 w2() {
        return this.f39655g.u();
    }

    @NotNull
    public final l0.g A2() {
        return this.f39667m;
    }

    public final void A3(long j10) {
        l0.e eVarV2 = v2();
        l0.e eVar = l0.e.Idle;
        if (!(eVarV2 == eVar)) {
            s0.a.i("layout state is not idle before measure starts");
        }
        this.f39662j3 = j10;
        l0.e eVar2 = l0.e.Measuring;
        S3(eVar2);
        this.f39673p0 = false;
        p0.c(i4()).getSnapshotObserver().g(i4(), false, this.f39664k3);
        if (v2() == eVar2) {
            j3();
            S3(eVar);
        }
    }

    @Override // androidx.compose.ui.node.b
    public void B0() {
        this.f39660i3 = true;
        x().s();
        if (this.f39674p1) {
            p3();
        }
        if (this.H1 || (!this.f39669n && !J0().B2() && this.f39674p1)) {
            this.f39674p1 = false;
            l0.e eVarV2 = v2();
            S3(l0.e.LayingOut);
            this.f39655g.O(false);
            l0 l0VarI4 = i4();
            p0.c(l0VarI4).getSnapshotObserver().e(l0VarI4, false, this.f39666l3);
            S3(eVarV2);
            if (J0().B2() && this.f39655g.f()) {
                requestLayout();
            }
            this.H1 = false;
        }
        if (x().o()) {
            x().v(true);
        }
        if (x().g() && x().l()) {
            x().r();
        }
        this.f39660i3 = false;
    }

    @NotNull
    public final k1 B2() {
        return this.f39655g.z();
    }

    @Override // androidx.compose.ui.layout.y
    public int D0(int i10) {
        if (!r0.a(i4())) {
            s3();
            return B2().D0(i10);
        }
        x0 x0VarW2 = w2();
        Intrinsics.checkNotNull(x0VarW2);
        return x0VarW2.D0(i10);
    }

    public final boolean E3(long j10) throws Throwable {
        l0 l0VarI4 = i4();
        try {
            if (i4().M()) {
                s0.a.g("measure is called on a deactivated node");
            }
            x1 x1VarC = p0.c(i4());
            l0 l0VarJ0 = i4().J0();
            boolean z10 = true;
            i4().Z1(i4().V() || (l0VarJ0 != null && l0VarJ0.V()));
            if (!i4().w0() && androidx.compose.ui.unit.b.g(g1(), j10)) {
                x1.i(x1VarC, i4(), false, 2, null);
                i4().X1();
                return false;
            }
            x().x(false);
            T0(e.f39693a);
            this.f39663k = true;
            long jA = B2().a();
            s1(j10);
            A3(j10);
            if (androidx.compose.ui.unit.u.h(B2().a(), jA) && B2().h1() == h1() && B2().c1() == c1()) {
                z10 = false;
            }
            q1(androidx.compose.ui.unit.u.e((((long) B2().c1()) & com.rabbitmq.client.k0.f265952a) | (((long) B2().h1()) << 32)));
            return z10;
        } catch (Throwable th2) {
            l0VarI4.Y1(th2);
            throw new kotlin.a0();
        }
    }

    public final void G3() {
        a1 a1Var;
        l0 l0VarJ0;
        try {
            this.f39657h = true;
            if (!this.f39665l) {
                s0.a.i("replace called on unplaced item");
            }
            boolean zJ = J();
            a1Var = this;
            try {
                a1Var.B3(this.f39671o, this.f39684v, this.f39679s, this.f39681t);
                if (zJ && !a1Var.f39670n3 && (l0VarJ0 = a1Var.i4().J0()) != null) {
                    l0.S1(l0VarJ0, false, 1, null);
                }
                a1Var.f39657h = false;
            } catch (Throwable th2) {
                th = th2;
                try {
                    a1Var.i4().Y1(th);
                    throw new kotlin.a0();
                } catch (Throwable th3) {
                    a1Var.f39657h = false;
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            a1Var = this;
        }
    }

    @Override // androidx.compose.ui.node.f1
    public boolean H0() {
        return this.f39683u3;
    }

    public final void I3(boolean z10) {
        this.f39658h3 = z10;
    }

    @Override // androidx.compose.ui.node.b
    public boolean J() {
        return this.Y;
    }

    @Override // androidx.compose.ui.node.b
    @NotNull
    public k1 J0() {
        return i4().e0();
    }

    @NotNull
    public final Function0<Unit> K2() {
        return this.f39664k3;
    }

    @Override // androidx.compose.ui.layout.y
    public int L0(int i10) {
        if (!r0.a(i4())) {
            s3();
            return B2().L0(i10);
        }
        x0 x0VarW2 = w2();
        Intrinsics.checkNotNull(x0VarW2);
        return x0VarW2.L0(i10);
    }

    @Override // androidx.compose.ui.layout.e1
    public int M(@NotNull androidx.compose.ui.layout.a aVar) {
        l0 l0VarJ0 = i4().J0();
        if ((l0VarJ0 != null ? l0VarJ0.m0() : null) == l0.e.Measuring) {
            x().z(true);
        } else {
            l0 l0VarJ1 = i4().J0();
            if ((l0VarJ1 != null ? l0VarJ1.m0() : null) == l0.e.LayingOut) {
                x().y(true);
            }
        }
        this.f39669n = true;
        int iM = B2().M(aVar);
        this.f39669n = false;
        return iM;
    }

    @Override // androidx.compose.ui.layout.y
    public int M0(int i10) {
        if (!r0.a(i4())) {
            s3();
            return B2().M0(i10);
        }
        x0 x0VarW2 = w2();
        Intrinsics.checkNotNull(x0VarW2);
        return x0VarW2.M0(i10);
    }

    public final int N2() {
        return this.f39661j;
    }

    public final boolean O2() {
        return this.f39665l;
    }

    @Override // androidx.compose.ui.node.b
    @NotNull
    public Map<androidx.compose.ui.layout.a, Integer> P() {
        if (!this.f39669n) {
            if (v2() == l0.e.Measuring) {
                x().x(true);
                if (x().g()) {
                    j3();
                }
            } else {
                x().w(true);
            }
        }
        J0().Y2(true);
        B0();
        J0().Y2(false);
        return x().h();
    }

    @Override // androidx.compose.ui.layout.z0
    @NotNull
    public androidx.compose.ui.layout.i2 P0(long j10) throws Throwable {
        l0.g gVarI0 = i4().i0();
        l0.g gVar = l0.g.NotUsed;
        if (gVarI0 == gVar) {
            i4().C();
        }
        if (r0.a(i4())) {
            x0 x0VarW2 = w2();
            Intrinsics.checkNotNull(x0VarW2);
            x0VarW2.G3(gVar);
            x0VarW2.P0(j10);
        }
        b4(i4());
        E3(j10);
        return this;
    }

    public final void R3(boolean z10) {
        this.f39669n = z10;
    }

    @NotNull
    public final List<a1> S1() {
        i4().r2();
        if (!this.f39658h3) {
            return this.f39656g3.q();
        }
        l0 l0VarI4 = i4();
        androidx.compose.runtime.collection.d<a1> dVar = this.f39656g3;
        androidx.compose.runtime.collection.d<l0> dVarQ0 = l0VarI4.Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var = l0VarArr[i10];
            if (dVar.R() <= i10) {
                dVar.d(l0Var.k0().v());
            } else {
                dVar.x0(i10, l0Var.k0().v());
            }
        }
        dVar.t0(l0VarI4.Z().size(), dVar.R());
        this.f39658h3 = false;
        return this.f39656g3.q();
    }

    public final void S3(@NotNull l0.e eVar) {
        this.f39655g.R(eVar);
    }

    @Override // androidx.compose.ui.node.b
    public void T0(@NotNull Function1<? super androidx.compose.ui.node.b, Unit> function1) {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            function1.invoke(l0VarArr[i10].k0().b());
        }
    }

    public final boolean T1() {
        return this.f39658h3;
    }

    public final void T3(@NotNull l0.g gVar) {
        this.f39667m = gVar;
    }

    public final int V2() {
        return this.f39659i;
    }

    public final float W2() {
        return this.f39668m3;
    }

    public final void X2(boolean z10) {
        l0 l0Var;
        l0 l0VarJ0 = i4().J0();
        l0.g gVarI0 = i4().i0();
        if (l0VarJ0 != null && gVarI0 != l0.g.NotUsed) {
            do {
                l0Var = l0VarJ0;
                if (l0Var.i0() != gVarI0) {
                    break;
                } else {
                    l0VarJ0 = l0Var.J0();
                }
            } while (l0VarJ0 != null);
            int i10 = a.f39687b[gVarI0.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                l0Var.R1(z10);
                return;
            }
            l0.U1(l0Var, z10, false, false, 6, null);
        }
    }

    public void X3(boolean z10) {
        this.Y = z10;
    }

    public final void Y2() {
        this.f39685w = true;
    }

    public final void Y3(boolean z10) {
        this.Z = z10;
    }

    @Override // androidx.compose.ui.node.f1
    public void Z(boolean z10) {
        if (z10 != B2().H0()) {
            B2().X2(z10);
            this.f39682t3 = true;
        }
        a4(z10);
    }

    public final boolean Z2() {
        return this.Z;
    }

    public void a4(boolean z10) {
        this.f39683u3 = z10;
    }

    @Override // androidx.compose.ui.layout.i2, androidx.compose.ui.layout.e1
    public int b0() {
        return B2().b0();
    }

    public final boolean b2() {
        return this.f39669n;
    }

    @Override // androidx.compose.ui.layout.e1, androidx.compose.ui.layout.y
    @Nullable
    public Object c() {
        return this.X;
    }

    public final void c3() {
        this.f39655g.P(true);
    }

    public final boolean c4() {
        if ((c() != null || B2().c() != null) && this.f39685w) {
            this.f39685w = false;
            this.X = B2().c();
            return true;
        }
        return false;
    }

    @NotNull
    public final l0 i4() {
        return this.f39655g.l();
    }

    public final void j3() {
        this.f39674p1 = true;
        this.H1 = true;
    }

    public final void k3() {
        this.f39673p0 = true;
    }

    @Nullable
    public final androidx.compose.ui.unit.b l2() {
        if (this.f39663k) {
            return androidx.compose.ui.unit.b.a(g1());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.b
    public void n0() {
        l0.U1(i4(), false, false, false, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i2
    public void n1(long j10, float f10, @NotNull androidx.compose.ui.graphics.layer.c cVar) throws Throwable {
        C3(j10, f10, null, cVar);
    }

    public final void o3() {
        if (this.f39655g.c() > 0) {
            androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
            l0[] l0VarArr = dVarQ0.f35552a;
            int iR = dVarQ0.R();
            for (int i10 = 0; i10 < iR; i10++) {
                l0 l0Var = l0VarArr[i10];
                q0 q0VarK0 = l0Var.k0();
                if ((q0VarK0.f() || q0VarK0.e()) && !q0VarK0.m()) {
                    boolean z10 = true;
                    l0.S1(l0Var, false, 1, null);
                }
                q0VarK0.v().o3();
            }
        }
    }

    @Override // androidx.compose.ui.layout.y
    public int p0(int i10) {
        if (!r0.a(i4())) {
            s3();
            return B2().p0(i10);
        }
        x0 x0VarW2 = w2();
        Intrinsics.checkNotNull(x0VarW2);
        return x0VarW2.p0(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i2
    public void p1(long j10, float f10, @Nullable Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) throws Throwable {
        C3(j10, f10, function1, null);
    }

    @Override // androidx.compose.ui.layout.i2, androidx.compose.ui.layout.e1
    public int q0() {
        return B2().q0();
    }

    public final long q2() {
        return this.f39671o;
    }

    @Override // androidx.compose.ui.node.b
    public void requestLayout() {
        l0.S1(i4(), false, 1, null);
    }

    @Override // androidx.compose.ui.node.b
    @Nullable
    public androidx.compose.ui.node.b t0() {
        q0 q0VarK0;
        l0 l0VarJ0 = i4().J0();
        if (l0VarJ0 == null || (q0VarK0 = l0VarJ0.k0()) == null) {
            return null;
        }
        return q0VarK0.b();
    }

    public final boolean t2() {
        return this.f39660i3;
    }

    public final boolean u2() {
        return this.f39674p1;
    }

    @NotNull
    public final l0.e v2() {
        return this.f39655g.n();
    }

    public final void v3() {
        this.f39661j = Integer.MAX_VALUE;
        this.f39659i = Integer.MAX_VALUE;
        X3(false);
    }

    @Override // androidx.compose.ui.node.b
    @NotNull
    public androidx.compose.ui.node.a x() {
        return this.f39675p2;
    }

    public final boolean z2() {
        return this.f39673p0;
    }

    public final void z3() {
        this.f39670n3 = true;
        l0 l0VarJ0 = i4().J0();
        float fC5 = J0().c5();
        l0 l0VarI4 = i4();
        k1 k1VarF0 = l0VarI4.F0();
        k1 k1VarE0 = l0VarI4.e0();
        while (k1VarF0 != k1VarE0) {
            Intrinsics.checkNotNull(k1VarF0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            h0 h0Var = (h0) k1VarF0;
            fC5 += h0Var.c5();
            k1VarF0 = h0Var.Y4();
        }
        if (fC5 != this.f39668m3) {
            this.f39668m3 = fC5;
            if (l0VarJ0 != null) {
                l0VarJ0.E1();
            }
            if (l0VarJ0 != null) {
                l0VarJ0.X0();
            }
        }
        if (J()) {
            i4().e0().d6();
        } else {
            if (l0VarJ0 != null) {
                l0VarJ0.X0();
            }
            m3();
            if (this.f39657h && l0VarJ0 != null) {
                l0.S1(l0VarJ0, false, 1, null);
            }
        }
        if (l0VarJ0 == null) {
            this.f39661j = 0;
        } else if (!this.f39657h && l0VarJ0.m0() == l0.e.LayingOut) {
            if (!(this.f39661j == Integer.MAX_VALUE)) {
                s0.a.i("Place was called on a node which was placed already");
            }
            this.f39661j = l0VarJ0.k0().y();
            q0 q0VarK0 = l0VarJ0.k0();
            q0VarK0.Y(q0VarK0.y() + 1);
        }
        B0();
    }
}
