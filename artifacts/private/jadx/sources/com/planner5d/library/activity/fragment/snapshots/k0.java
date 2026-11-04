package com.planner5d.library.activity.fragment.snapshots;

import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.d4;
import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.u2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotPagerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotPagerViewModel.kt\ncom/planner5d/library/activity/fragment/snapshots/SnapshotPagerViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public final class k0 extends f2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f136037e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d4 f136038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<Boolean> f136039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<Boolean> f136040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<Boolean> f136041d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.snapshots.SnapshotPagerViewModel$markTooltipAsShown$1", f = "SnapshotPagerViewModel.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136042a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k0.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136042a;
            if (i10 == 0) {
                ResultKt.m(obj);
                d4 d4Var = k0.this.f136038a;
                this.f136042a = 1;
                if (d4Var.i(2, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.snapshots.SnapshotPagerViewModel$setActiveSnapshot$2", f = "SnapshotPagerViewModel.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f136045b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k0.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.c1 c1Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136045b;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.lifecycle.c1 c1Var2 = k0.this.f136041d;
                d4 d4Var = k0.this.f136038a;
                this.f136044a = c1Var2;
                this.f136045b = 1;
                Object objH = d4Var.h(2, this);
                if (objH == objL) {
                    return objL;
                }
                obj = objH;
                c1Var = c1Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1Var = (androidx.lifecycle.c1) this.f136044a;
                ResultKt.m(obj);
            }
            c1Var.r(kotlin.coroutines.jvm.internal.b.a(!((Boolean) obj).booleanValue()));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public k0(@NotNull d4 snapshotManager) {
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        this.f136038a = snapshotManager;
        Boolean bool = Boolean.FALSE;
        this.f136039b = new androidx.lifecycle.c1<>(bool);
        this.f136040c = new androidx.lifecycle.c1<>(bool);
        this.f136041d = new androidx.lifecycle.c1<>(bool);
    }

    private static Object X(k0 k0Var) {
        return j1.t(new kotlin.jvm.internal.c1(k0Var, k0.class, "canImproveSnapshotInternal", "getCanImproveSnapshotInternal()Landroidx/lifecycle/MutableLiveData;", 0));
    }

    private static Object Z(k0 k0Var) {
        return j1.t(new kotlin.jvm.internal.c1(k0Var, k0.class, "canImproveWithAiSnapshotInternal", "getCanImproveWithAiSnapshotInternal()Landroidx/lifecycle/MutableLiveData;", 0));
    }

    private static Object b0(k0 k0Var) {
        return j1.t(new kotlin.jvm.internal.c1(k0Var, k0.class, "showImproveWithAiTooltipInternal", "getShowImproveWithAiTooltipInternal()Landroidx/lifecycle/MutableLiveData;", 0));
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> W() {
        return this.f136039b;
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> Y() {
        return this.f136040c;
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> a0() {
        return this.f136041d;
    }

    public final void c0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    public final void d0(@NotNull gd.b snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        u2.D1(b4.a.ai_render_improvement_clicked, p3.b.open, snapshot.d(), null, snapshot);
    }

    public final void f0(@Nullable gd.b bVar) {
        if (bVar == null) {
            androidx.lifecycle.c1<Boolean> c1Var = this.f136039b;
            Boolean bool = Boolean.FALSE;
            c1Var.r(bool);
            this.f136040c.r(bool);
            this.f136041d.r(bool);
            return;
        }
        androidx.lifecycle.c1<Boolean> c1Var2 = this.f136039b;
        m mVar = new m(bVar);
        c1Var2.r(Boolean.valueOf(mVar.d() || mVar.e()));
        if (!this.f136038a.g()) {
            androidx.lifecycle.c1<Boolean> c1Var3 = this.f136040c;
            Boolean bool2 = Boolean.FALSE;
            c1Var3.r(bool2);
            this.f136041d.r(bool2);
            return;
        }
        boolean zL = bVar.l();
        this.f136040c.r(Boolean.valueOf(zL));
        if (zL) {
            kotlinx.coroutines.k.f(g2.a(this), null, null, new b(null), 3, null);
        } else {
            this.f136041d.r(Boolean.FALSE);
        }
    }
}
