package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k3 extends com.google.protobuf.l1<k3, b> implements l3 {
    private static final k3 DEFAULT_INSTANCE;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.f3<k3> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private com.google.protobuf.s1.k<h3> parameters_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116249a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116249a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116249a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116249a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116249a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116249a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116249a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116249a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<k3, b> implements l3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.l3
        public String A() {
            return ((k3) this.f126038b).A();
        }

        @Override // com.google.api.l3
        public com.google.protobuf.u B() {
            return ((k3) this.f126038b).B();
        }

        @Override // com.google.api.l3
        public h3 L9(int i10) {
            return ((k3) this.f126038b).L9(i10);
        }

        public b Ol(Iterable<? extends h3> iterable) {
            El();
            ((k3) this.f126038b).jm(iterable);
            return this;
        }

        public b Pl(int i10, h3.b bVar) {
            El();
            ((k3) this.f126038b).km(i10, bVar.build());
            return this;
        }

        public b Ql(int i10, h3 h3Var) {
            El();
            ((k3) this.f126038b).km(i10, h3Var);
            return this;
        }

        public b Rl(h3.b bVar) {
            El();
            ((k3) this.f126038b).lm(bVar.build());
            return this;
        }

        public b Sl(h3 h3Var) {
            El();
            ((k3) this.f126038b).lm(h3Var);
            return this;
        }

        @Override // com.google.api.l3
        public List<h3> Th() {
            return Collections.unmodifiableList(((k3) this.f126038b).Th());
        }

        public b Tl() {
            El();
            ((k3) this.f126038b).mm();
            return this;
        }

        public b Ul() {
            El();
            ((k3) this.f126038b).nm();
            return this;
        }

        public b Vl(int i10) {
            El();
            ((k3) this.f126038b).Hm(i10);
            return this;
        }

        public b Wl(int i10, h3.b bVar) {
            El();
            ((k3) this.f126038b).Im(i10, bVar.build());
            return this;
        }

        public b Xl(int i10, h3 h3Var) {
            El();
            ((k3) this.f126038b).Im(i10, h3Var);
            return this;
        }

        public b Yl(String str) {
            El();
            ((k3) this.f126038b).Jm(str);
            return this;
        }

        public b Zl(com.google.protobuf.u uVar) {
            El();
            ((k3) this.f126038b).Km(uVar);
            return this;
        }

        @Override // com.google.api.l3
        public int ui() {
            return ((k3) this.f126038b).ui();
        }

        private b() {
            super(k3.DEFAULT_INSTANCE);
        }
    }

    static {
        k3 k3Var = new k3();
        DEFAULT_INSTANCE = k3Var;
        com.google.protobuf.l1.Wl(k3.class, k3Var);
    }

    private k3() {
    }

    public static k3 Am(InputStream inputStream) throws IOException {
        return (k3) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static k3 Bm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (k3) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static k3 Cm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (k3) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k3 Dm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (k3) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static k3 Em(byte[] bArr) throws com.google.protobuf.t1 {
        return (k3) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static k3 Fm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (k3) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<k3> Gm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(int i10) {
        om();
        this.parameters_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im(int i10, h3 h3Var) {
        h3Var.getClass();
        om();
        this.parameters_.set(i10, h3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.selector_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm(Iterable<? extends h3> iterable) {
        om();
        com.google.protobuf.a.y(iterable, this.parameters_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km(int i10, h3 h3Var) {
        h3Var.getClass();
        om();
        this.parameters_.add(i10, h3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm(h3 h3Var) {
        h3Var.getClass();
        om();
        this.parameters_.add(h3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm() {
        this.parameters_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm() {
        this.selector_ = pm().A();
    }

    private void om() {
        com.google.protobuf.s1.k<h3> kVar = this.parameters_;
        if (!kVar.s1()) {
            this.parameters_ = com.google.protobuf.l1.yl(kVar);
        }
    }

    public static k3 pm() {
        return DEFAULT_INSTANCE;
    }

    public static b sm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b tm(k3 k3Var) {
        return DEFAULT_INSTANCE.Uf(k3Var);
    }

    public static k3 um(InputStream inputStream) throws IOException {
        return (k3) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static k3 vm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (k3) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static k3 wm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (k3) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static k3 xm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (k3) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static k3 ym(com.google.protobuf.z zVar) throws IOException {
        return (k3) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static k3 zm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (k3) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    @Override // com.google.api.l3
    public String A() {
        return this.selector_;
    }

    @Override // com.google.api.l3
    public com.google.protobuf.u B() {
        return com.google.protobuf.u.C(this.selector_);
    }

    @Override // com.google.api.l3
    public h3 L9(int i10) {
        return this.parameters_.get(i10);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116249a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new k3();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"selector_", "parameters_", h3.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<k3> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (k3.class) {
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

    @Override // com.google.api.l3
    public List<h3> Th() {
        return this.parameters_;
    }

    public i3 qm(int i10) {
        return this.parameters_.get(i10);
    }

    public List<? extends i3> rm() {
        return this.parameters_;
    }

    @Override // com.google.api.l3
    public int ui() {
        return this.parameters_.size();
    }
}
