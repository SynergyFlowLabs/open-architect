package com.google.api.client.json;

import com.google.api.client.util.e0;
import com.google.api.client.util.h0;
import com.google.api.client.util.j0;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class f implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f115764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<String> f115765b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f115766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Collection<String> f115767b = j0.a();

        public a(d dVar) {
            this.f115766a = (d) h0.d(dVar);
        }

        public f a() {
            return new f(this);
        }

        public final d b() {
            return this.f115766a;
        }

        public final Collection<String> c() {
            return this.f115767b;
        }

        public a d(Collection<String> collection) {
            this.f115767b = collection;
            return this;
        }
    }

    public f(d dVar) {
        this(new a(dVar));
    }

    private void g(g gVar) throws IOException {
        if (this.f115765b.isEmpty()) {
            return;
        }
        try {
            h0.c((gVar.M(this.f115765b) == null || gVar.f() == j.END_OBJECT) ? false : true, "wrapper key(s) not found: %s", this.f115765b);
        } catch (Throwable th2) {
            gVar.a();
            throw th2;
        }
    }

    @Override // com.google.api.client.util.e0
    public <T> T a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return (T) d(inputStream, charset, cls);
    }

    @Override // com.google.api.client.util.e0
    public Object b(Reader reader, Type type) throws IOException {
        g gVarF = this.f115764a.f(reader);
        g(gVarF);
        return gVarF.r(type, true);
    }

    @Override // com.google.api.client.util.e0
    public <T> T c(Reader reader, Class<T> cls) throws IOException {
        return (T) b(reader, cls);
    }

    @Override // com.google.api.client.util.e0
    public Object d(InputStream inputStream, Charset charset, Type type) throws IOException {
        g gVarE = this.f115764a.e(inputStream, charset);
        g(gVarE);
        return gVarE.r(type, true);
    }

    public final d e() {
        return this.f115764a;
    }

    public Set<String> f() {
        return Collections.unmodifiableSet(this.f115765b);
    }

    protected f(a aVar) {
        this.f115764a = aVar.f115766a;
        this.f115765b = new HashSet(aVar.f115767b);
    }
}
