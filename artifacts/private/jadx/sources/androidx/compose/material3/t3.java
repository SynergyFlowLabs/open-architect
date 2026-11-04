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
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1117:1\n1282#2,6:1118\n1282#2,6:1124\n1282#2,6:1130\n1282#2,6:1136\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonElevation\n*L\n949#1:1118,6\n950#1:1124,6\n992#1:1130,6\n994#1:1136,6\n*E\n"})
public final class t3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f33066f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f33067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f33068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f33069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f33070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f33071e;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ButtonElevation$animateElevation$1$1", f = "Button.kt", i = {}, l = {951}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f33073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f33074c;

        /* JADX INFO: renamed from: androidx.compose.material3.t3$a$a, reason: collision with other inner class name */
        static final class C0253a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f33075a;

            C0253a(SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList) {
                this.f33075a = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
                    this.f33075a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.e.b) {
                    this.f33075a.remove(((androidx.compose.foundation.interaction.e.b) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
                    this.f33075a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.c.b) {
                    this.f33075a.remove(((androidx.compose.foundation.interaction.c.b) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                    this.f33075a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                    this.f33075a.remove(((androidx.compose.foundation.interaction.l.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                    this.f33075a.remove(((androidx.compose.foundation.interaction.l.a) gVar).a());
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.interaction.h hVar, SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f33073b = hVar;
            this.f33074c = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f33073b, this.f33074c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f33072a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.f33073b.c();
                C0253a c0253a = new C0253a(this.f33074c);
                this.f33072a = 1;
                if (iVarC.collect(c0253a, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", i = {}, l = {androidx.datastore.preferences.protobuf.e0.d.f50107s, 1007}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> f33077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f33078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f33079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ t3 f33080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.g f33081f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar, float f10, boolean z10, t3 t3Var, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f33077b = cVar;
            this.f33078c = f10;
            this.f33079d = z10;
            this.f33080e = t3Var;
            this.f33081f = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f33077b, this.f33078c, this.f33079d, this.f33080e, this.f33081f, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
        
            if (androidx.compose.material3.internal.n2.d(r8, r1, r3, r4, r7) == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r6 = 4
                int r1 = r7.f33076a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1d
                r6 = 3
                if (r1 != r2) goto L12
                r6 = 4
                goto L1d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r6 = 2
                java.lang.String r8 = "ursom nev tni/csuf t/e rc a/woeheooo///lltb /kreei/"
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1d:
                kotlin.ResultKt.m(r8)
                goto Lbb
            L22:
                kotlin.ResultKt.m(r8)
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> r8 = r7.f33077b
                java.lang.Object r8 = r8.s()
                r6 = 1
                androidx.compose.ui.unit.h r8 = (androidx.compose.ui.unit.h) r8
                float r8 = r8.O()
                r6 = 1
                float r1 = r7.f33078c
                r6 = 3
                boolean r8 = androidx.compose.ui.unit.h.x(r8, r1)
                if (r8 != 0) goto Lbb
                boolean r8 = r7.f33079d
                if (r8 != 0) goto L57
                r6 = 2
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> r8 = r7.f33077b
                r6 = 0
                float r1 = r7.f33078c
                androidx.compose.ui.unit.h r1 = androidx.compose.ui.unit.h.o(r1)
                r6 = 1
                r7.f33076a = r3
                r6 = 6
                java.lang.Object r7 = r8.C(r1, r7)
                r6 = 4
                if (r7 != r0) goto Lbb
                r6 = 4
                goto Lba
            L57:
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> r8 = r7.f33077b
                java.lang.Object r8 = r8.s()
                r6 = 0
                androidx.compose.ui.unit.h r8 = (androidx.compose.ui.unit.h) r8
                float r8 = r8.O()
                androidx.compose.material3.t3 r1 = r7.f33080e
                float r1 = androidx.compose.material3.t3.c(r1)
                boolean r1 = androidx.compose.ui.unit.h.x(r8, r1)
                r3 = 0
                r6 = 7
                if (r1 == 0) goto L82
                r6 = 1
                androidx.compose.foundation.interaction.l$b r8 = new androidx.compose.foundation.interaction.l$b
                n0.g$a r1 = n0.g.f332700b
                r6 = 4
                long r4 = r1.e()
                r6 = 7
                r8.<init>(r4, r3)
                r3 = r8
                goto La8
            L82:
                androidx.compose.material3.t3 r1 = r7.f33080e
                float r1 = androidx.compose.material3.t3.b(r1)
                r6 = 1
                boolean r1 = androidx.compose.ui.unit.h.x(r8, r1)
                r6 = 5
                if (r1 == 0) goto L97
                androidx.compose.foundation.interaction.e$a r3 = new androidx.compose.foundation.interaction.e$a
                r6 = 1
                r3.<init>()
                goto La8
            L97:
                androidx.compose.material3.t3 r1 = r7.f33080e
                float r1 = androidx.compose.material3.t3.a(r1)
                boolean r8 = androidx.compose.ui.unit.h.x(r8, r1)
                if (r8 == 0) goto La8
                androidx.compose.foundation.interaction.c$a r3 = new androidx.compose.foundation.interaction.c$a
                r3.<init>()
            La8:
                r6 = 7
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> r8 = r7.f33077b
                float r1 = r7.f33078c
                androidx.compose.foundation.interaction.g r4 = r7.f33081f
                r6 = 1
                r7.f33076a = r2
                r6 = 1
                java.lang.Object r7 = androidx.compose.material3.internal.n2.d(r8, r1, r3, r4, r7)
                r6 = 3
                if (r7 != r0) goto Lbb
            Lba:
                return r0
            Lbb:
                r6 = 0
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.t3.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ t3(float f10, float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14);
    }

    @androidx.compose.runtime.o
    private final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> d(boolean z10, androidx.compose.foundation.interaction.h hVar, androidx.compose.runtime.c0 c0Var, int i10) {
        float f10;
        androidx.compose.animation.core.c cVar;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1312510462, i10, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:947)");
        }
        Object objI0 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = androidx.compose.runtime.w6.g();
            c0Var.Y(objI0);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objI0;
        boolean z11 = true;
        boolean z12 = (((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(hVar)) || (i10 & 48) == 32;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == aVar.a()) {
            objI1 = new a(hVar, snapshotStateList, null);
            c0Var.Y(objI1);
        }
        androidx.compose.runtime.b2.i(hVar, (Function2) objI1, c0Var, (i10 >> 3) & 14);
        androidx.compose.foundation.interaction.g gVar = (androidx.compose.foundation.interaction.g) CollectionsKt.lastOrNull((List) snapshotStateList);
        if (!z10) {
            f10 = this.f33071e;
        } else if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
            f10 = this.f33068b;
        } else if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
            f10 = this.f33070d;
        } else {
            f10 = gVar instanceof androidx.compose.foundation.interaction.c.a ? this.f33069c : this.f33067a;
        }
        Object objI2 = c0Var.i0();
        if (objI2 == aVar.a()) {
            Object cVar2 = new androidx.compose.animation.core.c(androidx.compose.ui.unit.h.o(f10), androidx.compose.animation.core.t4.L(androidx.compose.ui.unit.h.f42689b), null, null, 12, null);
            c0Var.Y(cVar2);
            objI2 = cVar2;
        }
        androidx.compose.animation.core.c cVar3 = (androidx.compose.animation.core.c) objI2;
        androidx.compose.ui.unit.h hVarO = androidx.compose.ui.unit.h.o(f10);
        boolean zK0 = c0Var.k0(cVar3) | c0Var.I(f10) | ((((i10 & 14) ^ 6) > 4 && c0Var.G(z10)) || (i10 & 6) == 4);
        if ((((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 || !c0Var.D(this)) && (i10 & androidx.media3.exoplayer.a5.S0) != 256) {
            z11 = false;
        }
        boolean zK1 = zK0 | z11 | c0Var.k0(gVar);
        Object objI3 = c0Var.i0();
        if (zK1 || objI3 == aVar.a()) {
            cVar = cVar3;
            Object bVar = new b(cVar, f10, z10, this, gVar, null);
            c0Var.Y(bVar);
            objI3 = bVar;
        } else {
            cVar = cVar3;
        }
        androidx.compose.runtime.b2.i(hVarO, (Function2) objI3, c0Var, 0);
        androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarJ = cVar.j();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarJ;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> e(boolean z10, @NotNull androidx.compose.foundation.interaction.h hVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2045116089, i10, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:939)");
        }
        androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarD = d(z10, hVar, c0Var, i10 & androidx.media3.exoplayer.analytics.b.f62802b0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarD;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof t3)) {
            t3 t3Var = (t3) obj;
            return androidx.compose.ui.unit.h.x(this.f33067a, t3Var.f33067a) && androidx.compose.ui.unit.h.x(this.f33068b, t3Var.f33068b) && androidx.compose.ui.unit.h.x(this.f33069c, t3Var.f33069c) && androidx.compose.ui.unit.h.x(this.f33070d, t3Var.f33070d) && androidx.compose.ui.unit.h.x(this.f33071e, t3Var.f33071e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((androidx.compose.ui.unit.h.D(this.f33067a) * 31) + androidx.compose.ui.unit.h.D(this.f33068b)) * 31) + androidx.compose.ui.unit.h.D(this.f33069c)) * 31) + androidx.compose.ui.unit.h.D(this.f33070d)) * 31) + androidx.compose.ui.unit.h.D(this.f33071e);
    }

    private t3(float f10, float f11, float f12, float f13, float f14) {
        this.f33067a = f10;
        this.f33068b = f11;
        this.f33069c = f12;
        this.f33070d = f13;
        this.f33071e = f14;
    }
}
