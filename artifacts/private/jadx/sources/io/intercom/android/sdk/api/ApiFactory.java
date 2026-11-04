package io.intercom.android.sdk.api;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.l1;
import androidx.compose.runtime.internal.w0;
import com.google.gson.g;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseAdapterFactory;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.utilities.UtilsKt;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import io.intercom.android.sdk.utilities.gson.RuntimeTypeAdapterFactory;
import io.sentry.o8;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.b0;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class ApiFactory {
    public static final int $stable = 0;

    @NotNull
    private static final String CACHE_NAME = "Intercom_SDK/HttpCache";
    private static final int CACHE_SIZE = 10485760;

    @NotNull
    private static final String ENDPOINT = "/messenger/mobile/";

    @NotNull
    public static final ApiFactory INSTANCE = new ApiFactory();
    private static final int INTERCOM_TRAFFIC_TAG = 46837266;
    private static final int MAX_DNS_SEGMENT_SIZE = 63;

    @NotNull
    private static final String PARTIAL_HOSTNAME_AUS = ".mobile-messenger.au.intercom.io";

    @NotNull
    private static final String PARTIAL_HOSTNAME_EU = ".mobile-messenger.eu.intercom.io";

    @NotNull
    private static final String PARTIAL_HOSTNAME_US = ".mobile-messenger.intercom.com";

    @NotNull
    private static final String PROTOCOL = "https://";

    private ApiFactory() {
    }

    private final String getCorrectServerHostname(int i10, Context context) {
        if (i10 == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_aus)) {
            return PARTIAL_HOSTNAME_AUS;
        }
        if (i10 == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_eu)) {
            return PARTIAL_HOSTNAME_EU;
        }
        if (i10 == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_us) || i10 == 0) {
            LumberMill.getLogger().i("Defaulting to US region, since no explicit region was mentioned. For more info on regions, please visit Intercom Android SDK documentation", new Object[0]);
            return PARTIAL_HOSTNAME_US;
        }
        LumberMill.getLogger().e("Incorrect value for region is provided in AndroidManifest.xml file. Please use one of the available regions values from provided list. For more info on regions, please visit Intercom Android SDK documentation", new Object[0]);
        return "";
    }

    private final RuntimeTypeAdapterFactory<HomeCards> getHomeCardsAdapterFactory() {
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryOf = RuntimeTypeAdapterFactory.of(HomeCards.class, "type");
        Locale locale = Locale.ROOT;
        String lowerCase = "SPACES".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype = runtimeTypeAdapterFactoryOf.registerSubtype(HomeCards.HomeSpacesData.class, lowerCase);
        String lowerCase2 = "NEW_CONVERSATION".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype2 = runtimeTypeAdapterFactoryRegisterSubtype.registerSubtype(HomeCards.HomeNewConversationData.class, lowerCase2);
        String lowerCase3 = "RECENT_CONVERSATION".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype3 = runtimeTypeAdapterFactoryRegisterSubtype2.registerSubtype(HomeCards.HomeRecentConversationData.class, lowerCase3);
        String lowerCase4 = "HELP_CENTER".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype4 = runtimeTypeAdapterFactoryRegisterSubtype3.registerSubtype(HomeCards.HomeHelpCenterData.class, lowerCase4);
        String lowerCase5 = "EXTERNAL_LINKS".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype5 = runtimeTypeAdapterFactoryRegisterSubtype4.registerSubtype(HomeCards.HomeExternalLinkData.class, lowerCase5);
        String lowerCase6 = "MESSENGER_APP".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype6 = runtimeTypeAdapterFactoryRegisterSubtype5.registerSubtype(HomeCards.HomeMessengerAppData.class, lowerCase6);
        String lowerCase7 = "RECENT_TICKETS".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase7, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype7 = runtimeTypeAdapterFactoryRegisterSubtype6.registerSubtype(HomeCards.HomeRecentTicketsData.class, lowerCase7);
        String lowerCase8 = "TICKET_LINKS".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase8, "toLowerCase(...)");
        RuntimeTypeAdapterFactory<HomeCards> runtimeTypeAdapterFactoryRegisterIgnoredSubtype = runtimeTypeAdapterFactoryRegisterSubtype7.registerSubtype(HomeCards.HomeTicketLinksData.class, lowerCase8).registerIgnoredSubtype(HomeCards.UnSupported.class, "UnSupported");
        Intrinsics.checkNotNullExpressionValue(runtimeTypeAdapterFactoryRegisterIgnoredSubtype, "registerIgnoredSubtype(...)");
        return runtimeTypeAdapterFactoryRegisterIgnoredSubtype;
    }

    private final RuntimeTypeAdapterFactory<Ticket.TicketAttribute> getTicketTypeAdapterFactory() {
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryOf = RuntimeTypeAdapterFactory.of(Ticket.TicketAttribute.class, "type");
        Locale locale = Locale.ROOT;
        String lowerCase = "STRING".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype = runtimeTypeAdapterFactoryOf.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase);
        String lowerCase2 = "INTEGER".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype2 = runtimeTypeAdapterFactoryRegisterSubtype.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase2);
        String lowerCase3 = "FLOAT".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype3 = runtimeTypeAdapterFactoryRegisterSubtype2.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase3);
        String lowerCase4 = "BOOLEAN".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype4 = runtimeTypeAdapterFactoryRegisterSubtype3.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase4);
        String lowerCase5 = "LIST".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype5 = runtimeTypeAdapterFactoryRegisterSubtype4.registerSubtype(Ticket.TicketAttribute.ListAttribute.class, lowerCase5);
        String lowerCase6 = "DATETIME".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype6 = runtimeTypeAdapterFactoryRegisterSubtype5.registerSubtype(Ticket.TicketAttribute.DateTimeAttribute.class, lowerCase6);
        String lowerCase7 = "FILES".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase7, "toLowerCase(...)");
        RuntimeTypeAdapterFactory<Ticket.TicketAttribute> runtimeTypeAdapterFactoryRegisterIgnoredSubtype = runtimeTypeAdapterFactoryRegisterSubtype6.registerSubtype(Ticket.TicketAttribute.FilesAttribute.class, lowerCase7).registerIgnoredSubtype(Ticket.TicketAttribute.UnSupported.class, "UnSupported");
        Intrinsics.checkNotNullExpressionValue(runtimeTypeAdapterFactoryRegisterIgnoredSubtype, "registerIgnoredSubtype(...)");
        return runtimeTypeAdapterFactoryRegisterIgnoredSubtype;
    }

    @NotNull
    public final String convertHostnameToUrl(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return PROTOCOL + hostname + ENDPOINT;
    }

    @NotNull
    public final Api createApi(@NotNull Context context, @NotNull AppIdentity appIdentity, @NotNull UserIdentity userIdentity, @NotNull Provider<AppConfig> appConfigProvider, @NotNull OpsMetricTracker opsMetricTracker, @NotNull IntercomDataLayer dataLayer, @NotNull UnreadConversationsTracker unreadConversationsTracker, @NotNull b0 httpClient, @NotNull MessengerApi messengerApi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appIdentity, "appIdentity");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(appConfigProvider, "appConfigProvider");
        Intrinsics.checkNotNullParameter(opsMetricTracker, "opsMetricTracker");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(unreadConversationsTracker, "unreadConversationsTracker");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(messengerApi, "messengerApi");
        return new Api(context, appIdentity, userIdentity, httpClient, messengerApi, new CallbackHolder(dataLayer, userIdentity, unreadConversationsTracker), new RateLimiter(appConfigProvider.get()), appConfigProvider, opsMetricTracker, dataLayer);
    }

    @NotNull
    public final b0 createConfigurableHttpClient(@NotNull Context context, @NotNull AppIdentity appIdentity, @NotNull UserIdentity userIdentity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appIdentity, "appIdentity");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        b0.a aVar = new b0.a();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        b0.a aVarC = aVar.j0(2L, timeUnit).k(2L, timeUnit).R0(2L, timeUnit).O0(new TaggingSocketFactory(SocketFactory.getDefault(), INTERCOM_TRAFFIC_TAG)).c(new UserIdentityInterceptor(userIdentity)).c(new RetryInterceptor(new RetryInterceptor.Sleeper())).c(new ShutdownInterceptor(new ShutdownState(context, appIdentity, TimeProvider.SYSTEM)));
        HeaderInterceptor headerInterceptorCreate = HeaderInterceptor.create(context, appIdentity);
        Intrinsics.checkNotNullExpressionValue(headerInterceptorCreate, "create(...)");
        b0.a aVarD = aVarC.d(headerInterceptorCreate);
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            aVarD.g(new okhttp3.c(new File(cacheDir.getAbsolutePath(), CACHE_NAME), o8.f305969h3));
        }
        return aVarD.f();
    }

    @NotNull
    public final com.google.gson.f createGsonWithAdapters() {
        com.google.gson.f fVarF = new g().p(getHomeCardsAdapterFactory()).p(getTicketTypeAdapterFactory()).f();
        Intrinsics.checkNotNullExpressionValue(fVarF, "create(...)");
        return fVarF;
    }

    @NotNull
    public final HelpCenterApi createHelpCenterApi(@NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(HelpCenterApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (HelpCenterApi) objCreate;
    }

    @NotNull
    public final b0 createHttpClientWithoutHeaders(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        b0.a aVar = new b0.a();
        aVar.c(new S3HostRedirectInterceptor());
        return aVar.f();
    }

    @NotNull
    public final Retrofit createKotlinXRetrofit(@NotNull String hostname, @NotNull b0 httpClient) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Retrofit retrofitBuild = new Retrofit.Builder().baseUrl(hostname).addCallAdapterFactory(new NetworkResponseAdapterFactory()).addConverterFactory(KotlinXConvertorFactory.INSTANCE.getConvertorFactory()).client(httpClient).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @NotNull
    public final Retrofit createLegacyRetrofit(@NotNull String hostname, @NotNull b0 httpClient, @NotNull com.google.gson.f gson) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Retrofit retrofitBuild = new Retrofit.Builder().baseUrl(hostname).addCallAdapterFactory(new NetworkResponseAdapterFactory()).addConverterFactory(GsonConverterFactory.create(gson)).client(httpClient).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @NotNull
    public final MessengerApi createMessengerApi(@NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(MessengerApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (MessengerApi) objCreate;
    }

    @NotNull
    public final SurveyApi createSurveyApi(@NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(SurveyApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (SurveyApi) objCreate;
    }

    @NotNull
    public final TicketApi createTicketApi(@NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TicketApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (TicketApi) objCreate;
    }

    @l1
    @NotNull
    public final String createUniqueIdentifier(@NotNull String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        String str = removeInvalidCharacters(appId) + "-android";
        if (str.length() <= 63) {
            return str;
        }
        String strSubstring = str.substring(0, str.charAt(62) == '-' ? 62 : 63);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public final String getFullHostname(@NotNull String appId, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(context, "context");
        return createUniqueIdentifier(appId) + getCorrectServerHostname(UtilsKt.getServerRegionFromManifest(context), context);
    }

    @NotNull
    public final String getServerUrl(@NotNull AppIdentity appIdentity, @NotNull Context context) {
        String string;
        Intrinsics.checkNotNullParameter(appIdentity, "appIdentity");
        Intrinsics.checkNotNullParameter(context, "context");
        String hostFromManifest = UtilsKt.readHostFromManifest(context);
        if (TextUtils.isEmpty(hostFromManifest)) {
            String strAppId = appIdentity.appId();
            Intrinsics.checkNotNullExpressionValue(strAppId, "appId(...)");
            string = getFullHostname(strAppId, context);
        } else {
            StringBuilder sb2 = new StringBuilder();
            String strAppId2 = appIdentity.appId();
            Intrinsics.checkNotNullExpressionValue(strAppId2, "appId(...)");
            sb2.append(createUniqueIdentifier(strAppId2));
            sb2.append(hostFromManifest);
            string = sb2.toString();
        }
        return convertHostnameToUrl(string);
    }

    @NotNull
    public final ExternalUploadApi getUploadApi(@NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ExternalUploadApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (ExternalUploadApi) objCreate;
    }

    @NotNull
    public final String removeInvalidCharacters(@NotNull String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        return new Regex("[^A-Za-z0-9\\-$]").replace(appId, "");
    }
}
