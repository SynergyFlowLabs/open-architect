package com.superwall.sdk.paywall.presentation.get_paywall;

import android.app.Activity;
import com.superwall.sdk.paywall.presentation.rule_logic.RuleEvaluationOutcome;
import com.superwall.sdk.paywall.view.PaywallView;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PaywallComponents {

    @NotNull
    private final Map<String, Object> debugInfo;

    @Nullable
    private final Activity presenter;

    @NotNull
    private final RuleEvaluationOutcome rulesOutcome;

    @NotNull
    private final PaywallView view;

    public PaywallComponents(@NotNull PaywallView view, @Nullable Activity activity, @NotNull RuleEvaluationOutcome rulesOutcome, @NotNull Map<String, ? extends Object> debugInfo) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(rulesOutcome, "rulesOutcome");
        Intrinsics.checkNotNullParameter(debugInfo, "debugInfo");
        this.view = view;
        this.presenter = activity;
        this.rulesOutcome = rulesOutcome;
        this.debugInfo = debugInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallComponents copy$default(PaywallComponents paywallComponents, PaywallView paywallView, Activity activity, RuleEvaluationOutcome ruleEvaluationOutcome, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paywallView = paywallComponents.view;
        }
        if ((i10 & 2) != 0) {
            activity = paywallComponents.presenter;
        }
        if ((i10 & 4) != 0) {
            ruleEvaluationOutcome = paywallComponents.rulesOutcome;
        }
        if ((i10 & 8) != 0) {
            map = paywallComponents.debugInfo;
        }
        return paywallComponents.copy(paywallView, activity, ruleEvaluationOutcome, map);
    }

    @NotNull
    public final PaywallView component1() {
        return this.view;
    }

    @Nullable
    public final Activity component2() {
        return this.presenter;
    }

    @NotNull
    public final RuleEvaluationOutcome component3() {
        return this.rulesOutcome;
    }

    @NotNull
    public final Map<String, Object> component4() {
        return this.debugInfo;
    }

    @NotNull
    public final PaywallComponents copy(@NotNull PaywallView view, @Nullable Activity activity, @NotNull RuleEvaluationOutcome rulesOutcome, @NotNull Map<String, ? extends Object> debugInfo) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(rulesOutcome, "rulesOutcome");
        Intrinsics.checkNotNullParameter(debugInfo, "debugInfo");
        return new PaywallComponents(view, activity, rulesOutcome, debugInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallComponents)) {
            return false;
        }
        PaywallComponents paywallComponents = (PaywallComponents) obj;
        return Intrinsics.areEqual(this.view, paywallComponents.view) && Intrinsics.areEqual(this.presenter, paywallComponents.presenter) && Intrinsics.areEqual(this.rulesOutcome, paywallComponents.rulesOutcome) && Intrinsics.areEqual(this.debugInfo, paywallComponents.debugInfo);
    }

    @NotNull
    public final Map<String, Object> getDebugInfo() {
        return this.debugInfo;
    }

    @Nullable
    public final Activity getPresenter() {
        return this.presenter;
    }

    @NotNull
    public final RuleEvaluationOutcome getRulesOutcome() {
        return this.rulesOutcome;
    }

    @NotNull
    public final PaywallView getView() {
        return this.view;
    }

    public int hashCode() {
        int iHashCode = this.view.hashCode() * 31;
        Activity activity = this.presenter;
        return ((((iHashCode + (activity == null ? 0 : activity.hashCode())) * 31) + this.rulesOutcome.hashCode()) * 31) + this.debugInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "PaywallComponents(view=" + this.view + ", presenter=" + this.presenter + ", rulesOutcome=" + this.rulesOutcome + ", debugInfo=" + this.debugInfo + ")";
    }
}
