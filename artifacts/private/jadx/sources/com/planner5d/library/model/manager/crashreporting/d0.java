package com.planner5d.library.model.manager.crashreporting;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.c1;
import com.planner5d.library.model.manager.x1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.g2;
import io.sentry.g1;
import io.sentry.n0;
import io.sentry.n8;
import io.sentry.o7;
import io.sentry.protocol.g0;
import io.sentry.s4;
import io.sentry.t5;
import io.sentry.v4;
import io.sentry.y7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nSentryCrashReportingBackend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentryCrashReportingBackend.kt\ncom/planner5d/library/model/manager/crashreporting/SentryCrashReportingBackend\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,179:1\n1#2:180\n216#3,2:181\n216#3,2:183\n*S KotlinDebug\n*F\n+ 1 SentryCrashReportingBackend.kt\ncom/planner5d/library/model/manager/crashreporting/SentryCrashReportingBackend\n*L\n72#1:181,2\n153#1:183,2\n*E\n"})
public final class d0 implements x1, n, com.planner5d.library.model.manager.k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final a f191164l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f191165m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final double f191166n = 1.0E-4d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f191167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f191168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<c1> f191169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.t> f191170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.performancetracing.e f191171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final ad.b f191172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final g0 f191173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private Map<String, String> f191174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f191175k;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.crashreporting.SentryCrashReportingBackend$initialize$2", f = "SentryCrashReportingBackend.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191176a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d0.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f191176a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            d0.this.f191173i.s(String.valueOf(((com.planner5d.library.modules.user.user.t) d0.this.f191170f.get()).e()));
            d0 d0Var = d0.this;
            d0Var.v(((c1) d0Var.f191169e.get()).b());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public d0(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull fg.e<c1> installationManager, @NotNull fg.e<com.planner5d.library.modules.user.user.t> userAuthorization, @NotNull com.planner5d.library.model.manager.performancetracing.e performanceTracing, @NotNull ad.b loggingMiddleware) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(performanceTracing, "performanceTracing");
        Intrinsics.checkNotNullParameter(loggingMiddleware, "loggingMiddleware");
        this.f191167c = application;
        this.f191168d = builtInDataManager;
        this.f191169e = installationManager;
        this.f191170f = userAuthorization;
        this.f191171g = performanceTracing;
        this.f191172h = loggingMiddleware;
        this.f191173i = new g0();
        this.f191174j = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(String str, g1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.a(n.a.f191217d, str);
    }

    private final void t(Throwable th2, String str, String str2) {
        StringBuilder sb2;
        o7 o7Var = new o7(th2);
        if (str != null) {
            o7Var.L0(CollectionsKt.listOf(str));
            sb2 = new StringBuilder(str);
        } else {
            sb2 = null;
        }
        if (str2 != null) {
            if (sb2 != null) {
                sb2.append("\n" + str2);
            } else {
                sb2 = new StringBuilder(str2);
            }
        }
        if (sb2 != null) {
            io.sentry.protocol.k kVar = new io.sentry.protocol.k();
            kVar.h(sb2.toString());
            o7Var.O0(kVar);
        }
        t5.n(o7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(SentryAndroidOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        options.setEnabled(false);
        options.setAnrEnabled(false);
        options.setTracesSampleRate(null);
        options.setTracesSampler(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(final String str) {
        if (this.f191175k) {
            return;
        }
        g2.h(this.f191167c.getApplicationContext(), new t5.a() { // from class: com.planner5d.library.model.manager.crashreporting.c0
            @Override // io.sentry.t5.a
            public final void a(n8 n8Var) {
                d0.w(this.f191161a, str, (SentryAndroidOptions) n8Var);
            }
        });
        t5.I0(this.f191173i);
        this.f191171g.g(new com.planner5d.library.model.manager.performancetracing.sentry.c());
        this.f191175k = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(d0 d0Var, String str, SentryAndroidOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        options.setDsn(androidx.core.content.d.r(d0Var.f191167c, com.planner5d.library.f.s.lB));
        options.setEnabled(true);
        options.setAnrEnabled(true);
        options.setTag(n.a.f191216c, d0Var.f191168d.Q(com.planner5d.library.model.manager.builtin.i.a.Active));
        options.setTag(n.a.f191217d, str);
        for (Map.Entry<String, String> entry : d0Var.f191174j.entrySet()) {
            options.setTag(entry.getKey(), entry.getValue());
        }
        options.setBeforeSend(new n8.d() { // from class: com.planner5d.library.model.manager.crashreporting.z
            @Override // io.sentry.n8.d
            public final o7 a(o7 o7Var, n0 n0Var) {
                return d0.x(o7Var, n0Var);
            }
        });
        d0Var.f191172h.apply(options);
        options.setTracesSampler(new n8.n() { // from class: com.planner5d.library.model.manager.crashreporting.a0
            @Override // io.sentry.n8.n
            public final Double a(s4 s4Var) {
                return d0.y(s4Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o7 x(o7 event, n0 n0Var) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(n0Var, "<unused var>");
        if (y7.DEBUG == event.y0()) {
            timber.log.b.f381052a.d("Sentry event: " + event, new Object[0]);
            event = null;
        }
        return event;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double y(s4 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(f191166n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(d0 d0Var, g1 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        for (Map.Entry<String, String> entry : d0Var.f191174j.entrySet()) {
            scope.a(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.planner5d.library.model.manager.crashreporting.n
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new b(null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.crashreporting.n, com.planner5d.library.model.manager.k
    @androidx.annotation.d
    public void b(@NotNull Throwable throwable, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        t(throwable, str, str2);
    }

    @Override // com.planner5d.library.model.manager.crashreporting.n, com.planner5d.library.model.manager.k
    @androidx.annotation.d
    public void c(@Nullable String str, @Nullable String str2) {
        if (str == null && str2 == null) {
            return;
        }
        t(null, str, str2);
    }

    @Override // com.planner5d.library.model.manager.crashreporting.n
    @androidx.annotation.d
    public void clear() {
        t5.I0(null);
        g2.h(this.f191167c.getApplicationContext(), new t5.a() { // from class: com.planner5d.library.model.manager.crashreporting.y
            @Override // io.sentry.t5.a
            public final void a(n8 n8Var) {
                d0.u((SentryAndroidOptions) n8Var);
            }
        });
        this.f191174j.clear();
        this.f191171g.i(com.planner5d.library.model.manager.performancetracing.sentry.c.class);
        this.f191175k = false;
    }

    @Override // com.planner5d.library.model.manager.k
    @androidx.annotation.d
    public void d(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f191174j.put(key, value);
        t5.F(new v4() { // from class: com.planner5d.library.model.manager.crashreporting.b0
            @Override // io.sentry.v4
            public final void a(g1 g1Var) {
                d0.z(this.f191159a, g1Var);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.k
    @androidx.annotation.d
    public void f(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        b(throwable, null, null);
    }

    @Override // com.planner5d.library.model.manager.crashreporting.n
    @androidx.annotation.d
    public void h(@NotNull final String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        t5.F(new v4() { // from class: com.planner5d.library.model.manager.crashreporting.x
            @Override // io.sentry.v4
            public final void a(g1 g1Var) {
                d0.A(hash, g1Var);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.crashreporting.n
    @androidx.annotation.d
    public void setUserId(long j10) {
        this.f191173i.s(String.valueOf(j10));
        t5.I0(this.f191173i);
    }
}
