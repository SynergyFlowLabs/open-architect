package com.planner5d.library.model.manager.config.source;

import androidx.compose.runtime.internal.w0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.f0;
import com.google.firebase.remoteconfig.r;
import com.google.firebase.remoteconfig.s;
import com.google.firebase.remoteconfig.x;
import com.google.firebase.remoteconfig.y;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.manager.t1;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nFirebaseFeatureConfigsSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseFeatureConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/FirebaseFeatureConfigsSource\n*L\n1#1,96:1\n39#1:97\n39#1:98\n82#1,2:99\n39#1:101\n84#1,10:102\n82#1,2:112\n39#1:114\n84#1,10:115\n82#1,2:125\n39#1:127\n84#1,10:128\n39#1:138\n39#1:139\n40#1:140\n*S KotlinDebug\n*F\n+ 1 FirebaseFeatureConfigsSource.kt\ncom/planner5d/library/model/manager/config/source/FirebaseFeatureConfigsSource\n*L\n43#1:97\n53#1:98\n55#1:99,2\n55#1:101\n55#1:102,10\n57#1:112,2\n57#1:114\n57#1:115,10\n66#1:125,2\n66#1:127\n66#1:128,10\n69#1:138\n83#1:139\n46#1:140\n*E\n"})
public final class g implements com.planner5d.library.model.manager.config.source.d, n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f181662b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<t1> f181663a;

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f181664c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final sd.b f181665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final fg.e<g> f181666b;

        @ij.a
        public a(@NotNull sd.b firebaseAvailability, @NotNull fg.e<g> firebaseFeatureConfigsProvider) {
            Intrinsics.checkNotNullParameter(firebaseAvailability, "firebaseAvailability");
            Intrinsics.checkNotNullParameter(firebaseFeatureConfigsProvider, "firebaseFeatureConfigsProvider");
            this.f181665a = firebaseAvailability;
            this.f181666b = firebaseFeatureConfigsProvider;
        }

        @Nullable
        public final g a() {
            if (this.f181665a.c()) {
                return this.f181666b.get();
            }
            return null;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.FirebaseFeatureConfigsSource", f = "FirebaseFeatureConfigsSource.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160718p1}, m = "activateFetched", n = {"this_$iv"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f181668b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f181670d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181668b = obj;
            this.f181670d |= Integer.MIN_VALUE;
            return g.this.f(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.FirebaseFeatureConfigsSource", f = "FirebaseFeatureConfigsSource.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160718p1}, m = "dropFetchedAndActivated", n = {"this_$iv"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f181672b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f181674d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181672b = obj;
            this.f181674d |= Integer.MIN_VALUE;
            return g.this.c(this);
        }
    }

    public static final class d<T> implements ij.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Exception f181675a;

        public d(Exception exc) {
            this.f181675a = exc;
        }

        @Override // ij.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LogRecord get() {
            return new LogRecord("remote_config", null, this.f181675a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.FirebaseFeatureConfigsSource", f = "FirebaseFeatureConfigsSource.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160718p1}, m = "fetchLatest", n = {"this_$iv"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f181677b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f181679d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181677b = obj;
            this.f181679d |= Integer.MIN_VALUE;
            return g.this.b(this);
        }
    }

    @ij.a
    public g(@NotNull fg.e<t1> logRecordManager) {
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f181663a = logRecordManager;
        r rVarD = f0.d(com.google.firebase.d.f121972a);
        rVarD.F(com.google.firebase.remoteconfig.ktx.d.f(new Function1() { // from class: com.planner5d.library.model.manager.config.source.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.g(this.f181660a, (x.b) obj);
            }
        }));
        rVarD.I(com.planner5d.library.f.v.f170863j);
    }

    public static Unit g(g gVar, x.b remoteConfigSettings) {
        Intrinsics.checkNotNullParameter(remoteConfigSettings, "$this$remoteConfigSettings");
        remoteConfigSettings.g(TimeUnit.HOURS.toSeconds(1L));
        return Unit.f312394a;
    }

    private final Object i(Function1<? super r, ? extends Task<?>> function1, kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        try {
            Task<?> taskInvoke = function1.invoke(f0.d(com.google.firebase.d.f121972a));
            h0.e(0);
            kotlinx.coroutines.tasks.e.m(taskInvoke, dVar);
            h0.e(1);
        } catch (Exception e10) {
            if (e10 instanceof CancellationException) {
                throw e10;
            }
            timber.log.b.f381052a.e(e10);
            if (!(e10 instanceof s)) {
                this.f181663a.get().v(new d(e10));
            }
            Unit unit = Unit.f312394a;
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.model.manager.config.g k(String str, String it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        JSONObject jSONObject = new JSONObject(it).getJSONObject(str);
        Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
        return new com.planner5d.library.model.manager.config.g(jSONObject);
    }

    private final long l() {
        return TimeUnit.HOURS.toSeconds(1L);
    }

    private final r m() {
        return f0.d(com.google.firebase.d.f121972a);
    }

    @Override // com.planner5d.library.model.manager.config.source.d
    @Nullable
    public Object a(@NotNull com.planner5d.library.model.manager.config.f fVar, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.manager.config.g> dVar) {
        final String str = "feature_" + fVar.getId();
        return j(str, new Function1() { // from class: com.planner5d.library.model.manager.config.source.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.k(str, (String) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.planner5d.library.model.manager.config.source.n
    @Nullable
    public Object b(@NotNull kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f181679d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f181679d = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f181677b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f181679d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                Task<Void> taskN = f0.d(com.google.firebase.d.f121972a).n();
                Intrinsics.checkNotNullExpressionValue(taskN, "fetch(...)");
                eVar.f181676a = this;
                eVar.f181679d = 1;
                Object objM = kotlinx.coroutines.tasks.e.m(taskN, eVar);
                this = objM;
                if (objM == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g gVar = (g) eVar.f181676a;
                ResultKt.m(obj);
                this = gVar;
            }
        } catch (Exception e10) {
            if (e10 instanceof CancellationException) {
                throw e10;
            }
            timber.log.b.f381052a.e(e10);
            if (!(e10 instanceof s)) {
                this.f181663a.get().v(new d(e10));
            }
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.planner5d.library.model.manager.config.source.n
    @Nullable
    public Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f181674d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f181674d = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f181672b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f181674d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                Task<Void> taskD = f0.d(com.google.firebase.d.f121972a).D();
                Intrinsics.checkNotNullExpressionValue(taskD, "reset(...)");
                cVar.f181671a = this;
                cVar.f181674d = 1;
                Object objM = kotlinx.coroutines.tasks.e.m(taskD, cVar);
                this = objM;
                if (objM == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g gVar = (g) cVar.f181671a;
                ResultKt.m(obj);
                this = gVar;
            }
        } catch (Exception e10) {
            if (e10 instanceof CancellationException) {
                throw e10;
            }
            timber.log.b.f381052a.e(e10);
            if (!(e10 instanceof s)) {
                this.f181663a.get().v(new d(e10));
            }
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.source.n
    @Nullable
    public Object e(@NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        Map<String, y> mapQ = f0.d(com.google.firebase.d.f121972a).q();
        Intrinsics.checkNotNullExpressionValue(mapQ, "getAll(...)");
        return kotlin.coroutines.jvm.internal.b.a(!mapQ.isEmpty());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.planner5d.library.model.manager.config.source.n
    @Nullable
    public Object f(@NotNull kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f181670d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f181670d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f181668b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f181670d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                Task<Boolean> taskK = f0.d(com.google.firebase.d.f121972a).k();
                Intrinsics.checkNotNullExpressionValue(taskK, "activate(...)");
                bVar.f181667a = this;
                bVar.f181670d = 1;
                Object objM = kotlinx.coroutines.tasks.e.m(taskK, bVar);
                this = objM;
                if (objM == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g gVar = (g) bVar.f181667a;
                ResultKt.m(obj);
                this = gVar;
            }
        } catch (Exception e10) {
            if (e10 instanceof CancellationException) {
                throw e10;
            }
            timber.log.b.f381052a.e(e10);
            if (!(e10 instanceof s)) {
                this.f181663a.get().v(new d(e10));
            }
        }
        return Unit.f312394a;
    }

    @Nullable
    public final <T> T j(@NotNull String key, @NotNull Function1<? super String, ? extends T> parser) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parser, "parser");
        String strZ = f0.d(com.google.firebase.d.f121972a).z(key);
        Intrinsics.checkNotNullExpressionValue(strZ, "getString(...)");
        if (strZ.length() == 0) {
            return null;
        }
        try {
            return parser.invoke(strZ);
        } catch (Exception e10) {
            timber.log.b.f381052a.e(e10);
            return null;
        }
    }
}
