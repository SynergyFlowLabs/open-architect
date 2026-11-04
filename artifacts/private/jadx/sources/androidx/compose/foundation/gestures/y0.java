package androidx.compose.foundation.gestures;

import androidx.compose.runtime.d7;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class y0 implements g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<n0.g, n0.g> f15385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t3 f15386b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.s3 f15387c = new androidx.compose.foundation.s3();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<Boolean> f15388d = d7.g(Boolean.FALSE, null, 2, null);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultScrollable2DState$scroll$2", f = "Scrollable2DState.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15389a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.q3 f15391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<t3, kotlin.coroutines.d<? super Unit>, Object> f15392d;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.y0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultScrollable2DState$scroll$2$1", f = "Scrollable2DState.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.H1}, m = "invokeSuspend", n = {}, s = {})
        static final class C0085a extends kotlin.coroutines.jvm.internal.o implements Function2<t3, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f15393a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f15394b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y0 f15395c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function2<t3, kotlin.coroutines.d<? super Unit>, Object> f15396d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0085a(y0 y0Var, Function2<? super t3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C0085a> dVar) {
                super(2, dVar);
                this.f15395c = y0Var;
                this.f15396d = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0085a c0085a = new C0085a(this.f15395c, this.f15396d, dVar);
                c0085a.f15394b = obj;
                return c0085a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Unit] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f15393a;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        t3 t3Var = (t3) this.f15394b;
                        this.f15395c.f15388d.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                        Function2<t3, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f15396d;
                        this.f15393a = 1;
                        if (function2.invoke(t3Var, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    this.f15395c.f15388d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    this = Unit.f312394a;
                    return this;
                } catch (Throwable th2) {
                    this.f15395c.f15388d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(t3 t3Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0085a) create(t3Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.q3 q3Var, Function2<? super t3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f15391c = q3Var;
            this.f15392d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return y0.this.new a(this.f15391c, this.f15392d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15389a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.s3 s3Var = y0.this.f15387c;
                t3 t3Var = y0.this.f15386b;
                androidx.compose.foundation.q3 q3Var = this.f15391c;
                C0085a c0085a = new C0085a(y0.this, this.f15392d, null);
                this.f15389a = 1;
                if (s3Var.f(t3Var, q3Var, c0085a, this) == objL) {
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
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nScrollable2DState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable2DState.kt\nandroidx/compose/foundation/gestures/DefaultScrollable2DState$scrollScope$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,165:1\n65#2:166\n69#2:169\n60#3:167\n70#3:170\n22#4:168\n*S KotlinDebug\n*F\n+ 1 Scrollable2DState.kt\nandroidx/compose/foundation/gestures/DefaultScrollable2DState$scrollScope$1\n*L\n133#1:166\n133#1:169\n133#1:167\n133#1:170\n133#1:168\n*E\n"})
    public static final class b implements t3 {
        b() {
        }

        @Override // androidx.compose.foundation.gestures.t3
        public long a(long j10) {
            return (Float.isNaN(Float.intBitsToFloat((int) (j10 >> 32))) || Float.isNaN(Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j10)))) ? n0.g.f332700b.e() : y0.this.i().invoke(n0.g.d(j10)).B();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y0(@NotNull Function1<? super n0.g, n0.g> function1) {
        this.f15385a = function1;
    }

    @Override // androidx.compose.foundation.gestures.g4
    public boolean a() {
        return this.f15388d.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.g4
    @Nullable
    public Object c(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function2<? super t3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = kotlinx.coroutines.t0.g(new a(q3Var, function2, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Override // androidx.compose.foundation.gestures.g4
    public boolean e(long j10) {
        return true;
    }

    @Override // androidx.compose.foundation.gestures.g4
    public long f(long j10) {
        return this.f15385a.invoke(n0.g.d(j10)).B();
    }

    @NotNull
    public final Function1<n0.g, n0.g> i() {
        return this.f15385a;
    }
}
