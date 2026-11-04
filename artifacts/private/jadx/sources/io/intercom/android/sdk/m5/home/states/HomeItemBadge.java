package io.intercom.android.sdk.m5.home.states;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface HomeItemBadge {

    @w0(parameters = 1)
    public static final class IconWithIndicator implements HomeItemBadge {
        public static final int $stable = 0;

        @NotNull
        public static final IconWithIndicator INSTANCE = new IconWithIndicator();

        private IconWithIndicator() {
        }
    }

    @w0(parameters = 1)
    public static final class IndicatorWithCount implements HomeItemBadge {
        public static final int $stable = 0;
        private final int count;

        public IndicatorWithCount(int i10) {
            this.count = i10;
        }

        public static /* synthetic */ IndicatorWithCount copy$default(IndicatorWithCount indicatorWithCount, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = indicatorWithCount.count;
            }
            return indicatorWithCount.copy(i10);
        }

        public final int component1() {
            return this.count;
        }

        @NotNull
        public final IndicatorWithCount copy(int i10) {
            return new IndicatorWithCount(i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IndicatorWithCount) && this.count == ((IndicatorWithCount) obj).count;
        }

        public final int getCount() {
            return this.count;
        }

        public int hashCode() {
            return Integer.hashCode(this.count);
        }

        @NotNull
        public String toString() {
            return "IndicatorWithCount(count=" + this.count + ')';
        }
    }

    @w0(parameters = 1)
    public static final class None implements HomeItemBadge {
        public static final int $stable = 0;

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
        }
    }
}
