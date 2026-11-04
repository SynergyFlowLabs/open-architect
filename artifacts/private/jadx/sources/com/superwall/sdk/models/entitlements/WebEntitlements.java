package com.superwall.sdk.models.entitlements;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class WebEntitlements {

    @NotNull
    private final List<Entitlement> entitlements;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new kotlinx.serialization.internal.f(Entitlement$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<WebEntitlements> serializer() {
            return WebEntitlements$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WebEntitlements(int i10, List list, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, WebEntitlements$$serializer.INSTANCE.getDescriptor());
        }
        this.entitlements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebEntitlements copy$default(WebEntitlements webEntitlements, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = webEntitlements.entitlements;
        }
        return webEntitlements.copy(list);
    }

    @a0("entitlements")
    public static /* synthetic */ void getEntitlements$annotations() {
    }

    @NotNull
    public final List<Entitlement> component1() {
        return this.entitlements;
    }

    @NotNull
    public final WebEntitlements copy(@NotNull List<Entitlement> entitlements) {
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        return new WebEntitlements(entitlements);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebEntitlements) && Intrinsics.areEqual(this.entitlements, ((WebEntitlements) obj).entitlements);
    }

    @NotNull
    public final List<Entitlement> getEntitlements() {
        return this.entitlements;
    }

    public int hashCode() {
        return this.entitlements.hashCode();
    }

    @NotNull
    public String toString() {
        return "WebEntitlements(entitlements=" + this.entitlements + ")";
    }

    public WebEntitlements(@NotNull List<Entitlement> entitlements) {
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        this.entitlements = entitlements;
    }
}
