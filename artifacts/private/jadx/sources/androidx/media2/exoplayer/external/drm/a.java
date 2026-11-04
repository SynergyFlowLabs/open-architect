package androidx.media2.exoplayer.external.drm;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53820a = "ClearKeyUtil";

    private a() {
    }

    public static byte[] a(byte[] request) {
        return q0.f57626a >= 27 ? request : q0.i0(c(q0.C(request)));
    }

    public static byte[] b(byte[] response) {
        if (q0.f57626a >= 27) {
            return response;
        }
        try {
            JSONObject jSONObject = new JSONObject(q0.C(response));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(com.google.firebase.crashlytics.internal.metadata.p.f121327i);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return q0.i0(sb2.toString());
        } catch (JSONException e10) {
            String strValueOf = String.valueOf(q0.C(response));
            androidx.media2.exoplayer.external.util.p.e(f53820a, strValueOf.length() != 0 ? "Failed to adjust response data: ".concat(strValueOf) : new String("Failed to adjust response data: "), e10);
            return response;
        }
    }

    private static String c(String base64) {
        return base64.replace('+', org.apache.commons.codec.language.l.f335457d).replace('/', '_');
    }

    private static String d(String base64Url) {
        return base64Url.replace(org.apache.commons.codec.language.l.f335457d, '+').replace('_', '/');
    }
}
