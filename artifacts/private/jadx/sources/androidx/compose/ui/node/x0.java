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
@SourceDebugExtension({"SMAP\nLookaheadPassDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadPassDelegate.kt\nandroidx/compose/ui/node/LookaheadPassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 10 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,858:1\n211#1:888\n211#1:898\n211#1:964\n1085#2,2:859\n391#3:861\n392#3,6:868\n398#3,2:877\n210#4:862\n207#4:879\n207#4:889\n207#4:899\n207#4:908\n207#4:917\n207#4:965\n207#4:974\n207#4:983\n436#5,5:863\n441#5,3:874\n424#5,8:880\n424#5,8:890\n424#5,8:900\n424#5,8:909\n424#5,8:918\n424#5,8:966\n424#5,8:975\n424#5,8:984\n57#6,4:926\n103#6,4:932\n57#6,4:938\n103#6,4:953\n57#6,4:960\n57#6,4:992\n1573#7,2:930\n1575#7,3:948\n1573#7,2:951\n1575#7,3:957\n30#8:936\n30#8:942\n80#9:937\n80#9:943\n85#9:945\n90#9:947\n54#10:944\n59#10:946\n*S KotlinDebug\n*F\n+ 1 LookaheadPassDelegate.kt\nandroidx/compose/ui/node/LookaheadPassDelegate\n*L\n277#1:888\n316#1:898\n744#1:964\n160#1:859,2\n200#1:861\n200#1:868,6\n200#1:877,2\n200#1:862\n211#1:879\n277#1:889\n316#1:899\n343#1:908\n367#1:917\n744#1:965\n777#1:974\n812#1:983\n200#1:863,5\n200#1:874,3\n211#1:880,8\n277#1:890,8\n316#1:900,8\n343#1:909,8\n367#1:918,8\n744#1:966,8\n777#1:975,8\n812#1:984,8\n407#1:926,4\n456#1:932,4\n477#1:938,4\n535#1:953,4\n725#1:960,4\n831#1:992,4\n455#1:930,2\n455#1:948,3\n530#1:951,2\n530#1:957,3\n474#1:936\n482#1:942\n474#1:937\n482#1:943\n484#1:945\n485#1:947\n484#1:944\n485#1:946\n*E\n"})
public final class x0 extends androidx.compose.ui.layout.i2 implements androidx.compose.ui.layout.z0, androidx.compose.ui.node.b, f1 {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f40059i3 = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final q0 f40060g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f40061g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f40062h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f40063h3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f40067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f40068m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f40069n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.b f40070o;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f40072p1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f40075t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private Function1<? super androidx.compose.ui.graphics.r1, Unit> f40076v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.layer.c f40077w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f40064i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f40065j = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private l0.g f40066k = l0.g.NotUsed;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f40074s = androidx.compose.ui.unit.q.f42709b.b();

    @NotNull
    private a X = a.IsNotPlaced;

    @NotNull
    private final androidx.compose.ui.node.a Y = new t0(this);

    @NotNull
    private final androidx.compose.runtime.collection.d<x0> Z = new androidx.compose.runtime.collection.d<>(new x0[16], 0);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f40071p0 = true;
    private boolean H1 = true;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private Object f40073p2 = u2().c();

    private enum a {
        IsPlacedInLookahead,
        IsPlacedInApproach,
        IsNotPlaced;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f40082e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f40082e;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f40084b;

