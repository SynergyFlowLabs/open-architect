package androidx.compose.ui.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,586:1\n30#2:587\n80#3:588\n85#3:590\n90#3:592\n85#3:594\n90#3:596\n85#3:598\n90#3:600\n80#3:602\n54#4:589\n59#4:591\n54#4:593\n59#4:595\n54#4:597\n59#4:599\n32#5:601\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable\n*L\n68#1:587\n68#1:588\n61#1:590\n65#1:592\n78#1:594\n83#1:596\n88#1:598\n88#1:600\n88#1:602\n61#1:589\n65#1:591\n78#1:593\n83#1:595\n88#1:597\n88#1:599\n88#1:601\n*E\n"})
public abstract class i2 implements e1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f39367f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f39371d = j2.f39384b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f39372e = androidx.compose.ui.unit.q.f42709b.b();

    @k2
    @androidx.compose.runtime.internal.w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,586:1\n435#1,2:587\n469#1,3:589\n438#1,2:592\n469#1,3:596\n444#1:599\n435#1,2:602\n469#1,3:604\n438#1,2:607\n469#1,3:609\n444#1:612\n469#1,3:615\n469#1,3:618\n435#1,2:621\n469#1,3:623\n438#1,2:626\n469#1,3:630\n444#1:633\n435#1,2:636\n469#1,3:638\n438#1,2:641\n469#1,3:643\n444#1:646\n469#1,3:649\n469#1,3:652\n479#1,3:657\n479#1,3:660\n452#1,2:665\n479#1,3:667\n455#1,2:670\n479#1,3:672\n461#1:675\n452#1,2:676\n479#1,3:678\n455#1,2:681\n479#1,3:685\n461#1:688\n469#1,3:689\n469#1,3:694\n479#1,3:697\n479#1,3:702\n32#2:594\n32#2:600\n32#2:613\n32#2:628\n32#2:634\n32#2:647\n32#2:655\n32#2:663\n32#2:683\n32#2:692\n32#2:700\n80#3:595\n80#3:601\n80#3:614\n80#3:629\n80#3:635\n80#3:648\n80#3:656\n80#3:664\n80#3:684\n80#3:693\n80#3:701\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n215#1:587,2\n215#1:589,3\n215#1:592,2\n215#1:596,3\n215#1:599\n232#1:602,2\n232#1:604,3\n232#1:607,2\n232#1:609,3\n232#1:612\n246#1:615,3\n259#1:618,3\n281#1:621,2\n281#1:623,3\n281#1:626,2\n281#1:630,3\n281#1:633\n305#1:636,2\n305#1:638,3\n305#1:641,2\n305#1:643,3\n305#1:646\n326#1:649,3\n345#1:652,3\n362#1:657,3\n381#1:660,3\n405#1:665,2\n405#1:667,3\n405#1:670,2\n405#1:672,3\n405#1:675\n427#1:676,2\n427#1:678,3\n427#1:681,2\n427#1:685,3\n427#1:688\n436#1:689,3\n438#1:694,3\n453#1:697,3\n455#1:702,3\n215#1:594\n232#1:600\n246#1:613\n281#1:628\n305#1:634\n326#1:647\n362#1:655\n405#1:663\n427#1:683\n439#1:692\n456#1:700\n215#1:595\n232#1:601\n246#1:614\n281#1:629\n305#1:635\n326#1:648\n362#1:656\n405#1:664\n427#1:684\n439#1:693\n456#1:701\n*E\n"})
    public static abstract class a implements androidx.compose.ui.unit.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f39373b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f39374a;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void A0(a aVar, i2 i2Var, int i10, int i11, float f10, Function1 function1, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
                int i13 = 1 >> 0;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                function1 = j2.f39383a;
            }
            aVar.w0(i2Var, i10, i11, f11, function1);
        }

        public static /* synthetic */ void B0(a aVar, i2 i2Var, int i10, int i11, androidx.compose.ui.graphics.layer.c cVar, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 8) != 0) {
                f10 = 0.0f;
            }
            aVar.y0(i2Var, i10, i11, cVar, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void H0(a aVar, i2 i2Var, long j10, float f10, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                function1 = j2.f39383a;
            }
            aVar.D0(i2Var, j10, f11, function1);
        }

        public static /* synthetic */ void J0(a aVar, i2 i2Var, long j10, androidx.compose.ui.graphics.layer.c cVar, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.E0(i2Var, j10, cVar, f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void M(i2 i2Var) {
            if (i2Var instanceof androidx.compose.ui.node.f1) {
                ((androidx.compose.ui.node.f1) i2Var).Z(this.f39374a);
            }
        }

        public static /* synthetic */ void P(a aVar, i2 i2Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.N(i2Var, i10, i11, f10);
        }

        public static /* synthetic */ void V(a aVar, i2 i2Var, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.U(i2Var, j10, f10);
        }

        public static /* synthetic */ void e0(a aVar, i2 i2Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.c0(i2Var, i10, i11, f10);
        }

        public static /* synthetic */ void k0(a aVar, i2 i2Var, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.g0(i2Var, j10, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void p0(a aVar, i2 i2Var, int i10, int i11, float f10, Function1 function1, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                function1 = j2.f39383a;
            }
            aVar.l0(i2Var, i10, i11, f11, function1);
        }

        public static /* synthetic */ void q0(a aVar, i2 i2Var, int i10, int i11, androidx.compose.ui.graphics.layer.c cVar, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 8) != 0) {
                f10 = 0.0f;
            }
            aVar.n0(i2Var, i10, i11, cVar, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void t0(a aVar, i2 i2Var, long j10, float f10, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                function1 = j2.f39383a;
            }
            aVar.r0(i2Var, j10, f11, function1);
        }

        public static /* synthetic */ void v0(a aVar, i2 i2Var, long j10, androidx.compose.ui.graphics.layer.c cVar, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
                int i11 = 5 | 0;
            }
            aVar.s0(i2Var, j10, cVar, f10);
        }

        public final void D0(@NotNull i2 i2Var, long j10, float f10, @NotNull Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) {
            M(i2Var);
            i2Var.p1(androidx.compose.ui.unit.q.s(j10, i2Var.f39372e), f10, function1);
        }

        public final void E0(@NotNull i2 i2Var, long j10, @NotNull androidx.compose.ui.graphics.layer.c cVar, float f10) {
            M(i2Var);
            i2Var.n1(androidx.compose.ui.unit.q.s(j10, i2Var.f39372e), f10, cVar);
        }

        public float I(@NotNull s2 s2Var, float f10) {
            return f10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @NotNull
        public abstract androidx.compose.ui.unit.w J();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int K();

        public final void K0(@NotNull Function1<? super a, Unit> function1) {
            this.f39374a = true;
            function1.invoke(this);
            this.f39374a = false;
        }

        public final void N(@NotNull i2 i2Var, int i10, int i11, float f10) {
            long jF = androidx.compose.ui.unit.q.f((((long) i11) & com.rabbitmq.client.k0.f265952a) | (((long) i10) << 32));
            M(i2Var);
            i2Var.p1(androidx.compose.ui.unit.q.s(jF, i2Var.f39372e), f10, null);
        }

        public final void U(@NotNull i2 i2Var, long j10, float f10) {
            M(i2Var);
            i2Var.p1(androidx.compose.ui.unit.q.s(j10, i2Var.f39372e), f10, null);
        }

        public final void W(@NotNull i2 i2Var, long j10, float f10, @NotNull androidx.compose.ui.graphics.layer.c cVar) {
            M(i2Var);
            i2Var.n1(androidx.compose.ui.unit.q.s(j10, i2Var.f39372e), f10, cVar);
        }

        public final void X(@NotNull i2 i2Var, long j10, float f10, @Nullable Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) {
            M(i2Var);
            i2Var.p1(androidx.compose.ui.unit.q.s(j10, i2Var.f39372e), f10, function1);
        }

        public final void Z(@NotNull i2 i2Var, long j10, float f10, @NotNull androidx.compose.ui.graphics.layer.c cVar) {
            if (J() == androidx.compose.ui.unit.w.Ltr || K() == 0) {
                M(i2Var);
                i2Var.n1(androidx.compose.ui.unit.q.s(j10, i2Var.f39372e), f10, cVar);
                return;
            }
            int iK = (K() - i2Var.h1()) - androidx.compose.ui.unit.q.n(j10);
            long jF = androidx.compose.ui.unit.q.f((((long) androidx.compose.ui.unit.q.p(j10)) & com.rabbitmq.client.k0.f265952a) | (((long) iK) << 32));
            M(i2Var);
            i2Var.n1(androidx.compose.ui.unit.q.s(jF, i2Var.f39372e), f10, cVar);
        }

        public final void b0(@NotNull i2 i2Var, long j10, float f10, @Nullable Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) {
            if (J() == androidx.compose.ui.unit.w.Ltr || K() == 0) {
                M(i2Var);
                i2Var.p1(androidx.compose.ui.unit.q.s(j10, i2Var.f39372e), f10, function1);
                return;
            }
            int iK = (K() - i2Var.h1()) - androidx.compose.ui.unit.q.n(j10);
            long jF = androidx.compose.ui.unit.q.f((((long) androidx.compose.ui.unit.q.p(j10)) & com.rabbitmq.client.k0.f265952a) | (((long) iK) << 32));
            M(i2Var);
            i2Var.p1(androidx.compose.ui.unit.q.s(jF, i2Var.f39372e), f10, function1);
        }

        public final void c0(@NotNull i2 i2Var, int i10, int i11, float f10) {
            long jF = androidx.compose.ui.unit.q.f((((long) i10) << 32) | (((long) i11) & com.rabbitmq.client.k0.f265952a));
            if (J() == androidx.compose.ui.unit.w.Ltr || K() == 0) {
                M(i2Var);
                i2Var.p1(androidx.compose.ui.unit.q.s(jF, i2Var.f39372e), f10, null);
            } else {
                long jF2 = androidx.compose.ui.unit.q.f((((long) ((K() - i2Var.h1()) - androidx.compose.ui.unit.q.n(jF))) << 32) | (((long) androidx.compose.ui.unit.q.p(jF)) & com.rabbitmq.client.k0.f265952a));
                M(i2Var);
                i2Var.p1(androidx.compose.ui.unit.q.s(jF2, i2Var.f39372e), f10, null);
            }
        }

        public final void g0(@NotNull i2 i2Var, long j10, float f10) {
            if (J() == androidx.compose.ui.unit.w.Ltr || K() == 0) {
                M(i2Var);
                i2Var.p1(androidx.compose.ui.unit.q.s(j10, i2Var.f39372e), f10, null);
                return;
            }
            int iK = (K() - i2Var.h1()) - androidx.compose.ui.unit.q.n(j10);
            long jF = androidx.compose.ui.unit.q.f((((long) androidx.compose.ui.unit.q.p(j10)) & com.rabbitmq.client.k0.f265952a) | (((long) iK) << 32));
            M(i2Var);
            i2Var.p1(androidx.compose.ui.unit.q.s(jF, i2Var.f39372e), f10, null);
        }

        @Override // androidx.compose.ui.unit.d
        public float getDensity() {
            return 1.0f;
        }

        public final void l0(@NotNull i2 i2Var, int i10, int i11, float f10, @NotNull Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) {
            long jF = androidx.compose.ui.unit.q.f((((long) i10) << 32) | (((long) i11) & com.rabbitmq.client.k0.f265952a));
            if (J() == androidx.compose.ui.unit.w.Ltr || K() == 0) {
                M(i2Var);
                i2Var.p1(androidx.compose.ui.unit.q.s(jF, i2Var.f39372e), f10, function1);
            } else {
                long jF2 = androidx.compose.ui.unit.q.f((((long) ((K() - i2Var.h1()) - androidx.compose.ui.unit.q.n(jF))) << 32) | (((long) androidx.compose.ui.unit.q.p(jF)) & com.rabbitmq.client.k0.f265952a));
                M(i2Var);
                i2Var.p1(androidx.compose.ui.unit.q.s(jF2, i2Var.f39372e), f10, function1);
            }
        }

        @Override // androidx.compose.ui.unit.n
        public float m0() {
            return 1.0f;
        }

        @Nullable
        public g0 n() {
            return null;
        }

        public final void n0(@NotNull i2 i2Var, int i10, int i11, @NotNull androidx.compose.ui.graphics.layer.c cVar, float f10) {
            long jF = androidx.compose.ui.unit.q.f((((long) i10) << 32) | (((long) i11) & com.rabbitmq.client.k0.f265952a));
            if (J() == androidx.compose.ui.unit.w.Ltr || K() == 0) {
                M(i2Var);
                i2Var.n1(androidx.compose.ui.unit.q.s(jF, i2Var.f39372e), f10, cVar);
            } else {
                long jF2 = androidx.compose.ui.unit.q.f((((long) ((K() - i2Var.h1()) - androidx.compose.ui.unit.q.n(jF))) << 32) | (((long) androidx.compose.ui.unit.q.p(jF)) & com.rabbitmq.client.k0.f265952a));
                M(i2Var);
                i2Var.n1(androidx.compose.ui.unit.q.s(jF2, i2Var.f39372e), f10, cVar);
            }
        }

        public final void r0(@NotNull i2 i2Var, long j10, float f10, @NotNull Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) {
            if (J() != androidx.compose.ui.unit.w.Ltr && K() != 0) {
                int iK = (K() - i2Var.h1()) - androidx.compose.ui.unit.q.n(j10);
                long jF = androidx.compose.ui.unit.q.f((((long) androidx.compose.ui.unit.q.p(j10)) & com.rabbitmq.client.k0.f265952a) | (((long) iK) << 32));
                M(i2Var);
                i2Var.p1(androidx.compose.ui.unit.q.s(jF, i2Var.f39372e), f10, function1);
                return;
            }
            M(i2Var);
            i2Var.p1(androidx.compose.ui.unit.q.s(j10, i2Var.f39372e), f10, function1);
        }

        public final void s0(@NotNull i2 i2Var, long j10, @NotNull androidx.compose.ui.graphics.layer.c cVar, float f10) {
            if (J() == androidx.compose.ui.unit.w.Ltr || K() == 0) {
                M(i2Var);
                i2Var.n1(androidx.compose.ui.unit.q.s(j10, i2Var.f39372e), f10, cVar);
                return;
            }
            int iK = (K() - i2Var.h1()) - androidx.compose.ui.unit.q.n(j10);
            long jF = androidx.compose.ui.unit.q.f((((long) androidx.compose.ui.unit.q.p(j10)) & com.rabbitmq.client.k0.f265952a) | (((long) iK) << 32));
            M(i2Var);
            i2Var.n1(androidx.compose.ui.unit.q.s(jF, i2Var.f39372e), f10, cVar);
        }

        public final void w0(@NotNull i2 i2Var, int i10, int i11, float f10, @NotNull Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) {
            long jF = androidx.compose.ui.unit.q.f((((long) i11) & com.rabbitmq.client.k0.f265952a) | (((long) i10) << 32));
            M(i2Var);
            i2Var.p1(androidx.compose.ui.unit.q.s(jF, i2Var.f39372e), f10, function1);
        }

        public final void y0(@NotNull i2 i2Var, int i10, int i11, @NotNull androidx.compose.ui.graphics.layer.c cVar, float f10) {
            long jF = androidx.compose.ui.unit.q.f((((long) i11) & com.rabbitmq.client.k0.f265952a) | (((long) i10) << 32));
            M(i2Var);
            i2Var.n1(androidx.compose.ui.unit.q.s(jF, i2Var.f39372e), f10, cVar);
        }
    }

    public i2() {
        long j10 = 0;
        this.f39370c = androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32));
    }

    private final void l1() {
        this.f39368a = kotlin.ranges.r.I((int) (this.f39370c >> 32), androidx.compose.ui.unit.b.r(this.f39371d), androidx.compose.ui.unit.b.p(this.f39371d));
        int I = kotlin.ranges.r.I((int) (this.f39370c & com.rabbitmq.client.k0.f265952a), androidx.compose.ui.unit.b.q(this.f39371d), androidx.compose.ui.unit.b.o(this.f39371d));
        this.f39369b = I;
        int i10 = this.f39368a;
        long j10 = this.f39370c;
        this.f39372e = androidx.compose.ui.unit.q.f((((long) ((i10 - ((int) (j10 >> 32))) / 2)) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) ((I - ((int) (j10 & com.rabbitmq.client.k0.f265952a))) / 2))));
    }

    @Override // androidx.compose.ui.layout.e1
    public int b0() {
        return (int) (this.f39370c >> 32);
    }

    protected final long b1() {
        return this.f39372e;
    }

    public final int c1() {
        return this.f39369b;
    }

    protected final long f1() {
        return this.f39370c;
    }

    protected final long g1() {
        return this.f39371d;
    }

    public final int h1() {
        return this.f39368a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n1(long j10, float f10, @NotNull androidx.compose.ui.graphics.layer.c cVar) {
        p1(j10, f10, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void p1(long j10, float f10, @Nullable Function1<? super androidx.compose.ui.graphics.r1, Unit> function1);

    @Override // androidx.compose.ui.layout.e1
    public int q0() {
        return (int) (this.f39370c & com.rabbitmq.client.k0.f265952a);
    }

    protected final void q1(long j10) {
        if (!androidx.compose.ui.unit.u.h(this.f39370c, j10)) {
            this.f39370c = j10;
            l1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s1(long j10) {
        if (androidx.compose.ui.unit.b.g(this.f39371d, j10)) {
            return;
        }
        this.f39371d = j10;
        l1();
    }
}
