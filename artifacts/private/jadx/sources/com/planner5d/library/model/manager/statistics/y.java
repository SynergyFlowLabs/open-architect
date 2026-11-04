package com.planner5d.library.model.manager.statistics;

import android.app.Activity;
import android.content.Intent;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.statistics.events.h3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nStatisticsBackends.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsBackends.kt\ncom/planner5d/library/model/manager/statistics/StatisticsBackends\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,48:1\n774#2:49\n865#2,2:50\n37#3,2:52\n13409#4,2:54\n*S KotlinDebug\n*F\n+ 1 StatisticsBackends.kt\ncom/planner5d/library/model/manager/statistics/StatisticsBackends\n*L\n10#1:49\n10#1:50,2\n10#1:52,2\n42#1:54,2\n*E\n"})
public class y implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f222157b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m[] f222158a;

    public y(@NotNull List<? extends m> backends) {
        Intrinsics.checkNotNullParameter(backends, "backends");
        ArrayList arrayList = new ArrayList();
        for (Object obj : backends) {
            if (((m) obj).isEnabled()) {
                arrayList.add(obj);
            }
        }
        this.f222158a = (m[]) arrayList.toArray(new m[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Activity activity, m execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.f(activity);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(Intent intent, m execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.c(intent);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(Activity activity, m execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.k(activity);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(Activity activity, m execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.i(activity);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(m execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.m();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(m execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.a();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(h3 h3Var, m execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.d(h3Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(Activity activity, j jVar, String str, String str2, m execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.g(activity, jVar, str, str2);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(String str, m execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.h(str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(g0 g0Var, m execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.b(g0Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Activity activity, m execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.e(activity);
        return Unit.f312394a;
    }

    private final void z(Function1<? super m, Unit> function1) {
        for (m mVar : this.f222158a) {
            function1.invoke(mVar);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Object A() {
        Result.a aVar = Result.Companion;
        return Result.m785constructorimpl(ResultKt.createFailure(new Exception("Not supported")));
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void a() {
        z(new Function1() { // from class: com.planner5d.library.model.manager.statistics.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.H((m) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void b(@NotNull final g0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        z(new Function1() { // from class: com.planner5d.library.model.manager.statistics.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.L(user, (m) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void c(@NotNull final Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        z(new Function1() { // from class: com.planner5d.library.model.manager.statistics.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.D(intent, (m) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void d(@NotNull final h3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        z(new Function1() { // from class: com.planner5d.library.model.manager.statistics.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.I(event, (m) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void e(@Nullable final Activity activity) {
        z(new Function1() { // from class: com.planner5d.library.model.manager.statistics.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.x(activity, (m) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void f(@Nullable final Activity activity) {
        z(new Function1() { // from class: com.planner5d.library.model.manager.statistics.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.C(activity, (m) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void g(@Nullable final Activity activity, @NotNull final j purchase, @NotNull final String paymentMethod, @NotNull final String placement) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(placement, "placement");
        z(new Function1() { // from class: com.planner5d.library.model.manager.statistics.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.J(activity, purchase, paymentMethod, placement, (m) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void h(@NotNull final String screenName) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        z(new Function1() { // from class: com.planner5d.library.model.manager.statistics.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.K(screenName, (m) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void i(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        z(new Function1() { // from class: com.planner5d.library.model.manager.statistics.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.F(activity, (m) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public boolean isEnabled() {
        return true;
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void k(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        z(new Function1() { // from class: com.planner5d.library.model.manager.statistics.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.E(activity, (m) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void m() {
        z(new Function1() { // from class: com.planner5d.library.model.manager.statistics.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.G((m) obj);
            }
        });
    }

    public final boolean y(@NotNull m backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        return ArraysKt.contains(this.f222158a, backend);
    }
}
