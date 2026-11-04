package com.google.firebase.perf.v1;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends l1<z, b> implements a0 {
    private static final z DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile f3<z> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124398a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f124398a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124398a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124398a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124398a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124398a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124398a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124398a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<z, b> implements a0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((z) this.f126038b).cm();
            return this;
        }

        public b Pl(c cVar) {
            El();
            ((z) this.f126038b).tm(cVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.a0
        public c gf() {
            return ((z) this.f126038b).gf();
        }

        @Override // com.google.firebase.perf.v1.a0
        public boolean mc() {
            return ((z) this.f126038b).mc();
        }

        private b() {
            super(z.DEFAULT_INSTANCE);
        }
    }

    public enum c implements s1.c {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f124401d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f124402e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final s1.d<c> f124403f = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f124405a;

        class a implements s1.d<c> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.l(i10);
            }
        }

        private static final class b implements s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final s1.e f124406a = new b();

            private b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int i10) {
                return c.l(i10) != null;
            }
        }

        c(int i10) {
            this.f124405a = i10;
        }

        public static c l(int i10) {
            if (i10 == 0) {
                return SOURCE_UNKNOWN;
            }
            if (i10 != 1) {
                return null;
            }
            return FL_LEGACY_V1;
        }

        public static s1.d<c> n() {
            return f124403f;
        }

        public static s1.e o() {
            return b.f124406a;
        }

        @Deprecated
        public static c p(int i10) {
            return l(i10);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            return this.f124405a;
        }
    }

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        l1.Wl(z.class, zVar);
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        this.bitField0_ &= -2;
        this.dispatchDestination_ = 0;
    }

    public static z dm() {
        return DEFAULT_INSTANCE;
    }

    public static b em() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b fm(z zVar) {
        return DEFAULT_INSTANCE.Uf(zVar);
    }

    public static z gm(InputStream inputStream) throws IOException {
        return (z) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static z hm(InputStream inputStream, v0 v0Var) throws IOException {
        return (z) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static z im(com.google.protobuf.u uVar) throws t1 {
        return (z) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static z jm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (z) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static z km(com.google.protobuf.z zVar) throws IOException {
        return (z) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static z lm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (z) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static z mm(InputStream inputStream) throws IOException {
        return (z) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static z nm(InputStream inputStream, v0 v0Var) throws IOException {
        return (z) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static z om(ByteBuffer byteBuffer) throws t1 {
        return (z) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static z pm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (z) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static z qm(byte[] bArr) throws t1 {
        return (z) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static z rm(byte[] bArr, v0 v0Var) throws t1 {
        return (z) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<z> sm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tm(c cVar) {
        this.dispatchDestination_ = cVar.i();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f124398a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new z();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "dispatchDestination_", c.o()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<z> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (z.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new l1.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.firebase.perf.v1.a0
    public c gf() {
        c cVarL = c.l(this.dispatchDestination_);
        return cVarL == null ? c.SOURCE_UNKNOWN : cVarL;
    }

    @Override // com.google.firebase.perf.v1.a0
    public boolean mc() {
        return (this.bitField0_ & 1) != 0;
    }
}
