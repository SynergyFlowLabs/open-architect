package io.grpc;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
@gj.c
public final class v1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f291321d = "-bin";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f291325h = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f291326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f291327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f291320c = Logger.getLogger(v1.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f<byte[]> f291322e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d<String> f291323f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final com.google.common.io.b f291324g = com.google.common.io.b.d().w();

    class a implements f<byte[]> {
        a() {
        }

        @Override // io.grpc.v1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(byte[] bArr) {
            return bArr;
        }

        @Override // io.grpc.v1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(byte[] bArr) {
            return bArr;
        }
    }

    class b implements d<String> {
        b() {
        }

        @Override // io.grpc.v1.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String b(String str) {
            return str;
        }

        @Override // io.grpc.v1.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a(String str) {
            return str;
        }
    }

    private static class c<T> extends i<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final d<T> f291328f;

        /* synthetic */ c(String str, boolean z10, d dVar, a aVar) {
            this(str, z10, dVar);
        }

        @Override // io.grpc.v1.i
        T k(byte[] bArr) {
            return this.f291328f.b(new String(bArr, com.google.common.base.f.f116530a));
        }

        @Override // io.grpc.v1.i
        byte[] m(T t10) {
            return ((String) com.google.common.base.j0.F(this.f291328f.a(t10), "null marshaller.toAsciiString()")).getBytes(com.google.common.base.f.f116530a);
        }

        private c(String str, boolean z10, d<T> dVar) {
            super(str, z10, dVar, null);
            com.google.common.base.j0.y(!str.endsWith(v1.f291321d), "ASCII header is named %s.  Only binary headers may end with %s", str, v1.f291321d);
            this.f291328f = (d) com.google.common.base.j0.F(dVar, "marshaller");
        }
    }

    public interface d<T> {
        String a(T t10);

        T b(String str);
    }

    private static class e<T> extends i<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final f<T> f291329f;

        /* synthetic */ e(String str, f fVar, a aVar) {
            this(str, fVar);
        }

        @Override // io.grpc.v1.i
        T k(byte[] bArr) {
            return this.f291329f.b(bArr);
        }

        @Override // io.grpc.v1.i
        byte[] m(T t10) {
            return (byte[]) com.google.common.base.j0.F(this.f291329f.a(t10), "null marshaller.toBytes()");
        }

        private e(String str, f<T> fVar) {
            super(str, false, fVar, null);
            com.google.common.base.j0.y(str.endsWith(v1.f291321d), "Binary header is named %s. It must end with %s", str, v1.f291321d);
            com.google.common.base.j0.e(str.length() > 4, "empty key name");
            this.f291329f = (f) com.google.common.base.j0.F(fVar, "marshaller is null");
        }
    }

    public interface f<T> {
        byte[] a(T t10);

        T b(byte[] bArr);
    }

    @e0("https://github.com/grpc/grpc-java/issues/6575")
    public interface g<T> {
        InputStream a(T t10);

        T b(InputStream inputStream);
    }

    private final class h<T> implements Iterable<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i<T> f291330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f291331b;

        class a implements Iterator<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f291333a = true;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f291334b;

            a() {
                this.f291334b = h.this.f291331b;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f291333a) {
                    return true;
                }
                while (this.f291334b < v1.this.f291327b) {
                    h hVar = h.this;
                    if (v1.this.g(hVar.f291330a.a(), v1.this.v(this.f291334b))) {
                        this.f291333a = true;
                        return true;
                    }
                    this.f291334b++;
                }
                return false;
            }

            @Override // java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f291333a = false;
                h hVar = h.this;
                v1 v1Var = v1.this;
                int i10 = this.f291334b;
                this.f291334b = i10 + 1;
                return (T) v1Var.H(i10, hVar.f291330a);
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* synthetic */ h(v1 v1Var, i iVar, int i10, a aVar) {
            this(iVar, i10);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new a();
        }

        private h(i<T> iVar, int i10) {
            this.f291330a = iVar;
            this.f291331b = i10;
        }
    }

    @gj.b
    public static abstract class i<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final BitSet f291336e = b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f291337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f291338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f291339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f291340d;

        /* synthetic */ i(String str, boolean z10, Object obj, a aVar) {
            this(str, z10, obj);
        }

        private static BitSet b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c10 = org.locationtech.jts.geom.l.f338160j; c10 <= '9'; c10 = (char) (c10 + 1)) {
                bitSet.set(c10);
            }
            for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
                bitSet.set(c11);
            }
            return bitSet;
        }

        public static <T> i<T> e(String str, d<T> dVar) {
            return h(str, false, dVar);
        }

        public static <T> i<T> f(String str, f<T> fVar) {
            return new e(str, fVar, null);
        }

        @e0("https://github.com/grpc/grpc-java/issues/6575")
        public static <T> i<T> g(String str, g<T> gVar) {
            return new j(str, gVar, null);
        }

        static <T> i<T> h(String str, boolean z10, d<T> dVar) {
            return new c(str, z10, dVar, null);
        }

        static <T> i<T> i(String str, boolean z10, m<T> mVar) {
            return new l(str, z10, mVar, null);
        }

        private static String n(String str, boolean z10) {
            com.google.common.base.j0.F(str, "name");
            com.google.common.base.j0.e(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                v1.f291320c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (!z10 || cCharAt != ':' || i10 != 0) {
                    com.google.common.base.j0.j(f291336e.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, str);
                }
            }
            return str;
        }

        @com.google.common.annotations.e
        byte[] a() {
            return this.f291339c;
        }

        @fj.h
        final <M> M c(Class<M> cls) {
            if (cls.isInstance(this.f291340d)) {
                return cls.cast(this.f291340d);
            }
            return null;
        }

        public final String d() {
            return this.f291338b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f291338b.equals(((i) obj).f291338b);
        }

        public final int hashCode() {
            return this.f291338b.hashCode();
        }

        public final String j() {
            return this.f291337a;
        }

        abstract T k(byte[] bArr);

        boolean l() {
            return false;
        }

        abstract byte[] m(T t10);

        public String toString() {
            return "Key{name='" + this.f291338b + "'}";
        }

        private i(String str, boolean z10, Object obj) {
            String str2 = (String) com.google.common.base.j0.F(str, "name");
            this.f291337a = str2;
            String strN = n(str2.toLowerCase(Locale.ROOT), z10);
            this.f291338b = strN;
            this.f291339c = strN.getBytes(com.google.common.base.f.f116530a);
            this.f291340d = obj;
        }
    }

    private static class j<T> extends i<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final g<T> f291341f;

        /* synthetic */ j(String str, g gVar, a aVar) {
            this(str, gVar);
        }

        @Override // io.grpc.v1.i
        T k(byte[] bArr) {
            return this.f291341f.b(new ByteArrayInputStream(bArr));
        }

        @Override // io.grpc.v1.i
        boolean l() {
            return true;
        }

        @Override // io.grpc.v1.i
        byte[] m(T t10) {
            return v1.B((InputStream) com.google.common.base.j0.F(this.f291341f.a(t10), "null marshaller.toStream()"));
        }

        private j(String str, g<T> gVar) {
            super(str, false, gVar, null);
            com.google.common.base.j0.y(str.endsWith(v1.f291321d), "Binary header is named %s. It must end with %s", str, v1.f291321d);
            int i10 = 6 << 4;
            com.google.common.base.j0.e(str.length() > 4, "empty key name");
            this.f291341f = (g) com.google.common.base.j0.F(gVar, "marshaller is null");
        }
    }

    static final class k<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g<T> f291342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f291343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile byte[] f291344c;

        k(g<T> gVar, T t10) {
            this.f291342a = gVar;
            this.f291343b = t10;
        }

        static <T> k<T> a(i<T> iVar, T t10) {
            return new k<>((g) com.google.common.base.j0.E(b(iVar)), t10);
        }

        @fj.h
        private static <T> g<T> b(i<T> iVar) {
            return (g) iVar.c(g.class);
        }

        byte[] c() {
            if (this.f291344c == null) {
                synchronized (this) {
                    try {
                        if (this.f291344c == null) {
                            this.f291344c = v1.B(e());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f291344c;
        }

        <T2> T2 d(i<T2> iVar) {
            g gVarB;
            return (!iVar.l() || (gVarB = b(iVar)) == null) ? iVar.k(c()) : (T2) gVarB.b(e());
        }

        InputStream e() {
            return (InputStream) com.google.common.base.j0.F(this.f291342a.a(this.f291343b), "null marshaller.toStream()");
        }
    }

    private static final class l<T> extends i<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final m<T> f291345f;

        /* synthetic */ l(String str, boolean z10, m mVar, a aVar) {
            this(str, z10, mVar);
        }

        @Override // io.grpc.v1.i
        T k(byte[] bArr) {
            return this.f291345f.b(bArr);
        }

        @Override // io.grpc.v1.i
        byte[] m(T t10) {
            return (byte[]) com.google.common.base.j0.F(this.f291345f.a(t10), "null marshaller.toAsciiString()");
        }

        private l(String str, boolean z10, m<T> mVar) {
            super(str, z10, mVar, null);
            com.google.common.base.j0.y(!str.endsWith(v1.f291321d), "ASCII header is named %s.  Only binary headers may end with %s", str, v1.f291321d);
            this.f291345f = (m) com.google.common.base.j0.F(mVar, "marshaller");
        }
    }

    @gj.b
    interface m<T> {
        byte[] a(T t10);

        T b(byte[] bArr);
    }

    v1(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] B(InputStream inputStream) {
        try {
            return com.google.common.io.h.u(inputStream);
        } catch (IOException e10) {
            throw new RuntimeException("failure reading serialized stream", e10);
        }
    }

    private Object C(int i10) {
        return this.f291326a[(i10 * 2) + 1];
    }

    private void D(int i10, Object obj) {
        if (this.f291326a instanceof byte[][]) {
            k(h());
        }
        this.f291326a[(i10 * 2) + 1] = obj;
    }

    private void E(int i10, byte[] bArr) {
        this.f291326a[(i10 * 2) + 1] = bArr;
    }

    private byte[] F(int i10) {
        Object objC = C(i10);
        return objC instanceof byte[] ? (byte[]) objC : ((k) objC).c();
    }

    private Object G(int i10) {
        Object objC = C(i10);
        return objC instanceof byte[] ? objC : ((k) objC).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T H(int i10, i<T> iVar) {
        Object objC = C(i10);
        return objC instanceof byte[] ? iVar.k((byte[]) objC) : (T) ((k) objC).d(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private int h() {
        Object[] objArr = this.f291326a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private void k(int i10) {
        Object[] objArr = new Object[i10];
        if (!o()) {
            System.arraycopy(this.f291326a, 0, objArr, 0, q());
        }
        this.f291326a = objArr;
    }

    private boolean o() {
        return this.f291327b == 0;
    }

    private int q() {
        return this.f291327b * 2;
    }

    private void r() {
        if (q() == 0 || q() == h()) {
            k(Math.max(q() * 2, 8));
        }
    }

    private void u(int i10, byte[] bArr) {
        this.f291326a[i10 * 2] = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] v(int i10) {
        return (byte[]) this.f291326a[i10 * 2];
    }

    @fj.h
    Object[] A() {
        Object[] objArr = new Object[q()];
        int i10 = 0 << 0;
        for (int i11 = 0; i11 < this.f291327b; i11++) {
            int i12 = i11 * 2;
            objArr[i12] = v(i11);
            objArr[i12 + 1] = G(i11);
        }
        return objArr;
    }

    public boolean i(i<?> iVar) {
        for (int i10 = 0; i10 < this.f291327b; i10++) {
            if (g(iVar.a(), v(i10))) {
                return true;
            }
        }
        return false;
    }

    @e0("https://github.com/grpc/grpc-java/issues/4691")
    public <T> void j(i<T> iVar) {
        if (o()) {
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f291327b; i11++) {
            if (!g(iVar.a(), v(i11))) {
                u(i10, v(i11));
                D(i10, C(i11));
                i10++;
            }
        }
        Arrays.fill(this.f291326a, i10 * 2, q(), (Object) null);
        this.f291327b = i10;
    }

    @fj.h
    public <T> T l(i<T> iVar) {
        for (int i10 = this.f291327b - 1; i10 >= 0; i10--) {
            if (g(iVar.a(), v(i10))) {
                return (T) H(i10, iVar);
            }
        }
        return null;
    }

    @fj.h
    public <T> Iterable<T> m(i<T> iVar) {
        int i10 = 0;
        while (true) {
            a aVar = null;
            if (i10 >= this.f291327b) {
                return null;
            }
            if (g(iVar.a(), v(i10))) {
                return new h(this, iVar, i10, aVar);
            }
            i10++;
        }
    }

    int n() {
        return this.f291327b;
    }

    public Set<String> p() {
        if (o()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(this.f291327b);
        for (int i10 = 0; i10 < this.f291327b; i10++) {
            hashSet.add(new String(v(i10), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void s(v1 v1Var) {
        if (v1Var.o()) {
            return;
        }
        int iH = h() - q();
        if (o() || iH < v1Var.q()) {
            k(q() + v1Var.q());
        }
        int i10 = 0 << 0;
        System.arraycopy(v1Var.f291326a, 0, this.f291326a, q(), v1Var.q());
        this.f291327b += v1Var.f291327b;
    }

    public void t(v1 v1Var, Set<i<?>> set) {
        com.google.common.base.j0.F(v1Var, "other");
        HashMap map = new HashMap(set.size());
        for (i<?> iVar : set) {
            map.put(ByteBuffer.wrap(iVar.a()), iVar);
        }
        for (int i10 = 0; i10 < v1Var.f291327b; i10++) {
            if (map.containsKey(ByteBuffer.wrap(v1Var.v(i10)))) {
                r();
                u(this.f291327b, v1Var.v(i10));
                D(this.f291327b, v1Var.C(i10));
                this.f291327b++;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(");
        for (int i10 = 0; i10 < this.f291327b; i10++) {
            if (i10 != 0) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            byte[] bArrV = v(i10);
            Charset charset = com.google.common.base.f.f116530a;
            String str = new String(bArrV, charset);
            sb2.append(str);
            sb2.append('=');
            if (str.endsWith(f291321d)) {
                sb2.append(f291324g.l(F(i10)));
            } else {
                sb2.append(new String(F(i10), charset));
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public <T> void w(i<T> iVar, T t10) {
        com.google.common.base.j0.F(iVar, "key");
        com.google.common.base.j0.F(t10, "value");
        r();
        u(this.f291327b, iVar.a());
        if (iVar.l()) {
            D(this.f291327b, k.a(iVar, t10));
        } else {
            E(this.f291327b, iVar.m(t10));
        }
        this.f291327b++;
    }

    public <T> boolean x(i<T> iVar, T t10) {
        com.google.common.base.j0.F(iVar, "key");
        com.google.common.base.j0.F(t10, "value");
        for (int i10 = 0; i10 < this.f291327b; i10++) {
            if (g(iVar.a(), v(i10)) && t10.equals(H(i10, iVar))) {
                int i11 = i10 * 2;
                int i12 = (i10 + 1) * 2;
                int iQ = q() - i12;
                Object[] objArr = this.f291326a;
                System.arraycopy(objArr, i12, objArr, i11, iQ);
                int i13 = this.f291327b - 1;
                this.f291327b = i13;
                u(i13, null);
                E(this.f291327b, null);
                return true;
            }
        }
        return false;
    }

    public <T> Iterable<T> y(i<T> iVar) {
        if (o()) {
            return null;
        }
        int i10 = 0;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < this.f291327b; i11++) {
            if (g(iVar.a(), v(i11))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(H(i11, iVar));
            } else {
                u(i10, v(i11));
                D(i10, C(i11));
                i10++;
            }
        }
        Arrays.fill(this.f291326a, i10 * 2, q(), (Object) null);
        this.f291327b = i10;
        return arrayList;
    }

    @fj.h
    byte[][] z() {
        byte[][] bArr = new byte[q()][];
        Object[] objArr = this.f291326a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, q());
            return bArr;
        }
        for (int i10 = 0; i10 < this.f291327b; i10++) {
            int i11 = i10 * 2;
            bArr[i11] = v(i10);
            bArr[i11 + 1] = F(i10);
        }
        return bArr;
    }

    v1(int i10, byte[]... bArr) {
        this(i10, (Object[]) bArr);
    }

    v1(int i10, Object[] objArr) {
        this.f291327b = i10;
        this.f291326a = objArr;
    }

    public v1() {
    }
}
