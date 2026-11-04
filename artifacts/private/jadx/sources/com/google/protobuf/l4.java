package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class l4 extends l1<l4, b> implements m4 {
    private static final l4 DEFAULT_INSTANCE;
    private static volatile f3<l4> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126071a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126071a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126071a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126071a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126071a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126071a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126071a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126071a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<l4, b> implements m4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((l4) this.f126038b).cm();
            return this;
        }

        public b Pl(long value) {
            El();
            ((l4) this.f126038b).um(value);
            return this;
        }

        @Override // com.google.protobuf.m4
        public long getValue() {
            return ((l4) this.f126038b).getValue();
        }

        private b() {
            super(l4.DEFAULT_INSTANCE);
        }
    }

    static {
        l4 l4Var = new l4();
        DEFAULT_INSTANCE = l4Var;
        l1.Wl(l4.class, l4Var);
    }

    private l4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        this.value_ = 0L;
    }

    public static l4 dm() {
        return DEFAULT_INSTANCE;
    }

    public static b em() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b fm(l4 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static l4 gm(long value) {
        return em().Pl(value).build();
    }

    public static l4 hm(InputStream input) throws IOException {
        return (l4) l1.El(DEFAULT_INSTANCE, input);
    }

    public static l4 im(InputStream input, v0 extensionRegistry) throws IOException {
        return (l4) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static l4 jm(u data) throws t1 {
        return (l4) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static l4 km(u data, v0 extensionRegistry) throws t1 {
        return (l4) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static l4 lm(z input) throws IOException {
        return (l4) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static l4 mm(z input, v0 extensionRegistry) throws IOException {
        return (l4) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static l4 nm(InputStream input) throws IOException {
        return (l4) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static l4 om(InputStream input, v0 extensionRegistry) throws IOException {
        return (l4) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static l4 pm(ByteBuffer data) throws t1 {
        return (l4) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static l4 qm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (l4) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static l4 rm(byte[] data) throws t1 {
        return (l4) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static l4 sm(byte[] data, v0 extensionRegistry) throws t1 {
        return (l4) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<l4> tm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(long value) {
        this.value_ = value;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126071a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new l4();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<l4> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (l4.class) {
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

    @Override // com.google.protobuf.m4
    public long getValue() {
        return this.value_;
    }
}
