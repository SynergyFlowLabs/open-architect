package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends com.google.protobuf.l1<y0, b> implements z0 {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final y0 DEFAULT_INSTANCE;
    public static final int EXTENSIONS_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.f3<y0> PARSER;
    private String contentType_ = "";
    private com.google.protobuf.u data_ = com.google.protobuf.u.f126379f;
    private com.google.protobuf.s1.k<com.google.protobuf.f> extensions_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116408a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116408a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116408a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116408a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116408a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116408a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116408a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116408a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<y0, b> implements z0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.z0
        public com.google.protobuf.u Ha() {
            return ((y0) this.f126038b).Ha();
        }

        public b Ol(Iterable<? extends com.google.protobuf.f> iterable) {
            El();
            ((y0) this.f126038b).lm(iterable);
            return this;
        }

        public b Pl(int i10, com.google.protobuf.f.b bVar) {
            El();
            ((y0) this.f126038b).mm(i10, bVar.build());
            return this;
        }

        public b Ql(int i10, com.google.protobuf.f fVar) {
            El();
            ((y0) this.f126038b).mm(i10, fVar);
            return this;
        }

        public b Rl(com.google.protobuf.f.b bVar) {
            El();
            ((y0) this.f126038b).nm(bVar.build());
            return this;
        }

        public b Sl(com.google.protobuf.f fVar) {
            El();
            ((y0) this.f126038b).nm(fVar);
            return this;
        }

        public b Tl() {
            El();
            ((y0) this.f126038b).om();
            return this;
        }

        public b Ul() {
            El();
            ((y0) this.f126038b).pm();
            return this;
        }

        public b Vl() {
            El();
            ((y0) this.f126038b).qm();
            return this;
        }

        public b Wl(int i10) {
            El();
            ((y0) this.f126038b).Km(i10);
            return this;
        }

        public b Xl(String str) {
            El();
            ((y0) this.f126038b).Lm(str);
            return this;
        }

        public b Yl(com.google.protobuf.u uVar) {
            El();
            ((y0) this.f126038b).Mm(uVar);
            return this;
        }

        public b Zl(com.google.protobuf.u uVar) {
            El();
            ((y0) this.f126038b).Nm(uVar);
            return this;
        }

        public b am(int i10, com.google.protobuf.f.b bVar) {
            El();
            ((y0) this.f126038b).Om(i10, bVar.build());
            return this;
        }

        public b bm(int i10, com.google.protobuf.f fVar) {
            El();
            ((y0) this.f126038b).Om(i10, fVar);
            return this;
        }

        @Override // com.google.api.z0
        public List<com.google.protobuf.f> el() {
            return Collections.unmodifiableList(((y0) this.f126038b).el());
        }

        @Override // com.google.api.z0
        public String getContentType() {
            return ((y0) this.f126038b).getContentType();
        }

        @Override // com.google.api.z0
        public com.google.protobuf.u getData() {
            return ((y0) this.f126038b).getData();
        }

        @Override // com.google.api.z0
        public com.google.protobuf.f hh(int i10) {
            return ((y0) this.f126038b).hh(i10);
        }

        @Override // com.google.api.z0
        public int wc() {
            return ((y0) this.f126038b).wc();
        }

        private b() {
            super(y0.DEFAULT_INSTANCE);
        }
    }

    static {
        y0 y0Var = new y0();
        DEFAULT_INSTANCE = y0Var;
        com.google.protobuf.l1.Wl(y0.class, y0Var);
    }

    private y0() {
    }

    public static y0 Am(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (y0) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static y0 Bm(com.google.protobuf.z zVar) throws IOException {
        return (y0) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static y0 Cm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (y0) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static y0 Dm(InputStream inputStream) throws IOException {
        return (y0) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static y0 Em(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (y0) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static y0 Fm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (y0) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static y0 Gm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (y0) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static y0 Hm(byte[] bArr) throws com.google.protobuf.t1 {
        return (y0) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static y0 Im(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (y0) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<y0> Jm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(int i10) {
        rm();
        this.extensions_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm(String str) {
        str.getClass();
        this.contentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.contentType_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm(com.google.protobuf.u uVar) {
        uVar.getClass();
        this.data_ = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om(int i10, com.google.protobuf.f fVar) {
        fVar.getClass();
        rm();
        this.extensions_.set(i10, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm(Iterable<? extends com.google.protobuf.f> iterable) {
        rm();
        com.google.protobuf.a.y(iterable, this.extensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm(int i10, com.google.protobuf.f fVar) {
        fVar.getClass();
        rm();
        this.extensions_.add(i10, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm(com.google.protobuf.f fVar) {
        fVar.getClass();
        rm();
        this.extensions_.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om() {
        this.contentType_ = sm().getContentType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm() {
        this.data_ = sm().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm() {
        this.extensions_ = com.google.protobuf.l1.Ij();
    }

    private void rm() {
        com.google.protobuf.s1.k<com.google.protobuf.f> kVar = this.extensions_;
        if (!kVar.s1()) {
            this.extensions_ = com.google.protobuf.l1.yl(kVar);
        }
    }

    public static y0 sm() {
        return DEFAULT_INSTANCE;
    }

    public static b vm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b wm(y0 y0Var) {
        return DEFAULT_INSTANCE.Uf(y0Var);
    }

    public static y0 xm(InputStream inputStream) throws IOException {
        return (y0) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static y0 ym(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (y0) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static y0 zm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (y0) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    @Override // com.google.api.z0
    public com.google.protobuf.u Ha() {
        return com.google.protobuf.u.C(this.contentType_);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116408a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new y0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b", new Object[]{"contentType_", "data_", "extensions_", com.google.protobuf.f.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<y0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (y0.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new com.google.protobuf.l1.c(DEFAULT_INSTANCE);
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

    @Override // com.google.api.z0
    public List<com.google.protobuf.f> el() {
        return this.extensions_;
    }

    @Override // com.google.api.z0
    public String getContentType() {
        return this.contentType_;
    }

    @Override // com.google.api.z0
    public com.google.protobuf.u getData() {
        return this.data_;
    }

    @Override // com.google.api.z0
    public com.google.protobuf.f hh(int i10) {
        return this.extensions_.get(i10);
    }

    public com.google.protobuf.g tm(int i10) {
        return this.extensions_.get(i10);
    }

    public List<? extends com.google.protobuf.g> um() {
        return this.extensions_;
    }

    @Override // com.google.api.z0
    public int wc() {
        return this.extensions_.size();
    }
}
