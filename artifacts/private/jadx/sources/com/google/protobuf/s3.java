package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class s3 extends l1<s3, b> implements t3 {
    private static final s3 DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile f3<s3> PARSER;
    private String fileName_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126343a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126343a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126343a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126343a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126343a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126343a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126343a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126343a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<s3, b> implements t3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((s3) this.f126038b).dm();
            return this;
        }

        public b Pl(String value) {
            El();
            ((s3) this.f126038b).um(value);
            return this;
        }

        public b Ql(u value) {
            El();
            ((s3) this.f126038b).vm(value);
            return this;
        }

        @Override // com.google.protobuf.t3
        public u e4() {
            return ((s3) this.f126038b).e4();
        }

        @Override // com.google.protobuf.t3
        public String getFileName() {
            return ((s3) this.f126038b).getFileName();
        }

        private b() {
            super(s3.DEFAULT_INSTANCE);
        }
    }

    static {
        s3 s3Var = new s3();
        DEFAULT_INSTANCE = s3Var;
        l1.Wl(s3.class, s3Var);
    }

    private s3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dm() {
        this.fileName_ = em().getFileName();
    }

    public static s3 em() {
        return DEFAULT_INSTANCE;
    }

    public static b fm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b gm(s3 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static s3 hm(InputStream input) throws IOException {
        return (s3) l1.El(DEFAULT_INSTANCE, input);
    }

    public static s3 im(InputStream input, v0 extensionRegistry) throws IOException {
        return (s3) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static s3 jm(u data) throws t1 {
        return (s3) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static s3 km(u data, v0 extensionRegistry) throws t1 {
        return (s3) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static s3 lm(z input) throws IOException {
        return (s3) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static s3 mm(z input, v0 extensionRegistry) throws IOException {
        return (s3) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static s3 nm(InputStream input) throws IOException {
        return (s3) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static s3 om(InputStream input, v0 extensionRegistry) throws IOException {
        return (s3) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static s3 pm(ByteBuffer data) throws t1 {
        return (s3) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static s3 qm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (s3) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static s3 rm(byte[] data) throws t1 {
        return (s3) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static s3 sm(byte[] data, v0 extensionRegistry) throws t1 {
        return (s3) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<s3> tm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(String value) {
        value.getClass();
        this.fileName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(u value) {
        com.google.protobuf.a.R(value);
        this.fileName_ = value.z0();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126343a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new s3();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<s3> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (s3.class) {
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

    @Override // com.google.protobuf.t3
    public u e4() {
        return u.C(this.fileName_);
    }

    @Override // com.google.protobuf.t3
    public String getFileName() {
        return this.fileName_;
    }
}
