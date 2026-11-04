package com.planner5d.library.modules.user.user;

import android.app.backup.BackupManager;
import java.util.Date;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nUserRememberAdapterBackups.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRememberAdapterBackups.kt\ncom/planner5d/library/modules/user/user/UserRememberAdapterBackups\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,60:1\n116#2,11:61\n116#2,11:72\n*S KotlinDebug\n*F\n+ 1 UserRememberAdapterBackups.kt\ncom/planner5d/library/modules/user/user/UserRememberAdapterBackups\n*L\n30#1:61,11\n35#1:72,11\n*E\n"})
public final class z0 implements y0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f223599d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f223600e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.sync.a f223601f = kotlinx.coroutines.sync.g.b(false, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f223602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f223603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final BackupManager f223604c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserRememberAdapterBackups", f = "UserRememberAdapterBackups.kt", i = {0, 0, 1, 1, 2}, l = {66, 36, 37}, m = "get", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f223607c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223609e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223607c = obj;
            this.f223609e |= Integer.MIN_VALUE;
            return z0.this.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserRememberAdapterBackups$getBackupCompletionDate$timestamp$1", f = "UserRememberAdapterBackups.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223610a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z0.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223610a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.model.manager.config.p pVarE = z0.this.e();
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.androidBackupDate;
            this.f223610a = 1;
            Object objO = pVarE.o(rVar, 0L, this);
            return objO == objL ? objL : objO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserRememberAdapterBackups", f = "UserRememberAdapterBackups.kt", i = {0, 0, 0, 1}, l = {66, 31}, m = "set", n = {"this", "user", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f223614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f223615d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f223617f;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223615d = obj;
            this.f223617f |= Integer.MIN_VALUE;
            return z0.this.f(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserRememberAdapterBackups$setBackupComplete$1", f = "UserRememberAdapterBackups.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223618a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z0.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223618a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p pVarE = z0.this.e();
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.androidBackupDate;
                long time = new Date().getTime();
                this.f223618a = 1;
                if (pVarE.r(rVar, time, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public z0(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.model.manager.config.p preferences) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f223602a = application;
        this.f223603b = preferences;
        this.f223604c = new BackupManager(application);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a2 A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:14:0x0039, B:38:0x00b7, B:40:0x00bb, B:43:0x00ca, B:21:0x0052, B:32:0x0098, B:34:0x00a2), top: B:52:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.planner5d.library.modules.user.user.z0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.planner5d.library.modules.user.user.z0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.planner5d.library.modules.user.user.z0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // com.planner5d.library.modules.user.user.y0.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super id.c> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.modules.user.user.z0.a(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.modules.user.user.y0.a
    public void b() {
        this.f223604c.dataChanged();
    }

    @NotNull
    public final com.planner5d.library.application.b c() {
        return this.f223602a;
    }

    @androidx.annotation.m1
    @Nullable
    public final Date d() {
        long jLongValue = ((Number) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new c(null), 3, null)).longValue();
        if (jLongValue > 0) {
            return new Date(jLongValue);
        }
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.config.p e() {
        return this.f223603b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object f(@NotNull id.c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        d dVar2;
        kotlinx.coroutines.sync.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f223617f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f223617f = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f223615d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f223617f;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar = f223601f;
                dVar2.f223612a = this;
                dVar2.f223613b = cVar;
                dVar2.f223614c = aVar;
                dVar2.f223617f = 1;
                if (aVar.h(null, dVar2) == objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (kotlinx.coroutines.sync.a) dVar2.f223612a;
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
            kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) dVar2.f223614c;
            cVar = (id.c) dVar2.f223613b;
            z0 z0Var = (z0) dVar2.f223612a;
            ResultKt.m(obj);
            aVar = aVar3;
            this = z0Var;
            com.planner5d.library.model.manager.config.p pVar = this.f223603b;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.userRememberedBackup;
            String string = cVar.toString();
            dVar2.f223612a = aVar;
            dVar2.f223613b = null;
            dVar2.f223614c = null;
            dVar2.f223617f = 2;
            if (pVar.d(rVar, string, dVar2) != objL) {
                aVar2 = aVar;
                Unit unit2 = Unit.f312394a;
                aVar2.i(null);
                return unit2;
            }
            return objL;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.i(null);
            throw th;
        }
    }

    @androidx.annotation.m1
    public final void g() {
        com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new e(null), 3, null);
    }
}
