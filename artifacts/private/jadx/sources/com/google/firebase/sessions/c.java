package com.google.firebase.sessions;

import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements l8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f124924a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l8.a f124925b = new c();

    private static final class a implements com.google.firebase.encoders.e<com.google.firebase.sessions.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f124926a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124927b = com.google.firebase.encoders.d.d(com.google.firebase.remoteconfig.e0.b.f124460u2);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124928c = com.google.firebase.encoders.d.d("versionName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124929d = com.google.firebase.encoders.d.d("appBuildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124930e = com.google.firebase.encoders.d.d("deviceManufacturer");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124931f = com.google.firebase.encoders.d.d("currentProcessDetails");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124932g = com.google.firebase.encoders.d.d("appProcessDetails");

        private a() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.firebase.sessions.a aVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f124927b, aVar.m());
            fVar.o(f124928c, aVar.n());
            fVar.o(f124929d, aVar.i());
            fVar.o(f124930e, aVar.l());
            fVar.o(f124931f, aVar.k());
            fVar.o(f124932g, aVar.j());
        }
    }

    private static final class b implements com.google.firebase.encoders.e<com.google.firebase.sessions.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f124933a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124934b = com.google.firebase.encoders.d.d("appId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124935c = com.google.firebase.encoders.d.d("deviceModel");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124936d = com.google.firebase.encoders.d.d("sessionSdkVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124937e = com.google.firebase.encoders.d.d("osVersion");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124938f = com.google.firebase.encoders.d.d("logEnvironment");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124939g = com.google.firebase.encoders.d.d("androidAppInfo");

        private b() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.firebase.sessions.b bVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f124934b, bVar.j());
            fVar.o(f124935c, bVar.k());
            fVar.o(f124936d, bVar.n());
            fVar.o(f124937e, bVar.m());
            fVar.o(f124938f, bVar.l());
            fVar.o(f124939g, bVar.i());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.c$c, reason: collision with other inner class name */
    private static final class C1190c implements com.google.firebase.encoders.e<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C1190c f124940a = new C1190c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124941b = com.google.firebase.encoders.d.d("performance");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124942c = com.google.firebase.encoders.d.d("crashlytics");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124943d = com.google.firebase.encoders.d.d("sessionSamplingRate");

        private C1190c() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g gVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f124941b, gVar.g());
            fVar.o(f124942c, gVar.f());
            fVar.j(f124943d, gVar.h());
        }
    }

    private static final class d implements com.google.firebase.encoders.e<k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f124944a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124945b = com.google.firebase.encoders.d.d("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124946c = com.google.firebase.encoders.d.d("pid");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124947d = com.google.firebase.encoders.d.d("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124948e = com.google.firebase.encoders.d.d("defaultProcess");

        private d() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(k0 k0Var, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f124945b, k0Var.i());
            fVar.h(f124946c, k0Var.h());
            fVar.h(f124947d, k0Var.g());
            fVar.f(f124948e, k0Var.j());
        }
    }

    private static final class e implements com.google.firebase.encoders.e<q0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f124949a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124950b = com.google.firebase.encoders.d.d("eventType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124951c = com.google.firebase.encoders.d.d("sessionData");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124952d = com.google.firebase.encoders.d.d("applicationInfo");

        private e() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(q0 q0Var, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f124950b, q0Var.g());
            fVar.o(f124951c, q0Var.h());
            fVar.o(f124952d, q0Var.f());
        }
    }

    private static final class f implements com.google.firebase.encoders.e<x0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f124953a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124954b = com.google.firebase.encoders.d.d(UserEntry.sessionId);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124955c = com.google.firebase.encoders.d.d("firstSessionId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124956d = com.google.firebase.encoders.d.d("sessionIndex");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124957e = com.google.firebase.encoders.d.d("eventTimestampUs");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124958f = com.google.firebase.encoders.d.d("dataCollectionStatus");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124959g = com.google.firebase.encoders.d.d("firebaseInstallationId");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124960h = com.google.firebase.encoders.d.d("firebaseAuthenticationToken");

        private f() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(x0 x0Var, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f124954b, x0Var.o());
            fVar.o(f124955c, x0Var.n());
            fVar.h(f124956d, x0Var.p());
            fVar.g(f124957e, x0Var.k());
            fVar.o(f124958f, x0Var.j());
            fVar.o(f124959g, x0Var.m());
            fVar.o(f124960h, x0Var.l());
        }
    }

    private c() {
    }

    @Override // l8.a
    public void a(l8.b<?> bVar) {
        bVar.b(q0.class, e.f124949a);
        bVar.b(x0.class, f.f124953a);
        bVar.b(g.class, C1190c.f124940a);
        bVar.b(com.google.firebase.sessions.b.class, b.f124933a);
        bVar.b(com.google.firebase.sessions.a.class, a.f124926a);
        bVar.b(k0.class, d.f124944a);
    }
}
