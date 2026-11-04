package io.intercom.android.sdk;

import android.app.Application;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.l1;
import androidx.compose.runtime.internal.w0;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.helpcenter.api.CollectionContentRequestCallback;
import io.intercom.android.sdk.helpcenter.api.CollectionRequestCallback;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper;
import io.intercom.android.sdk.helpcenter.api.SearchRequestCallback;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterUrlUtilsKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.FeatureFlag;
import io.intercom.android.sdk.identity.Registration;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.UnreadCountTracker;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.m5.push.IntercomPushClientHandler;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.overlay.LauncherOpenBehaviour;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.AttributeSanitiser;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import io.intercom.android.sdk.utilities.ValidatorUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nIntercom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Intercom.kt\nio/intercom/android/sdk/Intercom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1343:1\n1#2:1344\n774#3:1345\n865#3,2:1346\n*S KotlinDebug\n*F\n+ 1 Intercom.kt\nio/intercom/android/sdk/Intercom\n*L\n501#1:1345\n501#1:1346,2\n*E\n"})
public final class Intercom {

    @NotNull
    public static final String PUSH_RECEIVER = "intercom_sdk";

    @e.a({"StaticFieldLeak"})
    @Nullable
    private static Intercom instance;

    @NotNull
    private final ActivityFinisher activityFinisher;

    @NotNull
    private final Provider<Api> apiProvider;

    @NotNull
    private final Provider<AppConfig> appConfigProvider;

    @NotNull
    private final Application context;

    @NotNull
    private final IntercomDataLayer dataLayer;

    @NotNull
    private final MetricTracker metricTracker;

    @NotNull
    private final Provider<NexusClient> nexusClientProvider;

    @NotNull
    private final OverlayPresenter overlayPresenter;

    @NotNull
    private final ResetManager resetManager;

    @NotNull
    private final DeDuper superDeDuper;

    @NotNull
    private final Twig twig;

    @NotNull
    private final UnreadCountTracker unreadCountTracker;

    @NotNull
    private final UserIdentity userIdentity;

    @NotNull
    private final Provider<UserUpdater> userUpdater;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @oj.f
    @NotNull
    public static final Visibility VISIBLE = Visibility.VISIBLE;

    @oj.f
    @NotNull
    public static final Visibility GONE = Visibility.GONE;
    private static final Twig TWIG = LumberMill.getLogger();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Intercom create(Application application, String str, String str2) {
            Injector.initWithAppCredentials(application, str, str2);
            Injector injector = Injector.get();
            IntercomDataLayer dataLayer = injector.getDataLayer();
            ThemeManager.INSTANCE.initialize();
            DeDuper deDuper = injector.getDeDuper();
            Intrinsics.checkNotNullExpressionValue(deDuper, "getDeDuper(...)");
            Provider<Api> apiProvider = injector.getApiProvider();
            Intrinsics.checkNotNullExpressionValue(apiProvider, "getApiProvider(...)");
            Provider<NexusClient> nexusClientProvider = injector.getNexusClientProvider();
            Intrinsics.checkNotNullExpressionValue(nexusClientProvider, "getNexusClientProvider(...)");
            Intrinsics.checkNotNull(dataLayer);
            UnreadCountTracker unreadCountTracker = new UnreadCountTracker(dataLayer);
            MetricTracker metricTracker = injector.getMetricTracker();
            Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
            ErrorReporter errorReporter = injector.getErrorReporter();
            Intrinsics.checkNotNullExpressionValue(errorReporter, "getErrorReporter(...)");
            OverlayPresenter overlayPresenter = injector.getOverlayPresenter();
            Intrinsics.checkNotNullExpressionValue(overlayPresenter, "getOverlayPresenter(...)");
            Provider<AppConfig> appConfigProvider = injector.getAppConfigProvider();
            Intrinsics.checkNotNullExpressionValue(appConfigProvider, "getAppConfigProvider(...)");
            UserIdentity userIdentity = injector.getUserIdentity();
            Intrinsics.checkNotNullExpressionValue(userIdentity, "getUserIdentity(...)");
            Provider<UserUpdater> userUpdaterProvider = injector.getUserUpdaterProvider();
            Intrinsics.checkNotNullExpressionValue(userUpdaterProvider, "getUserUpdaterProvider(...)");
            ResetManager resetManager = injector.getResetManager();
            Intrinsics.checkNotNullExpressionValue(resetManager, "getResetManager(...)");
            Twig logger = LumberMill.getLogger();
            Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
            ActivityFinisher activityFinisher = injector.getActivityFinisher();
            Intrinsics.checkNotNullExpressionValue(activityFinisher, "getActivityFinisher(...)");
            return new Intercom(deDuper, apiProvider, nexusClientProvider, unreadCountTracker, metricTracker, errorReporter, application, overlayPresenter, appConfigProvider, userIdentity, userUpdaterProvider, resetManager, logger, activityFinisher, dataLayer);
        }

