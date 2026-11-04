package com.planner5d.library.model.manager;

import android.content.Context;
import com.planner5d.library.model.payments.Payment;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public final class s2 implements x1, t2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.u0 f197721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.j f197722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.payments.paymentmethod.g> f197723e;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.PaymentsManager$getPurchaseInformation$2", f = "PaymentsManager.kt", i = {0}, l = {34}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240"}, s = {"L$3"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super List<String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f197725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f197726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f197727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f197728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f197729f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f197731h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ id.a f197732i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, id.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f197731h = context;
            this.f197732i = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return s2.this.new a(this.f197731h, this.f197732i, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            s2 s2Var;
            List list;
            List list2;
            id.a aVar;
            List list3;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197729f;
            if (i10 == 0) {
                ResultKt.m(obj);
                ArrayList arrayList = new ArrayList();
                s2Var = s2.this;
                Context context = this.f197731h;
                id.a aVar2 = this.f197732i;
                this.f197724a = arrayList;
                this.f197725b = s2Var;
                this.f197726c = aVar2;
                this.f197727d = arrayList;
                this.f197728e = arrayList;
                this.f197729f = 1;
                Object objR = s2Var.r(context, aVar2, this);
                if (objR == objL) {
                    return objL;
                }
                list = arrayList;
                list2 = list;
                aVar = aVar2;
                obj = objR;
                list3 = list2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f197728e;
                list2 = (List) this.f197727d;
                aVar = (id.a) this.f197726c;
                s2Var = (s2) this.f197725b;
                list3 = (List) this.f197724a;
                ResultKt.m(obj);
            }
            list.add(obj);
            list2.add(s2Var.f197721c.i(aVar));
            return list3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<String>> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.PaymentsManager$getPurchaseInformationAsString$2", f = "PaymentsManager.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197733a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f197735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ id.a f197736d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, id.a aVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f197735c = context;
            this.f197736d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return s2.this.new b(this.f197735c, this.f197736d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197733a;
            if (i10 == 0) {
                ResultKt.m(obj);
                s2 s2Var = s2.this;
                Context context = this.f197735c;
                id.a aVar = this.f197736d;
                this.f197733a = 1;
                obj = s2Var.m(context, aVar, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            int i11 = 2 ^ 0;
            return "<br />\nPurchase information: " + CollectionsKt.joinToString$default((Iterable) obj, "<br />", null, null, 0, null, null, 62, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.PaymentsManager", f = "PaymentsManager.kt", i = {}, l = {60}, m = "ordersAsString", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f197737a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f197739c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f197737a = obj;
            this.f197739c |= Integer.MIN_VALUE;
            return s2.this.p(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.PaymentsManager$paymentInformationAsString$2", f = "PaymentsManager.kt", i = {0}, l = {45, 47}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u241"}, s = {"L$3"})
    @SourceDebugExtension({"SMAP\nPaymentsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsManager.kt\ncom/planner5d/library/model/manager/PaymentsManager$paymentInformationAsString$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f197741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f197742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f197743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f197744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f197745f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f197747h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ id.a f197748i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, id.a aVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f197747h = context;
            this.f197748i = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return s2.this.new d(this.f197747h, this.f197748i, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00ed  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            s2 s2Var;
            id.a aVar;
            List listCreateListBuilder;
            List list;
            Object objV;
            s2 s2Var2;
            id.a aVar2;
            List list2;
            Object objP;
            List list3;
            String strJoinToString$default;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197745f;
            if (i10 != 0) {
                if (i10 == 1) {
                    List list4 = (List) this.f197744e;
                    List list5 = (List) this.f197743d;
                    List list6 = (List) this.f197742c;
                    id.a aVar3 = (id.a) this.f197741b;
                    s2 s2Var3 = (s2) this.f197740a;
                    ResultKt.m(obj);
                    s2Var2 = s2Var3;
                    aVar2 = aVar3;
                    list2 = list6;
                    list = list5;
                    listCreateListBuilder = list4;
                    objV = obj;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list3 = (List) this.f197741b;
                    List list7 = (List) this.f197740a;
                    ResultKt.m(obj);
                    listCreateListBuilder = list7;
                    objP = obj;
                }
                list3.add(objP);
                return CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), ", ", null, null, 0, null, null, 62, null);
            }
            ResultKt.m(obj);
            s2Var = s2.this;
            Context context = this.f197747h;
            aVar = this.f197748i;
            listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add(Payment.f222462a.a(s2Var.f197722d.l0().getId().n()));
            if (s2Var.f197722d.l0().getId() == com.planner5d.library.model.payments.paymentmethod.e.a.Google) {
                listCreateListBuilder.add(s2Var.o(context));
                com.planner5d.library.model.payments.paymentmethod.g gVar = (com.planner5d.library.model.payments.paymentmethod.g) s2Var.f197723e.get();
                this.f197740a = s2Var;
                this.f197741b = aVar;
                this.f197742c = listCreateListBuilder;
                this.f197743d = listCreateListBuilder;
                this.f197744e = listCreateListBuilder;
                this.f197745f = 1;
                objV = gVar.v(this);
                if (objV != objL) {
                    list = listCreateListBuilder;
                    s2Var2 = s2Var;
                    aVar2 = aVar;
                    list2 = list;
                }
            } else {
                list = listCreateListBuilder;
                this.f197740a = listCreateListBuilder;
                this.f197741b = list;
                this.f197742c = null;
                this.f197743d = null;
                this.f197744e = null;
                this.f197745f = 2;
                objP = s2Var.p(aVar, this);
                if (objP != objL) {
                    list3 = list;
                    list3.add(objP);
                    return CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), ", ", null, null, 0, null, null, 62, null);
                }
            }
            return objL;
            if (((String[]) objV).length == 0) {
                objV = null;
            }
            String[] strArr = (String[]) objV;
            if (strArr == null || (strJoinToString$default = ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)) == null) {
                strJoinToString$default = "-";
            }
            listCreateListBuilder.add(strJoinToString$default);
            listCreateListBuilder = list2;
            aVar = aVar2;
            s2Var = s2Var2;
            this.f197740a = listCreateListBuilder;
            this.f197741b = list;
            this.f197742c = null;
            this.f197743d = null;
            this.f197744e = null;
            this.f197745f = 2;
            objP = s2Var.p(aVar, this);
            if (objP != objL) {
                list3 = list;
                list3.add(objP);
                return CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), ", ", null, null, 0, null, null, 62, null);
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public s2(@NotNull com.planner5d.library.modules.user.user.u0 userPurchases, @NotNull com.planner5d.library.model.manager.payments.j paymentManager, @NotNull fg.e<com.planner5d.library.model.payments.paymentmethod.g> googlePlayInApp) {
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(googlePlayInApp, "googlePlayInApp");
        this.f197721c = userPurchases;
        this.f197722d = paymentManager;
        this.f197723e = googlePlayInApp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(Context context, id.a aVar, kotlin.coroutines.d<? super String> dVar) {
        int i10 = 5 & 0;
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new b(context, aVar, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o(Context context) {
        String string;
        if (com.planner5d.library.services.utility.h3.S(context)) {
            return "available";
        }
        Integer numT = com.planner5d.library.services.utility.h3.T(context);
        return (numT == null || (string = numT.toString()) == null) ? com.planner5d.library.model.payments.a.f222474i : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object p(id.a aVar, kotlin.coroutines.d<? super String> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f197739c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f197739c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objJ0 = cVar.f197737a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f197739c;
        try {
            if (i11 == 0) {
                ResultKt.m(objJ0);
                com.planner5d.library.model.manager.payments.j jVar = this.f197722d;
                cVar.f197739c = 1;
                objJ0 = jVar.j0(aVar, cVar);
                if (objJ0 == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objJ0);
            }
            return CollectionsKt.joinToString$default((Iterable) objJ0, null, null, null, 0, null, new Function1() { // from class: com.planner5d.library.model.manager.r2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s2.q((com.planner5d.library.model.payments.a) obj);
                }
            }, 31, null);
        } catch (Throwable th2) {
            if (th2 instanceof CancellationException) {
                throw th2;
            }
            timber.log.b.f381052a.e(th2);
            return "e:" + th2.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence q(com.planner5d.library.model.payments.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "'" + it.e() + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(Context context, id.a aVar, kotlin.coroutines.d<? super String> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new d(context, aVar, null), dVar);
    }

    @Override // com.planner5d.library.model.manager.t2
    @Nullable
    public Object a(@NotNull Context context, long j10, @NotNull kotlin.coroutines.d<? super List<String>> dVar) {
        return m(context, new id.a(j10), dVar);
    }

    @Override // com.planner5d.library.model.manager.t2
    @Nullable
    public Object b(@NotNull Context context, long j10, @NotNull kotlin.coroutines.d<? super String> dVar) {
        return n(context, new id.a(j10), dVar);
    }

    @Nullable
    public final Object m(@NotNull Context context, @Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super List<String>> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new a(context, aVar, null), dVar);
    }
}
