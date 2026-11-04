package com.google.vr.sdk.proto;

import com.google.vr.sdk.deps.c5;
import com.google.vr.sdk.deps.e2;
import com.google.vr.sdk.deps.i3;
import com.google.vr.sdk.deps.n3;
import com.google.vr.sdk.deps.o3;
import com.google.vr.sdk.deps.p3;
import com.google.vr.sdk.deps.q3;
import com.google.vr.sdk.deps.r3;
import com.google.vr.sdk.deps.s3;
import com.google.vr.sdk.deps.u3;
import com.google.vr.sdk.deps.v4;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: com.google.vr.sdk.proto.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1390a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f129717a;

        static {
            int[] iArr = new int[i3.d.values().length];
            f129717a = iArr;
            try {
                iArr[i3.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f129717a[i3.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f129717a[i3.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f129717a[i3.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f129717a[i3.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f129717a[i3.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f129717a[i3.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends i3<b, C1392b> implements c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final s3<Integer, c> f129718m = new C1391a();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final b f129719n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static volatile c5<b> f129720o;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f129721f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f129723h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f129724i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f129725j;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private r3 f129722g = i3.n();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f129726k = "";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f129727l = "";

        /* JADX INFO: renamed from: com.google.vr.sdk.proto.a$b$a, reason: collision with other inner class name */
        class C1391a implements s3<Integer, c> {
            C1391a() {
            }
        }

        /* JADX INFO: renamed from: com.google.vr.sdk.proto.a$b$b, reason: collision with other inner class name */
        public static final class C1392b extends i3.a<b, C1392b> implements c {
            private C1392b() {
                super(b.f129719n);
            }

            /* synthetic */ C1392b(C1390a c1390a) {
                this();
            }
        }

        public enum c implements n3 {
            CCW_0_DEGREES(0),
            CCW_90_DEGREES(1),
            CCW_180_DEGREES(2),
            CCW_270_DEGREES(3),
            CCW_0_DEGREES_MIRRORED(4),
            CCW_90_DEGREES_MIRRORED(5),
            CCW_180_DEGREES_MIRRORED(6),
            CCW_270_DEGREES_MIRRORED(7);


            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final o3<c> f129736j = new C1393a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f129738a;

            /* JADX INFO: renamed from: com.google.vr.sdk.proto.a$b$c$a, reason: collision with other inner class name */
            class C1393a implements o3<c> {
                C1393a() {
                }
            }

            /* JADX INFO: renamed from: com.google.vr.sdk.proto.a$b$c$b, reason: collision with other inner class name */
            static final class C1394b implements p3 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final p3 f129739a = new C1394b();

                private C1394b() {
                }

                @Override // com.google.vr.sdk.deps.p3
                public final boolean a(int i10) {
                    return c.b(i10) != null;
                }
            }

            static {
                int i10 = 4 >> 2;
            }

            c(int i10) {
                this.f129738a = i10;
            }

            public static c b(int i10) {
                switch (i10) {
                    case 0:
                        return CCW_0_DEGREES;
                    case 1:
                        return CCW_90_DEGREES;
                    case 2:
                        return CCW_180_DEGREES;
                    case 3:
                        return CCW_270_DEGREES;
                    case 4:
                        return CCW_0_DEGREES_MIRRORED;
                    case 5:
                        return CCW_90_DEGREES_MIRRORED;
                    case 6:
                        return CCW_180_DEGREES_MIRRORED;
                    case 7:
                        return CCW_270_DEGREES_MIRRORED;
                    default:
                        return null;
                }
            }

            public static p3 k() {
                return C1394b.f129739a;
            }

            @Override // com.google.vr.sdk.deps.n3
            public final int i() {
                return this.f129738a;
            }
        }

        static {
            b bVar = new b();
            f129719n = bVar;
            i3.z(b.class, bVar);
        }

        private b() {
        }

        @Override // com.google.vr.sdk.deps.i3
        protected final Object l(i3.d dVar, Object obj, Object obj2) {
            c5 e2Var;
            int iOrdinal = dVar.ordinal();
            C1390a c1390a = null;
            switch (iOrdinal) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return i3.w(f129719n, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001,\u0002\u0001\u0000\u0003\u0001\u0001\u0004\u0001\u0002\u0005\b\u0003\u0006\b\u0004", new Object[]{"bitField0_", "eyeOrientations_", c.k(), "screenCenterToLensDistance_", "xPpiOverride_", "yPpiOverride_", "accelerometer_", "gyroscope_"});
                case 3:
                    return new b();
                case 4:
                    return new C1392b(c1390a);
                case 5:
                    return f129719n;
                case 6:
                    c5<b> c5Var = f129720o;
                    if (c5Var != null) {
                        return c5Var;
                    }
                    synchronized (b.class) {
                        try {
                            e2Var = f129720o;
                            if (e2Var == null) {
                                e2Var = new e2(f129719n);
                                f129720o = e2Var;
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

    public interface c extends v4 {
    }

    public static final class d extends i3<d, C1395a> implements e {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final d f129740o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static volatile c5<d> f129741s;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f129742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f129743g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f129745i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f129746j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private j f129747k;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f129750n;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private u3<h> f129744h = i3.o();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f129748l = 40;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f129749m = true;

        /* JADX INFO: renamed from: com.google.vr.sdk.proto.a$d$a, reason: collision with other inner class name */
        public static final class C1395a extends i3.a<d, C1395a> implements e {
            private C1395a() {
                super(d.f129740o);
            }

            /* synthetic */ C1395a(C1390a c1390a) {
                this();
            }
        }

        static {
            d dVar = new d();
            f129740o = dVar;
            i3.z(d.class, dVar);
        }

        private d() {
        }

        @Override // com.google.vr.sdk.deps.i3
        protected final Object l(i3.d dVar, Object obj, Object obj2) {
            c5 e2Var;
            int iOrdinal = dVar.ordinal();
            C1390a c1390a = null;
            switch (iOrdinal) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return i3.w(f129740o, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u0007\u0001\u0004\u0007\u0002\u0005\t\u0003\u0006\u0004\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"bitField0_", "version_", "alignmentMarkers_", h.class, "useRotationalAlignmentCorrection_", "sensorOrientationIndependentOfDisplay_", "vignetteParams_", "distortionMeshResolution_", "clipFieldOfViewToDisplay_", "clampDistortionToMaximumFieldOfView_"});
                case 3:
                    return new d();
                case 4:
                    return new C1395a(c1390a);
                case 5:
                    return f129740o;
                case 6:
                    c5<d> c5Var = f129741s;
                    if (c5Var != null) {
                        return c5Var;
                    }
                    synchronized (d.class) {
                        try {
                            e2Var = f129741s;
                            if (e2Var == null) {
                                e2Var = new e2(f129740o);
                                f129741s = e2Var;
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

    public interface e extends v4 {
    }

    public static final class f extends i3<f, C1396a> implements g {
        private static final f H1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        private static volatile c5<f> f129751p2;
        private boolean Y;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f129752f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f129755i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f129756j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f129759m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f129760n;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        private b f129762p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        private d f129763p1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f129758l = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f129764s = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f129766v = -1;
        private int X = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f129753g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f129754h = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private q3 f129757k = i3.m();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private q3 f129761o = i3.m();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private q3 f129765t = i3.m();

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private q3 f129767w = i3.m();
        private int Z = 1;

        /* JADX INFO: renamed from: com.google.vr.sdk.proto.a$f$a, reason: collision with other inner class name */
        public static final class C1396a extends i3.a<f, C1396a> implements g {
            private C1396a() {
                super(f.H1);
            }

            /* synthetic */ C1396a(C1390a c1390a) {
                this();
            }
        }

        public enum b implements n3 {
            NONE(0),
            MAGNET(1),
            TOUCH(2),
            INDIRECT_TOUCH(3);


            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final o3<b> f129772f = new C1397a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f129774a;

            /* JADX INFO: renamed from: com.google.vr.sdk.proto.a$f$b$a, reason: collision with other inner class name */
            class C1397a implements o3<b> {
                C1397a() {
                }
            }

            /* JADX INFO: renamed from: com.google.vr.sdk.proto.a$f$b$b, reason: collision with other inner class name */
            static final class C1398b implements p3 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final p3 f129775a = new C1398b();

                private C1398b() {
                }

                @Override // com.google.vr.sdk.deps.p3
                public final boolean a(int i10) {
                    return b.b(i10) != null;
                }
            }

            b(int i10) {
                this.f129774a = i10;
            }

            public static b b(int i10) {
                if (i10 == 0) {
                    return NONE;
                }
                if (i10 == 1) {
                    return MAGNET;
                }
                if (i10 == 2) {
                    return TOUCH;
                }
                if (i10 != 3) {
                    return null;
                }
                return INDIRECT_TOUCH;
            }

            public static p3 k() {
                return C1398b.f129775a;
            }

            @Override // com.google.vr.sdk.deps.n3
            public final int i() {
                return this.f129774a;
            }
        }

        public enum c implements n3 {
            BOTTOM(0),
            CENTER(1),
            TOP(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final o3<c> f129779e = new C1399a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f129781a;

            /* JADX INFO: renamed from: com.google.vr.sdk.proto.a$f$c$a, reason: collision with other inner class name */
            class C1399a implements o3<c> {
                C1399a() {
                }
            }

            static final class b implements p3 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final p3 f129782a = new b();

                private b() {
                }

                @Override // com.google.vr.sdk.deps.p3
                public final boolean a(int i10) {
                    return c.b(i10) != null;
                }
            }

            c(int i10) {
                this.f129781a = i10;
            }

            public static c b(int i10) {
                if (i10 == 0) {
                    return BOTTOM;
                }
                if (i10 == 1) {
                    return CENTER;
                }
                if (i10 != 2) {
                    return null;
                }
                return TOP;
            }

            public static p3 k() {
                return b.f129782a;
            }

            @Override // com.google.vr.sdk.deps.n3
            public final int i() {
                return this.f129781a;
            }
        }

        static {
            f fVar = new f();
            H1 = fVar;
            i3.z(f.class, fVar);
        }

        private f() {
        }

        @Override // com.google.vr.sdk.deps.i3
        protected final Object l(i3.d dVar, Object obj, Object obj2) {
            c5 e2Var;
            C1390a c1390a = null;
            switch (dVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return i3.w(H1, "\u0001\u000e\u0000\u0001\u0001\ue113\u0018\u000e\u0000\u0004\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0001\u0002\u0004\u0001\u0003\u0005$\u0006\u0001\u0005\u0007$\b$\t$\n\u0007\u0006\u000b\f\u0004\f\f\u0007ہ\t\b\ue113\u0018\t\t", new Object[]{"bitField0_", "vendor_", "model_", "screenToLensDistance_", "interLensDistance_", "leftEyeFieldOfViewAngles_", "trayToLensDistance_", "distortionCoefficients_", "greenDistortionCoefficients_", "blueDistortionCoefficients_", "hasMagnet_", "verticalAlignment_", c.k(), "primaryButton_", b.k(), "internal_", "daydreamInternal_"});
                case NEW_MUTABLE_INSTANCE:
                    return new f();
                case NEW_BUILDER:
                    return new C1396a(c1390a);
                case GET_DEFAULT_INSTANCE:
                    return H1;
                case GET_PARSER:
                    c5<f> c5Var = f129751p2;
                    if (c5Var != null) {
                        return c5Var;
                    }
                    synchronized (f.class) {
                        try {
                            e2Var = f129751p2;
                            if (e2Var == null) {
                                e2Var = new e2(H1);
                                f129751p2 = e2Var;
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

    public interface g extends v4 {
    }

    public static final class h extends i3<h, C1400a> implements i {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final h f129783i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static volatile c5<h> f129784j;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f129785f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f129786g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f129787h;

        /* JADX INFO: renamed from: com.google.vr.sdk.proto.a$h$a, reason: collision with other inner class name */
        public static final class C1400a extends i3.a<h, C1400a> implements i {
            private C1400a() {
                super(h.f129783i);
            }

            /* synthetic */ C1400a(C1390a c1390a) {
                this();
            }
        }

        static {
            h hVar = new h();
            f129783i = hVar;
            i3.z(h.class, hVar);
        }

        private h() {
        }

        @Override // com.google.vr.sdk.deps.i3
        protected final Object l(i3.d dVar, Object obj, Object obj2) {
            c5 e2Var;
            int iOrdinal = dVar.ordinal();
            C1390a c1390a = null;
            switch (iOrdinal) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return i3.w(f129783i, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001", new Object[]{"bitField0_", "horizontal_", "vertical_"});
                case 3:
                    return new h();
                case 4:
                    return new C1400a(c1390a);
                case 5:
                    return f129783i;
                case 6:
                    c5<h> c5Var = f129784j;
                    if (c5Var != null) {
                        return c5Var;
                    }
                    synchronized (h.class) {
                        try {
                            e2Var = f129784j;
                            if (e2Var == null) {
                                e2Var = new e2(f129783i);
                                f129784j = e2Var;
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

    public interface i extends v4 {
    }

    public static final class j extends i3<j, C1401a> implements k {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final j f129788i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static volatile c5<j> f129789j;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f129790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f129791g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f129792h;

        /* JADX INFO: renamed from: com.google.vr.sdk.proto.a$j$a, reason: collision with other inner class name */
        public static final class C1401a extends i3.a<j, C1401a> implements k {
            private C1401a() {
                super(j.f129788i);
            }

            /* synthetic */ C1401a(C1390a c1390a) {
                this();
            }
        }

        public enum b implements n3 {
            NO_VIGNETTE_CONDITION(0),
            HORIZ_DIMEN_LESS_THAN_METER(1);


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final o3<b> f129795d = new C1402a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f129797a;

            /* JADX INFO: renamed from: com.google.vr.sdk.proto.a$j$b$a, reason: collision with other inner class name */
            class C1402a implements o3<b> {
                C1402a() {
                }
            }

            /* JADX INFO: renamed from: com.google.vr.sdk.proto.a$j$b$b, reason: collision with other inner class name */
            static final class C1403b implements p3 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final p3 f129798a = new C1403b();

                private C1403b() {
                }

                @Override // com.google.vr.sdk.deps.p3
                public final boolean a(int i10) {
                    return b.b(i10) != null;
                }
            }

            b(int i10) {
                this.f129797a = i10;
            }

            public static b b(int i10) {
                if (i10 == 0) {
                    return NO_VIGNETTE_CONDITION;
                }
                if (i10 != 1) {
                    return null;
                }
                return HORIZ_DIMEN_LESS_THAN_METER;
            }

            public static p3 k() {
                return C1403b.f129798a;
            }

            @Override // com.google.vr.sdk.deps.n3
            public final int i() {
                return this.f129797a;
            }
        }

        static {
            j jVar = new j();
            f129788i = jVar;
            i3.z(j.class, jVar);
        }

        private j() {
        }

        @Override // com.google.vr.sdk.deps.i3
        protected final Object l(i3.d dVar, Object obj, Object obj2) {
            c5 e2Var;
            int iOrdinal = dVar.ordinal();
            C1390a c1390a = null;
            switch (iOrdinal) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return i3.w(f129788i, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0000\u0003\u0001\u0001", new Object[]{"bitField0_", "condition_", b.k(), "value_"});
                case 3:
                    return new j();
                case 4:
                    return new C1401a(c1390a);
                case 5:
                    return f129788i;
                case 6:
                    c5<j> c5Var = f129789j;
                    if (c5Var != null) {
                        return c5Var;
                    }
                    synchronized (j.class) {
                        try {
                            e2Var = f129789j;
                            if (e2Var == null) {
                                e2Var = new e2(f129788i);
                                f129789j = e2Var;
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

    public interface k extends v4 {
    }
}
