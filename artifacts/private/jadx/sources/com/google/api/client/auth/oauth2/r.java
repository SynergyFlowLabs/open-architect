package com.google.api.client.auth.oauth2;

import com.google.api.client.util.h0;
import com.google.api.client.util.v;

/* JADX INFO: loaded from: classes4.dex */
public class r extends com.google.api.client.json.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @v
    private String f115235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @v("error_description")
    private String f115236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @v(net.openid.appauth.e.f332899i)
    private String f115237f;

    @Override // com.google.api.client.json.b
    public r clone() {
        return (r) super.clone();
    }

    public final String n() {
        return this.f115235d;
    }

    public final String o() {
        return this.f115236e;
    }

    public final String p() {
        return this.f115237f;
    }

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public r p(String str, Object obj) {
        return (r) super.p(str, obj);
    }

    public r s(String str) {
        this.f115235d = (String) h0.d(str);
        return this;
    }

    public r t(String str) {
        this.f115236e = str;
        return this;
    }

    public r u(String str) {
        this.f115237f = str;
        return this;
    }
}
