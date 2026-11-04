package com.google.api.client.googleapis.testing.auth.oauth2;

import com.facebook.AccessToken;
import com.google.api.client.googleapis.auth.oauth2.k;
import com.google.api.client.http.e0;
import com.google.api.client.http.f0;
import com.google.api.client.testing.http.d;
import com.google.api.client.testing.http.g;
import com.google.api.client.util.f;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import net.openid.appauth.q;

/* JADX INFO: loaded from: classes4.dex */
@f
public class b extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f115528j = "urn:ietf:params:oauth:grant-type:jwt-bearer";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final com.google.api.client.json.d f115529k = new com.google.api.client.json.jackson2.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f115530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Map<String, String> f115531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Map<String, String> f115532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Map<String, String> f115533i;

    class a extends com.google.api.client.testing.http.f {
        a(String str) {
            super(str);
        }

        @Override // com.google.api.client.testing.http.f, com.google.api.client.http.e0
        public f0 b() throws IOException {
            String str;
            Map<String, String> mapA = com.google.api.client.googleapis.testing.a.a(l());
            String str2 = mapA.get("client_id");
            if (str2 != null) {
                if (!b.this.f115532h.containsKey(str2)) {
                    throw new IOException("Client ID not found.");
                }
                String str3 = mapA.get("client_secret");
                String str4 = b.this.f115532h.get(str2);
                if (str3 == null || !str3.equals(str4)) {
                    throw new IOException("Client secret not found.");
                }
                String str5 = mapA.get(q.f333118c);
                if (!b.this.f115533i.containsKey(str5)) {
                    throw new IOException("Refresh Token not found.");
                }
                str = b.this.f115533i.get(str5);
            } else {
                if (!mapA.containsKey("grant_type")) {
                    throw new IOException("Unknown token type.");
                }
                if (!b.f115528j.equals(mapA.get("grant_type"))) {
                    throw new IOException("Unexpected Grant Type.");
                }
                q7.a aVarG = q7.a.g(b.f115529k, mapA.get("assertion"));
                String strS = aVarG.b().s();
                if (!b.this.f115531g.containsKey(strS)) {
                    throw new IOException("Service Account Email not found as issuer.");
                }
                str = b.this.f115531g.get(strS);
                String str6 = (String) aVarG.b().get("scope");
                if (str6 == null || str6.length() == 0) {
                    throw new IOException("Scopes not found.");
                }
            }
            com.google.api.client.json.b bVar = new com.google.api.client.json.b();
            bVar.j(b.f115529k);
            bVar.put("access_token", str);
            bVar.put(AccessToken.f98369n, 3600000);
            bVar.put("token_type", hi.a.f285801f);
            return new g().u(com.google.api.client.json.c.f115763a).q(bVar.k());
        }
    }

    public b() {
        this(k.f115348b);
    }

    @Override // com.google.api.client.testing.http.d, com.google.api.client.http.b0
    public e0 b(String str, String str2) throws IOException {
        return str2.equals(this.f115530f) ? new a(str2) : super.b(str, str2);
    }

    public void j(String str, String str2) {
        this.f115532h.put(str, str2);
    }

    public void k(String str, String str2) {
        this.f115533i.put(str, str2);
    }

    public void l(String str, String str2) {
        this.f115531g.put(str, str2);
    }

    public b(String str) {
        this.f115531g = new HashMap();
        this.f115532h = new HashMap();
        this.f115533i = new HashMap();
        this.f115530f = str;
    }
}
