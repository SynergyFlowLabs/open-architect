package com.rabbitmq.client;

import javax.net.ssl.SSLEngine;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f265045a = new z1() { // from class: com.rabbitmq.client.a2
        @Override // com.rabbitmq.client.z1
        public final void a(SSLEngine sSLEngine) {
            d2.a(sSLEngine);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z1 f265046b = new z1() { // from class: com.rabbitmq.client.b2
        @Override // com.rabbitmq.client.z1
        public final void a(SSLEngine sSLEngine) {
            sSLEngine.setSSLParameters(w1.g(sSLEngine.getSSLParameters()));
        }
    };

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private z1 f265047a = new z1() { // from class: com.rabbitmq.client.c2
            @Override // com.rabbitmq.client.z1
            public final void a(SSLEngine sSLEngine) {
                d2.a.a(sSLEngine);
            }
        };

        public static /* synthetic */ void a(SSLEngine sSLEngine) {
        }

        public a b(z1 z1Var) {
            this.f265047a = this.f265047a.c(z1Var);
            return this;
        }

        public z1 c() {
            return this.f265047a;
        }

        public a d() {
            this.f265047a = this.f265047a.c(d2.f265045a);
            return this;
        }

        public a e() {
            this.f265047a = this.f265047a.c(d2.f265046b);
            return this;
        }
    }

    public static /* synthetic */ void a(SSLEngine sSLEngine) {
    }

    public static a c() {
        return new a();
    }

    public static z1 d() {
        return f265045a;
    }

    public static z1 e() {
        return f265046b;
    }
}
