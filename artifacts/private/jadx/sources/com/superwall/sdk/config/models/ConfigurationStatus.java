package com.superwall.sdk.config.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ConfigurationStatus {

    public static final class Configured extends ConfigurationStatus {

        @NotNull
        public static final Configured INSTANCE = new Configured();

        private Configured() {
            super(null);
        }
    }

    public static final class Failed extends ConfigurationStatus {

        @NotNull
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }
    }

    public static final class Pending extends ConfigurationStatus {

        @NotNull
        public static final Pending INSTANCE = new Pending();

        private Pending() {
            super(null);
        }
    }

    public /* synthetic */ ConfigurationStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConfigurationStatus() {
    }
}
