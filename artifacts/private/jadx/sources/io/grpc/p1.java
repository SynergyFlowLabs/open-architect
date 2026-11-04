package io.grpc;

import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/1771")
public abstract class p1 extends o1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x1.c f290838a = x1.c.a(new a());

    private static final class a {
        a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public x1.c e(Map<String, ?> map) {
        return f290838a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return com.google.common.base.b0.c(this).f("policy", b()).d("priority", c()).g("available", d()).toString();
    }
}
