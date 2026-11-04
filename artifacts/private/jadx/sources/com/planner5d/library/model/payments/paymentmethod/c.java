package com.planner5d.library.model.payments.paymentmethod;

import androidx.annotation.l1;
import com.planner5d.library.model.manager.payments.u;
import com.planner5d.library.modules.user.user.u0;
import com.planner5d.library.services.m0;
import fd.o;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.payments.paymentmethod.a f222487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.k f222488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final i f222489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final u0 f222490d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.OrdersSender", f = "OrdersSender.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3}, l = {60, 72, com.planner5d.library.engine.input.f.b.f160725s, 80}, m = "assignOrdersAndUpdatePaid", n = {"this", AttributeType.LIST, "user", "consumed", "assigned", "order", "this", "user", "consumed", "assigned", "this", "user", "consumed", "assigned", "consumed", "assigned"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f222493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f222496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f222497g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f222498h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f222499i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f222501k;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222499i = obj;
            this.f222501k |= Integer.MIN_VALUE;
            return c.this.c(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.OrdersSender", f = "OrdersSender.kt", i = {0, 0, 0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.f160690g0}, m = "assignUnconsumedFinishedOrders", n = {"this", AttributeType.LIST, "user", "assigned", "order"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f222504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f222507f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f222508g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f222509h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f222511j;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222509h = obj;
            this.f222511j |= Integer.MIN_VALUE;
            return c.this.d(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.payments.paymentmethod.c$c, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.OrdersSender", f = "OrdersSender.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {28, 33}, m = "validateAndAssignOrders", n = {"this", "user", "originalPurchasedStatus", "this", "user", "originalPurchasedStatus", "updatedOrders"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class C1634c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f222514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222515d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f222516e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f222518g;

        C1634c(kotlin.coroutines.d<? super C1634c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222516e = obj;
            this.f222518g |= Integer.MIN_VALUE;
            int i10 = 7 | 0;
            return c.this.g(null, null, this);
        }
    }

    public c(@NotNull com.planner5d.library.model.payments.paymentmethod.a orderAssigner, @NotNull com.planner5d.library.model.manager.payments.k paymentManager, @NotNull i paymentSetter, @NotNull u0 userPurchases) {
        Intrinsics.checkNotNullParameter(orderAssigner, "orderAssigner");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(paymentSetter, "paymentSetter");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        this.f222487a = orderAssigner;
        this.f222488b = paymentManager;
        this.f222489c = paymentSetter;
        this.f222490d = userPurchases;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:39:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x0184  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00eb -> B:34:0x00f3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(com.planner5d.library.model.payments.a[] r18, id.a r19, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.payments.paymentmethod.c.c(com.planner5d.library.model.payments.a[], id.a, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0076  */
    /* JADX WARN: Code duplicated, block: B:18:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0094  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0094 -> B:20:0x009a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(com.planner5d.library.model.payments.a[] r12, id.a r13, kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> r14) {
        /*
            r11 = this;
            r10 = 5
            boolean r0 = r14 instanceof com.planner5d.library.model.payments.paymentmethod.c.b
            r10 = 0
            if (r0 == 0) goto L1a
            r0 = r14
            r10 = 7
            com.planner5d.library.model.payments.paymentmethod.c$b r0 = (com.planner5d.library.model.payments.paymentmethod.c.b) r0
            int r1 = r0.f222511j
            r10 = 2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 6
            r3 = r1 & r2
            r10 = 1
            if (r3 == 0) goto L1a
            int r1 = r1 - r2
            r10 = 4
            r0.f222511j = r1
            goto L1f
        L1a:
            com.planner5d.library.model.payments.paymentmethod.c$b r0 = new com.planner5d.library.model.payments.paymentmethod.c$b
            r0.<init>(r14)
        L1f:
            java.lang.Object r14 = r0.f222509h
            r10 = 5
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f222511j
            r3 = 0
            r10 = 5
            r4 = 1
            if (r2 == 0) goto L61
            if (r2 != r4) goto L59
            int r11 = r0.f222508g
            int r12 = r0.f222507f
            java.lang.Object r13 = r0.f222506e
            com.planner5d.library.model.payments.a r13 = (com.planner5d.library.model.payments.a) r13
            java.lang.Object r2 = r0.f222505d
            fd.a r2 = (fd.a) r2
            r10 = 2
            java.lang.Object r5 = r0.f222504c
            r10 = 5
            id.a r5 = (id.a) r5
            java.lang.Object r6 = r0.f222503b
            com.planner5d.library.model.payments.a[] r6 = (com.planner5d.library.model.payments.a[]) r6
            r10 = 6
            java.lang.Object r7 = r0.f222502a
            com.planner5d.library.model.payments.paymentmethod.c r7 = (com.planner5d.library.model.payments.paymentmethod.c) r7
            r10 = 7
            kotlin.ResultKt.m(r14)
            r9 = r13
            r10 = 7
            r13 = r12
            r12 = r7
            r7 = r2
            r2 = r0
            r0 = r6
            r0 = r6
            r6 = r9
            r10 = 6
            goto L9a
        L59:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L61:
            kotlin.ResultKt.m(r14)
            fd.a r14 = new fd.a
            r14.<init>()
            r10 = 3
            int r2 = r12.length
            r5 = r14
            r14 = r12
            r12 = r11
            r10 = 3
            r11 = r2
            r2 = r0
            r0 = r13
            r10 = 1
            r13 = r3
        L74:
            if (r13 >= r11) goto Laa
            r6 = r14[r13]
            r10 = 3
            com.planner5d.library.model.payments.paymentmethod.a r7 = r12.f222487a
            r2.f222502a = r12
            r2.f222503b = r14
            r2.f222504c = r0
            r2.f222505d = r5
            r2.f222506e = r6
            r2.f222507f = r13
            r2.f222508g = r11
            r2.f222511j = r4
            r10 = 1
            java.lang.Object r7 = r7.l(r0, r6, r3, r2)
            r10 = 7
            if (r7 != r1) goto L94
            return r1
        L94:
            r9 = r0
            r0 = r14
            r14 = r7
            r7 = r5
            r7 = r5
            r5 = r9
        L9a:
            r10 = 1
            com.planner5d.library.model.payments.paymentmethod.b r8 = com.planner5d.library.model.payments.paymentmethod.b.ORDER_ASSIGNED
            r10 = 5
            if (r14 != r8) goto La3
            r7.a(r6)
        La3:
            r10 = 3
            int r13 = r13 + r4
            r14 = r0
            r0 = r5
            r5 = r7
            r10 = 7
            goto L74
        Laa:
            com.planner5d.library.model.payments.a[] r11 = r5.f()
            r10 = 6
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.payments.paymentmethod.c.d(com.planner5d.library.model.payments.a[], id.a, kotlin.coroutines.d):java.lang.Object");
    }

    private final com.planner5d.library.model.payments.a[] e(com.planner5d.library.model.payments.a[] aVarArr) {
        fd.a aVar = new fd.a();
        for (com.planner5d.library.model.payments.a aVar2 : aVarArr) {
            try {
                if (!aVar2.d(0L).n()) {
                    aVar.a(aVar2);
                }
            } catch (u.a e10) {
                timber.log.b.f381052a.e(e10);
            }
        }
        return aVar.f();
    }

    @l1
    public final void f() {
        m0.f224435h.t();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b8 A[Catch: all -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0047, blocks: (B:13:0x0041, B:38:0x00b8), top: B:61:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object g(@NotNull com.planner5d.library.model.payments.a[] aVarArr, @Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.payments.a[]> dVar) throws Exception {
        C1634c c1634c;
        o oVar;
        c cVar;
        Throwable th2;
        com.planner5d.library.model.payments.a[] aVarArrE;
        o oVarD;
        if (dVar instanceof C1634c) {
            c1634c = (C1634c) dVar;
            int i10 = c1634c.f222518g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1634c.f222518g = i10 - Integer.MIN_VALUE;
            } else {
                c1634c = new C1634c(dVar);
            }
        } else {
            c1634c = new C1634c(dVar);
        }
        Object obj = c1634c.f222516e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c1634c.f222518g;
        if (i11 == 0) {
            ResultKt.m(obj);
            o oVarD2 = aVar != null ? aVar.d() : null;
            c1634c.f222512a = this;
            c1634c.f222513b = aVar;
            c1634c.f222514c = oVarD2;
            c1634c.f222518g = 1;
            Object objC = c(aVarArr, aVar, c1634c);
            if (objC != objL) {
                o oVar2 = oVarD2;
                obj = objC;
                oVar = oVar2;
            }
            return objL;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVarArrE = (com.planner5d.library.model.payments.a[]) c1634c.f222515d;
            oVar = (o) c1634c.f222514c;
            aVar = (id.a) c1634c.f222513b;
            cVar = (c) c1634c.f222512a;
            try {
                ResultKt.m(obj);
                if (obj == null) {
                    aVarArrE = cVar.e(aVarArrE);
                }
                oVarD = aVar != null ? aVar.d() : null;
                if (oVarD != null && oVar != null && !oVarD.o(oVar)) {
                    cVar.f();
                }
                return aVarArrE;
            } catch (Throwable th3) {
                th2 = th3;
                oVarD = aVar != null ? aVar.d() : null;
                if (oVarD != null) {
                    throw th2;
                }
                throw th2;
            }
        }
        o oVar3 = (o) c1634c.f222514c;
        aVar = (id.a) c1634c.f222513b;
        c cVar2 = (c) c1634c.f222512a;
        ResultKt.m(obj);
        oVar = oVar3;
        this = cVar2;
        com.planner5d.library.model.payments.a[] aVarArr2 = (com.planner5d.library.model.payments.a[]) obj;
        if (aVarArr2.length == 0) {
            return new com.planner5d.library.model.payments.a[0];
        }
        try {
            u0 u0Var = this.f222490d;
            c1634c.f222512a = this;
            c1634c.f222513b = aVar;
            c1634c.f222514c = oVar;
            c1634c.f222515d = aVarArr2;
            c1634c.f222518g = 2;
            Object objF = u0Var.f(aVar, false, c1634c);
            if (objF != objL) {
                cVar = this;
                aVarArrE = aVarArr2;
                obj = objF;
                if (obj == null) {
                    aVarArrE = cVar.e(aVarArrE);
                }
                if (aVar != null) {
                }
                if (oVarD != null) {
                    cVar.f();
                }
                return aVarArrE;
            }
            return objL;
        } catch (Throwable th4) {
            cVar = this;
            th2 = th4;
            if (aVar != null) {
            }
            if (oVarD != null || oVar == null || oVarD.o(oVar)) {
                throw th2;
            }
            cVar.f();
            throw th2;
        }
    }
}
