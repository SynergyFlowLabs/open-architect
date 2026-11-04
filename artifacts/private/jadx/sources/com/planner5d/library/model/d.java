package com.planner5d.library.model;

import com.planner5d.library.services.utility.k1;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f180679c;

    public d(JSONObject jSONObject) throws JSONException {
        this(k1.w(jSONObject, com.planner5d.library.services.r.version, null), a(jSONObject), k1.w(jSONObject, com.planner5d.library.services.r.hash, null));
    }

    private static String[] a(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.uris;
        if (jSONObject.has(rVar.f224891a)) {
            JSONArray jSONArray = jSONObject.getJSONArray(rVar.f224891a);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (!jSONArray.isNull(i10)) {
                    arrayList.add(jSONArray.getString(i10));
                }
            }
        } else {
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.uri;
            if (jSONObject.has(rVar2.f224891a) && !jSONObject.isNull(rVar2.f224891a)) {
                arrayList.add(jSONObject.getString(rVar2.f224891a));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null || str.isEmpty()) {
                it.remove();
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.planner5d.library.services.r.version.f224891a, this.f180677a);
        jSONObject.put(com.planner5d.library.services.r.hash.f224891a, this.f180678b);
        JSONArray jSONArray = new JSONArray();
        for (String str : this.f180679c) {
            jSONArray.put(str);
        }
        jSONObject.put(com.planner5d.library.services.r.uris.f224891a, jSONArray);
        return jSONObject;
    }

    public d(String str, String[] strArr, String str2) {
        this.f180677a = str;
        this.f180678b = str2;
        this.f180679c = strArr;
    }
}
