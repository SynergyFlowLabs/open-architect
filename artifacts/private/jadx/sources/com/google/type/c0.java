package com.google.type;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends l1<c0, b> implements d0 {
    private static final c0 DEFAULT_INSTANCE;
    private static volatile f3<c0> PARSER = null;
    public static final int W_FIELD_NUMBER = 4;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 3;
    private double w_;
    private double x_;
    private double y_;
    private double z_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126722a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126722a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126722a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126722a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126722a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126722a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126722a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126722a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<c0, b> implements d0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((c0) this.f126038b).im();
            return this;
        }

        public b Pl() {
            El();
            ((c0) this.f126038b).jm();
            return this;
        }

        @Override // com.google.type.d0
        public double Qe() {
            return ((c0) this.f126038b).Qe();
        }

        public b Ql() {
            El();
            ((c0) this.f126038b).km();
            return this;
        }

        public b Rl() {
            El();
            ((c0) this.f126038b).lm();
            return this;
        }

        public b Sl(double d10) {
            El();
            ((c0) this.f126038b).Cm(d10);
            return this;
        }

        public b Tl(double d10) {
            El();
            ((c0) this.f126038b).Dm(d10);
            return this;
        }

        public b Ul(double d10) {
            El();
            ((c0) this.f126038b).Em(d10);
            return this;
        }

        public b Vl(double d10) {
            El();
            ((c0) this.f126038b).Fm(d10);
            return this;
        }

        @Override // com.google.type.d0
        public double c6() {
            return ((c0) this.f126038b).c6();
        }

        @Override // com.google.type.d0
        public double p6() {
            return ((c0) this.f126038b).p6();
        }

        @Override // com.google.type.d0
        public double ug() {
            return ((c0) this.f126038b).ug();
        }

        private b() {
            super(c0.DEFAULT_INSTANCE);
        }
    }

    static {
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        l1.Wl(c0.class, c0Var);
    }

    private c0() {
    }

    public static c0 Am(byte[] bArr, v0 v0Var) throws t1 {
        return (c0) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<c0> Bm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm(double d10) {
        this.w_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(double d10) {
        this.x_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(double d10) {
        this.y_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(double d10) {
        this.z_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im() {
        this.w_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.x_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km() {
        this.y_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm() {
        this.z_ = 0.0d;
    }

    public static c0 mm() {
        return DEFAULT_INSTANCE;
    }

    public static b nm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b om(c0 c0Var) {
        return DEFAULT_INSTANCE.Uf(c0Var);
    }

    public static c0 pm(InputStream inputStream) throws IOException {
        return (c0) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static c0 qm(InputStream inputStream, v0 v0Var) throws IOException {
        return (c0) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static c0 rm(com.google.protobuf.u uVar) throws t1 {
        return (c0) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static c0 sm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (c0) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static c0 tm(com.google.protobuf.z zVar) throws IOException {
        return (c0) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static c0 um(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (c0) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static c0 vm(InputStream inputStream) throws IOException {
        return (c0) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static c0 wm(InputStream inputStream, v0 v0Var) throws IOException {
        return (c0) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static c0 xm(ByteBuffer byteBuffer) throws t1 {
        return (c0) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c0 ym(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (c0) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static c0 zm(byte[] bArr) throws t1 {
        return (c0) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.type.d0
    public double Qe() {
        return this.w_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126722a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new c0();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0000", new Object[]{"x_", "y_", "z_", "w_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<c0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (c0.class) {
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

    @Override // com.google.type.d0
    public double c6() {
        return this.x_;
    }

    @Override // com.google.type.d0
    public double p6() {
        return this.y_;
    }

    @Override // com.google.type.d0
    public double ug() {
        return this.z_;
    }
}
