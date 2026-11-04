package io.ably.lib.network;

import javax.net.ssl.SSLSocketFactory;
import lombok.Generated;

/* JADX INFO: loaded from: classes13.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f287475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f287476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f287477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SSLSocketFactory f287478d;

    @Generated
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Generated
        private r f287479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Generated
        private boolean f287480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Generated
        private String f287481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Generated
        private SSLSocketFactory f287482d;

        @Generated
        a() {
        }

        @Generated
        public u a() {
            return new u(this.f287479a, this.f287480b, this.f287481c, this.f287482d);
        }

        @Generated
        public a b(String str) {
            this.f287481c = str;
            return this;
        }

        @Generated
        public a c(r rVar) {
            this.f287479a = rVar;
            return this;
        }

        @Generated
        public a d(SSLSocketFactory sSLSocketFactory) {
            this.f287482d = sSLSocketFactory;
            return this;
        }

        @Generated
        public a e(boolean z10) {
            this.f287480b = z10;
            return this;
        }

        @Generated
        public String toString() {
            return "WebSocketEngineConfig.WebSocketEngineConfigBuilder(proxy=" + this.f287479a + ", tls=" + this.f287480b + ", host=" + this.f287481c + ", sslSocketFactory=" + this.f287482d + ")";
        }
    }

    @Generated
    public u(r rVar, boolean z10, String str, SSLSocketFactory sSLSocketFactory) {
        this.f287475a = rVar;
        this.f287476b = z10;
        this.f287477c = str;
        this.f287478d = sSLSocketFactory;
    }

    @Generated
    public static a a() {
        return new a();
    }

    @Generated
    protected boolean b(Object obj) {
        return obj instanceof u;
    }

    @Generated
    public String c() {
        return this.f287477c;
    }

    @Generated
    public r d() {
        return this.f287475a;
    }

    @Generated
    public SSLSocketFactory e() {
        return this.f287478d;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (uVar.b(this) && f() == uVar.f()) {
            r rVarD = d();
            r rVarD2 = uVar.d();
            if (rVarD != null ? !rVarD.equals(rVarD2) : rVarD2 != null) {
                return false;
            }
            String strC = c();
            String strC2 = uVar.c();
            if (strC != null ? !strC.equals(strC2) : strC2 != null) {
                return false;
            }
            SSLSocketFactory sSLSocketFactoryE = e();
            SSLSocketFactory sSLSocketFactoryE2 = uVar.e();
            return sSLSocketFactoryE != null ? sSLSocketFactoryE.equals(sSLSocketFactoryE2) : sSLSocketFactoryE2 == null;
        }
        return false;
    }

    @Generated
    public boolean f() {
        return this.f287476b;
    }

    @Generated
    public int hashCode() {
        int i10 = f() ? 79 : 97;
        r rVarD = d();
        int iHashCode = 43;
        int iHashCode2 = ((i10 + 59) * 59) + (rVarD == null ? 43 : rVarD.hashCode());
        String strC = c();
        int i11 = iHashCode2 * 59;
        int iHashCode3 = strC == null ? 43 : strC.hashCode();
        SSLSocketFactory sSLSocketFactoryE = e();
        int i12 = (i11 + iHashCode3) * 59;
        if (sSLSocketFactoryE != null) {
            iHashCode = sSLSocketFactoryE.hashCode();
        }
        return i12 + iHashCode;
    }

    @Generated
    public String toString() {
        return "WebSocketEngineConfig(proxy=" + d() + ", tls=" + f() + ", host=" + c() + ", sslSocketFactory=" + e() + ")";
    }
}
