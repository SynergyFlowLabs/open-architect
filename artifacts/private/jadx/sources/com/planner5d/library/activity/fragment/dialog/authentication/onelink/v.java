package com.planner5d.library.activity.fragment.dialog.authentication.onelink;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.statistics.events.k3;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.c2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class v extends f2 {
    private static final long X = 4000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final a f131912o = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f131913s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final String f131914t = "0:30";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final String f131915v = "0:00";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f131916w = 4000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f131917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f131918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c2 f131919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f131920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f131921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.legal.model.manager.a f131922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f131923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f131924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c1<String> f131925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f131926j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final c1<b> f131927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Boolean> f131928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<String> f131929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<b> f131930n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @w0(parameters = 1)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f131931a = 0;

        @w0(parameters = 1)
        public static final class a extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f131932c = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f131933b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.f131933b = message;
            }

            @NotNull
            public final String a() {
                return this.f131933b;
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.authentication.onelink.v$b$b, reason: collision with other inner class name */
        @w0(parameters = 1)
        public static final class C1450b extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final C1450b f131934b = new C1450b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f131935c = 0;

            private C1450b() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C1450b);
            }

            public int hashCode() {
                return -511628337;
            }

            @NotNull
            public String toString() {
                return "ErrorReset";
            }
        }

        @w0(parameters = 1)
        public static final class c extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final c f131936b = new c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f131937c = 0;

            private c() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1695181883;
            }

            @NotNull
            public String toString() {
                return "Finish";
            }
        }

        @w0(parameters = 1)
        public static final class d extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final d f131938b = new d();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f131939c = 0;

            private d() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 2035182563;
            }

            @NotNull
            public String toString() {
                return "Resend";
            }
        }

        @w0(parameters = 1)
        public static final class e extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final e f131940b = new e();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f131941c = 0;

            private e() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                if (this != obj && !(obj instanceof e)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2006667194;
            }

            @NotNull
            public String toString() {
                return "Start";
            }
        }

        @w0(parameters = 1)
        public static final class f extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final f f131942b = new f();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f131943c = 0;

            private f() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 9278759;
            }

            @NotNull
            public String toString() {
                return "Support";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.onelink.AuthenticationSignInEnterCodeViewModel$resend$1", f = "AuthenticationSignInEnterCodeViewModel.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f131944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f131945b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f131947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f131948e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, boolean z10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f131947d = str;
            this.f131948e = z10;
            int i10 = 4 << 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new c(this.f131947d, this.f131948e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            v vVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f131945b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    v vVar2 = v.this;
                    com.planner5d.library.modules.user.user.t tVar = vVar2.f131921e;
                    String str = this.f131947d;
                    this.f131944a = vVar2;
                    this.f131945b = 1;
                    Object objO0 = tVar.o0(str, this);
                    if (objO0 == objL) {
                        return objL;
                    }
                    vVar = vVar2;
                    obj = objO0;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = (v) this.f131944a;
                    ResultKt.m(obj);
                }
                vVar.f131923g = ((Number) obj).intValue();
                v.this.u0(this.f131948e, null);
                v.this.t0();
            } catch (Exception e10) {
                v.this.m0(this.f131948e, e10);
            }
            v.this.f131926j.r(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.onelink.AuthenticationSignInEnterCodeViewModel$setId$1", f = "AuthenticationSignInEnterCodeViewModel.kt", i = {}, l = {145, 146}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131949a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f131951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f131952d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, boolean z10, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f131951c = i10;
            this.f131952d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new d(this.f131951c, this.f131952d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r7.L(r1, r3, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 7
                int r1 = r6.f131949a
                r5 = 4
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L14
                kotlin.ResultKt.m(r7)
                goto L53
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 3
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                r5 = 2
                throw r6
            L1e:
                kotlin.ResultKt.m(r7)
                r5 = 3
                goto L3b
            L23:
                kotlin.ResultKt.m(r7)
                com.planner5d.library.activity.fragment.dialog.authentication.onelink.v r7 = com.planner5d.library.activity.fragment.dialog.authentication.onelink.v.this
                com.planner5d.library.model.manager.config.p r7 = com.planner5d.library.activity.fragment.dialog.authentication.onelink.v.Y(r7)
                r5 = 7
                com.planner5d.library.services.r r1 = com.planner5d.library.services.r.oneLinkId
                int r4 = r6.f131951c
                r6.f131949a = r3
                java.lang.Object r7 = r7.t(r1, r4, r6)
                r5 = 1
                if (r7 != r0) goto L3b
                goto L52
            L3b:
                com.planner5d.library.activity.fragment.dialog.authentication.onelink.v r7 = com.planner5d.library.activity.fragment.dialog.authentication.onelink.v.this
                r5 = 4
                com.planner5d.library.model.manager.config.p r7 = com.planner5d.library.activity.fragment.dialog.authentication.onelink.v.Y(r7)
                r5 = 0
                com.planner5d.library.services.r r1 = com.planner5d.library.services.r.onboardingSignUp
                r5 = 4
                boolean r3 = r6.f131952d
                r6.f131949a = r2
                r5 = 3
                java.lang.Object r6 = r7.L(r1, r3, r6)
                r5 = 2
                if (r6 != r0) goto L53
            L52:
                return r0
            L53:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.authentication.onelink.v.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.onelink.AuthenticationSignInEnterCodeViewModel$setStateDelayed$1", f = "AuthenticationSignInEnterCodeViewModel.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131953a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f131955c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b bVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f131955c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new e(this.f131955c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f131953a;
            if (i10 == 0) {
                ResultKt.m(obj);
                this.f131953a = 1;
                if (d1.b(4000L, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            v.this.f131927k.r(this.f131955c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.onelink.AuthenticationSignInEnterCodeViewModel$signIn$1", f = "AuthenticationSignInEnterCodeViewModel.kt", i = {1}, l = {com.planner5d.library.engine.input.f.b.f160707m, 64, 65}, m = "invokeSuspend", n = {"error"}, s = {"L$0"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f131956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f131957b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f131959d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f131960e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, boolean z10, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f131959d = str;
            this.f131960e = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new f(this.f131959d, this.f131960e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
        
            if (r10.invoke(r9) == r0) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.authentication.onelink.v.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.onelink.AuthenticationSignInEnterCodeViewModel$startResendTimer$1", f = "AuthenticationSignInEnterCodeViewModel.kt", i = {0}, l = {89}, m = "invokeSuspend", n = {androidx.media3.exoplayer.upstream.h.f65997k}, s = {"I$0"})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f131962b;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new g(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0028  */
        /* JADX WARN: Code duplicated, block: B:13:0x0061 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005f -> B:14:0x0062). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r6 = 2
                int r1 = r7.f131962b
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L13
                r6 = 1
                int r1 = r7.f131961a
                kotlin.ResultKt.m(r8)
                goto L62
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "eesnet//ooens/t/eccoo// v/br ohr illf rwu uae m/kti"
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1d:
                kotlin.ResultKt.m(r8)
                r6 = 2
                r8 = 0
                r1 = r8
                r1 = r8
            L24:
                r8 = 31
                if (r1 >= r8) goto L65
                com.planner5d.library.activity.fragment.dialog.authentication.onelink.v r8 = com.planner5d.library.activity.fragment.dialog.authentication.onelink.v.this
                r6 = 1
                androidx.lifecycle.c1 r8 = com.planner5d.library.activity.fragment.dialog.authentication.onelink.v.X(r8)
                kotlin.jvm.internal.q1 r3 = kotlin.jvm.internal.q1.f312784a
                java.util.Locale r3 = java.util.Locale.US
                r6 = 5
                int r4 = 30 - r1
                java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.f(r4)
                java.lang.Object[] r4 = new java.lang.Object[]{r4}
                r6 = 2
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
                java.lang.String r5 = "0:%02d"
                java.lang.String r3 = java.lang.String.format(r3, r5, r4)
                java.lang.String r4 = "format(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                r8.r(r3)
                r6 = 5
                r7.f131961a = r1
                r6 = 1
                r7.f131962b = r2
                r6 = 4
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = kotlinx.coroutines.d1.b(r3, r7)
                r6 = 6
                if (r8 != r0) goto L62
                return r0
            L62:
                int r1 = r1 + r2
                r6 = 5
                goto L24
            L65:
                com.planner5d.library.activity.fragment.dialog.authentication.onelink.v r7 = com.planner5d.library.activity.fragment.dialog.authentication.onelink.v.this
                androidx.lifecycle.c1 r7 = com.planner5d.library.activity.fragment.dialog.authentication.onelink.v.a0(r7)
                com.planner5d.library.activity.fragment.dialog.authentication.onelink.v$b$d r8 = com.planner5d.library.activity.fragment.dialog.authentication.onelink.v.b.d.f131938b
                r6 = 6
                r7.r(r8)
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 7
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.authentication.onelink.v.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.onelink.AuthenticationSignInEnterCodeViewModel$startSupportTimer$1", f = "AuthenticationSignInEnterCodeViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131964a;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f131964a;
            if (i10 == 0) {
                ResultKt.m(obj);
                this.f131964a = 1;
                if (d1.b(4000L, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            v.this.f131927k.r(b.f.f131942b);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public v(@NotNull com.planner5d.library.application.b application, @NotNull ErrorMessageParser errorMessageParser, @NotNull c2 networkStateUtility, @NotNull com.planner5d.library.model.manager.config.p sharedPreferencesManager, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.legal.model.manager.a privacyManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(sharedPreferencesManager, "sharedPreferencesManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(privacyManager, "privacyManager");
        this.f131917a = application;
        this.f131918b = errorMessageParser;
        this.f131919c = networkStateUtility;
        this.f131920d = sharedPreferencesManager;
        this.f131921e = userAuthorization;
        this.f131922f = privacyManager;
        c1<String> c1Var = new c1<>(f131914t);
        this.f131925i = c1Var;
        c1<Boolean> c1Var2 = new c1<>(Boolean.FALSE);
        this.f131926j = c1Var2;
        c1<b> c1Var3 = new c1<>();
        this.f131927k = c1Var3;
        this.f131928l = c1Var2;
        this.f131929m = c1Var;
        this.f131930n = c1Var3;
        s0();
        c1Var3.r(b.e.f131940b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(boolean z10, boolean z11) {
        if (z10) {
            com.planner5d.library.model.manager.statistics.events.n.f217157b.J1(true, k3.c.one_link_email_digital_code);
        }
        u0(z11, null);
        this.f131927k.r(b.c.f131936b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(boolean z10, Exception exc) {
        timber.log.b.f381052a.e(exc);
        u0(z10, p3.a.other);
        c1<b> c1Var = this.f131927k;
        String messageRaw = ErrorMessageParser.parse$default(this.f131918b, exc, null, 2, null).getMessageRaw(this.f131917a);
        Intrinsics.checkNotNullExpressionValue(messageRaw, "getMessageRaw(...)");
        c1Var.r(new b.a(messageRaw));
        r0();
    }

    private final void p0(b bVar) {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new e(bVar, null), 3, null);
    }

    private final void r0() {
        p0(b.C1450b.f131934b);
    }

    private final void s0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new g(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new h(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(boolean z10, p3.a aVar) {
        com.planner5d.library.model.manager.statistics.events.n.f217157b.M1(z10, aVar, k3.c.one_link_email_digital_code, false, false);
    }

    @NotNull
    public final androidx.lifecycle.w0<String> i0() {
        return this.f131929m;
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> j0() {
        return this.f131928l;
    }

    @NotNull
    public final androidx.lifecycle.w0<b> k0() {
        return this.f131930n;
    }

    public final boolean l0() {
        return Intrinsics.areEqual(this.f131925i.f(), f131915v);
    }

    public final void n0(boolean z10, @NotNull String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f131924h = true;
        this.f131926j.r(Boolean.TRUE);
        this.f131925i.r(f131914t);
        kotlinx.coroutines.k.f(g2.a(this), null, null, new c(email, z10, null), 3, null);
    }

    public final void o0(int i10, boolean z10) {
        this.f131923g = i10;
        int i11 = 7 | 0;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new d(i10, z10, null), 3, null);
    }

    public final void q0(@NotNull String code, boolean z10) {
        Intrinsics.checkNotNullParameter(code, "code");
        if (this.f131919c.d(this.f131917a)) {
            this.f131926j.r(Boolean.TRUE);
            kotlinx.coroutines.k.f(g2.a(this), null, null, new f(code, z10, null), 3, null);
        } else {
            ErrorMessageException errorMessageExceptionCreateNoInternetException = ErrorMessageException.createNoInternetException();
            Intrinsics.checkNotNullExpressionValue(errorMessageExceptionCreateNoInternetException, "createNoInternetException(...)");
            m0(z10, errorMessageExceptionCreateNoInternetException);
        }
    }
}
