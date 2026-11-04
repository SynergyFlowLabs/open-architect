package com.google.geo.type;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import com.google.type.t;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends l1<a, b> implements com.google.geo.type.b {
    private static final a DEFAULT_INSTANCE;
    public static final int HIGH_FIELD_NUMBER = 2;
    public static final int LOW_FIELD_NUMBER = 1;
    private static volatile f3<a> PARSER;
    private int bitField0_;
    private t high_;
    private t low_;

    /* JADX INFO: renamed from: com.google.geo.type.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1194a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125249a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125249a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125249a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125249a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125249a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125249a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125249a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125249a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<a, b> implements com.google.geo.type.b {
        /* synthetic */ b(C1194a c1194a) {
            this();
        }

        @Override // com.google.geo.type.b
        public t Ic() {
            return ((a) this.f126038b).Ic();
        }

        @Override // com.google.geo.type.b
        public t M8() {
            return ((a) this.f126038b).M8();
        }

        public b Ol() {
            El();
            ((a) this.f126038b).gm();
            return this;
        }

        public b Pl() {
            El();
            ((a) this.f126038b).hm();
            return this;
        }

        public b Ql(t tVar) {
            El();
            ((a) this.f126038b).jm(tVar);
            return this;
        }

        public b Rl(t tVar) {
            El();
            ((a) this.f126038b).km(tVar);
            return this;
        }

        public b Sl(t.b bVar) {
            El();
            ((a) this.f126038b).Am(bVar.build());
            return this;
        }

        public b Tl(t tVar) {
            El();
            ((a) this.f126038b).Am(tVar);
            return this;
        }

        public b Ul(t.b bVar) {
            El();
            ((a) this.f126038b).Bm(bVar.build());
            return this;
        }

        public b Vl(t tVar) {
            El();
            ((a) this.f126038b).Bm(tVar);
            return this;
        }

        @Override // com.google.geo.type.b
        public boolean lf() {
            return ((a) this.f126038b).lf();
        }

        @Override // com.google.geo.type.b
        public boolean q8() {
            return ((a) this.f126038b).q8();
        }

        private b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        l1.Wl(a.class, aVar);
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(t tVar) {
        tVar.getClass();
        this.high_ = tVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(t tVar) {
        tVar.getClass();
        this.low_ = tVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.high_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.low_ = null;
        this.bitField0_ &= -2;
    }

    public static a im() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm(t tVar) {
        tVar.getClass();
        t tVar2 = this.high_;
        if (tVar2 == null || tVar2 == t.gm()) {
            this.high_ = tVar;
        } else {
            this.high_ = t.im(this.high_).Jl(tVar).B1();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km(t tVar) {
        tVar.getClass();
        t tVar2 = this.low_;
        if (tVar2 == null || tVar2 == t.gm()) {
            this.low_ = tVar;
        } else {
            this.low_ = t.im(this.low_).Jl(tVar).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b lm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b mm(a aVar) {
        return DEFAULT_INSTANCE.Uf(aVar);
    }

    public static a nm(InputStream inputStream) throws IOException {
        return (a) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static a om(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a pm(u uVar) throws t1 {
        return (a) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static a qm(u uVar, v0 v0Var) throws t1 {
        return (a) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static a rm(z zVar) throws IOException {
        return (a) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static a sm(z zVar, v0 v0Var) throws IOException {
        return (a) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static a tm(InputStream inputStream) throws IOException {
        return (a) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static a um(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a vm(ByteBuffer byteBuffer) throws t1 {
        return (a) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static a wm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (a) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static a xm(byte[] bArr) throws t1 {
        return (a) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static a ym(byte[] bArr, v0 v0Var) throws t1 {
        return (a) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<a> zm() {
        return DEFAULT_INSTANCE.W7();
    }

    @Override // com.google.geo.type.b
    public t Ic() {
        t tVarGm = this.low_;
        if (tVarGm == null) {
            tVarGm = t.gm();
        }
        return tVarGm;
    }

    @Override // com.google.geo.type.b
    public t M8() {
        t tVar = this.high_;
        return tVar == null ? t.gm() : tVar;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = C1194a.f125249a[iVar.ordinal()];
        C1194a c1194a = null;
        switch (i10) {
            case 1:
                return new a();
            case 2:
                return new b(c1194a);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "low_", "high_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<a> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (a.class) {
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

    @Override // com.google.geo.type.b
    public boolean lf() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.geo.type.b
    public boolean q8() {
        return (this.bitField0_ & 1) != 0;
    }
}
