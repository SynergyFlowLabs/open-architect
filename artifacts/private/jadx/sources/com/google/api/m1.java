package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 extends com.google.protobuf.l1<m1, b> implements n1 {
    private static final m1 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 4;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.f3<m1> PARSER;
    private String name_ = "";
    private com.google.protobuf.s1.k<h1> labels_ = com.google.protobuf.l1.Ij();
    private String description_ = "";
    private String displayName_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116252a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116252a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116252a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116252a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116252a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116252a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116252a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116252a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<m1, b> implements n1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.n1
        public int E() {
            return ((m1) this.f126038b).E();
        }

        @Override // com.google.api.n1
        public h1 J1(int i10) {
            return ((m1) this.f126038b).J1(i10);
        }

        @Override // com.google.api.n1
        public com.google.protobuf.u L0() {
            return ((m1) this.f126038b).L0();
        }

        public b Ol(Iterable<? extends h1> iterable) {
            El();
            ((m1) this.f126038b).pm(iterable);
            return this;
        }

        public b Pl(int i10, h1.b bVar) {
            El();
            ((m1) this.f126038b).qm(i10, bVar.build());
            return this;
        }

        @Override // com.google.api.n1
        public List<h1> Q0() {
            return Collections.unmodifiableList(((m1) this.f126038b).Q0());
        }

        public b Ql(int i10, h1 h1Var) {
            El();
            ((m1) this.f126038b).qm(i10, h1Var);
            return this;
        }

        public b Rl(h1.b bVar) {
            El();
            ((m1) this.f126038b).rm(bVar.build());
            return this;
        }

        public b Sl(h1 h1Var) {
            El();
            ((m1) this.f126038b).rm(h1Var);
            return this;
        }

        public b Tl() {
            El();
            ((m1) this.f126038b).sm();
            return this;
        }

        public b Ul() {
            El();
            ((m1) this.f126038b).tm();
            return this;
        }

        public b Vl() {
            El();
            ((m1) this.f126038b).um();
            return this;
        }

        public b Wl() {
            El();
            ((m1) this.f126038b).vm();
            return this;
        }

        public b Xl(int i10) {
            El();
            ((m1) this.f126038b).Pm(i10);
            return this;
        }

        public b Yl(String str) {
            El();
            ((m1) this.f126038b).Qm(str);
            return this;
        }

        public b Zl(com.google.protobuf.u uVar) {
            El();
            ((m1) this.f126038b).Rm(uVar);
            return this;
        }

        @Override // com.google.api.n1
        public com.google.protobuf.u a() {
            return ((m1) this.f126038b).a();
        }

        public b am(String str) {
            El();
            ((m1) this.f126038b).Sm(str);
            return this;
        }

        public b bm(com.google.protobuf.u uVar) {
            El();
            ((m1) this.f126038b).Tm(uVar);
            return this;
        }

        public b cm(int i10, h1.b bVar) {
            El();
            ((m1) this.f126038b).Um(i10, bVar.build());
            return this;
        }

        public b dm(int i10, h1 h1Var) {
            El();
            ((m1) this.f126038b).Um(i10, h1Var);
            return this;
        }

        public b em(String str) {
            El();
            ((m1) this.f126038b).Vm(str);
            return this;
        }

        public b fm(com.google.protobuf.u uVar) {
            El();
            ((m1) this.f126038b).Wm(uVar);
            return this;
        }

        @Override // com.google.api.n1
        public String getDescription() {
            return ((m1) this.f126038b).getDescription();
        }

        @Override // com.google.api.n1
        public String getName() {
            return ((m1) this.f126038b).getName();
        }

        @Override // com.google.api.n1
        public String h0() {
            return ((m1) this.f126038b).h0();
        }

        @Override // com.google.api.n1
        public com.google.protobuf.u k() {
            return ((m1) this.f126038b).k();
        }

        private b() {
            super(m1.DEFAULT_INSTANCE);
        }
    }

    static {
        m1 m1Var = new m1();
        DEFAULT_INSTANCE = m1Var;
        com.google.protobuf.l1.Wl(m1.class, m1Var);
    }

    private m1() {
    }

    public static b Am() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Bm(m1 m1Var) {
        return DEFAULT_INSTANCE.Uf(m1Var);
    }

    public static m1 Cm(InputStream inputStream) throws IOException {
        return (m1) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static m1 Dm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (m1) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static m1 Em(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (m1) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static m1 Fm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (m1) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static m1 Gm(com.google.protobuf.z zVar) throws IOException {
        return (m1) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static m1 Hm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (m1) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static m1 Im(InputStream inputStream) throws IOException {
        return (m1) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static m1 Jm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (m1) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static m1 Km(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (m1) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m1 Lm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (m1) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static m1 Mm(byte[] bArr) throws com.google.protobuf.t1 {
        return (m1) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static m1 Nm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (m1) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<m1> Om() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm(int i10) {
        wm();
        this.labels_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.description_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.displayName_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Um(int i10, h1 h1Var) {
        h1Var.getClass();
        wm();
        this.labels_.set(i10, h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Vm(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.name_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm(Iterable<? extends h1> iterable) {
        wm();
        com.google.protobuf.a.y(iterable, this.labels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm(int i10, h1 h1Var) {
        h1Var.getClass();
        wm();
        this.labels_.add(i10, h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rm(h1 h1Var) {
        h1Var.getClass();
        wm();
        this.labels_.add(h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sm() {
        this.description_ = xm().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tm() {
        this.displayName_ = xm().h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um() {
        this.labels_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm() {
        this.name_ = xm().getName();
    }

    private void wm() {
        com.google.protobuf.s1.k<h1> kVar = this.labels_;
        if (kVar.s1()) {
            return;
        }
        this.labels_ = com.google.protobuf.l1.yl(kVar);
    }

    public static m1 xm() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.api.n1
    public int E() {
        return this.labels_.size();
    }

    @Override // com.google.api.n1
    public h1 J1(int i10) {
        return this.labels_.get(i10);
    }

    @Override // com.google.api.n1
    public com.google.protobuf.u L0() {
        return com.google.protobuf.u.C(this.displayName_);
    }

    @Override // com.google.api.n1
    public List<h1> Q0() {
        return this.labels_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116252a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new m1();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004Ȉ", new Object[]{"name_", "labels_", h1.class, "description_", "displayName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<m1> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (m1.class) {
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

    @Override // com.google.api.n1
    public com.google.protobuf.u a() {
        return com.google.protobuf.u.C(this.name_);
    }

    @Override // com.google.api.n1
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.n1
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.n1
    public String h0() {
        return this.displayName_;
    }

    @Override // com.google.api.n1
    public com.google.protobuf.u k() {
        return com.google.protobuf.u.C(this.description_);
    }

    public i1 ym(int i10) {
        return this.labels_.get(i10);
    }

    public List<? extends i1> zm() {
        return this.labels_;
    }
}
