package com.planner5d.library.activity.fragment.dialog.purchase;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nProductListFetching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListFetching.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/ProductListFetching\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n37#2,2:69\n1#3:71\n*S KotlinDebug\n*F\n+ 1 ProductListFetching.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/ProductListFetching\n*L\n53#1:69,2\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f132501h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.application.b> f132502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f132503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.j f132504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fd.k f132505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<v> f132506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f132507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final k0<e> f132508g;

    @w0(parameters = 0)
    @ij.f
    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f132509f = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final fg.e<com.planner5d.library.application.b> f132510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.application.d f132511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.manager.payments.j f132512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final fg.e<v> f132513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.modules.user.user.t f132514e;

        @ij.a
        public a(@NotNull fg.e<com.planner5d.library.application.b> application, @NotNull com.planner5d.library.application.d applicationConfiguration, @NotNull com.planner5d.library.model.manager.payments.j paymentManager, @NotNull fg.e<v> statistics, @NotNull com.planner5d.library.modules.user.user.t userAuthorization) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(applicationConfiguration, "applicationConfiguration");
            Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
            Intrinsics.checkNotNullParameter(statistics, "statistics");
            Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
            this.f132510a = application;
            this.f132511b = applicationConfiguration;
            this.f132512c = paymentManager;
            this.f132513d = statistics;
            this.f132514e = userAuthorization;
        }

        @NotNull
        public final c a(@NotNull fd.k productType) {
            Intrinsics.checkNotNullParameter(productType, "productType");
            return new c(this.f132510a, this.f132511b, this.f132512c, productType, this.f132513d, this.f132514e);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.purchase.ProductListFetching", f = "ProductListFetching.kt", i = {0, 1, 2}, l = {47, 50, 52}, m = "update", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f132515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f132516b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f132518d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f132516b = obj;
            this.f132518d |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    public c(@NotNull fg.e<com.planner5d.library.application.b> application, @NotNull com.planner5d.library.application.d applicationConfiguration, @NotNull com.planner5d.library.model.manager.payments.j paymentManager, @NotNull fd.k productType, @NotNull fg.e<v> statistics, @NotNull com.planner5d.library.modules.user.user.t userAuthorization) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(applicationConfiguration, "applicationConfiguration");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(statistics, "statistics");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f132502a = application;
        this.f132503b = applicationConfiguration;
        this.f132504c = paymentManager;
        this.f132505d = productType;
        this.f132506e = statistics;
        this.f132507f = userAuthorization;
        this.f132508g = b1.a(new e(com.planner5d.library.activity.fragment.dialog.purchase.a.Loading, new fd.g[0], null, 4, null));
    }

    private final String a(Throwable th2) {
        String error;
        ErrorMessageException errorMessageExceptionExtract = ErrorMessageException.extract(th2);
        if (errorMessageExceptionExtract != null && (error = ErrorMessageException.getError((Context) this.f132502a.get(), errorMessageExceptionExtract)) != null) {
            return error;
        }
        if (th2 != null) {
            return th2.getMessage();
        }
        return null;
    }

    private static Object c(c cVar) {
        return j1.t(new c1(cVar, c.class, "internalFlow", "getInternalFlow()Lkotlinx/coroutines/flow/MutableStateFlow;", 0));
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<e> b() {
        return this.f132508g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c4, code lost:
    
        if (r15 == r1) goto L42;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.purchase.c.d(kotlin.coroutines.d):java.lang.Object");
    }
}
