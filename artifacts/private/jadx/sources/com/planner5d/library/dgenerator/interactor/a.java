package com.planner5d.library.dgenerator.interactor;

import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements nb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.database.manager.a f160409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n0 f160410b;

    /* JADX INFO: renamed from: com.planner5d.library.dgenerator.interactor.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.DeleteAutoStyleImagesInteractor$deleteAutoStyleImages$2", f = "DeleteAutoStyleImagesInteractor.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    static final class C1541a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160411a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f160413c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1541a(long j10, kotlin.coroutines.d<? super C1541a> dVar) {
            super(2, dVar);
            this.f160413c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C1541a(this.f160413c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160411a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.database.manager.a aVar = a.this.f160409a;
                long j10 = this.f160413c;
                this.f160411a = 1;
                if (aVar.b(j10, this) == objL) {
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
            return ((C1541a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a(@NotNull com.planner5d.library.database.manager.a databaseManager) {
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        this.f160409a = databaseManager;
        this.f160410b = s.f229729a.h();
    }

    @Override // nb.a
    @Nullable
    public Object a(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(this.f160410b, new C1541a(j10, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
