package com.segment.analytics.kotlin.android.plugins;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.util.DisplayMetrics;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.s;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.apache.commons.codec.language.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAndroidContextPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidContextPlugin.kt\ncom/segment/analytics/kotlin/android/plugins/AndroidContextPlugin\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 AndroidContextPlugin.kt\ncom/segment/analytics/kotlin/android/plugins/AndroidContextPluginKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,312:1\n28#2,4:313\n28#2,4:317\n28#2,4:321\n28#2,4:325\n28#2,3:329\n28#2,3:332\n31#2:338\n31#2:339\n270#3:335\n13579#4,2:336\n*S KotlinDebug\n*F\n+ 1 AndroidContextPlugin.kt\ncom/segment/analytics/kotlin/android/plugins/AndroidContextPlugin\n*L\n92#1:313,4\n97#1:317,4\n108#1:321,4\n130#1:325,4\n188#1:329,3\n207#1:332,3\n207#1:338\n188#1:339\n210#1:335\n215#1:336,2\n*E\n"})
public final class a implements com.segment.analytics.kotlin.core.platform.e {

    @NotNull
    public static final C1852a Companion = new C1852a(null);

    @NotNull
    public static final String H1 = "cellular";

    @NotNull
    public static final String X = "model";

    @NotNull
    public static final String Y = "name";

    @NotNull
    public static final String Z = "type";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    public static final String f266533g3 = "os";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    public static final String f266534h3 = "name";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f266535i = "locale";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    public static final String f266536i3 = "version";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f266537j = "userAgent";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    public static final String f266538j3 = "screen";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f266539k = "timezone";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    public static final String f266540k3 = "density";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f266541l = "app";

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    public static final String f266542l3 = "height";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f266543m = "name";

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    public static final String f266544m3 = "width";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f266545n = "version";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f266546o = "namespace";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final String f266547p0 = "network";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    public static final String f266548p1 = "bluetooth";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    public static final String f266549p2 = "wifi";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f266550s = "build";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f266551t = "device";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f266552v = "id";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f266553w = "manufacturer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.platform.e.b f266554a = com.segment.analytics.kotlin.core.platform.e.b.Before;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f266555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f266556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s f266557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JsonObject f266558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JsonObject f266559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JsonObject f266560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JsonObject f266561h;

    /* JADX INFO: renamed from: com.segment.analytics.kotlin.android.plugins.a$a, reason: collision with other inner class name */
    public static final class C1852a {
        public /* synthetic */ C1852a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1852a() {
        }
    }

    @f(c = "com.segment.analytics.kotlin.android.plugins.AndroidContextPlugin$loadDeviceId$1", f = "AndroidContextPlugin.kt", i = {0}, l = {160, 168}, m = "invokeSuspend", n = {"deviceId"}, s = {"L$0"})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f266562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f266563b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f266565d;

