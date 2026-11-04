package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class c2 extends l1<c2, b> implements d2 {
    private static final c2 DEFAULT_INSTANCE;
    private static volatile f3<c2> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private s1.k<v4> values_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125818a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125818a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125818a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125818a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125818a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125818a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125818a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125818a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<c2, b> implements d2 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol(Iterable<? extends v4> values) {
            El();
            ((c2) this.f126038b).gm(values);
            return this;
        }

        public b Pl(int index, v4.b builderForValue) {
            El();
            ((c2) this.f126038b).hm(index, builderForValue.build());
            return this;
        }

        public b Ql(int index, v4 value) {
            El();
            ((c2) this.f126038b).hm(index, value);
            return this;
        }

        public b Rl(v4.b builderForValue) {
            El();
            ((c2) this.f126038b).im(builderForValue.build());
            return this;
        }

        @Override // com.google.protobuf.d2
        public v4 S7(int index) {
            return ((c2) this.f126038b).S7(index);
        }

        public b Sl(v4 value) {
            El();
            ((c2) this.f126038b).im(value);
            return this;
        }

        public b Tl() {
            El();
            ((c2) this.f126038b).jm();
            return this;
        }

        public b Ul(int index) {
            El();
            ((c2) this.f126038b).Dm(index);
            return this;
        }

        public b Vl(int index, v4.b builderForValue) {
            El();
            ((c2) this.f126038b).Em(index, builderForValue.build());
            return this;
        }

        public b Wl(int index, v4 value) {
            El();
            ((c2) this.f126038b).Em(index, value);
            return this;
        }

        @Override // com.google.protobuf.d2
        public int b1() {
            return ((c2) this.f126038b).b1();
        }

        @Override // com.google.protobuf.d2
        public List<v4> z7() {
            return Collections.unmodifiableList(((c2) this.f126038b).z7());
        }

        private b() {
            super(c2.DEFAULT_INSTANCE);
        }
    }

    static {
        c2 c2Var = new c2();
        DEFAULT_INSTANCE = c2Var;
        l1.Wl(c2.class, c2Var);
    }

    private c2() {
    }

    public static c2 Am(byte[] data) throws t1 {
        return (c2) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static c2 Bm(byte[] data, v0 extensionRegistry) throws t1 {
        return (c2) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<c2> Cm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(int index) {
        km();
        this.values_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(int index, v4 value) {
        value.getClass();
        km();
        this.values_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(Iterable<? extends v4> values) {
        km();
        com.google.protobuf.a.y(values, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm(int index, v4 value) {
        value.getClass();
        km();
        this.values_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im(v4 value) {
        value.getClass();
        km();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.values_ = l1.Ij();
    }

    private void km() {
        s1.k<v4> kVar = this.values_;
        if (kVar.s1()) {
            return;
        }
        this.values_ = l1.yl(kVar);
    }

    public static c2 lm() {
        return DEFAULT_INSTANCE;
    }

    public static b om() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b pm(c2 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static c2 qm(InputStream input) throws IOException {
        return (c2) l1.El(DEFAULT_INSTANCE, input);
    }

    public static c2 rm(InputStream input, v0 extensionRegistry) throws IOException {
        return (c2) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static c2 sm(u data) throws t1 {
        return (c2) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static c2 tm(u data, v0 extensionRegistry) throws t1 {
        return (c2) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static c2 um(z input) throws IOException {
        return (c2) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static c2 vm(z input, v0 extensionRegistry) throws IOException {
        return (c2) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static c2 wm(InputStream input) throws IOException {
        return (c2) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static c2 xm(InputStream input, v0 extensionRegistry) throws IOException {
        return (c2) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static c2 ym(ByteBuffer data) throws t1 {
        return (c2) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static c2 zm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (c2) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f125818a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new c2();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", v4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<c2> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (c2.class) {
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

    @Override // com.google.protobuf.d2
    public v4 S7(int index) {
        return this.values_.get(index);
    }

    @Override // com.google.protobuf.d2
    public int b1() {
        return this.values_.size();
    }

    public w4 mm(int index) {
        return this.values_.get(index);
    }

    public List<? extends w4> nm() {
        return this.values_;
    }

    @Override // com.google.protobuf.d2
    public List<v4> z7() {
        return this.values_;
    }
}
