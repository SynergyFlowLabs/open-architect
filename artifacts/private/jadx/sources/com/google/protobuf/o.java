package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends l1<o, b> implements p {
    private static final o DEFAULT_INSTANCE;
    private static volatile f3<o> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126230a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126230a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126230a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126230a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126230a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126230a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126230a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126230a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<o, b> implements p {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((o) this.f126038b).cm();
            return this;
        }

        public b Pl(boolean value) {
            El();
            ((o) this.f126038b).um(value);
            return this;
        }

        @Override // com.google.protobuf.p
        public boolean getValue() {
            return ((o) this.f126038b).getValue();
        }

        private b() {
            super(o.DEFAULT_INSTANCE);
        }
    }

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        l1.Wl(o.class, oVar);
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        this.value_ = false;
    }

    public static o dm() {
        return DEFAULT_INSTANCE;
    }

    public static b em() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b fm(o prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static o gm(boolean value) {
        return em().Pl(value).build();
    }

    public static o hm(InputStream input) throws IOException {
        return (o) l1.El(DEFAULT_INSTANCE, input);
    }

    public static o im(InputStream input, v0 extensionRegistry) throws IOException {
        return (o) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o jm(u data) throws t1 {
        return (o) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static o km(u data, v0 extensionRegistry) throws t1 {
        return (o) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static o lm(z input) throws IOException {
        return (o) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static o mm(z input, v0 extensionRegistry) throws IOException {
        return (o) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o nm(InputStream input) throws IOException {
        return (o) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static o om(InputStream input, v0 extensionRegistry) throws IOException {
        return (o) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o pm(ByteBuffer data) throws t1 {
        return (o) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static o qm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (o) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static o rm(byte[] data) throws t1 {
        return (o) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static o sm(byte[] data, v0 extensionRegistry) throws t1 {
        return (o) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<o> tm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(boolean value) {
        this.value_ = value;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126230a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new o();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<o> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (o.class) {
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

    @Override // com.google.protobuf.p
    public boolean getValue() {
        return this.value_;
    }
}
