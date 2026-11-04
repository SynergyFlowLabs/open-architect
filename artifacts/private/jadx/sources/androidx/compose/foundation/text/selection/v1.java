package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,104:1\n1282#2,6:105\n1282#2,6:111\n1282#2,6:117\n273#3:123\n30#3:129\n30#3:134\n65#4:124\n69#4:127\n60#5:125\n70#5:128\n53#5,3:130\n53#5,3:135\n22#6:126\n85#7:133\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n*L\n75#1:105,6\n76#1:111,6\n80#1:117,6\n43#1:123\n49#1:129\n53#1:134\n44#1:124\n44#1:127\n44#1:125\n44#1:128\n49#1:130,3\n53#1:135,3\n44#1:126\n75#1:133\n*E\n"})
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.t f21474a = new androidx.compose.animation.core.t(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.z3<n0.g, androidx.compose.animation.core.t> f21475b = androidx.compose.animation.core.t4.K(new Function1() { // from class: androidx.compose.foundation.text.selection.s1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return v1.c((n0.g) obj);
        }
    }, new Function1() { // from class: androidx.compose.foundation.text.selection.t1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return v1.d((androidx.compose.animation.core.t) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f21476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.q2<n0.g> f21477d;

    @SourceDebugExtension({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,104:1\n1282#2,6:105\n85#3:111\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n*L\n66#1:105,6\n65#1:111\n*E\n"})
    static final class a implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<n0.g> f21478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Function0<n0.g>, androidx.compose.ui.a0> f21479b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<n0.g> function0, Function1<? super Function0<n0.g>, ? extends androidx.compose.ui.a0> function1) {
            this.f21478a = function0;
            this.f21479b = function1;
        }

        private static final long f(n7<n0.g> n7Var) {
            return n7Var.getValue().B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n0.g i(n7 n7Var) {
            return n0.g.d(f(n7Var));
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(759876635);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(759876635, i10, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:64)");
            }
            final n7 n7VarK = v1.k(this.f21478a, c0Var, 0);
            Function1<Function0<n0.g>, androidx.compose.ui.a0> function1 = this.f21479b;
            boolean zD = c0Var.D(n7VarK);
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.foundation.text.selection.u1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return v1.a.i(n7VarK);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarInvoke = function1.invoke((Function0) objI0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarInvoke;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return d(a0Var, c0Var, num.intValue());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160717p0}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f21481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n7<n0.g> f21482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<n0.g, androidx.compose.animation.core.t> f21483d;

        @SourceDebugExtension({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,104:1\n273#2:105\n273#2:106\n69#3:107\n70#4:108\n22#5:109\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2\n*L\n88#1:105\n89#1:106\n90#1:107\n90#1:108\n90#1:109\n*E\n"})
        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.core.c<n0.g, androidx.compose.animation.core.t> f21484a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f21485b;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.v1$b$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
            static final class C0160a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f21486a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.animation.core.c<n0.g, androidx.compose.animation.core.t> f21487b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f21488c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0160a(androidx.compose.animation.core.c<n0.g, androidx.compose.animation.core.t> cVar, long j10, kotlin.coroutines.d<? super C0160a> dVar) {
                    super(2, dVar);
                    this.f21487b = cVar;
                    this.f21488c = j10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0160a(this.f21487b, this.f21488c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f21486a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        androidx.compose.animation.core.c<n0.g, androidx.compose.animation.core.t> cVar = this.f21487b;
                        n0.g gVarD = n0.g.d(this.f21488c);
                        androidx.compose.animation.core.q2<n0.g> q2VarH = v1.h();
                        this.f21486a = 1;
                        if (androidx.compose.animation.core.c.i(cVar, gVarD, q2VarH, null, null, this, 12, null) == objL) {
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
                    return ((C0160a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            a(androidx.compose.animation.core.c<n0.g, androidx.compose.animation.core.t> cVar, kotlinx.coroutines.s0 s0Var) {
                this.f21484a = cVar;
                this.f21485b = s0Var;
            }

            public final Object a(long j10, kotlin.coroutines.d<? super Unit> dVar) {
                if ((this.f21484a.v().B() & 9223372034707292159L) == n0.d.f332689d || (j10 & 9223372034707292159L) == n0.d.f332689d || Float.intBitsToFloat((int) (this.f21484a.v().B() & com.rabbitmq.client.k0.f265952a)) == Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a))) {
                    Object objC = this.f21484a.C(n0.g.d(j10), dVar);
                    return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
                }
                kotlinx.coroutines.k.f(this.f21485b, null, null, new C0160a(this.f21484a, j10, null), 3, null);
                return Unit.f312394a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((n0.g) obj).B(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n7<n0.g> n7Var, androidx.compose.animation.core.c<n0.g, androidx.compose.animation.core.t> cVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f21482c = n7Var;
            this.f21483d = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n0.g m(n7 n7Var) {
            return n0.g.d(v1.l(n7Var));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f21482c, this.f21483d, dVar);
            bVar.f21481b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21480a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f21481b;
                final n7<n0.g> n7Var = this.f21482c;
                kotlinx.coroutines.flow.i iVarY = w6.y(new Function0() { // from class: androidx.compose.foundation.text.selection.w1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return v1.b.m(n7Var);
                    }
                });
                a aVar = new a(this.f21483d, s0Var);
                this.f21480a = 1;
                if (iVarY.collect(aVar, this) == objL) {
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
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        long jG = n0.g.g((((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & com.rabbitmq.client.k0.f265952a));
        f21476c = jG;
        f21477d = new androidx.compose.animation.core.q2<>(0.0f, 0.0f, n0.g.d(jG), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.t c(n0.g gVar) {
        return (gVar.B() & 9223372034707292159L) != n0.d.f332689d ? new androidx.compose.animation.core.t(Float.intBitsToFloat((int) (gVar.B() >> 32)), Float.intBitsToFloat((int) (gVar.B() & com.rabbitmq.client.k0.f265952a))) : f21474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.g d(androidx.compose.animation.core.t tVar) {
        float f10 = tVar.f();
        float fG = tVar.g();
        return n0.g.d(n0.g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(fG)) & com.rabbitmq.client.k0.f265952a)));
    }

    @NotNull
    public static final androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function0<n0.g> function0, @NotNull Function1<? super Function0<n0.g>, ? extends androidx.compose.ui.a0> function1) {
        return androidx.compose.ui.m.k(a0Var, null, new a(function0, function1), 1, null);
    }

    @NotNull
    public static final androidx.compose.animation.core.q2<n0.g> h() {
        return f21477d;
    }

    public static final long i() {
        return f21476c;
    }

    @NotNull
    public static final androidx.compose.animation.core.z3<n0.g, androidx.compose.animation.core.t> j() {
        return f21475b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public static final n7<n0.g> k(Function0<n0.g> function0, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1589795249, i10, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:73)");
        }
        Object objI0 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = w6.e(function0);
            c0Var.Y(objI0);
        }
        n7 n7Var = (n7) objI0;
        Object objI1 = c0Var.i0();
        if (objI1 == aVar.a()) {
            Object cVar = new androidx.compose.animation.core.c(n0.g.d(l(n7Var)), f21475b, n0.g.d(f21476c), null, 8, null);
            c0Var.Y(cVar);
            objI1 = cVar;
        }
        androidx.compose.animation.core.c cVar2 = (androidx.compose.animation.core.c) objI1;
        Unit unit = Unit.f312394a;
        boolean zK0 = c0Var.k0(cVar2);
        Object objI2 = c0Var.i0();
        if (zK0 || objI2 == aVar.a()) {
            objI2 = new b(n7Var, cVar2, null);
            c0Var.Y(objI2);
        }
        androidx.compose.runtime.b2.i(unit, (Function2) objI2, c0Var, 6);
        n7<n0.g> n7VarJ = cVar2.j();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(n7<n0.g> n7Var) {
        return n7Var.getValue().B();
    }
}
