package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.k1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63568a = "ClearKeyUtil";

    private a() {
    }

    public static byte[] a(byte[] bArr) {
        return k1.f61540a >= 27 ? bArr : k1.Q0(c(k1.T(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (k1.f61540a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(k1.T(bArr));
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
            return k1.Q0(sb2.toString());
        } catch (JSONException e10) {
            androidx.media3.common.util.z.e(f63568a, "Failed to adjust response data: " + k1.T(bArr), e10);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', org.apache.commons.codec.language.l.f335457d).replace('/', '_');
    }

    private static String d(String str) {
        return str.replace(org.apache.commons.codec.language.l.f335457d, '+').replace('_', '/');
    }
}
