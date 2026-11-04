package androidx.databinding;

import androidx.annotation.b1;
import androidx.lifecycle.j1;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g0 f49366a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final j f49367b = new j() { // from class: androidx.databinding.f0
        @Override // androidx.databinding.j
        public final i0 a(e0 e0Var, int i10, ReferenceQueue referenceQueue) {
            return g0.b(e0Var, i10, referenceQueue);
        }
    };

    public static final class a implements a0<kotlinx.coroutines.flow.i<? extends Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private WeakReference<o0> f49368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private p2 f49369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final i0<kotlinx.coroutines.flow.i<Object>> f49370c;

        /* JADX INFO: renamed from: androidx.databinding.g0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1", f = "ViewDataBindingKtx.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160706l1}, m = "invokeSuspend", n = {}, s = {})
        static final class C0424a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f49371a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o0 f49372b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<Object> f49373c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f49374d;

            /* JADX INFO: renamed from: androidx.databinding.g0$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1", f = "ViewDataBindingKtx.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
            static final class C0425a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f49375a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.i<Object> f49376b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f49377c;

                /* JADX INFO: renamed from: androidx.databinding.g0$a$a$a$a, reason: collision with other inner class name */
                static final class C0426a<T> implements kotlinx.coroutines.flow.j {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ a f49378a;

                    C0426a(a aVar) {
                        this.f49378a = aVar;
                    }

                    @Override // kotlinx.coroutines.flow.j
                    @Nullable
                    public final Object emit(@Nullable Object obj, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                        e0 e0VarA = this.f49378a.f49370c.a();
                        if (e0VarA != null) {
                            e0VarA.V(this.f49378a.f49370c.f49393b, this.f49378a.f49370c.b(), 0);
                        }
                        return Unit.f312394a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0425a(kotlinx.coroutines.flow.i<? extends Object> iVar, a aVar, kotlin.coroutines.d<? super C0425a> dVar) {
                    super(2, dVar);
                    this.f49376b = iVar;
                    this.f49377c = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new C0425a(this.f49376b, this.f49377c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f49375a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.flow.i<Object> iVar = this.f49376b;
                        C0426a c0426a = new C0426a(this.f49377c);
                        this.f49375a = 1;
                        if (iVar.collect(c0426a, this) == objL) {
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
                    return ((C0425a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0424a(o0 o0Var, kotlinx.coroutines.flow.i<? extends Object> iVar, a aVar, kotlin.coroutines.d<? super C0424a> dVar) {
                super(2, dVar);
                this.f49372b = o0Var;
                this.f49373c = iVar;
                this.f49374d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C0424a(this.f49372b, this.f49373c, this.f49374d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f49371a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.lifecycle.c0 lifecycle = this.f49372b.getLifecycle();
                    androidx.lifecycle.c0.b bVar = androidx.lifecycle.c0.b.STARTED;
                    C0425a c0425a = new C0425a(this.f49373c, this.f49374d, null);
                    this.f49371a = 1;
                    if (j1.a(lifecycle, bVar, c0425a, this) == objL) {
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
                return ((C0424a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public a(@Nullable e0 e0Var, int i10, @NotNull ReferenceQueue<e0> referenceQueue) {
            Intrinsics.checkNotNullParameter(referenceQueue, "referenceQueue");
            this.f49370c = new i0<>(e0Var, i10, this, referenceQueue);
        }

        private final void g(o0 o0Var, kotlinx.coroutines.flow.i<? extends Object> iVar) {
            p2 p2Var = this.f49369b;
            int i10 = 2 | 0;
            if (p2Var != null) {
                p2.a.b(p2Var, null, 1, null);
            }
            this.f49369b = kotlinx.coroutines.k.f(p0.a(o0Var), null, null, new C0424a(o0Var, iVar, this, null), 3, null);
        }

        @Override // androidx.databinding.a0
        public void b(@Nullable o0 o0Var) {
            WeakReference<o0> weakReference = this.f49368a;
            if ((weakReference != null ? weakReference.get() : null) == o0Var) {
                return;
            }
            p2 p2Var = this.f49369b;
            if (p2Var != null) {
                p2.a.b(p2Var, null, 1, null);
            }
            if (o0Var == null) {
                this.f49368a = null;
                return;
            }
            this.f49368a = new WeakReference<>(o0Var);
            kotlinx.coroutines.flow.i<? extends Object> iVar = (kotlinx.coroutines.flow.i) this.f49370c.b();
            if (iVar != null) {
                g(o0Var, iVar);
            }
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void e(@Nullable kotlinx.coroutines.flow.i<? extends Object> iVar) {
            o0 o0Var;
            WeakReference<o0> weakReference = this.f49368a;
            if (weakReference == null || (o0Var = weakReference.get()) == null || iVar == null) {
                return;
            }
            g(o0Var, iVar);
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(@Nullable kotlinx.coroutines.flow.i<? extends Object> iVar) {
            p2 p2Var = this.f49369b;
            if (p2Var != null) {
                p2.a.b(p2Var, null, 1, null);
            }
            this.f49369b = null;
        }

        @Override // androidx.databinding.a0
        @NotNull
        public i0<kotlinx.coroutines.flow.i<? extends Object>> getListener() {
            return this.f49370c;
        }
    }

    private g0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b(e0 e0Var, int i10, ReferenceQueue referenceQueue) {
        Intrinsics.checkNotNull(referenceQueue);
        return new a(e0Var, i10, referenceQueue).getListener();
    }

    @oj.n
    @b1({b1.a.LIBRARY_GROUP})
    public static final boolean c(@NotNull e0 viewDataBinding, int i10, @Nullable kotlinx.coroutines.flow.i<?> iVar) {
        Intrinsics.checkNotNullParameter(viewDataBinding, "viewDataBinding");
        viewDataBinding.f49353t = true;
        try {
            return viewDataBinding.f1(i10, iVar, f49367b);
        } finally {
            viewDataBinding.f49353t = false;
        }
    }
}
