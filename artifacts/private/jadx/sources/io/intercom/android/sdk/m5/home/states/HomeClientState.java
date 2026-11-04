package io.intercom.android.sdk.m5.home.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class HomeClientState {
    public static final int $stable = 8;

    @Nullable
    private final NetworkResponse<HomeV2Response> homeResponse;
    private final boolean isHeaderImageLoaded;

    @Nullable
    private final OpenMessengerResponse openMessengerResponseData;

    public HomeClientState() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeClientState copy$default(HomeClientState homeClientState, NetworkResponse networkResponse, OpenMessengerResponse openMessengerResponse, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            networkResponse = homeClientState.homeResponse;
        }
        if ((i10 & 2) != 0) {
            openMessengerResponse = homeClientState.openMessengerResponseData;
        }
        if ((i10 & 4) != 0) {
            z10 = homeClientState.isHeaderImageLoaded;
        }
        return homeClientState.copy(networkResponse, openMessengerResponse, z10);
    }

    @Nullable
    public final NetworkResponse<HomeV2Response> component1() {
        return this.homeResponse;
    }

    @Nullable
    public final OpenMessengerResponse component2() {
        return this.openMessengerResponseData;
    }

    public final boolean component3() {
        return this.isHeaderImageLoaded;
    }

    @NotNull
    public final HomeClientState copy(@Nullable NetworkResponse<HomeV2Response> networkResponse, @Nullable OpenMessengerResponse openMessengerResponse, boolean z10) {
        return new HomeClientState(networkResponse, openMessengerResponse, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeClientState)) {
            return false;
        }
        HomeClientState homeClientState = (HomeClientState) obj;
        return Intrinsics.areEqual(this.homeResponse, homeClientState.homeResponse) && Intrinsics.areEqual(this.openMessengerResponseData, homeClientState.openMessengerResponseData) && this.isHeaderImageLoaded == homeClientState.isHeaderImageLoaded;
    }

    @Nullable
    public final NetworkResponse<HomeV2Response> getHomeResponse() {
        return this.homeResponse;
    }

    @Nullable
    public final OpenMessengerResponse getOpenMessengerResponseData() {
        return this.openMessengerResponseData;
    }

    public int hashCode() {
        NetworkResponse<HomeV2Response> networkResponse = this.homeResponse;
        int iHashCode = (networkResponse == null ? 0 : networkResponse.hashCode()) * 31;
        OpenMessengerResponse openMessengerResponse = this.openMessengerResponseData;
        return ((iHashCode + (openMessengerResponse != null ? openMessengerResponse.hashCode() : 0)) * 31) + Boolean.hashCode(this.isHeaderImageLoaded);
    }

    public final boolean isHeaderImageLoaded() {
        return this.isHeaderImageLoaded;
    }

    @NotNull
    public String toString() {
        return "HomeClientState(homeResponse=" + this.homeResponse + ", openMessengerResponseData=" + this.openMessengerResponseData + ", isHeaderImageLoaded=" + this.isHeaderImageLoaded + ')';
    }

    public HomeClientState(@Nullable NetworkResponse<HomeV2Response> networkResponse, @Nullable OpenMessengerResponse openMessengerResponse, boolean z10) {
        this.homeResponse = networkResponse;
        this.openMessengerResponseData = openMessengerResponse;
        this.isHeaderImageLoaded = z10;
    }

    public /* synthetic */ HomeClientState(NetworkResponse networkResponse, OpenMessengerResponse openMessengerResponse, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : networkResponse, (i10 & 2) != 0 ? null : openMessengerResponse, (i10 & 4) != 0 ? false : z10);
    }
}
