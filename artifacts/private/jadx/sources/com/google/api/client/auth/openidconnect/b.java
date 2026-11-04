package com.google.api.client.auth.openidconnect;

import com.google.api.client.auth.oauth2.s;
import com.google.api.client.auth.oauth2.t;
import com.google.api.client.util.f;
import com.google.api.client.util.h0;
import com.google.api.client.util.v;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@f
public class b extends t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @v("id_token")
    private String f115261i;

    public static b B(s sVar) throws IOException {
        return (b) sVar.h().r(b.class);
    }

    @Override // com.google.api.client.auth.oauth2.t
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return (b) super.clone();
    }

    public final String C() {
        return this.f115261i;
    }

    public a D() throws IOException {
        return a.n(h(), this.f115261i);
    }

    @Override // com.google.api.client.auth.oauth2.t
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b p(String str, Object obj) {
        return (b) super.p(str, obj);
    }

    @Override // com.google.api.client.auth.oauth2.t
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public b u(String str) {
        super.u(str);
        return this;
    }

    @Override // com.google.api.client.auth.oauth2.t
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b v(Long l10) {
        super.v(l10);
        return this;
    }

    public b H(String str) {
        this.f115261i = (String) h0.d(str);
        return this;
    }

    @Override // com.google.api.client.auth.oauth2.t
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public b w(String str) {
        super.w(str);
        return this;
    }

    @Override // com.google.api.client.auth.oauth2.t
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public b x(String str) {
        super.x(str);
        return this;
    }

    @Override // com.google.api.client.auth.oauth2.t
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public b z(String str) {
        super.z(str);
        return this;
    }
}
