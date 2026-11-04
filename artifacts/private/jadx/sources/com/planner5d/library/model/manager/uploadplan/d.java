package com.planner5d.library.model.manager.uploadplan;

import androidx.compose.runtime.internal.w0;
import com.activeandroid.query.Select;
import com.activeandroid.util.TransactionUtils;
import com.planner5d.library.model.ai.CustomerSatisfactionIndex;
import com.planner5d.library.services.utility.s;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 1)
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f222335a = 0;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.uploadplan.CustomerSatisfactionIndexDatabaseRepository$fetchById$2", f = "CustomerSatisfactionIndexDatabaseRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super CustomerSatisfactionIndex>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f222337b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f222337b = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f222337b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f222336a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            List listExecute = new Select().from(CustomerSatisfactionIndex.class).where("project_external_id = ?", kotlin.coroutines.jvm.internal.b.g(this.f222337b)).execute();
            Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
            return CollectionsKt.firstOrNull(listExecute);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super CustomerSatisfactionIndex> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.uploadplan.CustomerSatisfactionIndexDatabaseRepository$store$2", f = "CustomerSatisfactionIndexDatabaseRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CustomerSatisfactionIndex f222339b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CustomerSatisfactionIndex customerSatisfactionIndex, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f222339b = customerSatisfactionIndex;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(CustomerSatisfactionIndex customerSatisfactionIndex) {
            customerSatisfactionIndex.save();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f222339b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f222338a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            final CustomerSatisfactionIndex customerSatisfactionIndex = this.f222339b;
            TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.uploadplan.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return d.b.m(customerSatisfactionIndex);
                }
            });
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public d() {
    }

    @Override // com.planner5d.library.model.manager.uploadplan.g
    @Nullable
    public Object b(long j10, @NotNull kotlin.coroutines.d<? super CustomerSatisfactionIndex> dVar) {
        return i.h(s.f229729a.d(), new a(j10, null), dVar);
    }

    @Override // com.planner5d.library.model.manager.uploadplan.g
    @Nullable
    public Object c(@NotNull CustomerSatisfactionIndex customerSatisfactionIndex, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = i.h(s.f229729a.d(), new b(customerSatisfactionIndex, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
