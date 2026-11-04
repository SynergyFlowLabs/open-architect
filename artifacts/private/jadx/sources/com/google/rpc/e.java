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
public final class e extends l1<e, b> implements f {
    private static final e DEFAULT_INSTANCE;
    public static final int DETAIL_FIELD_NUMBER = 2;
    private static volatile f3<e> PARSER = null;
    public static final int STACK_ENTRIES_FIELD_NUMBER = 1;
    private s1.k<String> stackEntries_ = l1.Ij();
    private String detail_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126681a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126681a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126681a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126681a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126681a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126681a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126681a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126681a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<e, b> implements f {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.rpc.f
        public String Bc(int i10) {
            return ((e) this.f126038b).Bc(i10);
        }

        @Override // com.google.rpc.f
        public String Ej() {
            return ((e) this.f126038b).Ej();
        }

        public b Ol(Iterable<String> iterable) {
            El();
            ((e) this.f126038b).im(iterable);
            return this;
        }

        public b Pl(String str) {
            El();
            ((e) this.f126038b).jm(str);
            return this;
        }

        public b Ql(com.google.protobuf.u uVar) {
            El();
            ((e) this.f126038b).km(uVar);
            return this;
        }

        public b Rl() {
            El();
            ((e) this.f126038b).lm();
            return this;
        }

        public b Sl() {
            El();
            ((e) this.f126038b).mm();
            return this;
        }

        public b Tl(String str) {
            El();
            ((e) this.f126038b).Em(str);
            return this;
        }

        @Override // com.google.rpc.f
        public int Uc() {
            return ((e) this.f126038b).Uc();
        }

        public b Ul(com.google.protobuf.u uVar) {
            El();
            ((e) this.f126038b).Fm(uVar);
            return this;
        }

        public b Vl(int i10, String str) {
            El();
            ((e) this.f126038b).Gm(i10, str);
            return this;
        }

        @Override // com.google.rpc.f
        public List<String> fe() {
            return Collections.unmodifiableList(((e) this.f126038b).fe());
        }

        @Override // com.google.rpc.f
        public com.google.protobuf.u ig() {
            return ((e) this.f126038b).ig();
        }

        @Override // com.google.rpc.f
        public com.google.protobuf.u oh(int i10) {
            return ((e) this.f126038b).oh(i10);
        }

        private b() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        l1.Wl(e.class, eVar);
    }

    private e() {
    }

    public static e Am(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (e) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static e Bm(byte[] bArr) throws t1 {
        return (e) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static e Cm(byte[] bArr, v0 v0Var) throws t1 {
        return (e) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<e> Dm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(String str) {
        str.getClass();
        this.detail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.detail_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(int i10, String str) {
        str.getClass();
        nm();
        this.stackEntries_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im(Iterable<String> iterable) {
        nm();
        com.google.protobuf.a.y(iterable, this.stackEntries_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm(String str) {
        str.getClass();
        nm();
        this.stackEntries_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        nm();
        this.stackEntries_.add(uVar.z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm() {
        this.detail_ = om().Ej();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm() {
        this.stackEntries_ = l1.Ij();
    }

    private void nm() {
        s1.k<String> kVar = this.stackEntries_;
        if (kVar.s1()) {
            return;
        }
        this.stackEntries_ = l1.yl(kVar);
    }

    public static e om() {
        return DEFAULT_INSTANCE;
    }

    public static b pm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b qm(e eVar) {
        return DEFAULT_INSTANCE.Uf(eVar);
    }

    public static e rm(InputStream inputStream) throws IOException {
        return (e) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static e sm(InputStream inputStream, v0 v0Var) throws IOException {
        return (e) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static e tm(com.google.protobuf.u uVar) throws t1 {
        return (e) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static e um(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (e) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static e vm(com.google.protobuf.z zVar) throws IOException {
        return (e) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static e wm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (e) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static e xm(InputStream inputStream) throws IOException {
        return (e) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static e ym(InputStream inputStream, v0 v0Var) throws IOException {
        return (e) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static e zm(ByteBuffer byteBuffer) throws t1 {
        return (e) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    @Override // com.google.rpc.f
    public String Bc(int i10) {
        return this.stackEntries_.get(i10);
    }

    @Override // com.google.rpc.f
    public String Ej() {
        return this.detail_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126681a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new e();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"stackEntries_", "detail_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<e> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (e.class) {
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

    @Override // com.google.rpc.f
    public int Uc() {
        return this.stackEntries_.size();
    }

    @Override // com.google.rpc.f
    public List<String> fe() {
        return this.stackEntries_;
    }

    @Override // com.google.rpc.f
    public com.google.protobuf.u ig() {
        return com.google.protobuf.u.C(this.detail_);
    }

    @Override // com.google.rpc.f
    public com.google.protobuf.u oh(int i10) {
        return com.google.protobuf.u.C(this.stackEntries_.get(i10));
    }
}
