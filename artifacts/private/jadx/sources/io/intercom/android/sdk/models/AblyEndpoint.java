package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AblyEndpoint {
    public static final int $stable = 8;

    @c("connectivity_check")
    @Nullable
    private final String connectivityCheck;

    @c("endpoint")
    @NotNull
    private final String endpoint;

    @c("fallback")
    @Nullable
    private final List<String> fallback;

    @c("ws_connectivity_check")
    @Nullable
    private final String wsConnectivityCheck;

    public AblyEndpoint(@NotNull String endpoint, @Nullable List<String> list, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.endpoint = endpoint;
        this.fallback = list;
        this.connectivityCheck = str;
        this.wsConnectivityCheck = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AblyEndpoint copy$default(AblyEndpoint ablyEndpoint, String str, List list, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ablyEndpoint.endpoint;
        }
        if ((i10 & 2) != 0) {
            list = ablyEndpoint.fallback;
        }
        if ((i10 & 4) != 0) {
            str2 = ablyEndpoint.connectivityCheck;
        }
        if ((i10 & 8) != 0) {
            str3 = ablyEndpoint.wsConnectivityCheck;
        }
        return ablyEndpoint.copy(str, list, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.endpoint;
    }

    @Nullable
    public final List<String> component2() {
        return this.fallback;
    }

    @Nullable
    public final String component3() {
        return this.connectivityCheck;
    }

    @Nullable
    public final String component4() {
        return this.wsConnectivityCheck;
    }

    @NotNull
    public final AblyEndpoint copy(@NotNull String endpoint, @Nullable List<String> list, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        return new AblyEndpoint(endpoint, list, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AblyEndpoint)) {
            return false;
        }
        AblyEndpoint ablyEndpoint = (AblyEndpoint) obj;
        return Intrinsics.areEqual(this.endpoint, ablyEndpoint.endpoint) && Intrinsics.areEqual(this.fallback, ablyEndpoint.fallback) && Intrinsics.areEqual(this.connectivityCheck, ablyEndpoint.connectivityCheck) && Intrinsics.areEqual(this.wsConnectivityCheck, ablyEndpoint.wsConnectivityCheck);
    }

    @Nullable
    public final String getConnectivityCheck() {
        return this.connectivityCheck;
    }

    @NotNull
    public final String getEndpoint() {
        return this.endpoint;
    }

    @Nullable
    public final List<String> getFallback() {
        return this.fallback;
    }

    @Nullable
    public final String getWsConnectivityCheck() {
        return this.wsConnectivityCheck;
    }

    public int hashCode() {
        int iHashCode = this.endpoint.hashCode() * 31;
        List<String> list = this.fallback;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.connectivityCheck;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.wsConnectivityCheck;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AblyEndpoint(endpoint=" + this.endpoint + ", fallback=" + this.fallback + ", connectivityCheck=" + this.connectivityCheck + ", wsConnectivityCheck=" + this.wsConnectivityCheck + ')';
    }

    public /* synthetic */ AblyEndpoint(String str, List list, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3);
    }
}
