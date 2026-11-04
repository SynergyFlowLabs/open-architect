package com.google.rpc;

import com.google.protobuf.f3;
import com.google.protobuf.i0;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends l1<v, b> implements w {
    private static final v DEFAULT_INSTANCE;
    private static volatile f3<v> PARSER = null;
    public static final int RETRY_DELAY_FIELD_NUMBER = 1;
    private int bitField0_;
    private i0 retryDelay_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126690a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126690a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126690a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126690a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126690a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126690a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126690a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126690a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<v, b> implements w {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.rpc.w
        public boolean Ib() {
            return ((v) this.f126038b).Ib();
        }

        public b Ol() {
            El();
            ((v) this.f126038b).dm();
            return this;
        }

        public b Pl(i0 i0Var) {
            El();
            ((v) this.f126038b).fm(i0Var);
            return this;
        }

        public b Ql(i0.b bVar) {
            El();
            ((v) this.f126038b).vm(bVar.build());
            return this;
        }

        public b Rl(i0 i0Var) {
            El();
            ((v) this.f126038b).vm(i0Var);
            return this;
        }

        @Override // com.google.rpc.w
        public i0 Zj() {
            return ((v) this.f126038b).Zj();
        }

        private b() {
            super(v.DEFAULT_INSTANCE);
        }
    }

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        l1.Wl(v.class, vVar);
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dm() {
        this.retryDelay_ = null;
        this.bitField0_ &= -2;
    }

    public static v em() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fm(i0 i0Var) {
        i0Var.getClass();
        i0 i0Var2 = this.retryDelay_;
        if (i0Var2 == null || i0Var2 == i0.gm()) {
            this.retryDelay_ = i0Var;
        } else {
            this.retryDelay_ = i0.im(this.retryDelay_).Jl(i0Var).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b gm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b hm(v vVar) {
        return DEFAULT_INSTANCE.Uf(vVar);
    }

    public static v im(InputStream inputStream) throws IOException {
        return (v) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static v jm(InputStream inputStream, v0 v0Var) throws IOException {
        return (v) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static v km(com.google.protobuf.u uVar) throws t1 {
        return (v) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static v lm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (v) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static v mm(com.google.protobuf.z zVar) throws IOException {
        return (v) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static v nm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (v) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static v om(InputStream inputStream) throws IOException {
        return (v) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static v pm(InputStream inputStream, v0 v0Var) throws IOException {
        return (v) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static v qm(ByteBuffer byteBuffer) throws t1 {
        return (v) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static v rm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (v) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static v sm(byte[] bArr) throws t1 {
        return (v) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static v tm(byte[] bArr, v0 v0Var) throws t1 {
        return (v) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<v> um() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(i0 i0Var) {
        i0Var.getClass();
        this.retryDelay_ = i0Var;
        this.bitField0_ |= 1;
    }

    @Override // com.google.rpc.w
    public boolean Ib() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126690a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new v();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "retryDelay_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<v> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (v.class) {
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

    @Override // com.google.rpc.w
    public i0 Zj() {
        i0 i0Var = this.retryDelay_;
        return i0Var == null ? i0.gm() : i0Var;
    }
}
