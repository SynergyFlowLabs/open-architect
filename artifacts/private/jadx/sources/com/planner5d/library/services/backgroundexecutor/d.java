package com.planner5d.library.services.backgroundexecutor;

import android.os.RemoteException;
import androidx.annotation.m1;
import com.planner5d.library.services.backgroundexecutor.database.BackgroundExecutorDatabase;
import com.planner5d.library.services.utility.c0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nBackgroundExecutorExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackgroundExecutorExceptionHandler.kt\ncom/planner5d/library/services/backgroundexecutor/BackgroundExecutorExceptionHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0<BackgroundExecutorDatabase> f223980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.e f223981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f223982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.backgroundexecutor.database.e f223983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private p2 f223984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final s0 f223985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final SimpleDateFormat f223986g;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.backgroundexecutor.BackgroundExecutorExceptionHandler$reportCrashLater$1", f = "BackgroundExecutorExceptionHandler.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223987a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f223989c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Throwable th2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f223989c = th2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new a(this.f223989c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223987a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.services.backgroundexecutor.database.c cVarD = ((BackgroundExecutorDatabase) d.this.f223980a.getValue()).d();
                com.planner5d.library.services.backgroundexecutor.database.b bVarA = d.this.f223983d.a(this.f223989c);
                this.f223987a = 1;
                if (cVarD.a(bVarA, this) == objL) {
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
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.backgroundexecutor.BackgroundExecutorExceptionHandler$sendPendingCrashRecords$1", f = "BackgroundExecutorExceptionHandler.kt", i = {0, 1}, l = {75, com.planner5d.library.engine.input.f.b.f160705l0}, m = "invokeSuspend", n = {"dao", "dao"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nBackgroundExecutorExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackgroundExecutorExceptionHandler.kt\ncom/planner5d/library/services/backgroundexecutor/BackgroundExecutorExceptionHandler$sendPendingCrashRecords$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,103:1\n1#2:104\n326#3:105\n*S KotlinDebug\n*F\n+ 1 BackgroundExecutorExceptionHandler.kt\ncom/planner5d/library/services/backgroundexecutor/BackgroundExecutorExceptionHandler$sendPendingCrashRecords$1\n*L\n77#1:105\n*E\n"})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223992c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.e f223994e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.backgroundexecutor.BackgroundExecutorExceptionHandler$sendPendingCrashRecords$1$1", f = "BackgroundExecutorExceptionHandler.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160717p0}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f223995a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.services.backgroundexecutor.database.c f223996b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.services.backgroundexecutor.database.b f223997c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.planner5d.library.services.backgroundexecutor.database.c cVar, com.planner5d.library.services.backgroundexecutor.database.b bVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f223996b = cVar;
                this.f223997c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f223996b, this.f223997c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f223995a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.services.backgroundexecutor.database.c cVar = this.f223996b;
                    com.planner5d.library.services.backgroundexecutor.database.b bVar = this.f223997c;
                    this.f223995a = 1;
                    if (cVar.c(bVar, this) == objL) {
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
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.planner5d.library.e eVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f223994e = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new b(this.f223994e, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0079  */
        /* JADX WARN: Code duplicated, block: B:30:0x008e A[Catch: RemoteException -> 0x00b5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00b5, blocks: (B:7:0x0019, B:30:0x008e), top: B:38:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00b4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:42:0x008b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:24:0x0071->B:44:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        
            if (r10 == r0) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r8 = 1
                int r1 = r9.f223992c
                r8 = 1
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L27
                if (r1 != r3) goto L1d
                java.lang.Object r1 = r9.f223991b
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r4 = r9.f223990a
                com.planner5d.library.services.backgroundexecutor.database.c r4 = (com.planner5d.library.services.backgroundexecutor.database.c) r4
                kotlin.ResultKt.m(r10)     // Catch: android.os.RemoteException -> Lb5
                goto L71
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "/ist/emtocrnrtrof uo ihceinuvk/ owo e/ balle/ //es/"
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L27:
                java.lang.Object r1 = r9.f223990a
                com.planner5d.library.services.backgroundexecutor.database.c r1 = (com.planner5d.library.services.backgroundexecutor.database.c) r1
                kotlin.ResultKt.m(r10)
                r8 = 5
                goto L52
            L30:
                kotlin.ResultKt.m(r10)
                com.planner5d.library.services.backgroundexecutor.d r10 = com.planner5d.library.services.backgroundexecutor.d.this
                kotlin.f0 r10 = com.planner5d.library.services.backgroundexecutor.d.e(r10)
                r8 = 2
                java.lang.Object r10 = r10.getValue()
                r8 = 7
                com.planner5d.library.services.backgroundexecutor.database.BackgroundExecutorDatabase r10 = (com.planner5d.library.services.backgroundexecutor.database.BackgroundExecutorDatabase) r10
                com.planner5d.library.services.backgroundexecutor.database.c r1 = r10.d()
                r9.f223990a = r1
                r9.f223992c = r4
                r8 = 2
                java.lang.Object r10 = r1.b(r9)
                r8 = 7
                if (r10 != r0) goto L52
                goto Lb4
            L52:
                r4 = r10
                r8 = 2
                java.util.List r4 = (java.util.List) r4
                java.util.Collection r4 = (java.util.Collection) r4
                r8 = 5
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L60
                goto L61
            L60:
                r10 = r2
            L61:
                r8 = 6
                java.util.List r10 = (java.util.List) r10
                if (r10 != 0) goto L6a
                kotlin.Unit r9 = kotlin.Unit.f312394a
                r8 = 3
                return r9
            L6a:
                java.util.Iterator r10 = r10.iterator()
                r4 = r1
                r4 = r1
                r1 = r10
            L71:
                r8 = 7
                boolean r10 = r1.hasNext()
                r8 = 5
                if (r10 == 0) goto Lb9
                java.lang.Object r10 = r1.next()
                r8 = 5
                com.planner5d.library.services.backgroundexecutor.database.b r10 = (com.planner5d.library.services.backgroundexecutor.database.b) r10
                kotlin.coroutines.CoroutineContext r5 = r9.getContext()
                r8 = 4
                boolean r5 = kotlinx.coroutines.s2.D(r5)
                if (r5 != 0) goto L8e
                kotlin.Unit r9 = kotlin.Unit.f312394a
                return r9
            L8e:
                com.planner5d.library.e r5 = r9.f223994e     // Catch: android.os.RemoteException -> Lb5
                com.planner5d.library.services.backgroundexecutor.BackgroundExecutorThrowableContainer r6 = new com.planner5d.library.services.backgroundexecutor.BackgroundExecutorThrowableContainer     // Catch: android.os.RemoteException -> Lb5
                com.planner5d.library.services.backgroundexecutor.d r7 = com.planner5d.library.services.backgroundexecutor.d.this     // Catch: android.os.RemoteException -> Lb5
                java.lang.Throwable r7 = com.planner5d.library.services.backgroundexecutor.d.c(r7, r10)     // Catch: android.os.RemoteException -> Lb5
                r8 = 6
                r6.<init>(r7)     // Catch: android.os.RemoteException -> Lb5
                r5.ed(r6)     // Catch: android.os.RemoteException -> Lb5
                kotlinx.coroutines.c3 r5 = kotlinx.coroutines.c3.f313552a     // Catch: android.os.RemoteException -> Lb5
                com.planner5d.library.services.backgroundexecutor.d$b$a r6 = new com.planner5d.library.services.backgroundexecutor.d$b$a     // Catch: android.os.RemoteException -> Lb5
                r8 = 1
                r6.<init>(r4, r10, r2)     // Catch: android.os.RemoteException -> Lb5
                r9.f223990a = r4     // Catch: android.os.RemoteException -> Lb5
                r9.f223991b = r1     // Catch: android.os.RemoteException -> Lb5
                r9.f223992c = r3     // Catch: android.os.RemoteException -> Lb5
                java.lang.Object r10 = kotlinx.coroutines.i.h(r5, r6, r9)     // Catch: android.os.RemoteException -> Lb5
                r8 = 7
                if (r10 != r0) goto L71
            Lb4:
                return r0
            Lb5:
                kotlin.Unit r9 = kotlin.Unit.f312394a
                r8 = 0
                return r9
            Lb9:
                r8 = 7
                kotlin.Unit r9 = kotlin.Unit.f312394a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.services.backgroundexecutor.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull f0<? extends BackgroundExecutorDatabase> database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f223980a = database;
        this.f223982c = new Object();
        this.f223983d = new com.planner5d.library.services.backgroundexecutor.database.e();
        this.f223985f = t0.a(u2.c(null, 1, null));
        this.f223986g = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.planner5d.library.services.backgroundexecutor.c
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    d.b(this.f223978a, defaultUncaughtExceptionHandler, thread, th2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(d dVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th2) {
        com.planner5d.library.e eVar;
        synchronized (dVar.f223982c) {
            try {
                eVar = dVar.f223981b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (eVar != null) {
            try {
                Intrinsics.checkNotNull(thread);
                Intrinsics.checkNotNull(th2);
                eVar.ed(new BackgroundExecutorThrowableContainer(dVar.g(thread, th2)));
            } catch (RemoteException unused) {
                Intrinsics.checkNotNull(th2);
                dVar.h(th2);
            }
        } else {
            Intrinsics.checkNotNull(th2);
            dVar.h(th2);
        }
        uncaughtExceptionHandler.uncaughtException(thread, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable f(com.planner5d.library.services.backgroundexecutor.database.b bVar) {
        return new com.planner5d.library.model.exception.b("Previously crashed in " + bVar.d() + " (" + bVar.c() + ") at " + this.f223986g.format(new Date(bVar.e())), bVar.a());
    }

    private final Throwable g(Thread thread, Throwable th2) {
        return new com.planner5d.library.model.exception.b("Crashed in " + thread.getName() + " (" + thread.getId() + ")", th2);
    }

    @m1
    private final void h(Throwable th2) {
        int i10 = 5 ^ 0;
        c0.t(c0.f225068a, null, false, new a(th2, null), 3, null);
    }

    private final void i(com.planner5d.library.e eVar) {
        p2 p2Var = this.f223984e;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.f223984e = kotlinx.coroutines.k.f(this.f223985f, null, null, new b(eVar, null), 3, null);
    }

    public final void j(@NotNull com.planner5d.library.e callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f223982c) {
            this.f223981b = callback;
            Unit unit = Unit.f312394a;
        }
        i(callback);
    }
}
