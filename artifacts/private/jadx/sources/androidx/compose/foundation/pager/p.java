package androidx.compose.foundation.pager;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface p {

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f18415a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f18416b = 0;

        private a() {
        }

        @Override // androidx.compose.foundation.pager.p
        public int a(@NotNull androidx.compose.ui.unit.d dVar, int i10, int i11) {
            return i10;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class b implements p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f18417b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f18418a;

        public /* synthetic */ b(float f10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10);
        }

        @Override // androidx.compose.foundation.pager.p
        public int a(@NotNull androidx.compose.ui.unit.d dVar, int i10, int i11) {
            return dVar.g6(this.f18418a);
        }

        public final float b() {
            return this.f18418a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return androidx.compose.ui.unit.h.x(this.f18418a, ((b) obj).f18418a);
            }
            return false;
        }

        public int hashCode() {
            return androidx.compose.ui.unit.h.D(this.f18418a);
        }

        private b(float f10) {
            this.f18418a = f10;
        }
    }

    int a(@NotNull androidx.compose.ui.unit.d dVar, int i10, int i11);
}
