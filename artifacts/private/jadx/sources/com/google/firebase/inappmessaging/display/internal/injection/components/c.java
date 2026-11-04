package com.google.firebase.inappmessaging.display.internal.injection.components;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.g;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.h;
import com.google.firebase.inappmessaging.display.internal.injection.modules.q;
import com.google.firebase.inappmessaging.display.internal.injection.modules.r;
import com.google.firebase.inappmessaging.display.internal.injection.modules.s;
import com.google.firebase.inappmessaging.display.internal.injection.modules.t;
import com.google.firebase.inappmessaging.display.internal.k;
import com.google.firebase.inappmessaging.model.i;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
public final class c {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q f122347a;

        public e a() {
            com.google.firebase.inappmessaging.display.dagger.internal.f.a(this.f122347a, q.class);
            return new C1157c(this.f122347a);
        }

        public b b(q qVar) {
            this.f122347a = (q) com.google.firebase.inappmessaging.display.dagger.internal.f.b(qVar);
            return this;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.internal.injection.components.c$c, reason: collision with other inner class name */
    private static final class C1157c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1157c f122348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ij.c<k> f122349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ij.c<LayoutInflater> f122350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ij.c<i> f122351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.display.internal.bindingwrappers.f> f122352e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ij.c<h> f122353f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.display.internal.bindingwrappers.a> f122354g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.display.internal.bindingwrappers.d> f122355h;

        private void e(q qVar) {
            this.f122349b = com.google.firebase.inappmessaging.display.dagger.internal.c.b(r.a(qVar));
            this.f122350c = com.google.firebase.inappmessaging.display.dagger.internal.c.b(t.a(qVar));
            s sVarA = s.a(qVar);
            this.f122351d = sVarA;
            this.f122352e = com.google.firebase.inappmessaging.display.dagger.internal.c.b(g.a(this.f122349b, this.f122350c, sVarA));
            this.f122353f = com.google.firebase.inappmessaging.display.dagger.internal.c.b(com.google.firebase.inappmessaging.display.internal.bindingwrappers.i.a(this.f122349b, this.f122350c, this.f122351d));
            this.f122354g = com.google.firebase.inappmessaging.display.dagger.internal.c.b(com.google.firebase.inappmessaging.display.internal.bindingwrappers.b.a(this.f122349b, this.f122350c, this.f122351d));
            this.f122355h = com.google.firebase.inappmessaging.display.dagger.internal.c.b(com.google.firebase.inappmessaging.display.internal.bindingwrappers.e.a(this.f122349b, this.f122350c, this.f122351d));
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.e
        public com.google.firebase.inappmessaging.display.internal.bindingwrappers.f a() {
            return this.f122352e.get();
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.e
        public com.google.firebase.inappmessaging.display.internal.bindingwrappers.a b() {
            return this.f122354g.get();
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.e
        public com.google.firebase.inappmessaging.display.internal.bindingwrappers.d c() {
            return this.f122355h.get();
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.e
        public h d() {
            return this.f122353f.get();
        }

        private C1157c(q qVar) {
            this.f122348a = this;
            e(qVar);
        }
    }

    private c() {
    }

    public static b a() {
        return new b();
    }
}
