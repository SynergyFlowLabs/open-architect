package io.grpc.stub;

import io.grpc.t0;

/* JADX INFO: loaded from: classes13.dex */
@t0
public final class i {

    public enum a {
        BLOCKING(g.EnumC1987g.BLOCKING),
        ASYNC(g.EnumC1987g.ASYNC),
        FUTURE(g.EnumC1987g.FUTURE);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g.EnumC1987g f290934a;

        a(g.EnumC1987g enumC1987g) {
            this.f290934a = enumC1987g;
        }

        public static a c(g.EnumC1987g enumC1987g) {
            for (a aVar : values()) {
                if (aVar.f290934a == enumC1987g) {
                    return aVar;
                }
            }
            throw new AssertionError("Unknown StubType: " + enumC1987g.name());
        }
    }

    public static a a(io.grpc.e eVar) {
        return a.c((g.EnumC1987g) eVar.h(g.f290901c));
    }

    public static io.grpc.e.c<g.EnumC1987g> b() {
        return g.f290901c;
    }

    public static io.grpc.e c(io.grpc.e eVar, a aVar) {
        return eVar.u(g.f290901c, aVar.f290934a);
    }
}
