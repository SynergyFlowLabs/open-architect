package com.superwall.sdk.config;

import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.models.assignment.Assignment;
import com.superwall.sdk.models.assignment.ConfirmableAssignment;
import com.superwall.sdk.models.config.Config;
import com.superwall.sdk.models.config.PreloadingDisabled;
import com.superwall.sdk.models.entitlements.Entitlement;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.product.ProductItem;
import com.superwall.sdk.models.triggers.Experiment;
import com.superwall.sdk.models.triggers.Trigger;
import com.superwall.sdk.models.triggers.TriggerPreloadBehavior;
import com.superwall.sdk.models.triggers.TriggerRule;
import com.superwall.sdk.models.triggers.VariantOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConfigLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigLogic.kt\ncom/superwall/sdk/config/ConfigLogic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,324:1\n1#2:325\n1557#3:326\n1628#3,3:327\n827#3:330\n855#3,2:331\n295#3:333\n1755#3,3:334\n296#3:337\n1368#3:338\n1454#3,2:339\n774#3:341\n865#3,2:342\n1456#3,3:344\n295#3,2:347\n1863#3:349\n1863#3,2:350\n1864#3:352\n1863#3,2:353\n1863#3,2:355\n1863#3,2:357\n1368#3:359\n1454#3,2:360\n1557#3:362\n1628#3,3:363\n1456#3,3:366\n1202#3,2:369\n1230#3,4:371\n1187#3,2:375\n1261#3,4:377\n*S KotlinDebug\n*F\n+ 1 ConfigLogic.kt\ncom/superwall/sdk/config/ConfigLogic\n*L\n119#1:326\n119#1:327,3\n177#1:330\n177#1:331,2\n190#1:333\n191#1:334,3\n190#1:337\n196#1:338\n196#1:339,2\n197#1:341\n197#1:342,2\n196#1:344,3\n223#1:347,2\n247#1:349\n248#1:350,2\n247#1:352\n272#1:353,2\n278#1:355,2\n285#1:357,2\n302#1:359\n302#1:360,2\n302#1:362\n302#1:363,3\n302#1:366,3\n318#1:369,2\n318#1:371,4\n322#1:375,2\n322#1:377,4\n*E\n"})
public final class ConfigLogic {

    @NotNull
    public static final ConfigLogic INSTANCE = new ConfigLogic();

    public static final class AssignmentOutcome {

        @NotNull
        private final Map<String, Experiment.Variant> confirmed;

        @NotNull
        private final Map<String, Experiment.Variant> unconfirmed;

        public AssignmentOutcome(@NotNull Map<String, Experiment.Variant> confirmed, @NotNull Map<String, Experiment.Variant> unconfirmed) {
            Intrinsics.checkNotNullParameter(confirmed, "confirmed");
            Intrinsics.checkNotNullParameter(unconfirmed, "unconfirmed");
            this.confirmed = confirmed;
            this.unconfirmed = unconfirmed;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AssignmentOutcome copy$default(AssignmentOutcome assignmentOutcome, Map map, Map map2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = assignmentOutcome.confirmed;
            }
            if ((i10 & 2) != 0) {
                map2 = assignmentOutcome.unconfirmed;
            }
            return assignmentOutcome.copy(map, map2);
        }

        @NotNull
        public final Map<String, Experiment.Variant> component1() {
            return this.confirmed;
        }

        @NotNull
        public final Map<String, Experiment.Variant> component2() {
            return this.unconfirmed;
        }

