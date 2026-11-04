package com.google.vr.sdk.deps;

import com.devtodev.core.data.consts.RequestParams;

/* JADX INFO: loaded from: classes5.dex */
public final class f7 {

    public static final class a extends i3<a, C1389a> implements v4 {

        /* JADX INFO: renamed from: g3, reason: collision with root package name */
        private static volatile c5<a> f129387g3;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        private static final a f129388p2;
        private int H1;
        private int X;
        private int Y;
        private int Z;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f129389f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f129390g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f129391h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f129392i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f129393j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f129394k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f129395l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f129396m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f129397n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f129398o;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        private int f129399p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        private int f129400p1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f129401s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f129402t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f129403v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f129404w;

        /* JADX INFO: renamed from: com.google.vr.sdk.deps.f7$a$a, reason: collision with other inner class name */
        public static final class C1389a extends i3.a<a, C1389a> implements v4 {
            private C1389a() {
                super(a.f129388p2);
            }

            /* synthetic */ C1389a(byte b10) {
                this();
            }
        }

        static {
            a aVar = new a();
            f129388p2 = aVar;
            i3.z(a.class, aVar);
        }

        private a() {
        }

        public static c5<a> B() {
            return f129388p2.r();
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
                    return i3.w(f129388p2, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0007\b\u0004\b\t\u0004\t\n\u0004\n\u000b\u0004\u000b\f\u0004\f\r\u0004\r\u000e\u0004\u000e\u000f\u0004\u000f\u0010\u0004\u0010\u0011\u0004\u0011\u0012\u0004\u0012\u0013\u0004\u0006", new Object[]{androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F, "g", androidx.media3.exoplayer.upstream.h.f65997k, "j", "k", androidx.media3.exoplayer.upstream.h.f65996j, androidx.media3.exoplayer.upstream.h.f66001o, "n", "o", "p", "q", "r", "s", "t", androidx.media3.exoplayer.upstream.h.f65993g});
                case NEW_MUTABLE_INSTANCE:
                    return new a();
                case NEW_BUILDER:
                    return new C1389a((byte) 0);
                case GET_DEFAULT_INSTANCE:
                    return f129388p2;
                case GET_PARSER:
                    c5<a> c5Var = f129387g3;
                    if (c5Var != null) {
                        return c5Var;
                    }
                    synchronized (a.class) {
                        try {
                            e2Var = f129387g3;
                            if (e2Var == null) {
                                e2Var = new e2(f129388p2);
                                f129387g3 = e2Var;
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
}
