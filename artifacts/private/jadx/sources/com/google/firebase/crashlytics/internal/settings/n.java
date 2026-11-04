package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.h0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class n implements j {
    n() {
    }

    private static d.a b(JSONObject jSONObject) {
        return new d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static d.b c(JSONObject jSONObject) {
        return new d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long d(h0 h0Var, long j10, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : h0Var.a() + (j10 * 1000);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.j
    public d a(h0 h0Var, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new d(d(h0Var, iOptInt2, jSONObject), jSONObject.has(io.sentry.cache.f.f305178k) ? c(jSONObject.getJSONObject(io.sentry.cache.f.f305178k)) : c(new JSONObject()), b(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
