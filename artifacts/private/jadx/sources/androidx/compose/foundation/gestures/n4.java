package androidx.compose.foundation.gestures;

import androidx.compose.runtime.k7;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class n4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f14848c = 1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<androidx.compose.ui.input.pointer.c0, Boolean> f14846a = new Function1() { // from class: androidx.compose.foundation.gestures.m4
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(n4.b((androidx.compose.ui.input.pointer.c0) obj));
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final z3 f14847b = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.c0 f14849d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.unit.d f14850e = new c();

    public static final class a implements androidx.compose.ui.c0 {
        a() {
        }

        @Override // androidx.compose.ui.c0
        public float B0() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <R> R fold(R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) androidx.compose.ui.c0.a.a(this, r10, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <E extends CoroutineContext.Element> E get(CoroutineContext.b<E> bVar) {
            return (E) androidx.compose.ui.c0.a.b(this, bVar);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
            return androidx.compose.ui.c0.a.c(this, bVar);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public CoroutineContext plus(CoroutineContext coroutineContext) {
            return androidx.compose.ui.c0.a.d(this, coroutineContext);
        }
    }

    public static final class b implements z3 {
        b() {
        }

        @Override // androidx.compose.foundation.gestures.z3
        public float f(float f10) {
            return f10;
        }
    }

    public static final class c implements androidx.compose.ui.unit.d {
        c() {
        }

        @Override // androidx.compose.ui.unit.d
        public float getDensity() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.n
        public float m0() {
            return 1.0f;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", i = {0, 0}, l = {com.google.api.v.f116367a}, m = "semanticsScrollBy-d-4ec7I", n = {"$this$semanticsScrollBy_u2dd_u2d4ec7I", "previousValue"}, s = {"L$0", "L$1"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14854d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14853c = obj;
            this.f14854d |= Integer.MIN_VALUE;
            return n4.n(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", i = {}, l = {com.google.api.w0.f116391a}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<o3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z4 f14857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f14858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.e f14859e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(z4 z4Var, long j10, kotlin.jvm.internal.i1.e eVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f14857c = z4Var;
            this.f14858d = j10;
            this.f14859e = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(kotlin.jvm.internal.i1.e eVar, z4 z4Var, o3 o3Var, float f10, float f11) {
            eVar.f312748a += z4Var.A(z4Var.K(o3Var.b(z4Var.L(z4Var.A(f10 - eVar.f312748a)), androidx.compose.ui.input.nestedscroll.f.f38949b.h())));
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f14857c, this.f14858d, this.f14859e, dVar);
            eVar.f14856b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14855a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final o3 o3Var = (o3) this.f14856b;
                float fK = this.f14857c.K(this.f14858d);
                final kotlin.jvm.internal.i1.e eVar = this.f14859e;
                final z4 z4Var = this.f14857c;
                Function2 function2 = new Function2() { // from class: androidx.compose.foundation.gestures.o4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return n4.e.n(eVar, z4Var, o3Var, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    }
                };
                this.f14855a = 1;
                if (androidx.compose.animation.core.f3.o(0.0f, fK, 0.0f, null, function2, this, 12, null) == objL) {
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
            return ((e) create(o3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(androidx.compose.ui.input.pointer.c0 c0Var) {
        return !androidx.compose.ui.input.pointer.r0.i(c0Var.C(), androidx.compose.ui.input.pointer.r0.f39113b.b());
    }

    @NotNull
    public static final Function1<androidx.compose.ui.input.pointer.c0, Boolean> f() {
        return f14846a;
    }

    @NotNull
    public static final androidx.compose.ui.c0 g() {
        return f14849d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(c3 c3Var) {
        return !(c3Var instanceof k4);
    }

    @NotNull
    public static final androidx.compose.ui.unit.d i() {
        return f14850e;
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var, @NotNull v4 v4Var, @NotNull q3 q3Var, @Nullable androidx.compose.foundation.x3 x3Var, boolean z10, boolean z11, @Nullable c3 c3Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable m0 m0Var) {
        return a0Var.B2(new ScrollableElement(v4Var, q3Var, x3Var, z10, z11, c3Var, jVar, m0Var));
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 k(@NotNull androidx.compose.ui.a0 a0Var, @NotNull v4 v4Var, @NotNull q3 q3Var, boolean z10, boolean z11, @Nullable c3 c3Var, @Nullable androidx.compose.foundation.interaction.j jVar) {
        return l(a0Var, v4Var, q3Var, null, z10, z11, c3Var, jVar, null, 128, null);
    }

    public static /* synthetic */ androidx.compose.ui.a0 l(androidx.compose.ui.a0 a0Var, v4 v4Var, q3 q3Var, androidx.compose.foundation.x3 x3Var, boolean z10, boolean z11, c3 c3Var, androidx.compose.foundation.interaction.j jVar, m0 m0Var, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return j(a0Var, v4Var, q3Var, x3Var, z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? null : c3Var, (i10 & 64) != 0 ? null : jVar, (i10 & 128) != 0 ? null : m0Var);
    }

    public static /* synthetic */ androidx.compose.ui.a0 m(androidx.compose.ui.a0 a0Var, v4 v4Var, q3 q3Var, boolean z10, boolean z11, c3 c3Var, androidx.compose.foundation.interaction.j jVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return k(a0Var, v4Var, q3Var, z12, z11, (i10 & 16) != 0 ? null : c3Var, (i10 & 32) != 0 ? null : jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object n(z4 z4Var, long j10, kotlin.coroutines.d<? super n0.g> dVar) {
        d dVar2;
        kotlin.jvm.internal.i1.e eVar;
        z4 z4Var2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f14854d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f14854d = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f14853c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f14854d;
        if (i11 == 0) {
            ResultKt.m(obj);
            eVar = new kotlin.jvm.internal.i1.e();
            androidx.compose.foundation.q3 q3Var = androidx.compose.foundation.q3.Default;
            e eVar2 = new e(z4Var, j10, eVar, null);
            dVar2.f14851a = z4Var;
            dVar2.f14852b = eVar;
            dVar2.f14854d = 1;
            if (z4Var.C(q3Var, eVar2, dVar2) == objL) {
                return objL;
            }
            z4Var2 = z4Var;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.i1.e eVar3 = (kotlin.jvm.internal.i1.e) dVar2.f14852b;
            z4 z4Var3 = (z4) dVar2.f14851a;
            ResultKt.m(obj);
            eVar = eVar3;
            z4Var2 = z4Var3;
        }
        return n0.g.d(z4Var2.L(eVar.f312748a));
    }
}
