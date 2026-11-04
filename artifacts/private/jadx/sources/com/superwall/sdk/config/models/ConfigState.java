package com.superwall.sdk.config.models;

import com.superwall.sdk.models.config.Config;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ConfigState {

    public static final class Failed extends ConfigState {

        @NotNull
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(@NotNull Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = failed.throwable;
            }
            return failed.copy(th2);
        }

        @NotNull
        public final Throwable component1() {
            return this.throwable;
        }

        @NotNull
        public final Failed copy(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Failed(throwable);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && Intrinsics.areEqual(this.throwable, ((Failed) obj).throwable);
        }

        @NotNull
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failed(throwable=" + this.throwable + ")";
        }
    }

    public static final class None extends ConfigState {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    public static final class Retrieved extends ConfigState {

        @NotNull
        private final Config config;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Retrieved(@NotNull Config config) {
            super(null);
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
        }

        public static /* synthetic */ Retrieved copy$default(Retrieved retrieved, Config config, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                config = retrieved.config;
            }
            return retrieved.copy(config);
        }

        @NotNull
        public final Config component1() {
            return this.config;
        }

        @NotNull
        public final Retrieved copy(@NotNull Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return new Retrieved(config);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Retrieved) && Intrinsics.areEqual(this.config, ((Retrieved) obj).config);
        }

        @NotNull
        public final Config getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        @NotNull
        public String toString() {
            return "Retrieved(config=" + this.config + ")";
        }
    }

    public static final class Retrieving extends ConfigState {

        @NotNull
        public static final Retrieving INSTANCE = new Retrieving();

        private Retrieving() {
            super(null);
        }
    }

    public static final class Retrying extends ConfigState {

        @NotNull
        public static final Retrying INSTANCE = new Retrying();

        private Retrying() {
            super(null);
        }
    }

    public /* synthetic */ ConfigState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConfigState() {
    }
}
