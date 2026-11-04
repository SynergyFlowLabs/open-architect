package com.planner5d.library.model.manager.statistics.events;

import com.devtodev.analytics.internal.storage.sqlite.ProjectEntry;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'n' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
public final class u3 implements com.planner5d.library.model.manager.statistics.events.a.InterfaceC1626a {
    public static final u3 C4;
    public static final u3 D3;
    public static final u3 L4;
    public static final u3 M3;
    private static final /* synthetic */ u3[] R4;
    private static final /* synthetic */ kotlin.enums.a S4;
    public static final u3 U3;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final u3 f217521b4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f217523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f217525e = "sw_";

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final u3 f217537i4;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final u3 f217540j4;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final u3 f217543k4;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final u3 f217545l3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u3 f217550n;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final u3 f217556p0;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final u3 f217570t4;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final u3 f217571u3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f217585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f217586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f217587c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u3 f217527f = new u3("Authentication", 0, "authentication", false, null, 6, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u3 f217529g = new u3("AuthenticationSignUpNew", 1, "authentication_sign_up_new", true, "fxuqmz");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u3 f217532h = new u3("AuthenticationSubmit", 2, "authentication_submit", false, 0 == true ? 1 : 0, 6, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u3 f217535i = new u3("AuthenticationSignOut", 3, "authentication_sign_out", false, null, 6, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u3 f217538j = new u3("AuthenticationForgotPassword", 4, "authentication_forgot_password", false, null, 6, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u3 f217541k = new u3("AuthenticationForgotPasswordSubmit", 5, "authentication_forgot_password_submit", false, null, 6, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u3 f217544l = new u3("WelcomeScreen", 6, "welcome_screen", false, null, 6, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u3 f217547m = new u3("WelcomeScreenClosed", 7, "welcome_screen_closed", false, null, 6, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u3 f217553o = new u3("AppLaunchedToMainScreen", 9, "app_launched_to_main_screen", false, null, 6, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u3 f217565s = new u3("ContestsRulesPrizes", 10, "contests_rules_prizes", false, null, 6, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u3 f217568t = new u3("ContestsRulesAccepted", 11, "contests_rules_accepted", false, null, 6, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u3 f217573v = new u3("Contests", 12, "contests", false, null, 6, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final u3 f217576w = new u3("ContestsJoined", 13, "contests_joined", false, null, 6, null);
    public static final u3 X = new u3("ContestsSubmitted", 14, "contests_submitted", false, null, 6, null);
    public static final u3 Y = new u3("ContestsArchiveOpened", 15, "contests_archive_opened", false, null, 6, 0 == true ? 1 : 0);
    public static final u3 Z = new u3("ContestsVoting", 16, "contests_voting", false, null, 6, null);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final u3 f217557p1 = new u3("ContestsShare", 18, "contests_share", false, null, 6, null);
    public static final u3 H1 = new u3("DocumentAction", 19, "document_action", false, null, 6, null);

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final u3 f217558p2 = new u3("DocumentEditAction", 20, "document_edit_action", false, null, 6, null);

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final u3 f217530g3 = new u3("Editor", 21, "editor", false, null, 6, null);

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final u3 f217533h3 = new u3("EditorClosed", 22, "editor_closed", false, null, 6, null);

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final u3 f217536i3 = new u3("EditorSettings", 23, "editor_settings", false, null, 6, null);

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final u3 f217539j3 = new u3("EditorSettingsLoading", 24, "editor_settings_loading", false, null, 6, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final u3 f217542k3 = new u3("EditorSettingsLoadingFinished", 25, "editor_settings_loading_finished", false, null, 6, null);

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final u3 f217548m3 = new u3("EditorSettingsChanged", 27, "editor_setting_changed", false, null, 6, null);

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final u3 f217551n3 = new u3("EditorSettingsClosed", 28, "editor_settings_closed", false, null, 6, null);

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final u3 f217554o3 = new u3("EditorAction", 29, "editor_action", false, null, 6, null);

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final u3 f217559p3 = new u3("EditorMode", 30, "editor_mode", false, null, 6, null);

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final u3 f217561q3 = new u3("EditorFloors", 31, "editor_floors", false, null, 6, null);

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final u3 f217563r3 = new u3("EditorFloorsChanged", 32, "editor_floors_changed", false, null, 6, null);

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final u3 f217566s3 = new u3("EditorItemEdit", 33, "editor_item_edit", false, null, 6, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final u3 f217569t3 = new u3("EditorItemEditFinished", 34, "editor_item_edit_finished", false, null, 6, null);

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final u3 f217574v3 = new u3("EditorItemChanged", 36, "editor_item_changed", false, null, 6, null);

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final u3 f217577w3 = new u3("EditorItemChangedMaterial", 37, "editor_item_changed_material", false, null, 6, null);

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final u3 f217579x3 = new u3("EditorItemChangedRoom", 38, "editor_item_changed_room", false, null, 6, null);

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final u3 f217581y3 = new u3("EditorItemChangedWall", 39, "editor_item_changed_wall", false, null, 6, null);

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final u3 f217583z3 = new u3("EditorItemAdd", 40, "editor_item_add", true, null, 4, null);
    public static final u3 A3 = new u3("EditorItemRemove", 41, "editor_item_remove", false, null, 6, null);
    public static final u3 B3 = new u3("EditorCatalog", 42, "editor_catalog", false, null, 6, 0 == true ? 1 : 0);
    public static final u3 C3 = new u3("EditorCatalogCategory", 43, "editor_catalog_category", false, null, 6, null);
    public static final u3 E3 = new u3("EditorCatalogSelectPremiumItem", 45, "editor_catalog_select_premium_item", false, null, 6, null);
    public static final u3 F3 = new u3("Landing", 46, "landing", false, null, 6, null);
    public static final u3 G3 = new u3("LandingAgree", 47, "landing_agree", true, null, 4, null);
    public static final u3 H3 = new u3("SupportForm", 48, "support_form", false, null, 6, null);
    public static final u3 I3 = new u3("SupportFormSubmit", 49, "support_form_submit", false, null, 6, null);
    public static final u3 J3 = new u3("FolderAction", 50, "folder_action", false, null, 6, null);
    public static final u3 K3 = new u3("Shared", 51, "shared", false, null, 6, 0 == true ? 1 : 0);
    public static final u3 L3 = new u3("Menu", 52, "menu", false, null, 6, null);
    public static final u3 N3 = new u3("RateUs", 54, "rate_us", false, null, 6, null);
    public static final u3 O3 = new u3("ModalForm", 55, "modal_form", false, null, 6, null);
    public static final u3 P3 = new u3(androidx.exifinterface.media.a.D, 56, "change_screen_orientation", false, null, 6, null);
    public static final u3 Q3 = new u3("DeepLink", 57, "deeplink_open", false, null, 6, null);
    public static final u3 R3 = new u3("PushNotification", 58, "push_notification", false, null, 6, null);
    public static final u3 S3 = new u3("Projects", 59, ProjectEntry.tableName, false, null, 6, null);
    public static final u3 T3 = new u3("ProjectsProjectAction", 60, "projects_project_action", false, null, 6, 0 == true ? 1 : 0);
    public static final u3 V3 = new u3("ProjectCreated", 62, "project_created", false, "5ewt7h");
    public static final u3 W3 = new u3("ProjectOpened", 63, "project_opened", false, null, 6, null);
    public static final u3 X3 = new u3("Purchase", 64, FirebaseAnalytics.c.D, false, null, 6, null);
    public static final u3 Y3 = new u3("PurchasePage", 65, "purchase_page", false, null, 6, null);
    public static final u3 Z3 = new u3("PurchasePreviewPage", 66, "purchase_preview_page", false, null, 6, null);

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final u3 f217520a4 = new u3("PurchaseItem", 67, "purchase_item", false, null, 6, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final u3 f217522c4 = new u3("PurchaseCompleted", 69, "purchase_completed", false, "dd78i1");

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final u3 f217524d4 = new u3("PurchaseTrialActivated", 70, "purchase_trial_activated", true, "np3yh1");

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final u3 f217526e4 = new u3("PurchaseClosed", 71, "purchase_closed", false, null, 6, null);

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final u3 f217528f4 = new u3("PaywallAction", 72, "paywall_action", false, null, 6, null);

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final u3 f217531g4 = new u3("SettingsOpen", 73, "settings_open", false, null, 6, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final u3 f217534h4 = new u3("SettingsAvatarChangedTap", 74, "settings_avatar_changed_tap", false, null, 6, null);

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final u3 f217546l4 = new u3("SettingsChangePasswordTap", 78, "settings_change_password_tap", false, null, 6, null);

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final u3 f217549m4 = new u3("SettingsPasswordChanged", 79, "settings_password_changed", false, null, 6, null);

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final u3 f217552n4 = new u3("SettingsReportAProblemTap", 80, "settings_report_a_problem_tap", false, null, 6, null);

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final u3 f217555o4 = new u3("SettingsRateTheAppTap", 81, "settings_rate_the_app_tap", false, null, 6, null);

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final u3 f217560p4 = new u3("SettingsChangeUser", 82, "settings_change_user", false, null, 6, null);

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final u3 f217562q4 = new u3("Snapshots", 83, "snapshots", false, null, 6, null);

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public static final u3 f217564r4 = new u3("SnapshotsSnapshotAction", 84, "snapshots_snapshot_action", false, null, 6, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public static final u3 f217567s4 = new u3("SnapshotsSnapshotCreate", 85, "snapshots_snapshot_create", false, null, 6, null);

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final u3 f217572u4 = new u3("Onboarding", 87, "onboarding", false, null, 6, null);

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final u3 f217575v4 = new u3("OnboardingFinished", 88, "onboarding_finished", true, null, 4, null);

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final u3 f217578w4 = new u3("OnboardingSpaceType", 89, "onboarding_space_type", false, null, 6, null);

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final u3 f217580x4 = new u3("OnboardingFavoriteStyle", 90, "onboarding_favorite_style", false, null, 6, null);

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final u3 f217582y4 = new u3("OnboardingPurpose", 91, "onboarding_purpose", false, null, 6, null);

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final u3 f217584z4 = new u3("OnboardingPurpose2", 92, "onboarding_purpose_v2", false, null, 6, null);
    public static final u3 A4 = new u3("OnboardingSource", 93, "onboarding_how_find", false, null, 6, 0 == true ? 1 : 0);
    public static final u3 B4 = new u3("FeedPage", 94, "feed_page", false, null, 6, null);
    public static final u3 D4 = new u3("HomePage", 96, "home_page", false, null, 6, null);
    public static final u3 E4 = new u3("ProcessExecutionTimer", 97, "process_execution_timer", false, null, 6, null);
    public static final u3 F4 = new u3("RecognitionCreate", 98, "recognition_create", false, null, 6, null);
    public static final u3 G4 = new u3("RecognitionStart", 99, "recognition_start", false, null, 6, null);
    public static final u3 H4 = new u3("RecognitionSettings", 100, "recognition_settings", false, null, 6, null);
    public static final u3 I4 = new u3("RecognitionError", 101, "recognition_error", false, null, 6, null);
    public static final u3 J4 = new u3("InAppActions", 102, "in_app_actions", false, null, 6, 0 == true ? 1 : 0);
    public static final u3 K4 = new u3("AiDecoratorAction", com.planner5d.library.engine.input.f.b.f160733u1, "ai_decorator_action", false, null, 6, null);
    public static final u3 M4 = new u3("SmartWizardAction", 105, "editor_room_wizard_action", false, null, 6, null);
    public static final u3 N4 = new u3("ChatBotAction", com.planner5d.library.engine.input.f.b.f160742x1, "chatbot_action", false, null, 6, null);
    public static final u3 O4 = new u3("OpenScreen", com.planner5d.library.engine.input.f.b.f160745y1, "open_screen", false, null, 6, null);
    public static final u3 P4 = new u3("SpacesAddressFormAction", 108, "address_form_action", false, null, 6, null);
    public static final u3 Q4 = new u3("Undefined", 109, "undefined", false, null, 6, null);

    @SourceDebugExtension({"SMAP\nStatisticsEventName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsEventName.kt\ncom/planner5d/library/model/manager/statistics/events/StatisticsEventName$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final com.planner5d.library.model.manager.statistics.events.a a(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i10 = 2 >> 2;
            u3 u3Var = null;
            if (StringsKt.u2(name, u3.f217525e, false, 2, null)) {
                return com.planner5d.library.model.manager.statistics.events.a.b.a(com.planner5d.library.model.manager.statistics.events.a.b.b(name));
            }
            for (u3 u3Var2 : u3.p()) {
                if (Intrinsics.areEqual(u3Var2.n(), name)) {
                    u3Var = u3Var2;
                    break;
                }
            }
            u3 u3Var3 = u3Var;
            return u3Var3 == null ? u3.Q4 : u3Var3;
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f217550n = new u3("NewsletterAgree", 8, "newsletter_agree", false, null, 6, defaultConstructorMarker);
        f217556p0 = new u3("ContestsSubmittedResultBack", 17, "contests_submitted_result_back", false, null, 6, defaultConstructorMarker);
        f217545l3 = new u3("EditorSettingsGridSizeError", 26, "editor_settings_grid_size_error", false, null, 6, defaultConstructorMarker);
        f217571u3 = new u3("EditorItemEditAction", 35, "editor_item_edit_action", false, null, 6, defaultConstructorMarker);
        D3 = new u3("EditorCatalogSearch", 44, "editor_catalog_search", false, null, 6, defaultConstructorMarker);
        M3 = new u3("AbTest", 53, com.planner5d.library.model.manager.statistics.appsflyer.d.a.f202892h, false, null, 6, defaultConstructorMarker);
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        U3 = new u3("ProjectCreate", 61, "project_create", true, null, 4, defaultConstructorMarker2);
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        f217521b4 = new u3("PurchaseError", 68, "purchase_error", false, null, 6, defaultConstructorMarker3);
        f217537i4 = new u3("SettingsAvatarChangeSuccess", 75, "settings_avatar_change_success", false, null, 6, defaultConstructorMarker3);
        f217540j4 = new u3("SettingsPromoCodeSubmitted", 76, "settings_promo_code_submited", false, null, 6, defaultConstructorMarker2);
        f217543k4 = new u3("SettingsPromoCodeAccepted", 77, "settings_promo_code_accepted", false, null, 6, defaultConstructorMarker);
        f217570t4 = new u3("SnapshotsSnapshotFinished", 86, "snapshots_snapshot_finished", false, null, 6, defaultConstructorMarker);
        C4 = new u3("FeedAllArticlePage", 95, "all_article_page", false, null, 6, defaultConstructorMarker);
        L4 = new u3("AiDesignerAction", 104, "room_tools_action", false, null, 6, defaultConstructorMarker);
        u3[] u3VarArrO = o();
        R4 = u3VarArrO;
        S4 = kotlin.enums.c.c(u3VarArrO);
        f217523d = new a(null);
    }

    private u3(String str, int i10, String str2, boolean z10, String str3) {
        super(str, i10);
        this.f217585a = str2;
        this.f217586b = z10;
        this.f217587c = str3;
    }

    private static final /* synthetic */ u3[] o() {
        return new u3[]{f217527f, f217529g, f217532h, f217535i, f217538j, f217541k, f217544l, f217547m, f217550n, f217553o, f217565s, f217568t, f217573v, f217576w, X, Y, Z, f217556p0, f217557p1, H1, f217558p2, f217530g3, f217533h3, f217536i3, f217539j3, f217542k3, f217545l3, f217548m3, f217551n3, f217554o3, f217559p3, f217561q3, f217563r3, f217566s3, f217569t3, f217571u3, f217574v3, f217577w3, f217579x3, f217581y3, f217583z3, A3, B3, C3, D3, E3, F3, G3, H3, I3, J3, K3, L3, M3, N3, O3, P3, Q3, R3, S3, T3, U3, V3, W3, X3, Y3, Z3, f217520a4, f217521b4, f217522c4, f217524d4, f217526e4, f217528f4, f217531g4, f217534h4, f217537i4, f217540j4, f217543k4, f217546l4, f217549m4, f217552n4, f217555o4, f217560p4, f217562q4, f217564r4, f217567s4, f217570t4, f217572u4, f217575v4, f217578w4, f217580x4, f217582y4, f217584z4, A4, B4, C4, D4, E4, F4, G4, H4, I4, J4, K4, L4, M4, N4, O4, P4, Q4};
    }

    @NotNull
    public static kotlin.enums.a<u3> p() {
        return S4;
    }

    public static u3 valueOf(String str) {
        return (u3) Enum.valueOf(u3.class, str);
    }

    public static u3[] values() {
        return (u3[]) R4.clone();
    }

    @Override // com.planner5d.library.model.manager.statistics.events.a.InterfaceC1626a
    public boolean k() {
        return this.f217586b;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.a.InterfaceC1626a
    @Nullable
    public String l() {
        return this.f217587c;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.a
    @NotNull
    public String n() {
        return this.f217585a;
    }

    /* synthetic */ u3(String str, int i10, String str2, boolean z10, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? null : str3);
    }
}
