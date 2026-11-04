package com.planner5d.library.model.manager.statistics.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.api.PurchaseClient;
import com.appsflyer.api.Store;
import com.appsflyer.internal.models.InAppPurchaseValidationResult;
import com.appsflyer.internal.models.SubscriptionValidationResult;
import com.planner5d.library.model.manager.e1;
import com.planner5d.library.model.manager.statistics.events.h3;
import com.planner5d.library.model.manager.statistics.events.u3;
import com.planner5d.library.model.manager.statistics.g0;
import com.planner5d.library.model.manager.statistics.j;
import com.planner5d.library.model.manager.statistics.m;
import com.planner5d.library.model.manager.u1;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nStatisticsBackendAppsflyer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsBackendAppsflyer.kt\ncom/planner5d/library/model/manager/statistics/appsflyer/StatisticsBackendAppsflyer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,288:1\n1#2:289\n13409#3,2:290\n*S KotlinDebug\n*F\n+ 1 StatisticsBackendAppsflyer.kt\ncom/planner5d/library/model/manager/statistics/appsflyer/StatisticsBackendAppsflyer\n*L\n166#1:290,2\n*E\n"})
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f202878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.view.vote.a f202879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final e1 f202880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final u1 f202881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f202882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f202883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f202884g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f202885a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f202886b = "order_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f202887c = "price";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f202888d = "currency";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f202889e = "placement";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f202890f = "product_id";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f202891g = "quantity";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final String f202892h = "ab_test";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final String f202893i = "segment";

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f202894a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f202895b = "cw_subscribe";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f202896c = "cw_nrc_purchase";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f202897d = "cw_segment";

        private b() {
        }
    }

    public static final class c implements PurchaseClient.SubscriptionPurchaseValidationResultListener {
        c() {
        }

        @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Map<String, SubscriptionValidationResult> map) {
        }

        @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
        public void onFailure(String result, Throwable th2) {
            Intrinsics.checkNotNullParameter(result, "result");
            d.this.f202881d.b("validate_subscription_error", "[PurchaseConnector]: Subscriptions Validation fail: " + result, th2);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.statistics.appsflyer.d$d, reason: collision with other inner class name */
    public static final class C1621d implements PurchaseClient.InAppPurchaseValidationResultListener {
        C1621d() {
        }

        @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Map<String, InAppPurchaseValidationResult> map) {
        }

        @Override // com.appsflyer.api.PurchaseClient.ValidationResultListener
        public void onFailure(String result, Throwable th2) {
            Intrinsics.checkNotNullParameter(result, "result");
            d.this.f202881d.b("validate_in_app_purchase_error", "[PurchaseConnector]: In App Purchase Validation fail: " + result, th2);
        }
    }

    public static final class e implements AppsFlyerConversionListener {
        e() {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onAppOpenAttribution(Map<String, String> map) {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onAttributionFailure(String str) {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onConversionDataFail(String str) {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onConversionDataSuccess(Map<String, Object> map) {
        }
    }

    public d(@NotNull Application application, @NotNull com.planner5d.library.contest.view.vote.a deepLinkResultHandler, @NotNull e1 installationManager, @NotNull u1 logRecordManagerService) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(deepLinkResultHandler, "deepLinkResultHandler");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(logRecordManagerService, "logRecordManagerService");
        this.f202878a = application;
        this.f202879b = deepLinkResultHandler;
        this.f202880c = installationManager;
        this.f202881d = logRecordManagerService;
        String string = application.getString(com.planner5d.library.model.manager.statistics.appsflyer.b.r.f201593z1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f202882e = string;
        this.f202884g = new Object();
    }

    private final String r() {
        if (isEnabled()) {
            return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        }
        return null;
    }

    private final void s() {
        new PurchaseClient.Builder(this.f202878a, Store.GOOGLE).logSubscriptions(true).autoLogInApps(true).setSubscriptionValidationResultListener(new c()).setInAppValidationResultListener(new C1621d()).build().startObservingTransactions();
    }

    private final void t() {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        appsFlyerLib.init(this.f202882e, new e(), this.f202878a);
        appsFlyerLib.waitForCustomerUserId(true);
        appsFlyerLib.setCustomerIdAndLogSession(this.f202880c.i(), this.f202878a);
        appsFlyerLib.subscribeForDeepLink(this.f202879b);
        appsFlyerLib.start(this.f202878a);
        this.f202880c.l("appsflyer", new ij.c() { // from class: com.planner5d.library.model.manager.statistics.appsflyer.c
            @Override // ij.c
            public final Object get() {
                return d.u(this.f202877a);
            }
        });
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object u(d dVar) {
        Object objO = dVar.o();
        if (Result.m786isFailureimpl(objO)) {
            return null;
        }
        return objO;
    }

    private final void v(Intent intent) {
        if (intent != null) {
            if (intent.getData() == null || !Intrinsics.areEqual(intent.getAction(), "android.intent.action.VIEW")) {
                intent = null;
            }
            if (intent != null) {
                this.f202879b.c();
                AppsFlyerLib.getInstance().performOnDeepLinking(intent, this.f202878a);
            }
        }
    }

    private final void w(AppsFlyerLib appsFlyerLib, String str, j jVar, String str2) {
        Application application = this.f202878a;
        String str3 = jVar.x() ? b.f202895b : b.f202896c;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(a.f202886b, str), TuplesKt.to("price", new BigDecimal(String.valueOf(jVar.u())).stripTrailingZeros().toPlainString()), TuplesKt.to("currency", jVar.t()), TuplesKt.to("placement", str2), TuplesKt.to(a.f202890f, String.valueOf(jVar.p())));
        if (!jVar.x()) {
            mapMutableMapOf.put("quantity", 1);
        }
        Unit unit = Unit.f312394a;
        appsFlyerLib.logEvent(application, str3, mapMutableMapOf);
    }

    private final void x(AppsFlyerLib appsFlyerLib, String str, j jVar) {
        Application application = this.f202878a;
        Pair pair = TuplesKt.to(AFInAppEventParameterName.RECEIPT_ID, str);
        String strP = jVar.p();
        if (strP == null) {
            strP = com.planner5d.library.model.payments.a.f222474i;
        }
        appsFlyerLib.logEvent(application, AFInAppEventType.PURCHASE, MapsKt.mutableMapOf(pair, TuplesKt.to(AFInAppEventParameterName.CONTENT_ID, strP), TuplesKt.to(AFInAppEventParameterName.REVENUE, Float.valueOf((float) jVar.u())), TuplesKt.to(AFInAppEventParameterName.CURRENCY, jVar.t()), TuplesKt.to(AFInAppEventParameterName.QUANTITY, 1)));
        if (jVar.z() || jVar.y()) {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(AFInAppEventParameterName.REVENUE, Float.valueOf((float) jVar.u())), TuplesKt.to(AFInAppEventParameterName.CURRENCY, jVar.t()));
            appsFlyerLib.logEvent(this.f202878a, AFInAppEventType.SUBSCRIBE, mapMutableMapOf);
            if (jVar.z()) {
                appsFlyerLib.logEvent(this.f202878a, "af_subscribe_partner_yearly", mapMutableMapOf);
            }
            if (jVar.y()) {
                appsFlyerLib.logEvent(this.f202878a, "af_subscribe_partner_monthly", mapMutableMapOf);
            }
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void a() {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void b(@NotNull g0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        synchronized (this.f202884g) {
            try {
                Long lA = user.a();
                String string = lA != null ? lA.toString() : null;
                if (this.f202883f && !Intrinsics.areEqual(string, r())) {
                    AppsFlyerLib.getInstance().setCustomerIdAndLogSession(string, this.f202878a);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void c(@Nullable Intent intent) {
        v(intent);
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void d(@NotNull h3 event) {
        Object obj;
        Intrinsics.checkNotNullParameter(event, "event");
        com.planner5d.library.model.manager.statistics.events.a aVarB = event.b();
        com.planner5d.library.model.manager.statistics.events.a.InterfaceC1626a interfaceC1626a = aVarB instanceof com.planner5d.library.model.manager.statistics.events.a.InterfaceC1626a ? (com.planner5d.library.model.manager.statistics.events.a.InterfaceC1626a) aVarB : null;
        if (interfaceC1626a != null && interfaceC1626a.k()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : event.c().keySet()) {
                Object string = event.c().get(str);
                if (!(string instanceof Boolean)) {
                    if (string instanceof Integer) {
                        string = (Integer) string;
                        Intrinsics.checkNotNull(string);
                    } else if (string instanceof Long) {
                        string = Integer.valueOf((int) ((Number) string).longValue());
                    } else if (string instanceof Double) {
                        string = (Double) string;
                        Intrinsics.checkNotNull(string);
                    } else if (string instanceof Float) {
                        string = (Float) string;
                        Intrinsics.checkNotNull(string);
                    } else if (string == null || (string = string.toString()) == null) {
                        string = AbstractJsonLexerKt.NULL;
                    }
                }
                linkedHashMap.put(str, string);
            }
            if (event.b() == u3.f217522c4) {
                String[] strArr = {AFInAppEventParameterName.REVENUE, AFInAppEventParameterName.CURRENCY};
                for (int i10 = 0; i10 < 2; i10++) {
                    String str2 = strArr[i10];
                    Map<String, Object> mapA = event.a();
                    if (mapA != null && (obj = mapA.get(str2)) != null) {
                        linkedHashMap.put(str2, obj);
                    }
                }
            }
            AppsFlyerLib.getInstance().logEvent(this.f202878a, event.b().n(), linkedHashMap);
        }
        if (event.b() == u3.M3) {
            AppsFlyerLib.getInstance().logEvent(this.f202878a, b.f202897d, MapsKt.mapOf(TuplesKt.to(a.f202893i, event.c().get("group")), TuplesKt.to(a.f202892h, event.c().get("name"))));
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void e(@Nullable Activity activity) {
        synchronized (this.f202884g) {
            try {
                if (this.f202883f) {
                    AppsFlyerLib.getInstance().stop(true, this.f202878a);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void f(@Nullable Activity activity) {
        synchronized (this.f202884g) {
            try {
                if (!this.f202883f) {
                    t();
                    this.f202883f = true;
                }
                AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                if (appsFlyerLib.isStopped()) {
                    appsFlyerLib.stop(false, this.f202878a);
                }
                v(activity != null ? activity.getIntent() : null);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void g(@Nullable Activity activity, @NotNull j purchase, @NotNull String paymentMethod, @NotNull String placement) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(placement, "placement");
        String strQ = purchase.q();
        if (strQ != null) {
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            Intrinsics.checkNotNull(appsFlyerLib);
            x(appsFlyerLib, strQ, purchase);
            w(appsFlyerLib, strQ, purchase, placement);
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
        return this.f202882e.length() > 0;
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void k(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void m() {
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Object o() {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        try {
            Result.a aVar = Result.Companion;
            JSONObject jSONObject = new JSONObject();
            String appsFlyerUID = appsFlyerLib.getAppsFlyerUID(this.f202878a);
            if (appsFlyerUID != null) {
                jSONObject.put("id", appsFlyerUID);
            }
            if (jSONObject.length() <= 0) {
                jSONObject = null;
            }
            return Result.m785constructorimpl(jSONObject != null ? jSONObject.put("app_key", this.f202882e) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Nullable
    public final String q() {
        if (isEnabled()) {
            return AppsFlyerLib.getInstance().getAppsFlyerUID(this.f202878a);
        }
        return null;
    }
}
