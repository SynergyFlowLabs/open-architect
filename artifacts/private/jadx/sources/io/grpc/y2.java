package io.grpc;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes13.dex */
@fj.c
@gj.b
public final class y2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<y2> f291449d = h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y2 f291450e = b.OK.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y2 f291451f = b.CANCELLED.k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y2 f291452g = b.UNKNOWN.k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y2 f291453h = b.INVALID_ARGUMENT.k();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y2 f291454i = b.DEADLINE_EXCEEDED.k();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final y2 f291455j = b.NOT_FOUND.k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final y2 f291456k = b.ALREADY_EXISTS.k();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final y2 f291457l = b.PERMISSION_DENIED.k();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final y2 f291458m = b.UNAUTHENTICATED.k();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final y2 f291459n = b.RESOURCE_EXHAUSTED.k();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final y2 f291460o = b.FAILED_PRECONDITION.k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final y2 f291461p = b.ABORTED.k();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final y2 f291462q = b.OUT_OF_RANGE.k();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y2 f291463r = b.UNIMPLEMENTED.k();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y2 f291464s = b.INTERNAL.k();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y2 f291465t = b.UNAVAILABLE.k();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final y2 f291466u = b.DATA_LOSS.k();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final v1.i<y2> f291467v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final v1.m<String> f291468w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final v1.i<String> f291469x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f291470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f291471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f291472c;

    public enum b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f291490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f291491b;

        b(int i10) {
            this.f291490a = i10;
            this.f291491b = Integer.toString(i10).getBytes(com.google.common.base.f.f116530a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] n() {
            return this.f291491b;
        }

        public y2 k() {
            return (y2) y2.f291449d.get(this.f291490a);
        }

        public int l() {
            return this.f291490a;
        }
    }

    private static final class c implements v1.m<y2> {
        private c() {
        }

        @Override // io.grpc.v1.m
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public y2 b(byte[] bArr) {
            return y2.l(bArr);
        }

        @Override // io.grpc.v1.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(y2 y2Var) {
            return y2Var.p().n();
        }
    }

    private static final class d implements v1.m<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final byte[] f291492a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private d() {
        }

        private static boolean c(byte b10) {
            return b10 < 32 || b10 >= 126 || b10 == 37;
        }

        private static String e(byte[] bArr) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
            int i10 = 0;
            while (i10 < bArr.length) {
                if (bArr[i10] == 37 && i10 + 2 < bArr.length) {
                    try {
                        byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i10 + 1, 2, com.google.common.base.f.f116530a), 16));
                        i10 += 3;
                    } catch (NumberFormatException unused) {
                        byteBufferAllocate.put(bArr[i10]);
                        i10++;
                    }
                }
                byteBufferAllocate.put(bArr[i10]);
                i10++;
            }
            return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), com.google.common.base.f.f116532c);
        }

        private static byte[] g(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[((bArr.length - i10) * 3) + i10];
            if (i10 != 0) {
                int i11 = 4 >> 0;
                System.arraycopy(bArr, 0, bArr2, 0, i10);
            }
            int i12 = i10;
            while (i10 < bArr.length) {
                byte b10 = bArr[i10];
                if (c(b10)) {
                    bArr2[i12] = 37;
                    byte[] bArr3 = f291492a;
                    bArr2[i12 + 1] = bArr3[(b10 >> 4) & 15];
                    bArr2[i12 + 2] = bArr3[b10 & com.google.common.base.c.f116464q];
                    i12 += 3;
                } else {
                    bArr2[i12] = b10;
                    i12++;
                }
                i10++;
            }
            return Arrays.copyOf(bArr2, i12);
        }

        @Override // io.grpc.v1.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String b(byte[] bArr) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                if (b10 < 32 || b10 >= 126 || (b10 == 37 && i10 + 2 < bArr.length)) {
                    return e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // io.grpc.v1.m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public byte[] a(String str) {
            byte[] bytes = str.getBytes(com.google.common.base.f.f116532c);
            for (int i10 = 0; i10 < bytes.length; i10++) {
                if (c(bytes[i10])) {
                    return g(bytes, i10);
                }
            }
            return bytes;
        }
    }

    static {
        f291467v = v1.i.i("grpc-status", false, new c());
        d dVar = new d();
        f291468w = dVar;
        f291469x = v1.i.i("grpc-message", false, dVar);
    }

    private y2(b bVar) {
        this(bVar, null, null);
    }

    private static List<y2> h() {
        TreeMap treeMap = new TreeMap();
        for (b bVar : b.values()) {
            y2 y2Var = (y2) treeMap.put(Integer.valueOf(bVar.l()), new y2(bVar));
            if (y2Var != null) {
                throw new IllegalStateException("Code value duplication between " + y2Var.p().name() + " & " + bVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    static String i(y2 y2Var) {
        if (y2Var.f291471b == null) {
            return y2Var.f291470a.toString();
        }
        return y2Var.f291470a + ": " + y2Var.f291471b;
    }

    public static y2 j(b bVar) {
        return bVar.k();
    }

    public static y2 k(int i10) {
        if (i10 >= 0) {
            List<y2> list = f291449d;
            if (i10 < list.size()) {
                return list.get(i10);
            }
        }
        return f291452g.u("Unknown code " + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y2 l(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] == 48) ? f291450e : m(bArr);
    }

    private static y2 m(byte[] bArr) {
        int i10;
        byte b10;
        int length = bArr.length;
        char c10 = 0;
        if (length != 1) {
            if (length == 2 && (b10 = bArr[0]) >= 48 && b10 <= 57) {
                i10 = (b10 - 48) * 10;
                c10 = 1;
            }
            return f291452g.u("Unknown code " + new String(bArr, com.google.common.base.f.f116530a));
        }
        i10 = 0;
        byte b11 = bArr[c10];
        if (b11 >= 48 && b11 <= 57) {
            int i11 = i10 + (b11 - 48);
            List<y2> list = f291449d;
            if (i11 < list.size()) {
                return list.get(i11);
            }
        }
        return f291452g.u("Unknown code " + new String(bArr, com.google.common.base.f.f116530a));
    }

    public static y2 n(Throwable th2) {
        for (Throwable cause = (Throwable) com.google.common.base.j0.F(th2, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof z2) {
                return ((z2) cause).a();
            }
            if (cause instanceof a3) {
                return ((a3) cause).a();
            }
        }
        return f291452g.t(th2);
    }

    @fj.h
    public static v1 s(Throwable th2) {
        for (Throwable cause = (Throwable) com.google.common.base.j0.F(th2, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof z2) {
                return ((z2) cause).b();
            }
            if (cause instanceof a3) {
                return ((a3) cause).b();
            }
        }
        return null;
    }

    public z2 c() {
        return new z2(this);
    }

    public z2 d(@fj.h v1 v1Var) {
        return new z2(this, v1Var);
    }

    public a3 e() {
        return new a3(this);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public a3 f(@fj.h v1 v1Var) {
        return new a3(this, v1Var);
    }

    public y2 g(String str) {
        if (str == null) {
            return this;
        }
        if (this.f291471b == null) {
            return new y2(this.f291470a, str, this.f291472c);
        }
        return new y2(this.f291470a, this.f291471b + "\n" + str, this.f291472c);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @fj.h
    public Throwable o() {
        return this.f291472c;
    }

    public b p() {
        return this.f291470a;
    }

    @fj.h
    public String q() {
        return this.f291471b;
    }

    public boolean r() {
        return b.OK == this.f291470a;
    }

    public y2 t(Throwable th2) {
        return com.google.common.base.d0.a(this.f291472c, th2) ? this : new y2(this.f291470a, this.f291471b, th2);
    }

    public String toString() {
        com.google.common.base.b0.b bVarF = com.google.common.base.b0.c(this).f("code", this.f291470a.name()).f("description", this.f291471b);
        Throwable th2 = this.f291472c;
        Object objL = th2;
        if (th2 != null) {
            objL = com.google.common.base.v0.l(th2);
        }
        return bVarF.f("cause", objL).toString();
    }

    public y2 u(String str) {
        return com.google.common.base.d0.a(this.f291471b, str) ? this : new y2(this.f291470a, str, this.f291472c);
    }

    private y2(b bVar, @fj.h String str, @fj.h Throwable th2) {
        this.f291470a = (b) com.google.common.base.j0.F(bVar, "code");
        this.f291471b = str;
        this.f291472c = th2;
    }
}
