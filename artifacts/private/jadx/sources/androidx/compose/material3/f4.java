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
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,847:1\n1282#2,6:848\n1282#2,6:854\n1282#2,6:860\n1282#2,6:866\n1282#2,6:872\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardElevation\n*L\n658#1:848,6\n668#1:854,6\n669#1:860,6\n721#1:866,6\n723#1:872,6\n*E\n"})
public final class f4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f27524g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f27525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f27526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f27527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f27528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f27529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f27530f;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.CardElevation$animateElevation$1$1", f = "Card.kt", i = {}, l = {670}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f27532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f27533c;

        /* JADX INFO: renamed from: androidx.compose.material3.f4$a$a, reason: collision with other inner class name */
        static final class C0216a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f27534a;

            C0216a(SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList) {
                this.f27534a = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
                    this.f27534a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.e.b) {
                    this.f27534a.remove(((androidx.compose.foundation.interaction.e.b) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
                    this.f27534a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.c.b) {
                    this.f27534a.remove(((androidx.compose.foundation.interaction.c.b) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                    this.f27534a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                    this.f27534a.remove(((androidx.compose.foundation.interaction.l.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                    this.f27534a.remove(((androidx.compose.foundation.interaction.l.a) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.b) {
                    this.f27534a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.c) {
                    this.f27534a.remove(((androidx.compose.foundation.interaction.a.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.C0087a) {
                    this.f27534a.remove(((androidx.compose.foundation.interaction.a.C0087a) gVar).a());
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.interaction.h hVar, SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f27532b = hVar;
            this.f27533c = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f27532b, this.f27533c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f27531a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.f27532b.c();
                C0216a c0216a = new C0216a(this.f27533c);
                this.f27531a = 1;
                if (iVarC.collect(c0216a, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.CardElevation$animateElevation$2$1", f = "Card.kt", i = {}, l = {727, 737}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> f27536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f27537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f27538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f4 f27539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.g f27540f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.s> cVar, float f10, boolean z10, f4 f4Var, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f27536b = cVar;
            this.f27537c = f10;
            this.f27538d = z10;
            this.f27539e = f4Var;
            this.f27540f = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f27536b, this.f27537c, this.f27538d, this.f27539e, this.f27540f, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
        
            if (androidx.compose.material3.internal.n2.d(r8, r1, r3, r4, r7) == r0) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.f4.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ f4(float f10, float f11, float f12, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15);
    }

    @androidx.compose.runtime.o
    private final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> e(boolean z10, androidx.compose.foundation.interaction.h hVar, androidx.compose.runtime.c0 c0Var, int i10) {
        float f10;
        androidx.compose.animation.core.c cVar;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1421890746, i10, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:666)");
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
            f10 = this.f27530f;
        } else if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
            f10 = this.f27526b;
        } else if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
            f10 = this.f27528d;
        } else if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
            f10 = this.f27527c;
        } else {
            f10 = gVar instanceof androidx.compose.foundation.interaction.a.b ? this.f27529e : this.f27525a;
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

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof f4)) {
            f4 f4Var = (f4) obj;
            return androidx.compose.ui.unit.h.x(this.f27525a, f4Var.f27525a) && androidx.compose.ui.unit.h.x(this.f27526b, f4Var.f27526b) && androidx.compose.ui.unit.h.x(this.f27527c, f4Var.f27527c) && androidx.compose.ui.unit.h.x(this.f27528d, f4Var.f27528d) && androidx.compose.ui.unit.h.x(this.f27530f, f4Var.f27530f);
        }
        return false;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> f(boolean z10, @Nullable androidx.compose.foundation.interaction.h hVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(-1763481333);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1763481333, i10, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:655)");
        }
        if (hVar != null) {
            c0Var.E(167824247);
            c0Var.A();
            androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarE = e(z10, hVar, c0Var, i10 & androidx.media3.exoplayer.analytics.b.f62802b0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return n7VarE;
        }
        c0Var.E(167751211);
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = androidx.compose.runtime.d7.g(androidx.compose.ui.unit.h.o(this.f27525a), null, 2, null);
            c0Var.Y(objI0);
        }
        androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI0;
        c0Var.A();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return n3Var;
    }

    public int hashCode() {
        return (((((((androidx.compose.ui.unit.h.D(this.f27525a) * 31) + androidx.compose.ui.unit.h.D(this.f27526b)) * 31) + androidx.compose.ui.unit.h.D(this.f27527c)) * 31) + androidx.compose.ui.unit.h.D(this.f27528d)) * 31) + androidx.compose.ui.unit.h.D(this.f27530f);
    }

    private f4(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f27525a = f10;
        this.f27526b = f11;
        this.f27527c = f12;
        this.f27528d = f13;
        this.f27529e = f14;
        this.f27530f = f15;
    }
}
