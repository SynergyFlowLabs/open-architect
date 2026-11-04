package com.planner5d.library.activity.fragment.profile;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.managedfiles.a0;
import com.planner5d.library.services.utility.f1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f134513d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a0 f134514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f1 f134515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<com.planner5d.library.model.manager.managedfiles.v> f134516c;

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.profile.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.DownloadFilesViewModel$1", f = "DownloadFilesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1476a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134517a;

        C1476a(kotlin.coroutines.d<? super C1476a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C1476a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134517a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            a.this.f134514a.t();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1476a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.DownloadFilesViewModel$startDownload$1", f = "DownloadFilesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134519a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134519a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            a0 a0Var = a.this.f134514a;
            a0Var.o(2);
            a0Var.e(false);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.DownloadFilesViewModel$stopDownload$1", f = "DownloadFilesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134521a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134521a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            a0 a0Var = a.this.f134514a;
            a0Var.o(0);
            a0Var.q();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a(@NotNull a0 managedFileManager, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(managedFileManager, "managedFileManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f134514a = managedFileManager;
        this.f134515b = coroutineScope;
        this.f134516c = managedFileManager.j();
        com.planner5d.library.services.utility.s sVar = com.planner5d.library.services.utility.s.f229729a;
        int i10 = 2 ^ 2;
        kotlinx.coroutines.k.f(coroutineScope, c(), null, new C1476a(null), 2, null);
    }

    private final n0 c() {
        return com.planner5d.library.services.utility.s.f229729a.h();
    }

    private static Object d(a aVar) {
        return j1.t(new c1(com.planner5d.library.services.utility.s.f229729a, com.planner5d.library.services.utility.s.class, "DispatcherBackground", "getDispatcherBackground()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", 0));
    }

    @NotNull
    public final androidx.lifecycle.w0<com.planner5d.library.model.manager.managedfiles.v> b() {
        return this.f134516c;
    }

    public final void e() {
        kotlinx.coroutines.k.f(this.f134515b, c(), null, new b(null), 2, null);
    }

    public final void f() {
        kotlinx.coroutines.k.f(this.f134515b, c(), null, new c(null), 2, null);
    }
}
