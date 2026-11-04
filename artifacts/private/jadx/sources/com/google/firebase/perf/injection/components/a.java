package com.google.firebase.perf.injection.components;

import com.google.android.datatransport.m;
import com.google.firebase.h;
import com.google.firebase.installations.k;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.injection.modules.d;
import com.google.firebase.perf.injection.modules.f;
import com.google.firebase.perf.injection.modules.g;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.d0;
import dagger.internal.e;
import dagger.internal.p;

/* JADX INFO: loaded from: classes5.dex */
@e
public final class a {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.firebase.perf.injection.modules.a f123937a;

        public com.google.firebase.perf.injection.components.b a() {
            p.a(this.f123937a, com.google.firebase.perf.injection.modules.a.class);
            return new c(this.f123937a);
        }

        public b b(com.google.firebase.perf.injection.modules.a aVar) {
            this.f123937a = (com.google.firebase.perf.injection.modules.a) p.b(aVar);
            return this;
        }

        private b() {
        }
    }

    private static final class c implements com.google.firebase.perf.injection.components.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f123938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ij.c<h> f123939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ij.c<z8.b<d0>> f123940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ij.c<k> f123941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ij.c<z8.b<m>> f123942e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ij.c<RemoteConfigManager> f123943f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<com.google.firebase.perf.config.a> f123944g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<SessionManager> f123945h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ij.c<com.google.firebase.perf.e> f123946i;

        private void b(com.google.firebase.perf.injection.modules.a aVar) {
            this.f123939b = com.google.firebase.perf.injection.modules.c.a(aVar);
            this.f123940c = com.google.firebase.perf.injection.modules.e.a(aVar);
            this.f123941d = d.a(aVar);
            this.f123942e = com.google.firebase.perf.injection.modules.h.a(aVar);
            this.f123943f = f.a(aVar);
            this.f123944g = com.google.firebase.perf.injection.modules.b.a(aVar);
            g gVarA = g.a(aVar);
            this.f123945h = gVarA;
            this.f123946i = dagger.internal.g.b(com.google.firebase.perf.h.a(this.f123939b, this.f123940c, this.f123941d, this.f123942e, this.f123943f, this.f123944g, gVarA));
        }

        @Override // com.google.firebase.perf.injection.components.b
        public com.google.firebase.perf.e a() {
            return this.f123946i.get();
        }

        private c(com.google.firebase.perf.injection.modules.a aVar) {
            this.f123938a = this;
            b(aVar);
        }
    }

    private a() {
    }

    public static b a() {
        return new b();
    }
}
