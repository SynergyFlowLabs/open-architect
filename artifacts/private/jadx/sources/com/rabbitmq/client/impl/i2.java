package com.rabbitmq.client.impl;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
abstract class i2 {

    static class a extends y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.rabbitmq.client.k0 f265267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f265268b;

        public a(com.rabbitmq.client.k0 k0Var, String str) {
            if (k0Var == null) {
                throw new IllegalStateException("Invalid configuration: 'newSecret' must be non-null.");
            }
            if (str == null) {
                throw new IllegalStateException("Invalid configuration: 'reason' must be non-null.");
            }
            this.f265267a = k0Var;
            this.f265268b = str;
        }

        @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
        public int J() {
            return 70;
        }

        @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
        public int W() {
            return 10;
        }

        @Override // com.rabbitmq.client.impl.y0
        public void X(StringBuilder sb2) {
            sb2.append("(new-secret=");
            sb2.append(this.f265267a);
            sb2.append(", reason=");
            sb2.append(this.f265268b);
            sb2.append(")");
        }

        @Override // com.rabbitmq.client.impl.y0
        public boolean Y() {
            return false;
        }

        @Override // com.rabbitmq.client.impl.y0
        public Object a0(k.h hVar) throws IOException {
            return null;
        }

        @Override // com.rabbitmq.client.impl.y0
        public void b0(a1 a1Var) throws IOException {
            a1Var.g(this.f265267a);
            a1Var.l(this.f265268b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Objects.equals(this.f265267a, aVar.f265267a)) {
                return Objects.equals(this.f265268b, aVar.f265268b);
            }
            return false;
        }

        public int hashCode() {
            com.rabbitmq.client.k0 k0Var = this.f265267a;
            int iHashCode = (k0Var != null ? k0Var.hashCode() : 0) * 31;
            String str = this.f265268b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String u0() {
            return this.f265268b;
        }

        @Override // com.rabbitmq.client.impl.y0, com.rabbitmq.client.o0
        public String z() {
            return "connection.update-secret";
        }
    }

    i2() {
    }
}
