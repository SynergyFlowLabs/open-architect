package com.superwall.sdk.storage.core_data;

import android.content.Context;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.models.config.ComputedPropertyRequest;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.triggers.TriggerRuleOccurrence;
import com.superwall.sdk.storage.core_data.entities.ManagedEventData;
import com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao;
import com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrence;
import com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCoreDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreDataManager.kt\ncom/superwall/sdk/storage/core_data/CoreDataManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
public final class CoreDataManager implements s0 {

    @NotNull
    private final CoroutineContext coroutineContext;

    @NotNull
    private final f0 superwallDatabase$delegate;

    /* JADX INFO: renamed from: com.superwall.sdk.storage.core_data.CoreDataManager$countEventsByNameInPeriod$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.storage.core_data.CoreDataManager", f = "CoreDataManager.kt", i = {}, l = {191}, m = "countEventsByNameInPeriod", n = {}, s = {})
    static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CoreDataManager.this.countEventsByNameInPeriod(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.core_data.CoreDataManager$countTriggerRuleOccurrences$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.storage.core_data.CoreDataManager", f = "CoreDataManager.kt", i = {}, l = {170, 179}, m = "countTriggerRuleOccurrences", n = {}, s = {})
    static final class C27331 extends d {
        int label;
        /* synthetic */ Object result;

