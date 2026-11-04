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
public final class a extends l1<a, b> implements com.google.rpc.b {
    private static final a DEFAULT_INSTANCE;
    public static final int FIELD_VIOLATIONS_FIELD_NUMBER = 1;
    private static volatile f3<a> PARSER;
    private s1.k<c> fieldViolations_ = l1.Ij();

    /* JADX INFO: renamed from: com.google.rpc.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1222a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126640a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126640a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126640a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126640a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126640a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126640a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126640a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126640a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<a, b> implements com.google.rpc.b {
        /* synthetic */ b(C1222a c1222a) {
            this();
        }

        public b Ol(Iterable<? extends c> iterable) {
            El();
            ((a) this.f126038b).gm(iterable);
            return this;
        }

        public b Pl(int i10, c.C1223a c1223a) {
            El();
            ((a) this.f126038b).hm(i10, c1223a.build());
            return this;
        }

        public b Ql(int i10, c cVar) {
            El();
            ((a) this.f126038b).hm(i10, cVar);
            return this;
        }

        public b Rl(c.C1223a c1223a) {
            El();
            ((a) this.f126038b).im(c1223a.build());
            return this;
        }

        public b Sl(c cVar) {
            El();
            ((a) this.f126038b).im(cVar);
            return this;
        }

        public b Tl() {
            El();
            ((a) this.f126038b).jm();
            return this;
        }

        public b Ul(int i10) {
            El();
            ((a) this.f126038b).Dm(i10);
            return this;
        }

        public b Vl(int i10, c.C1223a c1223a) {
            El();
            ((a) this.f126038b).Em(i10, c1223a.build());
            return this;
        }

        public b Wl(int i10, c cVar) {
            El();
            ((a) this.f126038b).Em(i10, cVar);
            return this;
        }

        @Override // com.google.rpc.b
        public List<c> lg() {
            return Collections.unmodifiableList(((a) this.f126038b).lg());
        }

        @Override // com.google.rpc.b
        public c nk(int i10) {
            return ((a) this.f126038b).nk(i10);
        }

        @Override // com.google.rpc.b
        public int qa() {
            return ((a) this.f126038b).qa();
        }

        private b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends l1<c, C1223a> implements d {
        private static final c DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile f3<c> PARSER;
        private String field_ = "";
        private String description_ = "";

        /* JADX INFO: renamed from: com.google.rpc.a$c$a, reason: collision with other inner class name */
        public static final class C1223a extends l1.b<c, C1223a> implements d {
            /* synthetic */ C1223a(C1222a c1222a) {
                this();
            }

            public C1223a Ol() {
                El();
                ((c) this.f126038b).gm();
                return this;
            }

            public C1223a Pl() {
                El();
                ((c) this.f126038b).hm();
                return this;
            }

            public C1223a Ql(String str) {
                El();
                ((c) this.f126038b).ym(str);
                return this;
            }

            public C1223a Rl(com.google.protobuf.u uVar) {
                El();
                ((c) this.f126038b).zm(uVar);
                return this;
            }

            public C1223a Sl(String str) {
                El();
                ((c) this.f126038b).Am(str);
                return this;
            }

            public C1223a Tl(com.google.protobuf.u uVar) {
                El();
                ((c) this.f126038b).Bm(uVar);
                return this;
            }

            @Override // com.google.rpc.a.d
            public String getDescription() {
                return ((c) this.f126038b).getDescription();
            }

            @Override // com.google.rpc.a.d
            public String hb() {
                return ((c) this.f126038b).hb();
            }

            @Override // com.google.rpc.a.d
            public com.google.protobuf.u k() {
                return ((c) this.f126038b).k();
            }

            @Override // com.google.rpc.a.d
            public com.google.protobuf.u yf() {
                return ((c) this.f126038b).yf();
            }

            private C1223a() {
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
            this.field_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.field_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gm() {
            this.description_ = im().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hm() {
            this.field_ = im().hb();
        }

        public static c im() {
            return DEFAULT_INSTANCE;
        }

        public static C1223a jm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static C1223a km(c cVar) {
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
            int i10 = C1222a.f126640a[iVar.ordinal()];
            C1222a c1222a = null;
            int i11 = 4 | 0;
            switch (i10) {
                case 1:
                    return new c();
                case 2:
                    return new C1223a(c1222a);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"field_", "description_"});
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

        @Override // com.google.rpc.a.d
        public String getDescription() {
            return this.description_;
        }

        @Override // com.google.rpc.a.d
        public String hb() {
            return this.field_;
        }

        @Override // com.google.rpc.a.d
        public com.google.protobuf.u k() {
            return com.google.protobuf.u.C(this.description_);
        }

        @Override // com.google.rpc.a.d
        public com.google.protobuf.u yf() {
            return com.google.protobuf.u.C(this.field_);
        }
    }

    public interface d extends o2 {
        String getDescription();

        String hb();

        com.google.protobuf.u k();

        com.google.protobuf.u yf();
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        l1.Wl(a.class, aVar);
    }

    private a() {
    }

    public static a Am(byte[] bArr) throws t1 {
        return (a) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static a Bm(byte[] bArr, v0 v0Var) throws t1 {
        return (a) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<a> Cm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(int i10) {
        km();
        this.fieldViolations_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(int i10, c cVar) {
        cVar.getClass();
        km();
        this.fieldViolations_.set(i10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(Iterable<? extends c> iterable) {
        km();
        com.google.protobuf.a.y(iterable, this.fieldViolations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm(int i10, c cVar) {
        cVar.getClass();
        km();
        this.fieldViolations_.add(i10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im(c cVar) {
        cVar.getClass();
        km();
        this.fieldViolations_.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.fieldViolations_ = l1.Ij();
    }

    private void km() {
        s1.k<c> kVar = this.fieldViolations_;
        if (kVar.s1()) {
            return;
        }
        this.fieldViolations_ = l1.yl(kVar);
    }

    public static a lm() {
        return DEFAULT_INSTANCE;
    }

    public static b om() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b pm(a aVar) {
        return DEFAULT_INSTANCE.Uf(aVar);
    }

    public static a qm(InputStream inputStream) throws IOException {
        return (a) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static a rm(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a sm(com.google.protobuf.u uVar) throws t1 {
        return (a) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static a tm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (a) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static a um(com.google.protobuf.z zVar) throws IOException {
        return (a) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static a vm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (a) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static a wm(InputStream inputStream) throws IOException {
        return (a) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static a xm(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a ym(ByteBuffer byteBuffer) throws t1 {
        return (a) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static a zm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (a) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = C1222a.f126640a[iVar.ordinal()];
        C1222a c1222a = null;
        int i11 = 7 | 0;
        switch (i10) {
            case 1:
                return new a();
            case 2:
                return new b(c1222a);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fieldViolations_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<a> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (a.class) {
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

    @Override // com.google.rpc.b
    public List<c> lg() {
        return this.fieldViolations_;
    }

    public d mm(int i10) {
        return this.fieldViolations_.get(i10);
    }

    @Override // com.google.rpc.b
    public c nk(int i10) {
        return this.fieldViolations_.get(i10);
    }

    public List<? extends d> nm() {
        return this.fieldViolations_;
    }

    @Override // com.google.rpc.b
    public int qa() {
        return this.fieldViolations_.size();
    }
}
