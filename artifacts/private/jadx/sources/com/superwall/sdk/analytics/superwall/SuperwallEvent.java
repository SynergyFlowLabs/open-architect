package com.superwall.sdk.analytics.superwall;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.superwall.sdk.config.models.Survey;
import com.superwall.sdk.config.models.SurveyOption;
import com.superwall.sdk.models.triggers.TriggerResult;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatus;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatusReason;
import com.superwall.sdk.paywall.view.webview.WebviewError;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import com.superwall.sdk.store.abstractions.transactions.StoreTransactionType;
import com.superwall.sdk.store.transactions.RestoreType;
import com.superwall.sdk.store.transactions.TransactionError;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSuperwallEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuperwallEvent.kt\ncom/superwall/sdk/analytics/superwall/SuperwallEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,500:1\n1#2:501\n*E\n"})
public abstract class SuperwallEvent {

    public static final class AppClose extends SuperwallEvent {
        public AppClose() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "app_close";
        }
    }

    public static final class AppInstall extends SuperwallEvent {
        public AppInstall() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "app_install";
        }
    }

    public static final class AppLaunch extends SuperwallEvent {
        public AppLaunch() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "app_launch";
        }
    }

    public static final class AppOpen extends SuperwallEvent {
        public AppOpen() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return FirebaseAnalytics.c.f120619e;
        }
    }

    public static final class ConfigAttributes extends SuperwallEvent {

        @NotNull
        public static final ConfigAttributes INSTANCE = new ConfigAttributes();

        private ConfigAttributes() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "config_attributes";
        }
    }

    public static final class ConfigFail extends SuperwallEvent {

        @NotNull
        public static final ConfigFail INSTANCE = new ConfigFail();

        private ConfigFail() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "config_fail";
        }
    }

    public static final class ConfigRefresh extends SuperwallEvent {

        @NotNull
        public static final ConfigRefresh INSTANCE = new ConfigRefresh();

        private ConfigRefresh() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "config_refresh";
        }
    }

    public static final class ConfirmAllAssignments extends SuperwallEvent {

        @NotNull
        public static final ConfirmAllAssignments INSTANCE = new ConfirmAllAssignments();

        private ConfirmAllAssignments() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "confirm_all_assignments";
        }
    }

    public static final class CustomPlacement extends SuperwallEvent {

        @NotNull
        private final Map<String, Object> params;

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final String placementName;

        @NotNull
        private final String rawName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomPlacement(@NotNull String placementName, @NotNull PaywallInfo paywallInfo, @NotNull Map<String, ? extends Object> params) {
            super(null);
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            Intrinsics.checkNotNullParameter(params, "params");
            this.placementName = placementName;
            this.paywallInfo = paywallInfo;
            this.params = params;
            this.rawName = SuperwallEvents.CustomPlacement.getRawName();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CustomPlacement copy$default(CustomPlacement customPlacement, String str, PaywallInfo paywallInfo, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = customPlacement.placementName;
            }
            if ((i10 & 2) != 0) {
                paywallInfo = customPlacement.paywallInfo;
            }
            if ((i10 & 4) != 0) {
                map = customPlacement.params;
            }
            return customPlacement.copy(str, paywallInfo, map);
        }

        @NotNull
        public final String component1() {
            return this.placementName;
        }

        @NotNull
        public final PaywallInfo component2() {
            return this.paywallInfo;
        }

        @NotNull
        public final Map<String, Object> component3() {
            return this.params;
        }

        @NotNull
        public final CustomPlacement copy(@NotNull String placementName, @NotNull PaywallInfo paywallInfo, @NotNull Map<String, ? extends Object> params) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            Intrinsics.checkNotNullParameter(params, "params");
            return new CustomPlacement(placementName, paywallInfo, params);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomPlacement)) {
                return false;
            }
            CustomPlacement customPlacement = (CustomPlacement) obj;
            if (Intrinsics.areEqual(this.placementName, customPlacement.placementName) && Intrinsics.areEqual(this.paywallInfo, customPlacement.paywallInfo) && Intrinsics.areEqual(this.params, customPlacement.params)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Map<String, Object> getParams() {
            return this.params;
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final String getPlacementName() {
            return this.placementName;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return this.rawName;
        }

        public int hashCode() {
            return (((this.placementName.hashCode() * 31) + this.paywallInfo.hashCode()) * 31) + this.params.hashCode();
        }

        @NotNull
        public String toString() {
            return "CustomPlacement(placementName=" + this.placementName + ", paywallInfo=" + this.paywallInfo + ", params=" + this.params + ")";
        }
    }

    public static final class DeepLink extends SuperwallEvent {

        @NotNull
        private final Uri uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeepLink(@NotNull Uri uri) {
            super(null);
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        public static /* synthetic */ DeepLink copy$default(DeepLink deepLink, Uri uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uri = deepLink.uri;
            }
            return deepLink.copy(uri);
        }

        @NotNull
        public final Uri component1() {
            return this.uri;
        }

        @NotNull
        public final DeepLink copy(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new DeepLink(uri);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeepLink) && Intrinsics.areEqual(this.uri, ((DeepLink) obj).uri);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "deepLink_open";
        }

        @NotNull
        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        @NotNull
        public String toString() {
            return "DeepLink(uri=" + this.uri + ")";
        }
    }

    public static final class DeviceAttributes extends SuperwallEvent {

        @NotNull
        private final Map<String, Object> attributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceAttributes(@NotNull Map<String, ? extends Object> attributes) {
            super(null);
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.attributes = attributes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DeviceAttributes copy$default(DeviceAttributes deviceAttributes, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = deviceAttributes.attributes;
            }
            return deviceAttributes.copy(map);
        }

        @NotNull
        public final Map<String, Object> component1() {
            return this.attributes;
        }

        @NotNull
        public final DeviceAttributes copy(@NotNull Map<String, ? extends Object> attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return new DeviceAttributes(attributes);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeviceAttributes) && Intrinsics.areEqual(this.attributes, ((DeviceAttributes) obj).attributes);
        }

        @NotNull
        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "device_attributes";
        }

        public int hashCode() {
            return this.attributes.hashCode();
        }

        @NotNull
        public String toString() {
            return "DeviceAttributes(attributes=" + this.attributes + ")";
        }
    }

    public static final class EnrichmentComplete extends SuperwallEvent {

        @NotNull
        private final Map<String, Object> deviceEnrichment;

        @NotNull
        private final Map<String, Object> userEnrichment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnrichmentComplete(@NotNull Map<String, ? extends Object> userEnrichment, @NotNull Map<String, ? extends Object> deviceEnrichment) {
            super(null);
            Intrinsics.checkNotNullParameter(userEnrichment, "userEnrichment");
            Intrinsics.checkNotNullParameter(deviceEnrichment, "deviceEnrichment");
            this.userEnrichment = userEnrichment;
            this.deviceEnrichment = deviceEnrichment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EnrichmentComplete copy$default(EnrichmentComplete enrichmentComplete, Map map, Map map2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = enrichmentComplete.userEnrichment;
            }
            if ((i10 & 2) != 0) {
                map2 = enrichmentComplete.deviceEnrichment;
            }
            return enrichmentComplete.copy(map, map2);
        }

        @NotNull
        public final Map<String, Object> component1() {
            return this.userEnrichment;
        }

        @NotNull
        public final Map<String, Object> component2() {
            return this.deviceEnrichment;
        }

        @NotNull
        public final EnrichmentComplete copy(@NotNull Map<String, ? extends Object> userEnrichment, @NotNull Map<String, ? extends Object> deviceEnrichment) {
            Intrinsics.checkNotNullParameter(userEnrichment, "userEnrichment");
            Intrinsics.checkNotNullParameter(deviceEnrichment, "deviceEnrichment");
            return new EnrichmentComplete(userEnrichment, deviceEnrichment);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnrichmentComplete)) {
                return false;
            }
            EnrichmentComplete enrichmentComplete = (EnrichmentComplete) obj;
            return Intrinsics.areEqual(this.userEnrichment, enrichmentComplete.userEnrichment) && Intrinsics.areEqual(this.deviceEnrichment, enrichmentComplete.deviceEnrichment);
        }

        @NotNull
        public final Map<String, Object> getDeviceEnrichment() {
            return this.deviceEnrichment;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "enrichment_complete";
        }

        @NotNull
        public final Map<String, Object> getUserEnrichment() {
            return this.userEnrichment;
        }

        public int hashCode() {
            return (this.userEnrichment.hashCode() * 31) + this.deviceEnrichment.hashCode();
        }

        @NotNull
        public String toString() {
            return "EnrichmentComplete(userEnrichment=" + this.userEnrichment + ", deviceEnrichment=" + this.deviceEnrichment + ")";
        }
    }

    public static final class EnrichmentFail extends SuperwallEvent {

        @NotNull
        public static final EnrichmentFail INSTANCE = new EnrichmentFail();

        private EnrichmentFail() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "enrichment_fail";
        }
    }

    public static final class EnrichmentStart extends SuperwallEvent {

        @NotNull
        public static final EnrichmentStart INSTANCE = new EnrichmentStart();

        private EnrichmentStart() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "enrichment_start";
        }
    }

    public static final class ErrorThrown extends SuperwallEvent implements IsInternalEvent {

        @NotNull
        public static final ErrorThrown INSTANCE = new ErrorThrown();

        private ErrorThrown() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "error_thrown";
        }
    }

    public static final class ExpressionResult extends SuperwallEvent implements IsInternalEvent {

        @NotNull
        public static final ExpressionResult INSTANCE = new ExpressionResult();

        private ExpressionResult() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "cel_expression_result";
        }
    }

    public static final class FirstSeen extends SuperwallEvent {
        public FirstSeen() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "first_seen";
        }
    }

    public static final class FreeTrialStart extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final StoreProduct product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FreeTrialStart(@NotNull StoreProduct product, @NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.product = product;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ FreeTrialStart copy$default(FreeTrialStart freeTrialStart, StoreProduct storeProduct, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                storeProduct = freeTrialStart.product;
            }
            if ((i10 & 2) != 0) {
                paywallInfo = freeTrialStart.paywallInfo;
            }
            return freeTrialStart.copy(storeProduct, paywallInfo);
        }

        @NotNull
        public final StoreProduct component1() {
            return this.product;
        }

        @NotNull
        public final PaywallInfo component2() {
            return this.paywallInfo;
        }

        @NotNull
        public final FreeTrialStart copy(@NotNull StoreProduct product, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new FreeTrialStart(product, paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FreeTrialStart)) {
                return false;
            }
            FreeTrialStart freeTrialStart = (FreeTrialStart) obj;
            return Intrinsics.areEqual(this.product, freeTrialStart.product) && Intrinsics.areEqual(this.paywallInfo, freeTrialStart.paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final StoreProduct getProduct() {
            return this.product;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "freeTrial_start";
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "FreeTrialStart(product=" + this.product + ", paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class IdentityAlias extends SuperwallEvent {
        public IdentityAlias() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "identity_alias";
        }
    }

    public static final class NonRecurringProductPurchase extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final TransactionProduct product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NonRecurringProductPurchase(@NotNull TransactionProduct product, @NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.product = product;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ NonRecurringProductPurchase copy$default(NonRecurringProductPurchase nonRecurringProductPurchase, TransactionProduct transactionProduct, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                transactionProduct = nonRecurringProductPurchase.product;
            }
            if ((i10 & 2) != 0) {
                paywallInfo = nonRecurringProductPurchase.paywallInfo;
            }
            return nonRecurringProductPurchase.copy(transactionProduct, paywallInfo);
        }

        @NotNull
        public final TransactionProduct component1() {
            return this.product;
        }

        @NotNull
        public final PaywallInfo component2() {
            return this.paywallInfo;
        }

        @NotNull
        public final NonRecurringProductPurchase copy(@NotNull TransactionProduct product, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new NonRecurringProductPurchase(product, paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NonRecurringProductPurchase)) {
                return false;
            }
            NonRecurringProductPurchase nonRecurringProductPurchase = (NonRecurringProductPurchase) obj;
            return Intrinsics.areEqual(this.product, nonRecurringProductPurchase.product) && Intrinsics.areEqual(this.paywallInfo, nonRecurringProductPurchase.paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final TransactionProduct getProduct() {
            return this.product;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "nonRecurringProduct_purchase";
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "NonRecurringProductPurchase(product=" + this.product + ", paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class PaywallClose extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallClose(@NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ PaywallClose copy$default(PaywallClose paywallClose, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallInfo = paywallClose.paywallInfo;
            }
            return paywallClose.copy(paywallInfo);
        }

        @NotNull
        public final PaywallInfo component1() {
            return this.paywallInfo;
        }

        @NotNull
        public final PaywallClose copy(@NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new PaywallClose(paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaywallClose) && Intrinsics.areEqual(this.paywallInfo, ((PaywallClose) obj).paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywall_close";
        }

        public int hashCode() {
            return this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallClose(paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class PaywallDecline extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallDecline(@NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ PaywallDecline copy$default(PaywallDecline paywallDecline, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallInfo = paywallDecline.paywallInfo;
            }
            return paywallDecline.copy(paywallInfo);
        }

        @NotNull
        public final PaywallInfo component1() {
            return this.paywallInfo;
        }

        @NotNull
        public final PaywallDecline copy(@NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new PaywallDecline(paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaywallDecline) && Intrinsics.areEqual(this.paywallInfo, ((PaywallDecline) obj).paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywall_decline";
        }

        public int hashCode() {
            return this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallDecline(paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class PaywallOpen extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallOpen(@NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ PaywallOpen copy$default(PaywallOpen paywallOpen, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallInfo = paywallOpen.paywallInfo;
            }
            return paywallOpen.copy(paywallInfo);
        }

        @NotNull
        public final PaywallInfo component1() {
            return this.paywallInfo;
        }

        @NotNull
        public final PaywallOpen copy(@NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new PaywallOpen(paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaywallOpen) && Intrinsics.areEqual(this.paywallInfo, ((PaywallOpen) obj).paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywall_open";
        }

        public int hashCode() {
            return this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallOpen(paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class PaywallPresentationRequest extends SuperwallEvent {

        @Nullable
        private final PaywallPresentationRequestStatusReason reason;

        @NotNull
        private final PaywallPresentationRequestStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallPresentationRequest(@NotNull PaywallPresentationRequestStatus status, @Nullable PaywallPresentationRequestStatusReason paywallPresentationRequestStatusReason) {
            super(null);
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
            this.reason = paywallPresentationRequestStatusReason;
        }

        public static /* synthetic */ PaywallPresentationRequest copy$default(PaywallPresentationRequest paywallPresentationRequest, PaywallPresentationRequestStatus paywallPresentationRequestStatus, PaywallPresentationRequestStatusReason paywallPresentationRequestStatusReason, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallPresentationRequestStatus = paywallPresentationRequest.status;
            }
            if ((i10 & 2) != 0) {
                paywallPresentationRequestStatusReason = paywallPresentationRequest.reason;
            }
            return paywallPresentationRequest.copy(paywallPresentationRequestStatus, paywallPresentationRequestStatusReason);
        }

        @NotNull
        public final PaywallPresentationRequestStatus component1() {
            return this.status;
        }

        @Nullable
        public final PaywallPresentationRequestStatusReason component2() {
            return this.reason;
        }

        @NotNull
        public final PaywallPresentationRequest copy(@NotNull PaywallPresentationRequestStatus status, @Nullable PaywallPresentationRequestStatusReason paywallPresentationRequestStatusReason) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new PaywallPresentationRequest(status, paywallPresentationRequestStatusReason);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallPresentationRequest)) {
                return false;
            }
            PaywallPresentationRequest paywallPresentationRequest = (PaywallPresentationRequest) obj;
            return Intrinsics.areEqual(this.status, paywallPresentationRequest.status) && Intrinsics.areEqual(this.reason, paywallPresentationRequest.reason);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywallPresentationRequest";
        }

        @Nullable
        public final PaywallPresentationRequestStatusReason getReason() {
            return this.reason;
        }

        @NotNull
        public final PaywallPresentationRequestStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.status.hashCode() * 31;
            PaywallPresentationRequestStatusReason paywallPresentationRequestStatusReason = this.reason;
            return iHashCode + (paywallPresentationRequestStatusReason == null ? 0 : paywallPresentationRequestStatusReason.hashCode());
        }

        @NotNull
        public String toString() {
            return "PaywallPresentationRequest(status=" + this.status + ", reason=" + this.reason + ")";
        }
    }

    public static final class PaywallProductsLoadComplete extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @Nullable
        private final String triggeredPlacementName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallProductsLoadComplete(@Nullable String str, @NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.triggeredPlacementName = str;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ PaywallProductsLoadComplete copy$default(PaywallProductsLoadComplete paywallProductsLoadComplete, String str, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = paywallProductsLoadComplete.triggeredPlacementName;
            }
            if ((i10 & 2) != 0) {
                paywallInfo = paywallProductsLoadComplete.paywallInfo;
            }
            return paywallProductsLoadComplete.copy(str, paywallInfo);
        }

        @Nullable
        public final String component1() {
            return this.triggeredPlacementName;
        }

        @NotNull
        public final PaywallInfo component2() {
            return this.paywallInfo;
        }

        @NotNull
        public final PaywallProductsLoadComplete copy(@Nullable String str, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new PaywallProductsLoadComplete(str, paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallProductsLoadComplete)) {
                return false;
            }
            PaywallProductsLoadComplete paywallProductsLoadComplete = (PaywallProductsLoadComplete) obj;
            return Intrinsics.areEqual(this.triggeredPlacementName, paywallProductsLoadComplete.triggeredPlacementName) && Intrinsics.areEqual(this.paywallInfo, paywallProductsLoadComplete.paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywallProductsLoad_complete";
        }

        @Nullable
        public final String getTriggeredPlacementName() {
            return this.triggeredPlacementName;
        }

        public int hashCode() {
            String str = this.triggeredPlacementName;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallProductsLoadComplete(triggeredPlacementName=" + this.triggeredPlacementName + ", paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class PaywallProductsLoadFail extends SuperwallEvent {

        @Nullable
        private final String errorMessage;

        @NotNull
        private final PaywallInfo paywallInfo;

        @Nullable
        private final String triggeredPlacementName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallProductsLoadFail(@Nullable String str, @Nullable String str2, @NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.errorMessage = str;
            this.triggeredPlacementName = str2;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ PaywallProductsLoadFail copy$default(PaywallProductsLoadFail paywallProductsLoadFail, String str, String str2, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = paywallProductsLoadFail.errorMessage;
            }
            if ((i10 & 2) != 0) {
                str2 = paywallProductsLoadFail.triggeredPlacementName;
            }
            if ((i10 & 4) != 0) {
                paywallInfo = paywallProductsLoadFail.paywallInfo;
            }
            return paywallProductsLoadFail.copy(str, str2, paywallInfo);
        }

        @Nullable
        public final String component1() {
            return this.errorMessage;
        }

        @Nullable
        public final String component2() {
            return this.triggeredPlacementName;
        }

        @NotNull
        public final PaywallInfo component3() {
            return this.paywallInfo;
        }

        @NotNull
        public final PaywallProductsLoadFail copy(@Nullable String str, @Nullable String str2, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new PaywallProductsLoadFail(str, str2, paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallProductsLoadFail)) {
                return false;
            }
            PaywallProductsLoadFail paywallProductsLoadFail = (PaywallProductsLoadFail) obj;
            if (Intrinsics.areEqual(this.errorMessage, paywallProductsLoadFail.errorMessage) && Intrinsics.areEqual(this.triggeredPlacementName, paywallProductsLoadFail.triggeredPlacementName) && Intrinsics.areEqual(this.paywallInfo, paywallProductsLoadFail.paywallInfo)) {
                return true;
            }
            return false;
        }

        @Nullable
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywallProductsLoad_fail";
        }

        @Nullable
        public final String getTriggeredPlacementName() {
            return this.triggeredPlacementName;
        }

        public int hashCode() {
            String str = this.errorMessage;
            int iHashCode = 0;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.triggeredPlacementName;
            if (str2 != null) {
                iHashCode = str2.hashCode();
            }
            return ((iHashCode2 + iHashCode) * 31) + this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallProductsLoadFail(errorMessage=" + this.errorMessage + ", triggeredPlacementName=" + this.triggeredPlacementName + ", paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class PaywallProductsLoadStart extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @Nullable
        private final String triggeredPlacementName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallProductsLoadStart(@Nullable String str, @NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.triggeredPlacementName = str;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ PaywallProductsLoadStart copy$default(PaywallProductsLoadStart paywallProductsLoadStart, String str, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = paywallProductsLoadStart.triggeredPlacementName;
            }
            if ((i10 & 2) != 0) {
                paywallInfo = paywallProductsLoadStart.paywallInfo;
            }
            return paywallProductsLoadStart.copy(str, paywallInfo);
        }

        @Nullable
        public final String component1() {
            return this.triggeredPlacementName;
        }

        @NotNull
        public final PaywallInfo component2() {
            return this.paywallInfo;
        }

        @NotNull
        public final PaywallProductsLoadStart copy(@Nullable String str, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new PaywallProductsLoadStart(str, paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallProductsLoadStart)) {
                return false;
            }
            PaywallProductsLoadStart paywallProductsLoadStart = (PaywallProductsLoadStart) obj;
            return Intrinsics.areEqual(this.triggeredPlacementName, paywallProductsLoadStart.triggeredPlacementName) && Intrinsics.areEqual(this.paywallInfo, paywallProductsLoadStart.paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywallProductsLoad_start";
        }

        @Nullable
        public final String getTriggeredPlacementName() {
            return this.triggeredPlacementName;
        }

        public int hashCode() {
            String str = this.triggeredPlacementName;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallProductsLoadStart(triggeredPlacementName=" + this.triggeredPlacementName + ", paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class PaywallResourceLoadFail extends SuperwallEvent {

        @NotNull
        private final String error;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallResourceLoadFail(@NotNull String url, @NotNull String error) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(error, "error");
            this.url = url;
            this.error = error;
        }

        public static /* synthetic */ PaywallResourceLoadFail copy$default(PaywallResourceLoadFail paywallResourceLoadFail, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = paywallResourceLoadFail.url;
            }
            if ((i10 & 2) != 0) {
                str2 = paywallResourceLoadFail.error;
            }
            return paywallResourceLoadFail.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.url;
        }

        @NotNull
        public final String component2() {
            return this.error;
        }

        @NotNull
        public final PaywallResourceLoadFail copy(@NotNull String url, @NotNull String error) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(error, "error");
            return new PaywallResourceLoadFail(url, error);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallResourceLoadFail)) {
                return false;
            }
            PaywallResourceLoadFail paywallResourceLoadFail = (PaywallResourceLoadFail) obj;
            return Intrinsics.areEqual(this.url, paywallResourceLoadFail.url) && Intrinsics.areEqual(this.error, paywallResourceLoadFail.error);
        }

        @NotNull
        public final String getError() {
            return this.error;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywallResourceLoad_fail";
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallResourceLoadFail(url=" + this.url + ", error=" + this.error + ")";
        }
    }

    public static final class PaywallResponseLoadComplete extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @Nullable
        private final String triggeredPlacementName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallResponseLoadComplete(@Nullable String str, @NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.triggeredPlacementName = str;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ PaywallResponseLoadComplete copy$default(PaywallResponseLoadComplete paywallResponseLoadComplete, String str, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = paywallResponseLoadComplete.triggeredPlacementName;
            }
            if ((i10 & 2) != 0) {
                paywallInfo = paywallResponseLoadComplete.paywallInfo;
            }
            return paywallResponseLoadComplete.copy(str, paywallInfo);
        }

        @Nullable
        public final String component1() {
            return this.triggeredPlacementName;
        }

        @NotNull
        public final PaywallInfo component2() {
            return this.paywallInfo;
        }

        @NotNull
        public final PaywallResponseLoadComplete copy(@Nullable String str, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new PaywallResponseLoadComplete(str, paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallResponseLoadComplete)) {
                return false;
            }
            PaywallResponseLoadComplete paywallResponseLoadComplete = (PaywallResponseLoadComplete) obj;
            return Intrinsics.areEqual(this.triggeredPlacementName, paywallResponseLoadComplete.triggeredPlacementName) && Intrinsics.areEqual(this.paywallInfo, paywallResponseLoadComplete.paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywallResponseLoad_complete";
        }

        @Nullable
        public final String getTriggeredPlacementName() {
            return this.triggeredPlacementName;
        }

        public int hashCode() {
            String str = this.triggeredPlacementName;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallResponseLoadComplete(triggeredPlacementName=" + this.triggeredPlacementName + ", paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class PaywallResponseLoadFail extends SuperwallEvent {

        @Nullable
        private final String triggeredPlacementName;

        public PaywallResponseLoadFail(@Nullable String str) {
            super(null);
            this.triggeredPlacementName = str;
        }

        public static /* synthetic */ PaywallResponseLoadFail copy$default(PaywallResponseLoadFail paywallResponseLoadFail, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = paywallResponseLoadFail.triggeredPlacementName;
            }
            return paywallResponseLoadFail.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.triggeredPlacementName;
        }

        @NotNull
        public final PaywallResponseLoadFail copy(@Nullable String str) {
            return new PaywallResponseLoadFail(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof PaywallResponseLoadFail) && Intrinsics.areEqual(this.triggeredPlacementName, ((PaywallResponseLoadFail) obj).triggeredPlacementName)) {
                return true;
            }
            return false;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywallResponseLoad_fail";
        }

        @Nullable
        public final String getTriggeredPlacementName() {
            return this.triggeredPlacementName;
        }

        public int hashCode() {
            String str = this.triggeredPlacementName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallResponseLoadFail(triggeredPlacementName=" + this.triggeredPlacementName + ")";
        }
    }

    public static final class PaywallResponseLoadNotFound extends SuperwallEvent {

        @Nullable
        private final String triggeredPlacementName;

        public PaywallResponseLoadNotFound(@Nullable String str) {
            super(null);
            this.triggeredPlacementName = str;
        }

        public static /* synthetic */ PaywallResponseLoadNotFound copy$default(PaywallResponseLoadNotFound paywallResponseLoadNotFound, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = paywallResponseLoadNotFound.triggeredPlacementName;
            }
            return paywallResponseLoadNotFound.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.triggeredPlacementName;
        }

        @NotNull
        public final PaywallResponseLoadNotFound copy(@Nullable String str) {
            return new PaywallResponseLoadNotFound(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaywallResponseLoadNotFound) && Intrinsics.areEqual(this.triggeredPlacementName, ((PaywallResponseLoadNotFound) obj).triggeredPlacementName);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywallResponseLoad_notFound";
        }

        @Nullable
        public final String getTriggeredPlacementName() {
            return this.triggeredPlacementName;
        }

        public int hashCode() {
            String str = this.triggeredPlacementName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallResponseLoadNotFound(triggeredPlacementName=" + this.triggeredPlacementName + ")";
        }
    }

    public static final class PaywallResponseLoadStart extends SuperwallEvent {

        @Nullable
        private final String triggeredPlacementName;

        public PaywallResponseLoadStart(@Nullable String str) {
            super(null);
            this.triggeredPlacementName = str;
        }

        public static /* synthetic */ PaywallResponseLoadStart copy$default(PaywallResponseLoadStart paywallResponseLoadStart, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = paywallResponseLoadStart.triggeredPlacementName;
            }
            return paywallResponseLoadStart.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.triggeredPlacementName;
        }

        @NotNull
        public final PaywallResponseLoadStart copy(@Nullable String str) {
            return new PaywallResponseLoadStart(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaywallResponseLoadStart) && Intrinsics.areEqual(this.triggeredPlacementName, ((PaywallResponseLoadStart) obj).triggeredPlacementName);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywallResponseLoad_start";
        }

        @Nullable
        public final String getTriggeredPlacementName() {
            return this.triggeredPlacementName;
        }

        public int hashCode() {
            String str = this.triggeredPlacementName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallResponseLoadStart(triggeredPlacementName=" + this.triggeredPlacementName + ")";
        }
    }

    public static final class PaywallWebviewLoadComplete extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallWebviewLoadComplete(@NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ PaywallWebviewLoadComplete copy$default(PaywallWebviewLoadComplete paywallWebviewLoadComplete, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallInfo = paywallWebviewLoadComplete.paywallInfo;
            }
            return paywallWebviewLoadComplete.copy(paywallInfo);
        }

        @NotNull
        public final PaywallInfo component1() {
            return this.paywallInfo;
        }

        @NotNull
        public final PaywallWebviewLoadComplete copy(@NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new PaywallWebviewLoadComplete(paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaywallWebviewLoadComplete) && Intrinsics.areEqual(this.paywallInfo, ((PaywallWebviewLoadComplete) obj).paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywallWebviewLoad_complete";
        }

        public int hashCode() {
            return this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallWebviewLoadComplete(paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class PaywallWebviewLoadFail extends SuperwallEvent {

        @Nullable
        private final WebviewError errorMessage;

        @NotNull
        private final PaywallInfo paywallInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallWebviewLoadFail(@NotNull PaywallInfo paywallInfo, @Nullable WebviewError webviewError) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.paywallInfo = paywallInfo;
            this.errorMessage = webviewError;
        }

        public static /* synthetic */ PaywallWebviewLoadFail copy$default(PaywallWebviewLoadFail paywallWebviewLoadFail, PaywallInfo paywallInfo, WebviewError webviewError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallInfo = paywallWebviewLoadFail.paywallInfo;
            }
            if ((i10 & 2) != 0) {
                webviewError = paywallWebviewLoadFail.errorMessage;
            }
            return paywallWebviewLoadFail.copy(paywallInfo, webviewError);
        }

        @NotNull
        public final PaywallInfo component1() {
            return this.paywallInfo;
        }

        @Nullable
        public final WebviewError component2() {
            return this.errorMessage;
        }

        @NotNull
        public final PaywallWebviewLoadFail copy(@NotNull PaywallInfo paywallInfo, @Nullable WebviewError webviewError) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new PaywallWebviewLoadFail(paywallInfo, webviewError);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallWebviewLoadFail)) {
                return false;
            }
            PaywallWebviewLoadFail paywallWebviewLoadFail = (PaywallWebviewLoadFail) obj;
            return Intrinsics.areEqual(this.paywallInfo, paywallWebviewLoadFail.paywallInfo) && Intrinsics.areEqual(this.errorMessage, paywallWebviewLoadFail.errorMessage);
        }

        @Nullable
        public final WebviewError getErrorMessage() {
            return this.errorMessage;
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywallWebviewLoad_fail";
        }

        public int hashCode() {
            int iHashCode = this.paywallInfo.hashCode() * 31;
            WebviewError webviewError = this.errorMessage;
            return iHashCode + (webviewError == null ? 0 : webviewError.hashCode());
        }

        @NotNull
        public String toString() {
            return "PaywallWebviewLoadFail(paywallInfo=" + this.paywallInfo + ", errorMessage=" + this.errorMessage + ")";
        }
    }

    public static final class PaywallWebviewLoadFallback extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallWebviewLoadFallback(@NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ PaywallWebviewLoadFallback copy$default(PaywallWebviewLoadFallback paywallWebviewLoadFallback, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallInfo = paywallWebviewLoadFallback.paywallInfo;
            }
            return paywallWebviewLoadFallback.copy(paywallInfo);
        }

        @NotNull
        public final PaywallInfo component1() {
            return this.paywallInfo;
        }

        @NotNull
        public final PaywallWebviewLoadFallback copy(@NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new PaywallWebviewLoadFallback(paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaywallWebviewLoadFallback) && Intrinsics.areEqual(this.paywallInfo, ((PaywallWebviewLoadFallback) obj).paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return SuperwallEvents.PaywallWebviewLoadFallback.getRawName();
        }

        public int hashCode() {
            return this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallWebviewLoadFallback(paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class PaywallWebviewLoadStart extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallWebviewLoadStart(@NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ PaywallWebviewLoadStart copy$default(PaywallWebviewLoadStart paywallWebviewLoadStart, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallInfo = paywallWebviewLoadStart.paywallInfo;
            }
            return paywallWebviewLoadStart.copy(paywallInfo);
        }

        @NotNull
        public final PaywallInfo component1() {
            return this.paywallInfo;
        }

        @NotNull
        public final PaywallWebviewLoadStart copy(@NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new PaywallWebviewLoadStart(paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaywallWebviewLoadStart) && Intrinsics.areEqual(this.paywallInfo, ((PaywallWebviewLoadStart) obj).paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywallWebviewLoad_start";
        }

        public int hashCode() {
            return this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallWebviewLoadStart(paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class PaywallWebviewLoadTimeout extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallWebviewLoadTimeout(@NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ PaywallWebviewLoadTimeout copy$default(PaywallWebviewLoadTimeout paywallWebviewLoadTimeout, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallInfo = paywallWebviewLoadTimeout.paywallInfo;
            }
            return paywallWebviewLoadTimeout.copy(paywallInfo);
        }

        @NotNull
        public final PaywallInfo component1() {
            return this.paywallInfo;
        }

        @NotNull
        public final PaywallWebviewLoadTimeout copy(@NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new PaywallWebviewLoadTimeout(paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaywallWebviewLoadTimeout) && Intrinsics.areEqual(this.paywallInfo, ((PaywallWebviewLoadTimeout) obj).paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "paywallWebviewLoad_timeout";
        }

        public int hashCode() {
            return this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "PaywallWebviewLoadTimeout(paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class RedemptionComplete extends SuperwallEvent {

        @NotNull
        public static final RedemptionComplete INSTANCE = new RedemptionComplete();

        private RedemptionComplete() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return SuperwallEvents.RedemptionComplete.getRawName();
        }
    }

    public static final class RedemptionFail extends SuperwallEvent {

        @NotNull
        public static final RedemptionFail INSTANCE = new RedemptionFail();

        private RedemptionFail() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return SuperwallEvents.RedemptionFail.getRawName();
        }
    }

    public static final class RedemptionStart extends SuperwallEvent {

        @NotNull
        public static final RedemptionStart INSTANCE = new RedemptionStart();

        private RedemptionStart() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return SuperwallEvents.RedemptionStart.getRawName();
        }
    }

    public static final class Reset extends SuperwallEvent {

        @NotNull
        public static final Reset INSTANCE = new Reset();

        private Reset() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return MetricTracker.Object.RESET;
        }
    }

    public static abstract class Restore extends SuperwallEvent {

        public static final class Complete extends Restore {

            @NotNull
            public static final Complete INSTANCE = new Complete();

            private Complete() {
                super(null);
            }

            @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
            @NotNull
            public String getRawName() {
                return SuperwallEvents.RestoreComplete.getRawName();
            }
        }

        public static final class Fail extends Restore {

            @NotNull
            private final String reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Fail(@NotNull String reason) {
                super(null);
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.reason = reason;
            }

            public static /* synthetic */ Fail copy$default(Fail fail, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = fail.reason;
                }
                return fail.copy(str);
            }

            @NotNull
            public final String component1() {
                return this.reason;
            }

            @NotNull
            public final Fail copy(@NotNull String reason) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                return new Fail(reason);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fail) && Intrinsics.areEqual(this.reason, ((Fail) obj).reason);
            }

            @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
            @NotNull
            public String getRawName() {
                return SuperwallEvents.RestoreFail.getRawName();
            }

            @NotNull
            public final String getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            @NotNull
            public String toString() {
                return "Fail(reason=" + this.reason + ")";
            }
        }

        public static final class Start extends Restore {

            @NotNull
            public static final Start INSTANCE = new Start();

            private Start() {
                super(null);
            }

            @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
            @NotNull
            public String getRawName() {
                return SuperwallEvents.RestoreStart.getRawName();
            }
        }

        public /* synthetic */ Restore(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Restore() {
            super(null);
        }
    }

    public static final class SessionStart extends SuperwallEvent {
        public SessionStart() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "session_start";
        }
    }

    public static final class ShimmerViewComplete extends SuperwallEvent {
        private final double duration;

        public ShimmerViewComplete(double d10) {
            super(null);
            this.duration = d10;
        }

        public static /* synthetic */ ShimmerViewComplete copy$default(ShimmerViewComplete shimmerViewComplete, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = shimmerViewComplete.duration;
            }
            return shimmerViewComplete.copy(d10);
        }

        public final double component1() {
            return this.duration;
        }

        @NotNull
        public final ShimmerViewComplete copy(double d10) {
            return new ShimmerViewComplete(d10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShimmerViewComplete) && Double.compare(this.duration, ((ShimmerViewComplete) obj).duration) == 0;
        }

        public final double getDuration() {
            return this.duration;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return SuperwallEvents.ShimmerViewComplete.getRawName();
        }

        public int hashCode() {
            return Double.hashCode(this.duration);
        }

        @NotNull
        public String toString() {
            return "ShimmerViewComplete(duration=" + this.duration + ")";
        }
    }

    public static final class ShimmerViewStart extends SuperwallEvent {

        @NotNull
        public static final ShimmerViewStart INSTANCE = new ShimmerViewStart();

        private ShimmerViewStart() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof ShimmerViewStart);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return SuperwallEvents.ShimmerViewStart.getRawName();
        }

        public int hashCode() {
            return 1596588314;
        }

        @NotNull
        public String toString() {
            return "ShimmerViewStart";
        }
    }

    public static final class SubscriptionStart extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final StoreProduct product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubscriptionStart(@NotNull StoreProduct product, @NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.product = product;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ SubscriptionStart copy$default(SubscriptionStart subscriptionStart, StoreProduct storeProduct, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                storeProduct = subscriptionStart.product;
            }
            if ((i10 & 2) != 0) {
                paywallInfo = subscriptionStart.paywallInfo;
            }
            return subscriptionStart.copy(storeProduct, paywallInfo);
        }

        @NotNull
        public final StoreProduct component1() {
            return this.product;
        }

        @NotNull
        public final PaywallInfo component2() {
            return this.paywallInfo;
        }

        @NotNull
        public final SubscriptionStart copy(@NotNull StoreProduct product, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new SubscriptionStart(product, paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubscriptionStart)) {
                return false;
            }
            SubscriptionStart subscriptionStart = (SubscriptionStart) obj;
            return Intrinsics.areEqual(this.product, subscriptionStart.product) && Intrinsics.areEqual(this.paywallInfo, subscriptionStart.paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final StoreProduct getProduct() {
            return this.product;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "subscription_start";
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "SubscriptionStart(product=" + this.product + ", paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class SubscriptionStatusDidChange extends SuperwallEvent {
        public SubscriptionStatusDidChange() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "subscriptionStatus_didChange";
        }
    }

    public static final class SurveyClose extends SuperwallEvent {
        public SurveyClose() {
            super(null);
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "survey_close";
        }
    }

    public static final class SurveyResponse extends SuperwallEvent {

        @Nullable
        private final String customResponse;

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final SurveyOption selectedOption;

        @NotNull
        private final Survey survey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SurveyResponse(@NotNull Survey survey, @NotNull SurveyOption selectedOption, @Nullable String str, @NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(survey, "survey");
            Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.survey = survey;
            this.selectedOption = selectedOption;
            this.customResponse = str;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ SurveyResponse copy$default(SurveyResponse surveyResponse, Survey survey, SurveyOption surveyOption, String str, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                survey = surveyResponse.survey;
            }
            if ((i10 & 2) != 0) {
                surveyOption = surveyResponse.selectedOption;
            }
            if ((i10 & 4) != 0) {
                str = surveyResponse.customResponse;
            }
            if ((i10 & 8) != 0) {
                paywallInfo = surveyResponse.paywallInfo;
            }
            return surveyResponse.copy(survey, surveyOption, str, paywallInfo);
        }

        @NotNull
        public final Survey component1() {
            return this.survey;
        }

        @NotNull
        public final SurveyOption component2() {
            return this.selectedOption;
        }

        @Nullable
        public final String component3() {
            return this.customResponse;
        }

        @NotNull
        public final PaywallInfo component4() {
            return this.paywallInfo;
        }

        @NotNull
        public final SurveyResponse copy(@NotNull Survey survey, @NotNull SurveyOption selectedOption, @Nullable String str, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(survey, "survey");
            Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new SurveyResponse(survey, selectedOption, str, paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SurveyResponse)) {
                return false;
            }
            SurveyResponse surveyResponse = (SurveyResponse) obj;
            return Intrinsics.areEqual(this.survey, surveyResponse.survey) && Intrinsics.areEqual(this.selectedOption, surveyResponse.selectedOption) && Intrinsics.areEqual(this.customResponse, surveyResponse.customResponse) && Intrinsics.areEqual(this.paywallInfo, surveyResponse.paywallInfo);
        }

        @Nullable
        public final String getCustomResponse() {
            return this.customResponse;
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "survey_response";
        }

        @NotNull
        public final SurveyOption getSelectedOption() {
            return this.selectedOption;
        }

        @NotNull
        public final Survey getSurvey() {
            return this.survey;
        }

        public int hashCode() {
            int iHashCode = ((this.survey.hashCode() * 31) + this.selectedOption.hashCode()) * 31;
            String str = this.customResponse;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "SurveyResponse(survey=" + this.survey + ", selectedOption=" + this.selectedOption + ", customResponse=" + this.customResponse + ", paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class TransactionAbandon extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final StoreProduct product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionAbandon(@NotNull StoreProduct product, @NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.product = product;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ TransactionAbandon copy$default(TransactionAbandon transactionAbandon, StoreProduct storeProduct, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                storeProduct = transactionAbandon.product;
            }
            if ((i10 & 2) != 0) {
                paywallInfo = transactionAbandon.paywallInfo;
            }
            return transactionAbandon.copy(storeProduct, paywallInfo);
        }

        @NotNull
        public final StoreProduct component1() {
            return this.product;
        }

        @NotNull
        public final PaywallInfo component2() {
            return this.paywallInfo;
        }

        @NotNull
        public final TransactionAbandon copy(@NotNull StoreProduct product, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new TransactionAbandon(product, paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionAbandon)) {
                return false;
            }
            TransactionAbandon transactionAbandon = (TransactionAbandon) obj;
            return Intrinsics.areEqual(this.product, transactionAbandon.product) && Intrinsics.areEqual(this.paywallInfo, transactionAbandon.paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final StoreProduct getProduct() {
            return this.product;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "transaction_abandon";
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "TransactionAbandon(product=" + this.product + ", paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class TransactionComplete extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final StoreProduct product;

        @Nullable
        private final StoreTransactionType transaction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionComplete(@Nullable StoreTransactionType storeTransactionType, @NotNull StoreProduct product, @NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.transaction = storeTransactionType;
            this.product = product;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ TransactionComplete copy$default(TransactionComplete transactionComplete, StoreTransactionType storeTransactionType, StoreProduct storeProduct, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                storeTransactionType = transactionComplete.transaction;
            }
            if ((i10 & 2) != 0) {
                storeProduct = transactionComplete.product;
            }
            if ((i10 & 4) != 0) {
                paywallInfo = transactionComplete.paywallInfo;
            }
            return transactionComplete.copy(storeTransactionType, storeProduct, paywallInfo);
        }

        @Nullable
        public final StoreTransactionType component1() {
            return this.transaction;
        }

        @NotNull
        public final StoreProduct component2() {
            return this.product;
        }

        @NotNull
        public final PaywallInfo component3() {
            return this.paywallInfo;
        }

        @NotNull
        public final TransactionComplete copy(@Nullable StoreTransactionType storeTransactionType, @NotNull StoreProduct product, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new TransactionComplete(storeTransactionType, product, paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionComplete)) {
                return false;
            }
            TransactionComplete transactionComplete = (TransactionComplete) obj;
            return Intrinsics.areEqual(this.transaction, transactionComplete.transaction) && Intrinsics.areEqual(this.product, transactionComplete.product) && Intrinsics.areEqual(this.paywallInfo, transactionComplete.paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final StoreProduct getProduct() {
            return this.product;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "transaction_complete";
        }

        @Nullable
        public final StoreTransactionType getTransaction() {
            return this.transaction;
        }

        public int hashCode() {
            StoreTransactionType storeTransactionType = this.transaction;
            return ((((storeTransactionType == null ? 0 : storeTransactionType.hashCode()) * 31) + this.product.hashCode()) * 31) + this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "TransactionComplete(transaction=" + this.transaction + ", product=" + this.product + ", paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class TransactionFail extends SuperwallEvent {

        @NotNull
        private final TransactionError error;

        @NotNull
        private final PaywallInfo paywallInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionFail(@NotNull TransactionError error, @NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.error = error;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ TransactionFail copy$default(TransactionFail transactionFail, TransactionError transactionError, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                transactionError = transactionFail.error;
            }
            if ((i10 & 2) != 0) {
                paywallInfo = transactionFail.paywallInfo;
            }
            return transactionFail.copy(transactionError, paywallInfo);
        }

        @NotNull
        public final TransactionError component1() {
            return this.error;
        }

        @NotNull
        public final PaywallInfo component2() {
            return this.paywallInfo;
        }

        @NotNull
        public final TransactionFail copy(@NotNull TransactionError error, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new TransactionFail(error, paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionFail)) {
                return false;
            }
            TransactionFail transactionFail = (TransactionFail) obj;
            return Intrinsics.areEqual(this.error, transactionFail.error) && Intrinsics.areEqual(this.paywallInfo, transactionFail.paywallInfo);
        }

        @NotNull
        public final TransactionError getError() {
            return this.error;
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "transaction_fail";
        }

        public int hashCode() {
            return (this.error.hashCode() * 31) + this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "TransactionFail(error=" + this.error + ", paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class TransactionRestore extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final RestoreType restoreType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionRestore(@NotNull RestoreType restoreType, @NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(restoreType, "restoreType");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.restoreType = restoreType;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ TransactionRestore copy$default(TransactionRestore transactionRestore, RestoreType restoreType, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                restoreType = transactionRestore.restoreType;
            }
            if ((i10 & 2) != 0) {
                paywallInfo = transactionRestore.paywallInfo;
            }
            return transactionRestore.copy(restoreType, paywallInfo);
        }

        @NotNull
        public final RestoreType component1() {
            return this.restoreType;
        }

        @NotNull
        public final PaywallInfo component2() {
            return this.paywallInfo;
        }

        @NotNull
        public final TransactionRestore copy(@NotNull RestoreType restoreType, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(restoreType, "restoreType");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new TransactionRestore(restoreType, paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionRestore)) {
                return false;
            }
            TransactionRestore transactionRestore = (TransactionRestore) obj;
            return Intrinsics.areEqual(this.restoreType, transactionRestore.restoreType) && Intrinsics.areEqual(this.paywallInfo, transactionRestore.paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "transaction_restore";
        }

        @NotNull
        public final RestoreType getRestoreType() {
            return this.restoreType;
        }

        public int hashCode() {
            return (this.restoreType.hashCode() * 31) + this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "TransactionRestore(restoreType=" + this.restoreType + ", paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class TransactionStart extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final StoreProduct product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionStart(@NotNull StoreProduct product, @NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.product = product;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ TransactionStart copy$default(TransactionStart transactionStart, StoreProduct storeProduct, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                storeProduct = transactionStart.product;
            }
            if ((i10 & 2) != 0) {
                paywallInfo = transactionStart.paywallInfo;
            }
            return transactionStart.copy(storeProduct, paywallInfo);
        }

        @NotNull
        public final StoreProduct component1() {
            return this.product;
        }

        @NotNull
        public final PaywallInfo component2() {
            return this.paywallInfo;
        }

        @NotNull
        public final TransactionStart copy(@NotNull StoreProduct product, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new TransactionStart(product, paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionStart)) {
                return false;
            }
            TransactionStart transactionStart = (TransactionStart) obj;
            return Intrinsics.areEqual(this.product, transactionStart.product) && Intrinsics.areEqual(this.paywallInfo, transactionStart.paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final StoreProduct getProduct() {
            return this.product;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "transaction_start";
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "TransactionStart(product=" + this.product + ", paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class TransactionTimeout extends SuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionTimeout(@NotNull PaywallInfo paywallInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ TransactionTimeout copy$default(TransactionTimeout transactionTimeout, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallInfo = transactionTimeout.paywallInfo;
            }
            return transactionTimeout.copy(paywallInfo);
        }

        @NotNull
        public final PaywallInfo component1() {
            return this.paywallInfo;
        }

        @NotNull
        public final TransactionTimeout copy(@NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new TransactionTimeout(paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TransactionTimeout) && Intrinsics.areEqual(this.paywallInfo, ((TransactionTimeout) obj).paywallInfo);
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "transaction_timeout";
        }

        public int hashCode() {
            return this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "TransactionTimeout(paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class TriggerFire extends SuperwallEvent {

        @NotNull
        private final String placementName;

        @NotNull
        private final TriggerResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TriggerFire(@NotNull String placementName, @NotNull TriggerResult result) {
            super(null);
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(result, "result");
            this.placementName = placementName;
            this.result = result;
        }

        public static /* synthetic */ TriggerFire copy$default(TriggerFire triggerFire, String str, TriggerResult triggerResult, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = triggerFire.placementName;
            }
            if ((i10 & 2) != 0) {
                triggerResult = triggerFire.result;
            }
            return triggerFire.copy(str, triggerResult);
        }

        @NotNull
        public final String component1() {
            return this.placementName;
        }

        @NotNull
        public final TriggerResult component2() {
            return this.result;
        }

        @NotNull
        public final TriggerFire copy(@NotNull String placementName, @NotNull TriggerResult result) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(result, "result");
            return new TriggerFire(placementName, result);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TriggerFire)) {
                return false;
            }
            TriggerFire triggerFire = (TriggerFire) obj;
            return Intrinsics.areEqual(this.placementName, triggerFire.placementName) && Intrinsics.areEqual(this.result, triggerFire.result);
        }

        @NotNull
        public final String getPlacementName() {
            return this.placementName;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "trigger_fire";
        }

        @NotNull
        public final TriggerResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return (this.placementName.hashCode() * 31) + this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "TriggerFire(placementName=" + this.placementName + ", result=" + this.result + ")";
        }
    }

    public static final class UserAttributes extends SuperwallEvent {

        @NotNull
        private final Map<String, Object> attributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserAttributes(@NotNull Map<String, ? extends Object> attributes) {
            super(null);
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.attributes = attributes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserAttributes copy$default(UserAttributes userAttributes, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = userAttributes.attributes;
            }
            return userAttributes.copy(map);
        }

        @NotNull
        public final Map<String, Object> component1() {
            return this.attributes;
        }

        @NotNull
        public final UserAttributes copy(@NotNull Map<String, ? extends Object> attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return new UserAttributes(attributes);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof UserAttributes) && Intrinsics.areEqual(this.attributes, ((UserAttributes) obj).attributes)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }

        @Override // com.superwall.sdk.analytics.superwall.SuperwallEvent
        @NotNull
        public String getRawName() {
            return "user_attributes";
        }

        public int hashCode() {
            return this.attributes.hashCode();
        }

        @NotNull
        public String toString() {
            return "UserAttributes(attributes=" + this.attributes + ")";
        }
    }

    public /* synthetic */ SuperwallEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public SuperwallEvents getBackingEvent() {
        for (SuperwallEvents superwallEvents : SuperwallEvents.values()) {
            if (Intrinsics.areEqual(superwallEvents.getRawName(), getRawName())) {
                Intrinsics.checkNotNull(superwallEvents);
                return superwallEvents;
            }
        }
        superwallEvents = null;
        Intrinsics.checkNotNull(superwallEvents);
        return superwallEvents;
    }

    public final boolean getCanImplicitlyTriggerPaywall() {
        if (!(this instanceof AppInstall) && !(this instanceof SessionStart) && !(this instanceof AppLaunch) && !(this instanceof DeepLink) && !(this instanceof TransactionFail) && !(this instanceof PaywallDecline) && !(this instanceof TransactionAbandon) && !(this instanceof SurveyResponse)) {
            return false;
        }
        return true;
    }

    @NotNull
    public String getRawName() {
        return toString();
    }

    private SuperwallEvent() {
    }
}
