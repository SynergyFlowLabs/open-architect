package com.google.rpc;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends l1<t, b> implements u {
    private static final t DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile f3<t> PARSER = null;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
    private String resourceType_ = "";
    private String resourceName_ = "";
    private String owner_ = "";
    private String description_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126689a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126689a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126689a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126689a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126689a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126689a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126689a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126689a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<t, b> implements u {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.rpc.u
        public com.google.protobuf.u E4() {
            return ((t) this.f126038b).E4();
        }

        public b Ol() {
            El();
            ((t) this.f126038b).mm();
            return this;
        }

        @Override // com.google.rpc.u
        public String Ph() {
            return ((t) this.f126038b).Ph();
        }

        public b Pl() {
            El();
            ((t) this.f126038b).nm();
            return this;
        }

        public b Ql() {
            El();
            ((t) this.f126038b).om();
            return this;
        }

        public b Rl() {
            El();
            ((t) this.f126038b).pm();
            return this;
        }

        public b Sl(String str) {
            El();
            ((t) this.f126038b).Gm(str);
            return this;
        }

        public b Tl(com.google.protobuf.u uVar) {
            El();
            ((t) this.f126038b).Hm(uVar);
            return this;
        }

        @Override // com.google.rpc.u
        public com.google.protobuf.u U9() {
            return ((t) this.f126038b).U9();
        }

        public b Ul(String str) {
            El();
            ((t) this.f126038b).Im(str);
            return this;
        }

        public b Vl(com.google.protobuf.u uVar) {
            El();
            ((t) this.f126038b).Jm(uVar);
            return this;
        }

        public b Wl(String str) {
            El();
            ((t) this.f126038b).Km(str);
            return this;
        }

        public b Xl(com.google.protobuf.u uVar) {
            El();
            ((t) this.f126038b).Lm(uVar);
            return this;
        }

        public b Yl(String str) {
            El();
            ((t) this.f126038b).Mm(str);
            return this;
        }

        public b Zl(com.google.protobuf.u uVar) {
            El();
            ((t) this.f126038b).Nm(uVar);
            return this;
        }

        @Override // com.google.rpc.u
        public String getDescription() {
            return ((t) this.f126038b).getDescription();
        }

        @Override // com.google.rpc.u
        public String ha() {
            return ((t) this.f126038b).ha();
        }

        @Override // com.google.rpc.u
        public com.google.protobuf.u k() {
            return ((t) this.f126038b).k();
        }

        @Override // com.google.rpc.u
        public String p2() {
            return ((t) this.f126038b).p2();
        }

        @Override // com.google.rpc.u
        public com.google.protobuf.u xk() {
            return ((t) this.f126038b).xk();
        }

        private b() {
            super(t.DEFAULT_INSTANCE);
        }
    }

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        l1.Wl(t.class, tVar);
    }

    private t() {
    }

    public static t Am(InputStream inputStream, v0 v0Var) throws IOException {
        return (t) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static t Bm(ByteBuffer byteBuffer) throws t1 {
        return (t) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t Cm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (t) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static t Dm(byte[] bArr) throws t1 {
        return (t) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static t Em(byte[] bArr, v0 v0Var) throws t1 {
        return (t) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<t> Fm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.description_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im(String str) {
        str.getClass();
        this.owner_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.owner_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(String str) {
        str.getClass();
        this.resourceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.resourceName_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm(String str) {
        str.getClass();
        this.resourceType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.resourceType_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm() {
        this.description_ = qm().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm() {
        this.owner_ = qm().ha();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om() {
        this.resourceName_ = qm().p2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm() {
        this.resourceType_ = qm().Ph();
    }

    public static t qm() {
        return DEFAULT_INSTANCE;
    }

    public static b rm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b sm(t tVar) {
        return DEFAULT_INSTANCE.Uf(tVar);
    }

    public static t tm(InputStream inputStream) throws IOException {
        return (t) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static t um(InputStream inputStream, v0 v0Var) throws IOException {
        return (t) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static t vm(com.google.protobuf.u uVar) throws t1 {
        return (t) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static t wm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (t) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static t xm(com.google.protobuf.z zVar) throws IOException {
        return (t) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static t ym(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (t) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static t zm(InputStream inputStream) throws IOException {
        return (t) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    @Override // com.google.rpc.u
    public com.google.protobuf.u E4() {
        return com.google.protobuf.u.C(this.resourceName_);
    }

    @Override // com.google.rpc.u
    public String Ph() {
        return this.resourceType_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126689a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new t();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"resourceType_", "resourceName_", "owner_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<t> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (t.class) {
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

    @Override // com.google.rpc.u
    public com.google.protobuf.u U9() {
        return com.google.protobuf.u.C(this.owner_);
    }

    @Override // com.google.rpc.u
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.rpc.u
    public String ha() {
        return this.owner_;
    }

    @Override // com.google.rpc.u
    public com.google.protobuf.u k() {
        return com.google.protobuf.u.C(this.description_);
    }

    @Override // com.google.rpc.u
    public String p2() {
        return this.resourceName_;
    }

    @Override // com.google.rpc.u
    public com.google.protobuf.u xk() {
        return com.google.protobuf.u.C(this.resourceType_);
    }
}
