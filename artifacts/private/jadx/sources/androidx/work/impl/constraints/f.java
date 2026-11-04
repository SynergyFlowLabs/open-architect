package androidx.work.impl.constraints;

import androidx.work.impl.model.v;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.k;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f76784a;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f76785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f76786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v f76787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f76788d;

        /* JADX INFO: renamed from: androidx.work.impl.constraints.f$a$a, reason: collision with other inner class name */
        static final class C0781a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f76789a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f76790b;

            C0781a(d dVar, v vVar) {
                this.f76789a = dVar;
                this.f76790b = vVar;
            }

            @Override // kotlinx.coroutines.flow.j
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull b bVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                this.f76789a.e(this.f76790b, bVar);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, v vVar, d dVar, kotlin.coroutines.d<? super a> dVar2) {
            super(2, dVar2);
            this.f76786b = eVar;
            this.f76787c = vVar;
            this.f76788d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f76786b, this.f76787c, this.f76788d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f76785a;
            if (i10 == 0) {
                ResultKt.m(obj);
                i<b> iVarB = this.f76786b.b(this.f76787c);
                C0781a c0781a = new C0781a(this.f76788d, this.f76787c);
                this.f76785a = 1;
                if (iVarB.collect(c0781a, this) == objL) {
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
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        String strI = androidx.work.v.i("WorkConstraintsTracker");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f76784a = strI;
    }

    @NotNull
    public static final p2 b(@NotNull e eVar, @NotNull v spec, @NotNull n0 dispatcher, @NotNull d listener) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(listener, "listener");
        a0 a0VarC = u2.c(null, 1, null);
        k.f(t0.a(dispatcher.plus(a0VarC)), null, null, new a(eVar, spec, listener, null), 3, null);
        return a0VarC;
    }
}
