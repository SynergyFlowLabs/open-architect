package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 extends l1<i0, b> implements j0 {
    private static final i0 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile f3<i0> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126015a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126015a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126015a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126015a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126015a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126015a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126015a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126015a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<i0, b> implements j0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.protobuf.j0
        public int D() {
            return ((i0) this.f126038b).D();
        }

        @Override // com.google.protobuf.j0
        public long I() {
            return ((i0) this.f126038b).I();
        }

        public b Ol() {
            El();
            ((i0) this.f126038b).em();
            return this;
        }

        public b Pl() {
            El();
            ((i0) this.f126038b).fm();
            return this;
        }

        public b Ql(int value) {
            El();
            ((i0) this.f126038b).wm(value);
            return this;
        }

        public b Rl(long value) {
            El();
            ((i0) this.f126038b).xm(value);
            return this;
        }

        private b() {
            super(i0.DEFAULT_INSTANCE);
        }
    }

    static {
        i0 i0Var = new i0();
        DEFAULT_INSTANCE = i0Var;
        l1.Wl(i0.class, i0Var);
    }

    private i0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void em() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fm() {
        this.seconds_ = 0L;
    }

    public static i0 gm() {
        return DEFAULT_INSTANCE;
    }

    public static b hm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b im(i0 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static i0 jm(InputStream input) throws IOException {
        return (i0) l1.El(DEFAULT_INSTANCE, input);
    }

    public static i0 km(InputStream input, v0 extensionRegistry) throws IOException {
        return (i0) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static i0 lm(u data) throws t1 {
        return (i0) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static i0 mm(u data, v0 extensionRegistry) throws t1 {
        return (i0) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static i0 nm(z input) throws IOException {
        return (i0) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static i0 om(z input, v0 extensionRegistry) throws IOException {
        return (i0) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static i0 pm(InputStream input) throws IOException {
        return (i0) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static i0 qm(InputStream input, v0 extensionRegistry) throws IOException {
        return (i0) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static i0 rm(ByteBuffer data) throws t1 {
        return (i0) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static i0 sm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (i0) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static i0 tm(byte[] data) throws t1 {
        return (i0) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static i0 um(byte[] data, v0 extensionRegistry) throws t1 {
        return (i0) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<i0> vm() {
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

    @Override // com.google.protobuf.j0
    public int D() {
        return this.nanos_;
    }

    @Override // com.google.protobuf.j0
    public long I() {
        return this.seconds_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126015a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new i0();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<i0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (i0.class) {
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
