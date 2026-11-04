package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g2 extends com.google.protobuf.l1<g2, b> implements h2 {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final g2 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.f3<g2> PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private com.google.protobuf.s1.k<c> producerDestinations_ = com.google.protobuf.l1.Ij();
    private com.google.protobuf.s1.k<c> consumerDestinations_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116207a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116207a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116207a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116207a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116207a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116207a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116207a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116207a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<g2, b> implements h2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.api.h2
        public int D1() {
            return ((g2) this.f126038b).D1();
        }

        public b Ol(Iterable<? extends c> iterable) {
            El();
            ((g2) this.f126038b).mm(iterable);
            return this;
        }

        public b Pl(Iterable<? extends c> iterable) {
            El();
            ((g2) this.f126038b).nm(iterable);
            return this;
        }

        public b Ql(int i10, c.a aVar) {
            El();
            ((g2) this.f126038b).om(i10, aVar.build());
            return this;
        }

        public b Rl(int i10, c cVar) {
            El();
            ((g2) this.f126038b).om(i10, cVar);
            return this;
        }

        public b Sl(c.a aVar) {
            El();
            ((g2) this.f126038b).pm(aVar.build());
            return this;
        }

        public b Tl(c cVar) {
            El();
            ((g2) this.f126038b).pm(cVar);
            return this;
        }

        public b Ul(int i10, c.a aVar) {
            El();
            ((g2) this.f126038b).qm(i10, aVar.build());
            return this;
        }

        public b Vl(int i10, c cVar) {
            El();
            ((g2) this.f126038b).qm(i10, cVar);
            return this;
        }

        public b Wl(c.a aVar) {
            El();
            ((g2) this.f126038b).rm(aVar.build());
            return this;
        }

        public b Xl(c cVar) {
            El();
            ((g2) this.f126038b).rm(cVar);
            return this;
        }

        public b Yl() {
            El();
            ((g2) this.f126038b).sm();
            return this;
        }

        public b Zl() {
            El();
            ((g2) this.f126038b).tm();
            return this;
        }

        public b am(int i10) {
            El();
            ((g2) this.f126038b).Qm(i10);
            return this;
        }

        public b bm(int i10) {
            El();
            ((g2) this.f126038b).Rm(i10);
            return this;
        }

        public b cm(int i10, c.a aVar) {
            El();
            ((g2) this.f126038b).Sm(i10, aVar.build());
            return this;
        }

        public b dm(int i10, c cVar) {
            El();
            ((g2) this.f126038b).Sm(i10, cVar);
            return this;
        }

        public b em(int i10, c.a aVar) {
            El();
            ((g2) this.f126038b).Tm(i10, aVar.build());
            return this;
        }

        @Override // com.google.api.h2
        public c f1(int i10) {
            return ((g2) this.f126038b).f1(i10);
        }

        public b fm(int i10, c cVar) {
            El();
            ((g2) this.f126038b).Tm(i10, cVar);
            return this;
        }

        @Override // com.google.api.h2
        public List<c> j4() {
            return Collections.unmodifiableList(((g2) this.f126038b).j4());
        }

        @Override // com.google.api.h2
        public List<c> k1() {
            return Collections.unmodifiableList(((g2) this.f126038b).k1());
        }

        @Override // com.google.api.h2
        public c n2(int i10) {
            return ((g2) this.f126038b).n2(i10);
        }

        @Override // com.google.api.h2
        public int y3() {
            return ((g2) this.f126038b).y3();
        }

        private b() {
            super(g2.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends com.google.protobuf.l1<c, a> implements d {
        private static final c DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.f3<c> PARSER;
        private String monitoredResource_ = "";
        private com.google.protobuf.s1.k<String> metrics_ = com.google.protobuf.l1.Ij();

        public static final class a extends com.google.protobuf.l1.b<c, a> implements d {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.api.g2.d
            public List<String> F1() {
                return Collections.unmodifiableList(((c) this.f126038b).F1());
            }

            @Override // com.google.api.g2.d
            public String N1(int i10) {
                return ((c) this.f126038b).N1(i10);
            }

            public a Ol(Iterable<String> iterable) {
                El();
                ((c) this.f126038b).im(iterable);
                return this;
            }

            public a Pl(String str) {
                El();
                ((c) this.f126038b).jm(str);
                return this;
            }

            public a Ql(com.google.protobuf.u uVar) {
                El();
                ((c) this.f126038b).km(uVar);
                return this;
            }

            public a Rl() {
                El();
                ((c) this.f126038b).lm();
                return this;
            }

            public a Sl() {
                El();
                ((c) this.f126038b).mm();
                return this;
            }

            public a Tl(int i10, String str) {
                El();
                ((c) this.f126038b).Em(i10, str);
                return this;
            }

            public a Ul(String str) {
                El();
                ((c) this.f126038b).Fm(str);
                return this;
            }

            public a Vl(com.google.protobuf.u uVar) {
                El();
                ((c) this.f126038b).Gm(uVar);
                return this;
            }

            @Override // com.google.api.g2.d
            public com.google.protobuf.u Y0() {
                return ((c) this.f126038b).Y0();
            }

            @Override // com.google.api.g2.d
            public int a1() {
                return ((c) this.f126038b).a1();
            }

            @Override // com.google.api.g2.d
            public String d1() {
                return ((c) this.f126038b).d1();
            }

            @Override // com.google.api.g2.d
            public com.google.protobuf.u i7(int i10) {
                return ((c) this.f126038b).i7(i10);
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            com.google.protobuf.l1.Wl(c.class, cVar);
        }

        private c() {
        }

        public static c Am(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (c) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static c Bm(byte[] bArr) throws com.google.protobuf.t1 {
            return (c) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static c Cm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (c) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static com.google.protobuf.f3<c> Dm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em(int i10, String str) {
            str.getClass();
            nm();
            this.metrics_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fm(String str) {
            str.getClass();
            this.monitoredResource_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.monitoredResource_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void im(Iterable<String> iterable) {
            nm();
            com.google.protobuf.a.y(iterable, this.metrics_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jm(String str) {
            str.getClass();
            nm();
            this.metrics_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void km(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            nm();
            this.metrics_.add(uVar.z0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lm() {
            this.metrics_ = com.google.protobuf.l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mm() {
            this.monitoredResource_ = om().d1();
        }

        private void nm() {
            com.google.protobuf.s1.k<String> kVar = this.metrics_;
            if (kVar.s1()) {
                return;
            }
            this.metrics_ = com.google.protobuf.l1.yl(kVar);
        }

        public static c om() {
            return DEFAULT_INSTANCE;
        }

        public static a pm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a qm(c cVar) {
            return DEFAULT_INSTANCE.Uf(cVar);
        }

        public static c rm(InputStream inputStream) throws IOException {
            return (c) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static c sm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (c) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static c tm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
            return (c) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static c um(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (c) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static c vm(com.google.protobuf.z zVar) throws IOException {
            return (c) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static c wm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
            return (c) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static c xm(InputStream inputStream) throws IOException {
            return (c) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static c ym(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (c) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static c zm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
            return (c) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        @Override // com.google.api.g2.d
        public List<String> F1() {
            return this.metrics_;
        }

        @Override // com.google.api.g2.d
        public String N1(int i10) {
            return this.metrics_.get(i10);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
            com.google.protobuf.f3 cVar;
            int i10 = a.f116207a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.f3<c> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (c.class) {
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

        @Override // com.google.api.g2.d
        public com.google.protobuf.u Y0() {
            return com.google.protobuf.u.C(this.monitoredResource_);
        }

        @Override // com.google.api.g2.d
        public int a1() {
            return this.metrics_.size();
        }

        @Override // com.google.api.g2.d
        public String d1() {
            return this.monitoredResource_;
        }

        @Override // com.google.api.g2.d
        public com.google.protobuf.u i7(int i10) {
            return com.google.protobuf.u.C(this.metrics_.get(i10));
        }
    }

    public interface d extends com.google.protobuf.o2 {
        List<String> F1();

        String N1(int i10);

        com.google.protobuf.u Y0();

        int a1();

        String d1();

        com.google.protobuf.u i7(int i10);
    }

    static {
        g2 g2Var = new g2();
        DEFAULT_INSTANCE = g2Var;
        com.google.protobuf.l1.Wl(g2.class, g2Var);
    }

    private g2() {
    }

    public static b Bm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Cm(g2 g2Var) {
        return DEFAULT_INSTANCE.Uf(g2Var);
    }

    public static g2 Dm(InputStream inputStream) throws IOException {
        return (g2) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static g2 Em(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (g2) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static g2 Fm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (g2) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static g2 Gm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (g2) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static g2 Hm(com.google.protobuf.z zVar) throws IOException {
        return (g2) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static g2 Im(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (g2) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static g2 Jm(InputStream inputStream) throws IOException {
        return (g2) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static g2 Km(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (g2) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static g2 Lm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (g2) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g2 Mm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (g2) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static g2 Nm(byte[] bArr) throws com.google.protobuf.t1 {
        return (g2) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static g2 Om(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (g2) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<g2> Pm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm(int i10) {
        um();
        this.consumerDestinations_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm(int i10) {
        vm();
        this.producerDestinations_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm(int i10, c cVar) {
        cVar.getClass();
        um();
        this.consumerDestinations_.set(i10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm(int i10, c cVar) {
        cVar.getClass();
        vm();
        this.producerDestinations_.set(i10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm(Iterable<? extends c> iterable) {
        um();
        com.google.protobuf.a.y(iterable, this.consumerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm(Iterable<? extends c> iterable) {
        vm();
        com.google.protobuf.a.y(iterable, this.producerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om(int i10, c cVar) {
        cVar.getClass();
        um();
        this.consumerDestinations_.add(i10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm(c cVar) {
        cVar.getClass();
        um();
        this.consumerDestinations_.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm(int i10, c cVar) {
        cVar.getClass();
        vm();
        this.producerDestinations_.add(i10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rm(c cVar) {
        cVar.getClass();
        vm();
        this.producerDestinations_.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sm() {
        this.consumerDestinations_ = com.google.protobuf.l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tm() {
        this.producerDestinations_ = com.google.protobuf.l1.Ij();
    }

    private void um() {
        com.google.protobuf.s1.k<c> kVar = this.consumerDestinations_;
        if (kVar.s1()) {
            return;
        }
        this.consumerDestinations_ = com.google.protobuf.l1.yl(kVar);
    }

    private void vm() {
        com.google.protobuf.s1.k<c> kVar = this.producerDestinations_;
        if (!kVar.s1()) {
            this.producerDestinations_ = com.google.protobuf.l1.yl(kVar);
        }
    }

    public static g2 ym() {
        return DEFAULT_INSTANCE;
    }

    public List<? extends d> Am() {
        return this.producerDestinations_;
    }

    @Override // com.google.api.h2
    public int D1() {
        return this.consumerDestinations_.size();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116207a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new g2();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", c.class, "consumerDestinations_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<g2> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (g2.class) {
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

    @Override // com.google.api.h2
    public c f1(int i10) {
        return this.consumerDestinations_.get(i10);
    }

    @Override // com.google.api.h2
    public List<c> j4() {
        return this.producerDestinations_;
    }

    @Override // com.google.api.h2
    public List<c> k1() {
        return this.consumerDestinations_;
    }

    @Override // com.google.api.h2
    public c n2(int i10) {
        return this.producerDestinations_.get(i10);
    }

    public d wm(int i10) {
        return this.consumerDestinations_.get(i10);
    }

    public List<? extends d> xm() {
        return this.consumerDestinations_;
    }

    @Override // com.google.api.h2
    public int y3() {
        return this.producerDestinations_.size();
    }

    public d zm(int i10) {
        return this.producerDestinations_.get(i10);
    }
}
