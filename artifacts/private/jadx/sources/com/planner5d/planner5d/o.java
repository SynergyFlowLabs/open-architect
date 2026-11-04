package com.planner5d.planner5d;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

/* JADX INFO: loaded from: classes13.dex */
@fg.h
public final class o {

    public static final class a implements com.planner5d.library.model.manager.synchronization.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.synchronization.i f264534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.contest.g f264535b;

        a(com.planner5d.library.model.manager.synchronization.i iVar, com.planner5d.library.model.manager.contest.g gVar) {
            this.f264534a = iVar;
            this.f264535b = gVar;
        }

        @Override // com.planner5d.library.model.manager.synchronization.k
        public void a() {
            this.f264534a.f(this.f264535b);
        }

        @Override // com.planner5d.library.model.manager.synchronization.k
        public com.planner5d.library.model.manager.synchronization.m b() {
            com.planner5d.library.model.manager.synchronization.m mVarI = this.f264534a.i(this.f264535b);
            Intrinsics.checkNotNullExpressionValue(mVarI, "getSynchronizationState(...)");
            return mVarI;
        }

        @Override // com.planner5d.library.model.manager.synchronization.k
        public Observable<Void> c(boolean z10) {
            Observable<Void> observableS = this.f264534a.s(null, z10);
            Intrinsics.checkNotNullExpressionValue(observableS, "synchronize(...)");
            return observableS;
        }

        @Override // com.planner5d.library.model.manager.synchronization.k
        public void d() {
            this.f264534a.w();
        }

        @Override // com.planner5d.library.model.manager.synchronization.k
        public void e() throws Throwable {
            this.f264534a.v();
        }

        @Override // com.planner5d.library.model.manager.synchronization.k
        public androidx.lifecycle.w0<Boolean> f() {
            androidx.lifecycle.w0<Boolean> w0VarJ = this.f264534a.j();
            Intrinsics.checkNotNullExpressionValue(w0VarJ, "inProgress(...)");
            return w0VarJ;
        }
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.synchronization.k a(@NotNull com.planner5d.library.model.manager.synchronization.i synchronizationManager, @NotNull com.planner5d.library.model.manager.contest.g contestManager) {
        Intrinsics.checkNotNullParameter(synchronizationManager, "synchronizationManager");
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        return new a(synchronizationManager, contestManager);
    }
}
