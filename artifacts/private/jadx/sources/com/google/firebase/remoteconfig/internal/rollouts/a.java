package com.google.firebase.remoteconfig.internal.rollouts;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.h;
import com.google.firebase.remoteconfig.s;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    g f124611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    g f124612b;

    a(g gVar, g gVar2) {
        this.f124611a = gVar;
        this.f124612b = gVar2;
    }

    @NonNull
    public static a a(@NonNull g gVar, @NonNull g gVar2) {
        return new a(gVar, gVar2);
    }

    @NonNull
    private String c(@NonNull String str) {
        String strD = d(this.f124611a, str);
        if (strD != null) {
            return strD;
        }
        String strD2 = d(this.f124612b, str);
        return strD2 != null ? strD2 : "";
    }

    @p0
    private static String d(@NonNull g gVar, @NonNull String str) {
        h hVarG = gVar.g();
        if (hVarG == null) {
            return null;
        }
        try {
            return hVarG.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    @NonNull
    com.google.firebase.remoteconfig.interop.rollouts.e b(@NonNull h hVar) throws s {
        JSONArray jSONArrayJ = hVar.j();
        long jK = hVar.k();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArrayJ.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArrayJ.getJSONObject(i10);
                String string = jSONObject.getString(h.f124535o);
                JSONArray jSONArray = jSONObject.getJSONArray(h.f124534n);
                if (jSONArray.length() > 1) {
                    String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray);
                }
                String strOptString = jSONArray.optString(0, "");
                hashSet.add(com.google.firebase.remoteconfig.interop.rollouts.d.a().d(string).f(jSONObject.getString("variantId")).b(strOptString).c(c(strOptString)).e(jK).a());
            } catch (JSONException e10) {
                throw new s("Exception parsing rollouts metadata to create RolloutsState.", e10);
            }
        }
        return com.google.firebase.remoteconfig.interop.rollouts.e.a(hashSet);
    }
}
