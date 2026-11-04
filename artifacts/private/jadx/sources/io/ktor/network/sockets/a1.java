package io.ktor.network.sockets;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.q1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@oj.g
public final class a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f296207b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte f296208c = g((byte) 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte f296209d = g((byte) 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte f296210e = g((byte) 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte f296211f = g((byte) 8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f296212g = g(com.google.common.base.c.f116465r);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f296213a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final byte a() {
            return a1.f296209d;
        }

        public final byte b() {
            return a1.f296212g;
        }

        public final byte c() {
            return a1.f296210e;
        }

        public final byte d() {
            return a1.f296211f;
        }

        public final byte e() {
            return a1.f296208c;
        }

        private a() {
        }
    }

    private /* synthetic */ a1(byte b10) {
        this.f296213a = b10;
    }

    public static final /* synthetic */ a1 f(byte b10) {
        return new a1(b10);
    }

    public static byte g(byte b10) {
        return b10;
    }

    public static byte h(int i10) {
        return g(q1.n((byte) i10));
    }

    public static boolean i(byte b10, Object obj) {
        return (obj instanceof a1) && b10 == ((a1) obj).o();
    }

    public static final boolean j(byte b10, byte b11) {
        return q1.v(b10, b11);
    }

    public static final int k(byte b10) {
        return b10 & 255;
    }

    public static int m(byte b10) {
        return q1.H(b10);
    }

    public static String n(byte b10) {
        return "TypeOfService(value=" + ((Object) q1.s0(b10)) + ')';
    }

    public boolean equals(Object obj) {
        return i(this.f296213a, obj);
    }

    public int hashCode() {
        return m(this.f296213a);
    }

    public final byte l() {
        return this.f296213a;
    }

    public final /* synthetic */ byte o() {
        return this.f296213a;
    }

    public String toString() {
        return n(this.f296213a);
    }
}
