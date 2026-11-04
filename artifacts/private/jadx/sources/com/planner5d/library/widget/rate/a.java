package com.planner5d.library.widget.rate;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i0;
import com.planner5d.library.services.utility.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nHelperRate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperRate.kt\ncom/planner5d/library/widget/rate/HelperRate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,52:1\n1#2:53\n3829#3:54\n4344#3,2:55\n*S KotlinDebug\n*F\n+ 1 HelperRate.kt\ncom/planner5d/library/widget/rate/HelperRate\n*L\n46#1:54\n46#1:55,2\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f258643g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f258644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f258645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f258646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Boolean f258647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f258648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private List<? extends c> f258649f;

    /* JADX INFO: renamed from: com.planner5d.library.widget.rate.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.rate.HelperRate$setRated$2", f = "HelperRate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1748a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f258650a;

        C1748a(kotlin.coroutines.d<? super C1748a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C1748a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f258650a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Object obj2 = a.this.f258645b;
            a aVar = a.this;
            synchronized (obj2) {
                try {
                    aVar.f258647d = kotlin.coroutines.jvm.internal.b.a(true);
                    aVar.f258644a.f(r.rate, true);
                    unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1748a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a(@NotNull p preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f258644a = preferences;
        this.f258645b = new Object();
        this.f258646c = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m1
    private final List<c> e() {
        List list;
        synchronized (this.f258646c) {
            try {
                List list2 = this.f258649f;
                list = list2;
                if (list2 == null) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - i0.f225270g;
                    c[] cVarArrValues = c.values();
                    List arrayList = new ArrayList();
                    for (c cVar : cVarArrValues) {
                        if (this.f258644a.k(cVar.n(), 0L) > jCurrentTimeMillis) {
                            arrayList.add(cVar);
                        }
                    }
                    this.f258649f = arrayList;
                    list = arrayList;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    @m1
    public final boolean d(boolean z10, @NotNull c condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        if (!f() && !this.f258648e && z10) {
            List<c> listE = e();
            if (listE.size() < 2 && !listE.contains(condition)) {
                return true;
            }
        }
        return false;
    }

    @m1
    public final boolean f() {
        boolean zBooleanValue;
        synchronized (this.f258645b) {
            try {
                Boolean bool = this.f258647d;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    boolean zM = this.f258644a.m(r.rate, false);
                    this.f258647d = Boolean.valueOf(zM);
                    zBooleanValue = zM;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    @Nullable
    public final Object g(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(s.f229729a.h(), new C1748a(null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Nullable
    public final Object h(@NotNull c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f258648e = true;
        Object objR = this.f258644a.r(cVar.n(), System.currentTimeMillis(), dVar);
        return objR == kotlin.coroutines.intrinsics.b.l() ? objR : Unit.f312394a;
    }
}
