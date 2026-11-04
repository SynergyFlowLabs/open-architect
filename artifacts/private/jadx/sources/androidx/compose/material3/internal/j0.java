package androidx.compose.material3.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface j0 {

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class a implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f28960a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28961b = 0;

        private a() {
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class b implements j0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f28962e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f28963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f28964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f28965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final n3 f28966d;

        public b(float f10, float f11, float f12, @NotNull n3 n3Var) {
            this.f28963a = f10;
            this.f28964b = f11;
            this.f28965c = f12;
            this.f28966d = n3Var;
        }

        public static /* synthetic */ b f(b bVar, float f10, float f11, float f12, n3 n3Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = bVar.f28963a;
            }
            if ((i10 & 2) != 0) {
                f11 = bVar.f28964b;
            }
            if ((i10 & 4) != 0) {
                f12 = bVar.f28965c;
            }
            if ((i10 & 8) != 0) {
                n3Var = bVar.f28966d;
            }
            return bVar.e(f10, f11, f12, n3Var);
        }

        public final float a() {
            return this.f28963a;
        }

        public final float b() {
            return this.f28964b;
        }

        public final float c() {
            return this.f28965c;
        }

        @NotNull
        public final n3 d() {
            return this.f28966d;
        }

        @NotNull
        public final b e(float f10, float f11, float f12, @NotNull n3 n3Var) {
            return new b(f10, f11, f12, n3Var);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.f28963a, bVar.f28963a) == 0 && Float.compare(this.f28964b, bVar.f28964b) == 0 && Float.compare(this.f28965c, bVar.f28965c) == 0 && this.f28966d == bVar.f28966d;
        }

        public final float g() {
            return this.f28965c;
        }

        @NotNull
        public final n3 h() {
            return this.f28966d;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f28963a) * 31) + Float.hashCode(this.f28964b)) * 31) + Float.hashCode(this.f28965c)) * 31) + this.f28966d.hashCode();
        }

        public final float i() {
            return this.f28963a;
        }

        public final float j() {
            return this.f28964b;
        }

        @NotNull
        public String toString() {
            return "InProgress(touchX=" + this.f28963a + ", touchY=" + this.f28964b + ", progress=" + this.f28965c + ", swipeEdge=" + this.f28966d + ')';
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class c implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f28967a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28968b = 0;

        private c() {
        }
    }
}
