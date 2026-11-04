package com.planner5d.library.services.notification;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.l0;
import androidx.compose.runtime.internal.w0;
import androidx.core.app.w;
import com.planner5d.library.activity.Main;
import com.planner5d.library.model.manager.i;
import com.planner5d.library.model.manager.j2;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.s;
import fg.e;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
public abstract class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f224465f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f224466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j2 f224467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final e<i> f224468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f1 f224469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Long f224470e;

    /* JADX INFO: renamed from: com.planner5d.library.services.notification.a$a, reason: collision with other inner class name */
    @f(c = "com.planner5d.library.services.notification.Notification$navigateAndConsume$1", f = "Notification.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    static final class C1676a extends o implements Function2<s0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f224471a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f224473c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1676a(long j10, d<? super C1676a> dVar) {
            super(2, dVar);
            this.f224473c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return a.this.new C1676a(this.f224473c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f224471a;
            int i11 = 6 | 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                i iVar = (i) a.this.f224468c.get();
                long j10 = this.f224473c;
                int iF = a.this.f();
                this.f224471a = 1;
                if (iVar.n(j10, iF, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C1676a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @f(c = "com.planner5d.library.services.notification.Notification$onNewIntent$1", f = "Notification.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f224474a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f224476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Intent f224477d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, Intent intent, d<? super b> dVar) {
            super(2, dVar);
            this.f224476c = j10;
            this.f224477d = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return a.this.new b(this.f224476c, this.f224477d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f224474a;
            if (i10 == 0) {
                ResultKt.m(obj);
                i iVar = (i) a.this.f224468c.get();
                long j10 = this.f224476c;
                int iF = a.this.f();
                this.f224474a = 1;
                obj = iVar.m(j10, iF, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                timber.log.b.f381052a.a("Intent " + this.f224476c + " is consumed", new Object[0]);
            } else {
                a.this.i(this.f224476c, this.f224477d);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public a(@NotNull com.planner5d.library.application.b application, @NotNull j2 notificationManager, @NotNull e<i> consumableIntentRepository, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        Intrinsics.checkNotNullParameter(consumableIntentRepository, "consumableIntentRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f224466a = application;
        this.f224467b = notificationManager;
        this.f224468c = consumableIntentRepository;
        this.f224469d = coroutineScope;
    }

    private final PendingIntent b(long j10, Function1<? super Intent, Unit> function1) {
        com.planner5d.library.application.b bVar = this.f224466a;
        int iF = f();
        Intent intent = new Intent(this.f224466a, (Class<?>) Main.class);
        intent.addFlags(536870912);
        intent.putExtra(g().f224891a, j10);
        if (function1 != null) {
            function1.invoke(intent);
        }
        Unit unit = Unit.f312394a;
        return PendingIntent.getActivity(bVar, iF, intent, 201326592);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ w.n d(a aVar, long j10, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createNotificationBuilder");
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        return aVar.c(j10, function1);
    }

    @NotNull
    protected w.n c(long j10, @Nullable Function1<? super Intent, Unit> function1) {
        w.n nVarM = this.f224467b.b(e()).M(b(j10, function1));
        Intrinsics.checkNotNullExpressionValue(nVarM, "setContentIntent(...)");
        return nVarM;
    }

    @NotNull
    protected abstract j2.a e();

    protected abstract int f();

    @NotNull
    protected abstract r g();

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final Long h() {
        return this.f224470e;
    }

    @l0
    protected void i(long j10, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        timber.log.b.f381052a.a("Intent navigateAndConsume " + j10, new Object[0]);
        k.f(this.f224469d, s.f229729a.a(), null, new C1676a(j10, null), 2, null);
        if (this.f224470e == null) {
            this.f224467b.a(f());
        }
    }

    @l0
    public final void j(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent.hasExtra(g().f224891a)) {
            k.f(this.f224469d, s.f229729a.a(), null, new b(intent.getLongExtra(g().f224891a, 1L), intent, null), 2, null);
        }
    }

    protected final void k(@Nullable Long l10) {
        this.f224470e = l10;
    }
}
