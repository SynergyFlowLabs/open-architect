package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface c extends g {

    @w0(parameters = 1)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f15625a = 0;
    }

    @w0(parameters = 1)
    public static final class b implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f15626b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f15627a;

        public b(@NotNull a aVar) {
            this.f15627a = aVar;
        }

        @NotNull
        public final a a() {
            return this.f15627a;
        }
    }
}
