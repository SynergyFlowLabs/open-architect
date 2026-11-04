package com.superwall.sdk.analytics.internal.trackable;

import android.net.Uri;
import com.facebook.internal.a;
import com.facebook.internal.z0;
import com.superwall.sdk.analytics.superwall.SuperwallEvent;
import com.superwall.sdk.analytics.superwall.TransactionProduct;
import com.superwall.sdk.config.models.Survey;
import com.superwall.sdk.config.models.SurveyOption;
import com.superwall.sdk.config.options.SuperwallOptions;
import com.superwall.sdk.config.options.SuperwallOptionsKt;
import com.superwall.sdk.dependencies.ComputedPropertyRequestsFactory;
import com.superwall.sdk.dependencies.FeatureFlagsFactory;
import com.superwall.sdk.dependencies.RuleAttributesFactory;
import com.superwall.sdk.models.enrichment.Enrichment;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.triggers.InternalTriggerResult;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatus;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatusReason;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequestType;
import com.superwall.sdk.paywall.view.survey.SurveyPresentationResult;
import com.superwall.sdk.paywall.view.webview.WebviewError;
import com.superwall.sdk.storage.core_data.ConvertersKt;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import com.superwall.sdk.store.abstractions.transactions.StoreTransaction;
import com.superwall.sdk.store.abstractions.transactions.StoreTransactionType;
import com.superwall.sdk.store.transactions.RestoreType;
import com.superwall.sdk.store.transactions.TransactionError;
import com.superwall.sdk.web.WebPaywallRedeemer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.enums.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p1;
import kotlin.jvm.internal.r1;
import kotlin.k0;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class InternalSuperwallEvent implements TrackableSuperwallEvent {

    @NotNull
    private final SuperwallEvent superwallPlacement;

    public static final class AppClose extends InternalSuperwallEvent {

        @NotNull
        private HashMap<String, Object> audienceFilterParams;

        /* JADX WARN: Multi-variable type inference failed */
        public AppClose() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return new HashMap();
        }

        public void setAudienceFilterParams(@NotNull HashMap<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.audienceFilterParams = map;
        }

        public /* synthetic */ AppClose(HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new HashMap() : map);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public HashMap<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppClose(@NotNull HashMap<String, Object> audienceFilterParams) {
            super(new SuperwallEvent.AppClose(), null);
            Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
            this.audienceFilterParams = audienceFilterParams;
        }
    }

    public static final class AppInstall extends InternalSuperwallEvent {

        @NotNull
        private final String appInstalledAtString;

        @NotNull
        private HashMap<String, Object> audienceFilterParams;
        private final boolean hasExternalPurchaseController;

        public /* synthetic */ AppInstall(String str, boolean z10, HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z10, (i10 & 4) != 0 ? new HashMap() : map);
        }

        @NotNull
        public final String getAppInstalledAtString() {
            return this.appInstalledAtString;
        }

        public final boolean getHasExternalPurchaseController() {
            return this.hasExternalPurchaseController;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return MapsKt.hashMapOf(TuplesKt.to("application_installed_at", this.appInstalledAtString), TuplesKt.to("using_purchase_controller", b.a(this.hasExternalPurchaseController)));
        }

        public void setAudienceFilterParams(@NotNull HashMap<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.audienceFilterParams = map;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public HashMap<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppInstall(@NotNull String appInstalledAtString, boolean z10, @NotNull HashMap<String, Object> audienceFilterParams) {
            super(new SuperwallEvent.AppInstall(), null);
            Intrinsics.checkNotNullParameter(appInstalledAtString, "appInstalledAtString");
            Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
            this.appInstalledAtString = appInstalledAtString;
            this.hasExternalPurchaseController = z10;
            this.audienceFilterParams = audienceFilterParams;
        }
    }

    public static final class AppLaunch extends InternalSuperwallEvent {

        @NotNull
        private HashMap<String, Object> audienceFilterParams;

        /* JADX WARN: Multi-variable type inference failed */
        public AppLaunch() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return new HashMap();
        }

        public void setAudienceFilterParams(@NotNull HashMap<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.audienceFilterParams = map;
        }

        public /* synthetic */ AppLaunch(HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new HashMap() : map);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public HashMap<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppLaunch(@NotNull HashMap<String, Object> audienceFilterParams) {
            super(new SuperwallEvent.AppLaunch(), null);
            Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
            this.audienceFilterParams = audienceFilterParams;
        }
    }

    public static final class AppOpen extends InternalSuperwallEvent {

        @NotNull
        private HashMap<String, Object> audienceFilterParams;

        /* JADX WARN: Multi-variable type inference failed */
        public AppOpen() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return new HashMap();
        }

        public void setAudienceFilterParams(@NotNull HashMap<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.audienceFilterParams = map;
        }

        public /* synthetic */ AppOpen(HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new HashMap() : map);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public HashMap<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppOpen(@NotNull HashMap<String, Object> audienceFilterParams) {
            super(new SuperwallEvent.AppOpen(), null);
            Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
            this.audienceFilterParams = audienceFilterParams;
        }
    }

    public static final class Attributes extends InternalSuperwallEvent {

        @NotNull
        private final String appInstalledAtString;

        @NotNull
        private HashMap<String, Object> audienceFilterParams;

        public /* synthetic */ Attributes(String str, HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? new HashMap() : map);
        }

        @NotNull
        public final String getAppInstalledAtString() {
            return this.appInstalledAtString;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return MapsKt.hashMapOf(TuplesKt.to("application_installed_at", this.appInstalledAtString));
        }

        public void setAudienceFilterParams(@NotNull HashMap<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.audienceFilterParams = map;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public HashMap<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Attributes(@NotNull String appInstalledAtString, @NotNull HashMap<String, Object> audienceFilterParams) {
            super(new SuperwallEvent.UserAttributes(audienceFilterParams), null);
            Intrinsics.checkNotNullParameter(appInstalledAtString, "appInstalledAtString");
            Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
            this.appInstalledAtString = appInstalledAtString;
            this.audienceFilterParams = audienceFilterParams;
        }
    }

    @SourceDebugExtension({"SMAP\nTrackableSuperwallEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackableSuperwallEvent.kt\ncom/superwall/sdk/analytics/internal/trackable/InternalSuperwallEvent$ConfigAttributes\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1036:1\n37#2,2:1037\n*S KotlinDebug\n*F\n+ 1 TrackableSuperwallEvent.kt\ncom/superwall/sdk/analytics/internal/trackable/InternalSuperwallEvent$ConfigAttributes\n*L\n299#1:1037,2\n*E\n"})
    public static final class ConfigAttributes extends InternalSuperwallEvent {

        @NotNull
        private final Map<String, Object> audienceFilterParams;
        private final boolean hasDelegate;
        private final boolean hasExternalPurchaseController;

        @NotNull
        private final SuperwallOptions options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfigAttributes(@NotNull SuperwallOptions options, boolean z10, boolean z11) {
            super(SuperwallEvent.ConfigAttributes.INSTANCE, null);
            Intrinsics.checkNotNullParameter(options, "options");
            this.options = options;
            this.hasExternalPurchaseController = z10;
            this.hasDelegate = z11;
            this.audienceFilterParams = MapsKt.emptyMap();
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        public final boolean getHasDelegate() {
            return this.hasDelegate;
        }

        public final boolean getHasExternalPurchaseController() {
            return this.hasExternalPurchaseController;
        }

        @NotNull
        public final SuperwallOptions getOptions() {
            return this.options;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            Pair[] pairArr = (Pair[]) MapsKt.toList(MapsKt.plus(SuperwallOptionsKt.toMap(this.options), MapsKt.mapOf(TuplesKt.to("using_purchase_controller", b.a(this.hasExternalPurchaseController)), TuplesKt.to("has_delegate", b.a(this.hasDelegate))))).toArray(new Pair[0]);
            return MapsKt.hashMapOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }

    public static final class ConfigFail extends InternalSuperwallEvent {

        @NotNull
        private final Map<String, Object> audienceFilterParams;

        @NotNull
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfigFail(@NotNull String errorMessage) {
            super(SuperwallEvent.ConfigFail.INSTANCE, null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            this.audienceFilterParams = MapsKt.emptyMap();
        }

        public static /* synthetic */ ConfigFail copy$default(ConfigFail configFail, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = configFail.errorMessage;
            }
            return configFail.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.errorMessage;
        }

        @NotNull
        public final ConfigFail copy(@NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new ConfigFail(errorMessage);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof ConfigFail) && Intrinsics.areEqual(this.errorMessage, ((ConfigFail) obj).errorMessage)) {
                return true;
            }
            return false;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        @NotNull
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar) {
            return MapsKt.mapOf(TuplesKt.to(a.Y, this.errorMessage));
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConfigFail(errorMessage=" + this.errorMessage + ")";
        }
    }

    public static final class ConfigRefresh extends InternalSuperwallEvent {

        @NotNull
        private final Map<String, Object> audienceFilterParams;

        @NotNull
        private final String buildId;
        private final long fetchDuration;
        private final boolean isCached;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfigRefresh(boolean z10, @NotNull String buildId, int i10, long j10) {
            super(SuperwallEvent.ConfigRefresh.INSTANCE, null);
            Intrinsics.checkNotNullParameter(buildId, "buildId");
            this.isCached = z10;
            this.buildId = buildId;
            this.retryCount = i10;
            this.fetchDuration = j10;
            this.audienceFilterParams = MapsKt.emptyMap();
        }

        public static /* synthetic */ ConfigRefresh copy$default(ConfigRefresh configRefresh, boolean z10, String str, int i10, long j10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z10 = configRefresh.isCached;
            }
            if ((i11 & 2) != 0) {
                str = configRefresh.buildId;
            }
            if ((i11 & 4) != 0) {
                i10 = configRefresh.retryCount;
            }
            if ((i11 & 8) != 0) {
                j10 = configRefresh.fetchDuration;
            }
            int i12 = i10;
            return configRefresh.copy(z10, str, i12, j10);
        }

        public final boolean component1() {
            return this.isCached;
        }

        @NotNull
        public final String component2() {
            return this.buildId;
        }

        public final int component3() {
            return this.retryCount;
        }

        public final long component4() {
            return this.fetchDuration;
        }

        @NotNull
        public final ConfigRefresh copy(boolean z10, @NotNull String buildId, int i10, long j10) {
            Intrinsics.checkNotNullParameter(buildId, "buildId");
            return new ConfigRefresh(z10, buildId, i10, j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfigRefresh)) {
                return false;
            }
            ConfigRefresh configRefresh = (ConfigRefresh) obj;
            return this.isCached == configRefresh.isCached && Intrinsics.areEqual(this.buildId, configRefresh.buildId) && this.retryCount == configRefresh.retryCount && this.fetchDuration == configRefresh.fetchDuration;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        @NotNull
        public final String getBuildId() {
            return this.buildId;
        }

        public final long getFetchDuration() {
            return this.fetchDuration;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar) {
            return MapsKt.mapOf(TuplesKt.to("cache_status", this.isCached ? "CACHED" : "NOT_CACHED"), TuplesKt.to("config_build_id", this.buildId), TuplesKt.to("retry_count", b.f(this.retryCount)), TuplesKt.to("fetch_duration", b.g(this.fetchDuration)));
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isCached) * 31) + this.buildId.hashCode()) * 31) + Integer.hashCode(this.retryCount)) * 31) + Long.hashCode(this.fetchDuration);
        }

        public final boolean isCached() {
            return this.isCached;
        }

        @NotNull
        public String toString() {
            return "ConfigRefresh(isCached=" + this.isCached + ", buildId=" + this.buildId + ", retryCount=" + this.retryCount + ", fetchDuration=" + this.fetchDuration + ")";
        }
    }

    public static final class ConfirmAllAssignments extends InternalSuperwallEvent {

        @NotNull
        public static final ConfirmAllAssignments INSTANCE = new ConfirmAllAssignments();

        @NotNull
        private static final Map<String, Object> audienceFilterParams = MapsKt.emptyMap();

        private ConfirmAllAssignments() {
            super(SuperwallEvent.ConfirmAllAssignments.INSTANCE, null);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return audienceFilterParams;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar) {
            return MapsKt.emptyMap();
        }
    }

    public static final class CustomPlacement extends InternalSuperwallEvent {
        private final boolean canImplicitlyTriggerPaywall;

        @NotNull
        private final Map<String, Object> params;

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final String placementName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomPlacement(@NotNull String placementName, @NotNull PaywallInfo paywallInfo, @NotNull Map<String, ? extends Object> params) {
            super(new SuperwallEvent.CustomPlacement(placementName, paywallInfo, params), null);
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            Intrinsics.checkNotNullParameter(params, "params");
            this.placementName = placementName;
            this.paywallInfo = paywallInfo;
            this.params = params;
            this.canImplicitlyTriggerPaywall = true;
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
            return Intrinsics.areEqual(this.placementName, customPlacement.placementName) && Intrinsics.areEqual(this.paywallInfo, customPlacement.paywallInfo) && Intrinsics.areEqual(this.params, customPlacement.params);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return MapsKt.plus(this.paywallInfo.audienceFilterParams(), this.params);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent, com.superwall.sdk.analytics.internal.trackable.Trackable
        public boolean getCanImplicitlyTriggerPaywall() {
            return this.canImplicitlyTriggerPaywall;
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

        @Override // com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent, com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public String getRawName() {
            return this.placementName;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar) {
            return MapsKt.plus(MapsKt.plus(PaywallInfo.eventParams$default(this.paywallInfo, null, null, 3, null), this.params), MapsKt.mapOf(TuplesKt.to("name", this.placementName)));
        }

        public int hashCode() {
            return (((this.placementName.hashCode() * 31) + this.paywallInfo.hashCode()) * 31) + this.params.hashCode();
        }

        @NotNull
        public String toString() {
            return "CustomPlacement(placementName=" + this.placementName + ", paywallInfo=" + this.paywallInfo + ", params=" + this.params + ")";
        }
    }

    public static final class DeepLink extends InternalSuperwallEvent {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private HashMap<String, Object> audienceFilterParams;

        @NotNull
        private final Uri uri;

        @SourceDebugExtension({"SMAP\nTrackableSuperwallEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackableSuperwallEvent.kt\ncom/superwall/sdk/analytics/internal/trackable/InternalSuperwallEvent$DeepLink$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1036:1\n1863#2,2:1037\n*S KotlinDebug\n*F\n+ 1 TrackableSuperwallEvent.kt\ncom/superwall/sdk/analytics/internal/trackable/InternalSuperwallEvent$DeepLink$Companion\n*L\n154#1:1037,2\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final HashMap<String, Object> extractQueryParameters(Uri uri) {
                HashMap<String, Object> map = new HashMap<>();
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
                for (String str : queryParameterNames) {
                    String queryParameter = uri.getQueryParameter(str);
                    if (queryParameter != null) {
                        if (StringsKt.N1(queryParameter, z0.P, true)) {
                            map.put(str, Boolean.TRUE);
                        } else if (StringsKt.N1(queryParameter, "false", true)) {
                            map.put(str, Boolean.FALSE);
                        } else if (StringsKt.toIntOrNull(queryParameter) != null) {
                            map.put(str, Integer.valueOf(Integer.parseInt(queryParameter)));
                        } else if (StringsKt.L0(queryParameter) != null) {
                            map.put(str, Double.valueOf(Double.parseDouble(queryParameter)));
                        } else {
                            map.put(str, queryParameter);
                        }
                    }
                }
                return map;
            }

            private Companion() {
            }
        }

        static {
            int i10 = 1 >> 0;
        }

        public /* synthetic */ DeepLink(Uri uri, HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(uri, (i10 & 2) != 0 ? Companion.extractQueryParameters(uri) : map);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            String strS5;
            Pair pair = TuplesKt.to("url", this.uri.toString());
            String path = this.uri.getPath();
            if (path == null) {
                path = "";
            }
            Pair pair2 = TuplesKt.to("path", path);
            String lastPathSegment = this.uri.getLastPathSegment();
            if (lastPathSegment == null || (strS5 = StringsKt.s5(lastPathSegment, '.', null, 2, null)) == null) {
                strS5 = "";
            }
            Pair pair3 = TuplesKt.to("pathExtension", strS5);
            String lastPathSegment2 = this.uri.getLastPathSegment();
            if (lastPathSegment2 == null) {
                lastPathSegment2 = "";
            }
            Pair pair4 = TuplesKt.to("lastPathComponent", lastPathSegment2);
            String host = this.uri.getHost();
            if (host == null) {
                host = "";
            }
            Pair pair5 = TuplesKt.to("host", host);
            String query = this.uri.getQuery();
            if (query == null) {
                query = "";
            }
            Pair pair6 = TuplesKt.to("query", query);
            String fragment = this.uri.getFragment();
            return MapsKt.hashMapOf(pair, pair2, pair3, pair4, pair5, pair6, TuplesKt.to("fragment", fragment != null ? fragment : ""));
        }

        @NotNull
        public final Uri getUri() {
            return this.uri;
        }

        public void setAudienceFilterParams(@NotNull HashMap<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.audienceFilterParams = map;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public HashMap<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeepLink(@NotNull Uri uri, @NotNull HashMap<String, Object> audienceFilterParams) {
            super(new SuperwallEvent.DeepLink(uri), null);
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
            this.uri = uri;
            this.audienceFilterParams = audienceFilterParams;
        }
    }

    public static final class DeviceAttributes extends InternalSuperwallEvent {

        @NotNull
        private HashMap<String, Object> audienceFilterParams;

        @NotNull
        private final HashMap<String, Object> deviceAttributes;

        public /* synthetic */ DeviceAttributes(HashMap map, HashMap map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, (i10 & 2) != 0 ? new HashMap() : map2);
        }

        @NotNull
        public final HashMap<String, Object> getDeviceAttributes() {
            return this.deviceAttributes;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return this.deviceAttributes;
        }

        public void setAudienceFilterParams(@NotNull HashMap<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.audienceFilterParams = map;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public HashMap<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceAttributes(@NotNull HashMap<String, Object> deviceAttributes, @NotNull HashMap<String, Object> audienceFilterParams) {
            super(new SuperwallEvent.DeviceAttributes(deviceAttributes), null);
            Intrinsics.checkNotNullParameter(deviceAttributes, "deviceAttributes");
            Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
            this.deviceAttributes = deviceAttributes;
            this.audienceFilterParams = audienceFilterParams;
        }
    }

    @SourceDebugExtension({"SMAP\nTrackableSuperwallEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackableSuperwallEvent.kt\ncom/superwall/sdk/analytics/internal/trackable/InternalSuperwallEvent$EnrichmentLoad\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1036:1\n462#2:1037\n412#2:1038\n462#2:1043\n412#2:1044\n1246#3,4:1039\n1246#3,4:1045\n126#4:1049\n153#4,3:1050\n126#4:1053\n153#4,3:1054\n*S KotlinDebug\n*F\n+ 1 TrackableSuperwallEvent.kt\ncom/superwall/sdk/analytics/internal/trackable/InternalSuperwallEvent$EnrichmentLoad\n*L\n1002#1:1037\n1002#1:1038\n1003#1:1043\n1003#1:1044\n1002#1:1039,4\n1003#1:1045,4\n1024#1:1049\n1024#1:1050,3\n1027#1:1053\n1027#1:1054,3\n*E\n"})
    public static final class EnrichmentLoad extends InternalSuperwallEvent {

        @NotNull
        private final Map<String, Object> audienceFilterParams;

        @NotNull
        private final State state;

        public static abstract class State {

            public static final class Complete extends State {

                @NotNull
                private final Enrichment enrichment;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Complete(@NotNull Enrichment enrichment) {
                    super(null);
                    Intrinsics.checkNotNullParameter(enrichment, "enrichment");
                    this.enrichment = enrichment;
                }

                public static /* synthetic */ Complete copy$default(Complete complete, Enrichment enrichment, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        enrichment = complete.enrichment;
                    }
                    return complete.copy(enrichment);
                }

                @NotNull
                public final Enrichment component1() {
                    return this.enrichment;
                }

                @NotNull
                public final Complete copy(@NotNull Enrichment enrichment) {
                    Intrinsics.checkNotNullParameter(enrichment, "enrichment");
                    return new Complete(enrichment);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof Complete) && Intrinsics.areEqual(this.enrichment, ((Complete) obj).enrichment)) {
                        return true;
                    }
                    return false;
                }

                @NotNull
                public final Enrichment getEnrichment() {
                    return this.enrichment;
                }

                public int hashCode() {
                    return this.enrichment.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Complete(enrichment=" + this.enrichment + ")";
                }
            }

            public static final class Fail extends State {

                @NotNull
                public static final Fail INSTANCE = new Fail();

                private Fail() {
                    super(null);
                }
            }

            public static final class Start extends State {

                @NotNull
                public static final Start INSTANCE = new Start();

                private Start() {
                    super(null);
                }
            }

            public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private State() {
            }
        }

        public EnrichmentLoad(@NotNull State state) {
            SuperwallEvent enrichmentComplete;
            Intrinsics.checkNotNullParameter(state, "state");
            if (state instanceof State.Complete) {
                State.Complete complete = (State.Complete) state;
                Map map = MapsKt.toMap(complete.getEnrichment().getUser());
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ConvertersKt.convertFromJsonElement((JsonElement) entry.getValue()));
                }
                JsonObject device = complete.getEnrichment().getDevice();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(device.size()));
                Iterator<T> it = device.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    linkedHashMap2.put(entry2.getKey(), ConvertersKt.convertFromJsonElement((JsonElement) entry2.getValue()));
                }
                enrichmentComplete = new SuperwallEvent.EnrichmentComplete(linkedHashMap, linkedHashMap2);
            } else if (Intrinsics.areEqual(state, State.Fail.INSTANCE)) {
                enrichmentComplete = SuperwallEvent.EnrichmentFail.INSTANCE;
            } else {
                if (!Intrinsics.areEqual(state, State.Start.INSTANCE)) {
                    throw new k0();
                }
                enrichmentComplete = SuperwallEvent.EnrichmentStart.INSTANCE;
            }
            super(enrichmentComplete, null);
            this.state = state;
            this.audienceFilterParams = MapsKt.emptyMap();
        }

        public static /* synthetic */ EnrichmentLoad copy$default(EnrichmentLoad enrichmentLoad, State state, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                state = enrichmentLoad.state;
            }
            return enrichmentLoad.copy(state);
        }

        @NotNull
        public final State component1() {
            return this.state;
        }

        @NotNull
        public final EnrichmentLoad copy(@NotNull State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new EnrichmentLoad(state);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof EnrichmentLoad) && Intrinsics.areEqual(this.state, ((EnrichmentLoad) obj).state)) {
                return true;
            }
            return false;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        @NotNull
        public final State getState() {
            return this.state;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar) {
            State state = this.state;
            if (!(state instanceof State.Complete)) {
                return MapsKt.emptyMap();
            }
            JsonObject user = ((State.Complete) state).getEnrichment().getUser();
            ArrayList arrayList = new ArrayList(user.size());
            for (Map.Entry<String, JsonElement> entry : user.entrySet()) {
                arrayList.add(TuplesKt.to("user_" + ((Object) entry.getKey()), entry.getValue()));
            }
            JsonObject device = ((State.Complete) this.state).getEnrichment().getDevice();
            ArrayList arrayList2 = new ArrayList(device.size());
            for (Map.Entry<String, JsonElement> entry2 : device.entrySet()) {
                arrayList2.add(TuplesKt.to("device_" + ((Object) entry2.getKey()), entry2.getValue()));
            }
            return MapsKt.toMap(CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2));
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        @NotNull
        public String toString() {
            return "EnrichmentLoad(state=" + this.state + ")";
        }
    }

    public static final class ErrorThrown extends InternalSuperwallEvent {

        @NotNull
        private final Map<String, Object> audienceFilterParams;
        private final boolean isFatal;

        @NotNull
        private final String message;
        private final long occuredAt;

        @NotNull
        private final String stacktrace;

        @NotNull
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorThrown(@NotNull String message, @NotNull String stacktrace, long j10, @NotNull String type, boolean z10) {
            super(SuperwallEvent.ErrorThrown.INSTANCE, null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
            Intrinsics.checkNotNullParameter(type, "type");
            this.message = message;
            this.stacktrace = stacktrace;
            this.occuredAt = j10;
            this.type = type;
            this.isFatal = z10;
            this.audienceFilterParams = MapsKt.emptyMap();
        }

        public static /* synthetic */ ErrorThrown copy$default(ErrorThrown errorThrown, String str, String str2, long j10, String str3, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = errorThrown.message;
            }
            if ((i10 & 2) != 0) {
                str2 = errorThrown.stacktrace;
            }
            if ((i10 & 4) != 0) {
                j10 = errorThrown.occuredAt;
            }
            if ((i10 & 8) != 0) {
                str3 = errorThrown.type;
            }
            if ((i10 & 16) != 0) {
                z10 = errorThrown.isFatal;
            }
            long j11 = j10;
            return errorThrown.copy(str, str2, j11, str3, z10);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final String component2() {
            return this.stacktrace;
        }

        public final long component3() {
            return this.occuredAt;
        }

        @NotNull
        public final String component4() {
            return this.type;
        }

        public final boolean component5() {
            return this.isFatal;
        }

        @NotNull
        public final ErrorThrown copy(@NotNull String message, @NotNull String stacktrace, long j10, @NotNull String type, boolean z10) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
            Intrinsics.checkNotNullParameter(type, "type");
            return new ErrorThrown(message, stacktrace, j10, type, z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorThrown)) {
                return false;
            }
            ErrorThrown errorThrown = (ErrorThrown) obj;
            return Intrinsics.areEqual(this.message, errorThrown.message) && Intrinsics.areEqual(this.stacktrace, errorThrown.stacktrace) && this.occuredAt == errorThrown.occuredAt && Intrinsics.areEqual(this.type, errorThrown.type) && this.isFatal == errorThrown.isFatal;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final long getOccuredAt() {
            return this.occuredAt;
        }

        @NotNull
        public final String getStacktrace() {
            return this.stacktrace;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar) {
            return MapsKt.mapOf(TuplesKt.to("exception_type", this.type), TuplesKt.to(a.Y, this.message), TuplesKt.to("error_stack_trace", this.stacktrace), TuplesKt.to("occured_at", b.g(this.occuredAt)), TuplesKt.to("is_fatal", b.a(this.isFatal)));
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((((this.message.hashCode() * 31) + this.stacktrace.hashCode()) * 31) + Long.hashCode(this.occuredAt)) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.isFatal);
        }

        public final boolean isFatal() {
            return this.isFatal;
        }

        @NotNull
        public String toString() {
            return "ErrorThrown(message=" + this.message + ", stacktrace=" + this.stacktrace + ", occuredAt=" + this.occuredAt + ", type=" + this.type + ", isFatal=" + this.isFatal + ")";
        }
    }

    public static final class ExpressionResult extends InternalSuperwallEvent {

        @NotNull
        private final Map<String, Object> audienceFilterParams;

        @Nullable
        private final String celExpression;

        @Nullable
        private final Boolean celExpressionResult;

        @Nullable
        private final String errorMessage;

        @Nullable
        private final String jsExpression;

        @Nullable
        private final Boolean jsExpressionResult;

        @Nullable
        private final String liquidExpression;

        @Nullable
        private final Boolean liquidExpressionResult;

        public ExpressionResult() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public static /* synthetic */ ExpressionResult copy$default(ExpressionResult expressionResult, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = expressionResult.celExpression;
            }
            if ((i10 & 2) != 0) {
                str2 = expressionResult.liquidExpression;
            }
            if ((i10 & 4) != 0) {
                str3 = expressionResult.jsExpression;
            }
            if ((i10 & 8) != 0) {
                bool = expressionResult.celExpressionResult;
            }
            if ((i10 & 16) != 0) {
                bool2 = expressionResult.liquidExpressionResult;
            }
            if ((i10 & 32) != 0) {
                bool3 = expressionResult.jsExpressionResult;
            }
            if ((i10 & 64) != 0) {
                str4 = expressionResult.errorMessage;
            }
            Boolean bool4 = bool3;
            String str5 = str4;
            Boolean bool5 = bool2;
            String str6 = str3;
            return expressionResult.copy(str, str2, str6, bool, bool5, bool4, str5);
        }

        @Nullable
        public final String component1() {
            return this.celExpression;
        }

        @Nullable
        public final String component2() {
            return this.liquidExpression;
        }

        @Nullable
        public final String component3() {
            return this.jsExpression;
        }

        @Nullable
        public final Boolean component4() {
            return this.celExpressionResult;
        }

        @Nullable
        public final Boolean component5() {
            return this.liquidExpressionResult;
        }

        @Nullable
        public final Boolean component6() {
            return this.jsExpressionResult;
        }

        @Nullable
        public final String component7() {
            return this.errorMessage;
        }

        @NotNull
        public final ExpressionResult copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str4) {
            return new ExpressionResult(str, str2, str3, bool, bool2, bool3, str4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpressionResult)) {
                return false;
            }
            ExpressionResult expressionResult = (ExpressionResult) obj;
            return Intrinsics.areEqual(this.celExpression, expressionResult.celExpression) && Intrinsics.areEqual(this.liquidExpression, expressionResult.liquidExpression) && Intrinsics.areEqual(this.jsExpression, expressionResult.jsExpression) && Intrinsics.areEqual(this.celExpressionResult, expressionResult.celExpressionResult) && Intrinsics.areEqual(this.liquidExpressionResult, expressionResult.liquidExpressionResult) && Intrinsics.areEqual(this.jsExpressionResult, expressionResult.jsExpressionResult) && Intrinsics.areEqual(this.errorMessage, expressionResult.errorMessage);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        @Nullable
        public final String getCelExpression() {
            return this.celExpression;
        }

        @Nullable
        public final Boolean getCelExpressionResult() {
            return this.celExpressionResult;
        }

        @Nullable
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Nullable
        public final String getJsExpression() {
            return this.jsExpression;
        }

        @Nullable
        public final Boolean getJsExpressionResult() {
            return this.jsExpressionResult;
        }

        @Nullable
        public final String getLiquidExpression() {
            return this.liquidExpression;
        }

        @Nullable
        public final Boolean getLiquidExpressionResult() {
            return this.liquidExpressionResult;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar) {
            String str = this.celExpression;
            if (str == null) {
                str = "";
            }
            Pair pair = TuplesKt.to("cel_expression", str);
            String str2 = this.liquidExpression;
            if (str2 == null) {
                str2 = "";
            }
            Pair pair2 = TuplesKt.to("liquid_expression", str2);
            String str3 = this.jsExpression;
            if (str3 == null) {
                str3 = "";
            }
            Pair pair3 = TuplesKt.to("js_expression", str3);
            Object obj = this.celExpressionResult;
            if (obj == null) {
                obj = "";
            }
            Pair pair4 = TuplesKt.to("cel_expression_result", obj);
            Object obj2 = this.liquidExpressionResult;
            if (obj2 == null) {
                obj2 = "";
            }
            Pair pair5 = TuplesKt.to("liquid_expression_result", obj2);
            Object obj3 = this.jsExpressionResult;
            if (obj3 == null) {
                obj3 = "";
            }
            Pair pair6 = TuplesKt.to("js_expression_result", obj3);
            String str4 = this.errorMessage;
            return MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, TuplesKt.to(a.Y, str4 != null ? str4 : ""));
        }

        public int hashCode() {
            String str = this.celExpression;
            int iHashCode = 0;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.liquidExpression;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.jsExpression;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.celExpressionResult;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.liquidExpressionResult;
            int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.jsExpressionResult;
            int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str4 = this.errorMessage;
            if (str4 != null) {
                iHashCode = str4.hashCode();
            }
            return iHashCode7 + iHashCode;
        }

        @NotNull
        public String toString() {
            return "ExpressionResult(celExpression=" + this.celExpression + ", liquidExpression=" + this.liquidExpression + ", jsExpression=" + this.jsExpression + ", celExpressionResult=" + this.celExpressionResult + ", liquidExpressionResult=" + this.liquidExpressionResult + ", jsExpressionResult=" + this.jsExpressionResult + ", errorMessage=" + this.errorMessage + ")";
        }

        public /* synthetic */ ExpressionResult(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : bool, (i10 & 16) != 0 ? null : bool2, (i10 & 32) != 0 ? null : bool3, (i10 & 64) != 0 ? null : str4);
        }

        public ExpressionResult(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str4) {
            super(SuperwallEvent.ExpressionResult.INSTANCE, null);
            this.celExpression = str;
            this.liquidExpression = str2;
            this.jsExpression = str3;
            this.celExpressionResult = bool;
            this.liquidExpressionResult = bool2;
            this.jsExpressionResult = bool3;
            this.errorMessage = str4;
            this.audienceFilterParams = MapsKt.emptyMap();
        }
    }

    public static final class FirstSeen extends InternalSuperwallEvent {

        @NotNull
        private HashMap<String, Object> audienceFilterParams;

        /* JADX WARN: Multi-variable type inference failed */
        public FirstSeen() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return new HashMap();
        }

        public void setAudienceFilterParams(@NotNull HashMap<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.audienceFilterParams = map;
        }

        public /* synthetic */ FirstSeen(HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new HashMap() : map);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public HashMap<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FirstSeen(@NotNull HashMap<String, Object> audienceFilterParams) {
            super(new SuperwallEvent.FirstSeen(), null);
            Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
            this.audienceFilterParams = audienceFilterParams;
        }
    }

    public static final class FreeTrialStart extends InternalSuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final StoreProduct product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FreeTrialStart(@NotNull PaywallInfo paywallInfo, @NotNull StoreProduct product) {
            super(new SuperwallEvent.FreeTrialStart(product, paywallInfo), null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            Intrinsics.checkNotNullParameter(product, "product");
            this.paywallInfo = paywallInfo;
            this.product = product;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.paywallInfo.audienceFilterParams();
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final StoreProduct getProduct() {
            return this.product;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return new HashMap(PaywallInfo.eventParams$default(this.paywallInfo, this.product, null, 2, null));
        }
    }

    public static final class IdentityAlias extends InternalSuperwallEvent {

        @NotNull
        private HashMap<String, Object> audienceFilterParams;

        /* JADX WARN: Multi-variable type inference failed */
        public IdentityAlias() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return new HashMap();
        }

        public void setAudienceFilterParams(@NotNull HashMap<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.audienceFilterParams = map;
        }

        public /* synthetic */ IdentityAlias(HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new HashMap() : map);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public HashMap<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdentityAlias(@NotNull HashMap<String, Object> audienceFilterParams) {
            super(new SuperwallEvent.IdentityAlias(), null);
            Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
            this.audienceFilterParams = audienceFilterParams;
        }
    }

    public static final class NonRecurringProductPurchase extends InternalSuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final StoreProduct product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NonRecurringProductPurchase(@NotNull PaywallInfo paywallInfo, @NotNull StoreProduct product) {
            super(new SuperwallEvent.NonRecurringProductPurchase(new TransactionProduct(product), paywallInfo), null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            Intrinsics.checkNotNullParameter(product, "product");
            this.paywallInfo = paywallInfo;
            this.product = product;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.paywallInfo.audienceFilterParams();
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final StoreProduct getProduct() {
            return this.product;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return new HashMap(PaywallInfo.eventParams$default(this.paywallInfo, this.product, null, 2, null));
        }
    }

    public static final class PaywallClose extends InternalSuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final SurveyPresentationResult surveyPresentationResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallClose(@NotNull PaywallInfo paywallInfo, @NotNull SurveyPresentationResult surveyPresentationResult) {
            super(new SuperwallEvent.PaywallClose(paywallInfo), null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            Intrinsics.checkNotNullParameter(surveyPresentationResult, "surveyPresentationResult");
            this.paywallInfo = paywallInfo;
            this.surveyPresentationResult = surveyPresentationResult;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.paywallInfo.audienceFilterParams();
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("survey_attached", b.a(!this.paywallInfo.getSurveys().isEmpty())));
            SurveyPresentationResult surveyPresentationResult = this.surveyPresentationResult;
            if (surveyPresentationResult != SurveyPresentationResult.NOSHOW) {
                mapMutableMapOf.put("survey_presentation", surveyPresentationResult.getRawValue());
            }
            mapMutableMapOf.putAll(PaywallInfo.eventParams$default(this.paywallInfo, null, null, 3, null));
            return new HashMap(mapMutableMapOf);
        }

        @NotNull
        public final SurveyPresentationResult getSurveyPresentationResult() {
            return this.surveyPresentationResult;
        }
    }

    public static final class PaywallDecline extends InternalSuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallDecline(@NotNull PaywallInfo paywallInfo) {
            super(new SuperwallEvent.PaywallDecline(paywallInfo), null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.paywallInfo = paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.paywallInfo.audienceFilterParams();
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return new HashMap(PaywallInfo.eventParams$default(this.paywallInfo, null, null, 3, null));
        }
    }

    @SourceDebugExtension({"SMAP\nTrackableSuperwallEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackableSuperwallEvent.kt\ncom/superwall/sdk/analytics/internal/trackable/InternalSuperwallEvent$PaywallLoad\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1036:1\n503#2,7:1037\n*S KotlinDebug\n*F\n+ 1 TrackableSuperwallEvent.kt\ncom/superwall/sdk/analytics/internal/trackable/InternalSuperwallEvent$PaywallLoad\n*L\n255#1:1037,7\n*E\n"})
    public static final class PaywallLoad extends InternalSuperwallEvent {

        @Nullable
        private final EventData eventData;

        @NotNull
        private final State state;

        public static abstract class State {

            public static final class Complete extends State {

                @NotNull
                private final PaywallInfo paywallInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Complete(@NotNull PaywallInfo paywallInfo) {
                    super(null);
                    Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
                    this.paywallInfo = paywallInfo;
                }

                @NotNull
                public final PaywallInfo getPaywallInfo() {
                    return this.paywallInfo;
                }
            }

            public static final class Fail extends State {
                public Fail() {
                    super(null);
                }
            }

            public static final class NotFound extends State {
                public NotFound() {
                    super(null);
                }
            }

            public static final class Start extends State {
                public Start() {
                    super(null);
                }
            }

            public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private State() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallLoad(@NotNull State state, @Nullable EventData eventData) {
            super(new SuperwallEvent.PaywallResponseLoadStart(eventData != null ? eventData.getName() : null), null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
            this.eventData = eventData;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            State state = this.state;
            return state instanceof State.Complete ? ((State.Complete) state).getPaywallInfo().audienceFilterParams() : MapsKt.emptyMap();
        }

        @Nullable
        public final EventData getEventData() {
            return this.eventData;
        }

        @NotNull
        public final State getState() {
            return this.state;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.to("is_triggered_from_event", b.a(this.eventData != null)));
            State state = this.state;
            if (!(state instanceof State.Start) && !(state instanceof State.NotFound) && !(state instanceof State.Fail)) {
                if (!(state instanceof State.Complete)) {
                    throw new k0();
                }
                Map mapEventParams$default = PaywallInfo.eventParams$default(((State.Complete) state).getPaywallInfo(), null, mapHashMapOf, 1, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapEventParams$default.entrySet()) {
                    if (entry.getValue() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return new HashMap(linkedHashMap);
            }
            return mapHashMapOf;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent, com.superwall.sdk.analytics.internal.trackable.TrackableSuperwallEvent
        @NotNull
        public SuperwallEvent getSuperwallPlacement() {
            State state = this.state;
            if (state instanceof State.Start) {
                EventData eventData = this.eventData;
                return new SuperwallEvent.PaywallResponseLoadStart(eventData != null ? eventData.getName() : null);
            }
            if (state instanceof State.Complete) {
                EventData eventData2 = this.eventData;
                return new SuperwallEvent.PaywallResponseLoadComplete(eventData2 != null ? eventData2.getName() : null, ((State.Complete) this.state).getPaywallInfo());
            }
            if (state instanceof State.Fail) {
                EventData eventData3 = this.eventData;
                return new SuperwallEvent.PaywallResponseLoadFail(eventData3 != null ? eventData3.getName() : null);
            }
            if (!(state instanceof State.NotFound)) {
                throw new k0();
            }
            EventData eventData4 = this.eventData;
            return new SuperwallEvent.PaywallResponseLoadNotFound(eventData4 != null ? eventData4.getName() : null);
        }
    }

    public static final class PaywallOpen extends InternalSuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallOpen(@NotNull PaywallInfo paywallInfo) {
            super(new SuperwallEvent.PaywallOpen(paywallInfo), null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.paywallInfo = paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.paywallInfo.audienceFilterParams();
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return new HashMap(PaywallInfo.eventParams$default(this.paywallInfo, null, null, 3, null));
        }
    }

    public static final class PaywallProductsLoad extends InternalSuperwallEvent {

        @Nullable
        private final EventData eventData;

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final State state;

        public static abstract class State {

            public static final class Complete extends State {
                public Complete() {
                    super(null);
                }
            }

            public static final class Fail extends State {

                @Nullable
                private final String errorMessage;

                public Fail(@Nullable String str) {
                    super(null);
                    this.errorMessage = str;
                }

                @Nullable
                public final String getErrorMessage() {
                    return this.errorMessage;
                }
            }

            public static final class Start extends State {
                public Start() {
                    super(null);
                }
            }

            public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private State() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallProductsLoad(@NotNull State state, @NotNull PaywallInfo paywallInfo, @Nullable EventData eventData) {
            super(new SuperwallEvent.PaywallProductsLoadStart(eventData != null ? eventData.getName() : null, paywallInfo), null);
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.state = state;
            this.paywallInfo = paywallInfo;
            this.eventData = eventData;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.paywallInfo.audienceFilterParams();
        }

        @Nullable
        public final EventData getEventData() {
            return this.eventData;
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final State getState() {
            return this.state;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.to("is_triggered_from_event", b.a(this.eventData != null)));
            State state = this.state;
            if ((state instanceof State.Fail) && ((State.Fail) state).getErrorMessage() != null) {
                mapHashMapOf.put(a.Y, ((State.Fail) this.state).getErrorMessage());
            }
            mapHashMapOf.putAll(PaywallInfo.eventParams$default(this.paywallInfo, null, null, 3, null));
            return mapHashMapOf;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent, com.superwall.sdk.analytics.internal.trackable.TrackableSuperwallEvent
        @NotNull
        public SuperwallEvent getSuperwallPlacement() {
            State state = this.state;
            if (state instanceof State.Start) {
                EventData eventData = this.eventData;
                return new SuperwallEvent.PaywallProductsLoadStart(eventData != null ? eventData.getName() : null, this.paywallInfo);
            }
            if (state instanceof State.Fail) {
                String errorMessage = ((State.Fail) state).getErrorMessage();
                EventData eventData2 = this.eventData;
                return new SuperwallEvent.PaywallProductsLoadFail(errorMessage, eventData2 != null ? eventData2.getName() : null, this.paywallInfo);
            }
            if (!(state instanceof State.Complete)) {
                throw new k0();
            }
            EventData eventData3 = this.eventData;
            return new SuperwallEvent.PaywallProductsLoadComplete(eventData3 != null ? eventData3.getName() : null, this.paywallInfo);
        }
    }

    public static final class PaywallResourceLoadFail extends InternalSuperwallEvent {

        @NotNull
        private final String error;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallResourceLoadFail(@NotNull String url, @NotNull String error) {
            super(new SuperwallEvent.PaywallResourceLoadFail(url, error), null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(error, "error");
            this.url = url;
            this.error = error;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return MapsKt.emptyMap();
        }

        @NotNull
        public final String getError() {
            return this.error;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar) {
            return MapsKt.mapOf(TuplesKt.to("url", this.url), TuplesKt.to("error", this.error));
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }
    }

    @SourceDebugExtension({"SMAP\nTrackableSuperwallEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackableSuperwallEvent.kt\ncom/superwall/sdk/analytics/internal/trackable/InternalSuperwallEvent$PaywallWebviewLoad\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1036:1\n1567#2:1037\n1598#2,4:1038\n37#3,2:1042\n*S KotlinDebug\n*F\n+ 1 TrackableSuperwallEvent.kt\ncom/superwall/sdk/analytics/internal/trackable/InternalSuperwallEvent$PaywallWebviewLoad\n*L\n701#1:1037\n701#1:1038,4\n703#1:1042,2\n*E\n"})
    public static final class PaywallWebviewLoad extends InternalSuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final State state;

        public static abstract class State {

            public static final class Complete extends State {
                public Complete() {
                    super(null);
                }
            }

            public static final class Fail extends State {

                @NotNull
                private final WebviewError error;

                @NotNull
                private final List<String> urls;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Fail(@NotNull WebviewError error, @NotNull List<String> urls) {
                    super(null);
                    Intrinsics.checkNotNullParameter(error, "error");
                    Intrinsics.checkNotNullParameter(urls, "urls");
                    this.error = error;
                    this.urls = urls;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Fail copy$default(Fail fail, WebviewError webviewError, List list, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        webviewError = fail.error;
                    }
                    if ((i10 & 2) != 0) {
                        list = fail.urls;
                    }
                    return fail.copy(webviewError, list);
                }

                @NotNull
                public final WebviewError component1() {
                    return this.error;
                }

                @NotNull
                public final List<String> component2() {
                    return this.urls;
                }

                @NotNull
                public final Fail copy(@NotNull WebviewError error, @NotNull List<String> urls) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    Intrinsics.checkNotNullParameter(urls, "urls");
                    return new Fail(error, urls);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Fail)) {
                        return false;
                    }
                    Fail fail = (Fail) obj;
                    return Intrinsics.areEqual(this.error, fail.error) && Intrinsics.areEqual(this.urls, fail.urls);
                }

                @NotNull
                public final WebviewError getError() {
                    return this.error;
                }

                @NotNull
                public final List<String> getUrls() {
                    return this.urls;
                }

                public int hashCode() {
                    return (this.error.hashCode() * 31) + this.urls.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Fail(error=" + this.error + ", urls=" + this.urls + ")";
                }
            }

            public static final class Fallback extends State {

                @NotNull
                public static final Fallback INSTANCE = new Fallback();

                private Fallback() {
                    super(null);
                }
            }

            public static final class Start extends State {
                public Start() {
                    super(null);
                }
            }

            public static final class Timeout extends State {
                public Timeout() {
                    super(null);
                }
            }

            public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private State() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaywallWebviewLoad(@NotNull State state, @NotNull PaywallInfo paywallInfo) {
            super(new SuperwallEvent.PaywallWebviewLoadStart(paywallInfo), null);
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            this.state = state;
            this.paywallInfo = paywallInfo;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.paywallInfo.audienceFilterParams();
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final State getState() {
            return this.state;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            Map mapEmptyMap;
            if (this.state instanceof State.Fail) {
                p1 p1Var = new p1(2);
                p1Var.a(TuplesKt.to(a.Y, ((State.Fail) this.state).getError()));
                List<String> urls = ((State.Fail) this.state).getUrls();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(urls, 10));
                int i10 = 0;
                for (Object obj : urls) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(TuplesKt.to("url_" + i10, (String) obj));
                    i10 = i11;
                }
                p1Var.b(arrayList.toArray(new Pair[0]));
                mapEmptyMap = MapsKt.mapOf((Pair[]) p1Var.d(new Pair[p1Var.c()]));
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            return new HashMap(MapsKt.plus(PaywallInfo.eventParams$default(this.paywallInfo, null, null, 3, null), mapEmptyMap));
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent, com.superwall.sdk.analytics.internal.trackable.TrackableSuperwallEvent
        @NotNull
        public SuperwallEvent getSuperwallPlacement() {
            State state = this.state;
            if (state instanceof State.Start) {
                return new SuperwallEvent.PaywallWebviewLoadStart(this.paywallInfo);
            }
            if (state instanceof State.Timeout) {
                return new SuperwallEvent.PaywallWebviewLoadTimeout(this.paywallInfo);
            }
            if (state instanceof State.Fail) {
                return new SuperwallEvent.PaywallWebviewLoadFail(this.paywallInfo, ((State.Fail) state).getError());
            }
            if (state instanceof State.Complete) {
                return new SuperwallEvent.PaywallWebviewLoadComplete(this.paywallInfo);
            }
            if (state instanceof State.Fallback) {
                return new SuperwallEvent.PaywallWebviewLoadFallback(this.paywallInfo);
            }
            throw new k0();
        }
    }

    public static final class PresentationRequest extends InternalSuperwallEvent {

        @NotNull
        private HashMap<String, Object> audienceFilterParams;

        @Nullable
        private final EventData eventData;

        @NotNull
        private final Factory factory;

        @NotNull
        private final PaywallPresentationRequestStatus status;

        @Nullable
        private final PaywallPresentationRequestStatusReason statusReason;

        @NotNull
        private final PresentationRequestType type;

        public interface Factory extends RuleAttributesFactory, FeatureFlagsFactory, ComputedPropertyRequestsFactory {
        }

        public /* synthetic */ PresentationRequest(EventData eventData, PresentationRequestType presentationRequestType, PaywallPresentationRequestStatus paywallPresentationRequestStatus, PaywallPresentationRequestStatusReason paywallPresentationRequestStatusReason, Factory factory, HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(eventData, presentationRequestType, paywallPresentationRequestStatus, paywallPresentationRequestStatusReason, factory, (i10 & 32) != 0 ? new HashMap() : map);
        }

        @Nullable
        public final EventData getEventData() {
            return this.eventData;
        }

        @NotNull
        public final Factory getFactory() {
            return this.factory;
        }

        @NotNull
        public final PaywallPresentationRequestStatus getStatus() {
            return this.status;
        }

        @Nullable
        public final PaywallPresentationRequestStatusReason getStatusReason() {
            return this.statusReason;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            String name;
            String description;
            EventData eventData = this.eventData;
            String str = "";
            if (eventData == null || (name = eventData.getName()) == null) {
                name = "";
            }
            Pair pair = TuplesKt.to("source_event_name", name);
            Pair pair2 = TuplesKt.to("pipeline_type", this.type.getDescription());
            Pair pair3 = TuplesKt.to("status", this.status.getStatus());
            PaywallPresentationRequestStatusReason paywallPresentationRequestStatusReason = this.statusReason;
            if (paywallPresentationRequestStatusReason != null && (description = paywallPresentationRequestStatusReason.getDescription()) != null) {
                str = description;
            }
            return MapsKt.hashMapOf(pair, pair2, pair3, TuplesKt.to("status_reason", str));
        }

        @NotNull
        public final PresentationRequestType getType() {
            return this.type;
        }

        public void setAudienceFilterParams(@NotNull HashMap<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.audienceFilterParams = map;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public HashMap<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentationRequest(@Nullable EventData eventData, @NotNull PresentationRequestType type, @NotNull PaywallPresentationRequestStatus status, @Nullable PaywallPresentationRequestStatusReason paywallPresentationRequestStatusReason, @NotNull Factory factory, @NotNull HashMap<String, Object> audienceFilterParams) {
            super(new SuperwallEvent.PaywallPresentationRequest(status, paywallPresentationRequestStatusReason), null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
            this.eventData = eventData;
            this.type = type;
            this.status = status;
            this.statusReason = paywallPresentationRequestStatusReason;
            this.factory = factory;
            this.audienceFilterParams = audienceFilterParams;
        }
    }

    public static final class Redemptions extends InternalSuperwallEvent {

        @NotNull
        private final RedemptionState state;

        @NotNull
        private final WebPaywallRedeemer.RedeemType type;

        public static abstract class RedemptionState {

            public static final class Complete extends RedemptionState {

                @NotNull
                public static final Complete INSTANCE = new Complete();

                private Complete() {
                    super(null);
                }
            }

            public static final class Fail extends RedemptionState {

                @NotNull
                public static final Fail INSTANCE = new Fail();

                private Fail() {
                    super(null);
                }
            }

            public static final class Start extends RedemptionState {

                @NotNull
                public static final Start INSTANCE = new Start();

                private Start() {
                    super(null);
                }
            }

            public /* synthetic */ RedemptionState(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private RedemptionState() {
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Redemptions(@NotNull RedemptionState state, @NotNull WebPaywallRedeemer.RedeemType type) {
            SuperwallEvent superwallEvent;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(state, RedemptionState.Start.INSTANCE)) {
                superwallEvent = SuperwallEvent.RedemptionStart.INSTANCE;
            } else if (state instanceof RedemptionState.Complete) {
                superwallEvent = SuperwallEvent.RedemptionComplete.INSTANCE;
            } else {
                if (!(state instanceof RedemptionState.Fail)) {
                    throw new k0();
                }
                superwallEvent = SuperwallEvent.RedemptionFail.INSTANCE;
            }
            super(superwallEvent, null);
            this.state = state;
            this.type = type;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return MapsKt.emptyMap();
        }

        @NotNull
        public final RedemptionState getState() {
            return this.state;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar) {
            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("type", this.type.getDescription()));
            if (this.type.getCode() != null) {
                String code = this.type.getCode();
                Intrinsics.checkNotNull(code);
                mapMutableMapOf.put("code", code);
            }
            return MapsKt.toMap(mapMutableMapOf);
        }

        @NotNull
        public final WebPaywallRedeemer.RedeemType getType() {
            return this.type;
        }
    }

    public static final class Reset extends InternalSuperwallEvent {

        @NotNull
        public static final Reset INSTANCE = new Reset();

        @NotNull
        private static final Map<String, Object> audienceFilterParams = MapsKt.emptyMap();

        private Reset() {
            super(SuperwallEvent.Reset.INSTANCE, null);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return audienceFilterParams;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar) {
            return MapsKt.emptyMap();
        }
    }

    public static final class Restore extends InternalSuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final State state;

        public static abstract class State {

            public static final class Complete extends State {

                @NotNull
                public static final Complete INSTANCE = new Complete();

                private Complete() {
                    super(null);
                }
            }

            public static final class Failure extends State {

                @NotNull
                private final String reason;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Failure(@NotNull String reason) {
                    super(null);
                    Intrinsics.checkNotNullParameter(reason, "reason");
                    int i10 = 3 >> 0;
                    this.reason = reason;
                }

                public static /* synthetic */ Failure copy$default(Failure failure, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = failure.reason;
                    }
                    return failure.copy(str);
                }

                @NotNull
                public final String component1() {
                    return this.reason;
                }

                @NotNull
                public final Failure copy(@NotNull String reason) {
                    Intrinsics.checkNotNullParameter(reason, "reason");
                    return new Failure(reason);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Failure) && Intrinsics.areEqual(this.reason, ((Failure) obj).reason);
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
                    return "Failure(reason=" + this.reason + ")";
                }
            }

            public static final class Start extends State {

                @NotNull
                public static final Start INSTANCE = new Start();

                private Start() {
                    super(null);
                }
            }

            public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private State() {
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Restore(@NotNull State state, @NotNull PaywallInfo paywallInfo) {
            SuperwallEvent fail;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            if (state instanceof State.Complete) {
                fail = SuperwallEvent.Restore.Complete.INSTANCE;
            } else if (state instanceof State.Failure) {
                fail = new SuperwallEvent.Restore.Fail(((State.Failure) state).getReason());
            } else {
                if (!(state instanceof State.Start)) {
                    throw new k0();
                }
                fail = SuperwallEvent.Restore.Start.INSTANCE;
            }
            super(fail, null);
            this.state = state;
            this.paywallInfo = paywallInfo;
        }

        public static /* synthetic */ Restore copy$default(Restore restore, State state, PaywallInfo paywallInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                state = restore.state;
            }
            if ((i10 & 2) != 0) {
                paywallInfo = restore.paywallInfo;
            }
            return restore.copy(state, paywallInfo);
        }

        @NotNull
        public final State component1() {
            return this.state;
        }

        @NotNull
        public final PaywallInfo component2() {
            return this.paywallInfo;
        }

        @NotNull
        public final Restore copy(@NotNull State state, @NotNull PaywallInfo paywallInfo) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            return new Restore(state, paywallInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Restore)) {
                return false;
            }
            Restore restore = (Restore) obj;
            return Intrinsics.areEqual(this.state, restore.state) && Intrinsics.areEqual(this.paywallInfo, restore.paywallInfo);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.paywallInfo.audienceFilterParams();
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final State getState() {
            return this.state;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar) {
            Map mapEventParams$default = PaywallInfo.eventParams$default(this.paywallInfo, null, null, 3, null);
            State state = this.state;
            return state instanceof State.Failure ? MapsKt.plus(mapEventParams$default, MapsKt.mapOf(TuplesKt.to(a.Y, ((State.Failure) state).getReason()))) : mapEventParams$default;
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.paywallInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "Restore(state=" + this.state + ", paywallInfo=" + this.paywallInfo + ")";
        }
    }

    public static final class SessionStart extends InternalSuperwallEvent {

        @NotNull
        private HashMap<String, Object> audienceFilterParams;

        /* JADX WARN: Multi-variable type inference failed */
        public SessionStart() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return new HashMap();
        }

        public void setAudienceFilterParams(@NotNull HashMap<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.audienceFilterParams = map;
        }

        public /* synthetic */ SessionStart(HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new HashMap() : map);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public HashMap<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionStart(@NotNull HashMap<String, Object> audienceFilterParams) {
            super(new SuperwallEvent.SessionStart(), null);
            Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
            this.audienceFilterParams = audienceFilterParams;
        }
    }

    @SourceDebugExtension({"SMAP\nTrackableSuperwallEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackableSuperwallEvent.kt\ncom/superwall/sdk/analytics/internal/trackable/InternalSuperwallEvent$ShimmerLoad\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1036:1\n535#2:1037\n520#2,6:1038\n*S KotlinDebug\n*F\n+ 1 TrackableSuperwallEvent.kt\ncom/superwall/sdk/analytics/internal/trackable/InternalSuperwallEvent$ShimmerLoad\n*L\n909#1:1037\n909#1:1038,6\n*E\n"})
    public static final class ShimmerLoad extends InternalSuperwallEvent {

        @NotNull
        private final Map<String, Object> audienceFilterParams;
        private final boolean canImplicitlyTriggerPaywall;
        private final double delay;

        @NotNull
        private final String paywallId;
        private final boolean preloadingEnabled;

        @NotNull
        private final State state;

        @Nullable
        private final Double visibleDuration;

        public enum State {
            Started,
            Complete;

            private static final /* synthetic */ kotlin.enums.a $ENTRIES = c.c(values());

            @NotNull
            public static kotlin.enums.a<State> getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ShimmerLoad(@NotNull State state, @NotNull String paywallId, @Nullable Double d10, double d11, boolean z10) {
            SuperwallEvent shimmerViewComplete;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(paywallId, "paywallId");
            if (state == State.Started) {
                shimmerViewComplete = SuperwallEvent.ShimmerViewStart.INSTANCE;
            } else {
                shimmerViewComplete = new SuperwallEvent.ShimmerViewComplete(d10 != null ? d10.doubleValue() : 0.0d);
            }
            super(shimmerViewComplete, null);
            this.state = state;
            this.paywallId = paywallId;
            this.visibleDuration = d10;
            this.delay = d11;
            this.preloadingEnabled = z10;
            this.audienceFilterParams = MapsKt.emptyMap();
        }

        public static /* synthetic */ ShimmerLoad copy$default(ShimmerLoad shimmerLoad, State state, String str, Double d10, double d11, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                state = shimmerLoad.state;
            }
            if ((i10 & 2) != 0) {
                str = shimmerLoad.paywallId;
            }
            if ((i10 & 4) != 0) {
                d10 = shimmerLoad.visibleDuration;
            }
            if ((i10 & 8) != 0) {
                d11 = shimmerLoad.delay;
            }
            if ((i10 & 16) != 0) {
                z10 = shimmerLoad.preloadingEnabled;
            }
            boolean z11 = z10;
            Double d12 = d10;
            return shimmerLoad.copy(state, str, d12, d11, z11);
        }

        @NotNull
        public final State component1() {
            return this.state;
        }

        @NotNull
        public final String component2() {
            return this.paywallId;
        }

        @Nullable
        public final Double component3() {
            return this.visibleDuration;
        }

        public final double component4() {
            return this.delay;
        }

        public final boolean component5() {
            return this.preloadingEnabled;
        }

        @NotNull
        public final ShimmerLoad copy(@NotNull State state, @NotNull String paywallId, @Nullable Double d10, double d11, boolean z10) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(paywallId, "paywallId");
            return new ShimmerLoad(state, paywallId, d10, d11, z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShimmerLoad)) {
                return false;
            }
            ShimmerLoad shimmerLoad = (ShimmerLoad) obj;
            return this.state == shimmerLoad.state && Intrinsics.areEqual(this.paywallId, shimmerLoad.paywallId) && Intrinsics.areEqual((Object) this.visibleDuration, (Object) shimmerLoad.visibleDuration) && Double.compare(this.delay, shimmerLoad.delay) == 0 && this.preloadingEnabled == shimmerLoad.preloadingEnabled;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent, com.superwall.sdk.analytics.internal.trackable.Trackable
        public boolean getCanImplicitlyTriggerPaywall() {
            return this.canImplicitlyTriggerPaywall;
        }

        public final double getDelay() {
            return this.delay;
        }

        @NotNull
        public final String getPaywallId() {
            return this.paywallId;
        }

        public final boolean getPreloadingEnabled() {
            return this.preloadingEnabled;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent, com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public String getRawName() {
            return getSuperwallPlacement().getRawName();
        }

        @NotNull
        public final State getState() {
            return this.state;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar) {
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to("paywall_id", this.paywallId), TuplesKt.to("preloading_enabled", b.a(this.preloadingEnabled)), TuplesKt.to("visible_duration", this.visibleDuration));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapMapOf.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Map map = MapsKt.toMap(linkedHashMap);
            Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            return map;
        }

        @Nullable
        public final Double getVisibleDuration() {
            return this.visibleDuration;
        }

        public int hashCode() {
            int iHashCode = ((this.state.hashCode() * 31) + this.paywallId.hashCode()) * 31;
            Double d10 = this.visibleDuration;
            return ((((iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + Double.hashCode(this.delay)) * 31) + Boolean.hashCode(this.preloadingEnabled);
        }

        @NotNull
        public String toString() {
            return "ShimmerLoad(state=" + this.state + ", paywallId=" + this.paywallId + ", visibleDuration=" + this.visibleDuration + ", delay=" + this.delay + ", preloadingEnabled=" + this.preloadingEnabled + ")";
        }
    }

    public static final class SubscriptionStart extends InternalSuperwallEvent {

        @NotNull
        private final PaywallInfo paywallInfo;

        @NotNull
        private final StoreProduct product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubscriptionStart(@NotNull PaywallInfo paywallInfo, @NotNull StoreProduct product) {
            super(new SuperwallEvent.SubscriptionStart(product, paywallInfo), null);
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            Intrinsics.checkNotNullParameter(product, "product");
            this.paywallInfo = paywallInfo;
            this.product = product;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.paywallInfo.audienceFilterParams();
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final StoreProduct getProduct() {
            return this.product;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return new HashMap(PaywallInfo.eventParams$default(this.paywallInfo, this.product, null, 2, null));
        }
    }

    public static final class SubscriptionStatusDidChange extends InternalSuperwallEvent {

        @NotNull
        private HashMap<String, Object> audienceFilterParams;

        @NotNull
        private final SubscriptionStatus subscriptionStatus;

        public /* synthetic */ SubscriptionStatusDidChange(SubscriptionStatus subscriptionStatus, HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(subscriptionStatus, (i10 & 2) != 0 ? new HashMap() : map);
        }

        @NotNull
        public final SubscriptionStatus getSubscriptionStatus() {
            return this.subscriptionStatus;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            String str;
            SubscriptionStatus subscriptionStatus = this.subscriptionStatus;
            if (subscriptionStatus instanceof SubscriptionStatus.Active) {
                str = "active";
            } else if (subscriptionStatus instanceof SubscriptionStatus.Inactive) {
                str = "inactive";
            } else {
                if (!(subscriptionStatus instanceof SubscriptionStatus.Unknown)) {
                    throw new k0();
                }
                str = "unknown";
            }
            return MapsKt.hashMapOf(TuplesKt.to("subscription_status", str));
        }

        public void setAudienceFilterParams(@NotNull HashMap<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.audienceFilterParams = map;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public HashMap<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubscriptionStatusDidChange(@NotNull SubscriptionStatus subscriptionStatus, @NotNull HashMap<String, Object> audienceFilterParams) {
            super(new SuperwallEvent.SubscriptionStatusDidChange(), null);
            Intrinsics.checkNotNullParameter(subscriptionStatus, "subscriptionStatus");
            Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
            this.subscriptionStatus = subscriptionStatus;
            this.audienceFilterParams = audienceFilterParams;
        }
    }

    public static final class SurveyClose extends InternalSuperwallEvent {

        @NotNull
        private final Map<String, Object> audienceFilterParams;

        /* JADX WARN: Multi-variable type inference failed */
        public SurveyClose() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar) {
            return MapsKt.emptyMap();
        }

        public /* synthetic */ SurveyClose(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new LinkedHashMap() : map);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SurveyClose(@NotNull Map<String, Object> audienceFilterParams) {
            super(new SuperwallEvent.SurveyClose(), null);
            Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
            this.audienceFilterParams = audienceFilterParams;
        }
    }

    @SourceDebugExtension({"SMAP\nTrackableSuperwallEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackableSuperwallEvent.kt\ncom/superwall/sdk/analytics/internal/trackable/InternalSuperwallEvent$SurveyResponse\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1036:1\n535#2:1037\n520#2,6:1038\n*S KotlinDebug\n*F\n+ 1 TrackableSuperwallEvent.kt\ncom/superwall/sdk/analytics/internal/trackable/InternalSuperwallEvent$SurveyResponse\n*L\n99#1:1037\n99#1:1038,6\n*E\n"})
    public static final class SurveyResponse extends InternalSuperwallEvent {

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
            super(new SuperwallEvent.SurveyResponse(survey, selectedOption, str, paywallInfo), null);
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

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            Map<String, Object> mapAudienceFilterParams = this.paywallInfo.audienceFilterParams();
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to("survey_selected_option_title", this.selectedOption.getTitle()), TuplesKt.to("survey_custom_response", this.customResponse));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapMapOf.entrySet()) {
                if (((String) entry.getValue()) != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return MapsKt.plus(mapAudienceFilterParams, r1.k(linkedHashMap));
        }

        @Nullable
        public final String getCustomResponse() {
            return this.customResponse;
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @NotNull
        public final SurveyOption getSelectedOption() {
            return this.selectedOption;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super Map<String, ? extends Object>> dVar) {
            return PaywallInfo.eventParams$default(this.paywallInfo, null, MapsKt.mapOf(TuplesKt.to("survey_id", this.survey.getId()), TuplesKt.to("survey_assignment_key", this.survey.getAssignmentKey()), TuplesKt.to("survey_selected_option_id", this.selectedOption.getId())), 1, null);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent, com.superwall.sdk.analytics.internal.trackable.TrackableSuperwallEvent
        @NotNull
        public SuperwallEvent getSuperwallPlacement() {
            return new SuperwallEvent.SurveyResponse(this.survey, this.selectedOption, this.customResponse, this.paywallInfo);
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

    public static final class TriggerFire extends InternalSuperwallEvent {

        @NotNull
        private HashMap<String, Object> audienceFilterParams;

        @NotNull
        private final String triggerName;

        @NotNull
        private final InternalTriggerResult triggerResult;

        public /* synthetic */ TriggerFire(InternalTriggerResult internalTriggerResult, String str, HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(internalTriggerResult, str, (i10 & 4) != 0 ? new HashMap() : map);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.to("trigger_name", this.triggerName));
            InternalTriggerResult internalTriggerResult = this.triggerResult;
            if (internalTriggerResult instanceof InternalTriggerResult.NoAudienceMatch) {
                mapHashMapOf.put("result", "no_rule_match");
                return mapHashMapOf;
            }
            if (internalTriggerResult instanceof InternalTriggerResult.Holdout) {
                mapHashMapOf.put("variant_id", ((InternalTriggerResult.Holdout) internalTriggerResult).getExperiment().getVariant().getId());
                mapHashMapOf.put("experiment_id", ((InternalTriggerResult.Holdout) this.triggerResult).getExperiment().getId());
                mapHashMapOf.put("result", "holdout");
                return mapHashMapOf;
            }
            if (!(internalTriggerResult instanceof InternalTriggerResult.Paywall)) {
                if (internalTriggerResult instanceof InternalTriggerResult.PlacementNotFound) {
                    mapHashMapOf.put("result", "eventNotFound");
                    return mapHashMapOf;
                }
                if (!(internalTriggerResult instanceof InternalTriggerResult.Error)) {
                    throw new k0();
                }
                mapHashMapOf.put("result", "error");
                return mapHashMapOf;
            }
            mapHashMapOf.put("variant_id", ((InternalTriggerResult.Paywall) internalTriggerResult).getExperiment().getVariant().getId());
            mapHashMapOf.put("experiment_id", ((InternalTriggerResult.Paywall) this.triggerResult).getExperiment().getId());
            String paywallId = ((InternalTriggerResult.Paywall) this.triggerResult).getExperiment().getVariant().getPaywallId();
            if (paywallId == null) {
                paywallId = "";
            }
            mapHashMapOf.put("paywall_identifier", paywallId);
            mapHashMapOf.put("result", "present");
            return mapHashMapOf;
        }

        @NotNull
        public final String getTriggerName() {
            return this.triggerName;
        }

        @NotNull
        public final InternalTriggerResult getTriggerResult() {
            return this.triggerResult;
        }

        public void setAudienceFilterParams(@NotNull HashMap<String, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.audienceFilterParams = map;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public HashMap<String, Object> getAudienceFilterParams() {
            return this.audienceFilterParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TriggerFire(@NotNull InternalTriggerResult triggerResult, @NotNull String triggerName, @NotNull HashMap<String, Object> audienceFilterParams) {
            super(new SuperwallEvent.TriggerFire(triggerName, triggerResult.toPublicType()), null);
            Intrinsics.checkNotNullParameter(triggerResult, "triggerResult");
            Intrinsics.checkNotNullParameter(triggerName, "triggerName");
            Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
            this.triggerResult = triggerResult;
            this.triggerName = triggerName;
            this.audienceFilterParams = audienceFilterParams;
        }
    }

    public /* synthetic */ InternalSuperwallEvent(SuperwallEvent superwallEvent, DefaultConstructorMarker defaultConstructorMarker) {
        this(superwallEvent);
    }

    @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
    public boolean getCanImplicitlyTriggerPaywall() {
        return getSuperwallPlacement().getCanImplicitlyTriggerPaywall();
    }

    @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
    @NotNull
    public String getRawName() {
        return getSuperwallPlacement().getRawName();
    }

    @Override // com.superwall.sdk.analytics.internal.trackable.TrackableSuperwallEvent
    @NotNull
    public SuperwallEvent getSuperwallPlacement() {
        return this.superwallPlacement;
    }

    private InternalSuperwallEvent(SuperwallEvent superwallEvent) {
        this.superwallPlacement = superwallEvent;
    }

    public static final class Transaction implements TrackableSuperwallEvent {

        @Nullable
        private Integer demandScore;

        @Nullable
        private String demandTier;
        private final boolean isObserved;

        @Nullable
        private final StoreTransaction model;

        @NotNull
        private final PaywallInfo paywallInfo;

        @Nullable
        private final StoreProduct product;

        @NotNull
        private final TransactionSource source;

        @NotNull
        private final State state;

        public static abstract class State {

            public static final class Abandon extends State {

                @NotNull
                private final StoreProduct product;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Abandon(@NotNull StoreProduct product) {
                    super(null);
                    Intrinsics.checkNotNullParameter(product, "product");
                    this.product = product;
                }

                @NotNull
                public final StoreProduct getProduct() {
                    return this.product;
                }
            }

            public static final class Complete extends State {

                @NotNull
                private final StoreProduct product;

                @Nullable
                private final StoreTransactionType transaction;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Complete(@NotNull StoreProduct product, @Nullable StoreTransactionType storeTransactionType) {
                    super(null);
                    Intrinsics.checkNotNullParameter(product, "product");
                    this.product = product;
                    this.transaction = storeTransactionType;
                }

                @NotNull
                public final StoreProduct getProduct() {
                    return this.product;
                }

                @Nullable
                public final StoreTransactionType getTransaction() {
                    return this.transaction;
                }
            }

            public static final class Fail extends State {

                @NotNull
                private final TransactionError error;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Fail(@NotNull TransactionError error) {
                    super(null);
                    Intrinsics.checkNotNullParameter(error, "error");
                    this.error = error;
                }

                @NotNull
                public final TransactionError getError() {
                    return this.error;
                }
            }

            public static final class Restore extends State {

                @NotNull
                private final RestoreType restoreType;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Restore(@NotNull RestoreType restoreType) {
                    super(null);
                    Intrinsics.checkNotNullParameter(restoreType, "restoreType");
                    this.restoreType = restoreType;
                }

                @NotNull
                public final RestoreType getRestoreType() {
                    return this.restoreType;
                }
            }

            public static final class Start extends State {

                @NotNull
                private final StoreProduct product;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Start(@NotNull StoreProduct product) {
                    super(null);
                    Intrinsics.checkNotNullParameter(product, "product");
                    this.product = product;
                }

                @NotNull
                public final StoreProduct getProduct() {
                    return this.product;
                }
            }

            public static final class Timeout extends State {
                public Timeout() {
                    super(null);
                }
            }

            public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private State() {
            }
        }

        public enum TransactionSource {
            INTERNAL("SUPERWALL"),
            OBSERVER("OBSERVER"),
            EXTERNAL("APP");

            private static final /* synthetic */ kotlin.enums.a $ENTRIES = c.c(values());

            @NotNull
            private final String raw;

            TransactionSource(String str) {
                this.raw = str;
            }

            @NotNull
            public static kotlin.enums.a<TransactionSource> getEntries() {
                return $ENTRIES;
            }

            @NotNull
            public final String getRaw() {
                return this.raw;
            }
        }

        public Transaction(@NotNull State state, @NotNull PaywallInfo paywallInfo, @Nullable StoreProduct storeProduct, @Nullable StoreTransaction storeTransaction, @NotNull TransactionSource source, boolean z10, @Nullable Integer num, @Nullable String str) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
            Intrinsics.checkNotNullParameter(source, "source");
            this.state = state;
            this.paywallInfo = paywallInfo;
            this.product = storeProduct;
            this.model = storeTransaction;
            this.source = source;
            this.isObserved = z10;
            this.demandScore = num;
            this.demandTier = str;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public Map<String, Object> getAudienceFilterParams() {
            String productIdentifier;
            Map<String, Object> mapAudienceFilterParams = this.paywallInfo.audienceFilterParams();
            if (!(getSuperwallPlacement() instanceof SuperwallEvent.TransactionAbandon)) {
                return mapAudienceFilterParams;
            }
            StoreProduct storeProduct = this.product;
            if (storeProduct == null || (productIdentifier = storeProduct.getProductIdentifier()) == null) {
                productIdentifier = "";
            }
            return MapsKt.plus(mapAudienceFilterParams, TuplesKt.to("abandoned_product_id", productIdentifier));
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        public boolean getCanImplicitlyTriggerPaywall() {
            if (this.isObserved) {
                return false;
            }
            return getSuperwallPlacement().getCanImplicitlyTriggerPaywall();
        }

        @Nullable
        public final Integer getDemandScore() {
            return this.demandScore;
        }

        @Nullable
        public final String getDemandTier() {
            return this.demandTier;
        }

        @Nullable
        public final StoreTransaction getModel() {
            return this.model;
        }

        @NotNull
        public final PaywallInfo getPaywallInfo() {
            return this.paywallInfo;
        }

        @Nullable
        public final StoreProduct getProduct() {
            return this.product;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @NotNull
        public String getRawName() {
            return getSuperwallPlacement().getRawName();
        }

        @NotNull
        public final TransactionSource getSource() {
            return this.source;
        }

        @NotNull
        public final State getState() {
            return this.state;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            Map<String, Object> dictionary;
            Map<String, Object> dictionary2;
            State state = this.state;
            if (state instanceof State.Restore) {
                HashMap map = new HashMap(PaywallInfo.eventParams$default(this.paywallInfo, this.product, null, 2, null));
                StoreTransaction storeTransaction = this.model;
                if (storeTransaction != null && (dictionary2 = storeTransaction.toDictionary()) != null) {
                    map.putAll(dictionary2);
                }
                map.put("restore_via_purchase_attempt", b.a(this.model != null));
                return map;
            }
            if (!(state instanceof State.Start) && !(state instanceof State.Abandon) && !(state instanceof State.Complete) && !(state instanceof State.Timeout)) {
                if (!(state instanceof State.Fail)) {
                    throw new k0();
                }
                TransactionError error = ((State.Fail) state).getError();
                if (!(error instanceof TransactionError.Failure) && !(error instanceof TransactionError.Pending)) {
                    throw new k0();
                }
                return new HashMap(this.paywallInfo.eventParams(this.product, MapsKt.mapOf(TuplesKt.to("message", ((State.Fail) this.state).getError().getMessage()))));
            }
            HashMap map2 = new HashMap(PaywallInfo.eventParams$default(this.paywallInfo, this.product, null, 2, null));
            StoreTransaction storeTransaction2 = this.model;
            if (storeTransaction2 != null && (dictionary = storeTransaction2.toDictionary()) != null) {
                map2.putAll(dictionary);
            }
            Integer num = this.demandScore;
            if (num != null) {
                map2.put("attr_demandScore", num);
            }
            String str = this.demandTier;
            if (str != null) {
                map2.put("attr_demandTier", str);
            }
            return map2;
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.TrackableSuperwallEvent
        @NotNull
        public SuperwallEvent getSuperwallPlacement() {
            State state = this.state;
            if (state instanceof State.Start) {
                return new SuperwallEvent.TransactionStart(((State.Start) state).getProduct(), this.paywallInfo);
            }
            if (state instanceof State.Fail) {
                return new SuperwallEvent.TransactionFail(((State.Fail) state).getError(), this.paywallInfo);
            }
            if (state instanceof State.Abandon) {
                return new SuperwallEvent.TransactionAbandon(((State.Abandon) state).getProduct(), this.paywallInfo);
            }
            if (state instanceof State.Complete) {
                return new SuperwallEvent.TransactionComplete(((State.Complete) state).getTransaction(), ((State.Complete) this.state).getProduct(), this.paywallInfo);
            }
            if (state instanceof State.Restore) {
                return new SuperwallEvent.TransactionRestore(((State.Restore) state).getRestoreType(), this.paywallInfo);
            }
            if (state instanceof State.Timeout) {
                return new SuperwallEvent.TransactionTimeout(this.paywallInfo);
            }
            throw new k0();
        }

        public final boolean isObserved() {
            return this.isObserved;
        }

        public final void setDemandScore(@Nullable Integer num) {
            this.demandScore = num;
        }

        public final void setDemandTier(@Nullable String str) {
            this.demandTier = str;
        }

        public /* synthetic */ Transaction(State state, PaywallInfo paywallInfo, StoreProduct storeProduct, StoreTransaction storeTransaction, TransactionSource transactionSource, boolean z10, Integer num, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(state, paywallInfo, storeProduct, storeTransaction, transactionSource, z10, (i10 & 64) != 0 ? null : num, (i10 & 128) != 0 ? null : str);
        }
    }
}
