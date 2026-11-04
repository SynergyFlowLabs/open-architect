package com.planner5d.library.activity.fragment.snapshots;

import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.statistics.events.n1;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.model.snapshot.Snapshot;
import com.planner5d.library.services.utility.v1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class h extends f2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f136008f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.w f136009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.u0 f136010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b4 f136011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<Boolean> f136012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final v1.a<a> f136013e;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f136014a = 0;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.snapshots.h$a$a, reason: collision with other inner class name */
        @androidx.compose.runtime.internal.w0(parameters = 0)
        public static final class C1496a extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f136015c = 8;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final Throwable f136016b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1496a(@NotNull Throwable exception) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f136016b = exception;
            }

            @NotNull
            public final Throwable a() {
                return this.f136016b;
            }
        }

        @androidx.compose.runtime.internal.w0(parameters = 1)
        public static final class b extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final b f136017b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f136018c = 0;

            private b() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                if (this != obj && !(obj instanceof b)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1644355052;
            }

            @NotNull
            public String toString() {
                return "NeedProMembership";
            }
        }

        @androidx.compose.runtime.internal.w0(parameters = 1)
        public static final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final c f136019b = new c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f136020c = 0;

            private c() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1799376062;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.snapshots.ImproveSnapshotWithAiViewModel$requestRenderAiImprovementFromBackend$1", f = "ImproveSnapshotWithAiViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f136022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f136023c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f136025e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f136025e = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new b(this.f136025e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            v1.a aVar;
            Throwable th2;
            v1.a aVar2;
            a aVar3;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136023c;
            if (i10 == 0) {
                ResultKt.m(obj);
                h.this.f136012d.r(kotlin.coroutines.jvm.internal.b.a(true));
                v1.a aVar4 = h.this.f136013e;
                try {
                    com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
                    Observable<Snapshot> observableO0 = h.this.f136011c.o0(h.this.f136009a.a(), this.f136025e);
                    Intrinsics.checkNotNullExpressionValue(observableO0, "improveRenderWithAi(...)");
                    this.f136021a = aVar4;
                    this.f136022b = aVar4;
                    this.f136023c = 1;
                    if (c0Var.l(observableO0, this) == objL) {
                        return objL;
                    }
                    aVar2 = aVar4;
                    aVar = aVar2;
                } catch (Throwable th3) {
                    aVar = aVar4;
                    th2 = th3;
                    a c1496a = new a.C1496a(th2);
                    h.this.f136012d.r(kotlin.coroutines.jvm.internal.b.a(false));
                    aVar3 = c1496a;
                    aVar2 = aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (v1.a) this.f136022b;
                aVar = (v1.a) this.f136021a;
                try {
                    ResultKt.m(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        a c1496a2 = new a.C1496a(th2);
                        h.this.f136012d.r(kotlin.coroutines.jvm.internal.b.a(false));
                        aVar3 = c1496a2;
                        aVar2 = aVar;
                    } catch (Throwable th5) {
                        h.this.f136012d.r(kotlin.coroutines.jvm.internal.b.a(false));
                        throw th5;
                    }
                }
            }
            aVar3 = a.c.f136019b;
            h.this.f136012d.r(kotlin.coroutines.jvm.internal.b.a(false));
            aVar2.r(aVar3);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public h(@NotNull com.planner5d.library.modules.user.user.w userAuthorization, @NotNull com.planner5d.library.modules.user.user.u0 userPurchases, @NotNull b4 snapshotManager) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        this.f136009a = userAuthorization;
        this.f136010b = userPurchases;
        this.f136011c = snapshotManager;
        this.f136012d = new androidx.lifecycle.c1<>(Boolean.FALSE);
        this.f136013e = v1.l(v1.f229769a, null, 1, null);
        n1.f217163b.r0(t3.a.shown);
    }

    private static Object Z(h hVar) {
        return j1.t(new kotlin.jvm.internal.c1(hVar, h.class, "improvementResultInternal", "getImprovementResultInternal()Lcom/planner5d/library/services/utility/LiveDataUtils$LiveDataEvent;", 0));
    }

    private static Object b0(h hVar) {
        return j1.t(new kotlin.jvm.internal.c1(hVar, h.class, "requestingImprovementInternal", "getRequestingImprovementInternal()Landroidx/lifecycle/MutableLiveData;", 0));
    }

    public static /* synthetic */ void f0(h hVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        hVar.d0(j10, z10);
    }

    private final void g0(long j10) {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(j10, null), 3, null);
    }

    @NotNull
    public final androidx.lifecycle.w0<a> Y() {
        return this.f136013e;
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> a0() {
        return this.f136012d;
    }

    public final boolean c0() {
        return this.f136010b.r();
    }

    public final void d0(long j10, boolean z10) {
        if (this.f136010b.r()) {
            g0(j10);
        } else if (z10) {
            this.f136013e.r(a.b.f136017b);
        }
    }

    @Override // androidx.lifecycle.f2
    protected void onCleared() {
        super.onCleared();
        n1.f217163b.r0(t3.a.closed);
    }
}
