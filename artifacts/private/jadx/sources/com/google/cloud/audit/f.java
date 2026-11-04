package com.google.cloud.audit;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends l1<f, b> implements g {
    private static final f DEFAULT_INSTANCE;
    public static final int GRANTED_FIELD_NUMBER = 3;
    private static volatile f3<f> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 2;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    private boolean granted_;
    private String resource_ = "";
    private String permission_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116420a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f116420a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116420a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116420a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116420a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int i10 = 2 | 5;
                f116420a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116420a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116420a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<f, b> implements g {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.cloud.audit.g
        public String F7() {
            return ((f) this.f126038b).F7();
        }

        @Override // com.google.cloud.audit.g
        public u Ge() {
            return ((f) this.f126038b).Ge();
        }

        @Override // com.google.cloud.audit.g
        public boolean J9() {
            return ((f) this.f126038b).J9();
        }

        public b Ol() {
            El();
            ((f) this.f126038b).im();
            return this;
        }

        public b Pl() {
            El();
            ((f) this.f126038b).jm();
            return this;
        }

        public b Ql() {
            El();
            ((f) this.f126038b).km();
            return this;
        }

        @Override // com.google.cloud.audit.g
        public String R7() {
            return ((f) this.f126038b).R7();
        }

        public b Rl(boolean z10) {
            El();
            ((f) this.f126038b).Bm(z10);
            return this;
        }

        public b Sl(String str) {
            El();
            ((f) this.f126038b).Cm(str);
            return this;
        }

        public b Tl(u uVar) {
            El();
            ((f) this.f126038b).Dm(uVar);
            return this;
        }

        public b Ul(String str) {
            El();
            ((f) this.f126038b).Em(str);
            return this;
        }

        public b Vl(u uVar) {
            El();
            ((f) this.f126038b).Fm(uVar);
            return this;
        }

        @Override // com.google.cloud.audit.g
        public u nd() {
            return ((f) this.f126038b).nd();
        }

        private b() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        l1.Wl(f.class, fVar);
    }

    private f() {
    }

    public static f3<f> Am() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(boolean z10) {
        this.granted_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm(String str) {
        str.getClass();
        this.permission_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.permission_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(String str) {
        str.getClass();
        this.resource_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.resource_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im() {
        this.granted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.permission_ = lm().F7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km() {
        this.resource_ = lm().R7();
    }

    public static f lm() {
        return DEFAULT_INSTANCE;
    }

    public static b mm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b nm(f fVar) {
        return DEFAULT_INSTANCE.Uf(fVar);
    }

    public static f om(InputStream inputStream) throws IOException {
        return (f) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static f pm(InputStream inputStream, v0 v0Var) throws IOException {
        return (f) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static f qm(u uVar) throws t1 {
        return (f) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static f rm(u uVar, v0 v0Var) throws t1 {
        return (f) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static f sm(z zVar) throws IOException {
        return (f) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static f tm(z zVar, v0 v0Var) throws IOException {
        return (f) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static f um(InputStream inputStream) throws IOException {
        return (f) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static f vm(InputStream inputStream, v0 v0Var) throws IOException {
        return (f) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static f wm(ByteBuffer byteBuffer) throws t1 {
        return (f) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f xm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (f) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static f ym(byte[] bArr) throws t1 {
        return (f) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static f zm(byte[] bArr, v0 v0Var) throws t1 {
        return (f) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    @Override // com.google.cloud.audit.g
    public String F7() {
        return this.permission_;
    }

    @Override // com.google.cloud.audit.g
    public u Ge() {
        return u.C(this.permission_);
    }

    @Override // com.google.cloud.audit.g
    public boolean J9() {
        return this.granted_;
    }

    @Override // com.google.cloud.audit.g
    public String R7() {
        return this.resource_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f116420a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new f();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"resource_", "permission_", "granted_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<f> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (f.class) {
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

    @Override // com.google.cloud.audit.g
    public u nd() {
        return u.C(this.resource_);
    }
}
