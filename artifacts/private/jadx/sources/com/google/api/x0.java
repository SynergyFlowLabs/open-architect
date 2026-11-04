package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends com.google.protobuf.l1<x0, b> implements b1 {
    private static final x0 DEFAULT_INSTANCE;
    public static final int FULLY_DECODE_RESERVED_EXPANSION_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.f3<x0> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private boolean fullyDecodeReservedExpansion_;
    private com.google.protobuf.s1.k<d1> rules_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116405a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116405a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116405a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116405a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116405a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116405a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116405a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116405a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<x0, b> implements b1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.b1
        public d1 F(int i10) {
            return ((x0) this.f126038b).F(i10);
        }

        @Override // com.google.api.b1
        public int G() {
            return ((x0) this.f126038b).G();
        }

        @Override // com.google.api.b1
        public List<d1> H() {
            return Collections.unmodifiableList(((x0) this.f126038b).H());
        }

        public b Ol(Iterable<? extends d1> iterable) {
            El();
            ((x0) this.f126038b).im(iterable);
            return this;
        }

        public b Pl(int i10, d1.b bVar) {
            El();
            ((x0) this.f126038b).jm(i10, bVar.build());
            return this;
        }

        public b Ql(int i10, d1 d1Var) {
            El();
            ((x0) this.f126038b).jm(i10, d1Var);
            return this;
        }

        public b Rl(d1.b bVar) {
            El();
            ((x0) this.f126038b).km(bVar.build());
            return this;
        }

        public b Sl(d1 d1Var) {
            El();
            ((x0) this.f126038b).km(d1Var);
            return this;
        }

        public b Tl() {
            El();
            ((x0) this.f126038b).lm();
            return this;
        }

        public b Ul() {
            El();
            ((x0) this.f126038b).mm();
            return this;
        }

        public b Vl(int i10) {
            El();
            ((x0) this.f126038b).Gm(i10);
            return this;
        }

        public b Wl(boolean z10) {
            El();
            ((x0) this.f126038b).Hm(z10);
            return this;
        }

        @Override // com.google.api.b1
        public boolean Xg() {
            return ((x0) this.f126038b).Xg();
        }

        public b Xl(int i10, d1.b bVar) {
            El();
            ((x0) this.f126038b).Im(i10, bVar.build());
            return this;
        }

        public b Yl(int i10, d1 d1Var) {
            El();
            ((x0) this.f126038b).Im(i10, d1Var);
            return this;
        }

        private b() {
            super(x0.DEFAULT_INSTANCE);
        }
    }

    static {
        x0 x0Var = new x0();
        DEFAULT_INSTANCE = x0Var;
        com.google.protobuf.l1.Wl(x0.class, x0Var);
    }

    private x0() {
    }

    public static x0 Am(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (x0) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static x0 Bm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (x0) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x0 Cm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (x0) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static x0 Dm(byte[] bArr) throws com.google.protobuf.t1 {
        return (x0) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static x0 Em(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (x0) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<x0> Fm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(int i10) {
        nm();
        this.rules_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(boolean z10) {
        this.fullyDecodeReservedExpansion_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im(int i10, d1 d1Var) {
        d1Var.getClass();
        nm();
        this.rules_.set(i10, d1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im(Iterable<? extends d1> iterable) {
        nm();
        com.google.protobuf.a.y(iterable, this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm(int i10, d1 d1Var) {
        d1Var.getClass();
        nm();
        this.rules_.add(i10, d1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km(d1 d1Var) {
        d1Var.getClass();
        nm();
        this.rules_.add(d1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm() {
        this.fullyDecodeReservedExpansion_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm() {
        this.rules_ = com.google.protobuf.l1.Ij();
    }

    private void nm() {
        com.google.protobuf.s1.k<d1> kVar = this.rules_;
        if (!kVar.s1()) {
            this.rules_ = com.google.protobuf.l1.yl(kVar);
        }
    }

    public static x0 om() {
        return DEFAULT_INSTANCE;
    }

    public static b rm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b sm(x0 x0Var) {
        return DEFAULT_INSTANCE.Uf(x0Var);
    }

    public static x0 tm(InputStream inputStream) throws IOException {
        return (x0) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static x0 um(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (x0) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static x0 vm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (x0) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static x0 wm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (x0) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static x0 xm(com.google.protobuf.z zVar) throws IOException {
        return (x0) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static x0 ym(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (x0) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static x0 zm(InputStream inputStream) throws IOException {
        return (x0) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    @Override // com.google.api.b1
    public d1 F(int i10) {
        return this.rules_.get(i10);
    }

    @Override // com.google.api.b1
    public int G() {
        return this.rules_.size();
    }

    @Override // com.google.api.b1
    public List<d1> H() {
        return this.rules_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116405a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new x0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"rules_", d1.class, "fullyDecodeReservedExpansion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<x0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (x0.class) {
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

    @Override // com.google.api.b1
    public boolean Xg() {
        return this.fullyDecodeReservedExpansion_;
    }

    public e1 pm(int i10) {
        return this.rules_.get(i10);
    }

    public List<? extends e1> qm() {
        return this.rules_;
    }
}
