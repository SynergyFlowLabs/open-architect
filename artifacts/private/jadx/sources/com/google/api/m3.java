package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m3 extends com.google.protobuf.l1<m3, b> implements n3 {
    private static final m3 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.f3<m3> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private com.google.protobuf.s1.k<k3> rules_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116253a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116253a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116253a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116253a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116253a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116253a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116253a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116253a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<m3, b> implements n3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.n3
        public k3 F(int i10) {
            return ((m3) this.f126038b).F(i10);
        }

        @Override // com.google.api.n3
        public int G() {
            return ((m3) this.f126038b).G();
        }

        @Override // com.google.api.n3
        public List<k3> H() {
            return Collections.unmodifiableList(((m3) this.f126038b).H());
        }

        public b Ol(Iterable<? extends k3> iterable) {
            El();
            ((m3) this.f126038b).gm(iterable);
            return this;
        }

        public b Pl(int i10, k3.b bVar) {
            El();
            ((m3) this.f126038b).hm(i10, bVar.build());
            return this;
        }

        public b Ql(int i10, k3 k3Var) {
            El();
            ((m3) this.f126038b).hm(i10, k3Var);
            return this;
        }

        public b Rl(k3.b bVar) {
            El();
            ((m3) this.f126038b).im(bVar.build());
            return this;
        }

        public b Sl(k3 k3Var) {
            El();
            ((m3) this.f126038b).im(k3Var);
            return this;
        }

        public b Tl() {
            El();
            ((m3) this.f126038b).jm();
            return this;
        }

        public b Ul(int i10) {
            El();
            ((m3) this.f126038b).Dm(i10);
            return this;
        }

        public b Vl(int i10, k3.b bVar) {
            El();
            ((m3) this.f126038b).Em(i10, bVar.build());
            return this;
        }

        public b Wl(int i10, k3 k3Var) {
            El();
            ((m3) this.f126038b).Em(i10, k3Var);
            return this;
        }

        private b() {
            super(m3.DEFAULT_INSTANCE);
        }
    }

    static {
        m3 m3Var = new m3();
        DEFAULT_INSTANCE = m3Var;
        com.google.protobuf.l1.Wl(m3.class, m3Var);
    }

    private m3() {
    }

    public static m3 Am(byte[] bArr) throws com.google.protobuf.t1 {
        return (m3) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static m3 Bm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (m3) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<m3> Cm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(int i10) {
        km();
        this.rules_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(int i10, k3 k3Var) {
        k3Var.getClass();
        km();
        this.rules_.set(i10, k3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(Iterable<? extends k3> iterable) {
        km();
        com.google.protobuf.a.y(iterable, this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm(int i10, k3 k3Var) {
        k3Var.getClass();
        km();
        this.rules_.add(i10, k3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im(k3 k3Var) {
        k3Var.getClass();
        km();
        this.rules_.add(k3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.rules_ = com.google.protobuf.l1.Ij();
    }

    private void km() {
        com.google.protobuf.s1.k<k3> kVar = this.rules_;
        if (!kVar.s1()) {
            this.rules_ = com.google.protobuf.l1.yl(kVar);
        }
    }

    public static m3 lm() {
        return DEFAULT_INSTANCE;
    }

    public static b om() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b pm(m3 m3Var) {
        return DEFAULT_INSTANCE.Uf(m3Var);
    }

    public static m3 qm(InputStream inputStream) throws IOException {
        return (m3) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static m3 rm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (m3) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static m3 sm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (m3) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static m3 tm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (m3) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static m3 um(com.google.protobuf.z zVar) throws IOException {
        return (m3) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static m3 vm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (m3) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static m3 wm(InputStream inputStream) throws IOException {
        return (m3) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static m3 xm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (m3) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static m3 ym(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (m3) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m3 zm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (m3) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    @Override // com.google.api.n3
    public k3 F(int i10) {
        return this.rules_.get(i10);
    }

    @Override // com.google.api.n3
    public int G() {
        return this.rules_.size();
    }

    @Override // com.google.api.n3
    public List<k3> H() {
        return this.rules_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116253a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new m3();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", k3.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<m3> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (m3.class) {
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

    public l3 mm(int i10) {
        return this.rules_.get(i10);
    }

    public List<? extends l3> nm() {
        return this.rules_;
    }
}
