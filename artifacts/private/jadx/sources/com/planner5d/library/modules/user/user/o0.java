package com.planner5d.library.modules.user.user;

import com.planner5d.library.model.manager.x1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class o0 implements x1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f223232e = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t0 f223233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f223234d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPromoCodeManager$consumePromoCode$2", f = "UserPromoCodeManager.kt", i = {0}, l = {23, 24}, m = "invokeSuspend", n = {"user"}, s = {"L$1"})
    @SourceDebugExtension({"SMAP\nUserPromoCodeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserPromoCodeManager.kt\ncom/planner5d/library/modules/user/user/UserPromoCodeManager$consumePromoCode$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ id.a f223238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f223239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o0 f223240f;

        /* JADX INFO: renamed from: com.planner5d.library.modules.user.user.o0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserPromoCodeManager$consumePromoCode$2$1$1", f = "UserPromoCodeManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1647a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f223241a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f223242b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f223243c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f223244d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1647a(String str, kotlin.coroutines.d<? super C1647a> dVar) {
                super(3, dVar);
                this.f223244d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f223241a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f223242b).I((id.a) this.f223243c, new JSONObject().put("code", this.f223244d));
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                C1647a c1647a = new C1647a(this.f223244d, dVar);
                c1647a.f223242b = bVar;
                c1647a.f223243c = aVar;
                return c1647a.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(id.a aVar, String str, o0 o0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f223238d = aVar;
            this.f223239e = str;
            this.f223240f = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f223238d, this.f223239e, this.f223240f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:51:0x00be  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        
            if (r13.b0(r1, r9) == r0) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws com.planner5d.library.services.exceptions.ErrorMessageException {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.modules.user.user.o0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public o0(@NotNull t0 userPurchases, @NotNull com.planner5d.library.api.requests.c api) {
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(api, "api");
        this.f223233c = userPurchases;
        this.f223234d = api;
    }

    @Nullable
    public final Object c(@Nullable id.a aVar, @Nullable String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new a(aVar, str, this, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
