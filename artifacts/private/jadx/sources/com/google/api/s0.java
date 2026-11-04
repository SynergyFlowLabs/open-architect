package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends com.google.protobuf.l1<s0, b> implements t0 {
    public static final int ALIASES_FIELD_NUMBER = 2;
    public static final int ALLOW_CORS_FIELD_NUMBER = 5;
    private static final s0 DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.f3<s0> PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 101;
    private boolean allowCors_;
    private String name_ = "";
    private com.google.protobuf.s1.k<String> aliases_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<String> features_ = com.google.protobuf.l1.Ij();
    private String target_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116295a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116295a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116295a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116295a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116295a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116295a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116295a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116295a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<s0, b> implements t0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.t0
        @Deprecated
        public com.google.protobuf.u Aj(int i10) {
            return ((s0) this.f126038b).Aj(i10);
        }

        @Override // com.google.api.t0
        public com.google.protobuf.u Fi(int i10) {
            return ((s0) this.f126038b).Fi(i10);
        }

        @Override // com.google.api.t0
        public String Mb(int i10) {
            return ((s0) this.f126038b).Mb(i10);
        }

        @Deprecated
        public b Ol(String str) {
            El();
            ((s0) this.f126038b).sm(str);
            return this;
        }

        @Deprecated
        public b Pl(com.google.protobuf.u uVar) {
            El();
            ((s0) this.f126038b).tm(uVar);
            return this;
        }

        @Deprecated
        public b Ql(Iterable<String> iterable) {
            El();
            ((s0) this.f126038b).um(iterable);
            return this;
        }

        @Override // com.google.api.t0
        public int Rk() {
            return ((s0) this.f126038b).Rk();
        }

        public b Rl(Iterable<String> iterable) {
            El();
            ((s0) this.f126038b).vm(iterable);
            return this;
        }

        public b Sl(String str) {
            El();
            ((s0) this.f126038b).wm(str);
            return this;
        }

        @Override // com.google.api.t0
        public boolean Td() {
            return ((s0) this.f126038b).Td();
        }

        public b Tl(com.google.protobuf.u uVar) {
            El();
            ((s0) this.f126038b).xm(uVar);
            return this;
        }

        @Deprecated
        public b Ul() {
            El();
            ((s0) this.f126038b).ym();
            return this;
        }

        public b Vl() {
            El();
            ((s0) this.f126038b).zm();
            return this;
        }

        public b Wl() {
            El();
            ((s0) this.f126038b).Am();
            return this;
        }

        public b Xl() {
            El();
            ((s0) this.f126038b).Bm();
            return this;
        }

        public b Yl() {
            El();
            ((s0) this.f126038b).Cm();
            return this;
        }

        @Override // com.google.api.t0
        public com.google.protobuf.u Ze() {
            return ((s0) this.f126038b).Ze();
        }

        @Deprecated
        public b Zl(int i10, String str) {
            El();
            ((s0) this.f126038b).Vm(i10, str);
            return this;
        }

        @Override // com.google.api.t0
        public com.google.protobuf.u a() {
            return ((s0) this.f126038b).a();
        }

        public b am(boolean z10) {
            El();
            ((s0) this.f126038b).Wm(z10);
            return this;
        }

        public b bm(int i10, String str) {
            El();
            ((s0) this.f126038b).Xm(i10, str);
            return this;
        }

        public b cm(String str) {
            El();
            ((s0) this.f126038b).Ym(str);
            return this;
        }

        public b dm(com.google.protobuf.u uVar) {
            El();
            ((s0) this.f126038b).Zm(uVar);
            return this;
        }

        @Override // com.google.api.t0
        @Deprecated
        public String eh(int i10) {
            return ((s0) this.f126038b).eh(i10);
        }

        public b em(String str) {
            El();
            ((s0) this.f126038b).an(str);
            return this;
        }

        @Override // com.google.api.t0
        public List<String> f9() {
            return Collections.unmodifiableList(((s0) this.f126038b).f9());
        }

        public b fm(com.google.protobuf.u uVar) {
            El();
            ((s0) this.f126038b).bn(uVar);
            return this;
        }

        @Override // com.google.api.t0
        public String getName() {
            return ((s0) this.f126038b).getName();
        }

        @Override // com.google.api.t0
        @Deprecated
        public List<String> o8() {
            return Collections.unmodifiableList(((s0) this.f126038b).o8());
        }

        @Override // com.google.api.t0
        @Deprecated
        public int vi() {
            return ((s0) this.f126038b).vi();
        }

        @Override // com.google.api.t0
        public String y1() {
            return ((s0) this.f126038b).y1();
        }

        private b() {
            super(s0.DEFAULT_INSTANCE);
        }
    }

    static {
        s0 s0Var = new s0();
        DEFAULT_INSTANCE = s0Var;
        com.google.protobuf.l1.Wl(s0.class, s0Var);
    }

    private s0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am() {
        this.features_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm() {
        this.name_ = Fm().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm() {
        this.target_ = Fm().y1();
    }

    private void Dm() {
        com.google.protobuf.s1.k<String> kVar = this.aliases_;
        if (kVar.s1()) {
            return;
        }
        this.aliases_ = com.google.protobuf.l1.yl(kVar);
    }

    private void Em() {
        com.google.protobuf.s1.k<String> kVar = this.features_;
        if (kVar.s1()) {
            return;
        }
        this.features_ = com.google.protobuf.l1.yl(kVar);
    }

    public static s0 Fm() {
        return DEFAULT_INSTANCE;
    }

    public static b Gm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Hm(s0 s0Var) {
        return DEFAULT_INSTANCE.Uf(s0Var);
    }

    public static s0 Im(InputStream inputStream) throws IOException {
        return (s0) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static s0 Jm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (s0) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static s0 Km(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (s0) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static s0 Lm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (s0) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static s0 Mm(com.google.protobuf.z zVar) throws IOException {
        return (s0) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static s0 Nm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (s0) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static s0 Om(InputStream inputStream) throws IOException {
        return (s0) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static s0 Pm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (s0) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static s0 Qm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (s0) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s0 Rm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (s0) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static s0 Sm(byte[] bArr) throws com.google.protobuf.t1 {
        return (s0) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static s0 Tm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (s0) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<s0> Um() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Vm(int i10, String str) {
        str.getClass();
        Dm();
        this.aliases_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wm(boolean z10) {
        this.allowCors_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Xm(int i10, String str) {
        str.getClass();
        Em();
        this.features_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ym(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.name_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an(String str) {
        str.getClass();
        this.target_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.target_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sm(String str) {
        str.getClass();
        Dm();
        this.aliases_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        Dm();
        this.aliases_.add(uVar.z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(Iterable<String> iterable) {
        Dm();
        com.google.protobuf.a.y(iterable, this.aliases_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(Iterable<String> iterable) {
        Em();
        com.google.protobuf.a.y(iterable, this.features_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(String str) {
        str.getClass();
        Em();
        this.features_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        Em();
        this.features_.add(uVar.z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym() {
        this.aliases_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm() {
        this.allowCors_ = false;
    }

    @Override // com.google.api.t0
    @Deprecated
    public com.google.protobuf.u Aj(int i10) {
        return com.google.protobuf.u.C(this.aliases_.get(i10));
    }

    @Override // com.google.api.t0
    public com.google.protobuf.u Fi(int i10) {
        return com.google.protobuf.u.C(this.features_.get(i10));
    }

    @Override // com.google.api.t0
    public String Mb(int i10) {
        return this.features_.get(i10);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116295a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new s0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001e\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0004Ț\u0005\u0007eȈ", new Object[]{"name_", "aliases_", "features_", "allowCors_", "target_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<s0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (s0.class) {
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

    @Override // com.google.api.t0
    public int Rk() {
        return this.features_.size();
    }

    @Override // com.google.api.t0
    public boolean Td() {
        return this.allowCors_;
    }

    @Override // com.google.api.t0
    public com.google.protobuf.u Ze() {
        return com.google.protobuf.u.C(this.target_);
    }

    @Override // com.google.api.t0
    public com.google.protobuf.u a() {
        return com.google.protobuf.u.C(this.name_);
    }

    @Override // com.google.api.t0
    @Deprecated
    public String eh(int i10) {
        return this.aliases_.get(i10);
    }

    @Override // com.google.api.t0
    public List<String> f9() {
        return this.features_;
    }

    @Override // com.google.api.t0
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.t0
    @Deprecated
    public List<String> o8() {
        return this.aliases_;
    }

    @Override // com.google.api.t0
    @Deprecated
    public int vi() {
        return this.aliases_.size();
    }

    @Override // com.google.api.t0
    public String y1() {
        return this.target_;
    }
}
