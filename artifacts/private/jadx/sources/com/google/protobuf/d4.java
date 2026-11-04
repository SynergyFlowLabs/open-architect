package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class d4 extends l1<d4, b> implements e4 {
    private static final d4 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile f3<d4> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125830a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125830a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125830a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125830a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125830a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125830a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125830a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125830a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<d4, b> implements e4 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.protobuf.e4
        public int D() {
            return ((d4) this.f126038b).D();
        }

        @Override // com.google.protobuf.e4
        public long I() {
            return ((d4) this.f126038b).I();
        }

        public b Ol() {
            El();
            ((d4) this.f126038b).em();
            return this;
        }

        public b Pl() {
            El();
            ((d4) this.f126038b).fm();
            return this;
        }

        public b Ql(int value) {
            El();
            ((d4) this.f126038b).wm(value);
            return this;
        }

        public b Rl(long value) {
            El();
            ((d4) this.f126038b).xm(value);
            return this;
        }

        private b() {
            super(d4.DEFAULT_INSTANCE);
        }
    }

    static {
        d4 d4Var = new d4();
        DEFAULT_INSTANCE = d4Var;
        l1.Wl(d4.class, d4Var);
    }

    private d4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void em() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fm() {
        this.seconds_ = 0L;
    }

    public static d4 gm() {
        return DEFAULT_INSTANCE;
    }

    public static b hm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b im(d4 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static d4 jm(InputStream input) throws IOException {
        return (d4) l1.El(DEFAULT_INSTANCE, input);
    }

    public static d4 km(InputStream input, v0 extensionRegistry) throws IOException {
        return (d4) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static d4 lm(u data) throws t1 {
        return (d4) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static d4 mm(u data, v0 extensionRegistry) throws t1 {
        return (d4) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static d4 nm(z input) throws IOException {
        return (d4) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static d4 om(z input, v0 extensionRegistry) throws IOException {
        return (d4) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static d4 pm(InputStream input) throws IOException {
        return (d4) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static d4 qm(InputStream input, v0 extensionRegistry) throws IOException {
        return (d4) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static d4 rm(ByteBuffer data) throws t1 {
        return (d4) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static d4 sm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (d4) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static d4 tm(byte[] data) throws t1 {
        return (d4) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static d4 um(byte[] data, v0 extensionRegistry) throws t1 {
        return (d4) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<d4> vm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(int value) {
        this.nanos_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(long value) {
        this.seconds_ = value;
    }

    @Override // com.google.protobuf.e4
    public int D() {
        return this.nanos_;
    }

    @Override // com.google.protobuf.e4
    public long I() {
        return this.seconds_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f125830a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new d4();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<d4> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (d4.class) {
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
}
