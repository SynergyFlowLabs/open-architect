package androidx.window.embedding;

import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
public final class i {
    private final <F, S> F f(Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return (F) pair.first;
    }

    private final <F, S> S g(Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return (S) pair.second;
    }

    private final t h(SplitInfo splitInfo) {
        boolean zIsEmpty;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        Intrinsics.checkNotNullExpressionValue(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean zIsEmpty2 = false;
        try {
            zIsEmpty = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            zIsEmpty = false;
        }
        List activities = primaryActivityStack.getActivities();
        Intrinsics.checkNotNullExpressionValue(activities, "primaryActivityStack.activities");
        c cVar = new c(activities, zIsEmpty);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        Intrinsics.checkNotNullExpressionValue(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            zIsEmpty2 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        Intrinsics.checkNotNullExpressionValue(activities2, "secondaryActivityStack.activities");
        return new t(cVar, new c(activities2, zIsEmpty2), splitInfo.getSplitRatio());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(i this$0, Set splitPairFilters, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(splitPairFilters, "$splitPairFilters");
        Intrinsics.checkNotNullExpressionValue(pair, "(first, second)");
        Activity activity = (Activity) this$0.f(pair);
        Intent intent = (Intent) this$0.g(pair);
        Set set = splitPairFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((u) it.next()).d(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(i this$0, Set splitPairFilters, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(splitPairFilters, "$splitPairFilters");
        Intrinsics.checkNotNullExpressionValue(pair, "(first, second)");
        Activity activity = (Activity) this$0.f(pair);
        Activity activity2 = (Activity) this$0.g(pair);
        Set set = splitPairFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((u) it.next()).e(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(Set activityFilters, Activity activity) {
        Intrinsics.checkNotNullParameter(activityFilters, "$activityFilters");
        Set<a> set = activityFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (a aVar : set) {
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            if (aVar.c(activity)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(Set activityFilters, Intent intent) {
        Intrinsics.checkNotNullParameter(activityFilters, "$activityFilters");
        Set<a> set = activityFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (a aVar : set) {
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            if (aVar.d(intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(x splitRule, WindowMetrics windowMetrics) {
        Intrinsics.checkNotNullParameter(splitRule, "$splitRule");
        Intrinsics.checkNotNullExpressionValue(windowMetrics, "windowMetrics");
        return splitRule.a(windowMetrics);
    }

    @NotNull
    public final List<t> i(@NotNull List<? extends SplitInfo> splitInfoList) {
        Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
        List<? extends SplitInfo> list = splitInfoList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h((SplitInfo) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public final Set<EmbeddingRule> j(@NotNull Set<? extends m> rules) {
        SplitPairRule splitPairRuleBuild;
        Intrinsics.checkNotNullParameter(rules, "rules");
        Set<? extends m> set = rules;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        for (m mVar : set) {
            if (mVar instanceof v) {
                v vVar = (v) mVar;
                splitPairRuleBuild = new SplitPairRule.Builder(m(vVar.g()), k(vVar.g()), s((x) mVar)).setSplitRatio(vVar.e()).setLayoutDirection(vVar.b()).setShouldFinishPrimaryWithSecondary(vVar.h()).setShouldFinishSecondaryWithPrimary(vVar.i()).setShouldClearTop(vVar.f()).build();
                Intrinsics.checkNotNullExpressionValue(splitPairRuleBuild, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (mVar instanceof w) {
                w wVar = (w) mVar;
                splitPairRuleBuild = new SplitPlaceholderRule.Builder(wVar.g(), o(wVar.f()), q(wVar.f()), s((x) mVar)).setSplitRatio(wVar.e()).setLayoutDirection(wVar.b()).build();
                Intrinsics.checkNotNullExpressionValue(splitPairRuleBuild, "SplitPlaceholderRuleBuil…                 .build()");
            } else {
                if (!(mVar instanceof b)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                b bVar = (b) mVar;
                splitPairRuleBuild = new ActivityRule.Builder(o(bVar.b()), q(bVar.b())).setShouldAlwaysExpand(bVar.a()).build();
                Intrinsics.checkNotNullExpressionValue(splitPairRuleBuild, "ActivityRuleBuilder(\n   …                 .build()");
            }
            arrayList.add((EmbeddingRule) splitPairRuleBuild);
        }
        return CollectionsKt.toSet(arrayList);
    }

    @e.a({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Pair<Activity, Intent>> k(@NotNull final Set<u> splitPairFilters) {
        Intrinsics.checkNotNullParameter(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.g
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return i.l(this.f76303a, splitPairFilters, (Pair) obj);
            }
        };
    }

    @e.a({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Pair<Activity, Activity>> m(@NotNull final Set<u> splitPairFilters) {
        Intrinsics.checkNotNullParameter(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return i.n(this.f76301a, splitPairFilters, (Pair) obj);
            }
        };
    }

    @e.a({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Activity> o(@NotNull final Set<a> activityFilters) {
        Intrinsics.checkNotNullParameter(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.h
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return i.p(activityFilters, (Activity) obj);
            }
        };
    }

    @e.a({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Intent> q(@NotNull final Set<a> activityFilters) {
        Intrinsics.checkNotNullParameter(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return i.r(activityFilters, (Intent) obj);
            }
        };
    }

    @e.a({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<WindowMetrics> s(@NotNull final x splitRule) {
        Intrinsics.checkNotNullParameter(splitRule, "splitRule");
        return new Predicate() { // from class: androidx.window.embedding.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return i.t(splitRule, (WindowMetrics) obj);
            }
        };
    }
}
