package io.intercom.android.sdk.identity;

import androidx.annotation.l;
import androidx.compose.runtime.internal.w0;
import androidx.media3.common.j;
import com.google.api.client.googleapis.media.a;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.models.HomeConfig;
import io.intercom.android.sdk.models.OpenConfig;
import io.intercom.android.sdk.models.Space;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAppConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppConfig.kt\nio/intercom/android/sdk/identity/AppConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1755#2,3:253\n1#3:256\n*S KotlinDebug\n*F\n+ 1 AppConfig.kt\nio/intercom/android/sdk/identity/AppConfig\n*L\n62#1:253,3\n*E\n"})
public final class AppConfig {
    public static final int $stable = 8;
    private final boolean articleAutoReactionEnabled;
    private final boolean askUsersToAllowNotifications;

    @NotNull
    private final AttachmentSettings attachmentSettings;

    @Nullable
    private final ConfigModules configModules;

    @NotNull
    private final ConversationStateSyncSettings conversationStateSyncSettings;

    @NotNull
    private final Set<String> features;
    private final boolean hasOpenConversations;

    @NotNull
    private final String helpCenterLocale;

    @NotNull
    private final String helpCenterUrl;

    @NotNull
    private final Set<String> helpCenterUrls;
    private final boolean isAccessToTeammateEnabled;
    private final boolean isAudioEnabled;
    private final boolean isBackgroundRequestsEnabled;
    private final boolean isHelpCenterRequireSearchEnabled;
    private final boolean isIdentityVerificationEnabled;
    private final boolean isInboundMessages;
    private final boolean isMetricsEnabled;
    private final boolean isPreventMultipleInboundConversationsEnabled;
    private final boolean isPrimaryColorRenderDarkText;
    private final boolean isReceivedFromServer;
    private final boolean isSecondaryColorRenderDarkText;

    @NotNull
    private final String launcherLogoUrl;

    @NotNull
    private final String locale;

    @NotNull
    private final String name;
    private final long newSessionThresholdMs;
    private final int primaryColor;
    private final int rateLimitCount;
    private final long rateLimitPeriodMs;

    @NotNull
    private final NexusConfig realTimeConfig;
    private final int secondaryColor;
    private final int secondaryColorDark;
    private final long softResetTimeoutMs;

    @NotNull
    private final String teamGreeting;
    private final long userUpdateCacheMaxAgeMs;

