package com.superwall.sdk.models.paywall;

import com.superwall.sdk.models.SerializableEntity;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class Paywalls implements SerializableEntity {

    @NotNull
    private final List<Paywall> paywalls;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new kotlinx.serialization.internal.f(Paywall$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<Paywalls> serializer() {
            return Paywalls$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Paywalls(int i10, List list, v2 v2Var) {
        int i11 = 6 >> 1;
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, Paywalls$$serializer.INSTANCE.getDescriptor());
        }
        this.paywalls = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Paywalls copy$default(Paywalls paywalls, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = paywalls.paywalls;
        }
        return paywalls.copy(list);
    }

    @NotNull
    public final List<Paywall> component1() {
        return this.paywalls;
    }

    @NotNull
    public final Paywalls copy(@NotNull List<Paywall> paywalls) {
        Intrinsics.checkNotNullParameter(paywalls, "paywalls");
        return new Paywalls(paywalls);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Paywalls) && Intrinsics.areEqual(this.paywalls, ((Paywalls) obj).paywalls);
    }

    @NotNull
    public final List<Paywall> getPaywalls() {
        return this.paywalls;
    }

    public int hashCode() {
        return this.paywalls.hashCode();
    }

    @NotNull
    public String toString() {
        return "Paywalls(paywalls=" + this.paywalls + ")";
    }

    public Paywalls(@NotNull List<Paywall> paywalls) {
        Intrinsics.checkNotNullParameter(paywalls, "paywalls");
        this.paywalls = paywalls;
    }
}
