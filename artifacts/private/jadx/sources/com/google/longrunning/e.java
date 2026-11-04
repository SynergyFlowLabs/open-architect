package com.google.longrunning;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends l1<e, b> implements f {
    private static final e DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f3<e> PARSER;
    private String name_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125699a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125699a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125699a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125699a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125699a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125699a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125699a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125699a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<e, b> implements f {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((e) this.f126038b).dm();
            return this;
        }

        public b Pl(String str) {
            El();
            ((e) this.f126038b).um(str);
            return this;
        }

        public b Ql(u uVar) {
            El();
            ((e) this.f126038b).vm(uVar);
            return this;
        }

        @Override // com.google.longrunning.f
        public u a() {
            return ((e) this.f126038b).a();
        }

        @Override // com.google.longrunning.f
        public String getName() {
            return ((e) this.f126038b).getName();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void dm() {
        this.name_ = em().getName();
    }

    public static e em() {
        return DEFAULT_INSTANCE;
    }

    public static b fm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b gm(e eVar) {
        return DEFAULT_INSTANCE.Uf(eVar);
    }

    public static e hm(InputStream inputStream) throws IOException {
        return (e) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static e im(InputStream inputStream, v0 v0Var) throws IOException {
        return (e) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static e jm(u uVar) throws t1 {
        return (e) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static e km(u uVar, v0 v0Var) throws t1 {
        return (e) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static e lm(z zVar) throws IOException {
        return (e) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static e mm(z zVar, v0 v0Var) throws IOException {
        return (e) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static e nm(InputStream inputStream) throws IOException {
        return (e) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static e om(InputStream inputStream, v0 v0Var) throws IOException {
        return (e) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static e pm(ByteBuffer byteBuffer) throws t1 {
        return (e) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e qm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (e) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static e rm(byte[] bArr) throws t1 {
        return (e) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static e sm(byte[] bArr, v0 v0Var) throws t1 {
        return (e) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<e> tm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.name_ = uVar.z0();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f125699a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new e();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
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

    @Override // com.google.longrunning.f
    public u a() {
        return u.C(this.name_);
    }

    @Override // com.google.longrunning.f
    public String getName() {
        return this.name_;
    }
}
