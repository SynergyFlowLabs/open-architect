package com.superwall.sdk.network;

import com.superwall.sdk.config.options.SuperwallOptions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class Api {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String scheme = "https";

    @NotNull
    public static final String subscriptionsv1 = "/subscriptions-api/public/v1/";

    @NotNull
    public static final String version1 = "/api/v1/";

    @NotNull
    private final Base base;

    @NotNull
    private final Collector collector;

    @NotNull
    private final Enrichment enrichment;

    @NotNull
    private final String hostDomain;

    @NotNull
    private final Subscriptions subscription;

    public static final class Base {

        @NotNull
        private final SuperwallOptions.NetworkEnvironment networkEnvironment;

        public Base(@NotNull SuperwallOptions.NetworkEnvironment networkEnvironment) {
            Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
            this.networkEnvironment = networkEnvironment;
        }

        private final SuperwallOptions.NetworkEnvironment component1() {
            return this.networkEnvironment;
        }

        public static /* synthetic */ Base copy$default(Base base, SuperwallOptions.NetworkEnvironment networkEnvironment, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                networkEnvironment = base.networkEnvironment;
            }
            return base.copy(networkEnvironment);
        }

        @NotNull
        public final Base copy(@NotNull SuperwallOptions.NetworkEnvironment networkEnvironment) {
            Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
            return new Base(networkEnvironment);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Base) && Intrinsics.areEqual(this.networkEnvironment, ((Base) obj).networkEnvironment);
        }

        @NotNull
        public final String getHost() {
            return this.networkEnvironment.getBaseHost();
        }

        public int hashCode() {
            return this.networkEnvironment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Base(networkEnvironment=" + this.networkEnvironment + ")";
        }
    }

    public static final class Collector {

        @NotNull
        private final SuperwallOptions.NetworkEnvironment networkEnvironment;

        public Collector(@NotNull SuperwallOptions.NetworkEnvironment networkEnvironment) {
            Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
            this.networkEnvironment = networkEnvironment;
        }

        private final SuperwallOptions.NetworkEnvironment component1() {
            return this.networkEnvironment;
        }

        public static /* synthetic */ Collector copy$default(Collector collector, SuperwallOptions.NetworkEnvironment networkEnvironment, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                networkEnvironment = collector.networkEnvironment;
            }
            return collector.copy(networkEnvironment);
        }

        @NotNull
        public final Collector copy(@NotNull SuperwallOptions.NetworkEnvironment networkEnvironment) {
            Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
            return new Collector(networkEnvironment);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Collector) && Intrinsics.areEqual(this.networkEnvironment, ((Collector) obj).networkEnvironment);
        }

        @NotNull
        public final String getHost() {
            return this.networkEnvironment.getCollectorHost();
        }

        public int hashCode() {
            return this.networkEnvironment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Collector(networkEnvironment=" + this.networkEnvironment + ")";
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Enrichment {

        @NotNull
        private final SuperwallOptions.NetworkEnvironment networkEnvironment;

        public Enrichment(@NotNull SuperwallOptions.NetworkEnvironment networkEnvironment) {
            Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
            this.networkEnvironment = networkEnvironment;
        }

        private final SuperwallOptions.NetworkEnvironment component1() {
            return this.networkEnvironment;
        }

        public static /* synthetic */ Enrichment copy$default(Enrichment enrichment, SuperwallOptions.NetworkEnvironment networkEnvironment, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                networkEnvironment = enrichment.networkEnvironment;
            }
            return enrichment.copy(networkEnvironment);
        }

        @NotNull
        public final Enrichment copy(@NotNull SuperwallOptions.NetworkEnvironment networkEnvironment) {
            Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
            return new Enrichment(networkEnvironment);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Enrichment) && Intrinsics.areEqual(this.networkEnvironment, ((Enrichment) obj).networkEnvironment);
        }

        @NotNull
        public final String getHost() {
            return this.networkEnvironment.getEnrichmentHost();
        }

        public int hashCode() {
            return this.networkEnvironment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Enrichment(networkEnvironment=" + this.networkEnvironment + ")";
        }
    }

    public static final class Subscriptions {

        @NotNull
        private final SuperwallOptions.NetworkEnvironment networkEnvironment;

        public Subscriptions(@NotNull SuperwallOptions.NetworkEnvironment networkEnvironment) {
            Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
            this.networkEnvironment = networkEnvironment;
        }

        private final SuperwallOptions.NetworkEnvironment component1() {
            return this.networkEnvironment;
        }

        public static /* synthetic */ Subscriptions copy$default(Subscriptions subscriptions, SuperwallOptions.NetworkEnvironment networkEnvironment, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                networkEnvironment = subscriptions.networkEnvironment;
            }
            return subscriptions.copy(networkEnvironment);
        }

        @NotNull
        public final Subscriptions copy(@NotNull SuperwallOptions.NetworkEnvironment networkEnvironment) {
            Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
            return new Subscriptions(networkEnvironment);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Subscriptions) && Intrinsics.areEqual(this.networkEnvironment, ((Subscriptions) obj).networkEnvironment);
        }

        @NotNull
        public final String getHost() {
            return this.networkEnvironment.getSubscriptionHost();
        }

        public int hashCode() {
            return this.networkEnvironment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Subscriptions(networkEnvironment=" + this.networkEnvironment + ")";
        }
    }

    public Api(@NotNull String hostDomain, @NotNull Base base, @NotNull Collector collector, @NotNull Enrichment enrichment, @NotNull Subscriptions subscription) {
        Intrinsics.checkNotNullParameter(hostDomain, "hostDomain");
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(enrichment, "enrichment");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.hostDomain = hostDomain;
        this.base = base;
        this.collector = collector;
        this.enrichment = enrichment;
        this.subscription = subscription;
    }

    public static /* synthetic */ Api copy$default(Api api, String str, Base base, Collector collector, Enrichment enrichment, Subscriptions subscriptions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = api.hostDomain;
        }
        if ((i10 & 2) != 0) {
            base = api.base;
        }
        if ((i10 & 4) != 0) {
            collector = api.collector;
        }
        if ((i10 & 8) != 0) {
            enrichment = api.enrichment;
        }
        if ((i10 & 16) != 0) {
            subscriptions = api.subscription;
        }
        Subscriptions subscriptions2 = subscriptions;
        Collector collector2 = collector;
        return api.copy(str, base, collector2, enrichment, subscriptions2);
    }

    @NotNull
    public final String component1() {
        return this.hostDomain;
    }

    @NotNull
    public final Base component2() {
        return this.base;
    }

    @NotNull
    public final Collector component3() {
        return this.collector;
    }

    @NotNull
    public final Enrichment component4() {
        return this.enrichment;
    }

    @NotNull
    public final Subscriptions component5() {
        return this.subscription;
    }

    @NotNull
    public final Api copy(@NotNull String hostDomain, @NotNull Base base, @NotNull Collector collector, @NotNull Enrichment enrichment, @NotNull Subscriptions subscription) {
        Intrinsics.checkNotNullParameter(hostDomain, "hostDomain");
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(enrichment, "enrichment");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        return new Api(hostDomain, base, collector, enrichment, subscription);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Api)) {
            return false;
        }
        Api api = (Api) obj;
        return Intrinsics.areEqual(this.hostDomain, api.hostDomain) && Intrinsics.areEqual(this.base, api.base) && Intrinsics.areEqual(this.collector, api.collector) && Intrinsics.areEqual(this.enrichment, api.enrichment) && Intrinsics.areEqual(this.subscription, api.subscription);
    }

    @NotNull
    public final Base getBase() {
        return this.base;
    }

    @NotNull
    public final Collector getCollector() {
        return this.collector;
    }

    @NotNull
    public final Enrichment getEnrichment() {
        return this.enrichment;
    }

    @NotNull
    public final String getHostDomain() {
        return this.hostDomain;
    }

    @NotNull
    public final Subscriptions getSubscription() {
        return this.subscription;
    }

    public int hashCode() {
        return (((((((this.hostDomain.hashCode() * 31) + this.base.hashCode()) * 31) + this.collector.hashCode()) * 31) + this.enrichment.hashCode()) * 31) + this.subscription.hashCode();
    }

    @NotNull
    public String toString() {
        return "Api(hostDomain=" + this.hostDomain + ", base=" + this.base + ", collector=" + this.collector + ", enrichment=" + this.enrichment + ", subscription=" + this.subscription + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Api(@NotNull SuperwallOptions.NetworkEnvironment networkEnvironment) {
        this(networkEnvironment.getHostDomain(), new Base(networkEnvironment), new Collector(networkEnvironment), new Enrichment(networkEnvironment), new Subscriptions(networkEnvironment));
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
    }
}
