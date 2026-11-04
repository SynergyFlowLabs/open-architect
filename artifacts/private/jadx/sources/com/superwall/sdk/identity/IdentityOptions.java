package com.superwall.sdk.identity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class IdentityOptions {
    private final boolean restorePaywallAssignments;

    public IdentityOptions() {
        this(false, 1, null);
    }

    public static /* synthetic */ IdentityOptions copy$default(IdentityOptions identityOptions, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = identityOptions.restorePaywallAssignments;
        }
        return identityOptions.copy(z10);
    }

    public final boolean component1() {
        return this.restorePaywallAssignments;
    }

    @NotNull
    public final IdentityOptions copy(boolean z10) {
        return new IdentityOptions(z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IdentityOptions) && this.restorePaywallAssignments == ((IdentityOptions) obj).restorePaywallAssignments;
    }

    public final boolean getRestorePaywallAssignments() {
        return this.restorePaywallAssignments;
    }

    public int hashCode() {
        return Boolean.hashCode(this.restorePaywallAssignments);
    }

    @NotNull
    public String toString() {
        return "IdentityOptions(restorePaywallAssignments=" + this.restorePaywallAssignments + ")";
    }

    public IdentityOptions(boolean z10) {
        this.restorePaywallAssignments = z10;
    }

    public /* synthetic */ IdentityOptions(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
