package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class l0 extends l1<l0, b> implements m0 {
    private static final l0 DEFAULT_INSTANCE;
    private static volatile f3<l0> PARSER;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126035a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126035a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126035a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126035a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126035a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126035a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126035a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126035a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<l0, b> implements m0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(l0.DEFAULT_INSTANCE);
        }
    }

    static {
        l0 l0Var = new l0();
        DEFAULT_INSTANCE = l0Var;
        l1.Wl(l0.class, l0Var);
    }

    private l0() {
    }

    public static l0 am() {
        return DEFAULT_INSTANCE;
    }

    public static b bm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b cm(l0 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static l0 dm(InputStream input) throws IOException {
        return (l0) l1.El(DEFAULT_INSTANCE, input);
    }

    public static l0 em(InputStream input, v0 extensionRegistry) throws IOException {
        return (l0) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static l0 fm(u data) throws t1 {
        return (l0) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static l0 gm(u data, v0 extensionRegistry) throws t1 {
        return (l0) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static l0 hm(z input) throws IOException {
        return (l0) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static l0 im(z input, v0 extensionRegistry) throws IOException {
        return (l0) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static l0 jm(InputStream input) throws IOException {
        return (l0) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static l0 km(InputStream input, v0 extensionRegistry) throws IOException {
        return (l0) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static l0 lm(ByteBuffer data) throws t1 {
        return (l0) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static l0 mm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (l0) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static l0 nm(byte[] data) throws t1 {
        return (l0) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static l0 om(byte[] data, v0 extensionRegistry) throws t1 {
        return (l0) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<l0> pm() {
        return DEFAULT_INSTANCE.W7();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126035a[method.ordinal()];
        a aVar = null;
        int i11 = 3 | 0;
        switch (i10) {
            case 1:
                return new l0();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<l0> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (l0.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new l1.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } finally {
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
