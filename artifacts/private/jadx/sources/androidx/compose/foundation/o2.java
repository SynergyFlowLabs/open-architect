package androidx.compose.foundation;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class o2 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.d2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.interaction.j f18157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.interaction.e.a f18158t;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160742x1}, m = "emitEnter", n = {"interaction"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f18159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f18160b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18162d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f18160b = obj;
            this.f18162d |= Integer.MIN_VALUE;
            return o2.this.x9(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {}, l = {114}, m = "emitExit", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f18163a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18165c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f18163a = obj;
            this.f18165c |= Integer.MIN_VALUE;
            return o2.this.y9(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18166a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o2.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f18166a;
            if (i10 == 0) {
                ResultKt.m(obj);
                o2 o2Var = o2.this;
                this.f18166a = 1;
                if (o2Var.x9(this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18168a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o2.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f18168a;
            if (i10 == 0) {
                ResultKt.m(obj);
                o2 o2Var = o2.this;
                this.f18168a = 1;
                if (o2Var.y9(this) == objL) {
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
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public o2(@NotNull androidx.compose.foundation.interaction.j jVar) {
        this.f18157s = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object x9(kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        androidx.compose.foundation.interaction.e.a aVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f18162d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f18162d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f18160b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f18162d;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (this.f18158t == null) {
                androidx.compose.foundation.interaction.e.a aVar3 = new androidx.compose.foundation.interaction.e.a();
                androidx.compose.foundation.interaction.j jVar = this.f18157s;
                aVar.f18159a = aVar3;
                aVar.f18162d = 1;
                if (jVar.b(aVar3, aVar) == objL) {
                    return objL;
                }
                aVar2 = aVar3;
            }
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aVar2 = (androidx.compose.foundation.interaction.e.a) aVar.f18159a;
        ResultKt.m(obj);
        this.f18158t = aVar2;
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object y9(kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f18165c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f18165c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f18163a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f18165c;
        if (i11 == 0) {
            ResultKt.m(obj);
            androidx.compose.foundation.interaction.e.a aVar = this.f18158t;
            if (aVar != null) {
                androidx.compose.foundation.interaction.e.b bVar2 = new androidx.compose.foundation.interaction.e.b(aVar);
                androidx.compose.foundation.interaction.j jVar = this.f18157s;
                bVar.f18165c = 1;
                if (jVar.b(bVar2, bVar) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.f18158t = null;
        return Unit.f312394a;
    }

    private final void z9() {
        androidx.compose.foundation.interaction.e.a aVar = this.f18158t;
        if (aVar != null) {
            this.f18157s.a(new androidx.compose.foundation.interaction.e.b(aVar));
            this.f18158t = null;
        }
    }

    public final void A9(@NotNull androidx.compose.foundation.interaction.j jVar) {
        if (Intrinsics.areEqual(this.f18157s, jVar)) {
            return;
        }
        z9();
        this.f18157s = jVar;
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        z9();
    }

    @Override // androidx.compose.ui.node.d2
    public void p3() {
        z9();
    }

    @Override // androidx.compose.ui.node.d2
    public void p5(@NotNull androidx.compose.ui.input.pointer.q qVar, @NotNull androidx.compose.ui.input.pointer.s sVar, long j10) {
        if (sVar == androidx.compose.ui.input.pointer.s.Main) {
            int iJ = qVar.j();
            androidx.compose.ui.input.pointer.u.a aVar = androidx.compose.ui.input.pointer.u.f39127b;
            if (androidx.compose.ui.input.pointer.u.k(iJ, aVar.a())) {
                int i10 = 2 | 0;
                kotlinx.coroutines.k.f(Q8(), null, null, new c(null), 3, null);
            } else if (androidx.compose.ui.input.pointer.u.k(iJ, aVar.b())) {
                int i11 = 5 & 3;
                kotlinx.coroutines.k.f(Q8(), null, null, new d(null), 3, null);
            }
        }
    }
}
