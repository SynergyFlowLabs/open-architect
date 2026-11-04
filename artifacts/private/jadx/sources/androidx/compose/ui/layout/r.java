package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface r {

    public static final class a {
        @Deprecated
        public static long a(@NotNull r rVar) {
            return r.super.getOwnerViewId();
        }
    }

    long getLayerId();

    default long getOwnerViewId() {
        return 0L;
    }
}
