package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class j4 extends l1<j4, b> implements k4 {
    private static final j4 DEFAULT_INSTANCE;
    private static volatile f3<j4> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126023a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126023a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126023a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126023a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126023a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126023a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126023a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126023a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<j4, b> implements k4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((j4) this.f126038b).cm();
            return this;
        }

        public b Pl(int value) {
            El();
            ((j4) this.f126038b).um(value);
            return this;
        }

        @Override // com.google.protobuf.k4
        public int getValue() {
            return ((j4) this.f126038b).getValue();
        }

        private b() {
            super(j4.DEFAULT_INSTANCE);
        }
    }

    static {
        j4 j4Var = new j4();
        DEFAULT_INSTANCE = j4Var;
        l1.Wl(j4.class, j4Var);
    }

    private j4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        this.value_ = 0;
    }

    public static j4 dm() {
        return DEFAULT_INSTANCE;
    }

    public static b em() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b fm(j4 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static j4 gm(int value) {
        return em().Pl(value).build();
    }

    public static j4 hm(InputStream input) throws IOException {
        return (j4) l1.El(DEFAULT_INSTANCE, input);
    }

    public static j4 im(InputStream input, v0 extensionRegistry) throws IOException {
        return (j4) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static j4 jm(u data) throws t1 {
        return (j4) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static j4 km(u data, v0 extensionRegistry) throws t1 {
        return (j4) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static j4 lm(z input) throws IOException {
        return (j4) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static j4 mm(z input, v0 extensionRegistry) throws IOException {
        return (j4) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static j4 nm(InputStream input) throws IOException {
        return (j4) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static j4 om(InputStream input, v0 extensionRegistry) throws IOException {
        return (j4) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static j4 pm(ByteBuffer data) throws t1 {
        return (j4) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static j4 qm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (j4) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static j4 rm(byte[] data) throws t1 {
        return (j4) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static j4 sm(byte[] data, v0 extensionRegistry) throws t1 {
        return (j4) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<j4> tm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(int value) {
        this.value_ = value;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126023a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new j4();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<j4> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (j4.class) {
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

    @Override // com.google.protobuf.k4
    public int getValue() {
        return this.value_;
    }
}
