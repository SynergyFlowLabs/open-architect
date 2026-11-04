package com.planner5d.library.modules.user.user;

import android.app.Activity;
import java.io.File;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nUserPrivateData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserPrivateData.kt\ncom/planner5d/library/modules/user/user/UserPrivateData\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,133:1\n13409#2,2:134\n*S KotlinDebug\n*F\n+ 1 UserPrivateData.kt\ncom/planner5d/library/modules/user/user/UserPrivateData\n*L\n114#1:134,2\n*E\n"})
public final class m0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f223169q = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f223170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f223171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fg.e<t> f223172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.c1 f223173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.statistics.b0> f223174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.crashreporting.l> f223175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.l> f223176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f223177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f223178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.initialization.r f223179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.i1 f223180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f223181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.auth.r f223182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f223183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.z f223184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.g0 f223185p;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPrivateData$clearPrivateDataOnDevice$1$1", f = "UserPrivateData.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223186a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m0.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223186a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p pVar = m0.this.f223177h;
                this.f223186a = 1;
                if (pVar.c(this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPrivateData$clearPrivateDataOnDevice$1$2", f = "UserPrivateData.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160745y1}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223188a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m0.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223188a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.j jVar = m0.this.f223183n;
                this.f223188a = 1;
                if (jVar.m(this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPrivateData$clearPrivateExternalSignIn$1", f = "UserPrivateData.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223190a;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPrivateData$clearPrivateExternalSignIn$1$1", f = "UserPrivateData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f223192a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m0 f223193b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m0 m0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f223193b = m0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f223193b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f223192a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f223193b.f223182m.f();
                return null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return m0.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223190a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
            a aVar = new a(m0.this, null);
            this.f223190a = 1;
            Object objH = kotlinx.coroutines.i.h(z1VarH, aVar, this);
            return objH == objL ? objL : objH;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public m0(@NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull com.planner5d.library.application.b application, @NotNull fg.e<t> userAuthorization, @NotNull com.planner5d.library.model.manager.c1 installationManager, @NotNull fg.e<com.planner5d.library.model.manager.statistics.b0> statisticsManager, @NotNull fg.e<com.planner5d.library.model.manager.crashreporting.l> crashReporter, @NotNull fg.e<com.planner5d.library.model.manager.l> databaseManager, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.model.manager.initialization.r initializationManager, @NotNull com.planner5d.library.model.manager.i1 intercomManager, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull com.planner5d.library.modules.user.auth.r socialServiceAuthorization, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull com.planner5d.library.services.z privateFiles, @NotNull com.planner5d.library.model.manager.builtin.g0 helperDataUpdate) {
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(statisticsManager, "statisticsManager");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(initializationManager, "initializationManager");
        Intrinsics.checkNotNullParameter(intercomManager, "intercomManager");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(socialServiceAuthorization, "socialServiceAuthorization");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(privateFiles, "privateFiles");
        Intrinsics.checkNotNullParameter(helperDataUpdate, "helperDataUpdate");
        this.f223170a = userApiRequester;
        this.f223171b = application;
        this.f223172c = userAuthorization;
        this.f223173d = installationManager;
        this.f223174e = statisticsManager;
        this.f223175f = crashReporter;
        this.f223176g = databaseManager;
        this.f223177h = preferences;
        this.f223178i = projectManager;
        this.f223179j = initializationManager;
        this.f223180k = intercomManager;
        this.f223181l = builtInDataManager;
        this.f223182m = socialServiceAuthorization;
        this.f223183n = featureConfigManager;
        this.f223184o = privateFiles;
        this.f223185p = helperDataUpdate;
    }

    private final Observable<Void> h() {
        Observable<Void> observableH = com.planner5d.library.services.rx.i.h(new Runnable() { // from class: com.planner5d.library.modules.user.user.j0
            @Override // java.lang.Runnable
            public final void run() {
                m0.i(this.f223159a);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableH, "fromRunnable(...)");
        return observableH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(m0 m0Var) {
        m0Var.f223185p.d();
    }

    private final Observable<Void> k(final Activity activity) {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.modules.user.user.i0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                m0.l(this.f223155a, activity, (Subscriber) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(m0 m0Var, Activity activity, Subscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            m0Var.f223174e.get().f(activity);
            m0Var.f223175f.get().v();
            m0Var.f223176g.get().b();
            m0Var.f223178i.K();
            com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
            com.planner5d.library.services.utility.c0.t(c0Var, null, false, m0Var.new a(null), 3, null);
            m0Var.f223179j.o();
            m0Var.f223180k.a();
            com.planner5d.library.services.utility.c0.t(c0Var, null, false, m0Var.new b(null), 3, null);
            List listListOf = CollectionsKt.listOf((Object[]) new File[]{m0Var.f223181l.N(true), m0Var.f223181l.N(false), com.planner5d.library.services.bitmaploader.background.e.e(m0Var.f223171b)});
            File[] fileArrListFiles = m0Var.f223184o.b().listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (!listListOf.contains(file)) {
                        org.apache.commons.io.k.C(file);
                    }
                }
            }
            subscriber.onCompleted();
        } catch (Throwable th2) {
            subscriber.onError(new Exception(th2));
        }
    }

    private final Observable<Void> m(final id.a aVar, final String str) {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.modules.user.user.l0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                m0.n(this.f223164a, aVar, str, (Subscriber) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(m0 m0Var, id.a aVar, String str, Subscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            String strB = m0Var.f223173d.b();
            if (m0Var.f223173d.f(strB) && aVar == null) {
                subscriber.onError(new Exception("No data to delete"));
                return;
            }
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.planner5d.library.model.manager.crashreporting.n.a.f191217d, strB);
            if (aVar != null) {
                jSONObject.put("user_id", aVar.f287075a);
                if (Intrinsics.areEqual(aVar.f287086l, Boolean.TRUE)) {
                    jSONObject.put("user_password", str);
                }
            }
            Object objJ = m0Var.f223170a.j(aVar, new Function2() { // from class: com.planner5d.library.modules.user.user.k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m0.o(jSONObject, (com.planner5d.library.api.b) obj, (id.a) obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(objJ, "requestBlocking(...)");
            com.planner5d.library.api.c cVar = (com.planner5d.library.api.c) objJ;
            if (!cVar.h()) {
                subscriber.onCompleted();
                return;
            }
            subscriber.onError(new Exception(cVar.c() + ": " + cVar.f()));
        } catch (Throwable th2) {
            subscriber.onError(th2 instanceof Exception ? th2 : new Exception(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.api.c o(JSONObject jSONObject, com.planner5d.library.api.b requestBlocking, id.a aVar) {
        Intrinsics.checkNotNullParameter(requestBlocking, "$this$requestBlocking");
        return requestBlocking.A(aVar, jSONObject);
    }

    private final Observable p() {
        int i10 = 6 << 0;
        return com.planner5d.library.services.utility.c0.F(com.planner5d.library.services.utility.c0.f225068a, null, new c(null), 1, null);
    }

    @NotNull
    public final Observable<Void> j(@NotNull Activity activity, @Nullable id.a aVar, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Observable<Void> observableConcat = Observable.concat(p(), m(aVar, str), this.f223172c.get().i0(), h(), k(activity));
        Intrinsics.checkNotNullExpressionValue(observableConcat, "concat(...)");
        return observableConcat;
    }
}