        static {
            int[] iArr = new int[l0.e.values().length];
            try {
                iArr[l0.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l0.e.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l0.e.LayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l0.e.LookaheadLayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f40083a = iArr;
            int[] iArr2 = new int[l0.g.values().length];
            try {
                iArr2[l0.g.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[l0.g.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f40084b = iArr2;
        }
    }

    @SourceDebugExtension({"SMAP\nLookaheadPassDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadPassDelegate.kt\nandroidx/compose/ui/node/LookaheadPassDelegate$layoutChildren$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,858:1\n35#2,5:859\n35#2,5:864\n*S KotlinDebug\n*F\n+ 1 LookaheadPassDelegate.kt\nandroidx/compose/ui/node/LookaheadPassDelegate$layoutChildren$1\n*L\n240#1:859,5\n246#1:864,5\n*E\n"})
    static final class c extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f40086b;

        static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.node.b, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40087a = new a();

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

        static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.node.b, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f40088a = new b();

            b() {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(v0 v0Var) {
            super(0);
            this.f40086b = v0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            x0.this.I1();
            x0.this.T0(a.f40087a);
            v0 v0VarN4 = x0.this.J0().N4();
            if (v0VarN4 != null) {
                boolean zB2 = v0VarN4.B2();
                List<l0> listZ = x0.this.i4().Z();
                int size = listZ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    v0 v0VarN5 = listZ.get(i10).F0().N4();
                    if (v0VarN5 != null) {
                        v0VarN5.Y2(zB2);
                    }
                }
            }
            this.f40086b.l2().y();
            v0 v0VarN6 = x0.this.J0().N4();
            if (v0VarN6 != null) {
                v0VarN6.B2();
                List<l0> listZ2 = x0.this.i4().Z();
                int size2 = listZ2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    v0 v0VarN7 = listZ2.get(i11).F0().N4();
                    if (v0VarN7 != null) {
                        v0VarN7.Y2(false);
                    }
                }
            }
            x0.this.H1();
            x0.this.T0(b.f40088a);
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f40090b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10) {
            super(0);
            this.f40090b = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            v0 v0VarN4 = x0.this.A2().N4();
            Intrinsics.checkNotNull(v0VarN4);
            v0VarN4.P0(this.f40090b);
        }
    }

    @SourceDebugExtension({"SMAP\nLookaheadPassDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadPassDelegate.kt\nandroidx/compose/ui/node/LookaheadPassDelegate$placeSelf$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,858:1\n1#2:859\n*E\n"})
    static final class e extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x1 f40092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f40093c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(x1 x1Var, long j10) {
            super(0);
            this.f40092b = x1Var;
            this.f40093c = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            v0 v0VarN4;
            androidx.compose.ui.layout.i2.a aVarT2 = null;
            if (r0.a(x0.this.i4()) || x0.this.f40060g.h()) {
                k1 k1VarA5 = x0.this.A2().a5();
                if (k1VarA5 != null) {
                    aVarT2 = k1VarA5.t2();
                }
            } else {
                k1 k1VarA6 = x0.this.A2().a5();
                if (k1VarA6 != null && (v0VarN4 = k1VarA6.N4()) != null) {
                    aVarT2 = v0VarN4.t2();
                }
            }
            if (aVarT2 == null) {
                aVarT2 = this.f40092b.getPlacementScope();
            }
            x0 x0Var = x0.this;
            long j10 = this.f40093c;
            v0 v0VarN5 = x0Var.A2().N4();
            Intrinsics.checkNotNull(v0VarN5);
            androidx.compose.ui.layout.i2.a.V(aVarT2, v0VarN5, j10, 0.0f, 2, null);
        }
    }

    static final class f extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.node.b, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f40094a = new f();

        f() {
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

    public x0(@NotNull q0 q0Var) {
        this.f40060g = q0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k1 A2() {
        return this.f40060g.z();
    }

    private final void A3(boolean z10) {
        this.f40060g.U(z10);
    }

    private final void B3(boolean z10) {
        this.f40060g.V(z10);
    }

    private final void C3(l0.e eVar) {
        this.f40060g.R(eVar);
    }

    private final void E3(boolean z10) {
        this.f40060g.W(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1() {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            x0 x0VarU = l0VarArr[i10].k0().u();
            Intrinsics.checkNotNull(x0VarU);
            int i11 = x0VarU.f40064i;
            int i12 = x0VarU.f40065j;
            if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                x0VarU.X2(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1() {
        this.f40060g.X(0);
        androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            x0 x0VarU = l0VarArr[i10].k0().u();
            Intrinsics.checkNotNull(x0VarU);
            x0VarU.f40064i = x0VarU.f40065j;
            x0VarU.f40065j = Integer.MAX_VALUE;
            if (x0VarU.f40066k == l0.g.InLayoutBlock) {
                x0VarU.f40066k = l0.g.NotUsed;
            }
        }
    }

    private final void J1(Function1<? super x0, Unit> function1) {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            x0 x0VarU = l0VarArr[i10].k0().u();
            Intrinsics.checkNotNull(x0VarU);
            function1.invoke(x0VarU);
        }
    }

    private final boolean S1() {
        return this.f40060g.h();
    }

    private final void T3(l0 l0Var) {
        l0.g gVar;
        l0 l0VarJ0 = l0Var.J0();
        if (l0VarJ0 == null) {
            this.f40066k = l0.g.NotUsed;
            return;
        }
        if (!(this.f40066k == l0.g.NotUsed || l0Var.V())) {
            s0.a.i(r0.f39983a);
        }
        int i10 = b.f40083a[l0VarJ0.m0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            gVar = l0.g.InMeasureBlock;
        } else {
            if (i10 != 3 && i10 != 4) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + l0VarJ0.m0());
            }
            gVar = l0.g.InLayoutBlock;
        }
        this.f40066k = gVar;
    }

    private final void Y2() {
        a aVar = this.X;
        if (S1()) {
            this.X = a.IsPlacedInApproach;
        } else {
            this.X = a.IsPlacedInLookahead;
        }
        if (aVar != a.IsPlacedInLookahead && this.f40060g.t()) {
            int i10 = 1 << 0;
            l0.Q1(i4(), true, false, false, 6, null);
        }
        androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i11 = 0; i11 < iR; i11++) {
            l0 l0Var = l0VarArr[i11];
            x0 x0VarP0 = l0Var.p0();
            if (x0VarP0 == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (x0VarP0.f40065j != Integer.MAX_VALUE) {
                x0VarP0.Y2();
                l0Var.V1(l0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l0 i4() {
        return this.f40060g.l();
    }

    private final void j3() {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var = l0VarArr[i10];
            if (l0Var.o0() && l0Var.y0() == l0.g.InMeasureBlock) {
                x0 x0VarU = l0Var.k0().u();
                Intrinsics.checkNotNull(x0VarU);
                androidx.compose.ui.unit.b bVarK = l0Var.k0().k();
                Intrinsics.checkNotNull(bVarK);
                if (x0VarU.s3(bVarK.x())) {
                    l0.Q1(i4(), false, false, false, 7, null);
                }
            }
        }
    }

    private final void k3() {
        l0.g gVarI0;
        l0.Q1(i4(), false, false, false, 7, null);
        l0 l0VarJ0 = i4().J0();
        if (l0VarJ0 == null || i4().i0() != l0.g.NotUsed) {
            return;
        }
        l0 l0VarI4 = i4();
        int i10 = b.f40083a[l0VarJ0.m0().ordinal()];
        if (i10 != 2) {
            gVarI0 = i10 != 3 ? l0VarJ0.i0() : l0.g.InLayoutBlock;
        } else {
            gVarI0 = l0.g.InMeasureBlock;
        }
        l0VarI4.e2(gVarI0);
    }

    private final boolean l2() {
        return this.f40060g.r();
    }

    private final void p3(long j10, float f10, Function1<? super androidx.compose.ui.graphics.r1, Unit> function1, androidx.compose.ui.graphics.layer.c cVar) throws Throwable {
        l0 l0VarI4 = i4();
        try {
            l0 l0VarJ0 = i4().J0();
            l0.e eVarM0 = l0VarJ0 != null ? l0VarJ0.m0() : null;
            l0.e eVar = l0.e.LookaheadLayingOut;
            if (eVarM0 == eVar) {
                this.f40060g.Q(false);
            }
            if (i4().M()) {
                s0.a.g("place is called on a deactivated node");
            }
            C3(eVar);
            this.f40068m = true;
            this.f40063h3 = false;
            if (!androidx.compose.ui.unit.q.k(j10, this.f40074s)) {
                if (this.f40060g.p() || this.f40060g.q()) {
                    A3(true);
                }
                Z2();
            }
            x1 x1VarC = p0.c(i4());
            if (l2() || !J()) {
                this.f40060g.S(false);
                x().w(false);
                z1.d(x1VarC.getSnapshotObserver(), i4(), false, new e(x1VarC, j10), 2, null);
            } else {
                v0 v0VarN4 = A2().N4();
                Intrinsics.checkNotNull(v0VarN4);
                v0VarN4.B3(j10);
                n3();
            }
            this.f40074s = j10;
            this.f40075t = f10;
            this.f40076v = function1;
            this.f40077w = cVar;
            C3(l0.e.Idle);
            Unit unit = Unit.f312394a;
        } catch (Throwable th2) {
            l0VarI4.Y1(th2);
            throw new kotlin.a0();
        }
    }

    private final boolean q2() {
        return this.f40060g.s();
    }

    private final l0.e t2() {
        return this.f40060g.n();
    }

    private final boolean v2() {
        return this.f40060g.t();
    }

    @Override // androidx.compose.ui.node.b
    public void B0() {
        this.f40072p1 = true;
        x().s();
        if (l2()) {
            j3();
        }
        v0 v0VarN4 = J0().N4();
        Intrinsics.checkNotNull(v0VarN4);
        if (q2() || (!this.f40067l && !v0VarN4.B2() && l2())) {
            A3(false);
            l0.e eVarT2 = t2();
            C3(l0.e.LookaheadLayingOut);
            x1 x1VarC = p0.c(i4());
            this.f40060g.T(false);
            z1.f(x1VarC.getSnapshotObserver(), i4(), false, new c(v0VarN4), 2, null);
            C3(eVarT2);
            if (this.f40060g.q() && v0VarN4.B2()) {
                requestLayout();
            }
            B3(false);
        }
        if (x().o()) {
            x().v(true);
        }
        if (x().g() && x().l()) {
            x().r();
        }
        this.f40072p1 = false;
    }

    public final int B2() {
        return this.f40065j;
    }

    @Override // androidx.compose.ui.layout.y
    public int D0(int i10) {
        k3();
        v0 v0VarN4 = A2().N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.D0(i10);
    }

    public final void G3(@NotNull l0.g gVar) {
        this.f40066k = gVar;
    }

    @Override // androidx.compose.ui.node.f1
    public boolean H0() {
        return this.f40061g3;
    }

    public final void I3(int i10) {
        this.f40065j = i10;
    }

    @Override // androidx.compose.ui.node.b
    public boolean J() {
        return this.X != a.IsNotPlaced;
    }

    @Override // androidx.compose.ui.node.b
    @NotNull
    public k1 J0() {
        return i4().e0();
    }

    public final boolean K2() {
        return this.f40068m;
    }

    @Override // androidx.compose.ui.layout.y
    public int L0(int i10) {
        k3();
        v0 v0VarN4 = A2().N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.L0(i10);
    }

    @Override // androidx.compose.ui.layout.e1
    public int M(@NotNull androidx.compose.ui.layout.a aVar) {
        l0 l0VarJ0 = i4().J0();
        if ((l0VarJ0 != null ? l0VarJ0.m0() : null) == l0.e.LookaheadMeasuring) {
            x().z(true);
        } else {
            l0 l0VarJ1 = i4().J0();
            if ((l0VarJ1 != null ? l0VarJ1.m0() : null) == l0.e.LookaheadLayingOut) {
                x().y(true);
            }
        }
        this.f40067l = true;
        v0 v0VarN4 = A2().N4();
        Intrinsics.checkNotNull(v0VarN4);
        int iM = v0VarN4.M(aVar);
        this.f40067l = false;
        return iM;
    }

    @Override // androidx.compose.ui.layout.y
    public int M0(int i10) {
        k3();
        v0 v0VarN4 = A2().N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.M0(i10);
    }

    @NotNull
    public final List<x0> M1() {
        i4().Z();
        if (!this.f40071p0) {
            return this.Z.q();
        }
        l0 l0VarI4 = i4();
        androidx.compose.runtime.collection.d<x0> dVar = this.Z;
        androidx.compose.runtime.collection.d<l0> dVarQ0 = l0VarI4.Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var = l0VarArr[i10];
            if (dVar.R() <= i10) {
                x0 x0VarU = l0Var.k0().u();
                Intrinsics.checkNotNull(x0VarU);
                dVar.d(x0VarU);
            } else {
                x0 x0VarU2 = l0Var.k0().u();
                Intrinsics.checkNotNull(x0VarU2);
                dVar.x0(i10, x0VarU2);
            }
        }
        dVar.t0(l0VarI4.Z().size(), dVar.R());
        this.f40071p0 = false;
        return this.Z.q();
    }

    public final void N2(boolean z10) {
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
            int i10 = b.f40084b[gVarI0.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                if (l0Var.t0() != null) {
                    l0Var.N1(z10);
                    return;
                } else {
                    l0Var.R1(z10);
                    return;
                }
            }
            if (l0Var.t0() != null) {
                int i11 = 7 >> 0;
                l0.Q1(l0Var, z10, false, false, 6, null);
                return;
            }
            l0.U1(l0Var, z10, false, false, 6, null);
        }
    }

    public final void O2() {
        this.H1 = true;
    }

    @Override // androidx.compose.ui.node.b
    @NotNull
    public Map<androidx.compose.ui.layout.a, Integer> P() {
        if (!this.f40067l) {
            if (t2() == l0.e.LookaheadMeasuring) {
                x().x(true);
                if (x().g()) {
                    this.f40060g.E();
                }
            } else {
                x().w(true);
            }
        }
        v0 v0VarN4 = J0().N4();
        if (v0VarN4 != null) {
            v0VarN4.Y2(true);
        }
        B0();
        v0 v0VarN5 = J0().N4();
        if (v0VarN5 != null) {
            v0VarN5.Y2(false);
        }
        return x().h();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // androidx.compose.ui.layout.z0
    @NotNull
    public androidx.compose.ui.layout.i2 P0(long j10) {
        l0 l0VarJ0 = i4().J0();
        if ((l0VarJ0 != null ? l0VarJ0.m0() : null) == l0.e.LookaheadMeasuring) {
            this.f40060g.P(false);
        } else {
            l0 l0VarJ1 = i4().J0();
            if ((l0VarJ1 != null ? l0VarJ1.m0() : null) == l0.e.LookaheadLayingOut) {
                this.f40060g.P(false);
            }
        }
        T3(i4());
        if (i4().i0() == l0.g.NotUsed) {
            i4().C();
        }
        s3(j10);
        return this;
    }

    public final boolean R1() {
        return this.f40071p0;
    }

    public final void R3(boolean z10) {
        this.f40068m = z10;
    }

    public void S3(boolean z10) {
        this.f40061g3 = z10;
    }

    @Override // androidx.compose.ui.node.b
    public void T0(@NotNull Function1<? super androidx.compose.ui.node.b, Unit> function1) {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            androidx.compose.ui.node.b bVarO = l0VarArr[i10].k0().o();
            Intrinsics.checkNotNull(bVarO);
            function1.invoke(bVarO);
        }
    }

    @Nullable
    public final androidx.compose.ui.unit.b T1() {
        return this.f40070o;
    }

    public final void V2() {
        A3(true);
        B3(true);
    }

    public final void W2() {
        E3(true);
    }

    public final void X2(boolean z10) {
        if (z10 && S1()) {
            return;
        }
        if (z10 || S1()) {
            this.X = a.IsNotPlaced;
            androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
            l0[] l0VarArr = dVarQ0.f35552a;
            int iR = dVarQ0.R();
            for (int i10 = 0; i10 < iR; i10++) {
                x0 x0VarU = l0VarArr[i10].k0().u();
                Intrinsics.checkNotNull(x0VarU);
                x0VarU.X2(true);
            }
        }
    }

    public final boolean X3() {
        if (c() == null) {
            v0 v0VarN4 = A2().N4();
            Intrinsics.checkNotNull(v0VarN4);
            if (v0VarN4.c() == null) {
                return false;
            }
        }
        if (!this.H1) {
            return false;
        }
        this.H1 = false;
        v0 v0VarN5 = A2().N4();
        Intrinsics.checkNotNull(v0VarN5);
        this.f40073p2 = v0VarN5.c();
        return true;
    }

    @Override // androidx.compose.ui.node.f1
    public void Z(boolean z10) {
        v0 v0VarN4;
        v0 v0VarN5 = A2().N4();
        if (!Intrinsics.areEqual(Boolean.valueOf(z10), v0VarN5 != null ? Boolean.valueOf(v0VarN5.H0()) : null) && (v0VarN4 = A2().N4()) != null) {
            v0VarN4.X2(z10);
        }
        S3(z10);
    }

    public final void Z2() {
        if (this.f40060g.d() > 0) {
            androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
            l0[] l0VarArr = dVarQ0.f35552a;
            int iR = dVarQ0.R();
            for (int i10 = 0; i10 < iR; i10++) {
                l0 l0Var = l0VarArr[i10];
                q0 q0VarK0 = l0Var.k0();
                if ((q0VarK0.q() || q0VarK0.p()) && !q0VarK0.r()) {
                    l0.O1(l0Var, false, 1, null);
                }
                x0 x0VarU = q0VarK0.u();
                if (x0VarU != null) {
                    x0VarU.Z2();
                }
            }
        }
    }

    @Override // androidx.compose.ui.layout.i2, androidx.compose.ui.layout.e1
    public int b0() {
        v0 v0VarN4 = A2().N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.b0();
    }

    public final boolean b2() {
        return this.f40072p1;
    }

    @Override // androidx.compose.ui.layout.e1, androidx.compose.ui.layout.y
    @Nullable
    public Object c() {
        return this.f40073p2;
    }

    public final void c3() {
        this.X = a.IsPlacedInLookahead;
    }

    public final void m3() {
        this.f40065j = Integer.MAX_VALUE;
        this.f40064i = Integer.MAX_VALUE;
        this.X = a.IsNotPlaced;
    }

    @Override // androidx.compose.ui.node.b
    public void n0() {
        l0.Q1(i4(), false, false, false, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i2
    public void n1(long j10, float f10, @NotNull androidx.compose.ui.graphics.layer.c cVar) throws Throwable {
        p3(j10, f10, null, cVar);
    }

    public final void n3() {
        this.f40063h3 = true;
        l0 l0VarJ0 = i4().J0();
        if ((this.X != a.IsPlacedInLookahead && !S1()) || (this.X != a.IsPlacedInApproach && S1())) {
            Y2();
            if (this.f40062h && l0VarJ0 != null) {
                l0.O1(l0VarJ0, false, 1, null);
            }
        }
        if (l0VarJ0 == null) {
            this.f40065j = 0;
        } else if (!this.f40062h && (l0VarJ0.m0() == l0.e.LayingOut || l0VarJ0.m0() == l0.e.LookaheadLayingOut)) {
            if (!(this.f40065j == Integer.MAX_VALUE)) {
                s0.a.i("Place was called on a node which was placed already");
            }
            this.f40065j = l0VarJ0.k0().x();
            q0 q0VarK0 = l0VarJ0.k0();
            q0VarK0.X(q0VarK0.x() + 1);
        }
        B0();
    }

    public final void o3(long j10) {
        C3(l0.e.LookaheadMeasuring);
        E3(false);
        z1.h(p0.c(i4()).getSnapshotObserver(), i4(), false, new d(j10), 2, null);
        V2();
        if (r0.a(i4())) {
            u2().j3();
        } else {
            u2().k3();
        }
        C3(l0.e.Idle);
    }

    @Override // androidx.compose.ui.layout.y
    public int p0(int i10) {
        k3();
        v0 v0VarN4 = A2().N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.p0(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i2
    public void p1(long j10, float f10, @Nullable Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) throws Throwable {
        p3(j10, f10, function1, null);
    }

    @Override // androidx.compose.ui.layout.i2, androidx.compose.ui.layout.e1
    public int q0() {
        v0 v0VarN4 = A2().N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.q0();
    }

    @Override // androidx.compose.ui.node.b
    public void requestLayout() {
        l0.O1(i4(), false, 1, null);
    }

    public final boolean s3(long j10) throws Throwable {
        long jE;
        l0 l0VarI4 = i4();
        try {
            if (i4().M()) {
                s0.a.g("measure is called on a deactivated node");
            }
            l0 l0VarJ0 = i4().J0();
            int i10 = 3 | 0;
            i4().Z1(i4().V() || (l0VarJ0 != null && l0VarJ0.V()));
            if (!i4().o0()) {
                androidx.compose.ui.unit.b bVar = this.f40070o;
                if (bVar == null ? false : androidx.compose.ui.unit.b.g(bVar.x(), j10)) {
                    x1 x1VarI0 = i4().I0();
                    if (x1VarI0 != null) {
                        x1VarI0.H(i4(), true);
                    }
                    i4().X1();
                    return false;
                }
            }
            this.f40070o = androidx.compose.ui.unit.b.a(j10);
            s1(j10);
            x().x(false);
            T0(f.f40094a);
            if (this.f40069n) {
                jE = f1();
            } else {
                long j11 = Integer.MIN_VALUE;
                jE = androidx.compose.ui.unit.u.e((j11 & com.rabbitmq.client.k0.f265952a) | (j11 << 32));
            }
            this.f40069n = true;
            v0 v0VarN4 = A2().N4();
            if (!(v0VarN4 != null)) {
                s0.a.i("Lookahead result from lookaheadRemeasure cannot be null");
            }
            this.f40060g.J(j10);
            q1(androidx.compose.ui.unit.u.e((((long) v0VarN4.c1()) & com.rabbitmq.client.k0.f265952a) | (((long) v0VarN4.h1()) << 32)));
            return (((int) (jE >> 32)) == v0VarN4.h1() && ((int) (jE & com.rabbitmq.client.k0.f265952a)) == v0VarN4.c1()) ? false : true;
        } catch (Throwable th2) {
            l0VarI4.Y1(th2);
            throw new kotlin.a0();
        }
    }

    @Override // androidx.compose.ui.node.b
    @Nullable
    public androidx.compose.ui.node.b t0() {
        q0 q0VarK0;
        l0 l0VarJ0 = i4().J0();
        if (l0VarJ0 == null || (q0VarK0 = l0VarJ0.k0()) == null) {
            return null;
        }
        return q0VarK0.o();
    }

    @NotNull
    public final a1 u2() {
        return this.f40060g.v();
    }

    public final void v3() {
        x0 x0Var;
        l0 l0VarJ0;
        try {
            this.f40062h = true;
            if (!this.f40068m) {
                s0.a.i("replace() called on item that was not placed");
            }
            this.f40063h3 = false;
            boolean zJ = J();
            x0Var = this;
            try {
                x0Var.p3(this.f40074s, 0.0f, this.f40076v, this.f40077w);
                if (zJ && !x0Var.f40063h3 && (l0VarJ0 = x0Var.i4().J0()) != null) {
                    l0.O1(l0VarJ0, false, 1, null);
                }
                x0Var.f40062h = false;
            } catch (Throwable th2) {
                th = th2;
                x0Var.f40062h = false;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            x0Var = this;
        }
    }

    @NotNull
    public final l0.g w2() {
        return this.f40066k;
    }

    @Override // androidx.compose.ui.node.b
    @NotNull
    public androidx.compose.ui.node.a x() {
        return this.Y;
    }

    public final boolean z2() {
        if (r0.a(i4())) {
            return true;
        }
        if (this.X == a.IsNotPlaced && !this.f40060g.g()) {
            this.f40060g.Q(true);
        }
        return S1();
    }

    public final void z3(boolean z10) {
        this.f40071p0 = z10;
    }
}
