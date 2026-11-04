package com.planner5d.library.model.manager;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.superwall.SuperwallEvent;
import com.superwall.sdk.analytics.superwall.SuperwallEventInfo;
import com.superwall.sdk.config.options.SuperwallOptions;
import com.superwall.sdk.delegate.PurchaseResult;
import com.superwall.sdk.delegate.RestorationResult;
import com.superwall.sdk.delegate.SuperwallDelegate;
import com.superwall.sdk.delegate.subscription_controller.PurchaseController;
import com.superwall.sdk.identity.PublicIdentityKt;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.misc.ActivityProvider;
import com.superwall.sdk.models.entitlements.Entitlement;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import com.superwall.sdk.models.internal.RedemptionResult;
import com.superwall.sdk.models.triggers.TriggerResult;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import com.superwall.sdk.paywall.presentation.PaywallPresentationHandler;
import com.superwall.sdk.paywall.presentation.PublicPresentationKt;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallResult;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallSkippedReason;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
@SourceDebugExtension({"SMAP\nSuperwallPurchaseController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuperwallPurchaseController.kt\ncom/planner5d/library/model/manager/SuperwallPurchaseController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,376:1\n1#2:377\n503#3,7:378\n462#3:385\n412#3:386\n1246#4,4:387\n*S KotlinDebug\n*F\n+ 1 SuperwallPurchaseController.kt\ncom/planner5d/library/model/manager/SuperwallPurchaseController\n*L\n229#1:378,7\n229#1:385\n229#1:386\n229#1:387,4\n*E\n"})
public final class m4 implements com.planner5d.library.model.manager.payments.a0, PurchaseController {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final b f191890t = new b(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final String f191891u = "paywall_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f191892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.payments.j> f191893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.activity.helper.l0> f191894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.payments.m> f191895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.w> f191896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.t0> f191897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.h> f191898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final fg.e<w> f191899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final fg.e<c2> f191900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.f1 f191901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.statistics.d0 f191902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.attributes.c f191903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.statistics.events.r3 f191904m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final String f191905n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private WeakReference<Activity> f191906o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final Object f191907p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f191908q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile boolean f191909r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final n f191910s;

    private enum a {
        subscribed,
        never_subscribed,
        subscriptions_expired,
        subscription_will_end;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f191916f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f191916f;
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f191917a;

        static {
            int[] iArr = new int[com.planner5d.library.model.manager.config.purchaseplacement.b.a.values().length];
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.ai_smart_wizard_a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.ai_smart_wizard_b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.ai_designer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.ai_designer_b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.ai_renders.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int i10 = 6 >> 6;
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.upload_plan.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.ai_decorator.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.onboarding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.profile.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.locked_item.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.locked_item_gift.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.locked_edit.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.locked_save.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.editing.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.menu_catalog.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.snapshots.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.textures.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.compare_plans_premium.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.compare_plans_pro.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.export_to_cad.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.pro_4k_render.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.deeplink.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.plan_recognitions.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.ai_chat.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.fallback.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[com.planner5d.library.model.manager.config.purchaseplacement.b.a.unknown.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            f191917a = iArr;
        }
    }

    public static final class d implements ActivityProvider {
        d() {
        }

        @Override // com.superwall.sdk.misc.ActivityProvider
        public Activity getCurrentActivity() {
            return m4.this.B();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.SuperwallPurchaseController", f = "SuperwallPurchaseController.kt", i = {1}, l = {256, com.planner5d.library.engine.input.b.f160571z3}, m = FirebaseAnalytics.c.D, n = {"purchaseResult"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191920b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191922d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191920b = obj;
            this.f191922d |= Integer.MIN_VALUE;
            return m4.this.purchase(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.SuperwallPurchaseController$purchasePremiumPlanner5dApi$2", f = "SuperwallPurchaseController.kt", i = {1, 1, 2}, l = {326, 337, 339}, m = "invokeSuspend", n = {"errorMessage", "product", "errorMessage"}, s = {"L$0", "L$3", "L$0"})
    @SourceDebugExtension({"SMAP\nSuperwallPurchaseController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuperwallPurchaseController.kt\ncom/planner5d/library/model/manager/SuperwallPurchaseController$purchasePremiumPlanner5dApi$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super PurchaseResult>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f191926d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191927e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f191929g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Activity f191930h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f191931i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Activity activity, String str2, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f191929g = str;
            this.f191930h = activity;
            this.f191931i = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m4.this.new f(this.f191929g, this.f191930h, this.f191931i, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:48:0x013a  */
        /* JADX WARN: Code duplicated, block: B:56:0x0159  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List listEmptyList;
            Object next;
            m4 m4Var;
            fd.f fVar;
            String str;
            String str2;
            fd.i iVarK;
            m4 m4Var2;
            long jLongValue;
            Throwable th2;
            String str3;
            String message;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191927e;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.model.manager.payments.j jVar = (com.planner5d.library.model.manager.payments.j) m4.this.f191893b.get();
                    fd.k kVar = fd.k.CATALOG;
                    id.a aVarA = ((com.planner5d.library.modules.user.user.w) m4.this.f191896e.get()).a();
                    com.planner5d.library.model.manager.config.a.EnumC1573a enumC1573a = com.planner5d.library.model.manager.config.a.EnumC1573a.SUPERWALL;
                    this.f191927e = 1;
                    obj = jVar.n0(kVar, aVarA, enumC1573a, this);
                    if (obj == objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = (String) this.f191923a;
                        try {
                            ResultKt.m(obj);
                            return new PurchaseResult.Purchased();
                        } catch (Throwable th3) {
                            th2 = th3;
                            timber.log.b.f381052a.e(th2);
                            message = th2.getMessage();
                            if (message != null) {
                                str3 = message;
                            }
                            return new PurchaseResult.Failed(str3);
                        }
                    }
                    fd.f fVar2 = (fd.f) this.f191926d;
                    String str4 = (String) this.f191925c;
                    m4Var = (m4) this.f191924b;
                    str2 = (String) this.f191923a;
                    ResultKt.m(obj);
                    fVar = fVar2;
                    str = str4;
                    m4Var2 = m4Var;
                    jLongValue = ((Number) obj).longValue();
                    try {
                        this.f191923a = str2;
                        this.f191924b = null;
                        this.f191925c = null;
                        this.f191926d = null;
                        this.f191927e = 3;
                        if (m4Var2.J(jLongValue, fVar, str, this) != objL) {
                            str3 = str2;
                            return new PurchaseResult.Purchased();
                        }
                        return objL;
                    } catch (Throwable th4) {
                        th2 = th4;
                        str3 = str2;
                        timber.log.b.f381052a.e(th2);
                        message = th2.getMessage();
                        if (message != null) {
                            str3 = message;
                        }
                        return new PurchaseResult.Failed(str3);
                    }
                }
                ResultKt.m(obj);
                listEmptyList = ArraysKt.toList((Object[]) obj);
            } catch (Throwable th5) {
                timber.log.b.f381052a.e(th5);
                listEmptyList = CollectionsKt.emptyList();
            }
            String string = m4.this.f191892a.getString(ge.b.q.B9);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String str5 = this.f191929g;
            Iterator it = listEmptyList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                iVarK = ((fd.g) next).f275144a.k();
            } while (!Intrinsics.areEqual(iVarK != null ? iVarK.c() : null, str5));
            fd.g gVar = (fd.g) next;
            if (gVar == null) {
                return new PurchaseResult.Failed(string);
            }
            m4Var = m4.this;
            Activity activity = this.f191930h;
            String str6 = this.f191931i;
            fd.f fVar3 = gVar.f275144a;
            com.planner5d.library.activity.helper.l0 l0Var = (com.planner5d.library.activity.helper.l0) m4Var.f191894c.get();
            id.a aVarA2 = ((com.planner5d.library.modules.user.user.w) m4Var.f191896e.get()).a();
            this.f191923a = string;
            this.f191924b = m4Var;
            this.f191925c = str6;
            this.f191926d = fVar3;
            this.f191927e = 2;
            obj = l0Var.y(aVarA2, activity, fVar3, this);
            if (obj != objL) {
                fVar = fVar3;
                str = str6;
                str2 = string;
                m4Var2 = m4Var;
                jLongValue = ((Number) obj).longValue();
                this.f191923a = str2;
                this.f191924b = null;
                this.f191925c = null;
                this.f191926d = null;
                this.f191927e = 3;
                if (m4Var2.J(jLongValue, fVar, str, this) != objL) {
                    str3 = str2;
                    return new PurchaseResult.Purchased();
                }
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super PurchaseResult> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.SuperwallPurchaseController", f = "SuperwallPurchaseController.kt", i = {0, 0, 0, 1, 1, 1}, l = {225, 226}, m = "registerEvent", n = {"this", "activity", androidx.core.app.w.I0, "this", "activity", androidx.core.app.w.I0}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191935d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191937f;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191935d = obj;
            this.f191937f |= Integer.MIN_VALUE;
            return m4.this.i(null, null, this);
        }
    }

    static final class h implements Function1<PaywallSkippedReason, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d<Unit> f191938a;

        /* JADX WARN: Multi-variable type inference failed */
        h(kotlin.coroutines.d<? super Unit> dVar) {
            this.f191938a = dVar;
        }

        public final void c(PaywallSkippedReason it) {
            Intrinsics.checkNotNullParameter(it, "it");
            kotlin.coroutines.d<Unit> dVar = this.f191938a;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaywallSkippedReason paywallSkippedReason) {
            c(paywallSkippedReason);
            return Unit.f312394a;
        }
    }

    static final class i implements Function1<PaywallInfo, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d<Unit> f191939a;

        /* JADX WARN: Multi-variable type inference failed */
        i(kotlin.coroutines.d<? super Unit> dVar) {
            this.f191939a = dVar;
        }

        public final void c(PaywallInfo it) {
            Intrinsics.checkNotNullParameter(it, "it");
            kotlin.coroutines.d<Unit> dVar = this.f191939a;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaywallInfo paywallInfo) {
            c(paywallInfo);
            return Unit.f312394a;
        }
    }

    static final class j implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d<Unit> f191940a;

        /* JADX WARN: Multi-variable type inference failed */
        j(kotlin.coroutines.d<? super Unit> dVar) {
            this.f191940a = dVar;
        }

        public final void c(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            kotlin.coroutines.d<Unit> dVar = this.f191940a;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    static final class k implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f191941a = new k();

        k() {
        }

        public final void c() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            c();
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.SuperwallPurchaseController", f = "SuperwallPurchaseController.kt", i = {0}, l = {265}, m = "restorePurchases", n = {"this"}, s = {"L$0"})
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191943b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191945d;

        l(kotlin.coroutines.d<? super l> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191943b = obj;
            this.f191945d |= Integer.MIN_VALUE;
            return m4.this.restorePurchases(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.SuperwallPurchaseController$sendAttributions$1", f = "SuperwallPurchaseController.kt", i = {0, 1, 2}, l = {382, 282, 293}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nSuperwallPurchaseController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuperwallPurchaseController.kt\ncom/planner5d/library/model/manager/SuperwallPurchaseController$sendAttributions$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,376:1\n116#2,11:377\n*S KotlinDebug\n*F\n+ 1 SuperwallPurchaseController.kt\ncom/planner5d/library/model/manager/SuperwallPurchaseController$sendAttributions$1\n*L\n281#1:377,11\n*E\n"})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191949d;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m4.this.new m(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00c6 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:26:0x0092, B:28:0x009d, B:31:0x00a5, B:33:0x00ad, B:41:0x00c8, B:36:0x00b8, B:38:0x00bf, B:39:0x00c3, B:40:0x00c6, B:23:0x0077), top: B:50:0x0077 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x00fd  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            m4 m4Var;
            Object objR;
            Throwable th2;
            kotlinx.coroutines.sync.a aVar2;
            com.planner5d.library.model.manager.payments.m.a aVar3;
            a aVar4;
            Map mapCreateMapBuilder;
            Object objA;
            Map map;
            Map map2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191949d;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    aVar = m4.this.f191908q;
                    m4Var = m4.this;
                    this.f191946a = aVar;
                    this.f191947b = m4Var;
                    this.f191949d = 1;
                    if (aVar.h(null, this) != objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        map = (Map) this.f191948c;
                        map2 = (Map) this.f191947b;
                        aVar2 = (kotlinx.coroutines.sync.a) this.f191946a;
                        try {
                            ResultKt.m(obj);
                            map.putAll((Map) obj);
                            PublicIdentityKt.setUserAttributes(Superwall.Companion.getInstance(), MapsKt.build(map2));
                            Unit unit = Unit.f312394a;
                            aVar2.i(null);
                            return unit;
                        } catch (Throwable th3) {
                            th2 = th3;
                            aVar2.i(null);
                            throw th2;
                        }
                    }
                    m4Var = (m4) this.f191947b;
                    kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f191946a;
                    try {
                        ResultKt.m(obj);
                        objR = obj;
                        aVar = aVar5;
                        aVar3 = (com.planner5d.library.model.manager.payments.m.a) objR;
                        m4Var.I();
                        if (!aVar3.l() || aVar3.j()) {
                            aVar4 = a.subscription_will_end;
                        } else if (aVar3.i()) {
                            aVar4 = a.subscribed;
                        } else {
                            aVar4 = aVar3.h() ? a.never_subscribed : a.subscriptions_expired;
                        }
                        mapCreateMapBuilder = MapsKt.createMapBuilder();
                        mapCreateMapBuilder.put("subscription_status", aVar4.name());
                        mapCreateMapBuilder.put("will_end_in_days", kotlin.coroutines.jvm.internal.b.g(aVar3.k()));
                        com.planner5d.library.model.manager.config.attributes.c cVar = m4Var.f191903l;
                        this.f191946a = aVar;
                        this.f191947b = mapCreateMapBuilder;
                        this.f191948c = mapCreateMapBuilder;
                        this.f191949d = 3;
                        objA = cVar.a(this);
                        if (objA != objL) {
                            kotlinx.coroutines.sync.a aVar6 = aVar;
                            obj = objA;
                            aVar2 = aVar6;
                            map = mapCreateMapBuilder;
                            map2 = map;
                            map.putAll((Map) obj);
                            PublicIdentityKt.setUserAttributes(Superwall.Companion.getInstance(), MapsKt.build(map2));
                            Unit unit2 = Unit.f312394a;
                            aVar2.i(null);
                            return unit2;
                        }
                        return objL;
                    } catch (Throwable th4) {
                        th2 = th4;
                        aVar2 = aVar5;
                        aVar2.i(null);
                        throw th2;
                    }
                }
                m4Var = (m4) this.f191947b;
                kotlinx.coroutines.sync.a aVar7 = (kotlinx.coroutines.sync.a) this.f191946a;
                ResultKt.m(obj);
                aVar = aVar7;
                com.planner5d.library.model.manager.payments.m mVar = (com.planner5d.library.model.manager.payments.m) m4Var.f191895d.get();
                this.f191946a = aVar;
                this.f191947b = m4Var;
                this.f191949d = 2;
                objR = mVar.r(this);
                if (objR != objL) {
                    aVar3 = (com.planner5d.library.model.manager.payments.m.a) objR;
                    m4Var.I();
                    if (aVar3.l()) {
                        aVar4 = a.subscription_will_end;
                    } else {
                        aVar4 = a.subscription_will_end;
                    }
                    mapCreateMapBuilder = MapsKt.createMapBuilder();
                    mapCreateMapBuilder.put("subscription_status", aVar4.name());
                    mapCreateMapBuilder.put("will_end_in_days", kotlin.coroutines.jvm.internal.b.g(aVar3.k()));
                    com.planner5d.library.model.manager.config.attributes.c cVar2 = m4Var.f191903l;
                    this.f191946a = aVar;
                    this.f191947b = mapCreateMapBuilder;
                    this.f191948c = mapCreateMapBuilder;
                    this.f191949d = 3;
                    objA = cVar2.a(this);
                    if (objA != objL) {
                        kotlinx.coroutines.sync.a aVar8 = aVar;
                        obj = objA;
                        aVar2 = aVar8;
                        map = mapCreateMapBuilder;
                        map2 = map;
                        map.putAll((Map) obj);
                        PublicIdentityKt.setUserAttributes(Superwall.Companion.getInstance(), MapsKt.build(map2));
                        Unit unit3 = Unit.f312394a;
                        aVar2.i(null);
                        return unit3;
                    }
                }
                return objL;
            } catch (Throwable th5) {
                kotlinx.coroutines.sync.a aVar9 = aVar;
                th2 = th5;
                aVar2 = aVar9;
                aVar2.i(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class n implements SuperwallDelegate {
        n() {
        }

        @Override // com.superwall.sdk.delegate.SuperwallDelegate
        public void didDismissPaywall(PaywallInfo paywallInfo) {
            SuperwallDelegate.DefaultImpls.didDismissPaywall(this, paywallInfo);
        }

        @Override // com.superwall.sdk.delegate.SuperwallDelegate
        public void didPresentPaywall(PaywallInfo paywallInfo) {
            SuperwallDelegate.DefaultImpls.didPresentPaywall(this, paywallInfo);
        }

        @Override // com.superwall.sdk.delegate.SuperwallDelegate
        public void didRedeemLink(RedemptionResult redemptionResult) {
            SuperwallDelegate.DefaultImpls.didRedeemLink(this, redemptionResult);
        }

        @Override // com.superwall.sdk.delegate.SuperwallDelegate
        public void handleCustomPaywallAction(String str) {
            SuperwallDelegate.DefaultImpls.handleCustomPaywallAction(this, str);
        }

        @Override // com.superwall.sdk.delegate.SuperwallDelegate
        public void handleLog(String str, String str2, String str3, Map<String, ? extends Object> map, Throwable th2) {
            SuperwallDelegate.DefaultImpls.handleLog(this, str, str2, str3, map, th2);
        }

        @Override // com.superwall.sdk.delegate.SuperwallDelegate
        public void handleSuperwallEvent(SuperwallEventInfo eventInfo) {
            Intrinsics.checkNotNullParameter(eventInfo, "eventInfo");
            String rawName = eventInfo.getEvent().getRawName();
            if (Intrinsics.areEqual(rawName, m4.this.f191905n)) {
                m4.this.f191904m.M(m4.this.C("experiment", "experiment_id", eventInfo), m4.this.C("variant", "variant_id", eventInfo), "superwall", m4.this.C("result", "result", eventInfo));
            }
            if (((com.planner5d.library.model.manager.h) m4.this.f191898g.get()).i().contains(rawName)) {
                m4.this.f191902k.d(new com.planner5d.library.model.manager.statistics.events.h3(com.planner5d.library.model.manager.statistics.events.a.b.a(com.planner5d.library.model.manager.statistics.events.a.b.b(com.planner5d.library.model.manager.statistics.events.u3.f217525e + rawName)), eventInfo.getParams(), MapsKt.emptyMap()));
            }
        }

        @Override // com.superwall.sdk.delegate.SuperwallDelegate
        public void paywallWillOpenDeepLink(Uri uri) {
            SuperwallDelegate.DefaultImpls.paywallWillOpenDeepLink(this, uri);
        }

        @Override // com.superwall.sdk.delegate.SuperwallDelegate
        public void paywallWillOpenURL(URI uri) {
            SuperwallDelegate.DefaultImpls.paywallWillOpenURL(this, uri);
        }

        @Override // com.superwall.sdk.delegate.SuperwallDelegate
        public void subscriptionStatusDidChange(SubscriptionStatus subscriptionStatus, SubscriptionStatus subscriptionStatus2) {
            SuperwallDelegate.DefaultImpls.subscriptionStatusDidChange(this, subscriptionStatus, subscriptionStatus2);
        }

        @Override // com.superwall.sdk.delegate.SuperwallDelegate
        public void willDismissPaywall(PaywallInfo paywallInfo) {
            SuperwallDelegate.DefaultImpls.willDismissPaywall(this, paywallInfo);
        }

        @Override // com.superwall.sdk.delegate.SuperwallDelegate
        public void willPresentPaywall(PaywallInfo paywallInfo) {
            SuperwallDelegate.DefaultImpls.willPresentPaywall(this, paywallInfo);
        }

        @Override // com.superwall.sdk.delegate.SuperwallDelegate
        public void willRedeemLink() {
            SuperwallDelegate.DefaultImpls.willRedeemLink(this);
        }
    }

    @ij.a
    public m4(@NotNull Application application, @NotNull fg.e<com.planner5d.library.model.manager.payments.j> paymentManager, @NotNull fg.e<com.planner5d.library.activity.helper.l0> helperPayment, @NotNull fg.e<com.planner5d.library.model.manager.payments.m> paymentSubscription, @NotNull fg.e<com.planner5d.library.modules.user.user.w> userAuthorization, @NotNull fg.e<com.planner5d.library.modules.user.user.t0> userPurchases, @NotNull fg.e<com.planner5d.library.model.manager.h> configManager, @NotNull fg.e<w> featureConfigManager, @NotNull fg.e<c2> messageManager, @NotNull com.planner5d.library.services.utility.f1 coroutineScope, @NotNull com.planner5d.library.model.manager.statistics.d0 statisticsManager, @NotNull com.planner5d.library.model.manager.config.attributes.c variationAttributesProvider, @NotNull com.planner5d.library.model.manager.statistics.events.r3 statisticsEventGeneric) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(helperPayment, "helperPayment");
        Intrinsics.checkNotNullParameter(paymentSubscription, "paymentSubscription");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(statisticsManager, "statisticsManager");
        Intrinsics.checkNotNullParameter(variationAttributesProvider, "variationAttributesProvider");
        Intrinsics.checkNotNullParameter(statisticsEventGeneric, "statisticsEventGeneric");
        this.f191892a = application;
        this.f191893b = paymentManager;
        this.f191894c = helperPayment;
        this.f191895d = paymentSubscription;
        this.f191896e = userAuthorization;
        this.f191897f = userPurchases;
        this.f191898g = configManager;
        this.f191899h = featureConfigManager;
        this.f191900i = messageManager;
        this.f191901j = coroutineScope;
        this.f191902k = statisticsManager;
        this.f191903l = variationAttributesProvider;
        this.f191904m = statisticsEventGeneric;
        this.f191905n = new SuperwallEvent.TriggerFire("", TriggerResult.PlacementNotFound.INSTANCE).getRawName();
        this.f191906o = new WeakReference<>(null);
        this.f191907p = new Object();
        this.f191908q = kotlinx.coroutines.sync.g.b(false, 1, null);
        this.f191910s = new n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity B() {
        Activity activity;
        synchronized (this.f191907p) {
            try {
                activity = this.f191906o.get();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String C(String str, String str2, SuperwallEventInfo superwallEventInfo) {
        return com.planner5d.library.model.manager.statistics.events.u3.f217525e + str + "_" + superwallEventInfo.getParams().get(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(kotlin.jvm.internal.i1.a aVar, PaywallInfo info, PaywallResult result) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(result, "result");
        aVar.f312744a = true;
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(com.planner5d.library.services.utility.w2 w2Var, m4 m4Var, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function2 function2 = (Function2) w2Var.a();
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, Boolean.valueOf(m4Var.f191897f.get().b(m4Var.f191896e.get().a())));
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(com.planner5d.library.services.utility.w2 w2Var, kotlin.jvm.internal.i1.a aVar, Superwall superwall) {
        Function2 function2 = (Function2) w2Var.a();
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(aVar.f312744a), Boolean.valueOf(superwall.getSubscriptionStatus().getValue() instanceof SubscriptionStatus.Active));
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G(String str, String str2, kotlin.coroutines.d<? super PurchaseResult> dVar) {
        Activity activityB = B();
        return activityB == null ? new PurchaseResult.Cancelled() : kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.b(), new f(str, activityB, str2, null), dVar);
    }

    private final void H(Activity activity) {
        synchronized (this.f191907p) {
            try {
                if (!Intrinsics.areEqual(this.f191906o.get(), activity)) {
                    this.f191906o = new WeakReference<>(activity);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        boolean zN = this.f191897f.get().N();
        boolean zC = this.f191897f.get().c();
        boolean zR = this.f191897f.get().r();
        ArrayList arrayList = new ArrayList();
        if (zR) {
            arrayList.add(new Entitlement("pro"));
        } else if (zN || zC) {
            arrayList.add(new Entitlement("Premium"));
        }
        Superwall.Companion.getInstance().setSubscriptionStatus((zN || zC || zR) ? new SubscriptionStatus.Active(CollectionsKt.toSet(arrayList)) : SubscriptionStatus.Inactive.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object J(long j10, fd.f fVar, String str, kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objZ = this.f191894c.get().z(this.f191896e.get().a(), j10, fVar, false, str, dVar);
        return objZ == kotlin.coroutines.intrinsics.b.l() ? objZ : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    public void b(@NotNull com.planner5d.library.model.manager.statistics.g0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        if (isEnabled() && this.f191909r) {
            if (user instanceof com.planner5d.library.model.manager.statistics.g0.b) {
                PublicIdentityKt.identify$default(Superwall.Companion.getInstance(), String.valueOf(((com.planner5d.library.model.manager.statistics.g0.b) user).a().longValue()), null, 2, null);
            }
            g();
        }
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    public boolean c() {
        return this.f191897f.get().c();
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    public void d(@NotNull Activity activity, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a placement, @NotNull Function2<? super Boolean, ? super Boolean, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        if (!isEnabled()) {
            Boolean bool = Boolean.FALSE;
            onComplete.invoke(bool, bool);
            return;
        }
        H(activity);
        final kotlin.jvm.internal.i1.a aVar = new kotlin.jvm.internal.i1.a();
        final com.planner5d.library.services.utility.w2 w2Var = new com.planner5d.library.services.utility.w2(onComplete);
        PaywallPresentationHandler paywallPresentationHandler = new PaywallPresentationHandler();
        paywallPresentationHandler.onDismiss(new Function2() { // from class: com.planner5d.library.model.manager.j4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return m4.D(aVar, (PaywallInfo) obj, (PaywallResult) obj2);
            }
        });
        paywallPresentationHandler.onError(new Function1() { // from class: com.planner5d.library.model.manager.k4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m4.E(w2Var, this, (Throwable) obj);
            }
        });
        final Superwall companion = Superwall.Companion.getInstance();
        PublicPresentationKt.register$default(companion, f191891u + placement.name(), null, paywallPresentationHandler, new Function0() { // from class: com.planner5d.library.model.manager.l4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m4.F(w2Var, aVar, companion);
            }
        }, 2, null);
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    @Nullable
    public com.planner5d.library.model.manager.statistics.events.y3.c e(@NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        switch (c.f191917a[placement.ordinal()]) {
            case 1:
            case 2:
                return com.planner5d.library.model.manager.statistics.events.y3.c.smart_wizard;
            case 3:
            case 4:
                return com.planner5d.library.model.manager.statistics.events.y3.c.ai_designer;
            case 5:
                return com.planner5d.library.model.manager.statistics.events.y3.c.ai_renders;
            case 6:
                return com.planner5d.library.model.manager.statistics.events.y3.c.upload_plan;
            case 7:
                return com.planner5d.library.model.manager.statistics.events.y3.c.ai_decorator;
            case 8:
                return com.planner5d.library.model.manager.statistics.events.y3.c.onboarding;
            case 9:
                return com.planner5d.library.model.manager.statistics.events.y3.c.profile;
            case 10:
                return com.planner5d.library.model.manager.statistics.events.y3.c.locked_item;
            case 11:
                return com.planner5d.library.model.manager.statistics.events.y3.c.locked_item_gift;
            case 12:
                return com.planner5d.library.model.manager.statistics.events.y3.c.locked_save;
            case 13:
                return com.planner5d.library.model.manager.statistics.events.y3.c.locked_save;
            case 14:
                return com.planner5d.library.model.manager.statistics.events.y3.c.editing;
            case 15:
                return com.planner5d.library.model.manager.statistics.events.y3.c.menu_catalog;
            case 16:
                return com.planner5d.library.model.manager.statistics.events.y3.c.snapshot;
            case 17:
                return com.planner5d.library.model.manager.statistics.events.y3.c.textures;
            case 18:
                return com.planner5d.library.model.manager.statistics.events.y3.c.compare_plans;
            case 19:
                return com.planner5d.library.model.manager.statistics.events.y3.c.compare_plans;
            case 20:
                return com.planner5d.library.model.manager.statistics.events.y3.c.export_to_cad;
            case 21:
                return com.planner5d.library.model.manager.statistics.events.y3.c.f217739w;
            case 22:
                return com.planner5d.library.model.manager.statistics.events.y3.c.deeplink;
            case 23:
                return com.planner5d.library.model.manager.statistics.events.y3.c.plan_recognitions;
            case 24:
                return com.planner5d.library.model.manager.statistics.events.y3.c.ai_chat;
            case 25:
            case 26:
                return null;
            default:
                throw new kotlin.k0();
        }
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    public boolean f(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (isEnabled() && this.f191909r) {
            Object objM14handleDeepLinkIoAF18A = Superwall.Companion.getInstance().m14handleDeepLinkIoAF18A(uri);
            if (Result.m786isFailureimpl(objM14handleDeepLinkIoAF18A)) {
                objM14handleDeepLinkIoAF18A = null;
            }
            if (Intrinsics.areEqual(objM14handleDeepLinkIoAF18A, Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    public void g() {
        if (isEnabled() && this.f191909r) {
            kotlinx.coroutines.k.f(this.f191901j, com.planner5d.library.services.utility.s.f229729a.h(), null, new m(null), 2, null);
        }
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    public void h() {
        if (isEnabled()) {
            SuperwallOptions superwallOptions = new SuperwallOptions();
            superwallOptions.getLogging().setLevel(LogLevel.none);
            superwallOptions.getLogging().getScopes().clear();
            Superwall.Companion companion = Superwall.Companion;
            Application application = this.f191892a;
            String string = application.getString(ge.b.q.ut);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            int i10 = 4 << 0;
            Superwall.Companion.configure$default(companion, application, string, this, superwallOptions, new d(), null, 32, null);
            Superwall companion2 = companion.getInstance();
            companion2.setDelegate(this.f191910s);
            companion2.preloadAllPaywalls();
            I();
            this.f191909r = true;
            id.a aVarA = this.f191896e.get().a();
            b(aVarA != null ? new com.planner5d.library.model.manager.statistics.g0.b(aVarA.f287075a) : com.planner5d.library.model.manager.statistics.g0.a.f217777b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0158, code lost:
    
        if (r6 == r1) goto L41;
     */
    @Override // com.planner5d.library.model.manager.payments.a0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(@org.jetbrains.annotations.NotNull android.app.Activity r7, @org.jetbrains.annotations.NotNull com.planner5d.library.model.manager.statistics.events.h3 r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.m4.i(android.app.Activity, com.planner5d.library.model.manager.statistics.events.h3, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.model.manager.payments.a0
    public boolean isEnabled() {
        return this.f191899h.get().a(com.planner5d.library.model.manager.config.f.Superwall);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.superwall.sdk.delegate.subscription_controller.PurchaseController
    @Nullable
    public Object purchase(@NotNull Activity activity, @NotNull com.android.billingclient.api.z zVar, @Nullable String str, @Nullable String str2, @NotNull kotlin.coroutines.d<? super PurchaseResult> dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f191922d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f191922d = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objG = eVar.f191920b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f191922d;
        if (i11 == 0) {
            ResultKt.m(objG);
            String strD = zVar.d();
            String strN = com.planner5d.library.model.manager.config.purchaseplacement.b.a.unknown.n();
            eVar.f191922d = 1;
            objG = G(strD, strN, eVar);
            if (objG != objL) {
            }
            return objL;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PurchaseResult purchaseResult = (PurchaseResult) eVar.f191919a;
            ResultKt.m(objG);
            return purchaseResult;
        }
        ResultKt.m(objG);
        PurchaseResult purchaseResult2 = (PurchaseResult) objG;
        if (Intrinsics.areEqual(purchaseResult2, new PurchaseResult.Purchased())) {
            Superwall.Companion.getInstance().setSubscriptionStatus(new SubscriptionStatus.Active(SetsKt.emptySet()));
        }
        Superwall companion = Superwall.Companion.getInstance();
        eVar.f191919a = purchaseResult2;
        eVar.f191922d = 2;
        if (PublicPresentationKt.dismiss(companion, eVar) != objL) {
            return purchaseResult2;
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.superwall.sdk.delegate.subscription_controller.PurchaseController
    @Nullable
    public Object restorePurchases(@NotNull kotlin.coroutines.d<? super RestorationResult> dVar) {
        l lVar;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i10 = lVar.f191945d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f191945d = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(dVar);
            }
        } else {
            lVar = new l(dVar);
        }
        Object obj = lVar.f191943b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = lVar.f191945d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.payments.j jVar = this.f191893b.get();
                id.a aVarA = this.f191896e.get().a();
                lVar.f191942a = this;
                lVar.f191945d = 1;
                if (jVar.A0(aVarA, lVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (m4) lVar.f191942a;
                ResultKt.m(obj);
            }
            return new RestorationResult.Restored();
        } catch (Throwable th2) {
            this.f191900i.get().c(th2);
            return new RestorationResult.Failed(th2);
        }
    }
}
