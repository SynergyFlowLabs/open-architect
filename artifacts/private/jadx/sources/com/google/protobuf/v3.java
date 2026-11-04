package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class v3 extends l1<v3, b> implements w3 {
    private static final v3 DEFAULT_INSTANCE;
    private static volatile f3<v3> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126429a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126429a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126429a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126429a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126429a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126429a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126429a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126429a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<v3, b> implements w3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((v3) this.f126038b).dm();
            return this;
        }

        public b Pl(String value) {
            El();
            ((v3) this.f126038b).vm(value);
            return this;
        }

        public b Ql(u value) {
            El();
            ((v3) this.f126038b).wm(value);
            return this;
        }

        @Override // com.google.protobuf.w3
        public u R1() {
            return ((v3) this.f126038b).R1();
        }

        @Override // com.google.protobuf.w3
        public String getValue() {
            return ((v3) this.f126038b).getValue();
        }

        private b() {
            super(v3.DEFAULT_INSTANCE);
        }
    }

    static {
        v3 v3Var = new v3();
        DEFAULT_INSTANCE = v3Var;
        l1.Wl(v3.class, v3Var);
    }

    private v3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dm() {
        this.value_ = em().getValue();
    }

    public static v3 em() {
        return DEFAULT_INSTANCE;
    }

    public static b fm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b gm(v3 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static v3 hm(String value) {
        return fm().Pl(value).build();
    }

    public static v3 im(InputStream input) throws IOException {
        return (v3) l1.El(DEFAULT_INSTANCE, input);
    }

    public static v3 jm(InputStream input, v0 extensionRegistry) throws IOException {
        return (v3) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v3 km(u data) throws t1 {
        return (v3) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static v3 lm(u data, v0 extensionRegistry) throws t1 {
        return (v3) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static v3 mm(z input) throws IOException {
        return (v3) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static v3 nm(z input, v0 extensionRegistry) throws IOException {
        return (v3) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v3 om(InputStream input) throws IOException {
        return (v3) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static v3 pm(InputStream input, v0 extensionRegistry) throws IOException {
        return (v3) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v3 qm(ByteBuffer data) throws t1 {
        return (v3) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static v3 rm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (v3) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static v3 sm(byte[] data) throws t1 {
        return (v3) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static v3 tm(byte[] data, v0 extensionRegistry) throws t1 {
        return (v3) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<v3> um() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm(String value) {
        value.getClass();
        this.value_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(u value) {
        com.google.protobuf.a.R(value);
        this.value_ = value.z0();
    }

    @Override // com.google.protobuf.w3
    public u R1() {
        return u.C(this.value_);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126429a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new v3();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<v3> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (v3.class) {
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

    @Override // com.google.protobuf.w3
    public String getValue() {
        return this.value_;
    }
}
