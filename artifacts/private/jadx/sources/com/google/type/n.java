package com.google.type;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends l1<n, b> implements o {
    private static final n DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPRESSION_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile f3<n> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String expression_ = "";
    private String title_ = "";
    private String description_ = "";
    private String location_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126752a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126752a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126752a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126752a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126752a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126752a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126752a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126752a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<n, b> implements o {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.type.o
        public com.google.protobuf.u M6() {
            return ((n) this.f126038b).M6();
        }

        public b Ol() {
            El();
            ((n) this.f126038b).mm();
            return this;
        }

        public b Pl() {
            El();
            ((n) this.f126038b).nm();
            return this;
        }

        public b Ql() {
            El();
            ((n) this.f126038b).om();
            return this;
        }

        public b Rl() {
            El();
            ((n) this.f126038b).pm();
            return this;
        }

        public b Sl(String str) {
            El();
            ((n) this.f126038b).Gm(str);
            return this;
        }

        public b Tl(com.google.protobuf.u uVar) {
            El();
            ((n) this.f126038b).Hm(uVar);
            return this;
        }

        public b Ul(String str) {
            El();
            ((n) this.f126038b).Im(str);
            return this;
        }

        public b Vl(com.google.protobuf.u uVar) {
            El();
            ((n) this.f126038b).Jm(uVar);
            return this;
        }

        public b Wl(String str) {
            El();
            ((n) this.f126038b).Km(str);
            return this;
        }

        public b Xl(com.google.protobuf.u uVar) {
            El();
            ((n) this.f126038b).Lm(uVar);
            return this;
        }

        public b Yl(String str) {
            El();
            ((n) this.f126038b).Mm(str);
            return this;
        }

        public b Zl(com.google.protobuf.u uVar) {
            El();
            ((n) this.f126038b).Nm(uVar);
            return this;
        }

        @Override // com.google.type.o
        public com.google.protobuf.u da() {
            return ((n) this.f126038b).da();
        }

        @Override // com.google.type.o
        public String getDescription() {
            return ((n) this.f126038b).getDescription();
        }

        @Override // com.google.type.o
        public String getLocation() {
            return ((n) this.f126038b).getLocation();
        }

        @Override // com.google.type.o
        public String getTitle() {
            return ((n) this.f126038b).getTitle();
        }

        @Override // com.google.type.o
        public com.google.protobuf.u jh() {
            return ((n) this.f126038b).jh();
        }

        @Override // com.google.type.o
        public com.google.protobuf.u k() {
            return ((n) this.f126038b).k();
        }

        @Override // com.google.type.o
        public String pe() {
            return ((n) this.f126038b).pe();
        }

        private b() {
            super(n.DEFAULT_INSTANCE);
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        l1.Wl(n.class, nVar);
    }

    private n() {
    }

    public static n Am(InputStream inputStream, v0 v0Var) throws IOException {
        return (n) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static n Bm(ByteBuffer byteBuffer) throws t1 {
        return (n) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n Cm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (n) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static n Dm(byte[] bArr) throws t1 {
        return (n) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static n Em(byte[] bArr, v0 v0Var) throws t1 {
        return (n) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<n> Fm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.description_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im(String str) {
        str.getClass();
        this.expression_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.expression_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(String str) {
        str.getClass();
        this.location_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.location_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.title_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm() {
        this.description_ = qm().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm() {
        this.expression_ = qm().pe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om() {
        this.location_ = qm().getLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm() {
        this.title_ = qm().getTitle();
    }

    public static n qm() {
        return DEFAULT_INSTANCE;
    }

    public static b rm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b sm(n nVar) {
        return DEFAULT_INSTANCE.Uf(nVar);
    }

    public static n tm(InputStream inputStream) throws IOException {
        return (n) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static n um(InputStream inputStream, v0 v0Var) throws IOException {
        return (n) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static n vm(com.google.protobuf.u uVar) throws t1 {
        return (n) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static n wm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (n) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static n xm(com.google.protobuf.z zVar) throws IOException {
        return (n) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static n ym(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (n) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static n zm(InputStream inputStream) throws IOException {
        return (n) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    @Override // com.google.type.o
    public com.google.protobuf.u M6() {
        return com.google.protobuf.u.C(this.title_);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126752a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new n();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"expression_", "title_", "description_", "location_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<n> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (n.class) {
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

    @Override // com.google.type.o
    public com.google.protobuf.u da() {
        return com.google.protobuf.u.C(this.expression_);
    }

    @Override // com.google.type.o
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.type.o
    public String getLocation() {
        return this.location_;
    }

    @Override // com.google.type.o
    public String getTitle() {
        return this.title_;
    }

    @Override // com.google.type.o
    public com.google.protobuf.u jh() {
        return com.google.protobuf.u.C(this.location_);
    }

    @Override // com.google.type.o
    public com.google.protobuf.u k() {
        return com.google.protobuf.u.C(this.description_);
    }

    @Override // com.google.type.o
    public String pe() {
        return this.expression_;
    }
}
