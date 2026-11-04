package com.planner5d.library.model;

import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.p0;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f222440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f222441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f222442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f222443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f222444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f222445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f222446h;

    public enum a {
        base,
        diffuse,
        normal,
        roughness,
        metalness;

        static {
            int i10 = 6 ^ 1;
        }
    }

    public enum b {
        small(128),
        normal(256),
        big(512);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f222457a;

        b(int i10) {
            this.f222457a = i10;
        }
    }

    public static class c implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f222458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Float f222459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Float f222460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f222461d;

        private c(String str, Float f10, Float f11, Integer num) {
            this.f222458a = str;
            this.f222459b = f10;
            this.f222460c = f11 != null ? f11 : f10;
            this.f222461d = num;
        }
    }

    public p(String str, JSONObject jSONObject, JSONObject jSONObject2, p0 p0Var) throws JSONException {
        this(str, a(jSONObject, jSONObject2, p0Var, -1), c(jSONObject, jSONObject2, com.planner5d.library.services.r.scale.f224891a, Float.valueOf(1.0f)).floatValue(), e(a.base, jSONObject, jSONObject2, p0Var), e(a.diffuse, jSONObject, jSONObject2, p0Var), e(a.normal, jSONObject, jSONObject2, p0Var), e(a.metalness, jSONObject, jSONObject2, p0Var), e(a.roughness, jSONObject, jSONObject2, p0Var));
    }

    private static Integer a(JSONObject jSONObject, JSONObject jSONObject2, p0 p0Var, Integer num) throws JSONException {
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.color;
        if (!jSONObject.has(rVar.f224891a)) {
            if (jSONObject2 == null || !jSONObject2.has(rVar.f224891a)) {
                return num;
            }
            jSONObject = jSONObject2;
        }
        return Integer.valueOf(p0Var.c(jSONObject.getString(rVar.f224891a), 1.0d));
    }

    private static Float c(JSONObject jSONObject, JSONObject jSONObject2, String str, Float f10) throws JSONException {
        if (jSONObject.has(str)) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        return (jSONObject2 == null || !jSONObject2.has(str)) ? f10 : Float.valueOf((float) jSONObject2.getDouble(str));
    }

    private static c e(a aVar, JSONObject jSONObject, JSONObject jSONObject2, p0 p0Var) throws JSONException {
        String strName = aVar.name();
        if (!jSONObject.has(strName)) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(strName);
        JSONObject jSONObject4 = jSONObject2.has(strName) ? jSONObject2.getJSONObject(strName) : null;
        return new c(k1.w(jSONObject3, com.planner5d.library.services.r.image, null), c(jSONObject3, jSONObject4, com.planner5d.library.services.r.intensity.f224891a, null), c(jSONObject3, jSONObject4, com.planner5d.library.services.r.intensityInapshot.f224891a, null), a(jSONObject3, jSONObject4, p0Var, null));
    }

    public c b(a aVar) {
        if (aVar == a.base) {
            return this.f222442d;
        }
        if (aVar == a.diffuse) {
            return this.f222443e;
        }
        if (aVar == a.normal) {
            return this.f222444f;
        }
        if (aVar == a.roughness) {
            return this.f222446h;
        }
        if (aVar == a.metalness) {
            return this.f222445g;
        }
        return null;
    }

    public String d(c cVar, b bVar) {
        String str;
        String str2 = null;
        if (cVar == null || (str = cVar.f222458a) == null || str.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f222439a);
        sb2.append("/");
        sb2.append(org.apache.commons.io.l.l(cVar.f222458a));
        if (bVar != null) {
            str2 = "." + bVar.f222457a;
        }
        sb2.append(str2);
        sb2.append(".webp");
        return sb2.toString();
    }

    public p(String str, int i10, String str2, int i11) {
        this(str, Integer.valueOf(i10), 1.0f, null, new c(str2, null, null, Integer.valueOf(i11)), null, null, null);
    }

    private p(String str, Integer num, float f10, c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
        this.f222439a = str;
        this.f222440b = num;
        this.f222441c = f10;
        this.f222442d = cVar;
        this.f222443e = cVar2;
        this.f222444f = cVar3;
        this.f222445g = cVar4;
        this.f222446h = cVar5;
    }
}
