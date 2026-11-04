package com.devtodev.core.data.metrics;

import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.logic.SDKClient;
import com.devtodev.core.utils.DeviceUtils;
import com.devtodev.core.utils.k.a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Metric implements JSONable, Serializable {
    public static final transient String IN_PROGRESS_KEY = "inProgress";
    public static final String TAG = "Metric";
    protected static final String TIMESTAMP_KEY = "timestamp";
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f98085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, Object> f98086b;
    protected String name;

    protected Metric() {
        this.f98086b = new HashMap<>();
        addParameter("timestamp", Long.valueOf(DeviceUtils.getCurrentUnixTimeInMillis()));
    }

    public void addParameter(String str, Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            try {
                obj = a.a(obj.toString(), "UTF-8");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        try {
            this.f98086b.put(str, obj);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    protected boolean addValueIfConsist(String str, JSONObject jSONObject) throws JSONException {
        Object obj = this.f98086b.get(str);
        if (obj == null) {
            return false;
        }
        if (obj instanceof Collection) {
            jSONObject.put(str, new JSONArray((Collection) obj));
        } else {
            jSONObject.put(str, obj);
        }
        return true;
    }

    public String getMetricCode() {
        return this.f98085a;
    }

    public String getMetricName() {
        return this.name;
    }

    public Object getParameter(String str) {
        return this.f98086b.get(str);
    }

    public boolean isFastSend() {
        return Arrays.asList(MetricConsts.fastSendMetrics).contains(this.f98085a);
    }

    protected void putSessionId() {
        addParameter(UserEntry.sessionId, Long.valueOf(SDKClient.getInstance().getUsersStorages().getDataStorage().getSessionId()));
    }

    @Override // com.devtodev.core.data.metrics.JSONable
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<Map.Entry<String, Object>> it = this.f98086b.entrySet().iterator();
            while (it.hasNext()) {
                addValueIfConsist(it.next().getKey(), jSONObject);
            }
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "Metric{name='" + this.name + "', code='" + this.f98085a + "', parameters=" + this.f98086b + AbstractJsonLexerKt.END_OBJ;
    }

    protected Metric(String str, String str2) {
        this();
        this.name = str;
        this.f98085a = str2;
    }
}
