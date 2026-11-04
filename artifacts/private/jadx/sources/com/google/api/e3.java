package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e3 extends com.google.protobuf.l1<e3, b> implements f3 {
    private static final e3 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.f3<e3> PARSER = null;
    public static final int SOURCE_FILES_FIELD_NUMBER = 1;
    private com.google.protobuf.s1.k<com.google.protobuf.f> sourceFiles_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116198a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116198a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116198a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116198a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116198a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116198a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116198a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116198a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<e3, b> implements f3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol(Iterable<? extends com.google.protobuf.f> iterable) {
            El();
            ((e3) this.f126038b).gm(iterable);
            return this;
        }

        public b Pl(int i10, com.google.protobuf.f.b bVar) {
            El();
            ((e3) this.f126038b).hm(i10, bVar.build());
            return this;
        }

        public b Ql(int i10, com.google.protobuf.f fVar) {
            El();
            ((e3) this.f126038b).hm(i10, fVar);
            return this;
        }

        public b Rl(com.google.protobuf.f.b bVar) {
            El();
            ((e3) this.f126038b).im(bVar.build());
            return this;
        }

        public b Sl(com.google.protobuf.f fVar) {
            El();
            ((e3) this.f126038b).im(fVar);
            return this;
        }

        @Override // com.google.api.f3
        public List<com.google.protobuf.f> Tk() {
            return Collections.unmodifiableList(((e3) this.f126038b).Tk());
        }

        public b Tl() {
            El();
            ((e3) this.f126038b).jm();
            return this;
        }

        public b Ul(int i10) {
            El();
            ((e3) this.f126038b).Dm(i10);
            return this;
        }

        public b Vl(int i10, com.google.protobuf.f.b bVar) {
            El();
            ((e3) this.f126038b).Em(i10, bVar.build());
            return this;
        }

        public b Wl(int i10, com.google.protobuf.f fVar) {
            El();
            ((e3) this.f126038b).Em(i10, fVar);
            return this;
        }

        @Override // com.google.api.f3
        public int Zc() {
            return ((e3) this.f126038b).Zc();
        }

        @Override // com.google.api.f3
        public com.google.protobuf.f bk(int i10) {
            return ((e3) this.f126038b).bk(i10);
        }

        private b() {
            super(e3.DEFAULT_INSTANCE);
        }
    }

    static {
        e3 e3Var = new e3();
        DEFAULT_INSTANCE = e3Var;
        com.google.protobuf.l1.Wl(e3.class, e3Var);
    }

    private e3() {
    }

    public static e3 Am(byte[] bArr) throws com.google.protobuf.t1 {
        return (e3) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static e3 Bm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (e3) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<e3> Cm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(int i10) {
        km();
        this.sourceFiles_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(int i10, com.google.protobuf.f fVar) {
        fVar.getClass();
        km();
        this.sourceFiles_.set(i10, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(Iterable<? extends com.google.protobuf.f> iterable) {
        km();
        com.google.protobuf.a.y(iterable, this.sourceFiles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm(int i10, com.google.protobuf.f fVar) {
        fVar.getClass();
        km();
        this.sourceFiles_.add(i10, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im(com.google.protobuf.f fVar) {
        fVar.getClass();
        km();
        this.sourceFiles_.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.sourceFiles_ = com.google.protobuf.l1.Ij();
    }

    private void km() {
        com.google.protobuf.s1.k<com.google.protobuf.f> kVar = this.sourceFiles_;
        if (kVar.s1()) {
            return;
        }
        this.sourceFiles_ = com.google.protobuf.l1.yl(kVar);
    }

    public static e3 lm() {
        return DEFAULT_INSTANCE;
    }

    public static b om() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b pm(e3 e3Var) {
        return DEFAULT_INSTANCE.Uf(e3Var);
    }

    public static e3 qm(InputStream inputStream) throws IOException {
        return (e3) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static e3 rm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (e3) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static e3 sm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (e3) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static e3 tm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (e3) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static e3 um(com.google.protobuf.z zVar) throws IOException {
        return (e3) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static e3 vm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (e3) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static e3 wm(InputStream inputStream) throws IOException {
        return (e3) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static e3 xm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (e3) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static e3 ym(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (e3) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e3 zm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (e3) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116198a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new e3();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"sourceFiles_", com.google.protobuf.f.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<e3> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (e3.class) {
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

    @Override // com.google.api.f3
    public List<com.google.protobuf.f> Tk() {
        return this.sourceFiles_;
    }

    @Override // com.google.api.f3
    public int Zc() {
        return this.sourceFiles_.size();
    }

    @Override // com.google.api.f3
    public com.google.protobuf.f bk(int i10) {
        return this.sourceFiles_.get(i10);
    }

    public com.google.protobuf.g mm(int i10) {
        return this.sourceFiles_.get(i10);
    }

    public List<? extends com.google.protobuf.g> nm() {
        return this.sourceFiles_;
    }
}
