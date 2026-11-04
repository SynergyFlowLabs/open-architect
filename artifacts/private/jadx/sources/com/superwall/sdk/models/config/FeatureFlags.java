package com.superwall.sdk.models.config;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class FeatureFlags {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private boolean disableVerboseEvents;
    private boolean enableCELLogging;
    private boolean enableConfigRefresh;
    private boolean enableMultiplePaywallUrls;
    private boolean enablePostback;
    private boolean enableSessionEvents;
    private boolean enableUserIdSeed;
    private boolean web2App;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<FeatureFlags> serializer() {
            return FeatureFlags$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FeatureFlags(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, v2 v2Var) {
        if (255 != (i10 & 255)) {
            g2.b(i10, 255, FeatureFlags$$serializer.INSTANCE.getDescriptor());
        }
        this.enableConfigRefresh = z10;
        this.enableSessionEvents = z11;
        this.enablePostback = z12;
        this.enableUserIdSeed = z13;
        this.disableVerboseEvents = z14;
        this.enableMultiplePaywallUrls = z15;
        this.enableCELLogging = z16;
        this.web2App = z17;
    }

    public static /* synthetic */ FeatureFlags copy$default(FeatureFlags featureFlags, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = featureFlags.enableConfigRefresh;
        }
        if ((i10 & 2) != 0) {
            z11 = featureFlags.enableSessionEvents;
        }
        if ((i10 & 4) != 0) {
            z12 = featureFlags.enablePostback;
        }
        if ((i10 & 8) != 0) {
            z13 = featureFlags.enableUserIdSeed;
        }
        if ((i10 & 16) != 0) {
            z14 = featureFlags.disableVerboseEvents;
        }
        if ((i10 & 32) != 0) {
            z15 = featureFlags.enableMultiplePaywallUrls;
        }
        if ((i10 & 64) != 0) {
            z16 = featureFlags.enableCELLogging;
        }
        if ((i10 & 128) != 0) {
            z17 = featureFlags.web2App;
        }
        boolean z18 = z16;
        boolean z19 = z17;
        boolean z20 = z14;
        boolean z21 = z15;
        return featureFlags.copy(z10, z11, z12, z13, z20, z21, z18, z19);
    }

    @a0("disable_verbose_events")
    public static /* synthetic */ void getDisableVerboseEvents$annotations() {
    }

    @a0("enable_cel_logging")
    public static /* synthetic */ void getEnableCELLogging$annotations() {
    }

    @a0("enable_config_refresh_v2")
    public static /* synthetic */ void getEnableConfigRefresh$annotations() {
    }

    @a0("enable_multiple_paywall_urls")
    public static /* synthetic */ void getEnableMultiplePaywallUrls$annotations() {
    }

    @a0("enable_postback")
    public static /* synthetic */ void getEnablePostback$annotations() {
    }

    @a0("enable_session_events")
    public static /* synthetic */ void getEnableSessionEvents$annotations() {
    }

    @a0("enable_userid_seed")
    public static /* synthetic */ void getEnableUserIdSeed$annotations() {
    }

    @a0("web_2_app")
    public static /* synthetic */ void getWeb2App$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(FeatureFlags featureFlags, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeBooleanElement(serialDescriptor, 0, featureFlags.enableConfigRefresh);
        eVar.encodeBooleanElement(serialDescriptor, 1, featureFlags.enableSessionEvents);
        eVar.encodeBooleanElement(serialDescriptor, 2, featureFlags.enablePostback);
        eVar.encodeBooleanElement(serialDescriptor, 3, featureFlags.enableUserIdSeed);
        eVar.encodeBooleanElement(serialDescriptor, 4, featureFlags.disableVerboseEvents);
        eVar.encodeBooleanElement(serialDescriptor, 5, featureFlags.enableMultiplePaywallUrls);
        eVar.encodeBooleanElement(serialDescriptor, 6, featureFlags.enableCELLogging);
        eVar.encodeBooleanElement(serialDescriptor, 7, featureFlags.web2App);
    }

    public final boolean component1() {
        return this.enableConfigRefresh;
    }

    public final boolean component2() {
        return this.enableSessionEvents;
    }

    public final boolean component3() {
        return this.enablePostback;
    }

    public final boolean component4() {
        return this.enableUserIdSeed;
    }

    public final boolean component5() {
        return this.disableVerboseEvents;
    }

    public final boolean component6() {
        return this.enableMultiplePaywallUrls;
    }

    public final boolean component7() {
        return this.enableCELLogging;
    }

    public final boolean component8() {
        return this.web2App;
    }

    @NotNull
    public final FeatureFlags copy(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        return new FeatureFlags(z10, z11, z12, z13, z14, z15, z16, z17);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureFlags)) {
            return false;
        }
        FeatureFlags featureFlags = (FeatureFlags) obj;
        return this.enableConfigRefresh == featureFlags.enableConfigRefresh && this.enableSessionEvents == featureFlags.enableSessionEvents && this.enablePostback == featureFlags.enablePostback && this.enableUserIdSeed == featureFlags.enableUserIdSeed && this.disableVerboseEvents == featureFlags.disableVerboseEvents && this.enableMultiplePaywallUrls == featureFlags.enableMultiplePaywallUrls && this.enableCELLogging == featureFlags.enableCELLogging && this.web2App == featureFlags.web2App;
    }

    public final boolean getDisableVerboseEvents() {
        return this.disableVerboseEvents;
    }

    public final boolean getEnableCELLogging() {
        return this.enableCELLogging;
    }

    public final boolean getEnableConfigRefresh() {
        return this.enableConfigRefresh;
    }

    public final boolean getEnableMultiplePaywallUrls() {
        return this.enableMultiplePaywallUrls;
    }

    public final boolean getEnablePostback() {
        return this.enablePostback;
    }

    public final boolean getEnableSessionEvents() {
        return this.enableSessionEvents;
    }

    public final boolean getEnableUserIdSeed() {
        return this.enableUserIdSeed;
    }

    public final boolean getWeb2App() {
        return this.web2App;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.enableConfigRefresh) * 31) + Boolean.hashCode(this.enableSessionEvents)) * 31) + Boolean.hashCode(this.enablePostback)) * 31) + Boolean.hashCode(this.enableUserIdSeed)) * 31) + Boolean.hashCode(this.disableVerboseEvents)) * 31) + Boolean.hashCode(this.enableMultiplePaywallUrls)) * 31) + Boolean.hashCode(this.enableCELLogging)) * 31) + Boolean.hashCode(this.web2App);
    }

    public final void setDisableVerboseEvents(boolean z10) {
        this.disableVerboseEvents = z10;
    }

    public final void setEnableCELLogging(boolean z10) {
        this.enableCELLogging = z10;
    }

    public final void setEnableConfigRefresh(boolean z10) {
        this.enableConfigRefresh = z10;
    }

    public final void setEnableMultiplePaywallUrls(boolean z10) {
        this.enableMultiplePaywallUrls = z10;
    }

    public final void setEnablePostback(boolean z10) {
        this.enablePostback = z10;
    }

    public final void setEnableSessionEvents(boolean z10) {
        this.enableSessionEvents = z10;
    }

    public final void setEnableUserIdSeed(boolean z10) {
        this.enableUserIdSeed = z10;
    }

    public final void setWeb2App(boolean z10) {
        this.web2App = z10;
    }

    @NotNull
    public String toString() {
        return "FeatureFlags(enableConfigRefresh=" + this.enableConfigRefresh + ", enableSessionEvents=" + this.enableSessionEvents + ", enablePostback=" + this.enablePostback + ", enableUserIdSeed=" + this.enableUserIdSeed + ", disableVerboseEvents=" + this.disableVerboseEvents + ", enableMultiplePaywallUrls=" + this.enableMultiplePaywallUrls + ", enableCELLogging=" + this.enableCELLogging + ", web2App=" + this.web2App + ")";
    }

    public FeatureFlags(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.enableConfigRefresh = z10;
        this.enableSessionEvents = z11;
        this.enablePostback = z12;
        this.enableUserIdSeed = z13;
        this.disableVerboseEvents = z14;
        this.enableMultiplePaywallUrls = z15;
        this.enableCELLogging = z16;
        this.web2App = z17;
    }
}
