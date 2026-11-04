package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.firebase.crashlytics.internal.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class d implements b, e8.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f120954b = "name";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f120955c = "parameters";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f120956d = "$A$:";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private e8.a f120957a;

    @NonNull
    private static String b(@NonNull String str, @NonNull Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // e8.b
    public void a(@p0 e8.a aVar) {
        this.f120957a = aVar;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.b
    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        e8.a aVar = this.f120957a;
        if (aVar != null) {
            try {
                aVar.a(f120956d + b(str, bundle));
            } catch (JSONException unused) {
                g.f().m("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
