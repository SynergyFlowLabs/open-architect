package com.planner5d.library.services.download;

import android.app.Application;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.compose.runtime.internal.w0;
import androidx.core.app.c0;
import com.planner5d.library.model.u;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k3;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDownloadService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadService.kt\ncom/planner5d/library/services/download/DownloadService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
public final class DownloadService extends Service {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private static p2 f224238f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    public fg.e<com.planner5d.library.model.manager.k> f224241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.services.service.b f224242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    public fg.e<d> f224243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f224236d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f224237e = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Object f224239g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f224240h = TimeUnit.SECONDS.toMillis(20);

    @SourceDebugExtension({"SMAP\nDownloadService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadService.kt\ncom/planner5d/library/services/download/DownloadService$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,169:1\n1#2:170\n37#3,2:171\n*S KotlinDebug\n*F\n+ 1 DownloadService.kt\ncom/planner5d/library/services/download/DownloadService$Companion\n*L\n151#1:171,2\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: com.planner5d.library.services.download.DownloadService$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.download.DownloadService$Companion$requestStop$1$1", f = "DownloadService.kt", i = {0}, l = {101}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nDownloadService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadService.kt\ncom/planner5d/library/services/download/DownloadService$Companion$requestStop$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
        static final class C1670a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f224244a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f224245b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Application f224246c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f224247d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1670a(Application application, boolean z10, kotlin.coroutines.d<? super C1670a> dVar) {
                super(2, dVar);
                this.f224246c = application;
                this.f224247d = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C1670a c1670a = new C1670a(this.f224246c, this.f224247d, dVar);
                c1670a.f224245b = obj;
                return c1670a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                s0 s0Var;
                Unit unit;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f224244a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    s0 s0Var2 = (s0) this.f224245b;
                    long j10 = DownloadService.f224240h;
                    this.f224245b = s0Var2;
                    this.f224244a = 1;
                    if (d1.b(j10, this) == objL) {
                        return objL;
                    }
                    s0Var = s0Var2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s0Var = (s0) this.f224245b;
                    ResultKt.m(obj);
                }
                Object obj2 = DownloadService.f224239g;
                Application application = this.f224246c;
                boolean z10 = this.f224247d;
                synchronized (obj2) {
                    try {
                        t0.j(s0Var);
                        a aVar = DownloadService.f224236d;
                        Intent intent = new Intent(application, (Class<?>) DownloadService.class);
                        intent.putExtra(r.detach.f224891a, z10);
                        unit = Unit.f312394a;
                        aVar.e(application, intent, false);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return unit;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1670a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d() {
            synchronized (DownloadService.f224239g) {
                try {
                    p2 p2Var = DownloadService.f224238f;
                    if (p2Var != null) {
                        p2.a.b(p2Var, null, 1, null);
                    }
                    a aVar = DownloadService.f224236d;
                    DownloadService.f224238f = null;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(Context context, Intent intent, boolean z10) {
            try {
                if (z10) {
                    context.startForegroundService(intent);
                } else {
                    context.startService(intent);
                }
            } catch (IllegalStateException e10) {
                timber.log.b.f381052a.e(e10);
            }
        }

        private final void h() {
            com.planner5d.library.application.c cVarA = com.planner5d.library.application.b.f142455c.a();
            k3 k3Var = new k3(com.planner5d.library.f.s.K1, new Object[0]);
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            final com.planner5d.library.services.utility.c cVarN0 = cVarA.n0();
            if (cVarN0.a()) {
                listCreateListBuilder.add(new u.a(new k3(com.planner5d.library.f.s.et, k3Var), (Function0<Unit>) new Function0() { // from class: com.planner5d.library.services.download.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DownloadService.a.i(cVarN0);
                    }
                }));
            }
            listCreateListBuilder.add(u.f222819h);
            u.a[] aVarArr = (u.a[]) CollectionsKt.build(listCreateListBuilder).toArray(new u.a[0]);
            cVarA.F1().a(new u(u.c.Info, new k3(com.planner5d.library.f.s.BF, k3Var, k3Var), (u.a[]) Arrays.copyOf(aVarArr, aVarArr.length)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit i(com.planner5d.library.services.utility.c cVar) {
            cVar.b();
            return Unit.f312394a;
        }

        public final void f(@NotNull Context context, @NotNull Notification notification, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(notification, "notification");
            if (h3.J(context)) {
                if (z10) {
                    h();
                }
            } else {
                d();
                Intent intent = new Intent(context, (Class<?>) DownloadService.class);
                intent.putExtra(r.notification.f224891a, notification);
                Unit unit = Unit.f312394a;
                e(context, intent, true);
            }
        }

        public final void g(@NotNull Application context, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            synchronized (DownloadService.f224239g) {
                try {
                    if (DownloadService.f224238f != null) {
                        return;
                    }
                    com.planner5d.library.application.c cVarA = com.planner5d.library.application.b.f142455c.a();
                    a aVar = DownloadService.f224236d;
                    DownloadService.f224238f = kotlinx.coroutines.k.f(cVarA.m1(), cVarA.n().a(), null, new C1670a(context, z10, null), 2, null);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private a() {
        }
    }

    public DownloadService() {
        com.planner5d.library.application.b.f142455c.a().G(this);
    }

    @NotNull
    public final fg.e<com.planner5d.library.model.manager.k> e() {
        fg.e<com.planner5d.library.model.manager.k> eVar = this.f224241a;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crashReporter");
        return null;
    }

    @NotNull
    public final com.planner5d.library.services.service.b f() {
        com.planner5d.library.services.service.b bVar = this.f224242b;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("foregroundServiceWatchdog");
        return null;
    }

    @NotNull
    public final fg.e<d> g() {
        fg.e<d> eVar = this.f224243c;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("status");
        return null;
    }

    public final void h(@NotNull fg.e<com.planner5d.library.model.manager.k> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f224241a = eVar;
    }

    public final void i(@NotNull com.planner5d.library.services.service.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f224242b = bVar;
    }

    public final void j(@NotNull fg.e<d> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f224243c = eVar;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        e().get().c("DownloadService", "onDestroy()");
        f224236d.d();
        g().get().c(false);
        f().d(this);
        super.onDestroy();
    }

    @Override // android.app.Service
    @e.a({"MissingPermission"})
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        Notification notification;
        Boolean boolValueOf = null;
        if (intent != null) {
            r rVar = r.detach;
            Intent intent2 = intent.hasExtra(rVar.f224891a) ? intent : null;
            if (intent2 != null) {
                boolValueOf = Boolean.valueOf(intent2.getBooleanExtra(rVar.f224891a, false));
            }
        }
        int i12 = 2;
        if (boolValueOf != null) {
            if (boolValueOf.booleanValue()) {
                stopForeground(2);
                f().d(this);
            }
            stopSelf();
            return 2;
        }
        if (intent != null && (notification = (Notification) intent.getParcelableExtra(r.notification.f224891a)) != null) {
            i12 = 1;
            if (g().get().b(true)) {
                c0.q(getApplication()).F(6, notification);
            } else {
                startForeground(6, notification);
                f().c(this, i11);
            }
        }
        return i12;
    }

    public void onTimeout(int i10, int i11) {
        super.onTimeout(i10, i11);
        e().get().c("DownloadService", "onTimeout(Int, Int)");
        stopSelf();
    }
}
