package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import androidx.media3.common.j;
import com.google.api.client.googleapis.media.a;
import com.google.gson.annotations.c;
import io.intercom.android.nexus.NexusConfig;
import io.sentry.o7;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class Config {
    public static final long DEFAULT_CACHE_MAX_AGE_SECONDS = 300;
    public static final int DEFAULT_RATE_LIMIT_COUNT = 100;
    public static final long DEFAULT_RATE_LIMIT_PERIOD_SECONDS = 60;
    public static final long DEFAULT_SESSION_TIMEOUT_SECONDS = 20;
    public static final long DEFAULT_SOFT_RESET_TIMEOUT_SECONDS = 1;

    @c("new_session_threshold")
    private final long _newSessionThresholdSeconds;

    @c("local_rate_limit_period")
    private final long _rateLimitPeriodSeconds;

    @c("real_time_config")
    @NotNull
    private final NexusConfig.Builder _realTimeConfigBuilder;

    @c("soft_reset_timeout")
    private final long _softResetTimeoutSeconds;

    @c("user_update_dup_cache_max_age")
    private final long _userUpdateCacheMaxAgeSeconds;

    @c("access_to_teammate_enabled")
    private final boolean accessToTeammateEnabled;

    @c("ask_users_to_allow_notifications_android")
    private final boolean askUsersToAllowNotifications;

    @c("attachment_settings")
    @NotNull
    private final AttachmentSettings attachmentSettings;

    @c("conversation_state_sync_settings")
    @NotNull
    private final ConversationStateSyncSettings conversationStateSyncSettings;

    @c("features")
    @NotNull
    private final Set<String> features;

    @c("has_open_conversations")
    private final boolean hasOpenConversations;

    @c("help_center_locale")
    @NotNull
    private final String helpCenterLocale;

    @c("help_center_require_search")
    private final boolean helpCenterRequireSearch;

    @c("help_center_url")
    @NotNull
    private final String helpCenterUrl;

    @c("help_center_urls")
    @NotNull
    private final Set<String> helpCenterUrls;

    @c("identity_verification_enabled")
    private final boolean identityVerificationEnabled;

    @c("article_auto_reaction_enabled")
    private final boolean isArticleAutoReactionEnabled;

    @c("audio_enabled")
    private final boolean isAudioEnabled;

    @c("background_requests_enabled")
    private final boolean isBackgroundRequestsEnabled;

    @c("is_first_request")
    private final boolean isFirstRequest;

    @c("inbound_messages")
    private final boolean isInboundMessages;

    @c("metrics_enabled")
    private final boolean isMetricsEnabled;

    @c("primary_color_render_dark_text")
    private final boolean isPrimaryColorRenderDarkText;

    @c("secondary_color_render_dark_text")
    private final boolean isSecondaryColorRenderDarkText;

    @c("launcher_logo_url")
    @NotNull
    private final String launcherLogoUrl;

    @NotNull
    private final String locale;

    @c(o7.b.f305968i)
    @Nullable
    private final ConfigModules modules;

    @NotNull
    private final String name;

    @c("prevent_multiple_inbound_conversations_enabled")
    private final boolean preventMultipleInboundConversationsEnabled;

    @c("base_color")
    @Nullable
    private final String primaryColor;

    @c("local_rate_limit")
    private final int rateLimitCount;

    @c("secondary_color")
    @Nullable
    private final String secondaryColor;

    @c("team_greeting")
    @NotNull
    private final String teamGreeting;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Config NULL = new Config(null, null, null, null, null, null, null, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, null, null, null, null, false, false, false, false, false, null, null, false, null, false, -1, 1, null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Config getNULL() {
            return Config.NULL;
        }

        private Companion() {
        }
    }

    public Config() {
        this(null, null, null, null, null, null, null, false, false, false, false, false, false, false, 0L, 0, 0L, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, false, null, false, -1, 1, null);
    }

    private final long component15() {
        return this._rateLimitPeriodSeconds;
    }

    private final long component17() {
        return this._userUpdateCacheMaxAgeSeconds;
    }

    private final long component18() {
        return this._softResetTimeoutSeconds;
    }

    private final long component19() {
        return this._newSessionThresholdSeconds;
    }

    private final NexusConfig.Builder component20() {
        return this._realTimeConfigBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Config copy$default(Config config, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j10, int i10, long j11, long j12, long j13, NexusConfig.Builder builder, String str8, Set set, Set set2, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ConfigModules configModules, AttachmentSettings attachmentSettings, boolean z22, ConversationStateSyncSettings conversationStateSyncSettings, boolean z23, int i11, int i12, Object obj) {
        boolean z24;
        ConversationStateSyncSettings conversationStateSyncSettings2;
        String str9 = (i11 & 1) != 0 ? config.name : str;
        String str10 = (i11 & 2) != 0 ? config.primaryColor : str2;
        String str11 = (i11 & 4) != 0 ? config.secondaryColor : str3;
        String str12 = (i11 & 8) != 0 ? config.locale : str4;
        String str13 = (i11 & 16) != 0 ? config.helpCenterLocale : str5;
        String str14 = (i11 & 32) != 0 ? config.launcherLogoUrl : str6;
        String str15 = (i11 & 64) != 0 ? config.teamGreeting : str7;
        boolean z25 = (i11 & 128) != 0 ? config.isFirstRequest : z10;
        boolean z26 = (i11 & 256) != 0 ? config.isInboundMessages : z11;
        boolean z27 = (i11 & 512) != 0 ? config.isAudioEnabled : z12;
        boolean z28 = (i11 & 1024) != 0 ? config.isMetricsEnabled : z13;
        boolean z29 = (i11 & 2048) != 0 ? config.isBackgroundRequestsEnabled : z14;
        boolean z30 = (i11 & 4096) != 0 ? config.isPrimaryColorRenderDarkText : z15;
        boolean z31 = (i11 & 8192) != 0 ? config.isSecondaryColorRenderDarkText : z16;
        String str16 = str9;
        long j14 = (i11 & 16384) != 0 ? config._rateLimitPeriodSeconds : j10;
        int i13 = (i11 & 32768) != 0 ? config.rateLimitCount : i10;
        long j15 = (i11 & 65536) != 0 ? config._userUpdateCacheMaxAgeSeconds : j11;
        long j16 = (i11 & 131072) != 0 ? config._softResetTimeoutSeconds : j12;
        long j17 = (i11 & 262144) != 0 ? config._newSessionThresholdSeconds : j13;
        NexusConfig.Builder builder2 = (i11 & 524288) != 0 ? config._realTimeConfigBuilder : builder;
        String str17 = (i11 & 1048576) != 0 ? config.helpCenterUrl : str8;
        NexusConfig.Builder builder3 = builder2;
        Set set3 = (i11 & 2097152) != 0 ? config.helpCenterUrls : set;
        Set set4 = (i11 & 4194304) != 0 ? config.features : set2;
        boolean z32 = (i11 & 8388608) != 0 ? config.identityVerificationEnabled : z17;
        boolean z33 = (i11 & 16777216) != 0 ? config.accessToTeammateEnabled : z18;
        boolean z34 = (i11 & a.f115410j) != 0 ? config.helpCenterRequireSearch : z19;
        boolean z35 = (i11 & 67108864) != 0 ? config.preventMultipleInboundConversationsEnabled : z20;
        boolean z36 = (i11 & j.W0) != 0 ? config.hasOpenConversations : z21;
        ConfigModules configModules2 = (i11 & 268435456) != 0 ? config.modules : configModules;
        AttachmentSettings attachmentSettings2 = (i11 & 536870912) != 0 ? config.attachmentSettings : attachmentSettings;
        boolean z37 = (i11 & 1073741824) != 0 ? config.isArticleAutoReactionEnabled : z22;
        ConversationStateSyncSettings conversationStateSyncSettings3 = (i11 & Integer.MIN_VALUE) != 0 ? config.conversationStateSyncSettings : conversationStateSyncSettings;
        if ((i12 & 1) != 0) {
            conversationStateSyncSettings2 = conversationStateSyncSettings3;
            z24 = config.askUsersToAllowNotifications;
        } else {
            z24 = z23;
            conversationStateSyncSettings2 = conversationStateSyncSettings3;
        }
        return config.copy(str16, str10, str11, str12, str13, str14, str15, z25, z26, z27, z28, z29, z30, z31, j14, i13, j15, j16, j17, builder3, str17, set3, set4, z32, z33, z34, z35, z36, configModules2, attachmentSettings2, z37, conversationStateSyncSettings2, z24);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final boolean component10() {
        return this.isAudioEnabled;
    }

    public final boolean component11() {
        return this.isMetricsEnabled;
    }

    public final boolean component12() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean component13() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean component14() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final int component16() {
        return this.rateLimitCount;
    }

    @Nullable
    public final String component2() {
        return this.primaryColor;
    }

    @NotNull
    public final String component21() {
        return this.helpCenterUrl;
    }

    @NotNull
    public final Set<String> component22() {
        return this.helpCenterUrls;
    }

    @NotNull
    public final Set<String> component23() {
        return this.features;
    }

    public final boolean component24() {
        return this.identityVerificationEnabled;
    }

    public final boolean component25() {
        return this.accessToTeammateEnabled;
    }

    public final boolean component26() {
        return this.helpCenterRequireSearch;
    }

    public final boolean component27() {
        return this.preventMultipleInboundConversationsEnabled;
    }

    public final boolean component28() {
        return this.hasOpenConversations;
    }

    @Nullable
    public final ConfigModules component29() {
        return this.modules;
    }

    @Nullable
    public final String component3() {
        return this.secondaryColor;
    }

    @NotNull
    public final AttachmentSettings component30() {
        return this.attachmentSettings;
    }

    public final boolean component31() {
        return this.isArticleAutoReactionEnabled;
    }

    @NotNull
    public final ConversationStateSyncSettings component32() {
        return this.conversationStateSyncSettings;
    }

    public final boolean component33() {
        return this.askUsersToAllowNotifications;
    }

    @NotNull
    public final String component4() {
        return this.locale;
    }

    @NotNull
    public final String component5() {
        return this.helpCenterLocale;
    }

    @NotNull
    public final String component6() {
        return this.launcherLogoUrl;
    }

    @NotNull
    public final String component7() {
        return this.teamGreeting;
    }

    public final boolean component8() {
        return this.isFirstRequest;
    }

    public final boolean component9() {
        return this.isInboundMessages;
    }

    @NotNull
    public final Config copy(@NotNull String name, @Nullable String str, @Nullable String str2, @NotNull String locale, @NotNull String helpCenterLocale, @NotNull String launcherLogoUrl, @NotNull String teamGreeting, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j10, int i10, long j11, long j12, long j13, @NotNull NexusConfig.Builder _realTimeConfigBuilder, @NotNull String helpCenterUrl, @NotNull Set<String> helpCenterUrls, @NotNull Set<String> features, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, @Nullable ConfigModules configModules, @NotNull AttachmentSettings attachmentSettings, boolean z22, @NotNull ConversationStateSyncSettings conversationStateSyncSettings, boolean z23) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(helpCenterLocale, "helpCenterLocale");
        Intrinsics.checkNotNullParameter(launcherLogoUrl, "launcherLogoUrl");
        Intrinsics.checkNotNullParameter(teamGreeting, "teamGreeting");
        Intrinsics.checkNotNullParameter(_realTimeConfigBuilder, "_realTimeConfigBuilder");
        Intrinsics.checkNotNullParameter(helpCenterUrl, "helpCenterUrl");
        Intrinsics.checkNotNullParameter(helpCenterUrls, "helpCenterUrls");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(attachmentSettings, "attachmentSettings");
        Intrinsics.checkNotNullParameter(conversationStateSyncSettings, "conversationStateSyncSettings");
        return new Config(name, str, str2, locale, helpCenterLocale, launcherLogoUrl, teamGreeting, z10, z11, z12, z13, z14, z15, z16, j10, i10, j11, j12, j13, _realTimeConfigBuilder, helpCenterUrl, helpCenterUrls, features, z17, z18, z19, z20, z21, configModules, attachmentSettings, z22, conversationStateSyncSettings, z23);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return Intrinsics.areEqual(this.name, config.name) && Intrinsics.areEqual(this.primaryColor, config.primaryColor) && Intrinsics.areEqual(this.secondaryColor, config.secondaryColor) && Intrinsics.areEqual(this.locale, config.locale) && Intrinsics.areEqual(this.helpCenterLocale, config.helpCenterLocale) && Intrinsics.areEqual(this.launcherLogoUrl, config.launcherLogoUrl) && Intrinsics.areEqual(this.teamGreeting, config.teamGreeting) && this.isFirstRequest == config.isFirstRequest && this.isInboundMessages == config.isInboundMessages && this.isAudioEnabled == config.isAudioEnabled && this.isMetricsEnabled == config.isMetricsEnabled && this.isBackgroundRequestsEnabled == config.isBackgroundRequestsEnabled && this.isPrimaryColorRenderDarkText == config.isPrimaryColorRenderDarkText && this.isSecondaryColorRenderDarkText == config.isSecondaryColorRenderDarkText && this._rateLimitPeriodSeconds == config._rateLimitPeriodSeconds && this.rateLimitCount == config.rateLimitCount && this._userUpdateCacheMaxAgeSeconds == config._userUpdateCacheMaxAgeSeconds && this._softResetTimeoutSeconds == config._softResetTimeoutSeconds && this._newSessionThresholdSeconds == config._newSessionThresholdSeconds && Intrinsics.areEqual(this._realTimeConfigBuilder, config._realTimeConfigBuilder) && Intrinsics.areEqual(this.helpCenterUrl, config.helpCenterUrl) && Intrinsics.areEqual(this.helpCenterUrls, config.helpCenterUrls) && Intrinsics.areEqual(this.features, config.features) && this.identityVerificationEnabled == config.identityVerificationEnabled && this.accessToTeammateEnabled == config.accessToTeammateEnabled && this.helpCenterRequireSearch == config.helpCenterRequireSearch && this.preventMultipleInboundConversationsEnabled == config.preventMultipleInboundConversationsEnabled && this.hasOpenConversations == config.hasOpenConversations && Intrinsics.areEqual(this.modules, config.modules) && Intrinsics.areEqual(this.attachmentSettings, config.attachmentSettings) && this.isArticleAutoReactionEnabled == config.isArticleAutoReactionEnabled && Intrinsics.areEqual(this.conversationStateSyncSettings, config.conversationStateSyncSettings) && this.askUsersToAllowNotifications == config.askUsersToAllowNotifications;
    }

    public final boolean getAccessToTeammateEnabled() {
        return this.accessToTeammateEnabled;
    }

    public final boolean getAskUsersToAllowNotifications() {
        return this.askUsersToAllowNotifications;
    }

    @NotNull
    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    @NotNull
    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
    }

    @NotNull
    public final Set<String> getFeatures() {
        return this.features;
    }

    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    @NotNull
    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    public final boolean getHelpCenterRequireSearch() {
        return this.helpCenterRequireSearch;
    }

    @NotNull
    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    @NotNull
    public final Set<String> getHelpCenterUrls() {
        return this.helpCenterUrls;
    }

    public final boolean getIdentityVerificationEnabled() {
        return this.identityVerificationEnabled;
    }

    @NotNull
    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    public final ConfigModules getModules() {
        return this.modules;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getNewSessionThreshold() {
        return TimeUnit.SECONDS.toMillis(this._newSessionThresholdSeconds);
    }

    public final boolean getPreventMultipleInboundConversationsEnabled() {
        return this.preventMultipleInboundConversationsEnabled;
    }

    @Nullable
    public final String getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    public final long getRateLimitPeriod() {
        return TimeUnit.SECONDS.toMillis(this._rateLimitPeriodSeconds);
    }

    @NotNull
    public final NexusConfig getRealTimeConfig() {
        NexusConfig nexusConfigBuild = this._realTimeConfigBuilder.build();
        Intrinsics.checkNotNullExpressionValue(nexusConfigBuild, "build(...)");
        return nexusConfigBuild;
    }

    @Nullable
    public final String getSecondaryColor() {
        return this.secondaryColor;
    }

    public final long getSoftResetTimeout() {
        return TimeUnit.SECONDS.toMillis(this._softResetTimeoutSeconds);
    }

    @NotNull
    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    public final long getUserUpdateCacheMaxAge() {
        return TimeUnit.SECONDS.toMillis(this._userUpdateCacheMaxAgeSeconds);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.primaryColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondaryColor;
        int iHashCode3 = (((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.locale.hashCode()) * 31) + this.helpCenterLocale.hashCode()) * 31) + this.launcherLogoUrl.hashCode()) * 31) + this.teamGreeting.hashCode()) * 31) + Boolean.hashCode(this.isFirstRequest)) * 31) + Boolean.hashCode(this.isInboundMessages)) * 31) + Boolean.hashCode(this.isAudioEnabled)) * 31) + Boolean.hashCode(this.isMetricsEnabled)) * 31) + Boolean.hashCode(this.isBackgroundRequestsEnabled)) * 31) + Boolean.hashCode(this.isPrimaryColorRenderDarkText)) * 31) + Boolean.hashCode(this.isSecondaryColorRenderDarkText)) * 31) + Long.hashCode(this._rateLimitPeriodSeconds)) * 31) + Integer.hashCode(this.rateLimitCount)) * 31) + Long.hashCode(this._userUpdateCacheMaxAgeSeconds)) * 31) + Long.hashCode(this._softResetTimeoutSeconds)) * 31) + Long.hashCode(this._newSessionThresholdSeconds)) * 31) + this._realTimeConfigBuilder.hashCode()) * 31) + this.helpCenterUrl.hashCode()) * 31) + this.helpCenterUrls.hashCode()) * 31) + this.features.hashCode()) * 31) + Boolean.hashCode(this.identityVerificationEnabled)) * 31) + Boolean.hashCode(this.accessToTeammateEnabled)) * 31) + Boolean.hashCode(this.helpCenterRequireSearch)) * 31) + Boolean.hashCode(this.preventMultipleInboundConversationsEnabled)) * 31) + Boolean.hashCode(this.hasOpenConversations)) * 31;
        ConfigModules configModules = this.modules;
        return ((((((((iHashCode3 + (configModules != null ? configModules.hashCode() : 0)) * 31) + this.attachmentSettings.hashCode()) * 31) + Boolean.hashCode(this.isArticleAutoReactionEnabled)) * 31) + this.conversationStateSyncSettings.hashCode()) * 31) + Boolean.hashCode(this.askUsersToAllowNotifications);
    }

    public final boolean isArticleAutoReactionEnabled() {
        return this.isArticleAutoReactionEnabled;
    }

    public final boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public final boolean isBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean isFirstRequest() {
        return this.isFirstRequest;
    }

    public final boolean isInboundMessages() {
        return this.isInboundMessages;
    }

    public final boolean isMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    public final boolean isPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean isSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    @NotNull
    public String toString() {
        return "Config(name=" + this.name + ", primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", locale=" + this.locale + ", helpCenterLocale=" + this.helpCenterLocale + ", launcherLogoUrl=" + this.launcherLogoUrl + ", teamGreeting=" + this.teamGreeting + ", isFirstRequest=" + this.isFirstRequest + ", isInboundMessages=" + this.isInboundMessages + ", isAudioEnabled=" + this.isAudioEnabled + ", isMetricsEnabled=" + this.isMetricsEnabled + ", isBackgroundRequestsEnabled=" + this.isBackgroundRequestsEnabled + ", isPrimaryColorRenderDarkText=" + this.isPrimaryColorRenderDarkText + ", isSecondaryColorRenderDarkText=" + this.isSecondaryColorRenderDarkText + ", _rateLimitPeriodSeconds=" + this._rateLimitPeriodSeconds + ", rateLimitCount=" + this.rateLimitCount + ", _userUpdateCacheMaxAgeSeconds=" + this._userUpdateCacheMaxAgeSeconds + ", _softResetTimeoutSeconds=" + this._softResetTimeoutSeconds + ", _newSessionThresholdSeconds=" + this._newSessionThresholdSeconds + ", _realTimeConfigBuilder=" + this._realTimeConfigBuilder + ", helpCenterUrl=" + this.helpCenterUrl + ", helpCenterUrls=" + this.helpCenterUrls + ", features=" + this.features + ", identityVerificationEnabled=" + this.identityVerificationEnabled + ", accessToTeammateEnabled=" + this.accessToTeammateEnabled + ", helpCenterRequireSearch=" + this.helpCenterRequireSearch + ", preventMultipleInboundConversationsEnabled=" + this.preventMultipleInboundConversationsEnabled + ", hasOpenConversations=" + this.hasOpenConversations + ", modules=" + this.modules + ", attachmentSettings=" + this.attachmentSettings + ", isArticleAutoReactionEnabled=" + this.isArticleAutoReactionEnabled + ", conversationStateSyncSettings=" + this.conversationStateSyncSettings + ", askUsersToAllowNotifications=" + this.askUsersToAllowNotifications + ')';
    }

    public Config(@NotNull String name, @Nullable String str, @Nullable String str2, @NotNull String locale, @NotNull String helpCenterLocale, @NotNull String launcherLogoUrl, @NotNull String teamGreeting, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j10, int i10, long j11, long j12, long j13, @NotNull NexusConfig.Builder _realTimeConfigBuilder, @NotNull String helpCenterUrl, @NotNull Set<String> helpCenterUrls, @NotNull Set<String> features, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, @Nullable ConfigModules configModules, @NotNull AttachmentSettings attachmentSettings, boolean z22, @NotNull ConversationStateSyncSettings conversationStateSyncSettings, boolean z23) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(helpCenterLocale, "helpCenterLocale");
        Intrinsics.checkNotNullParameter(launcherLogoUrl, "launcherLogoUrl");
        Intrinsics.checkNotNullParameter(teamGreeting, "teamGreeting");
        Intrinsics.checkNotNullParameter(_realTimeConfigBuilder, "_realTimeConfigBuilder");
        Intrinsics.checkNotNullParameter(helpCenterUrl, "helpCenterUrl");
        Intrinsics.checkNotNullParameter(helpCenterUrls, "helpCenterUrls");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(attachmentSettings, "attachmentSettings");
        Intrinsics.checkNotNullParameter(conversationStateSyncSettings, "conversationStateSyncSettings");
        this.name = name;
        this.primaryColor = str;
        this.secondaryColor = str2;
        this.locale = locale;
        this.helpCenterLocale = helpCenterLocale;
        this.launcherLogoUrl = launcherLogoUrl;
        this.teamGreeting = teamGreeting;
        this.isFirstRequest = z10;
        this.isInboundMessages = z11;
        this.isAudioEnabled = z12;
        this.isMetricsEnabled = z13;
        this.isBackgroundRequestsEnabled = z14;
        this.isPrimaryColorRenderDarkText = z15;
        this.isSecondaryColorRenderDarkText = z16;
        this._rateLimitPeriodSeconds = j10;
        this.rateLimitCount = i10;
        this._userUpdateCacheMaxAgeSeconds = j11;
        this._softResetTimeoutSeconds = j12;
        this._newSessionThresholdSeconds = j13;
        this._realTimeConfigBuilder = _realTimeConfigBuilder;
        this.helpCenterUrl = helpCenterUrl;
        this.helpCenterUrls = helpCenterUrls;
        this.features = features;
        this.identityVerificationEnabled = z17;
        this.accessToTeammateEnabled = z18;
        this.helpCenterRequireSearch = z19;
        this.preventMultipleInboundConversationsEnabled = z20;
        this.hasOpenConversations = z21;
        this.modules = configModules;
        this.attachmentSettings = attachmentSettings;
        this.isArticleAutoReactionEnabled = z22;
        this.conversationStateSyncSettings = conversationStateSyncSettings;
        this.askUsersToAllowNotifications = z23;
    }

    public /* synthetic */ Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j10, int i10, long j11, long j12, long j13, NexusConfig.Builder builder, String str8, Set set, Set set2, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ConfigModules configModules, AttachmentSettings attachmentSettings, boolean z22, ConversationStateSyncSettings conversationStateSyncSettings, boolean z23, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? "" : str6, (i11 & 64) != 0 ? "" : str7, (i11 & 128) != 0 ? false : z10, (i11 & 256) != 0 ? false : z11, (i11 & 512) != 0 ? true : z12, (i11 & 1024) != 0 ? true : z13, (i11 & 2048) != 0 ? true : z14, (i11 & 4096) != 0 ? false : z15, (i11 & 8192) != 0 ? false : z16, (i11 & 16384) != 0 ? 60L : j10, (32768 & i11) != 0 ? 100 : i10, (i11 & 65536) != 0 ? 300L : j11, (i11 & 131072) != 0 ? 1L : j12, (i11 & 262144) != 0 ? 20L : j13, (i11 & 524288) != 0 ? new NexusConfig.Builder() : builder, (i11 & 1048576) == 0 ? str8 : "", (i11 & 2097152) != 0 ? SetsKt.emptySet() : set, (i11 & 4194304) != 0 ? SetsKt.emptySet() : set2, (i11 & 8388608) != 0 ? false : z17, (i11 & 16777216) != 0 ? true : z18, (i11 & a.f115410j) != 0 ? false : z19, (i11 & 67108864) != 0 ? false : z20, (i11 & j.W0) != 0 ? false : z21, (i11 & 268435456) != 0 ? null : configModules, (i11 & 536870912) != 0 ? AttachmentSettings.Companion.getDEFAULT() : attachmentSettings, (i11 & 1073741824) != 0 ? true : z22, (i11 & Integer.MIN_VALUE) != 0 ? ConversationStateSyncSettings.Companion.getDEFAULT() : conversationStateSyncSettings, (i12 & 1) != 0 ? false : z23);
    }
}
