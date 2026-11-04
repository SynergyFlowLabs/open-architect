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
public final class a extends l1<a, b> implements com.google.longrunning.b {
    private static final a DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f3<a> PARSER;
    private String name_ = "";

    /* JADX INFO: renamed from: com.google.longrunning.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1211a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125697a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125697a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125697a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125697a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125697a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125697a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125697a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125697a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<a, b> implements com.google.longrunning.b {
        /* synthetic */ b(C1211a c1211a) {
            this();
        }

        public b Ol() {
            El();
            ((a) this.f126038b).dm();
            return this;
        }

        public b Pl(String str) {
            El();
            ((a) this.f126038b).um(str);
            return this;
        }

        public b Ql(u uVar) {
            El();
            ((a) this.f126038b).vm(uVar);
            return this;
        }

        @Override // com.google.longrunning.b
        public u a() {
            return ((a) this.f126038b).a();
        }

        @Override // com.google.longrunning.b
        public String getName() {
            return ((a) this.f126038b).getName();
        }

        private b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        l1.Wl(a.class, aVar);
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dm() {
        this.name_ = em().getName();
    }

    public static a em() {
        return DEFAULT_INSTANCE;
    }

    public static b fm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b gm(a aVar) {
        return DEFAULT_INSTANCE.Uf(aVar);
    }

    public static a hm(InputStream inputStream) throws IOException {
        return (a) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static a im(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a jm(u uVar) throws t1 {
        return (a) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static a km(u uVar, v0 v0Var) throws t1 {
        return (a) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static a lm(z zVar) throws IOException {
        return (a) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static a mm(z zVar, v0 v0Var) throws IOException {
        return (a) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static a nm(InputStream inputStream) throws IOException {
        return (a) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static a om(InputStream inputStream, v0 v0Var) throws IOException {
        return (a) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static a pm(ByteBuffer byteBuffer) throws t1 {
        return (a) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static a qm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (a) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static a rm(byte[] bArr) throws t1 {
        return (a) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static a sm(byte[] bArr, v0 v0Var) throws t1 {
        return (a) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<a> tm() {
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
        int i10 = C1211a.f125697a[iVar.ordinal()];
        C1211a c1211a = null;
        switch (i10) {
            case 1:
                return new a();
            case 2:
                return new b(c1211a);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<a> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (a.class) {
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

    @Override // com.google.longrunning.b
    public u a() {
        return u.C(this.name_);
    }

    @Override // com.google.longrunning.b
    public String getName() {
        return this.name_;
    }
}
