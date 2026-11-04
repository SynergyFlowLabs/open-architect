package com.google.api.client.http;

import com.google.api.client.util.k0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class l implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.api.client.util.c f115660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f115661b = a.f115664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k0 f115662c = k0.f116095a;

    @com.google.api.client.util.f
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f115663a = new C1025a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f115664b = new b();

        /* JADX INFO: renamed from: com.google.api.client.http.l$a$a, reason: collision with other inner class name */
        static class C1025a implements a {
            C1025a() {
            }

            @Override // com.google.api.client.http.l.a
            public boolean a(x xVar) {
                return true;
            }
        }

        static class b implements a {
            b() {
            }

            @Override // com.google.api.client.http.l.a
            public boolean a(x xVar) {
                return xVar.k() / 100 == 5;
            }
        }

        boolean a(x xVar);
    }

    public l(com.google.api.client.util.c cVar) {
        this.f115660a = (com.google.api.client.util.c) com.google.api.client.util.h0.d(cVar);
    }

    public final com.google.api.client.util.c a() {
        return this.f115660a;
    }

    public final a b() {
        return this.f115661b;
    }

    @Override // com.google.api.client.http.c0
    public final boolean c(u uVar, x xVar, boolean z10) throws IOException {
        if (z10 && this.f115661b.a(xVar)) {
            try {
                return com.google.api.client.util.d.a(this.f115662c, this.f115660a);
            } catch (InterruptedException unused) {
            }
        }
        return false;
    }

    public final k0 d() {
        return this.f115662c;
    }

    public l e(a aVar) {
        this.f115661b = (a) com.google.api.client.util.h0.d(aVar);
        return this;
    }

    public l f(k0 k0Var) {
        this.f115662c = (k0) com.google.api.client.util.h0.d(k0Var);
        return this;
    }
}
