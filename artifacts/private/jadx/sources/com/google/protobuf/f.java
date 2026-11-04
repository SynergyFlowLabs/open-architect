package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends l1<f, b> implements g {
    private static final f DEFAULT_INSTANCE;
    private static volatile f3<f> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private u value_ = u.f126379f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125924a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125924a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125924a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125924a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125924a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125924a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125924a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125924a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<f, b> implements g {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((f) this.f126038b).fm();
            return this;
        }

        public b Pl() {
            El();
            ((f) this.f126038b).gm();
            return this;
        }

        public b Ql(String value) {
            El();
            ((f) this.f126038b).xm(value);
            return this;
        }

        public b Rl(u value) {
            El();
            ((f) this.f126038b).ym(value);
            return this;
        }

        public b Sl(u value) {
            El();
            ((f) this.f126038b).zm(value);
            return this;
        }

        @Override // com.google.protobuf.g
        public u getValue() {
            return ((f) this.f126038b).getValue();
        }

        @Override // com.google.protobuf.g
        public u j0() {
            return ((f) this.f126038b).j0();
        }

        @Override // com.google.protobuf.g
        public String l0() {
            return ((f) this.f126038b).l0();
        }

        private b() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        l1.Wl(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fm() {
        this.typeUrl_ = hm().l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.value_ = hm().getValue();
    }

    public static f hm() {
        return DEFAULT_INSTANCE;
    }

    public static b im() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b jm(f prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static f km(InputStream input) throws IOException {
        return (f) l1.El(DEFAULT_INSTANCE, input);
    }

    public static f lm(InputStream input, v0 extensionRegistry) throws IOException {
        return (f) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f mm(u data) throws t1 {
        return (f) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static f nm(u data, v0 extensionRegistry) throws t1 {
        return (f) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f om(z input) throws IOException {
        return (f) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static f pm(z input, v0 extensionRegistry) throws IOException {
        return (f) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f qm(InputStream input) throws IOException {
        return (f) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static f rm(InputStream input, v0 extensionRegistry) throws IOException {
        return (f) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f sm(ByteBuffer data) throws t1 {
        return (f) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static f tm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (f) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f um(byte[] data) throws t1 {
        return (f) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static f vm(byte[] data, v0 extensionRegistry) throws t1 {
        return (f) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<f> wm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(String value) {
        value.getClass();
        this.typeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(u value) {
        com.google.protobuf.a.R(value);
        this.typeUrl_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(u value) {
        value.getClass();
        this.value_ = value;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f125924a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new f();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<f> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (f.class) {
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

    @Override // com.google.protobuf.g
    public u getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.g
    public u j0() {
        return u.C(this.typeUrl_);
    }

    @Override // com.google.protobuf.g
    public String l0() {
        return this.typeUrl_;
    }
}
