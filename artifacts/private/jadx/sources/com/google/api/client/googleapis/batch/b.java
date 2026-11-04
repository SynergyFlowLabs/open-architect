package com.google.api.client.googleapis.batch;

import com.google.api.client.http.b0;
import com.google.api.client.http.g0;
import com.google.api.client.http.j;
import com.google.api.client.http.p;
import com.google.api.client.http.q;
import com.google.api.client.http.u;
import com.google.api.client.http.v;
import com.google.api.client.http.w;
import com.google.api.client.http.x;
import com.google.api.client.util.h0;
import com.google.api.client.util.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f115376b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f115375a = new j("https://www.googleapis.com/batch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<C1014b<?, ?>> f115377c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k0 f115378d = k0.f116095a;

    class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f115379a;

        a(p pVar) {
            this.f115379a = pVar;
        }

        @Override // com.google.api.client.http.p
        public void a(u uVar) throws IOException {
            p pVar = this.f115379a;
            if (pVar != null) {
                pVar.a(uVar);
            }
            for (C1014b<?, ?> c1014b : b.this.f115377c) {
                p pVarL = c1014b.f115384d.l();
                if (pVarL != null) {
                    pVarL.a(c1014b.f115384d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.api.client.googleapis.batch.b$b, reason: collision with other inner class name */
    static class C1014b<T, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.google.api.client.googleapis.batch.a<T, E> f115381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<T> f115382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Class<E> f115383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final u f115384d;

        C1014b(com.google.api.client.googleapis.batch.a<T, E> aVar, Class<T> cls, Class<E> cls2, u uVar) {
            this.f115381a = aVar;
            this.f115382b = cls;
            this.f115383c = cls2;
            this.f115384d = uVar;
        }
    }

    public b(b0 b0Var, w wVar) {
        this.f115376b = wVar == null ? b0Var.c() : b0Var.d(wVar);
    }

    public void a() throws IOException {
        boolean z10;
        h0.g(!this.f115377c.isEmpty());
        u uVarE = this.f115376b.e(this.f115375a, null);
        uVarE.L(new a(uVarE.l()));
        int iM = uVarE.m();
        com.google.api.client.http.c cVarD = uVarE.d();
        if (cVarD != null) {
            cVarD.reset();
        }
        do {
            z10 = iM > 0;
            g0 g0Var = new g0();
            g0Var.f().p("mixed");
            Iterator<C1014b<?, ?>> it = this.f115377c.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                g0Var.h(new g0.a(new q().e0(null).p("Content-ID", Integer.valueOf(i10)), new d(it.next().f115384d)));
                i10++;
            }
            uVarE.E(g0Var);
            x xVarA = uVarE.a();
            try {
                c cVar = new c(xVarA.c(), "--" + xVarA.i().g("boundary"), this.f115377c, z10);
                while (cVar.f115388d) {
                    cVar.e();
                }
                xVarA.a();
                List<C1014b<?, ?>> list = cVar.f115389e;
                if (list.isEmpty()) {
                    break;
                }
                this.f115377c = list;
                if (cVar.f115390f && cVarD != null) {
                    long jA = cVarD.a();
                    if (jA != -1) {
                        try {
                            this.f115378d.e(jA);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
                iM--;
            } catch (Throwable th2) {
                xVarA.a();
                throw th2;
            }
        } while (z10);
        this.f115377c.clear();
    }

    public j b() {
        return this.f115375a;
    }

    public k0 c() {
        return this.f115378d;
    }

    public <T, E> b d(u uVar, Class<T> cls, Class<E> cls2, com.google.api.client.googleapis.batch.a<T, E> aVar) throws IOException {
        h0.d(uVar);
        h0.d(aVar);
        h0.d(cls);
        h0.d(cls2);
        this.f115377c.add(new C1014b<>(aVar, cls, cls2, uVar));
        return this;
    }

    public b e(j jVar) {
        this.f115375a = jVar;
        return this;
    }

    public b f(k0 k0Var) {
        this.f115378d = (k0) h0.d(k0Var);
        return this;
    }

    public int g() {
        return this.f115377c.size();
    }
}
