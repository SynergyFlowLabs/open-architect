package com.google.type;

import com.google.protobuf.f3;
import com.google.protobuf.i1;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends l1<c, b> implements d {
    public static final int ALPHA_FIELD_NUMBER = 4;
    public static final int BLUE_FIELD_NUMBER = 3;
    private static final c DEFAULT_INSTANCE;
    public static final int GREEN_FIELD_NUMBER = 2;
    private static volatile f3<c> PARSER = null;
    public static final int RED_FIELD_NUMBER = 1;
    private i1 alpha_;
    private int bitField0_;
    private float blue_;
    private float green_;
    private float red_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126721a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126721a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126721a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126721a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126721a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126721a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126721a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126721a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<c, b> implements d {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.type.d
        public float Gk() {
            return ((c) this.f126038b).Gk();
        }

        public b Ol() {
            El();
            ((c) this.f126038b).jm();
            return this;
        }

        public b Pl() {
            El();
            ((c) this.f126038b).km();
            return this;
        }

        public b Ql() {
            El();
            ((c) this.f126038b).lm();
            return this;
        }

        @Override // com.google.type.d
        public float Ri() {
            return ((c) this.f126038b).Ri();
        }

        public b Rl() {
            El();
            ((c) this.f126038b).mm();
            return this;
        }

        public b Sl(i1 i1Var) {
            El();
            ((c) this.f126038b).om(i1Var);
            return this;
        }

        @Override // com.google.type.d
        public float Ta() {
            return ((c) this.f126038b).Ta();
        }

        public b Tl(i1.b bVar) {
            El();
            ((c) this.f126038b).Em(bVar.build());
            return this;
        }

        public b Ul(i1 i1Var) {
            El();
            ((c) this.f126038b).Em(i1Var);
            return this;
        }

        public b Vl(float f10) {
            El();
            ((c) this.f126038b).Fm(f10);
            return this;
        }

        public b Wl(float f10) {
            El();
            ((c) this.f126038b).Gm(f10);
            return this;
        }

        public b Xl(float f10) {
            El();
            ((c) this.f126038b).Hm(f10);
            return this;
        }

        @Override // com.google.type.d
        public i1 r() {
            return ((c) this.f126038b).r();
        }

        @Override // com.google.type.d
        public boolean wa() {
            return ((c) this.f126038b).wa();
        }

        private b() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        l1.Wl(c.class, cVar);
    }

    private c() {
    }

    public static c Am(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (c) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static c Bm(byte[] bArr) throws t1 {
        return (c) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static c Cm(byte[] bArr, v0 v0Var) throws t1 {
        return (c) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<c> Dm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(i1 i1Var) {
        i1Var.getClass();
        this.alpha_ = i1Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(float f10) {
        this.blue_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(float f10) {
        this.green_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(float f10) {
        this.red_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.alpha_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km() {
        this.blue_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm() {
        this.green_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm() {
        this.red_ = 0.0f;
    }

    public static c nm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om(i1 i1Var) {
        i1Var.getClass();
        i1 i1Var2 = this.alpha_;
        if (i1Var2 == null || i1Var2 == i1.dm()) {
            this.alpha_ = i1Var;
        } else {
            this.alpha_ = i1.fm(this.alpha_).Jl(i1Var).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b pm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b qm(c cVar) {
        return DEFAULT_INSTANCE.Uf(cVar);
    }

    public static c rm(InputStream inputStream) throws IOException {
        return (c) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static c sm(InputStream inputStream, v0 v0Var) throws IOException {
        return (c) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static c tm(com.google.protobuf.u uVar) throws t1 {
        return (c) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static c um(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (c) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static c vm(com.google.protobuf.z zVar) throws IOException {
        return (c) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static c wm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (c) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static c xm(InputStream inputStream) throws IOException {
        return (c) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static c ym(InputStream inputStream, v0 v0Var) throws IOException {
        return (c) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static c zm(ByteBuffer byteBuffer) throws t1 {
        return (c) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    @Override // com.google.type.d
    public float Gk() {
        return this.red_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126721a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new c();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004ဉ\u0000", new Object[]{"bitField0_", "red_", "green_", "blue_", "alpha_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<c> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (c.class) {
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

    @Override // com.google.type.d
    public float Ri() {
        return this.green_;
    }

    @Override // com.google.type.d
    public float Ta() {
        return this.blue_;
    }

    @Override // com.google.type.d
    public i1 r() {
        i1 i1VarDm = this.alpha_;
        if (i1VarDm == null) {
            i1VarDm = i1.dm();
        }
        return i1VarDm;
    }

    @Override // com.google.type.d
    public boolean wa() {
        return (this.bitField0_ & 1) != 0;
    }
}
