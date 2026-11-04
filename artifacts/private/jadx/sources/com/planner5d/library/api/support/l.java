package com.planner5d.library.api.support;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@ij.f
@SourceDebugExtension({"SMAP\nSessionIdStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionIdStorage.kt\ncom/planner5d/library/api/support/SessionIdStorage\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,51:1\n116#2,10:52\n*S KotlinDebug\n*F\n+ 1 SessionIdStorage.kt\ncom/planner5d/library/api/support/SessionIdStorage\n*L\n22#1:52,10\n*E\n"})
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f142379d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f142380e = "deleted";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f142381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f142382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f142383c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.support.SessionIdStorage$getSessionId$2", f = "SessionIdStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSessionIdStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionIdStorage.kt\ncom/planner5d/library/api/support/SessionIdStorage$getSessionId$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<JSONObject, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f142385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f142386c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f142386c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f142386c, dVar);
            bVar.f142385b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f142384a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            JSONObject jSONObject = (JSONObject) this.f142385b;
            String strValueOf = String.valueOf(this.f142386c);
            if (!jSONObject.has(strValueOf)) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return jSONObject.getString(strValueOf);
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, kotlin.coroutines.d<? super String> dVar) {
            return ((b) create(jSONObject, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.support.SessionIdStorage$getSessionIdBlocking$1", f = "SessionIdStorage.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142387a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f142389c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f142389c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new c(this.f142389c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142387a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            l lVar = l.this;
            long j10 = this.f142389c;
            this.f142387a = 1;
            Object objC = lVar.c(j10, this);
            return objC == objL ? objL : objC;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.support.SessionIdStorage$setSessionId$2", f = "SessionIdStorage.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSessionIdStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionIdStorage.kt\ncom/planner5d/library/api/support/SessionIdStorage$setSessionId$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<JSONObject, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f142391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f142392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f142393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l f142394e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, String str, l lVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f142392c = j10;
            this.f142393d = str;
            this.f142394e = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f142392c, this.f142393d, this.f142394e, dVar);
            dVar2.f142391b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142390a;
            if (i10 == 0) {
                ResultKt.m(obj);
                JSONObject jSONObject = (JSONObject) this.f142391b;
                String strValueOf = String.valueOf(this.f142392c);
                String str = this.f142393d;
                if (str == null || Intrinsics.areEqual(str, l.f142380e)) {
                    str = null;
                }
                jSONObject.put(strValueOf, str);
                com.planner5d.library.model.manager.config.p pVar = this.f142394e.f142381a;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.userToSessionId;
                this.f142390a = 1;
                if (pVar.j(rVar, jSONObject, this) == objL) {
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
            return ((d) create(jSONObject, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.support.SessionIdStorage$setSessionIdBlocking$1", f = "SessionIdStorage.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142395a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f142397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f142398d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, String str, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f142397c = j10;
            this.f142398d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new e(this.f142397c, this.f142398d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142395a;
            if (i10 == 0) {
                ResultKt.m(obj);
                l lVar = l.this;
                long j10 = this.f142397c;
                String str = this.f142398d;
                this.f142395a = 1;
                if (lVar.e(j10, str, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.support.SessionIdStorage", f = "SessionIdStorage.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {com.planner5d.library.engine.input.f.b.f160729t0, 24, 26}, m = "withStoredJson", n = {"this", "executor", "$this$withLock_u24default$iv", "this", "executor", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
    static final class f<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f142399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f142400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f142401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f142402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f142403e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f142405g;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f142403e = obj;
            this.f142405g |= Integer.MIN_VALUE;
            return l.this.g(null, this);
        }
    }

    @ij.a
    public l(@NotNull com.planner5d.library.model.manager.config.p preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f142381a = preferences;
        this.f142382b = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:22:0x0060, B:37:0x00b7, B:41:0x00c5, B:43:0x00ca, B:44:0x00d1), top: B:53:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final <T> Object g(Function2<? super JSONObject, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super T> dVar) throws Throwable {
        f fVar;
        kotlinx.coroutines.sync.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        Function2<? super JSONObject, ? super kotlin.coroutines.d<? super T>, ? extends Object> function3;
        kotlinx.coroutines.sync.a aVar3;
        l lVar;
        JSONObject jSONObject;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f142405g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f142405g = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objInvoke = fVar.f142403e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f142405g;
        try {
            if (i11 == 0) {
                ResultKt.m(objInvoke);
                aVar = this.f142382b;
                fVar.f142399a = this;
                fVar.f142400b = function2;
                fVar.f142401c = aVar;
                fVar.f142405g = 1;
                if (aVar.h(null, fVar) != objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    this = (l) fVar.f142402d;
                    aVar3 = (kotlinx.coroutines.sync.a) fVar.f142401c;
                    function3 = (Function2) fVar.f142400b;
                    lVar = (l) fVar.f142399a;
                    try {
                        ResultKt.m(objInvoke);
                        this.f142383c = (JSONObject) objInvoke;
                        this = lVar;
                        jSONObject = this.f142383c;
                        if (jSONObject == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("userToSessionId");
                            jSONObject = null;
                        }
                        fVar.f142399a = aVar3;
                        fVar.f142400b = null;
                        fVar.f142401c = null;
                        fVar.f142402d = null;
                        fVar.f142405g = 3;
                        objInvoke = function3.invoke(jSONObject, fVar);
                        if (objInvoke != objL) {
                            aVar2 = aVar3;
                        }
                        return objL;
                    } catch (Throwable th2) {
                        kotlinx.coroutines.sync.a aVar4 = aVar3;
                        th = th2;
                        aVar2 = aVar4;
                        aVar2.i(null);
                        throw th;
                    }
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (kotlinx.coroutines.sync.a) fVar.f142399a;
                try {
                    ResultKt.m(objInvoke);
                } catch (Throwable th3) {
                    th = th3;
                    aVar2.i(null);
                    throw th;
                }
                aVar2.i(null);
                return objInvoke;
            }
            kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) fVar.f142401c;
            function2 = (Function2) fVar.f142400b;
            l lVar2 = (l) fVar.f142399a;
            ResultKt.m(objInvoke);
            aVar = aVar5;
            this = lVar2;
            if (this.f142383c == null) {
                com.planner5d.library.model.manager.config.p pVar = this.f142381a;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.userToSessionId;
                fVar.f142399a = this;
                fVar.f142400b = function2;
                fVar.f142401c = aVar;
                fVar.f142402d = this;
                fVar.f142405g = 2;
                Object objQ = pVar.Q(rVar, fVar);
                if (objQ != objL) {
                    function3 = function2;
                    aVar3 = aVar;
                    objInvoke = objQ;
                    lVar = this;
                    this.f142383c = (JSONObject) objInvoke;
                    this = lVar;
                    jSONObject = this.f142383c;
                    if (jSONObject == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userToSessionId");
                        jSONObject = null;
                    }
                    fVar.f142399a = aVar3;
                    fVar.f142400b = null;
                    fVar.f142401c = null;
                    fVar.f142402d = null;
                    fVar.f142405g = 3;
                    objInvoke = function3.invoke(jSONObject, fVar);
                    if (objInvoke != objL) {
                        aVar2 = aVar3;
                        aVar2.i(null);
                        return objInvoke;
                    }
                }
            } else {
                function3 = function2;
                aVar3 = aVar;
                jSONObject = this.f142383c;
                if (jSONObject == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userToSessionId");
                    jSONObject = null;
                }
                fVar.f142399a = aVar3;
                fVar.f142400b = null;
                fVar.f142401c = null;
                fVar.f142402d = null;
                fVar.f142405g = 3;
                objInvoke = function3.invoke(jSONObject, fVar);
                if (objInvoke != objL) {
                    aVar2 = aVar3;
                    aVar2.i(null);
                    return objInvoke;
                }
            }
            return objL;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
            aVar2.i(null);
            throw th;
        }
    }

    @Nullable
    public final Object c(long j10, @NotNull kotlin.coroutines.d<? super String> dVar) {
        return g(new b(j10, null), dVar);
    }

    @Nullable
    public final String d(long j10) {
        return (String) kotlinx.coroutines.j.b(null, new c(j10, null), 1, null);
    }

    @Nullable
    public final Object e(long j10, @Nullable String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objG = g(new d(j10, str, this, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    public final void f(long j10, @Nullable String str) throws InterruptedException {
        kotlinx.coroutines.j.b(null, new e(j10, str, null), 1, null);
    }
}
