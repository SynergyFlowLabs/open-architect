package com.planner5d.library.modules.user.user;

import com.planner5d.library.model.manager.m5;
import com.planner5d.library.model.manager.n5;
import com.planner5d.library.model.manager.q2;
import com.planner5d.library.model.manager.w1;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.model.manager.x2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes9.dex */
@ij.f
@SourceDebugExtension({"SMAP\nUserPurchases.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserPurchases.kt\ncom/planner5d/library/modules/user/user/UserPurchases\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,352:1\n1#2:353\n37#3,2:354\n37#3,2:356\n*S KotlinDebug\n*F\n+ 1 UserPurchases.kt\ncom/planner5d/library/modules/user/user/UserPurchases\n*L\n168#1:354,2\n184#1:356,2\n*E\n"})
public class t0 implements u0, x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f223439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.l f223440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final x2 f223441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final q2 f223442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final zc.b f223443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final w f223444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private n5 f223445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private m5 f223446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private fg.e<com.planner5d.library.model.manager.payments.j> f223447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.payments.p> f223448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final fg.e<g0> f223449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final fg.e<w1> f223450n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.w> f223451o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final Object f223452p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final EnumMap<fd.k, fd.d> f223453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f223454r;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPurchases$getCanUseItem$1", f = "UserPurchases.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.M1}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223455a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f223457c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f223457c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t0.this.new a(this.f223457c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223455a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            n5 n5Var = t0.this.f223445i;
            String str = this.f223457c;
            boolean zA = t0.this.f223446j.a();
            this.f223455a = 1;
            Object objS = n5Var.s(str, true, zA, this);
            return objS == objL ? objL : objS;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPurchases$getCanUseItem$2", f = "UserPurchases.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.P1}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223458a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f223460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f223461d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, boolean z10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f223460c = str;
            this.f223461d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t0.this.new b(this.f223460c, this.f223461d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223458a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            n5 n5Var = t0.this.f223445i;
            String str = this.f223460c;
            boolean z10 = this.f223461d;
            boolean zA = t0.this.f223446j.a();
            this.f223458a = 1;
            Object objS = n5Var.s(str, z10, zA, this);
            return objS == objL ? objL : objS;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPurchases", f = "UserPurchases.kt", i = {}, l = {165}, m = "getUserFreeModels", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f223462a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223464c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223462a = obj;
            this.f223464c |= Integer.MIN_VALUE;
            return t0.this.S(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPurchases$getUserFreeModelsBlocking$1", f = "UserPurchases.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super String[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223465a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t0.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223465a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            t0 t0Var = t0.this;
            this.f223465a = 1;
            Object objS = t0Var.S(this);
            return objS == objL ? objL : objS;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super String[]> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPurchases$getUserPaidModels$idsUnlocked$1", f = "UserPurchases.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super String[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223467a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t0.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223467a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            t0 t0Var = t0.this;
            this.f223467a = 1;
            Object objS = t0Var.S(this);
            return objS == objL ? objL : objS;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super String[]> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPurchases", f = "UserPurchases.kt", i = {0, 0, 0, 1}, l = {com.badlogic.gdx.utils.compression.lzma.a.A, 274}, m = "refreshPaid$suspendImpl", n = {"$this", "user", "notifyIfPaidChanged", "user"}, s = {"L$0", "L$1", "Z$0", "L$0"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f223471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f223472d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f223474f;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223472d = obj;
            this.f223474f |= Integer.MIN_VALUE;
            return t0.a0(t0.this, null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPurchases", f = "UserPurchases.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.W1}, m = "refreshPaidBackground", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f223475a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223477c;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223475a = obj;
            this.f223477c |= Integer.MIN_VALUE;
            return t0.this.b0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPurchases$refreshPaidBackgroundThrowing$2", f = "UserPurchases.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nUserPurchases.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserPurchases.kt\ncom/planner5d/library/modules/user/user/UserPurchases$refreshPaidBackgroundThrowing$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n1#2:353\n*E\n"})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223478a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f223480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f223481d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(id.a aVar, boolean z10, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f223480c = aVar;
            this.f223481d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t0.this.new h(this.f223480c, this.f223481d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223478a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.payments.p pVar = (com.planner5d.library.model.manager.payments.p) t0.this.f223448l.get();
                id.a aVar = this.f223480c;
                this.f223478a = 1;
                obj = pVar.B(aVar, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            fd.o oVar = (fd.o) obj;
            id.a aVar2 = this.f223480c;
            if (aVar2 != null) {
                t0.this.g0(aVar2, oVar, this.f223481d);
            }
            ((w1) t0.this.f223450n.get()).e(true);
            ((g0) t0.this.f223449m.get()).n(this.f223480c, false);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPurchases$refreshPaidIfNeeded$1", f = "UserPurchases.kt", i = {0}, l = {302, 304}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super Unit>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f223483b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ id.a f223485d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(id.a aVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f223485d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = t0.this.new i(this.f223485d, dVar);
            iVar.f223483b = obj;
            return iVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 6
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 1
                int r1 = r6.f223482a
                r2 = 2
                r3 = 4
                r3 = 1
                r5 = 0
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.ResultKt.m(r7)
                goto L65
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1e:
                java.lang.Object r1 = r6.f223483b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.ResultKt.m(r7)
                goto L40
            L26:
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f223483b
                r1 = r7
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                r5 = 0
                com.planner5d.library.modules.user.user.t0 r7 = com.planner5d.library.modules.user.user.t0.this
                r5 = 1
                id.a r4 = r6.f223485d
                r6.f223483b = r1
                r6.f223482a = r3
                r5 = 1
                java.lang.Object r7 = com.planner5d.library.modules.user.user.t0.D(r7, r4, r3, r6)
                if (r7 != r0) goto L40
                goto L64
            L40:
                r5 = 6
                com.planner5d.library.modules.user.user.t0 r7 = com.planner5d.library.modules.user.user.t0.this
                id.a r7 = com.planner5d.library.modules.user.user.t0.v(r7)
                r5 = 6
                if (r7 == 0) goto L53
                boolean r7 = r7.e()
                r5 = 6
                if (r7 != r3) goto L53
                r5 = 4
                goto L65
            L53:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r3 = 0
                r5 = 6
                r6.f223483b = r3
                r5 = 2
                r6.f223482a = r2
                r5 = 6
                java.lang.Object r6 = r1.emit(r7, r6)
                r5 = 7
                if (r6 != r0) goto L65
            L64:
                return r0
            L65:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.modules.user.user.t0.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.flow.j<? super Unit> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPurchases", f = "UserPurchases.kt", i = {}, l = {286}, m = "refreshUser", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f223486a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223488c;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223486a = obj;
            this.f223488c |= Integer.MIN_VALUE;
            return t0.this.e0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPurchases$validateOrderForUser$2", f = "UserPurchases.kt", i = {}, l = {206}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223489a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f223491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ id.a f223492d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(com.planner5d.library.model.payments.a aVar, id.a aVar2, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f223491c = aVar;
            this.f223492d = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t0.this.new k(this.f223491c, this.f223492d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223489a;
            boolean z10 = false | true;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                com.planner5d.library.model.manager.payments.j jVar = (com.planner5d.library.model.manager.payments.j) t0.this.f223447k.get();
                com.planner5d.library.model.payments.a aVar = this.f223491c;
                id.a aVar2 = this.f223492d;
                this.f223489a = 1;
                Object objN = jVar.n(aVar, aVar2, this);
                return objN == objL ? objL : objN;
            } catch (com.planner5d.library.api.e e10) {
                if (e10.a() == com.planner5d.library.api.e.b.NETWORK) {
                    try {
                        fd.d dVarX = t0.this.X(this.f223492d, this.f223491c);
                        Pair<String, Long> pairB = dVarX != null ? dVarX.b(this.f223492d) : null;
                        if (pairB != null && Intrinsics.areEqual(pairB.getFirst(), this.f223491c.d(x.a(this.f223492d)).c())) {
                            return pairB.getSecond();
                        }
                    } catch (com.planner5d.library.model.manager.payments.u.a e11) {
                        timber.log.b.f381052a.e(e11);
                    }
                }
                return null;
            } catch (Throwable th2) {
                if (th2 instanceof CancellationException) {
                    throw th2;
                }
                timber.log.b.f381052a.e(th2);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public t0(@NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull com.planner5d.library.model.manager.builtin.l builtInItemsProvider, @NotNull x2 purchaseUnlocksItemsConfiguration, @NotNull q2 paymentMethodIdProvider, @NotNull zc.b licensingTypeProvider, @NotNull w userAuthorization, @NotNull n5 unlockedItemManager, @NotNull m5 trialUnlockManager, @NotNull fg.e<com.planner5d.library.model.manager.payments.j> paymentManager, @NotNull fg.e<com.planner5d.library.model.manager.payments.p> paymentsRepository, @NotNull fg.e<g0> userPaymentsSynchronizer, @NotNull fg.e<w1> managedFileManager, @NotNull fg.e<com.planner5d.library.model.manager.w> featureConfigManager) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(builtInItemsProvider, "builtInItemsProvider");
        Intrinsics.checkNotNullParameter(purchaseUnlocksItemsConfiguration, "purchaseUnlocksItemsConfiguration");
        Intrinsics.checkNotNullParameter(paymentMethodIdProvider, "paymentMethodIdProvider");
        Intrinsics.checkNotNullParameter(licensingTypeProvider, "licensingTypeProvider");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(unlockedItemManager, "unlockedItemManager");
        Intrinsics.checkNotNullParameter(trialUnlockManager, "trialUnlockManager");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(paymentsRepository, "paymentsRepository");
        Intrinsics.checkNotNullParameter(userPaymentsSynchronizer, "userPaymentsSynchronizer");
        Intrinsics.checkNotNullParameter(managedFileManager, "managedFileManager");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        this.f223439c = preferences;
        this.f223440d = builtInItemsProvider;
        this.f223441e = purchaseUnlocksItemsConfiguration;
        this.f223442f = paymentMethodIdProvider;
        this.f223443g = licensingTypeProvider;
        this.f223444h = userAuthorization;
        this.f223445i = unlockedItemManager;
        this.f223446j = trialUnlockManager;
        this.f223447k = paymentManager;
        this.f223448l = paymentsRepository;
        this.f223449m = userPaymentsSynchronizer;
        this.f223450n = managedFileManager;
        this.f223451o = featureConfigManager;
        this.f223452p = new Object();
        this.f223453q = new EnumMap<>(fd.k.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final id.a J() {
        return this.f223444h.a();
    }

    private final boolean O(id.a aVar) {
        return aVar != null && aVar.e();
    }

    @androidx.annotation.m1
    private final String[] U() {
        String[] strArr = (String[]) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new e(null), 3, null);
        List listListOf = CollectionsKt.listOf(Arrays.copyOf(strArr, strArr.length));
        ArrayList arrayList = new ArrayList();
        for (String str : this.f223440d.b(false, null)) {
            if (!listListOf.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final fd.d W(fd.k kVar) {
        fd.d dVar;
        synchronized (this.f223452p) {
            try {
                if (!this.f223453q.containsKey(kVar)) {
                    this.f223453q.put(kVar, new fd.d(this.f223439c, kVar));
                }
                fd.d dVar2 = this.f223453q.get(kVar);
                Intrinsics.checkNotNull(dVar2);
                dVar = dVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fd.d X(id.a aVar, com.planner5d.library.model.payments.a aVar2) throws com.planner5d.library.model.manager.payments.u.a {
        fd.k kVarI = aVar2.d(x.a(aVar)).i();
        if (kVarI != null) {
            return W(kVarI);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    static /* synthetic */ Object a0(t0 t0Var, id.a aVar, boolean z10, kotlin.coroutines.d<? super id.a> dVar) {
        f fVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f223474f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f223474f = i10 - Integer.MIN_VALUE;
            } else {
                fVar = t0Var.new f(dVar);
            }
        } else {
            fVar = t0Var.new f(dVar);
        }
        Object obj = fVar.f223472d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f223474f;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                fVar.f223469a = t0Var;
                fVar.f223470b = aVar;
                fVar.f223471c = z10;
                fVar.f223474f = 1;
                if (t0Var.e0(aVar, fVar) == objL) {
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                id.a aVar2 = (id.a) fVar.f223469a;
                ResultKt.m(obj);
                return aVar2;
            }
            z10 = fVar.f223471c;
            aVar = (id.a) fVar.f223470b;
            t0Var = (t0) fVar.f223469a;
            ResultKt.m(obj);
            fVar.f223469a = aVar;
            fVar.f223470b = null;
            fVar.f223474f = 2;
            return t0Var.c0(aVar, z10, fVar) == objL ? objL : aVar;
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
            if (th2 instanceof CancellationException) {
                throw th2;
            }
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c0(id.a aVar, boolean z10, kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new h(aVar, z10, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object e0(id.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        j jVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.f223488c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f223488c = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object objL = jVar.f223486a;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = jVar.f223488c;
        try {
            if (i11 == 0) {
                ResultKt.m(objL);
                if (aVar != null) {
                    com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
                    Observable<id.a> observableG = this.f223444h.g(aVar);
                    jVar.f223488c = 1;
                    objL = c0Var.l(observableG, jVar);
                    if (objL == objL2) {
                        return objL2;
                    }
                }
                return Unit.f312394a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objL);
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
        }
        return Unit.f312394a;
    }

    static /* synthetic */ Object h0(t0 t0Var, com.planner5d.library.model.payments.a aVar, id.a aVar2, kotlin.coroutines.d<? super Long> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), t0Var.new k(aVar, aVar2, null), dVar);
    }

    public final boolean F(@Nullable id.a aVar) {
        return b(aVar) || !this.f223441e.a();
    }

    public final int G() {
        id.a aVarJ = J();
        if (aVarJ != null) {
            return aVarJ.b();
        }
        return 0;
    }

    public final int H() {
        return 0;
    }

    @androidx.annotation.m1
    public final boolean I(@Nullable id.a aVar, @Nullable String str, boolean z10) {
        if (this.f223441e.a() && str != null && !b(aVar) && (!this.f223446j.a() || z10)) {
            com.planner5d.library.model.manager.builtin.f1 f1VarA = this.f223440d.a(str);
            if (f1VarA == null || !f1VarA.isFree()) {
                return ((Boolean) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new b(str, z10, null), 3, null)).booleanValue();
            }
            return !z10 || ((Boolean) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new a(str, null), 3, null)).booleanValue();
        }
        return true;
    }

    public final int K(@Nullable id.a aVar) {
        return Math.max(p(aVar), L(aVar));
    }

    public final int L(@Nullable id.a aVar) {
        Pair<String, Long> pairB = W(fd.k.CATALOG).b(aVar);
        if ((pairB != null ? pairB.getFirst() : null) != null && pairB.getSecond() != null) {
            try {
                fd.i iVarE = com.planner5d.library.model.manager.payments.u.e(x.a(aVar), pairB.getFirst());
                Integer numE = iVarE.e();
                if (numE != null) {
                    int iIntValue = numE.intValue();
                    if (iVarE.m()) {
                        return iIntValue;
                    }
                    Long second = pairB.getSecond();
                    Intrinsics.checkNotNull(second);
                    long jLongValue = (second.longValue() + (((long) iIntValue) * 86400000)) - new Date().getTime();
                    if (jLongValue <= 0) {
                        return 0;
                    }
                    return (int) Math.max(1L, jLongValue / 86400000);
                }
            } catch (com.planner5d.library.model.manager.payments.u.a unused) {
            }
        }
        return 0;
    }

    public final boolean M(@Nullable id.a aVar) {
        return R(aVar) > 0;
    }

    public final boolean N() {
        return b(J());
    }

    public final boolean P() {
        zc.a aVarD = this.f223443g.d();
        zc.a aVar = zc.a.None;
        if (aVarD == aVar || !this.f223454r) {
            return aVarD == aVar && this.f223442f.b() == com.planner5d.library.model.payments.paymentmethod.e.a.None;
        }
        return true;
    }

    public final int Q() {
        id.a aVarJ = J();
        if (aVarJ != null) {
            return aVarJ.c();
        }
        return 0;
    }

    public final int R(@Nullable id.a aVar) {
        if (aVar != null && aVar.g()) {
            return Integer.MAX_VALUE;
        }
        if (aVar != null) {
            return aVar.c();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object S(@NotNull kotlin.coroutines.d<? super String[]> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f223464c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f223464c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objG = cVar.f223462a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f223464c;
        if (i11 == 0) {
            ResultKt.m(objG);
            n5 n5Var = this.f223445i;
            cVar.f223464c = 1;
            objG = n5Var.g(null, cVar);
            if (objG == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objG);
        }
        String[] strArr = (String[]) objG;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, Arrays.copyOf(strArr, strArr.length));
        return arrayList.toArray(new String[0]);
    }

    @kotlin.l(message = "use coroutines", replaceWith = @kotlin.b1(expression = "getUserFreeModels()", imports = {}))
    @NotNull
    public final String[] T() {
        return (String[]) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, true, new d(null), 1, null);
    }

    @androidx.annotation.m1
    @Nullable
    public final String V() {
        String[] strArrU = U();
        if (strArrU.length == 0) {
            return null;
        }
        return strArrU[(int) (((double) strArrU.length) * Math.random())];
    }

    public final boolean Y() {
        return true;
    }

    public final boolean Z(@Nullable id.a aVar) {
        return L(aVar) >= 720;
    }

    @Override // com.planner5d.library.modules.user.user.u0
    @androidx.annotation.m1
    public boolean a(@Nullable id.a aVar, @NotNull com.planner5d.library.model.payments.a order, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(order, "order");
        try {
            fd.d dVarX = X(aVar, order);
            if (dVarX != null && dVarX.f(aVar, order.d(x.a(aVar)).c(), l10)) {
                dVarX.g(aVar, order, l10);
                return true;
            }
            return false;
        } catch (com.planner5d.library.model.manager.payments.u.a unused) {
            return false;
        }
    }

    @Override // com.planner5d.library.modules.user.user.u0
    public boolean b(@Nullable id.a aVar) {
        if (!O(aVar) && !u(aVar) && !P()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object b0(@Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        g gVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f223477c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f223477c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f223475a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f223477c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                gVar.f223477c = 1;
                if (c0(aVar, true, gVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
            if (th2 instanceof CancellationException) {
                throw th2;
            }
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.modules.user.user.u0
    public boolean c() {
        return n(J());
    }

    @Override // com.planner5d.library.modules.user.user.u0
    public boolean d(@Nullable id.a aVar) {
        return q(aVar) || Z(aVar);
    }

    @Nullable
    public final kotlinx.coroutines.flow.i<Unit> d0(@Nullable id.a aVar) {
        if (aVar != null && aVar.l()) {
            return kotlinx.coroutines.flow.k.K0(new i(aVar, null));
        }
        return null;
    }

    @Override // com.planner5d.library.modules.user.user.u0
    @Nullable
    public Object f(@Nullable id.a aVar, boolean z10, @NotNull kotlin.coroutines.d<? super id.a> dVar) {
        return a0(this, aVar, z10, dVar);
    }

    public final void f0(boolean z10) {
        this.f223454r = z10;
    }

    @androidx.annotation.m1
    public final void g0(@NotNull id.a user, @Nullable fd.o oVar, boolean z10) {
        Intrinsics.checkNotNullParameter(user, "user");
        synchronized (this.f223452p) {
            try {
                id.a aVarJ = J();
                if (aVarJ != null && aVarJ.f287075a == user.f287075a) {
                    boolean zB = b(user);
                    if (oVar == null) {
                        oVar = user.d().h();
                    }
                    user.h(oVar);
                    this.f223444h.f(user);
                    if (z10 && zB != b(user)) {
                        com.planner5d.library.services.m0.f224435h.t();
                    }
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.modules.user.user.u0
    @Nullable
    public Object h(@NotNull com.planner5d.library.model.payments.a aVar, @Nullable id.a aVar2, @NotNull kotlin.coroutines.d<? super Long> dVar) {
        return h0(this, aVar, aVar2, dVar);
    }

    @Override // com.planner5d.library.modules.user.user.u0
    @NotNull
    public String i(@Nullable id.a aVar) {
        return W(fd.k.CATALOG).c(aVar) + ", " + W(fd.k.RENDERS).c(aVar);
    }

    @Override // com.planner5d.library.modules.user.user.u0
    public boolean j() {
        return m(J());
    }

    @Override // com.planner5d.library.modules.user.user.u0
    public boolean k(@Nullable id.a aVar) {
        return o(aVar) || n(aVar);
    }

    @Override // com.planner5d.library.modules.user.user.u0
    public boolean l() {
        return k(J());
    }

    @Override // com.planner5d.library.modules.user.user.u0
    public boolean m(@Nullable id.a aVar) {
        return o(aVar) || b(aVar);
    }

    @Override // com.planner5d.library.modules.user.user.u0
    public boolean n(@Nullable id.a aVar) {
        return b(aVar);
    }

    @Override // com.planner5d.library.modules.user.user.u0
    public boolean o(@Nullable id.a aVar) {
        return this.f223451o.get().a(com.planner5d.library.model.manager.config.f.ProAndroid) && aVar != null && aVar.g();
    }

    @Override // com.planner5d.library.modules.user.user.u0
    public int p(@Nullable id.a aVar) {
        if (aVar != null) {
            return aVar.a();
        }
        return 0;
    }

    @Override // com.planner5d.library.modules.user.user.u0
    public boolean q(@Nullable id.a aVar) {
        return aVar != null && aVar.f();
    }

    @Override // com.planner5d.library.modules.user.user.u0
    public boolean r() {
        return o(J());
    }

    @Override // com.planner5d.library.modules.user.user.u0
    @androidx.annotation.m1
    public void t(@Nullable id.a aVar, @NotNull fd.k type) {
        Intrinsics.checkNotNullParameter(type, "type");
        synchronized (this.f223452p) {
            W(type).g(aVar, null, null);
            Unit unit = Unit.f312394a;
        }
    }

    @Override // com.planner5d.library.modules.user.user.u0
    public boolean u(@Nullable id.a aVar) {
        return W(fd.k.CATALOG).e(aVar);
    }
}
