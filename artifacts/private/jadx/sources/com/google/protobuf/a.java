package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC1212a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC1212a<MessageType, BuilderType>> implements n2 {
    protected int memoizedHashCode = 0;

    protected interface b {
        int i();
    }

    protected static void R(u byteString) throws IllegalArgumentException {
        if (!byteString.S()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    @Deprecated
    protected static <T> void m(final Iterable<T> values, final Collection<? super T> list) {
        AbstractC1212a.jl(values, (List) list);
    }

    private String w4(String target) {
        return "Serializing " + getClass().getName() + " to a " + target + " threw an IOException (should never happen).";
    }

    protected static <T> void y(final Iterable<T> values, final List<? super T> list) {
        AbstractC1212a.jl(values, list);
    }

    @Override // com.google.protobuf.n2
    public byte[] H0() {
        try {
            byte[] bArr = new byte[w1()];
            b0 b0VarN1 = b0.n1(bArr);
            Nb(b0VarN1);
            b0VarN1.Z();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(w4("byte array"), e10);
        }
    }

    int I3(o3 schema) {
        int iO1 = o1();
        if (iO1 != -1) {
            return iO1;
        }
        int iF = schema.f(this);
        i8(iF);
        return iF;
    }

    n4 N5() {
        return new n4(this);
    }

    @Override // com.google.protobuf.n2
    public void g2(final OutputStream output) throws IOException {
        int iW1 = w1();
        b0 b0VarK1 = b0.k1(output, b0.J0(b0.Z0(iW1) + iW1));
        b0VarK1.h2(iW1);
        Nb(b0VarK1);
        b0VarK1.e1();
    }

    void i8(int size) {
        throw new UnsupportedOperationException();
    }

    int o1() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.n2
    public u u1() {
        try {
            u.h hVarU = u.U(w1());
            Nb(hVarU.b());
            return hVarU.a();
        } catch (IOException e10) {
            throw new RuntimeException(w4("ByteString"), e10);
        }
    }

    @Override // com.google.protobuf.n2
    public void writeTo(final OutputStream output) throws IOException {
        b0 b0VarK1 = b0.k1(output, b0.J0(w1()));
        Nb(b0VarK1);
        b0VarK1.e1();
    }

    /* JADX INFO: renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1212a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC1212a<MessageType, BuilderType>> implements n2.a {
        @Deprecated
        protected static <T> void il(final Iterable<T> values, final Collection<? super T> list) {
            jl(values, (List) list);
        }

        protected static <T> void jl(final Iterable<T> values, final List<? super T> list) {
            s1.d(values);
            if (!(values instanceof a2)) {
                if (values instanceof g3) {
                    list.addAll((Collection) values);
                    return;
                } else {
                    kl(values, list);
                    return;
                }
            }
            List<?> listJ1 = ((a2) values).j1();
            a2 a2Var = (a2) list;
            int size = list.size();
            for (Object obj : listJ1) {
                if (obj == null) {
                    String str = "Element at index " + (a2Var.size() - size) + " is null.";
                    int size2 = a2Var.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        a2Var.remove(size2);
                    }
                } else if (obj instanceof u) {
                    a2Var.d2((u) obj);
                } else {
                    a2Var.add((String) obj);
                }
            }
        }

        private static <T> void kl(Iterable<T> values, List<? super T> list) {
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

        private String ml(String target) {
            return "Reading " + getClass().getName() + " from a " + target + " threw an IOException (should never happen).";
        }

        protected static n4 zl(n2 message) {
            return new n4(message);
        }

        @Override // com.google.protobuf.n2.a
        public boolean F6(final InputStream input) throws IOException {
            return Vb(input, v0.d());
        }

        @Override // com.google.protobuf.n2.a
        public boolean Vb(final InputStream input, final v0 extensionRegistry) throws IOException {
            int i10 = input.read();
            if (i10 == -1) {
                return false;
            }
            ze(new C1213a(input, z.P(i10, input)), extensionRegistry);
            return true;
        }

        @Override // 
        public abstract BuilderType ll();

        protected abstract BuilderType nl(MessageType message);

        @Override // com.google.protobuf.n2.a
        /* JADX INFO: renamed from: ol, reason: merged with bridge method [inline-methods] */
        public BuilderType Nh(final u data) throws t1 {
            try {
                z zVarV = data.V();
                Qh(zVarV);
                zVarV.a(0);
                return this;
            } catch (t1 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(ml("ByteString"), e11);
            }
        }

        @Override // com.google.protobuf.n2.a
        /* JADX INFO: renamed from: pl, reason: merged with bridge method [inline-methods] */
        public BuilderType Yh(final u data, final v0 extensionRegistry) throws t1 {
            try {
                z zVarV = data.V();
                rl(zVarV, extensionRegistry);
                zVarV.a(0);
                return this;
            } catch (t1 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(ml("ByteString"), e11);
            }
        }

        @Override // com.google.protobuf.n2.a
        /* JADX INFO: renamed from: ql, reason: merged with bridge method [inline-methods] */
        public BuilderType Qh(z zVar) throws IOException {
            return (BuilderType) rl(zVar, v0.d());
        }

        @Override // com.google.protobuf.n2.a
        public abstract BuilderType rl(final z input, final v0 extensionRegistry) throws IOException;

        @Override // com.google.protobuf.n2.a
        /* JADX INFO: renamed from: sl, reason: merged with bridge method [inline-methods] */
        public BuilderType T9(n2 n2Var) {
            if (g1().getClass().isInstance(n2Var)) {
                return (BuilderType) nl((a) n2Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        @Override // com.google.protobuf.n2.a
        /* JADX INFO: renamed from: tl, reason: merged with bridge method [inline-methods] */
        public BuilderType u2(final InputStream input) throws IOException {
            z zVarK = z.k(input);
            Qh(zVarK);
            zVarK.a(0);
            return this;
        }

        @Override // com.google.protobuf.n2.a
        /* JADX INFO: renamed from: ul, reason: merged with bridge method [inline-methods] */
        public BuilderType ze(final InputStream input, final v0 extensionRegistry) throws IOException {
            z zVarK = z.k(input);
            rl(zVarK, extensionRegistry);
            zVarK.a(0);
            return this;
        }

        @Override // com.google.protobuf.n2.a
        /* JADX INFO: renamed from: vl, reason: merged with bridge method [inline-methods] */
        public BuilderType F3(byte[] bArr) throws t1 {
            return (BuilderType) wl(bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.n2.a
        public BuilderType wl(final byte[] data, final int off, final int len) throws t1 {
            try {
                z zVarR = z.r(data, off, len);
                Qh(zVarR);
                zVarR.a(0);
                return this;
            } catch (t1 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(ml("byte array"), e11);
            }
        }

        @Override // com.google.protobuf.n2.a
        public BuilderType xl(final byte[] data, final int off, final int len, final v0 extensionRegistry) throws t1 {
            try {
                z zVarR = z.r(data, off, len);
                rl(zVarR, extensionRegistry);
                zVarR.a(0);
                return this;
            } catch (t1 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(ml("byte array"), e11);
            }
        }

        @Override // com.google.protobuf.n2.a
        /* JADX INFO: renamed from: yl, reason: merged with bridge method [inline-methods] */
        public BuilderType cc(byte[] bArr, v0 v0Var) throws t1 {
            return (BuilderType) xl(bArr, 0, bArr.length, v0Var);
        }

        /* JADX INFO: renamed from: com.google.protobuf.a$a$a, reason: collision with other inner class name */
        static final class C1213a extends FilterInputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f125712a;

            C1213a(InputStream in, int limit) {
                super(in);
                this.f125712a = limit;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f125712a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f125712a <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f125712a--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(final long n10) throws IOException {
                int iSkip = (int) super.skip(Math.min(n10, this.f125712a));
                if (iSkip >= 0) {
                    this.f125712a -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(final byte[] b10, final int off, int len) throws IOException {
                int i10 = this.f125712a;
                if (i10 <= 0) {
                    int i11 = 5 & (-1);
                    return -1;
                }
                int i12 = super.read(b10, off, Math.min(len, i10));
                if (i12 >= 0) {
                    this.f125712a -= i12;
                }
                return i12;
            }
        }
    }
}
