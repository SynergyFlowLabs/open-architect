package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r2 extends com.google.protobuf.l1<r2, b> implements u2 {
    private static final r2 DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.f3<r2> PARSER;
    private com.google.protobuf.s1.k<s2> limits_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<x1> metricRules_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116293a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116293a = iArr;
            try {
                int i10 = 2 & 1;
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116293a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116293a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116293a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116293a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116293a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116293a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<r2, b> implements u2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.u2
        public int Ke() {
            return ((r2) this.f126038b).Ke();
        }

        @Override // com.google.api.u2
        public List<x1> Lf() {
            return Collections.unmodifiableList(((r2) this.f126038b).Lf());
        }

        public b Ol(Iterable<? extends s2> iterable) {
            El();
            ((r2) this.f126038b).mm(iterable);
            return this;
        }

        public b Pl(Iterable<? extends x1> iterable) {
            El();
            ((r2) this.f126038b).nm(iterable);
            return this;
        }

        public b Ql(int i10, s2.b bVar) {
            El();
            ((r2) this.f126038b).om(i10, bVar.build());
            return this;
        }

        @Override // com.google.api.u2
        public List<s2> Rh() {
            return Collections.unmodifiableList(((r2) this.f126038b).Rh());
        }

        public b Rl(int i10, s2 s2Var) {
            El();
            ((r2) this.f126038b).om(i10, s2Var);
            return this;
        }

        @Override // com.google.api.u2
        public x1 Sg(int i10) {
            return ((r2) this.f126038b).Sg(i10);
        }

        public b Sl(s2.b bVar) {
            El();
            ((r2) this.f126038b).pm(bVar.build());
            return this;
        }

        public b Tl(s2 s2Var) {
            El();
            ((r2) this.f126038b).pm(s2Var);
            return this;
        }

        public b Ul(int i10, x1.b bVar) {
            El();
            ((r2) this.f126038b).qm(i10, bVar.build());
            return this;
        }

        public b Vl(int i10, x1 x1Var) {
            El();
            ((r2) this.f126038b).qm(i10, x1Var);
            return this;
        }

        public b Wl(x1.b bVar) {
            El();
            ((r2) this.f126038b).rm(bVar.build());
            return this;
        }

        public b Xl(x1 x1Var) {
            El();
            ((r2) this.f126038b).rm(x1Var);
            return this;
        }

        public b Yl() {
            El();
            ((r2) this.f126038b).sm();
            return this;
        }

        public b Zl() {
            El();
            ((r2) this.f126038b).tm();
            return this;
        }

        public b am(int i10) {
            El();
            ((r2) this.f126038b).Qm(i10);
            return this;
        }

        @Override // com.google.api.u2
        public s2 bd(int i10) {
            return ((r2) this.f126038b).bd(i10);
        }

        public b bm(int i10) {
            El();
            ((r2) this.f126038b).Rm(i10);
            return this;
        }

        public b cm(int i10, s2.b bVar) {
            El();
            ((r2) this.f126038b).Sm(i10, bVar.build());
            return this;
        }

        public b dm(int i10, s2 s2Var) {
            El();
            ((r2) this.f126038b).Sm(i10, s2Var);
            return this;
        }

        public b em(int i10, x1.b bVar) {
            El();
            ((r2) this.f126038b).Tm(i10, bVar.build());
            return this;
        }

        public b fm(int i10, x1 x1Var) {
            El();
            ((r2) this.f126038b).Tm(i10, x1Var);
            return this;
        }

        @Override // com.google.api.u2
        public int j7() {
            return ((r2) this.f126038b).j7();
        }

        private b() {
            super(r2.DEFAULT_INSTANCE);
        }
    }

    static {
        r2 r2Var = new r2();
        DEFAULT_INSTANCE = r2Var;
        com.google.protobuf.l1.Wl(r2.class, r2Var);
    }

    private r2() {
    }

    public static b Bm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Cm(r2 r2Var) {
        return DEFAULT_INSTANCE.Uf(r2Var);
    }

    public static r2 Dm(InputStream inputStream) throws IOException {
        return (r2) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static r2 Em(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (r2) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static r2 Fm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (r2) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static r2 Gm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (r2) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static r2 Hm(com.google.protobuf.z zVar) throws IOException {
        return (r2) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static r2 Im(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (r2) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static r2 Jm(InputStream inputStream) throws IOException {
        return (r2) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static r2 Km(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (r2) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static r2 Lm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (r2) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2 Mm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (r2) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static r2 Nm(byte[] bArr) throws com.google.protobuf.t1 {
        return (r2) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static r2 Om(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (r2) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<r2> Pm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm(int i10) {
        um();
        this.limits_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm(int i10) {
        vm();
        this.metricRules_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm(int i10, s2 s2Var) {
        s2Var.getClass();
        um();
        this.limits_.set(i10, s2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm(int i10, x1 x1Var) {
        x1Var.getClass();
        vm();
        this.metricRules_.set(i10, x1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm(Iterable<? extends s2> iterable) {
        um();
        com.google.protobuf.a.y(iterable, this.limits_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm(Iterable<? extends x1> iterable) {
        vm();
        com.google.protobuf.a.y(iterable, this.metricRules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om(int i10, s2 s2Var) {
        s2Var.getClass();
        um();
        this.limits_.add(i10, s2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm(s2 s2Var) {
        s2Var.getClass();
        um();
        this.limits_.add(s2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm(int i10, x1 x1Var) {
        x1Var.getClass();
        vm();
        this.metricRules_.add(i10, x1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rm(x1 x1Var) {
        x1Var.getClass();
        vm();
        this.metricRules_.add(x1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sm() {
        this.limits_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tm() {
        this.metricRules_ = com.google.protobuf.l1.Ij();
    }

    private void um() {
        com.google.protobuf.s1.k<s2> kVar = this.limits_;
        if (!kVar.s1()) {
            this.limits_ = com.google.protobuf.l1.yl(kVar);
        }
    }

    private void vm() {
        com.google.protobuf.s1.k<x1> kVar = this.metricRules_;
        if (kVar.s1()) {
            return;
        }
        this.metricRules_ = com.google.protobuf.l1.yl(kVar);
    }

    public static r2 wm() {
        return DEFAULT_INSTANCE;
    }

    public List<? extends y1> Am() {
        return this.metricRules_;
    }

    @Override // com.google.api.u2
    public int Ke() {
        return this.metricRules_.size();
    }

    @Override // com.google.api.u2
    public List<x1> Lf() {
        return this.metricRules_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116293a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new r2();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"limits_", s2.class, "metricRules_", x1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<r2> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (r2.class) {
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

    @Override // com.google.api.u2
    public List<s2> Rh() {
        return this.limits_;
    }

    @Override // com.google.api.u2
    public x1 Sg(int i10) {
        return this.metricRules_.get(i10);
    }

    @Override // com.google.api.u2
    public s2 bd(int i10) {
        return this.limits_.get(i10);
    }

    @Override // com.google.api.u2
    public int j7() {
        return this.limits_.size();
    }

    public t2 xm(int i10) {
        return this.limits_.get(i10);
    }

    public List<? extends t2> ym() {
        return this.limits_;
    }

    public y1 zm(int i10) {
        return this.metricRules_.get(i10);
    }
}
