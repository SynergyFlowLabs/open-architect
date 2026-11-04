package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 7 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n1#1,250:1\n312#2,2:251\n207#3:253\n424#4,8:254\n424#4,8:263\n209#4,7:274\n1#5:262\n139#6:271\n238#7,2:272\n240#7,2:281\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n*L\n120#1:251,2\n123#1:253\n123#1:254,8\n175#1:263,8\n213#1:274,7\n201#1:271\n209#1:272,2\n209#1:281,2\n*E\n"})
public final class y extends k1 {

    @NotNull
    public static final a J3 = new a(null);
    public static final int K3 = 0;

    @NotNull
    private static final androidx.compose.ui.graphics.h2 L3;

    @NotNull
    private final m2 H3;

    @Nullable
    private v0 I3;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.ui.graphics.h2 a() {
            return y.L3;
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n512#2,2:251\n514#2:262\n207#3:253\n424#4,8:254\n1#5:263\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n*L\n74#1:251,2\n74#1:262\n77#1:253\n77#1:254,8\n*E\n"})
    private final class b extends v0 {
        public b() {
            super(y.this);
        }

        @Override // androidx.compose.ui.node.u0
        public int B1(@NotNull androidx.compose.ui.layout.a aVar) {
            Integer num = S1().P().get(aVar);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            m3().l0(aVar, iIntValue);
            return iIntValue;
        }

        @Override // androidx.compose.ui.node.v0, androidx.compose.ui.layout.y
        public int D0(int i10) {
            return i4().y1(i10);
        }

        @Override // androidx.compose.ui.node.v0, androidx.compose.ui.layout.y
        public int L0(int i10) {
            return i4().z1(i10);
        }

        @Override // androidx.compose.ui.node.v0, androidx.compose.ui.layout.y
        public int M0(int i10) {
            return i4().v1(i10);
        }

        @Override // androidx.compose.ui.layout.z0
        @NotNull
        public androidx.compose.ui.layout.i2 P0(long j10) {
            s1(j10);
            androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
            l0[] l0VarArr = dVarQ0.f35552a;
            int iR = dVarQ0.R();
            for (int i10 = 0; i10 < iR; i10++) {
                x0 x0VarP0 = l0VarArr[i10].p0();
                Intrinsics.checkNotNull(x0VarP0);
                x0VarP0.G3(l0.g.NotUsed);
            }
            G3(i4().s().a(this, i4().X(), j10));
            return this;
        }

        @Override // androidx.compose.ui.node.v0, androidx.compose.ui.layout.y
        public int p0(int i10) {
            return i4().u1(i10);
        }

        @Override // androidx.compose.ui.node.v0
        protected void z3() {
            x0 x0VarP0 = i4().p0();
            Intrinsics.checkNotNull(x0VarP0);
            x0VarP0.n3();
        }
    }

    static {
        androidx.compose.ui.graphics.h2 h2VarA = androidx.compose.ui.graphics.m.a();
        h2VarA.S(androidx.compose.ui.graphics.q0.f38131b.q());
        h2VarA.H(1.0f);
        h2VarA.G(androidx.compose.ui.graphics.j2.f37801b.b());
        L3 = h2VarA;
    }

    public y(@NotNull l0 l0Var) {
        super(l0Var);
        this.H3 = new m2();
        V4().u9(this);
        this.I3 = l0Var.t0() != null ? new b() : null;
    }

    private final void X7() {
        if (K2()) {
            return;
        }
        i4().v0().z3();
    }

    @Override // androidx.compose.ui.node.u0
    public int B1(@NotNull androidx.compose.ui.layout.a aVar) {
        v0 v0VarN4 = N4();
        if (v0VarN4 != null) {
            return v0VarN4.B1(aVar);
        }
        Integer num = S1().P().get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.y
    public int D0(int i10) {
        return i4().w1(i10);
    }

    @Override // androidx.compose.ui.layout.y
    public int L0(int i10) {
        return i4().x1(i10);
    }

    @Override // androidx.compose.ui.layout.y
    public int M0(int i10) {
        return i4().t1(i10);
    }

    @Override // androidx.compose.ui.node.k1
    protected void M6(@Nullable v0 v0Var) {
        this.I3 = v0Var;
    }

    @Override // androidx.compose.ui.node.k1
    @Nullable
    public v0 N4() {
        return this.I3;
    }

    @Override // androidx.compose.ui.layout.z0
    @NotNull
    public androidx.compose.ui.layout.i2 P0(long j10) {
        if (o4()) {
            v0 v0VarN4 = N4();
            Intrinsics.checkNotNull(v0VarN4);
            j10 = v0VarN4.n3();
        }
        s1(j10);
        androidx.compose.runtime.collection.d<l0> dVarQ0 = i4().Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0VarArr[i10].v0().T3(l0.g.NotUsed);
        }
        N6(i4().s().a(this, i4().Y(), j10));
        Z5();
        return this;
    }

    @Override // androidx.compose.ui.node.k1
    @NotNull
    /* JADX INFO: renamed from: W7, reason: merged with bridge method [inline-methods] */
    public m2 V4() {
        return this.H3;
    }

    @Override // androidx.compose.ui.node.k1
    public void a4() {
        if (N4() == null) {
            M6(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.k1, androidx.compose.ui.layout.i2
    public void n1(long j10, float f10, @NotNull androidx.compose.ui.graphics.layer.c cVar) {
        super.n1(j10, f10, cVar);
        X7();
    }

    @Override // androidx.compose.ui.layout.y
    public int p0(int i10) {
        return i4().s1(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.k1, androidx.compose.ui.layout.i2
    public void p1(long j10, float f10, @Nullable Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) {
        super.p1(j10, f10, function1);
        X7();
    }

    @Override // androidx.compose.ui.node.k1
    public void q6(@NotNull androidx.compose.ui.graphics.k0 k0Var, @Nullable androidx.compose.ui.graphics.layer.c cVar) throws Throwable {
        x1 x1VarC = p0.c(i4());
        androidx.compose.runtime.collection.d<l0> dVarO0 = i4().O0();
        l0[] l0VarArr = dVarO0.f35552a;
        int iR = dVarO0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var = l0VarArr[i10];
            if (l0Var.J()) {
                l0Var.N(k0Var, cVar);
            }
        }
        if (x1VarC.getShowLayoutBounds()) {
            X3(k0Var, L3);
        }
    }

    @Override // androidx.compose.ui.node.k1
    public void s5(@NotNull k1.f fVar, long j10, @NotNull w wVar, int i10, boolean z10) {
        k1.f fVar2;
        boolean z11 = false;
        if (fVar.d(i4())) {
            if (P7(j10)) {
                z11 = true;
            } else if (androidx.compose.ui.input.pointer.r0.i(i10, androidx.compose.ui.input.pointer.r0.f39113b.d()) && (Float.floatToRawIntBits(S3(j10, Q4())) & Integer.MAX_VALUE) < 2139095040) {
                z10 = false;
                z11 = true;
            }
        }
        if (z11) {
            int i11 = wVar.f40043c;
            androidx.compose.runtime.collection.d<l0> dVarO0 = i4().O0();
            l0[] l0VarArr = dVarO0.f35552a;
            int iR = dVarO0.R() - 1;
            while (iR >= 0) {
                l0 l0Var = l0VarArr[iR];
                if (l0Var.J()) {
                    fVar2 = fVar;
                    fVar2.c(l0Var, j10, wVar, i10, z10);
                    if (!wVar.B()) {
                        continue;
                    } else if (!l0Var.F0().Y6()) {
                        break;
                    } else {
                        wVar.c();
                    }
                } else {
                    fVar2 = fVar;
                }
                iR--;
                fVar = fVar2;
            }
            wVar.f40043c = i11;
        }
    }
}
