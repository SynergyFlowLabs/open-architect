package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends com.google.protobuf.l1<a0, b> implements b0 {
    private static final a0 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.f3<a0> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private com.google.protobuf.s1.k<d0> rules_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f115120a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f115120a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115120a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f115120a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f115120a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f115120a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f115120a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f115120a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<a0, b> implements b0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.b0
        public d0 F(int i10) {
            return ((a0) this.f126038b).F(i10);
        }

        @Override // com.google.api.b0
        public int G() {
            return ((a0) this.f126038b).G();
        }

        @Override // com.google.api.b0
        public List<d0> H() {
            return Collections.unmodifiableList(((a0) this.f126038b).H());
        }

        public b Ol(Iterable<? extends d0> iterable) {
            El();
            ((a0) this.f126038b).gm(iterable);
            return this;
        }

        public b Pl(int i10, d0.b bVar) {
            El();
            ((a0) this.f126038b).hm(i10, bVar.build());
            return this;
        }

        public b Ql(int i10, d0 d0Var) {
            El();
            ((a0) this.f126038b).hm(i10, d0Var);
            return this;
        }

        public b Rl(d0.b bVar) {
            El();
            ((a0) this.f126038b).im(bVar.build());
            return this;
        }

        public b Sl(d0 d0Var) {
            El();
            ((a0) this.f126038b).im(d0Var);
            return this;
        }

        public b Tl() {
            El();
            ((a0) this.f126038b).jm();
            return this;
        }

        public b Ul(int i10) {
            El();
            ((a0) this.f126038b).Dm(i10);
            return this;
        }

        public b Vl(int i10, d0.b bVar) {
            El();
            ((a0) this.f126038b).Em(i10, bVar.build());
            return this;
        }

        public b Wl(int i10, d0 d0Var) {
            El();
            ((a0) this.f126038b).Em(i10, d0Var);
            return this;
        }

        private b() {
            super(a0.DEFAULT_INSTANCE);
        }
    }

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        com.google.protobuf.l1.Wl(a0.class, a0Var);
    }

    private a0() {
    }

    public static a0 Am(byte[] bArr) throws com.google.protobuf.t1 {
        return (a0) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static a0 Bm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (a0) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<a0> Cm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(int i10) {
        km();
        this.rules_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(int i10, d0 d0Var) {
        d0Var.getClass();
        km();
        this.rules_.set(i10, d0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(Iterable<? extends d0> iterable) {
        km();
        com.google.protobuf.a.y(iterable, this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm(int i10, d0 d0Var) {
        d0Var.getClass();
        km();
        this.rules_.add(i10, d0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im(d0 d0Var) {
        d0Var.getClass();
        km();
        this.rules_.add(d0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.rules_ = com.google.protobuf.l1.Ij();
    }

    private void km() {
        com.google.protobuf.s1.k<d0> kVar = this.rules_;
        if (kVar.s1()) {
            return;
        }
        this.rules_ = com.google.protobuf.l1.yl(kVar);
    }

    public static a0 lm() {
        return DEFAULT_INSTANCE;
    }

    public static b om() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b pm(a0 a0Var) {
        return DEFAULT_INSTANCE.Uf(a0Var);
    }

    public static a0 qm(InputStream inputStream) throws IOException {
        return (a0) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static a0 rm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (a0) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a0 sm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (a0) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static a0 tm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (a0) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static a0 um(com.google.protobuf.z zVar) throws IOException {
        return (a0) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static a0 vm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (a0) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static a0 wm(InputStream inputStream) throws IOException {
        return (a0) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static a0 xm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (a0) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a0 ym(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (a0) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static a0 zm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (a0) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    @Override // com.google.api.b0
    public d0 F(int i10) {
        return this.rules_.get(i10);
    }

    @Override // com.google.api.b0
    public int G() {
        return this.rules_.size();
    }

    @Override // com.google.api.b0
    public List<d0> H() {
        return this.rules_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f115120a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new a0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", d0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<a0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (a0.class) {
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

    public e0 mm(int i10) {
        return this.rules_.get(i10);
    }

    public List<? extends e0> nm() {
        return this.rules_;
    }
}
