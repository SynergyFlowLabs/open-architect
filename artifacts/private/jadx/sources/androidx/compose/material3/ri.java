package androidx.compose.material3;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/IndicatorLineNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1663:1\n61#2:1664\n57#2:1667\n61#2:1670\n70#3:1665\n60#3:1668\n70#3:1671\n22#4:1666\n22#4:1669\n22#4:1672\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/IndicatorLineNode\n*L\n1644#1:1664\n1645#1:1667\n1646#1:1670\n1644#1:1665\n1645#1:1668\n1646#1:1671\n1644#1:1666\n1645#1:1669\n1646#1:1672\n*E\n"})
public final class ri extends androidx.compose.ui.node.m implements androidx.compose.ui.node.h {

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f32548k3 = 8;

    @Nullable
    private kotlinx.coroutines.p2 H1;
    private boolean X;

    @NotNull
    private androidx.compose.foundation.interaction.h Y;
    private float Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private androidx.compose.animation.core.c<androidx.compose.ui.graphics.q0, androidx.compose.animation.core.v> f32549g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.q3 f32550h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> f32551i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.draw.g f32552j3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f32553p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f32554p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private j40 f32555p2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f32556w;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$1", f = "TextField.kt", i = {}, l = {1599}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32557a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ri.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f32557a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c cVar = ri.this.f32549g3;
                if (cVar != null) {
                    androidx.compose.ui.graphics.q0 q0VarN = androidx.compose.ui.graphics.q0.n(ri.this.V9().X(ri.this.f32556w, ri.this.X, ri.this.f32554p1));
                    androidx.compose.animation.core.o oVarA = ri.this.f32556w ? hm.a((gm) androidx.compose.ui.node.i.a(ri.this, pj.f31758a.b()), d0.h1.FastEffects) : androidx.compose.animation.core.p.p(0, 1, null);
                    this.f32557a = 1;
                    obj = androidx.compose.animation.core.c.i(cVar, q0VarN, oVarA, null, null, this, 12, null);
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2", f = "TextField.kt", i = {}, l = {1611}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32559a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ri.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f32559a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c cVar = ri.this.f32551i3;
                androidx.compose.ui.unit.h hVarO = androidx.compose.ui.unit.h.o((ri.this.f32554p1 && ri.this.f32556w) ? ri.this.Z : ri.this.f32553p0);
                androidx.compose.animation.core.o oVarA = ri.this.f32556w ? hm.a((gm) androidx.compose.ui.node.i.a(ri.this, pj.f31758a.b()), d0.h1.FastSpatial) : androidx.compose.animation.core.p.p(0, 1, null);
                this.f32559a = 1;
                if (androidx.compose.animation.core.c.i(cVar, hVarO, oVarA, null, null, this, 12, null) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.IndicatorLineNode$onAttach$1", f = "TextField.kt", i = {}, l = {1569}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32561a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ri.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f32561a;
            if (i10 == 0) {
                ResultKt.m(obj);
                ri riVar = ri.this;
                this.f32561a = 1;
                if (riVar.Y9(this) == objL) {
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

    static final class d<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<androidx.compose.foundation.interaction.c.a> f32563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ri f32564b;

        d(List<androidx.compose.foundation.interaction.c.a> list, ri riVar) {
            this.f32563a = list;
            this.f32564b = riVar;
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
            if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
                this.f32563a.add(gVar);
            } else if (gVar instanceof androidx.compose.foundation.interaction.c.b) {
                this.f32563a.remove(((androidx.compose.foundation.interaction.c.b) gVar).a());
            }
            boolean z10 = !this.f32563a.isEmpty();
            if (z10 != this.f32564b.f32554p1) {
                this.f32564b.f32554p1 = z10;
                this.f32564b.W9();
            }
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.IndicatorLineNode$update$1", f = "TextField.kt", i = {}, l = {1537}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32565a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ri.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f32565a;
            if (i10 == 0) {
                ResultKt.m(obj);
                ri riVar = ri.this;
                this.f32565a = 1;
                if (riVar.Y9(this) == objL) {
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

    public /* synthetic */ ri(boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, j40 j40Var, androidx.compose.ui.graphics.q3 q3Var, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, hVar, j40Var, q3Var, f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.o T9(final ri riVar, androidx.compose.ui.draw.i iVar) {
        float fS7 = iVar.S7(riVar.f32551i3.v().O());
        androidx.compose.ui.graphics.k2 k2VarA = androidx.compose.ui.graphics.u.a();
        androidx.compose.ui.graphics.g2.a(k2VarA, riVar.t3().mo0createOutlinePq9zytI(iVar.d(), iVar.getLayoutDirection(), iVar));
        androidx.compose.ui.graphics.k2 k2VarA2 = androidx.compose.ui.graphics.u.a();
        androidx.compose.ui.graphics.k2.g(k2VarA2, new n0.j(0.0f, Float.intBitsToFloat((int) (iVar.d() & com.rabbitmq.client.k0.f265952a)) - fS7, Float.intBitsToFloat((int) (iVar.d() >> 32)), Float.intBitsToFloat((int) (iVar.d() & com.rabbitmq.client.k0.f265952a))), null, 2, null);
        final androidx.compose.ui.graphics.k2 k2VarS = k2VarA2.s(k2VarA);
        return iVar.N(new Function1() { // from class: androidx.compose.material3.qi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ri.U9(k2VarS, riVar, (androidx.compose.ui.graphics.drawscope.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U9(androidx.compose.ui.graphics.k2 k2Var, ri riVar, androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.E4();
        androidx.compose.animation.core.c<androidx.compose.ui.graphics.q0, androidx.compose.animation.core.v> cVar2 = riVar.f32549g3;
        Intrinsics.checkNotNull(cVar2);
        androidx.compose.ui.graphics.drawscope.f.L3(cVar, k2Var, new androidx.compose.ui.graphics.s3(cVar2.v().M(), null), 0.0f, null, null, 0, 60, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j40 V9() {
        j40 j40Var = this.f32555p2;
        return j40Var == null ? n40.f30917a.q((l6) androidx.compose.ui.node.i.a(this, o6.p()), (androidx.compose.foundation.text.selection.w4) androidx.compose.ui.node.i.a(this, androidx.compose.foundation.text.selection.y4.d())) : j40Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W9() {
        int i10 = (3 << 0) & 3;
        kotlinx.coroutines.k.f(Q8(), null, null, new a(null), 3, null);
        kotlinx.coroutines.k.f(Q8(), null, null, new b(null), 3, null);
    }

    private final void X9(androidx.compose.ui.graphics.q3 q3Var) {
        if (Intrinsics.areEqual(this.f32550h3, q3Var)) {
            return;
        }
        this.f32550h3 = q3Var;
        this.f32552j3.M6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y9(kotlin.coroutines.d<? super Unit> dVar) {
        this.f32554p1 = false;
        Object objCollect = this.Y.c().collect(new d(new ArrayList(), this), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    private final androidx.compose.ui.graphics.q3 t3() {
        androidx.compose.ui.graphics.q3 q3Var = this.f32550h3;
        return q3Var == null ? cx.g((ax) androidx.compose.ui.node.i.a(this, cx.h()), d0.v0.f269078a.e()) : q3Var;
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return false;
    }

    public final void Z9(boolean z10, boolean z11, @NotNull androidx.compose.foundation.interaction.h hVar, @Nullable j40 j40Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, float f10, float f11) {
        boolean z12;
        boolean z13 = true;
        if (this.f32556w != z10) {
            this.f32556w = z10;
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.X != z11) {
            this.X = z11;
            z12 = true;
        }
        if (this.Y != hVar) {
            this.Y = hVar;
            kotlinx.coroutines.p2 p2Var = this.H1;
            if (p2Var != null) {
                kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
            }
            this.H1 = kotlinx.coroutines.k.f(Q8(), null, null, new e(null), 3, null);
        }
        if (!Intrinsics.areEqual(this.f32555p2, j40Var)) {
            this.f32555p2 = j40Var;
            z12 = true;
        }
        if (!Intrinsics.areEqual(this.f32550h3, q3Var)) {
            X9(q3Var);
            z12 = true;
        }
        if (!androidx.compose.ui.unit.h.x(this.Z, f10)) {
            this.Z = f10;
            z12 = true;
        }
        if (androidx.compose.ui.unit.h.x(this.f32553p0, f11)) {
            z13 = z12;
        } else {
            this.f32553p0 = f11;
        }
        if (z13) {
            W9();
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        this.H1 = kotlinx.coroutines.k.f(Q8(), null, null, new c(null), 3, null);
        if (this.f32549g3 == null) {
            long jX = V9().X(this.f32556w, this.X, this.f32554p1);
            this.f32549g3 = new androidx.compose.animation.core.c<>(androidx.compose.ui.graphics.q0.n(jX), androidx.compose.animation.v.a(androidx.compose.ui.graphics.q0.f38131b).invoke(androidx.compose.ui.graphics.q0.E(jX)), null, null, 12, null);
        }
    }

    private ri(boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, j40 j40Var, androidx.compose.ui.graphics.q3 q3Var, float f10, float f11) {
        this.f32556w = z10;
        this.X = z11;
        this.Y = hVar;
        this.Z = f10;
        this.f32553p0 = f11;
        this.f32555p2 = j40Var;
        this.f32550h3 = q3Var;
        int i10 = 0 >> 0;
        this.f32551i3 = new androidx.compose.animation.core.c<>(androidx.compose.ui.unit.h.o((this.f32554p1 && this.f32556w) ? this.Z : this.f32553p0), androidx.compose.animation.core.t4.L(androidx.compose.ui.unit.h.f42689b), null, null, 12, null);
        this.f32552j3 = (androidx.compose.ui.draw.g) v9(androidx.compose.ui.draw.n.a(new Function1() { // from class: androidx.compose.material3.pi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ri.T9(this.f31757a, (androidx.compose.ui.draw.i) obj);
            }
        }));
    }
}
