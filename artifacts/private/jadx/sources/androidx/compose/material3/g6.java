package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/ClockDialNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,2144:1\n85#2:2145\n117#2,2:2146\n1#3:2148\n54#4:2149\n85#5:2150\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/ClockDialNode\n*L\n1491#1:2145\n1491#1:2146,2\n1553#1:2149\n1553#1:2150\n*E\n"})
public final class g6 extends androidx.compose.ui.node.m implements androidx.compose.ui.node.d2, androidx.compose.ui.node.h, androidx.compose.ui.node.f0 {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f27872h3 = 8;

    @NotNull
    private final androidx.compose.runtime.n3 H1;
    private boolean X;
    private int Y;

    @NotNull
    private androidx.compose.animation.core.o<Float> Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.pointer.y0 f27873g3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f27874p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private float f27875p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.pointer.y0 f27876p2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private j f27877w;

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: androidx.compose.material3.g6$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", f = "TimePicker.kt", i = {}, l = {1532}, m = "invokeSuspend", n = {}, s = {})
        static final class C0217a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f27879a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g6 f27880b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0217a(g6 g6Var, kotlin.coroutines.d<? super C0217a> dVar) {
                super(2, dVar);
                this.f27880b = g6Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0217a(this.f27880b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f27879a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    if (this.f27880b.X) {
                        this.f27880b.f27877w.b(g80.f27919b.b());
                    }
                    j jVar = this.f27880b.f27877w;
                    androidx.compose.animation.core.o<Float> oVar = this.f27880b.Z;
                    this.f27879a = 1;
                    if (jVar.B(oVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0217a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", i = {}, l = {1539}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/ClockDialNode$pointerInputDragNode$1$2$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,2144:1\n65#2:2145\n69#2:2148\n60#3:2146\n70#3:2149\n22#4:2147\n22#4:2150\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/ClockDialNode$pointerInputDragNode$1$2$1\n*L\n1537#1:2145\n1538#1:2148\n1537#1:2146\n1538#1:2149\n1537#1:2147\n1538#1:2150\n*E\n"})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f27881a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g6 f27882b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ n0.g f27883c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(g6 g6Var, n0.g gVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f27882b = g6Var;
                this.f27883c = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f27882b, this.f27883c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b bVar;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f27881a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    this.f27882b.f27874p0 += Float.intBitsToFloat((int) (this.f27883c.B() >> 32));
                    this.f27882b.f27875p1 += Float.intBitsToFloat((int) (this.f27883c.B() & com.rabbitmq.client.k0.f265952a));
                    j jVar = this.f27882b.f27877w;
                    float fE1 = s70.E1(this.f27882b.f27875p1 - androidx.compose.ui.unit.q.p(this.f27882b.P9()), this.f27882b.f27874p0 - androidx.compose.ui.unit.q.n(this.f27882b.P9()));
                    androidx.compose.animation.core.o oVar = this.f27882b.Z;
                    this.f27881a = 1;
                    bVar = this;
                    if (j.D(jVar, fE1, oVar, false, bVar, 4, null) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    bVar = this;
                }
                s70.O1(bVar.f27882b.f27877w, bVar.f27882b.f27874p0, bVar.f27882b.f27875p1, bVar.f27882b.Q9(), bVar.f27882b.P9());
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(g6 g6Var) {
            kotlinx.coroutines.k.f(g6Var.Q8(), null, null, new C0217a(g6Var, null), 3, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(g6 g6Var, androidx.compose.ui.input.pointer.c0 c0Var, n0.g gVar) {
            kotlinx.coroutines.k.f(g6Var.Q8(), null, null, new b(g6Var, gVar, null), 3, null);
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            final g6 g6Var = g6.this;
            Function0 function0 = new Function0() { // from class: androidx.compose.material3.e6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g6.a.c(g6Var);
                }
            };
            final g6 g6Var2 = g6.this;
            Object objM = androidx.compose.foundation.gestures.x1.M(l0Var, null, function0, null, new Function2() { // from class: androidx.compose.material3.f6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g6.a.d(g6Var2, (androidx.compose.ui.input.pointer.c0) obj, (n0.g) obj2);
                }
            }, dVar, 5, null);
            return objM == kotlin.coroutines.intrinsics.b.l() ? objM : Unit.f312394a;
        }
    }

    static final class b implements PointerInputEventHandler {

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", f = "TimePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/ClockDialNode$pointerInputTapNode$1$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,2144:1\n65#2:2145\n69#2:2148\n60#3:2146\n70#3:2149\n22#4:2147\n22#4:2150\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/ClockDialNode$pointerInputTapNode$1$1\n*L\n1504#1:2145\n1505#1:2148\n1504#1:2146\n1505#1:2149\n1504#1:2147\n1505#1:2150\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<androidx.compose.foundation.gestures.r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f27885a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ long f27886b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g6 f27887c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g6 g6Var, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f27887c = g6Var;
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Object invoke(androidx.compose.foundation.gestures.r3 r3Var, n0.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                return k(r3Var, gVar.B(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f27885a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                long j10 = this.f27886b;
                this.f27887c.f27874p0 = Float.intBitsToFloat((int) (j10 >> 32));
                this.f27887c.f27875p1 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
                return Unit.f312394a;
            }

            public final Object k(androidx.compose.foundation.gestures.r3 r3Var, long j10, kotlin.coroutines.d<? super Unit> dVar) {
                a aVar = new a(this.f27887c, dVar);
                aVar.f27886b = j10;
                return aVar.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material3.g6$b$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", f = "TimePicker.kt", i = {}, l = {1509}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/ClockDialNode$pointerInputTapNode$1$2$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,2144:1\n65#2:2145\n69#2:2148\n60#3:2146\n70#3:2149\n22#4:2147\n22#4:2150\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/ClockDialNode$pointerInputTapNode$1$2$1\n*L\n1510#1:2145\n1511#1:2148\n1510#1:2146\n1511#1:2149\n1510#1:2147\n1511#1:2150\n*E\n"})
        static final class C0218b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f27888a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g6 f27889b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ n0.g f27890c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0218b(g6 g6Var, n0.g gVar, kotlin.coroutines.d<? super C0218b> dVar) {
                super(2, dVar);
                this.f27889b = g6Var;
                this.f27890c = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0218b(this.f27889b, this.f27890c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f27888a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j jVar = this.f27889b.f27877w;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f27890c.B() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f27890c.B() & com.rabbitmq.client.k0.f265952a));
                    float fQ9 = this.f27889b.Q9();
                    boolean z10 = this.f27889b.X;
                    long jP9 = this.f27889b.P9();
                    androidx.compose.animation.core.o oVar = this.f27889b.Z;
                    this.f27888a = 1;
                    if (s70.Q1(jVar, fIntBitsToFloat, fIntBitsToFloat2, fQ9, z10, jP9, oVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0218b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(g6 g6Var, n0.g gVar) {
            kotlinx.coroutines.k.f(g6Var.Q8(), null, null, new C0218b(g6Var, gVar, null), 3, null);
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(g6.this, null);
            final g6 g6Var = g6.this;
            Object objP = androidx.compose.foundation.gestures.c5.p(l0Var, null, null, aVar, new Function1() { // from class: androidx.compose.material3.h6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g6.b.b(g6Var, (n0.g) obj);
                }
            }, dVar, 3, null);
            return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ClockDialNode$updateNode$1", f = "TimePicker.kt", i = {}, l = {1581}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f27892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f27893c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j jVar, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f27892b = jVar;
            this.f27893c = oVar;
            int i10 = 5 | 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f27892b, this.f27893c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f27891a;
            if (i10 == 0) {
                ResultKt.m(obj);
                j jVar = this.f27892b;
                androidx.compose.animation.core.o<Float> oVar = this.f27893c;
                this.f27891a = 1;
                if (jVar.r(oVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ g6(j jVar, boolean z10, int i10, androidx.compose.animation.core.o oVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z10, i10, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final long P9() {
        return ((androidx.compose.ui.unit.q) this.H1.getValue()).x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float Q9() {
        androidx.compose.ui.unit.d dVarQ = androidx.compose.ui.node.k.q(this);
        return (dVarQ.S7(s70.f32760n) * dVarQ.g6(this.f27877w.v())) / dVarQ.g6(d0.b3.f267681a.b());
    }

    private final void R9(long j10) {
        this.H1.setValue(androidx.compose.ui.unit.q.c(j10));
    }

    public final void S9(@NotNull j jVar, boolean z10, int i10, @NotNull androidx.compose.animation.core.o<Float> oVar) {
        this.f27877w = jVar;
        this.X = z10;
        this.Z = oVar;
        if (g80.f(this.Y, i10)) {
            return;
        }
        this.Y = i10;
        int i11 = 3 ^ 0;
        kotlinx.coroutines.k.f(Q8(), null, null, new c(jVar, oVar, null), 3, null);
    }

    @Override // androidx.compose.ui.node.f0
    public void c0(long j10) {
        R9(androidx.compose.ui.unit.v.b(j10));
        this.f27877w.E(androidx.compose.ui.node.k.q(this).D3((int) (j10 >> 32)));
    }

    @Override // androidx.compose.ui.node.d2
    public void p3() {
        this.f27876p2.p3();
        this.f27873g3.p3();
    }

    @Override // androidx.compose.ui.node.d2
    public void p5(@NotNull androidx.compose.ui.input.pointer.q qVar, @NotNull androidx.compose.ui.input.pointer.s sVar, long j10) {
        this.f27876p2.p5(qVar, sVar, j10);
        this.f27873g3.p5(qVar, sVar, j10);
    }

    private g6(j jVar, boolean z10, int i10, androidx.compose.animation.core.o<Float> oVar) {
        this.f27877w = jVar;
        this.X = z10;
        this.Y = i10;
        this.Z = oVar;
        this.H1 = androidx.compose.runtime.d7.g(androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f42709b.b()), null, 2, null);
        this.f27876p2 = (androidx.compose.ui.input.pointer.y0) v9(androidx.compose.ui.input.pointer.w0.a(new b()));
        this.f27873g3 = (androidx.compose.ui.input.pointer.y0) v9(androidx.compose.ui.input.pointer.w0.a(new a()));
    }
}
