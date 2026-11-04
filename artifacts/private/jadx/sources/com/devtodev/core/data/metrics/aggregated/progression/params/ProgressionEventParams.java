package com.devtodev.core.data.metrics.aggregated.progression.params;

import com.devtodev.core.data.metrics.JSONable;
import com.devtodev.core.utils.k.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ProgressionEventParams implements JSONable, Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    protected boolean isSuccess;
    protected HashMap<String, Number> earned = new HashMap<>();
    protected HashMap<String, Number> spent = new HashMap<>();

    public void merge(ProgressionEventParams progressionEventParams) {
        this.earned.putAll(progressionEventParams.earned);
        this.spent.putAll(progressionEventParams.spent);
    }

    public void setEarned(HashMap<String, Number> map) {
        if (map != null) {
            this.earned = map;
        }
    }

    public void setSpent(HashMap<String, Number> map) {
        if (map != null) {
            this.spent = map;
        }
    }

    public void setSuccess(boolean z10) {
        this.isSuccess = z10;
    }

    @Override // com.devtodev.core.data.metrics.JSONable
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap<String, Number> map = this.earned;
            if (map != null && map.size() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, Number> entry : this.earned.entrySet()) {
                    jSONObject2.put(a.a(entry.getKey(), "UTF-8"), entry.getValue());
                }
                jSONObject.put("earned", jSONObject2);
            }
            HashMap<String, Number> map2 = this.spent;
            if (map2 != null && map2.size() > 0) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, Number> entry2 : this.spent.entrySet()) {
                    jSONObject3.put(a.a(entry2.getKey(), "UTF-8"), entry2.getValue());
                }
                jSONObject.put("spent", jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("success", this.isSuccess);
            jSONObject.put("params", jSONObject4);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "ProgressionEventParams{earned=" + this.earned + ", spent=" + this.spent + AbstractJsonLexerKt.END_OBJ;
    }
}
