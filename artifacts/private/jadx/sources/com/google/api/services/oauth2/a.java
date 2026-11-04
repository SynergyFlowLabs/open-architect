package com.google.api.services.oauth2;

import com.google.api.client.http.b0;
import com.google.api.client.http.u;
import com.google.api.client.http.w;
import com.google.api.client.http.x;
import com.google.api.client.util.h0;
import com.google.api.client.util.v;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class a extends com.google.api.client.googleapis.services.json.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f116300k = "https://www.googleapis.com/";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f116301l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f116302m = "batch/oauth2/v2";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f116303n = "https://www.googleapis.com/";

    /* JADX INFO: renamed from: com.google.api.services.oauth2.a$a, reason: collision with other inner class name */
    public static final class C1037a extends com.google.api.client.googleapis.services.json.a.AbstractC1019a {
        public C1037a(b0 b0Var, com.google.api.client.json.d dVar, w wVar) {
            super(b0Var, dVar, "https://www.googleapis.com/", "", wVar, false);
            l(a.f116302m);
        }

        @Override // com.google.api.client.googleapis.services.json.a.AbstractC1019a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        @Override // com.google.api.client.googleapis.services.json.a.AbstractC1019a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public C1037a k(String str) {
            return (C1037a) super.k(str);
        }

        @Override // com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public C1037a l(String str) {
            return (C1037a) super.l(str);
        }

        @Override // com.google.api.client.googleapis.services.json.a.AbstractC1019a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public C1037a m(com.google.api.client.googleapis.services.d dVar) {
            return (C1037a) super.m(dVar);
        }

        @Override // com.google.api.client.googleapis.services.json.a.AbstractC1019a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public C1037a n(w wVar) {
            return (C1037a) super.n(wVar);
        }

        public C1037a J(com.google.api.services.oauth2.c cVar) {
            return (C1037a) super.m(cVar);
        }

        @Override // com.google.api.client.googleapis.services.json.a.AbstractC1019a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public C1037a o(String str) {
            return (C1037a) super.o(str);
        }

        @Override // com.google.api.client.googleapis.services.json.a.AbstractC1019a, com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public C1037a p(String str) {
            return (C1037a) super.p(str);
        }

        @Override // com.google.api.client.googleapis.services.json.a.AbstractC1019a, com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public C1037a q(boolean z10) {
            return (C1037a) super.q(z10);
        }

        @Override // com.google.api.client.googleapis.services.json.a.AbstractC1019a, com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public C1037a r(boolean z10) {
            return (C1037a) super.r(z10);
        }

        @Override // com.google.api.client.googleapis.services.json.a.AbstractC1019a, com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public C1037a s(boolean z10) {
            return (C1037a) super.s(z10);
        }
    }

    public class b extends com.google.api.services.oauth2.b<t7.a> {
        private static final String H1 = "oauth2/v2/certs";

        protected b() {
            super(a.this, "GET", H1, null, t7.a.class);
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
        public b r0(String str) {
            return (b) super.r0(str);
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
        public b t0(String str) {
            return (b) super.t0(str);
        }

        @Override // com.google.api.client.googleapis.services.b
        public u j() throws IOException {
            return super.j();
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public b j0(String str, Object obj) {
            return (b) super.j0(str, obj);
        }

        @Override // com.google.api.client.googleapis.services.b
        public x v() throws IOException {
            return super.v();
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
        public b k0(String str) {
            return (b) super.k0(str);
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
        public b m0(String str) {
            return (b) super.m0(str);
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
        public b n0(String str) {
            return (b) super.n0(str);
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
        public b p0(String str) {
            return (b) super.p0(str);
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
        public b q0(Boolean bool) {
            return (b) super.q0(bool);
        }
    }

    public class c extends com.google.api.services.oauth2.b<t7.b> {

        /* JADX INFO: renamed from: h3, reason: collision with root package name */
        private static final String f116305h3 = "oauth2/v2/tokeninfo";

        @v("id_token")
        private String H1;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        @v("access_token")
        private String f116307p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        @v("token_handle")
        private String f116308p2;

        protected c() {
            super(a.this, "POST", f116305h3, null, t7.b.class);
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
        public c m0(String str) {
            return (c) super.m0(str);
        }

        public c B0(String str) {
            this.H1 = str;
            return this;
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
        public c n0(String str) {
            return (c) super.n0(str);
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
        public c p0(String str) {
            return (c) super.p0(str);
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
        public c q0(Boolean bool) {
            return (c) super.q0(bool);
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
        public c r0(String str) {
            return (c) super.r0(str);
        }

        public c G0(String str) {
            this.f116308p2 = str;
            return this;
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
        public c t0(String str) {
            return (c) super.t0(str);
        }

        public String u0() {
            return this.f116307p1;
        }

        public String v0() {
            return this.H1;
        }

        public String w0() {
            return this.f116308p2;
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public c j0(String str, Object obj) {
            return (c) super.j0(str, obj);
        }

        public c y0(String str) {
            this.f116307p1 = str;
            return this;
        }

        @Override // com.google.api.services.oauth2.b
        /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
        public c k0(String str) {
            return (c) super.k0(str);
        }
    }

    public class d {

        /* JADX INFO: renamed from: com.google.api.services.oauth2.a$d$a, reason: collision with other inner class name */
        public class C1038a extends com.google.api.services.oauth2.b<t7.c> {
            private static final String H1 = "oauth2/v2/userinfo";

            protected C1038a() {
                super(a.this, "GET", H1, null, t7.c.class);
            }

            @Override // com.google.api.services.oauth2.b
            /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
            public C1038a r0(String str) {
                return (C1038a) super.r0(str);
            }

            @Override // com.google.api.services.oauth2.b
            /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
            public C1038a t0(String str) {
                return (C1038a) super.t0(str);
            }

            @Override // com.google.api.client.googleapis.services.b
            public u j() throws IOException {
                return super.j();
            }

            @Override // com.google.api.services.oauth2.b
            /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public C1038a j0(String str, Object obj) {
                return (C1038a) super.j0(str, obj);
            }

            @Override // com.google.api.client.googleapis.services.b
            public x v() throws IOException {
                return super.v();
            }

            @Override // com.google.api.services.oauth2.b
            /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
            public C1038a k0(String str) {
                return (C1038a) super.k0(str);
            }

            @Override // com.google.api.services.oauth2.b
            /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
            public C1038a m0(String str) {
                return (C1038a) super.m0(str);
            }

            @Override // com.google.api.services.oauth2.b
            /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
            public C1038a n0(String str) {
                return (C1038a) super.n0(str);
            }

            @Override // com.google.api.services.oauth2.b
            /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
            public C1038a p0(String str) {
                return (C1038a) super.p0(str);
            }

            @Override // com.google.api.services.oauth2.b
            /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
            public C1038a q0(Boolean bool) {
                return (C1038a) super.q0(bool);
            }
        }

        public class b {

            /* JADX INFO: renamed from: com.google.api.services.oauth2.a$d$b$a, reason: collision with other inner class name */
            public class C1039a {

                /* JADX INFO: renamed from: com.google.api.services.oauth2.a$d$b$a$a, reason: collision with other inner class name */
                public class C1040a extends com.google.api.services.oauth2.b<t7.c> {
                    private static final String H1 = "userinfo/v2/me";

                    protected C1040a() {
                        super(a.this, "GET", H1, null, t7.c.class);
                    }

                    @Override // com.google.api.services.oauth2.b
                    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
                    public C1040a r0(String str) {
                        return (C1040a) super.r0(str);
                    }

                    @Override // com.google.api.services.oauth2.b
                    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
                    public C1040a t0(String str) {
                        return (C1040a) super.t0(str);
                    }

                    @Override // com.google.api.client.googleapis.services.b
                    public u j() throws IOException {
                        return super.j();
                    }

                    @Override // com.google.api.services.oauth2.b
                    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
                    public C1040a j0(String str, Object obj) {
                        return (C1040a) super.j0(str, obj);
                    }

                    @Override // com.google.api.client.googleapis.services.b
                    public x v() throws IOException {
                        return super.v();
                    }

                    @Override // com.google.api.services.oauth2.b
                    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
                    public C1040a k0(String str) {
                        return (C1040a) super.k0(str);
                    }

                    @Override // com.google.api.services.oauth2.b
                    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
                    public C1040a m0(String str) {
                        return (C1040a) super.m0(str);
                    }

                    @Override // com.google.api.services.oauth2.b
                    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
                    public C1040a n0(String str) {
                        return (C1040a) super.n0(str);
                    }

                    @Override // com.google.api.services.oauth2.b
                    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
                    public C1040a p0(String str) {
                        return (C1040a) super.p0(str);
                    }

                    @Override // com.google.api.services.oauth2.b
                    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
                    public C1040a q0(Boolean bool) {
                        return (C1040a) super.q0(bool);
                    }
                }

                public C1039a() {
                }

                public C1040a a() throws IOException {
                    C1040a c1040a = new C1040a();
                    a.this.l(c1040a);
                    return c1040a;
                }
            }

            public b() {
            }

            public C1039a a() {
                return new C1039a();
            }
        }

        public d() {
        }

        public C1038a a() throws IOException {
            C1038a c1038a = new C1038a();
            a.this.l(c1038a);
            return c1038a;
        }

        public b b() {
            return new b();
        }
    }

    static {
        h0.i(com.google.api.client.googleapis.a.f115271a.intValue() == 1 && com.google.api.client.googleapis.a.f115272b.intValue() >= 15, "You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.25.0 of the Google OAuth2 API library.", com.google.api.client.googleapis.a.f115274d);
    }

    public a(b0 b0Var, com.google.api.client.json.d dVar, w wVar) {
        this(new C1037a(b0Var, dVar, wVar));
    }

    @Override // com.google.api.client.googleapis.services.a
    protected void l(com.google.api.client.googleapis.services.b<?> bVar) throws IOException {
        super.l(bVar);
    }

    public b q() throws IOException {
        b bVar = new b();
        l(bVar);
        return bVar;
    }

    public c r() throws IOException {
        c cVar = new c();
        l(cVar);
        return cVar;
    }

    public d s() {
        return new d();
    }

    a(C1037a c1037a) {
        super(c1037a);
    }
}
