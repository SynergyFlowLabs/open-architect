package org.threeten.bp;

import androidx.constraintlayout.core.motion.utils.v;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes14.dex */
public abstract class r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<r> f340308a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f340309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f340310c = 8352817235686L;

    class a implements org.threeten.bp.temporal.l<r> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a(org.threeten.bp.temporal.f fVar) {
            return r.w(fVar);
        }
    }

    class b extends cn.c {
        b() {
        }

        @Override // cn.c, org.threeten.bp.temporal.f
        public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
            return lVar == org.threeten.bp.temporal.k.g() ? (R) r.this : (R) super.d(lVar);
        }

        @Override // org.threeten.bp.temporal.f
        public boolean q(org.threeten.bp.temporal.j jVar) {
            return false;
        }

        @Override // org.threeten.bp.temporal.f
        public long t(org.threeten.bp.temporal.j jVar) {
            throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("ACT", "Australia/Darwin");
        map.put("AET", "Australia/Sydney");
        map.put("AGT", "America/Argentina/Buenos_Aires");
        map.put("ART", "Africa/Cairo");
        map.put("AST", "America/Anchorage");
        map.put("BET", "America/Sao_Paulo");
        map.put("BST", "Asia/Dhaka");
        map.put("CAT", "Africa/Harare");
        map.put("CNT", "America/St_Johns");
        map.put("CST", "America/Chicago");
        map.put("CTT", "Asia/Shanghai");
        map.put("EAT", "Africa/Addis_Ababa");
        map.put(com.google.common.net.d.f119534r1, "Europe/Paris");
        map.put("IET", "America/Indiana/Indianapolis");
        map.put("IST", "Asia/Kolkata");
        map.put("JST", "Asia/Tokyo");
        map.put("MIT", "Pacific/Apia");
        map.put("NET", "Asia/Yerevan");
        map.put("NST", "Pacific/Auckland");
        map.put("PLT", "Asia/Karachi");
        map.put("PNT", "America/Phoenix");
        map.put("PRT", "America/Puerto_Rico");
        map.put("PST", "America/Los_Angeles");
        map.put("SST", "Pacific/Guadalcanal");
        map.put("VST", "Asia/Ho_Chi_Minh");
        map.put("EST", "-05:00");
        map.put("MST", "-07:00");
        map.put("HST", "-10:00");
        f340309b = Collections.unmodifiableMap(map);
    }

    r() {
        if (getClass() != s.class && getClass() != t.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static r E(String str) {
        cn.d.j(str, "zoneId");
        if (str.equals(org.locationtech.jts.io.gml2.a.f338505w)) {
            return s.f340320n;
        }
        if (str.length() == 1) {
            throw new org.threeten.bp.b("Invalid zone: " + str);
        }
        if (str.startsWith(org.slf4j.h.f339615a3) || str.startsWith("-")) {
            return s.T(str);
        }
        if (str.equals("UTC") || str.equals(org.apache.commons.lang3.time.m.f337525a) || str.equals("UT")) {
            return new t(str, s.f340320n.z());
        }
        if (!str.startsWith("UTC+") && !str.startsWith("GMT+") && !str.startsWith("UTC-") && !str.startsWith("GMT-")) {
            if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                return t.N(str, true);
            }
            s sVarT = s.T(str.substring(2));
            if (sVarT.S() == 0) {
                return new t("UT", sVarT.z());
            }
            return new t("UT" + sVarT.getId(), sVarT.z());
        }
        s sVarT2 = s.T(str.substring(3));
        if (sVarT2.S() == 0) {
            return new t(str.substring(0, 3), sVarT2.z());
        }
        return new t(str.substring(0, 3) + sVarT2.getId(), sVarT2.z());
    }

    public static r H(String str, Map<String, String> map) {
        cn.d.j(str, "zoneId");
        cn.d.j(map, "aliasMap");
        String str2 = map.get(str);
        if (str2 != null) {
            str = str2;
        }
        return E(str);
    }

    public static r I(String str, s sVar) {
        cn.d.j(str, "prefix");
        cn.d.j(sVar, v.c.R);
        if (str.length() == 0) {
            return sVar;
        }
        if (!str.equals(org.apache.commons.lang3.time.m.f337525a) && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("Invalid prefix, must be GMT, UTC or UT: " + str);
        }
        if (sVar.S() == 0) {
            return new t(str, sVar.z());
        }
        return new t(str + sVar.getId(), sVar.z());
    }

    public static r L() {
        return H(TimeZone.getDefault().getID(), f340309b);
    }

    public static r w(org.threeten.bp.temporal.f fVar) {
        r rVar = (r) fVar.d(org.threeten.bp.temporal.k.f());
        if (rVar != null) {
            return rVar;
        }
        throw new org.threeten.bp.b("Unable to obtain ZoneId from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
    }

    public static Set<String> x() {
        return new HashSet(org.threeten.bp.zone.k.a());
    }

    public r D() {
        try {
            org.threeten.bp.zone.g gVarZ = z();
            if (gVarZ.j()) {
                this = gVarZ.b(f.f340021c);
            }
        } catch (org.threeten.bp.zone.i unused) {
        }
        return this;
    }

    abstract void M(DataOutput dataOutput) throws IOException;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return getId().equals(((r) obj).getId());
        }
        return false;
    }

    public abstract String getId();

    public int hashCode() {
        return getId().hashCode();
    }

    public String r(org.threeten.bp.format.o oVar, Locale locale) {
        return new org.threeten.bp.format.d().B(oVar).Q(locale).d(new b());
    }

    public String toString() {
        return getId();
    }

    public abstract org.threeten.bp.zone.g z();
}
