package io.grpc.util;

import io.grpc.e0;
import io.grpc.o0;
import io.grpc.q2;
import io.grpc.t2;
import io.grpc.w1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
public final class k extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<String, t2> f291062a = new ConcurrentHashMap();

    @Override // io.grpc.o0
    @e0("https://github.com/grpc/grpc-java/issues/2222")
    public List<t2> a() {
        return Collections.unmodifiableList(new ArrayList(this.f291062a.values()));
    }

    @Override // io.grpc.o0
    @fj.h
    public q2<?, ?> c(String str, @fj.h String str2) {
        t2 t2Var;
        String strC = w1.c(str);
        if (strC == null || (t2Var = this.f291062a.get(strC)) == null) {
            return null;
        }
        return t2Var.c(str);
    }

    @fj.h
    public t2 d(io.grpc.c cVar) {
        return e(cVar.a());
    }

    @fj.h
    public t2 e(t2 t2Var) {
        return this.f291062a.put(t2Var.e().b(), t2Var);
    }

    public boolean f(t2 t2Var) {
        return this.f291062a.remove(t2Var.e().b(), t2Var);
    }
}
