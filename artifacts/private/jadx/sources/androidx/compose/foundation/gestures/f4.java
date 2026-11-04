package androidx.compose.foundation.gestures;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nScrollable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable2D.kt\nandroidx/compose/foundation/gestures/Scrollable2DNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,540:1\n103#2:541\n35#2,5:542\n104#2:547\n1#3:548\n*S KotlinDebug\n*F\n+ 1 Scrollable2D.kt\nandroidx/compose/foundation/gestures/Scrollable2DNode\n*L\n269#1:541\n269#1:542,5\n269#1:547\n*E\n"})
public final class f4 extends j2 implements androidx.compose.ui.node.i2, androidx.compose.ui.node.h {

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final int f14564t3 = 8;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.x3 f14565j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @Nullable
    private c3 f14566k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private final boolean f14567l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.nestedscroll.b f14568m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NotNull
    private final j4 f14569n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private final x0 f14570o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NotNull
    private final b5 f14571p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NotNull
    private final p4 f14572q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @Nullable
    private Function2<? super Float, ? super Float, Boolean> f14573r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @Nullable
    private Function2<? super n0.g, ? super kotlin.coroutines.d<? super n0.g>, ? extends Object> f14574s3;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.Scrollable2DNode$drag$2$1", f = "Scrollable2D.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<o3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<Function1<? super d1.b, Unit>, kotlin.coroutines.d<? super Unit>, Object> f14577c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Function1<? super d1.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f14577c = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(o3 o3Var, d1.b bVar) {
            o3Var.a(bVar.a(), androidx.compose.ui.input.nestedscroll.f.f38949b.h());
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f14577c, dVar);
            aVar.f14576b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14575a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final o3 o3Var = (o3) this.f14576b;
                Function2<Function1<? super d1.b, Unit>, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f14577c;
                Function1<? super d1.b, Unit> function1 = new Function1() { // from class: androidx.compose.foundation.gestures.e4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return f4.a.n(o3Var, (d1.b) obj2);
                    }
                };
                this.f14575a = 1;
                if (function2.invoke(function1, this) == objL) {
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
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o3 o3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(o3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.Scrollable2DNode$onDragStopped$1", f = "Scrollable2D.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14578a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f14580c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f14580c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f4.this.new b(this.f14580c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14578a;
            if (i10 == 0) {
                ResultKt.m(obj);
                b5 b5Var = f4.this.f14571p3;
                long j10 = this.f14580c;
                this.f14578a = 1;
                if (b5Var.y(j10, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.Scrollable2DNode$setScrollSemanticsActions$1$1", f = "Scrollable2D.kt", i = {}, l = {286}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nScrollable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable2D.kt\nandroidx/compose/foundation/gestures/Scrollable2DNode$setScrollSemanticsActions$1$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,540:1\n30#2:541\n53#3,3:542\n*S KotlinDebug\n*F\n+ 1 Scrollable2D.kt\nandroidx/compose/foundation/gestures/Scrollable2DNode$setScrollSemanticsActions$1$1\n*L\n286#1:541\n286#1:542,3\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14581a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f14583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f14584d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10, float f11, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f14583c = f10;
            this.f14584d = f11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f4.this.new c(this.f14583c, this.f14584d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14581a;
            if (i10 == 0) {
                ResultKt.m(obj);
                b5 b5Var = f4.this.f14571p3;
                float f10 = this.f14583c;
                float f11 = this.f14584d;
                long jG = n0.g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a));
                this.f14581a = 1;
                if (a4.i(b5Var, jG, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.Scrollable2DNode$setScrollSemanticsActions$2", f = "Scrollable2D.kt", i = {}, l = {290}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<n0.g, kotlin.coroutines.d<? super n0.g>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ long f14586b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            int i10 = 5 ^ 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = f4.this.new d(dVar);
            dVar2.f14586b = ((n0.g) obj).B();
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(n0.g gVar, kotlin.coroutines.d<? super n0.g> dVar) {
            return k(gVar.B(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14585a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            long j10 = this.f14586b;
            b5 b5Var = f4.this.f14571p3;
            this.f14585a = 1;
            Object objI = a4.i(b5Var, j10, this);
            return objI == objL ? objL : objI;
        }

        public final Object k(long j10, kotlin.coroutines.d<? super n0.g> dVar) {
            return ((d) create(n0.g.d(j10), dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f4(@NotNull g4 g4Var, @Nullable androidx.compose.foundation.x3 x3Var, @Nullable c3 c3Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar) {
        super(n4.f(), z10, jVar, null);
        this.f14565j3 = x3Var;
        this.f14566k3 = c3Var;
        androidx.compose.ui.input.nestedscroll.b bVar = new androidx.compose.ui.input.nestedscroll.b();
        this.f14568m3 = bVar;
        this.f14569n3 = (j4) v9(new j4(z10));
        x0 x0Var = new x0(androidx.compose.animation.l1.c(n4.i()), null, 2, 0 == true ? 1 : 0);
        this.f14570o3 = x0Var;
        androidx.compose.foundation.x3 x3Var2 = this.f14565j3;
        c3 c3Var2 = this.f14566k3;
        b5 b5Var = new b5(g4Var, x3Var2, c3Var2 == null ? x0Var : c3Var2, bVar, new Function0() { // from class: androidx.compose.foundation.gestures.d4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(f4.la(this.f14537a));
            }
        });
        this.f14571p3 = b5Var;
        p4 p4Var = new p4(b5Var, z10);
        this.f14572q3 = p4Var;
        v9(androidx.compose.ui.input.nestedscroll.e.c(p4Var, bVar));
    }

    private final void ka() {
        this.f14573r3 = null;
        this.f14574s3 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean la(f4 f4Var) {
        return f4Var.a9();
    }

    private final void ma() {
        this.f14573r3 = new Function2() { // from class: androidx.compose.foundation.gestures.c4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(f4.na(this.f14419a, ((Float) obj).floatValue(), ((Float) obj2).floatValue()));
            }
        };
        this.f14574s3 = new d(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean na(f4 f4Var, float f10, float f11) {
        kotlinx.coroutines.k.f(f4Var.Q8(), null, null, f4Var.new c(f10, f11, null), 3, null);
        return true;
    }

    private final void pa() {
        if (a9()) {
            this.f14570o3.d(androidx.compose.ui.node.k.q(this));
        }
    }

    @Override // androidx.compose.foundation.gestures.j2
    @Nullable
    public Object T9(@NotNull Function2<? super Function1<? super d1.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objB = this.f14571p3.B(androidx.compose.foundation.q3.UserInput, new a(function2, null), dVar);
        return objB == kotlin.coroutines.intrinsics.b.l() ? objB : Unit.f312394a;
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return this.f14567l3;
    }

    @Override // androidx.compose.foundation.gestures.j2
    public void Y9(long j10) {
    }

    @Override // androidx.compose.foundation.gestures.j2
    public void Z9(long j10) {
        int i10 = 5 ^ 3;
        kotlinx.coroutines.k.f(this.f14568m3.f(), null, null, new b(j10, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.j2
    public boolean da() {
        return this.f14571p3.H();
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        pa();
    }

    @Override // androidx.compose.ui.node.j, androidx.compose.ui.node.d2
    public void l0() {
        p3();
        pa();
    }

    public final void oa(@NotNull g4 g4Var, @Nullable androidx.compose.foundation.x3 x3Var, boolean z10, @Nullable c3 c3Var, @Nullable androidx.compose.foundation.interaction.j jVar) {
        boolean z11;
        if (V9() != z10) {
            this.f14572q3.c(z10);
            this.f14569n3.w9(z10);
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = z11;
        boolean zI = this.f14571p3.I(g4Var, x3Var, c3Var == null ? this.f14570o3 : c3Var, this.f14568m3);
        this.f14565j3 = x3Var;
        this.f14566k3 = c3Var;
        j2.ga(this, n4.f(), z10, jVar, null, zI, 8, null);
        if (z12) {
            ka();
            androidx.compose.ui.node.j2.b(this);
        }
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        if (V9() && (this.f14573r3 == null || this.f14574s3 == null)) {
            ma();
        }
        Function2<? super Float, ? super Float, Boolean> function2 = this.f14573r3;
        if (function2 != null) {
            androidx.compose.ui.semantics.b0.m1(e0Var, null, function2, 1, null);
        }
        Function2<? super n0.g, ? super kotlin.coroutines.d<? super n0.g>, ? extends Object> function3 = this.f14574s3;
        if (function3 != null) {
            androidx.compose.ui.semantics.b0.n1(e0Var, function3);
        }
    }

    @Override // androidx.compose.foundation.gestures.j2, androidx.compose.ui.node.d2
    public void p5(@NotNull androidx.compose.ui.input.pointer.q qVar, @NotNull androidx.compose.ui.input.pointer.s sVar, long j10) {
        List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (U9().invoke(listE.get(i10)).booleanValue()) {
                super.p5(qVar, sVar, j10);
                return;
            }
        }
    }
}
