package com.devtodev.core.data.metrics.aggregated.b;

import com.devtodev.core.data.metrics.aggregated.progression.params.ProgressionEventParams;
import com.devtodev.core.utils.DeviceUtils;
import java.io.Serializable;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f98094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ProgressionEventParams f98095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f98096c = DeviceUtils.getCurrentUnixTime();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f98097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<String, Object> f98098e;

    public c(ProgressionEventParams progressionEventParams, d dVar) {
        this.f98094a = dVar;
        this.f98095b = progressionEventParams;
    }

    public void a(c cVar) {
        this.f98094a = d.Closed;
        this.f98095b.merge(cVar.f98095b);
        this.f98097d = DeviceUtils.getCurrentUnixTime();
    }

    public d b() {
        return this.f98094a;
    }

    public long c() {
        return this.f98096c;
    }

    public boolean d() {
        return this.f98094a == d.Closed;
    }

    public JSONObject e() {
        JSONObject json = this.f98095b.toJSON();
        long j10 = this.f98097d - this.f98096c;
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("params");
        if (jSONObjectOptJSONObject.optLong("duration", 0L) == 0 && j10 > 0) {
            try {
                jSONObjectOptJSONObject.put("duration", j10);
            } catch (Exception unused) {
            }
        }
        return json;
    }

    public String toString() {
        return "ProgressionEventRecord{eventState=" + this.f98094a + ", params=" + this.f98095b + ", timestampStart=" + this.f98096c + ", timestampEnd=" + this.f98097d + AbstractJsonLexerKt.END_OBJ;
    }

    public void b(c cVar) {
        this.f98094a = cVar.f98094a;
        this.f98095b = cVar.f98095b;
        this.f98096c = cVar.f98096c;
    }

    public void a(String str, Object obj) {
        if (this.f98098e == null) {
            this.f98098e = new HashMap<>();
        }
        this.f98098e.put(str, obj);
    }

    public HashMap<String, Object> a() {
        if (this.f98098e == null) {
            this.f98098e = new HashMap<>();
        }
        return this.f98098e;
    }
}
