package androidx.compose.material;

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
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/DefaultButtonElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,613:1\n1282#2,6:614\n1282#2,6:620\n1282#2,6:626\n1282#2,6:632\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/DefaultButtonElevation\n*L\n502#1:614,6\n503#1:620,6\n545#1:626,6\n547#1:632,6\n*E\n"})
final class z4 implements q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f25788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f25789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f25790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f25791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f25792e;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DefaultButtonElevation$elevation$1$1", f = "Button.kt", i = {}, l = {504}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f25794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f25795c;

        /* JADX INFO: renamed from: androidx.compose.material.z4$a$a, reason: collision with other inner class name */
        static final class C0206a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f25796a;

            C0206a(SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList) {
                this.f25796a = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
                    this.f25796a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.e.b) {
                    this.f25796a.remove(((androidx.compose.foundation.interaction.e.b) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
                    this.f25796a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.c.b) {
                    this.f25796a.remove(((androidx.compose.foundation.interaction.c.b) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                    this.f25796a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                    this.f25796a.remove(((androidx.compose.foundation.interaction.l.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                    this.f25796a.remove(((androidx.compose.foundation.interaction.l.a) gVar).a());
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.interaction.h hVar, SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f25794b = hVar;
            this.f25795c = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f25794b, this.f25795c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f25793a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.f25794b.c();
                C0206a c0206a = new C0206a(this.f25795c);
                this.f25793a = 1;
                if (iVarC.collect(c0206a, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DefaultButtonElevation$elevation$2$1", f = "Button.kt", i = {}, l = {551, 560}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> f25798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f25799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ z4 f25801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.g f25802f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar, float f10, boolean z10, z4 z4Var, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f25798b = cVar;
            this.f25799c = f10;
            this.f25800d = z10;
            this.f25801e = z4Var;
            this.f25802f = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f25798b, this.f25799c, this.f25800d, this.f25801e, this.f25802f, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        
            if (r8.C(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
        
            if (androidx.compose.material.p7.d(r8, r1, r3, r4, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
        
            return r0;
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
                int r1 = r7.f25797a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L18
                if (r1 != r2) goto Lf
                goto L18
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r6 = 3
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L18:
                kotlin.ResultKt.m(r8)
                r6 = 6
                goto Lae
            L1e:
                kotlin.ResultKt.m(r8)
                r6 = 4
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> r8 = r7.f25798b
                java.lang.Object r8 = r8.s()
                r6 = 0
                androidx.compose.ui.unit.h r8 = (androidx.compose.ui.unit.h) r8
                float r8 = r8.O()
                r6 = 7
                float r1 = r7.f25799c
                boolean r8 = androidx.compose.ui.unit.h.x(r8, r1)
                r6 = 7
                if (r8 != 0) goto Lae
                boolean r8 = r7.f25800d
                if (r8 != 0) goto L4f
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> r8 = r7.f25798b
                float r1 = r7.f25799c
                androidx.compose.ui.unit.h r1 = androidx.compose.ui.unit.h.o(r1)
                r7.f25797a = r3
                java.lang.Object r7 = r8.C(r1, r7)
                r6 = 2
                if (r7 != r0) goto Lae
                goto Lac
            L4f:
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> r8 = r7.f25798b
                java.lang.Object r8 = r8.s()
                androidx.compose.ui.unit.h r8 = (androidx.compose.ui.unit.h) r8
                r6 = 3
                float r8 = r8.O()
                androidx.compose.material.z4 r1 = r7.f25801e
                float r1 = androidx.compose.material.z4.d(r1)
                r6 = 0
                boolean r1 = androidx.compose.ui.unit.h.x(r8, r1)
                r3 = 0
                if (r1 == 0) goto L77
                androidx.compose.foundation.interaction.l$b r8 = new androidx.compose.foundation.interaction.l$b
                n0.g$a r1 = n0.g.f332700b
                long r4 = r1.e()
                r8.<init>(r4, r3)
                r3 = r8
                goto L9e
            L77:
                androidx.compose.material.z4 r1 = r7.f25801e
                r6 = 7
                float r1 = androidx.compose.material.z4.c(r1)
                boolean r1 = androidx.compose.ui.unit.h.x(r8, r1)
                if (r1 == 0) goto L8a
                androidx.compose.foundation.interaction.e$a r3 = new androidx.compose.foundation.interaction.e$a
                r3.<init>()
                goto L9e
            L8a:
                r6 = 6
                androidx.compose.material.z4 r1 = r7.f25801e
                float r1 = androidx.compose.material.z4.b(r1)
                boolean r8 = androidx.compose.ui.unit.h.x(r8, r1)
                r6 = 6
                if (r8 == 0) goto L9e
                r6 = 2
                androidx.compose.foundation.interaction.c$a r3 = new androidx.compose.foundation.interaction.c$a
                r3.<init>()
            L9e:
                androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> r8 = r7.f25798b
                float r1 = r7.f25799c
                androidx.compose.foundation.interaction.g r4 = r7.f25802f
                r7.f25797a = r2
                java.lang.Object r7 = androidx.compose.material.p7.d(r8, r1, r3, r4, r7)
                if (r7 != r0) goto Lae
            Lac:
                r6 = 2
                return r0
            Lae:
                r6 = 1
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.z4.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ z4(float f10, float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14);
    }

    @Override // androidx.compose.material.q3
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.unit.h> a(boolean z10, @NotNull androidx.compose.foundation.interaction.h hVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        float f10;
        androidx.compose.animation.core.c cVar;
        c0Var.E(-1588756907);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1588756907, i10, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:500)");
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
            f10 = this.f25790c;
        } else if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
            f10 = this.f25789b;
        } else if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
            f10 = this.f25791d;
        } else {
            f10 = gVar instanceof androidx.compose.foundation.interaction.c.a ? this.f25792e : this.f25788a;
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
        c0Var.A();
        return n7VarJ;
    }

    private z4(float f10, float f11, float f12, float f13, float f14) {
        this.f25788a = f10;
        this.f25789b = f11;
        this.f25790c = f12;
        this.f25791d = f13;
        this.f25792e = f14;
    }
}
