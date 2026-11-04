package com.google.rpc;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends l1<l, b> implements m {
    private static final l DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile f3<l> PARSER;
    private String locale_ = "";
    private String message_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126685a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126685a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126685a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126685a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126685a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126685a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126685a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126685a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<l, b> implements m {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.rpc.m
        public com.google.protobuf.u D3() {
            return ((l) this.f126038b).D3();
        }

        public b Ol() {
            El();
            ((l) this.f126038b).gm();
            return this;
        }

        public b Pl() {
            El();
            ((l) this.f126038b).hm();
            return this;
        }

        @Override // com.google.rpc.m
        public String Q() {
            return ((l) this.f126038b).Q();
        }

        public b Ql(String str) {
            El();
            ((l) this.f126038b).ym(str);
            return this;
        }

        public b Rl(com.google.protobuf.u uVar) {
            El();
            ((l) this.f126038b).zm(uVar);
            return this;
        }

        public b Sl(String str) {
            El();
            ((l) this.f126038b).Am(str);
            return this;
        }

        public b Tl(com.google.protobuf.u uVar) {
            El();
            ((l) this.f126038b).Bm(uVar);
            return this;
        }

        @Override // com.google.rpc.m
        public String getLocale() {
            return ((l) this.f126038b).getLocale();
        }

        @Override // com.google.rpc.m
        public com.google.protobuf.u ib() {
            return ((l) this.f126038b).ib();
        }

        private b() {
            super(l.DEFAULT_INSTANCE);
        }
    }

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        l1.Wl(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.message_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.locale_ = im().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.message_ = im().Q();
    }

    public static l im() {
        return DEFAULT_INSTANCE;
    }

    public static b jm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b km(l lVar) {
        return DEFAULT_INSTANCE.Uf(lVar);
    }

    public static l lm(InputStream inputStream) throws IOException {
        return (l) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static l mm(InputStream inputStream, v0 v0Var) throws IOException {
        return (l) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static l nm(com.google.protobuf.u uVar) throws t1 {
        return (l) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static l om(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (l) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static l pm(com.google.protobuf.z zVar) throws IOException {
        return (l) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static l qm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (l) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static l rm(InputStream inputStream) throws IOException {
        return (l) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static l sm(InputStream inputStream, v0 v0Var) throws IOException {
        return (l) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static l tm(ByteBuffer byteBuffer) throws t1 {
        return (l) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l um(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (l) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static l vm(byte[] bArr) throws t1 {
        return (l) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static l wm(byte[] bArr, v0 v0Var) throws t1 {
        return (l) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<l> xm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(String str) {
        str.getClass();
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.locale_ = uVar.z0();
    }

    @Override // com.google.rpc.m
    public com.google.protobuf.u D3() {
        return com.google.protobuf.u.C(this.message_);
    }

    @Override // com.google.rpc.m
    public String Q() {
        return this.message_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126685a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new l();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"locale_", "message_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<l> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (l.class) {
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

    @Override // com.google.rpc.m
    public String getLocale() {
        return this.locale_;
    }

    @Override // com.google.rpc.m
    public com.google.protobuf.u ib() {
        return com.google.protobuf.u.C(this.locale_);
    }
}
