package com.google.api.client.auth.oauth2;

import com.facebook.AccessToken;
import com.google.api.client.util.h0;
import com.google.api.client.util.v;

/* JADX INFO: loaded from: classes4.dex */
public class t extends com.google.api.client.json.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @v("access_token")
    private String f115248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @v("token_type")
    private String f115249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @v(AccessToken.f98369n)
    private Long f115250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @v(net.openid.appauth.q.f333118c)
    private String f115251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @v
    private String f115252h;

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public t clone() {
        return (t) super.clone();
    }

    public final String n() {
        return this.f115248d;
    }

    public final Long o() {
        return this.f115250f;
    }

    public final String p() {
        return this.f115251g;
    }

    public final String q() {
        return this.f115252h;
    }

    public final String s() {
        return this.f115249e;
    }

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public t p(String str, Object obj) {
        return (t) super.p(str, obj);
    }

    public t u(String str) {
        this.f115248d = (String) h0.d(str);
        return this;
    }

    public t v(Long l10) {
        this.f115250f = l10;
        return this;
    }

    public t w(String str) {
        this.f115251g = str;
        return this;
    }

    public t x(String str) {
        this.f115252h = str;
        return this;
    }

    public t z(String str) {
        this.f115249e = (String) h0.d(str);
        return this;
    }
}
