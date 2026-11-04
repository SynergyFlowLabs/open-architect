package com.android.volley.toolbox;

import androidx.annotation.p0;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class s extends u<JSONArray> {
    public s(String str, com.android.volley.v.b<JSONArray> bVar, @p0 com.android.volley.v.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    @Override // com.android.volley.toolbox.u, com.android.volley.s
    protected com.android.volley.v<JSONArray> parseNetworkResponse(com.android.volley.o oVar) {
        try {
            return com.android.volley.v.c(new JSONArray(new String(oVar.f89471b, m.g(oVar.f89472c, "utf-8"))), m.e(oVar));
        } catch (UnsupportedEncodingException e10) {
            return com.android.volley.v.a(new com.android.volley.q(e10));
        } catch (JSONException e11) {
            return com.android.volley.v.a(new com.android.volley.q(e11));
        }
    }

    public s(int i10, String str, @p0 JSONArray jSONArray, com.android.volley.v.b<JSONArray> bVar, @p0 com.android.volley.v.a aVar) {
        super(i10, str, jSONArray != null ? jSONArray.toString() : null, bVar, aVar);
    }
}
