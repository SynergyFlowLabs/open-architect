package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.util.h0;
import com.google.api.client.util.v;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class d extends com.google.api.client.auth.oauth2.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @v("approval_prompt")
    private String f115318o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @v("access_type")
    private String f115319s;

    public d(String str, String str2, Collection<String> collection) {
        this(k.f115347a, str, str2, collection);
    }

    @Override // com.google.api.client.auth.oauth2.b, com.google.api.client.auth.oauth2.e, com.google.api.client.http.j
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public d clone() {
        return (d) super.clone();
    }

    public final String m0() {
        return this.f115319s;
    }

    public final String n0() {
        return this.f115318o;
    }

    @Override // com.google.api.client.auth.oauth2.b
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d p(String str, Object obj) {
        return (d) super.p(str, obj);
    }

    public d q0(String str) {
        this.f115319s = str;
        return this;
    }

    public d r0(String str) {
        this.f115318o = str;
        return this;
    }

    @Override // com.google.api.client.auth.oauth2.b
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public d Z(String str) {
        return (d) super.Z(str);
    }

    @Override // com.google.api.client.auth.oauth2.b
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public d a0(String str) {
        h0.d(str);
        return (d) super.a0(str);
    }

    @Override // com.google.api.client.auth.oauth2.b
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public d b0(Collection<String> collection) {
        return (d) super.b0(collection);
    }

    @Override // com.google.api.client.auth.oauth2.b
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public d c0(Collection<String> collection) {
        h0.a(collection.iterator().hasNext());
        return (d) super.c0(collection);
    }

    @Override // com.google.api.client.auth.oauth2.b
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public d d0(String str) {
        return (d) super.d0(str);
    }

    public d(String str, String str2, String str3, Collection<String> collection) {
        super(str, str2);
        a0(str3);
        c0(collection);
    }

    public d(g gVar, String str, Collection<String> collection) {
        this(gVar.n().o(), str, collection);
    }
}
