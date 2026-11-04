package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.util.h0;
import com.google.api.client.util.v;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class f extends com.google.api.client.auth.oauth2.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @v("approval_prompt")
    private String f115320o;

    public f(String str, String str2, Collection<String> collection) {
        super(k.f115347a, str);
        a0(str2);
        c0(collection);
    }

    @Override // com.google.api.client.auth.oauth2.g, com.google.api.client.auth.oauth2.e, com.google.api.client.http.j
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public f clone() {
        return (f) super.clone();
    }

    public final String m0() {
        return this.f115320o;
    }

    @Override // com.google.api.client.auth.oauth2.g
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public f p(String str, Object obj) {
        return (f) super.p(str, obj);
    }

    public f p0(String str) {
        this.f115320o = str;
        return this;
    }

    @Override // com.google.api.client.auth.oauth2.g
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public f Z(String str) {
        return (f) super.Z(str);
    }

    @Override // com.google.api.client.auth.oauth2.g
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public f a0(String str) {
        return (f) super.a0(str);
    }

    @Override // com.google.api.client.auth.oauth2.g
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public f b0(Collection<String> collection) {
        return (f) super.b0(collection);
    }

    @Override // com.google.api.client.auth.oauth2.g
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public f c0(Collection<String> collection) {
        h0.a(collection.iterator().hasNext());
        return (f) super.c0(collection);
    }

    @Override // com.google.api.client.auth.oauth2.g
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public f d0(String str) {
        return (f) super.d0(str);
    }

    public f(g gVar, String str, Collection<String> collection) {
        this(gVar.n().o(), str, collection);
    }
}
