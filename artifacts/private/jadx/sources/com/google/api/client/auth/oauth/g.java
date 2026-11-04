package com.google.api.client.auth.oauth;

import com.google.api.client.util.n0;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.b0;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f115140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f115141b;

    @Override // com.google.api.client.auth.oauth.j
    public String a() {
        return "HMAC-SHA1";
    }

    @Override // com.google.api.client.auth.oauth.j
    public String b(String str) throws GeneralSecurityException {
        StringBuilder sb2 = new StringBuilder();
        String str2 = this.f115140a;
        if (str2 != null) {
            sb2.append(h.g(str2));
        }
        sb2.append(b0.f313279d);
        String str3 = this.f115141b;
        if (str3 != null) {
            sb2.append(h.g(str3));
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(n0.a(sb2.toString()), "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(secretKeySpec);
        return com.google.api.client.util.e.d(mac.doFinal(n0.a(str)));
    }
}
