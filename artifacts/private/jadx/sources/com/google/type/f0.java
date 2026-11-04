package com.google.type;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends l1<f0, b> implements g0 {
    private static final f0 DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 1;
    public static final int MINUTES_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 4;
    private static volatile f3<f0> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 3;
    private int hours_;
    private int minutes_;
    private int nanos_;
    private int seconds_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126724a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126724a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126724a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126724a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126724a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126724a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126724a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126724a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<f0, b> implements g0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.type.g0
        public int D() {
            return ((f0) this.f126038b).D();
        }

        @Override // com.google.type.g0
        public int I() {
            return ((f0) this.f126038b).I();
        }

        @Override // com.google.type.g0
        public int I5() {
            return ((f0) this.f126038b).I5();
        }

        public b Ol() {
            El();
            ((f0) this.f126038b).im();
            return this;
        }

        public b Pl() {
            El();
            ((f0) this.f126038b).jm();
            return this;
        }

        public b Ql() {
            El();
            ((f0) this.f126038b).km();
            return this;
        }

        public b Rl() {
            El();
            ((f0) this.f126038b).lm();
            return this;
        }

        public b Sl(int i10) {
            El();
            ((f0) this.f126038b).Cm(i10);
            return this;
        }

        public b Tl(int i10) {
            El();
            ((f0) this.f126038b).Dm(i10);
            return this;
        }

        public b Ul(int i10) {
            El();
            ((f0) this.f126038b).Em(i10);
            return this;
        }

        public b Vl(int i10) {
            El();
            ((f0) this.f126038b).Fm(i10);
            return this;
        }

        @Override // com.google.type.g0
        public int v3() {
            return ((f0) this.f126038b).v3();
        }

        private b() {
            super(f0.DEFAULT_INSTANCE);
        }
    }

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        l1.Wl(f0.class, f0Var);
    }

    private f0() {
    }

    public static f0 Am(byte[] bArr, v0 v0Var) throws t1 {
        return (f0) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<f0> Bm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm(int i10) {
        this.hours_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(int i10) {
        this.minutes_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(int i10) {
        this.nanos_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(int i10) {
        this.seconds_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im() {
        this.hours_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.minutes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm() {
        this.seconds_ = 0;
    }

    public static f0 mm() {
        return DEFAULT_INSTANCE;
    }

    public static b nm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b om(f0 f0Var) {
        return DEFAULT_INSTANCE.Uf(f0Var);
    }

    public static f0 pm(InputStream inputStream) throws IOException {
        return (f0) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static f0 qm(InputStream inputStream, v0 v0Var) throws IOException {
        return (f0) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static f0 rm(com.google.protobuf.u uVar) throws t1 {
        return (f0) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static f0 sm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (f0) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static f0 tm(com.google.protobuf.z zVar) throws IOException {
        return (f0) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static f0 um(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (f0) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static f0 vm(InputStream inputStream) throws IOException {
        return (f0) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static f0 wm(InputStream inputStream, v0 v0Var) throws IOException {
        return (f0) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static f0 xm(ByteBuffer byteBuffer) throws t1 {
        return (f0) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f0 ym(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (f0) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static f0 zm(byte[] bArr) throws t1 {
        return (f0) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.type.g0
    public int D() {
        return this.nanos_;
    }

    @Override // com.google.type.g0
    public int I() {
        return this.seconds_;
    }

    @Override // com.google.type.g0
    public int I5() {
        return this.minutes_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126724a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new f0();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"hours_", "minutes_", "seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<f0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (f0.class) {
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

    @Override // com.google.type.g0
    public int v3() {
        return this.hours_;
    }
}
