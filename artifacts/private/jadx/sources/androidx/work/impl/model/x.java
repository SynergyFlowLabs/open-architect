package androidx.work.impl.model;

import androidx.work.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWorkSpecDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkSpecDao.kt\nandroidx/work/impl/model/WorkSpecDaoKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,522:1\n53#2:523\n55#2:527\n53#2:528\n55#2:532\n50#3:524\n55#3:526\n50#3:529\n55#3:531\n106#4:525\n106#4:530\n*S KotlinDebug\n*F\n+ 1 WorkSpecDao.kt\nandroidx/work/impl/model/WorkSpecDaoKt\n*L\n489#1:523\n489#1:527\n503#1:528\n503#1:532\n489#1:524\n489#1:526\n503#1:529\n503#1:531\n489#1:525\n503#1:530\n*E\n"})
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f77025a = "id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @org.intellij.lang.annotations.d("sql")
    @NotNull
    private static final String f77026b = "SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @org.intellij.lang.annotations.d("sql")
    @NotNull
    private static final String f77027c = "SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @org.intellij.lang.annotations.d("sql")
    @NotNull
    private static final String f77028d = "SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)";

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    public static final class a implements kotlinx.coroutines.flow.i<List<? extends l0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f77029a;

        /* JADX INFO: renamed from: androidx.work.impl.model.x$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WorkSpecDao.kt\nandroidx/work/impl/model/WorkSpecDaoKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n54#2:223\n503#3:224\n1549#4:225\n1620#4,3:226\n*S KotlinDebug\n*F\n+ 1 WorkSpecDao.kt\nandroidx/work/impl/model/WorkSpecDaoKt\n*L\n503#1:225\n503#1:226,3\n*E\n"})
        public static final class C0783a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f77030a;

            /* JADX INFO: renamed from: androidx.work.impl.model.x$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2", f = "WorkSpecDao.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class C0784a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f77031a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f77032b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f77033c;

                public C0784a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f77031a = obj;
                    this.f77032b |= Integer.MIN_VALUE;
                    return C0783a.this.emit(null, this);
                }
            }

            public C0783a(kotlinx.coroutines.flow.j jVar) {
                this.f77030a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0018  */
            @Override // kotlinx.coroutines.flow.j
            @Nullable
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0784a c0784a;
                if (dVar instanceof C0784a) {
                    c0784a = (C0784a) dVar;
                    int i10 = c0784a.f77032b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0784a.f77032b = i10 - Integer.MIN_VALUE;
                    } else {
                        c0784a = new C0784a(dVar);
                    }
                } else {
                    c0784a = new C0784a(dVar);
                }
                Object obj2 = c0784a.f77031a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c0784a.f77032b;
                if (i11 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.flow.j jVar = this.f77030a;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((v.c) it.next()).S());
                    }
                    c0784a.f77032b = 1;
                    if (jVar.emit(arrayList, c0784a) == objL) {
                        return objL;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj2);
                }
                return Unit.f312394a;
            }
        }

        public a(kotlinx.coroutines.flow.i iVar) {
            this.f77029a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j<? super List<? extends l0>> jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f77029a.collect(new C0783a(jVar), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    public static final class b implements kotlinx.coroutines.flow.i<l0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f77035a;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WorkSpecDao.kt\nandroidx/work/impl/model/WorkSpecDaoKt\n*L\n1#1,222:1\n54#2:223\n489#3:224\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f77036a;

            /* JADX INFO: renamed from: androidx.work.impl.model.x$b$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2", f = "WorkSpecDao.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class C0785a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f77037a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f77038b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f77039c;

                public C0785a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f77037a = obj;
                    this.f77038b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar) {
                this.f77036a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0015  */
            @Override // kotlinx.coroutines.flow.j
            @Nullable
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0785a c0785a;
                if (dVar instanceof C0785a) {
                    c0785a = (C0785a) dVar;
                    int i10 = c0785a.f77038b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0785a.f77038b = i10 - Integer.MIN_VALUE;
                    } else {
                        c0785a = new C0785a(dVar);
                    }
                } else {
                    c0785a = new C0785a(dVar);
                }
                Object obj2 = c0785a.f77037a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c0785a.f77038b;
                int i12 = 2 | 1;
                if (i11 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.flow.j jVar = this.f77036a;
                    v.c cVar = (v.c) CollectionsKt.firstOrNull((List) obj);
                    l0 l0VarS = cVar != null ? cVar.S() : null;
                    c0785a.f77038b = 1;
                    if (jVar.emit(l0VarS, c0785a) == objL) {
                        return objL;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj2);
                }
                return Unit.f312394a;
            }
        }

        public b(kotlinx.coroutines.flow.i iVar) {
            this.f77035a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j<? super l0> jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f77035a.collect(new a(jVar), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    @NotNull
    public static final kotlinx.coroutines.flow.i<List<l0>> a(@NotNull kotlinx.coroutines.flow.i<? extends List<v.c>> iVar, @NotNull n0 dispatcher) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.i0(new a(iVar)), dispatcher);
    }

    @NotNull
    public static final kotlinx.coroutines.flow.i<l0> b(@NotNull w wVar, @NotNull UUID id2) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
        return kotlinx.coroutines.flow.k.i0(new b(wVar.i(CollectionsKt.listOf(String.valueOf(id2)))));
    }

    @NotNull
    public static final kotlinx.coroutines.flow.i<List<l0>> c(@NotNull w wVar, @NotNull n0 dispatcher, @NotNull String name) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(name, "name");
        return a(wVar.P(name), dispatcher);
    }

    @NotNull
    public static final kotlinx.coroutines.flow.i<List<l0>> d(@NotNull w wVar, @NotNull n0 dispatcher, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return a(wVar.p(tag), dispatcher);
    }
}
