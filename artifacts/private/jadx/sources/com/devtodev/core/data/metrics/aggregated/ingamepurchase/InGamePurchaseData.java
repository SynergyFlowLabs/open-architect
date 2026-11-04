package com.devtodev.core.data.metrics.aggregated.ingamepurchase;

import com.devtodev.core.utils.DeviceUtils;
import com.devtodev.core.utils.k.a;
import com.devtodev.core.utils.log.CoreLog;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class InGamePurchaseData implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f98122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f98123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f98124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f98125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f98126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f98127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, Object> f98128g;

    public InGamePurchaseData(String str, String str2, int i10, float f10, String str3) {
        try {
            this.f98122a = a.a(str, "UTF-8");
            this.f98123b = a.a(str2, "UTF-8");
            this.f98124c = i10;
            this.f98125d = f10;
            this.f98126e = a.a(str3, "UTF-8");
            this.f98128g = new HashMap<>();
        } catch (Exception e10) {
            CoreLog.e("DevToDev", "", e10);
        }
        this.f98127f = DeviceUtils.getCurrentUnixTimeInMillis();
    }

    public void addRecordParameter(String str, Object obj) {
        if (this.f98128g == null) {
            this.f98128g = new HashMap<>();
        }
        this.f98128g.put(str, obj);
    }

    public int getPurchaseAmount() {
        return this.f98124c;
    }

    public String getPurchaseId() {
        return this.f98122a;
    }

    public float getPurchasePrice() {
        return this.f98125d;
    }

    public String getPurchasePriceCurrency() {
        return this.f98126e;
    }

    public String getPurchaseType() {
        return this.f98123b;
    }

    public HashMap<String, Object> getRecordParameters() {
        if (this.f98128g == null) {
            this.f98128g = new HashMap<>();
        }
        return this.f98128g;
    }

    public long getTimestamp() {
        return this.f98127f;
    }
}
