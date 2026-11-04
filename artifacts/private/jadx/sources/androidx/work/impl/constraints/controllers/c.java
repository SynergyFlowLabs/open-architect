package androidx.work.impl.constraints.controllers;

import androidx.work.impl.model.v;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.j0;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.flow.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.work.impl.constraints.trackers.h<T> f76760a;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.impl.constraints.controllers.ConstraintController$track$1", f = "ContraintControllers.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<l0<? super androidx.work.impl.constraints.b>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f76761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f76762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c<T> f76763c;

        /* JADX INFO: renamed from: androidx.work.impl.constraints.controllers.c$a$a, reason: collision with other inner class name */
        static final class C0779a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c<T> f76764a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f76765b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0779a(c<T> cVar, b bVar) {
                super(0);
                this.f76764a = cVar;
                this.f76765b = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((c) this.f76764a).f76760a.g(this.f76765b);
            }
        }

        public static final class b implements androidx.work.impl.constraints.a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c<T> f76766a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0<androidx.work.impl.constraints.b> f76767b;

            /* JADX WARN: Multi-variable type inference failed */
            b(c<T> cVar, l0<? super androidx.work.impl.constraints.b> l0Var) {
                this.f76766a = cVar;
                this.f76767b = l0Var;
            }

            @Override // androidx.work.impl.constraints.a
            public void a(T t10) {
                this.f76767b.s().p(this.f76766a.f(t10) ? new androidx.work.impl.constraints.b.C0778b(this.f76766a.b()) : androidx.work.impl.constraints.b.a.f76752a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<T> cVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f76763c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f76763c, dVar);
            aVar.f76762b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f76761a;
            if (i10 == 0) {
                ResultKt.m(obj);
                l0 l0Var = (l0) this.f76762b;
                b bVar = new b(this.f76763c, l0Var);
                ((c) this.f76763c).f76760a.c(bVar);
                C0779a c0779a = new C0779a(this.f76763c, bVar);
                this.f76761a = 1;
                if (j0.b(l0Var, c0779a, this) == objL) {
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
        public final Object invoke(@NotNull l0<? super androidx.work.impl.constraints.b> l0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public c(@NotNull androidx.work.impl.constraints.trackers.h<T> tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f76760a = tracker;
    }

    public static /* synthetic */ void c() {
    }

    public abstract int b();

    public abstract boolean d(@NotNull v vVar);

    public final boolean e(@NotNull v workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return d(workSpec) && f(this.f76760a.f());
    }

    public abstract boolean f(T t10);

    @NotNull
    public final kotlinx.coroutines.flow.i<androidx.work.impl.constraints.b> g() {
        return k.t(new a(this, null));
    }
}
