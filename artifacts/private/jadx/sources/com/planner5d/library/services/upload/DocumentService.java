package com.planner5d.library.services.upload;

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
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.s;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDocumentService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentService.kt\ncom/planner5d/library/services/upload/DocumentService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class DocumentService extends Service {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private static p2 f224997f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f225000a = g0.c(new Function0() { // from class: com.planner5d.library.services.upload.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DocumentService.n();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f225001b = g0.c(new Function0() { // from class: com.planner5d.library.services.upload.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DocumentService.l();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f225002c = g0.c(new Function0() { // from class: com.planner5d.library.services.upload.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DocumentService.m();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f224995d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f224996e = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Object f224998g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f224999h = TimeUnit.SECONDS.toMillis(3);

    @SourceDebugExtension({"SMAP\nDocumentService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentService.kt\ncom/planner5d/library/services/upload/DocumentService$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,136:1\n1#2:137\n37#3,2:138\n*S KotlinDebug\n*F\n+ 1 DocumentService.kt\ncom/planner5d/library/services/upload/DocumentService$Companion\n*L\n127#1:138,2\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: com.planner5d.library.services.upload.DocumentService$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.upload.DocumentService$Companion$requestStop$1$1", f = "DocumentService.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nDocumentService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentService.kt\ncom/planner5d/library/services/upload/DocumentService$Companion$requestStop$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
        static final class C1684a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f225003a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Application f225004b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f225005c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1684a(Application application, boolean z10, kotlin.coroutines.d<? super C1684a> dVar) {
                super(2, dVar);
                this.f225004b = application;
                this.f225005c = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1684a(this.f225004b, this.f225005c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f225003a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    long j10 = DocumentService.f224999h;
                    this.f225003a = 1;
                    if (d1.b(j10, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                a aVar = DocumentService.f224995d;
                Application application = this.f225004b;
                Intent intent = new Intent(this.f225004b, (Class<?>) DocumentService.class);
                intent.putExtra(r.detach.f224891a, this.f225005c);
                Unit unit = Unit.f312394a;
                aVar.c(application, intent, false);
                return unit;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1684a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(Context context, Intent intent, boolean z10) {
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

        private final void f() {
            com.planner5d.library.application.c cVarA = com.planner5d.library.application.b.f142455c.a();
            k3 k3Var = new k3(com.planner5d.library.f.s.K1, new Object[0]);
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            final com.planner5d.library.services.utility.c cVarN0 = cVarA.n0();
            if (cVarN0.a()) {
                listCreateListBuilder.add(new u.a(new k3(com.planner5d.library.f.s.et, k3Var), (Function0<Unit>) new Function0() { // from class: com.planner5d.library.services.upload.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DocumentService.a.g(cVarN0);
                    }
                }));
            }
            listCreateListBuilder.add(u.f222819h);
            u.a[] aVarArr = (u.a[]) CollectionsKt.build(listCreateListBuilder).toArray(new u.a[0]);
            cVarA.F1().a(new u(u.c.Info, new k3(com.planner5d.library.f.s.BF, k3Var, k3Var), (u.a[]) Arrays.copyOf(aVarArr, aVarArr.length)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(com.planner5d.library.services.utility.c cVar) {
            cVar.b();
            return Unit.f312394a;
        }

        public final void d(@NotNull Context context, @NotNull Notification notification, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(notification, "notification");
            if (h3.J(context)) {
                if (z10) {
                    f();
                    return;
                }
                return;
            }
            synchronized (DocumentService.f224998g) {
                try {
                    p2 p2Var = DocumentService.f224997f;
                    if (p2Var != null) {
                        p2.a.b(p2Var, null, 1, null);
                    }
                    a aVar = DocumentService.f224995d;
                    DocumentService.f224997f = null;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intent intent = new Intent(context, (Class<?>) DocumentService.class);
            intent.putExtra(r.notification.f224891a, notification);
            c(context, intent, true);
        }

        public final void e(@NotNull Application context, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            synchronized (DocumentService.f224998g) {
                try {
                    if (DocumentService.f224997f == null) {
                        a aVar = DocumentService.f224995d;
                        DocumentService.f224997f = k.f(com.planner5d.library.application.b.f142455c.a().m1(), null, null, new C1684a(context, z10, null), 3, null);
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.upload.DocumentService$onStartCommand$1$1$1", f = "DocumentService.kt", i = {}, l = {50, 52}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f225006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f225007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DocumentService f225008c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.planner5d.library.database.model.spaces.documents.a aVar, DocumentService documentService, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f225007b = aVar;
            this.f225008c = documentService;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f225007b, this.f225008c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        
            if (r6.o1(r1, r5) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        
            if (r6.q0(r1, r5) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r4 = 4
                int r1 = r5.f225006a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L10
                goto L1a
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "/oseter//inoo/ebvllcinutefew //o/rcita/uh ske  o rm"
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                kotlin.ResultKt.m(r6)
                r4 = 7
                goto L6c
            L1f:
                kotlin.ResultKt.m(r6)
                com.planner5d.library.database.model.spaces.documents.a r6 = r5.f225007b
                r4 = 1
                boolean r6 = r6.r()
                if (r6 != 0) goto L47
                com.planner5d.library.database.model.spaces.documents.a r6 = r5.f225007b
                r4 = 1
                boolean r6 = r6.u()
                if (r6 == 0) goto L47
                r4 = 3
                com.planner5d.library.services.upload.DocumentService r6 = r5.f225008c
                com.planner5d.library.model.manager.spaces.documents.c r6 = com.planner5d.library.services.upload.DocumentService.e(r6)
                com.planner5d.library.database.model.spaces.documents.a r1 = r5.f225007b
                r5.f225006a = r3
                java.lang.Object r5 = r6.o1(r1, r5)
                r4 = 1
                if (r5 != r0) goto L6c
                goto L6b
            L47:
                r4 = 5
                com.planner5d.library.database.model.spaces.documents.a r6 = r5.f225007b
                boolean r6 = r6.p()
                if (r6 == 0) goto L59
                r4 = 0
                com.planner5d.library.database.model.spaces.documents.a r6 = r5.f225007b
                boolean r6 = r6.u()
                if (r6 != 0) goto L6c
            L59:
                com.planner5d.library.services.upload.DocumentService r6 = r5.f225008c
                com.planner5d.library.model.manager.spaces.documents.c r6 = com.planner5d.library.services.upload.DocumentService.e(r6)
                r4 = 5
                com.planner5d.library.database.model.spaces.documents.a r1 = r5.f225007b
                r5.f225006a = r2
                r4 = 0
                java.lang.Object r5 = r6.q0(r1, r5)
                if (r5 != r0) goto L6c
            L6b:
                return r0
            L6c:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.services.upload.DocumentService.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.model.manager.spaces.documents.c i() {
        return (com.planner5d.library.model.manager.spaces.documents.c) this.f225001b.getValue();
    }

    private final f1 j() {
        return (f1) this.f225002c.getValue();
    }

    private final g k() {
        return (g) this.f225000a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.model.manager.spaces.documents.c l() {
        return com.planner5d.library.application.b.f142455c.a().p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f1 m() {
        return com.planner5d.library.application.b.f142455c.a().m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g n() {
        return com.planner5d.library.application.b.f142455c.a().M();
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        k().e(false);
        super.onDestroy();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    @Override // android.app.Service
    @e.a({"MissingPermission"})
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        Boolean boolValueOf;
        Notification notification;
        if (intent != null) {
            r rVar = r.detach;
            Intent intent2 = intent.hasExtra(rVar.f224891a) ? intent : null;
            if (intent2 != null) {
                boolValueOf = Boolean.valueOf(intent2.getBooleanExtra(rVar.f224891a, false));
            } else {
                boolValueOf = null;
            }
        } else {
            boolValueOf = null;
        }
        int i12 = 2;
        if (boolValueOf != null) {
            if (boolValueOf.booleanValue()) {
                stopForeground(2);
            }
            stopSelf();
            return 2;
        }
        if (intent != null && (notification = (Notification) intent.getParcelableExtra(r.notification.f224891a)) != null) {
            i12 = 1;
            if (k().c(true)) {
                c0.q(getApplication()).F(8, notification);
            } else {
                startForeground(8, notification);
            }
            com.planner5d.library.database.model.spaces.documents.a aVarA = k().a();
            if (aVarA != null) {
                k.f(j(), s.f229729a.h(), null, new b(aVarA, this, null), 2, null);
            }
        }
        return i12;
    }
}
