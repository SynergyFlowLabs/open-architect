package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.appsflyer.AppsFlyerProperties;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AblyConnectResponse {
    public static final int $stable = 8;

    @c(AppsFlyerProperties.CHANNEL)
    @NotNull
    private final String channel;

    @c("endpoints")
    @NotNull
    private final List<AblyEndpoint> endpoints;

    public AblyConnectResponse(@NotNull String channel, @NotNull List<AblyEndpoint> endpoints) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        this.channel = channel;
        this.endpoints = endpoints;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AblyConnectResponse copy$default(AblyConnectResponse ablyConnectResponse, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ablyConnectResponse.channel;
        }
        if ((i10 & 2) != 0) {
            list = ablyConnectResponse.endpoints;
        }
        return ablyConnectResponse.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.channel;
    }

    @NotNull
    public final List<AblyEndpoint> component2() {
        return this.endpoints;
    }

    @NotNull
    public final AblyConnectResponse copy(@NotNull String channel, @NotNull List<AblyEndpoint> endpoints) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        return new AblyConnectResponse(channel, endpoints);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AblyConnectResponse)) {
            return false;
        }
        AblyConnectResponse ablyConnectResponse = (AblyConnectResponse) obj;
        if (Intrinsics.areEqual(this.channel, ablyConnectResponse.channel) && Intrinsics.areEqual(this.endpoints, ablyConnectResponse.endpoints)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final List<AblyEndpoint> getEndpoints() {
        return this.endpoints;
    }

    public int hashCode() {
        return (this.channel.hashCode() * 31) + this.endpoints.hashCode();
    }

    @NotNull
    public String toString() {
        return "AblyConnectResponse(channel=" + this.channel + ", endpoints=" + this.endpoints + ')';
    }

    public /* synthetic */ AblyConnectResponse(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}
