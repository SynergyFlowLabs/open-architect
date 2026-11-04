package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.persistence.n0;
import com.google.android.datatransport.runtime.scheduling.persistence.o0;
import com.google.android.datatransport.runtime.scheduling.persistence.x0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.a
final class f {

    private static final class b implements x.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f103525a;

        private b() {
        }

        @Override // com.google.android.datatransport.runtime.x.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f103525a = (Context) com.google.android.datatransport.runtime.dagger.internal.e.b(context);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.x.a
        public x build() {
            com.google.android.datatransport.runtime.dagger.internal.e.a(this.f103525a, Context.class);
            return new c(this.f103525a);
        }
    }

    private static final class c extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f103526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ij.c<Executor> f103527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ij.c<Context> f103528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ij.c f103529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ij.c f103530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ij.c f103531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<String> f103532g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<n0> f103533h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ij.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> f103534i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ij.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.y> f103535j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ij.c<com.google.android.datatransport.runtime.scheduling.c> f103536k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ij.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> f103537l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ij.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.w> f103538m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ij.c<w> f103539n;

        private void c(Context context) {
            this.f103527b = com.google.android.datatransport.runtime.dagger.internal.b.b(l.a());
            com.google.android.datatransport.runtime.dagger.internal.c cVarA = com.google.android.datatransport.runtime.dagger.internal.d.a(context);
            this.f103528c = cVarA;
            com.google.android.datatransport.runtime.backends.k kVarA = com.google.android.datatransport.runtime.backends.k.a(cVarA, com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a());
            this.f103529d = kVarA;
            this.f103530e = com.google.android.datatransport.runtime.dagger.internal.b.b(com.google.android.datatransport.runtime.backends.m.a(this.f103528c, kVarA));
            this.f103531f = x0.a(this.f103528c, com.google.android.datatransport.runtime.scheduling.persistence.g.a(), com.google.android.datatransport.runtime.scheduling.persistence.i.a());
            this.f103532g = com.google.android.datatransport.runtime.dagger.internal.b.b(com.google.android.datatransport.runtime.scheduling.persistence.h.a(this.f103528c));
            this.f103533h = com.google.android.datatransport.runtime.dagger.internal.b.b(o0.a(com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), com.google.android.datatransport.runtime.scheduling.persistence.j.a(), this.f103531f, this.f103532g));
            com.google.android.datatransport.runtime.scheduling.g gVarB = com.google.android.datatransport.runtime.scheduling.g.b(com.google.android.datatransport.runtime.time.e.a());
            this.f103534i = gVarB;
            com.google.android.datatransport.runtime.scheduling.i iVarA = com.google.android.datatransport.runtime.scheduling.i.a(this.f103528c, this.f103533h, gVarB, com.google.android.datatransport.runtime.time.f.a());
            this.f103535j = iVarA;
            ij.c<Executor> cVar = this.f103527b;
            ij.c cVar2 = this.f103530e;
            ij.c<n0> cVar3 = this.f103533h;
            this.f103536k = com.google.android.datatransport.runtime.scheduling.d.a(cVar, cVar2, iVarA, cVar3, cVar3);
            ij.c<Context> cVar4 = this.f103528c;
            ij.c cVar5 = this.f103530e;
            ij.c<n0> cVar6 = this.f103533h;
            this.f103537l = com.google.android.datatransport.runtime.scheduling.jobscheduling.t.a(cVar4, cVar5, cVar6, this.f103535j, this.f103527b, cVar6, com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), this.f103533h);
            ij.c<Executor> cVar7 = this.f103527b;
            ij.c<n0> cVar8 = this.f103533h;
            this.f103538m = com.google.android.datatransport.runtime.scheduling.jobscheduling.x.a(cVar7, cVar8, this.f103535j, cVar8);
            this.f103539n = com.google.android.datatransport.runtime.dagger.internal.b.b(y.a(com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), this.f103536k, this.f103537l, this.f103538m));
        }

        @Override // com.google.android.datatransport.runtime.x
        com.google.android.datatransport.runtime.scheduling.persistence.d a() {
            return this.f103533h.get();
        }

        @Override // com.google.android.datatransport.runtime.x
        w b() {
            return this.f103539n.get();
        }

        private c(Context context) {
            this.f103526a = this;
            c(context);
        }
    }

    private f() {
    }

    public static x.a a() {
        return new b();
    }
}
