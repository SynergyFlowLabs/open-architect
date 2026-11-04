package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.http.b0;
import com.google.api.client.util.h0;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class j extends com.google.api.client.auth.openidconnect.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f115345f;

    @com.google.api.client.util.f
    public static class a extends com.google.api.client.auth.openidconnect.c.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        l f115346e;

        public a(b0 b0Var, com.google.api.client.json.d dVar) {
            this(new l(b0Var, dVar));
        }

        @Override // com.google.api.client.auth.openidconnect.c.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public j a() {
            return new j(this);
        }

        public final com.google.api.client.json.d m() {
            return this.f115346e.d();
        }

        public final l n() {
            return this.f115346e;
        }

        @Deprecated
        public final String o() {
            return this.f115346e.e();
        }

        public final b0 p() {
            return this.f115346e.g();
        }

        @Override // com.google.api.client.auth.openidconnect.c.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a g(long j10) {
            return (a) super.g(j10);
        }

        @Override // com.google.api.client.auth.openidconnect.c.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a h(Collection<String> collection) {
            return (a) super.h(collection);
        }

        @Override // com.google.api.client.auth.openidconnect.c.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a i(com.google.api.client.util.l lVar) {
            return (a) super.i(lVar);
        }

        @Override // com.google.api.client.auth.openidconnect.c.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public a j(String str) {
            return (a) super.j(str);
        }

        @Override // com.google.api.client.auth.openidconnect.c.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public a k(Collection<String> collection) {
            return (a) super.k(collection);
        }

        @Deprecated
        public a v(String str) {
            this.f115346e = new l.a(p(), m()).g(str).f(this.f115346e.b()).a();
            return this;
        }

        public a(l lVar) {
            this.f115346e = (l) h0.d(lVar);
            k(Arrays.asList("accounts.google.com", "https://accounts.google.com"));
        }
    }

    public j(b0 b0Var, com.google.api.client.json.d dVar) {
        this(new a(b0Var, dVar));
    }

    @Deprecated
    public final long g() {
        return this.f115345f.c();
    }

    public final com.google.api.client.json.d h() {
        return this.f115345f.d();
    }

    @Deprecated
    public final String i() {
        return this.f115345f.e();
    }

    @Deprecated
    public final List<PublicKey> j() throws GeneralSecurityException, IOException {
        return this.f115345f.f();
    }

    public final l k() {
        return this.f115345f;
    }

    public final b0 l() {
        return this.f115345f.g();
    }

    @Deprecated
    public j m() throws GeneralSecurityException, IOException {
        this.f115345f.h();
        return this;
    }

    public i n(String str) throws GeneralSecurityException, IOException {
        i iVarV = i.v(h(), str);
        if (o(iVarV)) {
            return iVarV;
        }
        return null;
    }

    public boolean o(i iVar) throws GeneralSecurityException, IOException {
        if (!super.f(iVar)) {
            return false;
        }
        Iterator<PublicKey> it = this.f115345f.f().iterator();
        while (it.hasNext()) {
            if (iVar.l(it.next())) {
                return true;
            }
        }
        return false;
    }

    public j(l lVar) {
        this(new a(lVar));
    }

    protected j(a aVar) {
        super(aVar);
        this.f115345f = aVar.f115346e;
    }
}
