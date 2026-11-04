package com.superwall.sdk.network;

import com.superwall.sdk.misc.Either;
import com.superwall.sdk.models.assignment.Assignment;
import com.superwall.sdk.models.assignment.AssignmentPostback;
import com.superwall.sdk.models.config.Config;
import com.superwall.sdk.models.enrichment.Enrichment;
import com.superwall.sdk.models.enrichment.EnrichmentRequest;
import com.superwall.sdk.models.entitlements.Redeemable;
import com.superwall.sdk.models.entitlements.TransactionReceipt;
import com.superwall.sdk.models.entitlements.WebEntitlements;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.events.EventsRequest;
import com.superwall.sdk.models.internal.DeviceVendorId;
import com.superwall.sdk.models.internal.WebRedemptionResponse;
import com.superwall.sdk.models.paywall.Paywall;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface SuperwallAPI {

    public static final class DefaultImpls {
        public static /* synthetic */ Object getPaywall$default(SuperwallAPI superwallAPI, String str, EventData eventData, kotlin.coroutines.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPaywall");
            }
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                eventData = null;
            }
            return superwallAPI.getPaywall(str, eventData, dVar);
        }

        public static /* synthetic */ Object getPaywalls$default(SuperwallAPI superwallAPI, boolean z10, kotlin.coroutines.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPaywalls");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return superwallAPI.getPaywalls(z10, dVar);
        }
    }

    @Nullable
    Object confirmAssignments(@NotNull AssignmentPostback assignmentPostback, @NotNull kotlin.coroutines.d<? super Either<Unit, NetworkError>> dVar);

    @Nullable
    Object getAssignments(@NotNull kotlin.coroutines.d<? super Either<? extends List<Assignment>, NetworkError>> dVar);

    @Nullable
    Object getConfig(@NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Either<Config, NetworkError>> dVar);

    @Nullable
    /* JADX INFO: renamed from: getEnrichment-exY8QGI */
    Object mo60getEnrichmentexY8QGI(@NotNull EnrichmentRequest enrichmentRequest, int i10, long j10, @NotNull kotlin.coroutines.d<? super Either<Enrichment, NetworkError>> dVar);

    @Nullable
    Object getPaywall(@Nullable String str, @Nullable EventData eventData, @NotNull kotlin.coroutines.d<? super Either<Paywall, NetworkError>> dVar);

    @Nullable
    Object getPaywalls(boolean z10, @NotNull kotlin.coroutines.d<? super Either<? extends List<Paywall>, NetworkError>> dVar);

    @Nullable
    /* JADX INFO: renamed from: redeemToken-mylZ20U */
    Object mo61redeemTokenmylZ20U(@NotNull List<Redeemable> list, @Nullable String str, @Nullable String str2, @NotNull DeviceVendorId deviceVendorId, @NotNull List<TransactionReceipt> list2, @NotNull String str3, @NotNull kotlin.coroutines.d<? super Either<WebRedemptionResponse, NetworkError>> dVar);

    @Nullable
    Object sendEvents(@NotNull EventsRequest eventsRequest, @NotNull kotlin.coroutines.d<? super Either<Unit, NetworkError>> dVar);

    @Nullable
    Object webEntitlementsByDeviceID(@NotNull DeviceVendorId deviceVendorId, @NotNull kotlin.coroutines.d<? super Either<WebEntitlements, NetworkError>> dVar);

    @Nullable
    /* JADX INFO: renamed from: webEntitlementsByUserId-5PBZuVg */
    Object mo62webEntitlementsByUserId5PBZuVg(@NotNull String str, @NotNull DeviceVendorId deviceVendorId, @NotNull kotlin.coroutines.d<? super Either<WebEntitlements, NetworkError>> dVar);
}
