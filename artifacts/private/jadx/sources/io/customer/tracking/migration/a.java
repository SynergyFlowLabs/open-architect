package io.customer.tracking.migration;

import ih.e;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final b f288633f = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.customer.tracking.migration.b f288634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ph.a f288635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.customer.tracking.migration.queue.b f288636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final e f288637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final s0 f288638e;

    /* JADX INFO: renamed from: io.customer.tracking.migration.a$a, reason: collision with other inner class name */
    @f(c = "io.customer.tracking.migration.MigrationAssistant$1", f = "MigrationAssistant.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    static final class C1965a extends o implements Function2<s0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f288639a;

        C1965a(d<? super C1965a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return a.this.new C1965a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f288639a;
            if (i10 == 0) {
                ResultKt.m(obj);
                e.a.a(a.this.f288637d, "Migrating existing token and profile...", null, 2, null);
                a.this.e();
                a.this.f();
                e.a.a(a.this.f288637d, "Requesting migration queue to run...", null, 2, null);
                io.customer.tracking.migration.queue.b bVar = a.this.f288636c;
                this.f288639a = 1;
                if (bVar.a(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            e.a.a(a.this.f288637d, "Migration completed successfully", null, 2, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C1965a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a(@NotNull io.customer.tracking.migration.b migrationProcessor, @NotNull String migrationSiteId) {
            Intrinsics.checkNotNullParameter(migrationProcessor, "migrationProcessor");
            Intrinsics.checkNotNullParameter(migrationSiteId, "migrationSiteId");
            return new a(migrationProcessor, migrationSiteId, null, 4, null);
        }

        private b() {
        }
    }

    public a(@NotNull io.customer.tracking.migration.b migrationProcessor, @NotNull String migrationSiteId, @NotNull nh.a migrationSDKComponent) {
        Intrinsics.checkNotNullParameter(migrationProcessor, "migrationProcessor");
        Intrinsics.checkNotNullParameter(migrationSiteId, "migrationSiteId");
        Intrinsics.checkNotNullParameter(migrationSDKComponent, "migrationSDKComponent");
        this.f288634a = migrationProcessor;
        this.f288635b = migrationSDKComponent.C();
        this.f288636c = migrationSDKComponent.x();
        e eVarW = eh.d.f274883c.w();
        this.f288637d = eVarW;
        s0 s0VarV = migrationSDKComponent.v();
        this.f288638e = s0VarV;
        e.a.a(eVarW, "Starting migration tracking data...", null, 2, null);
        k.f(s0VarV, null, null, new C1965a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        String strB = this.f288635b.b();
        if (strB != null && Result.h(this.f288634a.b(strB))) {
            this.f288635b.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        String strA = this.f288635b.a();
        if (strA == null) {
            return;
        }
        e.a.a(this.f288637d, "Migrating existing profile with identifier: " + strA, null, 2, null);
        if (Result.h(this.f288634a.c(strA))) {
            this.f288635b.f(strA);
        }
    }

    public /* synthetic */ a(io.customer.tracking.migration.b bVar, String str, nh.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        io.customer.tracking.migration.b bVar2;
        String str2;
        if ((i10 & 4) != 0) {
            bVar2 = bVar;
            str2 = str;
            aVar = new nh.a(null, bVar2, str2, 1, null);
        } else {
            bVar2 = bVar;
            str2 = str;
        }
        this(bVar2, str2, aVar);
    }
}
