package com.google.firebase.inappmessaging.display.internal.injection.components;

import android.app.Application;
import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.internal.h;
import com.google.firebase.inappmessaging.display.internal.injection.modules.g;
import com.google.firebase.inappmessaging.display.internal.injection.modules.i;
import com.google.firebase.inappmessaging.display.internal.injection.modules.j;
import com.google.firebase.inappmessaging.display.internal.injection.modules.l;
import com.google.firebase.inappmessaging.display.internal.injection.modules.m;
import com.google.firebase.inappmessaging.display.internal.injection.modules.n;
import com.google.firebase.inappmessaging.display.internal.injection.modules.o;
import com.google.firebase.inappmessaging.display.internal.injection.modules.p;
import com.google.firebase.inappmessaging.display.internal.k;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
public final class d {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.firebase.inappmessaging.display.internal.injection.modules.a f122356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g f122357b;

        public b a(com.google.firebase.inappmessaging.display.internal.injection.modules.a aVar) {
            this.f122356a = (com.google.firebase.inappmessaging.display.internal.injection.modules.a) com.google.firebase.inappmessaging.display.dagger.internal.f.b(aVar);
            return this;
        }

        public f b() {
            com.google.firebase.inappmessaging.display.dagger.internal.f.a(this.f122356a, com.google.firebase.inappmessaging.display.internal.injection.modules.a.class);
            if (this.f122357b == null) {
                this.f122357b = new g();
            }
            return new c(this.f122356a, this.f122357b);
        }

        public b c(g gVar) {
            this.f122357b = (g) com.google.firebase.inappmessaging.display.dagger.internal.f.b(gVar);
            return this;
        }

        private b() {
        }
    }

    private static final class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f122358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f122359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ij.c<Application> f122360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.display.internal.g> f122361d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ij.c<com.google.firebase.inappmessaging.display.internal.a> f122362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ij.c<DisplayMetrics> f122363f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<k> f122364g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<k> f122365h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ij.c<k> f122366i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ij.c<k> f122367j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ij.c<k> f122368k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ij.c<k> f122369l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ij.c<k> f122370m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ij.c<k> f122371n;

        private void f(com.google.firebase.inappmessaging.display.internal.injection.modules.a aVar, g gVar) {
            this.f122360c = com.google.firebase.inappmessaging.display.dagger.internal.c.b(com.google.firebase.inappmessaging.display.internal.injection.modules.b.a(aVar));
            this.f122361d = com.google.firebase.inappmessaging.display.dagger.internal.c.b(h.a());
            this.f122362e = com.google.firebase.inappmessaging.display.dagger.internal.c.b(com.google.firebase.inappmessaging.display.internal.b.a(this.f122360c));
            l lVarA = l.a(gVar, this.f122360c);
            this.f122363f = lVarA;
            this.f122364g = p.a(gVar, lVarA);
            this.f122365h = m.a(gVar, this.f122363f);
            this.f122366i = n.a(gVar, this.f122363f);
            this.f122367j = o.a(gVar, this.f122363f);
            this.f122368k = j.a(gVar, this.f122363f);
            this.f122369l = com.google.firebase.inappmessaging.display.internal.injection.modules.k.a(gVar, this.f122363f);
            this.f122370m = i.a(gVar, this.f122363f);
            this.f122371n = com.google.firebase.inappmessaging.display.internal.injection.modules.h.a(gVar, this.f122363f);
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.f
        public Application a() {
            return this.f122360c.get();
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.f
        public Map<String, ij.c<k>> b() {
            return com.google.firebase.inappmessaging.display.dagger.internal.e.b(8).c(t8.a.f376223e, this.f122364g).c(t8.a.f376224f, this.f122365h).c(t8.a.f376220b, this.f122366i).c(t8.a.f376219a, this.f122367j).c(t8.a.f376222d, this.f122368k).c(t8.a.f376221c, this.f122369l).c(t8.a.f376225g, this.f122370m).c(t8.a.f376226h, this.f122371n).a();
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.f
        public DisplayMetrics c() {
            return l.c(this.f122358a, this.f122360c.get());
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.f
        public com.google.firebase.inappmessaging.display.internal.g d() {
            return this.f122361d.get();
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.f
        public com.google.firebase.inappmessaging.display.internal.a e() {
            return this.f122362e.get();
        }

        private c(com.google.firebase.inappmessaging.display.internal.injection.modules.a aVar, g gVar) {
            this.f122359b = this;
            this.f122358a = gVar;
            f(aVar, gVar);
        }
    }

    private d() {
    }

    public static b a() {
        return new b();
    }
}
