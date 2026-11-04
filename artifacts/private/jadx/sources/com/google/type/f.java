package com.google.type;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends l1<f, b> implements g {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final f DEFAULT_INSTANCE;
    public static final int MONTH_FIELD_NUMBER = 2;
    private static volatile f3<f> PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int month_;
    private int year_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126723a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126723a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126723a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126723a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126723a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126723a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126723a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126723a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<f, b> implements g {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.type.g
        public int K6() {
            return ((f) this.f126038b).K6();
        }

        @Override // com.google.type.g
        public int M3() {
            return ((f) this.f126038b).M3();
        }

        public b Ol() {
            El();
            ((f) this.f126038b).gm();
            return this;
        }

        public b Pl() {
            El();
            ((f) this.f126038b).hm();
            return this;
        }

        public b Ql() {
            El();
            ((f) this.f126038b).im();
            return this;
        }

        public b Rl(int i10) {
            El();
            ((f) this.f126038b).zm(i10);
            return this;
        }

        public b Sl(int i10) {
            El();
            ((f) this.f126038b).Am(i10);
            return this;
        }

        public b Tl(int i10) {
            El();
            ((f) this.f126038b).Bm(i10);
            return this;
        }

        @Override // com.google.type.g
        public int V3() {
            return ((f) this.f126038b).V3();
        }

        private b() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        l1.Wl(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(int i10) {
        this.month_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(int i10) {
        this.year_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.day_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.month_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im() {
        this.year_ = 0;
    }

    public static f jm() {
        return DEFAULT_INSTANCE;
    }

    public static b km() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b lm(f fVar) {
        return DEFAULT_INSTANCE.Uf(fVar);
    }

    public static f mm(InputStream inputStream) throws IOException {
        return (f) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static f nm(InputStream inputStream, v0 v0Var) throws IOException {
        return (f) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static f om(com.google.protobuf.u uVar) throws t1 {
        return (f) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static f pm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (f) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static f qm(com.google.protobuf.z zVar) throws IOException {
        return (f) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static f rm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (f) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static f sm(InputStream inputStream) throws IOException {
        return (f) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static f tm(InputStream inputStream, v0 v0Var) throws IOException {
        return (f) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static f um(ByteBuffer byteBuffer) throws t1 {
        return (f) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f vm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (f) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static f wm(byte[] bArr) throws t1 {
        return (f) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static f xm(byte[] bArr, v0 v0Var) throws t1 {
        return (f) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<f> ym() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(int i10) {
        this.day_ = i10;
    }

    @Override // com.google.type.g
    public int K6() {
        return this.month_;
    }

    @Override // com.google.type.g
    public int M3() {
        return this.year_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126723a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new f();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"year_", "month_", "day_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<f> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (f.class) {
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

    @Override // com.google.type.g
    public int V3() {
        return this.day_;
    }
}
