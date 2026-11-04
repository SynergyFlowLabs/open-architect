package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class b1 extends l1<b1, b> implements c1 {
    private static final b1 DEFAULT_INSTANCE;
    private static volatile f3<b1> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private s1.k<String> paths_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125792a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125792a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125792a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125792a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125792a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125792a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125792a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125792a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<b1, b> implements c1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.protobuf.c1
        public String C4(int index) {
            return ((b1) this.f126038b).C4(index);
        }

        @Override // com.google.protobuf.c1
        public u M2(int index) {
            return ((b1) this.f126038b).M2(index);
        }

        public b Ol(Iterable<String> values) {
            El();
            ((b1) this.f126038b).fm(values);
            return this;
        }

        public b Pl(String value) {
            El();
            ((b1) this.f126038b).gm(value);
            return this;
        }

        public b Ql(u value) {
            El();
            ((b1) this.f126038b).hm(value);
            return this;
        }

        public b Rl() {
            El();
            ((b1) this.f126038b).im();
            return this;
        }

        public b Sl(int index, String value) {
            El();
            ((b1) this.f126038b).Am(index, value);
            return this;
        }

        @Override // com.google.protobuf.c1
        public List<String> i5() {
            return Collections.unmodifiableList(((b1) this.f126038b).i5());
        }

        @Override // com.google.protobuf.c1
        public int m5() {
            return ((b1) this.f126038b).m5();
        }

        private b() {
            super(b1.DEFAULT_INSTANCE);
        }
    }

    static {
        b1 b1Var = new b1();
        DEFAULT_INSTANCE = b1Var;
        l1.Wl(b1.class, b1Var);
    }

    private b1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(int index, String value) {
        value.getClass();
        jm();
        this.paths_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fm(Iterable<String> values) {
        jm();
        com.google.protobuf.a.y(values, this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(String value) {
        value.getClass();
        jm();
        this.paths_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm(u value) {
        com.google.protobuf.a.R(value);
        jm();
        this.paths_.add(value.z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im() {
        this.paths_ = l1.Ij();
    }

    private void jm() {
        s1.k<String> kVar = this.paths_;
        if (kVar.s1()) {
            return;
        }
        this.paths_ = l1.yl(kVar);
    }

    public static b1 km() {
        return DEFAULT_INSTANCE;
    }

    public static b lm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b mm(b1 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static b1 nm(InputStream input) throws IOException {
        return (b1) l1.El(DEFAULT_INSTANCE, input);
    }

    public static b1 om(InputStream input, v0 extensionRegistry) throws IOException {
        return (b1) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static b1 pm(u data) throws t1 {
        return (b1) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static b1 qm(u data, v0 extensionRegistry) throws t1 {
        return (b1) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static b1 rm(z input) throws IOException {
        return (b1) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static b1 sm(z input, v0 extensionRegistry) throws IOException {
        return (b1) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static b1 tm(InputStream input) throws IOException {
        return (b1) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static b1 um(InputStream input, v0 extensionRegistry) throws IOException {
        return (b1) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static b1 vm(ByteBuffer data) throws t1 {
        return (b1) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static b1 wm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (b1) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static b1 xm(byte[] data) throws t1 {
        return (b1) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static b1 ym(byte[] data, v0 extensionRegistry) throws t1 {
        return (b1) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<b1> zm() {
        return DEFAULT_INSTANCE.W7();
    }

    @Override // com.google.protobuf.c1
    public String C4(int index) {
        return this.paths_.get(index);
    }

    @Override // com.google.protobuf.c1
    public u M2(int index) {
        return u.C(this.paths_.get(index));
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f125792a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new b1();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<b1> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (b1.class) {
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

    @Override // com.google.protobuf.c1
    public List<String> i5() {
        return this.paths_;
    }

    @Override // com.google.protobuf.c1
    public int m5() {
        return this.paths_.size();
    }
}
