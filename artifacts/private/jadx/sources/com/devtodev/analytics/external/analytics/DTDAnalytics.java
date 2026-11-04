package com.devtodev.analytics.external.analytics;

import android.content.Context;
import com.devtodev.analytics.external.DTDLogLevel;
import com.devtodev.analytics.external.abtest.DTDRemoteConfigListener;
import com.devtodev.analytics.internal.core.Core;
import com.devtodev.analytics.internal.logger.Logger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DTDAnalytics {

    @NotNull
    public static final DTDAnalytics INSTANCE = new DTDAnalytics();

    public final void adImpression(@NotNull String network, double d10, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(network, "network");
        Core.INSTANCE.getAnalyticsProxy().adImpression(network, d10, str, str2);
    }

    public final void coppaControlEnable() {
        Core.INSTANCE.setCoppaCompliant(true);
    }

    public final void currencyAccrual(@NotNull String currencyName, int i10, @NotNull String source, @NotNull DTDAccrualType DTDAccrualType) {
        Intrinsics.checkNotNullParameter(currencyName, "currencyName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(DTDAccrualType, "DTDAccrualType");
        Core.INSTANCE.getAnalyticsProxy().currencyAccrual(currencyName, i10, source, DTDAccrualType);
    }

    public final void currentBalance(@NotNull Map<String, Long> balance) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Core.INSTANCE.getAnalyticsProxy().currentBalance(balance);
    }

    public final void customEvent(@NotNull String eventName, @NotNull DTDCustomEventParameters customEventParameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(customEventParameters, "customEventParameters");
        Core.INSTANCE.getAnalyticsProxy().customEvent(eventName, customEventParameters.getParams$DTDAnalytics_androidRelease());
    }

    public final void finishProgressionEvent(@NotNull String eventName, @NotNull DTDFinishProgressionEventParameters parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Core.INSTANCE.getAnalyticsProxy().finishProgressionEvent(eventName, parameters);
    }

    public final void getCurrentLevel(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Core.INSTANCE.getAnalyticsProxy().getCurrentLevel(block);
    }

    public final void getDeviceId(@NotNull Function1<? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Core.INSTANCE.getAnalyticsProxy().getDeviceId(block);
    }

    @NotNull
    public final DTDLogLevel getLogLevel() {
        return Logger.INSTANCE.getLogLevel();
    }

    public final void getObfuscatedAccountId(@NotNull Function1<? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Core.INSTANCE.getAnalyticsProxy().getObfuscatedAccountId(block);
    }

    public final void getSdkVersion(@NotNull Function1<? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Core.INSTANCE.getAnalyticsProxy().getSDKVersion(block);
    }

    public final void getTrackingAvailability(@NotNull Function1<? super Boolean, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Core.INSTANCE.getAnalyticsProxy().getTrackingAvailability(block);
    }

    public final void getUserId(@NotNull Function1<? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Core.INSTANCE.getAnalyticsProxy().getUserId(block);
    }

    public final void initialize(@NotNull String appKey, @NotNull DTDAnalyticsConfiguration analyticsConfiguration, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(analyticsConfiguration, "analyticsConfiguration");
        Intrinsics.checkNotNullParameter(context, "context");
        Core.initialize$default(Core.INSTANCE, appKey, analyticsConfiguration, context, null, 8, null);
    }

    public final void initializeWithAbTest(@NotNull String appKey, @NotNull DTDAnalyticsConfiguration analyticsConfiguration, @NotNull Context context, @NotNull DTDRemoteConfigListener abConfigListener) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(analyticsConfiguration, "analyticsConfiguration");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(abConfigListener, "abConfigListener");
        Core.INSTANCE.initialize(appKey, analyticsConfiguration, context, abConfigListener);
    }

    public final void isRestoreTransactionHistoryRequired(@NotNull Function1<? super Boolean, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Core.INSTANCE.getPurchasesProxy().isRestoreTransactionHistoryRequired(block);
    }

    public final void levelUp(int i10) {
        Core.INSTANCE.getAnalyticsProxy().levelUp(i10, new LinkedHashMap());
    }

    public final void realCurrencyPayment(@NotNull String orderId, double d10, @NotNull String productId, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Core.INSTANCE.getPurchasesProxy().realCurrencyPayment(orderId, d10, productId, currencyCode);
    }

    public final void referrer(@NotNull Map<DTDReferralProperty, String> utmData) {
        Intrinsics.checkNotNullParameter(utmData, "utmData");
        Core.INSTANCE.getAnalyticsProxy().referrer(utmData);
    }

    public final void replaceUserId(@NotNull String fromUserId, @NotNull String toUserId) {
        Intrinsics.checkNotNullParameter(fromUserId, "fromUserId");
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        Core.INSTANCE.getAnalyticsProxy().replaceUserId(fromUserId, toUserId);
    }

    public final void sendBufferedEvents() {
        Core.INSTANCE.getAnalyticsProxy().sendBufferedEvents();
    }

    public final void setCurrentLevel(int i10) {
        Core.INSTANCE.getAnalyticsProxy().setCurrentLevel(i10);
    }

    public final void setIdentifiersListener(@Nullable DTDIdentifiersListener dTDIdentifiersListener) {
        Core.INSTANCE.getAnalyticsObserver().addIdentifiersListener(dTDIdentifiersListener);
    }

    public final void setInitializationCompleteCallback(@Nullable Function0<Unit> function0) {
        Core.INSTANCE.getAnalyticsObserver().setInitializationCallBack(function0);
    }

    public final void setLogLevel(@NotNull DTDLogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Logger.INSTANCE.setLogLevel(logLevel);
    }

    public final void setTrackingAvailability(boolean z10) {
        Core.INSTANCE.getAnalyticsProxy().setTrackingAvailability(z10);
    }

    public final void setUserId(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Core.INSTANCE.getAnalyticsProxy().setUserId(userId);
    }

    public final void socialNetworkConnect(@NotNull DTDSocialNetwork socialNetwork) {
        Intrinsics.checkNotNullParameter(socialNetwork, "socialNetwork");
        Core.INSTANCE.getAnalyticsProxy().socialNetworkConnect(socialNetwork.getName());
    }

    public final void socialNetworkPost(@NotNull DTDSocialNetwork socialNetwork, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(socialNetwork, "socialNetwork");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Core.INSTANCE.getAnalyticsProxy().socialNetworkPost(socialNetwork.getName(), reason);
    }

    public final void startProgressionEvent(@NotNull String eventName, @NotNull DTDStartProgressionEventParameters parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Core.INSTANCE.getAnalyticsProxy().startProgressionEvent(eventName, parameters);
    }

    public final void subscriptionHistory(@NotNull List<String> purchaseList) {
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        Core.INSTANCE.getPurchasesProxy().subscriptionHistory(purchaseList);
    }

    public final void subscriptionPayment(@NotNull String orderId, double d10, @NotNull String productId, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Core.INSTANCE.getPurchasesProxy().subscriptionPayment(orderId, d10, productId, currencyCode);
    }

    public final void tutorial(int i10) {
        Core.INSTANCE.getAnalyticsProxy().tutorial(i10);
    }

    public final void virtualCurrencyPayment(@NotNull String purchaseId, @NotNull String purchaseType, int i10, int i11, @NotNull String purchaseCurrency) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(purchaseCurrency, "purchaseCurrency");
        Core.INSTANCE.getAnalyticsProxy().virtualCurrencyPayment(purchaseId, purchaseType, i10, MapsKt.mapOf(TuplesKt.to(purchaseCurrency, Integer.valueOf(i11))));
    }

    public final void customEvent(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Core.INSTANCE.getAnalyticsProxy().customEvent(eventName, MapsKt.emptyMap());
    }

    public final void finishProgressionEvent(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Core.INSTANCE.getAnalyticsProxy().finishProgressionEvent(eventName, new DTDFinishProgressionEventParameters());
    }

    public final void initialize(@NotNull String appKey, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(context, "context");
        Core.initialize$default(Core.INSTANCE, appKey, new DTDAnalyticsConfiguration(), context, null, 8, null);
    }

    public final void initializeWithAbTest(@NotNull String appKey, @NotNull Context context, @NotNull DTDRemoteConfigListener abConfigListener) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(abConfigListener, "abConfigListener");
        Core.INSTANCE.initialize(appKey, new DTDAnalyticsConfiguration(), context, abConfigListener);
    }

    public final void levelUp(int i10, @NotNull Map<String, Long> resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Core.INSTANCE.getAnalyticsProxy().levelUp(i10, resource);
    }

    public final void startProgressionEvent(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Core.INSTANCE.getAnalyticsProxy().startProgressionEvent(eventName, new DTDStartProgressionEventParameters());
    }

    public final void virtualCurrencyPayment(@NotNull String purchaseId, @NotNull String purchaseType, int i10, @NotNull Map<String, Integer> map) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(map, "map");
        Core.INSTANCE.getAnalyticsProxy().virtualCurrencyPayment(purchaseId, purchaseType, i10, map);
    }
}
