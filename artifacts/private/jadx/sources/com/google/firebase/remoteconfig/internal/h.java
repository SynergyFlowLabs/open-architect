package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f124528h = "configs_key";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f124529i = "fetch_time_key";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f124530j = "abt_experiments_key";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f124531k = "personalization_metadata_key";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f124532l = "template_version_number_key";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f124533m = "rollout_metadata_key";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f124534n = "affectedParameterKeys";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f124535o = "rolloutId";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f124536p = "variantId";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Date f124537q = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f124538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f124539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f124540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONArray f124541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f124542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f124543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONArray f124544g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f124545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f124546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private JSONArray f124547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f124548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f124549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private JSONArray f124550f;

        public h a() throws JSONException {
            return new h(this.f124545a, this.f124546b, this.f124547c, this.f124548d, this.f124549e, this.f124550f);
        }

        public b b(Map<String, String> map) {
            this.f124545a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.f124545a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.f124547c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.f124546b = date;
            return this;
        }

        public b f(JSONObject jSONObject) {
            try {
                this.f124548d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b g(JSONArray jSONArray) {
            try {
                this.f124550f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b h(long j10) {
            this.f124549e = j10;
            return this;
        }

        private b() {
            this.f124545a = new JSONObject();
            this.f124546b = h.f124537q;
            this.f124547c = new JSONArray();
            this.f124548d = new JSONObject();
            this.f124549e = 0L;
            this.f124550f = new JSONArray();
        }

        public b(h hVar) {
            this.f124545a = hVar.g();
            this.f124546b = hVar.h();
            this.f124547c = hVar.e();
            this.f124548d = hVar.i();
            this.f124549e = hVar.k();
            this.f124550f = hVar.j();
        }
    }

    static h b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f124531k);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(f124533m);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new h(jSONObject.getJSONObject(f124528h), new Date(jSONObject.getLong(f124529i)), jSONObject.getJSONArray(f124530j), jSONObject2, jSONObject.optLong(f124532l), jSONArrayOptJSONArray);
    }

    private Map<String, Map<String, String>> c() throws JSONException {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < j().length(); i10++) {
            JSONObject jSONObject = j().getJSONObject(i10);
            String string = jSONObject.getString(f124535o);
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray(f124534n);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string3 = jSONArray.getString(i11);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    private static h d(JSONObject jSONObject) throws JSONException {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static b l() {
        return new b();
    }

    public static b m(h hVar) {
        return new b(hVar);
    }

    public JSONArray e() {
        return this.f124541d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f124538a.toString().equals(((h) obj).toString());
        }
        return false;
    }

    public Set<String> f(h hVar) throws JSONException {
        JSONObject jSONObjectG = d(hVar.f124538a).g();
        Map<String, Map<String, String>> mapC = c();
        Map<String, Map<String, String>> mapC2 = hVar.c();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = g().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!hVar.g().has(next)) {
                hashSet.add(next);
            } else if (!g().get(next).equals(hVar.g().get(next))) {
                hashSet.add(next);
            } else if ((i().has(next) && !hVar.i().has(next)) || (!i().has(next) && hVar.i().has(next))) {
                hashSet.add(next);
            } else if (i().has(next) && hVar.i().has(next) && !i().getJSONObject(next).toString().equals(hVar.i().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) != mapC2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) && mapC2.containsKey(next) && !mapC.get(next).equals(mapC2.get(next))) {
                hashSet.add(next);
            } else {
                jSONObjectG.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObjectG.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.f124539b;
    }

    public Date h() {
        return this.f124540c;
    }

    public int hashCode() {
        return this.f124538a.hashCode();
    }

    public JSONObject i() {
        return this.f124542e;
    }

    public JSONArray j() {
        return this.f124544g;
    }

    public long k() {
        return this.f124543f;
    }

    public String toString() {
        return this.f124538a.toString();
    }

    private h(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(f124528h, jSONObject);
        jSONObject3.put(f124529i, date.getTime());
        jSONObject3.put(f124530j, jSONArray);
        jSONObject3.put(f124531k, jSONObject2);
        jSONObject3.put(f124532l, j10);
        jSONObject3.put(f124533m, jSONArray2);
        this.f124539b = jSONObject;
        this.f124540c = date;
        this.f124541d = jSONArray;
        this.f124542e = jSONObject2;
        this.f124543f = j10;
        this.f124544g = jSONArray2;
        this.f124538a = jSONObject3;
    }
}
