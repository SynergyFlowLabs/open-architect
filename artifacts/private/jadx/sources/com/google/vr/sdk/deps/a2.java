package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
public final class a2 extends i3<a2, a> implements v4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a2 f127689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile c5<a2> f127690g;

    public static final class a extends i3.a<a2, a> implements v4 {
        private a() {
            super(a2.f127689f);
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    public static final class b extends i3<b, a> implements v4 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final b f127691i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static volatile c5<b> f127692j;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f127693f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f127694g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f127695h = "";

        public static final class a extends i3.a<b, a> implements v4 {
            private a() {
                super(b.f127691i);
            }

            /* synthetic */ a(byte b10) {
                this();
            }
        }

        static {
            b bVar = new b();
            f127691i = bVar;
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
                    return i3.w(f127691i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c"});
                case NEW_MUTABLE_INSTANCE:
                    return new b();
                case NEW_BUILDER:
                    return new a((byte) 0);
                case GET_DEFAULT_INSTANCE:
                    return f127691i;
                case GET_PARSER:
                    c5<b> c5Var = f127692j;
                    if (c5Var != null) {
                        return c5Var;
                    }
                    synchronized (b.class) {
                        try {
                            e2Var = f127692j;
                            if (e2Var == null) {
                                e2Var = new e2(f127691i);
                                f127692j = e2Var;
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

    static {
        a2 a2Var = new a2();
        f127689f = a2Var;
        i3.z(a2.class, a2Var);
    }

    private a2() {
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
                return i3.w(f127689f, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new a2();
            case NEW_BUILDER:
                return new a((byte) 0);
            case GET_DEFAULT_INSTANCE:
                return f127689f;
            case GET_PARSER:
                c5<a2> c5Var = f127690g;
                if (c5Var != null) {
                    return c5Var;
                }
                synchronized (a2.class) {
                    try {
                        e2Var = f127690g;
                        if (e2Var == null) {
                            e2Var = new e2(f127689f);
                            f127690g = e2Var;
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
