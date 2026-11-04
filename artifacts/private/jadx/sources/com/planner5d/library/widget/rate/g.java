package com.planner5d.library.widget.rate;

import android.app.Activity;
import androidx.annotation.k1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f258672f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f258673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.rate.e f258674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.rate.a f258675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f1 f258676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f258677e;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.rate.RateUsManager$onCreate$1", f = "RateUsManager.kt", i = {1}, l = {32, 33, 39}, m = "invokeSuspend", n = {"sessionCount"}, s = {"I$0"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f258678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f258679b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f258681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Activity f258682e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, Activity activity, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f258681d = z10;
            this.f258682e = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new a(this.f258681d, this.f258682e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
        
            if (kotlinx.coroutines.d1.b(r3, r7) == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.rate.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.rate.RateUsManager", f = "RateUsManager.kt", i = {}, l = {52, 52}, m = "requestNativeGoogleDialog", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f258683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f258684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f258685c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f258687e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f258685c = obj;
            this.f258687e |= Integer.MIN_VALUE;
            return g.this.i(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.rate.RateUsManager$showDialog$1", f = "RateUsManager.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f258688a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.rate.c f258690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ t3.c f258691d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.planner5d.library.widget.rate.c cVar, t3.c cVar2, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f258690c = cVar;
            this.f258691d = cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new c(this.f258690c, this.f258691d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f258688a;
            if (i10 == 0) {
                ResultKt.m(obj);
                g gVar = g.this;
                com.planner5d.library.widget.rate.c cVar = this.f258690c;
                t3.c cVar2 = this.f258691d;
                this.f258688a = 1;
                if (gVar.k(cVar, cVar2, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.rate.RateUsManager$showDialogSuspend$2", f = "RateUsManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.X}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f258692a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.rate.c f258694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ t3.c f258695d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.rate.RateUsManager$showDialogSuspend$2$1$1", f = "RateUsManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160716p}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f258696a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f258697b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f258697b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f258697b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f258696a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.widget.rate.a aVar = this.f258697b.f258675c;
                    this.f258696a = 1;
                    if (aVar.g(this) == objL) {
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
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.planner5d.library.widget.rate.c cVar, t3.c cVar2, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f258694c = cVar;
            this.f258695d = cVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(g gVar) {
            k.f(gVar.f258676d, null, null, new a(gVar, null), 3, null);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new d(this.f258694c, this.f258695d, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0060  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f258692a;
            boolean z10 = true;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (g.this.f258675c.d(g.this.f258677e, this.f258694c)) {
                    com.planner5d.library.widget.rate.e eVar = g.this.f258674b;
                    com.planner5d.library.widget.rate.c cVar = this.f258694c;
                    t3.c cVar2 = this.f258695d;
                    final g gVar = g.this;
                    if (eVar.d(cVar, cVar2, new Function0() { // from class: com.planner5d.library.widget.rate.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return g.d.m(gVar);
                        }
                    })) {
                        com.planner5d.library.widget.rate.a aVar = g.this.f258675c;
                        com.planner5d.library.widget.rate.c cVar3 = this.f258694c;
                        this.f258692a = 1;
                        if (aVar.h(cVar3, this) == objL) {
                            return objL;
                        }
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.rate.RateUsManager$showDialogWithCallback$1", f = "RateUsManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f258698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f258699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f258700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f258701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.rate.c f258702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ t3.c f258703f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super Boolean, Unit> function1, g gVar, com.planner5d.library.widget.rate.c cVar, t3.c cVar2, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f258700c = function1;
            this.f258701d = gVar;
            this.f258702e = cVar;
            this.f258703f = cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f258700c, this.f258701d, this.f258702e, this.f258703f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f258699b;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function1<Boolean, Unit> function2 = this.f258700c;
                g gVar = this.f258701d;
                com.planner5d.library.widget.rate.c cVar = this.f258702e;
                t3.c cVar2 = this.f258703f;
                this.f258698a = function2;
                this.f258699b = 1;
                Object objK = gVar.k(cVar, cVar2, this);
                if (objK == objL) {
                    return objL;
                }
                obj = objK;
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.f258698a;
                ResultKt.m(obj);
            }
            function1.invoke(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public g(@NotNull p preferences, @NotNull com.planner5d.library.widget.rate.e dialogHandler, @NotNull com.planner5d.library.widget.rate.a helper, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(dialogHandler, "dialogHandler");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f258673a = preferences;
        this.f258674b = dialogHandler;
        this.f258675c = helper;
        this.f258676d = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(com.planner5d.library.widget.rate.c cVar, t3.c cVar2, kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new d(cVar, cVar2, null), dVar);
    }

    public final void h(@NotNull Activity activity, boolean z10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i10 = 0 & 3;
        k.f(this.f258676d, null, null, new a(z10, activity, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (com.google.android.play.core.ktx.d.a(r1, r6, (com.google.android.play.core.review.ReviewInfo) r5, r0) == r7) goto L25;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(@org.jetbrains.annotations.NotNull android.app.Activity r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.planner5d.library.widget.rate.g.b
            r4 = 7
            if (r0 == 0) goto L17
            r0 = r7
            com.planner5d.library.widget.rate.g$b r0 = (com.planner5d.library.widget.rate.g.b) r0
            r4 = 6
            int r1 = r0.f258687e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 7
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r4 = 0
            r0.f258687e = r1
            goto L1d
        L17:
            r4 = 6
            com.planner5d.library.widget.rate.g$b r0 = new com.planner5d.library.widget.rate.g$b
            r0.<init>(r7)
        L1d:
            java.lang.Object r5 = r0.f258685c
            r4 = 0
            java.lang.Object r7 = kotlin.coroutines.intrinsics.b.l()
            r4 = 0
            int r1 = r0.f258687e
            r2 = 5
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4e
            if (r1 == r3) goto L40
            if (r1 != r2) goto L35
            kotlin.ResultKt.m(r5)     // Catch: java.lang.Throwable -> L7f
            r4 = 3
            goto L8b
        L35:
            r4 = 4
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 2
            r5.<init>(r6)
            r4 = 4
            throw r5
        L40:
            r4 = 3
            java.lang.Object r6 = r0.f258684b
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r1 = r0.f258683a
            com.google.android.play.core.review.b r1 = (com.google.android.play.core.review.b) r1
            r4 = 5
            kotlin.ResultKt.m(r5)     // Catch: java.lang.Throwable -> L7f
            goto L6c
        L4e:
            kotlin.ResultKt.m(r5)
            r4 = 5
            com.google.android.play.core.review.b r1 = com.google.android.play.core.review.c.a(r6)
            r4 = 4
            java.lang.String r5 = "create(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            r4 = 5
            r0.f258683a = r1     // Catch: java.lang.Throwable -> L7f
            r4 = 1
            r0.f258684b = r6     // Catch: java.lang.Throwable -> L7f
            r0.f258687e = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r5 = com.google.android.play.core.ktx.d.b(r1, r0)     // Catch: java.lang.Throwable -> L7f
            r4 = 5
            if (r5 != r7) goto L6c
            goto L7e
        L6c:
            com.google.android.play.core.review.ReviewInfo r5 = (com.google.android.play.core.review.ReviewInfo) r5     // Catch: java.lang.Throwable -> L7f
            r4 = 6
            r3 = 0
            r0.f258683a = r3     // Catch: java.lang.Throwable -> L7f
            r0.f258684b = r3     // Catch: java.lang.Throwable -> L7f
            r4 = 2
            r0.f258687e = r2     // Catch: java.lang.Throwable -> L7f
            r4 = 6
            java.lang.Object r5 = com.google.android.play.core.ktx.d.a(r1, r6, r5, r0)     // Catch: java.lang.Throwable -> L7f
            if (r5 != r7) goto L8b
        L7e:
            return r7
        L7f:
            r5 = move-exception
            r4 = 0
            timber.log.b$b r6 = timber.log.b.f381052a
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r0 = "Failed to trigger In-app review dialog"
            r6.z(r5, r0, r7)
        L8b:
            kotlin.Unit r5 = kotlin.Unit.f312394a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.rate.g.i(android.app.Activity, kotlin.coroutines.d):java.lang.Object");
    }

    public final void j(@NotNull com.planner5d.library.widget.rate.c condition, @NotNull t3.c source) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(source, "source");
        k.f(this.f258676d, null, null, new c(condition, source, null), 3, null);
    }

    @k1
    public final void l(@NotNull com.planner5d.library.widget.rate.c condition, @NotNull t3.c source, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        k.f(this.f258676d, null, null, new e(callback, this, condition, source, null), 3, null);
    }
}
