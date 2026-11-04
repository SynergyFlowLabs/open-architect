package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.util.h0;
import com.google.api.client.util.v;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends com.google.api.client.json.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @v
    private a f115321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @v
    private a f115322e;

    public static final class a extends com.google.api.client.json.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @v("client_id")
        private String f115323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @v("client_secret")
        private String f115324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @v("redirect_uris")
        private List<String> f115325f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @v("auth_uri")
        private String f115326g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @v("token_uri")
        private String f115327h;

        @Override // com.google.api.client.json.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a clone() {
            return (a) super.clone();
        }

        public String n() {
            return this.f115326g;
        }

        public String o() {
            return this.f115323d;
        }

        public String p() {
            return this.f115324e;
        }

        public List<String> q() {
            return this.f115325f;
        }

        public String s() {
            return this.f115327h;
        }

        @Override // com.google.api.client.json.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public a p(String str, Object obj) {
            return (a) super.p(str, obj);
        }

        public a u(String str) {
            this.f115326g = str;
            return this;
        }

        public a v(String str) {
            this.f115323d = str;
            return this;
        }

        public a w(String str) {
            this.f115324e = str;
            return this;
        }

        public a x(List<String> list) {
            this.f115325f = list;
            return this;
        }

        public a z(String str) {
            this.f115327h = str;
            return this;
        }
    }

    public static g q(com.google.api.client.json.d dVar, Reader reader) throws IOException {
        return (g) dVar.j(reader, g.class);
    }

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public g clone() {
        return (g) super.clone();
    }

    public a n() {
        h0.a((this.f115322e == null) != (this.f115321d == null));
        a aVar = this.f115322e;
        return aVar == null ? this.f115321d : aVar;
    }

    public a o() {
        return this.f115321d;
    }

    public a p() {
        return this.f115322e;
    }

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public g p(String str, Object obj) {
        return (g) super.p(str, obj);
    }

    public g t(a aVar) {
        this.f115321d = aVar;
        return this;
    }

    public g u(a aVar) {
        this.f115322e = aVar;
        return this;
    }
}
