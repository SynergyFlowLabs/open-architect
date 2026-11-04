package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AFc1jSDK implements AFc1qSDK {

    @NotNull
    private final AFc1hSDK<SharedPreferences> getMediationNetwork;

    @NotNull
    private final kotlin.f0 getMonetizationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1jSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends kotlin.jvm.internal.l0 implements Function0<SharedPreferences> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: l_, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return (SharedPreferences) AFc1jSDK.this.getMediationNetwork.getMonetizationNetwork.invoke();
        }
    }

    public AFc1jSDK(@NotNull AFc1hSDK<SharedPreferences> aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        this.getMediationNetwork = aFc1hSDK;
        this.getMonetizationNetwork = kotlin.g0.c(new AnonymousClass5());
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getCurrencyIso4217Code(@Nullable String str, boolean z10) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().putBoolean(str, z10).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMediationNetwork(@Nullable String str, @Nullable String str2) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMonetizationNetwork(@Nullable String str, long j10) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().putLong(str, j10).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    @Nullable
    public final String AFAdRevenueData(@Nullable String str, @Nullable String str2) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getString(str, str2);
        } catch (ClassCastException e10) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final long getCurrencyIso4217Code(@Nullable String str, long j10) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getLong(str, j10);
        } catch (ClassCastException e10) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return j10;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMediationNetwork(@Nullable String str, boolean z10) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getBoolean(str, z10);
        } catch (ClassCastException e10) {
            int i10 = 2 ^ 0;
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return z10;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMonetizationNetwork(@Nullable String str) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final int AFAdRevenueData(@Nullable String str, int i10) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getInt(str, i10);
        } catch (ClassCastException e10) {
            boolean z10 = true & false;
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return i10;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMediationNetwork(@Nullable String str, int i10) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().putInt(str, i10).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMediationNetwork(@Nullable String str) {
        return ((SharedPreferences) this.getMonetizationNetwork.getValue()).contains(str);
    }
}
