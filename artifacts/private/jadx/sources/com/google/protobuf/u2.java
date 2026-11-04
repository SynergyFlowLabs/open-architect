package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class u2 extends l1<u2, b> implements v2 {
    private static final u2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f3<u2> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126412a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126412a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126412a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126412a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126412a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126412a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126412a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126412a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<u2, b> implements v2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((u2) this.f126038b).gm();
            return this;
        }

        public b Pl() {
            El();
            ((u2) this.f126038b).hm();
            return this;
        }

        public b Ql(String value) {
            El();
            ((u2) this.f126038b).ym(value);
            return this;
        }

        public b Rl(u value) {
            El();
            ((u2) this.f126038b).zm(value);
            return this;
        }

        public b Sl(String value) {
            El();
            ((u2) this.f126038b).Am(value);
            return this;
        }

        public b Tl(u value) {
            El();
            ((u2) this.f126038b).Bm(value);
            return this;
        }

        @Override // com.google.protobuf.v2
        public u V1() {
            return ((u2) this.f126038b).V1();
        }

        @Override // com.google.protobuf.v2
        public u a() {
            return ((u2) this.f126038b).a();
        }

        @Override // com.google.protobuf.v2
        public String getName() {
            return ((u2) this.f126038b).getName();
        }

        @Override // com.google.protobuf.v2
        public String getRoot() {
            return ((u2) this.f126038b).getRoot();
        }

        private b() {
            super(u2.DEFAULT_INSTANCE);
        }
    }

    static {
        u2 u2Var = new u2();
        DEFAULT_INSTANCE = u2Var;
        l1.Wl(u2.class, u2Var);
    }

    private u2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(String value) {
        value.getClass();
        this.root_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(u value) {
        com.google.protobuf.a.R(value);
        this.root_ = value.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.name_ = im().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.root_ = im().getRoot();
    }

    public static u2 im() {
        return DEFAULT_INSTANCE;
    }

    public static b jm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b km(u2 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static u2 lm(InputStream input) throws IOException {
        return (u2) l1.El(DEFAULT_INSTANCE, input);
    }

    public static u2 mm(InputStream input, v0 extensionRegistry) throws IOException {
        return (u2) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static u2 nm(u data) throws t1 {
        return (u2) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static u2 om(u data, v0 extensionRegistry) throws t1 {
        return (u2) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static u2 pm(z input) throws IOException {
        return (u2) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static u2 qm(z input, v0 extensionRegistry) throws IOException {
        return (u2) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static u2 rm(InputStream input) throws IOException {
        return (u2) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static u2 sm(InputStream input, v0 extensionRegistry) throws IOException {
        return (u2) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static u2 tm(ByteBuffer data) throws t1 {
        return (u2) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static u2 um(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (u2) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static u2 vm(byte[] data) throws t1 {
        return (u2) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static u2 wm(byte[] data, v0 extensionRegistry) throws t1 {
        return (u2) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<u2> xm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(u value) {
        com.google.protobuf.a.R(value);
        this.name_ = value.z0();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126412a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new u2();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<u2> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (u2.class) {
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

    @Override // com.google.protobuf.v2
    public u V1() {
        return u.C(this.root_);
    }

    @Override // com.google.protobuf.v2
    public u a() {
        return u.C(this.name_);
    }

    @Override // com.google.protobuf.v2
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.v2
    public String getRoot() {
        return this.root_;
    }
}
