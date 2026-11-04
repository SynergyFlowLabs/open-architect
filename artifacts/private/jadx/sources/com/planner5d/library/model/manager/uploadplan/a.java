package com.planner5d.library.model.manager.uploadplan;

import androidx.compose.runtime.internal.w0;
import com.activeandroid.query.Select;
import com.activeandroid.util.TransactionUtils;
import com.planner5d.library.model.ai.AiTaskEvent;
import com.planner5d.library.model.manager.z2;
import com.planner5d.library.services.utility.s;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.i;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.apache.commons.lang3.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 1)
@ij.f
public final class a implements z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f222325a = 0;

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.uploadplan.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.uploadplan.AiTaskEventRepository", f = "AiTaskEventRepository.kt", i = {}, l = {24}, m = "fetchByIds", n = {}, s = {})
    static final class C1632a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f222326a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f222328c;

        C1632a(kotlin.coroutines.d<? super C1632a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222326a = obj;
            this.f222328c |= Integer.MIN_VALUE;
            return a.this.g(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.uploadplan.AiTaskEventRepository$fetchByIds$2", f = "AiTaskEventRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super List<AiTaskEvent>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Long> f222330b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<Long> list, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f222330b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f222330b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f222329a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            String strK0 = z.K0(this.f222330b, ",");
            return new Select().from(AiTaskEvent.class).where("uid IN (" + strK0 + ")").execute();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<AiTaskEvent>> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.uploadplan.AiTaskEventRepository$store$2", f = "AiTaskEventRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nAiTaskEventRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiTaskEventRepository.kt\ncom/planner5d/library/model/manager/uploadplan/AiTaskEventRepository$store$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1863#2,2:31\n*S KotlinDebug\n*F\n+ 1 AiTaskEventRepository.kt\ncom/planner5d/library/model/manager/uploadplan/AiTaskEventRepository$store$2\n*L\n17#1:31,2\n*E\n"})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<AiTaskEvent> f222332b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<AiTaskEvent> list, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f222332b = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AiTaskEvent) it.next()).save();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f222332b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f222331a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            final List<AiTaskEvent> list = this.f222332b;
            TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.uploadplan.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return a.c.m(list);
                }
            });
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Nullable
    public final Object g(@NotNull List<Long> list, @NotNull kotlin.coroutines.d<? super List<AiTaskEvent>> dVar) {
        C1632a c1632a;
        if (dVar instanceof C1632a) {
            c1632a = (C1632a) dVar;
            int i10 = c1632a.f222328c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1632a.f222328c = i10 - Integer.MIN_VALUE;
            } else {
                c1632a = new C1632a(dVar);
            }
        } else {
            c1632a = new C1632a(dVar);
        }
        Object objH = c1632a.f222326a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c1632a.f222328c;
        if (i11 == 0) {
            ResultKt.m(objH);
            if (list.isEmpty()) {
                return CollectionsKt.emptyList();
            }
            z1 z1VarD = s.f229729a.d();
            b bVar = new b(list, null);
            c1632a.f222328c = 1;
            objH = i.h(z1VarD, bVar, c1632a);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        Intrinsics.checkNotNullExpressionValue(objH, "withContext(...)");
        return objH;
    }

    @Nullable
    public final Object h(@NotNull List<AiTaskEvent> list, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = i.h(s.f229729a.d(), new c(list, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
