package com.google.vr.sdk.proto;

import com.google.vr.sdk.deps.c5;
import com.google.vr.sdk.deps.e2;
import com.google.vr.sdk.deps.i3;
import com.google.vr.sdk.deps.n3;
import com.google.vr.sdk.deps.o3;
import com.google.vr.sdk.deps.p3;
import com.google.vr.sdk.deps.q3;
import com.google.vr.sdk.deps.u3;
import com.google.vr.sdk.deps.v4;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f129799a;

        static {
            int[] iArr = new int[i3.d.values().length];
            f129799a = iArr;
            try {
                iArr[i3.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f129799a[i3.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f129799a[i3.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f129799a[i3.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f129799a[i3.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f129799a[i3.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f129799a[i3.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.vr.sdk.proto.b$b, reason: collision with other inner class name */
    public enum EnumC1404b implements n3 {
        GVR_CONTROLLER_CONFIGURATION_UNKNOWN(0),
        GVR_CONTROLLER_CONFIGURATION_UNSUPPORTED(1),
        GVR_CONTROLLER_CONFIGURATION_3DOF_1(2),
        GVR_CONTROLLER_CONFIGURATION_6DOF_2(3);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3<EnumC1404b> f129804f = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f129806a;

        /* JADX INFO: renamed from: com.google.vr.sdk.proto.b$b$a */
        class a implements o3<EnumC1404b> {
            a() {
            }
        }

        /* JADX INFO: renamed from: com.google.vr.sdk.proto.b$b$b, reason: collision with other inner class name */
        static final class C1405b implements p3 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final p3 f129807a = new C1405b();

            private C1405b() {
            }

            @Override // com.google.vr.sdk.deps.p3
            public final boolean a(int i10) {
                return EnumC1404b.b(i10) != null;
            }
        }

        EnumC1404b(int i10) {
            this.f129806a = i10;
        }

        public static EnumC1404b b(int i10) {
            if (i10 == 0) {
                return GVR_CONTROLLER_CONFIGURATION_UNKNOWN;
            }
            if (i10 == 1) {
                return GVR_CONTROLLER_CONFIGURATION_UNSUPPORTED;
            }
            if (i10 == 2) {
                return GVR_CONTROLLER_CONFIGURATION_3DOF_1;
            }
            if (i10 != 3) {
                return null;
            }
            return GVR_CONTROLLER_CONFIGURATION_6DOF_2;
        }

        public static p3 k() {
            return C1405b.f129807a;
        }

        @Override // com.google.vr.sdk.deps.n3
        public final int i() {
            return this.f129806a;
        }
    }

    public static final class c extends i3<c, a> implements d {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        private static final c f129808p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        private static volatile c5<c> f129809p1;
        private boolean X;
        private l Y;
        private e Z;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f129810f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f129811g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f129812h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f129813i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f129814j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f129815k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f129816l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f129817m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f129818n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f129819o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private j f129820s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f129821t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f129822v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private boolean f129823w;

        public static final class a extends i3.a<c, a> implements d {
            private a() {
                super(c.f129808p0);
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        /* JADX INFO: renamed from: com.google.vr.sdk.proto.b$c$b, reason: collision with other inner class name */
        public enum EnumC1406b implements n3 {
            NONE(0),
            VELOCITY(1),
            IMPULSE(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final o3<EnumC1406b> f129827e = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f129829a;

            /* JADX INFO: renamed from: com.google.vr.sdk.proto.b$c$b$a */
            class a implements o3<EnumC1406b> {
                a() {
                }
            }

            /* JADX INFO: renamed from: com.google.vr.sdk.proto.b$c$b$b, reason: collision with other inner class name */
            static final class C1407b implements p3 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final p3 f129830a = new C1407b();

                private C1407b() {
                }

                @Override // com.google.vr.sdk.deps.p3
                public final boolean a(int i10) {
                    return EnumC1406b.b(i10) != null;
                }
            }

            EnumC1406b(int i10) {
                this.f129829a = i10;
            }

            public static EnumC1406b b(int i10) {
                if (i10 == 0) {
                    return NONE;
                }
                if (i10 == 1) {
                    return VELOCITY;
                }
                if (i10 != 2) {
                    return null;
                }
                return IMPULSE;
            }

            public static p3 k() {
                return C1407b.f129830a;
            }

            @Override // com.google.vr.sdk.deps.n3
            public final int i() {
                return this.f129829a;
            }
        }

        static {
            c cVar = new c();
            f129808p0 = cVar;
            i3.z(c.class, cVar);
        }

        private c() {
        }

        @Override // com.google.vr.sdk.deps.i3
        protected final Object l(i3.d dVar, Object obj, Object obj2) {
            c5 e2Var;
            a aVar = null;
            switch (dVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return i3.w(f129808p0, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005\u0007\u0007\u0006\b\u0007\u0007\t\u0007\b\n\t\t\u000b\u0007\n\f\f\u000b\r\u0007\f\u000e\u0007\r\u000f\t\u000e\u0010\t\u000f", new Object[]{"bitField0_", "performanceMonitoringEnabled_", "sensorLoggingEnabled_", "dEPRECATEDMotophoPatchEnabled_", "developerLoggingEnabled_", "forceUndistortedRendering_", "performanceHudEnabled_", "dEPRECATEDGvrPlatformLibraryEnabled_", "dEPRECATEDHeadTrackingServiceEnabled_", "captureEnabled_", "safetyCylinderParams_", "frameTrackerEnabled_", "motophoPatchMode_", EnumC1406b.k(), "performanceLoggingActivated_", "openglKhrDebugEnabled_", "trackingConfigurationParams_", "playAreaSettings_"});
                case NEW_MUTABLE_INSTANCE:
                    return new c();
                case NEW_BUILDER:
                    return new a(aVar);
                case GET_DEFAULT_INSTANCE:
                    return f129808p0;
                case GET_PARSER:
                    c5<c> c5Var = f129809p1;
                    if (c5Var != null) {
                        return c5Var;
                    }
                    synchronized (c.class) {
                        try {
                            e2Var = f129809p1;
                            if (e2Var == null) {
                                e2Var = new e2(f129808p0);
                                f129809p1 = e2Var;
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

    public interface d extends v4 {
    }

    public static final class e extends i3<e, a> implements f {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final e f129831j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static volatile c5<e> f129832k;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f129833f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private u3<String> f129834g = i3.o();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f129835h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private h f129836i;

        public static final class a extends i3.a<e, a> implements f {
            private a() {
                super(e.f129831j);
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        static {
            e eVar = new e();
            f129831j = eVar;
            i3.z(e.class, eVar);
        }

        private e() {
        }

        public static c5<e> C() {
            return f129831j.r();
        }

        @Override // com.google.vr.sdk.deps.i3
        protected final Object l(i3.d dVar, Object obj, Object obj2) {
            c5 e2Var;
            int iOrdinal = dVar.ordinal();
            a aVar = null;
            switch (iOrdinal) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return i3.w(f129831j, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002\f\u0000\u0003\t\u0001", new Object[]{"bitField0_", "anchorIds_", "playAreaType_", g.k(), "radialPlayArea_"});
                case 3:
                    return new e();
                case 4:
                    return new a(aVar);
                case 5:
                    return f129831j;
                case 6:
                    c5<e> c5Var = f129832k;
                    if (c5Var != null) {
                        return c5Var;
                    }
                    synchronized (e.class) {
                        try {
                            e2Var = f129832k;
                            if (e2Var == null) {
                                e2Var = new e2(f129831j);
                                f129832k = e2Var;
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

    public interface f extends v4 {
    }

    public enum g implements n3 {
        GVR_PLAY_AREA_TYPE_NOT_SET(0),
        GVR_PLAY_AREA_TYPE_RADIAL(1);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3<g> f129839d = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f129841a;

        class a implements o3<g> {
            a() {
            }
        }

        /* JADX INFO: renamed from: com.google.vr.sdk.proto.b$g$b, reason: collision with other inner class name */
        static final class C1408b implements p3 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final p3 f129842a = new C1408b();

            private C1408b() {
            }

            @Override // com.google.vr.sdk.deps.p3
            public final boolean a(int i10) {
                return g.b(i10) != null;
            }
        }

        g(int i10) {
            this.f129841a = i10;
        }

        public static g b(int i10) {
            if (i10 == 0) {
                return GVR_PLAY_AREA_TYPE_NOT_SET;
            }
            if (i10 != 1) {
                return null;
            }
            return GVR_PLAY_AREA_TYPE_RADIAL;
        }

        public static p3 k() {
            return C1408b.f129842a;
        }

        @Override // com.google.vr.sdk.deps.n3
        public final int i() {
            return this.f129841a;
        }
    }

    public static final class h extends i3<h, a> implements i {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final h f129843h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static volatile c5<h> f129844i;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f129845f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f129846g;

        public static final class a extends i3.a<h, a> implements i {
            private a() {
                super(h.f129843h);
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        static {
            h hVar = new h();
            f129843h = hVar;
            i3.z(h.class, hVar);
        }

        private h() {
        }

        @Override // com.google.vr.sdk.deps.i3
        protected final Object l(i3.d dVar, Object obj, Object obj2) {
            c5 e2Var;
            int iOrdinal = dVar.ordinal();
            a aVar = null;
            switch (iOrdinal) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return i3.w(f129843h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new Object[]{"bitField0_", "radius_"});
                case 3:
                    return new h();
                case 4:
                    return new a(aVar);
                case 5:
                    return f129843h;
                case 6:
                    c5<h> c5Var = f129844i;
                    if (c5Var != null) {
                        return c5Var;
                    }
                    synchronized (h.class) {
                        try {
                            e2Var = f129844i;
                            if (e2Var == null) {
                                e2Var = new e2(f129843h);
                                f129844i = e2Var;
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

    public static final class j extends i3<j, a> implements k {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final j f129847s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static volatile c5<j> f129848t;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f129849f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f129850g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f129851h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f129852i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f129855l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f129856m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f129857n;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private q3 f129853j = i3.m();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private q3 f129854k = i3.m();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f129858o = true;

        public static final class a extends i3.a<j, a> implements k {
            private a() {
                super(j.f129847s);
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        static {
            j jVar = new j();
            f129847s = jVar;
            i3.z(j.class, jVar);
        }

        private j() {
        }

        @Override // com.google.vr.sdk.deps.i3
        protected final Object l(i3.d dVar, Object obj, Object obj2) {
            c5 e2Var;
            int iOrdinal = dVar.ordinal();
            a aVar = null;
            switch (iOrdinal) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return i3.w(f129847s, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004\u0013\u0005\u0013\u0006\u0001\u0003\u0007\u0001\u0004\b\u0001\u0005\t\u0007\u0006", new Object[]{"bitField0_", "collisionSphereRadius_", "innerRadius_", "outerRadius_", "innerFogColor_", "outerFogColor_", "enterEventRadius_", "exitEventRadius_", "anchorWarningDistance_", "graphicsEnabled_"});
                case 3:
                    return new j();
                case 4:
                    return new a(aVar);
                case 5:
                    return f129847s;
                case 6:
                    c5<j> c5Var = f129848t;
                    if (c5Var != null) {
                        return c5Var;
                    }
                    synchronized (j.class) {
                        try {
                            e2Var = f129848t;
                            if (e2Var == null) {
                                e2Var = new e2(f129847s);
                                f129848t = e2Var;
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

    public static final class l extends i3<l, a> implements m {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final l f129859h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static volatile c5<l> f129860i;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f129861f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f129862g;

        public static final class a extends i3.a<l, a> implements m {
            private a() {
                super(l.f129859h);
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        static {
            l lVar = new l();
            f129859h = lVar;
            i3.z(l.class, lVar);
        }

        private l() {
        }

        @Override // com.google.vr.sdk.deps.i3
        protected final Object l(i3.d dVar, Object obj, Object obj2) {
            c5 e2Var;
            int iOrdinal = dVar.ordinal();
            a aVar = null;
            switch (iOrdinal) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return i3.w(f129859h, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"bitField0_", "controllerConfigType_", EnumC1404b.k()});
                case 3:
                    return new l();
                case 4:
                    return new a(aVar);
                case 5:
                    return f129859h;
                case 6:
                    c5<l> c5Var = f129860i;
                    if (c5Var != null) {
                        return c5Var;
                    }
                    synchronized (l.class) {
                        try {
                            e2Var = f129860i;
                            if (e2Var == null) {
                                e2Var = new e2(f129859h);
                                f129860i = e2Var;
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

    public interface m extends v4 {
    }
}
