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
public final class p extends l1<p, b> implements q {
    private static final p DEFAULT_INSTANCE;
    private static volatile f3<p> PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private s1.k<c> violations_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126687a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126687a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126687a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126687a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126687a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126687a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126687a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126687a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<p, b> implements q {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.rpc.q
        public int J3() {
            return ((p) this.f126038b).J3();
        }

        public b Ol(Iterable<? extends c> iterable) {
            El();
            ((p) this.f126038b).gm(iterable);
            return this;
        }

        public b Pl(int i10, c.a aVar) {
            El();
            ((p) this.f126038b).hm(i10, aVar.build());
            return this;
        }

        public b Ql(int i10, c cVar) {
            El();
            ((p) this.f126038b).hm(i10, cVar);
            return this;
        }

        public b Rl(c.a aVar) {
            El();
            ((p) this.f126038b).im(aVar.build());
            return this;
        }

        public b Sl(c cVar) {
            El();
            ((p) this.f126038b).im(cVar);
            return this;
        }

        public b Tl() {
            El();
            ((p) this.f126038b).jm();
            return this;
        }

        public b Ul(int i10) {
            El();
            ((p) this.f126038b).Dm(i10);
            return this;
        }

        public b Vl(int i10, c.a aVar) {
            El();
            ((p) this.f126038b).Em(i10, aVar.build());
            return this;
        }

        public b Wl(int i10, c cVar) {
            El();
            ((p) this.f126038b).Em(i10, cVar);
            return this;
        }

        @Override // com.google.rpc.q
        public List<c> Y6() {
            return Collections.unmodifiableList(((p) this.f126038b).Y6());
        }

        @Override // com.google.rpc.q
        public c b7(int i10) {
            return ((p) this.f126038b).b7(i10);
        }

        private b() {
            super(p.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends l1<c, a> implements d {
        private static final c DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        private static volatile f3<c> PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 1;
        private String subject_ = "";
        private String description_ = "";

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

            @Override // com.google.rpc.p.d
            public String a5() {
                return ((c) this.f126038b).a5();
            }

            @Override // com.google.rpc.p.d
            public String getDescription() {
                return ((c) this.f126038b).getDescription();
            }

            @Override // com.google.rpc.p.d
            public com.google.protobuf.u k() {
                return ((c) this.f126038b).k();
            }

            @Override // com.google.rpc.p.d
            public com.google.protobuf.u r6() {
                return ((c) this.f126038b).r6();
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
            this.subject_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.subject_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gm() {
            this.description_ = im().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hm() {
            this.subject_ = im().a5();
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
            int i10 = a.f126687a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"subject_", "description_"});
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

        @Override // com.google.rpc.p.d
        public String a5() {
            return this.subject_;
        }

        @Override // com.google.rpc.p.d
        public String getDescription() {
            return this.description_;
        }

        @Override // com.google.rpc.p.d
        public com.google.protobuf.u k() {
            return com.google.protobuf.u.C(this.description_);
        }

        @Override // com.google.rpc.p.d
        public com.google.protobuf.u r6() {
            return com.google.protobuf.u.C(this.subject_);
        }
    }

    public interface d extends o2 {
        String a5();

        String getDescription();

        com.google.protobuf.u k();

        com.google.protobuf.u r6();
    }

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        l1.Wl(p.class, pVar);
    }

    private p() {
    }

    public static p Am(byte[] bArr) throws t1 {
        return (p) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static p Bm(byte[] bArr, v0 v0Var) throws t1 {
        return (p) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<p> Cm() {
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

    public static p lm() {
        return DEFAULT_INSTANCE;
    }

    public static b om() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b pm(p pVar) {
        return DEFAULT_INSTANCE.Uf(pVar);
    }

    public static p qm(InputStream inputStream) throws IOException {
        return (p) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static p rm(InputStream inputStream, v0 v0Var) throws IOException {
        return (p) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static p sm(com.google.protobuf.u uVar) throws t1 {
        return (p) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static p tm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (p) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static p um(com.google.protobuf.z zVar) throws IOException {
        return (p) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static p vm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (p) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static p wm(InputStream inputStream) throws IOException {
        return (p) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static p xm(InputStream inputStream, v0 v0Var) throws IOException {
        return (p) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static p ym(ByteBuffer byteBuffer) throws t1 {
        return (p) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p zm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (p) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    @Override // com.google.rpc.q
    public int J3() {
        return this.violations_.size();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126687a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new p();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"violations_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<p> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (p.class) {
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

    @Override // com.google.rpc.q
    public List<c> Y6() {
        return this.violations_;
    }

    @Override // com.google.rpc.q
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
