package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface e extends g {

    @w0(parameters = 1)
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f15633a = 0;
    }

    @w0(parameters = 1)
    public static final class b implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f15634b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f15635a;

        public b(@NotNull a aVar) {
            this.f15635a = aVar;
        }

        @NotNull
        public final a a() {
            return this.f15635a;
        }
    }
}
