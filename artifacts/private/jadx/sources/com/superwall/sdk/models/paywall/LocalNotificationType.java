package com.superwall.sdk.models.paywall;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import org.jetbrains.annotations.NotNull;
import t8.a;

/* JADX INFO: loaded from: classes13.dex */
@b0(with = LocalNotificationTypeSerializer.class)
public abstract class LocalNotificationType {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<LocalNotificationType> serializer() {
            return LocalNotificationTypeSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @a0("TRIAL_STARTED")
    public static final class TrialStarted extends LocalNotificationType {

        @NotNull
        public static final TrialStarted INSTANCE = new TrialStarted();

        private TrialStarted() {
            super(null);
        }
    }

    @a0(a.f376227i)
    public static final class Unsupported extends LocalNotificationType {

        @NotNull
        public static final Unsupported INSTANCE = new Unsupported();

        private Unsupported() {
            super(null);
        }
    }

    public /* synthetic */ LocalNotificationType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LocalNotificationType() {
    }
}
