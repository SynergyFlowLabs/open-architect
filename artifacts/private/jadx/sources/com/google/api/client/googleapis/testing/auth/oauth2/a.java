package com.google.api.client.googleapis.testing.auth.oauth2;

import com.google.api.client.googleapis.auth.oauth2.h;
import com.google.api.client.http.b0;
import com.google.api.client.http.p;
import com.google.api.client.http.u;
import com.google.api.client.testing.http.d;
import com.google.api.client.testing.http.g;
import com.google.api.client.util.f;
import com.google.api.client.util.l;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@f
public class a extends h {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f115527z = "Bearer";
    private static final String A = "{\"access_token\": \"%s\", \"expires_in\":  %s, \"refresh_token\": \"%s\", \"token_type\": \"%s\"}";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f115524w = "access_xyz";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f115526y = "3600";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f115525x = "refresh123";
    private static final String B = String.format(A, f115524w, f115526y, f115525x, "Bearer");

    @f
    public static class b extends h.a {
        @Override // com.google.api.client.googleapis.auth.oauth2.h.a
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public a b() {
            if (j() == null) {
                r(new d.a().a());
            }
            if (c() == null) {
                k(new c());
            }
            if (e() == null) {
                m(new com.google.api.client.json.jackson2.a());
            }
            return new a(this);
        }

        @Override // com.google.api.client.googleapis.auth.oauth2.h.a, com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public b k(p pVar) {
            return (b) super.k(pVar);
        }

        @Override // com.google.api.client.googleapis.auth.oauth2.h.a, com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public b l(l lVar) {
            return (b) super.l(lVar);
        }

        @Override // com.google.api.client.googleapis.auth.oauth2.h.a, com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public b m(com.google.api.client.json.d dVar) {
            return (b) super.m(dVar);
        }

        @Override // com.google.api.client.googleapis.auth.oauth2.h.a, com.google.api.client.auth.oauth2.j.b
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public b r(b0 b0Var) {
            return (b) super.r(b0Var);
        }
    }

    @f
    private static class c implements p {
        private c() {
        }

        @Override // com.google.api.client.http.p
        public void a(u uVar) throws IOException {
        }
    }

    public a(b bVar) {
        super(bVar);
    }

    public static d R() {
        return new d.a().e(new com.google.api.client.testing.http.f().r(new g().u(com.google.api.client.json.c.f115763a).q(B))).a();
    }
}