        @NotNull
        public final AssignmentOutcome copy(@NotNull Map<String, Experiment.Variant> confirmed, @NotNull Map<String, Experiment.Variant> unconfirmed) {
            Intrinsics.checkNotNullParameter(confirmed, "confirmed");
            Intrinsics.checkNotNullParameter(unconfirmed, "unconfirmed");
            return new AssignmentOutcome(confirmed, unconfirmed);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssignmentOutcome)) {
                return false;
            }
            AssignmentOutcome assignmentOutcome = (AssignmentOutcome) obj;
            return Intrinsics.areEqual(this.confirmed, assignmentOutcome.confirmed) && Intrinsics.areEqual(this.unconfirmed, assignmentOutcome.unconfirmed);
        }

        @NotNull
        public final Map<String, Experiment.Variant> getConfirmed() {
            return this.confirmed;
        }

        @NotNull
        public final Map<String, Experiment.Variant> getUnconfirmed() {
            return this.unconfirmed;
        }

        public int hashCode() {
            return (this.confirmed.hashCode() * 31) + this.unconfirmed.hashCode();
        }

        @NotNull
        public String toString() {
            return "AssignmentOutcome(confirmed=" + this.confirmed + ", unconfirmed=" + this.unconfirmed + ")";
        }
    }

    public static abstract class TriggerRuleError extends Exception {

        public static final class InvalidState extends TriggerRuleError {

            @NotNull
            public static final InvalidState INSTANCE = new InvalidState();

            private InvalidState() {
                super(null);
            }
        }

        public static final class NoVariantsFound extends TriggerRuleError {

            @NotNull
            public static final NoVariantsFound INSTANCE = new NoVariantsFound();

            private NoVariantsFound() {
                super(null);
            }
        }

        public /* synthetic */ TriggerRuleError(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TriggerRuleError() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TriggerPreloadBehavior.values().length];
            try {
                iArr[TriggerPreloadBehavior.IF_TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TriggerPreloadBehavior.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TriggerPreloadBehavior.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.ConfigLogic$getAllActiveTreatmentPaywallIds$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.ConfigLogic", f = "ConfigLogic.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {255}, m = "getAllActiveTreatmentPaywallIds", n = {"unconfirmedAssignments", "expressionEvaluator", "confirmedAssignments", "confirmedExperimentIds", "allExperimentIds", "skippedExperimentIds", "rule"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$8"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigLogic.this.getAllActiveTreatmentPaywallIds(null, null, null, null, this);
        }
    }

    private ConfigLogic() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Experiment.Variant chooseVariant$default(ConfigLogic configLogic, List list, Function1 function1, int i10, Object obj) throws TriggerRuleError {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: com.superwall.sdk.config.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Integer.valueOf(ConfigLogic.chooseVariant$lambda$0((IntRange) obj2));
                }
            };
        }
        return configLogic.chooseVariant(list, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int chooseVariant$lambda$0(IntRange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return r.g1(it, kotlin.random.f.f312895a);
    }

    @NotNull
    public final AssignmentOutcome chooseAssignments(@NotNull Set<Trigger> fromTriggers, @NotNull Map<String, Experiment.Variant> confirmedAssignments) {
        Intrinsics.checkNotNullParameter(fromTriggers, "fromTriggers");
        Intrinsics.checkNotNullParameter(confirmedAssignments, "confirmedAssignments");
        Map mutableMap = MapsKt.toMutableMap(confirmedAssignments);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<List<TriggerRule>> it = getRulesPerCampaign(fromTriggers).iterator();
        while (it.hasNext()) {
            for (TriggerRule triggerRule : it.next()) {
                List<VariantOption> variants = triggerRule.getExperiment().getVariants();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(variants, 10));
                Iterator<T> it2 = variants.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((VariantOption) it2.next()).getId());
                }
                Set set = CollectionsKt.toSet(arrayList);
                Experiment.Variant variant = (Experiment.Variant) mutableMap.get(triggerRule.getExperiment().getId());
                if (variant == null) {
                    try {
                        linkedHashMap.put(triggerRule.getExperiment().getId(), chooseVariant$default(this, triggerRule.getExperiment().getVariants(), null, 2, null));
                    } catch (TriggerRuleError unused) {
                    }
                } else if (!set.contains(variant.getId())) {
                    try {
                        linkedHashMap.put(triggerRule.getExperiment().getId(), chooseVariant$default(this, triggerRule.getExperiment().getVariants(), null, 2, null));
                        mutableMap.remove(triggerRule.getExperiment().getId());
                    } catch (TriggerRuleError unused2) {
                        mutableMap.remove(triggerRule.getExperiment().getId());
                    }
                }
            }
        }
        return new AssignmentOutcome(mutableMap, linkedHashMap);
    }

    @NotNull
    public final Experiment.Variant chooseVariant(@NotNull List<VariantOption> variants, @NotNull Function1<? super IntRange, Integer> randomiser) throws TriggerRuleError {
        Intrinsics.checkNotNullParameter(variants, "variants");
        Intrinsics.checkNotNullParameter(randomiser, "randomiser");
        if (variants.isEmpty()) {
            throw TriggerRuleError.NoVariantsFound.INSTANCE;
        }
        if (variants.size() == 1) {
            VariantOption variantOption = (VariantOption) CollectionsKt.first((List) variants);
            return new Experiment.Variant(variantOption.getId(), variantOption.getType(), variantOption.getPaywallId());
        }
        Iterator<T> it = variants.iterator();
        int percentage = 0;
        int percentage2 = 0;
        while (it.hasNext()) {
            percentage2 += ((VariantOption) it.next()).getPercentage();
        }
        if (percentage2 == 0) {
            VariantOption variantOption2 = variants.get(randomiser.invoke(r.W1(0, variants.size())).intValue());
            return new Experiment.Variant(variantOption2.getId(), variantOption2.getType(), variantOption2.getPaywallId());
        }
        int iIntValue = randomiser.invoke(r.W1(0, percentage2)).intValue();
        for (VariantOption variantOption3 : variants) {
            percentage += variantOption3.getPercentage();
            if (iIntValue < percentage) {
                return new Experiment.Variant(variantOption3.getId(), variantOption3.getType(), variantOption3.getPaywallId());
            }
        }
        throw TriggerRuleError.InvalidState.INSTANCE;
    }

    @NotNull
    public final Map<String, Set<Entitlement>> extractEntitlementsByProductId(@NotNull List<ProductItem> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        List<ProductItem> list = from;
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (ProductItem productItem : list) {
            Pair pair = TuplesKt.to(productItem.getFullProductId(), productItem.getEntitlements());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public final Set<Trigger> filterTriggers(@NotNull Set<Trigger> triggers, @NotNull PreloadingDisabled preloadingDisabled) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        Intrinsics.checkNotNullParameter(preloadingDisabled, "preloadingDisabled");
        if (preloadingDisabled.getAll()) {
            return SetsKt.emptySet();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : triggers) {
            if (!preloadingDisabled.getTriggers().contains(((Trigger) obj).getEventName())) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    @NotNull
    public final Set<String> getActiveTreatmentPaywallIds(@NotNull Set<Trigger> forTriggers, @NotNull Map<String, Experiment.Variant> confirmedAssignments, @NotNull Map<String, Experiment.Variant> unconfirmedAssignments) {
        String paywallId;
        Intrinsics.checkNotNullParameter(forTriggers, "forTriggers");
        Intrinsics.checkNotNullParameter(confirmedAssignments, "confirmedAssignments");
        Intrinsics.checkNotNullParameter(unconfirmedAssignments, "unconfirmedAssignments");
        Map mapPlus = MapsKt.plus(confirmedAssignments, unconfirmedAssignments);
        Set<List<TriggerRule>> rulesPerCampaign = getRulesPerCampaign(forTriggers);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = rulesPerCampaign.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((TriggerRule) it2.next()).getExperiment().getId());
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Experiment.Variant variant = (Experiment.Variant) mapPlus.get((String) it3.next());
            if (variant != null && variant.getType() == Experiment.Variant.VariantType.TREATMENT && (paywallId = variant.getPaywallId()) != null) {
                linkedHashSet.add(paywallId);
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009d  */
    /* JADX WARN: Code duplicated, block: B:20:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:22:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:31:0x011f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0120  */
    /* JADX WARN: Code duplicated, block: B:38:0x0162  */
    /* JADX WARN: Code duplicated, block: B:41:0x0176 A[LOOP:1: B:39:0x0170->B:41:0x0176, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x01a3 A[LOOP:2: B:43:0x019c->B:45:0x01a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009d -> B:18:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0120 -> B:33:0x0131). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:38:0x0162
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAllActiveTreatmentPaywallIds(@org.jetbrains.annotations.NotNull java.util.Set<com.superwall.sdk.models.triggers.Trigger> r11, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, com.superwall.sdk.models.triggers.Experiment.Variant> r12, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, com.superwall.sdk.models.triggers.Experiment.Variant> r13, @org.jetbrains.annotations.NotNull com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.Set<java.lang.String>> r15) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.config.ConfigLogic.getAllActiveTreatmentPaywallIds(java.util.Set, java.util.Map, java.util.Map, com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating, kotlin.coroutines.d):java.lang.Object");
    }

    @NotNull
    public final Set<List<TriggerRule>> getRulesPerCampaign(@NotNull Set<Trigger> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Trigger trigger : triggers) {
            TriggerRule triggerRule = (TriggerRule) CollectionsKt.firstOrNull((List) trigger.getRules());
            if (triggerRule != null) {
                String groupId = triggerRule.getExperiment().getGroupId();
                if (!linkedHashSet.contains(groupId)) {
                    linkedHashSet.add(groupId);
                    linkedHashSet2.add(trigger.getRules());
                }
            }
        }
        Logger logger = Logger.INSTANCE;
        LogLevel logLevel = LogLevel.debug;
        LogScope logScope = LogScope.configManager;
        Logger.debug$default(logger, logLevel, logScope, "!!! groupedTriggerRules", null, null, 24, null);
        Logger.debug$default(logger, logLevel, logScope, linkedHashSet2.toString(), null, null, 24, null);
        return linkedHashSet2;
    }

    @Nullable
    public final Paywall getStaticPaywall(@Nullable String str, @Nullable Config config, @NotNull String deviceLocale) {
        Intrinsics.checkNotNullParameter(deviceLocale, "deviceLocale");
        Object obj = null;
        if (str != null && config != null && !config.getLocales().contains(deviceLocale)) {
            int i10 = 5 >> 0;
            String str2 = (String) CollectionsKt.firstOrNull(StringsKt.split$default(deviceLocale, new String[]{"_"}, false, 0, 6, null));
            if (str2 == null) {
                return null;
            }
            if (!Intrinsics.areEqual(str2, "en") && config.getLocales().contains(str2)) {
                return null;
            }
            for (Object obj2 : config.getPaywalls()) {
                if (Intrinsics.areEqual(((Paywall) obj2).getIdentifier(), str)) {
                    obj = obj2;
                    break;
                }
            }
            return (Paywall) obj;
        }
        return null;
    }

    @NotNull
    public final Map<String, Trigger> getTriggersByEventName(@NotNull Set<Trigger> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Set<Trigger> set = from;
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
        for (Object obj : set) {
            linkedHashMap.put(((Trigger) obj).getEventName(), obj);
        }
        return linkedHashMap;
    }

    @NotNull
    public final AssignmentOutcome move(@NotNull ConfirmableAssignment newAssignment, @NotNull Map<String, Experiment.Variant> unconfirmedAssignments, @NotNull Map<String, Experiment.Variant> confirmedAssignments) {
        Intrinsics.checkNotNullParameter(newAssignment, "newAssignment");
        Intrinsics.checkNotNullParameter(unconfirmedAssignments, "unconfirmedAssignments");
        Intrinsics.checkNotNullParameter(confirmedAssignments, "confirmedAssignments");
        Map mutableMap = MapsKt.toMutableMap(confirmedAssignments);
        mutableMap.put(newAssignment.getExperimentId(), newAssignment.getVariant());
        Map mutableMap2 = MapsKt.toMutableMap(unconfirmedAssignments);
        mutableMap2.remove(newAssignment.getExperimentId());
        return new AssignmentOutcome(mutableMap, mutableMap2);
    }

    @NotNull
    public final AssignmentOutcome transferAssignmentsFromServerToDisk(@NotNull List<Assignment> assignments, @NotNull Set<Trigger> triggers, @NotNull Map<String, Experiment.Variant> confirmedAssignments, @NotNull Map<String, Experiment.Variant> unconfirmedAssignments) {
        Object next;
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        Intrinsics.checkNotNullParameter(confirmedAssignments, "confirmedAssignments");
        Intrinsics.checkNotNullParameter(unconfirmedAssignments, "unconfirmedAssignments");
        Map mutableMap = MapsKt.toMutableMap(confirmedAssignments);
        Map mutableMap2 = MapsKt.toMutableMap(unconfirmedAssignments);
        for (Assignment assignment : assignments) {
            Iterator<T> it = triggers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                List<TriggerRule> rules = ((Trigger) next).getRules();
                if (!(rules instanceof Collection) || !rules.isEmpty()) {
                    Iterator<T> it2 = rules.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.areEqual(((TriggerRule) it2.next()).getExperiment().getId(), assignment.getExperimentId())) {
                            break;
                        }
                    }
                }
            }
            Trigger trigger = (Trigger) next;
            if (trigger != null) {
                List<TriggerRule> rules2 = trigger.getRules();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it3 = rules2.iterator();
                while (it3.hasNext()) {
                    List<VariantOption> variants = ((TriggerRule) it3.next()).getExperiment().getVariants();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : variants) {
                        if (Intrinsics.areEqual(((VariantOption) obj).getId(), assignment.getVariantId())) {
                            arrayList2.add(obj);
                        }
                    }
                    CollectionsKt.addAll(arrayList, arrayList2);
                }
                VariantOption variantOption = (VariantOption) CollectionsKt.firstOrNull((List) arrayList);
                if (variantOption != null) {
                    mutableMap.put(assignment.getExperimentId(), variantOption.toVariant());
                    mutableMap2.remove(assignment.getExperimentId());
                }
            }
        }
        return new AssignmentOutcome(mutableMap, mutableMap2);
    }
}
