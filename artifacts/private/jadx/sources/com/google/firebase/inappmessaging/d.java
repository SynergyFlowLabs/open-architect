package com.google.firebase.inappmessaging;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends l1<d, b> implements e {
    private static final d DEFAULT_INSTANCE;
    public static final int FIREBASE_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile f3<d> PARSER;
    private int bitField0_;
    private String googleAppId_ = "";
    private String firebaseInstanceId_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f122125a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f122125a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122125a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122125a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f122125a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f122125a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f122125a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f122125a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<d, b> implements e {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((d) this.f126038b).gm();
            return this;
        }

        public b Pl() {
            El();
            ((d) this.f126038b).hm();
            return this;
        }

        public b Ql(String str) {
            El();
            ((d) this.f126038b).ym(str);
            return this;
        }

        public b Rl(com.google.protobuf.u uVar) {
            El();
            ((d) this.f126038b).zm(uVar);
            return this;
        }

        public b Sl(String str) {
            El();
            ((d) this.f126038b).Am(str);
            return this;
        }

        public b Tl(com.google.protobuf.u uVar) {
            El();
            ((d) this.f126038b).Bm(uVar);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.e
        public String df() {
            return ((d) this.f126038b).df();
        }

        @Override // com.google.firebase.inappmessaging.e
        public com.google.protobuf.u hj() {
            return ((d) this.f126038b).hj();
        }

        @Override // com.google.firebase.inappmessaging.e
        public String n4() {
            return ((d) this.f126038b).n4();
        }

        @Override // com.google.firebase.inappmessaging.e
        public boolean ng() {
            return ((d) this.f126038b).ng();
        }

        @Override // com.google.firebase.inappmessaging.e
        public com.google.protobuf.u r2() {
            return ((d) this.f126038b).r2();
        }

        @Override // com.google.firebase.inappmessaging.e
        public boolean u4() {
            return ((d) this.f126038b).u4();
        }

        private b() {
            super(d.DEFAULT_INSTANCE);
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        l1.Wl(d.class, dVar);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(com.google.protobuf.u uVar) {
        this.googleAppId_ = uVar.z0();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.bitField0_ &= -3;
        this.firebaseInstanceId_ = im().df();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.bitField0_ &= -2;
        this.googleAppId_ = im().n4();
    }

    public static d im() {
        return DEFAULT_INSTANCE;
    }

    public static b jm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b km(d dVar) {
        return DEFAULT_INSTANCE.Uf(dVar);
    }

    public static d lm(InputStream inputStream) throws IOException {
        return (d) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static d mm(InputStream inputStream, v0 v0Var) throws IOException {
        return (d) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static d nm(com.google.protobuf.u uVar) throws t1 {
        return (d) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static d om(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (d) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static d pm(com.google.protobuf.z zVar) throws IOException {
        return (d) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static d qm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (d) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static d rm(InputStream inputStream) throws IOException {
        return (d) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static d sm(InputStream inputStream, v0 v0Var) throws IOException {
        return (d) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static d tm(ByteBuffer byteBuffer) throws t1 {
        return (d) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d um(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (d) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static d vm(byte[] bArr) throws t1 {
        return (d) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static d wm(byte[] bArr, v0 v0Var) throws t1 {
        return (d) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<d> xm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.firebaseInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(com.google.protobuf.u uVar) {
        this.firebaseInstanceId_ = uVar.z0();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f122125a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new d();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "googleAppId_", "firebaseInstanceId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<d> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (d.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new l1.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } finally {
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

    @Override // com.google.firebase.inappmessaging.e
    public String df() {
        return this.firebaseInstanceId_;
    }

    @Override // com.google.firebase.inappmessaging.e
    public com.google.protobuf.u hj() {
        return com.google.protobuf.u.C(this.firebaseInstanceId_);
    }

    @Override // com.google.firebase.inappmessaging.e
    public String n4() {
        return this.googleAppId_;
    }

    @Override // com.google.firebase.inappmessaging.e
    public boolean ng() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.inappmessaging.e
    public com.google.protobuf.u r2() {
        return com.google.protobuf.u.C(this.googleAppId_);
    }

    @Override // com.google.firebase.inappmessaging.e
    public boolean u4() {
        return (this.bitField0_ & 1) != 0;
    }
}
