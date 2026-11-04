package com.planner5d.library.model.manager;

import com.planner5d.library.model.Folder;
import com.planner5d.library.model.snapshot.Snapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotManagerKotlin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotManagerKotlin.kt\ncom/planner5d/library/model/manager/SnapshotManagerKotlin\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,104:1\n116#2,11:105\n116#2,11:116\n*S KotlinDebug\n*F\n+ 1 SnapshotManagerKotlin.kt\ncom/planner5d/library/model/manager/SnapshotManagerKotlin\n*L\n90#1:105,11\n95#1:116,11\n*E\n"})
public final class d4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f191262i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<b4> f191263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.t> f191264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.render.a f191265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f191266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final w f191267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.f1 f191268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f191269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f191270h;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.SnapshotManagerKotlin$getListOfFinished$2", f = "SnapshotManagerKotlin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSnapshotManagerKotlin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotManagerKotlin.kt\ncom/planner5d/library/model/manager/SnapshotManagerKotlin$getListOfFinished$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n774#2:105\n865#2,2:106\n*S KotlinDebug\n*F\n+ 1 SnapshotManagerKotlin.kt\ncom/planner5d/library/model/manager/SnapshotManagerKotlin$getListOfFinished$2\n*L\n82#1:105\n82#1:106,2\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super List<? extends gd.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191271a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f191273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Folder f191274d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(id.a aVar, Folder folder, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f191273c = aVar;
            this.f191274d = folder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d4.this.new a(this.f191273c, this.f191274d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f191271a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            List<gd.b> listW = ((b4) d4.this.f191263a.get()).W(this.f191273c, this.f191274d);
            Intrinsics.checkNotNullExpressionValue(listW, "getListBackgroundWithDescendingDate(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listW) {
                if (((gd.b) obj2).t() == 4) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<? extends gd.b>> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.SnapshotManagerKotlin", f = "SnapshotManagerKotlin.kt", i = {0, 0, 0, 1, 1, 1}, l = {110, com.planner5d.library.engine.input.f.b.f160711n0}, m = "isAwareAboutAiImprovement", n = {"this", "$this$withLock_u24default$iv", "atPosition", "this", "$this$withLock_u24default$iv", "atPosition"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f191277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191278d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191280f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191278d = obj;
            this.f191280f |= Integer.MIN_VALUE;
            return d4.this.h(0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.SnapshotManagerKotlin", f = "SnapshotManagerKotlin.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {110, 96, com.planner5d.library.engine.input.f.b.f160715o1}, m = "setAwareAboutAiImprovement", n = {"this", "$this$withLock_u24default$iv", "atPosition", "this", "$this$withLock_u24default$iv", "atPosition", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f191283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191284d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191286f;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191284d = obj;
            this.f191286f |= Integer.MIN_VALUE;
            return d4.this.i(0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.SnapshotManagerKotlin$startRenderingProgressFlow$1", f = "SnapshotManagerKotlin.kt", i = {0, 1}, l = {49, 51, com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {"snapshotsWereInProgress", "snapshotsWereInProgress"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nSnapshotManagerKotlin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotManagerKotlin.kt\ncom/planner5d/library/model/manager/SnapshotManagerKotlin$startRenderingProgressFlow$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1863#2,2:105\n*S KotlinDebug\n*F\n+ 1 SnapshotManagerKotlin.kt\ncom/planner5d/library/model/manager/SnapshotManagerKotlin$startRenderingProgressFlow$1\n*L\n56#1:105,2\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f191288b;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(List list, Set set) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Snapshot snapshot = (Snapshot) it.next();
                if (!snapshot.isNew) {
                    snapshot.isNew = true;
                    snapshot.save();
                }
                Intrinsics.checkNotNull(snapshot);
                set.add(snapshot);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d4.this.new d(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:8:0x0017, B:15:0x002e, B:30:0x009a, B:32:0x00a2, B:35:0x00aa, B:36:0x00b4, B:38:0x00bf, B:22:0x0047, B:24:0x0052, B:27:0x0064, B:40:0x00c6, B:42:0x00cf, B:18:0x0038, B:21:0x0041), top: B:55:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0062  */
        /* JADX WARN: Code duplicated, block: B:27:0x0064 A[Catch: all -> 0x001d, PHI: r1
          0x0064: PHI (r1v2 java.util.Set) = (r1v3 java.util.Set), (r1v3 java.util.Set), (r1v7 java.util.Set) binds: [B:23:0x0050, B:25:0x0060, B:19:0x003c] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x001d, blocks: (B:8:0x0017, B:15:0x002e, B:30:0x009a, B:32:0x00a2, B:35:0x00aa, B:36:0x00b4, B:38:0x00bf, B:22:0x0047, B:24:0x0052, B:27:0x0064, B:40:0x00c6, B:42:0x00cf, B:18:0x0038, B:21:0x0041), top: B:55:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:29:0x0099  */
        /* JADX WARN: Code duplicated, block: B:30:0x009a A[Catch: all -> 0x001d, PHI: r1 r10
          0x009a: PHI (r1v4 java.util.Set) = (r1v2 java.util.Set), (r1v9 java.util.Set) binds: [B:28:0x0097, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x009a: PHI (r10v11 java.lang.Object) = (r10v5 java.lang.Object), (r10v0 java.lang.Object) binds: [B:28:0x0097, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x001d, blocks: (B:8:0x0017, B:15:0x002e, B:30:0x009a, B:32:0x00a2, B:35:0x00aa, B:36:0x00b4, B:38:0x00bf, B:22:0x0047, B:24:0x0052, B:27:0x0064, B:40:0x00c6, B:42:0x00cf, B:18:0x0038, B:21:0x0041), top: B:55:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00a2 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:8:0x0017, B:15:0x002e, B:30:0x009a, B:32:0x00a2, B:35:0x00aa, B:36:0x00b4, B:38:0x00bf, B:22:0x0047, B:24:0x0052, B:27:0x0064, B:40:0x00c6, B:42:0x00cf, B:18:0x0038, B:21:0x0041), top: B:55:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00bf A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:8:0x0017, B:15:0x002e, B:30:0x009a, B:32:0x00a2, B:35:0x00aa, B:36:0x00b4, B:38:0x00bf, B:22:0x0047, B:24:0x0052, B:27:0x0064, B:40:0x00c6, B:42:0x00cf, B:18:0x0038, B:21:0x0041), top: B:55:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00cf A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #1 {all -> 0x001d, blocks: (B:8:0x0017, B:15:0x002e, B:30:0x009a, B:32:0x00a2, B:35:0x00aa, B:36:0x00b4, B:38:0x00bf, B:22:0x0047, B:24:0x0052, B:27:0x0064, B:40:0x00c6, B:42:0x00cf, B:18:0x0038, B:21:0x0041), top: B:55:0x000e }] */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
        
            if (r9.f191289c.f191265c.p(r1, r9) == r0) goto L44;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0097 -> B:30:0x009a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 265
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.d4.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public d4(@NotNull fg.e<b4> snapshotManager, @NotNull fg.e<com.planner5d.library.modules.user.user.t> userAuthorization, @NotNull com.planner5d.library.services.render.a renderNotification, @NotNull com.planner5d.library.model.manager.config.p sharedPreferences, @NotNull w featureConfigManager, @NotNull com.planner5d.library.services.utility.f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(renderNotification, "renderNotification");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f191263a = snapshotManager;
        this.f191264b = userAuthorization;
        this.f191265c = renderNotification;
        this.f191266d = sharedPreferences;
        this.f191267e = featureConfigManager;
        this.f191268f = coroutineScope;
        this.f191269g = new AtomicBoolean(false);
        this.f191270h = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    private final int e(@androidx.annotation.g0(from = 1, to = 2) int i10) {
        return 1 << (i10 - 1);
    }

    @Nullable
    public final Object f(@Nullable id.a aVar, @Nullable Folder folder, @NotNull kotlin.coroutines.d<? super List<? extends gd.b>> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.d(), new a(aVar, folder, null), dVar);
    }

    public final boolean g() {
        return this.f191267e.a(com.planner5d.library.model.manager.config.f.RendersAi) && this.f191267e.a(com.planner5d.library.model.manager.config.f.ProAndroid);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.planner5d.library.model.manager.d4] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    @Nullable
    public final Object h(@androidx.annotation.g0(from = 1, to = 2) int i10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        b bVar;
        ?? r12;
        kotlinx.coroutines.sync.a aVar;
        ?? r10;
        ?? r11;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.f191280f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f191280f = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f191278d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = bVar.f191280f;
        try {
            if (i12 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.sync.a aVar2 = this.f191270h;
                bVar.f191275a = this;
                bVar.f191276b = aVar2;
                bVar.f191277c = i10;
                bVar.f191280f = 1;
                if (aVar2.h(null, bVar) != objL) {
                    r12 = i10;
                    aVar = aVar2;
                }
                return objL;
            }
            if (i12 == 1) {
                int i13 = bVar.f191277c;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) bVar.f191276b;
                d4 d4Var = (d4) bVar.f191275a;
                ResultKt.m(obj);
                r12 = i13;
                aVar = aVar3;
                this = d4Var;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i14 = bVar.f191277c;
                kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) bVar.f191276b;
                d4 d4Var2 = (d4) bVar.f191275a;
                ResultKt.m(obj);
                r10 = d4Var2;
                r11 = i14;
                i10 = aVar4;
            }
            Boolean boolA = kotlin.coroutines.jvm.internal.b.a((r10.e(r11) & ((Number) obj).intValue()) != 0);
            i10.i(null);
            return boolA;
            com.planner5d.library.model.manager.config.p pVar = this.f191266d;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.aiImprovementHint;
            bVar.f191275a = this;
            bVar.f191276b = aVar;
            bVar.f191277c = r12;
            bVar.f191280f = 2;
            Object objP = pVar.p(rVar, 0, bVar);
            if (objP != objL) {
                r10 = this;
                r11 = r12;
                obj = objP;
                i10 = aVar;
                Boolean boolA2 = kotlin.coroutines.jvm.internal.b.a((r10.e(r11) & ((Number) obj).intValue()) != 0);
                i10.i(null);
                return boolA2;
            }
            return objL;
        } catch (Throwable th2) {
            i10.i(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object i(@androidx.annotation.g0(from = 1, to = 2) int i10, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        c cVar;
        kotlinx.coroutines.sync.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        d4 d4Var;
        int i11;
        kotlinx.coroutines.sync.a aVar3;
        com.planner5d.library.model.manager.config.p pVar;
        com.planner5d.library.services.r rVar;
        int iE;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i12 = cVar.f191286f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f191286f = i12 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f191284d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i13 = cVar.f191286f;
        try {
            if (i13 == 0) {
                ResultKt.m(obj);
                aVar = this.f191270h;
                cVar.f191281a = this;
                cVar.f191282b = aVar;
                cVar.f191283c = i10;
                cVar.f191286f = 1;
                if (aVar.h(null, cVar) != objL) {
                }
                return objL;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (kotlinx.coroutines.sync.a) cVar.f191281a;
                    try {
                        ResultKt.m(obj);
                        Unit unit = Unit.f312394a;
                        aVar2.i(null);
                        return unit;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2.i(null);
                        throw th;
                    }
                }
                i11 = cVar.f191283c;
                aVar3 = (kotlinx.coroutines.sync.a) cVar.f191282b;
                d4Var = (d4) cVar.f191281a;
                try {
                    ResultKt.m(obj);
                    int iIntValue = ((Number) obj).intValue();
                    pVar = d4Var.f191266d;
                    rVar = com.planner5d.library.services.r.aiImprovementHint;
                    iE = d4Var.e(i11) | iIntValue;
                    cVar.f191281a = aVar3;
                    cVar.f191282b = null;
                    cVar.f191286f = 3;
                    if (pVar.t(rVar, iE, cVar) != objL) {
                        aVar2 = aVar3;
                        Unit unit2 = Unit.f312394a;
                        aVar2.i(null);
                        return unit2;
                    }
                    return objL;
                } catch (Throwable th3) {
                    kotlinx.coroutines.sync.a aVar4 = aVar3;
                    th = th3;
                    aVar2 = aVar4;
                    aVar2.i(null);
                    throw th;
                }
            }
            i10 = cVar.f191283c;
            kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) cVar.f191282b;
            d4 d4Var2 = (d4) cVar.f191281a;
            ResultKt.m(obj);
            aVar = aVar5;
            this = d4Var2;
            com.planner5d.library.model.manager.config.p pVar2 = this.f191266d;
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.aiImprovementHint;
            cVar.f191281a = this;
            cVar.f191282b = aVar;
            cVar.f191283c = i10;
            cVar.f191286f = 2;
            Object objP = pVar2.p(rVar2, 0, cVar);
            if (objP != objL) {
                d4Var = this;
                i11 = i10;
                aVar3 = aVar;
                obj = objP;
                int iIntValue2 = ((Number) obj).intValue();
                pVar = d4Var.f191266d;
                rVar = com.planner5d.library.services.r.aiImprovementHint;
                iE = d4Var.e(i11) | iIntValue2;
                cVar.f191281a = aVar3;
                cVar.f191282b = null;
                cVar.f191286f = 3;
                if (pVar.t(rVar, iE, cVar) != objL) {
                    aVar2 = aVar3;
                    Unit unit3 = Unit.f312394a;
                    aVar2.i(null);
                    return unit3;
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

    public final void j() {
        if (this.f191269g.compareAndSet(false, true)) {
            kotlinx.coroutines.k.f(this.f191268f, com.planner5d.library.services.utility.s.f229729a.d(), null, new d(null), 2, null);
        }
    }
}
