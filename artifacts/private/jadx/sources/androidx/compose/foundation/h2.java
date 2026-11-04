package androidx.compose.foundation;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class h2 extends androidx.compose.ui.node.m implements androidx.compose.ui.node.i2, androidx.compose.ui.node.v, androidx.compose.ui.node.h, androidx.compose.ui.node.q1, androidx.compose.ui.node.p2 {

    @NotNull
    private final androidx.compose.ui.focus.r0 H1;

    @Nullable
    private final Function1<Boolean, Unit> X;
    private final boolean Y;

    @Nullable
    private androidx.compose.foundation.interaction.c.a Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.g2.a f15502p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.g0 f15503p1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.interaction.j f15504w;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private static final a f15501p2 = new a(null);

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f15500g3 = 8;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.g0 implements Function0<Boolean> {
        b(Object obj) {
            super(0, obj, h2.class, "requestFocus", "requestFocus()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((h2) this.receiver).k3());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.a.f43974q}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f15506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.g f15507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.o1 f15508d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.interaction.g gVar, kotlinx.coroutines.o1 o1Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f15506b = jVar;
            this.f15507c = gVar;
            this.f15508d = o1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f15506b, this.f15507c, this.f15508d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15505a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.interaction.j jVar = this.f15506b;
                androidx.compose.foundation.interaction.g gVar = this.f15507c;
                this.f15505a = 1;
                if (jVar.b(gVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            kotlinx.coroutines.o1 o1Var = this.f15508d;
            if (o1Var != null) {
                o1Var.dispose();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* synthetic */ class d extends kotlin.jvm.internal.g0 implements Function2<androidx.compose.ui.focus.p0, androidx.compose.ui.focus.p0, Unit> {
        d(Object obj) {
            super(2, obj, h2.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        }

        public final void X(androidx.compose.ui.focus.p0 p0Var, androidx.compose.ui.focus.p0 p0Var2) {
            ((h2) this.receiver).P9(p0Var, p0Var2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.focus.p0 p0Var, androidx.compose.ui.focus.p0 p0Var2) {
            X(p0Var, p0Var2);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.FocusableNode$onFocusStateChange$1", f = "Focusable.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15509a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h2.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15509a;
            if (i10 == 0) {
                ResultKt.m(obj);
                h2 h2Var = h2.this;
                this.f15509a = 1;
                if (androidx.compose.ui.relocation.b.b(h2Var, null, this, 1, null) == objL) {
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
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ h2(androidx.compose.foundation.interaction.j jVar, int i10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, i10, function1);
    }

    private final void J9() {
        androidx.compose.foundation.interaction.c.a aVar;
        androidx.compose.foundation.interaction.j jVar = this.f15504w;
        if (jVar != null && (aVar = this.Z) != null) {
            jVar.a(new androidx.compose.foundation.interaction.c.b(aVar));
        }
        this.Z = null;
    }

    private final void K9(boolean z10) {
        androidx.compose.foundation.interaction.j jVar = this.f15504w;
        if (jVar != null) {
            if (!z10) {
                androidx.compose.foundation.interaction.c.a aVar = this.Z;
                if (aVar != null) {
                    L9(jVar, new androidx.compose.foundation.interaction.c.b(aVar));
                    this.Z = null;
                    return;
                }
                return;
            }
            androidx.compose.foundation.interaction.c.a aVar2 = this.Z;
            if (aVar2 != null) {
                L9(jVar, new androidx.compose.foundation.interaction.c.b(aVar2));
                this.Z = null;
            }
            androidx.compose.foundation.interaction.c.a aVar3 = new androidx.compose.foundation.interaction.c.a();
            L9(jVar, aVar3);
            this.Z = aVar3;
        }
    }

    private final void L9(final androidx.compose.foundation.interaction.j jVar, final androidx.compose.foundation.interaction.g gVar) {
        if (!a9()) {
            jVar.a(gVar);
        } else {
            kotlinx.coroutines.p2 p2Var = (kotlinx.coroutines.p2) Q8().getCoroutineContext().get(kotlinx.coroutines.p2.M2);
            kotlinx.coroutines.k.f(Q8(), null, null, new c(jVar, gVar, p2Var != null ? p2Var.E(new Function1() { // from class: androidx.compose.foundation.f2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h2.M9(jVar, gVar, (Throwable) obj);
                }
            }) : null, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M9(androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.interaction.g gVar, Throwable th2) {
        jVar.a(gVar);
        return Unit.f312394a;
    }

    private final j2 N9() {
        if (a9()) {
            androidx.compose.ui.node.p2 p2VarA = androidx.compose.ui.node.q2.a(this, j2.f15738v);
            if (p2VarA instanceof j2) {
                return (j2) p2VarA;
            }
        }
        return null;
    }

    private final void O9() {
        j2 j2VarN9;
        androidx.compose.ui.layout.g0 g0Var = this.f15503p1;
        if (g0Var != null) {
            Intrinsics.checkNotNull(g0Var);
            if (!g0Var.I() || (j2VarN9 = N9()) == null) {
                return;
            }
            j2VarN9.w9(this.f15503p1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P9(androidx.compose.ui.focus.p0 p0Var, androidx.compose.ui.focus.p0 p0Var2) {
        boolean zK;
        if (a9() && (zK = p0Var2.k()) != p0Var.k()) {
            Function1<Boolean, Unit> function1 = this.X;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(zK));
            }
            if (zK) {
                kotlinx.coroutines.k.f(Q8(), null, null, new e(null), 3, null);
                androidx.compose.ui.layout.g2 g2VarQ9 = Q9();
                this.f15502p0 = g2VarQ9 != null ? g2VarQ9.a() : null;
                O9();
            } else {
                androidx.compose.ui.layout.g2.a aVar = this.f15502p0;
                if (aVar != null) {
                    aVar.release();
                }
                this.f15502p0 = null;
                j2 j2VarN9 = N9();
                if (j2VarN9 != null) {
                    j2VarN9.w9(null);
                }
            }
            androidx.compose.ui.node.j2.b(this);
            K9(zK);
        }
    }

    private final androidx.compose.ui.layout.g2 Q9() {
        final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        androidx.compose.ui.node.r1.a(this, new Function0() { // from class: androidx.compose.foundation.g2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h2.R9(hVar, this);
            }
        });
        return (androidx.compose.ui.layout.g2) hVar.f312751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    public static final Unit R9(kotlin.jvm.internal.i1.h hVar, h2 h2Var) {
        hVar.f312751a = androidx.compose.ui.node.i.a(h2Var, androidx.compose.ui.layout.h2.a());
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.node.p2
    @NotNull
    public Object R4() {
        return f15501p2;
    }

    public final void S9(@Nullable androidx.compose.foundation.interaction.j jVar) {
        if (!Intrinsics.areEqual(this.f15504w, jVar)) {
            J9();
            this.f15504w = jVar;
        }
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return this.Y;
    }

    @Override // androidx.compose.ui.node.q1
    public void Y5() {
        androidx.compose.ui.layout.g2 g2VarQ9 = Q9();
        if (this.H1.c5().k()) {
            androidx.compose.ui.layout.g2.a aVar = this.f15502p0;
            if (aVar != null) {
                aVar.release();
            }
            this.f15502p0 = g2VarQ9 != null ? g2VarQ9.a() : null;
        }
    }

    @NotNull
    public final androidx.compose.ui.focus.p0 c5() {
        return this.H1.c5();
    }

    @Override // androidx.compose.ui.a0.d
    public void g9() {
        androidx.compose.ui.layout.g2.a aVar = this.f15502p0;
        if (aVar != null) {
            aVar.release();
        }
        this.f15502p0 = null;
    }

    public final boolean k3() {
        return androidx.compose.ui.focus.r0.B1(this.H1, 0, 1, null);
    }

    @Override // androidx.compose.ui.node.v
    public void n0(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        this.f15503p1 = g0Var;
        if (this.H1.c5().k()) {
            if (g0Var.I()) {
                O9();
                return;
            }
            j2 j2VarN9 = N9();
            if (j2VarN9 != null) {
                j2VarN9.w9(null);
            }
        }
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.A1(e0Var, this.H1.c5().k());
        androidx.compose.ui.semantics.b0.k1(e0Var, null, new b(this), 1, null);
    }

    public /* synthetic */ h2(androidx.compose.foundation.interaction.j jVar, int i10, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, (i11 & 2) != 0 ? androidx.compose.ui.focus.w0.f37469b.a() : i10, (i11 & 4) != 0 ? null : function1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h2(androidx.compose.foundation.interaction.j jVar, int i10, Function1<? super Boolean, Unit> function1) {
        this.f15504w = jVar;
        this.X = function1;
        this.H1 = (androidx.compose.ui.focus.r0) v9(androidx.compose.ui.focus.s0.b(i10, new d(this)));
    }
}
