package com.android.volley.toolbox;

import androidx.annotation.p0;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class t extends u<JSONObject> {
    public t(String str, com.android.volley.v.b<JSONObject> bVar, @p0 com.android.volley.v.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    @Override // com.android.volley.toolbox.u, com.android.volley.s
    protected com.android.volley.v<JSONObject> parseNetworkResponse(com.android.volley.o oVar) {
        try {
            return com.android.volley.v.c(new JSONObject(new String(oVar.f89471b, m.g(oVar.f89472c, "utf-8"))), m.e(oVar));
        } catch (UnsupportedEncodingException e10) {
            return com.android.volley.v.a(new com.android.volley.q(e10));
        } catch (JSONException e11) {
            return com.android.volley.v.a(new com.android.volley.q(e11));
        }
    }

    @Deprecated
    public t(String str, @p0 JSONObject jSONObject, com.android.volley.v.b<JSONObject> bVar, @p0 com.android.volley.v.a aVar) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }

    public t(int i10, String str, @p0 JSONObject jSONObject, com.android.volley.v.b<JSONObject> bVar, @p0 com.android.volley.v.a aVar) {
        super(i10, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }
}
