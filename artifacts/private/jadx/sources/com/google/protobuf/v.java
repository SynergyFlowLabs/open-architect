package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends l1<v, b> implements w {
    private static final v DEFAULT_INSTANCE;
    private static volatile f3<v> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private u value_ = u.f126379f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126419a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126419a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126419a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126419a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126419a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126419a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126419a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126419a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<v, b> implements w {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((v) this.f126038b).cm();
            return this;
        }

        public b Pl(u value) {
            El();
            ((v) this.f126038b).um(value);
            return this;
        }

        @Override // com.google.protobuf.w
        public u getValue() {
            return ((v) this.f126038b).getValue();
        }

        private b() {
            super(v.DEFAULT_INSTANCE);
        }
    }

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        l1.Wl(v.class, vVar);
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        this.value_ = dm().getValue();
    }

    public static v dm() {
        return DEFAULT_INSTANCE;
    }

    public static b em() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b fm(v prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static v gm(u value) {
        return em().Pl(value).build();
    }

    public static v hm(InputStream input) throws IOException {
        return (v) l1.El(DEFAULT_INSTANCE, input);
    }

    public static v im(InputStream input, v0 extensionRegistry) throws IOException {
        return (v) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v jm(u data) throws t1 {
        return (v) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static v km(u data, v0 extensionRegistry) throws t1 {
        return (v) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static v lm(z input) throws IOException {
        return (v) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static v mm(z input, v0 extensionRegistry) throws IOException {
        return (v) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v nm(InputStream input) throws IOException {
        return (v) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static v om(InputStream input, v0 extensionRegistry) throws IOException {
        return (v) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static v pm(ByteBuffer data) throws t1 {
        return (v) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static v qm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (v) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static v rm(byte[] data) throws t1 {
        return (v) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static v sm(byte[] data, v0 extensionRegistry) throws t1 {
        return (v) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<v> tm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(u value) {
        value.getClass();
        this.value_ = value;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126419a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new v();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<v> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (v.class) {
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

    @Override // com.google.protobuf.w
    public u getValue() {
        return this.value_;
    }
}
