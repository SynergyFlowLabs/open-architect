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
public final class j extends l1<j, b> implements k {
    private static final j DEFAULT_INSTANCE;
    public static final int LINKS_FIELD_NUMBER = 1;
    private static volatile f3<j> PARSER;
    private s1.k<c> links_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126684a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126684a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126684a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126684a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126684a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126684a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126684a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126684a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<j, b> implements k {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.rpc.k
        public c Ia(int i10) {
            return ((j) this.f126038b).Ia(i10);
        }

        public b Ol(Iterable<? extends c> iterable) {
            El();
            ((j) this.f126038b).gm(iterable);
            return this;
        }

        public b Pl(int i10, c.a aVar) {
            El();
            ((j) this.f126038b).hm(i10, aVar.build());
            return this;
        }

        public b Ql(int i10, c cVar) {
            El();
            ((j) this.f126038b).hm(i10, cVar);
            return this;
        }

        public b Rl(c.a aVar) {
            El();
            ((j) this.f126038b).im(aVar.build());
            return this;
        }

        public b Sl(c cVar) {
            El();
            ((j) this.f126038b).im(cVar);
            return this;
        }

        public b Tl() {
            El();
            ((j) this.f126038b).jm();
            return this;
        }

        @Override // com.google.rpc.k
        public List<c> Ub() {
            return Collections.unmodifiableList(((j) this.f126038b).Ub());
        }

        public b Ul(int i10) {
            El();
            ((j) this.f126038b).Dm(i10);
            return this;
        }

        public b Vl(int i10, c.a aVar) {
            El();
            ((j) this.f126038b).Em(i10, aVar.build());
            return this;
        }

        public b Wl(int i10, c cVar) {
            El();
            ((j) this.f126038b).Em(i10, cVar);
            return this;
        }

        @Override // com.google.rpc.k
        public int xg() {
            return ((j) this.f126038b).xg();
        }

        private b() {
            super(j.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends l1<c, a> implements d {
        private static final c DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 1;
        private static volatile f3<c> PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private String description_ = "";
        private String url_ = "";

        public static final class a extends l1.b<c, a> implements d {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol() {
                El();
                ((c) this.f126038b).gm();
                return this;
            }

            public a Pl() {
                El();
                ((c) this.f126038b).hm();
                return this;
            }

            public a Ql(String str) {
                El();
                ((c) this.f126038b).ym(str);
                return this;
            }

            public a Rl(com.google.protobuf.u uVar) {
                El();
                ((c) this.f126038b).zm(uVar);
                return this;
            }

            public a Sl(String str) {
                El();
                ((c) this.f126038b).Am(str);
                return this;
            }

            public a Tl(com.google.protobuf.u uVar) {
                El();
                ((c) this.f126038b).Bm(uVar);
                return this;
            }

            @Override // com.google.rpc.j.d
            public com.google.protobuf.u U4() {
                return ((c) this.f126038b).U4();
            }

            @Override // com.google.rpc.j.d
            public String getDescription() {
                return ((c) this.f126038b).getDescription();
            }

            @Override // com.google.rpc.j.d
            public String getUrl() {
                return ((c) this.f126038b).getUrl();
            }

            @Override // com.google.rpc.j.d
            public com.google.protobuf.u k() {
                return ((c) this.f126038b).k();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void Am(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.url_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gm() {
            this.description_ = im().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hm() {
            this.url_ = im().getUrl();
        }

        public static c im() {
            return DEFAULT_INSTANCE;
        }

        public static a jm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a km(c cVar) {
            return DEFAULT_INSTANCE.Uf(cVar);
        }

        public static c lm(InputStream inputStream) throws IOException {
            return (c) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static c mm(InputStream inputStream, v0 v0Var) throws IOException {
            return (c) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static c nm(com.google.protobuf.u uVar) throws t1 {
            return (c) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static c om(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (c) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static c pm(com.google.protobuf.z zVar) throws IOException {
            return (c) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static c qm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (c) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static c rm(InputStream inputStream) throws IOException {
            return (c) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static c sm(InputStream inputStream, v0 v0Var) throws IOException {
            return (c) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static c tm(ByteBuffer byteBuffer) throws t1 {
            return (c) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static c um(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (c) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static c vm(byte[] bArr) throws t1 {
            return (c) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static c wm(byte[] bArr, v0 v0Var) throws t1 {
            return (c) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<c> xm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ym(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.description_ = uVar.z0();
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f126684a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"description_", "url_"});
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

        @Override // com.google.rpc.j.d
        public com.google.protobuf.u U4() {
            return com.google.protobuf.u.C(this.url_);
        }

        @Override // com.google.rpc.j.d
        public String getDescription() {
            return this.description_;
        }

        @Override // com.google.rpc.j.d
        public String getUrl() {
            return this.url_;
        }

        @Override // com.google.rpc.j.d
        public com.google.protobuf.u k() {
            return com.google.protobuf.u.C(this.description_);
        }
    }

    public interface d extends o2 {
        com.google.protobuf.u U4();

        String getDescription();

        String getUrl();

        com.google.protobuf.u k();
    }

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        l1.Wl(j.class, jVar);
    }

    private j() {
    }

    public static j Am(byte[] bArr) throws t1 {
        return (j) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static j Bm(byte[] bArr, v0 v0Var) throws t1 {
        return (j) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<j> Cm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(int i10) {
        km();
        this.links_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(int i10, c cVar) {
        cVar.getClass();
        km();
        this.links_.set(i10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(Iterable<? extends c> iterable) {
        km();
        com.google.protobuf.a.y(iterable, this.links_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm(int i10, c cVar) {
        cVar.getClass();
        km();
        this.links_.add(i10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im(c cVar) {
        cVar.getClass();
        km();
        this.links_.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.links_ = l1.Ij();
    }

    private void km() {
        s1.k<c> kVar = this.links_;
        if (kVar.s1()) {
            return;
        }
        this.links_ = l1.yl(kVar);
    }

    public static j lm() {
        return DEFAULT_INSTANCE;
    }

    public static b om() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b pm(j jVar) {
        return DEFAULT_INSTANCE.Uf(jVar);
    }

    public static j qm(InputStream inputStream) throws IOException {
        return (j) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static j rm(InputStream inputStream, v0 v0Var) throws IOException {
        return (j) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static j sm(com.google.protobuf.u uVar) throws t1 {
        return (j) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static j tm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (j) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static j um(com.google.protobuf.z zVar) throws IOException {
        return (j) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static j vm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (j) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static j wm(InputStream inputStream) throws IOException {
        return (j) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static j xm(InputStream inputStream, v0 v0Var) throws IOException {
        return (j) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static j ym(ByteBuffer byteBuffer) throws t1 {
        return (j) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j zm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (j) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    @Override // com.google.rpc.k
    public c Ia(int i10) {
        return this.links_.get(i10);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126684a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new j();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"links_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<j> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (j.class) {
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

    @Override // com.google.rpc.k
    public List<c> Ub() {
        return this.links_;
    }

    public d mm(int i10) {
        return this.links_.get(i10);
    }

    public List<? extends d> nm() {
        return this.links_;
    }

    @Override // com.google.rpc.k
    public int xg() {
        return this.links_.size();
    }
}
