package com.superwall.sdk.delegate;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class RestorationResult {

    public static final class Failed extends RestorationResult {

        @Nullable
        private final Throwable error;

        public Failed(@Nullable Throwable th2) {
            super(null);
            this.error = th2;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = failed.error;
            }
            return failed.copy(th2);
        }

        @Nullable
        public final Throwable component1() {
            return this.error;
        }

        @NotNull
        public final Failed copy(@Nullable Throwable th2) {
            return new Failed(th2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) obj).error);
        }

        @Nullable
        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            Throwable th2 = this.error;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failed(error=" + this.error + ")";
        }
    }

    public static final class Restored extends RestorationResult {
        public Restored() {
            super(null);
        }
    }

    public /* synthetic */ RestorationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RestorationResult() {
    }
}
