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
public final class d extends l1<d, b> implements e {
    private static final d DEFAULT_INSTANCE;
    private static volatile f3<d> PARSER = null;
    public static final int PRINCIPAL_EMAIL_FIELD_NUMBER = 1;
    private String principalEmail_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116419a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f116419a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116419a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116419a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116419a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116419a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116419a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116419a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<d, b> implements e {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.cloud.audit.e
        public u Lh() {
            return ((d) this.f126038b).Lh();
        }

        public b Ol() {
            El();
            ((d) this.f126038b).dm();
            return this;
        }

        public b Pl(String str) {
            El();
            ((d) this.f126038b).um(str);
            return this;
        }

        public b Ql(u uVar) {
            El();
            ((d) this.f126038b).vm(uVar);
            return this;
        }

        @Override // com.google.cloud.audit.e
        public String W8() {
            return ((d) this.f126038b).W8();
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
    public void dm() {
        this.principalEmail_ = em().W8();
    }

    public static d em() {
        return DEFAULT_INSTANCE;
    }

    public static b fm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b gm(d dVar) {
        return DEFAULT_INSTANCE.Uf(dVar);
    }

    public static d hm(InputStream inputStream) throws IOException {
        return (d) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static d im(InputStream inputStream, v0 v0Var) throws IOException {
        return (d) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static d jm(u uVar) throws t1 {
        return (d) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static d km(u uVar, v0 v0Var) throws t1 {
        return (d) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static d lm(z zVar) throws IOException {
        return (d) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static d mm(z zVar, v0 v0Var) throws IOException {
        return (d) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static d nm(InputStream inputStream) throws IOException {
        return (d) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static d om(InputStream inputStream, v0 v0Var) throws IOException {
        return (d) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static d pm(ByteBuffer byteBuffer) throws t1 {
        return (d) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d qm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (d) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static d rm(byte[] bArr) throws t1 {
        return (d) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static d sm(byte[] bArr, v0 v0Var) throws t1 {
        return (d) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<d> tm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(String str) {
        str.getClass();
        this.principalEmail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.principalEmail_ = uVar.z0();
    }

    @Override // com.google.cloud.audit.e
    public u Lh() {
        return u.C(this.principalEmail_);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f116419a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new d();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"principalEmail_"});
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

    @Override // com.google.cloud.audit.e
    public String W8() {
        return this.principalEmail_;
    }
}
