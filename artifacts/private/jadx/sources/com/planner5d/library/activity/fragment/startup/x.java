package com.planner5d.library.activity.fragment.startup;

import android.system.ErrnoException;
import android.system.OsConstants;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.modules.user.user.m1;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.v1;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nStartupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupViewModel.kt\ncom/planner5d/library/activity/fragment/startup/StartupViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"})
public final class x extends f2 implements com.planner5d.library.model.manager.initialization.r.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f136566v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f136567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f136568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.initialization.r f136569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.legal.model.manager.a> f136570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.t> f136571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final c1<b> f136572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.services.utility.o<Unit>> f136573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final v1.a<Boolean> f136574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final v1.a<Boolean> f136575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final v1.a<Boolean> f136576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final v1.a<Boolean> f136577k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final v1.a<Boolean> f136578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.startup.c f136579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.startup.h f136580n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final u f136581o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final v f136582s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final r f136583t;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupViewModel$1", f = "StartupViewModel.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136584a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return x.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136584a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.initialization.r rVar = x.this.f136569c;
                x xVar = x.this;
                this.f136584a = 1;
                if (rVar.l(xVar, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @w0(parameters = 1)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f136586a = 0;

        @w0(parameters = 1)
        public static final class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final a f136587b = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f136588c = 0;

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.startup.x$b$b, reason: collision with other inner class name */
        @w0(parameters = 1)
        public static final class C1500b extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f136589d = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f136590b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f136591c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1500b(@NotNull String text, boolean z10) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.f136590b = text;
                this.f136591c = z10;
            }

            public final boolean a() {
                return this.f136591c;
            }

            @NotNull
            public final String b() {
                return this.f136590b;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupViewModel$agreementProvider$1", f = "StartupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136592a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return x.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f136592a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            x.this.d0().o(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupViewModel$markSpacesOnboardingClosedAndProceed$1", f = "StartupViewModel.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136594a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return x.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136594a;
            if (i10 == 0) {
                ResultKt.m(obj);
                v vVar = x.this.f136582s;
                this.f136594a = 1;
                if (vVar.e(this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupViewModel$markUserAsAgreedAndProceed$1", f = "StartupViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160711n0}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136596a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return x.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e eVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f136596a;
            if (i10 == 0) {
                ResultKt.m(obj);
                id.a aVarA = ((com.planner5d.library.modules.user.user.t) x.this.f136571e.get()).a();
                if (aVarA != null) {
                    com.planner5d.library.legal.model.manager.a aVar = (com.planner5d.library.legal.model.manager.a) x.this.f136570d.get();
                    this.f136596a = 1;
                    eVar = this;
                    if (com.planner5d.library.legal.model.manager.a.I(aVar, aVarA, null, eVar, 2, null) == objL) {
                        return objL;
                    }
                }
                x.this.f136580n.b();
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            eVar = this;
            x.this.f136580n.b();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupViewModel$onboardingProvider$1", f = "StartupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136598a;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return x.this.new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f136598a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            x.this.c0().o(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupViewModel", f = "StartupViewModel.kt", i = {0, 0}, l = {com.rabbitmq.client.impl.k.b.p.f265340a, 113}, m = "signIn", n = {"this", "isAborted"}, s = {"L$0", "L$1"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f136601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f136602c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136604e;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136602c = obj;
            this.f136604e |= Integer.MIN_VALUE;
            return x.this.w(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupViewModel$signInProvider$1", f = "StartupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136605a;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return x.this.new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f136605a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            x.this.g0().o(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupViewModel", f = "StartupViewModel.kt", i = {0, 0}, l = {139, androidx.media2.widget.f.i.f59775g0}, m = "startOnboarding", n = {"this", "isAborted"}, s = {"L$0", "L$1"})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f136608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f136609c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136611e;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136609c = obj;
            this.f136611e |= Integer.MIN_VALUE;
            return x.this.g(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupViewModel", f = "StartupViewModel.kt", i = {0, 0}, l = {132, 134}, m = "startSpaceOnboarding", n = {"this", "isAborted"}, s = {"L$0", "L$1"})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f136613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f136614c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136616e;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136614c = obj;
            this.f136616e |= Integer.MIN_VALUE;
            return x.this.q(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupViewModel$startupSpacesProvider$1", f = "StartupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f136617a;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return x.this.new k(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f136617a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            x.this.h0().o(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public x(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull com.planner5d.library.model.manager.initialization.r initializationManager, @NotNull fg.e<com.planner5d.library.legal.model.manager.a> privacyManager, @NotNull fg.e<com.planner5d.library.modules.user.user.t> userAuthorization, @NotNull fg.e<com.planner5d.library.activity.fragment.startup.a> agreementChecker, @NotNull c2 networkStateUtility, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull com.planner5d.library.model.manager.spaces.b spacesManager, @NotNull fg.e<m1> userStorage) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(initializationManager, "initializationManager");
        Intrinsics.checkNotNullParameter(privacyManager, "privacyManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(agreementChecker, "agreementChecker");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(spacesManager, "spacesManager");
        Intrinsics.checkNotNullParameter(userStorage, "userStorage");
        this.f136567a = application;
        this.f136568b = featureConfigManager;
        this.f136569c = initializationManager;
        this.f136570d = privacyManager;
        this.f136571e = userAuthorization;
        this.f136572f = new c1<>(new b.C1500b("", false));
        this.f136573g = new c1<>();
        v1 v1Var = v1.f229769a;
        Boolean bool = Boolean.FALSE;
        this.f136574h = v1Var.j(bool);
        this.f136575i = v1Var.j(bool);
        this.f136576j = v1Var.j(bool);
        this.f136577k = v1Var.j(bool);
        this.f136578l = v1Var.j(bool);
        this.f136579m = new com.planner5d.library.activity.fragment.startup.c(new Function0() { // from class: com.planner5d.library.activity.fragment.startup.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x.n0(this.f136565a);
            }
        });
        this.f136580n = new com.planner5d.library.activity.fragment.startup.h(agreementChecker, new c(null));
        m1 m1Var = userStorage.get();
        Intrinsics.checkNotNullExpressionValue(m1Var, "get(...)");
        this.f136581o = new u(featureConfigManager, m1Var, new h(null));
        this.f136582s = new v(application, featureConfigManager, networkStateUtility, preferences, spacesManager, new k(null));
        this.f136583t = new r(preferences, featureConfigManager, new f(null));
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(x xVar) {
        c1<com.planner5d.library.services.utility.o<Unit>> c1Var = xVar.f136573g;
        Unit unit = Unit.f312394a;
        c1Var.o(new com.planner5d.library.services.utility.o<>(unit));
        return unit;
    }

    @Override // com.planner5d.library.model.manager.initialization.r.b
    @Nullable
    public Object B(@NotNull Function0<Boolean> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = this.f136583t.g(function0, dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.initialization.r.b
    @Nullable
    public Object M(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (this.f136568b.a(com.planner5d.library.model.manager.config.f.RateOnStart)) {
            this.f136578l.o(kotlin.coroutines.jvm.internal.b.a(true));
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.initialization.r.b
    @Nullable
    public Object S(@NotNull com.planner5d.library.legal.model.manager.a.EnumC1566a enumC1566a, @NotNull Function0<Boolean> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = this.f136580n.a(enumC1566a, function0, dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    public final void a0() {
        this.f136570d.get().B();
    }

    @NotNull
    public final c1<com.planner5d.library.services.utility.o<Unit>> b0() {
        return this.f136573g;
    }

    @NotNull
    public final v1.a<Boolean> c0() {
        return this.f136575i;
    }

    @NotNull
    public final v1.a<Boolean> d0() {
        return this.f136574h;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    @Override // com.planner5d.library.model.manager.initialization.r.b
    public void e(@NotNull Exception exception) {
        Throwable cause;
        String string;
        Intrinsics.checkNotNullParameter(exception, "exception");
        IOException iOException = exception instanceof IOException ? (IOException) exception : null;
        if ((iOException != null ? iOException.getCause() : null) != null) {
            Throwable cause2 = exception.getCause();
            ErrnoException errnoException = cause2 instanceof ErrnoException ? (ErrnoException) cause2 : null;
            if (errnoException == null || errnoException.errno != OsConstants.ENOSPC) {
                cause = exception.getCause();
                if (cause != null) {
                    exception = cause;
                }
                string = j1.d(exception.getClass()).Q() + " - " + exception.getMessage();
            } else {
                string = this.f136567a.getString(com.planner5d.library.f.s.O9);
            }
        } else {
            cause = exception.getCause();
            if (cause != null) {
                exception = cause;
            }
            string = j1.d(exception.getClass()).Q() + " - " + exception.getMessage();
        }
        Intrinsics.checkNotNull(string);
        c1<b> c1Var = this.f136572f;
        String error = ErrorMessageException.getError(this.f136567a, string);
        Intrinsics.checkNotNullExpressionValue(error, "getError(...)");
        c1Var.r(new b.C1500b(error, false));
    }

    @NotNull
    public final v1.a<Boolean> f0() {
        return this.f136578l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r6.g(r7, r0) == r1) goto L23;
     */
    @Override // com.planner5d.library.model.manager.initialization.r.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.planner5d.library.activity.fragment.startup.x.i
            if (r0 == 0) goto L16
            r0 = r8
            r5 = 5
            com.planner5d.library.activity.fragment.startup.x$i r0 = (com.planner5d.library.activity.fragment.startup.x.i) r0
            int r1 = r0.f136611e
            r5 = 3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r5 = 0
            r0.f136611e = r1
            goto L1b
        L16:
            com.planner5d.library.activity.fragment.startup.x$i r0 = new com.planner5d.library.activity.fragment.startup.x$i
            r0.<init>(r8)
        L1b:
            r5 = 5
            java.lang.Object r8 = r0.f136609c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 4
            int r2 = r0.f136611e
            r3 = 2
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L32
            kotlin.ResultKt.m(r8)
            goto L83
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            r5 = 4
            throw r6
        L3b:
            java.lang.Object r6 = r0.f136608b
            r7 = r6
            r5 = 4
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5 = 7
            java.lang.Object r6 = r0.f136607a
            r5 = 0
            com.planner5d.library.activity.fragment.startup.x r6 = (com.planner5d.library.activity.fragment.startup.x) r6
            kotlin.ResultKt.m(r8)
            goto L62
        L4b:
            r5 = 7
            kotlin.ResultKt.m(r8)
            com.planner5d.library.activity.fragment.startup.r r8 = r6.f136583t
            r5 = 4
            r0.f136607a = r6
            r0.f136608b = r7
            r5 = 5
            r0.f136611e = r4
            java.lang.Object r8 = r8.d(r0)
            r5 = 1
            if (r8 != r1) goto L62
            r5 = 4
            goto L81
        L62:
            java.lang.Object r8 = r7.invoke()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r5 = 4
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L87
            com.planner5d.library.activity.fragment.startup.r r6 = r6.f136583t
            r8 = 0
            r0.f136607a = r8
            r5 = 7
            r0.f136608b = r8
            r5 = 6
            r0.f136611e = r3
            java.lang.Object r6 = r6.g(r7, r0)
            r5 = 0
            if (r6 != r1) goto L83
        L81:
            r5 = 3
            return r1
        L83:
            r5 = 1
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        L87:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.startup.x.g(kotlin.jvm.functions.Function0, kotlin.coroutines.d):java.lang.Object");
    }

    @NotNull
    public final v1.a<Boolean> g0() {
        return this.f136576j;
    }

    @NotNull
    public final v1.a<Boolean> h0() {
        return this.f136577k;
    }

    @NotNull
    public final c1<b> i0() {
        return this.f136572f;
    }

    public final void j0() {
        this.f136583t.e();
    }

    @Override // com.planner5d.library.model.manager.initialization.r.b
    public void k() {
        c1<b> c1Var = this.f136572f;
        String string = this.f136567a.getString(com.planner5d.library.f.s.qH);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        c1Var.r(new b.C1500b(string, false));
    }

    public final void k0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new d(null), 3, null);
    }

    @NotNull
    public final p2 l0() {
        return kotlinx.coroutines.k.f(g2.a(this), null, null, new e(null), 3, null);
    }

    public final void m0() {
        this.f136581o.b();
    }

    public final void o0() {
        this.f136579m.b();
        c1<b> c1Var = this.f136572f;
        String string = this.f136567a.getString(com.planner5d.library.f.s.ND);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        c1Var.r(new b.C1500b(string, true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r6.g(r7, r0) == r1) goto L23;
     */
    @Override // com.planner5d.library.model.manager.initialization.r.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            r5 = 3
            boolean r0 = r8 instanceof com.planner5d.library.activity.fragment.startup.x.j
            if (r0 == 0) goto L19
            r0 = r8
            r5 = 6
            com.planner5d.library.activity.fragment.startup.x$j r0 = (com.planner5d.library.activity.fragment.startup.x.j) r0
            r5 = 3
            int r1 = r0.f136616e
            r5 = 2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1
            r3 = r1 & r2
            if (r3 == 0) goto L19
            int r1 = r1 - r2
            r5 = 6
            r0.f136616e = r1
            goto L1e
        L19:
            com.planner5d.library.activity.fragment.startup.x$j r0 = new com.planner5d.library.activity.fragment.startup.x$j
            r0.<init>(r8)
        L1e:
            java.lang.Object r8 = r0.f136614c
            r5 = 1
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f136616e
            r3 = 2
            r4 = 1
            r5 = r4
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L34
            kotlin.ResultKt.m(r8)
            goto L7e
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 2
            r6.<init>(r7)
            throw r6
        L3d:
            java.lang.Object r6 = r0.f136613b
            r7 = r6
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5 = 5
            java.lang.Object r6 = r0.f136612a
            com.planner5d.library.activity.fragment.startup.x r6 = (com.planner5d.library.activity.fragment.startup.x) r6
            kotlin.ResultKt.m(r8)
            goto L5e
        L4b:
            r5 = 4
            kotlin.ResultKt.m(r8)
            com.planner5d.library.activity.fragment.startup.v r8 = r6.f136582s
            r0.f136612a = r6
            r0.f136613b = r7
            r0.f136616e = r4
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L5e
            goto L7d
        L5e:
            java.lang.Object r8 = r7.invoke()
            r5 = 5
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L82
            com.planner5d.library.activity.fragment.startup.v r6 = r6.f136582s
            r8 = 0
            r5 = r8
            r0.f136612a = r8
            r5 = 5
            r0.f136613b = r8
            r0.f136616e = r3
            r5 = 6
            java.lang.Object r6 = r6.g(r7, r0)
            if (r6 != r1) goto L7e
        L7d:
            return r1
        L7e:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            r5 = 5
            return r6
        L82:
            r5 = 3
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.startup.x.q(kotlin.jvm.functions.Function0, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.model.manager.initialization.r.b
    @Nullable
    public Object r(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = this.f136579m.a(dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (r6.e(r7, r0) == r1) goto L25;
     */
    @Override // com.planner5d.library.model.manager.initialization.r.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            r5 = 6
            boolean r0 = r8 instanceof com.planner5d.library.activity.fragment.startup.x.g
            if (r0 == 0) goto L19
            r0 = r8
            r0 = r8
            r5 = 1
            com.planner5d.library.activity.fragment.startup.x$g r0 = (com.planner5d.library.activity.fragment.startup.x.g) r0
            int r1 = r0.f136604e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r5 = 1
            if (r3 == 0) goto L19
            int r1 = r1 - r2
            r5 = 3
            r0.f136604e = r1
            r5 = 7
            goto L1e
        L19:
            com.planner5d.library.activity.fragment.startup.x$g r0 = new com.planner5d.library.activity.fragment.startup.x$g
            r0.<init>(r8)
        L1e:
            r5 = 3
            java.lang.Object r8 = r0.f136602c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f136604e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            r5 = 3
            if (r2 == r4) goto L3d
            r5 = 0
            if (r2 != r3) goto L35
            kotlin.ResultKt.m(r8)
            goto L83
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            java.lang.Object r6 = r0.f136601b
            r7 = r6
            r5 = 5
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5 = 5
            java.lang.Object r6 = r0.f136600a
            com.planner5d.library.activity.fragment.startup.x r6 = (com.planner5d.library.activity.fragment.startup.x) r6
            r5 = 1
            kotlin.ResultKt.m(r8)
            r5 = 0
            goto L62
        L4e:
            kotlin.ResultKt.m(r8)
            r5 = 7
            com.planner5d.library.activity.fragment.startup.u r8 = r6.f136581o
            r0.f136600a = r6
            r0.f136601b = r7
            r0.f136604e = r4
            java.lang.Object r8 = r8.c(r0)
            r5 = 3
            if (r8 != r1) goto L62
            goto L82
        L62:
            java.lang.Object r8 = r7.invoke()
            r5 = 7
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r5 = 0
            if (r8 != 0) goto L86
            com.planner5d.library.activity.fragment.startup.u r6 = r6.f136581o
            r8 = 0
            r5 = r8
            r0.f136600a = r8
            r0.f136601b = r8
            r0.f136604e = r3
            r5 = 6
            java.lang.Object r6 = r6.e(r7, r0)
            r5 = 0
            if (r6 != r1) goto L83
        L82:
            return r1
        L83:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        L86:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.startup.x.w(kotlin.jvm.functions.Function0, kotlin.coroutines.d):java.lang.Object");
    }
}
