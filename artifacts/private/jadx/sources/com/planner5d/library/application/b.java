package com.planner5d.library.application;

import android.database.sqlite.SQLiteDatabase;
import android.os.StrictMode;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.activeandroid.ActiveAndroid;
import inu.oe.gniutvtlk.LdxylwFztvrnbcbpf;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public abstract class b extends LdxylwFztvrnbcbpf implements androidx.work.c.InterfaceC0774c, t5.b, com.planner5d.library.model.manager.statistics.a.b, d6.a, com.planner5d.library.model.manager.push.c, com.planner5d.library.model.manager.statistics.c0, com.planner5d.library.model.manager.a1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private static b f142457e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.application.c f142459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f142460b = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.application.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.v();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f142455c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f142456d = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Object f142458f = new Object();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public static /* synthetic */ void c() {
        }

        @oj.n
        @NotNull
        public final com.planner5d.library.application.c a() {
            b bVar = b.f142457e;
            if (bVar != null) {
                return bVar.s();
            }
            throw new RuntimeException("Application not set");
        }

        @NotNull
        public final SQLiteDatabase b() {
            SQLiteDatabase database = ActiveAndroid.getDatabase();
            Intrinsics.checkNotNullExpressionValue(database, "getDatabase(...)");
            return database;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.application.b$b, reason: collision with other inner class name */
    public static final class C1513b implements DefaultLifecycleObserver {
        C1513b() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(androidx.lifecycle.o0 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            b.this.y();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(androidx.lifecycle.o0 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            b.this.w();
        }
    }

    public static final class c implements com.planner5d.library.model.manager.statistics.a {
        c() {
        }

        @Override // com.planner5d.library.model.manager.statistics.a
        public com.planner5d.library.model.manager.statistics.d0 a() {
            return b.f142455c.a().a();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.application.Application$onCreate$1", f = "Application.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.C0}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142462a;

        /* synthetic */ class a implements kotlinx.coroutines.flow.j, kotlin.jvm.internal.c0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.services.utility.s f142464a;

            a(com.planner5d.library.services.utility.s sVar) {
                this.f142464a = sVar;
            }

            public final Object a(boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
                Object objM = d.m(this.f142464a, z10, dVar);
                return objM == kotlin.coroutines.intrinsics.b.l() ? objM : Unit.f312394a;
            }

            @Override // kotlin.jvm.internal.c0
            public final kotlin.x<?> b() {
                return new kotlin.jvm.internal.a(2, this.f142464a, com.planner5d.library.services.utility.s.class, "setConcurrentNetwork", "setConcurrentNetwork(Z)V", 4);
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof kotlinx.coroutines.flow.j) && (obj instanceof kotlin.jvm.internal.c0)) {
                    return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object m(com.planner5d.library.services.utility.s sVar, boolean z10, kotlin.coroutines.d dVar) {
            sVar.A(z10);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142462a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<Boolean> iVarT = b.this.s().J1().t(com.planner5d.library.model.manager.config.f.ConcurrentNetworking);
                a aVar = new a(com.planner5d.library.services.utility.s.f229729a);
                this.f142462a = 1;
                if (iVarT.collect(aVar, this) == objL) {
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
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private final void n() {
        ProcessLifecycleOwner.f52139i.a().getLifecycle().c(new C1513b());
    }

    private final void q() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
    }

    @oj.n
    @NotNull
    public static final com.planner5d.library.application.c r() {
        return f142455c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.application.c s() {
        synchronized (f142458f) {
            try {
                com.planner5d.library.application.c cVar = this.f142459a;
                if (cVar != null) {
                    return cVar;
                }
                com.planner5d.library.application.c.a aVarO = o();
                z(aVarO);
                com.planner5d.library.application.c cVarBuild = aVarO.build();
                this.f142459a = cVarBuild;
                x();
                return cVarBuild;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public static final SQLiteDatabase t() {
        return f142455c.b();
    }

    private final com.planner5d.library.model.manager.statistics.a u() {
        return (com.planner5d.library.model.manager.statistics.a) this.f142460b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c v() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        f142455c.a().D().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        f142455c.a().D().a();
    }

    @Override // com.planner5d.library.model.manager.statistics.c0
    @NotNull
    public com.planner5d.library.model.manager.statistics.d0 a() {
        return f142455c.a().W1();
    }

    @Override // com.planner5d.library.application.d6.a
    @NotNull
    public d6 b() {
        return f142455c.a().b();
    }

    @Override // com.planner5d.library.application.t5.b
    @NotNull
    public t5 c() {
        return f142455c.a().c();
    }

    @Override // com.planner5d.library.model.manager.a1.a
    @NotNull
    public com.planner5d.library.model.manager.a1 d() {
        return f142455c.a().z();
    }

    @Override // com.planner5d.library.model.manager.push.c
    @NotNull
    public com.planner5d.library.model.manager.push.b e() {
        return f142455c.a().e();
    }

    @Override // com.planner5d.library.model.manager.statistics.a.b
    @NotNull
    public com.planner5d.library.model.manager.statistics.a f() {
        return u();
    }

    @Override // androidx.work.c.InterfaceC0774c
    @NotNull
    public androidx.work.c h() {
        return new androidx.work.c.a().H(4).a();
    }

    @NotNull
    protected com.planner5d.library.application.c.a o() {
        com.planner5d.library.application.c.a aVarA = m3.a();
        Intrinsics.checkNotNullExpressionValue(aVarA, "builder(...)");
        return aVarA;
    }

    @Override // android.app.Application
    public void onCreate() {
        boolean zA = com.planner5d.library.services.utility.o3.f229693a.a(this);
        if (zA) {
            f142457e = this;
        }
        super.onCreate();
        if (zA) {
            s().K().k(this);
            s().U().c(this);
            com.planner5d.library.g.a(this, "SERIF", com.planner5d.library.f.i.f167926e);
            com.planner5d.library.model.manager.t1 t1VarD = s().d();
            com.planner5d.library.services.rx.e.f224940b.b(t1VarD);
            com.planner5d.library.services.utility.j0.g(s().m1(), t1VarD);
            int i10 = 6 << 0;
            try {
                androidx.work.m0.q(this);
            } catch (Throwable th2) {
                t1VarD.b("create_work_manager", null, th2);
            }
            registerActivityLifecycleCallbacks(new o5(CollectionsKt.listOf((Object[]) new String[]{"com.planner5d", "io.customer"}), s().W1()));
            kotlinx.coroutines.k.f(s().m1(), com.planner5d.library.services.utility.s.f229729a.d(), null, new d(null), 2, null);
            n();
        }
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        if (com.planner5d.library.services.utility.o3.f229693a.a(this)) {
            ActiveAndroid.dispose();
        }
    }

    @NotNull
    protected abstract com.planner5d.library.application.d p();

    protected void x() {
    }

    protected void z(@NotNull com.planner5d.library.application.c.a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.a(this);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type android.app.Application");
        builder.d(this);
        builder.c(p());
    }
}
