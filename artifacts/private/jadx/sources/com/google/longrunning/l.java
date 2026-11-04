package com.google.longrunning;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends l1<l, b> implements m {
    private static final l DEFAULT_INSTANCE;
    public static final int METADATA_TYPE_FIELD_NUMBER = 2;
    private static volatile f3<l> PARSER = null;
    public static final int RESPONSE_TYPE_FIELD_NUMBER = 1;
    private String responseType_ = "";
    private String metadataType_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125708a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125708a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125708a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125708a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125708a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125708a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125708a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125708a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<l, b> implements m {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.longrunning.m
        public u Ce() {
            return ((l) this.f126038b).Ce();
        }

        @Override // com.google.longrunning.m
        public u Ed() {
            return ((l) this.f126038b).Ed();
        }

        @Override // com.google.longrunning.m
        public String Ff() {
            return ((l) this.f126038b).Ff();
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

        public b Ql(String str) {
            El();
            ((l) this.f126038b).ym(str);
            return this;
        }

        public b Rl(u uVar) {
            El();
            ((l) this.f126038b).zm(uVar);
            return this;
        }

        public b Sl(String str) {
            El();
            ((l) this.f126038b).Am(str);
            return this;
        }

        public b Tl(u uVar) {
            El();
            ((l) this.f126038b).Bm(uVar);
            return this;
        }

        @Override // com.google.longrunning.m
        public String qe() {
            return ((l) this.f126038b).qe();
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
        this.responseType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.responseType_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.metadataType_ = im().qe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.responseType_ = im().Ff();
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

    public static l nm(u uVar) throws t1 {
        return (l) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static l om(u uVar, v0 v0Var) throws t1 {
        return (l) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static l pm(z zVar) throws IOException {
        return (l) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static l qm(z zVar, v0 v0Var) throws IOException {
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
        this.metadataType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.metadataType_ = uVar.z0();
    }

    @Override // com.google.longrunning.m
    public u Ce() {
        return u.C(this.metadataType_);
    }

    @Override // com.google.longrunning.m
    public u Ed() {
        return u.C(this.responseType_);
    }

    @Override // com.google.longrunning.m
    public String Ff() {
        return this.responseType_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f125708a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new l();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"responseType_", "metadataType_"});
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

    @Override // com.google.longrunning.m
    public String qe() {
        return this.metadataType_;
    }
}
