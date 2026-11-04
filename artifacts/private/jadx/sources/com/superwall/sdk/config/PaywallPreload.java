package com.superwall.sdk.config;

import android.content.Context;
import com.superwall.sdk.dependencies.RequestFactory;
import com.superwall.sdk.dependencies.RuleAttributesFactory;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.misc.ScopesKt;
import com.superwall.sdk.models.config.Config;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.triggers.Trigger;
import com.superwall.sdk.paywall.manager.PaywallManager;
import com.superwall.sdk.paywall.presentation.rule_logic.javascript.RuleEvaluator;
import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.paywall.view.webview.SWWebViewKt;
import com.superwall.sdk.storage.LocalStorage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPaywallPreload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallPreload.kt\ncom/superwall/sdk/config/PaywallPreload\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n774#2:171\n865#2,2:172\n1557#2:174\n1628#2,3:175\n1557#2:178\n1628#2,3:179\n774#2:182\n865#2,2:183\n1557#2:185\n1628#2,3:186\n1863#2,2:189\n*S KotlinDebug\n*F\n+ 1 PaywallPreload.kt\ncom/superwall/sdk/config/PaywallPreload\n*L\n71#1:171\n71#1:172,2\n148#1:174\n148#1:175,3\n151#1:178\n151#1:179,3\n159#1:182\n159#1:183,2\n163#1:185\n163#1:186,3\n165#1:189,2\n*E\n"})
public final class PaywallPreload {

    @NotNull
    private final Assignments assignments;

    @Nullable
    private p2 currentPreloadingTask;

    @NotNull
    private final Factory factory;

    @NotNull
    private final PaywallManager paywallManager;

    @NotNull
    private final IOScope scope;

    @NotNull
    private final LocalStorage storage;

