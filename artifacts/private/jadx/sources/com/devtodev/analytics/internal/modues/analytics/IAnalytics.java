package com.devtodev.analytics.internal.modues.analytics;

import com.devtodev.analytics.external.analytics.DTDAccrualType;
import com.devtodev.analytics.external.analytics.DTDFinishProgressionEventParameters;
import com.devtodev.analytics.external.analytics.DTDReferralProperty;
import com.devtodev.analytics.external.analytics.DTDStartProgressionEventParameters;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IAnalytics {
    void adImpression(@NotNull String str, double d10, @Nullable String str2, @Nullable String str3);

    void currencyAccrual(@NotNull String str, int i10, @NotNull String str2, @NotNull DTDAccrualType dTDAccrualType);

    void currentBalance(@NotNull Map<String, Long> map);

    void customEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map);

    void finishProgressionEvent(@NotNull String str, @NotNull DTDFinishProgressionEventParameters dTDFinishProgressionEventParameters);

    void getCurrentLevel(@NotNull Function1<? super Integer, Unit> function1);

    int getCustomEventParamsCount();

    void getDeviceId(@NotNull Function1<? super String, Unit> function1);

    void getObfuscatedAccountId(@NotNull Function1<? super String, Unit> function1);

    void getSDKVersion(@NotNull Function1<? super String, Unit> function1);

    void getTrackingAvailability(@NotNull Function1<? super Boolean, Unit> function1);

    void getUserId(@NotNull Function1<? super String, Unit> function1);

    void levelUp(int i10, @NotNull Map<String, Long> map);

    void referrer(@NotNull Map<DTDReferralProperty, String> map);

    void replaceUserId(@NotNull String str, @NotNull String str2);

    void sendBufferedEvents();

    void setCurrentLevel(int i10);

    void setTrackingAvailability(boolean z10);

    void setUserId(@NotNull String str);

    void socialNetworkConnect(@NotNull String str);

    void socialNetworkPost(@NotNull String str, @NotNull String str2);

    void startActivity();

    void startProgressionEvent(@NotNull String str, @NotNull DTDStartProgressionEventParameters dTDStartProgressionEventParameters);

    void stopActivity();

    void tutorial(int i10);

    void virtualCurrencyPayment(@NotNull String str, @NotNull String str2, int i10, @NotNull Map<String, Integer> map);
}
