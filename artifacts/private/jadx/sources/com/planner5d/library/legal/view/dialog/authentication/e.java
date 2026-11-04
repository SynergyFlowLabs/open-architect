package com.planner5d.library.legal.view.dialog.authentication;

import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.modules.user.user.r0;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.services.utility.s;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final r0 f180447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c1<a> f180448b;

    public static abstract class a {

        /* JADX INFO: renamed from: com.planner5d.library.legal.view.dialog.authentication.e$a$a, reason: collision with other inner class name */
        public static final class C1567a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C1567a f180449a = new C1567a();

            private C1567a() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C1567a);
            }

            public int hashCode() {
                return -1887374050;
            }

            @NotNull
            public String toString() {
                return "AgreeInProgress";
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final id.a f180450a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull id.a user) {
                super(null);
                Intrinsics.checkNotNullParameter(user, "user");
                this.f180450a = user;
            }

            public static /* synthetic */ b c(b bVar, id.a aVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    aVar = bVar.f180450a;
                }
                return bVar.b(aVar);
            }

            @NotNull
            public final id.a a() {
                return this.f180450a;
            }

            @NotNull
            public final b b(@NotNull id.a user) {
                Intrinsics.checkNotNullParameter(user, "user");
                return new b(user);
            }

            @NotNull
            public final id.a d() {
                return this.f180450a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f180450a, ((b) obj).f180450a);
            }

            public int hashCode() {
                return this.f180450a.hashCode();
            }

            @NotNull
            public String toString() {
                return "Agreed(user=" + this.f180450a + ")";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f180451a = new c();

            private c() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1686092008;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f180452a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@NotNull String url) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.f180452a = url;
            }

            public static /* synthetic */ d c(d dVar, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = dVar.f180452a;
                }
                return dVar.b(str);
            }

            @NotNull
            public final String a() {
                return this.f180452a;
            }

            @NotNull
            public final d b(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new d(url);
            }

            @NotNull
            public final String d() {
                return this.f180452a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.f180452a, ((d) obj).f180452a);
            }

            public int hashCode() {
                return this.f180452a.hashCode();
            }

            @NotNull
            public String toString() {
                return "OpenUrl(url=" + this.f180452a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.view.dialog.authentication.PrivacyAgreementViewModel$continueSignIn$1", f = "PrivacyAgreementViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180453a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f180455c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.view.dialog.authentication.PrivacyAgreementViewModel$continueSignIn$1$1", f = "PrivacyAgreementViewModel.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f180456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ id.a f180457b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f180458c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(id.a aVar, e eVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f180457b = aVar;
                this.f180458c = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f180457b, this.f180458c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f180456a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    if (this.f180457b != null) {
                        r0 r0Var = this.f180458c.f180447a;
                        id.a aVar = this.f180457b;
                        Map<r, Boolean> mapMapOf = MapsKt.mapOf(TuplesKt.to(r.privacyAgreed, kotlin.coroutines.jvm.internal.b.a(true)));
                        this.f180456a = 1;
                        if (r0Var.a(aVar, mapMapOf, this) == objL) {
                            return objL;
                        }
                    } else {
                        this.f180458c.W().o(a.c.f180451a);
                    }
                    return Unit.f312394a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f180458c.W().o(new a.b(this.f180457b));
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(id.a aVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f180455c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new b(this.f180455c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f180453a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                c0.t(c0.f225068a, null, false, new a(this.f180455c, e.this, null), 3, null);
            } catch (Exception e10) {
                timber.log.b.f381052a.e(e10);
                e.this.W().o(a.c.f180451a);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public e(@NotNull r0 userProperties) {
        Intrinsics.checkNotNullParameter(userProperties, "userProperties");
        this.f180447a = userProperties;
        this.f180448b = new c1<>();
    }

    public final void V(@Nullable id.a aVar) {
        this.f180448b.r(a.C1567a.f180449a);
        int i10 = 5 >> 0;
        k.f(g2.a(this), s.f229729a.b(), null, new b(aVar, null), 2, null);
    }

    @NotNull
    public final c1<a> W() {
        return this.f180448b;
    }
}
