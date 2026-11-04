package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class n1 extends l1<n1, b> implements o1 {
    private static final n1 DEFAULT_INSTANCE;
    private static volatile f3<n1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126113a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126113a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126113a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int i10 = 6 | 3;
                f126113a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126113a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126113a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126113a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126113a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<n1, b> implements o1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((n1) this.f126038b).cm();
            return this;
        }

        public b Pl(int value) {
            El();
            ((n1) this.f126038b).um(value);
            return this;
        }

        @Override // com.google.protobuf.o1
        public int getValue() {
            return ((n1) this.f126038b).getValue();
        }

        private b() {
            super(n1.DEFAULT_INSTANCE);
        }
    }

    static {
        n1 n1Var = new n1();
        DEFAULT_INSTANCE = n1Var;
        l1.Wl(n1.class, n1Var);
    }

    private n1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        this.value_ = 0;
    }

    public static n1 dm() {
        return DEFAULT_INSTANCE;
    }

    public static b em() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b fm(n1 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static n1 gm(int value) {
        return em().Pl(value).build();
    }

    public static n1 hm(InputStream input) throws IOException {
        return (n1) l1.El(DEFAULT_INSTANCE, input);
    }

    public static n1 im(InputStream input, v0 extensionRegistry) throws IOException {
        return (n1) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static n1 jm(u data) throws t1 {
        return (n1) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static n1 km(u data, v0 extensionRegistry) throws t1 {
        return (n1) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static n1 lm(z input) throws IOException {
        return (n1) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static n1 mm(z input, v0 extensionRegistry) throws IOException {
        return (n1) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static n1 nm(InputStream input) throws IOException {
        return (n1) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static n1 om(InputStream input, v0 extensionRegistry) throws IOException {
        return (n1) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static n1 pm(ByteBuffer data) throws t1 {
        return (n1) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static n1 qm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (n1) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static n1 rm(byte[] data) throws t1 {
        return (n1) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static n1 sm(byte[] data, v0 extensionRegistry) throws t1 {
        return (n1) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<n1> tm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(int value) {
        this.value_ = value;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126113a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new n1();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<n1> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (n1.class) {
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

    @Override // com.google.protobuf.o1
    public int getValue() {
        return this.value_;
    }
}
