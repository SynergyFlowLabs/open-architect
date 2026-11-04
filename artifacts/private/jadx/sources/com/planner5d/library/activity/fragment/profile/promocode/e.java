package com.planner5d.library.activity.fragment.profile.promocode;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.n2;
import com.planner5d.library.modules.user.user.o0;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class e extends f2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f134827e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o0 f134828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f134829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2 f134830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c1<a> f134831d;

    @w0(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f134832a = 0;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.profile.promocode.e$a$a, reason: collision with other inner class name */
        @w0(parameters = 0)
        public static final class C1480a extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f134833c = 8;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final Exception f134834b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1480a(@NotNull Exception exception) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f134834b = exception;
            }

            @NotNull
            public final Exception a() {
                return this.f134834b;
            }
        }

        @w0(parameters = 1)
        public static final class b extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final b f134835b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f134836c = 0;

            private b() {
                super(null);
            }
        }

        @w0(parameters = 1)
        public static final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final c f134837b = new c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f134838c = 0;

            private c() {
                super(null);
            }
        }

        @w0(parameters = 1)
        public static final class d extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final d f134839b = new d();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f134840c = 0;

            private d() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.promocode.PromoCodeViewModel$submitPromoCode$1", f = "PromoCodeViewModel.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134841a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.o f134843c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.planner5d.library.services.o oVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f134843c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new b(this.f134843c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134841a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    e.this.X().r(a.b.f134835b);
                    String strE = this.f134843c.e(com.planner5d.library.f.j.qo);
                    o0 o0Var = e.this.f134828a;
                    id.a aVarA = e.this.f134829b.a();
                    this.f134841a = 1;
                    if (o0Var.c(aVarA, strE, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                n2.f217166b.v0();
                e.this.X().r(a.d.f134839b);
            } catch (Exception e10) {
                if ((e10 instanceof ErrorMessageException) && ErrorMessageException.isWithCode(e10, com.planner5d.library.f.s.f169369qa, com.planner5d.library.f.s.f169393ra, com.planner5d.library.f.s.f169345pa)) {
                    timber.log.b.f381052a.e(e10);
                    e.this.X().r(new a.C1480a(e10));
                } else {
                    e.this.X().r(a.c.f134837b);
                    e.this.f134830c.c(e10);
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public e(@NotNull o0 userPromoCodeManager, @NotNull t userAuthorization, @NotNull b2 messageManager) {
        Intrinsics.checkNotNullParameter(userPromoCodeManager, "userPromoCodeManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        this.f134828a = userPromoCodeManager;
        this.f134829b = userAuthorization;
        this.f134830c = messageManager;
        this.f134831d = new c1<>(a.c.f134837b);
    }

    @NotNull
    public final c1<a> X() {
        return this.f134831d;
    }

    public final void Y(@NotNull com.planner5d.library.services.o form) {
        Intrinsics.checkNotNullParameter(form, "form");
        n2.f217166b.W();
        if (form.h()) {
            k.f(g2.a(this), s.f229729a.a(), null, new b(form, null), 2, null);
        }
    }
}
