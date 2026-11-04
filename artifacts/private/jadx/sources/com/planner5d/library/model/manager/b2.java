package com.planner5d.library.model.manager;

import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public final class b2 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f180881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<com.planner5d.library.model.u> f180882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f180883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<a> f180884d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.u f180885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f180886b;

        public a(@NotNull com.planner5d.library.model.u message, int i10) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f180885a = message;
            this.f180886b = i10;
        }

        @NotNull
        public final com.planner5d.library.model.u a() {
            return this.f180885a;
        }

        public final int b() {
            return this.f180886b;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.MessageManager$bumpLatestTopOrQueue$1", f = "MessageManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180887a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.u f180889c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.planner5d.library.model.u uVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f180889c = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b2.this.new b(this.f180889c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f180887a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (!Intrinsics.areEqual(CollectionsKt.lastOrNull(b2.this.f180882b), this.f180889c)) {
                b2.this.f180882b.add(this.f180889c);
            }
            b2.this.t(this.f180889c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.MessageManager$dismiss$1", f = "MessageManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180890a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.u f180892c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.planner5d.library.model.u uVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f180892c = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b2.this.new c(this.f180892c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f180890a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            a aVarF = b2.this.q().f();
            if (Intrinsics.areEqual(aVarF != null ? aVarF.a() : null, this.f180892c)) {
                b2.this.f180882b.remove(this.f180892c);
                b2 b2Var = b2.this;
                b2Var.t(b2Var.f180882b.isEmpty() ? null : (com.planner5d.library.model.u) CollectionsKt.last(b2.this.f180882b));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.MessageManager$queue$1", f = "MessageManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180893a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.u f180895c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.planner5d.library.model.u uVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f180895c = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b2.this.new d(this.f180895c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f180893a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            b2.this.f180882b.add(this.f180895c);
            b2.this.t(this.f180895c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public b2(@NotNull ErrorMessageParser errorMessageParser) {
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        this.f180881a = errorMessageParser;
        this.f180882b = new ArrayList();
        this.f180883c = kotlinx.coroutines.t0.a(kotlinx.coroutines.u2.c(null, 1, null).plus(com.planner5d.library.services.utility.s.f229729a.a()));
        this.f180884d = new androidx.lifecycle.c1(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(com.planner5d.library.model.u it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.d() == com.planner5d.library.model.u.c.NoNewtworkError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(com.planner5d.library.model.u uVar) {
        androidx.lifecycle.w0<a> w0Var = this.f180884d;
        Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.planner5d.library.model.manager.MessageManager.MessageViewInfo>");
        ((androidx.lifecycle.c1) w0Var).r(uVar == null ? null : new a(uVar, this.f180882b.size()));
    }

    @Override // com.planner5d.library.model.manager.c2
    public void a(@NotNull com.planner5d.library.model.u message) {
        Intrinsics.checkNotNullParameter(message, "message");
        kotlinx.coroutines.k.f(this.f180883c, null, null, new b(message, null), 3, null);
    }

    @Override // com.planner5d.library.model.manager.c2
    public void b(@androidx.annotation.f1 int i10, @NotNull Object... parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        e(new com.planner5d.library.model.u(com.planner5d.library.model.u.c.Info, new com.planner5d.library.services.utility.k3(i10, Arrays.copyOf(parameters, parameters.length)), new com.planner5d.library.model.u.a[0]));
    }

    @Override // com.planner5d.library.model.manager.c2
    public void c(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        r(this.f180881a.parse(error, null));
    }

    @Override // com.planner5d.library.model.manager.c2
    public void d(@NotNull com.planner5d.library.model.u message) {
        Intrinsics.checkNotNullParameter(message, "message");
        kotlinx.coroutines.k.f(this.f180883c, null, null, new c(message, null), 3, null);
    }

    @Override // com.planner5d.library.model.manager.c2
    public void e(@NotNull com.planner5d.library.model.u message) {
        Intrinsics.checkNotNullParameter(message, "message");
        kotlinx.coroutines.k.f(this.f180883c, null, null, new d(message, null), 3, null);
    }

    @Override // com.planner5d.library.model.manager.c2
    public void f() {
        List<com.planner5d.library.model.u> list = this.f180882b;
        final Function1 function1 = new Function1() { // from class: com.planner5d.library.model.manager.z1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(b2.o((com.planner5d.library.model.u) obj));
            }
        };
        list.removeIf(new Predicate() { // from class: com.planner5d.library.model.manager.a2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b2.p(function1, obj);
            }
        });
        t(!this.f180882b.isEmpty() ? (com.planner5d.library.model.u) CollectionsKt.last((List) this.f180882b) : null);
    }

    @Override // com.planner5d.library.model.manager.c2
    @NotNull
    public String g(@NotNull Throwable e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        String localizedMessage = e10.getLocalizedMessage();
        if (localizedMessage != null) {
            return localizedMessage;
        }
        String message = e10.getMessage();
        return message == null ? com.facebook.internal.a.f99697t : message;
    }

    @Override // com.planner5d.library.model.manager.c2
    public void h() {
        com.planner5d.library.model.u.c cVar = com.planner5d.library.model.u.c.NoNewtworkError;
        com.planner5d.library.services.utility.k3 textValue = ErrorMessageException.createNoInternetException().toTextValue();
        Intrinsics.checkNotNullExpressionValue(textValue, "toTextValue(...)");
        e(new com.planner5d.library.model.u(cVar, textValue, new com.planner5d.library.model.u.a[0]));
    }

    @Override // com.planner5d.library.model.manager.c2
    public void i(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        n(this.f180881a.parse(error, null));
    }

    public final void n(@NotNull ErrorMessageException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        com.planner5d.library.model.u message = error.toMessage();
        Intrinsics.checkNotNullExpressionValue(message, "toMessage(...)");
        a(message);
    }

    @NotNull
    public final androidx.lifecycle.w0<a> q() {
        return this.f180884d;
    }

    public final void r(@NotNull ErrorMessageException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        timber.log.b.f381052a.e(error);
        com.planner5d.library.model.u message = error.toMessage();
        Intrinsics.checkNotNullExpressionValue(message, "toMessage(...)");
        e(message);
    }

    @kotlin.l(message = "For development only, while waiting for translations", replaceWith = @kotlin.b1(expression = "queue(message, parameters)", imports = {}))
    public final void s(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        timber.log.b.f381052a.d(message, new Object[0]);
        e(new com.planner5d.library.model.u(com.planner5d.library.model.u.c.Error, new com.planner5d.library.services.utility.k3(message), new com.planner5d.library.model.u.a[0]));
    }
}
