package com.google.type;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 extends l1<i0, b> implements j0 {
    private static final i0 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile f3<i0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String id_ = "";
    private String version_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126731a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126731a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126731a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126731a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126731a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126731a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126731a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126731a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<i0, b> implements j0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((i0) this.f126038b).gm();
            return this;
        }

        public b Pl() {
            El();
            ((i0) this.f126038b).hm();
            return this;
        }

        public b Ql(String str) {
            El();
            ((i0) this.f126038b).ym(str);
            return this;
        }

        public b Rl(com.google.protobuf.u uVar) {
            El();
            ((i0) this.f126038b).zm(uVar);
            return this;
        }

        public b Sl(String str) {
            El();
            ((i0) this.f126038b).Am(str);
            return this;
        }

        public b Tl(com.google.protobuf.u uVar) {
            El();
            ((i0) this.f126038b).Bm(uVar);
            return this;
        }

        @Override // com.google.type.j0
        public String getId() {
            return ((i0) this.f126038b).getId();
        }

        @Override // com.google.type.j0
        public String getVersion() {
            return ((i0) this.f126038b).getVersion();
        }

        @Override // com.google.type.j0
        public com.google.protobuf.u s0() {
            return ((i0) this.f126038b).s0();
        }

        @Override // com.google.type.j0
        public com.google.protobuf.u v0() {
            return ((i0) this.f126038b).v0();
        }

        private b() {
            super(i0.DEFAULT_INSTANCE);
        }
    }

    static {
        i0 i0Var = new i0();
        DEFAULT_INSTANCE = i0Var;
        l1.Wl(i0.class, i0Var);
    }

    private i0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.version_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.id_ = im().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.version_ = im().getVersion();
    }

    public static i0 im() {
        return DEFAULT_INSTANCE;
    }

    public static b jm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b km(i0 i0Var) {
        return DEFAULT_INSTANCE.Uf(i0Var);
    }

    public static i0 lm(InputStream inputStream) throws IOException {
        return (i0) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static i0 mm(InputStream inputStream, v0 v0Var) throws IOException {
        return (i0) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static i0 nm(com.google.protobuf.u uVar) throws t1 {
        return (i0) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static i0 om(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (i0) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static i0 pm(com.google.protobuf.z zVar) throws IOException {
        return (i0) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static i0 qm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (i0) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static i0 rm(InputStream inputStream) throws IOException {
        return (i0) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static i0 sm(InputStream inputStream, v0 v0Var) throws IOException {
        return (i0) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static i0 tm(ByteBuffer byteBuffer) throws t1 {
        return (i0) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i0 um(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (i0) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static i0 vm(byte[] bArr) throws t1 {
        return (i0) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static i0 wm(byte[] bArr, v0 v0Var) throws t1 {
        return (i0) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<i0> xm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.id_ = uVar.z0();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126731a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new i0();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"id_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<i0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (i0.class) {
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

    @Override // com.google.type.j0
    public String getId() {
        return this.id_;
    }

    @Override // com.google.type.j0
    public String getVersion() {
        return this.version_;
    }

    @Override // com.google.type.j0
    public com.google.protobuf.u s0() {
        return com.google.protobuf.u.C(this.version_);
    }

    @Override // com.google.type.j0
    public com.google.protobuf.u v0() {
        return com.google.protobuf.u.C(this.id_);
    }
}