    public AppConfig(@NotNull String name, @l int i10, @l int i11, @l int i12, boolean z10, boolean z11, boolean z12, int i13, long j10, long j11, long j12, long j13, boolean z13, boolean z14, @NotNull String locale, @NotNull String helpCenterLocale, boolean z15, boolean z16, @NotNull String helpCenterUrl, @NotNull Set<String> helpCenterUrls, @NotNull Set<String> features, @NotNull String launcherLogoUrl, @NotNull String teamGreeting, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, @Nullable ConfigModules configModules, @NotNull NexusConfig realTimeConfig, @NotNull AttachmentSettings attachmentSettings, boolean z22, @NotNull ConversationStateSyncSettings conversationStateSyncSettings, boolean z23) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(helpCenterLocale, "helpCenterLocale");
        Intrinsics.checkNotNullParameter(helpCenterUrl, "helpCenterUrl");
        Intrinsics.checkNotNullParameter(helpCenterUrls, "helpCenterUrls");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(launcherLogoUrl, "launcherLogoUrl");
        Intrinsics.checkNotNullParameter(teamGreeting, "teamGreeting");
        Intrinsics.checkNotNullParameter(realTimeConfig, "realTimeConfig");
        Intrinsics.checkNotNullParameter(attachmentSettings, "attachmentSettings");
        Intrinsics.checkNotNullParameter(conversationStateSyncSettings, "conversationStateSyncSettings");
        this.name = name;
        this.primaryColor = i10;
        this.secondaryColor = i11;
        this.secondaryColorDark = i12;
        this.isPrimaryColorRenderDarkText = z10;
        this.isSecondaryColorRenderDarkText = z11;
        this.isInboundMessages = z12;
        this.rateLimitCount = i13;
        this.rateLimitPeriodMs = j10;
        this.userUpdateCacheMaxAgeMs = j11;
        this.newSessionThresholdMs = j12;
        this.softResetTimeoutMs = j13;
        this.isMetricsEnabled = z13;
        this.isAudioEnabled = z14;
        this.locale = locale;
        this.helpCenterLocale = helpCenterLocale;
        this.isReceivedFromServer = z15;
        this.isBackgroundRequestsEnabled = z16;
        this.helpCenterUrl = helpCenterUrl;
        this.helpCenterUrls = helpCenterUrls;
        this.features = features;
        this.launcherLogoUrl = launcherLogoUrl;
        this.teamGreeting = teamGreeting;
        this.isIdentityVerificationEnabled = z17;
        this.isAccessToTeammateEnabled = z18;
        this.isHelpCenterRequireSearchEnabled = z19;
        this.isPreventMultipleInboundConversationsEnabled = z20;
        this.hasOpenConversations = z21;
        this.configModules = configModules;
        this.realTimeConfig = realTimeConfig;
        this.attachmentSettings = attachmentSettings;
        this.articleAutoReactionEnabled = z22;
        this.conversationStateSyncSettings = conversationStateSyncSettings;
        this.askUsersToAllowNotifications = z23;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppConfig copy$default(AppConfig appConfig, String str, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, int i13, long j10, long j11, long j12, long j13, boolean z13, boolean z14, String str2, String str3, boolean z15, boolean z16, String str4, Set set, Set set2, String str5, String str6, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ConfigModules configModules, NexusConfig nexusConfig, AttachmentSettings attachmentSettings, boolean z22, ConversationStateSyncSettings conversationStateSyncSettings, boolean z23, int i14, int i15, Object obj) {
        boolean z24;
        ConversationStateSyncSettings conversationStateSyncSettings2;
        String str7 = (i14 & 1) != 0 ? appConfig.name : str;
        int i16 = (i14 & 2) != 0 ? appConfig.primaryColor : i10;
        int i17 = (i14 & 4) != 0 ? appConfig.secondaryColor : i11;
        int i18 = (i14 & 8) != 0 ? appConfig.secondaryColorDark : i12;
        boolean z25 = (i14 & 16) != 0 ? appConfig.isPrimaryColorRenderDarkText : z10;
        boolean z26 = (i14 & 32) != 0 ? appConfig.isSecondaryColorRenderDarkText : z11;
        boolean z27 = (i14 & 64) != 0 ? appConfig.isInboundMessages : z12;
        int i19 = (i14 & 128) != 0 ? appConfig.rateLimitCount : i13;
        long j14 = (i14 & 256) != 0 ? appConfig.rateLimitPeriodMs : j10;
        long j15 = (i14 & 512) != 0 ? appConfig.userUpdateCacheMaxAgeMs : j11;
        long j16 = (i14 & 1024) != 0 ? appConfig.newSessionThresholdMs : j12;
        String str8 = str7;
        int i20 = i16;
        long j17 = (i14 & 2048) != 0 ? appConfig.softResetTimeoutMs : j13;
        boolean z28 = (i14 & 4096) != 0 ? appConfig.isMetricsEnabled : z13;
        boolean z29 = (i14 & 8192) != 0 ? appConfig.isAudioEnabled : z14;
        boolean z30 = z28;
        String str9 = (i14 & 16384) != 0 ? appConfig.locale : str2;
        String str10 = (i14 & 32768) != 0 ? appConfig.helpCenterLocale : str3;
        boolean z31 = (i14 & 65536) != 0 ? appConfig.isReceivedFromServer : z15;
        boolean z32 = (i14 & 131072) != 0 ? appConfig.isBackgroundRequestsEnabled : z16;
        String str11 = (i14 & 262144) != 0 ? appConfig.helpCenterUrl : str4;
        Set set3 = (i14 & 524288) != 0 ? appConfig.helpCenterUrls : set;
        Set set4 = (i14 & 1048576) != 0 ? appConfig.features : set2;
        String str12 = (i14 & 2097152) != 0 ? appConfig.launcherLogoUrl : str5;
        String str13 = (i14 & 4194304) != 0 ? appConfig.teamGreeting : str6;
        boolean z33 = (i14 & 8388608) != 0 ? appConfig.isIdentityVerificationEnabled : z17;
        boolean z34 = (i14 & 16777216) != 0 ? appConfig.isAccessToTeammateEnabled : z18;
        boolean z35 = (i14 & a.f115410j) != 0 ? appConfig.isHelpCenterRequireSearchEnabled : z19;
        boolean z36 = (i14 & 67108864) != 0 ? appConfig.isPreventMultipleInboundConversationsEnabled : z20;
        boolean z37 = (i14 & j.W0) != 0 ? appConfig.hasOpenConversations : z21;
        ConfigModules configModules2 = (i14 & 268435456) != 0 ? appConfig.configModules : configModules;
        NexusConfig nexusConfig2 = (i14 & 536870912) != 0 ? appConfig.realTimeConfig : nexusConfig;
        AttachmentSettings attachmentSettings2 = (i14 & 1073741824) != 0 ? appConfig.attachmentSettings : attachmentSettings;
        boolean z38 = (i14 & Integer.MIN_VALUE) != 0 ? appConfig.articleAutoReactionEnabled : z22;
        ConversationStateSyncSettings conversationStateSyncSettings3 = (i15 & 1) != 0 ? appConfig.conversationStateSyncSettings : conversationStateSyncSettings;
        if ((i15 & 2) != 0) {
            conversationStateSyncSettings2 = conversationStateSyncSettings3;
            z24 = appConfig.askUsersToAllowNotifications;
        } else {
            z24 = z23;
            conversationStateSyncSettings2 = conversationStateSyncSettings3;
        }
        return appConfig.copy(str8, i20, i17, i18, z25, z26, z27, i19, j14, j15, j16, j17, z30, z29, str9, str10, z31, z32, str11, set3, set4, str12, str13, z33, z34, z35, z36, z37, configModules2, nexusConfig2, attachmentSettings2, z38, conversationStateSyncSettings2, z24);
    }

