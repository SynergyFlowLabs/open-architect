package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.facebook.internal.w0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nManualValidationTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualValidationTask.kt\ncom/appsflyer/internal/components/queue/tasks/ManualValidationTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1747#2,3:145\n*S KotlinDebug\n*F\n+ 1 ManualValidationTask.kt\ncom/appsflyer/internal/components/queue/tasks/ManualValidationTask\n*L\n98#1:145,3\n*E\n"})
public final class AFe1fSDK extends AFe1gSDK {

    @NotNull
    private final AppsFlyerProperties component2;

    @NotNull
    private final AFj1hSDK copy;

    @NotNull
    private final AFPurchaseDetails equals;

    @Nullable
    private final AppsFlyerInAppPurchaseValidationCallback hashCode;

    @Nullable
    private final Map<String, String> toString;

    public static final class AFa1tSDK extends RuntimeException {
    }

    public /* synthetic */ AFe1fSDK(AFc1dSDK aFc1dSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1hSDK aFj1hSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1dSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i10 & 32) != 0 ? new AFj1gSDK() : aFj1hSDK);
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    @NotNull
    protected final String AFAdRevenueData(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return this.copy.getRevenue();
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    protected final void getMediationNetwork(@NotNull Map<String, Object> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(map, "");
        super.getMediationNetwork(map, str);
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{this.equals.getPurchaseToken(), this.equals.getProductId(), this.equals.getPrice(), this.equals.getCurrency()});
        if (!(listListOf instanceof Collection) || !listListOf.isEmpty()) {
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1tSDK();
                }
            }
        }
        map.put("purchase_token", this.equals.getPurchaseToken());
        map.put(com.planner5d.library.model.manager.statistics.appsflyer.d.a.f202890f, this.equals.getProductId());
        map.put("revenue", this.equals.getPrice());
        map.put("currency", this.equals.getCurrency());
        map.put("purchase_type", this.equals.getPurchaseType().getValue());
        Map<String, String> map2 = this.toString;
        if (map2 != null && !map2.isEmpty()) {
            map.put("extra_event_values", this.toString);
        }
        String string = this.component2.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        map.put("custom_data", (string == null || string.length() == 0) ? MapsKt.emptyMap() : AFj1eSDK.getCurrencyIso4217Code(new JSONObject(string)));
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        Object objM785constructorimpl;
        Unit unit;
        super.getRevenue();
        Throwable thComponent4 = component4();
        if (thComponent4 != null && !(thComponent4 instanceof AFe1oSDK)) {
            if (thComponent4 instanceof AFe1nSDK) {
                getRevenue("No dev key", -1);
            } else if (thComponent4 instanceof AFa1tSDK) {
                getRevenue("One or more of provided arguments is empty", -1);
            } else {
                getRevenue("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFe1dSDK) this).component1;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.hashCode;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(MapsKt.mapOf(TuplesKt.to(w0.R0, Integer.valueOf(responseNetwork.getStatusCode())), TuplesKt.to(com.facebook.internal.a.Y, responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                Result.a aVar = Result.Companion;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.hashCode;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1eSDK.getCurrencyIso4217Code(new JSONObject((String) responseNetwork.getBody())));
                    unit = Unit.f312394a;
                } else {
                    unit = null;
                }
                objM785constructorimpl = Result.m785constructorimpl(unit);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.d(objM785constructorimpl) != null) {
                getRevenue("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
            Result.a(objM785constructorimpl);
        }
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    @Nullable
    public final AFd1nSDK<String> AFAdRevenueData(@NotNull Map<String, Object> map, @NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        return this.component4.getMonetizationNetwork(map, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    private AFe1fSDK(@NotNull AFc1dSDK aFc1dSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, @NotNull AFj1hSDK aFj1hSDK) {
        super(AFe1mSDK.MANUAL_PURCHASE_VALIDATION, new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, aFc1dSDK, null, MapsKt.emptyMap());
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1hSDK, "");
        this.component2 = appsFlyerProperties;
        this.equals = aFPurchaseDetails;
        this.toString = map;
        this.hashCode = appsFlyerInAppPurchaseValidationCallback;
        this.copy = aFj1hSDK;
        this.AFAdRevenueData.add(AFe1mSDK.CONVERSION);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public AFe1fSDK(@NotNull AFc1dSDK aFc1dSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFc1dSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }

    private final void getRevenue(String str, int i10) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.hashCode;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(MapsKt.mapOf(TuplesKt.to(w0.R0, Integer.valueOf(i10)), TuplesKt.to(com.facebook.internal.a.Y, str)));
        }
    }
}
