package io.grpc.protobuf.lite;

import com.google.common.annotations.e;
import com.google.common.base.j0;
import com.google.protobuf.f3;
import com.google.protobuf.n2;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import io.grpc.e0;
import io.grpc.n1;
import io.grpc.v1;
import io.grpc.w1;
import io.grpc.y2;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
@e0("Will remain experimental as protobuf lite API is not stable")
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile v0 f290851a = v0.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f290852b = 8192;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    static final int f290853c = 4194304;

    private static final class a<T extends n2> implements w1.e<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ThreadLocal<Reference<byte[]>> f290854d = new ThreadLocal<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f3<T> f290855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f290856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f290857c;

        a(T t10, int i10) {
            this.f290856b = (T) j0.F(t10, "defaultInstance cannot be null");
            this.f290855a = (f3<T>) t10.W7();
            this.f290857c = i10;
        }

        private T g(z zVar) throws t1 {
            T tQ = this.f290855a.q(zVar, b.f290851a);
            try {
                zVar.a(0);
                return tQ;
            } catch (t1 e10) {
                e10.l(tQ);
                throw e10;
            }
        }

        @Override // io.grpc.w1.f
        public Class<T> c() {
            return (Class<T>) this.f290856b.getClass();
        }

        @Override // io.grpc.w1.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public T d() {
            return this.f290856b;
        }

        @Override // io.grpc.w1.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public T a(InputStream inputStream) {
            z zVarK;
            byte[] bArr;
            int i10;
            if ((inputStream instanceof io.grpc.protobuf.lite.a) && ((io.grpc.protobuf.lite.a) inputStream).c() == this.f290855a) {
                try {
                    return (T) ((io.grpc.protobuf.lite.a) inputStream).b();
                } catch (IllegalStateException unused) {
                }
            }
            try {
                if (inputStream instanceof n1) {
                    int iAvailable = inputStream.available();
                    if (iAvailable <= 0 || iAvailable > 4194304) {
                        if (iAvailable == 0) {
                            return this.f290856b;
                        }
                        zVarK = null;
                    } else {
                        ThreadLocal<Reference<byte[]>> threadLocal = f290854d;
                        Reference<byte[]> reference = threadLocal.get();
                        if (reference == null || (bArr = reference.get()) == null || bArr.length < iAvailable) {
                            bArr = new byte[iAvailable];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i11 = iAvailable;
                        while (i11 > 0 && (i10 = inputStream.read(bArr, iAvailable - i11, i11)) != -1) {
                            i11 -= i10;
                        }
                        if (i11 != 0) {
                            throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i11));
                        }
                        zVarK = z.r(bArr, 0, iAvailable);
                    }
                } else {
                    zVarK = null;
                }
                if (zVarK == null) {
                    zVarK = z.k(inputStream);
                }
                zVarK.f0(Integer.MAX_VALUE);
                int i12 = this.f290857c;
                if (i12 >= 0) {
                    zVarK.e0(i12);
                }
                try {
                    return (T) g(zVarK);
                } catch (t1 e10) {
                    throw y2.f291464s.u("Invalid protobuf byte sequence").t(e10).e();
                }
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // io.grpc.w1.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public InputStream b(T t10) {
            return new io.grpc.protobuf.lite.a(t10, this.f290855a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.protobuf.lite.b$b, reason: collision with other inner class name */
    private static final class C1986b<T extends n2> implements v1.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f290858a;

        C1986b(T t10) {
            this.f290858a = t10;
        }

        @Override // io.grpc.v1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public T b(byte[] bArr) {
            try {
                return (T) this.f290858a.W7().w(bArr, b.f290851a);
            } catch (t1 e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        @Override // io.grpc.v1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(T t10) {
            return t10.H0();
        }
    }

    private b() {
    }

    static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        j0.F(inputStream, "inputStream cannot be null!");
        j0.F(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static <T extends n2> w1.c<T> b(T t10) {
        return new a(t10, -1);
    }

    @e0("https://github.com/grpc/grpc-java/issues/10108")
    public static <T extends n2> w1.c<T> c(T t10, int i10) {
        return new a(t10, i10);
    }

    public static <T extends n2> v1.f<T> d(T t10) {
        return new C1986b(t10);
    }

    public static void e(v0 v0Var) {
        f290851a = (v0) j0.F(v0Var, "newRegistry");
    }
}
