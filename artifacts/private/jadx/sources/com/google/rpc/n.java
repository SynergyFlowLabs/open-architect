package com.google.rpc;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.o2;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends l1<n, b> implements o {
    private static final n DEFAULT_INSTANCE;
    private static volatile f3<n> PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private s1.k<c> violations_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126686a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126686a = iArr;
            try {
                int i10 = 7 ^ 1;
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126686a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126686a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126686a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126686a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126686a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126686a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<n, b> implements o {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.rpc.o
        public int J3() {
            return ((n) this.f126038b).J3();
        }

        public b Ol(Iterable<? extends c> iterable) {
            El();
            ((n) this.f126038b).gm(iterable);
            return this;
        }

        public b Pl(int i10, c.a aVar) {
            El();
            ((n) this.f126038b).hm(i10, aVar.build());
            return this;
        }

        public b Ql(int i10, c cVar) {
            El();
            ((n) this.f126038b).hm(i10, cVar);
            return this;
        }

        public b Rl(c.a aVar) {
            El();
            ((n) this.f126038b).im(aVar.build());
            return this;
        }

        public b Sl(c cVar) {
            El();
            ((n) this.f126038b).im(cVar);
            return this;
        }

        public b Tl() {
            El();
            ((n) this.f126038b).jm();
            return this;
        }

        public b Ul(int i10) {
            El();
            ((n) this.f126038b).Dm(i10);
            return this;
        }

        public b Vl(int i10, c.a aVar) {
            El();
            ((n) this.f126038b).Em(i10, aVar.build());
            return this;
        }

        public b Wl(int i10, c cVar) {
            El();
            ((n) this.f126038b).Em(i10, cVar);
            return this;
        }

        @Override // com.google.rpc.o
        public List<c> Y6() {
            return Collections.unmodifiableList(((n) this.f126038b).Y6());
        }

        @Override // com.google.rpc.o
        public c b7(int i10) {
            return ((n) this.f126038b).b7(i10);
        }

        private b() {
            super(n.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends l1<c, a> implements d {
        private static final c DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        private static volatile f3<c> PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String type_ = "";
        private String subject_ = "";
        private String description_ = "";

        public static final class a extends l1.b<c, a> implements d {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol() {
                El();
                ((c) this.f126038b).jm();
                return this;
            }

            public a Pl() {
                El();
                ((c) this.f126038b).km();
                return this;
            }

            public a Ql() {
                El();
                ((c) this.f126038b).lm();
                return this;
            }

            public a Rl(String str) {
                El();
                ((c) this.f126038b).Cm(str);
                return this;
            }

            public a Sl(com.google.protobuf.u uVar) {
                El();
                ((c) this.f126038b).Dm(uVar);
                return this;
            }

            public a Tl(String str) {
                El();
                ((c) this.f126038b).Em(str);
                return this;
            }

            public a Ul(com.google.protobuf.u uVar) {
                El();
                ((c) this.f126038b).Fm(uVar);
                return this;
            }

            public a Vl(String str) {
                El();
                ((c) this.f126038b).Gm(str);
                return this;
            }

            public a Wl(com.google.protobuf.u uVar) {
                El();
                ((c) this.f126038b).Hm(uVar);
                return this;
            }

            @Override // com.google.rpc.n.d
            public String a5() {
                return ((c) this.f126038b).a5();
            }

            @Override // com.google.rpc.n.d
            public String c() {
                return ((c) this.f126038b).c();
            }

            @Override // com.google.rpc.n.d
            public String getDescription() {
                return ((c) this.f126038b).getDescription();
            }

            @Override // com.google.rpc.n.d
            public com.google.protobuf.u k() {
                return ((c) this.f126038b).k();
            }

            @Override // com.google.rpc.n.d
            public com.google.protobuf.u r6() {
                return ((c) this.f126038b).r6();
            }

            @Override // com.google.rpc.n.d
            public com.google.protobuf.u s() {
                return ((c) this.f126038b).s();
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            l1.Wl(c.class, cVar);
        }

        private c() {
        }

        public static c Am(byte[] bArr, v0 v0Var) throws t1 {
            return (c) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<c> Bm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cm(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.description_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em(String str) {
            str.getClass();
            this.subject_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.subject_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gm(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.type_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jm() {
            this.description_ = mm().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void km() {
            this.subject_ = mm().a5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lm() {
            this.type_ = mm().c();
        }

        public static c mm() {
            return DEFAULT_INSTANCE;
        }

        public static a nm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a om(c cVar) {
            return DEFAULT_INSTANCE.Uf(cVar);
        }

        public static c pm(InputStream inputStream) throws IOException {
            return (c) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static c qm(InputStream inputStream, v0 v0Var) throws IOException {
            return (c) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static c rm(com.google.protobuf.u uVar) throws t1 {
            return (c) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static c sm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (c) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static c tm(com.google.protobuf.z zVar) throws IOException {
            return (c) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static c um(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (c) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static c vm(InputStream inputStream) throws IOException {
            return (c) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static c wm(InputStream inputStream, v0 v0Var) throws IOException {
            return (c) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static c xm(ByteBuffer byteBuffer) throws t1 {
            return (c) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static c ym(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (c) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static c zm(byte[] bArr) throws t1 {
            return (c) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f126686a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "subject_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<c> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (c.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new l1.c(DEFAULT_INSTANCE);
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

        @Override // com.google.rpc.n.d
        public String a5() {
            return this.subject_;
        }

        @Override // com.google.rpc.n.d
        public String c() {
            return this.type_;
        }

        @Override // com.google.rpc.n.d
        public String getDescription() {
            return this.description_;
        }

        @Override // com.google.rpc.n.d
        public com.google.protobuf.u k() {
            return com.google.protobuf.u.C(this.description_);
        }

        @Override // com.google.rpc.n.d
        public com.google.protobuf.u r6() {
            return com.google.protobuf.u.C(this.subject_);
        }

        @Override // com.google.rpc.n.d
        public com.google.protobuf.u s() {
            return com.google.protobuf.u.C(this.type_);
        }
    }

    public interface d extends o2 {
        String a5();

        String c();

        String getDescription();

        com.google.protobuf.u k();

        com.google.protobuf.u r6();

        com.google.protobuf.u s();
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        l1.Wl(n.class, nVar);
    }

    private n() {
    }

    public static n Am(byte[] bArr) throws t1 {
        return (n) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static n Bm(byte[] bArr, v0 v0Var) throws t1 {
        return (n) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<n> Cm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(int i10) {
        km();
        this.violations_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(int i10, c cVar) {
        cVar.getClass();
        km();
        this.violations_.set(i10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(Iterable<? extends c> iterable) {
        km();
        com.google.protobuf.a.y(iterable, this.violations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm(int i10, c cVar) {
        cVar.getClass();
        km();
        this.violations_.add(i10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im(c cVar) {
        cVar.getClass();
        km();
        this.violations_.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.violations_ = l1.Ij();
    }

    private void km() {
        s1.k<c> kVar = this.violations_;
        if (kVar.s1()) {
            return;
        }
        this.violations_ = l1.yl(kVar);
    }

    public static n lm() {
        return DEFAULT_INSTANCE;
    }

    public static b om() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b pm(n nVar) {
        return DEFAULT_INSTANCE.Uf(nVar);
    }

    public static n qm(InputStream inputStream) throws IOException {
        return (n) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static n rm(InputStream inputStream, v0 v0Var) throws IOException {
        return (n) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static n sm(com.google.protobuf.u uVar) throws t1 {
        return (n) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static n tm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (n) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static n um(com.google.protobuf.z zVar) throws IOException {
        return (n) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static n vm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (n) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static n wm(InputStream inputStream) throws IOException {
        return (n) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static n xm(InputStream inputStream, v0 v0Var) throws IOException {
        return (n) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static n ym(ByteBuffer byteBuffer) throws t1 {
        return (n) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n zm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (n) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    @Override // com.google.rpc.o
    public int J3() {
        return this.violations_.size();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126686a[iVar.ordinal()];
        a aVar = null;
        int i11 = 5 << 0;
        switch (i10) {
            case 1:
                return new n();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"violations_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<n> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (n.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new l1.c(DEFAULT_INSTANCE);
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

    @Override // com.google.rpc.o
    public List<c> Y6() {
        return this.violations_;
    }

    @Override // com.google.rpc.o
    public c b7(int i10) {
        return this.violations_.get(i10);
    }

    public d mm(int i10) {
        return this.violations_.get(i10);
    }

    public List<? extends d> nm() {
        return this.violations_;
    }
}
