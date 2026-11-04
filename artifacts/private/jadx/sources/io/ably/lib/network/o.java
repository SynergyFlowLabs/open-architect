package io.ably.lib.network;

import java.util.List;
import java.util.Map;
import lombok.Generated;

/* JADX INFO: loaded from: classes13.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f287452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f287453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f287454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, List<String>> f287455d;

    @Generated
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Generated
        private int f287456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Generated
        private String f287457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Generated
        private i f287458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Generated
        private Map<String, List<String>> f287459d;

        @Generated
        a() {
        }

        @Generated
        public a a(i iVar) {
            this.f287458c = iVar;
            return this;
        }

        @Generated
        public o b() {
            return new o(this.f287456a, this.f287457b, this.f287458c, this.f287459d);
        }

        @Generated
        public a c(int i10) {
            this.f287456a = i10;
            return this;
        }

        @Generated
        public a d(Map<String, List<String>> map) {
            this.f287459d = map;
            return this;
        }

        @Generated
        public a e(String str) {
            this.f287457b = str;
            return this;
        }

        @Generated
        public String toString() {
            return "HttpResponse.HttpResponseBuilder(code=" + this.f287456a + ", message=" + this.f287457b + ", body=" + this.f287458c + ", headers=" + this.f287459d + ")";
        }
    }

    @Generated
    public o(int i10, String str, i iVar, Map<String, List<String>> map) {
        this.f287452a = i10;
        this.f287453b = str;
        this.f287454c = iVar;
        this.f287455d = map;
    }

    @Generated
    public static a a() {
        return new a();
    }

    @Generated
    protected boolean b(Object obj) {
        return obj instanceof o;
    }

    @Generated
    public i c() {
        return this.f287454c;
    }

    @Generated
    public int d() {
        return this.f287452a;
    }

    @Generated
    public Map<String, List<String>> e() {
        return this.f287455d;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!oVar.b(this) || d() != oVar.d()) {
            return false;
        }
        String strF = f();
        String strF2 = oVar.f();
        if (strF != null ? !strF.equals(strF2) : strF2 != null) {
            return false;
        }
        i iVarC = c();
        i iVarC2 = oVar.c();
        if (iVarC != null ? !iVarC.equals(iVarC2) : iVarC2 != null) {
            return false;
        }
        Map<String, List<String>> mapE = e();
        Map<String, List<String>> mapE2 = oVar.e();
        return mapE != null ? mapE.equals(mapE2) : mapE2 == null;
    }

    @Generated
    public String f() {
        return this.f287453b;
    }

    @Generated
    public int hashCode() {
        int iD = d() + 59;
        String strF = f();
        int iHashCode = (iD * 59) + (strF == null ? 43 : strF.hashCode());
        i iVarC = c();
        int i10 = iHashCode * 59;
        int iHashCode2 = iVarC == null ? 43 : iVarC.hashCode();
        Map<String, List<String>> mapE = e();
        return ((i10 + iHashCode2) * 59) + (mapE != null ? mapE.hashCode() : 43);
    }

    @Generated
    public String toString() {
        return "HttpResponse(code=" + d() + ", message=" + f() + ", body=" + c() + ", headers=" + e() + ")";
    }
}
