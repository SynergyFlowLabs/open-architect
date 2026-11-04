package com.google.api.client.testing.http;

import com.google.api.client.http.b0;
import com.google.api.client.http.e0;
import com.google.api.client.util.h0;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class d extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f115982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f115983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f115984e;

    @com.google.api.client.util.f
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Set<String> f115985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        f f115986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        g f115987c;

        public d a() {
            return new d(this);
        }

        public final f b() {
            return this.f115986b;
        }

        g c() {
            return this.f115987c;
        }

        public final Set<String> d() {
            return this.f115985a;
        }

        public final a e(f fVar) {
            h0.h(this.f115987c == null, "Cannnot set a low level HTTP request when a low level HTTP response has been set.");
            this.f115986b = fVar;
            return this;
        }

        public final a f(g gVar) {
            h0.h(this.f115986b == null, "Cannot set a low level HTTP response when a low level HTTP request has been set.");
            this.f115987c = gVar;
            return this;
        }

        public final a g(Set<String> set) {
            this.f115985a = set;
            return this;
        }
    }

    public d() {
    }

    @Deprecated
    public static a g() {
        return new a();
    }

    @Override // com.google.api.client.http.b0
    public e0 b(String str, String str2) throws IOException {
        h0.c(f(str), "HTTP method %s not supported", str);
        f fVar = this.f115983d;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(str2);
        this.f115983d = fVar2;
        g gVar = this.f115984e;
        if (gVar != null) {
            fVar2.r(gVar);
        }
        return this.f115983d;
    }

    @Override // com.google.api.client.http.b0
    public boolean f(String str) throws IOException {
        Set<String> set = this.f115982c;
        return set == null || set.contains(str);
    }

    public final f h() {
        return this.f115983d;
    }

    public final Set<String> i() {
        Set<String> set = this.f115982c;
        if (set == null) {
            return null;
        }
        return Collections.unmodifiableSet(set);
    }

    protected d(a aVar) {
        this.f115982c = aVar.f115985a;
        this.f115983d = aVar.f115986b;
        this.f115984e = aVar.f115987c;
    }
}
