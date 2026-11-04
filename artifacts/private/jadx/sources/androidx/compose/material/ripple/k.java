package androidx.compose.material.ripple;

import androidx.compose.foundation.t2;
import androidx.compose.foundation.u2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import androidx.compose.ui.graphics.q0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@kotlin.l(message = "Replaced by the new RippleNode implementation")
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,530:1\n75#2:531\n696#3:532\n1282#4,6:533\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n*L\n192#1:531\n195#1:532\n206#1:533,6\n*E\n"})
public abstract class k implements t2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f24766d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f24768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n7<q0> f24769c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", f = "Ripple.kt", i = {}, l = {m0.f36245r}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f24771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f24772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f24773d;

        /* JADX INFO: renamed from: androidx.compose.material.ripple.k$a$a, reason: collision with other inner class name */
        static final class C0198a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ u f24774a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s0 f24775b;

            C0198a(u uVar, s0 s0Var) {
                this.f24774a = uVar;
                this.f24775b = s0Var;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                    this.f24774a.c((androidx.compose.foundation.interaction.l.b) gVar, this.f24775b);
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                    this.f24774a.e(((androidx.compose.foundation.interaction.l.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                    this.f24774a.e(((androidx.compose.foundation.interaction.l.a) gVar).a());
                } else {
                    this.f24774a.g(gVar, this.f24775b);
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.interaction.h hVar, u uVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f24772c = hVar;
            this.f24773d = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f24772c, this.f24773d, dVar);
            aVar.f24771b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f24770a;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var = (s0) this.f24771b;
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.f24772c.c();
                C0198a c0198a = new C0198a(this.f24773d, s0Var);
                this.f24770a = 1;
                if (iVarC.collect(c0198a, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ k(boolean z10, float f10, n7 n7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, n7Var);
    }

    @Override // androidx.compose.foundation.t2
    @androidx.compose.runtime.o
    @kotlin.l(message = "Super method is deprecated")
    @NotNull
    public final u2 b(@NotNull androidx.compose.foundation.interaction.h hVar, @Nullable c0 c0Var, int i10) {
        long jA;
        c0Var.E(988743187);
        if (m0.l0()) {
            m0.A0(988743187, i10, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:190)");
        }
        w wVar = (w) c0Var.W(y.f());
        if (this.f24769c.getValue().M() != 16) {
            c0Var.E(762952444);
            c0Var.A();
            jA = this.f24769c.getValue().M();
        } else {
            c0Var.E(763010228);
            jA = wVar.a(c0Var, 0);
            c0Var.A();
        }
        n7<q0> n7VarW = w6.w(q0.n(jA), c0Var, 0);
        n7<l> n7VarW2 = w6.w(wVar.b(c0Var, 0), c0Var, 0);
        int i11 = i10 & 14;
        u uVarC = c(hVar, this.f24767a, this.f24768b, n7VarW, n7VarW2, c0Var, i11 | ((i10 << 12) & 458752));
        boolean zK0 = c0Var.k0(uVarC) | (((i11 ^ 6) > 4 && c0Var.D(hVar)) || (i10 & 6) == 4);
        Object objI0 = c0Var.i0();
        if (zK0 || objI0 == c0.f35327a.a()) {
            objI0 = new a(hVar, uVarC, null);
            c0Var.Y(objI0);
        }
        b2.h(uVarC, hVar, (Function2) objI0, c0Var, (i10 << 3) & com.planner5d.library.engine.input.f.b.B);
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.A();
        return uVarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public abstract u c(@NotNull androidx.compose.foundation.interaction.h hVar, boolean z10, float f10, @NotNull n7<q0> n7Var, @NotNull n7<l> n7Var2, @Nullable c0 c0Var, int i10);

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f24767a == kVar.f24767a && androidx.compose.ui.unit.h.x(this.f24768b, kVar.f24768b) && Intrinsics.areEqual(this.f24769c, kVar.f24769c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f24767a) * 31) + androidx.compose.ui.unit.h.D(this.f24768b)) * 31) + this.f24769c.hashCode();
    }

    private k(boolean z10, float f10, n7<q0> n7Var) {
        this.f24767a = z10;
        this.f24768b = f10;
        this.f24769c = n7Var;
    }
}
