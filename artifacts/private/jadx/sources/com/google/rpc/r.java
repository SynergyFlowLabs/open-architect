package com.google.rpc;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends l1<r, b> implements s {
    private static final r DEFAULT_INSTANCE;
    private static volatile f3<r> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SERVING_DATA_FIELD_NUMBER = 2;
    private String requestId_ = "";
    private String servingData_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126688a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126688a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126688a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126688a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int i10 = 0 >> 4;
                f126688a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126688a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126688a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126688a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<r, b> implements s {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.rpc.s
        public com.google.protobuf.u Ae() {
            return ((r) this.f126038b).Ae();
        }

        public b Ol() {
            El();
            ((r) this.f126038b).gm();
            return this;
        }

        public b Pl() {
            El();
            ((r) this.f126038b).hm();
            return this;
        }

        public b Ql(String str) {
            El();
            ((r) this.f126038b).ym(str);
            return this;
        }

        public b Rl(com.google.protobuf.u uVar) {
            El();
            ((r) this.f126038b).zm(uVar);
            return this;
        }

        public b Sl(String str) {
            El();
            ((r) this.f126038b).Am(str);
            return this;
        }

        public b Tl(com.google.protobuf.u uVar) {
            El();
            ((r) this.f126038b).Bm(uVar);
            return this;
        }

        @Override // com.google.rpc.s
        public com.google.protobuf.u mk() {
            return ((r) this.f126038b).mk();
        }

        @Override // com.google.rpc.s
        public String na() {
            return ((r) this.f126038b).na();
        }

        @Override // com.google.rpc.s
        public String w2() {
            return ((r) this.f126038b).w2();
        }

        private b() {
            super(r.DEFAULT_INSTANCE);
        }
    }

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        l1.Wl(r.class, rVar);
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(String str) {
        str.getClass();
        this.servingData_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.servingData_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.requestId_ = im().w2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.servingData_ = im().na();
    }

    public static r im() {
        return DEFAULT_INSTANCE;
    }

    public static b jm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b km(r rVar) {
        return DEFAULT_INSTANCE.Uf(rVar);
    }

    public static r lm(InputStream inputStream) throws IOException {
        return (r) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static r mm(InputStream inputStream, v0 v0Var) throws IOException {
        return (r) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static r nm(com.google.protobuf.u uVar) throws t1 {
        return (r) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static r om(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (r) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static r pm(com.google.protobuf.z zVar) throws IOException {
        return (r) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static r qm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (r) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static r rm(InputStream inputStream) throws IOException {
        return (r) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static r sm(InputStream inputStream, v0 v0Var) throws IOException {
        return (r) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static r tm(ByteBuffer byteBuffer) throws t1 {
        return (r) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r um(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (r) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static r vm(byte[] bArr) throws t1 {
        return (r) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static r wm(byte[] bArr, v0 v0Var) throws t1 {
        return (r) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<r> xm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.requestId_ = uVar.z0();
    }

    @Override // com.google.rpc.s
    public com.google.protobuf.u Ae() {
        return com.google.protobuf.u.C(this.servingData_);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126688a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new r();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"requestId_", "servingData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<r> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (r.class) {
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

    @Override // com.google.rpc.s
    public com.google.protobuf.u mk() {
        return com.google.protobuf.u.C(this.requestId_);
    }

    @Override // com.google.rpc.s
    public String na() {
        return this.servingData_;
    }

    @Override // com.google.rpc.s
    public String w2() {
        return this.requestId_;
    }
}
