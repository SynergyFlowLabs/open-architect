package com.rabbitmq.client;

import java.io.IOException;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes13.dex */
public abstract class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f265979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f265980b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private n1 f265981a = new n1() { // from class: com.rabbitmq.client.p1
            @Override // com.rabbitmq.client.n1
            public final void a(SocketChannel socketChannel) {
                q1.a.a(socketChannel);
            }
        };

        public static /* synthetic */ void a(SocketChannel socketChannel) {
        }

        public a b(n1 n1Var) {
            this.f265981a = this.f265981a.b(n1Var);
            return this;
        }

        public n1 c() {
            return this.f265981a;
        }

        public a d() {
            this.f265981a = this.f265981a.b(q1.f265980b);
            return this;
        }

        public a e() {
            this.f265981a = this.f265981a.b(q1.f265979a);
            return this;
        }
    }

    static {
        n1 n1Var = new n1() { // from class: com.rabbitmq.client.o1
            @Override // com.rabbitmq.client.n1
            public final void a(SocketChannel socketChannel) throws IOException {
                w1.f266055a.a(socketChannel.socket());
            }
        };
        f265979a = n1Var;
        f265980b = n1Var;
    }

    public static a b() {
        return new a();
    }

    public static n1 c() {
        return f265980b;
    }

    public static n1 d() {
        return f265979a;
    }
}
