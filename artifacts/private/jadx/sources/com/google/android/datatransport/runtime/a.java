package com.google.android.datatransport.runtime;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements l8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f103425a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l8.a f103426b = new a();

    /* JADX INFO: renamed from: com.google.android.datatransport.runtime.a$a, reason: collision with other inner class name */
    private static final class C0939a implements com.google.firebase.encoders.e<com.google.android.datatransport.runtime.firebase.transport.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0939a f103427a = new C0939a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103428b = com.google.firebase.encoders.d.a("window").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103429c = com.google.firebase.encoders.d.a("logSourceMetrics").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103430d = com.google.firebase.encoders.d.a("globalMetrics").b(com.google.firebase.encoders.proto.a.b().d(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103431e = com.google.firebase.encoders.d.a("appNamespace").b(com.google.firebase.encoders.proto.a.b().d(4).a()).a();

        private C0939a() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.runtime.firebase.transport.a aVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f103428b, aVar.g());
            fVar.o(f103429c, aVar.e());
            fVar.o(f103430d, aVar.d());
            fVar.o(f103431e, aVar.a());
        }
    }

    private static final class b implements com.google.firebase.encoders.e<com.google.android.datatransport.runtime.firebase.transport.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f103432a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103433b = com.google.firebase.encoders.d.a("storageMetrics").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        private b() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.runtime.firebase.transport.b bVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f103433b, bVar.c());
        }
    }

    private static final class c implements com.google.firebase.encoders.e<com.google.android.datatransport.runtime.firebase.transport.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f103434a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103435b = com.google.firebase.encoders.d.a("eventsDroppedCount").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103436c = com.google.firebase.encoders.d.a(io.sentry.clientreport.g.b.f305285a).b(com.google.firebase.encoders.proto.a.b().d(3).a()).a();

        private c() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.runtime.firebase.transport.c cVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.g(f103435b, cVar.b());
            fVar.o(f103436c, cVar.c());
        }
    }

    private static final class d implements com.google.firebase.encoders.e<com.google.android.datatransport.runtime.firebase.transport.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f103437a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103438b = com.google.firebase.encoders.d.a("logSource").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103439c = com.google.firebase.encoders.d.a("logEventDropped").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();

        private d() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.runtime.firebase.transport.d dVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f103438b, dVar.c());
            fVar.o(f103439c, dVar.b());
        }
    }

    private static final class e implements com.google.firebase.encoders.e<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f103440a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103441b = com.google.firebase.encoders.d.d("clientMetrics");

        private e() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(n nVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f103441b, nVar.c());
        }
    }

    private static final class f implements com.google.firebase.encoders.e<com.google.android.datatransport.runtime.firebase.transport.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f103442a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103443b = com.google.firebase.encoders.d.a("currentCacheSizeBytes").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103444c = com.google.firebase.encoders.d.a("maxCacheSizeBytes").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();

        private f() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.runtime.firebase.transport.e eVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.g(f103443b, eVar.a());
            fVar.g(f103444c, eVar.c());
        }
    }

    private static final class g implements com.google.firebase.encoders.e<com.google.android.datatransport.runtime.firebase.transport.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f103445a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103446b = com.google.firebase.encoders.d.a("startMs").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f103447c = com.google.firebase.encoders.d.a("endMs").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();

        private g() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.runtime.firebase.transport.f fVar, com.google.firebase.encoders.f fVar2) throws IOException {
            fVar2.g(f103446b, fVar.c());
            fVar2.g(f103447c, fVar.b());
        }
    }

    private a() {
    }

    @Override // l8.a
    public void a(l8.b<?> bVar) {
        bVar.b(n.class, e.f103440a);
        bVar.b(com.google.android.datatransport.runtime.firebase.transport.a.class, C0939a.f103427a);
        bVar.b(com.google.android.datatransport.runtime.firebase.transport.f.class, g.f103445a);
        bVar.b(com.google.android.datatransport.runtime.firebase.transport.d.class, d.f103437a);
        bVar.b(com.google.android.datatransport.runtime.firebase.transport.c.class, c.f103434a);
        bVar.b(com.google.android.datatransport.runtime.firebase.transport.b.class, b.f103432a);
        bVar.b(com.google.android.datatransport.runtime.firebase.transport.e.class, f.f103442a);
    }
}
