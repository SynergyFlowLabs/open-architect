package io.grpc.okhttp;

import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes13.dex */
@io.grpc.e0("There is no plan to make this API stable, given transport API instability")
public final class k0 {

    static final class b extends io.grpc.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SSLSocketFactory f290688a;

        @Override // io.grpc.g
        public io.grpc.g a() {
            return this;
        }

        public SSLSocketFactory b() {
            return this.f290688a;
        }

        private b(SSLSocketFactory sSLSocketFactory) {
            this.f290688a = (SSLSocketFactory) com.google.common.base.j0.F(sSLSocketFactory, "factory");
        }
    }

    private k0() {
    }

    public static io.grpc.g a(SSLSocketFactory sSLSocketFactory) {
        return new b(sSLSocketFactory);
    }
}
