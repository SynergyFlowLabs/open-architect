package com.planner5d.library.project.interactor;

import com.planner5d.library.database.model.AutoStyle;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements pd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.database.manager.a f223894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n0 f223895b;

    /* JADX INFO: renamed from: com.planner5d.library.project.interactor.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.interactor.GetAutoStyleInteractor$getAutoStyle$2", f = "GetAutoStyleInteractor.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    static final class C1657a extends o implements Function2<s0, kotlin.coroutines.d<? super AutoStyle>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223896a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f223898c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1657a(long j10, kotlin.coroutines.d<? super C1657a> dVar) {
            super(2, dVar);
            this.f223898c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C1657a(this.f223898c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223896a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.database.manager.a aVar = a.this.f223894a;
            long j10 = this.f223898c;
            this.f223896a = 1;
            Object objC = aVar.c(j10, this);
            return objC == objL ? objL : objC;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super AutoStyle> dVar) {
            return ((C1657a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a(@NotNull com.planner5d.library.database.manager.a databaseManager) {
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        this.f223894a = databaseManager;
        this.f223895b = s.f229729a.h();
    }

    @Override // pd.a
    @Nullable
    public Object a(long j10, @NotNull kotlin.coroutines.d<? super AutoStyle> dVar) {
        return i.h(this.f223895b, new C1657a(j10, null), dVar);
    }
}
