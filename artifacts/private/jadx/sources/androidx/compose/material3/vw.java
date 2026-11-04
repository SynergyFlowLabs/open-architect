package androidx.compose.material3;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2969:1\n1282#2,6:2970\n1282#2,6:2976\n1282#2,6:2982\n1282#2,6:2988\n1282#2,6:2994\n85#3:3000\n117#3,2:3001\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipElevation\n*L\n2502#1:2970,6\n2503#1:2976,6\n2504#1:2982,6\n2556#1:2988,6\n2558#1:2994,6\n2503#1:3000\n2503#1:3001,2\n*E\n"})
public final class vw {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f34013g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f34014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f34015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f34016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f34017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f34018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f34019f;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$1$1", f = "Chip.kt", i = {}, l = {2505}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f34021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f34022c;

        /* JADX INFO: renamed from: androidx.compose.material3.vw$a$a, reason: collision with other inner class name */
        static final class C0260a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f34023a;

            C0260a(SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList) {
                this.f34023a = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
                    this.f34023a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.e.b) {
                    this.f34023a.remove(((androidx.compose.foundation.interaction.e.b) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
                    this.f34023a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.c.b) {
                    this.f34023a.remove(((androidx.compose.foundation.interaction.c.b) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                    this.f34023a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                    this.f34023a.remove(((androidx.compose.foundation.interaction.l.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                    this.f34023a.remove(((androidx.compose.foundation.interaction.l.a) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.b) {
                    this.f34023a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.c) {
                    this.f34023a.remove(((androidx.compose.foundation.interaction.a.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.C0087a) {
                    this.f34023a.remove(((androidx.compose.foundation.interaction.a.C0087a) gVar).a());
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.interaction.h hVar, SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f34021b = hVar;
            this.f34022c = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f34021b, this.f34022c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f34020a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.f34021b.c();
                C0260a c0260a = new C0260a(this.f34022c);
                this.f34020a = 1;
                if (iVarC.collect(c0260a, this) == objL) {
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
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2$1", f = "Chip.kt", i = {}, l = {2562, 2564}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> f34025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f34026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f34027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.g f34028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.foundation.interaction.g> f34029f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar, float f10, boolean z10, androidx.compose.foundation.interaction.g gVar, androidx.compose.runtime.n3<androidx.compose.foundation.interaction.g> n3Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f34025b = cVar;
            this.f34026c = f10;
            this.f34027d = z10;
            this.f34028e = gVar;
            this.f34029f = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f34025b, this.f34026c, this.f34027d, this.f34028e, this.f34029f, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
        
            if (androidx.compose.material3.internal.n2.d(r1, r3, r7, r4, r6) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 6
                int r1 = r6.f34024a
                r2 = 2
                r3 = 1
                r5 = r5 & r3
                if (r1 == 0) goto L22
                r5 = 2
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L12
                goto L1e
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "tmsta/rl  / eoieo/ub iehenc//nro/eso wrlek tuifc//v"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r5 = 5
                r6.<init>(r7)
                r5 = 7
                throw r6
            L1e:
                kotlin.ResultKt.m(r7)
                goto L6d
            L22:
                kotlin.ResultKt.m(r7)
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> r7 = r6.f34025b
                r5 = 4
                java.lang.Object r7 = r7.s()
                r5 = 4
                androidx.compose.ui.unit.h r7 = (androidx.compose.ui.unit.h) r7
                r5 = 7
                float r7 = r7.O()
                r5 = 2
                float r1 = r6.f34026c
                boolean r7 = androidx.compose.ui.unit.h.x(r7, r1)
                if (r7 != 0) goto L75
                boolean r7 = r6.f34027d
                if (r7 != 0) goto L54
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> r7 = r6.f34025b
                float r1 = r6.f34026c
                androidx.compose.ui.unit.h r1 = androidx.compose.ui.unit.h.o(r1)
                r6.f34024a = r3
                java.lang.Object r7 = r7.C(r1, r6)
                r5 = 5
                if (r7 != r0) goto L6d
                r5 = 1
                goto L6c
            L54:
                r5 = 3
                androidx.compose.runtime.n3<androidx.compose.foundation.interaction.g> r7 = r6.f34029f
                androidx.compose.foundation.interaction.g r7 = androidx.compose.material3.vw.a(r7)
                r5 = 1
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> r1 = r6.f34025b
                r5 = 7
                float r3 = r6.f34026c
                androidx.compose.foundation.interaction.g r4 = r6.f34028e
                r6.f34024a = r2
                java.lang.Object r7 = androidx.compose.material3.internal.n2.d(r1, r3, r7, r4, r6)
                r5 = 4
                if (r7 != r0) goto L6d
            L6c:
                return r0
            L6d:
                androidx.compose.runtime.n3<androidx.compose.foundation.interaction.g> r7 = r6.f34029f
                r5 = 5
                androidx.compose.foundation.interaction.g r6 = r6.f34028e
                androidx.compose.material3.vw.b(r7, r6)
            L75:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.vw.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ vw(float f10, float f11, float f12, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15);
    }

    @androidx.compose.runtime.o
    private final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> c(boolean z10, androidx.compose.foundation.interaction.h hVar, androidx.compose.runtime.c0 c0Var, int i10) {
        float f10;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(664514136, i10, -1, "androidx.compose.material3.SelectableChipElevation.animateElevation (Chip.kt:2500)");
        }
        Object objI0 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = androidx.compose.runtime.w6.g();
            c0Var.Y(objI0);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objI0;
        Object objI1 = c0Var.i0();
        if (objI1 == aVar.a()) {
            objI1 = androidx.compose.runtime.d7.g(null, null, 2, null);
            c0Var.Y(objI1);
        }
        androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI1;
        boolean z11 = true;
        boolean z12 = (((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(hVar)) || (i10 & 48) == 32;
        Object objI2 = c0Var.i0();
        if (z12 || objI2 == aVar.a()) {
            objI2 = new a(hVar, snapshotStateList, null);
            c0Var.Y(objI2);
        }
        androidx.compose.runtime.b2.i(hVar, (Function2) objI2, c0Var, (i10 >> 3) & 14);
        androidx.compose.foundation.interaction.g gVar = (androidx.compose.foundation.interaction.g) CollectionsKt.lastOrNull((List) snapshotStateList);
        if (!z10) {
            f10 = this.f34019f;
        } else if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
            f10 = this.f34015b;
        } else if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
            f10 = this.f34017d;
        } else if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
            f10 = this.f34016c;
        } else {
            f10 = gVar instanceof androidx.compose.foundation.interaction.a.b ? this.f34018e : this.f34014a;
        }
        Object objI3 = c0Var.i0();
        if (objI3 == aVar.a()) {
            Object cVar = new androidx.compose.animation.core.c(androidx.compose.ui.unit.h.o(f10), androidx.compose.animation.core.t4.L(androidx.compose.ui.unit.h.f42689b), null, null, 12, null);
            c0Var.Y(cVar);
            objI3 = cVar;
        }
        androidx.compose.animation.core.c cVar2 = (androidx.compose.animation.core.c) objI3;
        androidx.compose.ui.unit.h hVarO = androidx.compose.ui.unit.h.o(f10);
        boolean zK0 = c0Var.k0(cVar2) | c0Var.I(f10);
        if ((((i10 & 14) ^ 6) <= 4 || !c0Var.G(z10)) && (i10 & 6) != 4) {
            z11 = false;
        }
        boolean zK1 = zK0 | z11 | c0Var.k0(gVar);
        Object objI4 = c0Var.i0();
        if (zK1 || objI4 == aVar.a()) {
            Object bVar = new b(cVar2, f10, z10, gVar, n3Var, null);
            c0Var.Y(bVar);
            objI4 = bVar;
        }
        androidx.compose.runtime.b2.i(hVarO, (Function2) objI4, c0Var, 0);
        androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarJ = cVar2.j();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.interaction.g d(androidx.compose.runtime.n3<androidx.compose.foundation.interaction.g> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(androidx.compose.runtime.n3<androidx.compose.foundation.interaction.g> n3Var, androidx.compose.foundation.interaction.g gVar) {
        n3Var.setValue(gVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof vw)) {
            vw vwVar = (vw) obj;
            return androidx.compose.ui.unit.h.x(this.f34014a, vwVar.f34014a) && androidx.compose.ui.unit.h.x(this.f34015b, vwVar.f34015b) && androidx.compose.ui.unit.h.x(this.f34016c, vwVar.f34016c) && androidx.compose.ui.unit.h.x(this.f34017d, vwVar.f34017d) && androidx.compose.ui.unit.h.x(this.f34019f, vwVar.f34019f);
        }
        return false;
    }

    public final float f() {
        return this.f34019f;
    }

    public final float g() {
        return this.f34018e;
    }

    public final float h() {
        return this.f34014a;
    }

    public int hashCode() {
        return (((((((androidx.compose.ui.unit.h.D(this.f34014a) * 31) + androidx.compose.ui.unit.h.D(this.f34015b)) * 31) + androidx.compose.ui.unit.h.D(this.f34016c)) * 31) + androidx.compose.ui.unit.h.D(this.f34017d)) * 31) + androidx.compose.ui.unit.h.D(this.f34019f);
    }

    public final float i() {
        return this.f34016c;
    }

    public final float j() {
        return this.f34017d;
    }

    public final float k() {
        return this.f34015b;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> l(boolean z10, @NotNull androidx.compose.foundation.interaction.h hVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1888175651, i10, -1, "androidx.compose.material3.SelectableChipElevation.shadowElevation (Chip.kt:2492)");
        }
        androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarC = c(z10, hVar, c0Var, i10 & androidx.media3.exoplayer.analytics.b.f62802b0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarC;
    }

    private vw(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f34014a = f10;
        this.f34015b = f11;
        this.f34016c = f12;
        this.f34017d = f13;
        this.f34018e = f14;
        this.f34019f = f15;
    }
}