        /* JADX INFO: renamed from: com.segment.analytics.kotlin.android.plugins.a$b$a, reason: collision with other inner class name */
        @f(c = "com.segment.analytics.kotlin.android.plugins.AndroidContextPlugin$loadDeviceId$1$1", f = "AndroidContextPlugin.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
        static final class C1853a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f266566a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f266567b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i1.h<String> f266568c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a1<String> f266569d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1853a(i1.h<String> hVar, a1<String> a1Var, kotlin.coroutines.d<? super C1853a> dVar) {
                super(2, dVar);
                this.f266568c = hVar;
                this.f266569d = a1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C1853a(this.f266568c, this.f266569d, dVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                T t10;
                i1.h<String> hVar;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f266567b;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    i1.h<String> hVar2 = this.f266568c;
                    a1<String> a1Var = this.f266569d;
                    this.f266566a = hVar2;
                    this.f266567b = 1;
                    Object objQ = a1Var.q(this);
                    if (objQ == objL) {
                        return objL;
                    }
                    t10 = objQ;
                    hVar = hVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = (i1.h) this.f266566a;
                    ResultKt.m(obj);
                    t10 = obj;
                }
                hVar.f312751a = t10;
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1853a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: com.segment.analytics.kotlin.android.plugins.a$b$b, reason: collision with other inner class name */
        static final class C1854b extends l0 implements Function1<Map<String, JsonElement>, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i1.h<String> f266570a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1854b(i1.h<String> hVar) {
                super(1);
                this.f266570a = hVar;
            }

            public final void c(@NotNull Map<String, JsonElement> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                com.segment.analytics.kotlin.core.utilities.o.w(it, "id", this.f266570a.f312751a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, JsonElement> map) {
                c(map);
                return Unit.f312394a;
            }
        }

        @f(c = "com.segment.analytics.kotlin.android.plugins.AndroidContextPlugin$loadDeviceId$1$task$1", f = "AndroidContextPlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f266571a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f266572b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f266573c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f266574d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a aVar, boolean z10, String str, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f266572b = aVar;
                this.f266573c = z10;
                this.f266574d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new c(this.f266572b, this.f266573c, this.f266574d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f266571a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f266572b.p(this.f266573c, this.f266574d);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super String> dVar) {
                return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f266565d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return a.this.new b(this.f266565d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00b2, code lost:
        
            if (r14.f(r3, r1, r13) == r0) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v2, types: [T, java.lang.Object, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r13.f266563b
                r2 = 2
                r3 = 1
                r12 = 3
                r4 = 0
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L22
                r12 = 4
                if (r1 != r2) goto L16
                kotlin.ResultKt.m(r14)
                goto Lb5
            L16:
                r12 = 7
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                r12 = 6
                java.lang.String r14 = "/usiiu/crnec vw  troe/e/let naobeeomtook/h l//fsir/"
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L22:
                java.lang.Object r1 = r13.f266562a
                kotlin.jvm.internal.i1$h r1 = (kotlin.jvm.internal.i1.h) r1
                r12 = 4
                kotlin.ResultKt.m(r14)
                r12 = 1
                goto L75
            L2c:
                r12 = 7
                kotlin.ResultKt.m(r14)
                java.util.UUID r14 = java.util.UUID.randomUUID()
                r12 = 6
                java.lang.String r14 = r14.toString()
                r12 = 3
                java.lang.String r1 = "randomUUID().toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r1)
                kotlin.jvm.internal.i1$h r1 = new kotlin.jvm.internal.i1$h
                r1.<init>()
                r12 = 6
                r1.f312751a = r14
                kotlinx.coroutines.a0 r5 = kotlinx.coroutines.q3.c(r4, r3, r4)
                kotlinx.coroutines.s0 r6 = kotlinx.coroutines.t0.a(r5)
                com.segment.analytics.kotlin.android.plugins.a$b$c r9 = new com.segment.analytics.kotlin.android.plugins.a$b$c
                com.segment.analytics.kotlin.android.plugins.a r5 = com.segment.analytics.kotlin.android.plugins.a.this
                boolean r7 = r13.f266565d
                r9.<init>(r5, r7, r14, r4)
                r10 = 3
                r11 = 6
                r11 = 0
                r7 = 0
                r12 = 7
                r8 = 0
                kotlinx.coroutines.a1 r14 = kotlinx.coroutines.i.b(r6, r7, r8, r9, r10, r11)
                com.segment.analytics.kotlin.android.plugins.a$b$a r5 = new com.segment.analytics.kotlin.android.plugins.a$b$a
                r5.<init>(r1, r14, r4)
                r13.f266562a = r1
                r13.f266563b = r3
                r6 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r14 = kotlinx.coroutines.b4.e(r6, r5, r13)
                r12 = 4
                if (r14 != r0) goto L75
                goto Lb4
            L75:
                com.segment.analytics.kotlin.android.plugins.a r14 = com.segment.analytics.kotlin.android.plugins.a.this
                r12 = 0
                kotlinx.serialization.json.JsonObject r3 = com.segment.analytics.kotlin.android.plugins.a.e(r14)
                if (r3 != 0) goto L85
                java.lang.String r3 = "device"
                r12 = 7
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
                r3 = r4
            L85:
                com.segment.analytics.kotlin.android.plugins.a$b$b r5 = new com.segment.analytics.kotlin.android.plugins.a$b$b
                r5.<init>(r1)
                kotlinx.serialization.json.JsonObject r3 = com.segment.analytics.kotlin.core.utilities.o.M(r3, r5)
                com.segment.analytics.kotlin.android.plugins.a.n(r14, r3)
                com.segment.analytics.kotlin.android.plugins.a r14 = com.segment.analytics.kotlin.android.plugins.a.this
                com.segment.analytics.kotlin.core.s r14 = com.segment.analytics.kotlin.android.plugins.a.m(r14)
                r12 = 5
                if (r14 != 0) goto La2
                r12 = 3
                java.lang.String r14 = "storage"
                r12 = 4
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r14)
                r14 = r4
            La2:
                com.segment.analytics.kotlin.core.s$b r3 = com.segment.analytics.kotlin.core.s.b.DeviceId
                T r1 = r1.f312751a
                r12 = 0
                java.lang.String r1 = (java.lang.String) r1
                r13.f266562a = r4
                r13.f266563b = r2
                java.lang.Object r13 = r14.f(r3, r1, r13)
                r12 = 0
                if (r13 != r0) goto Lb5
            Lb4:
                return r0
            Lb5:
                kotlin.Unit r13 = kotlin.Unit.f312394a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.android.plugins.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    @e.a({"MissingPermission"})
    private final void o(BaseEvent baseEvent) {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        com.segment.analytics.kotlin.core.utilities.o.s(jsonObjectBuilder, baseEvent.e());
        JsonObject jsonObject = this.f266558e;
        Context context = null;
        if (jsonObject == null) {
            Intrinsics.throwUninitializedPropertyAccessException("app");
            jsonObject = null;
        }
        jsonObjectBuilder.put("app", jsonObject);
        JsonObject jsonObject2 = this.f266560g;
        if (jsonObject2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("device");
            jsonObject2 = null;
        }
        jsonObjectBuilder.put("device", jsonObject2);
        JsonObject jsonObject3 = this.f266559f;
        if (jsonObject3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("os");
            jsonObject3 = null;
        }
        jsonObjectBuilder.put("os", jsonObject3);
        JsonObject jsonObject4 = this.f266561h;
        if (jsonObject4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(f266538j3);
            jsonObject4 = null;
        }
        jsonObjectBuilder.put(f266538j3, jsonObject4);
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        Context context2 = this.f266556c;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context2 = null;
        }
        if (com.segment.analytics.kotlin.android.plugins.b.d(context2, "android.permission.ACCESS_NETWORK_STATE")) {
            Context context3 = this.f266556c;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            } else {
                context = context3;
            }
            Object systemService = context.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            Intrinsics.checkNotNullExpressionValue(allNetworks, "connectivityManager.allNetworks");
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            for (Network network : allNetworks) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (z10) {
                    z10 = true;
                } else if (networkCapabilities != null ? networkCapabilities.hasTransport(1) : false) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12) {
                    z12 = true;
                } else if (networkCapabilities != null ? networkCapabilities.hasTransport(0) : false) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11) {
                    z11 = true;
                } else if (networkCapabilities != null ? networkCapabilities.hasTransport(2) : false) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            JsonElementBuildersKt.put(jsonObjectBuilder2, f266549p2, Boolean.valueOf(z10));
            JsonElementBuildersKt.put(jsonObjectBuilder2, f266548p1, Boolean.valueOf(z11));
            JsonElementBuildersKt.put(jsonObjectBuilder2, H1, Boolean.valueOf(z12));
        }
        jsonObjectBuilder.put(f266547p0, jsonObjectBuilder2.build());
        JsonElementBuildersKt.put(jsonObjectBuilder, "locale", Locale.getDefault().getLanguage() + l.f335457d + Locale.getDefault().getCountry());
        com.segment.analytics.kotlin.core.utilities.o.t(jsonObjectBuilder, f266537j, System.getProperty("http.agent"));
        com.segment.analytics.kotlin.core.utilities.o.t(jsonObjectBuilder, "timezone", TimeZone.getDefault().getID());
        baseEvent.n(jsonObjectBuilder.build());
    }

    private final void q(boolean z10) {
        k.f(j().c(), j().d(), null, new b(z10, null), 2, null);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public BaseEvent a(@NotNull BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        o(event);
        return event;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a analytics) {
        JsonObject jsonObjectB;
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        com.segment.analytics.kotlin.core.platform.e.a.b(this, analytics);
        Object objT = analytics.u().t();
        Intrinsics.checkNotNull(objT, "null cannot be cast to non-null type android.content.Context");
        this.f266556c = (Context) objT;
        this.f266557d = analytics.w();
        boolean zW = analytics.u().w();
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "name", "Android");
        JsonElementBuildersKt.put(jsonObjectBuilder, "version", Build.VERSION.RELEASE);
        this.f266559f = jsonObjectBuilder.build();
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        Context context = this.f266556c;
        s sVar = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        JsonElementBuildersKt.put(jsonObjectBuilder2, f266540k3, Float.valueOf(displayMetrics.density));
        JsonElementBuildersKt.put(jsonObjectBuilder2, "height", Integer.valueOf(displayMetrics.heightPixels));
        JsonElementBuildersKt.put(jsonObjectBuilder2, "width", Integer.valueOf(displayMetrics.widthPixels));
        this.f266561h = jsonObjectBuilder2.build();
        try {
            Context context2 = this.f266556c;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context2 = null;
            }
            PackageManager packageManager = context2.getPackageManager();
            Context context3 = this.f266556c;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context3 = null;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
            JsonObjectBuilder jsonObjectBuilder3 = new JsonObjectBuilder();
            com.segment.analytics.kotlin.core.utilities.o.t(jsonObjectBuilder3, "name", packageInfo.applicationInfo.loadLabel(packageManager));
            com.segment.analytics.kotlin.core.utilities.o.t(jsonObjectBuilder3, "version", packageInfo.versionName);
            com.segment.analytics.kotlin.core.utilities.o.t(jsonObjectBuilder3, f266546o, packageInfo.packageName);
            JsonElementBuildersKt.put(jsonObjectBuilder3, "build", String.valueOf(packageInfo.getLongVersionCode()));
            jsonObjectB = jsonObjectBuilder3.build();
        } catch (PackageManager.NameNotFoundException unused) {
            jsonObjectB = com.segment.analytics.kotlin.core.l.b();
        }
        this.f266558e = jsonObjectB;
        s sVar2 = this.f266557d;
        if (sVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storage");
        } else {
            sVar = sVar2;
        }
        String strD = sVar.d(s.b.DeviceId);
        if (strD == null) {
            strD = "";
        }
        JsonObjectBuilder jsonObjectBuilder4 = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder4, "id", strD);
        JsonElementBuildersKt.put(jsonObjectBuilder4, "manufacturer", Build.MANUFACTURER);
        JsonElementBuildersKt.put(jsonObjectBuilder4, "model", Build.MODEL);
        JsonElementBuildersKt.put(jsonObjectBuilder4, "name", Build.DEVICE);
        JsonElementBuildersKt.put(jsonObjectBuilder4, "type", "android");
        this.f266560g = jsonObjectBuilder4.build();
        if (strD.length() == 0) {
            q(zW);
        }
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.platform.e.b c() {
        return this.f266554a;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void f(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f266555b = aVar;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void i(@NotNull Settings settings, @NotNull com.segment.analytics.kotlin.core.platform.e.c cVar) {
        com.segment.analytics.kotlin.core.platform.e.a.c(this, settings, cVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.a j() {
        com.segment.analytics.kotlin.core.a aVar = this.f266555b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    @NotNull
    public final String p(boolean z10, @NotNull String fallbackDeviceId) throws Throwable {
        Intrinsics.checkNotNullParameter(fallbackDeviceId, "fallbackDeviceId");
        if (z10) {
            String strB = com.segment.analytics.kotlin.android.plugins.b.b();
            return (strB == null || strB.length() == 0) ? fallbackDeviceId : strB;
        }
        s sVar = this.f266557d;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storage");
            sVar = null;
        }
        String strD = sVar.d(s.b.AnonymousId);
        return strD == null ? fallbackDeviceId : strD;
    }
}
