package io.intercom.android.sdk;

import android.app.Application;
import androidx.compose.runtime.internal.w0;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.ApiFactory;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.api.TaggingSocketFactory;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.utilities.NexusClientUtilsKt;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AppIdentityInjector {
    private static final int NEXUS_TRAFFIC_TAG = 63987;

    @NotNull
    private final kotlin.f0 ablyManager$delegate;

    @NotNull
    private final kotlin.f0 api$delegate;

    @NotNull
    private final kotlin.f0 appIdentity$delegate;

    @NotNull
    private final s0 appIdentityScope;

    @NotNull
    private final kotlin.f0 configurableHttpClient$delegate;

    @NotNull
    private final kotlin.f0 externalUploadApi$delegate;

    @NotNull
    private final kotlin.f0 gsonWithAdapters$delegate;

    @NotNull
    private final kotlin.f0 helpCenterApi$delegate;

    @NotNull
    private final kotlin.f0 hostname$delegate;

    @NotNull
    private final kotlin.f0 httpClientWithoutHeaders$delegate;

    @NotNull
    private final kotlin.f0 kotlinXRetrofit$delegate;

    @NotNull
    private final kotlin.f0 legacyRetrofit$delegate;

    @NotNull
    private final kotlin.f0 messengerApi$delegate;

    @NotNull
    private final kotlin.f0 nexusClient$delegate;
    private final long nexusDebouncePeriod;

    @NotNull
    private final kotlin.f0 retrofitWithoutHeaders$delegate;

    @NotNull
    private final kotlin.f0 surveyApi$delegate;

    @NotNull
    private final kotlin.f0 ticketApi$delegate;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.AppIdentityInjector$initializeEvents$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.AppIdentityInjector$initializeEvents$1", f = "AppIdentityInjector.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return AppIdentityInjector.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                IntercomDataLayer dataLayer = AppIdentityInjector.this.getInjector().getDataLayer();
                Intrinsics.checkNotNullExpressionValue(dataLayer, "getDataLayer(...)");
                NexusClient nexusClient = AppIdentityInjector.this.getNexusClient();
                Intrinsics.checkNotNull(nexusClient, "null cannot be cast to non-null type io.intercom.android.sdk.NexusWrapper");
                this.label = 1;
                if (NexusClientUtilsKt.handleNexusClientLifecycle(dataLayer, (NexusWrapper) nexusClient, this) == objL) {
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
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public AppIdentityInjector(@NotNull final Application application, @NotNull final String apiKey, @NotNull final String appId, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.appIdentityScope = t0.a(q3.c(null, 1, null));
        this.appIdentity$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.appIdentity_delegate$lambda$0(apiKey, appId, application);
            }
        });
        this.configurableHttpClient$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.configurableHttpClient_delegate$lambda$1(application, this);
            }
        });
        this.httpClientWithoutHeaders$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.httpClientWithoutHeaders_delegate$lambda$2(application);
            }
        });
        this.hostname$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.hostname_delegate$lambda$3(str, this, application);
            }
        });
        this.gsonWithAdapters$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.gsonWithAdapters_delegate$lambda$4();
            }
        });
        this.kotlinXRetrofit$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.kotlinXRetrofit_delegate$lambda$5(this.f291621a);
            }
        });
        this.legacyRetrofit$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.legacyRetrofit_delegate$lambda$6(this.f291622a);
            }
        });
        this.retrofitWithoutHeaders$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.retrofitWithoutHeaders_delegate$lambda$7(this.f291623a);
            }
        });
        this.api$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.api_delegate$lambda$8(application, this);
            }
        });
        this.helpCenterApi$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.helpCenterApi_delegate$lambda$9(this.f291626a);
            }
        });
        this.surveyApi$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.surveyApi_delegate$lambda$10(this.f293131a);
            }
        });
        this.ticketApi$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.ticketApi_delegate$lambda$11(this.f293132a);
            }
        });
        this.externalUploadApi$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.externalUploadApi_delegate$lambda$12(this.f293148a);
            }
        });
        this.messengerApi$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.messengerApi_delegate$lambda$13(this.f293165a);
            }
        });
        this.nexusClient$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.nexusClient_delegate$lambda$14(this.f293166a);
            }
        });
        this.ablyManager$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppIdentityInjector.ablyManager_delegate$lambda$15(this.f293725a);
            }
        });
        this.nexusDebouncePeriod = TimeUnit.SECONDS.toMillis(1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AblyManager ablyManager_delegate$lambda$15(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Twig ablyTwig = LumberMill.getAblyTwig();
        Intrinsics.checkNotNullExpressionValue(ablyTwig, "getAblyTwig(...)");
        return new AblyManager(ablyTwig, this$0.getMessengerApi());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Api api_delegate$lambda$8(Application application, AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(application, "$application");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ApiFactory apiFactory = ApiFactory.INSTANCE;
        AppIdentity appIdentity = this$0.getAppIdentity();
        UserIdentity userIdentity = this$0.getInjector().getUserIdentity();
        Intrinsics.checkNotNullExpressionValue(userIdentity, "getUserIdentity(...)");
        Provider<AppConfig> appConfigProvider = this$0.getInjector().getAppConfigProvider();
        Intrinsics.checkNotNullExpressionValue(appConfigProvider, "getAppConfigProvider(...)");
        OpsMetricTracker opsMetricTracker = this$0.getInjector().getOpsMetricTracker();
        Intrinsics.checkNotNullExpressionValue(opsMetricTracker, "getOpsMetricTracker(...)");
        IntercomDataLayer dataLayer = this$0.getInjector().getDataLayer();
        Intrinsics.checkNotNullExpressionValue(dataLayer, "getDataLayer(...)");
        UnreadConversationsTracker unreadConversationsTracker = this$0.getInjector().getUnreadConversationsTracker();
        Intrinsics.checkNotNullExpressionValue(unreadConversationsTracker, "getUnreadConversationsTracker(...)");
        Api apiCreateApi = apiFactory.createApi(application, appIdentity, userIdentity, appConfigProvider, opsMetricTracker, dataLayer, unreadConversationsTracker, this$0.getConfigurableHttpClient(), this$0.getMessengerApi());
        apiCreateApi.updateMaxRequests();
        return apiCreateApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppIdentity appIdentity_delegate$lambda$0(String apiKey, String appId, Application application) {
        Intrinsics.checkNotNullParameter(apiKey, "$apiKey");
        Intrinsics.checkNotNullParameter(appId, "$appId");
        Intrinsics.checkNotNullParameter(application, "$application");
        AppIdentity appIdentityCreate = AppIdentity.create(apiKey, appId);
        appIdentityCreate.persist(application);
        return appIdentityCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okhttp3.b0 configurableHttpClient_delegate$lambda$1(Application application, AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(application, "$application");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ApiFactory apiFactory = ApiFactory.INSTANCE;
        AppIdentity appIdentity = this$0.getAppIdentity();
        UserIdentity userIdentity = this$0.getInjector().getUserIdentity();
        Intrinsics.checkNotNullExpressionValue(userIdentity, "getUserIdentity(...)");
        return apiFactory.createConfigurableHttpClient(application, appIdentity, userIdentity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExternalUploadApi externalUploadApi_delegate$lambda$12(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ApiFactory.INSTANCE.getUploadApi(this$0.getRetrofitWithoutHeaders());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Injector getInjector() {
        Injector injector = Injector.get();
        Intrinsics.checkNotNullExpressionValue(injector, "get(...)");
        return injector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.gson.f gsonWithAdapters_delegate$lambda$4() {
        return ApiFactory.INSTANCE.createGsonWithAdapters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HelpCenterApi helpCenterApi_delegate$lambda$9(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ApiFactory.INSTANCE.createHelpCenterApi(this$0.getKotlinXRetrofit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hostname_delegate$lambda$3(String str, AppIdentityInjector this$0, Application application) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(application, "$application");
        if (str == null) {
            str = ApiFactory.INSTANCE.getServerUrl(this$0.getAppIdentity(), application);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okhttp3.b0 httpClientWithoutHeaders_delegate$lambda$2(Application application) {
        Intrinsics.checkNotNullParameter(application, "$application");
        return ApiFactory.INSTANCE.createHttpClientWithoutHeaders(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Retrofit kotlinXRetrofit_delegate$lambda$5(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ApiFactory.INSTANCE.createKotlinXRetrofit(this$0.getHostname(), this$0.getConfigurableHttpClient());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Retrofit legacyRetrofit_delegate$lambda$6(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ApiFactory.INSTANCE.createLegacyRetrofit(this$0.getHostname(), this$0.getConfigurableHttpClient(), this$0.getGsonWithAdapters());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessengerApi messengerApi_delegate$lambda$13(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ApiFactory.INSTANCE.createMessengerApi(this$0.getLegacyRetrofit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NexusWrapper nexusClient_delegate$lambda$14(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        okhttp3.b0 b0VarF = NexusClient.defaultOkHttpClientBuilder().O0(new TaggingSocketFactory(SocketFactory.getDefault(), NEXUS_TRAFFIC_TAG)).f();
        Twig nexusTwig = LumberMill.getNexusTwig();
        Intrinsics.checkNotNullExpressionValue(nexusTwig, "getNexusTwig(...)");
        Api api = this$0.getApi();
        long j10 = this$0.nexusDebouncePeriod;
        IntercomDataLayer dataLayer = this$0.getInjector().getDataLayer();
        Intrinsics.checkNotNullExpressionValue(dataLayer, "getDataLayer(...)");
        return new NexusWrapper(nexusTwig, b0VarF, api, j10, dataLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Retrofit retrofitWithoutHeaders_delegate$lambda$7(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ApiFactory apiFactory = ApiFactory.INSTANCE;
        String hostname = this$0.getHostname();
        okhttp3.b0 httpClientWithoutHeaders = this$0.getHttpClientWithoutHeaders();
        com.google.gson.f gson = this$0.getInjector().getGson();
        Intrinsics.checkNotNullExpressionValue(gson, "getGson(...)");
        return apiFactory.createLegacyRetrofit(hostname, httpClientWithoutHeaders, gson);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyApi surveyApi_delegate$lambda$10(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ApiFactory.INSTANCE.createSurveyApi(this$0.getLegacyRetrofit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TicketApi ticketApi_delegate$lambda$11(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ApiFactory.INSTANCE.createTicketApi(this$0.getLegacyRetrofit());
    }

    public final void destroy() {
        t0.f(this.appIdentityScope, null, 1, null);
    }

    @NotNull
    public final AblyManager getAblyManager() {
        return (AblyManager) this.ablyManager$delegate.getValue();
    }

    @NotNull
    public final Api getApi() {
        return (Api) this.api$delegate.getValue();
    }

    @NotNull
    public final AppIdentity getAppIdentity() {
        Object value = this.appIdentity$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AppIdentity) value;
    }

    @NotNull
    public final okhttp3.b0 getConfigurableHttpClient() {
        return (okhttp3.b0) this.configurableHttpClient$delegate.getValue();
    }

    @NotNull
    public final ExternalUploadApi getExternalUploadApi() {
        return (ExternalUploadApi) this.externalUploadApi$delegate.getValue();
    }

    @NotNull
    public final com.google.gson.f getGsonWithAdapters() {
        return (com.google.gson.f) this.gsonWithAdapters$delegate.getValue();
    }

    @NotNull
    public final HelpCenterApi getHelpCenterApi() {
        return (HelpCenterApi) this.helpCenterApi$delegate.getValue();
    }

    @NotNull
    public final String getHostname() {
        return (String) this.hostname$delegate.getValue();
    }

    @NotNull
    public final okhttp3.b0 getHttpClientWithoutHeaders() {
        return (okhttp3.b0) this.httpClientWithoutHeaders$delegate.getValue();
    }

    @NotNull
    public final Retrofit getKotlinXRetrofit() {
        return (Retrofit) this.kotlinXRetrofit$delegate.getValue();
    }

    @NotNull
    public final Retrofit getLegacyRetrofit() {
        return (Retrofit) this.legacyRetrofit$delegate.getValue();
    }

    @NotNull
    public final MessengerApi getMessengerApi() {
        return (MessengerApi) this.messengerApi$delegate.getValue();
    }

    @NotNull
    public final NexusClient getNexusClient() {
        return (NexusClient) this.nexusClient$delegate.getValue();
    }

    @NotNull
    public final Retrofit getRetrofitWithoutHeaders() {
        return (Retrofit) this.retrofitWithoutHeaders$delegate.getValue();
    }

    @NotNull
    public final SurveyApi getSurveyApi() {
        return (SurveyApi) this.surveyApi$delegate.getValue();
    }

    @NotNull
    public final TicketApi getTicketApi() {
        return (TicketApi) this.ticketApi$delegate.getValue();
    }

    public final void initializeEvents() {
        kotlinx.coroutines.k.f(this.appIdentityScope, null, null, new AnonymousClass1(null), 3, null);
    }

    public /* synthetic */ AppIdentityInjector(Application application, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, str, str2, (i10 & 8) != 0 ? null : str3);
    }
}
