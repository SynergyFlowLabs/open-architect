package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1pSDK implements SensorEventListener {
    private double AFAdRevenueData;
    private long component2;

    @NonNull
    private final Executor component4;
    private final int getCurrencyIso4217Code;

    @NonNull
    private final String getMediationNetwork;
    private final int getMonetizationNetwork;

    @NonNull
    private final String getRevenue;
    private final float[][] component1 = new float[2][];
    private final long[] component3 = new long[2];

    AFj1pSDK(Sensor sensor, @NonNull ExecutorService executorService) {
        int type = sensor.getType();
        this.getMonetizationNetwork = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.getRevenue = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getMediationNetwork = str;
        this.getCurrencyIso4217Code = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.component4 = executorService;
    }

    @NonNull
    private Map<String, Object> AFAdRevenueData() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.getMonetizationNetwork));
        concurrentHashMap.put("sN", this.getRevenue);
        concurrentHashMap.put("sV", this.getMediationNetwork);
        float[] fArr = this.component1[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getMonetizationNetwork(fArr));
        }
        float[] fArr2 = this.component1[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getMonetizationNetwork(fArr2));
        }
        return concurrentHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    /* JADX INFO: renamed from: F_, reason: merged with bridge method [inline-methods] */
    public void G_(SensorEvent sensorEvent) {
        long j10 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component1;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.component3[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.component1[1] = fArrCopyOf;
            this.component3[1] = jCurrentTimeMillis;
            this.AFAdRevenueData = getRevenue(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j10 - this.component2) {
            this.component2 = j10;
            if (Arrays.equals(fArr4, fArr)) {
                this.component3[1] = jCurrentTimeMillis;
                return;
            }
            double revenue = getRevenue(fArr3, fArr);
            if (revenue > this.AFAdRevenueData) {
                this.component1[1] = Arrays.copyOf(fArr, fArr.length);
                this.component3[1] = jCurrentTimeMillis;
                this.AFAdRevenueData = revenue;
            }
        }
    }

    private boolean getCurrencyIso4217Code() {
        return this.component1[0] != null;
    }

    @NonNull
    private static List<Float> getMonetizationNetwork(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    private static double getRevenue(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i10 = 0; i10 < iMin; i10++) {
            dPow += StrictMath.pow(fArr[i10] - fArr2[i10], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1pSDK)) {
            return false;
        }
        AFj1pSDK aFj1pSDK = (AFj1pSDK) obj;
        return getMonetizationNetwork(aFj1pSDK.getMonetizationNetwork, aFj1pSDK.getRevenue, aFj1pSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component4.execute(new Runnable() { // from class: com.appsflyer.internal.f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89701a.G_(sensorEvent);
                }
            });
        } else {
            G_(sensorEvent);
        }
    }

    final void getMonetizationNetwork(@NonNull Map<AFj1pSDK, Map<String, Object>> map, boolean z10) {
        if (!getCurrencyIso4217Code()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, AFAdRevenueData());
            return;
        }
        map.put(this, AFAdRevenueData());
        if (z10) {
            int length = this.component1.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.component1[i10] = null;
            }
            int length2 = this.component3.length;
            for (int i11 = 0; i11 < length2; i11++) {
                this.component3[i11] = 0;
            }
            this.AFAdRevenueData = 0.0d;
            this.component2 = 0L;
        }
    }

    private boolean getMonetizationNetwork(int i10, @NonNull String str, @NonNull String str2) {
        if (this.getMonetizationNetwork != i10 || !this.getRevenue.equals(str) || !this.getMediationNetwork.equals(str2)) {
            return false;
        }
        int i11 = 0 >> 1;
        return true;
    }
}
