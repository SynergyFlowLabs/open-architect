package com.superwall.sdk.paywall.presentation.rule_logic;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class RuleAttributes {

    @NotNull
    private final Map<String, Object> device;

    @NotNull
    private final Map<String, Object> user;

    public RuleAttributes(@NotNull Map<String, ? extends Object> user, @NotNull Map<String, ? extends Object> device) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(device, "device");
        this.user = user;
        this.device = device;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RuleAttributes copy$default(RuleAttributes ruleAttributes, Map map, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = ruleAttributes.user;
        }
        if ((i10 & 2) != 0) {
            map2 = ruleAttributes.device;
        }
        return ruleAttributes.copy(map, map2);
    }

    @NotNull
    public final Map<String, Object> component1() {
        return this.user;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.device;
    }

    @NotNull
    public final RuleAttributes copy(@NotNull Map<String, ? extends Object> user, @NotNull Map<String, ? extends Object> device) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(device, "device");
        return new RuleAttributes(user, device);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleAttributes)) {
            return false;
        }
        RuleAttributes ruleAttributes = (RuleAttributes) obj;
        return Intrinsics.areEqual(this.user, ruleAttributes.user) && Intrinsics.areEqual(this.device, ruleAttributes.device);
    }

    @NotNull
    public final Map<String, Object> getDevice() {
        return this.device;
    }

    @NotNull
    public final Map<String, Object> getUser() {
        return this.user;
    }

    public int hashCode() {
        return (this.user.hashCode() * 31) + this.device.hashCode();
    }

    @NotNull
    public String toString() {
        return "RuleAttributes(user=" + this.user + ", device=" + this.device + ")";
    }
}
