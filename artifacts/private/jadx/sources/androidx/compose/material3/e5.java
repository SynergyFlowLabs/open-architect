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
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2969:1\n1282#2,6:2970\n1282#2,6:2976\n1282#2,6:2982\n1282#2,6:2988\n1282#2,6:2994\n85#3:3000\n117#3,2:3001\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipElevation\n*L\n2363#1:2970,6\n2364#1:2976,6\n2365#1:2982,6\n2417#1:2988,6\n2419#1:2994,6\n2364#1:3000\n2364#1:3001,2\n*E\n"})
public final class e5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f27245g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f27246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f27247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f27248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f27249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f27250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f27251f;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ChipElevation$animateElevation$1$1", f = "Chip.kt", i = {}, l = {2366}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f27253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f27254c;

        /* JADX INFO: renamed from: androidx.compose.material3.e5$a$a, reason: collision with other inner class name */
        static final class C0215a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f27255a;

            C0215a(SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList) {
                this.f27255a = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
                    this.f27255a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.e.b) {
                    this.f27255a.remove(((androidx.compose.foundation.interaction.e.b) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
                    this.f27255a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.c.b) {
                    this.f27255a.remove(((androidx.compose.foundation.interaction.c.b) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                    this.f27255a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                    this.f27255a.remove(((androidx.compose.foundation.interaction.l.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                    this.f27255a.remove(((androidx.compose.foundation.interaction.l.a) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.b) {
                    this.f27255a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.c) {
                    this.f27255a.remove(((androidx.compose.foundation.interaction.a.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.C0087a) {
                    this.f27255a.remove(((androidx.compose.foundation.interaction.a.C0087a) gVar).a());
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.interaction.h hVar, SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f27253b = hVar;
            this.f27254c = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f27253b, this.f27254c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f27252a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.f27253b.c();
                C0215a c0215a = new C0215a(this.f27254c);
                this.f27252a = 1;
                if (iVarC.collect(c0215a, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ChipElevation$animateElevation$2$1", f = "Chip.kt", i = {}, l = {2423, 2425}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> f27257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f27258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f27259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.g f27260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.foundation.interaction.g> f27261f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar, float f10, boolean z10, androidx.compose.foundation.interaction.g gVar, androidx.compose.runtime.n3<androidx.compose.foundation.interaction.g> n3Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f27257b = cVar;
            this.f27258c = f10;
            this.f27259d = z10;
            this.f27260e = gVar;
            this.f27261f = n3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f27257b, this.f27258c, this.f27259d, this.f27260e, this.f27261f, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
        
            if (androidx.compose.material3.internal.n2.d(r1, r3, r7, r4, r6) == r0) goto L19;
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
                int r1 = r6.f27256a
                r5 = 6
                r2 = 2
                r5 = 5
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L19
                if (r1 != r2) goto L11
                goto L19
            L11:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L19:
                kotlin.ResultKt.m(r7)
                goto L69
            L1d:
                kotlin.ResultKt.m(r7)
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> r7 = r6.f27257b
                java.lang.Object r7 = r7.s()
                androidx.compose.ui.unit.h r7 = (androidx.compose.ui.unit.h) r7
                r5 = 6
                float r7 = r7.O()
                r5 = 1
                float r1 = r6.f27258c
                r5 = 0
                boolean r7 = androidx.compose.ui.unit.h.x(r7, r1)
                if (r7 != 0) goto L71
                boolean r7 = r6.f27259d
                if (r7 != 0) goto L51
                r5 = 2
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> r7 = r6.f27257b
                r5 = 0
                float r1 = r6.f27258c
                androidx.compose.ui.unit.h r1 = androidx.compose.ui.unit.h.o(r1)
                r5 = 1
                r6.f27256a = r3
                r5 = 4
                java.lang.Object r7 = r7.C(r1, r6)
                if (r7 != r0) goto L69
                r5 = 6
                goto L68
            L51:
                androidx.compose.runtime.n3<androidx.compose.foundation.interaction.g> r7 = r6.f27261f
                r5 = 7
                androidx.compose.foundation.interaction.g r7 = androidx.compose.material3.e5.a(r7)
                r5 = 4
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> r1 = r6.f27257b
                float r3 = r6.f27258c
                androidx.compose.foundation.interaction.g r4 = r6.f27260e
                r5 = 0
                r6.f27256a = r2
                java.lang.Object r7 = androidx.compose.material3.internal.n2.d(r1, r3, r7, r4, r6)
                if (r7 != r0) goto L69
            L68:
                return r0
            L69:
                androidx.compose.runtime.n3<androidx.compose.foundation.interaction.g> r7 = r6.f27261f
                r5 = 2
                androidx.compose.foundation.interaction.g r6 = r6.f27260e
                androidx.compose.material3.e5.b(r7, r6)
            L71:
                r5 = 6
                kotlin.Unit r6 = kotlin.Unit.f312394a
                r5 = 4
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.e5.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ e5(float f10, float f11, float f12, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15);
    }

    @androidx.compose.runtime.o
    private final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> c(boolean z10, androidx.compose.foundation.interaction.h hVar, androidx.compose.runtime.c0 c0Var, int i10) {
        float f10;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2071499570, i10, -1, "androidx.compose.material3.ChipElevation.animateElevation (Chip.kt:2361)");
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
            f10 = this.f27251f;
        } else if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
            f10 = this.f27247b;
        } else if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
            f10 = this.f27249d;
        } else if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
            f10 = this.f27248c;
        } else {
            f10 = gVar instanceof androidx.compose.foundation.interaction.a.b ? this.f27250e : this.f27246a;
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
        if (obj == null || !(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return androidx.compose.ui.unit.h.x(this.f27246a, e5Var.f27246a) && androidx.compose.ui.unit.h.x(this.f27247b, e5Var.f27247b) && androidx.compose.ui.unit.h.x(this.f27248c, e5Var.f27248c) && androidx.compose.ui.unit.h.x(this.f27249d, e5Var.f27249d) && androidx.compose.ui.unit.h.x(this.f27251f, e5Var.f27251f);
    }

    public final float f() {
        return this.f27251f;
    }

    public final float g() {
        return this.f27250e;
    }

    public final float h() {
        return this.f27246a;
    }

    public int hashCode() {
        return (((((((androidx.compose.ui.unit.h.D(this.f27246a) * 31) + androidx.compose.ui.unit.h.D(this.f27247b)) * 31) + androidx.compose.ui.unit.h.D(this.f27248c)) * 31) + androidx.compose.ui.unit.h.D(this.f27249d)) * 31) + androidx.compose.ui.unit.h.D(this.f27251f);
    }

    public final float i() {
        return this.f27248c;
    }

    public final float j() {
        return this.f27249d;
    }

    public final float k() {
        return this.f27247b;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> l(boolean z10, @NotNull androidx.compose.foundation.interaction.h hVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1881877139, i10, -1, "androidx.compose.material3.ChipElevation.shadowElevation (Chip.kt:2353)");
        }
        androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarC = c(z10, hVar, c0Var, i10 & androidx.media3.exoplayer.analytics.b.f62802b0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarC;
    }

    private e5(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f27246a = f10;
        this.f27247b = f11;
        this.f27248c = f12;
        this.f27249d = f13;
        this.f27250e = f14;
        this.f27251f = f15;
    }
}
