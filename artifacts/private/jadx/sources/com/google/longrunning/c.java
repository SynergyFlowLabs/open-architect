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
public final class c extends l1<c, b> implements d {
    private static final c DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f3<c> PARSER;
    private String name_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125698a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125698a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125698a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125698a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125698a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125698a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125698a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125698a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<c, b> implements d {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((c) this.f126038b).dm();
            return this;
        }

        public b Pl(String str) {
            El();
            ((c) this.f126038b).um(str);
            return this;
        }

        public b Ql(u uVar) {
            El();
            ((c) this.f126038b).vm(uVar);
            return this;
        }

        @Override // com.google.longrunning.d
        public u a() {
            return ((c) this.f126038b).a();
        }

        @Override // com.google.longrunning.d
        public String getName() {
            return ((c) this.f126038b).getName();
        }

        private b() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        l1.Wl(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dm() {
        this.name_ = em().getName();
    }

    public static c em() {
        return DEFAULT_INSTANCE;
    }

    public static b fm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b gm(c cVar) {
        return DEFAULT_INSTANCE.Uf(cVar);
    }

    public static c hm(InputStream inputStream) throws IOException {
        return (c) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static c im(InputStream inputStream, v0 v0Var) throws IOException {
        return (c) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static c jm(u uVar) throws t1 {
        return (c) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static c km(u uVar, v0 v0Var) throws t1 {
        return (c) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static c lm(z zVar) throws IOException {
        return (c) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static c mm(z zVar, v0 v0Var) throws IOException {
        return (c) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static c nm(InputStream inputStream) throws IOException {
        return (c) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static c om(InputStream inputStream, v0 v0Var) throws IOException {
        return (c) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static c pm(ByteBuffer byteBuffer) throws t1 {
        return (c) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c qm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (c) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static c rm(byte[] bArr) throws t1 {
        return (c) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static c sm(byte[] bArr, v0 v0Var) throws t1 {
        return (c) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<c> tm() {
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
        int i10 = a.f125698a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new c();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<c> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (c.class) {
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

    @Override // com.google.longrunning.d
    public u a() {
        return u.C(this.name_);
    }

    @Override // com.google.longrunning.d
    public String getName() {
        return this.name_;
    }
}
