package com.superwall.sdk.config.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0(with = OnDeviceCachingSerializer.class)
public abstract class OnDeviceCaching {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<OnDeviceCaching> serializer() {
            return OnDeviceCachingSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @a0("DISABLED")
    public static final class Disabled extends OnDeviceCaching {

        @NotNull
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
            super(null);
        }
    }

    @a0("ENABLED")
    public static final class Enabled extends OnDeviceCaching {

        @NotNull
        public static final Enabled INSTANCE = new Enabled();

        private Enabled() {
            super(null);
        }
    }

    public /* synthetic */ OnDeviceCaching(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OnDeviceCaching() {
    }
}
