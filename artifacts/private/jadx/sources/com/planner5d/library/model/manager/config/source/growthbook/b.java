package com.planner5d.library.model.manager.config.source.growthbook;

import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.s;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nGrowthBookConfigsStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrowthBookConfigsStorage.kt\ncom/planner5d/library/model/manager/config/source/growthbook/GrowthBookConfigsStorage\n*L\n1#1,60:1\n18#1:61\n18#1:62\n18#1:63\n18#1:64\n18#1:65\n18#1:66\n*S KotlinDebug\n*F\n+ 1 GrowthBookConfigsStorage.kt\ncom/planner5d/library/model/manager/config/source/growthbook/GrowthBookConfigsStorage\n*L\n20#1:61\n25#1:62\n34#1:63\n40#1:64\n45#1:65\n54#1:66\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f181683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.h f181684b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookConfigsStorage$dropAllConfigs$2", f = "GrowthBookConfigsStorage.kt", i = {0}, l = {47, 48}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240"}, s = {"L$0"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f181686b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new a(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r1.L(r7, false, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 3
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f181686b
                r5 = 7
                r2 = 0
                r5 = 1
                r3 = 2
                r4 = 0
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L21
                if (r1 != r3) goto L18
                kotlin.ResultKt.m(r7)
                r5 = 2
                goto L55
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                r5 = 0
                throw r6
            L21:
                java.lang.Object r1 = r6.f181685a
                com.planner5d.library.model.manager.config.p r1 = (com.planner5d.library.model.manager.config.p) r1
                r5 = 6
                kotlin.ResultKt.m(r7)
                goto L44
            L2a:
                kotlin.ResultKt.m(r7)
                r5 = 6
                com.planner5d.library.model.manager.config.source.growthbook.b r7 = com.planner5d.library.model.manager.config.source.growthbook.b.this
                r5 = 1
                com.planner5d.library.model.manager.config.p r1 = com.planner5d.library.model.manager.config.source.growthbook.b.b(r7)
                com.planner5d.library.services.r r7 = com.planner5d.library.services.r.growthBookActivatedConfigs
                r5 = 3
                r6.f181685a = r1
                r6.f181686b = r4
                r5 = 1
                java.lang.Object r7 = r1.d(r7, r2, r6)
                if (r7 != r0) goto L44
                goto L53
            L44:
                com.planner5d.library.services.r r7 = com.planner5d.library.services.r.growthBookHasPendingConfigs
                r6.f181685a = r2
                r6.f181686b = r3
                r2 = 0
                r5 = r2
                java.lang.Object r6 = r1.L(r7, r2, r6)
                r5 = 7
                if (r6 != r0) goto L55
            L53:
                r5 = 0
                return r0
            L55:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                r5 = 5
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.source.growthbook.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.config.source.growthbook.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookConfigsStorage$getActivatedFeatureConfig$2", f = "GrowthBookConfigsStorage.kt", i = {}, l = {36, 35}, m = "invokeSuspend", n = {}, s = {})
    static final class C1579b extends o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.manager.config.g>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f181689b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f181691d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1579b(String str, kotlin.coroutines.d<? super C1579b> dVar) {
            super(2, dVar);
            this.f181691d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new C1579b(this.f181691d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.planner5d.library.model.manager.config.h hVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181689b;
            if (i10 == 0) {
                ResultKt.m(obj);
                hVar = b.this.f181684b;
                p pVar = b.this.f181683a;
                r rVar = r.growthBookActivatedConfigs;
                this.f181688a = hVar;
                this.f181689b = 1;
                obj = pVar.Q(rVar, this);
                if (obj != objL) {
                }
                return objL;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            hVar = (com.planner5d.library.model.manager.config.h) this.f181688a;
            ResultKt.m(obj);
            String str = this.f181691d;
            this.f181688a = null;
            this.f181689b = 2;
            Object objB = hVar.b((JSONObject) obj, str, this);
            if (objB != objL) {
                return objB;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.manager.config.g> dVar) {
            return ((C1579b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookConfigsStorage$hasActivatedConfigs$2", f = "GrowthBookConfigsStorage.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181692a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181692a;
            boolean z10 = true;
            if (i10 == 0) {
                ResultKt.m(obj);
                p pVar = b.this.f181683a;
                r rVar = r.growthBookActivatedConfigs;
                this.f181692a = 1;
                obj = pVar.u(rVar, null, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            if (obj == null) {
                z10 = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookConfigsStorage$hasPendingConfigs$2", f = "GrowthBookConfigsStorage.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181694a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181694a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            p pVar = b.this.f181683a;
            r rVar = r.growthBookHasPendingConfigs;
            this.f181694a = 1;
            Object objG = pVar.G(rVar, false, this);
            return objG == objL ? objL : objG;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookConfigsStorage$setActivatedConfigs$2", f = "GrowthBookConfigsStorage.kt", i = {0}, l = {28, 30}, m = "invokeSuspend", n = {"configsJson"}, s = {"L$0"})
    static final class e extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f181698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Map<String, com.planner5d.library.model.manager.config.g> f181699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f181700e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Map<String, com.planner5d.library.model.manager.config.g> map, b bVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f181699d = map;
            this.f181700e = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f181699d, this.f181700e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
        
            if (r9.j(r1, r4, r8) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r7 = 7
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r7 = 6
                int r1 = r8.f181698c
                r2 = 2
                r3 = 1
                r7 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r9)
                goto L89
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L1d:
                r7 = 1
                java.lang.Object r1 = r8.f181697b
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r4 = r8.f181696a
                org.json.JSONObject r4 = (org.json.JSONObject) r4
                r7 = 7
                kotlin.ResultKt.m(r9)
                goto L3f
            L2b:
                kotlin.ResultKt.m(r9)
                org.json.JSONObject r9 = new org.json.JSONObject
                r9.<init>()
                java.util.Map<java.lang.String, com.planner5d.library.model.manager.config.g> r1 = r8.f181699d
                r7 = 3
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
                r4 = r9
            L3f:
                r7 = 3
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L6f
                java.lang.Object r9 = r1.next()
                r7 = 3
                java.util.Map$Entry r9 = (java.util.Map.Entry) r9
                com.planner5d.library.model.manager.config.source.growthbook.b r5 = r8.f181700e
                com.planner5d.library.model.manager.config.h r5 = com.planner5d.library.model.manager.config.source.growthbook.b.a(r5)
                java.lang.Object r6 = r9.getKey()
                r7 = 6
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r9 = r9.getValue()
                com.planner5d.library.model.manager.config.g r9 = (com.planner5d.library.model.manager.config.g) r9
                r8.f181696a = r4
                r8.f181697b = r1
                r8.f181698c = r3
                java.lang.Object r9 = r5.e(r4, r6, r9, r8)
                r7 = 7
                if (r9 != r0) goto L3f
                r7 = 2
                goto L87
            L6f:
                com.planner5d.library.model.manager.config.source.growthbook.b r9 = r8.f181700e
                com.planner5d.library.model.manager.config.p r9 = com.planner5d.library.model.manager.config.source.growthbook.b.b(r9)
                com.planner5d.library.services.r r1 = com.planner5d.library.services.r.growthBookActivatedConfigs
                r3 = 4
                r3 = 0
                r8.f181696a = r3
                r8.f181697b = r3
                r7 = 2
                r8.f181698c = r2
                java.lang.Object r8 = r9.j(r1, r4, r8)
                r7 = 1
                if (r8 != r0) goto L89
            L87:
                r7 = 6
                return r0
            L89:
                r7 = 2
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.source.growthbook.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.growthbook.GrowthBookConfigsStorage$setHasPendingConfigs$2", f = "GrowthBookConfigsStorage.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181701a;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181701a;
            if (i10 == 0) {
                ResultKt.m(obj);
                p pVar = b.this.f181683a;
                r rVar = r.growthBookHasPendingConfigs;
                this.f181701a = 1;
                if (pVar.L(rVar, true, this) == objL) {
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
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public b(@NotNull p sharedPreferencesManager, @NotNull com.planner5d.library.model.manager.config.h featureConfigJsonSerialization) {
        Intrinsics.checkNotNullParameter(sharedPreferencesManager, "sharedPreferencesManager");
        Intrinsics.checkNotNullParameter(featureConfigJsonSerialization, "featureConfigJsonSerialization");
        this.f181683a = sharedPreferencesManager;
        this.f181684b = featureConfigJsonSerialization;
    }

    private final n0 e() {
        return s.f229729a.h();
    }

    @Nullable
    public final Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(s.f229729a.h(), new a(null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Nullable
    public final Object d(@NotNull String str, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.manager.config.g> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new C1579b(str, null), dVar);
    }

    @Nullable
    public final Object f(@NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new c(null), dVar);
    }

    @Nullable
    public final Object g(@NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new d(null), dVar);
    }

    @Nullable
    public final Object h(@NotNull Map<String, com.planner5d.library.model.manager.config.g> map, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(s.f229729a.h(), new e(map, this, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Nullable
    public final Object i(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(s.f229729a.h(), new f(null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
