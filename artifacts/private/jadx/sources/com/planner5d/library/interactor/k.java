package com.planner5d.library.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.f1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class k implements le.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f180187e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<t1> f180188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.managedfiles.a0> f180189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.z f180190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f1 f180191d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.InitializeFileManagerInteractor$initialize$1", f = "InitializeFileManagerInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180192a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.d f180194c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.planner5d.library.model.d dVar, kotlin.coroutines.d<? super a> dVar2) {
            super(2, dVar2);
            this.f180194c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k.this.new a(this.f180194c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f180192a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                ((com.planner5d.library.model.manager.managedfiles.a0) k.this.f180189b.get()).k(this.f180194c, k.this.f180190c.a(com.planner5d.library.model.manager.builtin.i.C));
            } catch (Throwable th2) {
                ((t1) k.this.f180188a.get()).b("file_manager_initialize", "onError failed", th2);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public k(@NotNull fg.e<t1> logRecordManager, @NotNull fg.e<com.planner5d.library.model.manager.managedfiles.a0> managedFileManager, @NotNull com.planner5d.library.services.z privateFiles, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(managedFileManager, "managedFileManager");
        Intrinsics.checkNotNullParameter(privateFiles, "privateFiles");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f180188a = logRecordManager;
        this.f180189b = managedFileManager;
        this.f180190c = privateFiles;
        this.f180191d = coroutineScope;
    }

    @Override // le.f
    public void a(@NotNull com.planner5d.library.model.d datafileBuiltIn) {
        Intrinsics.checkNotNullParameter(datafileBuiltIn, "datafileBuiltIn");
        kotlinx.coroutines.k.f(this.f180191d, com.planner5d.library.services.utility.s.f229729a.d(), null, new a(datafileBuiltIn, null), 2, null);
    }
}
