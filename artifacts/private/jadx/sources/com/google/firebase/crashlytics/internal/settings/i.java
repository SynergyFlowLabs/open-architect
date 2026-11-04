package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.h0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f121915a;

    i(h0 h0Var) {
        this.f121915a = h0Var;
    }

    private static j a(int i10) {
        if (i10 == 3) {
            return new n();
        }
        com.google.firebase.crashlytics.internal.g.f().d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt("settings_version")).a(this.f121915a, jSONObject);
    }
}