    public interface Factory extends RequestFactory, RuleAttributesFactory, RuleEvaluator.Factory {
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.PaywallPreload$preloadAllPaywalls$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.PaywallPreload$preloadAllPaywalls$2", f = "PaywallPreload.kt", i = {}, l = {46, 54, 60}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Config $config;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, Config config, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$context = context;
            this.$config = config;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallPreload.this.new AnonymousClass2(this.$context, this.$config, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
        
            if (r11.preloadPaywalls((java.util.Set) r12, r9) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r10 = 5
                int r1 = r11.label
                r2 = 3
                r3 = 2
                r4 = 1
                r10 = 5
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L28
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                r10 = 5
                kotlin.ResultKt.m(r12)
                r9 = r11
                r10 = 2
                goto L8a
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L22:
                kotlin.ResultKt.m(r12)
                r9 = r11
                r9 = r11
                goto L7a
            L28:
                r10 = 0
                kotlin.ResultKt.m(r12)
                goto L43
            L2d:
                kotlin.ResultKt.m(r12)
                r10 = 1
                com.superwall.sdk.config.PaywallPreload r12 = com.superwall.sdk.config.PaywallPreload.this
                com.superwall.sdk.config.PaywallPreload$Factory r12 = r12.getFactory()
                android.content.Context r1 = r11.$context
                r11.label = r4
                java.lang.Object r12 = r12.provideRuleEvaluator(r1, r11)
                r10 = 1
                if (r12 != r0) goto L43
                goto L89
            L43:
                r8 = r12
                r8 = r12
                com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating r8 = (com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating) r8
                com.superwall.sdk.config.ConfigLogic r4 = com.superwall.sdk.config.ConfigLogic.INSTANCE
                com.superwall.sdk.models.config.Config r12 = r11.$config
                java.util.Set r12 = r12.getTriggers()
                com.superwall.sdk.models.config.Config r1 = r11.$config
                com.superwall.sdk.models.config.PreloadingDisabled r1 = r1.getPreloadingDisabled()
                java.util.Set r5 = r4.filterTriggers(r12, r1)
                com.superwall.sdk.config.PaywallPreload r12 = com.superwall.sdk.config.PaywallPreload.this
                com.superwall.sdk.storage.LocalStorage r12 = r12.getStorage()
                java.util.Map r6 = r12.getConfirmedAssignments()
                com.superwall.sdk.config.PaywallPreload r12 = com.superwall.sdk.config.PaywallPreload.this
                r10 = 6
                com.superwall.sdk.config.Assignments r12 = r12.getAssignments()
                r10 = 0
                java.util.Map r7 = r12.getUnconfirmedAssignments()
                r11.label = r3
                r9 = r11
                java.lang.Object r12 = r4.getAllActiveTreatmentPaywallIds(r5, r6, r7, r8, r9)
                r10 = 5
                if (r12 != r0) goto L7a
                goto L89
            L7a:
                java.util.Set r12 = (java.util.Set) r12
                com.superwall.sdk.config.PaywallPreload r11 = com.superwall.sdk.config.PaywallPreload.this
                r10 = 4
                r9.label = r2
                r10 = 3
                java.lang.Object r11 = com.superwall.sdk.config.PaywallPreload.access$preloadPaywalls(r11, r12, r9)
                r10 = 2
                if (r11 != r0) goto L8a
            L89:
                return r0
            L8a:
                com.superwall.sdk.config.PaywallPreload r11 = com.superwall.sdk.config.PaywallPreload.this
                r12 = 0
                com.superwall.sdk.config.PaywallPreload.access$setCurrentPreloadingTask$p(r11, r12)
                r10 = 3
                kotlin.Unit r11 = kotlin.Unit.f312394a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.config.PaywallPreload.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.PaywallPreload$preloadPaywalls$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.config.PaywallPreload$preloadPaywalls$2", f = "PaywallPreload.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    static final class C26392 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Set<String> $paywallIdentifiers;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PaywallPreload this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26392(Set<String> set, PaywallPreload paywallPreload, kotlin.coroutines.d<? super C26392> dVar) {
            super(2, dVar);
            this.$paywallIdentifiers = set;
            this.this$0 = paywallPreload;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C26392 c26392 = new C26392(this.$paywallIdentifiers, this.this$0, dVar);
            c26392.L$0 = obj;
            return c26392;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var = (s0) this.L$0;
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = this.$paywallIdentifiers.iterator();
                while (it.hasNext()) {
                    arrayList.add(k.b(s0Var, null, null, new PaywallPreload$preloadPaywalls$2$task$1(this.this$0, it.next(), null), 3, null));
                }
                this.label = 1;
                if (kotlinx.coroutines.f.a(arrayList, this) == objL) {
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
            return ((C26392) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public PaywallPreload(@NotNull Factory factory, @NotNull IOScope scope, @NotNull LocalStorage storage, @NotNull Assignments assignments, @NotNull PaywallManager paywallManager) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        Intrinsics.checkNotNullParameter(paywallManager, "paywallManager");
        this.factory = factory;
        this.scope = scope;
        this.storage = storage;
        this.assignments = assignments;
        this.paywallManager = paywallManager;
    }

    private final Set<String> getTreatmentPaywallIds(Config config, Set<Trigger> set) {
        ConfigLogic configLogic = ConfigLogic.INSTANCE;
        Set<Trigger> setFilterTriggers = configLogic.filterTriggers(set, config.getPreloadingDisabled());
        return setFilterTriggers.isEmpty() ? SetsKt.emptySet() : configLogic.getActiveTreatmentPaywallIds(setFilterTriggers, this.storage.getConfirmedAssignments(), this.assignments.getUnconfirmedAssignments());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object preloadPaywalls(Set<String> set, kotlin.coroutines.d<? super Unit> dVar) {
        if (SWWebViewKt.webViewExists()) {
            ScopesKt.launchWithTracking(this.scope, new C26392(set, this, null));
        }
        return Unit.f312394a;
    }

    @NotNull
    public final Assignments getAssignments() {
        return this.assignments;
    }

    @NotNull
    public final Factory getFactory() {
        return this.factory;
    }

    @NotNull
    public final PaywallManager getPaywallManager() {
        return this.paywallManager;
    }

    @NotNull
    public final IOScope getScope() {
        return this.scope;
    }

    @NotNull
    public final LocalStorage getStorage() {
        return this.storage;
    }

    @Nullable
    public final Object preloadAllPaywalls(@NotNull Config config, @NotNull Context context, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (this.currentPreloadingTask != null) {
            return Unit.f312394a;
        }
        this.currentPreloadingTask = ScopesKt.launchWithTracking(this.scope, new AnonymousClass2(context, config, null));
        return Unit.f312394a;
    }

    @Nullable
    public final Object preloadPaywallsByNames(@NotNull Config config, @NotNull Set<String> set, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Set<Trigger> triggers = config.getTriggers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : triggers) {
            if (set.contains(((Trigger) obj).getEventName())) {
                arrayList.add(obj);
            }
        }
        Object objPreloadPaywalls = preloadPaywalls(getTreatmentPaywallIds(config, CollectionsKt.toSet(arrayList)), dVar);
        return objPreloadPaywalls == kotlin.coroutines.intrinsics.b.l() ? objPreloadPaywalls : Unit.f312394a;
    }

    @Nullable
    public final Object removeUnusedPaywallVCsFromCache$superwall_release(@NotNull Config config, @NotNull Config config2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Paywall paywall;
        List<Paywall> paywalls = config.getPaywalls();
        List<Paywall> paywalls2 = config2.getPaywalls();
        PaywallView currentView = this.paywallManager.getCurrentView();
        String identifier = (currentView == null || (paywall = currentView.getPaywall()) == null) ? null : paywall.getIdentifier();
        List<Paywall> list = paywalls;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Paywall paywall2 : list) {
            arrayList.add(TuplesKt.to(paywall2.getIdentifier(), paywall2.getCacheKey()));
        }
        Map map = MapsKt.toMap(arrayList);
        List<Paywall> list2 = paywalls2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Paywall paywall3 : list2) {
            arrayList2.add(TuplesKt.to(paywall3.getIdentifier(), paywall3.getCacheKey()));
        }
        Map map2 = MapsKt.toMap(arrayList2);
        Set set = CollectionsKt.toSet(SetsKt.minus(map.keySet(), (Iterable) map2.keySet()));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list2) {
            Paywall paywall4 = (Paywall) obj;
            String str = (String) map.get(paywall4.getIdentifier());
            boolean zAreEqual = Intrinsics.areEqual(str, map2.get(paywall4.getIdentifier()));
            if (str != null && !zAreEqual) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((Paywall) it.next()).getIdentifier());
        }
        Iterator it2 = CollectionsKt.filterNotNull(CollectionsKt.toSet(SetsKt.minus((Set<? extends String>) SetsKt.plus(set, (Iterable) arrayList4), identifier))).iterator();
        while (it2.hasNext()) {
            this.paywallManager.removePaywallView((String) it2.next());
        }
        return Unit.f312394a;
    }
}
