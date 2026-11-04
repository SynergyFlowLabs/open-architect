package io.grpc.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
final class c1 extends io.grpc.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<io.grpc.t2> f288930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, io.grpc.q2<?, ?>> f288931b;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<String, io.grpc.t2> f288932a = new LinkedHashMap();

        b() {
        }

        b a(io.grpc.t2 t2Var) {
            this.f288932a.put(t2Var.e().b(), t2Var);
            return this;
        }

        c1 b() {
            HashMap map = new HashMap();
            Iterator<io.grpc.t2> it = this.f288932a.values().iterator();
            while (it.hasNext()) {
                for (io.grpc.q2<?, ?> q2Var : it.next().d()) {
                    map.put(q2Var.b().f(), q2Var);
                }
            }
            return new c1(Collections.unmodifiableList(new ArrayList(this.f288932a.values())), Collections.unmodifiableMap(map));
        }
    }

    @Override // io.grpc.o0
    public List<io.grpc.t2> a() {
        return this.f288930a;
    }

    @Override // io.grpc.o0
    @fj.h
    public io.grpc.q2<?, ?> c(String str, @fj.h String str2) {
        return this.f288931b.get(str);
    }

    private c1(List<io.grpc.t2> list, Map<String, io.grpc.q2<?, ?>> map) {
        this.f288930a = list;
        this.f288931b = map;
    }
}
