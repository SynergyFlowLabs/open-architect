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
public final class c implements nb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.database.manager.a f160415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n0 f160416b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.DeleteAutoStyleInteractor$deleteAutoStyle$2", f = "DeleteAutoStyleInteractor.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160417a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f160419c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f160419c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new a(this.f160419c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160417a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.database.manager.a aVar = c.this.f160415a;
                long j10 = this.f160419c;
                this.f160417a = 1;
                if (aVar.a(j10, this) == objL) {
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
    public c(@NotNull com.planner5d.library.database.manager.a databaseManager) {
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        this.f160415a = databaseManager;
        this.f160416b = s.f229729a.h();
    }

    @Override // nb.b
    @Nullable
    public Object a(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(this.f160416b, new a(j10, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
