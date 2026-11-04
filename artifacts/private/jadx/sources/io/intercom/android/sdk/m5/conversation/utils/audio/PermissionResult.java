package io.intercom.android.sdk.m5.conversation.utils.audio;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface PermissionResult {

    @w0(parameters = 1)
    public static final class Denied implements PermissionResult {
        public static final int $stable = 0;

        @NotNull
        public static final Denied INSTANCE = new Denied();

        private Denied() {
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj || (obj instanceof Denied)) {
                return true;
            }
            int i10 = 2 | 0;
            return false;
        }

        public int hashCode() {
            return -1394334449;
        }

        @NotNull
        public String toString() {
            return "Denied";
        }
    }

    @w0(parameters = 1)
    public static final class Granted implements PermissionResult {
        public static final int $stable = 0;

        @NotNull
        public static final Granted INSTANCE = new Granted();

        private Granted() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof Granted);
        }

        public int hashCode() {
            return -1546814521;
        }

        @NotNull
        public String toString() {
            return "Granted";
        }
    }

    @w0(parameters = 1)
    public static final class NotRequired implements PermissionResult {
        public static final int $stable = 0;

        @NotNull
        public static final NotRequired INSTANCE = new NotRequired();

        private NotRequired() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof NotRequired);
        }

        public int hashCode() {
            return -1685989730;
        }

        @NotNull
        public String toString() {
            return "NotRequired";
        }
    }

    @w0(parameters = 1)
    public static final class PermanentlyDenied implements PermissionResult {
        public static final int $stable = 0;

        @NotNull
        public static final PermanentlyDenied INSTANCE = new PermanentlyDenied();

        private PermanentlyDenied() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof PermanentlyDenied);
        }

        public int hashCode() {
            return -1189886910;
        }

        @NotNull
        public String toString() {
            return "PermanentlyDenied";
        }
    }
}
