package com.planner5d.library.dgenerator.interactor;

import com.planner5d.library.database.model.AutoStyleImage;
import com.planner5d.library.services.utility.s;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements nb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.database.manager.a f160421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n0 f160422b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.GetAutoStyleImagesInteractor$getAutoStyleImagesByStyle$2", f = "GetAutoStyleImagesInteractor.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<? extends AutoStyleImage>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160423a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f160425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f160426d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f160425c = j10;
            this.f160426d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new a(this.f160425c, this.f160426d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends AutoStyleImage>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super List<AutoStyleImage>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160423a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.database.manager.a aVar = e.this.f160421a;
            long j10 = this.f160425c;
            String str = this.f160426d;
            this.f160423a = 1;
            Object objD = aVar.d(j10, str, this);
            return objD == objL ? objL : objD;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super List<AutoStyleImage>> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public e(@NotNull com.planner5d.library.database.manager.a databaseManager) {
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        this.f160421a = databaseManager;
        this.f160422b = s.f229729a.h();
    }

    @Override // nb.c
    @Nullable
    public Object a(long j10, @NotNull String str, @NotNull kotlin.coroutines.d<? super List<AutoStyleImage>> dVar) {
        return kotlinx.coroutines.i.h(this.f160422b, new a(j10, str, null), dVar);
    }
}
