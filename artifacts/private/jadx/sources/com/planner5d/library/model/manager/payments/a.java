package com.planner5d.library.model.manager.payments;

import androidx.annotation.m1;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@kotlin.l(message = "Only for back compatibility, should be removed in future")
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f192254a;

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.payments.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.payments.BlockingPaymentsRepository$verifyLicense$1", f = "BlockingPaymentsRepository.kt", i = {}, l = {14}, m = "invokeSuspend", n = {}, s = {})
    static final class C1599a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192255a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f192257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f192258d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f192259e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1599a(String str, String str2, String str3, kotlin.coroutines.d<? super C1599a> dVar) {
            super(2, dVar);
            this.f192257c = str;
            this.f192258d = str2;
            this.f192259e = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C1599a(this.f192257c, this.f192258d, this.f192259e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws ErrorMessageException, JSONException {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f192255a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            p pVar = a.this.f192254a;
            String str = this.f192257c;
            String str2 = this.f192258d;
            String str3 = this.f192259e;
            this.f192255a = 1;
            Object objW = pVar.W(str, str2, str3, this);
            return objW == objL ? objL : objW;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((C1599a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public a(@NotNull p paymentsRepository) {
        Intrinsics.checkNotNullParameter(paymentsRepository, "paymentsRepository");
        this.f192254a = paymentsRepository;
    }

    @m1
    public final boolean b(@Nullable String str, @Nullable String str2, @Nullable String str3) throws ErrorMessageException, JSONException {
        return ((Boolean) c0.t(c0.f225068a, null, false, new C1599a(str, str2, str3, null), 3, null)).booleanValue();
    }
}
