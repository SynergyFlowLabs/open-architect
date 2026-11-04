package com.google.type;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends l1<w, b> implements x {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
    private static final w DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 3;
    private static volatile f3<w> PARSER = null;
    public static final int UNITS_FIELD_NUMBER = 2;
    private String currencyCode_ = "";
    private int nanos_;
    private long units_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126755a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126755a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126755a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126755a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126755a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126755a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126755a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126755a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<w, b> implements x {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.type.x
        public int D() {
            return ((w) this.f126038b).D();
        }

        public b Ol() {
            El();
            ((w) this.f126038b).hm();
            return this;
        }

        public b Pl() {
            El();
            ((w) this.f126038b).im();
            return this;
        }

        public b Ql() {
            El();
            ((w) this.f126038b).jm();
            return this;
        }

        public b Rl(String str) {
            El();
            ((w) this.f126038b).Am(str);
            return this;
        }

        public b Sl(com.google.protobuf.u uVar) {
            El();
            ((w) this.f126038b).Bm(uVar);
            return this;
        }

        public b Tl(int i10) {
            El();
            ((w) this.f126038b).Cm(i10);
            return this;
        }

        public b Ul(long j10) {
            El();
            ((w) this.f126038b).Dm(j10);
            return this;
        }

        @Override // com.google.type.x
        public com.google.protobuf.u Xh() {
            return ((w) this.f126038b).Xh();
        }

        @Override // com.google.type.x
        public String getCurrencyCode() {
            return ((w) this.f126038b).getCurrencyCode();
        }

        @Override // com.google.type.x
        public long getUnits() {
            return ((w) this.f126038b).getUnits();
        }

        private b() {
            super(w.DEFAULT_INSTANCE);
        }
    }

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        l1.Wl(w.class, wVar);
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(String str) {
        str.getClass();
        this.currencyCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.currencyCode_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm(int i10) {
        this.nanos_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(long j10) {
        this.units_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.currencyCode_ = km().getCurrencyCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.units_ = 0L;
    }

    public static w km() {
        return DEFAULT_INSTANCE;
    }

    public static b lm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b mm(w wVar) {
        return DEFAULT_INSTANCE.Uf(wVar);
    }

    public static w nm(InputStream inputStream) throws IOException {
        return (w) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static w om(InputStream inputStream, v0 v0Var) throws IOException {
        return (w) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static w pm(com.google.protobuf.u uVar) throws t1 {
        return (w) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static w qm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (w) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static w rm(com.google.protobuf.z zVar) throws IOException {
        return (w) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static w sm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (w) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static w tm(InputStream inputStream) throws IOException {
        return (w) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static w um(InputStream inputStream, v0 v0Var) throws IOException {
        return (w) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static w vm(ByteBuffer byteBuffer) throws t1 {
        return (w) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w wm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (w) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static w xm(byte[] bArr) throws t1 {
        return (w) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static w ym(byte[] bArr, v0 v0Var) throws t1 {
        return (w) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<w> zm() {
        return DEFAULT_INSTANCE.W7();
    }

    @Override // com.google.type.x
    public int D() {
        return this.nanos_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126755a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new w();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"currencyCode_", "units_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<w> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (w.class) {
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

    @Override // com.google.type.x
    public com.google.protobuf.u Xh() {
        return com.google.protobuf.u.C(this.currencyCode_);
    }

    @Override // com.google.type.x
    public String getCurrencyCode() {
        return this.currencyCode_;
    }

    @Override // com.google.type.x
    public long getUnits() {
        return this.units_;
    }
}
