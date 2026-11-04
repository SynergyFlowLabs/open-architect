package androidx.compose.foundation.gestures;

import androidx.compose.runtime.k7;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final t3 f14327a = new a();

    public static final class a implements t3 {
        a() {
        }

        @Override // androidx.compose.foundation.gestures.t3
        public long a(long j10) {
            return j10;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.Scrollable2DKt", f = "Scrollable2D.kt", i = {0}, l = {526}, m = "semanticsScrollBy-d-4ec7I", n = {"previousValue"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14330c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14329b = obj;
            this.f14330c |= Integer.MIN_VALUE;
            return a4.i(null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2", f = "Scrollable2D.kt", i = {}, l = {527}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<o3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f14333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.g f14334d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, kotlin.jvm.internal.i1.g gVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f14333c = j10;
            this.f14334d = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(kotlin.jvm.internal.i1.g gVar, o3 o3Var, n0.g gVar2, n0.g gVar3) {
            gVar.f312750a = n0.g.w(gVar.f312750a, o3Var.b(n0.g.v(gVar2.B(), gVar.f312750a), androidx.compose.ui.input.nestedscroll.f.f38949b.h()));
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f14333c, this.f14334d, dVar);
            cVar.f14332b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14331a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final o3 o3Var = (o3) this.f14332b;
                n0.g.a aVar = n0.g.f332700b;
                androidx.compose.animation.core.z3<n0.g, androidx.compose.animation.core.t> z3VarR = androidx.compose.animation.core.t4.R(aVar);
                n0.g gVarD = n0.g.d(aVar.e());
                n0.g gVarD2 = n0.g.d(this.f14333c);
                final kotlin.jvm.internal.i1.g gVar = this.f14334d;
                Function2 function2 = new Function2() { // from class: androidx.compose.foundation.gestures.b4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return a4.c.n(gVar, o3Var, (n0.g) obj2, (n0.g) obj3);
                    }
                };
                this.f14331a = 1;
                if (androidx.compose.animation.core.f3.q(z3VarR, gVarD, gVarD2, null, null, function2, this, 24, null) == objL) {
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
            return ((c) create(o3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(long j10) {
        return (float) Math.atan2(androidx.compose.ui.unit.c0.n(j10), androidx.compose.ui.unit.c0.l(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(long j10) {
        double d10 = 2;
        return (float) Math.sqrt(((float) Math.pow(androidx.compose.ui.unit.c0.l(j10), d10)) + ((float) Math.pow(androidx.compose.ui.unit.c0.n(j10), d10)));
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, @NotNull g4 g4Var, boolean z10, @Nullable androidx.compose.foundation.x3 x3Var, @Nullable c3 c3Var, @Nullable androidx.compose.foundation.interaction.j jVar) {
        return a0Var.B2(new Scrollable2DElement(g4Var, x3Var, z10, c3Var, jVar));
    }

    public static /* synthetic */ androidx.compose.ui.a0 h(androidx.compose.ui.a0 a0Var, g4 g4Var, boolean z10, androidx.compose.foundation.x3 x3Var, c3 c3Var, androidx.compose.foundation.interaction.j jVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return g(a0Var, g4Var, z10, (i10 & 4) != 0 ? null : x3Var, (i10 & 8) != 0 ? null : c3Var, (i10 & 16) != 0 ? null : jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object i(b5 b5Var, long j10, kotlin.coroutines.d<? super n0.g> dVar) {
        b bVar;
        kotlin.jvm.internal.i1.g gVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f14330c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f14330c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f14329b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f14330c;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlin.jvm.internal.i1.g gVar2 = new kotlin.jvm.internal.i1.g();
            gVar2.f312750a = n0.g.f332700b.e();
            androidx.compose.foundation.q3 q3Var = androidx.compose.foundation.q3.Default;
            Function2<? super o3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> cVar = new c(j10, gVar2, null);
            bVar.f14328a = gVar2;
            bVar.f14330c = 1;
            if (b5Var.B(q3Var, cVar, bVar) == objL) {
                return objL;
            }
            gVar = gVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = (kotlin.jvm.internal.i1.g) bVar.f14328a;
            ResultKt.m(obj);
        }
        return n0.g.d(gVar.f312750a);
    }
}
