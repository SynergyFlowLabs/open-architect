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
public final class g implements pd.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.database.manager.a f223927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n0 f223928b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.interactor.SaveAutoStyleInteractor$saveAutoStyle$2", f = "SaveAutoStyleInteractor.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223929a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AutoStyle f223931c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AutoStyle autoStyle, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f223931c = autoStyle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new a(this.f223931c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223929a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.database.manager.a aVar = g.this.f223927a;
            AutoStyle autoStyle = this.f223931c;
            this.f223929a = 1;
            Object objJ = aVar.j(autoStyle, this);
            return objJ == objL ? objL : objJ;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public g(@NotNull com.planner5d.library.database.manager.a databaseManager) {
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        this.f223927a = databaseManager;
        this.f223928b = s.f229729a.h();
    }

    @Override // pd.e
    @Nullable
    public Object a(@NotNull AutoStyle autoStyle, @NotNull kotlin.coroutines.d<? super Long> dVar) {
        return i.h(this.f223928b, new a(autoStyle, null), dVar);
    }
}
