package com.google.vr.sdk.deps;

import com.canhub.cropper.core.CropImage;
import com.devtodev.core.data.consts.RequestParams;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public class e3 {

    public static final class a extends i3<a, m> implements v4 {

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        private static final a f127785t3;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        private static volatile c5<a> f127786u3;
        private g0 H1;
        private q X;
        private h Y;
        private p Z;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f127787f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f127788g;

        /* JADX INFO: renamed from: g3, reason: collision with root package name */
        private c f127789g3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private a0 f127790h;

        /* JADX INFO: renamed from: h3, reason: collision with root package name */
        private e0 f127791h3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private a2.b f127792i;

        /* JADX INFO: renamed from: i3, reason: collision with root package name */
        private i f127793i3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private C1238a f127794j;

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        private h0 f127795j3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f127796k;

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        private u f127797k3;

        /* JADX INFO: renamed from: l3, reason: collision with root package name */
        private x f127799l3;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private n f127800m;

        /* JADX INFO: renamed from: m3, reason: collision with root package name */
        private d0 f127801m3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private f0 f127802n;

        /* JADX INFO: renamed from: n3, reason: collision with root package name */
        private j f127803n3;

        /* JADX INFO: renamed from: o3, reason: collision with root package name */
        private t f127805o3;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        private z f127806p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        private y f127807p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        private b0 f127808p2;

        /* JADX INFO: renamed from: p3, reason: collision with root package name */
        private v f127809p3;

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        private b f127810q3;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        private r f127811r3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f127812s;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        private g f127813s3;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private c0 f127814t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private i0 f127815v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private k f127816w;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private u3<C1238a> f127798l = i3.o();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f127804o = "";

        /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$a, reason: collision with other inner class name */
        public static final class C1238a extends i3<C1238a, C1239a> implements v4 {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final C1238a f127817j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static volatile c5<C1238a> f127818k;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f127819f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f127820g = "";

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private String f127821h = "";

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private String f127822i = "";

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$a$a, reason: collision with other inner class name */
            public static final class C1239a extends i3.a<C1238a, C1239a> implements v4 {
                private C1239a() {
                    super(C1238a.f127817j);
                }

                /* synthetic */ C1239a(byte b10) {
                    this();
                }
            }

            static {
                C1238a c1238a = new C1238a();
                f127817j = c1238a;
                i3.z(C1238a.class, c1238a);
            }

            private C1238a() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f127817j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d"});
                    case NEW_MUTABLE_INSTANCE:
                        return new C1238a();
                    case NEW_BUILDER:
                        return new C1239a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f127817j;
                    case GET_PARSER:
                        c5<C1238a> c5Var = f127818k;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (C1238a.class) {
                            try {
                                e2Var = f127818k;
                                if (e2Var == null) {
                                    e2Var = new e2(f127817j);
                                    f127818k = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class a0 extends i3<a0, C1240a> implements v4 {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final a0 f127823j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static volatile c5<a0> f127824k;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f127825f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f127826g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f127827h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f127828i;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$a0$a, reason: collision with other inner class name */
            public static final class C1240a extends i3.a<a0, C1240a> implements v4 {
                private C1240a() {
                    super(a0.f127823j);
                }

                /* synthetic */ C1240a(byte b10) {
                    this();
                }
            }

            static {
                a0 a0Var = new a0();
                f127823j = a0Var;
                i3.z(a0.class, a0Var);
            }

            private a0() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f127823j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0007\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d"});
                    case NEW_MUTABLE_INSTANCE:
                        return new a0();
                    case NEW_BUILDER:
                        return new C1240a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f127823j;
                    case GET_PARSER:
                        c5<a0> c5Var = f127824k;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (a0.class) {
                            try {
                                e2Var = f127824k;
                                if (e2Var == null) {
                                    e2Var = new e2(f127823j);
                                    f127824k = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class b extends i3<b, C1241a> implements v4 {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final b f127829k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static volatile c5<b> f127830l;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f127831f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private e f127832g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private d f127833h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private C1242b f127834i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private c f127835j;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$b$a, reason: collision with other inner class name */
            public static final class C1241a extends i3.a<b, C1241a> implements v4 {
                private C1241a() {
                    super(b.f127829k);
                }

                /* synthetic */ C1241a(byte b10) {
                    this();
                }
            }

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$b$b, reason: collision with other inner class name */
            public static final class C1242b extends i3<C1242b, C1243a> implements v4 {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final C1242b f127836h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static volatile c5<C1242b> f127837i;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f127838f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private long f127839g;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$b$b$a, reason: collision with other inner class name */
                public static final class C1243a extends i3.a<C1242b, C1243a> implements v4 {
                    private C1243a() {
                        super(C1242b.f127836h);
                    }

                    /* synthetic */ C1243a(byte b10) {
                        this();
                    }
                }

                static {
                    C1242b c1242b = new C1242b();
                    f127836h = c1242b;
                    i3.z(C1242b.class, c1242b);
                }

                private C1242b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f127836h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002\u0000", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b"});
                        case NEW_MUTABLE_INSTANCE:
                            return new C1242b();
                        case NEW_BUILDER:
                            return new C1243a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f127836h;
                        case GET_PARSER:
                            c5<C1242b> c5Var = f127837i;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (C1242b.class) {
                                try {
                                    e2Var = f127837i;
                                    if (e2Var == null) {
                                        e2Var = new e2(f127836h);
                                        f127837i = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class c extends i3<c, C1244a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final c f127840i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<c> f127841j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f127842f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f127843g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private r3 f127844h = i3.n();

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$b$c$a, reason: collision with other inner class name */
                public static final class C1244a extends i3.a<c, C1244a> implements v4 {
                    private C1244a() {
                        super(c.f127840i);
                    }

                    /* synthetic */ C1244a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$b$c$b, reason: collision with other inner class name */
                public static final class EnumC1245b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final EnumC1245b f127845b = new EnumC1245b("UNKNOWN_IDLE_REASON", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final EnumC1245b f127846c = new EnumC1245b("TRACKING", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final EnumC1245b f127847d = new EnumC1245b("MOTION", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final EnumC1245b f127848e = new EnumC1245b("CONTROLLER", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f127849a;

                    private EnumC1245b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f127849a = i11;
                    }

                    public static EnumC1245b b(int i10) {
                        if (i10 == 0) {
                            return f127845b;
                        }
                        if (i10 == 1) {
                            return f127846c;
                        }
                        if (i10 == 2) {
                            return f127847d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f127848e;
                    }

                    public static p3 k() {
                        return b1.f127707a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f127849a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$b$c$c, reason: collision with other inner class name */
                public static final class EnumC1246c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final EnumC1246c f127850b = new EnumC1246c("UNKNOWN_SCREEN_STATE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final EnumC1246c f127851c = new EnumC1246c("ON", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final EnumC1246c f127852d = new EnumC1246c("OFF", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f127853a;

                    private EnumC1246c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f127853a = i11;
                    }

                    public static EnumC1246c b(int i10) {
                        if (i10 == 0) {
                            return f127850b;
                        }
                        if (i10 == 1) {
                            return f127851c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f127852d;
                    }

                    public static p3 k() {
                        return d1.f127769a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f127853a;
                    }
                }

                static {
                    new a1();
                    c cVar = new c();
                    f127840i = cVar;
                    i3.z(c.class, cVar);
                }

                private c() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f127840i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001e", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", EnumC1246c.k(), "c", EnumC1245b.k()});
                        case NEW_MUTABLE_INSTANCE:
                            return new c();
                        case NEW_BUILDER:
                            return new C1244a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f127840i;
                        case GET_PARSER:
                            c5<c> c5Var = f127841j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (c.class) {
                                try {
                                    e2Var = f127841j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f127840i);
                                        f127841j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class d extends i3<d, C1247a> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final d f127854k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<d> f127855l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f127856f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private long f127857g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f127858h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f127859i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private long f127860j;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$b$d$a, reason: collision with other inner class name */
                public static final class C1247a extends i3.a<d, C1247a> implements v4 {
                    private C1247a() {
                        super(d.f127854k);
                    }

                    /* synthetic */ C1247a(byte b10) {
                        this();
                    }
                }

                static {
                    d dVar = new d();
                    f127854k = dVar;
                    i3.z(d.class, dVar);
                }

                private d() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f127854k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e"});
                        case NEW_MUTABLE_INSTANCE:
                            return new d();
                        case NEW_BUILDER:
                            return new C1247a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f127854k;
                        case GET_PARSER:
                            c5<d> c5Var = f127855l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (d.class) {
                                try {
                                    e2Var = f127855l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f127854k);
                                        f127855l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class e extends i3<e, C1248a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final e f127861i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<e> f127862j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f127863f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f127864g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f127865h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$b$e$a, reason: collision with other inner class name */
                public static final class C1248a extends i3.a<e, C1248a> implements v4 {
                    private C1248a() {
                        super(e.f127861i);
                    }

                    /* synthetic */ C1248a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$b$e$b, reason: collision with other inner class name */
                public static final class EnumC1249b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final EnumC1249b f127866b = new EnumC1249b("UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final EnumC1249b f127867c = new EnumC1249b("ACTIVE", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final EnumC1249b f127868d = new EnumC1249b("APP_STANDBY_PENDING", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final EnumC1249b f127869e = new EnumC1249b("APP_STANDBY", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final EnumC1249b f127870f = new EnumC1249b("SUSPEND", 4, 4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f127871a;

                    private EnumC1249b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f127871a = i11;
                    }

                    public static EnumC1249b b(int i10) {
                        if (i10 == 0) {
                            return f127866b;
                        }
                        if (i10 == 1) {
                            return f127867c;
                        }
                        if (i10 == 2) {
                            return f127868d;
                        }
                        if (i10 == 3) {
                            return f127869e;
                        }
                        int i11 = 5 >> 4;
                        if (i10 != 4) {
                            return null;
                        }
                        return f127870f;
                    }

                    public static p3 k() {
                        return e1.f127783a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f127871a;
                    }
                }

                static {
                    e eVar = new e();
                    f127861i = eVar;
                    i3.z(e.class, eVar);
                }

                private e() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f127861i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", EnumC1249b.k(), "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new e();
                        case NEW_BUILDER:
                            return new C1248a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f127861i;
                        case GET_PARSER:
                            c5<e> c5Var = f127862j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (e.class) {
                                try {
                                    e2Var = f127862j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f127861i);
                                        f127862j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                b bVar = new b();
                f127829k = bVar;
                i3.z(b.class, bVar);
            }

            private b() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f127829k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e"});
                    case NEW_MUTABLE_INSTANCE:
                        return new b();
                    case NEW_BUILDER:
                        return new C1241a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f127829k;
                    case GET_PARSER:
                        c5<b> c5Var = f127830l;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (b.class) {
                            try {
                                e2Var = f127830l;
                                if (e2Var == null) {
                                    e2Var = new e2(f127829k);
                                    f127830l = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class b0 extends i3<b0, C1250a> implements v4 {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final b0 f127872k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static volatile c5<b0> f127873l;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f127874f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f127875g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f127876h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private String f127877i = "";

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private b f127878j;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$b0$a, reason: collision with other inner class name */
            public static final class C1250a extends i3.a<b0, C1250a> implements v4 {
                private C1250a() {
                    super(b0.f127872k);
                }

                /* synthetic */ C1250a(byte b10) {
                    this();
                }
            }

            public static final class b extends i3<b, C1252b> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final b f127879i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<b> f127880j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f127881f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f127882g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f127883h;

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$b0$b$a, reason: collision with other inner class name */
                public static final class EnumC1251a implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final EnumC1251a f127884b = new EnumC1251a("UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final EnumC1251a f127885c = new EnumC1251a(com.facebook.share.internal.f.I, 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final EnumC1251a f127886d = new EnumC1251a("TEXT", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final EnumC1251a f127887e = new EnumC1251a("SOUND_WAV", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final EnumC1251a f127888f = new EnumC1251a("SOUND_OGG", 4, 4);

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private static final EnumC1251a f127889g = new EnumC1251a("TEXTURE_PNG", 5, 5);

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private static final EnumC1251a f127890h = new EnumC1251a("TEXTURE_JPEG", 6, 6);

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private static final EnumC1251a f127891i = new EnumC1251a("TEXTURE_WEBP", 7, 7);

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private static final EnumC1251a f127892j = new EnumC1251a("TEXTURE_FIFE_PNG", 8, 8);

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    private static final EnumC1251a f127893k = new EnumC1251a("TEXTURE_FIFE_JPEG", 9, 9);

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    private static final EnumC1251a f127894l = new EnumC1251a("TEXTURE_FIFE_WEBP", 10, 10);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f127895a;

                    private EnumC1251a(String str, int i10, int i11) {
                        super(str, i10);
                        this.f127895a = i11;
                    }

                    public static EnumC1251a b(int i10) {
                        switch (i10) {
                            case 0:
                                return f127884b;
                            case 1:
                                return f127885c;
                            case 2:
                                return f127886d;
                            case 3:
                                return f127887e;
                            case 4:
                                return f127888f;
                            case 5:
                                return f127889g;
                            case 6:
                                return f127890h;
                            case 7:
                                return f127891i;
                            case 8:
                                return f127892j;
                            case 9:
                                return f127893k;
                            case 10:
                                return f127894l;
                            default:
                                return null;
                        }
                    }

                    public static p3 k() {
                        return s0.f129568a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f127895a;
                    }
                }

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$b0$b$b, reason: collision with other inner class name */
                public static final class C1252b extends i3.a<b, C1252b> implements v4 {
                    private C1252b() {
                        super(b.f127879i);
                    }

                    /* synthetic */ C1252b(byte b10) {
                        this();
                    }
                }

                static {
                    b bVar = new b();
                    f127879i = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f127879i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", EnumC1251a.k(), "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1252b((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f127879i;
                        case GET_PARSER:
                            c5<b> c5Var = f127880j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f127880j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f127879i);
                                        f127880j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class c implements n3 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f127937a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final c f127896b = new c("UNKNOWN", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final c f127897c = new c("BACK_BUTTON", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final c f127898d = new c("LAUNCHER_MAIN", 2, 1000);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final c f127899e = new c("LAUNCHER_DISCOVERY_WINDOW", 3, 1001);

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static final c f127900f = new c("LAUNCHER_RECENT_APP_CARD", 4, 1002);

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static final c f127901g = new c("LAUNCHER_SETTINGS_BUTTON", 5, 1003);

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final c f127903h = new c("LAUNCHER_LIBRARY_BUTTON", 6, 1004);

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final c f127905i = new c("LAUNCHER_PLAY_STORE_BUTTON", 7, 1005);

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final c f127907j = new c("LAUNCHER_CAST_BUTTON", 8, 1008);

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final c f127909k = new c("LAUNCHER_LIBRARY", 9, 1006);

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static final c f127911l = new c("LAUNCHER_LIBRARY_APP_CARD", 10, 1007);

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private static final c f127913m = new c("PLAY_STORE_MAIN", 11, 2000);

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private static final c f127915n = new c("PLAY_STORE_MAIN_FEATURED_CAROUSEL_CARD", 12, androidx.media3.common.x0.f61834p1);

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static final c f127917o = new c("PLAY_STORE_MAIN_FEATURED_ACTIVE_CARD", 13, androidx.media3.common.x0.H1);

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private static final c f127925s = new c("PLAY_STORE_MAIN_COLLECTION", 14, androidx.media3.common.x0.f61835p2);

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private static final c f127927t = new c("PLAY_STORE_MAIN_COLLECTION_TITLE_CARD", 15, androidx.media3.common.x0.f61816g3);

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                private static final c f127930v = new c("PLAY_STORE_MAIN_COLLECTION_APP_CARD", 16, androidx.media3.common.x0.f61818h3);

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                private static final c f127932w = new c("PLAY_STORE_MAIN_FEATURED_COLLECTION", 17, androidx.media3.common.x0.f61820i3);
                private static final c X = new c("PLAY_STORE_COLLECTION_PAGE", 18, androidx.media3.common.x0.f61822j3);
                private static final c Y = new c("PLAY_STORE_COLLECTION_APP_CARD", 19, 2008);
                private static final c Z = new c("PLAY_STORE_DETAILS", 20, 2009);

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                private static final c f127919p0 = new c("PLAY_STORE_DETAILS_PANO", 21, 2010);

                /* JADX INFO: renamed from: p1, reason: collision with root package name */
                private static final c f127920p1 = new c("PLAY_STORE_DETAILS_MORE_DETAILS_BUTTON", 22, CropImage.f97512h);
                private static final c H1 = new c("PLAY_STORE_DETAILS_OPEN_BUTTON", 23, 2012);

                /* JADX INFO: renamed from: p2, reason: collision with root package name */
                private static final c f127921p2 = new c("PLAY_STORE_DETAILS_INSTALL_BUTTON", 24, 2013);

                /* JADX INFO: renamed from: g3, reason: collision with root package name */
                private static final c f127902g3 = new c("PLAY_STORE_DETAILS_BUY_BUTTON", 25, 2014);

                /* JADX INFO: renamed from: h3, reason: collision with root package name */
                private static final c f127904h3 = new c("PLAY_STORE_DETAILS_UPDATE_BUTTON", 26, 2015);

                /* JADX INFO: renamed from: i3, reason: collision with root package name */
                private static final c f127906i3 = new c("PLAY_STORE_DETAILS_NO_DAYDREAM", 27, 2016);

                /* JADX INFO: renamed from: j3, reason: collision with root package name */
                private static final c f127908j3 = new c("PLAY_STORE_MORE_DETAILS", 28, 2017);

                /* JADX INFO: renamed from: k3, reason: collision with root package name */
                private static final c f127910k3 = new c("PLAY_STORE_TOS_DIALOG", 29, 2018);

                /* JADX INFO: renamed from: l3, reason: collision with root package name */
                private static final c f127912l3 = new c("PLAY_STORE_TOS_DIALOG_EXIT_VR_BUTTON", 30, 2019);

                /* JADX INFO: renamed from: m3, reason: collision with root package name */
                private static final c f127914m3 = new c("PLAY_STORE_NETWORK_ERROR", 31, 2020);

                /* JADX INFO: renamed from: n3, reason: collision with root package name */
                private static final c f127916n3 = new c("PLAY_STORE_NETWORK_ERROR_RETRY_BUTTON", 32, 2021);

                /* JADX INFO: renamed from: o3, reason: collision with root package name */
                private static final c f127918o3 = new c("EXPEDITIONS_SCENE_BACK_BUTTON", 33, 3000);

                /* JADX INFO: renamed from: p3, reason: collision with root package name */
                private static final c f127922p3 = new c("EXPEDITIONS_TOUR_COVER", 34, 3001);

                /* JADX INFO: renamed from: q3, reason: collision with root package name */
                private static final c f127923q3 = new c("EXPEDITIONS_TOUR_CATEGORY", 35, 3002);

                /* JADX INFO: renamed from: r3, reason: collision with root package name */
                private static final c f127924r3 = new c("EXPEDITIONS_SIGHT_ITEM", 36, 3003);

                /* JADX INFO: renamed from: s3, reason: collision with root package name */
                private static final c f127926s3 = new c("EXPEDITIONS_SCENE_CONTROL_NEXT_SCENE", 37, 3004);

                /* JADX INFO: renamed from: t3, reason: collision with root package name */
                private static final c f127928t3 = new c("EXPEDITIONS_SCENE_CONTROL_PREV_SCENE", 38, com.google.android.gms.auth.api.proxy.a.f105601y);

                /* JADX INFO: renamed from: u3, reason: collision with root package name */
                private static final c f127929u3 = new c("EXPEDITIONS_SCENE_CONTROL_NEXT_SIGHT", 39, com.google.android.gms.auth.api.proxy.a.f105602z);

                /* JADX INFO: renamed from: v3, reason: collision with root package name */
                private static final c f127931v3 = new c("EXPEDITIONS_SCENE_CONTROL_PREV_SIGHT", 40, 3007);

                /* JADX INFO: renamed from: w3, reason: collision with root package name */
                private static final c f127933w3 = new c("EXPEDITIONS_SCENE_CONTROL_GOTO_MENU", 41, 3008);

                /* JADX INFO: renamed from: x3, reason: collision with root package name */
                private static final c f127934x3 = new c("EXPEDITIONS_SCENE_CONTROL_TOGGLE_INFO", 42, 3009);

                /* JADX INFO: renamed from: y3, reason: collision with root package name */
                private static final c f127935y3 = new c("EXPEDITIONS_SCENE_CONTROL_TOGGLE_NARRATION", 43, 3010);

                /* JADX INFO: renamed from: z3, reason: collision with root package name */
                private static final c f127936z3 = new c("EXPEDITIONS_SCENE_CONTROL_TOGGLE_AMBIENT_AUDIO", 44, 3011);
                private static final c A3 = new c("EXPEDITIONS_TOUR_FEATURED_BUTTON", 45, 3012);
                private static final c B3 = new c("EXPEDITIONS_TOUR_CATEGORY_BUTTON", 46, 3013);
                private static final c C3 = new c("EXPEDITIONS_TOUR_RECENT_BUTTON", 47, 3014);

                static {
                    int i10 = 7 | 2;
                }

                private c(String str, int i10, int i11) {
                    super(str, i10);
                    this.f127937a = i11;
                }

                public static c b(int i10) {
                    if (i10 == 0) {
                        return f127896b;
                    }
                    if (i10 == 1) {
                        return f127897c;
                    }
                    switch (i10) {
                        case 1000:
                            return f127898d;
                        case 1001:
                            return f127899e;
                        case 1002:
                            return f127900f;
                        case 1003:
                            return f127901g;
                        case 1004:
                            return f127903h;
                        case 1005:
                            return f127905i;
                        case 1006:
                            return f127909k;
                        case 1007:
                            return f127911l;
                        case 1008:
                            return f127907j;
                        default:
                            switch (i10) {
                                case 2000:
                                    return f127913m;
                                case androidx.media3.common.x0.f61834p1 /* 2001 */:
                                    return f127915n;
                                case androidx.media3.common.x0.H1 /* 2002 */:
                                    return f127917o;
                                case androidx.media3.common.x0.f61835p2 /* 2003 */:
                                    return f127925s;
                                case androidx.media3.common.x0.f61816g3 /* 2004 */:
                                    return f127927t;
                                case androidx.media3.common.x0.f61818h3 /* 2005 */:
                                    return f127930v;
                                case androidx.media3.common.x0.f61820i3 /* 2006 */:
                                    return f127932w;
                                case androidx.media3.common.x0.f61822j3 /* 2007 */:
                                    return X;
                                case 2008:
                                    return Y;
                                case 2009:
                                    return Z;
                                case 2010:
                                    return f127919p0;
                                case CropImage.f97512h /* 2011 */:
                                    return f127920p1;
                                case 2012:
                                    return H1;
                                case 2013:
                                    return f127921p2;
                                case 2014:
                                    return f127902g3;
                                case 2015:
                                    return f127904h3;
                                case 2016:
                                    return f127906i3;
                                case 2017:
                                    return f127908j3;
                                case 2018:
                                    return f127910k3;
                                case 2019:
                                    return f127912l3;
                                case 2020:
                                    return f127914m3;
                                case 2021:
                                    return f127916n3;
                                default:
                                    switch (i10) {
                                        case 3000:
                                            return f127918o3;
                                        case 3001:
                                            return f127922p3;
                                        case 3002:
                                            return f127923q3;
                                        case 3003:
                                            return f127924r3;
                                        case 3004:
                                            return f127926s3;
                                        case com.google.android.gms.auth.api.proxy.a.f105601y /* 3005 */:
                                            return f127928t3;
                                        case com.google.android.gms.auth.api.proxy.a.f105602z /* 3006 */:
                                            return f127929u3;
                                        case 3007:
                                            return f127931v3;
                                        case 3008:
                                            return f127933w3;
                                        case 3009:
                                            return f127934x3;
                                        case 3010:
                                            return f127935y3;
                                        case 3011:
                                            return f127936z3;
                                        case 3012:
                                            return A3;
                                        case 3013:
                                            return B3;
                                        case 3014:
                                            return C3;
                                        default:
                                            return null;
                                    }
                            }
                    }
                }

                public static p3 k() {
                    return t0.f129576a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f127937a;
                }
            }

            static {
                b0 b0Var = new b0();
                f127872k = b0Var;
                i3.z(b0.class, b0Var);
            }

            private b0() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f127872k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\b\u0002\u0004\t\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", c.k(), "c", "d", "e"});
                    case NEW_MUTABLE_INSTANCE:
                        return new b0();
                    case NEW_BUILDER:
                        return new C1250a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f127872k;
                    case GET_PARSER:
                        c5<b0> c5Var = f127873l;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (b0.class) {
                            try {
                                e2Var = f127873l;
                                if (e2Var == null) {
                                    e2Var = new e2(f127872k);
                                    f127873l = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class c extends i3<c, C1253a> implements v4 {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final c f127938i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static volatile c5<c> f127939j;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f127940f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private b f127941g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private C1256c f127942h;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$c$a, reason: collision with other inner class name */
            public static final class C1253a extends i3.a<c, C1253a> implements v4 {
                private C1253a() {
                    super(c.f127938i);
                }

                /* synthetic */ C1253a(byte b10) {
                    this();
                }
            }

            public static final class b extends i3<b, C1254a> implements v4 {

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static final b f127943o;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private static volatile c5<b> f127944s;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f127945f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f127946g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f127947h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f127948i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f127949j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private int f127950k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private int f127951l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private int f127952m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private int f127953n;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$c$b$a, reason: collision with other inner class name */
                public static final class C1254a extends i3.a<b, C1254a> implements v4 {
                    private C1254a() {
                        super(b.f127943o);
                    }

                    /* synthetic */ C1254a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$c$b$b, reason: collision with other inner class name */
                public static final class EnumC1255b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final EnumC1255b f127954b = new EnumC1255b("SOURCE_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final EnumC1255b f127955c = new EnumC1255b("SOURCE_COLLECTION", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final EnumC1255b f127956d = new EnumC1255b("SOURCE_PANO", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final EnumC1255b f127957e = new EnumC1255b("SOURCE_SEARCH", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final EnumC1255b f127958f = new EnumC1255b("SOURCE_SEARCH_RESULTS", 4, 4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f127959a;

                    static {
                        int i10 = 2 << 2;
                    }

                    private EnumC1255b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f127959a = i11;
                    }

                    public static EnumC1255b b(int i10) {
                        if (i10 == 0) {
                            return f127954b;
                        }
                        if (i10 == 1) {
                            return f127955c;
                        }
                        if (i10 == 2) {
                            return f127956d;
                        }
                        if (i10 == 3) {
                            return f127957e;
                        }
                        if (i10 != 4) {
                            return null;
                        }
                        return f127958f;
                    }

                    public static p3 k() {
                        return f1.f129366a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f127959a;
                    }
                }

                static {
                    b bVar = new b();
                    f127943o = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f127943o, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", EnumC1255b.k(), "c", "d", "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1254a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f127943o;
                        case GET_PARSER:
                            c5<b> c5Var = f127944s;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f127944s;
                                    if (e2Var == null) {
                                        e2Var = new e2(f127943o);
                                        f127944s = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$c$c, reason: collision with other inner class name */
            public static final class C1256c extends i3<C1256c, C1257a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final C1256c f127960i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<C1256c> f127961j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f127962f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f127963g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private boolean f127964h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$c$c$a, reason: collision with other inner class name */
                public static final class C1257a extends i3.a<C1256c, C1257a> implements v4 {
                    private C1257a() {
                        super(C1256c.f127960i);
                    }

                    /* synthetic */ C1257a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$c$c$b */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f127965b = new b("UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f127966c = new b("WELCOME_CARDBOARD", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f127967d = new b("WELCOME_DAYDREAM", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f127968a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f127968a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f127965b;
                        }
                        if (i10 == 1) {
                            return f127966c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f127967d;
                    }

                    public static p3 k() {
                        return g1.f129407a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f127968a;
                    }
                }

                static {
                    C1256c c1256c = new C1256c();
                    f127960i = c1256c;
                    i3.z(C1256c.class, c1256c);
                }

                private C1256c() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f127960i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new C1256c();
                        case NEW_BUILDER:
                            return new C1257a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f127960i;
                        case GET_PARSER:
                            c5<C1256c> c5Var = f127961j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (C1256c.class) {
                                try {
                                    e2Var = f127961j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f127960i);
                                        f127961j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                c cVar = new c();
                f127938i = cVar;
                i3.z(c.class, cVar);
            }

            private c() {
            }

            public static c5<c> B() {
                return f127938i.r();
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f127938i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                    case NEW_MUTABLE_INSTANCE:
                        return new c();
                    case NEW_BUILDER:
                        return new C1253a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f127938i;
                    case GET_PARSER:
                        c5<c> c5Var = f127939j;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (c.class) {
                            try {
                                e2Var = f127939j;
                                if (e2Var == null) {
                                    e2Var = new e2(f127938i);
                                    f127939j = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class c0 extends i3<c0, C1258a> implements v4 {

            /* JADX INFO: renamed from: l3, reason: collision with root package name */
            private static final c0 f127969l3;

            /* JADX INFO: renamed from: m3, reason: collision with root package name */
            private static volatile c5<c0> f127970m3;
            private int X;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f127971f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f127972g;

            /* JADX INFO: renamed from: g3, reason: collision with root package name */
            private float f127973g3;

            /* JADX INFO: renamed from: h3, reason: collision with root package name */
            private float f127975h3;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f127976i;

            /* JADX INFO: renamed from: i3, reason: collision with root package name */
            private int f127977i3;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private float f127978j;

            /* JADX INFO: renamed from: j3, reason: collision with root package name */
            private int f127979j3;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private float f127980k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private float f127982l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private d f127983m;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private u3<w> f127974h = i3.o();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private u3<w> f127984n = i3.o();

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private u3<w> f127985o = i3.o();

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private u3<w> f127989s = i3.o();

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private u3<w> f127990t = i3.o();

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private u3<w> f127991v = i3.o();

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private u3<w> f127992w = i3.o();
            private q3 Y = i3.m();
            private q3 Z = i3.m();

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            private q3 f127986p0 = i3.m();

            /* JADX INFO: renamed from: p1, reason: collision with root package name */
            private q3 f127987p1 = i3.m();
            private q3 H1 = i3.m();

            /* JADX INFO: renamed from: p2, reason: collision with root package name */
            private q3 f127988p2 = i3.m();

            /* JADX INFO: renamed from: k3, reason: collision with root package name */
            private u3<b> f127981k3 = i3.o();

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$c0$a, reason: collision with other inner class name */
            public static final class C1258a extends i3.a<c0, C1258a> implements v4 {
                private C1258a() {
                    super(c0.f127969l3);
                }

                /* synthetic */ C1258a(byte b10) {
                    this();
                }
            }

            public static final class b extends i3<b, C1259a> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final b f127993j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<b> f127994k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f127995f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f127996g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f127997h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f127998i;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$c0$b$a, reason: collision with other inner class name */
                public static final class C1259a extends i3.a<b, C1259a> implements v4 {
                    private C1259a() {
                        super(b.f127993j);
                    }

                    /* synthetic */ C1259a(byte b10) {
                        this();
                    }
                }

                static {
                    b bVar = new b();
                    f127993j = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f127993j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0002\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d"});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1259a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f127993j;
                        case GET_PARSER:
                            c5<b> c5Var = f127994k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f127994k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f127993j);
                                        f127994k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                c0 c0Var = new c0();
                f127969l3 = c0Var;
                i3.z(c0.class, c0Var);
            }

            private c0() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f127969l3, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u000e\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u0004\u0001\u0004\u0001\u0002\u0005\u0001\u0003\u0006\u0001\u0004\u0007\t\u0005\b\u001b\t\u001b\n\u001b\u000b\u001b\f\u001b\r\u001b\u000e\u0004\u0006\u000f\u0013\u0010\u0013\u0011\u0013\u0012\u0013\u0013\u0013\u0014\u0013\u0015\u0001\u0007\u0016\u0001\b\u0017\u0004\t\u0018\u0004\n\u0019\u001b", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", w.class, "d", "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k, w.class, "j", w.class, "k", w.class, androidx.media3.exoplayer.upstream.h.f65996j, w.class, androidx.media3.exoplayer.upstream.h.f66001o, w.class, "n", w.class, "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", b.class});
                    case NEW_MUTABLE_INSTANCE:
                        return new c0();
                    case NEW_BUILDER:
                        return new C1258a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f127969l3;
                    case GET_PARSER:
                        c5<c0> c5Var = f127970m3;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (c0.class) {
                            try {
                                e2Var = f127970m3;
                                if (e2Var == null) {
                                    e2Var = new e2(f127969l3);
                                    f127970m3 = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class d extends i3<d, C1260a> implements v4 {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final d f127999i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static volatile c5<d> f128000j;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128001f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f128002g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private u3<b> f128003h = i3.o();

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$d$a, reason: collision with other inner class name */
            public static final class C1260a extends i3.a<d, C1260a> implements v4 {
                private C1260a() {
                    super(d.f127999i);
                }

                /* synthetic */ C1260a(byte b10) {
                    this();
                }
            }

            public static final class b extends i3<b, C1261a> implements v4 {

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private static final b f128004s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private static volatile c5<b> f128005t;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128006f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128007g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private float f128008h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f128009i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f128010j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private int f128011k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private int f128012l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private q3 f128013m = i3.m();

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private q3 f128014n = i3.m();

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private q3 f128015o = i3.m();

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$d$b$a, reason: collision with other inner class name */
                public static final class C1261a extends i3.a<b, C1261a> implements v4 {
                    private C1261a() {
                        super(b.f128004s);
                    }

                    /* synthetic */ C1261a(byte b10) {
                        this();
                    }
                }

                static {
                    b bVar = new b();
                    f128004s = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128004s, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0000\u0001\u0004\u0000\u0002\u0001\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0013\b\u0013\t\u0013", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k, "j"});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1261a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128004s;
                        case GET_PARSER:
                            c5<b> c5Var = f128005t;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f128005t;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128004s);
                                        f128005t = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                d dVar = new d();
                f127999i = dVar;
                i3.z(d.class, dVar);
            }

            private d() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f127999i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u001b", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", b.class});
                    case NEW_MUTABLE_INSTANCE:
                        return new d();
                    case NEW_BUILDER:
                        return new C1260a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f127999i;
                    case GET_PARSER:
                        c5<d> c5Var = f128000j;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (d.class) {
                            try {
                                e2Var = f128000j;
                                if (e2Var == null) {
                                    e2Var = new e2(f127999i);
                                    f128000j = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class d0 extends i3<d0, C1262a> implements v4 {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final d0 f128016j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static volatile c5<d0> f128017k;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128018f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private u3<f> f128019g = i3.o();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private f f128020h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private float f128021i;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$d0$a, reason: collision with other inner class name */
            public static final class C1262a extends i3.a<d0, C1262a> implements v4 {
                private C1262a() {
                    super(d0.f128016j);
                }

                /* synthetic */ C1262a(byte b10) {
                    this();
                }
            }

            static {
                d0 d0Var = new d0();
                f128016j = d0Var;
                i3.z(d0.class, d0Var);
            }

            private d0() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128016j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0000\u0003\u0001\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", f.class, "c", "d"});
                    case NEW_MUTABLE_INSTANCE:
                        return new d0();
                    case NEW_BUILDER:
                        return new C1262a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128016j;
                    case GET_PARSER:
                        c5<d0> c5Var = f128017k;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (d0.class) {
                            try {
                                e2Var = f128017k;
                                if (e2Var == null) {
                                    e2Var = new e2(f128016j);
                                    f128017k = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class e extends i3<e, C1263a> implements v4 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static final e f128022n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static volatile c5<e> f128023o;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128024f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private float f128025g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private float f128026h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private float f128027i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private float f128028j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private float f128029k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private float f128030l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private float f128031m;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$e$a, reason: collision with other inner class name */
            public static final class C1263a extends i3.a<e, C1263a> implements v4 {
                private C1263a() {
                    super(e.f128022n);
                }

                /* synthetic */ C1263a(byte b10) {
                    this();
                }
            }

            static {
                e eVar = new e();
                f128022n = eVar;
                i3.z(e.class, eVar);
            }

            private e() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128022n, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004\u0001\u0003\u0005\u0001\u0004\u0006\u0001\u0005\u0007\u0001\u0006", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g});
                    case NEW_MUTABLE_INSTANCE:
                        return new e();
                    case NEW_BUILDER:
                        return new C1263a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128022n;
                    case GET_PARSER:
                        c5<e> c5Var = f128023o;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (e.class) {
                            try {
                                e2Var = f128023o;
                                if (e2Var == null) {
                                    e2Var = new e2(f128022n);
                                    f128023o = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class e0 extends i3<e0, C1264a> implements v4 {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final e0 f128032k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static volatile c5<e0> f128033l;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128034f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f128035g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private c f128036h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private d f128037i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private b f128038j;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$e0$a, reason: collision with other inner class name */
            public static final class C1264a extends i3.a<e0, C1264a> implements v4 {
                private C1264a() {
                    super(e0.f128032k);
                }

                /* synthetic */ C1264a(byte b10) {
                    this();
                }
            }

            public static final class b extends i3<b, C1265a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final b f128039i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<b> f128040j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128041f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128042g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128043h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$e0$b$a, reason: collision with other inner class name */
                public static final class C1265a extends i3.a<b, C1265a> implements v4 {
                    private C1265a() {
                        super(b.f128039i);
                    }

                    /* synthetic */ C1265a(byte b10) {
                        this();
                    }
                }

                static {
                    b bVar = new b();
                    f128039i = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128039i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1265a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128039i;
                        case GET_PARSER:
                            c5<b> c5Var = f128040j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f128040j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128039i);
                                        f128040j = e2Var;
                                    }
                                } finally {
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class c extends i3<c, C1266a> implements v4 {

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static final c f128044l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private static volatile c5<c> f128045m;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128046f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128047g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128048h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private boolean f128049i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f128050j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private int f128051k;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$e0$c$a, reason: collision with other inner class name */
                public static final class C1266a extends i3.a<c, C1266a> implements v4 {
                    private C1266a() {
                        super(c.f128044l);
                    }

                    /* synthetic */ C1266a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128052b = new b("UNKNOWN_IMMERSIVE_TYPE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128053c = new b("FLAT", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128054d = new b("IMMERSIVE", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128055a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128055a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128052b;
                        }
                        if (i10 == 1) {
                            return f128053c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128054d;
                    }

                    public static p3 k() {
                        return u0.f129609a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128055a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$e0$c$c, reason: collision with other inner class name */
                public static final class EnumC1267c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final EnumC1267c f128056b = new EnumC1267c("UNSPECIFIED", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final EnumC1267c f128057c = new EnumC1267c("GALLERY", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final EnumC1267c f128058d = new EnumC1267c("CAROUSEL", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final EnumC1267c f128059e = new EnumC1267c("INTENT", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128060a;

                    private EnumC1267c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128060a = i11;
                    }

                    public static EnumC1267c b(int i10) {
                        if (i10 == 0) {
                            return f128056b;
                        }
                        if (i10 == 1) {
                            return f128057c;
                        }
                        if (i10 == 2) {
                            return f128058d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f128059e;
                    }

                    public static p3 k() {
                        return v0.f129622a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128060a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class d implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final d f128061b = new d("UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final d f128062c = new d("PHOTO", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    @Deprecated
                    private static final d f128063d = new d("FLAT_PANORAMA", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    @Deprecated
                    private static final d f128064e = new d("PANORAMA", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    @Deprecated
                    private static final d f128065f = new d("VR", 4, 4);

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private static final d f128066g = new d(com.facebook.share.internal.f.f101822a0, 5, 5);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128067a;

                    private d(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128067a = i11;
                    }

                    public static d b(int i10) {
                        if (i10 == 0) {
                            return f128061b;
                        }
                        if (i10 == 1) {
                            return f128062c;
                        }
                        if (i10 == 2) {
                            return f128063d;
                        }
                        if (i10 == 3) {
                            return f128064e;
                        }
                        if (i10 == 4) {
                            return f128065f;
                        }
                        if (i10 != 5) {
                            return null;
                        }
                        return f128066g;
                    }

                    public static p3 k() {
                        return w0.f129636a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128067a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class e implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final e f128068b = new e("UNKNOWN_STEREO_TYPE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final e f128069c = new e("MONO", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final e f128070d = new e("STEREO", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128071a;

                    private e(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128071a = i11;
                    }

                    public static e b(int i10) {
                        if (i10 == 0) {
                            return f128068b;
                        }
                        if (i10 == 1) {
                            return f128069c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128070d;
                    }

                    public static p3 k() {
                        return x0.f129662a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128071a;
                    }
                }

                static {
                    c cVar = new c();
                    f128044l = cVar;
                    i3.z(c.class, cVar);
                }

                private c() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128044l, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0007\u0002\u0004\f\u0003\u0005\f\u0004", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", d.k(), "c", EnumC1267c.k(), "d", "e", b.k(), RequestParams.F, e.k()});
                        case NEW_MUTABLE_INSTANCE:
                            return new c();
                        case NEW_BUILDER:
                            return new C1266a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128044l;
                        case GET_PARSER:
                            c5<c> c5Var = f128045m;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (c.class) {
                                try {
                                    e2Var = f128045m;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128044l);
                                        f128045m = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class d extends i3<d, C1268a> implements v4 {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final d f128072h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static volatile c5<d> f128073i;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128074f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private float f128075g;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$e0$d$a, reason: collision with other inner class name */
                public static final class C1268a extends i3.a<d, C1268a> implements v4 {
                    private C1268a() {
                        super(d.f128072h);
                    }

                    /* synthetic */ C1268a(byte b10) {
                        this();
                    }
                }

                static {
                    d dVar = new d();
                    f128072h = dVar;
                    i3.z(d.class, dVar);
                }

                private d() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128072h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b"});
                        case NEW_MUTABLE_INSTANCE:
                            return new d();
                        case NEW_BUILDER:
                            return new C1268a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128072h;
                        case GET_PARSER:
                            c5<d> c5Var = f128073i;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (d.class) {
                                try {
                                    e2Var = f128073i;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128072h);
                                        f128073i = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                e0 e0Var = new e0();
                f128032k = e0Var;
                i3.z(e0.class, e0Var);
            }

            private e0() {
            }

            public static c5<e0> B() {
                return f128032k.r();
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128032k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e"});
                    case NEW_MUTABLE_INSTANCE:
                        return new e0();
                    case NEW_BUILDER:
                        return new C1264a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128032k;
                    case GET_PARSER:
                        c5<e0> c5Var = f128033l;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (e0.class) {
                            try {
                                e2Var = f128033l;
                                if (e2Var == null) {
                                    e2Var = new e2(f128032k);
                                    f128033l = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class f extends i3<f, C1269a> implements v4 {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final f f128076i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static volatile c5<f> f128077j;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128078f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private float f128079g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private float f128080h;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$f$a, reason: collision with other inner class name */
            public static final class C1269a extends i3.a<f, C1269a> implements v4 {
                private C1269a() {
                    super(f.f128076i);
                }

                /* synthetic */ C1269a(byte b10) {
                    this();
                }
            }

            static {
                f fVar = new f();
                f128076i = fVar;
                i3.z(f.class, fVar);
            }

            private f() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128076i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                    case NEW_MUTABLE_INSTANCE:
                        return new f();
                    case NEW_BUILDER:
                        return new C1269a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128076i;
                    case GET_PARSER:
                        c5<f> c5Var = f128077j;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (f.class) {
                            try {
                                e2Var = f128077j;
                                if (e2Var == null) {
                                    e2Var = new e2(f128076i);
                                    f128077j = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class f0 extends i3<f0, C1270a> implements v4 {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final f0 f128081i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static volatile c5<f0> f128082j;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128083f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f128084g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private String f128085h = "";

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$f0$a, reason: collision with other inner class name */
            public static final class C1270a extends i3.a<f0, C1270a> implements v4 {
                private C1270a() {
                    super(f0.f128081i);
                }

                /* synthetic */ C1270a(byte b10) {
                    this();
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class b implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final b f128086b = new b("UNKNOWN", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final b f128087c = new b("OK", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final b f128088d = new b("UNEXPECTED_FORMAT", 2, 2);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final b f128089e = new b("CONNECTION_ERROR", 3, 3);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f128090a;

                private b(String str, int i10, int i11) {
                    super(str, i10);
                    this.f128090a = i11;
                }

                public static b b(int i10) {
                    if (i10 == 0) {
                        return f128086b;
                    }
                    if (i10 == 1) {
                        return f128087c;
                    }
                    if (i10 == 2) {
                        return f128088d;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return f128089e;
                }

                public static p3 k() {
                    return y0.f129700a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f128090a;
                }
            }

            static {
                f0 f0Var = new f0();
                f128081i = f0Var;
                i3.z(f0.class, f0Var);
            }

            private f0() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128081i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c"});
                    case NEW_MUTABLE_INSTANCE:
                        return new f0();
                    case NEW_BUILDER:
                        return new C1270a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128081i;
                    case GET_PARSER:
                        c5<f0> c5Var = f128082j;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (f0.class) {
                            try {
                                e2Var = f128082j;
                                if (e2Var == null) {
                                    e2Var = new e2(f128081i);
                                    f128082j = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class g extends i3<g, C1271a> implements v4 {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private static final g f128091m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static volatile c5<g> f128092n;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128093f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private b f128094g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private k f128095h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private m f128096i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private f f128097j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private e f128098k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private d f128099l;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$a, reason: collision with other inner class name */
            public static final class C1271a extends i3.a<g, C1271a> implements v4 {
                private C1271a() {
                    super(g.f128091m);
                }

                /* synthetic */ C1271a(byte b10) {
                    this();
                }
            }

            public static final class b extends i3<b, C1272a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final b f128100i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<b> f128101j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128102f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128103g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private String f128104h = "";

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$b$a, reason: collision with other inner class name */
                public static final class C1272a extends i3.a<b, C1272a> implements v4 {
                    private C1272a() {
                        super(b.f128100i);
                    }

                    /* synthetic */ C1272a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$b$b, reason: collision with other inner class name */
                public static final class EnumC1273b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final EnumC1273b f128105b = new EnumC1273b("UNKNOWN_PLATFORM", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final EnumC1273b f128106c = new EnumC1273b("LINUX", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final EnumC1273b f128107d = new EnumC1273b("OSX", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final EnumC1273b f128108e = new EnumC1273b("WINDOWS", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128109a;

                    private EnumC1273b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128109a = i11;
                    }

                    public static EnumC1273b b(int i10) {
                        if (i10 == 0) {
                            return f128105b;
                        }
                        if (i10 == 1) {
                            return f128106c;
                        }
                        if (i10 == 2) {
                            return f128107d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f128108e;
                    }

                    public static p3 k() {
                        return h1.f129417a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128109a;
                    }
                }

                static {
                    b bVar = new b();
                    f128100i = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128100i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", EnumC1273b.k(), "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1272a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128100i;
                        case GET_PARSER:
                            c5<b> c5Var = f128101j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f128101j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128100i);
                                        f128101j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class c extends i3<c, C1274a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final c f128110i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<c> f128111j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128112f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128113g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128114h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$c$a, reason: collision with other inner class name */
                public static final class C1274a extends i3.a<c, C1274a> implements v4 {
                    private C1274a() {
                        super(c.f128110i);
                    }

                    /* synthetic */ C1274a(byte b10) {
                        this();
                    }
                }

                static {
                    c cVar = new c();
                    f128110i = cVar;
                    i3.z(c.class, cVar);
                }

                private c() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128110i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new c();
                        case NEW_BUILDER:
                            return new C1274a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128110i;
                        case GET_PARSER:
                            c5<c> c5Var = f128111j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (c.class) {
                                try {
                                    e2Var = f128111j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128110i);
                                        f128111j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class d extends i3<d, C1275a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final d f128115i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<d> f128116j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128117f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private C1278g f128118g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private h f128119h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$d$a, reason: collision with other inner class name */
                public static final class C1275a extends i3.a<d, C1275a> implements v4 {
                    private C1275a() {
                        super(d.f128115i);
                    }

                    /* synthetic */ C1275a(byte b10) {
                        this();
                    }
                }

                static {
                    d dVar = new d();
                    f128115i = dVar;
                    i3.z(d.class, dVar);
                }

                private d() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128115i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new d();
                        case NEW_BUILDER:
                            return new C1275a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128115i;
                        case GET_PARSER:
                            c5<d> c5Var = f128116j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (d.class) {
                                try {
                                    e2Var = f128116j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128115i);
                                        f128116j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class e extends i3<e, C1276a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final e f128120i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<e> f128121j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128122f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private C1278g f128123g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private h f128124h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$e$a, reason: collision with other inner class name */
                public static final class C1276a extends i3.a<e, C1276a> implements v4 {
                    private C1276a() {
                        super(e.f128120i);
                    }

                    /* synthetic */ C1276a(byte b10) {
                        this();
                    }
                }

                static {
                    e eVar = new e();
                    f128120i = eVar;
                    i3.z(e.class, eVar);
                }

                private e() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128120i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new e();
                        case NEW_BUILDER:
                            return new C1276a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128120i;
                        case GET_PARSER:
                            c5<e> c5Var = f128121j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (e.class) {
                                try {
                                    e2Var = f128121j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128120i);
                                        f128121j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class f extends i3<f, C1277a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final f f128125i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<f> f128126j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128127f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private C1278g f128128g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private h f128129h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$f$a, reason: collision with other inner class name */
                public static final class C1277a extends i3.a<f, C1277a> implements v4 {
                    private C1277a() {
                        super(f.f128125i);
                    }

                    /* synthetic */ C1277a(byte b10) {
                        this();
                    }
                }

                static {
                    f fVar = new f();
                    f128125i = fVar;
                    i3.z(f.class, fVar);
                }

                private f() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128125i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new f();
                        case NEW_BUILDER:
                            return new C1277a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128125i;
                        case GET_PARSER:
                            c5<f> c5Var = f128126j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (f.class) {
                                try {
                                    e2Var = f128126j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128125i);
                                        f128126j = e2Var;
                                    }
                                } finally {
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$g, reason: collision with other inner class name */
            public static final class C1278g extends i3<C1278g, C1279a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final C1278g f128130i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<C1278g> f128131j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128132f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128133g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128134h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$g$a, reason: collision with other inner class name */
                public static final class C1279a extends i3.a<C1278g, C1279a> implements v4 {
                    private C1279a() {
                        super(C1278g.f128130i);
                    }

                    /* synthetic */ C1279a(byte b10) {
                        this();
                    }
                }

                static {
                    C1278g c1278g = new C1278g();
                    f128130i = c1278g;
                    i3.z(C1278g.class, c1278g);
                }

                private C1278g() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128130i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new C1278g();
                        case NEW_BUILDER:
                            return new C1279a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128130i;
                        case GET_PARSER:
                            c5<C1278g> c5Var = f128131j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (C1278g.class) {
                                try {
                                    e2Var = f128131j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128130i);
                                        f128131j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class h extends i3<h, C1280a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final h f128135i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<h> f128136j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128137f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128138g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f128139h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$h$a, reason: collision with other inner class name */
                public static final class C1280a extends i3.a<h, C1280a> implements v4 {
                    private C1280a() {
                        super(h.f128135i);
                    }

                    /* synthetic */ C1280a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128140b = new b("UNKNOWN_CODE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128141c = new b("SUCCESS", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128142d = new b("UNEXPECTED_ERROR", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f128143e = new b("FILE_FORMAT_ERROR", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final b f128144f = new b("FILE_READ_ERROR", 4, 4);

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private static final b f128145g = new b("FILE_UNEXPECTED_EOF", 5, 5);

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private static final b f128146h = new b("FILE_WRITE_ERROR", 6, 6);

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private static final b f128147i = new b("BUSY_ERROR", 7, 7);

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private static final b f128148j = new b("NETWORK_ERROR", 8, 8);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128149a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128149a = i11;
                    }

                    public static b b(int i10) {
                        switch (i10) {
                            case 0:
                                return f128140b;
                            case 1:
                                return f128141c;
                            case 2:
                                return f128142d;
                            case 3:
                                return f128143e;
                            case 4:
                                return f128144f;
                            case 5:
                                return f128145g;
                            case 6:
                                return f128146h;
                            case 7:
                                return f128147i;
                            case 8:
                                return f128148j;
                            default:
                                return null;
                        }
                    }

                    public static p3 k() {
                        return i1.f129425a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128149a;
                    }
                }

                static {
                    h hVar = new h();
                    f128135i = hVar;
                    i3.z(h.class, hVar);
                }

                private h() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128135i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new h();
                        case NEW_BUILDER:
                            return new C1280a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128135i;
                        case GET_PARSER:
                            c5<h> c5Var = f128136j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (h.class) {
                                try {
                                    e2Var = f128136j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128135i);
                                        f128136j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class i implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final i f128150b = new i("UNKNOWN_STEREO_MODE", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final i f128151c = new i("MONO", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final i f128152d = new i("LEFT_RIGHT", 2, 2);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final i f128153e = new i("TOP_BOTTOM", 3, 3);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f128154a;

                private i(String str, int i10, int i11) {
                    super(str, i10);
                    this.f128154a = i11;
                }

                public static i b(int i10) {
                    if (i10 == 0) {
                        return f128150b;
                    }
                    if (i10 == 1) {
                        return f128151c;
                    }
                    if (i10 == 2) {
                        return f128152d;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return f128153e;
                }

                public static p3 k() {
                    return j1.f129455a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f128154a;
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class j implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final j f128155b = new j("UNKNOWN_VIDEO_CODEC", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final j f128156c = new j("H264", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final j f128157d = new j("H265", 2, 2);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final j f128158e = new j("DNXHR", 3, 3);

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static final j f128159f = new j("PRORES", 4, 4);

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static final j f128160g = new j("CINEFORM", 5, 5);

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final j f128161h = new j("VP9", 6, 6);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f128162a;

                private j(String str, int i10, int i11) {
                    super(str, i10);
                    this.f128162a = i11;
                }

                public static j b(int i10) {
                    switch (i10) {
                        case 0:
                            return f128155b;
                        case 1:
                            return f128156c;
                        case 2:
                            return f128157d;
                        case 3:
                            return f128158e;
                        case 4:
                            return f128159f;
                        case 5:
                            return f128160g;
                        case 6:
                            return f128161h;
                        default:
                            return null;
                    }
                }

                public static p3 k() {
                    return k1.f129464a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f128162a;
                }
            }

            public static final class k extends i3<k, C1281a> implements v4 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private static final k f128163n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static volatile c5<k> f128164o;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128165f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private l f128166g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private c f128167h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f128168i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f128169j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private int f128170k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private int f128171l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private h f128172m;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$k$a, reason: collision with other inner class name */
                public static final class C1281a extends i3.a<k, C1281a> implements v4 {
                    private C1281a() {
                        super(k.f128163n);
                    }

                    /* synthetic */ C1281a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128173b = new b("UNKNOWN_MOTION_MODE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128174c = new b("APPLY_NONE", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128175d = new b("APPLY_ALL", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f128176e = new b("SPEED_FILTERED_YAW", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final b f128177f = new b("FREQUENCY_FILTERED_YAW", 4, 4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128178a;

                    static {
                        int i10 = 1 & 2;
                    }

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128178a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128173b;
                        }
                        if (i10 == 1) {
                            return f128174c;
                        }
                        if (i10 == 2) {
                            return f128175d;
                        }
                        if (i10 == 3) {
                            return f128176e;
                        }
                        if (i10 != 4) {
                            return null;
                        }
                        return f128177f;
                    }

                    public static p3 k() {
                        return l1.f129473a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128178a;
                    }
                }

                static {
                    k kVar = new k();
                    f128163n = kVar;
                    i3.z(k.class, kVar);
                }

                private k() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128163n, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004\u0006\f\u0005\u0007\t\u0006", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", i.k(), "e", j.k(), RequestParams.F, n.k(), "g", b.k(), androidx.media3.exoplayer.upstream.h.f65993g});
                        case NEW_MUTABLE_INSTANCE:
                            return new k();
                        case NEW_BUILDER:
                            return new C1281a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128163n;
                        case GET_PARSER:
                            c5<k> c5Var = f128164o;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (k.class) {
                                try {
                                    e2Var = f128164o;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128163n);
                                        f128164o = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class l extends i3<l, C1282a> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final l f128179k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<l> f128180l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128181f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private long f128182g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private C1278g f128183h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f128184i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private b f128185j;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$l$a, reason: collision with other inner class name */
                public static final class C1282a extends i3.a<l, C1282a> implements v4 {
                    private C1282a() {
                        super(l.f128179k);
                    }

                    /* synthetic */ C1282a(byte b10) {
                        this();
                    }
                }

                public static final class b extends i3<b, C1283a> implements v4 {

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    private static final b f128186k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    private static volatile c5<b> f128187l;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private int f128188f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private int f128189g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private c f128190h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private c f128191i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private boolean f128192j;

                    /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$l$b$a, reason: collision with other inner class name */
                    public static final class C1283a extends i3.a<b, C1283a> implements v4 {
                        private C1283a() {
                            super(b.f128186k);
                        }

                        /* synthetic */ C1283a(byte b10) {
                            this();
                        }
                    }

                    /* JADX WARN: $VALUES field not found */
                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$l$b$b, reason: collision with other inner class name */
                    public static final class EnumC1284b implements n3 {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static final EnumC1284b f128193b = new EnumC1284b("UNKNOWN_PROJECTION", 0, 0);

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private static final EnumC1284b f128194c = new EnumC1284b("RECTANGULAR", 1, 1);

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static final EnumC1284b f128195d = new EnumC1284b("EQUIRECTANGULAR", 2, 2);

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static final EnumC1284b f128196e = new EnumC1284b("CUBE_MAP", 3, 3);

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        private static final EnumC1284b f128197f = new EnumC1284b("MESH", 4, 4);

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private final int f128198a;

                        private EnumC1284b(String str, int i10, int i11) {
                            super(str, i10);
                            this.f128198a = i11;
                        }

                        public static EnumC1284b b(int i10) {
                            if (i10 == 0) {
                                return f128193b;
                            }
                            if (i10 == 1) {
                                return f128194c;
                            }
                            if (i10 == 2) {
                                return f128195d;
                            }
                            if (i10 == 3) {
                                return f128196e;
                            }
                            if (i10 != 4) {
                                return null;
                            }
                            return f128197f;
                        }

                        public static p3 k() {
                            return m1.f129481a;
                        }

                        @Override // com.google.vr.sdk.deps.n3
                        public final int i() {
                            return this.f128198a;
                        }
                    }

                    static {
                        b bVar = new b();
                        f128186k = bVar;
                        i3.z(b.class, bVar);
                    }

                    private b() {
                    }

                    @Override // com.google.vr.sdk.deps.i3
                    protected final Object l(i3.d dVar, Object obj, Object obj2) {
                        c5 e2Var;
                        switch (dVar) {
                            case GET_MEMOIZED_IS_INITIALIZED:
                                return (byte) 1;
                            case SET_MEMOIZED_IS_INITIALIZED:
                                return null;
                            case BUILD_MESSAGE_INFO:
                                return i3.w(f128186k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", EnumC1284b.k(), "c", "d", "e"});
                            case NEW_MUTABLE_INSTANCE:
                                return new b();
                            case NEW_BUILDER:
                                return new C1283a((byte) 0);
                            case GET_DEFAULT_INSTANCE:
                                return f128186k;
                            case GET_PARSER:
                                c5<b> c5Var = f128187l;
                                if (c5Var != null) {
                                    return c5Var;
                                }
                                synchronized (b.class) {
                                    try {
                                        e2Var = f128187l;
                                        if (e2Var == null) {
                                            e2Var = new e2(f128186k);
                                            f128187l = e2Var;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                    break;
                                }
                                return e2Var;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }
                }

                static {
                    l lVar = new l();
                    f128179k = lVar;
                    i3.z(l.class, lVar);
                }

                private l() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128179k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0000\u0002\t\u0001\u0003\f\u0002\u0004\t\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", j.k(), "e"});
                        case NEW_MUTABLE_INSTANCE:
                            return new l();
                        case NEW_BUILDER:
                            return new C1282a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128179k;
                        case GET_PARSER:
                            c5<l> c5Var = f128180l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (l.class) {
                                try {
                                    e2Var = f128180l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128179k);
                                        f128180l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class m extends i3<m, C1285a> implements v4 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private static final m f128199n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static volatile c5<m> f128200o;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128201f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private l f128202g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128203h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private c f128204i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private boolean f128205j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private int f128206k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private int f128207l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private h f128208m;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g$m$a, reason: collision with other inner class name */
                public static final class C1285a extends i3.a<m, C1285a> implements v4 {
                    private C1285a() {
                        super(m.f128199n);
                    }

                    /* synthetic */ C1285a(byte b10) {
                        this();
                    }
                }

                static {
                    m mVar = new m();
                    f128199n = mVar;
                    i3.z(m.class, mVar);
                }

                private m() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128199n, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\f\u0004\u0006\f\u0005\u0007\t\u0006", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", i.k(), "d", "e", RequestParams.F, j.k(), "g", n.k(), androidx.media3.exoplayer.upstream.h.f65993g});
                        case NEW_MUTABLE_INSTANCE:
                            return new m();
                        case NEW_BUILDER:
                            return new C1285a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128199n;
                        case GET_PARSER:
                            c5<m> c5Var = f128200o;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (m.class) {
                                try {
                                    e2Var = f128200o;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128199n);
                                        f128200o = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class n implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final n f128209b = new n("UNKNOWN_VIDEO_QUALITY", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final n f128210c = new n("LOW", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final n f128211d = new n("STANDARD", 2, 2);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final n f128212e = new n("HIGH", 3, 3);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f128213a;

                private n(String str, int i10, int i11) {
                    super(str, i10);
                    this.f128213a = i11;
                }

                public static n b(int i10) {
                    if (i10 == 0) {
                        return f128209b;
                    }
                    if (i10 == 1) {
                        return f128210c;
                    }
                    if (i10 == 2) {
                        return f128211d;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return f128212e;
                }

                public static p3 k() {
                    return n1.f129489a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f128213a;
                }
            }

            static {
                g gVar = new g();
                f128091m = gVar;
                i3.z(g.class, gVar);
            }

            private g() {
            }

            public static c5<g> B() {
                return f128091m.r();
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128091m, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F, "g"});
                    case NEW_MUTABLE_INSTANCE:
                        return new g();
                    case NEW_BUILDER:
                        return new C1271a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128091m;
                    case GET_PARSER:
                        c5<g> c5Var = f128092n;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (g.class) {
                            try {
                                e2Var = f128092n;
                                if (e2Var == null) {
                                    e2Var = new e2(f128091m);
                                    f128092n = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class g0 extends i3<g0, C1286a> implements v4 {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final g0 f128214j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static volatile c5<g0> f128215k;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128216f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f128217g = "";

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private String f128218h = "";

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private String f128219i = "";

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$g0$a, reason: collision with other inner class name */
            public static final class C1286a extends i3.a<g0, C1286a> implements v4 {
                private C1286a() {
                    super(g0.f128214j);
                }

                /* synthetic */ C1286a(byte b10) {
                    this();
                }
            }

            static {
                g0 g0Var = new g0();
                f128214j = g0Var;
                i3.z(g0.class, g0Var);
            }

            private g0() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128214j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d"});
                    case NEW_MUTABLE_INSTANCE:
                        return new g0();
                    case NEW_BUILDER:
                        return new C1286a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128214j;
                    case GET_PARSER:
                        c5<g0> c5Var = f128215k;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (g0.class) {
                            try {
                                e2Var = f128215k;
                                if (e2Var == null) {
                                    e2Var = new e2(f128214j);
                                    f128215k = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class h extends i3<h, C1287a> implements v4 {
            private static final h X;
            private static volatile c5<h> Y;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128220f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private long f128221g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f128222h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f128223i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private C1238a f128224j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private int f128225k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private C1238a f128226l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private d f128227m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private e f128228n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private boolean f128229o;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private b f128230s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private int f128231t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private g f128232v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private int f128233w;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$h$a, reason: collision with other inner class name */
            public static final class C1287a extends i3.a<h, C1287a> implements v4 {
                private C1287a() {
                    super(h.X);
                }

                /* synthetic */ C1287a(byte b10) {
                    this();
                }
            }

            public static final class b extends i3<b, C1288a> implements v4 {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final b f128234h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static volatile c5<b> f128235i;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128236f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private boolean f128237g;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$h$b$a, reason: collision with other inner class name */
                public static final class C1288a extends i3.a<b, C1288a> implements v4 {
                    private C1288a() {
                        super(b.f128234h);
                    }

                    /* synthetic */ C1288a(byte b10) {
                        this();
                    }
                }

                static {
                    b bVar = new b();
                    f128234h = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128234h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007\u0000", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b"});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1288a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128234h;
                        case GET_PARSER:
                            c5<b> c5Var = f128235i;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f128235i;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128234h);
                                        f128235i = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class c implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final c f128238b = new c("UNKNOWN_COMPOSITION_TYPE", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final c f128239c = new c("CARDBOARD_COMPOSITION", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final c f128240d = new c("IN_PROCESS_COMPOSITION", 2, 2);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final c f128241e = new c("OUT_OF_PROCESS_COMPOSITION", 3, 3);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f128242a;

                private c(String str, int i10, int i11) {
                    super(str, i10);
                    this.f128242a = i11;
                }

                public static c b(int i10) {
                    if (i10 == 0) {
                        return f128238b;
                    }
                    if (i10 == 1) {
                        return f128239c;
                    }
                    if (i10 == 2) {
                        return f128240d;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return f128241e;
                }

                public static p3 k() {
                    return o1.f129510a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f128242a;
                }
            }

            public static final class d extends i3<d, C1289a> implements v4 {
                private static volatile c5<d> H1;

                /* JADX INFO: renamed from: p1, reason: collision with root package name */
                private static final d f128243p1;
                private int X;
                private int Y;
                private int Z;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128244f;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private boolean f128250l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private int f128251m;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private int f128253o;

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                private int f128254p0;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private int f128255s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private int f128256t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                private int f128257v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                private int f128258w;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private String f128245g = "";

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private String f128246h = "";

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private String f128247i = "";

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private String f128248j = "";

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private String f128249k = "";

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private String f128252n = "";

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$h$d$a, reason: collision with other inner class name */
                public static final class C1289a extends i3.a<d, C1289a> implements v4 {
                    private C1289a() {
                        super(d.f128243p1);
                    }

                    /* synthetic */ C1289a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128259b = new b("AXIS_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128260c = new b("AXIS_X", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128261d = new b("AXIS_Y", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f128262e = new b("AXIS_Z", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128263a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128263a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128259b;
                        }
                        if (i10 == 1) {
                            return f128260c;
                        }
                        if (i10 == 2) {
                            return f128261d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f128262e;
                    }

                    public static p3 k() {
                        return p1.f129537a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128263a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f128264b = new c("SENSOR_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f128265c = new c("SENSOR_ACCEL", 1, 2);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final c f128266d = new c("SENSOR_GYRO", 2, 1);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128267a;

                    static {
                        int i10 = 7 & 2;
                    }

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128267a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f128264b;
                        }
                        if (i10 == 1) {
                            return f128266d;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128265c;
                    }

                    public static p3 k() {
                        return q1.f129554a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128267a;
                    }
                }

                static {
                    d dVar = new d();
                    f128243p1 = dVar;
                    i3.z(d.class, dVar);
                }

                private d() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128243p1, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0004\u0006\u0007\b\u0007\b\u0004\b\t\u0004\t\n\u0004\n\u000b\u0004\u000b\f\f\f\r\f\r\u000e\u0004\u000e\u000f\u0004\u000f\u0010\u0007\u0005\u0011\u0004\u0010", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F, androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k, "j", "k", androidx.media3.exoplayer.upstream.h.f65996j, androidx.media3.exoplayer.upstream.h.f66001o, "n", c.k(), "o", b.k(), "p", "q", "g", "r"});
                        case NEW_MUTABLE_INSTANCE:
                            return new d();
                        case NEW_BUILDER:
                            return new C1289a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128243p1;
                        case GET_PARSER:
                            c5<d> c5Var = H1;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (d.class) {
                                try {
                                    e2Var = H1;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128243p1);
                                        H1 = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class e extends i3<e, C1290a> implements v4 {

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private static final e f128268m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private static volatile c5<e> f128269n;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128270f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128271g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f128272h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private String f128273i = "";

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private C1238a f128274j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private f7.a f128275k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private b f128276l;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$h$e$a, reason: collision with other inner class name */
                public static final class C1290a extends i3.a<e, C1290a> implements v4 {
                    private C1290a() {
                        super(e.f128268m);
                    }

                    /* synthetic */ C1290a(byte b10) {
                        this();
                    }
                }

                public static final class b extends i3<b, C1291a> implements v4 {

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private static final b f128277i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private static volatile c5<b> f128278j;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private int f128279f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private int f128280g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private boolean f128281h;

                    /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$h$e$b$a, reason: collision with other inner class name */
                    public static final class C1291a extends i3.a<b, C1291a> implements v4 {
                        private C1291a() {
                            super(b.f128277i);
                        }

                        /* synthetic */ C1291a(byte b10) {
                            this();
                        }
                    }

                    /* JADX WARN: $VALUES field not found */
                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$h$e$b$b, reason: collision with other inner class name */
                    public static final class EnumC1292b implements n3 {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static final EnumC1292b f128282b = new EnumC1292b("UNKNOWN", 0, 0);

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private static final EnumC1292b f128283c = new EnumC1292b("RETURN_TO_PREV_VR_ACTIVITY", 1, 1);

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static final EnumC1292b f128284d = new EnumC1292b("LAUNCH_VR_ACTIVITY", 2, 2);

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static final EnumC1292b f128285e = new EnumC1292b("LAUNCH_VR_HOME", 3, 3);

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        private static final EnumC1292b f128286f = new EnumC1292b("LAUNCH_2D_ACTIVITY", 4, 4);

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        private static final EnumC1292b f128287g = new EnumC1292b("LAUNCH_FEEDBACK", 5, 7);

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        private static final EnumC1292b f128288h = new EnumC1292b("ACTIVITY_STOPPED", 6, 5);

                        /* JADX INFO: renamed from: i, reason: collision with root package name */
                        private static final EnumC1292b f128289i = new EnumC1292b("SYSUI_SERVICE_STOPPED", 7, 6);

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private final int f128290a;

                        private EnumC1292b(String str, int i10, int i11) {
                            super(str, i10);
                            this.f128290a = i11;
                        }

                        public static EnumC1292b b(int i10) {
                            switch (i10) {
                                case 0:
                                    return f128282b;
                                case 1:
                                    return f128283c;
                                case 2:
                                    return f128284d;
                                case 3:
                                    return f128285e;
                                case 4:
                                    return f128286f;
                                case 5:
                                    return f128288h;
                                case 6:
                                    return f128289i;
                                case 7:
                                    return f128287g;
                                default:
                                    return null;
                            }
                        }

                        public static p3 k() {
                            return r1.f129562a;
                        }

                        @Override // com.google.vr.sdk.deps.n3
                        public final int i() {
                            return this.f128290a;
                        }
                    }

                    static {
                        b bVar = new b();
                        f128277i = bVar;
                        i3.z(b.class, bVar);
                    }

                    private b() {
                    }

                    @Override // com.google.vr.sdk.deps.i3
                    protected final Object l(i3.d dVar, Object obj, Object obj2) {
                        c5 e2Var;
                        switch (dVar) {
                            case GET_MEMOIZED_IS_INITIALIZED:
                                return (byte) 1;
                            case SET_MEMOIZED_IS_INITIALIZED:
                                return null;
                            case BUILD_MESSAGE_INFO:
                                return i3.w(f128277i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", EnumC1292b.k(), "c"});
                            case NEW_MUTABLE_INSTANCE:
                                return new b();
                            case NEW_BUILDER:
                                return new C1291a((byte) 0);
                            case GET_DEFAULT_INSTANCE:
                                return f128277i;
                            case GET_PARSER:
                                c5<b> c5Var = f128278j;
                                if (c5Var != null) {
                                    return c5Var;
                                }
                                synchronized (b.class) {
                                    try {
                                        e2Var = f128278j;
                                        if (e2Var == null) {
                                            e2Var = new e2(f128277i);
                                            f128278j = e2Var;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                    break;
                                }
                                return e2Var;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f128291b = new c("UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f128292c = new c("DASHBOARD_STARTED", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final c f128293d = new c("DASHBOARD_RENDERED", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final c f128294e = new c("DASHBOARD_DISMISSED", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128295a;

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128295a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f128291b;
                        }
                        if (i10 == 1) {
                            return f128292c;
                        }
                        if (i10 == 2) {
                            return f128293d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f128294e;
                    }

                    public static p3 k() {
                        return s1.f129569a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128295a;
                    }
                }

                static {
                    e eVar = new e();
                    f128268m = eVar;
                    i3.z(e.class, eVar);
                }

                private e() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128268m, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", c.k(), "c", "d", "e", RequestParams.F, "g"});
                        case NEW_MUTABLE_INSTANCE:
                            return new e();
                        case NEW_BUILDER:
                            return new C1290a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128268m;
                        case GET_PARSER:
                            c5<e> c5Var = f128269n;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (e.class) {
                                try {
                                    e2Var = f128269n;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128268m);
                                        f128269n = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class f implements n3 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f128345a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final f f128297b = new f("UNKNOWN_ERROR", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final f f128299c = new f("BAD_STATE", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final f f128301d = new f("ERROR_2", 2, 2);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final f f128303e = new f("ERROR_3", 3, 3);

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static final f f128305f = new f("ERROR_4", 4, 4);

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static final f f128307g = new f("ERROR_5", 5, 5);

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final f f128310h = new f("ERROR_6", 6, 6);

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final f f128313i = new f("ERROR_7", 7, 7);

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final f f128315j = new f("ERROR_8", 8, 8);

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final f f128317k = new f("CONTROLLER_BATTERY_TOO_LOW", 9, 101);

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static final f f128319l = new f("CONTROLLER_BLUETOOTH_ERROR", 10, 102);

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private static final f f128321m = new f("CONTROLLER_BLUETOOTH_OFF", 11, com.planner5d.library.engine.input.f.b.f160733u1);

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private static final f f128323n = new f("CONTROLLER_BOND_FAILED", 12, 104);

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static final f f128325o = new f("CONTROLLER_CONNECTION_FAILURE", 13, 105);

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private static final f f128333s = new f("CONTROLLER_HANDSHAKE_FAILURE", 14, com.planner5d.library.engine.input.f.b.f160742x1);

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private static final f f128335t = new f("CONTROLLER_INSUFFICIENT_PERMS", 15, com.planner5d.library.engine.input.f.b.f160745y1);

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                private static final f f128338v = new f("CONTROLLER_LOST_CONNECTION", 16, 108);

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                private static final f f128340w = new f("CONTROLLER_MISMATCH", 17, 109);
                private static final f X = new f("CONTROLLER_NOT_FOUND", 18, 110);
                private static final f Y = new f("CONTROLLER_PROTOCOL_FAILURE", 19, com.rabbitmq.client.impl.k.b.p.f265340a);
                private static final f Z = new f("CONTROLLER_TIMEOUT", 20, com.planner5d.library.engine.input.f.b.B);

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                private static final f f128327p0 = new f("CONTROLLER_FIRMWARE_ERROR", 21, 113);

                /* JADX INFO: renamed from: p1, reason: collision with root package name */
                private static final f f128328p1 = new f("CONTROLLER_INVALID_MANUFACTURER", 22, 114);
                private static final f H1 = new f("CONTROLLER_OTA_SERVICE_ERROR", 23, 115);

                /* JADX INFO: renamed from: p2, reason: collision with root package name */
                private static final f f128329p2 = new f("CONTROLLER_BLUETOOTH_SCAN_FAILURE", 24, androidx.media3.extractor.metadata.dvbsi.b.f67479d);

                /* JADX INFO: renamed from: g3, reason: collision with root package name */
                private static final f f128308g3 = new f("CONTROLLER_CREATE_BOND_FAILURE", 25, me.relex.circleindicator.a.f332619e);

                /* JADX INFO: renamed from: h3, reason: collision with root package name */
                private static final f f128311h3 = new f("CONTROLLER_NOT_BONDED", 26, 118);

                /* JADX INFO: renamed from: i3, reason: collision with root package name */
                private static final f f128314i3 = new f("CONTROLLER_UNSUPPORTED", 27, 119);

                /* JADX INFO: renamed from: j3, reason: collision with root package name */
                private static final f f128316j3 = new f("CONTROLLER_INFO_READ_ERROR", 28, 120);

                /* JADX INFO: renamed from: k3, reason: collision with root package name */
                private static final f f128318k3 = new f("CONTROLLER_GATT_DISCOVERY_FAILED", 29, 121);

                /* JADX INFO: renamed from: l3, reason: collision with root package name */
                private static final f f128320l3 = new f("CONTROLLER_GATT_SERVICE_NOT_FOUND", 30, 122);

                /* JADX INFO: renamed from: m3, reason: collision with root package name */
                private static final f f128322m3 = new f("CONTROLLER_GATT_CHARACTERISTIC_NOT_FOUND", 31, 123);

                /* JADX INFO: renamed from: n3, reason: collision with root package name */
                private static final f f128324n3 = new f("CONTROLLER_GATT_NOTIFY_FAILED", 32, 124);

                /* JADX INFO: renamed from: o3, reason: collision with root package name */
                private static final f f128326o3 = new f("CONTROLLER_BATTERY_READ_FAILED", 33, 125);

                /* JADX INFO: renamed from: p3, reason: collision with root package name */
                private static final f f128330p3 = new f("CONTROLLER_STUCK", 34, okhttp3.internal.ws.g.f334652s);

                /* JADX INFO: renamed from: q3, reason: collision with root package name */
                private static final f f128331q3 = new f("CONTROLLER_UNSTUCK", 35, 127);

                /* JADX INFO: renamed from: r3, reason: collision with root package name */
                private static final f f128332r3 = new f("CONTROLLER_LAG", 36, 128);

                /* JADX INFO: renamed from: s3, reason: collision with root package name */
                private static final f f128334s3 = new f("CONTROLLER_CONNECT_AFTER_LOST_CONNECTION", 37, 129);

                /* JADX INFO: renamed from: t3, reason: collision with root package name */
                private static final f f128336t3 = new f("DAYDREAM_TRACKING_ACQUISITION_FAILED", 38, 151);

                /* JADX INFO: renamed from: u3, reason: collision with root package name */
                private static final f f128337u3 = new f("DAYDREAM_TRACKING_TRANSITIONAL_FAILED", 39, 152);

                /* JADX INFO: renamed from: v3, reason: collision with root package name */
                private static final f f128339v3 = new f("DAYDREAM_TRACKING_HANDOFF_FAILED", 40, 153);

                /* JADX INFO: renamed from: w3, reason: collision with root package name */
                private static final f f128341w3 = new f("DON_BAD_POSE", 41, 176);

                /* JADX INFO: renamed from: x3, reason: collision with root package name */
                private static final f f128342x3 = new f("DON_BLUETOOTH_OFF", 42, 177);

                /* JADX INFO: renamed from: y3, reason: collision with root package name */
                private static final f f128343y3 = new f("DON_CANCELLED", 43, 178);

                /* JADX INFO: renamed from: z3, reason: collision with root package name */
                private static final f f128344z3 = new f("DON_DAYDREAM_APP_INSTALLING", 44, 179);
                private static final f A3 = new f("DON_DAYDREAM_APP_NOT_PRESENT", 45, 180);
                private static final f B3 = new f("DON_DAYDREAM_APP_OUT_OF_DATE", 46, 181);
                private static final f C3 = new f("DON_DAYDREAM_SETUP_NOT_COMPLETE", 47, 182);
                private static final f D3 = new f("DON_DEVICE_INCOMPATIBLE", 48, 183);
                private static final f E3 = new f("DON_HEADSET_INCOMPATIBLE", 49, 184);
                private static final f F3 = new f("DON_LOCATION_OFF", 50, 185);
                private static final f G3 = new f("DON_MISSING_PERMISSION", 51, 186);
                private static final f H3 = new f("DON_NFC_OFF", 52, 187);
                private static final f I3 = new f("DON_VRCORE_OUT_OF_DATE", 53, 188);
                private static final f J3 = new f("DON_VR_KEYBOARD_NOT_PRESENT", 54, 189);
                private static final f K3 = new f("DON_APP_INCOMPATIBLE", 55, com.facebook.internal.p.f100029m);
                private static final f L3 = new f("DON_SYSTEM_UPDATE_REQUESTED", 56, 191);
                private static final f M3 = new f("DON_INVALID_RESOLUTION", 57, 192);
                private static final f N3 = new f("EMPTY_PLAYLOAD", 58, 201);
                private static final f O3 = new f("INVALID_PLAYLOAD", 59, 202);
                private static final f P3 = new f("LAUNCH_FAILURE", 60, 203);
                private static final f Q3 = new f("NO_ZEN_RULE", 61, 301);
                private static final f R3 = new f("INVALID_READ", 62, 401);
                private static final f S3 = new f("DISALLOWED_WRITE", 63, 402);
                private static final f T3 = new f("CAPTURE_CAST_FAILED", 64, 501);
                private static final f U3 = new f("CAPTURE_CAST_SESSION_INTERRUPTED", 65, 502);
                private static final f V3 = new f("CAPTURE_CAST_SESSION_INTERRUPTED_DOFF", 66, 503);
                private static final f W3 = new f("RECORDING_EXCEPTIONAL_ERROR", 67, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
                private static final f X3 = new f("RECORDING_CHORDING_DISABLED", 68, 511);
                private static final f Y3 = new f("RECORDING_INVALID_TOKEN", 69, 512);
                private static final f Z3 = new f("RECORDING_ADB_DISABLED", 70, androidx.core.view.f0.f48707j);

                /* JADX INFO: renamed from: a4, reason: collision with root package name */
                private static final f f128296a4 = new f("RECORDING_FS_PERMISSION_MISSING", 71, 514);

                /* JADX INFO: renamed from: b4, reason: collision with root package name */
                private static final f f128298b4 = new f("RECORDING_BLACKLISTED", 72, com.badlogic.gdx.graphics.g3d.shaders.b.f94481i4);

                /* JADX INFO: renamed from: c4, reason: collision with root package name */
                private static final f f128300c4 = new f("SCREENSHOT_CANCELLED", 73, 520);

                /* JADX INFO: renamed from: d4, reason: collision with root package name */
                private static final f f128302d4 = new f("VIDEO_START_FAILURE", 74, 521);

                /* JADX INFO: renamed from: e4, reason: collision with root package name */
                private static final f f128304e4 = new f("VIDEO_STOP_FAILURE", 75, 522);

                /* JADX INFO: renamed from: f4, reason: collision with root package name */
                private static final f f128306f4 = new f("VIDEO_TIMEOUT", 76, 523);

                /* JADX INFO: renamed from: g4, reason: collision with root package name */
                private static final f f128309g4 = new f("RECORDING_INVALID_PATH", 77, 524);

                /* JADX INFO: renamed from: h4, reason: collision with root package name */
                private static final f f128312h4 = new f("RECORD_ERROR_QUOTA", 78, 525);

                private f(String str, int i10, int i11) {
                    super(str, i10);
                    this.f128345a = i11;
                }

                public static f b(int i10) {
                    if (i10 == 301) {
                        return Q3;
                    }
                    if (i10 == 401) {
                        return R3;
                    }
                    if (i10 == 402) {
                        return S3;
                    }
                    switch (i10) {
                        case 0:
                            return f128297b;
                        case 1:
                            return f128299c;
                        case 2:
                            return f128301d;
                        case 3:
                            return f128303e;
                        case 4:
                            return f128305f;
                        case 5:
                            return f128307g;
                        case 6:
                            return f128310h;
                        case 7:
                            return f128313i;
                        case 8:
                            return f128315j;
                        default:
                            switch (i10) {
                                case 101:
                                    return f128317k;
                                case 102:
                                    return f128319l;
                                case com.planner5d.library.engine.input.f.b.f160733u1 /* 103 */:
                                    return f128321m;
                                case 104:
                                    return f128323n;
                                case 105:
                                    return f128325o;
                                case com.planner5d.library.engine.input.f.b.f160742x1 /* 106 */:
                                    return f128333s;
                                case com.planner5d.library.engine.input.f.b.f160745y1 /* 107 */:
                                    return f128335t;
                                case 108:
                                    return f128338v;
                                case 109:
                                    return f128340w;
                                case 110:
                                    return X;
                                case com.rabbitmq.client.impl.k.b.p.f265340a /* 111 */:
                                    return Y;
                                case com.planner5d.library.engine.input.f.b.B /* 112 */:
                                    return Z;
                                case 113:
                                    return f128327p0;
                                case 114:
                                    return f128328p1;
                                case 115:
                                    return H1;
                                case androidx.media3.extractor.metadata.dvbsi.b.f67479d /* 116 */:
                                    return f128329p2;
                                case me.relex.circleindicator.a.f332619e /* 117 */:
                                    return f128308g3;
                                case 118:
                                    return f128311h3;
                                case 119:
                                    return f128314i3;
                                case 120:
                                    return f128316j3;
                                case 121:
                                    return f128318k3;
                                case 122:
                                    return f128320l3;
                                case 123:
                                    return f128322m3;
                                case 124:
                                    return f128324n3;
                                case 125:
                                    return f128326o3;
                                case okhttp3.internal.ws.g.f334652s /* 126 */:
                                    return f128330p3;
                                case 127:
                                    return f128331q3;
                                case 128:
                                    return f128332r3;
                                case 129:
                                    return f128334s3;
                                default:
                                    switch (i10) {
                                        case 151:
                                            return f128336t3;
                                        case 152:
                                            return f128337u3;
                                        case 153:
                                            return f128339v3;
                                        default:
                                            switch (i10) {
                                                case 176:
                                                    return f128341w3;
                                                case 177:
                                                    return f128342x3;
                                                case 178:
                                                    return f128343y3;
                                                case 179:
                                                    return f128344z3;
                                                case 180:
                                                    return A3;
                                                case 181:
                                                    return B3;
                                                case 182:
                                                    return C3;
                                                case 183:
                                                    return D3;
                                                case 184:
                                                    return E3;
                                                case 185:
                                                    return F3;
                                                case 186:
                                                    return G3;
                                                case 187:
                                                    return H3;
                                                case 188:
                                                    return I3;
                                                case 189:
                                                    return J3;
                                                case com.facebook.internal.p.f100029m /* 190 */:
                                                    return K3;
                                                case 191:
                                                    return L3;
                                                case 192:
                                                    return M3;
                                                default:
                                                    switch (i10) {
                                                        case 201:
                                                            return N3;
                                                        case 202:
                                                            return O3;
                                                        case 203:
                                                            return P3;
                                                        default:
                                                            switch (i10) {
                                                                case 501:
                                                                    return T3;
                                                                case 502:
                                                                    return U3;
                                                                case 503:
                                                                    return V3;
                                                                default:
                                                                    switch (i10) {
                                                                        case androidx.constraintlayout.core.motion.utils.v.g.f44098r /* 510 */:
                                                                            return W3;
                                                                        case 511:
                                                                            return X3;
                                                                        case 512:
                                                                            return Y3;
                                                                        case androidx.core.view.f0.f48707j /* 513 */:
                                                                            return Z3;
                                                                        case 514:
                                                                            return f128296a4;
                                                                        case com.badlogic.gdx.graphics.g3d.shaders.b.f94481i4 /* 515 */:
                                                                            return f128298b4;
                                                                        default:
                                                                            switch (i10) {
                                                                                case 520:
                                                                                    return f128300c4;
                                                                                case 521:
                                                                                    return f128302d4;
                                                                                case 522:
                                                                                    return f128304e4;
                                                                                case 523:
                                                                                    return f128306f4;
                                                                                case 524:
                                                                                    return f128309g4;
                                                                                case 525:
                                                                                    return f128312h4;
                                                                                default:
                                                                                    return null;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                }

                public static p3 k() {
                    return t1.f129577a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f128345a;
                }
            }

            public static final class g extends i3<g, C1293a> implements v4 {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final g f128346h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static volatile c5<g> f128347i;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128348f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128349g;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$h$g$a, reason: collision with other inner class name */
                public static final class C1293a extends i3.a<g, C1293a> implements v4 {
                    private C1293a() {
                        super(g.f128346h);
                    }

                    /* synthetic */ C1293a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128350b = new b("LOCK_SCREEN_EVENT_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128351c = new b("LOCK_SCREEN_EVENT_SHOWN", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128352d = new b("LOCK_SCREEN_EVENT_UNLOCKED", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128353a;

                    static {
                        int i10 = 5 ^ 0;
                    }

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128353a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128350b;
                        }
                        if (i10 == 1) {
                            return f128351c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128352d;
                    }

                    public static p3 k() {
                        return u1.f129610a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128353a;
                    }
                }

                static {
                    g gVar = new g();
                    f128346h = gVar;
                    i3.z(g.class, gVar);
                }

                private g() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128346h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k()});
                        case NEW_MUTABLE_INSTANCE:
                            return new g();
                        case NEW_BUILDER:
                            return new C1293a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128346h;
                        case GET_PARSER:
                            c5<g> c5Var = f128347i;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (g.class) {
                                try {
                                    e2Var = f128347i;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128346h);
                                        f128347i = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$h$h, reason: collision with other inner class name */
            public static final class EnumC1294h implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final EnumC1294h f128354b = new EnumC1294h("UNKNOWN_PERMISSION", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final EnumC1294h f128355c = new EnumC1294h("ACCESS_COARSE_LOCATION", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final EnumC1294h f128356d = new EnumC1294h("CAMERA", 2, 2);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final EnumC1294h f128357e = new EnumC1294h("READ_EXTERNAL_STORAGE", 3, 3);

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static final EnumC1294h f128358f = new EnumC1294h("WRITE_EXTERNAL_STORAGE", 4, 4);

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static final EnumC1294h f128359g = new EnumC1294h("SYSTEM_ALERT_WINDOW", 5, 5);

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final EnumC1294h f128360h = new EnumC1294h("BIND_NOTIFICATION_LISTENER_SERVICE", 6, 6);

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final EnumC1294h f128361i = new EnumC1294h("BIND_CONDITION_PROVIDER_SERVICE", 7, 7);

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final EnumC1294h f128362j = new EnumC1294h("ACCESS_NOTIFICATION_POLICY", 8, 8);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f128363a;

                private EnumC1294h(String str, int i10, int i11) {
                    super(str, i10);
                    this.f128363a = i11;
                }

                public static EnumC1294h b(int i10) {
                    switch (i10) {
                        case 0:
                            return f128354b;
                        case 1:
                            return f128355c;
                        case 2:
                            return f128356d;
                        case 3:
                            return f128357e;
                        case 4:
                            return f128358f;
                        case 5:
                            return f128359g;
                        case 6:
                            return f128360h;
                        case 7:
                            return f128361i;
                        case 8:
                            return f128362j;
                        default:
                            return null;
                    }
                }

                public static p3 k() {
                    return v1.f129623a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f128363a;
                }
            }

            static {
                h hVar = new h();
                X = hVar;
                i3.z(h.class, hVar);
            }

            private h() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(X, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001\f\u0001\u0002\f\u0002\u0003\t\u0003\u0004\u0004\u0004\u0005\t\u0005\u0006\t\u0006\u0007\t\u0007\b\u0007\b\t\t\t\n\u0004\n\u000b\u0002\u0000\f\t\u000b\r\f\f", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "c", f.k(), "d", EnumC1294h.k(), "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k, "j", "k", androidx.media3.exoplayer.upstream.h.f65996j, "b", androidx.media3.exoplayer.upstream.h.f66001o, "n", c.k()});
                    case NEW_MUTABLE_INSTANCE:
                        return new h();
                    case NEW_BUILDER:
                        return new C1287a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return X;
                    case GET_PARSER:
                        c5<h> c5Var = Y;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (h.class) {
                            try {
                                e2Var = Y;
                                if (e2Var == null) {
                                    e2Var = new e2(X);
                                    Y = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class h0 extends i3<h0, b> implements v4 {

            /* JADX INFO: renamed from: i3, reason: collision with root package name */
            private static final h0 f128364i3;

            /* JADX INFO: renamed from: j3, reason: collision with root package name */
            private static volatile c5<h0> f128365j3;
            private boolean H1;
            private boolean X;
            private d Y;
            private boolean Z;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128366f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private boolean f128367g;

            /* JADX INFO: renamed from: g3, reason: collision with root package name */
            private boolean f128368g3;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f128369h;

            /* JADX INFO: renamed from: h3, reason: collision with root package name */
            private boolean f128370h3;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f128371i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f128372j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f128373k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f128374l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private C1295a f128375m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private boolean f128376n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private boolean f128377o;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            private e f128378p0;

            /* JADX INFO: renamed from: p1, reason: collision with root package name */
            private boolean f128379p1;

            /* JADX INFO: renamed from: p2, reason: collision with root package name */
            private boolean f128380p2;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private boolean f128381s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private boolean f128382t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private boolean f128383v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private boolean f128384w;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$h0$a, reason: collision with other inner class name */
            public static final class C1295a extends i3<C1295a, C1296a> implements v4 {

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static final C1295a f128385o;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private static volatile c5<C1295a> f128386s;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128387f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private long f128388g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f128389h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f128390i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private long f128391j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private long f128392k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private long f128393l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private boolean f128394m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private boolean f128395n;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$h0$a$a, reason: collision with other inner class name */
                public static final class C1296a extends i3.a<C1295a, C1296a> implements v4 {
                    private C1296a() {
                        super(C1295a.f128385o);
                    }

                    /* synthetic */ C1296a(byte b10) {
                        this();
                    }
                }

                static {
                    C1295a c1295a = new C1295a();
                    f128385o = c1295a;
                    i3.z(C1295a.class, c1295a);
                }

                private C1295a() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128385o, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0007\u0006\b\u0007\u0007", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k});
                        case NEW_MUTABLE_INSTANCE:
                            return new C1295a();
                        case NEW_BUILDER:
                            return new C1296a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128385o;
                        case GET_PARSER:
                            c5<C1295a> c5Var = f128386s;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (C1295a.class) {
                                try {
                                    e2Var = f128386s;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128385o);
                                        f128386s = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class b extends i3.a<h0, b> implements v4 {
                private b() {
                    super(h0.f128364i3);
                }

                /* synthetic */ b(byte b10) {
                    this();
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class c implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final c f128396b = new c("UNKNOWN_ALIGNMENT", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final c f128397c = new c("DISABLED", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final c f128398d = new c("ENABLED_NO_FILTERING", 2, 2);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final c f128399e = new c("ENABLED_WITH_MEDIAN_FILTER", 3, 3);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f128400a;

                private c(String str, int i10, int i11) {
                    super(str, i10);
                    this.f128400a = i11;
                }

                public static c b(int i10) {
                    if (i10 == 0) {
                        return f128396b;
                    }
                    if (i10 == 1) {
                        return f128397c;
                    }
                    if (i10 == 2) {
                        return f128398d;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return f128399e;
                }

                public static p3 k() {
                    return z0.f129709a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f128400a;
                }
            }

            public static final class d extends i3<d, C1297a> implements v4 {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final d f128401h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static volatile c5<d> f128402i;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128403f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private String f128404g = "";

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$h0$d$a, reason: collision with other inner class name */
                public static final class C1297a extends i3.a<d, C1297a> implements v4 {
                    private C1297a() {
                        super(d.f128401h);
                    }

                    /* synthetic */ C1297a(byte b10) {
                        this();
                    }
                }

                static {
                    d dVar = new d();
                    f128401h = dVar;
                    i3.z(d.class, dVar);
                }

                private d() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128401h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b"});
                        case NEW_MUTABLE_INSTANCE:
                            return new d();
                        case NEW_BUILDER:
                            return new C1297a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128401h;
                        case GET_PARSER:
                            c5<d> c5Var = f128402i;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (d.class) {
                                try {
                                    e2Var = f128402i;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128401h);
                                        f128402i = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class e extends i3<e, C1298a> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final e f128405j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<e> f128406k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128407f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private boolean f128408g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private boolean f128409h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private boolean f128410i;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$h0$e$a, reason: collision with other inner class name */
                public static final class C1298a extends i3.a<e, C1298a> implements v4 {
                    private C1298a() {
                        super(e.f128405j);
                    }

                    /* synthetic */ C1298a(byte b10) {
                        this();
                    }
                }

                static {
                    e eVar = new e();
                    f128405j = eVar;
                    i3.z(e.class, eVar);
                }

                private e() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128405j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d"});
                        case NEW_MUTABLE_INSTANCE:
                            return new e();
                        case NEW_BUILDER:
                            return new C1298a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128405j;
                        case GET_PARSER:
                            c5<e> c5Var = f128406k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (e.class) {
                                try {
                                    e2Var = f128406k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128405j);
                                        f128406k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                h0 h0Var = new h0();
                f128364i3 = h0Var;
                i3.z(h0.class, h0Var);
            }

            private h0() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128364i3, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\f\u0005\u0007\t\u0006\b\u0007\u0007\t\u0007\b\n\u0007\t\u000b\u0007\n\f\u0007\u000b\r\u0007\f\u000e\u0007\r\u000f\t\u000e\u0010\u0007\u000f\u0011\t\u0010\u0012\u0007\u0011\u0013\u0007\u0012\u0014\u0007\u0013\u0015\u0007\u0014\u0016\u0007\u0015", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F, "g", c.k(), androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k, "j", "k", androidx.media3.exoplayer.upstream.h.f65996j, androidx.media3.exoplayer.upstream.h.f66001o, "n", "o", "p", "q", "r", "s", "t", "u", "v", "w"});
                    case NEW_MUTABLE_INSTANCE:
                        return new h0();
                    case NEW_BUILDER:
                        return new b((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128364i3;
                    case GET_PARSER:
                        c5<h0> c5Var = f128365j3;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (h0.class) {
                            try {
                                e2Var = f128365j3;
                                if (e2Var == null) {
                                    e2Var = new e2(f128364i3);
                                    f128365j3 = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class i extends i3<i, C1299a> implements v4 {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final i f128411k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static volatile c5<i> f128412l;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128413f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private d f128414g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private u f128415h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private c f128416i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private b f128417j;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$i$a, reason: collision with other inner class name */
            public static final class C1299a extends i3.a<i, C1299a> implements v4 {
                private C1299a() {
                    super(i.f128411k);
                }

                /* synthetic */ C1299a(byte b10) {
                    this();
                }
            }

            public static final class b extends i3<b, C1300a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final b f128418i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<b> f128419j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128420f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128421g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128422h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$i$b$a, reason: collision with other inner class name */
                public static final class C1300a extends i3.a<b, C1300a> implements v4 {
                    private C1300a() {
                        super(b.f128418i);
                    }

                    /* synthetic */ C1300a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$i$b$b, reason: collision with other inner class name */
                public static final class EnumC1301b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final EnumC1301b f128423b = new EnumC1301b("UNKNOWN_DIALOG_ACTION_TYPE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final EnumC1301b f128424c = new EnumC1301b("CANCEL", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final EnumC1301b f128425d = new EnumC1301b("NEGATIVE_CLICK", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final EnumC1301b f128426e = new EnumC1301b("POSITIVE_CLICK", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128427a;

                    private EnumC1301b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128427a = i11;
                    }

                    public static EnumC1301b b(int i10) {
                        if (i10 == 0) {
                            return f128423b;
                        }
                        if (i10 == 1) {
                            return f128424c;
                        }
                        if (i10 == 2) {
                            return f128425d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f128426e;
                    }

                    public static p3 k() {
                        return w1.f129637a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128427a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f128428b = new c("UNKNOWN_DIALOG_TYPE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f128429c = new c("SYSTEM_UPDATE", 1, 1);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128430a;

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128430a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f128428b;
                        }
                        if (i10 != 1) {
                            return null;
                        }
                        return f128429c;
                    }

                    public static p3 k() {
                        return x1.f129663a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128430a;
                    }
                }

                static {
                    b bVar = new b();
                    f128418i = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128418i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", c.k(), "c", EnumC1301b.k()});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1300a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128418i;
                        case GET_PARSER:
                            c5<b> c5Var = f128419j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f128419j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128418i);
                                        f128419j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class c extends i3<c, C1302a> implements v4 {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final c f128431h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static volatile c5<c> f128432i;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128433f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private String f128434g = "";

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$i$c$a, reason: collision with other inner class name */
                public static final class C1302a extends i3.a<c, C1302a> implements v4 {
                    private C1302a() {
                        super(c.f128431h);
                    }

                    /* synthetic */ C1302a(byte b10) {
                        this();
                    }
                }

                static {
                    c cVar = new c();
                    f128431h = cVar;
                    i3.z(c.class, cVar);
                }

                private c() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128431h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b"});
                        case NEW_MUTABLE_INSTANCE:
                            return new c();
                        case NEW_BUILDER:
                            return new C1302a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128431h;
                        case GET_PARSER:
                            c5<c> c5Var = f128432i;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (c.class) {
                                try {
                                    e2Var = f128432i;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128431h);
                                        f128432i = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class d extends i3<d, C1303a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final d f128435i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<d> f128436j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128437f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private C1305d f128438g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private c f128439h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$i$d$a, reason: collision with other inner class name */
                public static final class C1303a extends i3.a<d, C1303a> implements v4 {
                    private C1303a() {
                        super(d.f128435i);
                    }

                    /* synthetic */ C1303a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128440b = new b("UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128441c = new b("ACCOUNT_SELECTION", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128442d = new b("GETTING_STARTED", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f128443e = new b("HEALTH_AND_SAFETY", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final b f128444f = new b("CHECKING_ACCOUNT_INFO", 4, 4);

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private static final b f128445g = new b("PIN", 5, 5);

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private static final b f128446h = new b("FOP", 6, 6);

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private static final b f128447i = new b("DOWNLOADING_VR_COMPONENTS", 7, 7);

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private static final b f128448j = new b("OVERALL", 8, 8);

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    private static final b f128449k = new b("NEWSLETTER", 9, 9);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128450a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128450a = i11;
                    }

                    public static b b(int i10) {
                        switch (i10) {
                            case 0:
                                return f128440b;
                            case 1:
                                return f128441c;
                            case 2:
                                return f128442d;
                            case 3:
                                return f128443e;
                            case 4:
                                return f128444f;
                            case 5:
                                return f128445g;
                            case 6:
                                return f128446h;
                            case 7:
                                return f128447i;
                            case 8:
                                return f128448j;
                            case 9:
                                return f128449k;
                            default:
                                return null;
                        }
                    }

                    public static p3 k() {
                        return y1.f129701a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128450a;
                    }
                }

                public static final class c extends i3<c, C1304a> implements v4 {

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private static final c f128451j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    private static volatile c5<c> f128452k;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private int f128453f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private int f128454g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private int f128455h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private int f128456i;

                    /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$i$d$c$a, reason: collision with other inner class name */
                    public static final class C1304a extends i3.a<c, C1304a> implements v4 {
                        private C1304a() {
                            super(c.f128451j);
                        }

                        /* synthetic */ C1304a(byte b10) {
                            this();
                        }
                    }

                    /* JADX WARN: $VALUES field not found */
                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    public static final class b implements n3 {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static final b f128457b = new b("UNKNOWN", 0, 0);

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private static final b f128458c = new b("ERROR", 1, 1);

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static final b f128459d = new b("LOADING", 2, 2);

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static final b f128460e = new b("COMPLETE", 3, 3);

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        private static final b f128461f = new b("SHOW", 4, 4);

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private final int f128462a;

                        private b(String str, int i10, int i11) {
                            super(str, i10);
                            this.f128462a = i11;
                        }

                        public static b b(int i10) {
                            if (i10 == 0) {
                                return f128457b;
                            }
                            if (i10 == 1) {
                                return f128458c;
                            }
                            if (i10 == 2) {
                                return f128459d;
                            }
                            if (i10 == 3) {
                                return f128460e;
                            }
                            if (i10 != 4) {
                                return null;
                            }
                            return f128461f;
                        }

                        public static p3 k() {
                            return z1.f129710a;
                        }

                        @Override // com.google.vr.sdk.deps.n3
                        public final int i() {
                            return this.f128462a;
                        }
                    }

                    static {
                        c cVar = new c();
                        f128451j = cVar;
                        i3.z(c.class, cVar);
                    }

                    private c() {
                    }

                    @Override // com.google.vr.sdk.deps.i3
                    protected final Object l(i3.d dVar, Object obj, Object obj2) {
                        c5 e2Var;
                        switch (dVar) {
                            case GET_MEMOIZED_IS_INITIALIZED:
                                return (byte) 1;
                            case SET_MEMOIZED_IS_INITIALIZED:
                                return null;
                            case BUILD_MESSAGE_INFO:
                                return i3.w(f128451j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c", b.k(), "d", b.k()});
                            case NEW_MUTABLE_INSTANCE:
                                return new c();
                            case NEW_BUILDER:
                                return new C1304a((byte) 0);
                            case GET_DEFAULT_INSTANCE:
                                return f128451j;
                            case GET_PARSER:
                                c5<c> c5Var = f128452k;
                                if (c5Var != null) {
                                    return c5Var;
                                }
                                synchronized (c.class) {
                                    try {
                                        e2Var = f128452k;
                                        if (e2Var == null) {
                                            e2Var = new e2(f128451j);
                                            f128452k = e2Var;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                    break;
                                }
                                return e2Var;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }
                }

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$i$d$d, reason: collision with other inner class name */
                public static final class C1305d extends i3<C1305d, C1306a> implements v4 {

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private static final C1305d f128463i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private static volatile c5<C1305d> f128464j;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private int f128465f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private int f128466g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private int f128467h;

                    /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$i$d$d$a, reason: collision with other inner class name */
                    public static final class C1306a extends i3.a<C1305d, C1306a> implements v4 {
                        private C1306a() {
                            super(C1305d.f128463i);
                        }

                        /* synthetic */ C1306a(byte b10) {
                            this();
                        }
                    }

                    static {
                        C1305d c1305d = new C1305d();
                        f128463i = c1305d;
                        i3.z(C1305d.class, c1305d);
                    }

                    private C1305d() {
                    }

                    @Override // com.google.vr.sdk.deps.i3
                    protected final Object l(i3.d dVar, Object obj, Object obj2) {
                        c5 e2Var;
                        switch (dVar) {
                            case GET_MEMOIZED_IS_INITIALIZED:
                                return (byte) 1;
                            case SET_MEMOIZED_IS_INITIALIZED:
                                return null;
                            case BUILD_MESSAGE_INFO:
                                return i3.w(f128463i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c"});
                            case NEW_MUTABLE_INSTANCE:
                                return new C1305d();
                            case NEW_BUILDER:
                                return new C1306a((byte) 0);
                            case GET_DEFAULT_INSTANCE:
                                return f128463i;
                            case GET_PARSER:
                                c5<C1305d> c5Var = f128464j;
                                if (c5Var != null) {
                                    return c5Var;
                                }
                                synchronized (C1305d.class) {
                                    try {
                                        e2Var = f128464j;
                                        if (e2Var == null) {
                                            e2Var = new e2(f128463i);
                                            f128464j = e2Var;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                    break;
                                }
                                return e2Var;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }
                }

                static {
                    d dVar = new d();
                    f128435i = dVar;
                    i3.z(d.class, dVar);
                }

                private d() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128435i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new d();
                        case NEW_BUILDER:
                            return new C1303a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128435i;
                        case GET_PARSER:
                            c5<d> c5Var = f128436j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (d.class) {
                                try {
                                    e2Var = f128436j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128435i);
                                        f128436j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                i iVar = new i();
                f128411k = iVar;
                i3.z(i.class, iVar);
            }

            private i() {
            }

            public static c5<i> B() {
                return f128411k.r();
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128411k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e"});
                    case NEW_MUTABLE_INSTANCE:
                        return new i();
                    case NEW_BUILDER:
                        return new C1299a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128411k;
                    case GET_PARSER:
                        c5<i> c5Var = f128412l;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (i.class) {
                            try {
                                e2Var = f128412l;
                                if (e2Var == null) {
                                    e2Var = new e2(f128411k);
                                    f128412l = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class i0 extends i3<i0, C1307a> implements v4 {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final i0 f128468h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static volatile c5<i0> f128469i;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128470f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private b f128471g;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$i0$a, reason: collision with other inner class name */
            public static final class C1307a extends i3.a<i0, C1307a> implements v4 {
                private C1307a() {
                    super(i0.f128468h);
                }

                /* synthetic */ C1307a(byte b10) {
                    this();
                }
            }

            public static final class b extends i3<b, C1308a> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final b f128472k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<b> f128473l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128474f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private c f128475g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private c f128476h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private c f128477i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private c f128478j;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$i0$b$a, reason: collision with other inner class name */
                public static final class C1308a extends i3.a<b, C1308a> implements v4 {
                    private C1308a() {
                        super(b.f128472k);
                    }

                    /* synthetic */ C1308a(byte b10) {
                        this();
                    }
                }

                static {
                    b bVar = new b();
                    f128472k = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128472k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e"});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1308a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128472k;
                        case GET_PARSER:
                            c5<b> c5Var = f128473l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f128473l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128472k);
                                        f128473l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class c extends i3<c, C1309a> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final c f128479j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<c> f128480k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128481f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private float f128482g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private float f128483h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private float f128484i;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$i0$c$a, reason: collision with other inner class name */
                public static final class C1309a extends i3.a<c, C1309a> implements v4 {
                    private C1309a() {
                        super(c.f128479j);
                    }

                    /* synthetic */ C1309a(byte b10) {
                        this();
                    }
                }

                static {
                    c cVar = new c();
                    f128479j = cVar;
                    i3.z(c.class, cVar);
                }

                private c() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128479j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d"});
                        case NEW_MUTABLE_INSTANCE:
                            return new c();
                        case NEW_BUILDER:
                            return new C1309a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128479j;
                        case GET_PARSER:
                            c5<c> c5Var = f128480k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (c.class) {
                                try {
                                    e2Var = f128480k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128479j);
                                        f128480k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                i0 i0Var = new i0();
                f128468h = i0Var;
                i3.z(i0.class, i0Var);
            }

            private i0() {
            }

            public static c5<i0> B() {
                return f128468h.r();
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128468h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b"});
                    case NEW_MUTABLE_INSTANCE:
                        return new i0();
                    case NEW_BUILDER:
                        return new C1307a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128468h;
                    case GET_PARSER:
                        c5<i0> c5Var = f128469i;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (i0.class) {
                            try {
                                e2Var = f128469i;
                                if (e2Var == null) {
                                    e2Var = new e2(f128468h);
                                    f128469i = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class j extends i3<j, C1310a> implements v4 {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final j f128485i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static volatile c5<j> f128486j;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128487f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private c f128488g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private u3<b> f128489h = i3.o();

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$j$a, reason: collision with other inner class name */
            public static final class C1310a extends i3.a<j, C1310a> implements v4 {
                private C1310a() {
                    super(j.f128485i);
                }

                /* synthetic */ C1310a(byte b10) {
                    this();
                }
            }

            public static final class b extends i3<b, C1311a> implements v4 {

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static final b f128490l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private static volatile c5<b> f128491m;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128492f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128493g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f128494h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f128495i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private long f128496j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private long f128497k;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$j$b$a, reason: collision with other inner class name */
                public static final class C1311a extends i3.a<b, C1311a> implements v4 {
                    private C1311a() {
                        super(b.f128490l);
                    }

                    /* synthetic */ C1311a(byte b10) {
                        this();
                    }
                }

                static {
                    b bVar = new b();
                    f128490l = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128490l, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0003\u0001\u0003\u0003\u0002\u0004\u0003\u0003\u0005\u0003\u0004", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1311a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128490l;
                        case GET_PARSER:
                            c5<b> c5Var = f128491m;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f128491m;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128490l);
                                        f128491m = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class c extends i3<c, C1312a> implements v4 {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final c f128498h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static volatile c5<c> f128499i;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128500f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private String f128501g = "";

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$j$c$a, reason: collision with other inner class name */
                public static final class C1312a extends i3.a<c, C1312a> implements v4 {
                    private C1312a() {
                        super(c.f128498h);
                    }

                    /* synthetic */ C1312a(byte b10) {
                        this();
                    }
                }

                static {
                    c cVar = new c();
                    f128498h = cVar;
                    i3.z(c.class, cVar);
                }

                private c() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128498h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b"});
                        case NEW_MUTABLE_INSTANCE:
                            return new c();
                        case NEW_BUILDER:
                            return new C1312a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128498h;
                        case GET_PARSER:
                            c5<c> c5Var = f128499i;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (c.class) {
                                try {
                                    e2Var = f128499i;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128498h);
                                        f128499i = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                j jVar = new j();
                f128485i = jVar;
                i3.z(j.class, jVar);
            }

            private j() {
            }

            public static c5<j> B() {
                return f128485i.r();
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128485i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", b.class});
                    case NEW_MUTABLE_INSTANCE:
                        return new j();
                    case NEW_BUILDER:
                        return new C1310a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128485i;
                    case GET_PARSER:
                        c5<j> c5Var = f128486j;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (j.class) {
                            try {
                                e2Var = f128486j;
                                if (e2Var == null) {
                                    e2Var = new e2(f128485i);
                                    f128486j = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class k extends i3<k, C1313a> implements v4 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static final k f128502n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static volatile c5<k> f128503o;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128504f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f128505g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f128506h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f128507i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private u3<w> f128508j = i3.o();

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private u3<w> f128509k = i3.o();

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private u3<w> f128510l = i3.o();

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private u3<w> f128511m = i3.o();

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$k$a, reason: collision with other inner class name */
            public static final class C1313a extends i3.a<k, C1313a> implements v4 {
                private C1313a() {
                    super(k.f128502n);
                }

                /* synthetic */ C1313a(byte b10) {
                    this();
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class b implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final b f128512b = new b("UNKNOWN", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final b f128513c = new b("STEREO_PANNING", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final b f128514d = new b("BINAURAL_LOW_QUALITY", 2, 2);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final b f128515e = new b("BINAURAL_HIGH_QUALITY", 3, 3);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f128516a;

                private b(String str, int i10, int i11) {
                    super(str, i10);
                    this.f128516a = i11;
                }

                public static b b(int i10) {
                    if (i10 == 0) {
                        return f128512b;
                    }
                    if (i10 == 1) {
                        return f128513c;
                    }
                    if (i10 == 2) {
                        return f128514d;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return f128515e;
                }

                public static p3 k() {
                    return f4.f129371a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f128516a;
                }
            }

            static {
                k kVar = new k();
                f128502n = kVar;
                i3.z(k.class, kVar);
            }

            private k() {
            }

            public static c5<k> B() {
                return f128502n.r();
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128502n, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c", "d", "e", w.class, RequestParams.F, w.class, "g", w.class, androidx.media3.exoplayer.upstream.h.f65993g, w.class});
                    case NEW_MUTABLE_INSTANCE:
                        return new k();
                    case NEW_BUILDER:
                        return new C1313a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128502n;
                    case GET_PARSER:
                        c5<k> c5Var = f128503o;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (k.class) {
                            try {
                                e2Var = f128503o;
                                if (e2Var == null) {
                                    e2Var = new e2(f128502n);
                                    f128503o = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* JADX WARN: $VALUES field not found */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        public static final class l implements n3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final l f128517b = new l("UNKNOWN_BUCKET", 0, 0);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final l f128518c = new l("ONE", 1, 1);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final l f128519d = new l("TWO", 2, 2);

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final l f128520e = new l("THREE", 3, 3);

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final l f128521f = new l("FOUR", 4, 4);

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final l f128522g = new l("FIVE", 5, 5);

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final l f128523h = new l("SIX_TO_TEN", 6, 6);

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final l f128524i = new l("ELEVEN_TO_TWENTY", 7, 11);

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final l f128525j = new l("TWENTYONE_PLUS", 8, 21);

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f128526a;

            private l(String str, int i10, int i11) {
                super(str, i10);
                this.f128526a = i11;
            }

            public static l b(int i10) {
                if (i10 == 11) {
                    return f128524i;
                }
                if (i10 == 21) {
                    return f128525j;
                }
                switch (i10) {
                    case 0:
                        return f128517b;
                    case 1:
                        return f128518c;
                    case 2:
                        return f128519d;
                    case 3:
                        return f128520e;
                    case 4:
                        return f128521f;
                    case 5:
                        return f128522g;
                    case 6:
                        return f128523h;
                    default:
                        return null;
                }
            }

            public static p3 k() {
                return g5.f129413a;
            }

            @Override // com.google.vr.sdk.deps.n3
            public final int i() {
                return this.f128526a;
            }
        }

        public static final class m extends i3.a<a, m> implements v4 {
            private m() {
                super(a.f127785t3);
            }

            /* synthetic */ m(byte b10) {
                this();
            }
        }

        public static final class n extends i3<n, C1314a> implements v4 {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final n f128527k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static volatile c5<n> f128528l;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128529f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private b f128530g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private e f128531h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private c f128532i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private d f128533j;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$n$a, reason: collision with other inner class name */
            public static final class C1314a extends i3.a<n, C1314a> implements v4 {
                private C1314a() {
                    super(n.f128527k);
                }

                /* synthetic */ C1314a(byte b10) {
                    this();
                }
            }

            public static final class b extends i3<b, C1315a> implements v4 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private static final b f128534n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static volatile c5<b> f128535o;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128536f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128537g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private float f128538h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private boolean f128539i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private boolean f128540j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private long f128541k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private long f128542l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private long f128543m;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$n$b$a, reason: collision with other inner class name */
                public static final class C1315a extends i3.a<b, C1315a> implements v4 {
                    private C1315a() {
                        super(b.f128534n);
                    }

                    /* synthetic */ C1315a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$n$b$b, reason: collision with other inner class name */
                public static final class EnumC1316b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final EnumC1316b f128544b = new EnumC1316b("UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final EnumC1316b f128545c = new EnumC1316b("SUCCESS", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final EnumC1316b f128546d = new EnumC1316b("FAILURE_CAPTURE", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final EnumC1316b f128547e = new EnumC1316b("FAILURE_PROCESSING", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final EnumC1316b f128548f = new EnumC1316b("USER_CANCELLED", 4, 4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128549a;

                    private EnumC1316b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128549a = i11;
                    }

                    public static EnumC1316b b(int i10) {
                        if (i10 == 0) {
                            return f128544b;
                        }
                        if (i10 == 1) {
                            return f128545c;
                        }
                        if (i10 == 2) {
                            return f128546d;
                        }
                        if (i10 == 3) {
                            return f128547e;
                        }
                        int i11 = 5 & 4;
                        if (i10 != 4) {
                            return null;
                        }
                        return f128548f;
                    }

                    public static p3 k() {
                        return h6.f129421a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128549a;
                    }
                }

                static {
                    b bVar = new b();
                    f128534n = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128534n, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0000\u0002\u0001\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", EnumC1316b.k(), "c", "d", "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1315a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128534n;
                        case GET_PARSER:
                            c5<b> c5Var = f128535o;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f128535o;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128534n);
                                        f128535o = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class c extends i3<c, C1317a> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final c f128550j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<c> f128551k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128552f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128553g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private boolean f128554h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f128555i;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$n$c$a, reason: collision with other inner class name */
                public static final class C1317a extends i3.a<c, C1317a> implements v4 {
                    private C1317a() {
                        super(c.f128550j);
                    }

                    /* synthetic */ C1317a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128556b = new b("UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128557c = new b("CANCELLED", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128558d = new b("COPY_LINK", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f128559e = new b("SOCIAL_OTHER", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final b f128560f = new b("SOCIAL_FACEBOOK", 4, 4);

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private static final b f128561g = new b("SOCIAL_TWITTER", 5, 5);

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private static final b f128562h = new b("SOCIAL_GPLUS", 6, 6);

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private static final b f128563i = new b("EMAIL", 7, 7);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128564a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128564a = i11;
                    }

                    public static b b(int i10) {
                        switch (i10) {
                            case 0:
                                return f128556b;
                            case 1:
                                return f128557c;
                            case 2:
                                return f128558d;
                            case 3:
                                return f128559e;
                            case 4:
                                return f128560f;
                            case 5:
                                return f128561g;
                            case 6:
                                return f128562h;
                            case 7:
                                return f128563i;
                            default:
                                return null;
                        }
                    }

                    public static p3 k() {
                        return g7.f129414a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128564a;
                    }
                }

                static {
                    c cVar = new c();
                    f128550j = cVar;
                    i3.z(c.class, cVar);
                }

                private c() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128550j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\u0004\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c", "d"});
                        case NEW_MUTABLE_INSTANCE:
                            return new c();
                        case NEW_BUILDER:
                            return new C1317a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128550j;
                        case GET_PARSER:
                            c5<c> c5Var = f128551k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (c.class) {
                                try {
                                    e2Var = f128551k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128550j);
                                        f128551k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class d extends i3<d, C1318a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final d f128565i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<d> f128566j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128567f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128568g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128569h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$n$d$a, reason: collision with other inner class name */
                public static final class C1318a extends i3.a<d, C1318a> implements v4 {
                    private C1318a() {
                        super(d.f128565i);
                    }

                    /* synthetic */ C1318a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128570b = new b("UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128571c = new b("GALLERY", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128572d = new b("ONE_UP_VIEW", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128573a;

                    static {
                        int i10 = 0 << 2;
                    }

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128573a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128570b;
                        }
                        if (i10 == 1) {
                            return f128571c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128572d;
                    }

                    public static p3 k() {
                        return h7.f129422a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128573a;
                    }
                }

                static {
                    d dVar = new d();
                    f128565i = dVar;
                    i3.z(d.class, dVar);
                }

                private d() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128565i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new d();
                        case NEW_BUILDER:
                            return new C1318a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128565i;
                        case GET_PARSER:
                            c5<d> c5Var = f128566j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (d.class) {
                                try {
                                    e2Var = f128566j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128565i);
                                        f128566j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class e extends i3<e, C1319a> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final e f128574k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<e> f128575l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128576f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128577g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private boolean f128578h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private boolean f128579i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f128580j;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$n$e$a, reason: collision with other inner class name */
                public static final class C1319a extends i3.a<e, C1319a> implements v4 {
                    private C1319a() {
                        super(e.f128574k);
                    }

                    /* synthetic */ C1319a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128581b = new b("UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128582c = new b("LANDSCAPE", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128583d = new b("PORTRAIT", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128584a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128584a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128581b;
                        }
                        if (i10 == 1) {
                            return f128582c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128583d;
                    }

                    public static p3 k() {
                        return i7.f129452a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128584a;
                    }
                }

                static {
                    e eVar = new e();
                    f128574k = eVar;
                    i3.z(e.class, eVar);
                }

                private e() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128574k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0004\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c", "d", "e"});
                        case NEW_MUTABLE_INSTANCE:
                            return new e();
                        case NEW_BUILDER:
                            return new C1319a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128574k;
                        case GET_PARSER:
                            c5<e> c5Var = f128575l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (e.class) {
                                try {
                                    e2Var = f128575l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128574k);
                                        f128575l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                n nVar = new n();
                f128527k = nVar;
                i3.z(n.class, nVar);
            }

            private n() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128527k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e"});
                    case NEW_MUTABLE_INSTANCE:
                        return new n();
                    case NEW_BUILDER:
                        return new C1314a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128527k;
                    case GET_PARSER:
                        c5<n> c5Var = f128528l;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (n.class) {
                            try {
                                e2Var = f128528l;
                                if (e2Var == null) {
                                    e2Var = new e2(f128527k);
                                    f128528l = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class o extends i3<o, C1320a> implements v4 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static final o f128585n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static volatile c5<o> f128586o;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128587f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private double f128588g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private double f128589h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private double f128590i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private double f128591j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private double f128592k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private double f128593l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private double f128594m;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$o$a, reason: collision with other inner class name */
            public static final class C1320a extends i3.a<o, C1320a> implements v4 {
                private C1320a() {
                    super(o.f128585n);
                }

                /* synthetic */ C1320a(byte b10) {
                    this();
                }
            }

            static {
                o oVar = new o();
                f128585n = oVar;
                i3.z(o.class, oVar);
            }

            private o() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128585n, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0000\u0000\u0002\u0000\u0001\u0003\u0000\u0002\u0004\u0000\u0003\u0005\u0000\u0004\u0006\u0000\u0005\u0007\u0000\u0006", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g});
                    case NEW_MUTABLE_INSTANCE:
                        return new o();
                    case NEW_BUILDER:
                        return new C1320a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128585n;
                    case GET_PARSER:
                        c5<o> c5Var = f128586o;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (o.class) {
                            try {
                                e2Var = f128586o;
                                if (e2Var == null) {
                                    e2Var = new e2(f128585n);
                                    f128586o = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class p extends i3<p, d> implements v4 {
            private static volatile c5<p> H1;

            /* JADX INFO: renamed from: p1, reason: collision with root package name */
            private static final p f128595p1;
            private l X;
            private C1321a Y;
            private j Z;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128596f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private o f128597g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private e f128598h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private c f128600j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private o f128601k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private h f128602l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private i f128603m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private i f128604n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private m f128605o;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private n f128607s;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private f f128609v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private k f128610w;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private u3<e> f128599i = i3.o();

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private u3<b> f128608t = i3.o();

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            private u3<C1339p> f128606p0 = i3.o();

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$a, reason: collision with other inner class name */
            public static final class C1321a extends i3<C1321a, C1322a> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final C1321a f128611k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<C1321a> f128612l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128613f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128614g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128615h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f128616i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f128617j;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$a$a, reason: collision with other inner class name */
                public static final class C1322a extends i3.a<C1321a, C1322a> implements v4 {
                    private C1322a() {
                        super(C1321a.f128611k);
                    }

                    /* synthetic */ C1322a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$a$b */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128618b = new b("DISPLAY_MODE_MINI_GLOBE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128619c = new b("DISPLAY_MODE_STREET_VIEW_PREVIEW_PANO", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128620d = new b("DISPLAY_MODE_STREET_VIEW_NOT_FOUND", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f128621e = new b("DISPLAY_MODE_STREET_VIEW_EXIT_SPHERE", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128622a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128622a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128618b;
                        }
                        if (i10 == 1) {
                            return f128619c;
                        }
                        if (i10 == 2) {
                            return f128620d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f128621e;
                    }

                    public static p3 k() {
                        return j7.f129461a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128622a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$a$c */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f128623b = new c("EXPANSION_STATE_COLLAPSED", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f128624c = new c("EXPANSION_STATE_SMALL", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final c f128625d = new c("EXPANSION_STATE_LARGE", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final c f128626e = new c("EXPANSION_STATE_MAXIMIZED", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128627a;

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128627a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f128623b;
                        }
                        if (i10 == 1) {
                            return f128624c;
                        }
                        if (i10 == 2) {
                            return f128625d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f128626e;
                    }

                    public static p3 k() {
                        return k7.f129470a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128627a;
                    }
                }

                static {
                    C1321a c1321a = new C1321a();
                    f128611k = c1321a;
                    i3.z(C1321a.class, c1321a);
                }

                private C1321a() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128611k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", c.k(), "c", b.k(), "d", c.k(), "e", b.k()});
                        case NEW_MUTABLE_INSTANCE:
                            return new C1321a();
                        case NEW_BUILDER:
                            return new C1322a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128611k;
                        case GET_PARSER:
                            c5<C1321a> c5Var = f128612l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (C1321a.class) {
                                try {
                                    e2Var = f128612l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128611k);
                                        f128612l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class b extends i3<b, C1323a> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final b f128628k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<b> f128629l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128630f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private e f128631g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private u3<C1324b> f128632h = i3.o();

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f128633i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f128634j;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$b$a, reason: collision with other inner class name */
                public static final class C1323a extends i3.a<b, C1323a> implements v4 {
                    private C1323a() {
                        super(b.f128628k);
                    }

                    /* synthetic */ C1323a(byte b10) {
                        this();
                    }
                }

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$b$b, reason: collision with other inner class name */
                public static final class C1324b extends i3<C1324b, C1325a> implements v4 {

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private static final C1324b f128635j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    private static volatile c5<C1324b> f128636k;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private int f128637f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private int f128638g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private e f128639h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private int f128640i;

                    /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$b$b$a, reason: collision with other inner class name */
                    public static final class C1325a extends i3.a<C1324b, C1325a> implements v4 {
                        private C1325a() {
                            super(C1324b.f128635j);
                        }

                        /* synthetic */ C1325a(byte b10) {
                            this();
                        }
                    }

                    /* JADX WARN: $VALUES field not found */
                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$b$b$b, reason: collision with other inner class name */
                    public static final class EnumC1326b implements n3 {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static final EnumC1326b f128641b = new EnumC1326b("UNKNOWN", 0, 0);

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private static final EnumC1326b f128642c = new EnumC1326b("PRIMARY", 1, 1);

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static final EnumC1326b f128643d = new EnumC1326b("SECONDARY", 2, 2);

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private final int f128644a;

                        private EnumC1326b(String str, int i10, int i11) {
                            super(str, i10);
                            this.f128644a = i11;
                        }

                        public static EnumC1326b b(int i10) {
                            if (i10 == 0) {
                                return f128641b;
                            }
                            if (i10 == 1) {
                                return f128642c;
                            }
                            if (i10 != 2) {
                                return null;
                            }
                            return f128643d;
                        }

                        public static p3 k() {
                            return l7.f129478a;
                        }

                        @Override // com.google.vr.sdk.deps.n3
                        public final int i() {
                            return this.f128644a;
                        }
                    }

                    /* JADX WARN: $VALUES field not found */
                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$b$b$c */
                    public static final class c implements n3 {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static final c f128645b = new c("TYPE_UNKNOWN", 0, 0);

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private static final c f128646c = new c("TYPE_HTC_VIVE_CONTROLLER", 1, 1);

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static final c f128647d = new c("TYPE_OCULUS_TOUCH_LEFT_CONTROLLER", 2, 2);

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static final c f128648e = new c("TYPE_OCULUS_TOUCH_RIGHT_CONTROLLER", 3, 3);

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        private static final c f128649f = new c("TYPE_DAYDREAM_PAPRIKA_CONTROLLER", 4, 4);

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private final int f128650a;

                        private c(String str, int i10, int i11) {
                            super(str, i10);
                            this.f128650a = i11;
                        }

                        public static c b(int i10) {
                            if (i10 == 0) {
                                return f128645b;
                            }
                            if (i10 == 1) {
                                return f128646c;
                            }
                            if (i10 == 2) {
                                return f128647d;
                            }
                            if (i10 == 3) {
                                return f128648e;
                            }
                            int i11 = 3 << 4;
                            if (i10 != 4) {
                                return null;
                            }
                            return f128649f;
                        }

                        public static p3 k() {
                            return m7.f129486a;
                        }

                        @Override // com.google.vr.sdk.deps.n3
                        public final int i() {
                            return this.f128650a;
                        }
                    }

                    static {
                        C1324b c1324b = new C1324b();
                        f128635j = c1324b;
                        i3.z(C1324b.class, c1324b);
                    }

                    private C1324b() {
                    }

                    @Override // com.google.vr.sdk.deps.i3
                    protected final Object l(i3.d dVar, Object obj, Object obj2) {
                        c5 e2Var;
                        switch (dVar) {
                            case GET_MEMOIZED_IS_INITIALIZED:
                                return (byte) 1;
                            case SET_MEMOIZED_IS_INITIALIZED:
                                return null;
                            case BUILD_MESSAGE_INFO:
                                return i3.w(f128635j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\f\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", EnumC1326b.k(), "c", "d", c.k()});
                            case NEW_MUTABLE_INSTANCE:
                                return new C1324b();
                            case NEW_BUILDER:
                                return new C1325a((byte) 0);
                            case GET_DEFAULT_INSTANCE:
                                return f128635j;
                            case GET_PARSER:
                                c5<C1324b> c5Var = f128636k;
                                if (c5Var != null) {
                                    return c5Var;
                                }
                                synchronized (C1324b.class) {
                                    try {
                                        e2Var = f128636k;
                                        if (e2Var == null) {
                                            e2Var = new e2(f128635j);
                                            f128636k = e2Var;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                    break;
                                }
                                return e2Var;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f128651b = new c("VR_SDK_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f128652c = new c("VR_SDK_OPEN_VR", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final c f128653d = new c("VR_SDK_OVR", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128654a;

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128654a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f128651b;
                        }
                        if (i10 == 1) {
                            return f128652c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128653d;
                    }

                    public static p3 k() {
                        return n7.f129507a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128654a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class d implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final d f128655b = new d("VR_SYSTEM_TYPE_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final d f128656c = new d("VR_SYSTEM_TYPE_HTC_VIVE", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final d f128657d = new d("VR_SYSTEM_TYPE_OCULUS_RIFT", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128658a;

                    private d(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128658a = i11;
                    }

                    public static d b(int i10) {
                        if (i10 == 0) {
                            return f128655b;
                        }
                        if (i10 == 1) {
                            return f128656c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128657d;
                    }

                    public static p3 k() {
                        return o7.f129534a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128658a;
                    }
                }

                static {
                    b bVar = new b();
                    f128628k = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128628k, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0000\u0002\t\u0000\u0003\u001b\u0004\f\u0001\u0005\f\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", C1324b.class, "d", c.k(), "e", d.k()});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1323a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128628k;
                        case GET_PARSER:
                            c5<b> c5Var = f128629l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f128629l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128628k);
                                        f128629l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class c extends i3<c, C1327a> implements v4 {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final c f128659h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static volatile c5<c> f128660i;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128661f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private long f128662g;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$c$a, reason: collision with other inner class name */
                public static final class C1327a extends i3.a<c, C1327a> implements v4 {
                    private C1327a() {
                        super(c.f128659h);
                    }

                    /* synthetic */ C1327a(byte b10) {
                        this();
                    }
                }

                static {
                    c cVar = new c();
                    f128659h = cVar;
                    i3.z(c.class, cVar);
                }

                private c() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128659h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002\u0000", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b"});
                        case NEW_MUTABLE_INSTANCE:
                            return new c();
                        case NEW_BUILDER:
                            return new C1327a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128659h;
                        case GET_PARSER:
                            c5<c> c5Var = f128660i;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (c.class) {
                                try {
                                    e2Var = f128660i;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128659h);
                                        f128660i = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class d extends i3.a<p, d> implements v4 {
                private d() {
                    super(p.f128595p1);
                }

                /* synthetic */ d(byte b10) {
                    this();
                }
            }

            public static final class e extends i3<e, C1328a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final e f128663i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<e> f128664j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128665f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128666g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private e f128667h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$e$a, reason: collision with other inner class name */
                public static final class C1328a extends i3.a<e, C1328a> implements v4 {
                    private C1328a() {
                        super(e.f128663i);
                    }

                    /* synthetic */ C1328a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128668b = new b("UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128669c = new b("PRIMARY", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128670d = new b("SECONDARY", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128671a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128671a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128668b;
                        }
                        if (i10 == 1) {
                            return f128669c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128670d;
                    }

                    public static p3 k() {
                        return p7.f129551a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128671a;
                    }
                }

                static {
                    e eVar = new e();
                    f128663i = eVar;
                    i3.z(e.class, eVar);
                }

                private e() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128663i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new e();
                        case NEW_BUILDER:
                            return new C1328a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128663i;
                        case GET_PARSER:
                            c5<e> c5Var = f128664j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (e.class) {
                                try {
                                    e2Var = f128664j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128663i);
                                        f128664j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class f extends i3<f, C1329a> implements v4 {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final f f128672h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static volatile c5<f> f128673i;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128674f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private e f128675g;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$f$a, reason: collision with other inner class name */
                public static final class C1329a extends i3.a<f, C1329a> implements v4 {
                    private C1329a() {
                        super(f.f128672h);
                    }

                    /* synthetic */ C1329a(byte b10) {
                        this();
                    }
                }

                static {
                    f fVar = new f();
                    f128672h = fVar;
                    i3.z(f.class, fVar);
                }

                private f() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128672h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b"});
                        case NEW_MUTABLE_INSTANCE:
                            return new f();
                        case NEW_BUILDER:
                            return new C1329a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128672h;
                        case GET_PARSER:
                            c5<f> c5Var = f128673i;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (f.class) {
                                try {
                                    e2Var = f128673i;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128672h);
                                        f128673i = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class g extends i3<g, C1330a> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final g f128676j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<g> f128677k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128678f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private double f128679g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private double f128680h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private double f128681i;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$g$a, reason: collision with other inner class name */
                public static final class C1330a extends i3.a<g, C1330a> implements v4 {
                    private C1330a() {
                        super(g.f128676j);
                    }

                    /* synthetic */ C1330a(byte b10) {
                        this();
                    }
                }

                static {
                    g gVar = new g();
                    f128676j = gVar;
                    i3.z(g.class, gVar);
                }

                private g() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128676j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0002\u0000\u0001\u0003\u0000\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d"});
                        case NEW_MUTABLE_INSTANCE:
                            return new g();
                        case NEW_BUILDER:
                            return new C1330a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128676j;
                        case GET_PARSER:
                            c5<g> c5Var = f128677k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (g.class) {
                                try {
                                    e2Var = f128677k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128676j);
                                        f128677k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class h extends i3<h, C1331a> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final h f128682k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<h> f128683l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128684f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128686h;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private String f128685g = "";

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private String f128687i = "";

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private String f128688j = "";

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$h$a, reason: collision with other inner class name */
                public static final class C1331a extends i3.a<h, C1331a> implements v4 {
                    private C1331a() {
                        super(h.f128682k);
                    }

                    /* synthetic */ C1331a(byte b10) {
                        this();
                    }
                }

                static {
                    h hVar = new h();
                    f128682k = hVar;
                    i3.z(h.class, hVar);
                }

                private h() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128682k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\b\u0002\u0004\b\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e"});
                        case NEW_MUTABLE_INSTANCE:
                            return new h();
                        case NEW_BUILDER:
                            return new C1331a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128682k;
                        case GET_PARSER:
                            c5<h> c5Var = f128683l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (h.class) {
                                try {
                                    e2Var = f128683l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128682k);
                                        f128683l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class i extends i3<i, C1332a> implements v4 {

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static final i f128689l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private static volatile c5<i> f128690m;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128691f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128692g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128693h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f128694i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f128695j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private int f128696k;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$i$a, reason: collision with other inner class name */
                public static final class C1332a extends i3.a<i, C1332a> implements v4 {
                    private C1332a() {
                        super(i.f128689l);
                    }

                    /* synthetic */ C1332a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128697b = new b("COMFORT_MODE_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128698c = new b("COMFORT_MODE_DISABLED", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128699d = new b("COMFORT_MODE_ENABLED", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128700a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128700a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128697b;
                        }
                        if (i10 == 1) {
                            return f128698c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128699d;
                    }

                    public static p3 k() {
                        return q7.f129559a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128700a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f128701b = new c("GUEST_MODE_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f128702c = new c("GUEST_MODE_OFF", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final c f128703d = new c("GUEST_MODE_ON", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128704a;

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128704a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f128701b;
                        }
                        if (i10 == 1) {
                            return f128702c;
                        }
                        int i11 = 6 & 2;
                        if (i10 != 2) {
                            return null;
                        }
                        return f128703d;
                    }

                    public static p3 k() {
                        return r7.f129566a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128704a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class d implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final d f128705b = new d("HUMAN_SCALE_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final d f128706c = new d("DISALLOW_HUMAN_SCALE", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final d f128707d = new d("ALLOW_HUMAN_SCALE", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128708a;

                    private d(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128708a = i11;
                    }

                    public static d b(int i10) {
                        if (i10 == 0) {
                            return f128705b;
                        }
                        if (i10 == 1) {
                            return f128706c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128707d;
                    }

                    public static p3 k() {
                        return s7.f129574a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128708a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class e implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final e f128709b = new e("LABELS_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final e f128710c = new e("LABELS_DISABLED", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final e f128711d = new e("LABELS_ENABLED", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128712a;

                    private e(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128712a = i11;
                    }

                    public static e b(int i10) {
                        if (i10 == 0) {
                            return f128709b;
                        }
                        if (i10 == 1) {
                            return f128710c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128711d;
                    }

                    public static p3 k() {
                        return t7.f129607a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128712a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class f implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final f f128713b = new f("CONFIGURATION_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final f f128714c = new f("APP_HAS_NEVER_BEEN_RUN", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final f f128715d = new f("APP_HAS_BEEN_RUN_BEFORE", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128716a;

                    private f(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128716a = i11;
                    }

                    public static f b(int i10) {
                        if (i10 == 0) {
                            return f128713b;
                        }
                        if (i10 == 1) {
                            return f128714c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128715d;
                    }

                    public static p3 k() {
                        return u7.f129620a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128716a;
                    }
                }

                static {
                    i iVar = new i();
                    f128689l = iVar;
                    i3.z(i.class, iVar);
                }

                private i() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128689l, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", e.k(), "c", b.k(), "d", f.k(), "e", c.k(), RequestParams.F, d.k()});
                        case NEW_MUTABLE_INSTANCE:
                            return new i();
                        case NEW_BUILDER:
                            return new C1332a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128689l;
                        case GET_PARSER:
                            c5<i> c5Var = f128690m;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (i.class) {
                                try {
                                    e2Var = f128690m;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128689l);
                                        f128690m = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class j extends i3<j, C1333a> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final j f128717k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<j> f128718l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128719f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private String f128720g = "";

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private String f128721h = "";

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f128722i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private o f128723j;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$j$a, reason: collision with other inner class name */
                public static final class C1333a extends i3.a<j, C1333a> implements v4 {
                    private C1333a() {
                        super(j.f128717k);
                    }

                    /* synthetic */ C1333a(byte b10) {
                        this();
                    }
                }

                static {
                    j jVar = new j();
                    f128717k = jVar;
                    i3.z(j.class, jVar);
                }

                private j() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128717k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\t\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e"});
                        case NEW_MUTABLE_INSTANCE:
                            return new j();
                        case NEW_BUILDER:
                            return new C1333a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128717k;
                        case GET_PARSER:
                            c5<j> c5Var = f128718l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (j.class) {
                                try {
                                    e2Var = f128718l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128717k);
                                        f128718l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class k extends i3<k, C1334a> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final k f128724k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<k> f128725l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128726f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128727g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f128728h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f128729i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private long f128730j;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$k$a, reason: collision with other inner class name */
                public static final class C1334a extends i3.a<k, C1334a> implements v4 {
                    private C1334a() {
                        super(k.f128724k);
                    }

                    /* synthetic */ C1334a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128731b = new b("EXIT_TYPE_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128732c = new b("EXIT_TYPE_START_ACTION", 1, 1);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128733a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128733a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128731b;
                        }
                        if (i10 != 1) {
                            return null;
                        }
                        return f128732c;
                    }

                    public static p3 k() {
                        return v7.f129634a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128733a;
                    }
                }

                static {
                    k kVar = new k();
                    f128724k = kVar;
                    i3.z(k.class, kVar);
                }

                private k() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128724k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c", "d", "e"});
                        case NEW_MUTABLE_INSTANCE:
                            return new k();
                        case NEW_BUILDER:
                            return new C1334a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128724k;
                        case GET_PARSER:
                            c5<k> c5Var = f128725l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (k.class) {
                                try {
                                    e2Var = f128725l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128724k);
                                        f128725l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class l extends i3<l, C1335a> implements v4 {

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static final l f128734o;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private static volatile c5<l> f128735s;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128736f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128737g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128738h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private String f128739i = "";

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private g f128740j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private int f128741k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private int f128742l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private int f128743m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private boolean f128744n;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$l$a, reason: collision with other inner class name */
                public static final class C1335a extends i3.a<l, C1335a> implements v4 {
                    private C1335a() {
                        super(l.f128734o);
                    }

                    /* synthetic */ C1335a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128745b = new b("PANO_FRONTEND_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128746c = new b("PANO_FRONTEND_ALLEYCAT", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128747d = new b("PANO_FRONTEND_FIFE", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f128748e = new b("PANO_FRONTEND_FIFE_MEDIA_KEYS", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128749a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128749a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128745b;
                        }
                        if (i10 == 1) {
                            return f128746c;
                        }
                        if (i10 == 2) {
                            return f128747d;
                        }
                        if (i10 == 3) {
                            return f128748e;
                        }
                        int i11 = 3 ^ 0;
                        return null;
                    }

                    public static p3 k() {
                        return w7.f129660a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128749a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f128750b = new c("PANO_TYPE_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f128751c = new c("PANO_TYPE_UGC_OWNER", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final c f128752d = new c("PANO_TYPE_UGC_OTHER", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final c f128753e = new c("PANO_TYPE_GOOGLE", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final c f128754f = new c("PANO_TYPE_LICENSED_TO_GOOGLE", 4, 4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128755a;

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128755a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f128750b;
                        }
                        if (i10 == 1) {
                            return f128751c;
                        }
                        if (i10 == 2) {
                            return f128752d;
                        }
                        if (i10 == 3) {
                            return f128753e;
                        }
                        if (i10 != 4) {
                            return null;
                        }
                        return f128754f;
                    }

                    public static p3 k() {
                        return x7.f129698a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128755a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class d implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final d f128756b = new d("STATE_UNAVAILABLE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final d f128757c = new d("STATE_PANO_LOADING", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final d f128758d = new d("STATE_PANO_NOT_FOUND", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final d f128759e = new d("STATE_PANO_FOUND", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final d f128760f = new d("STATE_PANO_EXPANDED", 4, 4);

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private static final d f128761g = new d("STATE_HEAD_INTO_PANO_TRANSITION", 5, 8);

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private static final d f128762h = new d("STATE_HEAD_INSIDE_PANO", 6, 5);

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private static final d f128763i = new d("STATE_HEAD_OUT_OF_PANO_TRANSITION", 7, 9);

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private static final d f128764j = new d("STATE_PLAYER_INTO_PANO_TRANSITION", 8, 10);

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    private static final d f128765k = new d("STATE_PLAYER_INSIDE_PANO", 9, 6);

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    private static final d f128766l = new d("STATE_PLAYER_NAVIGATION_BETWEEN_PANOS", 10, 11);

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    private static final d f128767m = new d("STATE_PLAYER_OUT_OF_PANO_TRANSITION", 11, 12);

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    private static final d f128768n = new d("STATE_PANO_ENTRY_FAILED", 12, 7);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128769a;

                    private d(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128769a = i11;
                    }

                    public static d b(int i10) {
                        switch (i10) {
                            case 0:
                                return f128756b;
                            case 1:
                                return f128757c;
                            case 2:
                                return f128758d;
                            case 3:
                                return f128759e;
                            case 4:
                                return f128760f;
                            case 5:
                                return f128762h;
                            case 6:
                                return f128765k;
                            case 7:
                                return f128768n;
                            case 8:
                                return f128761g;
                            case 9:
                                return f128763i;
                            case 10:
                                return f128764j;
                            case 11:
                                return f128766l;
                            case 12:
                                return f128767m;
                            default:
                                return null;
                        }
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.b.f127705a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128769a;
                    }
                }

                static {
                    l lVar = new l();
                    f128734o = lVar;
                    i3.z(l.class, lVar);
                }

                private l() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128734o, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\b\u0002\u0004\t\u0003\u0005\f\u0004\u0006\f\u0005\u0007\u0004\u0006\b\u0007\u0007", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", d.k(), "c", d.k(), "d", "e", RequestParams.F, c.k(), "g", b.k(), androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k});
                        case NEW_MUTABLE_INSTANCE:
                            return new l();
                        case NEW_BUILDER:
                            return new C1335a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128734o;
                        case GET_PARSER:
                            c5<l> c5Var = f128735s;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (l.class) {
                                try {
                                    e2Var = f128735s;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128734o);
                                        f128735s = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class m extends i3<m, C1336a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final m f128770i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<m> f128771j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128772f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private String f128773g = "";

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f128774h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$m$a, reason: collision with other inner class name */
                public static final class C1336a extends i3.a<m, C1336a> implements v4 {
                    private C1336a() {
                        super(m.f128770i);
                    }

                    /* synthetic */ C1336a(byte b10) {
                        this();
                    }
                }

                static {
                    m mVar = new m();
                    f128770i = mVar;
                    i3.z(m.class, mVar);
                }

                private m() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128770i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new m();
                        case NEW_BUILDER:
                            return new C1336a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128770i;
                        case GET_PARSER:
                            c5<m> c5Var = f128771j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (m.class) {
                                try {
                                    e2Var = f128771j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128770i);
                                        f128771j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class n extends i3<n, C1337a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final n f128775i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<n> f128776j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128777f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128778g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private String f128779h = "";

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$n$a, reason: collision with other inner class name */
                public static final class C1337a extends i3.a<n, C1337a> implements v4 {
                    private C1337a() {
                        super(n.f128775i);
                    }

                    /* synthetic */ C1337a(byte b10) {
                        this();
                    }
                }

                static {
                    n nVar = new n();
                    f128775i = nVar;
                    i3.z(n.class, nVar);
                }

                private n() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128775i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new n();
                        case NEW_BUILDER:
                            return new C1337a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128775i;
                        case GET_PARSER:
                            c5<n> c5Var = f128776j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (n.class) {
                                try {
                                    e2Var = f128776j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128775i);
                                        f128776j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class o extends i3<o, C1338a> implements v4 {

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static final o f128780l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private static volatile c5<o> f128781m;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128782f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128783g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private o f128784h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f128785i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f128786j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private double f128787k;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$o$a, reason: collision with other inner class name */
                public static final class C1338a extends i3.a<o, C1338a> implements v4 {
                    private C1338a() {
                        super(o.f128780l);
                    }

                    /* synthetic */ C1338a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128788b = new b("FORCE_HUMAN_SCALE_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128789c = new b("FORCE_HUMAN_SCALE_DISABLED", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128790d = new b("FORCE_HUMAN_SCALE_ENABLED", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128791a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128791a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128788b;
                        }
                        if (i10 == 1) {
                            return f128789c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128790d;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.c.f127719a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128791a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f128792b = new c("UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f128793c = new c("PLANET", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final c f128794d = new c("TERRAIN", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final c f128795e = new c("TRANSITION", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128796a;

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128796a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f128792b;
                        }
                        if (i10 == 1) {
                            return f128793c;
                        }
                        if (i10 == 2) {
                            return f128794d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f128795e;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.d.f127767a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128796a;
                    }
                }

                static {
                    o oVar = new o();
                    f128780l = oVar;
                    i3.z(o.class, oVar);
                }

                private o() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128780l, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0002\u0002\u0004\f\u0003\u0005\u0000\u0004", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", c.k(), "c", "d", "e", b.k(), RequestParams.F});
                        case NEW_MUTABLE_INSTANCE:
                            return new o();
                        case NEW_BUILDER:
                            return new C1338a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128780l;
                        case GET_PARSER:
                            c5<o> c5Var = f128781m;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (o.class) {
                                try {
                                    e2Var = f128781m;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128780l);
                                        f128781m = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$p, reason: collision with other inner class name */
            public static final class C1339p extends i3<C1339p, C1340a> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final C1339p f128797j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<C1339p> f128798k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128799f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128800g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128801h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private String f128802i = "";

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$p$a, reason: collision with other inner class name */
                public static final class C1340a extends i3.a<C1339p, C1340a> implements v4 {
                    private C1340a() {
                        super(C1339p.f128797j);
                    }

                    /* synthetic */ C1340a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$p$p$b */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128803b = new b("SHUTDOWN_REASON_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128804c = new b("SHUTDOWN_REASON_SDK_INIT_FAILED", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128805d = new b("SHUTDOWN_REASON_ENTITLEMENT_CHECK_FAILED", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128806a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128806a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128803b;
                        }
                        if (i10 == 1) {
                            return f128804c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128805d;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.e.f127781a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128806a;
                    }
                }

                static {
                    C1339p c1339p = new C1339p();
                    f128797j = c1339p;
                    i3.z(C1339p.class, c1339p);
                }

                private C1339p() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128797j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\b\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c", "d"});
                        case NEW_MUTABLE_INSTANCE:
                            return new C1339p();
                        case NEW_BUILDER:
                            return new C1340a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128797j;
                        case GET_PARSER:
                            c5<C1339p> c5Var = f128798k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (C1339p.class) {
                                try {
                                    e2Var = f128798k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128797j);
                                        f128798k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                p pVar = new p();
                f128595p1 = pVar;
                i3.z(p.class, pVar);
            }

            private p() {
            }

            public static c5<p> B() {
                return f128595p1.r();
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128595p1, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0003\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001b\u0004\t\u0002\u0005\t\u0003\u0006\t\u0004\u0007\t\u0005\b\t\u0007\t\t\b\n\u001b\u000b\t\t\f\t\n\r\t\r\u000e\t\u0006\u000f\u001b\u0010\t\u000b\u0011\t\f", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", e.class, "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g, "j", "k", androidx.media3.exoplayer.upstream.h.f65996j, b.class, androidx.media3.exoplayer.upstream.h.f66001o, "n", "q", androidx.media3.exoplayer.upstream.h.f65997k, "r", C1339p.class, "o", "p"});
                    case NEW_MUTABLE_INSTANCE:
                        return new p();
                    case NEW_BUILDER:
                        return new d((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128595p1;
                    case GET_PARSER:
                        c5<p> c5Var = H1;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (p.class) {
                            try {
                                e2Var = H1;
                                if (e2Var == null) {
                                    e2Var = new e2(f128595p1);
                                    H1 = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class q extends i3<q, C1341a> implements v4 {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final q f128807k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static volatile c5<q> f128808l;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128809f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f128810g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private b f128811h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private d f128812i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private String f128813j = "";

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$q$a, reason: collision with other inner class name */
            public static final class C1341a extends i3.a<q, C1341a> implements v4 {
                private C1341a() {
                    super(q.f128807k);
                }

                /* synthetic */ C1341a(byte b10) {
                    this();
                }
            }

            public static final class b extends i3<b, C1342a> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final b f128814j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<b> f128815k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128816f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128817g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128818h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f128819i;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$q$b$a, reason: collision with other inner class name */
                public static final class C1342a extends i3.a<b, C1342a> implements v4 {
                    private C1342a() {
                        super(b.f128814j);
                    }

                    /* synthetic */ C1342a(byte b10) {
                        this();
                    }
                }

                static {
                    b bVar = new b();
                    f128814j = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128814j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\f\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", c.k()});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1342a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128814j;
                        case GET_PARSER:
                            c5<b> c5Var = f128815k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f128815k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128814j);
                                        f128815k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class c implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final c f128820b = new c("UNKNOWN_FORMAT", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final c f128821c = new c("MONO", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final c f128822d = new c("STEREO_OVER_UNDER", 2, 2);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f128823a;

                private c(String str, int i10, int i11) {
                    super(str, i10);
                    this.f128823a = i11;
                }

                public static c b(int i10) {
                    if (i10 == 0) {
                        return f128820b;
                    }
                    if (i10 == 1) {
                        return f128821c;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return f128822d;
                }

                public static p3 k() {
                    return com.google.vr.sdk.deps.f.f129364a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f128823a;
                }
            }

            public static final class d extends i3<d, C1343a> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final d f128824k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<d> f128825l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128826f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128827g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128828h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f128829i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f128830j;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$q$d$a, reason: collision with other inner class name */
                public static final class C1343a extends i3.a<d, C1343a> implements v4 {
                    private C1343a() {
                        super(d.f128824k);
                    }

                    /* synthetic */ C1343a(byte b10) {
                        this();
                    }
                }

                static {
                    d dVar = new d();
                    f128824k = dVar;
                    i3.z(d.class, dVar);
                }

                private d() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128824k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\f\u0002\u0004\u0004\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", c.k(), "e"});
                        case NEW_MUTABLE_INSTANCE:
                            return new d();
                        case NEW_BUILDER:
                            return new C1343a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128824k;
                        case GET_PARSER:
                            c5<d> c5Var = f128825l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (d.class) {
                                try {
                                    e2Var = f128825l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128824k);
                                        f128825l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class e implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final e f128831b = new e("UNKNOWN_MODE", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final e f128832c = new e("EMBEDDED", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final e f128833d = new e("FULLSCREEN_MONO", 2, 2);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final e f128834e = new e("FULLSCREEN_VR", 3, 3);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f128835a;

                private e(String str, int i10, int i11) {
                    super(str, i10);
                    this.f128835a = i11;
                }

                public static e b(int i10) {
                    if (i10 == 0) {
                        return f128831b;
                    }
                    if (i10 == 1) {
                        return f128832c;
                    }
                    if (i10 == 2) {
                        return f128833d;
                    }
                    if (i10 == 3) {
                        return f128834e;
                    }
                    int i11 = 5 << 0;
                    return null;
                }

                public static p3 k() {
                    return com.google.vr.sdk.deps.g.f129405a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f128835a;
                }
            }

            static {
                q qVar = new q();
                f128807k = qVar;
                i3.z(q.class, qVar);
            }

            private q() {
            }

            public static c5<q> B() {
                return f128807k.r();
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f128807k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002\u0004\b\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", e.k(), "c", "d", "e"});
                    case NEW_MUTABLE_INSTANCE:
                        return new q();
                    case NEW_BUILDER:
                        return new C1341a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f128807k;
                    case GET_PARSER:
                        c5<q> c5Var = f128808l;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (q.class) {
                            try {
                                e2Var = f128808l;
                                if (e2Var == null) {
                                    e2Var = new e2(f128807k);
                                    f128808l = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class r extends i3<r, b> implements v4 {
            private static final r Z;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            private static volatile c5<r> f128836p0;
            private c X;
            private m Y;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f128837f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private d f128838g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private f f128839h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private k f128840i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private i f128841j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private p f128842k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private e f128843l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private C1344a f128844m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private q f128845n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private n f128846o;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private g f128847s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private j f128848t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private C1362r f128849v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private h f128850w;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$a, reason: collision with other inner class name */
            public static final class C1344a extends i3<C1344a, C1345a> implements v4 {

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private static final C1344a f128851m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private static volatile c5<C1344a> f128852n;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128853f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128854g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128855h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f128856i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private long f128857j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private long f128858k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private int f128859l;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$a$a, reason: collision with other inner class name */
                public static final class C1345a extends i3.a<C1344a, C1345a> implements v4 {
                    private C1345a() {
                        super(C1344a.f128851m);
                    }

                    /* synthetic */ C1345a(byte b10) {
                        this();
                    }
                }

                static {
                    C1344a c1344a = new C1344a();
                    f128851m = c1344a;
                    i3.z(C1344a.class, c1344a);
                }

                private C1344a() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128851m, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0004\u0005", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F, "g"});
                        case NEW_MUTABLE_INSTANCE:
                            return new C1344a();
                        case NEW_BUILDER:
                            return new C1345a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128851m;
                        case GET_PARSER:
                            c5<C1344a> c5Var = f128852n;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (C1344a.class) {
                                try {
                                    e2Var = f128852n;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128851m);
                                        f128852n = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class b extends i3.a<r, b> implements v4 {
                private b() {
                    super(r.Z);
                }

                /* synthetic */ b(byte b10) {
                    this();
                }
            }

            public static final class c extends i3<c, C1346a> implements v4 {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final c f128860h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static volatile c5<c> f128861i;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128862f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128863g;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$c$a, reason: collision with other inner class name */
                public static final class C1346a extends i3.a<c, C1346a> implements v4 {
                    private C1346a() {
                        super(c.f128860h);
                    }

                    /* synthetic */ C1346a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128864b = new b("UPDATE_OUTCOME_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128865c = new b("UPDATE_OUTCOME_NO_UPDATE_AVAILABLE", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128866d = new b("UPDATE_OUTCOME_RETRIEVE_ERROR", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f128867e = new b("UPDATE_OUTCOME_PUSH_ERROR", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final b f128868f = new b("UPDATE_OUTCOME_PUSH_SUCCESS", 4, 4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128869a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128869a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128864b;
                        }
                        if (i10 == 1) {
                            return f128865c;
                        }
                        if (i10 == 2) {
                            return f128866d;
                        }
                        if (i10 == 3) {
                            return f128867e;
                        }
                        if (i10 != 4) {
                            return null;
                        }
                        return f128868f;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.h.f129415a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128869a;
                    }
                }

                static {
                    c cVar = new c();
                    f128860h = cVar;
                    i3.z(c.class, cVar);
                }

                private c() {
                }

                public static c5<c> B() {
                    return f128860h.r();
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128860h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k()});
                        case NEW_MUTABLE_INSTANCE:
                            return new c();
                        case NEW_BUILDER:
                            return new C1346a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128860h;
                        case GET_PARSER:
                            c5<c> c5Var = f128861i;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (c.class) {
                                try {
                                    e2Var = f128861i;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128860h);
                                        f128861i = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class d extends i3<d, C1347a> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final d f128870j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<d> f128871k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128872f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128873g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private String f128874h = "";

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private String f128875i = "";

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$d$a, reason: collision with other inner class name */
                public static final class C1347a extends i3.a<d, C1347a> implements v4 {
                    private C1347a() {
                        super(d.f128870j);
                    }

                    /* synthetic */ C1347a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128876b = new b("UNKNOWN_CAMERA_TYPE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128877c = new b("EMULATOR", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128878d = new b("LENOVO", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f128879e = new b("YI", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128880a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128880a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128876b;
                        }
                        if (i10 == 1) {
                            return f128877c;
                        }
                        if (i10 == 2) {
                            return f128878d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f128879e;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.i.f129423a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128880a;
                    }
                }

                static {
                    d dVar = new d();
                    f128870j = dVar;
                    i3.z(d.class, dVar);
                }

                private d() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128870j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c", "d"});
                        case NEW_MUTABLE_INSTANCE:
                            return new d();
                        case NEW_BUILDER:
                            return new C1347a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128870j;
                        case GET_PARSER:
                            c5<d> c5Var = f128871k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (d.class) {
                                try {
                                    e2Var = f128871k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128870j);
                                        f128871k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class e extends i3<e, C1348a> implements v4 {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private static final e f128881t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                private static volatile c5<e> f128882v;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128883f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private boolean f128884g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128885h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private boolean f128886i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f128887j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private long f128888k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private long f128889l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private boolean f128890m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private boolean f128891n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private int f128892o;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private int f128893s;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$e$a, reason: collision with other inner class name */
                public static final class C1348a extends i3.a<e, C1348a> implements v4 {
                    private C1348a() {
                        super(e.f128881t);
                    }

                    /* synthetic */ C1348a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128894b = new b("TEMPERATURE_STATE_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128895c = new b("TEMPERATURE_STATE_OK", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128896d = new b("TEMPERATURE_STATE_WARNING", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f128897e = new b("TEMPERATURE_STATE_CRITICAL", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final b f128898f = new b("TEMPERATURE_STATE_OVERHEATED", 4, 4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128899a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128899a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128894b;
                        }
                        if (i10 == 1) {
                            return f128895c;
                        }
                        if (i10 == 2) {
                            return f128896d;
                        }
                        if (i10 == 3) {
                            return f128897e;
                        }
                        if (i10 != 4) {
                            return null;
                        }
                        return f128898f;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.j.f129453a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128899a;
                    }
                }

                static {
                    e eVar = new e();
                    f128881t = eVar;
                    i3.z(e.class, eVar);
                }

                private e() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128881t, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0004\u0001\u0003\u0007\u0002\u0004\u0004\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0007\u0006\b\u0007\u0007\t\f\b\n\u0004\t", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k, "j", b.k(), "k"});
                        case NEW_MUTABLE_INSTANCE:
                            return new e();
                        case NEW_BUILDER:
                            return new C1348a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128881t;
                        case GET_PARSER:
                            c5<e> c5Var = f128882v;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (e.class) {
                                try {
                                    e2Var = f128882v;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128881t);
                                        f128882v = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class f extends i3<f, C1349a> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final f f128900k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<f> f128901l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128902f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128903g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private l f128904h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private o f128905i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private c f128906j;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$f$a, reason: collision with other inner class name */
                public static final class C1349a extends i3.a<f, C1349a> implements v4 {
                    private C1349a() {
                        super(f.f128900k);
                    }

                    /* synthetic */ C1349a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128907b = new b("UNKNOWN_CAPTURE_TYPE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128908c = new b(com.facebook.share.internal.f.f101822a0, 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128909d = new b("PHOTO", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f128910e = new b("LIVE", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final b f128911f = new b("TIMELAPSE", 4, 4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128912a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128912a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128907b;
                        }
                        if (i10 == 1) {
                            return f128908c;
                        }
                        if (i10 == 2) {
                            return f128909d;
                        }
                        if (i10 == 3) {
                            return f128910e;
                        }
                        if (i10 != 4) {
                            return null;
                        }
                        return f128911f;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.k.f129462a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128912a;
                    }
                }

                public static final class c extends i3<c, C1350a> implements v4 {

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    private static final c f128913k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    private static volatile c5<c> f128914l;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private int f128915f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private int f128916g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private long f128917h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private long f128918i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private long f128919j;

                    /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$f$c$a, reason: collision with other inner class name */
                    public static final class C1350a extends i3.a<c, C1350a> implements v4 {
                        private C1350a() {
                            super(c.f128913k);
                        }

                        /* synthetic */ C1350a(byte b10) {
                            this();
                        }
                    }

                    /* JADX WARN: $VALUES field not found */
                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    public static final class b implements n3 {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static final b f128920b = new b("LIVE_STREAM_ERROR_UNKNOWN", 0, 0);

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private static final b f128921c = new b("LIVE_STREAM_ERROR_NO_ERROR", 1, 1);

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static final b f128922d = new b("LIVE_STREAM_ERROR_SERVER_NOT_REACHABLE", 2, 2);

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static final b f128923e = new b("LIVE_STREAM_ERROR_PROTOCOL_ERROR", 3, 3);

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        private static final b f128924f = new b("LIVE_STREAM_ERROR_NO_STREAMING_TARGET", 4, 4);

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        private static final b f128925g = new b("LIVE_STREAM_ERROR_STREAM_ERROR", 5, 5);

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        private static final b f128926h = new b("LIVE_STREAM_ERROR_CODEC_ERROR", 6, 6);

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private final int f128927a;

                        private b(String str, int i10, int i11) {
                            super(str, i10);
                            this.f128927a = i11;
                        }

                        public static b b(int i10) {
                            switch (i10) {
                                case 0:
                                    return f128920b;
                                case 1:
                                    return f128921c;
                                case 2:
                                    return f128922d;
                                case 3:
                                    return f128923e;
                                case 4:
                                    return f128924f;
                                case 5:
                                    return f128925g;
                                case 6:
                                    return f128926h;
                                default:
                                    return null;
                            }
                        }

                        public static p3 k() {
                            return com.google.vr.sdk.deps.l.f129471a;
                        }

                        @Override // com.google.vr.sdk.deps.n3
                        public final int i() {
                            return this.f128927a;
                        }
                    }

                    static {
                        c cVar = new c();
                        f128913k = cVar;
                        i3.z(c.class, cVar);
                    }

                    private c() {
                    }

                    @Override // com.google.vr.sdk.deps.i3
                    protected final Object l(i3.d dVar, Object obj, Object obj2) {
                        c5 e2Var;
                        switch (dVar) {
                            case GET_MEMOIZED_IS_INITIALIZED:
                                return (byte) 1;
                            case SET_MEMOIZED_IS_INITIALIZED:
                                return null;
                            case BUILD_MESSAGE_INFO:
                                return i3.w(f128913k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c", "d", "e"});
                            case NEW_MUTABLE_INSTANCE:
                                return new c();
                            case NEW_BUILDER:
                                return new C1350a((byte) 0);
                            case GET_DEFAULT_INSTANCE:
                                return f128913k;
                            case GET_PARSER:
                                c5<c> c5Var = f128914l;
                                if (c5Var != null) {
                                    return c5Var;
                                }
                                synchronized (c.class) {
                                    try {
                                        e2Var = f128914l;
                                        if (e2Var == null) {
                                            e2Var = new e2(f128913k);
                                            f128914l = e2Var;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                    break;
                                }
                                return e2Var;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }
                }

                static {
                    f fVar = new f();
                    f128900k = fVar;
                    i3.z(f.class, fVar);
                }

                private f() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128900k, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002\n\t\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c", "d", "e"});
                        case NEW_MUTABLE_INSTANCE:
                            return new f();
                        case NEW_BUILDER:
                            return new C1349a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128900k;
                        case GET_PARSER:
                            c5<f> c5Var = f128901l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (f.class) {
                                try {
                                    e2Var = f128901l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128900k);
                                        f128901l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class g extends i3<g, C1351a> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final g f128928j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<g> f128929k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128930f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128931g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128932h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f128933i;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$g$a, reason: collision with other inner class name */
                public static final class C1351a extends i3.a<g, C1351a> implements v4 {
                    private C1351a() {
                        super(g.f128928j);
                    }

                    /* synthetic */ C1351a(byte b10) {
                        this();
                    }
                }

                static {
                    g gVar = new g();
                    f128928j = gVar;
                    i3.z(g.class, gVar);
                }

                private g() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128928j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0002\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", p.b.k(), "c", p.d.k(), "d"});
                        case NEW_MUTABLE_INSTANCE:
                            return new g();
                        case NEW_BUILDER:
                            return new C1351a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128928j;
                        case GET_PARSER:
                            c5<g> c5Var = f128929k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (g.class) {
                                try {
                                    e2Var = f128929k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128928j);
                                        f128929k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class h extends i3<h, b> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final h f128934j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<h> f128935k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128936f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128937g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128938h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f128939i;

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$h$a, reason: collision with other inner class name */
                public static final class EnumC1352a implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final EnumC1352a f128940b = new EnumC1352a("EXPORT_MEDIA_ACTION_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final EnumC1352a f128941c = new EnumC1352a("EXPORT_MEDIA_ACTION_CANCEL", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final EnumC1352a f128942d = new EnumC1352a("EXPORT_MEDIA_ACTION_SAVE", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final EnumC1352a f128943e = new EnumC1352a("EXPORT_MEDIA_ACTION_SHARE", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128944a;

                    private EnumC1352a(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128944a = i11;
                    }

                    public static EnumC1352a b(int i10) {
                        if (i10 == 0) {
                            return f128940b;
                        }
                        if (i10 == 1) {
                            return f128941c;
                        }
                        if (i10 == 2) {
                            return f128942d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f128943e;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.m.f129479a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128944a;
                    }
                }

                public static final class b extends i3.a<h, b> implements v4 {
                    private b() {
                        super(h.f128934j);
                    }

                    /* synthetic */ b(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f128945b = new c("EXPORT_MEDIA_FAILED_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f128946c = new c("EXPORT_MEDIA_INIT_FAILED", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final c f128947d = new c("EXPORT_MEDIA_RENDER_ENCODE_FAILED", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final c f128948e = new c("EXPORT_MEDIA_SAVE_FAILED", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128949a;

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128949a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f128945b;
                        }
                        if (i10 == 1) {
                            return f128946c;
                        }
                        if (i10 == 2) {
                            return f128947d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f128948e;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.n.f129487a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128949a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class d implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final d f128950b = new d("EXPORT_MEDIA_TYPE_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final d f128951c = new d("EXPORT_MEDIA_TYPE_2D_PHOTO", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final d f128952d = new d("EXPORT_MEDIA_TYPE_WIGGLEGRAM", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128953a;

                    private d(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128953a = i11;
                    }

                    public static d b(int i10) {
                        if (i10 == 0) {
                            return f128950b;
                        }
                        if (i10 == 1) {
                            return f128951c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128952d;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.o.f129508a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128953a;
                    }
                }

                static {
                    h hVar = new h();
                    f128934j = hVar;
                    i3.z(h.class, hVar);
                }

                private h() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128934j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", d.k(), "c", EnumC1352a.k(), "d", c.k()});
                        case NEW_MUTABLE_INSTANCE:
                            return new h();
                        case NEW_BUILDER:
                            return new b((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128934j;
                        case GET_PARSER:
                            c5<h> c5Var = f128935k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (h.class) {
                                try {
                                    e2Var = f128935k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128934j);
                                        f128935k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class i extends i3<i, C1353a> implements v4 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private static final i f128954n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static volatile c5<i> f128955o;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128956f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128957g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f128958h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f128959i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private long f128960j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private int f128961k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private l f128962l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private o f128963m;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$i$a, reason: collision with other inner class name */
                public static final class C1353a extends i3.a<i, C1353a> implements v4 {
                    private C1353a() {
                        super(i.f128954n);
                    }

                    /* synthetic */ C1353a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128964b = new b("UNKNOWN_TYPE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128965c = new b(com.facebook.share.internal.f.f101822a0, 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128966d = new b("PHOTO", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128967a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128967a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128964b;
                        }
                        if (i10 == 1) {
                            return f128965c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f128966d;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.p.f129535a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128967a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f128968b = new c("UNKNOWN_OUTCOME", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f128969c = new c("SUCCESS", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final c f128970d = new c("USER_CANCEL", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final c f128971e = new c("FAILURE", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final c f128972f = new c("FAILURE_TO_EXPORT", 4, 4);

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private static final c f128973g = new c("FAILURE_TO_DOWNLOAD", 5, 5);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128974a;

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128974a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f128968b;
                        }
                        if (i10 == 1) {
                            return f128969c;
                        }
                        if (i10 == 2) {
                            return f128970d;
                        }
                        if (i10 == 3) {
                            return f128971e;
                        }
                        if (i10 == 4) {
                            return f128972f;
                        }
                        if (i10 != 5) {
                            return null;
                        }
                        return f128973g;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.q.f129552a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128974a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class d implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final d f128975b = new d("UNKNOWN_INTERFACE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final d f128976c = new d("WIFI_DIRECT", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final d f128977d = new d("CAMERA_WIFI", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final d f128978e = new d("SHARED_WIFI", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final d f128979f = new d("USB", 4, 4);

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private static final d f128980g = new d("BLE", 5, 5);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128981a;

                    private d(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128981a = i11;
                    }

                    public static d b(int i10) {
                        if (i10 == 0) {
                            return f128975b;
                        }
                        if (i10 == 1) {
                            return f128976c;
                        }
                        if (i10 == 2) {
                            return f128977d;
                        }
                        if (i10 == 3) {
                            return f128978e;
                        }
                        if (i10 == 4) {
                            return f128979f;
                        }
                        if (i10 != 5) {
                            return null;
                        }
                        return f128980g;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.r.f129560a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128981a;
                    }
                }

                static {
                    i iVar = new i();
                    f128954n = iVar;
                    i3.z(i.class, iVar);
                }

                private i() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128954n, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\f\u0004\u0006\t\u0005\u0007\t\u0006", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", c.k(), "c", d.k(), "d", "e", RequestParams.F, b.k(), "g", androidx.media3.exoplayer.upstream.h.f65993g});
                        case NEW_MUTABLE_INSTANCE:
                            return new i();
                        case NEW_BUILDER:
                            return new C1353a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128954n;
                        case GET_PARSER:
                            c5<i> c5Var = f128955o;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (i.class) {
                                try {
                                    e2Var = f128955o;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128954n);
                                        f128955o = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class j extends i3<j, C1354a> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final j f128982j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<j> f128983k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128984f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128985g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f128986h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f128987i;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$j$a, reason: collision with other inner class name */
                public static final class C1354a extends i3.a<j, C1354a> implements v4 {
                    private C1354a() {
                        super(j.f128982j);
                    }

                    /* synthetic */ C1354a(byte b10) {
                        this();
                    }
                }

                static {
                    j jVar = new j();
                    f128982j = jVar;
                    i3.z(j.class, jVar);
                }

                private j() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128982j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0002\u0001\u0003\u0002\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d"});
                        case NEW_MUTABLE_INSTANCE:
                            return new j();
                        case NEW_BUILDER:
                            return new C1354a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128982j;
                        case GET_PARSER:
                            c5<j> c5Var = f128983k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (j.class) {
                                try {
                                    e2Var = f128983k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128982j);
                                        f128983k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class k extends i3<k, C1355a> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final k f128988j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<k> f128989k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f128990f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f128991g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f128992h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f128993i;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$k$a, reason: collision with other inner class name */
                public static final class C1355a extends i3.a<k, C1355a> implements v4 {
                    private C1355a() {
                        super(k.f128988j);
                    }

                    /* synthetic */ C1355a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f128994b = new b("UNKNOWN_PAIRING_OUTCOME", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f128995c = new b("SUCCESS", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f128996d = new b("USER_CANCEL", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f128997e = new b("FAILURE", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f128998a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f128998a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f128994b;
                        }
                        if (i10 == 1) {
                            return f128995c;
                        }
                        if (i10 == 2) {
                            return f128996d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f128997e;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.s.f129567a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f128998a;
                    }
                }

                static {
                    k kVar = new k();
                    f128988j = kVar;
                    i3.z(k.class, kVar);
                }

                private k() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128988j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u0002\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c", "d"});
                        case NEW_MUTABLE_INSTANCE:
                            return new k();
                        case NEW_BUILDER:
                            return new C1355a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128988j;
                        case GET_PARSER:
                            c5<k> c5Var = f128989k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (k.class) {
                                try {
                                    e2Var = f128989k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128988j);
                                        f128989k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class l extends i3<l, C1356a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final l f128999i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<l> f129000j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129001f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f129002g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f129003h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$l$a, reason: collision with other inner class name */
                public static final class C1356a extends i3.a<l, C1356a> implements v4 {
                    private C1356a() {
                        super(l.f128999i);
                    }

                    /* synthetic */ C1356a(byte b10) {
                        this();
                    }
                }

                static {
                    l lVar = new l();
                    f128999i = lVar;
                    i3.z(l.class, lVar);
                }

                private l() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f128999i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new l();
                        case NEW_BUILDER:
                            return new C1356a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f128999i;
                        case GET_PARSER:
                            c5<l> c5Var = f129000j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (l.class) {
                                try {
                                    e2Var = f129000j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f128999i);
                                        f129000j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class m extends i3<m, c> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final m f129004j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<m> f129005k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129006f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f129007g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f129008h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f129009i;

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$m$a, reason: collision with other inner class name */
                public static final class EnumC1357a implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final EnumC1357a f129010b = new EnumC1357a("ACTION_ENTRY_POINT_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final EnumC1357a f129011c = new EnumC1357a("ACTION_ENTRY_POINT_SELECT", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final EnumC1357a f129012d = new EnumC1357a("ACTION_ENTRY_POINT_SELECT_ALL", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final EnumC1357a f129013e = new EnumC1357a("ACTION_ENTRY_POINT_SELECT_NEW", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final EnumC1357a f129014f = new EnumC1357a("ACTION_ENTRY_POINT_SELECT_TRANSFERRED", 4, 4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129015a;

                    private EnumC1357a(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129015a = i11;
                    }

                    public static EnumC1357a b(int i10) {
                        if (i10 == 0) {
                            return f129010b;
                        }
                        if (i10 == 1) {
                            return f129011c;
                        }
                        int i11 = 2 << 2;
                        if (i10 == 2) {
                            return f129012d;
                        }
                        if (i10 == 3) {
                            return f129013e;
                        }
                        if (i10 != 4) {
                            return null;
                        }
                        return f129014f;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.t.f129575a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129015a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f129016b = new b("ACTION_OUTCOME_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f129017c = new b("ACTION_OUTCOME_DELETE", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f129018d = new b("ACTION_OUTCOME_DOWNLOAD", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f129019e = new b("ACTION_OUTCOME_BACKUP", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final b f129020f = new b("ACTION_OUTCOME_CANCEL", 4, 4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129021a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129021a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f129016b;
                        }
                        if (i10 == 1) {
                            return f129017c;
                        }
                        if (i10 == 2) {
                            return f129018d;
                        }
                        if (i10 == 3) {
                            return f129019e;
                        }
                        if (i10 != 4) {
                            return null;
                        }
                        return f129020f;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.u.f129608a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129021a;
                    }
                }

                public static final class c extends i3.a<m, c> implements v4 {
                    private c() {
                        super(m.f129004j);
                    }

                    /* synthetic */ c(byte b10) {
                        this();
                    }
                }

                static {
                    m mVar = new m();
                    f129004j = mVar;
                    i3.z(m.class, mVar);
                }

                private m() {
                }

                public static c5<m> B() {
                    return f129004j.r();
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129004j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0002\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c", EnumC1357a.k(), "d"});
                        case NEW_MUTABLE_INSTANCE:
                            return new m();
                        case NEW_BUILDER:
                            return new c((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129004j;
                        case GET_PARSER:
                            c5<m> c5Var = f129005k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (m.class) {
                                try {
                                    e2Var = f129005k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129004j);
                                        f129005k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class n extends i3<n, C1358a> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final n f129022k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<n> f129023l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129024f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f129025g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f129026h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private l f129027i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private o f129028j;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$n$a, reason: collision with other inner class name */
                public static final class C1358a extends i3.a<n, C1358a> implements v4 {
                    private C1358a() {
                        super(n.f129022k);
                    }

                    /* synthetic */ C1358a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f129029b = new b("SHARE_APP_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f129030c = new b("SHARE_APP_PHOTOS", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f129031d = new b("SHARE_APP_YOUTUBE", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f129032e = new b("SHARE_APP_2D_EXPORT", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final b f129033f = new b("SHARE_APP_WIGGLEGRAM", 4, 4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129034a;

                    static {
                        int i10 = 7 << 4;
                    }

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129034a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f129029b;
                        }
                        if (i10 == 1) {
                            return f129030c;
                        }
                        if (i10 == 2) {
                            return f129031d;
                        }
                        if (i10 == 3) {
                            return f129032e;
                        }
                        if (i10 != 4) {
                            return null;
                        }
                        return f129033f;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.v.f129621a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129034a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f129035b = new c("SHARE_TYPE_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f129036c = new c("SHARE_TYPE_VIDEO", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final c f129037d = new c("SHARE_TYPE_PHOTO", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final c f129038e = new c("SHARE_TYPE_LIVE", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final c f129039f = new c("SHARE_TYPE_2D_PHOTO", 4, 4);

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private static final c f129040g = new c("SHARE_TYPE_WIGGLEGRAMS", 5, 5);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129041a;

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129041a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f129035b;
                        }
                        if (i10 == 1) {
                            return f129036c;
                        }
                        if (i10 == 2) {
                            return f129037d;
                        }
                        if (i10 == 3) {
                            return f129038e;
                        }
                        if (i10 == 4) {
                            return f129039f;
                        }
                        if (i10 != 5) {
                            return null;
                        }
                        return f129040g;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.w.f129635a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129041a;
                    }
                }

                static {
                    n nVar = new n();
                    f129022k = nVar;
                    i3.z(n.class, nVar);
                }

                private n() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129022k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", c.k(), "c", b.k(), "d", "e"});
                        case NEW_MUTABLE_INSTANCE:
                            return new n();
                        case NEW_BUILDER:
                            return new C1358a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129022k;
                        case GET_PARSER:
                            c5<n> c5Var = f129023l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (n.class) {
                                try {
                                    e2Var = f129023l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129022k);
                                        f129023l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class o extends i3<o, C1359a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final o f129042i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<o> f129043j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129044f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private long f129045g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f129046h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$o$a, reason: collision with other inner class name */
                public static final class C1359a extends i3.a<o, C1359a> implements v4 {
                    private C1359a() {
                        super(o.f129042i);
                    }

                    /* synthetic */ C1359a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f129047b = new b("UNKNOWN_CODEC", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f129048c = new b("H264", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f129049d = new b("H265", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f129050e = new b("VP9", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129051a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129051a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f129047b;
                        }
                        if (i10 == 1) {
                            return f129048c;
                        }
                        if (i10 == 2) {
                            return f129049d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f129050e;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.x.f129661a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129051a;
                    }
                }

                static {
                    o oVar = new o();
                    f129042i = oVar;
                    i3.z(o.class, oVar);
                }

                private o() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129042i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0000\u0002\f\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", b.k()});
                        case NEW_MUTABLE_INSTANCE:
                            return new o();
                        case NEW_BUILDER:
                            return new C1359a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129042i;
                        case GET_PARSER:
                            c5<o> c5Var = f129043j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (o.class) {
                                try {
                                    e2Var = f129043j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129042i);
                                        f129043j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class p extends i3<p, C1360a> implements v4 {

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static final p f129052o;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private static volatile c5<p> f129053s;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129054f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f129055g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f129056h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f129057i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private long f129058j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private int f129059k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private int f129060l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private int f129061m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private int f129062n;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$p$a, reason: collision with other inner class name */
                public static final class C1360a extends i3.a<p, C1360a> implements v4 {
                    private C1360a() {
                        super(p.f129052o);
                    }

                    /* synthetic */ C1360a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f129063b = new b("UNKNOWN_MEDIA_TYPE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f129064c = new b("VR_PHOTO", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f129065d = new b("VR_VIDEO", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129066a;

                    static {
                        int i10 = 5 | 1;
                    }

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129066a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f129063b;
                        }
                        if (i10 == 1) {
                            return f129064c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f129065d;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.y.f129699a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129066a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f129067b = new c("UNKNOWN_TRIGGER_ACTION", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f129068c = new c("GALLERY_SELECTION", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final c f129069d = new c("ONE_UP_SELECTION", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final c f129070e = new c("VR_ENTRY", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129071a;

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129071a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f129067b;
                        }
                        if (i10 == 1) {
                            return f129068c;
                        }
                        if (i10 == 2) {
                            return f129069d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f129070e;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.z.f129708a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129071a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class d implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final d f129072b = new d("UNKNOWN_VIEW_SOURCE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final d f129073c = new d("LOCAL", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final d f129074d = new d("CAMERA", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final d f129075e = new d("EXTENSION", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129076a;

                    private d(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129076a = i11;
                    }

                    public static d b(int i10) {
                        if (i10 == 0) {
                            return f129072b;
                        }
                        if (i10 == 1) {
                            return f129073c;
                        }
                        if (i10 == 2) {
                            return f129074d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f129075e;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.a0.f127688a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129076a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class e implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final e f129077b = new e("UNKNOWN_VIEW_TYPE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final e f129078c = new e("FLAT", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final e f129079d = new e("CARDBOARD", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final e f129080e = new e("DAYDREAM", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129081a;

                    private e(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129081a = i11;
                    }

                    public static e b(int i10) {
                        if (i10 == 0) {
                            return f129077b;
                        }
                        if (i10 == 1) {
                            return f129078c;
                        }
                        if (i10 == 2) {
                            return f129079d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f129080e;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.c0.f127720a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129081a;
                    }
                }

                static {
                    p pVar = new p();
                    f129052o = pVar;
                    i3.z(p.class, pVar);
                }

                private p() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129052o, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\f\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\f\u0007", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c", e.k(), "d", "e", RequestParams.F, d.k(), "g", androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k, c.k()});
                        case NEW_MUTABLE_INSTANCE:
                            return new p();
                        case NEW_BUILDER:
                            return new C1360a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129052o;
                        case GET_PARSER:
                            c5<p> c5Var = f129053s;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (p.class) {
                                try {
                                    e2Var = f129053s;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129052o);
                                        f129053s = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class q extends i3<q, C1361a> implements v4 {

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static final q f129082o;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private static volatile c5<q> f129083s;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129084f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f129085g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f129086h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f129087i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private long f129088j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private int f129089k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private int f129090l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private int f129091m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private int f129092n;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$q$a, reason: collision with other inner class name */
                public static final class C1361a extends i3.a<q, C1361a> implements v4 {
                    private C1361a() {
                        super(q.f129082o);
                    }

                    /* synthetic */ C1361a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f129093b = new b("UNKNOWN_CONNECTION_ATTEMPT_TYPE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f129094c = new b("MANAGED_CONNECTION_ATTEMPT_TYPE", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f129095d = new b("MANUAL_CONNECTION_ATTEMPT_TYPE", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129096a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129096a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f129093b;
                        }
                        if (i10 == 1) {
                            return f129094c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f129095d;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.d0.f127768a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129096a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f129097b = new c("UNKNOWN_CONNECTION_TYPE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f129098c = new c("SHARED_WIFI", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final c f129099d = new c("CAMERA_WIFI", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final c f129100e = new c("WIFI_DIRECT", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129101a;

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129101a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f129097b;
                        }
                        if (i10 == 1) {
                            return f129098c;
                        }
                        if (i10 == 2) {
                            return f129099d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f129100e;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.e0.f127782a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129101a;
                    }
                }

                static {
                    q qVar = new q();
                    f129082o = qVar;
                    i3.z(q.class, qVar);
                }

                private q() {
                }

                public static c5<q> B() {
                    return f129082o.r();
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129082o, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0004\u0004\u0006\f\u0005\u0007\u0004\u0006\b\u0004\u0007", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", c.k(), "c", "d", "e", RequestParams.F, "g", b.k(), androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k});
                        case NEW_MUTABLE_INSTANCE:
                            return new q();
                        case NEW_BUILDER:
                            return new C1361a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129082o;
                        case GET_PARSER:
                            c5<q> c5Var = f129083s;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (q.class) {
                                try {
                                    e2Var = f129083s;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129082o);
                                        f129083s = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$r, reason: collision with other inner class name */
            public static final class C1362r extends i3<C1362r, C1363a> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final C1362r f129102j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<C1362r> f129103k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129104f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f129105g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f129106h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private long f129107i;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$r$a, reason: collision with other inner class name */
                public static final class C1363a extends i3.a<C1362r, C1363a> implements v4 {
                    private C1363a() {
                        super(C1362r.f129102j);
                    }

                    /* synthetic */ C1363a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$r$r$b */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f129108b = new b("STATUS_UNKNOWN", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f129109c = new b("STATUS_COMPLETE", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f129110d = new b("STATUS_ERROR", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129111a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129111a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f129108b;
                        }
                        if (i10 == 1) {
                            return f129109c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f129110d;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.f0.f129365a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129111a;
                    }
                }

                static {
                    C1362r c1362r = new C1362r();
                    f129102j = c1362r;
                    i3.z(C1362r.class, c1362r);
                }

                private C1362r() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129102j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u0002\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k(), "c", "d"});
                        case NEW_MUTABLE_INSTANCE:
                            return new C1362r();
                        case NEW_BUILDER:
                            return new C1363a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129102j;
                        case GET_PARSER:
                            c5<C1362r> c5Var = f129103k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (C1362r.class) {
                                try {
                                    e2Var = f129103k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129102j);
                                        f129103k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                r rVar = new r();
                Z = rVar;
                i3.z(r.class, rVar);
            }

            private r() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(Z, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\t\t\u000b\t\n\f\t\u000b\r\t\f\u000e\t\r\u000f\t\u000e", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k, "j", "k", androidx.media3.exoplayer.upstream.h.f65996j, androidx.media3.exoplayer.upstream.h.f66001o, "n", "o", "p"});
                    case NEW_MUTABLE_INSTANCE:
                        return new r();
                    case NEW_BUILDER:
                        return new b((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return Z;
                    case GET_PARSER:
                        c5<r> c5Var = f128836p0;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (r.class) {
                            try {
                                e2Var = f128836p0;
                                if (e2Var == null) {
                                    e2Var = new e2(Z);
                                    f128836p0 = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* JADX WARN: $VALUES field not found */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        public static final class s implements n3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final s f129112b = new s("UNKNOWN_EVENT_SOURCE", 0, 0);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final s f129113c = new s("VR_CORE", 1, 1);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final s f129114d = new s("VR_CORE_LOGGING_SERVICE", 2, 2);

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final s f129115e = new s("CARDBOARD_HOME", 3, 3);

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final s f129116f = new s("DAYDREAM_HOME", 4, 4);

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f129117a;

            private s(String str, int i10, int i11) {
                super(str, i10);
                this.f129117a = i11;
            }

            public static s b(int i10) {
                if (i10 == 0) {
                    return f129112b;
                }
                if (i10 == 1) {
                    return f129113c;
                }
                if (i10 == 2) {
                    return f129114d;
                }
                if (i10 == 3) {
                    return f129115e;
                }
                int i11 = 5 ^ 4;
                if (i10 != 4) {
                    return null;
                }
                return f129116f;
            }

            public static p3 k() {
                return com.google.vr.sdk.deps.g0.f129406a;
            }

            @Override // com.google.vr.sdk.deps.n3
            public final int i() {
                return this.f129117a;
            }
        }

        public static final class t extends i3<t, C1364a> implements v4 {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final t f129118h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static volatile c5<t> f129119i;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f129120f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f129121g = "";

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$t$a, reason: collision with other inner class name */
            public static final class C1364a extends i3.a<t, C1364a> implements v4 {
                private C1364a() {
                    super(t.f129118h);
                }

                /* synthetic */ C1364a(byte b10) {
                    this();
                }
            }

            static {
                t tVar = new t();
                f129118h = tVar;
                i3.z(t.class, tVar);
            }

            private t() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f129118h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b"});
                    case NEW_MUTABLE_INSTANCE:
                        return new t();
                    case NEW_BUILDER:
                        return new C1364a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f129118h;
                    case GET_PARSER:
                        c5<t> c5Var = f129119i;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (t.class) {
                            try {
                                e2Var = f129119i;
                                if (e2Var == null) {
                                    e2Var = new e2(f129118h);
                                    f129119i = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class u extends i3<u, C1365a> implements v4 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final u f129122g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static volatile c5<u> f129123h;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private u3<b> f129124f = i3.o();

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$u$a, reason: collision with other inner class name */
            public static final class C1365a extends i3.a<u, C1365a> implements v4 {
                private C1365a() {
                    super(u.f129122g);
                }

                /* synthetic */ C1365a(byte b10) {
                    this();
                }
            }

            public static final class b extends i3<b, C1366a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final b f129125i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<b> f129126j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129127f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private String f129128g = "";

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private String f129129h = "";

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$u$b$a, reason: collision with other inner class name */
                public static final class C1366a extends i3.a<b, C1366a> implements v4 {
                    private C1366a() {
                        super(b.f129125i);
                    }

                    /* synthetic */ C1366a(byte b10) {
                        this();
                    }
                }

                static {
                    b bVar = new b();
                    f129125i = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129125i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1366a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129125i;
                        case GET_PARSER:
                            c5<b> c5Var = f129126j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f129126j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129125i);
                                        f129126j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                u uVar = new u();
                f129122g = uVar;
                i3.z(u.class, uVar);
            }

            private u() {
            }

            public static c5<u> B() {
                return f129122g.r();
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f129122g, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, b.class});
                    case NEW_MUTABLE_INSTANCE:
                        return new u();
                    case NEW_BUILDER:
                        return new C1365a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f129122g;
                    case GET_PARSER:
                        c5<u> c5Var = f129123h;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (u.class) {
                            try {
                                e2Var = f129123h;
                                if (e2Var == null) {
                                    e2Var = new e2(f129122g);
                                    f129123h = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class v extends i3<v, C1367a> implements v4 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static final v f129130n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static volatile c5<v> f129131o;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f129132f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Object f129134h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private long f129136j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private float f129137k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private long f129138l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private c f129139m;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f129133g = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f129135i = 6;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$v$a, reason: collision with other inner class name */
            public static final class C1367a extends i3.a<v, C1367a> implements v4 {
                private C1367a() {
                    super(v.f129130n);
                }

                /* synthetic */ C1367a(byte b10) {
                    this();
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class b implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final b f129140b = new b("DVR_POSE_FLAG_SERVICE_EXCEPTION", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final b f129141c = new b("DVR_POSE_FLAG_FISHEYE_OVER_EXPOSED", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final b f129142d = new b("DVR_POSE_FLAG_FISHEYE_UNDER_EXPOSED", 2, 2);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final b f129143e = new b("DVR_POSE_FLAG_COLOR_OVER_EXPOSED", 3, 3);

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static final b f129144f = new b("DVR_POSE_FLAG_COLOR_UNDER_EXPOSED", 4, 4);

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static final b f129145g = new b("DVR_POSE_FLAG_TOO_FEW_FEATURES_TRACKED", 5, 5);

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final b f129146h = new b("NO_FALLBACK", 6, 6);

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final b f129147i = new b("ERROR_FALLBACK", 7, 7);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f129148a;

                private b(String str, int i10, int i11) {
                    super(str, i10);
                    this.f129148a = i11;
                }

                public static b b(int i10) {
                    switch (i10) {
                        case 0:
                            return f129140b;
                        case 1:
                            return f129141c;
                        case 2:
                            return f129142d;
                        case 3:
                            return f129143e;
                        case 4:
                            return f129144f;
                        case 5:
                            return f129145g;
                        case 6:
                            return f129146h;
                        case 7:
                            return f129147i;
                        default:
                            return null;
                    }
                }

                public static p3 k() {
                    return com.google.vr.sdk.deps.h0.f129416a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f129148a;
                }
            }

            public static final class c extends i3<c, C1368a> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final c f129149k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<c> f129150l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129151f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private long f129152g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f129153h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private u3<b> f129154i = i3.o();

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private u3<C1370c> f129155j = i3.o();

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$v$c$a, reason: collision with other inner class name */
                public static final class C1368a extends i3.a<c, C1368a> implements v4 {
                    private C1368a() {
                        super(c.f129149k);
                    }

                    /* synthetic */ C1368a(byte b10) {
                        this();
                    }
                }

                public static final class b extends i3<b, C1369a> implements v4 {

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private static final b f129156i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private static volatile c5<b> f129157j;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private int f129158f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private long f129159g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private int f129160h;

                    /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$v$c$b$a, reason: collision with other inner class name */
                    public static final class C1369a extends i3.a<b, C1369a> implements v4 {
                        private C1369a() {
                            super(b.f129156i);
                        }

                        /* synthetic */ C1369a(byte b10) {
                            this();
                        }
                    }

                    static {
                        b bVar = new b();
                        f129156i = bVar;
                        i3.z(b.class, bVar);
                    }

                    private b() {
                    }

                    @Override // com.google.vr.sdk.deps.i3
                    protected final Object l(i3.d dVar, Object obj, Object obj2) {
                        c5 e2Var;
                        switch (dVar) {
                            case GET_MEMOIZED_IS_INITIALIZED:
                                return (byte) 1;
                            case SET_MEMOIZED_IS_INITIALIZED:
                                return null;
                            case BUILD_MESSAGE_INFO:
                                return i3.w(f129156i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0004\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                            case NEW_MUTABLE_INSTANCE:
                                return new b();
                            case NEW_BUILDER:
                                return new C1369a((byte) 0);
                            case GET_DEFAULT_INSTANCE:
                                return f129156i;
                            case GET_PARSER:
                                c5<b> c5Var = f129157j;
                                if (c5Var != null) {
                                    return c5Var;
                                }
                                synchronized (b.class) {
                                    try {
                                        e2Var = f129157j;
                                        if (e2Var == null) {
                                            e2Var = new e2(f129156i);
                                            f129157j = e2Var;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                    break;
                                }
                                return e2Var;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }
                }

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$v$c$c, reason: collision with other inner class name */
                public static final class C1370c extends i3<C1370c, C1371a> implements v4 {

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    private static final C1370c f129161k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    private static volatile c5<C1370c> f129162l;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private int f129163f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private long f129164g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private boolean f129165h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private q3 f129166i = i3.m();

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private q3 f129167j = i3.m();

                    /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$v$c$c$a, reason: collision with other inner class name */
                    public static final class C1371a extends i3.a<C1370c, C1371a> implements v4 {
                        private C1371a() {
                            super(C1370c.f129161k);
                        }

                        /* synthetic */ C1371a(byte b10) {
                            this();
                        }
                    }

                    static {
                        C1370c c1370c = new C1370c();
                        f129161k = c1370c;
                        i3.z(C1370c.class, c1370c);
                    }

                    private C1370c() {
                    }

                    @Override // com.google.vr.sdk.deps.i3
                    protected final Object l(i3.d dVar, Object obj, Object obj2) {
                        c5 e2Var;
                        switch (dVar) {
                            case GET_MEMOIZED_IS_INITIALIZED:
                                return (byte) 1;
                            case SET_MEMOIZED_IS_INITIALIZED:
                                return null;
                            case BUILD_MESSAGE_INFO:
                                return i3.w(f129161k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0002\u0000\u0002\u0007\u0001\u0003\u0013\u0004\u0013", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e"});
                            case NEW_MUTABLE_INSTANCE:
                                return new C1370c();
                            case NEW_BUILDER:
                                return new C1371a((byte) 0);
                            case GET_DEFAULT_INSTANCE:
                                return f129161k;
                            case GET_PARSER:
                                c5<C1370c> c5Var = f129162l;
                                if (c5Var != null) {
                                    return c5Var;
                                }
                                synchronized (C1370c.class) {
                                    try {
                                        e2Var = f129162l;
                                        if (e2Var == null) {
                                            e2Var = new e2(f129161k);
                                            f129162l = e2Var;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                    break;
                                }
                                return e2Var;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }
                }

                static {
                    c cVar = new c();
                    f129149k = cVar;
                    i3.z(c.class, cVar);
                }

                private c() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129149k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u001b\u0004\u001b", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", b.class, "e", C1370c.class});
                        case NEW_MUTABLE_INSTANCE:
                            return new c();
                        case NEW_BUILDER:
                            return new C1368a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129149k;
                        case GET_PARSER:
                            c5<c> c5Var = f129150l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (c.class) {
                                try {
                                    e2Var = f129150l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129149k);
                                        f129150l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class d extends i3<d, C1372a> implements v4 {

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static final d f129168o;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private static volatile c5<d> f129169s;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129170f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private float f129171g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private float f129172h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private float f129173i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private q3 f129174j = i3.m();

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private q3 f129175k = i3.m();

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private float f129176l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private float f129177m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private float f129178n;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$v$d$a, reason: collision with other inner class name */
                public static final class C1372a extends i3.a<d, C1372a> implements v4 {
                    private C1372a() {
                        super(d.f129168o);
                    }

                    /* synthetic */ C1372a(byte b10) {
                        this();
                    }
                }

                static {
                    d dVar = new d();
                    f129168o = dVar;
                    i3.z(d.class, dVar);
                }

                private d() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129168o, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004\u0013\u0005\u0013\u0006\u0001\u0003\u0007\u0001\u0004\b\u0001\u0005", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k});
                        case NEW_MUTABLE_INSTANCE:
                            return new d();
                        case NEW_BUILDER:
                            return new C1372a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129168o;
                        case GET_PARSER:
                            c5<d> c5Var = f129169s;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (d.class) {
                                try {
                                    e2Var = f129169s;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129168o);
                                        f129169s = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                v vVar = new v();
                f129130n = vVar;
                i3.z(v.class, vVar);
            }

            private v() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f129130n, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u0001\u0002\u0004\u0002\u0003\u0005\t\u0004\u0006<\u0000", new Object[]{"c", "b", androidx.media3.exoplayer.upstream.h.f65998l, "d", b.k(), "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g, d.class});
                    case NEW_MUTABLE_INSTANCE:
                        return new v();
                    case NEW_BUILDER:
                        return new C1367a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f129130n;
                    case GET_PARSER:
                        c5<v> c5Var = f129131o;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (v.class) {
                            try {
                                e2Var = f129131o;
                                if (e2Var == null) {
                                    e2Var = new e2(f129130n);
                                    f129131o = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class w extends i3<w, C1373a> implements v4 {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final w f129179i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static volatile c5<w> f129180j;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f129181f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f129182g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f129183h;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$w$a, reason: collision with other inner class name */
            public static final class C1373a extends i3.a<w, C1373a> implements v4 {
                private C1373a() {
                    super(w.f129179i);
                }

                /* synthetic */ C1373a(byte b10) {
                    this();
                }
            }

            static {
                w wVar = new w();
                f129179i = wVar;
                i3.z(w.class, wVar);
            }

            private w() {
            }

            public static c5<w> B() {
                return f129179i.r();
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f129179i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                    case NEW_MUTABLE_INSTANCE:
                        return new w();
                    case NEW_BUILDER:
                        return new C1373a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f129179i;
                    case GET_PARSER:
                        c5<w> c5Var = f129180j;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (w.class) {
                            try {
                                e2Var = f129180j;
                                if (e2Var == null) {
                                    e2Var = new e2(f129179i);
                                    f129180j = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        @Deprecated
        public static final class x extends i3<x, b> implements v4 {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final x f129184j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static volatile c5<x> f129185k;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f129186f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private e f129187g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private g f129188h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private f f129189i;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$x$a, reason: collision with other inner class name */
            public static final class C1374a extends i3<C1374a, C1375a> implements v4 {

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static final C1374a f129190l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private static volatile c5<C1374a> f129191m;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129192f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private long f129193g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f129194h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f129195i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f129196j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private int f129197k;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$x$a$a, reason: collision with other inner class name */
                public static final class C1375a extends i3.a<C1374a, C1375a> implements v4 {
                    private C1375a() {
                        super(C1374a.f129190l);
                    }

                    /* synthetic */ C1375a(byte b10) {
                        this();
                    }
                }

                static {
                    C1374a c1374a = new C1374a();
                    f129190l = c1374a;
                    i3.z(C1374a.class, c1374a);
                }

                private C1374a() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129190l, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\f\u0003\u0005\u0004\u0004", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", e.EnumC1378a.k(), RequestParams.F});
                        case NEW_MUTABLE_INSTANCE:
                            return new C1374a();
                        case NEW_BUILDER:
                            return new C1375a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129190l;
                        case GET_PARSER:
                            c5<C1374a> c5Var = f129191m;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (C1374a.class) {
                                try {
                                    e2Var = f129191m;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129190l);
                                        f129191m = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class b extends i3.a<x, b> implements v4 {
                private b() {
                    super(x.f129184j);
                }

                /* synthetic */ b(byte b10) {
                    this();
                }
            }

            public static final class c extends i3<c, C1376a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final c f129198i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<c> f129199j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129200f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private h f129201g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private boolean f129202h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$x$c$a, reason: collision with other inner class name */
                public static final class C1376a extends i3.a<c, C1376a> implements v4 {
                    private C1376a() {
                        super(c.f129198i);
                    }

                    /* synthetic */ C1376a(byte b10) {
                        this();
                    }
                }

                static {
                    c cVar = new c();
                    f129198i = cVar;
                    i3.z(c.class, cVar);
                }

                private c() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129198i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\u0007\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new c();
                        case NEW_BUILDER:
                            return new C1376a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129198i;
                        case GET_PARSER:
                            c5<c> c5Var = f129199j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (c.class) {
                                try {
                                    e2Var = f129199j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129198i);
                                        f129199j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class d extends i3<d, C1377a> implements v4 {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final d f129203h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static volatile c5<d> f129204i;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129205f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f129206g;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$x$d$a, reason: collision with other inner class name */
                public static final class C1377a extends i3.a<d, C1377a> implements v4 {
                    private C1377a() {
                        super(d.f129203h);
                    }

                    /* synthetic */ C1377a(byte b10) {
                        this();
                    }
                }

                static {
                    d dVar = new d();
                    f129203h = dVar;
                    i3.z(d.class, dVar);
                }

                private d() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129203h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", g.c.k()});
                        case NEW_MUTABLE_INSTANCE:
                            return new d();
                        case NEW_BUILDER:
                            return new C1377a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129203h;
                        case GET_PARSER:
                            c5<d> c5Var = f129204i;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (d.class) {
                                try {
                                    e2Var = f129204i;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129203h);
                                        f129204i = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class e extends i3<e, b> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final e f129207k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<e> f129208l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129209f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private String f129210g = "";

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private j f129211h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private c f129212i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private C1374a f129213j;

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$x$e$a, reason: collision with other inner class name */
                public static final class EnumC1378a implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final EnumC1378a f129214b = new EnumC1378a("UNKNOWN_AUDIO_CODEC", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final EnumC1378a f129215c = new EnumC1378a("PCM", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final EnumC1378a f129216d = new EnumC1378a("VORBIS", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final EnumC1378a f129217e = new EnumC1378a("AAC", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final EnumC1378a f129218f = new EnumC1378a("OPUS", 4, 4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129219a;

                    private EnumC1378a(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129219a = i11;
                    }

                    public static EnumC1378a b(int i10) {
                        if (i10 == 0) {
                            return f129214b;
                        }
                        if (i10 == 1) {
                            return f129215c;
                        }
                        if (i10 == 2) {
                            return f129216d;
                        }
                        if (i10 == 3) {
                            return f129217e;
                        }
                        if (i10 != 4) {
                            return null;
                        }
                        return f129218f;
                    }

                    public static p3 k() {
                        return com.google.vr.sdk.deps.i0.f129424a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129219a;
                    }
                }

                public static final class b extends i3.a<e, b> implements v4 {
                    private b() {
                        super(e.f129207k);
                    }

                    /* synthetic */ b(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f129220b = new c("UNKNOWN_VIDEO_CODEC", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f129221c = new c("H264", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final c f129222d = new c("VP9", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final c f129223e = new c("H265", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final c f129224f = new c("VP8", 4, 4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129225a;

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129225a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f129220b;
                        }
                        if (i10 == 1) {
                            return f129221c;
                        }
                        if (i10 == 2) {
                            return f129222d;
                        }
                        if (i10 == 3) {
                            return f129223e;
                        }
                        if (i10 != 4) {
                            return null;
                        }
                        return f129224f;
                    }

                    public static p3 k() {
                        return j0.f129454a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129225a;
                    }
                }

                static {
                    e eVar = new e();
                    f129207k = eVar;
                    i3.z(e.class, eVar);
                }

                private e() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129207k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e"});
                        case NEW_MUTABLE_INSTANCE:
                            return new e();
                        case NEW_BUILDER:
                            return new b((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129207k;
                        case GET_PARSER:
                            c5<e> c5Var = f129208l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (e.class) {
                                try {
                                    e2Var = f129208l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129207k);
                                        f129208l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class f extends i3<f, C1379a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final f f129226i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<f> f129227j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129228f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f129229g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f129230h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$x$f$a, reason: collision with other inner class name */
                public static final class C1379a extends i3.a<f, C1379a> implements v4 {
                    private C1379a() {
                        super(f.f129226i);
                    }

                    /* synthetic */ C1379a(byte b10) {
                        this();
                    }
                }

                static {
                    f fVar = new f();
                    f129226i = fVar;
                    i3.z(f.class, fVar);
                }

                private f() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129226i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new f();
                        case NEW_BUILDER:
                            return new C1379a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129226i;
                        case GET_PARSER:
                            c5<f> c5Var = f129227j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (f.class) {
                                try {
                                    e2Var = f129227j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129226i);
                                        f129227j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class g extends i3<g, C1380a> implements v4 {

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static final g f129231l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private static volatile c5<g> f129232m;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129233f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f129234g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private long f129235h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f129236i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private k f129237j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private d f129238k;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$x$g$a, reason: collision with other inner class name */
                public static final class C1380a extends i3.a<g, C1380a> implements v4 {
                    private C1380a() {
                        super(g.f129231l);
                    }

                    /* synthetic */ C1380a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f129239b = new b("UNKNOWN_ENGINE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f129240c = new b("EXOPLAYER", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f129241d = new b("PLAYER2", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129242a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129242a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f129239b;
                        }
                        if (i10 == 1) {
                            return f129240c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f129241d;
                    }

                    public static p3 k() {
                        return k0.f129463a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129242a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class c implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final c f129243b = new c("UNKNOWN_MODE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final c f129244c = new c("VR", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final c f129245d = new c("MAGIC_WINDOW", 2, 2);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129246a;

                    private c(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129246a = i11;
                    }

                    public static c b(int i10) {
                        if (i10 == 0) {
                            return f129243b;
                        }
                        if (i10 == 1) {
                            return f129244c;
                        }
                        if (i10 != 2) {
                            return null;
                        }
                        return f129245d;
                    }

                    public static p3 k() {
                        return l0.f129472a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129246a;
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class d implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final d f129247b = new d("UNKNOWN_STATE", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final d f129248c = new d("PLAYBACK_ERROR", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final d f129249d = new d("PLAYBACK_STARTED", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final d f129250e = new d("PLAYBACK_SUSPENDED", 3, 3);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129251a;

                    private d(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129251a = i11;
                    }

                    public static d b(int i10) {
                        if (i10 == 0) {
                            return f129247b;
                        }
                        if (i10 == 1) {
                            return f129248c;
                        }
                        if (i10 == 2) {
                            return f129249d;
                        }
                        if (i10 != 3) {
                            return null;
                        }
                        return f129250e;
                    }

                    public static p3 k() {
                        return m0.f129480a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129251a;
                    }
                }

                static {
                    g gVar = new g();
                    f129231l = gVar;
                    i3.z(g.class, gVar);
                }

                private g() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129231l, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\f\u0002\u0004\t\u0003\u0005\t\u0004", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", d.k(), "c", "d", b.k(), "e", RequestParams.F});
                        case NEW_MUTABLE_INSTANCE:
                            return new g();
                        case NEW_BUILDER:
                            return new C1380a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129231l;
                        case GET_PARSER:
                            c5<g> c5Var = f129232m;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (g.class) {
                                try {
                                    e2Var = f129232m;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129231l);
                                        f129232m = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class h extends i3<h, C1381a> implements v4 {

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final h f129252i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static volatile c5<h> f129253j;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129254f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f129255g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f129256h;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$x$h$a, reason: collision with other inner class name */
                public static final class C1381a extends i3.a<h, C1381a> implements v4 {
                    private C1381a() {
                        super(h.f129252i);
                    }

                    /* synthetic */ C1381a(byte b10) {
                        this();
                    }
                }

                static {
                    h hVar = new h();
                    f129252i = hVar;
                    i3.z(h.class, hVar);
                }

                private h() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129252i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                        case NEW_MUTABLE_INSTANCE:
                            return new h();
                        case NEW_BUILDER:
                            return new C1381a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129252i;
                        case GET_PARSER:
                            c5<h> c5Var = f129253j;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (h.class) {
                                try {
                                    e2Var = f129253j;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129252i);
                                        f129253j = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class i extends i3<i, C1382a> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final i f129257j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<i> f129258k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129259f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f129260g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f129261h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f129262i;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$x$i$a, reason: collision with other inner class name */
                public static final class C1382a extends i3.a<i, C1382a> implements v4 {
                    private C1382a() {
                        super(i.f129257j);
                    }

                    /* synthetic */ C1382a(byte b10) {
                        this();
                    }
                }

                /* JADX WARN: $VALUES field not found */
                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                public static final class b implements n3 {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static final b f129263b = new b("UNKNOWN_PROJECTION", 0, 0);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static final b f129264c = new b("RECTANGULAR", 1, 1);

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static final b f129265d = new b("EQUIRECTANGULAR", 2, 2);

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static final b f129266e = new b("CUBEMAP", 3, 3);

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static final b f129267f = new b("MESH", 4, 4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final int f129268a;

                    private b(String str, int i10, int i11) {
                        super(str, i10);
                        this.f129268a = i11;
                    }

                    public static b b(int i10) {
                        if (i10 == 0) {
                            return f129263b;
                        }
                        if (i10 == 1) {
                            return f129264c;
                        }
                        if (i10 == 2) {
                            return f129265d;
                        }
                        int i11 = 2 ^ 3;
                        if (i10 == 3) {
                            return f129266e;
                        }
                        int i12 = i11 << 4;
                        if (i10 != 4) {
                            return null;
                        }
                        return f129267f;
                    }

                    public static p3 k() {
                        return n0.f129488a;
                    }

                    @Override // com.google.vr.sdk.deps.n3
                    public final int i() {
                        return this.f129268a;
                    }
                }

                static {
                    i iVar = new i();
                    f129257j = iVar;
                    i3.z(i.class, iVar);
                }

                private i() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129257j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\f\u0001\u0003\u0004\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", b.k(), "d"});
                        case NEW_MUTABLE_INSTANCE:
                            return new i();
                        case NEW_BUILDER:
                            return new C1382a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129257j;
                        case GET_PARSER:
                            c5<i> c5Var = f129258k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (i.class) {
                                try {
                                    e2Var = f129258k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129257j);
                                        f129258k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class j extends i3<j, C1383a> implements v4 {
                private static final j X;
                private static volatile c5<j> Y;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129269f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private long f129270g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private h f129271h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private double f129272i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f129273j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private int f129274k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private int f129275l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private int f129276m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private int f129277n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private i f129278o;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private int f129279s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private boolean f129280t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                private boolean f129281v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                private boolean f129282w;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$x$j$a, reason: collision with other inner class name */
                public static final class C1383a extends i3.a<j, C1383a> implements v4 {
                    private C1383a() {
                        super(j.X);
                    }

                    /* synthetic */ C1383a(byte b10) {
                        this();
                    }
                }

                static {
                    j jVar = new j();
                    X = jVar;
                    i3.z(j.class, jVar);
                }

                private j() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(X, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001\u0002\u0000\u0002\t\u0001\u0003\u0000\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\f\u0006\b\f\u0007\t\t\b\n\u0004\t\u000b\u0007\n\f\u0007\u000b\r\u0007\f", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g, e.c.k(), androidx.media3.exoplayer.upstream.h.f65997k, e.EnumC1378a.k(), "j", "k", androidx.media3.exoplayer.upstream.h.f65996j, androidx.media3.exoplayer.upstream.h.f66001o, "n"});
                        case NEW_MUTABLE_INSTANCE:
                            return new j();
                        case NEW_BUILDER:
                            return new C1383a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return X;
                        case GET_PARSER:
                            c5<j> c5Var = Y;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (j.class) {
                                try {
                                    e2Var = Y;
                                    if (e2Var == null) {
                                        e2Var = new e2(X);
                                        Y = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            public static final class k extends i3<k, C1384a> implements v4 {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final k f129283j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static volatile c5<k> f129284k;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129285f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f129286g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private boolean f129287h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f129288i;

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$x$k$a, reason: collision with other inner class name */
                public static final class C1384a extends i3.a<k, C1384a> implements v4 {
                    private C1384a() {
                        super(k.f129283j);
                    }

                    /* synthetic */ C1384a(byte b10) {
                        this();
                    }
                }

                static {
                    k kVar = new k();
                    f129283j = kVar;
                    i3.z(k.class, kVar);
                }

                private k() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129283j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\u0004\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", g.c.k(), "c", "d"});
                        case NEW_MUTABLE_INSTANCE:
                            return new k();
                        case NEW_BUILDER:
                            return new C1384a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129283j;
                        case GET_PARSER:
                            c5<k> c5Var = f129284k;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (k.class) {
                                try {
                                    e2Var = f129284k;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129283j);
                                        f129284k = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            static {
                x xVar = new x();
                f129184j = xVar;
                i3.z(x.class, xVar);
            }

            private x() {
            }

            public static c5<x> B() {
                return f129184j.r();
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f129184j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d"});
                    case NEW_MUTABLE_INSTANCE:
                        return new x();
                    case NEW_BUILDER:
                        return new b((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f129184j;
                    case GET_PARSER:
                        c5<x> c5Var = f129185k;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (x.class) {
                            try {
                                e2Var = f129185k;
                                if (e2Var == null) {
                                    e2Var = new e2(f129184j);
                                    f129185k = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class y extends i3<y, C1385a> implements v4 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final y f129289g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static volatile c5<y> f129290h;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private u3<b> f129291f = i3.o();

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$y$a, reason: collision with other inner class name */
            public static final class C1385a extends i3.a<y, C1385a> implements v4 {
                private C1385a() {
                    super(y.f129289g);
                }

                /* synthetic */ C1385a(byte b10) {
                    this();
                }
            }

            public static final class b extends i3<b, C1386a> implements v4 {

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                private static final b f129292v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                private static volatile c5<b> f129293w;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129294f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private long f129295g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f129296h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private e f129297i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private C1238a f129298j;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private int f129302n;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private int f129304s;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private u3<String> f129299k = i3.o();

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private u3<String> f129300l = i3.o();

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private String f129301m = "";

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private String f129303o = "";

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private u3<String> f129305t = i3.o();

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$y$b$a, reason: collision with other inner class name */
                public static final class C1386a extends i3.a<b, C1386a> implements v4 {
                    private C1386a() {
                        super(b.f129292v);
                    }

                    /* synthetic */ C1386a(byte b10) {
                        this();
                    }
                }

                static {
                    b bVar = new b();
                    f129292v = bVar;
                    i3.z(b.class, bVar);
                }

                private b() {
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129292v, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0003\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u001a\u0006\u001a\u0007\b\u0004\b\f\u0005\t\b\u0006\n\u0004\u0007\u000b\u001a", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", c.k(), "d", "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k, d.k(), "j", "k", androidx.media3.exoplayer.upstream.h.f65996j});
                        case NEW_MUTABLE_INSTANCE:
                            return new b();
                        case NEW_BUILDER:
                            return new C1386a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129292v;
                        case GET_PARSER:
                            c5<b> c5Var = f129293w;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (b.class) {
                                try {
                                    e2Var = f129293w;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129292v);
                                        f129293w = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class c implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final c f129306b = new c("KEYBOARD_EVENT_UNKNOWN", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final c f129307c = new c("KEYBOARD_USER_EVENT_SHOW", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final c f129308d = new c("KEYBOARD_USER_EVENT_HIDE", 2, 2);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final c f129309e = new c("KEYBOARD_USER_EVENT_COMMIT", 3, 3);

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static final c f129310f = new c("KEYBOARD_USER_EVENT_DELETE", 4, 4);

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static final c f129311g = new c("KEYBOARD_USER_EVENT_RETURN", 5, 5);

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final c f129312h = new c("KEYBOARD_USER_EVENT_DISMISS", 6, 6);

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static final c f129313i = new c("KEYBOARD_USER_EVENT_CHANGE_LANGUAGE", 7, 7);

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static final c f129314j = new c("KEYBOARD_USER_EVENT_CHANGE_LAYOUT", 8, 8);

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final c f129315k = new c("KEYBOARD_USER_EVENT_START_VOICE_INPUT", 9, 9);

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static final c f129316l = new c("KEYBOARD_USER_EVENT_CANCEL_VOICE_INPUT", 10, 10);

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private static final c f129317m = new c("KEYBOARD_ERROR_NOT_INSTALLED", 11, 1000);

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private static final c f129318n = new c("KEYBOARD_ERROR_NO_LOCALES", 12, 1001);

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private static final c f129319o = new c("KEYBOARD_EVENT_CONNECTED", 13, 2000);

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private static final c f129320s = new c("KEYBOARD_EVENT_REQUEST_RECORD_AUDIO_PERMISSION", 14, androidx.media3.common.x0.f61834p1);

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private static final c f129321t = new c("KEYBOARD_DECODE_EVENT_SEND_KEY", 15, 3000);

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                private static final c f129322v = new c("KEYBOARD_DECODE_EVENT_SEND_BACKSPACE", 16, 3001);

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                private static final c f129323w = new c("KEYBOARD_DECODE_EVENT_RECEIVE_SUGGESTION", 17, 3002);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f129324a;

                private c(String str, int i10, int i11) {
                    super(str, i10);
                    this.f129324a = i11;
                }

                public static c b(int i10) {
                    if (i10 == 1000) {
                        return f129317m;
                    }
                    if (i10 == 1001) {
                        return f129318n;
                    }
                    if (i10 == 2000) {
                        return f129319o;
                    }
                    if (i10 == 2001) {
                        return f129320s;
                    }
                    switch (i10) {
                        case 0:
                            return f129306b;
                        case 1:
                            return f129307c;
                        case 2:
                            return f129308d;
                        case 3:
                            return f129309e;
                        case 4:
                            return f129310f;
                        case 5:
                            return f129311g;
                        case 6:
                            return f129312h;
                        case 7:
                            return f129313i;
                        case 8:
                            return f129314j;
                        case 9:
                            return f129315k;
                        case 10:
                            return f129316l;
                        default:
                            switch (i10) {
                                case 3000:
                                    return f129321t;
                                case 3001:
                                    return f129322v;
                                case 3002:
                                    return f129323w;
                                default:
                                    int i11 = 5 & 0;
                                    return null;
                            }
                    }
                }

                public static p3 k() {
                    return o0.f129509a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f129324a;
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class d implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final d f129325b = new d("KEYBOARD_INPUT_TYPE_UNKNOWN", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final d f129326c = new d("KEYBOARD_INPUT_TYPE_DEFAULT", 1, 1);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f129327a;

                static {
                    int i10 = 1 << 0;
                }

                private d(String str, int i10, int i11) {
                    super(str, i10);
                    this.f129327a = i11;
                }

                public static d b(int i10) {
                    if (i10 == 0) {
                        return f129325b;
                    }
                    if (i10 != 1) {
                        return null;
                    }
                    return f129326c;
                }

                public static p3 k() {
                    return p0.f129536a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f129327a;
                }
            }

            public static final class e extends i3<e, C1387a> implements v4 {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static final e f129328k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private static volatile c5<e> f129329l;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private int f129330f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f129331g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f129332h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private String f129333i = "";

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private String f129334j = "";

                /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$y$e$a, reason: collision with other inner class name */
                public static final class C1387a extends i3.a<e, C1387a> implements v4 {
                    private C1387a() {
                        super(e.f129328k);
                    }

                    /* synthetic */ C1387a(byte b10) {
                        this();
                    }
                }

                static {
                    e eVar = new e();
                    f129328k = eVar;
                    i3.z(e.class, eVar);
                }

                private e() {
                }

                public static c5<e> B() {
                    return f129328k.r();
                }

                @Override // com.google.vr.sdk.deps.i3
                protected final Object l(i3.d dVar, Object obj, Object obj2) {
                    c5 e2Var;
                    switch (dVar) {
                        case GET_MEMOIZED_IS_INITIALIZED:
                            return (byte) 1;
                        case SET_MEMOIZED_IS_INITIALIZED:
                            return null;
                        case BUILD_MESSAGE_INFO:
                            return i3.w(f129328k, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\b\u0002\u0004\b\u0003", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", f.k(), "c", "d", "e"});
                        case NEW_MUTABLE_INSTANCE:
                            return new e();
                        case NEW_BUILDER:
                            return new C1387a((byte) 0);
                        case GET_DEFAULT_INSTANCE:
                            return f129328k;
                        case GET_PARSER:
                            c5<e> c5Var = f129329l;
                            if (c5Var != null) {
                                return c5Var;
                            }
                            synchronized (e.class) {
                                try {
                                    e2Var = f129329l;
                                    if (e2Var == null) {
                                        e2Var = new e2(f129328k);
                                        f129329l = e2Var;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            return e2Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class f implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final f f129335b = new f("TEXT_UNKNOWN", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final f f129336c = new f("TEXT_SPACE", 1, 4);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final f f129337d = new f("TEXT_SUGGESTION", 2, 5);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final f f129338e = new f("TEXT_VOICE", 3, 6);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f129339a;

                private f(String str, int i10, int i11) {
                    super(str, i10);
                    this.f129339a = i11;
                }

                public static f b(int i10) {
                    if (i10 == 0) {
                        return f129335b;
                    }
                    if (i10 == 4) {
                        return f129336c;
                    }
                    if (i10 == 5) {
                        return f129337d;
                    }
                    if (i10 == 6) {
                        return f129338e;
                    }
                    int i11 = 5 << 0;
                    return null;
                }

                public static p3 k() {
                    return q0.f129553a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f129339a;
                }
            }

            static {
                y yVar = new y();
                f129289g = yVar;
                i3.z(y.class, yVar);
            }

            private y() {
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f129289g, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, b.class});
                    case NEW_MUTABLE_INSTANCE:
                        return new y();
                    case NEW_BUILDER:
                        return new C1385a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f129289g;
                    case GET_PARSER:
                        c5<y> c5Var = f129290h;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (y.class) {
                            try {
                                e2Var = f129290h;
                                if (e2Var == null) {
                                    e2Var = new e2(f129289g);
                                    f129290h = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class z extends i3<z, C1388a> implements v4 {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final z f129340h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static volatile c5<z> f129341i;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f129342f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f129343g;

            /* JADX INFO: renamed from: com.google.vr.sdk.deps.e3$a$z$a, reason: collision with other inner class name */
            public static final class C1388a extends i3.a<z, C1388a> implements v4 {
                private C1388a() {
                    super(z.f129340h);
                }

                /* synthetic */ C1388a(byte b10) {
                    this();
                }
            }

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            public static final class b implements n3 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final b f129344b = new b("UNKNOWN", 0, 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static final b f129345c = new b("SETTINGS", 1, 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static final b f129346d = new b("FEEDBACK", 2, 2);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final b f129347e = new b("HELP", 3, 3);

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private static final b f129348f = new b("DISCOVERY", 4, 6);

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static final b f129349g = new b("LIBRARY", 5, 7);

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static final b f129350h = new b("WISHLIST", 6, 8);

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f129351a;

                private b(String str, int i10, int i11) {
                    super(str, i10);
                    this.f129351a = i11;
                }

                public static b b(int i10) {
                    if (i10 == 0) {
                        return f129344b;
                    }
                    if (i10 == 1) {
                        return f129345c;
                    }
                    if (i10 == 2) {
                        return f129346d;
                    }
                    if (i10 == 3) {
                        return f129347e;
                    }
                    if (i10 == 6) {
                        return f129348f;
                    }
                    if (i10 == 7) {
                        return f129349g;
                    }
                    if (i10 != 8) {
                        return null;
                    }
                    return f129350h;
                }

                public static p3 k() {
                    return r0.f129561a;
                }

                @Override // com.google.vr.sdk.deps.n3
                public final int i() {
                    return this.f129351a;
                }
            }

            static {
                z zVar = new z();
                f129340h = zVar;
                i3.z(z.class, zVar);
            }

            private z() {
            }

            public static c5<z> B() {
                return f129340h.r();
            }

            @Override // com.google.vr.sdk.deps.i3
            protected final Object l(i3.d dVar, Object obj, Object obj2) {
                c5 e2Var;
                switch (dVar) {
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    case BUILD_MESSAGE_INFO:
                        return i3.w(f129340h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", b.k()});
                    case NEW_MUTABLE_INSTANCE:
                        return new z();
                    case NEW_BUILDER:
                        return new C1388a((byte) 0);
                    case GET_DEFAULT_INSTANCE:
                        return f129340h;
                    case GET_PARSER:
                        c5<z> c5Var = f129341i;
                        if (c5Var != null) {
                            return c5Var;
                        }
                        synchronized (z.class) {
                            try {
                                e2Var = f129341i;
                                if (e2Var == null) {
                                    e2Var = new e2(f129340h);
                                    f129341i = e2Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        return e2Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        static {
            a aVar = new a();
            f127785t3 = aVar;
            i3.z(a.class, aVar);
        }

        private a() {
        }

        @Override // com.google.vr.sdk.deps.i3
        protected final Object l(i3.d dVar, Object obj, Object obj2) {
            c5 e2Var;
            switch (dVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return i3.w(f127785t3, "\u0001!\u0000\u0001\u0001!!\u0000\u0001\u0000\u0001\t\u0002\u0002\t\u0003\u0003\u0002\u0004\u0004\u001b\u0005\t\u0005\u0006\t\u0006\u0007\b\u0007\b\f\b\t\t\t\n\t\n\u000b\t\u000b\f\t\f\r\t\r\u000e\t\u000e\u000f\t\u000f\u0010\t\u0010\u0011\t\u0011\u0012\t\u0012\u0013\t\u0013\u0014\t\u0014\u0015\t\u0015\u0016\t\u0016\u0017\t\u0017\u0018\t\u0018\u0019\t\u0019\u001a\t\u001a\u001b\t\u001b\u001c\t\u001c\u001d\t\u001d\u001e\f\u0000\u001f\t\u001e \t\u0001!\t\u001f", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "d", "e", RequestParams.F, "g", C1238a.class, androidx.media3.exoplayer.upstream.h.f65993g, androidx.media3.exoplayer.upstream.h.f65997k, "j", "k", l.k(), androidx.media3.exoplayer.upstream.h.f65996j, androidx.media3.exoplayer.upstream.h.f66001o, "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", androidx.exifinterface.media.a.X4, "B", "C", "D", androidx.exifinterface.media.a.T4, "F", "b", s.k(), "G", "c", "H"});
                case NEW_MUTABLE_INSTANCE:
                    return new a();
                case NEW_BUILDER:
                    return new m((byte) 0);
                case GET_DEFAULT_INSTANCE:
                    return f127785t3;
                case GET_PARSER:
                    c5<a> c5Var = f127786u3;
                    if (c5Var != null) {
                        return c5Var;
                    }
                    synchronized (a.class) {
                        try {
                            e2Var = f127786u3;
                            if (e2Var == null) {
                                e2Var = new e2(f127785t3);
                                f127786u3 = e2Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return e2Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static <T extends c7> String a(T t10) {
        if (t10 == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            c(null, t10, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            return strValueOf.length() != 0 ? "Error printing proto: ".concat(strValueOf) : new String("Error printing proto: ");
        } catch (InvocationTargetException e11) {
            String strValueOf2 = String.valueOf(e11.getMessage());
            return strValueOf2.length() != 0 ? "Error printing proto: ".concat(strValueOf2) : new String("Error printing proto: ");
        }
    }

    private static String b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (i10 == 0) {
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else if (Character.isUpperCase(cCharAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }

    private static void c(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        if (obj != null) {
            if (!(obj instanceof c7)) {
                String strB = b(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(strB);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String strE = e((String) obj);
                    stringBuffer2.append("\"");
                    stringBuffer2.append(strE);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    d((byte[]) obj, stringBuffer2);
                } else {
                    stringBuffer2.append(obj);
                }
                stringBuffer2.append("\n");
                return;
            }
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(b(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray()) {
                        c(name, obj2, stringBuffer, stringBuffer2);
                    } else if (type.getComponentType() == Byte.TYPE) {
                        c(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (int i10 = 0; i10 < length2; i10++) {
                            c(name, Array.get(obj2, i10), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method method : cls.getMethods()) {
                String name2 = method.getName();
                if (name2.startsWith("set")) {
                    String strSubstring = name2.substring(3);
                    try {
                        String strValueOf = String.valueOf(strSubstring);
                        if (((Boolean) cls.getMethod(strValueOf.length() != 0 ? "has".concat(strValueOf) : new String("has"), null).invoke(obj, null)).booleanValue()) {
                            String strValueOf2 = String.valueOf(strSubstring);
                            c(strSubstring, cls.getMethod(strValueOf2.length() != 0 ? "get".concat(strValueOf2) : new String("get"), null).invoke(obj, null), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
        }
    }

    private static void d(byte[] bArr, StringBuffer stringBuffer) {
        if (bArr == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            if (i10 == 92 || i10 == 34) {
                stringBuffer.append('\\');
                stringBuffer.append((char) i10);
            } else if (i10 < 32 || i10 >= 127) {
                stringBuffer.append(String.format("\\%03o", Integer.valueOf(i10)));
            } else {
                stringBuffer.append((char) i10);
            }
        }
        stringBuffer.append('\"');
    }

    private static String e(String str) {
        if (!str.startsWith("http") && str.length() > 200) {
            str = String.valueOf(str.substring(0, 200)).concat("[...]");
        }
        return f(str);
    }

    private static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'') {
                sb2.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }
}
