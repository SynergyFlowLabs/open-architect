package com.devtodev.core.data.metrics.aggregated.a;

import com.devtodev.core.utils.DeviceUtils;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f98087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f98088b = DeviceUtils.getCurrentUnixTimeInMillis();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, Object> f98089c = new HashMap<>();

    public a(HashMap<String, Object> map) {
        this.f98087a = map;
    }

    public HashMap<String, Object> a() {
        return this.f98087a;
    }

    public HashMap<String, Object> b() {
        if (this.f98089c == null) {
            this.f98089c = new HashMap<>();
        }
        return this.f98089c;
    }

    public a c() {
        if (this.f98087a == null) {
            return null;
        }
        HashMap map = new HashMap();
        if (this.f98087a.get("cheater") != null) {
            map.put("cheater", this.f98087a.get("cheater"));
        }
        return new a(map);
    }

    public long d() {
        return this.f98088b;
    }

    public void a(HashMap<String, Object> map) {
        if (map == null) {
            this.f98087a = null;
        } else {
            this.f98087a.putAll(map);
        }
    }

    public void a(String str, Object obj) {
        if (this.f98089c == null) {
            this.f98089c = new HashMap<>();
        }
        this.f98089c.put(str, obj);
    }
}
