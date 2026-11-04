package com.google.api.services.oauth2;

import com.google.api.client.http.q;
import com.google.api.client.util.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b<T> extends com.google.api.client.googleapis.services.json.b<T> {

    @v(hi.c.C1916c.f285818g)
    private String X;

    @v
    private Boolean Y;

    @v
    private String Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @v
    private String f116314p0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @v
    private String f116315t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @v
    private String f116316v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @v
    private String f116317w;

    public b(a aVar, String str, String str2, Object obj, Class<T> cls) {
        super(aVar, str, str2, obj, cls);
    }

    @Override // com.google.api.client.googleapis.services.json.b, com.google.api.client.googleapis.services.b
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final a w() {
        return (a) super.w();
    }

    public String c0() {
        return this.f116315t;
    }

    public String d0() {
        return this.f116316v;
    }

    public String e0() {
        return this.f116317w;
    }

    public String f0() {
        return this.X;
    }

    public Boolean g0() {
        return this.Y;
    }

    public String h0() {
        return this.Z;
    }

    public String i0() {
        return this.f116314p0;
    }

    @Override // com.google.api.client.googleapis.services.json.b, com.google.api.client.googleapis.services.b, com.google.api.client.util.s
    public b<T> j0(String str, Object obj) {
        return (b) super.j0(str, obj);
    }

    public b<T> k0(String str) {
        this.f116315t = str;
        return this;
    }

    @Override // com.google.api.client.googleapis.services.json.b
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public b<T> P(boolean z10) {
        return (b) super.P(z10);
    }

    public b<T> m0(String str) {
        this.f116316v = str;
        return this;
    }

    public b<T> n0(String str) {
        this.f116317w = str;
        return this;
    }

    public b<T> p0(String str) {
        this.X = str;
        return this;
    }

    public b<T> q0(Boolean bool) {
        this.Y = bool;
        return this;
    }

    public b<T> r0(String str) {
        this.Z = str;
        return this;
    }

    @Override // com.google.api.client.googleapis.services.json.b
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public b<T> Q(q qVar) {
        return (b) super.Q(qVar);
    }

    public b<T> t0(String str) {
        this.f116314p0 = str;
        return this;
    }
}
