package com.planner5d.library.model.manager.config;

import com.facebook.AccessToken;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public enum f {
    Adjust("android_adjust"),
    AgreementsDialog("agreements_dialog"),
    AiDesigner("ai_designer"),
    AiDesignerDecoratorConfig("ai_designer_decorator_config_android"),
    AiMoney("android_ai_money"),
    ApiCatalogSearch("api_catalog_search"),
    Appsflyer("android_appsflyer"),
    AuthenticationSocialGoogle("authentication_social_google"),
    BernardChat("bernard_chat"),
    BernardEditor("android_bernard_editor"),
    BernardHome("android_ai_bernard_home"),
    BernardNewUi("android_ai_bernard_new_ui"),
    CatalogSearch("catalog_search"),
    CatalogSearchSuggestions("new_catalog_search_suggestions_android"),
    Contests("contests"),
    ContestsSharing("android_design_battle_sharing"),
    ContestsVotingNotify("contests_voting_notify"),
    CustomerIo("android_customerio"),
    DesignGenerator("design_generator"),
    DesignOfTheDay("design_of_the_day"),
    Documents("android_documents"),
    Editor3dOnStart("android_editor_3d_on_start"),
    Facebook(AccessToken.f98376v),
    FeedHome("feed_home"),
    Filament("filament"),
    Gallery("gallery"),
    Intercom("intercom"),
    LogsApi("logs_api"),
    LogsFirebase("logs_firebase"),
    LogsSentry("logs_sentry"),
    OnboardingHowFind("android_onboarding_how_find"),
    OnboardingNew("android_onboarding_new"),
    PremiumFeaturesScreen("premium_features_screen"),
    ProAndroid("pro_android"),
    Products("products"),
    ProjectRevisions("project_revisions_android"),
    ProjectsScreenFirstSession("projects_screen_first_session_android"),
    PurchasePlacements("purchase_placements"),
    RateOnStart("android_rate_on_start"),
    RateUs("rate_us"),
    RenderFlowUpdate("render_flow_update_android"),
    RendersAi("android_renders_ai"),
    RoomRotation("room_rotation_android"),
    SignInWithCode("android_sign_in_new"),
    SmartWizard("smart_wizard"),
    Spaces("android_spaces"),
    SpacesOnboardingAddressSkip("android_spaces_onboarding_address_skip"),
    Superwall("superwall"),
    SuperwallEventsEnabled("superwall_events_enabled"),
    TriggerAppUpdate("android_trigger_app_update"),
    UnlockCatalogTrial("unlock_catalog_trial"),
    UploadPlan("upload_plan"),
    ConcurrentNetworking("concurrent_networking_android"),
    Onboarding("onboarding");

    private static final /* synthetic */ kotlin.enums.a K3 = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f181533a;

    static {
        int i10 = 1 >> 3;
    }

    f(String str) {
        this.f181533a = str;
    }

    @NotNull
    public static kotlin.enums.a<f> l() {
        return K3;
    }

    @NotNull
    public final String getId() {
        return this.f181533a;
    }
}
