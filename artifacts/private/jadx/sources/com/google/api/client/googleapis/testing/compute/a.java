package com.google.api.client.googleapis.testing.compute;

import com.facebook.AccessToken;
import com.google.api.client.googleapis.auth.oauth2.o;
import com.google.api.client.http.e0;
import com.google.api.client.http.f0;
import com.google.api.client.json.c;
import com.google.api.client.testing.http.d;
import com.google.api.client.testing.http.g;
import com.google.api.client.util.f;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@f
public class a extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f115535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f115536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final com.google.api.client.json.d f115537j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f115538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Integer f115539g;

    /* JADX INFO: renamed from: com.google.api.client.googleapis.testing.compute.a$a, reason: collision with other inner class name */
    class C1021a extends com.google.api.client.testing.http.f {
        C1021a(String str) {
            super(str);
        }

        @Override // com.google.api.client.testing.http.f, com.google.api.client.http.e0
        public f0 b() throws IOException {
            if (a.this.f115539g != null) {
                return new g().y(a.this.f115539g.intValue()).q("Token Fetch Error");
            }
            if (!"Google".equals(m("Metadata-Flavor"))) {
                throw new IOException("Metadata request header not found.");
            }
            com.google.api.client.json.b bVar = new com.google.api.client.json.b();
            bVar.j(a.f115537j);
            bVar.put("access_token", a.this.f115538f);
            bVar.put(AccessToken.f98369n, 3600000);
            bVar.put("token_type", hi.a.f285801f);
            return new g().u(c.f115763a).q(bVar.k());
        }
    }

    class b extends com.google.api.client.testing.http.f {
        b(String str) {
            super(str);
        }

        @Override // com.google.api.client.testing.http.f, com.google.api.client.http.e0
        public f0 b() {
            g gVar = new g();
            gVar.l("Metadata-Flavor", "Google");
            return gVar;
        }
    }

    static {
        String strB = o.b();
        f115535h = strB;
        f115536i = strB + "/computeMetadata/v1/instance/service-accounts/default/token";
        f115537j = new com.google.api.client.json.jackson2.a();
    }

    public a(String str) {
        this.f115538f = str;
    }

    @Override // com.google.api.client.testing.http.d, com.google.api.client.http.b0
    public e0 b(String str, String str2) throws IOException {
        if (str2.equals(f115536i)) {
            return new C1021a(str2);
        }
        return str2.equals(f115535h) ? new b(str2) : super.b(str, str2);
    }

    public void j(Integer num) {
        this.f115539g = num;
    }
}
