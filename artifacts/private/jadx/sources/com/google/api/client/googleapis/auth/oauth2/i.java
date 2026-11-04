package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.util.v;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class i extends com.google.api.client.auth.openidconnect.a {

    @com.google.api.client.util.f
    public static class a extends com.google.api.client.auth.openidconnect.a.C1011a {

        @v("email_verified")
        private Object X;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @v("hd")
        private String f115343v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @v("email")
        private String f115344w;

        @Override // com.google.api.client.auth.openidconnect.a.C1011a
        /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
        public a C(String str) {
            return (a) super.C(str);
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a
        /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
        public a D(String str) {
            return (a) super.D(str);
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a
        /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
        public a c0(List<String> list) {
            return (a) super.c0(list);
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a
        /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
        public a d0(String str) {
            return (a) super.d0(str);
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a
        /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
        public a E(Long l10) {
            return (a) super.E(l10);
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a
        /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
        public a F(String str) {
            return (a) super.F(str);
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a
        /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
        public a G(String str) {
            return (a) super.G(str);
        }

        @Deprecated
        public a I0(String str) {
            return F(str);
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a, q7.b.C2464b
        /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a clone() {
            return (a) super.clone();
        }

        public String i0() {
            return this.f115344w;
        }

        public Boolean j0() {
            Object obj = this.X;
            if (obj == null) {
                return null;
            }
            return obj instanceof Boolean ? (Boolean) obj : Boolean.valueOf((String) obj);
        }

        public String k0() {
            return this.f115343v;
        }

        @Deprecated
        public String l0() {
            return K();
        }

        @Deprecated
        public String m0() {
            return v();
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a, q7.b.C2464b
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a p(String str, Object obj) {
            return (a) super.p(str, obj);
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public a Q(String str) {
            return (a) super.Q(str);
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a, q7.b.C2464b
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public a z(Object obj) {
            return (a) super.z(obj);
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public a U(Long l10) {
            return (a) super.U(l10);
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a
        /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
        public a V(String str) {
            return (a) super.V(str);
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a
        /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
        public a W(String str) {
            return (a) super.W(str);
        }

        public a u0(String str) {
            this.f115344w = str;
            return this;
        }

        public a v0(Boolean bool) {
            this.X = bool;
            return this;
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a
        /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
        public a A(Long l10) {
            return (a) super.A(l10);
        }

        public a x0(String str) {
            this.f115343v = str;
            return this;
        }

        @Override // com.google.api.client.auth.openidconnect.a.C1011a
        /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
        public a B(Long l10) {
            return (a) super.B(l10);
        }

        @Deprecated
        public a z0(String str) {
            return V(str);
        }
    }

    public i(q7.a.C2463a c2463a, a aVar, byte[] bArr, byte[] bArr2) {
        super(c2463a, aVar, bArr, bArr2);
    }

    public static i v(com.google.api.client.json.d dVar, String str) throws IOException {
        q7.a aVarD = q7.a.h(dVar).f(a.class).d(str);
        return new i(aVarD.a(), (a) aVarD.b(), aVarD.e(), aVarD.f());
    }

    @Override // com.google.api.client.auth.openidconnect.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public a b() {
        return (a) super.b();
    }

    public boolean w(j jVar) throws GeneralSecurityException, IOException {
        return jVar.o(this);
    }
}
