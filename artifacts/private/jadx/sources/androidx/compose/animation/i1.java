package androidx.compose.animation;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.ui.graphics.a4;
import androidx.compose.ui.layout.i2;
import androidx.compose.ui.layout.w2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSkipToLookaheadNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,189:1\n85#2:190\n117#2,2:191\n85#2:193\n117#2,2:194\n1#3:196\n30#4:197\n80#5:198\n85#5:200\n90#5:202\n85#5:204\n85#5:206\n90#5:208\n90#5:210\n54#6:199\n59#6:201\n54#6:203\n54#6:205\n59#6:207\n59#6:209\n*S KotlinDebug\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode\n*L\n45#1:190\n45#1:191,2\n46#1:193\n46#1:194,2\n64#1:197\n64#1:198\n70#1:200\n70#1:202\n110#1:204\n123#1:206\n136#1:208\n149#1:210\n70#1:199\n70#1:201\n110#1:203\n123#1:205\n136#1:207\n149#1:209\n*E\n"})
public final class i1 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {
    public static final int X = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final n3 f13528s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final n3 f13529t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.b f13530v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f13531w = n.e();

    static final class a extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f13532a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i2 i2Var) {
            super(1);
            this.f13532a = i2Var;
        }

        public final void c(i2.a aVar) {
            int i10 = (4 & 0) | 0;
            i2.a.P(aVar, this.f13532a, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nSkipToLookaheadNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode$measure$2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 5 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 8 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,189:1\n54#2:190\n59#2:192\n54#2:198\n59#2:203\n85#3:191\n90#3:193\n53#3,3:195\n85#3:199\n60#3:201\n90#3:204\n70#3:206\n80#3:209\n31#4:194\n41#5:200\n46#5:205\n22#6:202\n22#6:207\n30#7:208\n61#8,3:210\n*S KotlinDebug\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode$measure$2\n*L\n77#1:190\n77#1:192\n88#1:198\n89#1:203\n77#1:191\n77#1:193\n78#1:195,3\n88#1:199\n88#1:201\n89#1:204\n89#1:206\n87#1:209\n78#1:194\n88#1:200\n89#1:205\n88#1:202\n89#1:207\n87#1:208\n85#1:210,3\n*E\n"})
    static final class b extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i2 f13534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.c1 f13536d;

        @SourceDebugExtension({"SMAP\nSkipToLookaheadNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode$measure$2$1\n+ 2 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,189:1\n41#2:190\n46#2:193\n60#3:191\n70#3:194\n22#4:192\n22#4:195\n*S KotlinDebug\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode$measure$2$1\n*L\n95#1:190\n96#1:193\n95#1:191\n96#1:194\n95#1:192\n96#1:195\n*E\n"})
        static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.r1, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f13537a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j10) {
                super(1);
                this.f13537a = j10;
                int i10 = 2 | 1;
            }

            public final void c(androidx.compose.ui.graphics.r1 r1Var) {
                r1Var.z(Float.intBitsToFloat((int) (this.f13537a >> 32)));
                r1Var.C(Float.intBitsToFloat((int) (this.f13537a & com.rabbitmq.client.k0.f265952a)));
                r1Var.W1(a4.a(0.0f, 0.0f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.r1 r1Var) {
                c(r1Var);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i2 i2Var, long j10, androidx.compose.ui.layout.c1 c1Var) {
            super(1);
            this.f13534b = i2Var;
            this.f13535c = j10;
            this.f13536d = c1Var;
        }

        public final void c(i2.a aVar) {
            long jE;
            u0 u0VarW9 = i1.this.w9();
            if (u0VarW9 == null) {
                i2.a.P(aVar, this.f13534b, 0, 0, 0.0f, 4, null);
                return;
            }
            androidx.compose.ui.layout.l lVarB = u0VarW9.b();
            if (((int) (i1.this.f13531w >> 32)) == 0 || ((int) (i1.this.f13531w & com.rabbitmq.client.k0.f265952a)) == 0) {
                jE = w2.e((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & com.rabbitmq.client.k0.f265952a));
            } else {
                jE = lVarB.a(androidx.compose.ui.unit.v.h(i1.this.f13531w), androidx.compose.ui.unit.v.h(this.f13535c));
            }
            long jA = u0VarW9.a().a(androidx.compose.ui.unit.u.e((((long) kotlin.math.b.L0(((int) (i1.this.f13531w & com.rabbitmq.client.k0.f265952a)) * Float.intBitsToFloat((int) (jE & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (((long) kotlin.math.b.L0(((int) (i1.this.f13531w >> 32)) * Float.intBitsToFloat((int) (jE >> 32)))) << 32)), this.f13535c, this.f13536d.getLayoutDirection());
            i2.a.A0(aVar, this.f13534b, androidx.compose.ui.unit.q.n(jA), androidx.compose.ui.unit.q.p(jA), 0.0f, new a(jE), 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    public i1(@Nullable u0 u0Var, @NotNull Function0<Boolean> function0) {
        boolean z10 = false;
        this.f13528s = d7.g(u0Var, null, 2, null);
        this.f13529t = d7.g(function0, null, 2, null);
    }

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return (zVar.P5() || !n.f(this.f13531w)) ? yVar.L0(i10) : (int) (this.f13531w >> 32);
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return (zVar.P5() || !n.f(this.f13531w)) ? yVar.M0(i10) : (int) (this.f13531w >> 32);
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        i2 i2VarP0;
        if (c1Var.P5()) {
            this.f13530v = androidx.compose.ui.unit.b.a(j10);
        }
        if (!x9().invoke().booleanValue()) {
            i2 i2VarP1 = z0Var.P0(j10);
            return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP1.h1(), i2VarP1.c1(), null, new a(i2VarP1), 4, null);
        }
        if (c1Var.P5()) {
            i2VarP0 = z0Var.P0(j10);
            this.f13531w = androidx.compose.ui.unit.u.e((((long) i2VarP0.h1()) << 32) | (((long) i2VarP0.c1()) & com.rabbitmq.client.k0.f265952a));
        } else {
            androidx.compose.ui.unit.b bVar = this.f13530v;
            Intrinsics.checkNotNull(bVar);
            i2VarP0 = z0Var.P0(bVar.x());
        }
        long jF = androidx.compose.ui.unit.c.f(j10, this.f13531w);
        return androidx.compose.ui.layout.c1.h6(c1Var, (int) (jF >> 32), (int) (com.rabbitmq.client.k0.f265952a & jF), null, new b(i2VarP0, jF, c1Var), 4, null);
    }

    @Override // androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return (zVar.P5() || !n.f(this.f13531w)) ? yVar.p0(i10) : (int) (this.f13531w & com.rabbitmq.client.k0.f265952a);
    }

    @Override // androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return (zVar.P5() || !n.f(this.f13531w)) ? yVar.D0(i10) : (int) (this.f13531w & com.rabbitmq.client.k0.f265952a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final u0 w9() {
        return (u0) this.f13528s.getValue();
    }

    @NotNull
    public final Function0<Boolean> x9() {
        return (Function0) this.f13529t.getValue();
    }

    public final void y9(@NotNull Function0<Boolean> function0) {
        this.f13529t.setValue(function0);
    }

    public final void z9(@Nullable u0 u0Var) {
        this.f13528s.setValue(u0Var);
    }
}
