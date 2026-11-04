package com.devtodev.core.data.metrics.aggregated.progression.params;

import com.devtodev.analytics.internal.domain.events.progressionEvent.ProgressionEventKt;
import com.devtodev.core.utils.k.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class LocationEventParams extends ProgressionEventParams {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f98132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f98133c;

    @Override // com.devtodev.core.data.metrics.aggregated.progression.params.ProgressionEventParams
    public void merge(ProgressionEventParams progressionEventParams) {
        super.merge(progressionEventParams);
        LocationEventParams locationEventParams = (LocationEventParams) progressionEventParams;
        if (locationEventParams != null) {
            if (this.f98131a == 0 || locationEventParams.f98131a != 0) {
                this.f98131a = locationEventParams.f98131a;
            }
            if (this.f98132b == null || locationEventParams.f98132b != null) {
                this.f98132b = locationEventParams.f98132b;
            }
            if (this.f98133c == 0 || locationEventParams.f98133c != 0) {
                this.f98133c = locationEventParams.f98133c;
            }
            if (!this.isSuccess || locationEventParams.isSuccess) {
                this.isSuccess = locationEventParams.isSuccess;
            }
        }
    }

    public void setDifficulty(int i10) {
        this.f98131a = i10;
    }

    public void setDuration(long j10) {
        this.f98133c = j10;
    }

    public void setSource(String str) {
        this.f98132b = str;
    }

    @Override // com.devtodev.core.data.metrics.aggregated.progression.params.ProgressionEventParams, com.devtodev.core.data.metrics.JSONable
    public JSONObject toJSON() {
        JSONObject json = super.toJSON();
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("params");
        try {
            jSONObjectOptJSONObject.put(ProgressionEventKt.LOCATION_DIFFICULTY_KEY, this.f98131a);
            jSONObjectOptJSONObject.put("duration", this.f98133c);
            String str = this.f98132b;
            if (str == null) {
                return json;
            }
            jSONObjectOptJSONObject.put("source", a.a(str, "UTF-8"));
            return json;
        } catch (Exception e10) {
            e10.printStackTrace();
            return json;
        }
    }

    @Override // com.devtodev.core.data.metrics.aggregated.progression.params.ProgressionEventParams
    public String toString() {
        return "LocationEventParams{difficulty=" + this.f98131a + ", source='" + this.f98132b + "', duration=" + this.f98133c + ", isSuccess=" + this.isSuccess + ", resources=" + super.toString() + AbstractJsonLexerKt.END_OBJ;
    }
}
