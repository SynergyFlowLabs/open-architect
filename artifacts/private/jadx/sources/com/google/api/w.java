package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends com.google.protobuf.l1<w, b> implements x {
    public static final int ADVICES_FIELD_NUMBER = 5;
    public static final int CHANGE_TYPE_FIELD_NUMBER = 4;
    private static final w DEFAULT_INSTANCE;
    public static final int ELEMENT_FIELD_NUMBER = 1;
    public static final int NEW_VALUE_FIELD_NUMBER = 3;
    public static final int OLD_VALUE_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.f3<w> PARSER;
    private int changeType_;
    private String element_ = "";
    private String oldValue_ = "";
    private String newValue_ = "";
    private com.google.protobuf.s1.k<com.google.api.a> advices_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116390a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116390a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116390a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116390a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116390a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116390a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116390a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116390a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<w, b> implements x {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.x
        public int Gg() {
            return ((w) this.f126038b).Gg();
        }

        @Override // com.google.api.x
        public String Hh() {
            return ((w) this.f126038b).Hh();
        }

        public b Ol(int i10, com.google.api.a.b bVar) {
            El();
            ((w) this.f126038b).sm(i10, bVar.build());
            return this;
        }

        public b Pl(int i10, com.google.api.a aVar) {
            El();
            ((w) this.f126038b).sm(i10, aVar);
            return this;
        }

        public b Ql(com.google.api.a.b bVar) {
            El();
            ((w) this.f126038b).tm(bVar.build());
            return this;
        }

        @Override // com.google.api.x
        public List<com.google.api.a> Rf() {
            return Collections.unmodifiableList(((w) this.f126038b).Rf());
        }

        public b Rl(com.google.api.a aVar) {
            El();
            ((w) this.f126038b).tm(aVar);
            return this;
        }

        public b Sl(Iterable<? extends com.google.api.a> iterable) {
            El();
            ((w) this.f126038b).um(iterable);
            return this;
        }

        @Override // com.google.api.x
        public String Tf() {
            return ((w) this.f126038b).Tf();
        }

        public b Tl() {
            El();
            ((w) this.f126038b).vm();
            return this;
        }

        public b Ul() {
            El();
            ((w) this.f126038b).wm();
            return this;
        }

        public b Vl() {
            El();
            ((w) this.f126038b).xm();
            return this;
        }

        public b Wl() {
            El();
            ((w) this.f126038b).ym();
            return this;
        }

        @Override // com.google.api.x
        public String X0() {
            return ((w) this.f126038b).X0();
        }

        public b Xl() {
            El();
            ((w) this.f126038b).zm();
            return this;
        }

        @Override // com.google.api.x
        public com.google.protobuf.u Ye() {
            return ((w) this.f126038b).Ye();
        }

        public b Yl(int i10) {
            El();
            ((w) this.f126038b).Tm(i10);
            return this;
        }

        public b Zl(int i10, com.google.api.a.b bVar) {
            El();
            ((w) this.f126038b).Um(i10, bVar.build());
            return this;
        }

        public b am(int i10, com.google.api.a aVar) {
            El();
            ((w) this.f126038b).Um(i10, aVar);
            return this;
        }

        public b bm(u uVar) {
            El();
            ((w) this.f126038b).Vm(uVar);
            return this;
        }

        public b cm(int i10) {
            El();
            ((w) this.f126038b).Wm(i10);
            return this;
        }

        public b dm(String str) {
            El();
            ((w) this.f126038b).Xm(str);
            return this;
        }

        public b em(com.google.protobuf.u uVar) {
            El();
            ((w) this.f126038b).Ym(uVar);
            return this;
        }

        public b fm(String str) {
            El();
            ((w) this.f126038b).Zm(str);
            return this;
        }

        public b gm(com.google.protobuf.u uVar) {
            El();
            ((w) this.f126038b).an(uVar);
            return this;
        }

        public b hm(String str) {
            El();
            ((w) this.f126038b).bn(str);
            return this;
        }

        @Override // com.google.api.x
        public com.google.api.a id(int i10) {
            return ((w) this.f126038b).id(i10);
        }

        public b im(com.google.protobuf.u uVar) {
            El();
            ((w) this.f126038b).cn(uVar);
            return this;
        }

        @Override // com.google.api.x
        public u kb() {
            return ((w) this.f126038b).kb();
        }

        @Override // com.google.api.x
        public com.google.protobuf.u o9() {
            return ((w) this.f126038b).o9();
        }

        @Override // com.google.api.x
        public int x8() {
            return ((w) this.f126038b).x8();
        }

        @Override // com.google.api.x
        public com.google.protobuf.u xb() {
            return ((w) this.f126038b).xb();
        }

        private b() {
            super(w.DEFAULT_INSTANCE);
        }
    }

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        com.google.protobuf.l1.Wl(w.class, wVar);
    }

    private w() {
    }

    private void Am() {
        com.google.protobuf.s1.k<com.google.api.a> kVar = this.advices_;
        if (kVar.s1()) {
            return;
        }
        this.advices_ = com.google.protobuf.l1.yl(kVar);
    }

    public static w Dm() {
        return DEFAULT_INSTANCE;
    }

    public static b Em() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Fm(w wVar) {
        return DEFAULT_INSTANCE.Uf(wVar);
    }

    public static w Gm(InputStream inputStream) throws IOException {
        return (w) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static w Hm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (w) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static w Im(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (w) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static w Jm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (w) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static w Km(com.google.protobuf.z zVar) throws IOException {
        return (w) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static w Lm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (w) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static w Mm(InputStream inputStream) throws IOException {
        return (w) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static w Nm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (w) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static w Om(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (w) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w Pm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (w) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static w Qm(byte[] bArr) throws com.google.protobuf.t1 {
        return (w) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static w Rm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (w) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<w> Sm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm(int i10) {
        Am();
        this.advices_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Um(int i10, com.google.api.a aVar) {
        aVar.getClass();
        Am();
        this.advices_.set(i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Vm(u uVar) {
        this.changeType_ = uVar.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wm(int i10) {
        this.changeType_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Xm(String str) {
        str.getClass();
        this.element_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ym(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.element_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zm(String str) {
        str.getClass();
        this.newValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.newValue_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn(String str) {
        str.getClass();
        this.oldValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.oldValue_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sm(int i10, com.google.api.a aVar) {
        aVar.getClass();
        Am();
        this.advices_.add(i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tm(com.google.api.a aVar) {
        aVar.getClass();
        Am();
        this.advices_.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(Iterable<? extends com.google.api.a> iterable) {
        Am();
        com.google.protobuf.a.y(iterable, this.advices_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm() {
        this.advices_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm() {
        this.changeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm() {
        this.element_ = Dm().X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym() {
        this.newValue_ = Dm().Hh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm() {
        this.oldValue_ = Dm().Tf();
    }

    public com.google.api.b Bm(int i10) {
        return this.advices_.get(i10);
    }

    public List<? extends com.google.api.b> Cm() {
        return this.advices_;
    }

    @Override // com.google.api.x
    public int Gg() {
        return this.changeType_;
    }

    @Override // com.google.api.x
    public String Hh() {
        return this.newValue_;
    }

    @Override // com.google.api.x
    public List<com.google.api.a> Rf() {
        return this.advices_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116390a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new w();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001b", new Object[]{"element_", "oldValue_", "newValue_", "changeType_", "advices_", com.google.api.a.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<w> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (w.class) {
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

    @Override // com.google.api.x
    public String Tf() {
        return this.oldValue_;
    }

    @Override // com.google.api.x
    public String X0() {
        return this.element_;
    }

    @Override // com.google.api.x
    public com.google.protobuf.u Ye() {
        return com.google.protobuf.u.C(this.newValue_);
    }

    @Override // com.google.api.x
    public com.google.api.a id(int i10) {
        return this.advices_.get(i10);
    }

    @Override // com.google.api.x
    public u kb() {
        u uVarL = u.l(this.changeType_);
        return uVarL == null ? u.UNRECOGNIZED : uVarL;
    }

    @Override // com.google.api.x
    public com.google.protobuf.u o9() {
        return com.google.protobuf.u.C(this.element_);
    }

    @Override // com.google.api.x
    public int x8() {
        return this.advices_.size();
    }

    @Override // com.google.api.x
    public com.google.protobuf.u xb() {
        return com.google.protobuf.u.C(this.oldValue_);
    }
}
