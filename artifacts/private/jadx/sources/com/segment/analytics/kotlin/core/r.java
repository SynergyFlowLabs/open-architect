package com.segment.analytics.kotlin.core;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.l0;
import kotlin.text.Charsets;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\ncom/segment/analytics/kotlin/core/SettingsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,135:1\n1#2:136\n96#3:137\n*S KotlinDebug\n*F\n+ 1 Settings.kt\ncom/segment/analytics/kotlin/core/SettingsKt\n*L\n116#1:137\n*E\n"})
public final class r {

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.SettingsKt", f = "Settings.kt", i = {0, 0, 0, 1, 1, 1}, l = {com.planner5d.library.engine.input.f.b.f160690g0, com.planner5d.library.engine.input.f.b.f160696i0, 90}, m = "checkSettings", n = {"$this$checkSettings", "writeKey", "cdnHost", "$this$checkSettings", "writeKey", "cdnHost"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f266937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f266938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f266939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f266940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f266941e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f266940d = obj;
            this.f266941e |= Integer.MIN_VALUE;
            return r.a(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.SettingsKt$checkSettings$2", f = "Settings.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160703k1}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.segment.analytics.kotlin.core.a f266943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f266944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f266945d;

        @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.SettingsKt$checkSettings$2$1", f = "Settings.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160718p1, 99, com.planner5d.library.engine.input.f.b.f160733u1}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f266946a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f266947b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f266948c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Settings f266949d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ com.segment.analytics.kotlin.core.a f266950e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Settings settings, com.segment.analytics.kotlin.core.a aVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f266949d = settings;
                this.f266950e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f266949d, this.f266950e, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x008f  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
            
                if (r12.g(r1, r2, r11) == r0) goto L23;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
                /*
                    r11 = this;
                    r10 = 6
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r10 = 7
                    int r1 = r11.f266948c
                    java.lang.Class<com.segment.analytics.kotlin.core.v> r2 = com.segment.analytics.kotlin.core.v.class
                    r3 = 3
                    r4 = 2
                    r10 = 1
                    r5 = 1
                    r6 = 0
                    r10 = r6
                    if (r1 == 0) goto L3a
                    if (r1 == r5) goto L2d
                    r10 = 6
                    if (r1 == r4) goto L29
                    if (r1 != r3) goto L1f
                    r10 = 2
                    kotlin.ResultKt.m(r12)
                    goto Lab
                L1f:
                    r10 = 0
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r10 = 2
                    r11.<init>(r12)
                    throw r11
                L29:
                    kotlin.ResultKt.m(r12)
                    goto L8f
                L2d:
                    java.lang.Object r1 = r11.f266947b
                    com.segment.analytics.kotlin.core.Settings r1 = (com.segment.analytics.kotlin.core.Settings) r1
                    r10 = 0
                    java.lang.Object r7 = r11.f266946a
                    com.segment.analytics.kotlin.core.a r7 = (com.segment.analytics.kotlin.core.a) r7
                    kotlin.ResultKt.m(r12)
                    goto L81
                L3a:
                    kotlin.ResultKt.m(r12)
                    r10 = 1
                    com.segment.analytics.kotlin.core.Settings r1 = r11.f266949d
                    if (r1 == 0) goto L8f
                    com.segment.analytics.kotlin.core.a r7 = r11.f266950e
                    r10 = 3
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    r10 = 3
                    r12.<init>()
                    java.lang.String r8 = "Dispatching update settings on "
                    r12.append(r8)
                    java.lang.Thread r8 = java.lang.Thread.currentThread()
                    r10 = 0
                    java.lang.String r8 = r8.getName()
                    r10 = 2
                    r12.append(r8)
                    java.lang.String r12 = r12.toString()
                    r10 = 1
                    vf.e.c(r7, r12, r6, r4, r6)
                    sovran.kotlin.e r12 = r7.a()
                    com.segment.analytics.kotlin.core.v$f r8 = new com.segment.analytics.kotlin.core.v$f
                    r8.<init>(r1)
                    kotlin.reflect.d r9 = kotlin.jvm.internal.j1.d(r2)
                    r10 = 4
                    r11.f266946a = r7
                    r11.f266947b = r1
                    r11.f266948c = r5
                    java.lang.Object r12 = r12.g(r8, r9, r11)
                    if (r12 != r0) goto L81
                    r10 = 3
                    goto Laa
                L81:
                    r10 = 7
                    r11.f266946a = r6
                    r11.f266947b = r6
                    r11.f266948c = r4
                    java.lang.Object r12 = com.segment.analytics.kotlin.core.r.d(r7, r1, r11)
                    if (r12 != r0) goto L8f
                    goto Laa
                L8f:
                    r10 = 4
                    com.segment.analytics.kotlin.core.a r12 = r11.f266950e
                    sovran.kotlin.e r12 = r12.a()
                    r10 = 5
                    com.segment.analytics.kotlin.core.v$e r1 = new com.segment.analytics.kotlin.core.v$e
                    r10 = 1
                    r1.<init>(r5)
                    r10 = 4
                    kotlin.reflect.d r2 = kotlin.jvm.internal.j1.d(r2)
                    r11.f266948c = r3
                    java.lang.Object r11 = r12.g(r1, r2, r11)
                    if (r11 != r0) goto Lab
                Laa:
                    return r0
                Lab:
                    kotlin.Unit r11 = kotlin.Unit.f312394a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.core.r.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.segment.analytics.kotlin.core.a aVar, String str, String str2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f266943b = aVar;
            this.f266944c = str;
            this.f266945d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f266943b, this.f266944c, this.f266945d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266942a;
            if (i10 == 0) {
                ResultKt.m(obj);
                vf.e.c(this.f266943b, "Fetching settings on " + Thread.currentThread().getName(), null, 2, null);
                Settings settingsB = r.b(this.f266943b, this.f266944c, this.f266945d);
                n0 n0VarD = this.f266943b.d();
                a aVar = new a(settingsB, this.f266943b, null);
                this.f266942a = 1;
                if (kotlinx.coroutines.i.h(n0VarD, aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class c extends l0 implements Function1<Map<String, String>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Exception f266951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f266952b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Exception exc, String str) {
            super(1);
            this.f266951a = exc;
            this.f266952b = str;
        }

        public final void c(@NotNull Map<String, String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.put("error", this.f266951a.toString());
            it.put("writekey", this.f266952b);
            it.put("message", "Error retrieving settings");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, String> map) {
            c(map);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.SettingsKt$manuallyEnableDestination$1", f = "Settings.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.segment.analytics.kotlin.core.a f266954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.segment.analytics.kotlin.core.platform.a f266955c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.segment.analytics.kotlin.core.a aVar, com.segment.analytics.kotlin.core.platform.a aVar2, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f266954b = aVar;
            this.f266955c = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new d(this.f266954b, this.f266955c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266953a;
            if (i10 == 0) {
                ResultKt.m(obj);
                sovran.kotlin.e eVarA = this.f266954b.a();
                v.a aVar = new v.a(this.f266955c.o());
                kotlin.reflect.d dVarD = j1.d(v.class);
                this.f266953a = 1;
                if (eVarA.g(aVar, dVarD, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            com.segment.analytics.kotlin.core.platform.a aVar2 = (com.segment.analytics.kotlin.core.platform.a) this.f266954b.r(j1.d(this.f266955c.getClass()));
            if (aVar2 != null) {
                aVar2.s(true);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.SettingsKt", f = "Settings.kt", i = {0, 0}, l = {46, 60}, m = "update", n = {"$this$update", "settings"}, s = {"L$0", "L$1"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f266956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f266957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f266958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f266959d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f266958c = obj;
            this.f266959d |= Integer.MIN_VALUE;
            return r.d(null, null, this);
        }
    }

    static final class f extends l0 implements Function1<com.segment.analytics.kotlin.core.platform.e, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f266960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set<Integer> f266961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Settings f266962c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(v vVar, Set<Integer> set, Settings settings) {
            super(1);
            this.f266960a = vVar;
            this.f266961b = set;
            this.f266962c = settings;
        }

        public final void c(@NotNull com.segment.analytics.kotlin.core.platform.e plugin) {
            com.segment.analytics.kotlin.core.platform.e.c cVar;
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            if (this.f266960a.j().contains(Integer.valueOf(plugin.hashCode()))) {
                cVar = com.segment.analytics.kotlin.core.platform.e.c.Refresh;
            } else {
                this.f266961b.add(Integer.valueOf(plugin.hashCode()));
                cVar = com.segment.analytics.kotlin.core.platform.e.c.Initial;
            }
            plugin.i(this.f266962c, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(com.segment.analytics.kotlin.core.platform.e eVar) {
            c(eVar);
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
    
        if (kotlinx.coroutines.i.h(r12, r5, r0) == r1) goto L33;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull com.segment.analytics.kotlin.core.a r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.core.r.a(com.segment.analytics.kotlin.core.a, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    @Nullable
    public static final Settings b(@NotNull com.segment.analytics.kotlin.core.a aVar, @NotNull String writeKey, @NotNull String cdnHost) {
        String strK;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        Intrinsics.checkNotNullParameter(cdnHost, "cdnHost");
        try {
            InputStream inputStreamB = new m(writeKey, aVar.u().C()).c(cdnHost).b();
            if (inputStreamB != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamB, Charsets.UTF_8), 8192);
                try {
                    strK = kotlin.io.x.k(bufferedReader);
                    kotlin.io.c.a(bufferedReader, null);
                    if (strK == null) {
                        strK = "";
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(bufferedReader, th2);
                        throw th3;
                    }
                }
            } else {
                strK = "";
            }
            vf.e.c(aVar, "Fetched Settings: " + strK, null, 2, null);
            Json jsonE = com.segment.analytics.kotlin.core.utilities.o.e();
            jsonE.getSerializersModule();
            return (Settings) jsonE.decodeFromString(hk.a.v(Settings.Companion.serializer()), strK);
        } catch (Exception e10) {
            k.a(aVar, new com.segment.analytics.kotlin.core.b.l(new com.segment.analytics.kotlin.core.b.j(new URL("https://" + cdnHost + "/projects/" + writeKey + "/settings"), e10)), "Failed to fetch settings", w.f267065d, kotlin.p.i(e10), new c(e10, writeKey));
            return null;
        }
    }

    public static final void c(@NotNull com.segment.analytics.kotlin.core.a aVar, @NotNull com.segment.analytics.kotlin.core.platform.a plugin) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        kotlinx.coroutines.k.f(aVar.c(), aVar.d(), null, new d(aVar, plugin, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
    
        if (r8.g(r9, r10, r0) == r1) goto L25;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@org.jetbrains.annotations.NotNull com.segment.analytics.kotlin.core.a r8, @org.jetbrains.annotations.NotNull com.segment.analytics.kotlin.core.Settings r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof com.segment.analytics.kotlin.core.r.e
            if (r0 == 0) goto L18
            r0 = r10
            r0 = r10
            r7 = 0
            com.segment.analytics.kotlin.core.r$e r0 = (com.segment.analytics.kotlin.core.r.e) r0
            r7 = 7
            int r1 = r0.f266959d
            r7 = 5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f266959d = r1
            goto L1e
        L18:
            r7 = 7
            com.segment.analytics.kotlin.core.r$e r0 = new com.segment.analytics.kotlin.core.r$e
            r0.<init>(r10)
        L1e:
            java.lang.Object r10 = r0.f266958c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r7 = 2
            int r2 = r0.f266959d
            r7 = 0
            java.lang.Class<com.segment.analytics.kotlin.core.v> r3 = com.segment.analytics.kotlin.core.v.class
            java.lang.Class<com.segment.analytics.kotlin.core.v> r3 = com.segment.analytics.kotlin.core.v.class
            r4 = 2
            r7 = r4
            r5 = 1
            if (r2 == 0) goto L51
            if (r2 == r5) goto L44
            if (r2 != r4) goto L3a
            r7 = 5
            kotlin.ResultKt.m(r10)
            goto Laa
        L3a:
            r7 = 3
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r7 = 2
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L44:
            java.lang.Object r8 = r0.f266957b
            r9 = r8
            com.segment.analytics.kotlin.core.Settings r9 = (com.segment.analytics.kotlin.core.Settings) r9
            java.lang.Object r8 = r0.f266956a
            com.segment.analytics.kotlin.core.a r8 = (com.segment.analytics.kotlin.core.a) r8
            kotlin.ResultKt.m(r10)
            goto L6c
        L51:
            kotlin.ResultKt.m(r10)
            sovran.kotlin.e r10 = r8.a()
            r7 = 2
            kotlin.reflect.d r2 = kotlin.jvm.internal.j1.d(r3)
            r0.f266956a = r8
            r0.f266957b = r9
            r7 = 3
            r0.f266959d = r5
            java.lang.Object r10 = r10.f(r2, r0)
            r7 = 2
            if (r10 != r1) goto L6c
            goto La8
        L6c:
            com.segment.analytics.kotlin.core.v r10 = (com.segment.analytics.kotlin.core.v) r10
            if (r10 != 0) goto L75
            r7 = 0
            kotlin.Unit r8 = kotlin.Unit.f312394a
            r7 = 1
            return r8
        L75:
            r7 = 3
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r7 = 6
            com.segment.analytics.kotlin.core.platform.g r5 = r8.x()
            r7 = 4
            com.segment.analytics.kotlin.core.r$f r6 = new com.segment.analytics.kotlin.core.r$f
            r7 = 0
            r6.<init>(r10, r2, r9)
            r5.b(r6)
            sovran.kotlin.e r8 = r8.a()
            r7 = 6
            com.segment.analytics.kotlin.core.v$b r9 = new com.segment.analytics.kotlin.core.v$b
            r9.<init>(r2)
            kotlin.reflect.d r10 = kotlin.jvm.internal.j1.d(r3)
            r2 = 0
            r7 = 5
            r0.f266956a = r2
            r7 = 0
            r0.f266957b = r2
            r0.f266959d = r4
            java.lang.Object r8 = r8.g(r9, r10, r0)
            r7 = 5
            if (r8 != r1) goto Laa
        La8:
            r7 = 3
            return r1
        Laa:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.core.r.d(com.segment.analytics.kotlin.core.a, com.segment.analytics.kotlin.core.Settings, kotlin.coroutines.d):java.lang.Object");
    }
}
