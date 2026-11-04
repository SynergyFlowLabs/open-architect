package com.devtodev.core.data.metrics.aggregated.currencyaccrual;

import com.devtodev.core.utils.DeviceUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class CurrencyAccrualData implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f98103a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f98105c = (DeviceUtils.getCurrentUnixTimeInMillis() / 300000) * 300000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f98104b = 1;

    public CurrencyAccrualData(float f10) {
        this.f98103a = f10;
    }

    public float getAmount() {
        return this.f98103a;
    }

    public int getCount() {
        return this.f98104b;
    }

    public long getTimestamp() {
        return this.f98105c;
    }

    public void increment() {
        this.f98104b++;
    }
}
