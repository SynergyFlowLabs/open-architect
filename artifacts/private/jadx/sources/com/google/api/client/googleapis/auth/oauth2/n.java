package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.t;
import com.google.api.client.util.h0;
import com.google.api.client.util.v;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class n extends t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @v("id_token")
    private String f115364i;

    @Override // com.google.api.client.auth.oauth2.t
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public n clone() {
        return (n) super.clone();
    }

    @com.google.api.client.util.f
    public final String B() {
        return this.f115364i;
    }

    @com.google.api.client.util.f
    public i C() throws IOException {
        return i.v(h(), B());
    }

    @Override // com.google.api.client.auth.oauth2.t
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public n p(String str, Object obj) {
        return (n) super.p(str, obj);
    }

    @Override // com.google.api.client.auth.oauth2.t
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public n u(String str) {
        return (n) super.u(str);
    }

    @Override // com.google.api.client.auth.oauth2.t
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public n v(Long l10) {
        return (n) super.v(l10);
    }

    @com.google.api.client.util.f
    public n G(String str) {
        this.f115364i = (String) h0.d(str);
        return this;
    }

    @Override // com.google.api.client.auth.oauth2.t
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public n w(String str) {
        return (n) super.w(str);
    }

    @Override // com.google.api.client.auth.oauth2.t
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public n x(String str) {
        return (n) super.x(str);
    }

    @Override // com.google.api.client.auth.oauth2.t
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public n z(String str) {
        return (n) super.z(str);
    }
}
