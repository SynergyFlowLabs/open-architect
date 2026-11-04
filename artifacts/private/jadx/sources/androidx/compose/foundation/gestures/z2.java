package androidx.compose.foundation.gestures;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class z2 extends j2 {

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final int f15433p3 = 8;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private a3 f15434j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    private q3 f15435k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f15436l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private pj.n<? super kotlinx.coroutines.s0, ? super n0.g, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> f15437m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NotNull
    private pj.n<? super kotlinx.coroutines.s0, ? super Float, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> f15438n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private boolean f15439o3;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", i = {}, l = {303}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<k2, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<Function1<? super d1.b, Unit>, kotlin.coroutines.d<? super Unit>, Object> f15442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z2 f15443d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Function1<? super d1.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, z2 z2Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f15442c = function2;
            this.f15443d = z2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(k2 k2Var, z2 z2Var, d1.b bVar) {
            k2Var.a(x2.l(z2Var.na(bVar.a()), z2Var.f15435k3));
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f15442c, this.f15443d, dVar);
            aVar.f15441b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15440a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final k2 k2Var = (k2) this.f15441b;
                Function2<Function1<? super d1.b, Unit>, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f15442c;
                final z2 z2Var = this.f15443d;
                Function1<? super d1.b, Unit> function1 = new Function1() { // from class: androidx.compose.foundation.gestures.y2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return z2.a.n(k2Var, z2Var, (d1.b) obj2);
                    }
                };
                this.f15440a = 1;
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
        public final Object invoke(k2 k2Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(k2Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", i = {}, l = {312}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15445b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15447d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f15447d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = z2.this.new b(this.f15447d, dVar);
            bVar.f15445b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15444a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f15445b;
                pj.n nVar = z2.this.f15437m3;
                n0.g gVarD = n0.g.d(this.f15447d);
                this.f15444a = 1;
                if (nVar.invoke(s0Var, gVarD, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", i = {}, l = {319}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15449b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15451d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f15451d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = z2.this.new c(this.f15451d, dVar);
            cVar.f15449b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15448a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f15449b;
                pj.n nVar = z2.this.f15438n3;
                Float fE = kotlin.coroutines.jvm.internal.b.e(x2.m(z2.this.ma(this.f15451d), z2.this.f15435k3));
                this.f15448a = 1;
                if (nVar.invoke(s0Var, fE, this) == objL) {
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

    public z2(@NotNull a3 a3Var, @NotNull Function1<? super androidx.compose.ui.input.pointer.c0, Boolean> function1, @NotNull q3 q3Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, boolean z11, @NotNull pj.n<? super kotlinx.coroutines.s0, ? super n0.g, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, @NotNull pj.n<? super kotlinx.coroutines.s0, ? super Float, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar2, boolean z12) {
        super(function1, z10, jVar, q3Var);
        this.f15434j3 = a3Var;
        this.f15435k3 = q3Var;
        this.f15436l3 = z11;
        this.f15437m3 = nVar;
        this.f15438n3 = nVar2;
        this.f15439o3 = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long ma(long j10) {
        return androidx.compose.ui.unit.c0.s(j10, this.f15439o3 ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long na(long j10) {
        return n0.g.y(j10, this.f15439o3 ? -1.0f : 1.0f);
    }

    @Override // androidx.compose.foundation.gestures.j2
    @Nullable
    public Object T9(@NotNull Function2<? super Function1<? super d1.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = this.f15434j3.a(androidx.compose.foundation.q3.UserInput, new a(function2, this, null), dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    @Override // androidx.compose.foundation.gestures.j2
    public void Y9(long j10) {
        if (!a9() || Intrinsics.areEqual(this.f15437m3, x2.f15377a)) {
            return;
        }
        kotlinx.coroutines.k.f(Q8(), null, kotlinx.coroutines.u0.UNDISPATCHED, new b(j10, null), 1, null);
    }

    @Override // androidx.compose.foundation.gestures.j2
    public void Z9(long j10) {
        if (a9() && !Intrinsics.areEqual(this.f15438n3, x2.f15378b)) {
            kotlinx.coroutines.k.f(Q8(), null, kotlinx.coroutines.u0.UNDISPATCHED, new c(j10, null), 1, null);
        }
    }

    @Override // androidx.compose.foundation.gestures.j2
    public boolean da() {
        return this.f15436l3;
    }

    public final void oa(@NotNull a3 a3Var, @NotNull Function1<? super androidx.compose.ui.input.pointer.c0, Boolean> function1, @NotNull q3 q3Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, boolean z11, @NotNull pj.n<? super kotlinx.coroutines.s0, ? super n0.g, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, @NotNull pj.n<? super kotlinx.coroutines.s0, ? super Float, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar2, boolean z12) {
        boolean z13;
        boolean z14 = true;
        if (Intrinsics.areEqual(this.f15434j3, a3Var)) {
            z13 = false;
        } else {
            this.f15434j3 = a3Var;
            z13 = true;
        }
        if (this.f15435k3 != q3Var) {
            this.f15435k3 = q3Var;
            z13 = true;
        }
        if (this.f15439o3 != z12) {
            this.f15439o3 = z12;
        } else {
            z14 = z13;
        }
        this.f15437m3 = nVar;
        this.f15438n3 = nVar2;
        this.f15436l3 = z11;
        fa(function1, z10, jVar, q3Var, z14);
    }
}
