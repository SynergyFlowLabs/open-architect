package com.planner5d.library.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.services.utility.f1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class u implements le.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f180282c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f180283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f1 f180284b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.ProjectInstantInteractor$getInstantAsync$1$1", f = "ProjectInstantInteractor.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180285a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f180287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ le.j.a f180288d;

        /* JADX INFO: renamed from: com.planner5d.library.interactor.u$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.ProjectInstantInteractor$getInstantAsync$1$1$1", f = "ProjectInstantInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1563a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f180289a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ le.j.a f180290b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Project f180291c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1563a(le.j.a aVar, Project project, kotlin.coroutines.d<? super C1563a> dVar) {
                super(2, dVar);
                this.f180290b = aVar;
                this.f180291c = project;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1563a(this.f180290b, this.f180291c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f180289a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f180290b.a(this.f180291c);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1563a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Long l10, le.j.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f180287c = l10;
            this.f180288d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u.this.new a(this.f180287c, this.f180288d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f180285a;
            if (i10 == 0) {
                ResultKt.m(obj);
                Project projectZ = u.this.f180283a.Z(this.f180287c.longValue());
                a3 a3VarA = com.planner5d.library.services.utility.s.f229729a.a();
                C1563a c1563a = new C1563a(this.f180288d, projectZ, null);
                this.f180285a = 1;
                if (kotlinx.coroutines.i.h(a3VarA, c1563a, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public u(@NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f180283a = projectManager;
        this.f180284b = coroutineScope;
    }

    @Override // le.j
    public void a(@Nullable Long l10, @NotNull le.j.a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (l10 == null || kotlinx.coroutines.k.f(this.f180284b, com.planner5d.library.services.utility.s.f229729a.d(), null, new a(l10, callback, null), 2, null) == null) {
            callback.a(null);
            Unit unit = Unit.f312394a;
        }
    }
}
