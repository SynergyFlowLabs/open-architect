package androidx.compose.material3;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/ThumbNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,631:1\n52#2,7:632\n52#2:639\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/ThumbNode\n*L\n258#1:632,7\n260#1:639\n*E\n"})
final class s50 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    @Nullable
    private androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> X;

    @Nullable
    private androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> Y;
    private float Z = Float.NaN;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f32724p0 = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.interaction.h f32725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f32726t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private androidx.compose.animation.core.y0<Float> f32727v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f32728w;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ThumbNode$measure$1", f = "Switch.kt", i = {}, l = {com.badlogic.gdx.utils.compression.lzma.a.f95331z}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32729a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f32731c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f32731c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return s50.this.new a(this.f32731c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f32729a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c cVar = s50.this.Y;
                if (cVar != null) {
                    Float fE = kotlin.coroutines.jvm.internal.b.e(this.f32731c);
                    androidx.compose.animation.core.y0<Float> y0VarA9 = s50.this.f32728w ? t20.f33065f : s50.this.A9();
                    this.f32729a = 1;
                    obj = androidx.compose.animation.core.c.i(cVar, fE, y0VarA9, null, null, this, 12, null);
                    if (obj == objL) {
                        return objL;
                    }
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ThumbNode$measure$2", f = "Switch.kt", i = {}, l = {278}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32732a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f32734c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f32734c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return s50.this.new b(this.f32734c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f32732a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c cVar = s50.this.X;
                if (cVar != null) {
                    Float fE = kotlin.coroutines.jvm.internal.b.e(this.f32734c);
                    androidx.compose.animation.core.y0<Float> y0VarA9 = s50.this.f32728w ? t20.f33065f : s50.this.A9();
                    this.f32732a = 1;
                    obj = androidx.compose.animation.core.c.i(cVar, fE, y0VarA9, null, null, this, 12, null);
                    if (obj == objL) {
                        return objL;
                    }
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ThumbNode$onAttach$1", f = "Switch.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32735a;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.f f32737a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s50 f32738b;

            a(kotlin.jvm.internal.i1.f fVar, s50 s50Var) {
                this.f32737a = fVar;
                this.f32738b = s50Var;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                boolean z10 = true;
                if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                    this.f32737a.f312749a++;
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                    this.f32737a.f312749a--;
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                    this.f32737a.f312749a--;
                }
                if (this.f32737a.f312749a <= 0) {
                    z10 = false;
                }
                if (this.f32738b.f32728w != z10) {
                    this.f32738b.f32728w = z10;
                    androidx.compose.ui.node.j0.b(this.f32738b);
                }
                return Unit.f312394a;
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return s50.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f32735a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = s50.this.C9().c();
                a aVar = new a(fVar, s50.this);
                this.f32735a = 1;
                if (iVarC.collect(aVar, this) == objL) {
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

    public s50(@NotNull androidx.compose.foundation.interaction.h hVar, boolean z10, @NotNull androidx.compose.animation.core.y0<Float> y0Var) {
        this.f32725s = hVar;
        this.f32726t = z10;
        this.f32727v = y0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D9(androidx.compose.ui.layout.i2 i2Var, s50 s50Var, float f10, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar = s50Var.X;
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, cVar != null ? (int) cVar.v().floatValue() : (int) f10, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    @NotNull
    public final androidx.compose.animation.core.y0<Float> A9() {
        return this.f32727v;
    }

    public final boolean B9() {
        return this.f32726t;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.h C9() {
        return this.f32725s;
    }

    public final void E9(@NotNull androidx.compose.animation.core.y0<Float> y0Var) {
        this.f32727v = y0Var;
    }

    public final void F9(boolean z10) {
        this.f32726t = z10;
    }

    public final void G9(@NotNull androidx.compose.foundation.interaction.h hVar) {
        this.f32725s = hVar;
    }

    public final void H9() {
        if (this.Y == null && !Float.isNaN(this.f32724p0)) {
            this.Y = androidx.compose.animation.core.d.b(this.f32724p0, 0.0f, 2, null);
        }
        if (this.X == null && !Float.isNaN(this.Z)) {
            this.X = androidx.compose.animation.core.d.b(this.Z, 0.0f, 2, null);
        }
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return false;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        float fK;
        boolean z10 = (z0Var.p0(androidx.compose.ui.unit.b.p(j10)) == 0 || z0Var.M0(androidx.compose.ui.unit.b.o(j10)) == 0) ? false : true;
        if (this.f32728w) {
            fK = d0.y2.f269421a.r();
        } else {
            fK = (z10 || this.f32726t) ? t20.k() : t20.l();
        }
        float fS7 = c1Var.S7(fK);
        androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar = this.Y;
        int iFloatValue = (int) (cVar != null ? cVar.v().floatValue() : fS7);
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.f42658b.c(iFloatValue, iFloatValue));
        final float fS8 = c1Var.S7(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(t20.f33063d - c1Var.F3(fS7)) / 2.0f));
        float fS9 = c1Var.S7(androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(t20.f33062c - t20.k()) - t20.f33064e));
        boolean z11 = this.f32728w;
        if (z11 && this.f32726t) {
            fS8 = fS9 - c1Var.S7(d0.y2.f269421a.K());
        } else if (z11 && !this.f32726t) {
            fS8 = c1Var.S7(d0.y2.f269421a.K());
        } else if (this.f32726t) {
            fS8 = fS9;
        }
        androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar2 = this.Y;
        if (!Intrinsics.areEqual(cVar2 != null ? cVar2.s() : null, fS7)) {
            kotlinx.coroutines.k.f(Q8(), null, null, new a(fS7, null), 3, null);
        }
        androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar3 = this.X;
        if (!Intrinsics.areEqual(cVar3 != null ? cVar3.s() : null, fS8)) {
            kotlinx.coroutines.k.f(Q8(), null, null, new b(fS8, null), 3, null);
        }
        if (Float.isNaN(this.f32724p0) && Float.isNaN(this.Z)) {
            this.f32724p0 = fS7;
            this.Z = fS8;
        }
        int i10 = 3 << 0;
        return androidx.compose.ui.layout.c1.h6(c1Var, iFloatValue, iFloatValue, null, new Function1() { // from class: androidx.compose.material3.r50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s50.D9(i2VarP0, this, fS8, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        kotlinx.coroutines.k.f(Q8(), null, null, new c(null), 3, null);
    }
}