    @kotlin.l(message = "Use IntercomTheme.colors.action instead")
    public static /* synthetic */ void getPrimaryColor$annotations() {
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final long component10() {
        return this.userUpdateCacheMaxAgeMs;
    }

    public final long component11() {
        return this.newSessionThresholdMs;
    }

    public final long component12() {
        return this.softResetTimeoutMs;
    }

    public final boolean component13() {
        return this.isMetricsEnabled;
    }

    public final boolean component14() {
        return this.isAudioEnabled;
    }

    @NotNull
    public final String component15() {
        return this.locale;
    }

    @NotNull
    public final String component16() {
        return this.helpCenterLocale;
    }

    public final boolean component17() {
        return this.isReceivedFromServer;
    }

    public final boolean component18() {
        return this.isBackgroundRequestsEnabled;
    }

    @NotNull
    public final String component19() {
        return this.helpCenterUrl;
    }

    public final int component2() {
        return this.primaryColor;
    }

    @NotNull
    public final Set<String> component20() {
        return this.helpCenterUrls;
    }

    @NotNull
    public final Set<String> component21() {
        return this.features;
    }

    @NotNull
    public final String component22() {
        return this.launcherLogoUrl;
    }

    @NotNull
    public final String component23() {
        return this.teamGreeting;
    }

    public final boolean component24() {
        return this.isIdentityVerificationEnabled;
    }

    public final boolean component25() {
        return this.isAccessToTeammateEnabled;
    }

    public final boolean component26() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    public final boolean component27() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    public final boolean component28() {
        return this.hasOpenConversations;
    }

    @Nullable
    public final ConfigModules component29() {
        return this.configModules;
    }

    public final int component3() {
        return this.secondaryColor;
    }

    @NotNull
    public final NexusConfig component30() {
        return this.realTimeConfig;
    }

    @NotNull
    public final AttachmentSettings component31() {
        return this.attachmentSettings;
    }

    public final boolean component32() {
        return this.articleAutoReactionEnabled;
    }

    @NotNull
    public final ConversationStateSyncSettings component33() {
        return this.conversationStateSyncSettings;
    }

    public final boolean component34() {
        return this.askUsersToAllowNotifications;
    }

    public final int component4() {
        return this.secondaryColorDark;
    }

    public final boolean component5() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean component6() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final boolean component7() {
        return this.isInboundMessages;
    }

    public final int component8() {
        return this.rateLimitCount;
    }

    public final long component9() {
        return this.rateLimitPeriodMs;
    }

    @NotNull
    public final AppConfig copy(@NotNull String name, @l int i10, @l int i11, @l int i12, boolean z10, boolean z11, boolean z12, int i13, long j10, long j11, long j12, long j13, boolean z13, boolean z14, @NotNull String locale, @NotNull String helpCenterLocale, boolean z15, boolean z16, @NotNull String helpCenterUrl, @NotNull Set<String> helpCenterUrls, @NotNull Set<String> features, @NotNull String launcherLogoUrl, @NotNull String teamGreeting, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, @Nullable ConfigModules configModules, @NotNull NexusConfig realTimeConfig, @NotNull AttachmentSettings attachmentSettings, boolean z22, @NotNull ConversationStateSyncSettings conversationStateSyncSettings, boolean z23) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(helpCenterLocale, "helpCenterLocale");
        Intrinsics.checkNotNullParameter(helpCenterUrl, "helpCenterUrl");
        Intrinsics.checkNotNullParameter(helpCenterUrls, "helpCenterUrls");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(launcherLogoUrl, "launcherLogoUrl");
        Intrinsics.checkNotNullParameter(teamGreeting, "teamGreeting");
        Intrinsics.checkNotNullParameter(realTimeConfig, "realTimeConfig");
        Intrinsics.checkNotNullParameter(attachmentSettings, "attachmentSettings");
        Intrinsics.checkNotNullParameter(conversationStateSyncSettings, "conversationStateSyncSettings");
        return new AppConfig(name, i10, i11, i12, z10, z11, z12, i13, j10, j11, j12, j13, z13, z14, locale, helpCenterLocale, z15, z16, helpCenterUrl, helpCenterUrls, features, launcherLogoUrl, teamGreeting, z17, z18, z19, z20, z21, configModules, realTimeConfig, attachmentSettings, z22, conversationStateSyncSettings, z23);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) obj;
        return Intrinsics.areEqual(this.name, appConfig.name) && this.primaryColor == appConfig.primaryColor && this.secondaryColor == appConfig.secondaryColor && this.secondaryColorDark == appConfig.secondaryColorDark && this.isPrimaryColorRenderDarkText == appConfig.isPrimaryColorRenderDarkText && this.isSecondaryColorRenderDarkText == appConfig.isSecondaryColorRenderDarkText && this.isInboundMessages == appConfig.isInboundMessages && this.rateLimitCount == appConfig.rateLimitCount && this.rateLimitPeriodMs == appConfig.rateLimitPeriodMs && this.userUpdateCacheMaxAgeMs == appConfig.userUpdateCacheMaxAgeMs && this.newSessionThresholdMs == appConfig.newSessionThresholdMs && this.softResetTimeoutMs == appConfig.softResetTimeoutMs && this.isMetricsEnabled == appConfig.isMetricsEnabled && this.isAudioEnabled == appConfig.isAudioEnabled && Intrinsics.areEqual(this.locale, appConfig.locale) && Intrinsics.areEqual(this.helpCenterLocale, appConfig.helpCenterLocale) && this.isReceivedFromServer == appConfig.isReceivedFromServer && this.isBackgroundRequestsEnabled == appConfig.isBackgroundRequestsEnabled && Intrinsics.areEqual(this.helpCenterUrl, appConfig.helpCenterUrl) && Intrinsics.areEqual(this.helpCenterUrls, appConfig.helpCenterUrls) && Intrinsics.areEqual(this.features, appConfig.features) && Intrinsics.areEqual(this.launcherLogoUrl, appConfig.launcherLogoUrl) && Intrinsics.areEqual(this.teamGreeting, appConfig.teamGreeting) && this.isIdentityVerificationEnabled == appConfig.isIdentityVerificationEnabled && this.isAccessToTeammateEnabled == appConfig.isAccessToTeammateEnabled && this.isHelpCenterRequireSearchEnabled == appConfig.isHelpCenterRequireSearchEnabled && this.isPreventMultipleInboundConversationsEnabled == appConfig.isPreventMultipleInboundConversationsEnabled && this.hasOpenConversations == appConfig.hasOpenConversations && Intrinsics.areEqual(this.configModules, appConfig.configModules) && Intrinsics.areEqual(this.realTimeConfig, appConfig.realTimeConfig) && Intrinsics.areEqual(this.attachmentSettings, appConfig.attachmentSettings) && this.articleAutoReactionEnabled == appConfig.articleAutoReactionEnabled && Intrinsics.areEqual(this.conversationStateSyncSettings, appConfig.conversationStateSyncSettings) && this.askUsersToAllowNotifications == appConfig.askUsersToAllowNotifications;
    }

    public final boolean getArticleAutoReactionEnabled() {
        return this.articleAutoReactionEnabled;
    }

    public final boolean getAskUsersToAllowNotifications() {
        return this.askUsersToAllowNotifications;
    }

    @NotNull
    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    @Nullable
    public final ConfigModules getConfigModules() {
        return this.configModules;
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

    @NotNull
    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    @NotNull
    public final Set<String> getHelpCenterUrls() {
        return this.helpCenterUrls;
    }

    @NotNull
    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getNewSessionThresholdMs() {
        return this.newSessionThresholdMs;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    public final long getRateLimitPeriodMs() {
        return this.rateLimitPeriodMs;
    }

    @NotNull
    public final NexusConfig getRealTimeConfig() {
        return this.realTimeConfig;
    }

    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    public final int getSecondaryColorDark() {
        return this.secondaryColorDark;
    }

    public final long getSoftResetTimeoutMs() {
        return this.softResetTimeoutMs;
    }

    @Nullable
    public final String getSpaceLabelIfExists(@NotNull Space.Type space) {
        HomeConfig home;
        OpenConfig openConfig;
        List<Space> spaces;
        Object next;
        Intrinsics.checkNotNullParameter(space, "space");
        ConfigModules configModules = this.configModules;
        if (configModules != null && (home = configModules.getHome()) != null && (openConfig = home.getOpenConfig()) != null && (spaces = openConfig.getSpaces()) != null) {
            Iterator<T> it = spaces.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Space) next).getType() != space);
            Space space2 = (Space) next;
            if (space2 != null) {
                return space2.getLabel();
            }
        }
        return null;
    }

    @NotNull
    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    public final long getUserUpdateCacheMaxAgeMs() {
        return this.userUpdateCacheMaxAgeMs;
    }

    public final boolean hasFeature(@NotNull String feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return this.features.contains(feature);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((this.name.hashCode() * 31) + Integer.hashCode(this.primaryColor)) * 31) + Integer.hashCode(this.secondaryColor)) * 31) + Integer.hashCode(this.secondaryColorDark)) * 31) + Boolean.hashCode(this.isPrimaryColorRenderDarkText)) * 31) + Boolean.hashCode(this.isSecondaryColorRenderDarkText)) * 31) + Boolean.hashCode(this.isInboundMessages)) * 31) + Integer.hashCode(this.rateLimitCount)) * 31) + Long.hashCode(this.rateLimitPeriodMs)) * 31) + Long.hashCode(this.userUpdateCacheMaxAgeMs)) * 31) + Long.hashCode(this.newSessionThresholdMs)) * 31) + Long.hashCode(this.softResetTimeoutMs)) * 31) + Boolean.hashCode(this.isMetricsEnabled)) * 31) + Boolean.hashCode(this.isAudioEnabled)) * 31) + this.locale.hashCode()) * 31) + this.helpCenterLocale.hashCode()) * 31) + Boolean.hashCode(this.isReceivedFromServer)) * 31) + Boolean.hashCode(this.isBackgroundRequestsEnabled)) * 31) + this.helpCenterUrl.hashCode()) * 31) + this.helpCenterUrls.hashCode()) * 31) + this.features.hashCode()) * 31) + this.launcherLogoUrl.hashCode()) * 31) + this.teamGreeting.hashCode()) * 31) + Boolean.hashCode(this.isIdentityVerificationEnabled)) * 31) + Boolean.hashCode(this.isAccessToTeammateEnabled)) * 31) + Boolean.hashCode(this.isHelpCenterRequireSearchEnabled)) * 31) + Boolean.hashCode(this.isPreventMultipleInboundConversationsEnabled)) * 31) + Boolean.hashCode(this.hasOpenConversations)) * 31;
        ConfigModules configModules = this.configModules;
        return ((((((((((iHashCode + (configModules == null ? 0 : configModules.hashCode())) * 31) + this.realTimeConfig.hashCode()) * 31) + this.attachmentSettings.hashCode()) * 31) + Boolean.hashCode(this.articleAutoReactionEnabled)) * 31) + this.conversationStateSyncSettings.hashCode()) * 31) + Boolean.hashCode(this.askUsersToAllowNotifications);
    }

    public final boolean isAccessToTeammateEnabled() {
        return this.isAccessToTeammateEnabled;
    }

    public final boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public final boolean isBackgroundRequestsDisabled() {
        return !this.isBackgroundRequestsEnabled;
    }

    public final boolean isBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean isHelpCenterRequireSearchEnabled() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    public final boolean isIdentityVerificationEnabled() {
        return this.isIdentityVerificationEnabled;
    }

    public final boolean isInboundMessages() {
        return this.isInboundMessages;
    }

    public final boolean isMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    public final boolean isPreventMultipleInboundConversationsEnabled() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    public final boolean isPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean isReceivedFromServer() {
        return this.isReceivedFromServer;
    }

    public final boolean isSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final boolean isSpaceEnabled(@NotNull Space.Type space) {
        HomeConfig home;
        OpenConfig openConfig;
        List<Space> spaces;
        Intrinsics.checkNotNullParameter(space, "space");
        ConfigModules configModules = this.configModules;
        if (configModules != null && (home = configModules.getHome()) != null && (openConfig = home.getOpenConfig()) != null && (spaces = openConfig.getSpaces()) != null) {
            List<Space> list = spaces;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Space) it.next()).getType() == space) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "AppConfig(name=" + this.name + ", primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", secondaryColorDark=" + this.secondaryColorDark + ", isPrimaryColorRenderDarkText=" + this.isPrimaryColorRenderDarkText + ", isSecondaryColorRenderDarkText=" + this.isSecondaryColorRenderDarkText + ", isInboundMessages=" + this.isInboundMessages + ", rateLimitCount=" + this.rateLimitCount + ", rateLimitPeriodMs=" + this.rateLimitPeriodMs + ", userUpdateCacheMaxAgeMs=" + this.userUpdateCacheMaxAgeMs + ", newSessionThresholdMs=" + this.newSessionThresholdMs + ", softResetTimeoutMs=" + this.softResetTimeoutMs + ", isMetricsEnabled=" + this.isMetricsEnabled + ", isAudioEnabled=" + this.isAudioEnabled + ", locale=" + this.locale + ", helpCenterLocale=" + this.helpCenterLocale + ", isReceivedFromServer=" + this.isReceivedFromServer + ", isBackgroundRequestsEnabled=" + this.isBackgroundRequestsEnabled + ", helpCenterUrl=" + this.helpCenterUrl + ", helpCenterUrls=" + this.helpCenterUrls + ", features=" + this.features + ", launcherLogoUrl=" + this.launcherLogoUrl + ", teamGreeting=" + this.teamGreeting + ", isIdentityVerificationEnabled=" + this.isIdentityVerificationEnabled + ", isAccessToTeammateEnabled=" + this.isAccessToTeammateEnabled + ", isHelpCenterRequireSearchEnabled=" + this.isHelpCenterRequireSearchEnabled + ", isPreventMultipleInboundConversationsEnabled=" + this.isPreventMultipleInboundConversationsEnabled + ", hasOpenConversations=" + this.hasOpenConversations + ", configModules=" + this.configModules + ", realTimeConfig=" + this.realTimeConfig + ", attachmentSettings=" + this.attachmentSettings + ", articleAutoReactionEnabled=" + this.articleAutoReactionEnabled + ", conversationStateSyncSettings=" + this.conversationStateSyncSettings + ", askUsersToAllowNotifications=" + this.askUsersToAllowNotifications + ')';
    }
}
