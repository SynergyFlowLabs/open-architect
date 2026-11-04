package io.grpc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w2 f290977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, q2<?, ?>> f290978b;

    public static b a(w2 w2Var) {
        return new b(w2Var);
    }

    public static b b(String str) {
        return new b(str);
    }

    @t0
    public q2<?, ?> c(String str) {
        return this.f290978b.get(str);
    }

    public Collection<q2<?, ?>> d() {
        return this.f290978b.values();
    }

    public w2 e() {
        return this.f290977a;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f290979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w2 f290980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<String, q2<?, ?>> f290981c;

        public <ReqT, RespT> b a(w1<ReqT, RespT> w1Var, m2<ReqT, RespT> m2Var) {
            return b(q2.a((w1) com.google.common.base.j0.F(w1Var, "method must not be null"), (m2) com.google.common.base.j0.F(m2Var, "handler must not be null")));
        }

        public <ReqT, RespT> b b(q2<ReqT, RespT> q2Var) {
            w1<ReqT, RespT> w1VarB = q2Var.b();
            com.google.common.base.j0.y(this.f290979a.equals(w1VarB.k()), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", this.f290979a, w1VarB.f());
            String strF = w1VarB.f();
            com.google.common.base.j0.x0(!this.f290981c.containsKey(strF), "Method by same name already registered: %s", strF);
            this.f290981c.put(strF, q2Var);
            return this;
        }

        public t2 c() {
            w2 w2Var = this.f290980b;
            if (w2Var == null) {
                ArrayList arrayList = new ArrayList(this.f290981c.size());
                Iterator<q2<?, ?>> it = this.f290981c.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().b());
                }
                w2Var = new w2(this.f290979a, arrayList);
            }
            HashMap map = new HashMap(this.f290981c);
            for (w1<?, ?> w1Var : w2Var.a()) {
                q2 q2Var = (q2) map.remove(w1Var.f());
                if (q2Var == null) {
                    throw new IllegalStateException("No method bound for descriptor entry " + w1Var.f());
                }
                if (q2Var.b() != w1Var) {
                    throw new IllegalStateException("Bound method for " + w1Var.f() + " not same instance as method in service descriptor");
                }
            }
            if (map.size() <= 0) {
                return new t2(w2Var, this.f290981c);
            }
            throw new IllegalStateException("No entry in descriptor matching bound method " + ((q2) map.values().iterator().next()).b().f());
        }

        private b(String str) {
            this.f290981c = new HashMap();
            this.f290979a = (String) com.google.common.base.j0.F(str, "serviceName");
            this.f290980b = null;
        }

        private b(w2 w2Var) {
            this.f290981c = new HashMap();
            this.f290980b = (w2) com.google.common.base.j0.F(w2Var, "serviceDescriptor");
            this.f290979a = w2Var.b();
        }
    }

    private t2(w2 w2Var, Map<String, q2<?, ?>> map) {
        this.f290977a = (w2) com.google.common.base.j0.F(w2Var, "serviceDescriptor");
        this.f290978b = Collections.unmodifiableMap(new HashMap(map));
    }
}
