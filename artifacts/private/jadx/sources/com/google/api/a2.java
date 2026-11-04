package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a2 extends com.google.protobuf.l1<a2, b> implements b2 {
    private static final a2 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int LABELS_FIELD_NUMBER = 4;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.f3<a2> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int launchStage_;
    private String name_ = "";
    private String type_ = "";
    private String displayName_ = "";
    private String description_ = "";
    private com.google.protobuf.s1.k<h1> labels_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f115121a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f115121a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115121a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f115121a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f115121a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f115121a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f115121a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f115121a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<a2, b> implements b2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.b2
        public int E() {
            return ((a2) this.f126038b).E();
        }

        @Override // com.google.api.b2
        public h1 J1(int i10) {
            return ((a2) this.f126038b).J1(i10);
        }

        @Override // com.google.api.b2
        public int K1() {
            return ((a2) this.f126038b).K1();
        }

        @Override // com.google.api.b2
        public com.google.protobuf.u L0() {
            return ((a2) this.f126038b).L0();
        }

        public b Ol(Iterable<? extends h1> iterable) {
            El();
            ((a2) this.f126038b).vm(iterable);
            return this;
        }

        public b Pl(int i10, h1.b bVar) {
            El();
            ((a2) this.f126038b).wm(i10, bVar.build());
            return this;
        }

        @Override // com.google.api.b2
        public List<h1> Q0() {
            return Collections.unmodifiableList(((a2) this.f126038b).Q0());
        }

        public b Ql(int i10, h1 h1Var) {
            El();
            ((a2) this.f126038b).wm(i10, h1Var);
            return this;
        }

        @Override // com.google.api.b2
        public k1 R0() {
            return ((a2) this.f126038b).R0();
        }

        public b Rl(h1.b bVar) {
            El();
            ((a2) this.f126038b).xm(bVar.build());
            return this;
        }

        public b Sl(h1 h1Var) {
            El();
            ((a2) this.f126038b).xm(h1Var);
            return this;
        }

        public b Tl() {
            El();
            ((a2) this.f126038b).ym();
            return this;
        }

        public b Ul() {
            El();
            ((a2) this.f126038b).zm();
            return this;
        }

        public b Vl() {
            El();
            ((a2) this.f126038b).Am();
            return this;
        }

        public b Wl() {
            El();
            ((a2) this.f126038b).Bm();
            return this;
        }

        public b Xl() {
            El();
            ((a2) this.f126038b).Cm();
            return this;
        }

        public b Yl() {
            El();
            ((a2) this.f126038b).Dm();
            return this;
        }

        public b Zl(int i10) {
            El();
            ((a2) this.f126038b).Xm(i10);
            return this;
        }

        @Override // com.google.api.b2
        public com.google.protobuf.u a() {
            return ((a2) this.f126038b).a();
        }

        public b am(String str) {
            El();
            ((a2) this.f126038b).Ym(str);
            return this;
        }

        public b bm(com.google.protobuf.u uVar) {
            El();
            ((a2) this.f126038b).Zm(uVar);
            return this;
        }

        @Override // com.google.api.b2
        public String c() {
            return ((a2) this.f126038b).c();
        }

        public b cm(String str) {
            El();
            ((a2) this.f126038b).an(str);
            return this;
        }

        public b dm(com.google.protobuf.u uVar) {
            El();
            ((a2) this.f126038b).bn(uVar);
            return this;
        }

        public b em(int i10, h1.b bVar) {
            El();
            ((a2) this.f126038b).cn(i10, bVar.build());
            return this;
        }

        public b fm(int i10, h1 h1Var) {
            El();
            ((a2) this.f126038b).cn(i10, h1Var);
            return this;
        }

        @Override // com.google.api.b2
        public String getDescription() {
            return ((a2) this.f126038b).getDescription();
        }

        @Override // com.google.api.b2
        public String getName() {
            return ((a2) this.f126038b).getName();
        }

        public b gm(k1 k1Var) {
            El();
            ((a2) this.f126038b).dn(k1Var);
            return this;
        }

        @Override // com.google.api.b2
        public String h0() {
            return ((a2) this.f126038b).h0();
        }

        public b hm(int i10) {
            El();
            ((a2) this.f126038b).en(i10);
            return this;
        }

        public b im(String str) {
            El();
            ((a2) this.f126038b).fn(str);
            return this;
        }

        public b jm(com.google.protobuf.u uVar) {
            El();
            ((a2) this.f126038b).gn(uVar);
            return this;
        }

        @Override // com.google.api.b2
        public com.google.protobuf.u k() {
            return ((a2) this.f126038b).k();
        }

        public b km(String str) {
            El();
            ((a2) this.f126038b).hn(str);
            return this;
        }

        public b lm(com.google.protobuf.u uVar) {
            El();
            ((a2) this.f126038b).in(uVar);
            return this;
        }

        @Override // com.google.api.b2
        public com.google.protobuf.u s() {
            return ((a2) this.f126038b).s();
        }

        private b() {
            super(a2.DEFAULT_INSTANCE);
        }
    }

    static {
        a2 a2Var = new a2();
        DEFAULT_INSTANCE = a2Var;
        com.google.protobuf.l1.Wl(a2.class, a2Var);
    }

    private a2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am() {
        this.labels_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm() {
        this.launchStage_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm() {
        this.name_ = Fm().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm() {
        this.type_ = Fm().c();
    }

    private void Em() {
        com.google.protobuf.s1.k<h1> kVar = this.labels_;
        if (!kVar.s1()) {
            this.labels_ = com.google.protobuf.l1.yl(kVar);
        }
    }

    public static a2 Fm() {
        return DEFAULT_INSTANCE;
    }

    public static b Im() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Jm(a2 a2Var) {
        return DEFAULT_INSTANCE.Uf(a2Var);
    }

    public static a2 Km(InputStream inputStream) throws IOException {
        return (a2) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static a2 Lm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (a2) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a2 Mm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (a2) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static a2 Nm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (a2) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static a2 Om(com.google.protobuf.z zVar) throws IOException {
        return (a2) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static a2 Pm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (a2) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static a2 Qm(InputStream inputStream) throws IOException {
        return (a2) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static a2 Rm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (a2) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a2 Sm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (a2) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static a2 Tm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (a2) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static a2 Um(byte[] bArr) throws com.google.protobuf.t1 {
        return (a2) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static a2 Vm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (a2) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<a2> Wm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Xm(int i10) {
        Em();
        this.labels_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ym(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.description_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.displayName_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn(int i10, h1 h1Var) {
        h1Var.getClass();
        Em();
        this.labels_.set(i10, h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dn(k1 k1Var) {
        this.launchStage_ = k1Var.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void en(int i10) {
        this.launchStage_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.name_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void in(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.type_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(Iterable<? extends h1> iterable) {
        Em();
        com.google.protobuf.a.y(iterable, this.labels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(int i10, h1 h1Var) {
        h1Var.getClass();
        Em();
        this.labels_.add(i10, h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(h1 h1Var) {
        h1Var.getClass();
        Em();
        this.labels_.add(h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym() {
        this.description_ = Fm().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm() {
        this.displayName_ = Fm().h0();
    }

    @Override // com.google.api.b2
    public int E() {
        return this.labels_.size();
    }

    public i1 Gm(int i10) {
        return this.labels_.get(i10);
    }

    public List<? extends i1> Hm() {
        return this.labels_;
    }

    @Override // com.google.api.b2
    public h1 J1(int i10) {
        return this.labels_.get(i10);
    }

    @Override // com.google.api.b2
    public int K1() {
        return this.launchStage_;
    }

    @Override // com.google.api.b2
    public com.google.protobuf.u L0() {
        return com.google.protobuf.u.C(this.displayName_);
    }

    @Override // com.google.api.b2
    public List<h1> Q0() {
        return this.labels_;
    }

    @Override // com.google.api.b2
    public k1 R0() {
        k1 k1VarL = k1.l(this.launchStage_);
        return k1VarL == null ? k1.UNRECOGNIZED : k1VarL;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f115121a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new a2();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005Ȉ\u0007\f", new Object[]{"type_", "displayName_", "description_", "labels_", h1.class, "name_", "launchStage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<a2> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (a2.class) {
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

    @Override // com.google.api.b2
    public com.google.protobuf.u a() {
        return com.google.protobuf.u.C(this.name_);
    }

    @Override // com.google.api.b2
    public String c() {
        return this.type_;
    }

    @Override // com.google.api.b2
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.b2
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.b2
    public String h0() {
        return this.displayName_;
    }

    @Override // com.google.api.b2
    public com.google.protobuf.u k() {
        return com.google.protobuf.u.C(this.description_);
    }

    @Override // com.google.api.b2
    public com.google.protobuf.u s() {
        return com.google.protobuf.u.C(this.type_);
    }
}
