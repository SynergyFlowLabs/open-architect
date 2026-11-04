package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class n2 extends com.google.protobuf.l1<n2, b> implements o2 {
    private static final n2 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.f3<n2> PARSER = null;
    public static final int PROPERTIES_FIELD_NUMBER = 1;
    private com.google.protobuf.s1.k<p2> properties_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116255a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116255a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116255a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116255a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116255a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116255a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116255a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116255a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<n2, b> implements o2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.o2
        public p2 Ga(int i10) {
            return ((n2) this.f126038b).Ga(i10);
        }

        @Override // com.google.api.o2
        public int Ki() {
            return ((n2) this.f126038b).Ki();
        }

        public b Ol(Iterable<? extends p2> iterable) {
            El();
            ((n2) this.f126038b).gm(iterable);
            return this;
        }

        public b Pl(int i10, p2.b bVar) {
            El();
            ((n2) this.f126038b).hm(i10, bVar.build());
            return this;
        }

        public b Ql(int i10, p2 p2Var) {
            El();
            ((n2) this.f126038b).hm(i10, p2Var);
            return this;
        }

        public b Rl(p2.b bVar) {
            El();
            ((n2) this.f126038b).im(bVar.build());
            return this;
        }

        public b Sl(p2 p2Var) {
            El();
            ((n2) this.f126038b).im(p2Var);
            return this;
        }

        public b Tl() {
            El();
            ((n2) this.f126038b).jm();
            return this;
        }

        public b Ul(int i10) {
            El();
            ((n2) this.f126038b).Dm(i10);
            return this;
        }

        public b Vl(int i10, p2.b bVar) {
            El();
            ((n2) this.f126038b).Em(i10, bVar.build());
            return this;
        }

        public b Wl(int i10, p2 p2Var) {
            El();
            ((n2) this.f126038b).Em(i10, p2Var);
            return this;
        }

        @Override // com.google.api.o2
        public List<p2> al() {
            return Collections.unmodifiableList(((n2) this.f126038b).al());
        }

        private b() {
            super(n2.DEFAULT_INSTANCE);
        }
    }

    static {
        n2 n2Var = new n2();
        DEFAULT_INSTANCE = n2Var;
        com.google.protobuf.l1.Wl(n2.class, n2Var);
    }

    private n2() {
    }

    public static n2 Am(byte[] bArr) throws com.google.protobuf.t1 {
        return (n2) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static n2 Bm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (n2) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<n2> Cm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(int i10) {
        km();
        this.properties_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(int i10, p2 p2Var) {
        p2Var.getClass();
        km();
        this.properties_.set(i10, p2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(Iterable<? extends p2> iterable) {
        km();
        com.google.protobuf.a.y(iterable, this.properties_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm(int i10, p2 p2Var) {
        p2Var.getClass();
        km();
        this.properties_.add(i10, p2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im(p2 p2Var) {
        p2Var.getClass();
        km();
        this.properties_.add(p2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.properties_ = com.google.protobuf.l1.Ij();
    }

    private void km() {
        com.google.protobuf.s1.k<p2> kVar = this.properties_;
        if (kVar.s1()) {
            return;
        }
        this.properties_ = com.google.protobuf.l1.yl(kVar);
    }

    public static n2 lm() {
        return DEFAULT_INSTANCE;
    }

    public static b om() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b pm(n2 n2Var) {
        return DEFAULT_INSTANCE.Uf(n2Var);
    }

    public static n2 qm(InputStream inputStream) throws IOException {
        return (n2) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static n2 rm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (n2) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static n2 sm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (n2) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static n2 tm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (n2) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static n2 um(com.google.protobuf.z zVar) throws IOException {
        return (n2) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static n2 vm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (n2) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static n2 wm(InputStream inputStream) throws IOException {
        return (n2) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static n2 xm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (n2) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static n2 ym(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (n2) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n2 zm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (n2) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    @Override // com.google.api.o2
    public p2 Ga(int i10) {
        return this.properties_.get(i10);
    }

    @Override // com.google.api.o2
    public int Ki() {
        return this.properties_.size();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116255a[iVar.ordinal()];
        a aVar = null;
        boolean z10 = true & false;
        switch (i10) {
            case 1:
                return new n2();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"properties_", p2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<n2> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (n2.class) {
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

    @Override // com.google.api.o2
    public List<p2> al() {
        return this.properties_;
    }

    public q2 mm(int i10) {
        return this.properties_.get(i10);
    }

    public List<? extends q2> nm() {
        return this.properties_;
    }
}
