package com.devtodev.core.data.metrics.aggregated.events;

import androidx.constraintlayout.core.motion.utils.v;
import com.devtodev.core.utils.DeviceUtils;
import io.intercom.android.sdk.models.AttributeType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class a implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98114a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f98116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f98117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f98118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CustomEventParams f98119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CustomEventParams f98120g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f98115b = DeviceUtils.getCurrentUnixTimeInMillis();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HashMap<String, Object> f98121h = new HashMap<>();

    a(CustomEventParams customEventParams, boolean z10) {
        this.f98119f = customEventParams;
        this.f98118e = z10;
    }

    public void a(String str, Object obj) {
        if (this.f98121h == null) {
            this.f98121h = new HashMap<>();
        }
        this.f98121h.put(str, obj);
    }

    JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t1", this.f98115b);
            long j10 = this.f98116c;
            if (j10 != 0) {
                jSONObject.put("t2", j10);
            }
            int i10 = this.f98117d;
            if (i10 != 0) {
                jSONObject.put("d", i10);
            }
            JSONObject jSONObject2 = new JSONObject();
            CustomEventParams customEventParams = this.f98119f;
            if (customEventParams != null && customEventParams.c() > 0) {
                new JSONObject();
                jSONObject2.put("t1", a(this.f98119f));
                if (this.f98118e) {
                    if (this.f98120g == null) {
                        this.f98120g = new CustomEventParams();
                    }
                    for (String str : this.f98119f.b().keySet()) {
                        if (!this.f98120g.b().containsKey(str)) {
                            this.f98120g.b().put(str, 0);
                        }
                    }
                    for (String str2 : this.f98119f.d().keySet()) {
                        if (!this.f98120g.d().containsKey(str2)) {
                            this.f98120g.d().put(str2, "");
                        }
                    }
                    for (String str3 : this.f98119f.a().keySet()) {
                        if (!this.f98120g.a().containsKey(str3)) {
                            this.f98120g.a().put(str3, 0L);
                        }
                    }
                    for (String str4 : this.f98120g.b().keySet()) {
                        if (!this.f98119f.b().containsKey(str4)) {
                            this.f98120g.b().remove(str4);
                        }
                    }
                    for (String str5 : this.f98120g.d().keySet()) {
                        if (!this.f98119f.d().containsKey(str5)) {
                            this.f98120g.d().remove(str5);
                        }
                    }
                    for (String str6 : this.f98120g.a().keySet()) {
                        if (!this.f98119f.a().containsKey(str6)) {
                            this.f98120g.a().remove(str6);
                        }
                    }
                }
                CustomEventParams customEventParams2 = this.f98120g;
                if (customEventParams2 != null && customEventParams2.c() > 0) {
                    jSONObject2.put("t2", a(this.f98120g));
                }
                if (jSONObject2.length() > 0) {
                    jSONObject.put("p", jSONObject2);
                }
            }
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "Record Id: " + this.f98114a + " StartTime: " + this.f98115b + " EndTime: " + this.f98116c + " Duration: " + this.f98117d + " IsTimed: " + this.f98118e;
    }

    HashMap<String, Object> a() {
        if (this.f98121h == null) {
            this.f98121h = new HashMap<>();
        }
        return this.f98121h;
    }

    private JSONObject a(CustomEventParams customEventParams) {
        JSONObject jSONObject = new JSONObject();
        HashMap<String, Number> mapB = customEventParams.b();
        if (mapB.size() > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (Map.Entry<String, Number> entry : mapB.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            try {
                jSONObject.put("double", jSONObject2);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        HashMap<String, String> mapD = customEventParams.d();
        if (mapD.size() > 0) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                for (Map.Entry<String, String> entry2 : mapD.entrySet()) {
                    jSONObject3.put(entry2.getKey(), entry2.getValue());
                }
            } catch (JSONException e12) {
                e12.printStackTrace();
            }
            try {
                jSONObject.put(v.b.f43988e, jSONObject3);
            } catch (JSONException e13) {
                e13.printStackTrace();
            }
        }
        HashMap<String, Long> mapA = customEventParams.a();
        if (mapA.size() > 0) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                for (Map.Entry<String, Long> entry3 : mapA.entrySet()) {
                    jSONObject4.put(entry3.getKey(), entry3.getValue());
                }
            } catch (JSONException e14) {
                e14.printStackTrace();
            }
            try {
                jSONObject.put(AttributeType.DATE, jSONObject4);
            } catch (JSONException e15) {
                e15.printStackTrace();
            }
        }
        return jSONObject;
    }
}
