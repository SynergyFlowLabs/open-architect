package com.superwall.sdk.config.options;

import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.network.Api;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class SuperwallOptions {
    private boolean enableExperimentalDeviceVariables;
    private boolean isGameControllerEnabled;

    @Nullable
    private String localeIdentifier;
    private boolean passIdentifiersToPlayStore;
    private boolean shouldObservePurchases;

    @NotNull
    private PaywallOptions paywalls = new PaywallOptions();

    @NotNull
    private NetworkEnvironment networkEnvironment = new NetworkEnvironment.Release();
    private boolean isExternalDataCollectionEnabled = true;

    @NotNull
    private Logging logging = new Logging();

    public static final class Logging {

        @NotNull
        private LogLevel level = LogLevel.warn;

        @NotNull
        private EnumSet<LogScope> scopes;

        public Logging() {
            EnumSet<LogScope> enumSetOf = EnumSet.of(LogScope.all);
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
            this.scopes = enumSetOf;
        }

        @NotNull
        public final LogLevel getLevel() {
            return this.level;
        }

        @NotNull
        public final EnumSet<LogScope> getScopes() {
            return this.scopes;
        }

        public final void setLevel(@NotNull LogLevel logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "<set-?>");
            this.level = logLevel;
        }

        public final void setScopes(@NotNull EnumSet<LogScope> enumSet) {
            Intrinsics.checkNotNullParameter(enumSet, "<set-?>");
            this.scopes = enumSet;
        }
    }

    public static class NetworkEnvironment {

        @NotNull
        private final String hostDomain;

        public static final class Custom extends NetworkEnvironment {

            @NotNull
            private final String baseHost;

            @NotNull
            private final String collectorHost;

            @Nullable
            private final Integer port;

            @NotNull
            private final String scheme;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Custom(@NotNull String baseHost, @NotNull String collectorHost, @NotNull String scheme, @Nullable Integer num) {
                super(baseHost);
                Intrinsics.checkNotNullParameter(baseHost, "baseHost");
                Intrinsics.checkNotNullParameter(collectorHost, "collectorHost");
                Intrinsics.checkNotNullParameter(scheme, "scheme");
                this.baseHost = baseHost;
                this.collectorHost = collectorHost;
                this.scheme = scheme;
                this.port = num;
            }

            @Override // com.superwall.sdk.config.options.SuperwallOptions.NetworkEnvironment
            @NotNull
            public String getBaseHost() {
                return this.baseHost;
            }

            @Override // com.superwall.sdk.config.options.SuperwallOptions.NetworkEnvironment
            @NotNull
            public String getCollectorHost() {
                return this.collectorHost;
            }

            @Override // com.superwall.sdk.config.options.SuperwallOptions.NetworkEnvironment
            @Nullable
            public Integer getPort() {
                return this.port;
            }

            @Override // com.superwall.sdk.config.options.SuperwallOptions.NetworkEnvironment
            @NotNull
            public String getScheme() {
                return this.scheme;
            }
        }

        public static final class Developer extends NetworkEnvironment {
            public Developer() {
                super("superwall.dev");
            }
        }

        public static final class Release extends NetworkEnvironment {
            public Release() {
                super("superwall.me");
            }
        }

        public static final class ReleaseCandidate extends NetworkEnvironment {
            public ReleaseCandidate() {
                super("superwallcanary.com");
            }
        }

        public NetworkEnvironment(@NotNull String hostDomain) {
            Intrinsics.checkNotNullParameter(hostDomain, "hostDomain");
            this.hostDomain = hostDomain;
        }

        @NotNull
        public String getBaseHost() {
            return "api." + getHostDomain();
        }

        @NotNull
        public String getCollectorHost() {
            return "collector." + getHostDomain();
        }

        @NotNull
        public String getEnrichmentHost() {
            return this instanceof Release ? "enrichment-api.superwall.com" : "enrichment-api.superwall.dev";
        }

        @NotNull
        public String getHostDomain() {
            return this.hostDomain;
        }

        @Nullable
        public Integer getPort() {
            return null;
        }

        @NotNull
        public String getScheme() {
            return Api.scheme;
        }

        @NotNull
        public String getSubscriptionHost() {
            return this instanceof Release ? "subscriptions-api.superwall.com" : "subscriptions-api.superwall.dev";
        }
    }

    public final boolean getEnableExperimentalDeviceVariables() {
        return this.enableExperimentalDeviceVariables;
    }

    @Nullable
    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    @NotNull
    public final Logging getLogging() {
        return this.logging;
    }

    @NotNull
    public final NetworkEnvironment getNetworkEnvironment() {
        return this.networkEnvironment;
    }

    public final boolean getPassIdentifiersToPlayStore() {
        return this.passIdentifiersToPlayStore;
    }

    @NotNull
    public final PaywallOptions getPaywalls() {
        return this.paywalls;
    }

    public final boolean getShouldObservePurchases() {
        return this.shouldObservePurchases;
    }

    public final boolean isExternalDataCollectionEnabled() {
        return this.isExternalDataCollectionEnabled;
    }

    public final boolean isGameControllerEnabled() {
        return this.isGameControllerEnabled;
    }

    public final void setEnableExperimentalDeviceVariables(boolean z10) {
        this.enableExperimentalDeviceVariables = z10;
    }

    public final void setExternalDataCollectionEnabled(boolean z10) {
        this.isExternalDataCollectionEnabled = z10;
    }

    public final void setGameControllerEnabled(boolean z10) {
        this.isGameControllerEnabled = z10;
    }

    public final void setLocaleIdentifier(@Nullable String str) {
        this.localeIdentifier = str;
    }

    public final void setLogging(@NotNull Logging logging) {
        Intrinsics.checkNotNullParameter(logging, "<set-?>");
        this.logging = logging;
    }

    public final void setNetworkEnvironment(@NotNull NetworkEnvironment networkEnvironment) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "<set-?>");
        this.networkEnvironment = networkEnvironment;
    }

    public final void setPassIdentifiersToPlayStore(boolean z10) {
        this.passIdentifiersToPlayStore = z10;
    }

    public final void setPaywalls(@NotNull PaywallOptions paywallOptions) {
        Intrinsics.checkNotNullParameter(paywallOptions, "<set-?>");
        this.paywalls = paywallOptions;
    }

    public final void setShouldObservePurchases(boolean z10) {
        this.shouldObservePurchases = z10;
    }
}
