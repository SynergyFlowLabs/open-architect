package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.annotation.l1;
import com.google.firebase.sessions.d1;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
@SourceDebugExtension({"SMAP\nRemoteSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,159:1\n116#2,11:160\n*S KotlinDebug\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings\n*L\n70#1:160,11\n*E\n"})
public final class d implements n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final a f125091g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f125092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final Regex f125093i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d1 f125094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.google.firebase.installations.k f125095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.google.firebase.sessions.b f125096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.google.firebase.sessions.settings.a f125097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final k f125098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f125099f;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f125092h;
        }

        @NotNull
        public final Regex b() {
            return d.f125093i;
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", i = {0, 0, 1, 1, 2}, l = {165, 78, com.planner5d.library.engine.input.f.b.f160706l1}, m = "updateSettings", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f125100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f125101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f125102c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f125104e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f125102c = obj;
            this.f125104e |= Integer.MIN_VALUE;
            return d.this.b(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", i = {}, l = {okhttp3.internal.ws.g.f334652s}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<JSONObject, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f125105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f125106b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = d.this.new c(dVar);
            cVar.f125106b = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:48:0x00eb A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Boolean bool;
            Double d10;
            Integer num;
            k kVar;
            int iA;
            SessionConfigs sessionConfigs;
            Integer num2;
            Double d11;
            Object obj2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f125105a;
            if (i10 == 0) {
                ResultKt.m(obj);
                JSONObject jSONObject = (JSONObject) this.f125106b;
                Objects.toString(jSONObject);
                Integer num3 = 0;
                Integer num4 = null;
                Boolean bool2 = null;
                if (jSONObject.has("app_quality")) {
                    Object obj3 = jSONObject.get("app_quality");
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj3;
                    try {
                        Boolean bool3 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        try {
                            d11 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                            try {
                                num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                                try {
                                    num4 = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                                    Unit unit = Unit.f312394a;
                                    num = num2;
                                    d10 = d11;
                                    bool = bool3;
                                    num3 = num4;
                                } catch (JSONException e10) {
                                    e = e10;
                                    Integer num5 = num4;
                                    bool2 = bool3;
                                    obj2 = num5;
                                    kotlin.coroutines.jvm.internal.b.f(Log.e(com.google.firebase.sessions.n.f125059d, "Error parsing the configs remotely fetched: ", e));
                                    num = num2;
                                    d10 = d11;
                                    bool = bool2;
                                    num3 = obj2;
                                }
                            } catch (JSONException e11) {
                                e = e11;
                                num2 = null;
                                bool2 = bool3;
                                obj2 = null;
                            }
                        } catch (JSONException e12) {
                            e = e12;
                            num2 = null;
                            d11 = null;
                            bool2 = bool3;
                            obj2 = d11;
                            kotlin.coroutines.jvm.internal.b.f(Log.e(com.google.firebase.sessions.n.f125059d, "Error parsing the configs remotely fetched: ", e));
                            num = num2;
                            d10 = d11;
                            bool = bool2;
                            num3 = obj2;
                            kVar = d.this.f125098e;
                            if (num3 != 0) {
                                iA = num3.intValue();
                            } else {
                                iA = d.f125091g.a();
                            }
                            sessionConfigs = new SessionConfigs(bool, d10, num, kotlin.coroutines.jvm.internal.b.f(iA), kotlin.coroutines.jvm.internal.b.g(d.this.f125094a.b().e()));
                            this.f125105a = 1;
                            if (kVar.a(sessionConfigs, this) == objL) {
                                return objL;
                            }
                            return Unit.f312394a;
                        }
                    } catch (JSONException e13) {
                        e = e13;
                        num2 = null;
                        d11 = null;
                    }
                } else {
                    bool = null;
                    d10 = null;
                    num = null;
                }
                kVar = d.this.f125098e;
                if (num3 != 0) {
                    iA = num3.intValue();
                } else {
                    iA = d.f125091g.a();
                }
                sessionConfigs = new SessionConfigs(bool, d10, num, kotlin.coroutines.jvm.internal.b.f(iA), kotlin.coroutines.jvm.internal.b.g(d.this.f125094a.b().e()));
                this.f125105a = 1;
                if (kVar.a(sessionConfigs, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(jSONObject, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.d$d, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1191d extends o implements Function2<String, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f125108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f125109b;

        C1191d(kotlin.coroutines.d<? super C1191d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C1191d c1191d = new C1191d(dVar);
            c1191d.f125109b = obj;
            return c1191d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f125108a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1191d) create(str, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        kotlin.time.c.a aVar = kotlin.time.c.f313406b;
        f125092h = (int) kotlin.time.c.i0(kotlin.time.e.m0(24, kotlin.time.f.HOURS));
        f125093i = new Regex("/");
    }

    @ij.a
    public d(@NotNull d1 timeProvider, @NotNull com.google.firebase.installations.k firebaseInstallationsApi, @NotNull com.google.firebase.sessions.b appInfo, @NotNull com.google.firebase.sessions.settings.a configsFetcher, @NotNull k settingsCache) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(settingsCache, "settingsCache");
        this.f125094a = timeProvider;
        this.f125095b = firebaseInstallationsApi;
        this.f125096c = appInfo;
        this.f125097d = configsFetcher;
        this.f125098e = settingsCache;
        this.f125099f = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    private final String l(String str) {
        return f125093i.replace(str, "");
    }

    @Override // com.google.firebase.sessions.settings.n
    @Nullable
    public Double a() {
        return this.f125098e.c();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d0 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0037, B:52:0x0157, B:21:0x0052, B:44:0x00c1, B:46:0x00d0, B:49:0x00d8), top: B:58:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8 A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0037, B:52:0x0157, B:21:0x0052, B:44:0x00c1, B:46:0x00d0, B:49:0x00d8), top: B:58:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0154, code lost:
    
        if (r4.a(r13, r5, r2, r0) == r1) goto L51;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00d8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.firebase.sessions.settings.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.google.firebase.sessions.settings.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.firebase.sessions.settings.d] */
    @Override // com.google.firebase.sessions.settings.n
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.d.b(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.settings.n
    @Nullable
    public Boolean c() {
        return this.f125098e.e();
    }

    @Override // com.google.firebase.sessions.settings.n
    @Nullable
    public kotlin.time.c d() {
        Integer numB = this.f125098e.b();
        if (numB == null) {
            return null;
        }
        kotlin.time.c.a aVar = kotlin.time.c.f313406b;
        return kotlin.time.c.q(kotlin.time.e.m0(numB.intValue(), kotlin.time.f.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.n
    public boolean e() {
        return this.f125098e.d();
    }

    @l1
    @Nullable
    public final Object k(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = this.f125098e.a(h.f125127a.K(), dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }
}
