package com.google.api.client.auth.oauth;

import com.google.api.client.util.i0;
import com.google.api.client.util.n0;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PrivateKey f115155a;

    @Override // com.google.api.client.auth.oauth.j
    public String a() {
        return "RSA-SHA1";
    }

    @Override // com.google.api.client.auth.oauth.j
    public String b(String str) throws GeneralSecurityException {
        return com.google.api.client.util.e.d(i0.l(i0.f(), this.f115155a, n0.a(str)));
    }
}
