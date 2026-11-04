package io.grpc.okhttp.internal.proxy;

import io.grpc.okhttp.internal.e;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.okhttp.internal.proxy.a f290672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f290673b;

    /* JADX INFO: renamed from: io.grpc.okhttp.internal.proxy.b$b, reason: collision with other inner class name */
    public static class C1984b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private io.grpc.okhttp.internal.proxy.a f290674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e.b f290675b = new e.b();

        public b c() {
            if (this.f290674a != null) {
                return new b(this);
            }
            throw new IllegalStateException("url == null");
        }

        public C1984b d(String str, String str2) {
            this.f290675b.f(str, str2);
            return this;
        }

        public C1984b e(io.grpc.okhttp.internal.proxy.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f290674a = aVar;
            return this;
        }
    }

    public e a() {
        return this.f290673b;
    }

    public io.grpc.okhttp.internal.proxy.a b() {
        return this.f290672a;
    }

    public C1984b c() {
        return new C1984b();
    }

    public String toString() {
        return "Request{url=" + this.f290672a + AbstractJsonLexerKt.END_OBJ;
    }

    private b(C1984b c1984b) {
        this.f290672a = c1984b.f290674a;
        this.f290673b = c1984b.f290675b.c();
    }
}
