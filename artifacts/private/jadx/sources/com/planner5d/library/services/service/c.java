package com.planner5d.library.services.service;

import android.app.Service;
import androidx.annotation.w0;
import com.planner5d.library.services.utility.t;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@w0(35)
@SourceDebugExtension({"SMAP\nTimeoutForegroundServiceWatchdog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeoutForegroundServiceWatchdog.kt\ncom/planner5d/library/services/service/TimeoutForegroundServiceWatchdog\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n462#2:89\n412#2:90\n1246#3,4:91\n*S KotlinDebug\n*F\n+ 1 TimeoutForegroundServiceWatchdog.kt\ncom/planner5d/library/services/service/TimeoutForegroundServiceWatchdog\n*L\n40#1:89\n40#1:90\n40#1:91,4\n*E\n"})
public final class c implements com.planner5d.library.services.service.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final a f224966g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f224967h = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s0 f224968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f224969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<Service, b> f224970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<Service, p2> f224971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f224972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<Integer, Long> f224973f;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f224974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f224975b;

        public b(int i10, int i11) {
            this.f224974a = i10;
            this.f224975b = i11;
        }

        public final int a() {
            return this.f224975b;
        }

        public final int b() {
            return this.f224974a;
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.services.service.c$c, reason: collision with other inner class name */
    @f(c = "com.planner5d.library.services.service.TimeoutForegroundServiceWatchdog$onBackground$1$1", f = "TimeoutForegroundServiceWatchdog.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    static final class C1683c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f224976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f224977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference<Service> f224978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f224979d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1683c(long j10, WeakReference<Service> weakReference, b bVar, kotlin.coroutines.d<? super C1683c> dVar) {
            super(2, dVar);
            this.f224977b = j10;
            this.f224978c = weakReference;
            this.f224979d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1683c(this.f224977b, this.f224978c, this.f224979d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f224976a;
            if (i10 == 0) {
                ResultKt.m(obj);
                long j10 = this.f224977b;
                this.f224976a = 1;
                if (d1.b(j10, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Service service = this.f224978c.get();
            if (service != null) {
                service.onTimeout(this.f224979d.b(), this.f224979d.a());
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1683c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public c(@NotNull s0 coroutineScope, @NotNull t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f224968a = coroutineScope;
        this.f224969b = coroutineDispatchers;
        this.f224970c = new WeakHashMap<>();
        this.f224971d = new WeakHashMap<>();
        this.f224972e = new Object();
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(1, Long.valueOf(TimeUnit.HOURS.toMillis(6L))));
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapMapOf.size()));
        for (Map.Entry entry : mapMapOf.entrySet()) {
            linkedHashMap.put(entry.getKey(), Long.valueOf(((Number) entry.getValue()).longValue() - f224967h));
        }
        this.f224973f = linkedHashMap;
    }

    @Override // com.planner5d.library.services.service.b
    public void a() {
        synchronized (this.f224972e) {
            try {
                Iterator<Service> it = this.f224971d.keySet().iterator();
                while (it.hasNext()) {
                    p2 p2VarRemove = this.f224971d.remove(it.next());
                    if (p2VarRemove != null) {
                        p2.a.b(p2VarRemove, null, 1, null);
                    }
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.services.service.b
    public void b() {
        synchronized (this.f224972e) {
            try {
                for (Map.Entry<Service, b> entry : this.f224970c.entrySet()) {
                    Service key = entry.getKey();
                    b value = entry.getValue();
                    WeakReference weakReference = new WeakReference(key);
                    Long l10 = this.f224973f.get(Integer.valueOf(value.a()));
                    if (l10 == null) {
                        break;
                    }
                    this.f224971d.put(key, k.f(this.f224968a, this.f224969b.a(), null, new C1683c(l10.longValue(), weakReference, value, null), 2, null));
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.services.service.b
    public void c(@NotNull Service service, int i10) {
        Intrinsics.checkNotNullParameter(service, "service");
        synchronized (this.f224972e) {
            this.f224970c.put(service, new b(i10, service.getForegroundServiceType()));
            p2 p2VarRemove = this.f224971d.remove(service);
            if (p2VarRemove != null) {
                p2.a.b(p2VarRemove, null, 1, null);
                Unit unit = Unit.f312394a;
            }
        }
    }

    @Override // com.planner5d.library.services.service.b
    public void d(@NotNull Service service) {
        Intrinsics.checkNotNullParameter(service, "service");
        synchronized (this.f224972e) {
            try {
                this.f224970c.remove(service);
                p2 p2VarRemove = this.f224971d.remove(service);
                if (p2VarRemove != null) {
                    p2.a.b(p2VarRemove, null, 1, null);
                    Unit unit = Unit.f312394a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
