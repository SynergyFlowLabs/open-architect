package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class l2 extends com.google.protobuf.l1<l2, b> implements m2 {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final l2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.f3<l2> PARSER = null;
    public static final int SUBPAGES_FIELD_NUMBER = 3;
    private String name_ = "";
    private String content_ = "";
    private com.google.protobuf.s1.k<l2> subpages_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116250a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116250a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116250a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116250a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116250a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116250a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116250a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116250a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<l2, b> implements m2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol(Iterable<? extends l2> iterable) {
            El();
            ((l2) this.f126038b).mm(iterable);
            return this;
        }

        public b Pl(int i10, b bVar) {
            El();
            ((l2) this.f126038b).nm(i10, bVar.build());
            return this;
        }

        public b Ql(int i10, l2 l2Var) {
            El();
            ((l2) this.f126038b).nm(i10, l2Var);
            return this;
        }

        public b Rl(b bVar) {
            El();
            ((l2) this.f126038b).om(bVar.build());
            return this;
        }

        public b Sl(l2 l2Var) {
            El();
            ((l2) this.f126038b).om(l2Var);
            return this;
        }

        public b Tl() {
            El();
            ((l2) this.f126038b).pm();
            return this;
        }

        public b Ul() {
            El();
            ((l2) this.f126038b).qm();
            return this;
        }

        public b Vl() {
            El();
            ((l2) this.f126038b).rm();
            return this;
        }

        public b Wl(int i10) {
            El();
            ((l2) this.f126038b).Lm(i10);
            return this;
        }

        public b Xl(String str) {
            El();
            ((l2) this.f126038b).Mm(str);
            return this;
        }

        public b Yl(com.google.protobuf.u uVar) {
            El();
            ((l2) this.f126038b).Nm(uVar);
            return this;
        }

        public b Zl(String str) {
            El();
            ((l2) this.f126038b).Om(str);
            return this;
        }

        @Override // com.google.api.m2
        public com.google.protobuf.u a() {
            return ((l2) this.f126038b).a();
        }

        public b am(com.google.protobuf.u uVar) {
            El();
            ((l2) this.f126038b).Pm(uVar);
            return this;
        }

        public b bm(int i10, b bVar) {
            El();
            ((l2) this.f126038b).Qm(i10, bVar.build());
            return this;
        }

        public b cm(int i10, l2 l2Var) {
            El();
            ((l2) this.f126038b).Qm(i10, l2Var);
            return this;
        }

        @Override // com.google.api.m2
        public int ei() {
            return ((l2) this.f126038b).ei();
        }

        @Override // com.google.api.m2
        public String getContent() {
            return ((l2) this.f126038b).getContent();
        }

        @Override // com.google.api.m2
        public String getName() {
            return ((l2) this.f126038b).getName();
        }

        @Override // com.google.api.m2
        public List<l2> jg() {
            return Collections.unmodifiableList(((l2) this.f126038b).jg());
        }

        @Override // com.google.api.m2
        public l2 u8(int i10) {
            return ((l2) this.f126038b).u8(i10);
        }

        @Override // com.google.api.m2
        public com.google.protobuf.u yk() {
            return ((l2) this.f126038b).yk();
        }

        private b() {
            super(l2.DEFAULT_INSTANCE);
        }
    }

    static {
        l2 l2Var = new l2();
        DEFAULT_INSTANCE = l2Var;
        com.google.protobuf.l1.Wl(l2.class, l2Var);
    }

    private l2() {
    }

    public static l2 Am(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (l2) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static l2 Bm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (l2) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static l2 Cm(com.google.protobuf.z zVar) throws IOException {
        return (l2) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static l2 Dm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (l2) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static l2 Em(InputStream inputStream) throws IOException {
        return (l2) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static l2 Fm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (l2) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static l2 Gm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (l2) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l2 Hm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (l2) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static l2 Im(byte[] bArr) throws com.google.protobuf.t1 {
        return (l2) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static l2 Jm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (l2) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<l2> Km() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm(int i10) {
        sm();
        this.subpages_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.content_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.name_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm(int i10, l2 l2Var) {
        l2Var.getClass();
        sm();
        this.subpages_.set(i10, l2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm(Iterable<? extends l2> iterable) {
        sm();
        com.google.protobuf.a.y(iterable, this.subpages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm(int i10, l2 l2Var) {
        l2Var.getClass();
        sm();
        this.subpages_.add(i10, l2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om(l2 l2Var) {
        l2Var.getClass();
        sm();
        this.subpages_.add(l2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm() {
        this.content_ = tm().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm() {
        this.name_ = tm().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rm() {
        this.subpages_ = com.google.protobuf.l1.Ij();
    }

    private void sm() {
        com.google.protobuf.s1.k<l2> kVar = this.subpages_;
        if (kVar.s1()) {
            return;
        }
        this.subpages_ = com.google.protobuf.l1.yl(kVar);
    }

    public static l2 tm() {
        return DEFAULT_INSTANCE;
    }

    public static b wm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b xm(l2 l2Var) {
        return DEFAULT_INSTANCE.Uf(l2Var);
    }

    public static l2 ym(InputStream inputStream) throws IOException {
        return (l2) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static l2 zm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (l2) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116250a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new l2();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"name_", "content_", "subpages_", l2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<l2> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (l2.class) {
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

    @Override // com.google.api.m2
    public com.google.protobuf.u a() {
        return com.google.protobuf.u.C(this.name_);
    }

    @Override // com.google.api.m2
    public int ei() {
        return this.subpages_.size();
    }

    @Override // com.google.api.m2
    public String getContent() {
        return this.content_;
    }

    @Override // com.google.api.m2
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.m2
    public List<l2> jg() {
        return this.subpages_;
    }

    @Override // com.google.api.m2
    public l2 u8(int i10) {
        return this.subpages_.get(i10);
    }

    public m2 um(int i10) {
        return this.subpages_.get(i10);
    }

    public List<? extends m2> vm() {
        return this.subpages_;
    }

    @Override // com.google.api.m2
    public com.google.protobuf.u yk() {
        return com.google.protobuf.u.C(this.content_);
    }
}
