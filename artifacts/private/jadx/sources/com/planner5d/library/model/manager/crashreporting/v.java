package com.planner5d.library.model.manager.crashreporting;

import androidx.compose.runtime.internal.w0;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.planner5d.library.model.manager.c1;
import com.planner5d.library.model.manager.x1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
public final class v implements x1, n, com.planner5d.library.model.manager.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f191228g = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final sd.b f191229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f191230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<c1> f191231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.t> f191232f;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.crashreporting.FirebaseCrashReportingBackend$initialize$2", f = "FirebaseCrashReportingBackend.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191233a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(v vVar, FirebaseCrashlytics firebaseCrashlytics) {
            firebaseCrashlytics.setCrashlyticsCollectionEnabled(true);
            vVar.setUserId(((com.planner5d.library.modules.user.user.t) vVar.f191232f.get()).e());
            firebaseCrashlytics.setCustomKey(n.a.f191216c, vVar.f191230d.Q(com.planner5d.library.model.manager.builtin.i.a.Active));
            vVar.h(((c1) vVar.f191231e.get()).b());
            firebaseCrashlytics.setCustomKey("debug", false);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f191233a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            final v vVar = v.this;
            vVar.z(new Function1() { // from class: com.planner5d.library.model.manager.crashreporting.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return v.a.m(vVar, (FirebaseCrashlytics) obj2);
                }
            });
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public v(@NotNull sd.b firebaseAvailability, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull fg.e<c1> installationManager, @NotNull fg.e<com.planner5d.library.modules.user.user.t> userAuthorization) {
        Intrinsics.checkNotNullParameter(firebaseAvailability, "firebaseAvailability");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f191229c = firebaseAvailability;
        this.f191230d = builtInDataManager;
        this.f191231e = installationManager;
        this.f191232f = userAuthorization;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(FirebaseCrashlytics updateFirebaseCrashlytics) {
        Intrinsics.checkNotNullParameter(updateFirebaseCrashlytics, "$this$updateFirebaseCrashlytics");
        updateFirebaseCrashlytics.setCrashlyticsCollectionEnabled(false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(String str, String str2, FirebaseCrashlytics updateFirebaseCrashlytics) {
        Intrinsics.checkNotNullParameter(updateFirebaseCrashlytics, "$this$updateFirebaseCrashlytics");
        updateFirebaseCrashlytics.log(str + "\n" + str2);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Throwable th2, FirebaseCrashlytics updateFirebaseCrashlytics) {
        Intrinsics.checkNotNullParameter(updateFirebaseCrashlytics, "$this$updateFirebaseCrashlytics");
        updateFirebaseCrashlytics.recordException(th2);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(String str, String str2, FirebaseCrashlytics updateFirebaseCrashlytics) {
        Intrinsics.checkNotNullParameter(updateFirebaseCrashlytics, "$this$updateFirebaseCrashlytics");
        updateFirebaseCrashlytics.setCustomKey(str, str2);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(String str, FirebaseCrashlytics updateFirebaseCrashlytics) {
        Intrinsics.checkNotNullParameter(updateFirebaseCrashlytics, "$this$updateFirebaseCrashlytics");
        updateFirebaseCrashlytics.setCustomKey(n.a.f191217d, str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(long j10, FirebaseCrashlytics updateFirebaseCrashlytics) {
        Intrinsics.checkNotNullParameter(updateFirebaseCrashlytics, "$this$updateFirebaseCrashlytics");
        updateFirebaseCrashlytics.setUserId(String.valueOf(j10));
        updateFirebaseCrashlytics.setCustomKey("user_id", j10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(Function1<? super FirebaseCrashlytics, Unit> function1) {
        if (this.f191229c.c()) {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
            function1.invoke(firebaseCrashlytics);
        }
    }

    @Override // com.planner5d.library.model.manager.crashreporting.n
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new a(null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.crashreporting.n, com.planner5d.library.model.manager.k
    @androidx.annotation.d
    public void b(@NotNull final Throwable throwable, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        z(new Function1() { // from class: com.planner5d.library.model.manager.crashreporting.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.v(throwable, (FirebaseCrashlytics) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.crashreporting.n, com.planner5d.library.model.manager.k
    @androidx.annotation.d
    public void c(@Nullable final String str, @Nullable final String str2) {
        if (str == null && str2 == null) {
            return;
        }
        z(new Function1() { // from class: com.planner5d.library.model.manager.crashreporting.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.u(str, str2, (FirebaseCrashlytics) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.crashreporting.n
    @androidx.annotation.d
    public void clear() {
        z(new Function1() { // from class: com.planner5d.library.model.manager.crashreporting.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.t((FirebaseCrashlytics) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.k
    @androidx.annotation.d
    public void d(@NotNull final String key, @NotNull final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        z(new Function1() { // from class: com.planner5d.library.model.manager.crashreporting.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.w(key, value, (FirebaseCrashlytics) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.k
    @androidx.annotation.d
    public void f(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        b(throwable, null, null);
    }

    @Override // com.planner5d.library.model.manager.crashreporting.n
    @androidx.annotation.d
    public void h(@NotNull final String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        z(new Function1() { // from class: com.planner5d.library.model.manager.crashreporting.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.x(hash, (FirebaseCrashlytics) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.crashreporting.n
    @androidx.annotation.d
    public void setUserId(final long j10) {
        z(new Function1() { // from class: com.planner5d.library.model.manager.crashreporting.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.y(j10, (FirebaseCrashlytics) obj);
            }
        });
    }
}
