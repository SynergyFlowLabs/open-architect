package io.grpc.okhttp;

import com.squareup.okhttp.ConnectionSpec;
import io.grpc.n2;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes13.dex */
@io.grpc.e0("https://github.com/grpc/grpc-java/issues/1785")
public final class l0 {

    static final class a extends n2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SSLSocketFactory f290726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.grpc.okhttp.internal.b f290727b;

        a(SSLSocketFactory sSLSocketFactory) {
            this(sSLSocketFactory, i.f290325t);
        }

        public io.grpc.okhttp.internal.b a() {
            return this.f290727b;
        }

        public SSLSocketFactory b() {
            return this.f290726a;
        }

        a(SSLSocketFactory sSLSocketFactory, io.grpc.okhttp.internal.b bVar) {
            this.f290726a = (SSLSocketFactory) com.google.common.base.j0.F(sSLSocketFactory, "factory");
            this.f290727b = (io.grpc.okhttp.internal.b) com.google.common.base.j0.F(bVar, "connectionSpec");
        }
    }

    private l0() {
    }

    public static n2 a(SSLSocketFactory sSLSocketFactory) {
        return new a(sSLSocketFactory);
    }

    public static n2 b(SSLSocketFactory sSLSocketFactory, ConnectionSpec connectionSpec) {
        return new a(sSLSocketFactory, n0.c(connectionSpec));
    }
}
