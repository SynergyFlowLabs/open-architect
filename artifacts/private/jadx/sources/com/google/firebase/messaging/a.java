package com.google.firebase.messaging;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements l8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f123394a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l8.a f123395b = new a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    private static final class C1173a implements com.google.firebase.encoders.e<com.google.firebase.messaging.reporting.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C1173a f123396a = new C1173a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123397b = com.google.firebase.encoders.d.a("projectNumber").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123398c = com.google.firebase.encoders.d.a("messageId").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123399d = com.google.firebase.encoders.d.a(com.segment.analytics.kotlin.core.platform.plugins.a.f266900h).b(com.google.firebase.encoders.proto.a.b().d(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123400e = com.google.firebase.encoders.d.a("messageType").b(com.google.firebase.encoders.proto.a.b().d(4).a()).a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123401f = com.google.firebase.encoders.d.a("sdkPlatform").b(com.google.firebase.encoders.proto.a.b().d(5).a()).a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123402g = com.google.firebase.encoders.d.a(com.google.firebase.remoteconfig.e0.b.f124460u2).b(com.google.firebase.encoders.proto.a.b().d(6).a()).a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123403h = com.google.firebase.encoders.d.a("collapseKey").b(com.google.firebase.encoders.proto.a.b().d(7).a()).a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123404i = com.google.firebase.encoders.d.a("priority").b(com.google.firebase.encoders.proto.a.b().d(8).a()).a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123405j = com.google.firebase.encoders.d.a("ttl").b(com.google.firebase.encoders.proto.a.b().d(9).a()).a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123406k = com.google.firebase.encoders.d.a("topic").b(com.google.firebase.encoders.proto.a.b().d(10).a()).a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123407l = com.google.firebase.encoders.d.a("bulkId").b(com.google.firebase.encoders.proto.a.b().d(11).a()).a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123408m = com.google.firebase.encoders.d.a(androidx.core.app.w.I0).b(com.google.firebase.encoders.proto.a.b().d(12).a()).a();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123409n = com.google.firebase.encoders.d.a("analyticsLabel").b(com.google.firebase.encoders.proto.a.b().d(13).a()).a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123410o = com.google.firebase.encoders.d.a("campaignId").b(com.google.firebase.encoders.proto.a.b().d(14).a()).a();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123411p = com.google.firebase.encoders.d.a("composerLabel").b(com.google.firebase.encoders.proto.a.b().d(15).a()).a();

        private C1173a() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.firebase.messaging.reporting.a aVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.g(f123397b, aVar.m());
            fVar.o(f123398c, aVar.i());
            fVar.o(f123399d, aVar.h());
            fVar.o(f123400e, aVar.j());
            fVar.o(f123401f, aVar.n());
            fVar.o(f123402g, aVar.k());
            fVar.o(f123403h, aVar.d());
            fVar.h(f123404i, aVar.l());
            fVar.h(f123405j, aVar.p());
            fVar.o(f123406k, aVar.o());
            fVar.g(f123407l, aVar.b());
            fVar.o(f123408m, aVar.g());
            fVar.o(f123409n, aVar.a());
            fVar.g(f123410o, aVar.c());
            fVar.o(f123411p, aVar.e());
        }
    }

    private static final class b implements com.google.firebase.encoders.e<com.google.firebase.messaging.reporting.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f123412a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123413b = com.google.firebase.encoders.d.a("messagingClientEvent").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        private b() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.firebase.messaging.reporting.b bVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f123413b, bVar.c());
        }
    }

    private static final class c implements com.google.firebase.encoders.e<r0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f123414a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f123415b = com.google.firebase.encoders.d.d("messagingClientEventExtension");

        private c() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(r0 r0Var, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f123415b, r0Var.c());
        }
    }

    private a() {
    }

    @Override // l8.a
    public void a(l8.b<?> bVar) {
        bVar.b(r0.class, c.f123414a);
        bVar.b(com.google.firebase.messaging.reporting.b.class, b.f123412a);
        bVar.b(com.google.firebase.messaging.reporting.a.class, C1173a.f123396a);
    }
}
