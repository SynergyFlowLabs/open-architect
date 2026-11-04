package com.google.rpc;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends l1<x, b> implements y {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final x DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile f3<x> PARSER;
    private int code_;
    private String message_ = "";
    private s1.k<com.google.protobuf.f> details_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126691a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126691a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126691a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126691a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126691a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126691a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126691a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126691a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<x, b> implements y {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.rpc.y
        public com.google.protobuf.u D3() {
            return ((x) this.f126038b).D3();
        }

        @Override // com.google.rpc.y
        public List<com.google.protobuf.f> Dk() {
            return Collections.unmodifiableList(((x) this.f126038b).Dk());
        }

        public b Ol(Iterable<? extends com.google.protobuf.f> iterable) {
            El();
            ((x) this.f126038b).lm(iterable);
            return this;
        }

        public b Pl(int i10, com.google.protobuf.f.b bVar) {
            El();
            ((x) this.f126038b).mm(i10, bVar.build());
            return this;
        }

        @Override // com.google.rpc.y
        public String Q() {
            return ((x) this.f126038b).Q();
        }

        @Override // com.google.rpc.y
        public int Q8() {
            return ((x) this.f126038b).Q8();
        }

        public b Ql(int i10, com.google.protobuf.f fVar) {
            El();
            ((x) this.f126038b).mm(i10, fVar);
            return this;
        }

        public b Rl(com.google.protobuf.f.b bVar) {
            El();
            ((x) this.f126038b).nm(bVar.build());
            return this;
        }

        public b Sl(com.google.protobuf.f fVar) {
            El();
            ((x) this.f126038b).nm(fVar);
            return this;
        }

        public b Tl() {
            El();
            ((x) this.f126038b).om();
            return this;
        }

        public b Ul() {
            El();
            ((x) this.f126038b).pm();
            return this;
        }

        public b Vl() {
            El();
            ((x) this.f126038b).qm();
            return this;
        }

        public b Wl(int i10) {
            El();
            ((x) this.f126038b).Km(i10);
            return this;
        }

        public b Xl(int i10) {
            El();
            ((x) this.f126038b).Lm(i10);
            return this;
        }

        public b Yl(int i10, com.google.protobuf.f.b bVar) {
            El();
            ((x) this.f126038b).Mm(i10, bVar.build());
            return this;
        }

        public b Zl(int i10, com.google.protobuf.f fVar) {
            El();
            ((x) this.f126038b).Mm(i10, fVar);
            return this;
        }

        public b am(String str) {
            El();
            ((x) this.f126038b).Nm(str);
            return this;
        }

        public b bm(com.google.protobuf.u uVar) {
            El();
            ((x) this.f126038b).Om(uVar);
            return this;
        }

        @Override // com.google.rpc.y
        public int getCode() {
            return ((x) this.f126038b).getCode();
        }

        @Override // com.google.rpc.y
        public com.google.protobuf.f y9(int i10) {
            return ((x) this.f126038b).y9(i10);
        }

        private b() {
            super(x.DEFAULT_INSTANCE);
        }
    }

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        l1.Wl(x.class, xVar);
    }

    private x() {
    }

    public static x Am(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (x) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static x Bm(com.google.protobuf.z zVar) throws IOException {
        return (x) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static x Cm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (x) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static x Dm(InputStream inputStream) throws IOException {
        return (x) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static x Em(InputStream inputStream, v0 v0Var) throws IOException {
        return (x) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static x Fm(ByteBuffer byteBuffer) throws t1 {
        return (x) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x Gm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (x) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static x Hm(byte[] bArr) throws t1 {
        return (x) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static x Im(byte[] bArr, v0 v0Var) throws t1 {
        return (x) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<x> Jm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(int i10) {
        rm();
        this.details_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm(int i10) {
        this.code_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm(int i10, com.google.protobuf.f fVar) {
        fVar.getClass();
        rm();
        this.details_.set(i10, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.message_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm(Iterable<? extends com.google.protobuf.f> iterable) {
        rm();
        com.google.protobuf.a.y(iterable, this.details_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm(int i10, com.google.protobuf.f fVar) {
        fVar.getClass();
        rm();
        this.details_.add(i10, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm(com.google.protobuf.f fVar) {
        fVar.getClass();
        rm();
        this.details_.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm() {
        this.details_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm() {
        this.message_ = sm().Q();
    }

    private void rm() {
        s1.k<com.google.protobuf.f> kVar = this.details_;
        if (kVar.s1()) {
            return;
        }
        this.details_ = l1.yl(kVar);
    }

    public static x sm() {
        return DEFAULT_INSTANCE;
    }

    public static b vm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b wm(x xVar) {
        return DEFAULT_INSTANCE.Uf(xVar);
    }

    public static x xm(InputStream inputStream) throws IOException {
        return (x) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static x ym(InputStream inputStream, v0 v0Var) throws IOException {
        return (x) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static x zm(com.google.protobuf.u uVar) throws t1 {
        return (x) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    @Override // com.google.rpc.y
    public com.google.protobuf.u D3() {
        return com.google.protobuf.u.C(this.message_);
    }

    @Override // com.google.rpc.y
    public List<com.google.protobuf.f> Dk() {
        return this.details_;
    }

    @Override // com.google.rpc.y
    public String Q() {
        return this.message_;
    }

    @Override // com.google.rpc.y
    public int Q8() {
        return this.details_.size();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126691a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new x();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", com.google.protobuf.f.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<x> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (x.class) {
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

    @Override // com.google.rpc.y
    public int getCode() {
        return this.code_;
    }

    public com.google.protobuf.g tm(int i10) {
        return this.details_.get(i10);
    }

    public List<? extends com.google.protobuf.g> um() {
        return this.details_;
    }

    @Override // com.google.rpc.y
    public com.google.protobuf.f y9(int i10) {
        return this.details_.get(i10);
    }
}
