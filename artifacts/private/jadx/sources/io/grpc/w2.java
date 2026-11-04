package io.grpc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f291401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection<w1<?, ?>> f291402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f291403c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f291404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<w1<?, ?>> f291405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f291406c;

        /* JADX INFO: Access modifiers changed from: private */
        public b e(Collection<w1<?, ?>> collection) {
            this.f291405b.addAll(collection);
            return this;
        }

        public b f(w1<?, ?> w1Var) {
            this.f291405b.add((w1) com.google.common.base.j0.F(w1Var, "method"));
            return this;
        }

        public w2 g() {
            return new w2(this);
        }

        @e0("https://github.com/grpc/grpc-java/issues/2666")
        public b h(String str) {
            this.f291404a = (String) com.google.common.base.j0.F(str, "name");
            return this;
        }

        public b i(@fj.h Object obj) {
            this.f291406c = obj;
            return this;
        }

        private b(String str) {
            this.f291405b = new ArrayList();
            h(str);
        }
    }

    public static b d(String str) {
        return new b(str);
    }

    static void e(String str, Collection<w1<?, ?>> collection) {
        HashSet hashSet = new HashSet(collection.size());
        for (w1<?, ?> w1Var : collection) {
            com.google.common.base.j0.F(w1Var, "method");
            String strK = w1Var.k();
            com.google.common.base.j0.y(str.equals(strK), "service names %s != %s", strK, str);
            com.google.common.base.j0.u(hashSet.add(w1Var.f()), "duplicate name %s", w1Var.f());
        }
    }

    public Collection<w1<?, ?>> a() {
        return this.f291402b;
    }

    public String b() {
        return this.f291401a;
    }

    @fj.h
    @e0("https://github.com/grpc/grpc-java/issues/2222")
    public Object c() {
        return this.f291403c;
    }

    public String toString() {
        return com.google.common.base.b0.c(this).f("name", this.f291401a).f("schemaDescriptor", this.f291403c).f("methods", this.f291402b).v().toString();
    }

    public w2(String str, w1<?, ?>... w1VarArr) {
        this(str, Arrays.asList(w1VarArr));
    }

    public w2(String str, Collection<w1<?, ?>> collection) {
        this(d(str).e((Collection) com.google.common.base.j0.F(collection, "methods")));
    }

    private w2(b bVar) {
        String str = bVar.f291404a;
        this.f291401a = str;
        e(str, bVar.f291405b);
        this.f291402b = Collections.unmodifiableList(new ArrayList(bVar.f291405b));
        this.f291403c = bVar.f291406c;
    }
}
