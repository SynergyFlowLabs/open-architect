package yc;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface a {

    /* JADX INFO: renamed from: yc.a$a, reason: collision with other inner class name */
    @w0(parameters = 1)
    public static final class C2534a implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f395367b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f395368a;

        public C2534a(boolean z10) {
            this.f395368a = z10;
        }

        public static /* synthetic */ C2534a c(C2534a c2534a, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = c2534a.f395368a;
            }
            return c2534a.b(z10);
        }

        public final boolean a() {
            return this.f395368a;
        }

        @NotNull
        public final C2534a b(boolean z10) {
            return new C2534a(z10);
        }

        public final boolean d() {
            return this.f395368a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2534a) && this.f395368a == ((C2534a) obj).f395368a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f395368a);
        }

        @NotNull
        public String toString() {
            return "BlockerVisibility(isBlockerVisible=" + this.f395368a + ")";
        }
    }
}
