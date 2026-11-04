package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.AbstractC0443a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0443a<MessageType, BuilderType>> implements q2 {
    protected int memoizedHashCode = 0;

    protected interface b {
        int i();
    }

    protected static <T> void m(final Iterable<T> values, final List<? super T> list) {
        AbstractC0443a.s2(values, list);
    }

    private String r2(String target) {
        return "Serializing " + getClass().getName() + " to a " + target + " threw an IOException (should never happen).";
    }

    protected static void y(u byteString) throws IllegalArgumentException {
        if (!byteString.S()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public byte[] H0() {
        try {
            byte[] bArr = new byte[w1()];
            b0 b0VarN1 = b0.n1(bArr);
            X7(b0VarN1);
            b0VarN1.Z();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(r2("byte array"), e10);
        }
    }

    int R() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public void g2(final OutputStream output) throws IOException {
        int iW1 = w1();
        b0 b0VarK1 = b0.k1(output, b0.J0(b0.Z0(iW1) + iW1));
        b0VarK1.h2(iW1);
        X7(b0VarK1);
        b0VarK1.e1();
    }

    int o1(r3 schema) {
        int iR = R();
        if (iR != -1) {
            return iR;
        }
        int iF = schema.f(this);
        w2(iF);
        return iF;
    }

    q4 s2() {
        return new q4(this);
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public u u1() {
        try {
            u.h hVarU = u.U(w1());
            X7(hVarU.b());
            return hVarU.a();
        } catch (IOException e10) {
            throw new RuntimeException(r2("ByteString"), e10);
        }
    }

    void w2(int size) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.q2
    public void writeTo(final OutputStream output) throws IOException {
        b0 b0VarK1 = b0.k1(output, b0.J0(w1()));
        X7(b0VarK1);
        b0VarK1.e1();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0443a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0443a<MessageType, BuilderType>> implements q2.a {
        private String F2(String target) {
            return "Reading " + getClass().getName() + " from a " + target + " threw an IOException (should never happen).";
        }

        protected static q4 J3(q2 message) {
            return new q4(message);
        }

        @Deprecated
        protected static <T> void r2(final Iterable<T> values, final Collection<? super T> list) {
            s2(values, (List) list);
        }

        protected static <T> void s2(final Iterable<T> values, final List<? super T> list) {
            s1.d(values);
            if (!(values instanceof b2)) {
                if (values instanceof i3) {
                    list.addAll((Collection) values);
                    return;
                } else {
                    w2(values, list);
                    return;
                }
            }
            List<?> listJ1 = ((b2) values).j1();
            b2 b2Var = (b2) list;
            int size = list.size();
            for (Object obj : listJ1) {
                if (obj == null) {
                    String str = "Element at index " + (b2Var.size() - size) + " is null.";
                    for (int size2 = b2Var.size() - 1; size2 >= size; size2--) {
                        b2Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof u) {
                    b2Var.O2((u) obj);
                } else if (obj instanceof byte[]) {
                    b2Var.O2(u.A((byte[]) obj));
                } else {
                    b2Var.add((String) obj);
                }
            }
        }

        private static <T> void w2(Iterable<T> values, List<? super T> list) {
            if ((list instanceof ArrayList) && (values instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) values).size());
            }
            int size = list.size();
            for (T t10 : values) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        @Override // 
        /* JADX INFO: renamed from: B2, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType mo6clone();

        @Override // androidx.datastore.preferences.protobuf.q2.a
        /* JADX INFO: renamed from: C3 */
        public BuilderType jf(final byte[] data, final int off, final int len, final v0 extensionRegistry) throws t1 {
            try {
                z zVarR = z.r(data, off, len);
                g3(zVarR, extensionRegistry);
                zVarR.a(0);
                return this;
            } catch (t1 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(F2("byte array"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.q2.a
        /* JADX INFO: renamed from: D3, reason: merged with bridge method [inline-methods] */
        public BuilderType sh(byte[] bArr, v0 v0Var) throws t1 {
            return (BuilderType) jf(bArr, 0, bArr.length, v0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.q2.a
        public boolean F6(final InputStream input) throws IOException {
            return lk(input, v0.d());
        }

        protected abstract BuilderType K2(MessageType message);

        @Override // androidx.datastore.preferences.protobuf.q2.a
        /* JADX INFO: renamed from: P2, reason: merged with bridge method [inline-methods] */
        public BuilderType Re(final u data) throws t1 {
            try {
                z zVarV = data.V();
                Se(zVarV);
                zVarV.a(0);
                return this;
            } catch (t1 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(F2("ByteString"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.q2.a
        /* JADX INFO: renamed from: W2, reason: merged with bridge method [inline-methods] */
        public BuilderType Ch(final u data, final v0 extensionRegistry) throws t1 {
            try {
                z zVarV = data.V();
                g3(zVarV, extensionRegistry);
                zVarV.a(0);
                return this;
            } catch (t1 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(F2("ByteString"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.q2.a
        /* JADX INFO: renamed from: b3, reason: merged with bridge method [inline-methods] */
        public BuilderType Se(z zVar) throws IOException {
            return (BuilderType) g3(zVar, v0.d());
        }

        @Override // androidx.datastore.preferences.protobuf.q2.a
        public abstract BuilderType g3(final z input, final v0 extensionRegistry) throws IOException;

        @Override // androidx.datastore.preferences.protobuf.q2.a
        /* JADX INFO: renamed from: l3, reason: merged with bridge method [inline-methods] */
        public BuilderType i8(q2 q2Var) {
            if (g1().getClass().isInstance(q2Var)) {
                return (BuilderType) K2((a) q2Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        @Override // androidx.datastore.preferences.protobuf.q2.a
        public boolean lk(final InputStream input, final v0 extensionRegistry) throws IOException {
            int i10 = input.read();
            if (i10 == -1) {
                return false;
            }
            Ra(new C0444a(input, z.P(i10, input)), extensionRegistry);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.q2.a
        /* JADX INFO: renamed from: q3, reason: merged with bridge method [inline-methods] */
        public BuilderType u2(final InputStream input) throws IOException {
            z zVarK = z.k(input);
            Se(zVarK);
            zVarK.a(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.q2.a
        /* JADX INFO: renamed from: s3, reason: merged with bridge method [inline-methods] */
        public BuilderType Ra(final InputStream input, final v0 extensionRegistry) throws IOException {
            z zVarK = z.k(input);
            g3(zVarK, extensionRegistry);
            zVarK.a(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.q2.a
        /* JADX INFO: renamed from: v3, reason: merged with bridge method [inline-methods] */
        public BuilderType F3(byte[] bArr) throws t1 {
            return (BuilderType) y3(bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.q2.a
        public BuilderType y3(final byte[] data, final int off, final int len) throws t1 {
            try {
                z zVarR = z.r(data, off, len);
                Se(zVarR);
                zVarR.a(0);
                return this;
            } catch (t1 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(F2("byte array"), e11);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a$a, reason: collision with other inner class name */
        static final class C0444a extends FilterInputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f49904a;

            C0444a(InputStream in, int limit) {
                super(in);
                this.f49904a = limit;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f49904a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f49904a <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f49904a--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(final long n10) throws IOException {
                int iSkip = (int) super.skip(Math.min(n10, this.f49904a));
                if (iSkip >= 0) {
                    this.f49904a -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(final byte[] b10, final int off, int len) throws IOException {
                int i10 = this.f49904a;
                if (i10 <= 0) {
                    return -1;
                }
                int i11 = super.read(b10, off, Math.min(len, i10));
                if (i11 >= 0) {
                    this.f49904a -= i11;
                }
                return i11;
            }
        }
    }
}
