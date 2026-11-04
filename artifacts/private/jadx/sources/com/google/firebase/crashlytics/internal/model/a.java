package com.google.firebase.crashlytics.internal.model;

import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.o7;
import io.sentry.protocol.DebugImage;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements l8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f121345a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l8.a f121346b = new a();

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.a$a, reason: collision with other inner class name */
    private static final class C1127a implements com.google.firebase.encoders.e<f0.a.AbstractC1129a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C1127a f121347a = new C1127a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121348b = com.google.firebase.encoders.d.d(DebugImage.b.f306093i);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121349c = com.google.firebase.encoders.d.d("libraryName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121350d = com.google.firebase.encoders.d.d("buildId");

        private C1127a() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.a.AbstractC1129a abstractC1129a, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121348b, abstractC1129a.b());
            fVar.o(f121349c, abstractC1129a.d());
            fVar.o(f121350d, abstractC1129a.c());
        }
    }

    private static final class b implements com.google.firebase.encoders.e<f0.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f121351a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121352b = com.google.firebase.encoders.d.d("pid");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121353c = com.google.firebase.encoders.d.d("processName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121354d = com.google.firebase.encoders.d.d("reasonCode");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121355e = com.google.firebase.encoders.d.d("importance");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121356f = com.google.firebase.encoders.d.d("pss");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121357g = com.google.firebase.encoders.d.d("rss");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121358h = com.google.firebase.encoders.d.d("timestamp");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121359i = com.google.firebase.encoders.d.d("traceFile");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121360j = com.google.firebase.encoders.d.d("buildIdMappingForArch");

        private b() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.a aVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.h(f121352b, aVar.d());
            fVar.o(f121353c, aVar.e());
            fVar.h(f121354d, aVar.g());
            fVar.h(f121355e, aVar.c());
            fVar.g(f121356f, aVar.f());
            fVar.g(f121357g, aVar.h());
            fVar.g(f121358h, aVar.i());
            fVar.o(f121359i, aVar.j());
            fVar.o(f121360j, aVar.b());
        }
    }

    private static final class c implements com.google.firebase.encoders.e<f0.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f121361a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121362b = com.google.firebase.encoders.d.d("key");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121363c = com.google.firebase.encoders.d.d("value");

        private c() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.d dVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121362b, dVar.b());
            fVar.o(f121363c, dVar.c());
        }
    }

    private static final class d implements com.google.firebase.encoders.e<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f121364a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121365b = com.google.firebase.encoders.d.d(com.google.firebase.remoteconfig.e0.b.f124461v2);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121366c = com.google.firebase.encoders.d.d("gmpAppId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121367d = com.google.firebase.encoders.d.d("platform");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121368e = com.google.firebase.encoders.d.d("installationUuid");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121369f = com.google.firebase.encoders.d.d("firebaseInstallationId");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121370g = com.google.firebase.encoders.d.d("firebaseAuthenticationToken");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121371h = com.google.firebase.encoders.d.d("appQualitySessionId");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121372i = com.google.firebase.encoders.d.d("buildVersion");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121373j = com.google.firebase.encoders.d.d("displayVersion");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121374k = com.google.firebase.encoders.d.d(io.sentry.cache.f.f305178k);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121375l = com.google.firebase.encoders.d.d("ndkPayload");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121376m = com.google.firebase.encoders.d.d("appExitInfo");

        private d() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0 f0Var, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121365b, f0Var.m());
            fVar.o(f121366c, f0Var.i());
            fVar.h(f121367d, f0Var.l());
            fVar.o(f121368e, f0Var.j());
            fVar.o(f121369f, f0Var.h());
            fVar.o(f121370g, f0Var.g());
            fVar.o(f121371h, f0Var.d());
            fVar.o(f121372i, f0Var.e());
            fVar.o(f121373j, f0Var.f());
            fVar.o(f121374k, f0Var.n());
            fVar.o(f121375l, f0Var.k());
            fVar.o(f121376m, f0Var.c());
        }
    }

    private static final class e implements com.google.firebase.encoders.e<f0.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f121377a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121378b = com.google.firebase.encoders.d.d("files");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121379c = com.google.firebase.encoders.d.d("orgId");

        private e() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.e eVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121378b, eVar.b());
            fVar.o(f121379c, eVar.c());
        }
    }

    private static final class f implements com.google.firebase.encoders.e<f0.e.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f121380a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121381b = com.google.firebase.encoders.d.d("filename");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121382c = com.google.firebase.encoders.d.d("contents");

        private f() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.e.b bVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121381b, bVar.c());
            fVar.o(f121382c, bVar.b());
        }
    }

    private static final class g implements com.google.firebase.encoders.e<f0.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f121383a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121384b = com.google.firebase.encoders.d.d("identifier");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121385c = com.google.firebase.encoders.d.d("version");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121386d = com.google.firebase.encoders.d.d("displayVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121387e = com.google.firebase.encoders.d.d("organization");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121388f = com.google.firebase.encoders.d.d("installationUuid");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121389g = com.google.firebase.encoders.d.d("developmentPlatform");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121390h = com.google.firebase.encoders.d.d("developmentPlatformVersion");

        private g() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.a aVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121384b, aVar.e());
            fVar.o(f121385c, aVar.h());
            fVar.o(f121386d, aVar.d());
            fVar.o(f121387e, aVar.g());
            fVar.o(f121388f, aVar.f());
            fVar.o(f121389g, aVar.b());
            fVar.o(f121390h, aVar.c());
        }
    }

    private static final class h implements com.google.firebase.encoders.e<f0.f.a.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h f121391a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121392b = com.google.firebase.encoders.d.d("clsId");

        private h() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.a.b bVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121392b, bVar.b());
        }
    }

    private static final class i implements com.google.firebase.encoders.e<f0.f.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final i f121393a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121394b = com.google.firebase.encoders.d.d(DebugImage.b.f306093i);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121395c = com.google.firebase.encoders.d.d("model");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121396d = com.google.firebase.encoders.d.d("cores");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121397e = com.google.firebase.encoders.d.d("ram");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121398f = com.google.firebase.encoders.d.d("diskSpace");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121399g = com.google.firebase.encoders.d.d(io.sentry.protocol.e.c.f306224l);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121400h = com.google.firebase.encoders.d.d("state");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121401i = com.google.firebase.encoders.d.d("manufacturer");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121402j = com.google.firebase.encoders.d.d("modelClass");

        private i() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.c cVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.h(f121394b, cVar.b());
            fVar.o(f121395c, cVar.f());
            fVar.h(f121396d, cVar.c());
            fVar.g(f121397e, cVar.h());
            fVar.g(f121398f, cVar.d());
            fVar.f(f121399g, cVar.j());
            fVar.h(f121400h, cVar.i());
            fVar.o(f121401i, cVar.e());
            fVar.o(f121402j, cVar.g());
        }
    }

    private static final class j implements com.google.firebase.encoders.e<f0.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j f121403a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121404b = com.google.firebase.encoders.d.d("generator");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121405c = com.google.firebase.encoders.d.d("identifier");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121406d = com.google.firebase.encoders.d.d("appQualitySessionId");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121407e = com.google.firebase.encoders.d.d("startedAt");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121408f = com.google.firebase.encoders.d.d("endedAt");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121409g = com.google.firebase.encoders.d.d(io.sentry.protocol.b0.b.f306150e);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121410h = com.google.firebase.encoders.d.d("app");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121411i = com.google.firebase.encoders.d.d("user");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121412j = com.google.firebase.encoders.d.d("os");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121413k = com.google.firebase.encoders.d.d("device");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121414l = com.google.firebase.encoders.d.d(EventEntry.tableName);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121415m = com.google.firebase.encoders.d.d("generatorType");

        private j() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f fVar, com.google.firebase.encoders.f fVar2) throws IOException {
            fVar2.o(f121404b, fVar.g());
            fVar2.o(f121405c, fVar.j());
            fVar2.o(f121406d, fVar.c());
            fVar2.g(f121407e, fVar.l());
            fVar2.o(f121408f, fVar.e());
            fVar2.f(f121409g, fVar.n());
            fVar2.o(f121410h, fVar.b());
            fVar2.o(f121411i, fVar.m());
            fVar2.o(f121412j, fVar.k());
            fVar2.o(f121413k, fVar.d());
            fVar2.o(f121414l, fVar.f());
            fVar2.h(f121415m, fVar.h());
        }
    }

    private static final class k implements com.google.firebase.encoders.e<f0.f.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final k f121416a = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121417b = com.google.firebase.encoders.d.d("execution");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121418c = com.google.firebase.encoders.d.d("customAttributes");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121419d = com.google.firebase.encoders.d.d("internalKeys");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121420e = com.google.firebase.encoders.d.d("background");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121421f = com.google.firebase.encoders.d.d("currentProcessDetails");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121422g = com.google.firebase.encoders.d.d("appProcessDetails");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121423h = com.google.firebase.encoders.d.d("uiOrientation");

        private k() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.d.a aVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121417b, aVar.f());
            fVar.o(f121418c, aVar.e());
            fVar.o(f121419d, aVar.g());
            fVar.o(f121420e, aVar.c());
            fVar.o(f121421f, aVar.d());
            fVar.o(f121422g, aVar.b());
            fVar.h(f121423h, aVar.h());
        }
    }

    private static final class l implements com.google.firebase.encoders.e<f0.f.d.a.b.AbstractC1134a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final l f121424a = new l();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121425b = com.google.firebase.encoders.d.d("baseAddress");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121426c = com.google.firebase.encoders.d.d("size");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121427d = com.google.firebase.encoders.d.d("name");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121428e = com.google.firebase.encoders.d.d("uuid");

        private l() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.d.a.b.AbstractC1134a abstractC1134a, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.g(f121425b, abstractC1134a.b());
            fVar.g(f121426c, abstractC1134a.d());
            fVar.o(f121427d, abstractC1134a.c());
            fVar.o(f121428e, abstractC1134a.f());
        }
    }

    private static final class m implements com.google.firebase.encoders.e<f0.f.d.a.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final m f121429a = new m();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121430b = com.google.firebase.encoders.d.d(o7.b.f305963d);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121431c = com.google.firebase.encoders.d.d(o7.b.f305964e);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121432d = com.google.firebase.encoders.d.d("appExitInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121433e = com.google.firebase.encoders.d.d("signal");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121434f = com.google.firebase.encoders.d.d("binaries");

        private m() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.d.a.b bVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121430b, bVar.f());
            fVar.o(f121431c, bVar.d());
            fVar.o(f121432d, bVar.b());
            fVar.o(f121433e, bVar.e());
            fVar.o(f121434f, bVar.c());
        }
    }

    private static final class n implements com.google.firebase.encoders.e<f0.f.d.a.b.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final n f121435a = new n();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121436b = com.google.firebase.encoders.d.d("type");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121437c = com.google.firebase.encoders.d.d(io.sentry.clientreport.g.b.f305285a);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121438d = com.google.firebase.encoders.d.d("frames");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121439e = com.google.firebase.encoders.d.d("causedBy");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121440f = com.google.firebase.encoders.d.d("overflowCount");

        private n() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.d.a.b.c cVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121436b, cVar.f());
            fVar.o(f121437c, cVar.e());
            fVar.o(f121438d, cVar.c());
            fVar.o(f121439e, cVar.b());
            fVar.h(f121440f, cVar.d());
        }
    }

    private static final class o implements com.google.firebase.encoders.e<f0.f.d.a.b.AbstractC1138d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final o f121441a = new o();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121442b = com.google.firebase.encoders.d.d("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121443c = com.google.firebase.encoders.d.d("code");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121444d = com.google.firebase.encoders.d.d("address");

        private o() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.d.a.b.AbstractC1138d abstractC1138d, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121442b, abstractC1138d.d());
            fVar.o(f121443c, abstractC1138d.c());
            fVar.g(f121444d, abstractC1138d.b());
        }
    }

    private static final class p implements com.google.firebase.encoders.e<f0.f.d.a.b.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final p f121445a = new p();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121446b = com.google.firebase.encoders.d.d("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121447c = com.google.firebase.encoders.d.d("importance");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121448d = com.google.firebase.encoders.d.d("frames");

        private p() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.d.a.b.e eVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121446b, eVar.d());
            fVar.h(f121447c, eVar.c());
            fVar.o(f121448d, eVar.b());
        }
    }

    private static final class q implements com.google.firebase.encoders.e<f0.f.d.a.b.e.AbstractC1141b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final q f121449a = new q();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121450b = com.google.firebase.encoders.d.d("pc");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121451c = com.google.firebase.encoders.d.d(io.sentry.protocol.z.b.f306550q);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121452d = com.google.firebase.encoders.d.d(com.facebook.share.internal.k.f101891c);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121453e = com.google.firebase.encoders.d.d(androidx.constraintlayout.core.motion.utils.v.c.R);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121454f = com.google.firebase.encoders.d.d("importance");

        private q() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.d.a.b.e.AbstractC1141b abstractC1141b, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.g(f121450b, abstractC1141b.e());
            fVar.o(f121451c, abstractC1141b.f());
            fVar.o(f121452d, abstractC1141b.b());
            fVar.g(f121453e, abstractC1141b.d());
            fVar.h(f121454f, abstractC1141b.c());
        }
    }

    private static final class r implements com.google.firebase.encoders.e<f0.f.d.a.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final r f121455a = new r();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121456b = com.google.firebase.encoders.d.d("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121457c = com.google.firebase.encoders.d.d("pid");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121458d = com.google.firebase.encoders.d.d("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121459e = com.google.firebase.encoders.d.d("defaultProcess");

        private r() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.d.a.c cVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121456b, cVar.d());
            fVar.h(f121457c, cVar.c());
            fVar.h(f121458d, cVar.b());
            fVar.f(f121459e, cVar.e());
        }
    }

    private static final class s implements com.google.firebase.encoders.e<f0.f.d.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s f121460a = new s();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121461b = com.google.firebase.encoders.d.d("batteryLevel");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121462c = com.google.firebase.encoders.d.d("batteryVelocity");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121463d = com.google.firebase.encoders.d.d("proximityOn");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121464e = com.google.firebase.encoders.d.d(io.sentry.protocol.e.c.f306223k);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121465f = com.google.firebase.encoders.d.d("ramUsed");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121466g = com.google.firebase.encoders.d.d("diskUsed");

        private s() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.d.c cVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121461b, cVar.b());
            fVar.h(f121462c, cVar.c());
            fVar.f(f121463d, cVar.g());
            fVar.h(f121464e, cVar.e());
            fVar.g(f121465f, cVar.f());
            fVar.g(f121466g, cVar.d());
        }
    }

    private static final class t implements com.google.firebase.encoders.e<f0.f.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final t f121467a = new t();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121468b = com.google.firebase.encoders.d.d("timestamp");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121469c = com.google.firebase.encoders.d.d("type");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121470d = com.google.firebase.encoders.d.d("app");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121471e = com.google.firebase.encoders.d.d("device");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121472f = com.google.firebase.encoders.d.d("log");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121473g = com.google.firebase.encoders.d.d("rollouts");

        private t() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.d dVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.g(f121468b, dVar.f());
            fVar.o(f121469c, dVar.g());
            fVar.o(f121470d, dVar.b());
            fVar.o(f121471e, dVar.c());
            fVar.o(f121472f, dVar.d());
            fVar.o(f121473g, dVar.e());
        }
    }

    private static final class u implements com.google.firebase.encoders.e<f0.f.d.AbstractC1144d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final u f121474a = new u();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121475b = com.google.firebase.encoders.d.d(FirebaseAnalytics.d.P);

        private u() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.d.AbstractC1144d abstractC1144d, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121475b, abstractC1144d.b());
        }
    }

    private static final class v implements com.google.firebase.encoders.e<f0.f.d.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final v f121476a = new v();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121477b = com.google.firebase.encoders.d.d("rolloutVariant");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121478c = com.google.firebase.encoders.d.d("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121479d = com.google.firebase.encoders.d.d("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121480e = com.google.firebase.encoders.d.d(com.google.firebase.remoteconfig.e0.c.D2);

        private v() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.d.e eVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121477b, eVar.d());
            fVar.o(f121478c, eVar.b());
            fVar.o(f121479d, eVar.c());
            fVar.g(f121480e, eVar.e());
        }
    }

    private static final class w implements com.google.firebase.encoders.e<f0.f.d.e.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final w f121481a = new w();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121482b = com.google.firebase.encoders.d.d(com.google.firebase.remoteconfig.internal.h.f124535o);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121483c = com.google.firebase.encoders.d.d("variantId");

        private w() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.d.e.b bVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121482b, bVar.b());
            fVar.o(f121483c, bVar.c());
        }
    }

    private static final class x implements com.google.firebase.encoders.e<f0.f.d.AbstractC1145f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final x f121484a = new x();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121485b = com.google.firebase.encoders.d.d("assignments");

        private x() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.d.AbstractC1145f abstractC1145f, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121485b, abstractC1145f.b());
        }
    }

    private static final class y implements com.google.firebase.encoders.e<f0.f.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final y f121486a = new y();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121487b = com.google.firebase.encoders.d.d("platform");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121488c = com.google.firebase.encoders.d.d("version");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121489d = com.google.firebase.encoders.d.d("buildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121490e = com.google.firebase.encoders.d.d("jailbroken");

        private y() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.e eVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.h(f121487b, eVar.c());
            fVar.o(f121488c, eVar.d());
            fVar.o(f121489d, eVar.b());
            fVar.f(f121490e, eVar.e());
        }
    }

    private static final class z implements com.google.firebase.encoders.e<f0.f.AbstractC1146f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final z f121491a = new z();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121492b = com.google.firebase.encoders.d.d("identifier");

        private z() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f0.f.AbstractC1146f abstractC1146f, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121492b, abstractC1146f.b());
        }
    }

    private a() {
    }

    @Override // l8.a
    public void a(l8.b<?> bVar) {
        d dVar = d.f121364a;
        bVar.b(f0.class, dVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.b.class, dVar);
        j jVar = j.f121403a;
        bVar.b(f0.f.class, jVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.h.class, jVar);
        g gVar = g.f121383a;
        bVar.b(f0.f.a.class, gVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.i.class, gVar);
        h hVar = h.f121391a;
        bVar.b(f0.f.a.b.class, hVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.j.class, hVar);
        z zVar = z.f121491a;
        bVar.b(f0.f.AbstractC1146f.class, zVar);
        bVar.b(a0.class, zVar);
        y yVar = y.f121486a;
        bVar.b(f0.f.e.class, yVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.z.class, yVar);
        i iVar = i.f121393a;
        bVar.b(f0.f.c.class, iVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.k.class, iVar);
        t tVar = t.f121467a;
        bVar.b(f0.f.d.class, tVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.l.class, tVar);
        k kVar = k.f121416a;
        bVar.b(f0.f.d.a.class, kVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.m.class, kVar);
        m mVar = m.f121429a;
        bVar.b(f0.f.d.a.b.class, mVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.n.class, mVar);
        p pVar = p.f121445a;
        bVar.b(f0.f.d.a.b.e.class, pVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.r.class, pVar);
        q qVar = q.f121449a;
        bVar.b(f0.f.d.a.b.e.AbstractC1141b.class, qVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.s.class, qVar);
        n nVar = n.f121435a;
        bVar.b(f0.f.d.a.b.c.class, nVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.p.class, nVar);
        b bVar2 = b.f121351a;
        bVar.b(f0.a.class, bVar2);
        bVar.b(com.google.firebase.crashlytics.internal.model.c.class, bVar2);
        C1127a c1127a = C1127a.f121347a;
        bVar.b(f0.a.AbstractC1129a.class, c1127a);
        bVar.b(com.google.firebase.crashlytics.internal.model.d.class, c1127a);
        o oVar = o.f121441a;
        bVar.b(f0.f.d.a.b.AbstractC1138d.class, oVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.q.class, oVar);
        l lVar = l.f121424a;
        bVar.b(f0.f.d.a.b.AbstractC1134a.class, lVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.o.class, lVar);
        c cVar = c.f121361a;
        bVar.b(f0.d.class, cVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.e.class, cVar);
        r rVar = r.f121455a;
        bVar.b(f0.f.d.a.c.class, rVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.t.class, rVar);
        s sVar = s.f121460a;
        bVar.b(f0.f.d.c.class, sVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.u.class, sVar);
        u uVar = u.f121474a;
        bVar.b(f0.f.d.AbstractC1144d.class, uVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.v.class, uVar);
        x xVar = x.f121484a;
        bVar.b(f0.f.d.AbstractC1145f.class, xVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.y.class, xVar);
        v vVar = v.f121476a;
        bVar.b(f0.f.d.e.class, vVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.w.class, vVar);
        w wVar = w.f121481a;
        bVar.b(f0.f.d.e.b.class, wVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.x.class, wVar);
        e eVar = e.f121377a;
        bVar.b(f0.e.class, eVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.f.class, eVar);
        f fVar = f.f121380a;
        bVar.b(f0.e.b.class, fVar);
        bVar.b(com.google.firebase.crashlytics.internal.model.g.class, fVar);
    }
}