        C27331(kotlin.coroutines.d<? super C27331> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CoreDataManager.this.countTriggerRuleOccurrences(null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.core_data.CoreDataManager$deleteAllEntities$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.storage.core_data.CoreDataManager$deleteAllEntities$1", f = "CoreDataManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160702k0, com.planner5d.library.engine.input.f.b.f160690g0}, m = "invokeSuspend", n = {}, s = {})
    static final class C27341 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        C27341(kotlin.coroutines.d<? super C27341> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return CoreDataManager.this.new C27341(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        
            if (r10.deleteAll(r9) == r0) goto L18;
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
                int r1 = r9.label
                r8 = 6
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L13
                kotlin.ResultKt.m(r10)     // Catch: java.lang.Throwable -> L4d
                goto L63
            L13:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r8 = 0
                r9.<init>(r10)
                r8 = 1
                throw r9
            L1d:
                kotlin.ResultKt.m(r10)     // Catch: java.lang.Throwable -> L4d
                goto L3a
            L21:
                kotlin.ResultKt.m(r10)
                r8 = 6
                com.superwall.sdk.storage.core_data.CoreDataManager r10 = com.superwall.sdk.storage.core_data.CoreDataManager.this     // Catch: java.lang.Throwable -> L4d
                com.superwall.sdk.storage.core_data.SuperwallDatabase r10 = com.superwall.sdk.storage.core_data.CoreDataManager.access$getSuperwallDatabase(r10)     // Catch: java.lang.Throwable -> L4d
                com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao r10 = r10.managedTriggerRuleOccurrenceDao()     // Catch: java.lang.Throwable -> L4d
                r8 = 5
                r9.label = r3     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r10 = r10.deleteAll(r9)     // Catch: java.lang.Throwable -> L4d
                r8 = 5
                if (r10 != r0) goto L3a
                goto L4c
            L3a:
                com.superwall.sdk.storage.core_data.CoreDataManager r10 = com.superwall.sdk.storage.core_data.CoreDataManager.this     // Catch: java.lang.Throwable -> L4d
                com.superwall.sdk.storage.core_data.SuperwallDatabase r10 = com.superwall.sdk.storage.core_data.CoreDataManager.access$getSuperwallDatabase(r10)     // Catch: java.lang.Throwable -> L4d
                com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao r10 = r10.managedEventDataDao()     // Catch: java.lang.Throwable -> L4d
                r9.label = r2     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r9 = r10.deleteAll(r9)     // Catch: java.lang.Throwable -> L4d
                if (r9 != r0) goto L63
            L4c:
                return r0
            L4d:
                r0 = move-exception
                r9 = r0
                r5 = r9
                com.superwall.sdk.logger.Logger r0 = com.superwall.sdk.logger.Logger.INSTANCE
                com.superwall.sdk.logger.LogLevel r1 = com.superwall.sdk.logger.LogLevel.error
                com.superwall.sdk.logger.LogScope r2 = com.superwall.sdk.logger.LogScope.coreData
                r6 = 8
                r8 = 7
                r7 = 0
                r8 = 4
                java.lang.String r3 = "Could not delete entities in Room database."
                r4 = 1
                r4 = 0
                r8 = 7
                com.superwall.sdk.logger.Logger.debug$default(r0, r1, r2, r3, r4, r5, r6, r7)
            L63:
                r8 = 5
                kotlin.Unit r9 = kotlin.Unit.f312394a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.storage.core_data.CoreDataManager.C27341.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27341) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.core_data.CoreDataManager$getComputedPropertySinceEvent$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.storage.core_data.CoreDataManager", f = "CoreDataManager.kt", i = {0}, l = {110}, m = "getComputedPropertySinceEvent", n = {"request"}, s = {"L$0"})
    static final class C27351 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C27351(kotlin.coroutines.d<? super C27351> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CoreDataManager.this.getComputedPropertySinceEvent(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.core_data.CoreDataManager$save$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.storage.core_data.CoreDataManager$save$1", f = "CoreDataManager.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {"managedRuleOccurrence"}, s = {"L$0"})
    static final class C27361 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Function1<ManagedTriggerRuleOccurrence, Unit> $completion;
        final /* synthetic */ TriggerRuleOccurrence $triggerRuleOccurrence;
        Object L$0;
        int label;
        final /* synthetic */ CoreDataManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C27361(TriggerRuleOccurrence triggerRuleOccurrence, CoreDataManager coreDataManager, Function1<? super ManagedTriggerRuleOccurrence, Unit> function1, kotlin.coroutines.d<? super C27361> dVar) {
            super(2, dVar);
            this.$triggerRuleOccurrence = triggerRuleOccurrence;
            this.this$0 = coreDataManager;
            this.$completion = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C27361(this.$triggerRuleOccurrence, this.this$0, this.$completion, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ManagedTriggerRuleOccurrence managedTriggerRuleOccurrence;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    ManagedTriggerRuleOccurrence managedTriggerRuleOccurrence2 = new ManagedTriggerRuleOccurrence(null, null, this.$triggerRuleOccurrence.getKey(), 3, null);
                    ManagedTriggerRuleOccurrenceDao managedTriggerRuleOccurrenceDao = this.this$0.getSuperwallDatabase().managedTriggerRuleOccurrenceDao();
                    this.L$0 = managedTriggerRuleOccurrence2;
                    this.label = 1;
                    if (managedTriggerRuleOccurrenceDao.insert(managedTriggerRuleOccurrence2, this) == objL) {
                        return objL;
                    }
                    managedTriggerRuleOccurrence = managedTriggerRuleOccurrence2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    managedTriggerRuleOccurrence = (ManagedTriggerRuleOccurrence) this.L$0;
                    ResultKt.m(obj);
                }
                Function1<ManagedTriggerRuleOccurrence, Unit> function1 = this.$completion;
                if (function1 != null) {
                    function1.invoke(managedTriggerRuleOccurrence);
                }
            } catch (Throwable th2) {
                boolean z10 = true;
                Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.coreData, "Error saving to Room database.", null, th2, 8, null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27361) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.core_data.CoreDataManager$saveEventData$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.storage.core_data.CoreDataManager$saveEventData$1", f = "CoreDataManager.kt", i = {0}, l = {42}, m = "invokeSuspend", n = {"managedEventData"}, s = {"L$0"})
    static final class C27371 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Function1<ManagedEventData, Unit> $completion;
        final /* synthetic */ EventData $eventData;
        Object L$0;
        int label;
        final /* synthetic */ CoreDataManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C27371(EventData eventData, CoreDataManager coreDataManager, Function1<? super ManagedEventData, Unit> function1, kotlin.coroutines.d<? super C27371> dVar) {
            super(2, dVar);
            this.$eventData = eventData;
            this.this$0 = coreDataManager;
            this.$completion = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C27371(this.$eventData, this.this$0, this.$completion, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ManagedEventData managedEventData;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    ManagedEventData managedEventData2 = new ManagedEventData(this.$eventData.getId(), this.$eventData.getCreatedAt(), this.$eventData.getName(), this.$eventData.getParameters());
                    ManagedEventDataDao managedEventDataDao = this.this$0.getSuperwallDatabase().managedEventDataDao();
                    this.L$0 = managedEventData2;
                    this.label = 1;
                    if (managedEventDataDao.insert(managedEventData2, this) == objL) {
                        return objL;
                    }
                    managedEventData = managedEventData2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    managedEventData = (ManagedEventData) this.L$0;
                    ResultKt.m(obj);
                }
                Function1<ManagedEventData, Unit> function1 = this.$completion;
                if (function1 != null) {
                    function1.invoke(managedEventData);
                }
            } catch (Throwable th2) {
                Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.coreData, "Error saving to Room database.", null, th2, 8, null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27371) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public CoreDataManager(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 6 >> 1;
        this.coroutineContext = n0.d0(l1.c(), 1, null, 2, null);
        this.superwallDatabase$delegate = g0.c(new Function0() { // from class: com.superwall.sdk.storage.core_data.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoreDataManager.superwallDatabase_delegate$lambda$0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SuperwallDatabase getSuperwallDatabase() {
        return (SuperwallDatabase) this.superwallDatabase$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void save$default(CoreDataManager coreDataManager, TriggerRuleOccurrence triggerRuleOccurrence, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        coreDataManager.save(triggerRuleOccurrence, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void saveEventData$default(CoreDataManager coreDataManager, EventData eventData, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        coreDataManager.saveEventData(eventData, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SuperwallDatabase superwallDatabase_delegate$lambda$0(Context context) {
        return SuperwallDatabase.Companion.getDatabase(context);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public final Object countEventsByNameInPeriod(@NotNull String str, @NotNull Date date, @NotNull Date date2, @NotNull kotlin.coroutines.d<? super Integer> dVar) {
        AnonymousClass1 anonymousClass1;
        int iIntValue;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objCountEventsByNameInPeriod = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                ResultKt.m(objCountEventsByNameInPeriod);
                ManagedEventDataDao managedEventDataDao = getSuperwallDatabase().managedEventDataDao();
                anonymousClass1.label = 1;
                objCountEventsByNameInPeriod = managedEventDataDao.countEventsByNameInPeriod(str, date, date2, anonymousClass1);
                if (objCountEventsByNameInPeriod == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objCountEventsByNameInPeriod);
            }
            iIntValue = ((Number) objCountEventsByNameInPeriod).intValue();
        } catch (Throwable th2) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.coreData, "Error counting events by name in period from Room database.", null, th2, 8, null);
            iIntValue = 0;
        }
        return kotlin.coroutines.jvm.internal.b.f(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (r8 == r1) goto L27;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object countTriggerRuleOccurrences(@org.jetbrains.annotations.NotNull com.superwall.sdk.models.triggers.TriggerRuleOccurrence r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Integer> r8) {
        /*
            r6 = this;
            r5 = 3
            boolean r0 = r8 instanceof com.superwall.sdk.storage.core_data.CoreDataManager.C27331
            if (r0 == 0) goto L17
            r0 = r8
            r5 = 4
            com.superwall.sdk.storage.core_data.CoreDataManager$countTriggerRuleOccurrences$1 r0 = (com.superwall.sdk.storage.core_data.CoreDataManager.C27331) r0
            int r1 = r0.label
            r5 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 4
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.label = r1
            goto L1c
        L17:
            com.superwall.sdk.storage.core_data.CoreDataManager$countTriggerRuleOccurrences$1 r0 = new com.superwall.sdk.storage.core_data.CoreDataManager$countTriggerRuleOccurrences$1
            r0.<init>(r8)
        L1c:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 5
            int r2 = r0.label
            r3 = 2
            r5 = 6
            r4 = 1
            if (r2 == 0) goto L41
            r5 = 0
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L33
            kotlin.ResultKt.m(r8)
            goto La3
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            r5 = 3
            throw r6
        L3c:
            kotlin.ResultKt.m(r8)
            r5 = 2
            goto L83
        L41:
            kotlin.ResultKt.m(r8)
            r5 = 1
            com.superwall.sdk.storage.core_data.SuperwallDatabase r6 = r6.getSuperwallDatabase()
            com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao r6 = r6.managedTriggerRuleOccurrenceDao()
            com.superwall.sdk.models.triggers.TriggerRuleOccurrence$Interval r8 = r7.getInterval()
            boolean r2 = r8 instanceof com.superwall.sdk.models.triggers.TriggerRuleOccurrence.Interval.Minutes
            if (r2 == 0) goto L8c
            java.util.Calendar r8 = java.util.Calendar.getInstance()
            com.superwall.sdk.models.triggers.TriggerRuleOccurrence$Interval r2 = r7.getInterval()
            r5 = 4
            com.superwall.sdk.models.triggers.TriggerRuleOccurrence$Interval$Minutes r2 = (com.superwall.sdk.models.triggers.TriggerRuleOccurrence.Interval.Minutes) r2
            r5 = 5
            int r2 = r2.getMinutes()
            r5 = 2
            int r2 = -r2
            r3 = 12
            r5 = 2
            r8.add(r3, r2)
            java.util.Date r8 = r8.getTime()
            r5 = 5
            java.lang.String r7 = r7.getKey()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            r0.label = r4
            java.lang.Object r8 = r6.getManagedTriggerRuleOccurrencesSinceDate(r8, r7, r0)
            if (r8 != r1) goto L83
            r5 = 7
            goto La2
        L83:
            java.util.List r8 = (java.util.List) r8
            r5 = 3
            int r6 = r8.size()
            r5 = 0
            goto La9
        L8c:
            com.superwall.sdk.models.triggers.TriggerRuleOccurrence$Interval$Infinity r2 = com.superwall.sdk.models.triggers.TriggerRuleOccurrence.Interval.Infinity.INSTANCE
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r2)
            r5 = 1
            if (r8 == 0) goto Lb0
            java.lang.String r7 = r7.getKey()
            r5 = 6
            r0.label = r3
            java.lang.Object r8 = r6.getManagedTriggerRuleOccurrencesByKey(r7, r0)
            if (r8 != r1) goto La3
        La2:
            return r1
        La3:
            java.util.List r8 = (java.util.List) r8
            int r6 = r8.size()
        La9:
            r5 = 7
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.f(r6)
            r5 = 6
            return r6
        Lb0:
            r5 = 4
            kotlin.k0 r6 = new kotlin.k0
            r5 = 7
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.storage.core_data.CoreDataManager.countTriggerRuleOccurrences(com.superwall.sdk.models.triggers.TriggerRuleOccurrence, kotlin.coroutines.d):java.lang.Object");
    }

    public final void deleteAllEntities() {
        k.f(this, null, null, new C27341(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public final Object getComputedPropertySinceEvent(@Nullable EventData eventData, @NotNull ComputedPropertyRequest computedPropertyRequest, @NotNull kotlin.coroutines.d<? super Integer> dVar) {
        C27351 c27351;
        if (dVar instanceof C27351) {
            c27351 = (C27351) dVar;
            int i10 = c27351.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c27351.label = i10 - Integer.MIN_VALUE;
            } else {
                c27351 = new C27351(dVar);
            }
        } else {
            c27351 = new C27351(dVar);
        }
        Object lastSavedEvent = c27351.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c27351.label;
        try {
            if (i11 == 0) {
                ResultKt.m(lastSavedEvent);
                Date createdAt = (eventData == null || !Intrinsics.areEqual(eventData.getName(), computedPropertyRequest.getEventName())) ? null : eventData.getCreatedAt();
                ManagedEventDataDao managedEventDataDao = getSuperwallDatabase().managedEventDataDao();
                String eventName = computedPropertyRequest.getEventName();
                c27351.L$0 = computedPropertyRequest;
                c27351.label = 1;
                lastSavedEvent = managedEventDataDao.getLastSavedEvent(eventName, createdAt, c27351);
                if (lastSavedEvent == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                computedPropertyRequest = (ComputedPropertyRequest) c27351.L$0;
                ResultKt.m(lastSavedEvent);
            }
            ManagedEventData managedEventData = (ManagedEventData) lastSavedEvent;
            if (managedEventData == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(managedEventData.getCreatedAt());
            Calendar calendar2 = Calendar.getInstance();
            int calendarComponent = computedPropertyRequest.getType().getCalendarComponent();
            if (calendarComponent == 1) {
                linkedHashMap.put(kotlin.coroutines.jvm.internal.b.f(1), kotlin.coroutines.jvm.internal.b.f(calendar2.get(1) - calendar.get(1)));
            } else if (calendarComponent == 2) {
                linkedHashMap.put(kotlin.coroutines.jvm.internal.b.f(2), kotlin.coroutines.jvm.internal.b.f((((calendar2.get(1) - calendar.get(1)) * 12) + calendar2.get(2)) - calendar.get(2)));
            } else if (calendarComponent == 5) {
                linkedHashMap.put(kotlin.coroutines.jvm.internal.b.f(5), kotlin.coroutines.jvm.internal.b.f((int) ((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / ((long) 86400000))));
            } else if (calendarComponent == 11) {
                linkedHashMap.put(kotlin.coroutines.jvm.internal.b.f(11), kotlin.coroutines.jvm.internal.b.f((int) (((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / ((long) 3600000)) % ((long) 24))));
            } else if (calendarComponent == 12) {
                linkedHashMap.put(kotlin.coroutines.jvm.internal.b.f(12), kotlin.coroutines.jvm.internal.b.f((int) (((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / ((long) 60000)) % ((long) 60))));
            }
            return computedPropertyRequest.getType().dateComponent(linkedHashMap);
        } catch (Throwable th2) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.coreData, "Error getting last saved event from Room database.", null, th2, 8, null);
            return null;
        }
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final void save(@NotNull TriggerRuleOccurrence triggerRuleOccurrence, @Nullable Function1<? super ManagedTriggerRuleOccurrence, Unit> function1) {
        Intrinsics.checkNotNullParameter(triggerRuleOccurrence, "triggerRuleOccurrence");
        k.f(this, null, null, new C27361(triggerRuleOccurrence, this, function1, null), 3, null);
    }

    public final void saveEventData(@NotNull EventData eventData, @Nullable Function1<? super ManagedEventData, Unit> function1) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        k.f(this, null, null, new C27371(eventData, this, function1, null), 3, null);
    }
}
