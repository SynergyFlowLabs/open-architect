package io.grpc;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
@t0
public final class c1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicLong f288693d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f288694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.h
    private final String f288695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f288696c;

    c1(String str, String str2, long j10) {
        com.google.common.base.j0.F(str, "typeName");
        com.google.common.base.j0.e(!str.isEmpty(), "empty type");
        this.f288694a = str;
        this.f288695b = str2;
        this.f288696c = j10;
    }

    public static c1 a(Class<?> cls, @fj.h String str) {
        return b(c(cls), str);
    }

    public static c1 b(String str, @fj.h String str2) {
        return new c1(str, str2, f());
    }

    private static String c(Class<?> cls) {
        String simpleName = ((Class) com.google.common.base.j0.F(cls, "type")).getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    static long f() {
        return f288693d.incrementAndGet();
    }

    @fj.h
    public String d() {
        return this.f288695b;
    }

    public long e() {
        return this.f288696c;
    }

    public String g() {
        return this.f288694a;
    }

    public String h() {
        return this.f288694a + "<" + this.f288696c + ">";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h());
        if (this.f288695b != null) {
            sb2.append(": (");
            sb2.append(this.f288695b);
            sb2.append(')');
        }
        return sb2.toString();
    }
}
