package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends com.google.protobuf.l1<r, d> implements s {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    private static final r DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.f3<r> PARSER;
    private com.google.protobuf.s1.k<b> consumerDestinations_ = com.google.protobuf.l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116292a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116292a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116292a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116292a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116292a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116292a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116292a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116292a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.f3<b> PARSER;
        private String monitoredResource_ = "";
        private com.google.protobuf.s1.k<String> metrics_ = com.google.protobuf.l1.Ij();

        public static final class a extends com.google.protobuf.l1.b<b, a> implements c {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.api.r.c
            public List<String> F1() {
                return Collections.unmodifiableList(((b) this.f126038b).F1());
            }

            @Override // com.google.api.r.c
            public String N1(int i10) {
                return ((b) this.f126038b).N1(i10);
            }

            public a Ol(Iterable<String> iterable) {
                El();
                ((b) this.f126038b).im(iterable);
                return this;
            }

            public a Pl(String str) {
                El();
                ((b) this.f126038b).jm(str);
                return this;
            }

            public a Ql(com.google.protobuf.u uVar) {
                El();
                ((b) this.f126038b).km(uVar);
                return this;
            }

            public a Rl() {
                El();
                ((b) this.f126038b).lm();
                return this;
            }

            public a Sl() {
                El();
                ((b) this.f126038b).mm();
                return this;
            }

            public a Tl(int i10, String str) {
                El();
                ((b) this.f126038b).Em(i10, str);
                return this;
            }

            public a Ul(String str) {
                El();
                ((b) this.f126038b).Fm(str);
                return this;
            }

            public a Vl(com.google.protobuf.u uVar) {
                El();
                ((b) this.f126038b).Gm(uVar);
                return this;
            }

            @Override // com.google.api.r.c
            public com.google.protobuf.u Y0() {
                return ((b) this.f126038b).Y0();
            }

            @Override // com.google.api.r.c
            public int a1() {
                return ((b) this.f126038b).a1();
            }

            @Override // com.google.api.r.c
            public String d1() {
                return ((b) this.f126038b).d1();
            }

            @Override // com.google.api.r.c
            public com.google.protobuf.u i7(int i10) {
                return ((b) this.f126038b).i7(i10);
            }

            private a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            com.google.protobuf.l1.Wl(b.class, bVar);
        }

        private b() {
        }

        public static b Am(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static b Bm(byte[] bArr) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static b Cm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static com.google.protobuf.f3<b> Dm() {
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

        public static b om() {
            return DEFAULT_INSTANCE;
        }

        public static a pm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a qm(b bVar) {
            return DEFAULT_INSTANCE.Uf(bVar);
        }

        public static b rm(InputStream inputStream) throws IOException {
            return (b) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static b sm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (b) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b tm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static b um(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static b vm(com.google.protobuf.z zVar) throws IOException {
            return (b) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static b wm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
            return (b) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static b xm(InputStream inputStream) throws IOException {
            return (b) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static b ym(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (b) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b zm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        @Override // com.google.api.r.c
        public List<String> F1() {
            return this.metrics_;
        }

        @Override // com.google.api.r.c
        public String N1(int i10) {
            return this.metrics_.get(i10);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
            com.google.protobuf.f3 cVar;
            int i10 = a.f116292a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new b();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.f3<b> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (b.class) {
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

        @Override // com.google.api.r.c
        public com.google.protobuf.u Y0() {
            return com.google.protobuf.u.C(this.monitoredResource_);
        }

        @Override // com.google.api.r.c
        public int a1() {
            return this.metrics_.size();
        }

        @Override // com.google.api.r.c
        public String d1() {
            return this.monitoredResource_;
        }

        @Override // com.google.api.r.c
        public com.google.protobuf.u i7(int i10) {
            return com.google.protobuf.u.C(this.metrics_.get(i10));
        }
    }

    public interface c extends com.google.protobuf.o2 {
        List<String> F1();

        String N1(int i10);

        com.google.protobuf.u Y0();

        int a1();

        String d1();

        com.google.protobuf.u i7(int i10);
    }

    public static final class d extends com.google.protobuf.l1.b<r, d> implements s {
        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.api.s
        public int D1() {
            return ((r) this.f126038b).D1();
        }

        public d Ol(Iterable<? extends b> iterable) {
            El();
            ((r) this.f126038b).gm(iterable);
            return this;
        }

        public d Pl(int i10, b.a aVar) {
            El();
            ((r) this.f126038b).hm(i10, aVar.build());
            return this;
        }

        public d Ql(int i10, b bVar) {
            El();
            ((r) this.f126038b).hm(i10, bVar);
            return this;
        }

        public d Rl(b.a aVar) {
            El();
            ((r) this.f126038b).im(aVar.build());
            return this;
        }

        public d Sl(b bVar) {
            El();
            ((r) this.f126038b).im(bVar);
            return this;
        }

        public d Tl() {
            El();
            ((r) this.f126038b).jm();
            return this;
        }

        public d Ul(int i10) {
            El();
            ((r) this.f126038b).Dm(i10);
            return this;
        }

        public d Vl(int i10, b.a aVar) {
            El();
            ((r) this.f126038b).Em(i10, aVar.build());
            return this;
        }

        public d Wl(int i10, b bVar) {
            El();
            ((r) this.f126038b).Em(i10, bVar);
            return this;
        }

        @Override // com.google.api.s
        public b f1(int i10) {
            return ((r) this.f126038b).f1(i10);
        }

        @Override // com.google.api.s
        public List<b> k1() {
            return Collections.unmodifiableList(((r) this.f126038b).k1());
        }

        private d() {
            super(r.DEFAULT_INSTANCE);
        }
    }

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        com.google.protobuf.l1.Wl(r.class, rVar);
    }

    private r() {
    }

    public static r Am(byte[] bArr) throws com.google.protobuf.t1 {
        return (r) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static r Bm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (r) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<r> Cm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(int i10) {
        km();
        this.consumerDestinations_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(int i10, b bVar) {
        bVar.getClass();
        km();
        this.consumerDestinations_.set(i10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(Iterable<? extends b> iterable) {
        km();
        com.google.protobuf.a.y(iterable, this.consumerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm(int i10, b bVar) {
        bVar.getClass();
        km();
        this.consumerDestinations_.add(i10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im(b bVar) {
        bVar.getClass();
        km();
        this.consumerDestinations_.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.consumerDestinations_ = com.google.protobuf.l1.Ij();
    }

    private void km() {
        com.google.protobuf.s1.k<b> kVar = this.consumerDestinations_;
        if (kVar.s1()) {
            return;
        }
        this.consumerDestinations_ = com.google.protobuf.l1.yl(kVar);
    }

    public static r nm() {
        return DEFAULT_INSTANCE;
    }

    public static d om() {
        return DEFAULT_INSTANCE.jf();
    }

    public static d pm(r rVar) {
        return DEFAULT_INSTANCE.Uf(rVar);
    }

    public static r qm(InputStream inputStream) throws IOException {
        return (r) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static r rm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (r) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static r sm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (r) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static r tm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (r) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static r um(com.google.protobuf.z zVar) throws IOException {
        return (r) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static r vm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (r) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static r wm(InputStream inputStream) throws IOException {
        return (r) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static r xm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (r) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static r ym(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (r) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r zm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (r) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    @Override // com.google.api.s
    public int D1() {
        return this.consumerDestinations_.size();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116292a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new r();
            case 2:
                return new d(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"consumerDestinations_", b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<r> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (r.class) {
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

    @Override // com.google.api.s
    public b f1(int i10) {
        return this.consumerDestinations_.get(i10);
    }

    @Override // com.google.api.s
    public List<b> k1() {
        return this.consumerDestinations_;
    }

    public c lm(int i10) {
        return this.consumerDestinations_.get(i10);
    }

    public List<? extends c> mm() {
        return this.consumerDestinations_;
    }
}
