package com.superwall.sdk.models.paywall;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class PaywallWebviewUrl {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int score;
    private final long timeout;

    @NotNull
    private final String url;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<PaywallWebviewUrl> serializer() {
            return PaywallWebviewUrl$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    public static final class Config {

        @NotNull
        private final List<PaywallWebviewUrl> endpoints;
        private final int maxAttempts;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {null, new kotlinx.serialization.internal.f(PaywallWebviewUrl$$serializer.INSTANCE)};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Config> serializer() {
                return PaywallWebviewUrl$Config$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            int i10 = 2 ^ 1;
        }

        public /* synthetic */ Config(int i10, int i11, List list, v2 v2Var) {
            if (3 != (i10 & 3)) {
                g2.b(i10, 3, PaywallWebviewUrl$Config$$serializer.INSTANCE.getDescriptor());
            }
            this.maxAttempts = i11;
            this.endpoints = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Config copy$default(Config config, int i10, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = config.maxAttempts;
            }
            if ((i11 & 2) != 0) {
                list = config.endpoints;
            }
            return config.copy(i10, list);
        }

        @a0("endpoints")
        public static /* synthetic */ void getEndpoints$annotations() {
        }

        @a0("max_attempts")
        public static /* synthetic */ void getMaxAttempts$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Config config, e eVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            eVar.encodeIntElement(serialDescriptor, 0, config.maxAttempts);
            eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], config.endpoints);
        }

        public final int component1() {
            return this.maxAttempts;
        }

        @NotNull
        public final List<PaywallWebviewUrl> component2() {
            return this.endpoints;
        }

        @NotNull
        public final Config copy(int i10, @NotNull List<PaywallWebviewUrl> endpoints) {
            Intrinsics.checkNotNullParameter(endpoints, "endpoints");
            return new Config(i10, endpoints);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.maxAttempts == config.maxAttempts && Intrinsics.areEqual(this.endpoints, config.endpoints);
        }

        @NotNull
        public final List<PaywallWebviewUrl> getEndpoints() {
            return this.endpoints;
        }

        public final int getMaxAttempts() {
            return this.maxAttempts;
        }

        public int hashCode() {
            return (Integer.hashCode(this.maxAttempts) * 31) + this.endpoints.hashCode();
        }

        @NotNull
        public String toString() {
            return "Config(maxAttempts=" + this.maxAttempts + ", endpoints=" + this.endpoints + ")";
        }

        public Config(int i10, @NotNull List<PaywallWebviewUrl> endpoints) {
            Intrinsics.checkNotNullParameter(endpoints, "endpoints");
            this.maxAttempts = i10;
            this.endpoints = endpoints;
        }
    }

    public /* synthetic */ PaywallWebviewUrl(int i10, String str, long j10, int i11, v2 v2Var) {
        if (7 != (i10 & 7)) {
            g2.b(i10, 7, PaywallWebviewUrl$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        this.timeout = j10;
        this.score = i11;
    }

    public static /* synthetic */ PaywallWebviewUrl copy$default(PaywallWebviewUrl paywallWebviewUrl, String str, long j10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paywallWebviewUrl.url;
        }
        if ((i11 & 2) != 0) {
            j10 = paywallWebviewUrl.timeout;
        }
        if ((i11 & 4) != 0) {
            i10 = paywallWebviewUrl.score;
        }
        return paywallWebviewUrl.copy(str, j10, i10);
    }

    @a0("percentage")
    public static /* synthetic */ void getScore$annotations() {
    }

    @a0("timeout_ms")
    public static /* synthetic */ void getTimeout$annotations() {
    }

    @a0("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(PaywallWebviewUrl paywallWebviewUrl, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, paywallWebviewUrl.url);
        eVar.encodeLongElement(serialDescriptor, 1, paywallWebviewUrl.timeout);
        eVar.encodeIntElement(serialDescriptor, 2, paywallWebviewUrl.score);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    public final long component2() {
        return this.timeout;
    }

    public final int component3() {
        return this.score;
    }

    @NotNull
    public final PaywallWebviewUrl copy(@NotNull String url, long j10, int i10) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new PaywallWebviewUrl(url, j10, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallWebviewUrl)) {
            return false;
        }
        PaywallWebviewUrl paywallWebviewUrl = (PaywallWebviewUrl) obj;
        return Intrinsics.areEqual(this.url, paywallWebviewUrl.url) && this.timeout == paywallWebviewUrl.timeout && this.score == paywallWebviewUrl.score;
    }

    public final int getScore() {
        return this.score;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.url.hashCode() * 31) + Long.hashCode(this.timeout)) * 31) + Integer.hashCode(this.score);
    }

    @NotNull
    public String toString() {
        return "PaywallWebviewUrl(url=" + this.url + ", timeout=" + this.timeout + ", score=" + this.score + ")";
    }

    public PaywallWebviewUrl(@NotNull String url, long j10, int i10) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.timeout = j10;
        this.score = i10;
    }
}
