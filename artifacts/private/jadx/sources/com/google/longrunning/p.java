package com.google.longrunning;

import com.google.protobuf.f3;
import com.google.protobuf.i0;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends l1<p, b> implements q {
    private static final p DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f3<p> PARSER = null;
    public static final int TIMEOUT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private i0 timeout_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125711a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125711a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125711a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125711a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125711a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125711a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125711a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125711a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<p, b> implements q {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((p) this.f126038b).gm();
            return this;
        }

        public b Pl() {
            El();
            ((p) this.f126038b).hm();
            return this;
        }

        public b Ql(i0 i0Var) {
            El();
            ((p) this.f126038b).jm(i0Var);
            return this;
        }

        public b Rl(String str) {
            El();
            ((p) this.f126038b).zm(str);
            return this;
        }

        public b Sl(u uVar) {
            El();
            ((p) this.f126038b).Am(uVar);
            return this;
        }

        public b Tl(i0.b bVar) {
            El();
            ((p) this.f126038b).Bm(bVar.build());
            return this;
        }

        public b Ul(i0 i0Var) {
            El();
            ((p) this.f126038b).Bm(i0Var);
            return this;
        }

        @Override // com.google.longrunning.q
        public u a() {
            return ((p) this.f126038b).a();
        }

        @Override // com.google.longrunning.q
        public String getName() {
            return ((p) this.f126038b).getName();
        }

        @Override // com.google.longrunning.q
        public i0 i2() {
            return ((p) this.f126038b).i2();
        }

        @Override // com.google.longrunning.q
        public boolean rg() {
            return ((p) this.f126038b).rg();
        }

        private b() {
            super(p.DEFAULT_INSTANCE);
        }
    }

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        l1.Wl(p.class, pVar);
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.name_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(i0 i0Var) {
        i0Var.getClass();
        this.timeout_ = i0Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.name_ = im().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.timeout_ = null;
        this.bitField0_ &= -2;
    }

    public static p im() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm(i0 i0Var) {
        i0Var.getClass();
        i0 i0Var2 = this.timeout_;
        if (i0Var2 == null || i0Var2 == i0.gm()) {
            this.timeout_ = i0Var;
        } else {
            this.timeout_ = i0.im(this.timeout_).Jl(i0Var).B1();
        }
        this.bitField0_ |= 1;
    }

    public static b km() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b lm(p pVar) {
        return DEFAULT_INSTANCE.Uf(pVar);
    }

    public static p mm(InputStream inputStream) throws IOException {
        return (p) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static p nm(InputStream inputStream, v0 v0Var) throws IOException {
        return (p) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static p om(u uVar) throws t1 {
        return (p) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static p pm(u uVar, v0 v0Var) throws t1 {
        return (p) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static p qm(z zVar) throws IOException {
        return (p) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static p rm(z zVar, v0 v0Var) throws IOException {
        return (p) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static p sm(InputStream inputStream) throws IOException {
        return (p) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static p tm(InputStream inputStream, v0 v0Var) throws IOException {
        return (p) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static p um(ByteBuffer byteBuffer) throws t1 {
        return (p) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p vm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (p) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static p wm(byte[] bArr) throws t1 {
        return (p) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static p xm(byte[] bArr, v0 v0Var) throws t1 {
        return (p) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<p> ym() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(String str) {
        str.getClass();
        this.name_ = str;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f125711a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new p();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "timeout_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<p> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (p.class) {
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

    @Override // com.google.longrunning.q
    public u a() {
        return u.C(this.name_);
    }

    @Override // com.google.longrunning.q
    public String getName() {
        return this.name_;
    }

    @Override // com.google.longrunning.q
    public i0 i2() {
        i0 i0Var = this.timeout_;
        return i0Var == null ? i0.gm() : i0Var;
    }

    @Override // com.google.longrunning.q
    public boolean rg() {
        return (this.bitField0_ & 1) != 0;
    }
}
