package io.grpc.util;

import io.grpc.o1;
import io.grpc.p1;
import io.grpc.x1;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
final class o {

    public static final class a extends p1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f291143b = "no service config";

        @Override // io.grpc.o1.d
        public o1 a(o1.f fVar) {
            return new n(fVar);
        }

        @Override // io.grpc.p1
        public String b() {
            return "round_robin";
        }

        @Override // io.grpc.p1
        public int c() {
            return 5;
        }

        @Override // io.grpc.p1
        public boolean d() {
            return true;
        }

        @Override // io.grpc.p1
        public x1.c e(Map<String, ?> map) {
            return x1.c.a(f291143b);
        }
    }

    private o() {
    }
}
