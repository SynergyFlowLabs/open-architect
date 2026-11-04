package com.superwall.sdk.models.config;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0(with = FeatureGatingBehaviorSerializer.class)
public abstract class FeatureGatingBehavior {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<FeatureGatingBehavior> serializer() {
            return FeatureGatingBehaviorSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @a0("GATED")
    public static final class Gated extends FeatureGatingBehavior {

        @NotNull
        public static final Gated INSTANCE = new Gated();

        private Gated() {
            super(null);
        }
    }

    @a0("NON_GATED")
    public static final class NonGated extends FeatureGatingBehavior {

        @NotNull
        public static final NonGated INSTANCE = new NonGated();

        private NonGated() {
            super(null);
        }
    }

    public /* synthetic */ FeatureGatingBehavior(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FeatureGatingBehavior() {
    }
}
