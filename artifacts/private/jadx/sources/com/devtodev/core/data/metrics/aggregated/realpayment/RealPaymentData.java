package com.devtodev.core.data.metrics.aggregated.realpayment;

import com.devtodev.core.utils.DeviceUtils;
import com.devtodev.core.utils.k.a;
import com.devtodev.core.utils.log.CoreLog;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class RealPaymentData implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f98134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f98135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f98136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f98137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<String, Object> f98138e;

    public RealPaymentData(String str, float f10, String str2) {
        try {
            this.f98134a = a.a(str, "UTF-8");
            this.f98135b = f10;
            this.f98136c = a.a(str2, "UTF-8");
            this.f98137d = DeviceUtils.getCurrentUnixTimeInMillis();
            this.f98138e = new HashMap<>();
        } catch (Exception e10) {
            CoreLog.e("DevToDev", "", e10);
        }
    }

    public void addRecordParameter(String str, Object obj) {
        if (this.f98138e == null) {
            this.f98138e = new HashMap<>();
        }
        this.f98138e.put(str, obj);
    }

    public String getInAppCurrencyISOCode() {
        return this.f98136c;
    }

    public float getInAppPrice() {
        return this.f98135b;
    }

    public String getPaymentId() {
        return this.f98134a;
    }

    public HashMap<String, Object> getRecordParameters() {
        if (this.f98138e == null) {
            this.f98138e = new HashMap<>();
        }
        return this.f98138e;
    }

    public long getTimestamp() {
        return this.f98137d;
    }
}
