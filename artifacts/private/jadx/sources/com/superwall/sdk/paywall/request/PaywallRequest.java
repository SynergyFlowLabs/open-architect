package com.superwall.sdk.paywall.request;

import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PaywallRequest {

    @Nullable
    private EventData eventData;
    private final boolean isDebuggerLaunched;

    @NotNull
    private final Overrides overrides;

    @Nullable
    private final String presentationSourceType;

    @NotNull
    private final ResponseIdentifiers responseIdentifiers;
    private final int retryCount;

    public static final class Overrides {

        @Nullable
        private final Boolean isFreeTrial;

        @Nullable
        private final Map<String, StoreProduct> products;

        public Overrides(@Nullable Map<String, StoreProduct> map, @Nullable Boolean bool) {
            this.products = map;
            this.isFreeTrial = bool;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Overrides copy$default(Overrides overrides, Map map, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = overrides.products;
            }
            if ((i10 & 2) != 0) {
                bool = overrides.isFreeTrial;
            }
            return overrides.copy(map, bool);
        }

        @Nullable
        public final Map<String, StoreProduct> component1() {
            return this.products;
        }

        @Nullable
        public final Boolean component2() {
            return this.isFreeTrial;
        }

        @NotNull
        public final Overrides copy(@Nullable Map<String, StoreProduct> map, @Nullable Boolean bool) {
            return new Overrides(map, bool);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Overrides)) {
                return false;
            }
            Overrides overrides = (Overrides) obj;
            return Intrinsics.areEqual(this.products, overrides.products) && Intrinsics.areEqual(this.isFreeTrial, overrides.isFreeTrial);
        }

        @Nullable
        public final Map<String, StoreProduct> getProducts() {
            return this.products;
        }

        public int hashCode() {
            Map<String, StoreProduct> map = this.products;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Boolean bool = this.isFreeTrial;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @Nullable
        public final Boolean isFreeTrial() {
            return this.isFreeTrial;
        }

        @NotNull
        public String toString() {
            return "Overrides(products=" + this.products + ", isFreeTrial=" + this.isFreeTrial + ")";
        }
    }

    public PaywallRequest(@Nullable EventData eventData, @NotNull ResponseIdentifiers responseIdentifiers, @NotNull Overrides overrides, boolean z10, @Nullable String str, int i10) {
        Intrinsics.checkNotNullParameter(responseIdentifiers, "responseIdentifiers");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        this.eventData = eventData;
        this.responseIdentifiers = responseIdentifiers;
        this.overrides = overrides;
        this.isDebuggerLaunched = z10;
        this.presentationSourceType = str;
        this.retryCount = i10;
    }

    public static /* synthetic */ PaywallRequest copy$default(PaywallRequest paywallRequest, EventData eventData, ResponseIdentifiers responseIdentifiers, Overrides overrides, boolean z10, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eventData = paywallRequest.eventData;
        }
        if ((i11 & 2) != 0) {
            responseIdentifiers = paywallRequest.responseIdentifiers;
        }
        if ((i11 & 4) != 0) {
            overrides = paywallRequest.overrides;
        }
        if ((i11 & 8) != 0) {
            z10 = paywallRequest.isDebuggerLaunched;
        }
        if ((i11 & 16) != 0) {
            str = paywallRequest.presentationSourceType;
        }
        if ((i11 & 32) != 0) {
            i10 = paywallRequest.retryCount;
        }
        String str2 = str;
        int i12 = i10;
        return paywallRequest.copy(eventData, responseIdentifiers, overrides, z10, str2, i12);
    }

    @Nullable
    public final EventData component1() {
        return this.eventData;
    }

    @NotNull
    public final ResponseIdentifiers component2() {
        return this.responseIdentifiers;
    }

    @NotNull
    public final Overrides component3() {
        return this.overrides;
    }

    public final boolean component4() {
        return this.isDebuggerLaunched;
    }

    @Nullable
    public final String component5() {
        return this.presentationSourceType;
    }

    public final int component6() {
        return this.retryCount;
    }

    @NotNull
    public final PaywallRequest copy(@Nullable EventData eventData, @NotNull ResponseIdentifiers responseIdentifiers, @NotNull Overrides overrides, boolean z10, @Nullable String str, int i10) {
        Intrinsics.checkNotNullParameter(responseIdentifiers, "responseIdentifiers");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        return new PaywallRequest(eventData, responseIdentifiers, overrides, z10, str, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallRequest)) {
            return false;
        }
        PaywallRequest paywallRequest = (PaywallRequest) obj;
        return Intrinsics.areEqual(this.eventData, paywallRequest.eventData) && Intrinsics.areEqual(this.responseIdentifiers, paywallRequest.responseIdentifiers) && Intrinsics.areEqual(this.overrides, paywallRequest.overrides) && this.isDebuggerLaunched == paywallRequest.isDebuggerLaunched && Intrinsics.areEqual(this.presentationSourceType, paywallRequest.presentationSourceType) && this.retryCount == paywallRequest.retryCount;
    }

    @Nullable
    public final EventData getEventData() {
        return this.eventData;
    }

    @NotNull
    public final Overrides getOverrides() {
        return this.overrides;
    }

    @Nullable
    public final String getPresentationSourceType() {
        return this.presentationSourceType;
    }

    @NotNull
    public final ResponseIdentifiers getResponseIdentifiers() {
        return this.responseIdentifiers;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public int hashCode() {
        EventData eventData = this.eventData;
        int iHashCode = 0;
        int iHashCode2 = (((((((eventData == null ? 0 : eventData.hashCode()) * 31) + this.responseIdentifiers.hashCode()) * 31) + this.overrides.hashCode()) * 31) + Boolean.hashCode(this.isDebuggerLaunched)) * 31;
        String str = this.presentationSourceType;
        if (str != null) {
            iHashCode = str.hashCode();
        }
        return ((iHashCode2 + iHashCode) * 31) + Integer.hashCode(this.retryCount);
    }

    public final boolean isDebuggerLaunched() {
        return this.isDebuggerLaunched;
    }

    public final void setEventData(@Nullable EventData eventData) {
        this.eventData = eventData;
    }

    @NotNull
    public String toString() {
        return "PaywallRequest(eventData=" + this.eventData + ", responseIdentifiers=" + this.responseIdentifiers + ", overrides=" + this.overrides + ", isDebuggerLaunched=" + this.isDebuggerLaunched + ", presentationSourceType=" + this.presentationSourceType + ", retryCount=" + this.retryCount + ")";
    }
}
