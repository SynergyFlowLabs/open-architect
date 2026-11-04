package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class p1 extends l1<p1, b> implements q1 {
    private static final p1 DEFAULT_INSTANCE;
    private static volatile f3<p1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126234a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126234a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126234a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126234a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126234a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126234a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126234a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126234a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<p1, b> implements q1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((p1) this.f126038b).cm();
            return this;
        }

        public b Pl(long value) {
            El();
            ((p1) this.f126038b).um(value);
            return this;
        }

        @Override // com.google.protobuf.q1
        public long getValue() {
            return ((p1) this.f126038b).getValue();
        }

        private b() {
            super(p1.DEFAULT_INSTANCE);
        }
    }

    static {
        p1 p1Var = new p1();
        DEFAULT_INSTANCE = p1Var;
        l1.Wl(p1.class, p1Var);
    }

    private p1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        this.value_ = 0L;
    }

    public static p1 dm() {
        return DEFAULT_INSTANCE;
    }

    public static b em() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b fm(p1 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static p1 gm(long value) {
        return em().Pl(value).build();
    }

    public static p1 hm(InputStream input) throws IOException {
        return (p1) l1.El(DEFAULT_INSTANCE, input);
    }

    public static p1 im(InputStream input, v0 extensionRegistry) throws IOException {
        return (p1) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static p1 jm(u data) throws t1 {
        return (p1) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static p1 km(u data, v0 extensionRegistry) throws t1 {
        return (p1) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static p1 lm(z input) throws IOException {
        return (p1) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static p1 mm(z input, v0 extensionRegistry) throws IOException {
        return (p1) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static p1 nm(InputStream input) throws IOException {
        return (p1) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static p1 om(InputStream input, v0 extensionRegistry) throws IOException {
        return (p1) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static p1 pm(ByteBuffer data) throws t1 {
        return (p1) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static p1 qm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (p1) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static p1 rm(byte[] data) throws t1 {
        return (p1) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static p1 sm(byte[] data, v0 extensionRegistry) throws t1 {
        return (p1) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<p1> tm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void um(long value) {
        this.value_ = value;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126234a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new p1();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<p1> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (p1.class) {
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

    @Override // com.google.protobuf.q1
    public long getValue() {
        return this.value_;
    }
}
