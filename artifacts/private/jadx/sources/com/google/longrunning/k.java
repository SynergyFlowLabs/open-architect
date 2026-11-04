package com.google.longrunning;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import com.google.rpc.x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends l1<k, b> implements n {
    private static final k DEFAULT_INSTANCE;
    public static final int DONE_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f3<k> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean done_;
    private com.google.protobuf.f metadata_;
    private Object result_;
    private int resultCase_ = 0;
    private String name_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125702a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125702a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125702a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125702a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int i10 = 5 << 4;
                f125702a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125702a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125702a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125702a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<k, b> implements n {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.longrunning.n
        public com.google.protobuf.f N() {
            return ((k) this.f126038b).N();
        }

        public b Ol() {
            El();
            ((k) this.f126038b).pm();
            return this;
        }

        public b Pl() {
            El();
            ((k) this.f126038b).qm();
            return this;
        }

        public b Ql() {
            El();
            ((k) this.f126038b).rm();
            return this;
        }

        @Override // com.google.longrunning.n
        public boolean R6() {
            return ((k) this.f126038b).R6();
        }

        public b Rl() {
            El();
            ((k) this.f126038b).sm();
            return this;
        }

        public b Sl() {
            El();
            ((k) this.f126038b).tm();
            return this;
        }

        @Override // com.google.longrunning.n
        public x T() {
            return ((k) this.f126038b).T();
        }

        public b Tl() {
            El();
            ((k) this.f126038b).um();
            return this;
        }

        public b Ul(x xVar) {
            El();
            ((k) this.f126038b).wm(xVar);
            return this;
        }

        public b Vl(com.google.protobuf.f fVar) {
            El();
            ((k) this.f126038b).xm(fVar);
            return this;
        }

        public b Wl(com.google.protobuf.f fVar) {
            El();
            ((k) this.f126038b).ym(fVar);
            return this;
        }

        public b Xl(boolean z10) {
            El();
            ((k) this.f126038b).Om(z10);
            return this;
        }

        @Override // com.google.longrunning.n
        public boolean Yg() {
            return ((k) this.f126038b).Yg();
        }

        public b Yl(x.b bVar) {
            El();
            ((k) this.f126038b).Pm(bVar.build());
            return this;
        }

        public b Zl(x xVar) {
            El();
            ((k) this.f126038b).Pm(xVar);
            return this;
        }

        @Override // com.google.longrunning.n
        public u a() {
            return ((k) this.f126038b).a();
        }

        public b am(com.google.protobuf.f.b bVar) {
            El();
            ((k) this.f126038b).Qm(bVar.build());
            return this;
        }

        public b bm(com.google.protobuf.f fVar) {
            El();
            ((k) this.f126038b).Qm(fVar);
            return this;
        }

        public b cm(String str) {
            El();
            ((k) this.f126038b).Rm(str);
            return this;
        }

        public b dm(u uVar) {
            El();
            ((k) this.f126038b).Sm(uVar);
            return this;
        }

        public b em(com.google.protobuf.f.b bVar) {
            El();
            ((k) this.f126038b).Tm(bVar.build());
            return this;
        }

        public b fm(com.google.protobuf.f fVar) {
            El();
            ((k) this.f126038b).Tm(fVar);
            return this;
        }

        @Override // com.google.longrunning.n
        public String getName() {
            return ((k) this.f126038b).getName();
        }

        @Override // com.google.longrunning.n
        public c gi() {
            return ((k) this.f126038b).gi();
        }

        @Override // com.google.longrunning.n
        public boolean n1() {
            return ((k) this.f126038b).n1();
        }

        @Override // com.google.longrunning.n
        public boolean oj() {
            return ((k) this.f126038b).oj();
        }

        @Override // com.google.longrunning.n
        public com.google.protobuf.f z() {
            return ((k) this.f126038b).z();
        }

        private b() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    public enum c {
        ERROR(4),
        RESPONSE(5),
        RESULT_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f125707a;

        c(int i10) {
            this.f125707a = i10;
        }

        public static c l(int i10) {
            if (i10 == 0) {
                return RESULT_NOT_SET;
            }
            if (i10 == 4) {
                return ERROR;
            }
            if (i10 != 5) {
                return null;
            }
            return RESPONSE;
        }

        @Deprecated
        public static c n(int i10) {
            return l(i10);
        }

        public int i() {
            return this.f125707a;
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        l1.Wl(k.class, kVar);
    }

    private k() {
    }

    public static b Am(k kVar) {
        return DEFAULT_INSTANCE.Uf(kVar);
    }

    public static k Bm(InputStream inputStream) throws IOException {
        return (k) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static k Cm(InputStream inputStream, v0 v0Var) throws IOException {
        return (k) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static k Dm(u uVar) throws t1 {
        return (k) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static k Em(u uVar, v0 v0Var) throws t1 {
        return (k) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static k Fm(z zVar) throws IOException {
        return (k) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static k Gm(z zVar, v0 v0Var) throws IOException {
        return (k) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static k Hm(InputStream inputStream) throws IOException {
        return (k) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static k Im(InputStream inputStream, v0 v0Var) throws IOException {
        return (k) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static k Jm(ByteBuffer byteBuffer) throws t1 {
        return (k) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k Km(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (k) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static k Lm(byte[] bArr) throws t1 {
        return (k) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static k Mm(byte[] bArr, v0 v0Var) throws t1 {
        return (k) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<k> Nm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om(boolean z10) {
        this.done_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm(x xVar) {
        xVar.getClass();
        this.result_ = xVar;
        this.resultCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm(com.google.protobuf.f fVar) {
        fVar.getClass();
        this.metadata_ = fVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.name_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm(com.google.protobuf.f fVar) {
        fVar.getClass();
        this.result_ = fVar;
        this.resultCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm() {
        this.done_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm() {
        if (this.resultCase_ == 4) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rm() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sm() {
        this.name_ = vm().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tm() {
        if (this.resultCase_ == 5) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    public static k vm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(x xVar) {
        xVar.getClass();
        if (this.resultCase_ != 4 || this.result_ == x.sm()) {
            this.result_ = xVar;
        } else {
            this.result_ = x.wm((x) this.result_).Jl(xVar).B1();
        }
        this.resultCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(com.google.protobuf.f fVar) {
        fVar.getClass();
        com.google.protobuf.f fVar2 = this.metadata_;
        if (fVar2 == null || fVar2 == com.google.protobuf.f.hm()) {
            this.metadata_ = fVar;
        } else {
            this.metadata_ = com.google.protobuf.f.jm(this.metadata_).Jl(fVar).B1();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(com.google.protobuf.f fVar) {
        fVar.getClass();
        if (this.resultCase_ != 5 || this.result_ == com.google.protobuf.f.hm()) {
            this.result_ = fVar;
        } else {
            this.result_ = com.google.protobuf.f.jm((com.google.protobuf.f) this.result_).Jl(fVar).B1();
        }
        this.resultCase_ = 5;
    }

    public static b zm() {
        return DEFAULT_INSTANCE.jf();
    }

    @Override // com.google.longrunning.n
    public com.google.protobuf.f N() {
        return this.resultCase_ == 5 ? (com.google.protobuf.f) this.result_ : com.google.protobuf.f.hm();
    }

    @Override // com.google.longrunning.n
    public boolean R6() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f125702a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new k();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007\u0004<\u0000\u0005<\u0000", new Object[]{"result_", "resultCase_", "bitField0_", "name_", "metadata_", "done_", x.class, com.google.protobuf.f.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<k> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (k.class) {
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

    @Override // com.google.longrunning.n
    public x T() {
        return this.resultCase_ == 4 ? (x) this.result_ : x.sm();
    }

    @Override // com.google.longrunning.n
    public boolean Yg() {
        return this.resultCase_ == 4;
    }

    @Override // com.google.longrunning.n
    public u a() {
        return u.C(this.name_);
    }

    @Override // com.google.longrunning.n
    public String getName() {
        return this.name_;
    }

    @Override // com.google.longrunning.n
    public c gi() {
        return c.l(this.resultCase_);
    }

    @Override // com.google.longrunning.n
    public boolean n1() {
        return this.resultCase_ == 5;
    }

    @Override // com.google.longrunning.n
    public boolean oj() {
        return this.done_;
    }

    @Override // com.google.longrunning.n
    public com.google.protobuf.f z() {
        com.google.protobuf.f fVarHm = this.metadata_;
        if (fVarHm == null) {
            fVarHm = com.google.protobuf.f.hm();
        }
        return fVarHm;
    }
}
