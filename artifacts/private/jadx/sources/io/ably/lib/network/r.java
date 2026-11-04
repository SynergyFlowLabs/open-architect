package io.ably.lib.network;

import java.util.List;
import lombok.Generated;

/* JADX INFO: loaded from: classes13.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f287463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f287464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f287465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f287466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<String> f287467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q f287468f;

    @Generated
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Generated
        private String f287469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Generated
        private int f287470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Generated
        private String f287471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Generated
        private String f287472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Generated
        private List<String> f287473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Generated
        private q f287474f;

        @Generated
        a() {
        }

        @Generated
        public a a(q qVar) {
            this.f287474f = qVar;
            return this;
        }

        @Generated
        public r b() {
            return new r(this.f287469a, this.f287470b, this.f287471c, this.f287472d, this.f287473e, this.f287474f);
        }

        @Generated
        public a c(String str) {
            this.f287469a = str;
            return this;
        }

        @Generated
        public a d(List<String> list) {
            this.f287473e = list;
            return this;
        }

        @Generated
        public a e(String str) {
            this.f287472d = str;
            return this;
        }

        @Generated
        public a f(int i10) {
            this.f287470b = i10;
            return this;
        }

        @Generated
        public a g(String str) {
            this.f287471c = str;
            return this;
        }

        @Generated
        public String toString() {
            return "ProxyConfig.ProxyConfigBuilder(host=" + this.f287469a + ", port=" + this.f287470b + ", username=" + this.f287471c + ", password=" + this.f287472d + ", nonProxyHosts=" + this.f287473e + ", authType=" + this.f287474f + ")";
        }
    }

    @Generated
    public r(String str, int i10, String str2, String str3, List<String> list, q qVar) {
        this.f287463a = str;
        this.f287464b = i10;
        this.f287465c = str2;
        this.f287466d = str3;
        this.f287467e = list;
        this.f287468f = qVar;
    }

    @Generated
    public static a a() {
        return new a();
    }

    @Generated
    protected boolean b(Object obj) {
        return obj instanceof r;
    }

    @Generated
    public q c() {
        return this.f287468f;
    }

    @Generated
    public String d() {
        return this.f287463a;
    }

    @Generated
    public List<String> e() {
        return this.f287467e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (r1.equals(r3) == false) goto L27;
     */
    @lombok.Generated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof io.ably.lib.network.r
            r2 = 0
            r4 = r2
            if (r1 != 0) goto Lb
            return r2
        Lb:
            r4 = 4
            io.ably.lib.network.r r6 = (io.ably.lib.network.r) r6
            boolean r1 = r6.b(r5)
            if (r1 != 0) goto L15
            return r2
        L15:
            int r1 = r5.g()
            int r3 = r6.g()
            r4 = 5
            if (r1 == r3) goto L21
            return r2
        L21:
            java.lang.String r1 = r5.d()
            r4 = 3
            java.lang.String r3 = r6.d()
            r4 = 0
            if (r1 != 0) goto L30
            if (r3 == 0) goto L37
            goto L36
        L30:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L37
        L36:
            return r2
        L37:
            r4 = 7
            java.lang.String r1 = r5.h()
            r4 = 1
            java.lang.String r3 = r6.h()
            r4 = 0
            if (r1 != 0) goto L48
            if (r3 == 0) goto L4f
            r4 = 5
            goto L4e
        L48:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4f
        L4e:
            return r2
        L4f:
            java.lang.String r1 = r5.f()
            java.lang.String r3 = r6.f()
            if (r1 != 0) goto L5d
            r4 = 2
            if (r3 == 0) goto L64
            goto L63
        L5d:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L64
        L63:
            return r2
        L64:
            java.util.List r1 = r5.e()
            java.util.List r3 = r6.e()
            r4 = 7
            if (r1 != 0) goto L73
            r4 = 1
            if (r3 == 0) goto L7c
            goto L7a
        L73:
            r4 = 4
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L7c
        L7a:
            r4 = 7
            return r2
        L7c:
            r4 = 3
            io.ably.lib.network.q r5 = r5.c()
            io.ably.lib.network.q r6 = r6.c()
            if (r5 != 0) goto L8a
            if (r6 == 0) goto L92
            goto L91
        L8a:
            boolean r5 = r5.equals(r6)
            r4 = 0
            if (r5 != 0) goto L92
        L91:
            return r2
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ably.lib.network.r.equals(java.lang.Object):boolean");
    }

    @Generated
    public String f() {
        return this.f287466d;
    }

    @Generated
    public int g() {
        return this.f287464b;
    }

    @Generated
    public String h() {
        return this.f287465c;
    }

    @Generated
    public int hashCode() {
        int iG = g() + 59;
        String strD = d();
        int iHashCode = (iG * 59) + (strD == null ? 43 : strD.hashCode());
        String strH = h();
        int iHashCode2 = (iHashCode * 59) + (strH == null ? 43 : strH.hashCode());
        String strF = f();
        int iHashCode3 = (iHashCode2 * 59) + (strF == null ? 43 : strF.hashCode());
        List<String> listE = e();
        int i10 = iHashCode3 * 59;
        int iHashCode4 = listE == null ? 43 : listE.hashCode();
        q qVarC = c();
        return ((i10 + iHashCode4) * 59) + (qVarC != null ? qVarC.hashCode() : 43);
    }

    @Generated
    public String toString() {
        return "ProxyConfig(host=" + d() + ", port=" + g() + ", username=" + h() + ", password=" + f() + ", nonProxyHosts=" + e() + ", authType=" + c() + ")";
    }
}
