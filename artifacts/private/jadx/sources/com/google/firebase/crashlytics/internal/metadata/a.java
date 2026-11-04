package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.remoteconfig.e0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements l8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f121257a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l8.a f121258b = new a();

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.metadata.a$a, reason: collision with other inner class name */
    private static final class C1126a implements com.google.firebase.encoders.e<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C1126a f121259a = new C1126a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121260b = com.google.firebase.encoders.d.d(com.google.firebase.remoteconfig.internal.h.f124535o);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121261c = com.google.firebase.encoders.d.d("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121262d = com.google.firebase.encoders.d.d("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121263e = com.google.firebase.encoders.d.d("variantId");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f121264f = com.google.firebase.encoders.d.d(e0.c.D2);

        private C1126a() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f121260b, jVar.e());
            fVar.o(f121261c, jVar.c());
            fVar.o(f121262d, jVar.d());
            fVar.o(f121263e, jVar.g());
            fVar.g(f121264f, jVar.f());
        }
    }

    private a() {
    }

    @Override // l8.a
    public void a(l8.b<?> bVar) {
        C1126a c1126a = C1126a.f121259a;
        bVar.b(j.class, c1126a);
        bVar.b(b.class, c1126a);
    }
}
