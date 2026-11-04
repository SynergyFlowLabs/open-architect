package com.planner5d.library.model.manager.statistics.devtodev;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import androidx.annotation.b0;
import com.devtodev.analytics.external.DTDLogLevel;
import com.devtodev.analytics.external.DTDTrackingStatus;
import com.devtodev.analytics.external.analytics.DTDAnalytics;
import com.devtodev.analytics.external.analytics.DTDAnalyticsConfiguration;
import com.devtodev.analytics.external.analytics.DTDCustomEventParameters;
import com.devtodev.analytics.external.analytics.DTDIdentifiersListener;
import com.devtodev.analytics.external.people.DTDUserCard;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.planner5d.library.model.manager.e1;
import com.planner5d.library.model.manager.statistics.events.h3;
import com.planner5d.library.model.manager.statistics.g0;
import com.planner5d.library.model.manager.statistics.m;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.v2;
import io.sentry.k9;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l0;
import kotlinx.coroutines.b4;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nStatisticsBackendDevToDev.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsBackendDevToDev.kt\ncom/planner5d/library/model/manager/statistics/devtodev/StatisticsBackendDevToDev\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,289:1\n1#2:290\n243#3,7:291\n243#3,7:298\n243#3,7:305\n243#3,7:312\n*S KotlinDebug\n*F\n+ 1 StatisticsBackendDevToDev.kt\ncom/planner5d/library/model/manager/statistics/devtodev/StatisticsBackendDevToDev\n*L\n78#1:291,7\n79#1:298,7\n80#1:305,7\n81#1:312,7\n*E\n"})
public final class d implements m, com.planner5d.library.services.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f216590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f216591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.statistics.appsflyer.d> f216592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final u1 f216593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final e1 f216594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f1 f216595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final a f216596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f216597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f216598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f216599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private g0 f216600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Long f216601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private DTDIdentifiersListener f216602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final v2 f216603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final Object f216604o;

    public interface a {
        @Nullable
        String a();
    }

    public interface b {
        @NotNull
        g0 a();

        @NotNull
        List<String> b();
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.statistics.devtodev.StatisticsBackendDevToDev", f = "StatisticsBackendDevToDev.kt", i = {0, 1, 1, 2, 2, 2, 3, 3, 3, 3}, l = {290, 297, 304, 311}, m = "generateAttributionSuspend-IoAF18A", n = {"this", "this", "userId", "this", "userId", "deviceId", "this", "userId", "deviceId", "obfuscatedAccountId"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f216605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f216606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f216607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f216608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f216609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f216610f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f216612h;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f216610f = obj;
            this.f216612h |= Integer.MIN_VALUE;
            Object objZ = d.this.z(this);
            return objZ == kotlin.coroutines.intrinsics.b.l() ? objZ : Result.a(objZ);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.statistics.devtodev.d$d, reason: collision with other inner class name */
    public static final class C1625d implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f216613a;

        public C1625d(kotlin.coroutines.d dVar) {
            this.f216613a = dVar;
        }

        public final void c(String str) {
            kotlin.coroutines.d dVar = this.f216613a;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(str));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            c(str);
            return Unit.f312394a;
        }
    }

    public static final class e implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f216614a;

        public e(kotlin.coroutines.d dVar) {
            this.f216614a = dVar;
        }

        public final void c(String str) {
            kotlin.coroutines.d dVar = this.f216614a;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(str));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            c(str);
            return Unit.f312394a;
        }
    }

    public static final class f implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f216615a;

        public f(kotlin.coroutines.d dVar) {
            this.f216615a = dVar;
        }

        public final void c(String str) {
            kotlin.coroutines.d dVar = this.f216615a;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(str));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            c(str);
            return Unit.f312394a;
        }
    }

    public static final class g implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f216616a;

        public g(kotlin.coroutines.d dVar) {
            this.f216616a = dVar;
        }

        public final void c(String str) {
            kotlin.coroutines.d dVar = this.f216616a;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(str));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            c(str);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.statistics.devtodev.StatisticsBackendDevToDev$getDevToDevId$3", f = "StatisticsBackendDevToDev.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nStatisticsBackendDevToDev.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsBackendDevToDev.kt\ncom/planner5d/library/model/manager/statistics/devtodev/StatisticsBackendDevToDev$getDevToDevId$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n1#2:290\n*E\n"})
    static final class h extends o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f216617a;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Long l10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f216617a;
            if (i10 == 0) {
                ResultKt.m(obj);
                v2 v2Var = d.this.f216603n;
                this.f216617a = 1;
                if (v2Var.a(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Object obj2 = d.this.f216604o;
            d dVar = d.this;
            synchronized (obj2) {
                try {
                    l10 = dVar.f216601l;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return l10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class i implements DTDIdentifiersListener {
        i() {
        }

        @Override // com.devtodev.analytics.external.analytics.DTDIdentifiersListener
        public void didReceiveDevtodevId(long j10) {
            Object obj = d.this.f216604o;
            d dVar = d.this;
            synchronized (obj) {
                try {
                    g0 g0Var = dVar.f216600k;
                    if (Intrinsics.areEqual(g0Var != null ? g0Var.a() : null, dVar.f216591b.a().a())) {
                        dVar.f216601l = Long.valueOf(j10);
                        dVar.f216603n.b();
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.statistics.devtodev.StatisticsBackendDevToDev$onCreate$1", f = "StatisticsBackendDevToDev.kt", i = {}, l = {me.relex.circleindicator.a.f332619e}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nStatisticsBackendDevToDev.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsBackendDevToDev.kt\ncom/planner5d/library/model/manager/statistics/devtodev/StatisticsBackendDevToDev$onCreate$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n1#2:290\n*E\n"})
    static final class j extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f216620a;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object m(JSONObject jSONObject) {
            return jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new j(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objZ;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f216620a;
            if (i10 == 0) {
                ResultKt.m(obj);
                d dVar = d.this;
                this.f216620a = 1;
                objZ = dVar.z(this);
                if (objZ == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                objZ = ((Result) obj).j();
            }
            d dVar2 = d.this;
            Throwable thD = Result.d(objZ);
            if (thD != null) {
                dVar2.f216593d.b("init_installation", null, thD);
            }
            if (Result.m786isFailureimpl(objZ)) {
                objZ = null;
            }
            final JSONObject jSONObject = (JSONObject) objZ;
            if (jSONObject != null) {
                dVar2.f216594e.l("devtodev", new ij.c() { // from class: com.planner5d.library.model.manager.statistics.devtodev.e
                    @Override // ij.c
                    public final Object get() {
                        return d.j.m(jSONObject);
                    }
                });
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public d(@NotNull Application application, @NotNull b configuration, @NotNull fg.e<com.planner5d.library.model.manager.statistics.appsflyer.d> appsflyer, @NotNull u1 logRecordManager, @NotNull e1 installationManager, @NotNull f1 coroutineScope, @NotNull a callbacks) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(appsflyer, "appsflyer");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.f216590a = application;
        this.f216591b = configuration;
        this.f216592c = appsflyer;
        this.f216593d = logRecordManager;
        this.f216594e = installationManager;
        this.f216595f = coroutineScope;
        this.f216596g = callbacks;
        String string = application.getString(com.planner5d.library.model.manager.statistics.devtodev.b.r.R5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f216597h = string;
        this.f216599j = new Object();
        this.f216603n = new v2();
        this.f216604o = new Object();
    }

    private final void A() {
        try {
            synchronized (this.f216599j) {
                try {
                    if (this.f216598i) {
                        return;
                    }
                    DTDAnalyticsConfiguration dTDAnalyticsConfiguration = new DTDAnalyticsConfiguration();
                    dTDAnalyticsConfiguration.setLogLevel(DTDLogLevel.Error);
                    dTDAnalyticsConfiguration.setTrackingAvailability(DTDTrackingStatus.Enable);
                    DTDAnalytics.INSTANCE.initialize(this.f216597h, dTDAnalyticsConfiguration, this.f216590a);
                    this.f216598i = true;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            C(th3, k9.b.f305796c);
        }
    }

    @b0("devToDevIdLock")
    private final void B() {
        if (this.f216602m != null) {
            return;
        }
        i iVar = new i();
        DTDAnalytics.INSTANCE.setIdentifiersListener(iVar);
        this.f216602m = iVar;
    }

    private final void C(Throwable th2, String str) {
        this.f216593d.b("devtodev_" + str, null, th2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x001b, B:15:0x004a, B:14:0x002a), top: B:20:0x0005 }] */
    private final void D(g0.b bVar) {
        synchronized (this.f216604o) {
            try {
                g0 g0Var = this.f216600k;
                if (g0Var != null) {
                    Long lA = g0Var.a();
                    long jLongValue = bVar.a().longValue();
                    if (lA == null || lA.longValue() != jLongValue) {
                        this.f216600k = bVar;
                        this.f216603n.c();
                        DTDAnalytics.INSTANCE.setUserId(String.valueOf(bVar.a().longValue()));
                        B();
                    }
                } else {
                    this.f216600k = bVar;
                    this.f216603n.c();
                    DTDAnalytics.INSTANCE.setUserId(String.valueOf(bVar.a().longValue()));
                    B();
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void E() {
        DTDAnalytics.INSTANCE.isRestoreTransactionHistoryRequired(new Function1() { // from class: com.planner5d.library.model.manager.statistics.devtodev.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.F(this.f216589a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(d dVar, boolean z10) {
        if (z10) {
            DTDAnalytics.INSTANCE.subscriptionHistory(dVar.f216591b.b());
        }
        return Unit.f312394a;
    }

    private final void G(String str, com.planner5d.library.model.manager.statistics.j jVar) {
        DTDAnalytics dTDAnalytics = DTDAnalytics.INSTANCE;
        String strT = jVar.t();
        double dU = jVar.u();
        String strO = jVar.o();
        if (strO == null) {
            strO = com.planner5d.library.model.payments.a.f222474i;
        }
        dTDAnalytics.subscriptionPayment(str, dU, strO, strT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x0168  */
    /* JADX WARN: Code duplicated, block: B:51:0x016e  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d6 A[Catch: Exception -> 0x0257, TryCatch #3 {Exception -> 0x0257, blocks: (B:65:0x01c9, B:67:0x01d6, B:68:0x01f5, B:70:0x01fc, B:71:0x0221, B:73:0x0228, B:74:0x022f, B:76:0x0237, B:77:0x023e, B:79:0x0245, B:80:0x024e), top: B:92:0x01c9 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01fc A[Catch: Exception -> 0x0257, TryCatch #3 {Exception -> 0x0257, blocks: (B:65:0x01c9, B:67:0x01d6, B:68:0x01f5, B:70:0x01fc, B:71:0x0221, B:73:0x0228, B:74:0x022f, B:76:0x0237, B:77:0x023e, B:79:0x0245, B:80:0x024e), top: B:92:0x01c9 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0228 A[Catch: Exception -> 0x0257, TryCatch #3 {Exception -> 0x0257, blocks: (B:65:0x01c9, B:67:0x01d6, B:68:0x01f5, B:70:0x01fc, B:71:0x0221, B:73:0x0228, B:74:0x022f, B:76:0x0237, B:77:0x023e, B:79:0x0245, B:80:0x024e), top: B:92:0x01c9 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0237 A[Catch: Exception -> 0x0257, TryCatch #3 {Exception -> 0x0257, blocks: (B:65:0x01c9, B:67:0x01d6, B:68:0x01f5, B:70:0x01fc, B:71:0x0221, B:73:0x0228, B:74:0x022f, B:76:0x0237, B:77:0x023e, B:79:0x0245, B:80:0x024e), top: B:92:0x01c9 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0245 A[Catch: Exception -> 0x0257, TryCatch #3 {Exception -> 0x0257, blocks: (B:65:0x01c9, B:67:0x01d6, B:68:0x01f5, B:70:0x01fc, B:71:0x0221, B:73:0x0228, B:74:0x022f, B:76:0x0237, B:77:0x023e, B:79:0x0245, B:80:0x024e), top: B:92:0x01c9 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x01d6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01fc, please report this as an issue */
    public final Object z(kotlin.coroutines.d<? super Result<? extends JSONObject>> dVar) {
        c cVar;
        DTDAnalytics dTDAnalytics;
        kotlin.coroutines.j jVar;
        d dVar2;
        String str;
        String str2;
        kotlin.coroutines.j jVar2;
        Object objA;
        String str3;
        String str4;
        String str5;
        kotlin.coroutines.j jVar3;
        Object objA2;
        String str6;
        String str7;
        d dVar3;
        String str8;
        String str9;
        JSONObject jSONObject;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f216612h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f216612h = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objA3 = cVar.f216610f;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f216612h;
        try {
            if (i11 == 0) {
                ResultKt.m(objA3);
                c0 c0Var = c0.f225068a;
                DTDAnalytics dTDAnalytics2 = DTDAnalytics.INSTANCE;
                cVar.f216605a = this;
                cVar.f216606b = dTDAnalytics2;
                cVar.f216612h = 1;
                kotlin.coroutines.j jVar4 = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(cVar));
                try {
                    dTDAnalytics2.getUserId(new C1625d(jVar4));
                } catch (Exception e10) {
                    Result.a aVar = Result.Companion;
                    jVar4.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(e10)));
                }
                objA3 = jVar4.a();
                if (objA3 == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(cVar);
                }
                if (objA3 != objL) {
                }
                return objL;
            }
            if (i11 == 1) {
                this = (d) cVar.f216605a;
                ResultKt.m(objA3);
            } else {
                if (i11 == 2) {
                    str = (String) cVar.f216606b;
                    dVar2 = (d) cVar.f216605a;
                    ResultKt.m(objA3);
                    str2 = (String) objA3;
                    c0 c0Var2 = c0.f225068a;
                    DTDAnalytics dTDAnalytics3 = DTDAnalytics.INSTANCE;
                    cVar.f216605a = dVar2;
                    cVar.f216606b = str;
                    cVar.f216607c = str2;
                    cVar.f216608d = dTDAnalytics3;
                    cVar.f216612h = 3;
                    jVar2 = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(cVar));
                    try {
                        dTDAnalytics3.getObfuscatedAccountId(new f(jVar2));
                    } catch (Exception e11) {
                        Result.a aVar2 = Result.Companion;
                        jVar2.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(e11)));
                    }
                    objA = jVar2.a();
                    if (objA == kotlin.coroutines.intrinsics.b.l()) {
                        kotlin.coroutines.jvm.internal.h.c(cVar);
                    }
                    if (objA != objL) {
                        str3 = str;
                        str4 = str2;
                        objA3 = objA;
                        str5 = (String) objA3;
                        c0 c0Var3 = c0.f225068a;
                        DTDAnalytics dTDAnalytics4 = DTDAnalytics.INSTANCE;
                        cVar.f216605a = dVar2;
                        cVar.f216606b = str3;
                        cVar.f216607c = str4;
                        cVar.f216608d = str5;
                        cVar.f216609e = dTDAnalytics4;
                        cVar.f216612h = 4;
                        jVar3 = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(cVar));
                        dTDAnalytics4.getSdkVersion(new g(jVar3));
                        objA2 = jVar3.a();
                        if (objA2 == kotlin.coroutines.intrinsics.b.l()) {
                            kotlin.coroutines.jvm.internal.h.c(cVar);
                        }
                        if (objA2 != objL) {
                            str6 = str4;
                            str7 = str5;
                            dVar3 = dVar2;
                            objA3 = objA2;
                            str8 = str3;
                        }
                    }
                    return objL;
                }
                if (i11 == 3) {
                    str4 = (String) cVar.f216607c;
                    String str10 = (String) cVar.f216606b;
                    d dVar4 = (d) cVar.f216605a;
                    ResultKt.m(objA3);
                    str3 = str10;
                    dVar2 = dVar4;
                    str5 = (String) objA3;
                    c0 c0Var4 = c0.f225068a;
                    DTDAnalytics dTDAnalytics5 = DTDAnalytics.INSTANCE;
                    cVar.f216605a = dVar2;
                    cVar.f216606b = str3;
                    cVar.f216607c = str4;
                    cVar.f216608d = str5;
                    cVar.f216609e = dTDAnalytics5;
                    cVar.f216612h = 4;
                    jVar3 = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(cVar));
                    try {
                        dTDAnalytics5.getSdkVersion(new g(jVar3));
                    } catch (Exception e12) {
                        Result.a aVar3 = Result.Companion;
                        jVar3.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(e12)));
                    }
                    objA2 = jVar3.a();
                    if (objA2 == kotlin.coroutines.intrinsics.b.l()) {
                        kotlin.coroutines.jvm.internal.h.c(cVar);
                    }
                    if (objA2 != objL) {
                        str6 = str4;
                        str7 = str5;
                        dVar3 = dVar2;
                        objA3 = objA2;
                        str8 = str3;
                    }
                    return objL;
                }
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str7 = (String) cVar.f216608d;
                str6 = (String) cVar.f216607c;
                str8 = (String) cVar.f216606b;
                dVar3 = (d) cVar.f216605a;
                ResultKt.m(objA3);
            }
            str9 = (String) objA3;
            try {
                jSONObject = new JSONObject();
                if (str8.length() > 0) {
                    timber.log.b.f381052a.a("DTD userId " + str8, new Object[0]);
                    jSONObject.put("user_id", str8);
                }
                if (str6.length() > 0) {
                    timber.log.b.f381052a.a("DTD deviceId " + str6, new Object[0]);
                    jSONObject.put("device_id", str6);
                }
                if (str7.length() > 0) {
                    jSONObject.put("obfuscated_account_id", str7);
                }
                if (str9.length() > 0) {
                    jSONObject.put("sdk_version", str9);
                }
                if (jSONObject.length() > 0) {
                    jSONObject.put("app_key", dVar3.f216597h);
                }
                Result.a aVar4 = Result.Companion;
                return Result.m785constructorimpl(jSONObject);
            } catch (Exception e13) {
                Result.a aVar5 = Result.Companion;
                return Result.m785constructorimpl(ResultKt.createFailure(e13));
            }
            dTDAnalytics.getDeviceId(new e(jVar));
        } catch (Exception e14) {
            Result.a aVar6 = Result.Companion;
            jVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(e14)));
        }
        String str11 = (String) objA3;
        c0 c0Var5 = c0.f225068a;
        dTDAnalytics = DTDAnalytics.INSTANCE;
        cVar.f216605a = this;
        cVar.f216606b = str11;
        cVar.f216607c = dTDAnalytics;
        cVar.f216612h = 2;
        jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(cVar));
        Object objA4 = jVar.a();
        if (objA4 == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(cVar);
        }
        if (objA4 != objL) {
            dVar2 = this;
            str = str11;
            objA3 = objA4;
            str2 = (String) objA3;
            c0 c0Var6 = c0.f225068a;
            DTDAnalytics dTDAnalytics6 = DTDAnalytics.INSTANCE;
            cVar.f216605a = dVar2;
            cVar.f216606b = str;
            cVar.f216607c = str2;
            cVar.f216608d = dTDAnalytics6;
            cVar.f216612h = 3;
            jVar2 = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(cVar));
            dTDAnalytics6.getObfuscatedAccountId(new f(jVar2));
            objA = jVar2.a();
            if (objA == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(cVar);
            }
            if (objA != objL) {
                str3 = str;
                str4 = str2;
                objA3 = objA;
                str5 = (String) objA3;
                c0 c0Var7 = c0.f225068a;
                DTDAnalytics dTDAnalytics7 = DTDAnalytics.INSTANCE;
                cVar.f216605a = dVar2;
                cVar.f216606b = str3;
                cVar.f216607c = str4;
                cVar.f216608d = str5;
                cVar.f216609e = dTDAnalytics7;
                cVar.f216612h = 4;
                jVar3 = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(cVar));
                dTDAnalytics7.getSdkVersion(new g(jVar3));
                objA2 = jVar3.a();
                if (objA2 == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(cVar);
                }
                if (objA2 != objL) {
                    str6 = str4;
                    str7 = str5;
                    dVar3 = dVar2;
                    objA3 = objA2;
                    str8 = str3;
                    str9 = (String) objA3;
                    jSONObject = new JSONObject();
                    if (str8.length() > 0) {
                        timber.log.b.f381052a.a("DTD userId " + str8, new Object[0]);
                        jSONObject.put("user_id", str8);
                    }
                    if (str6.length() > 0) {
                        timber.log.b.f381052a.a("DTD deviceId " + str6, new Object[0]);
                        jSONObject.put("device_id", str6);
                    }
                    if (str7.length() > 0) {
                        jSONObject.put("obfuscated_account_id", str7);
                    }
                    if (str9.length() > 0) {
                        jSONObject.put("sdk_version", str9);
                    }
                    if (jSONObject.length() > 0) {
                        jSONObject.put("app_key", dVar3.f216597h);
                    }
                    Result.a aVar7 = Result.Companion;
                    return Result.m785constructorimpl(jSONObject);
                }
            }
        }
        return objL;
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void a() {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void b(@NotNull g0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        synchronized (this.f216599j) {
            try {
                g0.b bVar = user instanceof g0.b ? (g0.b) user : null;
                if (bVar != null) {
                    if (this.f216598i) {
                        D(bVar);
                        E();
                    }
                    try {
                        String strQ = this.f216592c.get().q();
                        if (strQ != null) {
                            DTDUserCard.INSTANCE.set("appsflyer_id", strQ);
                            Unit unit = Unit.f312394a;
                        }
                    } catch (Throwable th2) {
                        C(th2, "trackUserChangeAppsflyerId");
                        Unit unit2 = Unit.f312394a;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void c(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void d(@NotNull h3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            DTDAnalytics dTDAnalytics = DTDAnalytics.INSTANCE;
            String strN = event.b().n();
            DTDCustomEventParameters dTDCustomEventParameters = new DTDCustomEventParameters();
            for (String str : event.c().keySet()) {
                Object obj = event.c().get(str);
                if (obj instanceof Boolean) {
                    dTDCustomEventParameters.add(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    dTDCustomEventParameters.add(str, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    dTDCustomEventParameters.add(str, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    dTDCustomEventParameters.add(str, ((Number) obj).doubleValue());
                } else if (obj instanceof Float) {
                    dTDCustomEventParameters.add(str, ((Number) obj).floatValue());
                } else {
                    dTDCustomEventParameters.add(str, String.valueOf(obj));
                }
            }
            Unit unit = Unit.f312394a;
            dTDAnalytics.customEvent(strN, dTDCustomEventParameters);
        } catch (Throwable th2) {
            C(th2, "event_send");
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void e(@Nullable Activity activity) {
        DTDAnalytics.INSTANCE.setTrackingAvailability(false);
        DTDUserCard.INSTANCE.clearUser();
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void f(@Nullable Activity activity) {
        A();
        try {
            k.f(this.f216595f, null, null, new j(null), 3, null);
            E();
            String strA = this.f216596g.a();
            if (strA != null) {
                DTDUserCard.INSTANCE.set("ad_id", strA);
            }
        } catch (Throwable th2) {
            C(th2, k9.b.f305796c);
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void g(@Nullable Activity activity, @NotNull com.planner5d.library.model.manager.statistics.j purchase, @NotNull String paymentMethod, @NotNull String placement) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(placement, "placement");
        String strQ = purchase.q();
        if (strQ == null) {
            return;
        }
        try {
            if (purchase.x()) {
                G(strQ, purchase);
                return;
            }
            DTDAnalytics dTDAnalytics = DTDAnalytics.INSTANCE;
            double dU = purchase.u();
            String strP = purchase.p();
            if (strP == null) {
                strP = AbstractJsonLexerKt.NULL;
            }
            dTDAnalytics.realCurrencyPayment(strQ, dU, strP, purchase.t());
        } catch (Throwable th2) {
            C(th2, FirebaseAnalytics.c.D);
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void h(@NotNull String screenName) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void i(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public boolean isEnabled() {
        return this.f216597h.length() > 0;
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void k(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.planner5d.library.services.i
    @Nullable
    public Object l(@NotNull kotlin.coroutines.d<? super Long> dVar) {
        boolean z10;
        synchronized (this.f216604o) {
            try {
                z10 = this.f216600k == null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return null;
        }
        return b4.e(TimeUnit.SECONDS.toMillis(3L), new h(null), dVar);
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void m() {
    }

    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Object x() {
        throw new l0("Use generateAttributionSuspend instead");
    }
}
