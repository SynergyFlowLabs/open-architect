package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.remoteconfig.e0;
import com.google.firebase.remoteconfig.internal.h;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements l8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f124713a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l8.a f124714b = new a();

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.interop.rollouts.a$a, reason: collision with other inner class name */
    private static final class C1184a implements com.google.firebase.encoders.e<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C1184a f124715a = new C1184a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124716b = com.google.firebase.encoders.d.d(h.f124535o);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124717c = com.google.firebase.encoders.d.d("variantId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124718d = com.google.firebase.encoders.d.d("parameterKey");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124719e = com.google.firebase.encoders.d.d("parameterValue");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.d f124720f = com.google.firebase.encoders.d.d(e0.c.D2);

        private C1184a() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar, com.google.firebase.encoders.f fVar) throws IOException {
            fVar.o(f124716b, dVar.f());
            fVar.o(f124717c, dVar.h());
            fVar.o(f124718d, dVar.d());
            fVar.o(f124719e, dVar.e());
            fVar.g(f124720f, dVar.g());
        }
    }

    private a() {
    }

    @Override // l8.a
    public void a(l8.b<?> bVar) {
        C1184a c1184a = C1184a.f124715a;
        bVar.b(d.class, c1184a);
        bVar.b(b.class, c1184a);
    }
}
