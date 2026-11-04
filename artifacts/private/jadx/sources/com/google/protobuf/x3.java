package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class x3 extends l1<x3, b> implements y3 {
    private static final x3 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile f3<x3> PARSER;
    private h2<String, v4> fields_ = h2.f();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126459a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126459a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126459a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126459a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126459a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126459a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126459a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126459a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<x3, b> implements y3 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.protobuf.y3
        @Deprecated
        public Map<String, v4> H5() {
            return P3();
        }

        @Override // com.google.protobuf.y3
        public v4 K4(String key) {
            key.getClass();
            Map<String, v4> mapP3 = ((x3) this.f126038b).P3();
            if (mapP3.containsKey(key)) {
                return mapP3.get(key);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.protobuf.y3
        public boolean L6(String key) {
            key.getClass();
            return ((x3) this.f126038b).P3().containsKey(key);
        }

        public b Ol() {
            El();
            ((x3) this.f126038b).cm().clear();
            return this;
        }

        @Override // com.google.protobuf.y3
        public Map<String, v4> P3() {
            return Collections.unmodifiableMap(((x3) this.f126038b).P3());
        }

        public b Pl(Map<String, v4> values) {
            El();
            ((x3) this.f126038b).cm().putAll(values);
            return this;
        }

        public b Ql(String key, v4 value) {
            key.getClass();
            value.getClass();
            El();
            ((x3) this.f126038b).cm().put(key, value);
            return this;
        }

        public b Rl(String key) {
            key.getClass();
            El();
            ((x3) this.f126038b).cm().remove(key);
            return this;
        }

        @Override // com.google.protobuf.y3
        public v4 ad(String key, v4 defaultValue) {
            key.getClass();
            Map<String, v4> mapP3 = ((x3) this.f126038b).P3();
            return mapP3.containsKey(key) ? mapP3.get(key) : defaultValue;
        }

        @Override // com.google.protobuf.y3
        public int d0() {
            return ((x3) this.f126038b).P3().size();
        }

        private b() {
            super(x3.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g2<String, v4> f126460a = g2.f(x4.b.f126490k, "", x4.b.f126492m, v4.ym());

        private c() {
        }
    }

    static {
        x3 x3Var = new x3();
        DEFAULT_INSTANCE = x3Var;
        l1.Wl(x3.class, x3Var);
    }

    private x3() {
    }

    public static x3 bm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, v4> cm() {
        return em();
    }

    private h2<String, v4> dm() {
        return this.fields_;
    }

    private h2<String, v4> em() {
        if (!this.fields_.j()) {
            this.fields_ = this.fields_.n();
        }
        return this.fields_;
    }

    public static b fm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b gm(x3 prototype) {
        return DEFAULT_INSTANCE.Uf(prototype);
    }

    public static x3 hm(InputStream input) throws IOException {
        return (x3) l1.El(DEFAULT_INSTANCE, input);
    }

    public static x3 im(InputStream input, v0 extensionRegistry) throws IOException {
        return (x3) l1.Fl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static x3 jm(u data) throws t1 {
        return (x3) l1.Gl(DEFAULT_INSTANCE, data);
    }

    public static x3 km(u data, v0 extensionRegistry) throws t1 {
        return (x3) l1.Hl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static x3 lm(z input) throws IOException {
        return (x3) l1.Il(DEFAULT_INSTANCE, input);
    }

    public static x3 mm(z input, v0 extensionRegistry) throws IOException {
        return (x3) l1.Jl(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static x3 nm(InputStream input) throws IOException {
        return (x3) l1.Kl(DEFAULT_INSTANCE, input);
    }

    public static x3 om(InputStream input, v0 extensionRegistry) throws IOException {
        return (x3) l1.Ll(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static x3 pm(ByteBuffer data) throws t1 {
        return (x3) l1.Ml(DEFAULT_INSTANCE, data);
    }

    public static x3 qm(ByteBuffer data, v0 extensionRegistry) throws t1 {
        return (x3) l1.Nl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static x3 rm(byte[] data) throws t1 {
        return (x3) l1.Ol(DEFAULT_INSTANCE, data);
    }

    public static x3 sm(byte[] data, v0 extensionRegistry) throws t1 {
        return (x3) l1.Pl(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f3<x3> tm() {
        return DEFAULT_INSTANCE.W7();
    }

    @Override // com.google.protobuf.y3
    @Deprecated
    public Map<String, v4> H5() {
        return P3();
    }

    @Override // com.google.protobuf.y3
    public v4 K4(String key) {
        key.getClass();
        h2<String, v4> h2VarDm = dm();
        if (h2VarDm.containsKey(key)) {
            return h2VarDm.get(key);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.y3
    public boolean L6(String key) {
        key.getClass();
        return dm().containsKey(key);
    }

    @Override // com.google.protobuf.y3
    public Map<String, v4> P3() {
        return Collections.unmodifiableMap(dm());
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i method, Object arg0, Object arg1) {
        f3 cVar;
        int i10 = a.f126459a[method.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new x3();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.f126460a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<x3> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (x3.class) {
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

    @Override // com.google.protobuf.y3
    public v4 ad(String key, v4 defaultValue) {
        key.getClass();
        h2<String, v4> h2VarDm = dm();
        return h2VarDm.containsKey(key) ? h2VarDm.get(key) : defaultValue;
    }

    @Override // com.google.protobuf.y3
    public int d0() {
        return dm().size();
    }
}
