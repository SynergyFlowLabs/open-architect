package io.grpc.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.h
    private final b f289706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, b> f289707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, b> f289708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @fj.h
    private final m2.e0 f289709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @fj.h
    private final Object f289710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @fj.h
    private final Map<String, ?> f289711f;

    static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final io.grpc.e.c<b> f289712g = io.grpc.e.c.b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Long f289713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Boolean f289714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Integer f289715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Integer f289716d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final n2 f289717e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final x0 f289718f;

        b(Map<String, ?> map, boolean z10, int i10, int i11) {
            this.f289713a = e3.x(map);
            this.f289714b = e3.y(map);
            Integer numM = e3.m(map);
            this.f289715c = numM;
            if (numM != null) {
                com.google.common.base.j0.u(numM.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numM);
            }
            Integer numL = e3.l(map);
            this.f289716d = numL;
            if (numL != null) {
                com.google.common.base.j0.u(numL.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numL);
            }
            Map<String, ?> mapS = z10 ? e3.s(map) : null;
            this.f289717e = mapS == null ? null : b(mapS, i10);
            Map<String, ?> mapE = z10 ? e3.e(map) : null;
            this.f289718f = mapE != null ? a(mapE, i11) : null;
        }

        private static x0 a(Map<String, ?> map, int i10) {
            int iIntValue = ((Integer) com.google.common.base.j0.F(e3.i(map), "maxAttempts cannot be empty")).intValue();
            com.google.common.base.j0.k(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i10);
            long jLongValue = ((Long) com.google.common.base.j0.F(e3.d(map), "hedgingDelay cannot be empty")).longValue();
            com.google.common.base.j0.p(jLongValue >= 0, "hedgingDelay must not be negative: %s", jLongValue);
            return new x0(iMin, jLongValue, e3.q(map));
        }

        private static n2 b(Map<String, ?> map, int i10) {
            int iIntValue = ((Integer) com.google.common.base.j0.F(e3.j(map), "maxAttempts cannot be empty")).intValue();
            com.google.common.base.j0.k(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i10);
            long jLongValue = ((Long) com.google.common.base.j0.F(e3.f(map), "initialBackoff cannot be empty")).longValue();
            com.google.common.base.j0.p(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            long jLongValue2 = ((Long) com.google.common.base.j0.F(e3.k(map), "maxBackoff cannot be empty")).longValue();
            com.google.common.base.j0.p(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double d10 = (Double) com.google.common.base.j0.F(e3.a(map), "backoffMultiplier cannot be empty");
            double dDoubleValue = d10.doubleValue();
            com.google.common.base.j0.u(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", d10);
            Long lR = e3.r(map);
            com.google.common.base.j0.u(lR == null || lR.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lR);
            Set<io.grpc.y2.b> setT = e3.t(map);
            com.google.common.base.j0.e((lR == null && setT.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new n2(iMin, jLongValue, jLongValue2, dDoubleValue, lR, setT);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return com.google.common.base.d0.a(this.f289713a, bVar.f289713a) && com.google.common.base.d0.a(this.f289714b, bVar.f289714b) && com.google.common.base.d0.a(this.f289715c, bVar.f289715c) && com.google.common.base.d0.a(this.f289716d, bVar.f289716d) && com.google.common.base.d0.a(this.f289717e, bVar.f289717e) && com.google.common.base.d0.a(this.f289718f, bVar.f289718f);
        }

        public int hashCode() {
            return com.google.common.base.d0.b(this.f289713a, this.f289714b, this.f289715c, this.f289716d, this.f289717e, this.f289718f);
        }

        public String toString() {
            return com.google.common.base.b0.c(this).f("timeoutNanos", this.f289713a).f("waitForReady", this.f289714b).f("maxInboundMessageSize", this.f289715c).f("maxOutboundMessageSize", this.f289716d).f("retryPolicy", this.f289717e).f("hedgingPolicy", this.f289718f).toString();
        }
    }

    static final class c extends io.grpc.x0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final q1 f289719b;

        @Override // io.grpc.x0
        public io.grpc.x0.b a(io.grpc.o1.h hVar) {
            return io.grpc.x0.b.e().b(this.f289719b).a();
        }

        private c(q1 q1Var) {
            this.f289719b = q1Var;
        }
    }

    q1(@fj.h b bVar, Map<String, b> map, Map<String, b> map2, @fj.h m2.e0 e0Var, @fj.h Object obj, @fj.h Map<String, ?> map3) {
        this.f289706a = bVar;
        this.f289707b = Collections.unmodifiableMap(new HashMap(map));
        this.f289708c = Collections.unmodifiableMap(new HashMap(map2));
        this.f289709d = e0Var;
        this.f289710e = obj;
        this.f289711f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    static q1 a() {
        return new q1(null, new HashMap(), new HashMap(), null, null, null);
    }

    static q1 b(Map<String, ?> map, boolean z10, int i10, int i11, @fj.h Object obj) {
        m2.e0 e0VarW = z10 ? e3.w(map) : null;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map<String, ?> mapB = e3.b(map);
        List<Map<String, ?>> listN = e3.n(map);
        if (listN == null) {
            return new q1(null, map2, map3, e0VarW, obj, mapB);
        }
        b bVar = null;
        for (Map<String, ?> map4 : listN) {
            b bVar2 = new b(map4, z10, i10, i11);
            List<Map<String, ?>> listP = e3.p(map4);
            if (listP != null && !listP.isEmpty()) {
                for (Map<String, ?> map5 : listP) {
                    String strU = e3.u(map5);
                    String strO = e3.o(map5);
                    if (com.google.common.base.r0.d(strU)) {
                        com.google.common.base.j0.u(com.google.common.base.r0.d(strO), "missing service name for method %s", strO);
                        com.google.common.base.j0.u(bVar == null, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else if (com.google.common.base.r0.d(strO)) {
                        com.google.common.base.j0.u(!map3.containsKey(strU), "Duplicate service %s", strU);
                        map3.put(strU, bVar2);
                    } else {
                        String strD = io.grpc.w1.d(strU, strO);
                        com.google.common.base.j0.u(!map2.containsKey(strD), "Duplicate method name %s", strD);
                        map2.put(strD, bVar2);
                    }
                }
            }
        }
        return new q1(bVar, map2, map3, e0VarW, obj, mapB);
    }

    @fj.h
    io.grpc.x0 c() {
        if (this.f289708c.isEmpty() && this.f289707b.isEmpty() && this.f289706a == null) {
            return null;
        }
        return new c();
    }

    @fj.h
    Map<String, ?> d() {
        return this.f289711f;
    }

    @fj.h
    @com.google.common.annotations.e
    Object e() {
        return this.f289710e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (com.google.common.base.d0.a(this.f289706a, q1Var.f289706a) && com.google.common.base.d0.a(this.f289707b, q1Var.f289707b) && com.google.common.base.d0.a(this.f289708c, q1Var.f289708c) && com.google.common.base.d0.a(this.f289709d, q1Var.f289709d) && com.google.common.base.d0.a(this.f289710e, q1Var.f289710e)) {
                return true;
            }
        }
        return false;
    }

    @fj.h
    b f(io.grpc.w1<?, ?> w1Var) {
        b bVar = this.f289707b.get(w1Var.f());
        if (bVar == null) {
            bVar = this.f289708c.get(w1Var.k());
        }
        return bVar == null ? this.f289706a : bVar;
    }

    @fj.h
    m2.e0 g() {
        return this.f289709d;
    }

    public int hashCode() {
        return com.google.common.base.d0.b(this.f289706a, this.f289707b, this.f289708c, this.f289709d, this.f289710e);
    }

    public String toString() {
        return com.google.common.base.b0.c(this).f("defaultMethodConfig", this.f289706a).f("serviceMethodMap", this.f289707b).f("serviceMap", this.f289708c).f("retryThrottling", this.f289709d).f("loadBalancingConfig", this.f289710e).toString();
    }
}
