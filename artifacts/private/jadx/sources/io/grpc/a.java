package io.grpc;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
@gj.b
@e0("https://github.com/grpc/grpc-java/issues/1764")
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final IdentityHashMap<c<?>, Object> f288672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f288673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f288674d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IdentityHashMap<c<?>, Object> f288675a;

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f288676c = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f288677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IdentityHashMap<c<?>, Object> f288678b;

        private IdentityHashMap<c<?>, Object> b(int i10) {
            if (this.f288678b == null) {
                this.f288678b = new IdentityHashMap<>(i10);
            }
            return this.f288678b;
        }

        public a a() {
            if (this.f288678b != null) {
                for (Map.Entry entry : this.f288677a.f288675a.entrySet()) {
                    if (!this.f288678b.containsKey(entry.getKey())) {
                        this.f288678b.put((c) entry.getKey(), entry.getValue());
                    }
                }
                this.f288677a = new a(this.f288678b);
                this.f288678b = null;
            }
            return this.f288677a;
        }

        @e0("https://github.com/grpc/grpc-java/issues/5777")
        public <T> b c(c<T> cVar) {
            if (this.f288677a.f288675a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f288677a.f288675a);
                identityHashMap.remove(cVar);
                this.f288677a = new a(identityHashMap);
            }
            IdentityHashMap<c<?>, Object> identityHashMap2 = this.f288678b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(cVar);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <T> b d(c<T> cVar, T t10) {
            b(1).put(cVar, t10);
            return this;
        }

        public b e(a aVar) {
            b(aVar.f288675a.size()).putAll(aVar.f288675a);
            return this;
        }

        private b(a aVar) {
            this.f288677a = aVar;
        }
    }

    @gj.b
    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f288679a;

        private c(String str) {
            this.f288679a = str;
        }

        public static <T> c<T> a(String str) {
            return new c<>(str);
        }

        @Deprecated
        public static <T> c<T> b(String str) {
            return new c<>(str);
        }

        public String toString() {
            return this.f288679a;
        }
    }

    static {
        IdentityHashMap<c<?>, Object> identityHashMap = new IdentityHashMap<>();
        f288672b = identityHashMap;
        f288673c = new a(identityHashMap);
    }

    public static b e() {
        return new b();
    }

    @Deprecated
    public static b f(a aVar) {
        com.google.common.base.j0.F(aVar, androidx.media3.extractor.text.ttml.c.Y);
        return new b();
    }

    @fj.h
    public <T> T b(c<T> cVar) {
        return (T) this.f288675a.get(cVar);
    }

    @Deprecated
    public Set<c<?>> c() {
        return Collections.unmodifiableSet(this.f288675a.keySet());
    }

    Set<c<?>> d() {
        return Collections.unmodifiableSet(this.f288675a.keySet());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f288675a.size() != aVar.f288675a.size()) {
            return false;
        }
        for (Map.Entry<c<?>, Object> entry : this.f288675a.entrySet()) {
            if (aVar.f288675a.containsKey(entry.getKey()) && com.google.common.base.d0.a(entry.getValue(), aVar.f288675a.get(entry.getKey()))) {
            }
            return false;
        }
        return true;
    }

    public b g() {
        return new b();
    }

    public int hashCode() {
        int iB = 0;
        for (Map.Entry<c<?>, Object> entry : this.f288675a.entrySet()) {
            iB += com.google.common.base.d0.b(entry.getKey(), entry.getValue());
        }
        return iB;
    }

    public String toString() {
        return this.f288675a.toString();
    }

    private a(IdentityHashMap<c<?>, Object> identityHashMap) {
        this.f288675a = identityHashMap;
    }
}
