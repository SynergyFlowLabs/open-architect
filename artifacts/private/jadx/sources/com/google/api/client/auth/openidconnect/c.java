package com.google.api.client.auth.openidconnect;

import com.google.api.client.util.f;
import com.google.api.client.util.h0;
import com.google.api.client.util.l;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
@f
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f115262e = 300;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f115263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f115264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection<String> f115265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Collection<String> f115266d;

    @f
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        l f115267a = l.f116096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f115268b = 300;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Collection<String> f115269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Collection<String> f115270d;

        public c a() {
            return new c(this);
        }

        public final long b() {
            return this.f115268b;
        }

        public final Collection<String> c() {
            return this.f115270d;
        }

        public final l d() {
            return this.f115267a;
        }

        public final String e() {
            Collection<String> collection = this.f115269c;
            if (collection == null) {
                return null;
            }
            return collection.iterator().next();
        }

        public final Collection<String> f() {
            return this.f115269c;
        }

        public a g(long j10) {
            h0.a(j10 >= 0);
            this.f115268b = j10;
            return this;
        }

        public a h(Collection<String> collection) {
            this.f115270d = collection;
            return this;
        }

        public a i(l lVar) {
            this.f115267a = (l) h0.d(lVar);
            return this;
        }

        public a j(String str) {
            return str == null ? k(null) : k(Collections.singleton(str));
        }

        public a k(Collection<String> collection) {
            h0.b(collection == null || !collection.isEmpty(), "Issuers must not be empty");
            this.f115269c = collection;
            return this;
        }
    }

    public c() {
        this(new a());
    }

    public final long a() {
        return this.f115264b;
    }

    public final Collection<String> b() {
        return this.f115266d;
    }

    public final l c() {
        return this.f115263a;
    }

    public final String d() {
        Collection<String> collection = this.f115265c;
        if (collection == null) {
            return null;
        }
        return collection.iterator().next();
    }

    public final Collection<String> e() {
        return this.f115265c;
    }

    public boolean f(com.google.api.client.auth.openidconnect.a aVar) {
        Collection<String> collection;
        Collection<String> collection2 = this.f115265c;
        return (collection2 == null || aVar.s(collection2)) && ((collection = this.f115266d) == null || aVar.o(collection)) && aVar.t(this.f115263a.currentTimeMillis(), this.f115264b);
    }

    protected c(a aVar) {
        this.f115263a = aVar.f115267a;
        this.f115264b = aVar.f115268b;
        Collection<String> collection = aVar.f115269c;
        this.f115265c = collection == null ? null : Collections.unmodifiableCollection(collection);
        Collection<String> collection2 = aVar.f115270d;
        this.f115266d = collection2 != null ? Collections.unmodifiableCollection(collection2) : null;
    }
}
