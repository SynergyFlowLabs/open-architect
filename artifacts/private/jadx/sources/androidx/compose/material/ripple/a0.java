package androidx.compose.material.ripple;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.q0;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,530:1\n225#2,8:531\n272#2,14:539\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n*L\n497#1:531,8\n497#1:539,14\n*E\n"})
final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<l> f24712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f24713c = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<androidx.compose.foundation.interaction.g> f24714d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.interaction.g f24715e;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", i = {}, l = {480}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24716a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f24718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f24719d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f24718c = f10;
            this.f24719d = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a0.this.new a(this.f24718c, this.f24719d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f24716a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c cVar = a0.this.f24713c;
                Float fE = kotlin.coroutines.jvm.internal.b.e(this.f24718c);
                androidx.compose.animation.core.o<Float> oVar = this.f24719d;
                this.f24716a = 1;
                if (androidx.compose.animation.core.c.i(cVar, fE, oVar, null, null, this, 12, null) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", i = {}, l = {484}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24720a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f24722c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f24722c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a0.this.new b(this.f24722c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f24720a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c cVar = a0.this.f24713c;
                Float fE = kotlin.coroutines.jvm.internal.b.e(0.0f);
                androidx.compose.animation.core.o<Float> oVar = this.f24722c;
                this.f24720a = 1;
                if (androidx.compose.animation.core.c.i(cVar, fE, oVar, null, null, this, 12, null) == objL) {
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
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public a0(boolean z10, @NotNull Function0<l> function0) {
        this.f24711a = z10;
        this.f24712b = function0;
    }

    public final void b(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, float f10, long j10) {
        float fFloatValue = this.f24713c.v().floatValue();
        if (fFloatValue > 0.0f) {
            long jW = q0.w(j10, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.f24711a) {
                androidx.compose.ui.graphics.drawscope.f.B4(fVar, jW, f10, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float fT = n0.n.t(fVar.d());
            float fM = n0.n.m(fVar.d());
            int iB = p0.f38096b.b();
            androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
            long jD = dVarZ3.d();
            dVarZ3.f().save();
            try {
                dVarZ3.i().b(0.0f, 0.0f, fT, fM, iB);
                androidx.compose.ui.graphics.drawscope.f.B4(fVar, jW, f10, 0L, 0.0f, null, null, 0, 124, null);
            } finally {
                dVarZ3.f().B();
                dVarZ3.g(jD);
            }
        }
    }

    public final void c(@NotNull androidx.compose.foundation.interaction.g gVar, @NotNull s0 s0Var) {
        float fA;
        if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
            this.f24714d.add(gVar);
        } else if (gVar instanceof androidx.compose.foundation.interaction.e.b) {
            this.f24714d.remove(((androidx.compose.foundation.interaction.e.b) gVar).a());
        } else if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
            this.f24714d.add(gVar);
        } else if (gVar instanceof androidx.compose.foundation.interaction.c.b) {
            this.f24714d.remove(((androidx.compose.foundation.interaction.c.b) gVar).a());
        } else if (gVar instanceof androidx.compose.foundation.interaction.a.b) {
            this.f24714d.add(gVar);
        } else if (gVar instanceof androidx.compose.foundation.interaction.a.c) {
            this.f24714d.remove(((androidx.compose.foundation.interaction.a.c) gVar).a());
        } else if (!(gVar instanceof androidx.compose.foundation.interaction.a.C0087a)) {
            return;
        } else {
            this.f24714d.remove(((androidx.compose.foundation.interaction.a.C0087a) gVar).a());
        }
        androidx.compose.foundation.interaction.g gVar2 = (androidx.compose.foundation.interaction.g) CollectionsKt.lastOrNull((List) this.f24714d);
        if (Intrinsics.areEqual(this.f24715e, gVar2)) {
            return;
        }
        if (gVar2 != null) {
            l lVarInvoke = this.f24712b.invoke();
            if (gVar2 instanceof androidx.compose.foundation.interaction.e.a) {
                fA = lVarInvoke.c();
            } else if (gVar2 instanceof androidx.compose.foundation.interaction.c.a) {
                fA = lVarInvoke.b();
            } else {
                fA = gVar2 instanceof androidx.compose.foundation.interaction.a.b ? lVarInvoke.a() : 0.0f;
            }
            kotlinx.coroutines.k.f(s0Var, null, null, new a(fA, v.d(gVar2), null), 3, null);
        } else {
            kotlinx.coroutines.k.f(s0Var, null, null, new b(v.e(this.f24715e), null), 3, null);
        }
        this.f24715e = gVar2;
    }
}
