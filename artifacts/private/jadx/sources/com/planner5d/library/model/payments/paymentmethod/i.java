package com.planner5d.library.model.payments.paymentmethod;

import com.planner5d.library.modules.user.user.u0;
import com.planner5d.library.services.utility.s;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@ij.f
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f222732c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final fd.k[] f222733d = {fd.k.CATALOG, fd.k.RENDERS};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u0 f222734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.k f222735b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.PaymentMethodInAppPaidSetter$setPaid$2", f = "PaymentMethodInAppPaidSetter.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.C0, 78}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ id.a f222737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.payments.a f222738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f222739d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(id.a aVar, com.planner5d.library.model.payments.a aVar2, i iVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f222737b = aVar;
            this.f222738c = aVar2;
            this.f222739d = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f222737b, this.f222738c, this.f222739d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
        
            if (r10.k(r1, r9) == r0) goto L35;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 203
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.payments.paymentmethod.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.payments.paymentmethod.PaymentMethodInAppPaidSetter$updatePaid$2", f = "PaymentMethodInAppPaidSetter.kt", i = {0, 0, 1, 1}, l = {39, 43}, m = "invokeSuspend", n = {"paid", "type", "paid", "type"}, s = {"L$0", "L$2", "L$0", "L$2"})
    @SourceDebugExtension({"SMAP\nPaymentMethodInAppPaidSetter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodInAppPaidSetter.kt\ncom/planner5d/library/model/payments/paymentmethod/PaymentMethodInAppPaidSetter$updatePaid$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,86:1\n13409#2,2:87\n*S KotlinDebug\n*F\n+ 1 PaymentMethodInAppPaidSetter.kt\ncom/planner5d/library/model/payments/paymentmethod/PaymentMethodInAppPaidSetter$updatePaid$2\n*L\n55#1:87,2\n*E\n"})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f222742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f222743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<com.planner5d.library.model.payments.a> f222744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ id.a f222745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i f222746g;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f222747a;

            static {
                int[] iArr = new int[fd.k.values().length];
                try {
                    iArr[fd.k.CATALOG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fd.k.RENDERS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f222747a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<com.planner5d.library.model.payments.a> list, id.a aVar, i iVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f222744e = list;
            this.f222745f = aVar;
            this.f222746g = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f222744e, this.f222745f, this.f222746g, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0059  */
        /* JADX WARN: Code duplicated, block: B:24:0x007b  */
        /* JADX WARN: Code duplicated, block: B:25:0x007e A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x001c, B:35:0x00af, B:22:0x0069, B:30:0x008f, B:32:0x0099, B:38:0x00bc, B:40:0x00c8, B:44:0x00e0, B:46:0x00e9, B:25:0x007e, B:37:0x00b8, B:14:0x003c), top: B:62:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00c8 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x001c, B:35:0x00af, B:22:0x0069, B:30:0x008f, B:32:0x0099, B:38:0x00bc, B:40:0x00c8, B:44:0x00e0, B:46:0x00e9, B:25:0x007e, B:37:0x00b8, B:14:0x003c), top: B:62:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00e9 A[Catch: all -> 0x0022, PHI: r1 r4 r5
          0x00e9: PHI (r1v3 fd.k) = (r1v4 fd.k), (r1v9 fd.k) binds: [B:45:0x00e7, B:39:0x00c6] A[DONT_GENERATE, DONT_INLINE]
          0x00e9: PHI (r4v1 java.util.Iterator<com.planner5d.library.model.payments.a>) = 
          (r4v2 java.util.Iterator<com.planner5d.library.model.payments.a>)
          (r4v3 java.util.Iterator<com.planner5d.library.model.payments.a>)
         binds: [B:45:0x00e7, B:39:0x00c6] A[DONT_GENERATE, DONT_INLINE]
          0x00e9: PHI (r5v1 java.util.List) = (r5v2 java.util.List), (r5v3 java.util.List) binds: [B:45:0x00e7, B:39:0x00c6] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x001c, B:35:0x00af, B:22:0x0069, B:30:0x008f, B:32:0x0099, B:38:0x00bc, B:40:0x00c8, B:44:0x00e0, B:46:0x00e9, B:25:0x007e, B:37:0x00b8, B:14:0x003c), top: B:62:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x0069 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x00bc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:71:0x0052 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ab -> B:35:0x00af). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e7 -> B:17:0x0052). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00ec -> B:17:0x0052). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.payments.paymentmethod.i.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public i(@NotNull u0 userPurchases, @NotNull com.planner5d.library.model.manager.payments.k paymentManager) {
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        this.f222734a = userPurchases;
        this.f222735b = paymentManager;
    }

    @Nullable
    public final Object d(@NotNull com.planner5d.library.model.payments.a aVar, @Nullable id.a aVar2, @NotNull kotlin.coroutines.d<? super Boolean> dVar) throws Exception {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new b(aVar2, aVar, this, null), dVar);
    }

    @Nullable
    public final Object e(@NotNull List<com.planner5d.library.model.payments.a> list, @Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(s.f229729a.d(), new c(list, aVar, this, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
