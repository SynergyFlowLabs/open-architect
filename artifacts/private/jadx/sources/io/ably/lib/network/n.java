package io.ably.lib.network;

import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;

/* JADX INFO: loaded from: classes13.dex */
public class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f287438g = "Content-Length";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f287439h = "Content-Type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f287440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f287441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f287442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f287443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f287444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, List<String>> f287445f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private URL f287446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f287447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f287448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f287449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private i f287450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, List<String>> f287451f;

        a() {
        }

        public a a(i iVar) {
            this.f287450e = iVar;
            return this;
        }

        public n b() {
            return new n(this.f287446a, this.f287447b, this.f287448c, this.f287449d, this.f287450e, this.f287451f);
        }

        public a c(Map<String, String> map) {
            HashMap map2 = new HashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                map2.put(entry.getKey(), Collections.singletonList(entry.getValue()));
            }
            this.f287451f = Collections.unmodifiableMap(map2);
            return this;
        }

        public a d(int i10) {
            this.f287448c = i10;
            return this;
        }

        public a e(int i10) {
            this.f287449d = i10;
            return this;
        }

        public a f(String str) {
            this.f287447b = str;
            return this;
        }

        public a g(URL url) {
            this.f287446a = url;
            return this;
        }

        public String toString() {
            return "HttpRequest.HttpRequestBuilder(url=" + this.f287446a + ", method=" + this.f287447b + ", httpOpenTimeout=" + this.f287448c + ", httpReadTimeout=" + this.f287449d + ", body=" + this.f287450e + ", headers=" + this.f287451f + ")";
        }
    }

    @Generated
    public n(URL url, String str, int i10, int i11, i iVar, Map<String, List<String>> map) {
        this.f287440a = url;
        this.f287441b = str;
        this.f287442c = i10;
        this.f287443d = i11;
        this.f287444e = iVar;
        this.f287445f = map;
    }

    public static a a() {
        return new a();
    }

    @Generated
    protected boolean b(Object obj) {
        return obj instanceof n;
    }

    @Generated
    public i c() {
        return this.f287444e;
    }

    public Map<String, List<String>> d() {
        HashMap map = new HashMap(this.f287445f);
        i iVar = this.f287444e;
        if (iVar != null) {
            int length = iVar.b() == null ? 0 : this.f287444e.b().length;
            map.put("Content-Type", Collections.singletonList(this.f287444e.c()));
            map.put("Content-Length", Collections.singletonList(Integer.toString(length)));
        }
        return map;
    }

    @Generated
    public int e() {
        return this.f287442c;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (nVar.b(this) && e() == nVar.e() && f() == nVar.f()) {
            URL urlH = h();
            URL urlH2 = nVar.h();
            if (urlH != null ? !urlH.equals(urlH2) : urlH2 != null) {
                return false;
            }
            String strG = g();
            String strG2 = nVar.g();
            if (strG != null ? !strG.equals(strG2) : strG2 != null) {
                return false;
            }
            i iVarC = c();
            i iVarC2 = nVar.c();
            if (iVarC != null ? !iVarC.equals(iVarC2) : iVarC2 != null) {
                return false;
            }
            Map<String, List<String>> mapD = d();
            Map<String, List<String>> mapD2 = nVar.d();
            return mapD != null ? mapD.equals(mapD2) : mapD2 == null;
        }
        return false;
    }

    @Generated
    public int f() {
        return this.f287443d;
    }

    @Generated
    public String g() {
        return this.f287441b;
    }

    @Generated
    public URL h() {
        return this.f287440a;
    }

    @Generated
    public int hashCode() {
        int iE = ((e() + 59) * 59) + f();
        URL urlH = h();
        int iHashCode = (iE * 59) + (urlH == null ? 43 : urlH.hashCode());
        String strG = g();
        int iHashCode2 = (iHashCode * 59) + (strG == null ? 43 : strG.hashCode());
        i iVarC = c();
        int i10 = iHashCode2 * 59;
        int iHashCode3 = iVarC == null ? 43 : iVarC.hashCode();
        Map<String, List<String>> mapD = d();
        return ((i10 + iHashCode3) * 59) + (mapD != null ? mapD.hashCode() : 43);
    }

    @Generated
    public String toString() {
        return "HttpRequest(url=" + h() + ", method=" + g() + ", httpOpenTimeout=" + e() + ", httpReadTimeout=" + f() + ", body=" + c() + ", headers=" + d() + ")";
    }
}
