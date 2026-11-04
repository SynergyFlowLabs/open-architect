package com.google.type;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends l1<t, b> implements u {
    private static final t DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile f3<t> PARSER;
    private double latitude_;
    private double longitude_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126754a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126754a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126754a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126754a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126754a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126754a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126754a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126754a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<t, b> implements u {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.type.u
        public double A5() {
            return ((t) this.f126038b).A5();
        }

        public b Ol() {
            El();
            ((t) this.f126038b).em();
            return this;
        }

        public b Pl() {
            El();
            ((t) this.f126038b).fm();
            return this;
        }

        public b Ql(double d10) {
            El();
            ((t) this.f126038b).wm(d10);
            return this;
        }

        public b Rl(double d10) {
            El();
            ((t) this.f126038b).xm(d10);
            return this;
        }

        @Override // com.google.type.u
        public double w6() {
            return ((t) this.f126038b).w6();
        }

        private b() {
            super(t.DEFAULT_INSTANCE);
        }
    }

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        l1.Wl(t.class, tVar);
    }

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void em() {
        this.latitude_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fm() {
        this.longitude_ = 0.0d;
    }

    public static t gm() {
        return DEFAULT_INSTANCE;
    }

    public static b hm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b im(t tVar) {
        return DEFAULT_INSTANCE.Uf(tVar);
    }

    public static t jm(InputStream inputStream) throws IOException {
        return (t) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static t km(InputStream inputStream, v0 v0Var) throws IOException {
        return (t) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static t lm(com.google.protobuf.u uVar) throws t1 {
        return (t) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static t mm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (t) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static t nm(com.google.protobuf.z zVar) throws IOException {
        return (t) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static t om(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (t) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static t pm(InputStream inputStream) throws IOException {
        return (t) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static t qm(InputStream inputStream, v0 v0Var) throws IOException {
        return (t) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static t rm(ByteBuffer byteBuffer) throws t1 {
        return (t) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t sm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (t) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static t tm(byte[] bArr) throws t1 {
        return (t) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static t um(byte[] bArr, v0 v0Var) throws t1 {
        return (t) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<t> vm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(double d10) {
        this.latitude_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(double d10) {
        this.longitude_ = d10;
    }

    @Override // com.google.type.u
    public double A5() {
        return this.latitude_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126754a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new t();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<t> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (t.class) {
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

    @Override // com.google.type.u
    public double w6() {
        return this.longitude_;
    }
}
