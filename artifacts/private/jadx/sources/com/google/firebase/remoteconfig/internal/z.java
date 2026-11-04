package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f124698c = "fp";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f124699d = "personalization_assignment";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f124700e = "arm_key";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f124701f = "arm_value";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f124702g = "personalizationId";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f124703h = "personalization_id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f124704i = "armIndex";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f124705j = "arm_index";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f124706k = "group";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f124707l = "group";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f124708m = "_fpc";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f124709n = "choiceId";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f124710o = "_fpid";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z8.b<com.google.firebase.analytics.connector.a> f124711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f124712b = Collections.synchronizedMap(new HashMap());

    public z(z8.b<com.google.firebase.analytics.connector.a> bVar) {
        this.f124711a = bVar;
    }

    public void a(@NonNull String str, @NonNull h hVar) {
        JSONObject jSONObjectOptJSONObject;
        com.google.firebase.analytics.connector.a aVar = this.f124711a.get();
        if (aVar != null) {
            JSONObject jSONObjectI = hVar.i();
            if (jSONObjectI.length() >= 1) {
                JSONObject jSONObjectG = hVar.g();
                if (jSONObjectG.length() >= 1 && (jSONObjectOptJSONObject = jSONObjectI.optJSONObject(str)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString(f124709n);
                    if (!strOptString.isEmpty()) {
                        synchronized (this.f124712b) {
                            try {
                                if (strOptString.equals(this.f124712b.get(str))) {
                                    return;
                                }
                                this.f124712b.put(str, strOptString);
                                Bundle bundle = new Bundle();
                                bundle.putString(f124700e, str);
                                bundle.putString(f124701f, jSONObjectG.optString(str));
                                bundle.putString(f124703h, jSONObjectOptJSONObject.optString(f124702g));
                                bundle.putInt(f124705j, jSONObjectOptJSONObject.optInt(f124704i, -1));
                                bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                aVar.a(f124698c, f124699d, bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(f124710o, strOptString);
                                aVar.a(f124698c, f124708m, bundle2);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
            }
        }
    }
}
