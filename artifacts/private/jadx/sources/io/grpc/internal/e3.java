package io.grpc.internal;

import io.sentry.k4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class e3 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f289127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, ?> f289128b;

        public a(String str, Map<String, ?> map) {
            this.f289127a = (String) com.google.common.base.j0.F(str, "policyName");
            this.f289128b = (Map) com.google.common.base.j0.F(map, "rawConfigValue");
        }

        public String a() {
            return this.f289127a;
        }

        public Map<String, ?> b() {
            return this.f289128b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f289127a.equals(aVar.f289127a) && this.f289128b.equals(aVar.f289128b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.base.d0.b(this.f289127a, this.f289128b);
        }

        public String toString() {
            return com.google.common.base.b0.c(this).f("policyName", this.f289127a).f("rawConfigValue", this.f289128b).toString();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.grpc.p1 f289129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        final Object f289130b;

        public b(io.grpc.p1 p1Var, @fj.h Object obj) {
            this.f289129a = (io.grpc.p1) com.google.common.base.j0.F(p1Var, "provider");
            this.f289130b = obj;
        }

        @fj.h
        public Object a() {
            return this.f289130b;
        }

        public io.grpc.p1 b() {
            return this.f289129a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (com.google.common.base.d0.a(this.f289129a, bVar.f289129a) && com.google.common.base.d0.a(this.f289130b, bVar.f289130b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.base.d0.b(this.f289129a, this.f289130b);
        }

        public String toString() {
            return com.google.common.base.b0.c(this).f("provider", this.f289129a).f("config", this.f289130b).toString();
        }
    }

    private e3() {
    }

    public static a A(Map<String, ?> map) {
        if (map.size() == 1) {
            String key = map.entrySet().iterator().next().getKey();
            return new a(key, h1.l(map, key));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }

    public static List<a> B(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, ?>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A(it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @fj.h
    static Double a(Map<String, ?> map) {
        return h1.h(map, "backoffMultiplier");
    }

    @fj.h
    public static Map<String, ?> b(@fj.h Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return h1.l(map, "healthCheckConfig");
    }

    @fj.h
    public static String c(@fj.h Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return h1.m(map, "serviceName");
    }

    @fj.h
    static Long d(Map<String, ?> map) {
        return h1.n(map, "hedgingDelay");
    }

    @fj.h
    static Map<String, ?> e(Map<String, ?> map) {
        return h1.l(map, "hedgingPolicy");
    }

    @fj.h
    static Long f(Map<String, ?> map) {
        return h1.n(map, "initialBackoff");
    }

    private static Set<io.grpc.y2.b> g(Map<String, ?> map, String str) {
        List<?> listE = h1.e(map, str);
        if (listE == null) {
            return null;
        }
        return v(listE);
    }

    @com.google.common.annotations.e
    public static List<Map<String, ?>> h(Map<String, ?> map) {
        String strM;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(h1.f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (strM = h1.m(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(strM.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @fj.h
    static Integer i(Map<String, ?> map) {
        return h1.j(map, "maxAttempts");
    }

    @fj.h
    static Integer j(Map<String, ?> map) {
        return h1.j(map, "maxAttempts");
    }

    @fj.h
    static Long k(Map<String, ?> map) {
        return h1.n(map, "maxBackoff");
    }

    @fj.h
    static Integer l(Map<String, ?> map) {
        return h1.j(map, "maxRequestMessageBytes");
    }

    @fj.h
    static Integer m(Map<String, ?> map) {
        return h1.j(map, "maxResponseMessageBytes");
    }

    @fj.h
    static List<Map<String, ?>> n(Map<String, ?> map) {
        return h1.f(map, "methodConfig");
    }

    @fj.h
    static String o(Map<String, ?> map) {
        return h1.m(map, "method");
    }

    @fj.h
    static List<Map<String, ?>> p(Map<String, ?> map) {
        return h1.f(map, "name");
    }

    static Set<io.grpc.y2.b> q(Map<String, ?> map) {
        Set<io.grpc.y2.b> setG = g(map, "nonFatalStatusCodes");
        if (setG == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(io.grpc.y2.b.class));
        }
        com.google.common.base.y0.q(!setG.contains(io.grpc.y2.b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return setG;
    }

    @fj.h
    static Long r(Map<String, ?> map) {
        return h1.n(map, "perAttemptRecvTimeout");
    }

    @fj.h
    static Map<String, ?> s(Map<String, ?> map) {
        return h1.l(map, "retryPolicy");
    }

    static Set<io.grpc.y2.b> t(Map<String, ?> map) {
        Set<io.grpc.y2.b> setG = g(map, "retryableStatusCodes");
        com.google.common.base.y0.q(setG != null, "%s is required in retry policy", "retryableStatusCodes");
        com.google.common.base.y0.q(true ^ setG.contains(io.grpc.y2.b.OK), "%s must not contain OK", "retryableStatusCodes");
        return setG;
    }

    @fj.h
    static String u(Map<String, ?> map) {
        return h1.m(map, androidx.core.app.w.Q0);
    }

    private static Set<io.grpc.y2.b> v(List<?> list) {
        io.grpc.y2.b bVarValueOf;
        EnumSet enumSetNoneOf = EnumSet.noneOf(io.grpc.y2.b.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                int iIntValue = d10.intValue();
                com.google.common.base.y0.q(((double) iIntValue) == d10.doubleValue(), "Status code %s is not integral", obj);
                bVarValueOf = io.grpc.y2.k(iIntValue).p();
                com.google.common.base.y0.q(bVarValueOf.l() == d10.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new com.google.common.base.z0("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    bVarValueOf = io.grpc.y2.b.valueOf((String) obj);
                } catch (IllegalArgumentException e10) {
                    throw new com.google.common.base.z0("Status code " + obj + " is not valid", e10);
                }
            }
            enumSetNoneOf.add(bVarValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    @fj.h
    static m2.e0 w(@fj.h Map<String, ?> map) {
        Map<String, ?> mapL;
        if (map == null || (mapL = h1.l(map, "retryThrottling")) == null) {
            return null;
        }
        float fFloatValue = h1.h(mapL, "maxTokens").floatValue();
        float fFloatValue2 = h1.h(mapL, "tokenRatio").floatValue();
        int i10 = 6 << 1;
        com.google.common.base.j0.h0(fFloatValue > 0.0f, "maxToken should be greater than zero");
        com.google.common.base.j0.h0(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new m2.e0(fFloatValue, fFloatValue2);
    }

    @fj.h
    static Long x(Map<String, ?> map) {
        return h1.n(map, k4.f305718l3);
    }

    @fj.h
    static Boolean y(Map<String, ?> map) {
        return h1.d(map, "waitForReady");
    }

    public static io.grpc.x1.c z(List<a> list, io.grpc.q1 q1Var) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            String strA = aVar.a();
            io.grpc.p1 p1VarE = q1Var.e(strA);
            if (p1VarE != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(e3.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                io.grpc.x1.c cVarE = p1VarE.e(aVar.b());
                return cVarE.d() != null ? cVarE : io.grpc.x1.c.a(new b(p1VarE, cVarE.c()));
            }
            arrayList.add(strA);
        }
        return io.grpc.x1.c.b(io.grpc.y2.f291452g.u("None of " + arrayList + " specified by Service Config are available."));
    }
}
