package com.google.android.datatransport.cct.internal;

import com.google.firebase.remoteconfig.e0;
import io.sentry.o7;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements l8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f103228a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l8.a f103229b = new b();

    private static final class a implements com.google.firebase.encoders.e<com.google.android.datatransport.cct.internal.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f103230a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103231b = com.google.firebase.encoders.d.d(e0.b.f124461v2);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103232c = com.google.firebase.encoders.d.d("model");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103233d = com.google.firebase.encoders.d.d("hardware");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103234e = com.google.firebase.encoders.d.d("device");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103235f = com.google.firebase.encoders.d.d("product");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103236g = com.google.firebase.encoders.d.d("osBuild");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103237h = com.google.firebase.encoders.d.d("manufacturer");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103238i = com.google.firebase.encoders.d.d(o7.b.f305967h);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103239j = com.google.firebase.encoders.d.d("locale");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103240k = com.google.firebase.encoders.d.d("country");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103241l = com.google.firebase.encoders.d.d("mccMnc");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103242m = com.google.firebase.encoders.d.d("applicationBuild");

        private a() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.cct.internal.a aVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f103231b, aVar.m());
            fVar.o(f103232c, aVar.j());
            fVar.o(f103233d, aVar.f());
            fVar.o(f103234e, aVar.d());
            fVar.o(f103235f, aVar.l());
            fVar.o(f103236g, aVar.k());
            fVar.o(f103237h, aVar.h());
            fVar.o(f103238i, aVar.e());
            fVar.o(f103239j, aVar.g());
            fVar.o(f103240k, aVar.c());
            fVar.o(f103241l, aVar.i());
            fVar.o(f103242m, aVar.b());
        }
    }

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.internal.b$b, reason: collision with other inner class name */
    private static final class C0938b implements com.google.firebase.encoders.e<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0938b f103243a = new C0938b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103244b = com.google.firebase.encoders.d.d("logRequest");

        private C0938b() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(n nVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f103244b, nVar.c());
        }
    }

    private static final class c implements com.google.firebase.encoders.e<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f103245a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103246b = com.google.firebase.encoders.d.d("clientType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103247c = com.google.firebase.encoders.d.d("androidClientInfo");

        private c() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(o oVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f103246b, oVar.c());
            fVar.o(f103247c, oVar.b());
        }
    }

    private static final class d implements com.google.firebase.encoders.e<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f103248a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103249b = com.google.firebase.encoders.d.d("privacyContext");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103250c = com.google.firebase.encoders.d.d("productIdOrigin");

        private d() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p pVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f103249b, pVar.b());
            fVar.o(f103250c, pVar.c());
        }
    }

    private static final class e implements com.google.firebase.encoders.e<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f103251a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103252b = com.google.firebase.encoders.d.d("clearBlob");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103253c = com.google.firebase.encoders.d.d("encryptedBlob");

        private e() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(q qVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f103252b, qVar.b());
            fVar.o(f103253c, qVar.c());
        }
    }

    private static final class f implements com.google.firebase.encoders.e<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f103254a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103255b = com.google.firebase.encoders.d.d("originAssociatedProductId");

        private f() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(r rVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f103255b, rVar.b());
        }
    }

    private static final class g implements com.google.firebase.encoders.e<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f103256a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103257b = com.google.firebase.encoders.d.d("prequest");

        private g() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s sVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f103257b, sVar.b());
        }
    }

    private static final class h implements com.google.firebase.encoders.e<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h f103258a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103259b = com.google.firebase.encoders.d.d("eventTimeMs");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103260c = com.google.firebase.encoders.d.d("eventCode");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103261d = com.google.firebase.encoders.d.d("complianceData");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103262e = com.google.firebase.encoders.d.d("eventUptimeMs");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103263f = com.google.firebase.encoders.d.d("sourceExtension");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103264g = com.google.firebase.encoders.d.d("sourceExtensionJsonProto3");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103265h = com.google.firebase.encoders.d.d("timezoneOffsetSeconds");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103266i = com.google.firebase.encoders.d.d("networkConnectionInfo");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103267j = com.google.firebase.encoders.d.d("experimentIds");

        private h() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.g(f103259b, tVar.d());
            fVar.o(f103260c, tVar.c());
            fVar.o(f103261d, tVar.b());
            fVar.g(f103262e, tVar.e());
            fVar.o(f103263f, tVar.h());
            fVar.o(f103264g, tVar.i());
            fVar.g(f103265h, tVar.j());
            fVar.o(f103266i, tVar.g());
            fVar.o(f103267j, tVar.f());
        }
    }

    private static final class i implements com.google.firebase.encoders.e<u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final i f103268a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103269b = com.google.firebase.encoders.d.d("requestTimeMs");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103270c = com.google.firebase.encoders.d.d("requestUptimeMs");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103271d = com.google.firebase.encoders.d.d("clientInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103272e = com.google.firebase.encoders.d.d("logSource");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103273f = com.google.firebase.encoders.d.d("logSourceName");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103274g = com.google.firebase.encoders.d.d("logEvent");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103275h = com.google.firebase.encoders.d.d("qosTier");

        private i() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.g(f103269b, uVar.g());
            fVar.g(f103270c, uVar.h());
            fVar.o(f103271d, uVar.b());
            fVar.o(f103272e, uVar.d());
            fVar.o(f103273f, uVar.e());
            fVar.o(f103274g, uVar.c());
            fVar.o(f103275h, uVar.f());
        }
    }

    private static final class j implements com.google.firebase.encoders.e<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j f103276a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103277b = com.google.firebase.encoders.d.d("networkType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103278c = com.google.firebase.encoders.d.d("mobileSubtype");

        private j() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f103277b, wVar.c());
            fVar.o(f103278c, wVar.b());
        }
    }

    private b() {
    }

    @Override // l8.a
    public void a(l8.b<?> bVar) {
        C0938b c0938b = C0938b.f103243a;
        bVar.b(n.class, c0938b);
        bVar.b(com.google.android.datatransport.cct.internal.d.class, c0938b);
        i iVar = i.f103268a;
        bVar.b(u.class, iVar);
        bVar.b(k.class, iVar);
        c cVar = c.f103245a;
        bVar.b(o.class, cVar);
        bVar.b(com.google.android.datatransport.cct.internal.e.class, cVar);
        a aVar = a.f103230a;
        bVar.b(com.google.android.datatransport.cct.internal.a.class, aVar);
        bVar.b(com.google.android.datatransport.cct.internal.c.class, aVar);
        h hVar = h.f103258a;
        bVar.b(t.class, hVar);
        bVar.b(com.google.android.datatransport.cct.internal.j.class, hVar);
        d dVar = d.f103248a;
        bVar.b(p.class, dVar);
        bVar.b(com.google.android.datatransport.cct.internal.f.class, dVar);
        g gVar = g.f103256a;
        bVar.b(s.class, gVar);
        bVar.b(com.google.android.datatransport.cct.internal.i.class, gVar);
        f fVar = f.f103254a;
        bVar.b(r.class, fVar);
        bVar.b(com.google.android.datatransport.cct.internal.h.class, fVar);
        j jVar = j.f103276a;
        bVar.b(w.class, jVar);
        bVar.b(m.class, jVar);
        e eVar = e.f103251a;
        bVar.b(q.class, eVar);
        bVar.b(com.google.android.datatransport.cct.internal.g.class, eVar);
    }
}
