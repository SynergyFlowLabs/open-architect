package com.google.firebase.inappmessaging.display.internal.injection.components;

import android.app.Application;
import com.bumptech.glide.l;
import com.google.firebase.inappmessaging.display.internal.g;
import com.google.firebase.inappmessaging.display.internal.k;
import com.google.firebase.inappmessaging.display.internal.o;
import com.google.firebase.inappmessaging.m;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
public final class b {

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.internal.injection.components.b$b, reason: collision with other inner class name */
    private static final class C1155b implements com.google.firebase.inappmessaging.display.internal.injection.components.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1155b f122330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ij.c<m> f122331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ij.c<Map<String, ij.c<k>>> f122332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ij.c<Application> f122333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ij.c<l> f122334e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.display.internal.e> f122335f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<g> f122336g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.display.internal.a> f122337h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.display.internal.c> f122338i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.display.c> f122339j;

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.internal.injection.components.b$b$a */
        private static final class a implements ij.c<g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final f f122340a;

            a(f fVar) {
                this.f122340a = fVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g get() {
                return (g) com.google.firebase.inappmessaging.display.dagger.internal.f.e(this.f122340a.d());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.internal.injection.components.b$b$b, reason: collision with other inner class name */
        private static final class C1156b implements ij.c<com.google.firebase.inappmessaging.display.internal.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final f f122341a;

            C1156b(f fVar) {
                this.f122341a = fVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.google.firebase.inappmessaging.display.internal.a get() {
                return (com.google.firebase.inappmessaging.display.internal.a) com.google.firebase.inappmessaging.display.dagger.internal.f.e(this.f122341a.e());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.internal.injection.components.b$b$c */
        private static final class c implements ij.c<Map<String, ij.c<k>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final f f122342a;

            c(f fVar) {
                this.f122342a = fVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, ij.c<k>> get() {
                return (Map) com.google.firebase.inappmessaging.display.dagger.internal.f.e(this.f122342a.b());
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.internal.injection.components.b$b$d */
        private static final class d implements ij.c<Application> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final f f122343a;

            d(f fVar) {
                this.f122343a = fVar;
            }

            @Override // ij.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Application get() {
                return (Application) com.google.firebase.inappmessaging.display.dagger.internal.f.e(this.f122343a.a());
            }
        }

        private void c(com.google.firebase.inappmessaging.display.internal.injection.modules.e eVar, com.google.firebase.inappmessaging.display.internal.injection.modules.c cVar, f fVar) {
            this.f122331b = com.google.firebase.inappmessaging.display.dagger.internal.c.b(com.google.firebase.inappmessaging.display.internal.injection.modules.f.a(eVar));
            this.f122332c = new c(fVar);
            d dVar = new d(fVar);
            this.f122333d = dVar;
            ij.c<l> cVarB = com.google.firebase.inappmessaging.display.dagger.internal.c.b(com.google.firebase.inappmessaging.display.internal.injection.modules.d.a(cVar, dVar));
            this.f122334e = cVarB;
            this.f122335f = com.google.firebase.inappmessaging.display.dagger.internal.c.b(com.google.firebase.inappmessaging.display.internal.f.a(cVarB));
            this.f122336g = new a(fVar);
            this.f122337h = new C1156b(fVar);
            this.f122338i = com.google.firebase.inappmessaging.display.dagger.internal.c.b(com.google.firebase.inappmessaging.display.internal.d.a());
            this.f122339j = com.google.firebase.inappmessaging.display.dagger.internal.c.b(com.google.firebase.inappmessaging.display.e.a(this.f122331b, this.f122332c, this.f122335f, o.a(), o.a(), this.f122336g, this.f122333d, this.f122337h, this.f122338i));
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.a
        public com.google.firebase.inappmessaging.display.c a() {
            return this.f122339j.get();
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.a
        public com.google.firebase.inappmessaging.display.internal.e b() {
            return this.f122335f.get();
        }

        private C1155b(com.google.firebase.inappmessaging.display.internal.injection.modules.e eVar, com.google.firebase.inappmessaging.display.internal.injection.modules.c cVar, f fVar) {
            this.f122330a = this;
            c(eVar, cVar, fVar);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.firebase.inappmessaging.display.internal.injection.modules.e f122344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.firebase.inappmessaging.display.internal.injection.modules.c f122345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f f122346c;

        public com.google.firebase.inappmessaging.display.internal.injection.components.a a() {
            com.google.firebase.inappmessaging.display.dagger.internal.f.a(this.f122344a, com.google.firebase.inappmessaging.display.internal.injection.modules.e.class);
            if (this.f122345b == null) {
                this.f122345b = new com.google.firebase.inappmessaging.display.internal.injection.modules.c();
            }
            com.google.firebase.inappmessaging.display.dagger.internal.f.a(this.f122346c, f.class);
            return new C1155b(this.f122344a, this.f122345b, this.f122346c);
        }

        public c b(com.google.firebase.inappmessaging.display.internal.injection.modules.c cVar) {
            this.f122345b = (com.google.firebase.inappmessaging.display.internal.injection.modules.c) com.google.firebase.inappmessaging.display.dagger.internal.f.b(cVar);
            return this;
        }

        public c c(com.google.firebase.inappmessaging.display.internal.injection.modules.e eVar) {
            this.f122344a = (com.google.firebase.inappmessaging.display.internal.injection.modules.e) com.google.firebase.inappmessaging.display.dagger.internal.f.b(eVar);
            return this;
        }

        public c d(f fVar) {
            this.f122346c = (f) com.google.firebase.inappmessaging.display.dagger.internal.f.b(fVar);
            return this;
        }

        private c() {
        }
    }

    private b() {
    }

    public static c a() {
        return new c();
    }
}