        @oj.n
        @NotNull
        public final synchronized Intercom client() {
            Intercom intercom;
            intercom = Intercom.instance;
            if (intercom == null) {
                throw new IllegalStateException("Intercom has been initialized incorrectly. Please make sure the first Intercom method you call is initialize() and that you're passing in the correct app ID and API key");
            }
            return intercom;
        }

        @oj.n
        public final synchronized void initialize(@Nullable Application application, @Nullable String str, @Nullable String str2) {
            try {
                if (Intercom.instance != null) {
                    Intercom.TWIG.i("Intercom has already been initialized", new Object[0]);
                    return;
                }
                if (application == null || str == null || str2 == null || !ValidatorUtil.isValidConstructorParams(application, str, str2)) {
                    Intercom.TWIG.e("Intercom has been initialized incorrectly. Please make sure that you're passing in the correct app ID and API key", new Object[0]);
                } else {
                    Intercom.instance = create(application, str, str2);
                    LateInitializationPreparer.getInstance().handlePastLifecycleEvents(application, Injector.get());
                    Injector.get().getMetricTracker().initialiseAPICall();
                    Injector.get().initializeIntercomEventsListeners();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @oj.n
        @kotlin.l(message = "Use initialize() instead. SDK will not communicate with Intercom until a user registration is made.")
        public final synchronized void registerForLaterInitialisation(@Nullable Application application) {
            try {
                if (Intercom.instance != null) {
                    Intercom.TWIG.i("Intercom has already been initialized", new Object[0]);
                } else {
                    if (application == null) {
                        throw new NullPointerException("Cannot call registerForLaterInitialisation() with a null Application");
                    }
                    LateInitializationPreparer.getInstance().register(application);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @oj.n
        public final void setLogLevel(@LogLevel int i10) {
            Injector.get().getMetricTracker().setLogLevelAPICall();
            LumberMill.setLogLevel(i10);
        }

        @oj.n
        @kotlin.l(message = "Use initialize() instead. SDK will not communicate with Intercom until a user registration is made.")
        public final void unregisterForLateInitialisation(@Nullable Application application) {
            Injector.get().getMetricTracker().unRegisterForLateInitialisationAPICall();
            if (application == null) {
                throw new NullPointerException("Cannot call unregisterForLateInitialisation() with a null Application");
            }
            LateInitializationPreparer.getInstance().unregister(application);
        }

        private Companion() {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface LogLevel {
        public static final int ASSERT = 7;

        @NotNull
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int DEBUG = 3;
        public static final int DISABLED = 8;
        public static final int ERROR = 6;
        public static final int INFO = 4;
        public static final int VERBOSE = 2;
        public static final int WARN = 5;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ASSERT = 7;
            public static final int DEBUG = 3;
            public static final int DISABLED = 8;
            public static final int ERROR = 6;
            public static final int INFO = 4;
            public static final int VERBOSE = 2;
            public static final int WARN = 5;

            private Companion() {
            }
        }
    }

    public enum Visibility {
        GONE,
        VISIBLE;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

        @NotNull
        public static kotlin.enums.a<Visibility> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IntercomPushManager.IntercomPushIntegrationType.values().length];
            try {
                iArr[IntercomPushManager.IntercomPushIntegrationType.FCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IntercomSpace.values().length];
            try {
                iArr2[IntercomSpace.HelpCenter.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[IntercomSpace.Home.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IntercomSpace.Messages.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IntercomSpace.Tickets.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @l1
    public Intercom(@NotNull DeDuper superDeDuper, @NotNull Provider<Api> apiProvider, @NotNull Provider<NexusClient> nexusClientProvider, @NotNull UnreadCountTracker unreadCountTracker, @NotNull MetricTracker metricTracker, @NotNull ErrorReporter errorReporter, @NotNull Application context, @NotNull OverlayPresenter overlayPresenter, @NotNull Provider<AppConfig> appConfigProvider, @NotNull UserIdentity userIdentity, @NotNull Provider<UserUpdater> userUpdater, @NotNull ResetManager resetManager, @NotNull Twig twig, @NotNull ActivityFinisher activityFinisher, @NotNull IntercomDataLayer dataLayer) {
        Intrinsics.checkNotNullParameter(superDeDuper, "superDeDuper");
        Intrinsics.checkNotNullParameter(apiProvider, "apiProvider");
        Intrinsics.checkNotNullParameter(nexusClientProvider, "nexusClientProvider");
        Intrinsics.checkNotNullParameter(unreadCountTracker, "unreadCountTracker");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overlayPresenter, "overlayPresenter");
        Intrinsics.checkNotNullParameter(appConfigProvider, "appConfigProvider");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(userUpdater, "userUpdater");
        Intrinsics.checkNotNullParameter(resetManager, "resetManager");
        Intrinsics.checkNotNullParameter(twig, "twig");
        Intrinsics.checkNotNullParameter(activityFinisher, "activityFinisher");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        this.superDeDuper = superDeDuper;
        this.apiProvider = apiProvider;
        this.nexusClientProvider = nexusClientProvider;
        this.unreadCountTracker = unreadCountTracker;
        this.metricTracker = metricTracker;
        this.context = context;
        this.overlayPresenter = overlayPresenter;
        this.appConfigProvider = appConfigProvider;
        this.userIdentity = userIdentity;
        this.userUpdater = userUpdater;
        this.resetManager = resetManager;
        this.twig = twig;
        this.activityFinisher = activityFinisher;
        this.dataLayer = dataLayer;
        IntercomPushManager.IntercomPushIntegrationType installedModuleType = IntercomPushManager.getInstalledModuleType();
        if ((installedModuleType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[installedModuleType.ordinal()]) == 1) {
            twig.i("Enabling FCM for cloud messaging", new Object[0]);
            IntercomPushClientHandler.Companion.setUpNotificationChannels(context);
            IntercomPushManager.initializeFcmService(context);
        } else {
            twig.internal("No FCM integration detected");
        }
        if (shouldDisableErrorReporting()) {
            errorReporter.disableExceptionHandler();
        } else {
            errorReporter.enableExceptionHandler();
        }
    }

    @oj.n
    @NotNull
    public static final synchronized Intercom client() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return Companion.client();
    }

    @oj.n
    public static final synchronized void initialize(@Nullable Application application, @Nullable String str, @Nullable String str2) {
        Companion.initialize(application, str, str2);
    }

    private final void logErrorAndOpenInbox(String str) {
        this.twig.e(str, new Object[0]);
        present(IntercomSpace.Messages);
    }

    private final void logEventWithValidation(String str, Map<String, ?> map) {
        if (str == null || str.length() == 0) {
            this.twig.e("The event name is null or empty. We can't log an event with this string.", new Object[0]);
        } else {
            this.apiProvider.get().logEvent(str, map);
        }
    }

    public static /* synthetic */ void loginIdentifiedUser$default(Intercom intercom, Registration registration, IntercomStatusCallback intercomStatusCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.loginIdentifiedUser(registration, intercomStatusCallback);
    }

    public static /* synthetic */ void loginUnidentifiedUser$default(Intercom intercom, IntercomStatusCallback intercomStatusCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.loginUnidentifiedUser(intercomStatusCallback);
    }

    private final boolean noUserRegistered() {
        return !this.userIdentity.identityExists() || this.userIdentity.isSoftReset();
    }

    private final void openIntercomChatPush(String str, TaskStackBuilder taskStackBuilder) {
        if (Intrinsics.areEqual(str, IntercomPushManager.MULTIPLE_NOTIFICATIONS)) {
            IntercomRootActivityLauncher.INSTANCE.startMessages(this.context);
        } else {
            Intent conversationIntent = ConversationScreenOpenerKt.getConversationIntent(this.context, str);
            if (taskStackBuilder != null) {
                taskStackBuilder.addNextIntent(conversationIntent);
                this.context.startActivities(taskStackBuilder.getIntents());
            } else {
                this.context.startActivity(conversationIntent);
            }
        }
        this.metricTracker.viewedPushNotification(str);
        IntercomPushClientHandler.Companion.clear(this.context);
    }

    private final void performUpdate(Map<String, ? extends Object> map, IntercomStatusCallback intercomStatusCallback) {
        if (this.userIdentity.isUnidentified()) {
            AttributeSanitiser.anonymousSanitisation(map);
        }
        if (!this.superDeDuper.shouldUpdateUser(map)) {
            intercomStatusCallback.onSuccess();
            this.twig.internal("dupe", "dropped dupe");
        } else {
            this.superDeDuper.update(map);
            this.userUpdater.get().updateUser(UserUpdateRequest.create(false, this.dataLayer.getHostAppState().getValue().isBackgrounded(), map, false), intercomStatusCallback);
            this.twig.internal("dupe", "updated user");
        }
    }

    public static /* synthetic */ void present$default(Intercom intercom, IntercomSpace intercomSpace, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            intercomSpace = IntercomSpace.Home;
        }
        intercom.present(intercomSpace);
    }

    @oj.n
    @kotlin.l(message = "Use initialize() instead. SDK will not communicate with Intercom until a user registration is made.")
    public static final synchronized void registerForLaterInitialisation(@Nullable Application application) {
        try {
            Companion.registerForLaterInitialisation(application);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void registerNewIdentifiedUser(Registration registration, IntercomStatusCallback intercomStatusCallback) {
        UserUpdateRequest userUpdateRequestCreate;
        this.resetManager.hardReset();
        this.userIdentity.registerIdentifiedUser(registration);
        this.nexusClientProvider.get().disconnect();
        boolean z10 = !this.dataLayer.getHostAppState().getValue().getSessionStartedSinceLastBackgrounded();
        boolean zIsBackgrounded = this.dataLayer.getHostAppState().getValue().isBackgrounded();
        if (registration.getAttributes() != null) {
            UserAttributes attributes = registration.getAttributes();
            Intrinsics.checkNotNull(attributes);
            userUpdateRequestCreate = UserUpdateRequest.create(z10, zIsBackgrounded, attributes.toMap(), true);
            Intrinsics.checkNotNull(userUpdateRequestCreate);
        } else {
            userUpdateRequestCreate = UserUpdateRequest.create(z10, zIsBackgrounded, true);
            Intrinsics.checkNotNull(userUpdateRequestCreate);
        }
        this.userUpdater.get().updateUser(userUpdateRequestCreate, intercomStatusCallback);
    }

    public static /* synthetic */ void setAuthTokens$default(Intercom intercom, List list, IntercomStatusCallback intercomStatusCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.setAuthTokens(list, intercomStatusCallback);
    }

    @oj.n
    public static final void setLogLevel(@LogLevel int i10) {
        Companion.setLogLevel(i10);
    }

    private final boolean shouldDisableErrorReporting() {
        return this.appConfigProvider.get().hasFeature(FeatureFlag.DISABLE_ERROR_REPORTING);
    }

    private final void softRegister() {
        this.nexusClientProvider.get().connect(this.appConfigProvider.get().getRealTimeConfig(), true);
        this.userIdentity.softRestart();
        this.resetManager.clear();
        Runnable runnable = new Runnable() { // from class: io.intercom.android.sdk.c0
            @Override // java.lang.Runnable
            public final void run() {
                Intercom.softRegister$lambda$2(this.f291547a);
            }
        };
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void softRegister$lambda$2(Intercom this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.overlayPresenter.refreshStateBecauseUserIdentityIsNotInStoreYet();
    }

    @oj.n
    @kotlin.l(message = "Use initialize() instead. SDK will not communicate with Intercom until a user registration is made.")
    public static final void unregisterForLateInitialisation(@Nullable Application application) {
        Companion.unregisterForLateInitialisation(application);
    }

    public static /* synthetic */ void updateUser$default(Intercom intercom, UserAttributes userAttributes, IntercomStatusCallback intercomStatusCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.updateUser(userAttributes, intercomStatusCallback);
    }

    public final void addUnreadConversationCountListener(@NotNull UnreadConversationCountListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.metricTracker.addUnreadConversationCountListenerAPICall();
        UnreadCountTracker.addListener$default(this.unreadCountTracker, listener, null, 2, null);
    }

    public final void changeWorkspace(@Nullable String str, @Nullable String str2) {
        this.metricTracker.changeWorkspaceAPICall();
        if (str == null || str2 == null || !ValidatorUtil.isValidAppIdParams(str, str2)) {
            TWIG.e("Workspace has not been changed. Please make sure that you're passing in the correct app ID and API key", new Object[0]);
        } else {
            logout();
            Injector.get().changeWorkspace(str, str2);
        }
    }

    @kotlin.l(message = "Use presentContent(IntercomContent.Article(id)) instead.")
    public final void displayArticle(@NotNull String articleId) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        this.metricTracker.displayArticleAPICall();
        int i10 = 7 << 0;
        this.context.startActivity(IntercomArticleActivity.Companion.buildIntent(this.context, new IntercomArticleActivity.ArticleActivityArguments(articleId, MetricTracker.Place.API, false, false, 12, null)));
    }

    @kotlin.l(message = "Use presentContent(IntercomContent.Carousel(id)) instead.")
    public final void displayCarousel(@Nullable String str) {
        this.metricTracker.displayCarouselAPICall();
        Application application = this.context;
        application.startActivity(IntercomCarouselActivity.buildIntent(application, str));
    }

    @kotlin.l(message = "Use present(IntercomSpace.Messages) instead.")
    public final void displayConversationsList() {
        this.metricTracker.displayConversationsListAPICall();
        this.metricTracker.openedMessengerConversationList(LauncherOpenBehaviour.LauncherType.CUSTOM);
        IntercomRootActivityLauncher.INSTANCE.startMessages(this.context);
    }

    @kotlin.l(message = "Use present(IntercomSpace.HelpCenter) instead.")
    public final void displayHelpCenter() {
        this.metricTracker.displayHelpCenterAPICall();
        displayHelpCenterCollections(CollectionsKt.emptyList());
    }

    @kotlin.l(message = "Use presentContent(IntercomContent.HelpCenterCollections(ids)) instead.")
    public final void displayHelpCenterCollections(@Nullable List<String> list) {
        this.metricTracker.displayHelpCenterCollectionsAPICall();
        Application application = this.context;
        List listFilterNotNull = list != null ? CollectionsKt.filterNotNull(list) : null;
        if (listFilterNotNull == null) {
            listFilterNotNull = CollectionsKt.emptyList();
        }
        HelpCenterUrlUtilsKt.openCollections(application, listFilterNotNull, MetricTracker.Place.API);
    }

    public final void displayMessageComposer() {
        this.metricTracker.displayMessageComposerAPICall();
        displayMessageComposer("");
    }

    @kotlin.l(message = "Use present() instead.")
    public final void displayMessenger() {
        this.metricTracker.displayMessengerAPICall();
        if (noUserRegistered()) {
            logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
        } else {
            new LauncherOpenBehaviour().openMessenger(this.context);
        }
    }

    @kotlin.l(message = "Use presentContent(IntercomContent.Survey(id)) instead.")
    public final void displaySurvey(@NotNull String surveyId) {
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        this.metricTracker.displaySurveyAPICall();
        Application application = this.context;
        application.startActivity(IntercomSurveyActivity.Companion.buildIntent(application, surveyId));
    }

    public final void fetchHelpCenterCollection(@Nullable String str, @Nullable CollectionContentRequestCallback collectionContentRequestCallback) {
        this.metricTracker.fetchHelpCenterCollectionAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(collectionContentRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterCollection(metricTracker, str, collectionContentRequestCallback);
    }

    public final void fetchHelpCenterCollections(@Nullable CollectionRequestCallback collectionRequestCallback) {
        this.metricTracker.fetchHelpCenterCollectionsAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        Intrinsics.checkNotNull(collectionRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterCollections(metricTracker, collectionRequestCallback);
    }

    @Nullable
    public final Registration fetchLoggedInUserAttributes() {
        UserIdentity userIdentity = this.userIdentity;
        if (!userIdentity.identityExists()) {
            userIdentity = null;
        }
        if (userIdentity == null) {
            return null;
        }
        Registration registration = new Registration();
        String userId = userIdentity.getUserId();
        if (userId != null && userId.length() != 0) {
            registration.withUserId(userIdentity.getUserId());
        }
        String email = userIdentity.getEmail();
        if (email != null && email.length() != 0) {
            registration.withEmail(userIdentity.getEmail());
        }
        String anonymousId = userIdentity.getAnonymousId();
        if (anonymousId != null && anonymousId.length() != 0) {
            registration.withUserId(userIdentity.getAnonymousId());
        }
        return registration;
    }

    public final int getUnreadConversationCount() {
        this.metricTracker.unreadConversationCountAPICall();
        return this.dataLayer.getUnreadConversationIds().getValue().size();
    }

    @kotlin.l(message = "Calling this API is no longer required. Intercom will directly open the chat screen when a push notification is clicked.")
    public final void handlePushMessage() {
        this.metricTracker.handlePushMessageAPICall();
        handlePushMessage(null);
    }

    public final void hideIntercom() {
        this.metricTracker.hideIntercomAPICall();
        this.activityFinisher.finishActivities();
    }

    public final boolean isUserLoggedIn() {
        return this.userIdentity.identityExists();
    }

    public final void logEvent(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.metricTracker.logEventAPICall();
        logEventWithValidation(name, MapsKt.emptyMap());
    }

    public final void loginIdentifiedUser(@NotNull Registration userRegistration, @NotNull IntercomStatusCallback intercomStatusCallback) {
        Map<String, Object> mapEmptyMap;
        Intrinsics.checkNotNullParameter(userRegistration, "userRegistration");
        Intrinsics.checkNotNullParameter(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.loginIdentifiedUserAPICall();
        String userId = userRegistration.getUserId();
        Intrinsics.checkNotNullExpressionValue(userId, "getUserId(...)");
        if (userId.length() == 0) {
            String email = userRegistration.getEmail();
            Intrinsics.checkNotNullExpressionValue(email, "getEmail(...)");
            if (email.length() == 0) {
                this.twig.e("Failed to register user. You need to provide a user identifier, an email address, or both. ", new Object[0]);
                intercomStatusCallback.onFailure(new IntercomError(1007, "Failed to register user. You need to provide unique user identifier, an email address, or both."));
                return;
            }
        }
        if (!this.userIdentity.identityExists()) {
            if (!this.userIdentity.isSoftReset() || !this.userIdentity.softIdentityIsSameUser(userRegistration)) {
                registerNewIdentifiedUser(userRegistration, intercomStatusCallback);
                return;
            } else {
                softRegister();
                intercomStatusCallback.onSuccess();
                return;
            }
        }
        if (!Intrinsics.areEqual(userRegistration.getEmail(), this.userIdentity.getEmail()) || !Intrinsics.areEqual(userRegistration.getUserId(), this.userIdentity.getUserId())) {
            this.twig.i("The user is already registered with a different email or user id", new Object[0]);
            registerNewIdentifiedUser(userRegistration, intercomStatusCallback);
        } else {
            if (!this.userIdentity.registrationHasAttributes(userRegistration)) {
                this.twig.i("The user is already registered with the same email and user id, skipping API call", new Object[0]);
                intercomStatusCallback.onSuccess();
                return;
            }
            this.twig.i("We already have a registered user. Updating this user with the attributes provided.", new Object[0]);
            UserAttributes attributes = userRegistration.getAttributes();
            if (attributes == null || (mapEmptyMap = attributes.toMap()) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            performUpdate(mapEmptyMap, intercomStatusCallback);
        }
    }

    public final void loginUnidentifiedUser(@NotNull IntercomStatusCallback intercomStatusCallback) {
        Intrinsics.checkNotNullParameter(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.loginUnidentifiedUserAPICall();
        if (this.userIdentity.isUnidentified()) {
            this.twig.i("The unidentified user is already registered", new Object[0]);
            intercomStatusCallback.onSuccess();
        } else {
            if (this.userIdentity.isIdentified()) {
                this.twig.e("The identified user is already registered", new Object[0]);
                intercomStatusCallback.onFailure(new IntercomError(3002, "Failed to register user. We already have a registered user. If you are attempting to register a new user, call logout() before this. If you are attempting to register an identified user call: registerIdentifiedUser(Registration)"));
                return;
            }
            this.resetManager.hardReset();
            this.userIdentity.registerUnidentifiedUser();
            this.nexusClientProvider.get().disconnect();
            this.userUpdater.get().updateUser(UserUpdateRequest.create(!this.dataLayer.getHostAppState().getValue().getSessionStartedSinceLastBackgrounded(), this.dataLayer.getHostAppState().getValue().isBackgrounded(), true), intercomStatusCallback);
        }
    }

    public final void logout() {
        this.metricTracker.logoutAPICall();
        if (this.userIdentity.isSoftReset()) {
            return;
        }
        this.resetManager.softReset();
    }

    @oj.j
    public final void present() {
        present$default(this, null, 1, null);
    }

    public final void presentContent(@NotNull IntercomContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (!Injector.isNotInitialised() && !noUserRegistered()) {
            Injector.get().getMetricTracker().presentContentAPICall(content);
        }
        if (content instanceof IntercomContent.Article) {
            Application application = this.context;
            application.startActivity(IntercomArticleActivity.Companion.buildIntent(application, new IntercomArticleActivity.ArticleActivityArguments(((IntercomContent.Article) content).getId(), MetricTracker.Place.API, false, false, 12, null)));
            return;
        }
        if (content instanceof IntercomContent.Carousel) {
            Application application2 = this.context;
            application2.startActivity(IntercomCarouselActivity.buildIntent(application2, ((IntercomContent.Carousel) content).getId()));
            return;
        }
        if (content instanceof IntercomContent.Survey) {
            Application application3 = this.context;
            application3.startActivity(IntercomSurveyActivity.Companion.buildIntent(application3, ((IntercomContent.Survey) content).getId()));
        } else if (content instanceof IntercomContent.HelpCenterCollections) {
            HelpCenterUrlUtilsKt.openCollections(this.context, ((IntercomContent.HelpCenterCollections) content).getIds(), MetricTracker.Place.API);
        } else if (content instanceof IntercomContent.Conversation) {
            ConversationScreenOpenerKt.openComposer$default(this.context, "", true, null, ((IntercomContent.Conversation) content).getId(), 8, null);
        } else {
            if (!(content instanceof IntercomContent.Ticket)) {
                throw new k0();
            }
            IntercomRootActivityLauncher.INSTANCE.startTicketDetails(this.context, ((IntercomContent.Ticket) content).getId(), MetricTracker.Context.FROM_PROGRAMMATIC);
        }
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use loginIdentifiedUser with callback instead.", replaceWith = @b1(expression = "loginIdentifiedUser(userRegistration)", imports = {}))
    public final void registerIdentifiedUser(@Nullable Registration registration) {
        if (registration != null) {
            loginIdentifiedUser(registration, IntercomStatusCallbackKt.getNoStatusCallback());
        } else {
            this.metricTracker.registerIdentifiedUserAPICall();
            this.twig.e("The registration object passed is null. An example successful call is registerIdentifiedUser(Registration.create().withEmail(email));", new Object[0]);
        }
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use loginUnidentifiedUser instead.", replaceWith = @b1(expression = "loginUnidentifiedUser()", imports = {}))
    public final void registerUnidentifiedUser() {
        loginUnidentifiedUser(IntercomStatusCallbackKt.getNoStatusCallback());
    }

    public final void removeUnreadConversationCountListener(@Nullable UnreadConversationCountListener unreadConversationCountListener) {
        this.metricTracker.removeUnreadConversationCountListenerAPICall();
        if (unreadConversationCountListener != null) {
            this.unreadCountTracker.removeListener(unreadConversationCountListener);
        }
    }

    @kotlin.l(message = "call {@link #logout()} instead")
    public final void reset() {
        this.metricTracker.resetAPICall();
        logout();
    }

    public final void searchHelpCenter(@Nullable String str, @Nullable SearchRequestCallback searchRequestCallback) {
        this.metricTracker.searchHelpCenterAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(searchRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterResultsForSearchTerm(metricTracker, str, searchRequestCallback);
    }

    public final void setAuthTokens(@NotNull List<AuthToken> authTokens, @NotNull IntercomStatusCallback intercomStatusCallback) {
        Intrinsics.checkNotNullParameter(authTokens, "authTokens");
        Intrinsics.checkNotNullParameter(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.authTokensAPICall();
        ArrayList arrayList = new ArrayList();
        for (Object obj : authTokens) {
            AuthToken authToken = (AuthToken) obj;
            if (authToken.getName().length() > 0 && authToken.getToken().length() > 0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            this.apiProvider.get().setAuthTokens(arrayList, intercomStatusCallback);
        } else {
            this.twig.e("All auth tokens in the map have empty keys or values.", new Object[0]);
            intercomStatusCallback.onFailure(new IntercomError(3003, "ERROR - Failed to set Auth Tokens. All keys or values passed were empty."));
        }
    }

    public final void setBottomPadding(int i10) {
        this.metricTracker.setBottomPaddingAPICall();
        this.dataLayer.updateBottomPadding(i10);
    }

    public final void setInAppMessageVisibility(@Nullable Visibility visibility) {
        this.metricTracker.setInAppMessageVisibilityAPICall();
        if (visibility != null) {
            this.dataLayer.updateInAppNotificationsVisibility(visibility);
        } else {
            this.twig.i("The visibility provided is null, visibility won't be updated", new Object[0]);
        }
    }

    public final void setLauncherVisibility(@Nullable Visibility visibility) {
        this.metricTracker.setLauncherVisibilityAPICall();
        if (visibility != null) {
            this.dataLayer.updateLauncherVisibility(visibility);
        } else {
            this.twig.i("The visibility provided is null, visibility won't be updated", new Object[0]);
        }
    }

    public final void setThemeMode(@Nullable ThemeMode themeMode) {
        this.metricTracker.setThemeModeAPICall();
        if (themeMode == null) {
            ThemeManager.INSTANCE.clearSessionOverride();
            this.twig.i("Theme mode cleared, using server-provided theme", new Object[0]);
            return;
        }
        ThemeManager.INSTANCE.setSessionOverride(themeMode);
        this.twig.i("Theme mode set to: " + themeMode + " (session only)", new Object[0]);
    }

    public final void setUserHash(@NotNull String userHash) {
        Intrinsics.checkNotNullParameter(userHash, "userHash");
        this.metricTracker.setUserHashAPICall();
        if (userHash.length() == 0) {
            this.twig.w("The user hash you sent us to verify was empty, we will not be able to authenticate your requests without a valid user hash.", new Object[0]);
        } else {
            if (Intrinsics.areEqual(this.userIdentity.getHmac(), userHash)) {
                this.twig.i("The user hash set matches the existing user identity hash value", new Object[0]);
                return;
            }
            if (this.userIdentity.softUserIdentityHmacDiffers(userHash)) {
                this.resetManager.hardReset();
            }
            this.userIdentity.setUserHash(userHash);
        }
    }

    public final void setUserJwt(@NotNull String jwt) {
        Intrinsics.checkNotNullParameter(jwt, "jwt");
        this.metricTracker.setUserJwtAPICall();
        if (jwt.length() == 0) {
            this.twig.w("The JWT you sent us to verify was empty, we will not be able to authenticate your requests without a valid JWT.", new Object[0]);
        } else {
            if (Intrinsics.areEqual(this.userIdentity.getJwt(), jwt)) {
                this.twig.i("The JWT set matches the existing user identity JWT value", new Object[0]);
                return;
            }
            if (this.userIdentity.softUserIdentityJwtDiffers(jwt)) {
                this.resetManager.hardReset();
            }
            this.userIdentity.setJwt(jwt);
        }
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use updateUser with callback instead.", replaceWith = @b1(expression = "updateUser(userAttributes, statusCallback)", imports = {}))
    public final void updateUser(@Nullable UserAttributes userAttributes) {
        this.metricTracker.updateUserAPICall();
        if (userAttributes == null) {
            LumberMill.getLogger().e("updateUser method failed: the UserAttributes object provided is null", new Object[0]);
        } else {
            updateUser(userAttributes, IntercomStatusCallbackKt.getNoStatusCallback());
        }
    }

    @oj.j
    public final void present(@NotNull IntercomSpace space) {
        Intrinsics.checkNotNullParameter(space, "space");
        if (noUserRegistered()) {
            TWIG.e("Intercom was presented but there was no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).", new Object[0]);
            return;
        }
        Injector.get().getMetricTracker().presentAPICall(space);
        int i10 = WhenMappings.$EnumSwitchMapping$1[space.ordinal()];
        if (i10 == 1) {
            HelpCenterUrlUtilsKt.openCollections(this.context, CollectionsKt.emptyList(), MetricTracker.Place.API);
            return;
        }
        int i11 = 3 >> 2;
        if (i10 == 2) {
            IntercomRootActivityLauncher.INSTANCE.startHome(this.context);
        } else if (i10 == 3) {
            IntercomRootActivityLauncher.INSTANCE.startMessages(this.context);
        } else {
            if (i10 != 4) {
                throw new k0();
            }
            IntercomRootActivityLauncher.INSTANCE.startTickets(this.context);
        }
    }

    public final void displayMessageComposer(@Nullable String str) {
        if (str != null && str.length() != 0) {
            this.metricTracker.displayMessageComposerInitialMessageAPICall();
        }
        if (noUserRegistered()) {
            logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device. Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
            return;
        }
        if (!this.appConfigProvider.get().isReceivedFromServer()) {
            logErrorAndOpenInbox("It appears your app has not received a successful response from Intercom. Please check if you are using the correct Android app ID and API Key from the Intercom settings.");
            return;
        }
        if (!this.appConfigProvider.get().isInboundMessages()) {
            logErrorAndOpenInbox("It appears your app is not on a plan that allows message composing. As a fallback we are calling present(IntercomSpace.Messages)");
            return;
        }
        this.metricTracker.openedMessengerNewConversation(LauncherOpenBehaviour.LauncherType.CUSTOM);
        Application application = this.context;
        if (str == null) {
            str = "";
        }
        ConversationScreenOpenerKt.openComposer$default(application, str, true, null, null, 24, null);
    }

    @kotlin.l(message = "Calling this API is no longer required. Intercom will directly open the chat screen when a push notification is clicked.")
    public final void handlePushMessage(@Nullable TaskStackBuilder taskStackBuilder) {
        if (taskStackBuilder != null) {
            this.metricTracker.handlePushMessageCustomStackAPICall();
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(PreferenceKeys.INTERCOM_PUSH_PREFS, 0);
        String string = sharedPreferences.getString(IntercomPushManager.INTERCOM_PUSH_PATH, "");
        if (string != null && !StringsKt.w3(string)) {
            openIntercomChatPush(string, taskStackBuilder);
            sharedPreferences.edit().clear().apply();
        } else {
            this.twig.internal("No Uri found");
        }
    }

    public final void logEvent(@Nullable String str, @Nullable Map<String, ?> map) {
        this.metricTracker.logEventMetadataAPICall();
        if (map == null) {
            this.twig.i("The metadata provided is null, logging event with no metadata", new Object[0]);
        } else if (map.isEmpty()) {
            this.twig.i("The metadata provided is empty, logging event with no metadata", new Object[0]);
        }
        Map<String, ?> map2 = map != null ? MapsKt.toMap(map) : null;
        if (map2 == null) {
            map2 = MapsKt.emptyMap();
        }
        logEventWithValidation(str, map2);
    }

    public final void updateUser(@NotNull UserAttributes userAttributes, @NotNull IntercomStatusCallback intercomStatusCallback) {
        Intrinsics.checkNotNullParameter(userAttributes, "userAttributes");
        Intrinsics.checkNotNullParameter(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.updateUserCallbackAPICall();
        Map<String, Object> map = userAttributes.toMap();
        Intrinsics.checkNotNullExpressionValue(map, "toMap(...)");
        performUpdate(map, intercomStatusCallback);
    }
}
