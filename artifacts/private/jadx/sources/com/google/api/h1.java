package com.google.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends com.google.protobuf.l1<h1, b> implements i1 {
    private static final h1 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.f3<h1> PARSER = null;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private int valueType_;
    private String key_ = "";
    private String description_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116208a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f116208a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116208a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116208a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116208a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116208a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116208a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116208a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1.b<h1, b> implements i1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((h1) this.f126038b).jm();
            return this;
        }

        public b Pl() {
            El();
            ((h1) this.f126038b).km();
            return this;
        }

        public b Ql() {
            El();
            ((h1) this.f126038b).lm();
            return this;
        }

        public b Rl(String str) {
            El();
            ((h1) this.f126038b).Cm(str);
            return this;
        }

        public b Sl(com.google.protobuf.u uVar) {
            El();
            ((h1) this.f126038b).Dm(uVar);
            return this;
        }

        public b Tl(String str) {
            El();
            ((h1) this.f126038b).Em(str);
            return this;
        }

        public b Ul(com.google.protobuf.u uVar) {
            El();
            ((h1) this.f126038b).Fm(uVar);
            return this;
        }

        public b Vl(c cVar) {
            El();
            ((h1) this.f126038b).Gm(cVar);
            return this;
        }

        public b Wl(int i10) {
            El();
            ((h1) this.f126038b).Hm(i10);
            return this;
        }

        @Override // com.google.api.i1
        public String getDescription() {
            return ((h1) this.f126038b).getDescription();
        }

        @Override // com.google.api.i1
        public String getKey() {
            return ((h1) this.f126038b).getKey();
        }

        @Override // com.google.api.i1
        public com.google.protobuf.u hf() {
            return ((h1) this.f126038b).hf();
        }

        @Override // com.google.api.i1
        public c i1() {
            return ((h1) this.f126038b).i1();
        }

        @Override // com.google.api.i1
        public com.google.protobuf.u k() {
            return ((h1) this.f126038b).k();
        }

        @Override // com.google.api.i1
        public int s2() {
            return ((h1) this.f126038b).s2();
        }

        private b() {
            super(h1.DEFAULT_INSTANCE);
        }
    }

    public enum c implements com.google.protobuf.s1.c {
        STRING(0),
        BOOL(1),
        INT64(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f116213f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f116214g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f116215h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final com.google.protobuf.s1.d<c> f116216i = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f116218a;

        class a implements com.google.protobuf.s1.d<c> {
            a() {
            }

            @Override // com.google.protobuf.s1.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.l(i10);
            }
        }

        private static final class b implements com.google.protobuf.s1.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final com.google.protobuf.s1.e f116219a = new b();

            private b() {
            }

            @Override // com.google.protobuf.s1.e
            public boolean a(int i10) {
                return c.l(i10) != null;
            }
        }

        c(int i10) {
            this.f116218a = i10;
        }

        public static c l(int i10) {
            if (i10 == 0) {
                return STRING;
            }
            if (i10 == 1) {
                return BOOL;
            }
            if (i10 != 2) {
                return null;
            }
            return INT64;
        }

        public static com.google.protobuf.s1.d<c> n() {
            return f116216i;
        }

        public static com.google.protobuf.s1.e o() {
            return b.f116219a;
        }

        @Deprecated
        public static c p(int i10) {
            return l(i10);
        }

        @Override // com.google.protobuf.s1.c
        public final int i() {
            if (this != UNRECOGNIZED) {
                return this.f116218a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        h1 h1Var = new h1();
        DEFAULT_INSTANCE = h1Var;
        com.google.protobuf.l1.Wl(h1.class, h1Var);
    }

    private h1() {
    }

    public static h1 Am(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (h1) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static com.google.protobuf.f3<h1> Bm() {
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
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.key_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(c cVar) {
        this.valueType_ = cVar.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(int i10) {
        this.valueType_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.description_ = mm().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km() {
        this.key_ = mm().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm() {
        this.valueType_ = 0;
    }

    public static h1 mm() {
        return DEFAULT_INSTANCE;
    }

    public static b nm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b om(h1 h1Var) {
        return DEFAULT_INSTANCE.Uf(h1Var);
    }

    public static h1 pm(InputStream inputStream) throws IOException {
        return (h1) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static h1 qm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (h1) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static h1 rm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
        return (h1) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static h1 sm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (h1) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static h1 tm(com.google.protobuf.z zVar) throws IOException {
        return (h1) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static h1 um(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
        return (h1) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static h1 vm(InputStream inputStream) throws IOException {
        return (h1) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static h1 wm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
        return (h1) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static h1 xm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
        return (h1) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1 ym(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
        return (h1) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static h1 zm(byte[] bArr) throws com.google.protobuf.t1 {
        return (h1) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
        com.google.protobuf.f3 cVar;
        int i10 = a.f116208a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new h1();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"key_", "valueType_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.f3<h1> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (h1.class) {
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

    @Override // com.google.api.i1
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.i1
    public String getKey() {
        return this.key_;
    }

    @Override // com.google.api.i1
    public com.google.protobuf.u hf() {
        return com.google.protobuf.u.C(this.key_);
    }

    @Override // com.google.api.i1
    public c i1() {
        c cVarL = c.l(this.valueType_);
        return cVarL == null ? c.UNRECOGNIZED : cVarL;
    }

    @Override // com.google.api.i1
    public com.google.protobuf.u k() {
        return com.google.protobuf.u.C(this.description_);
    }

    @Override // com.google.api.i1
    public int s2() {
        return this.valueType_;
    }
}
