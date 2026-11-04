package com.google.accompanist.permissions;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@com.google.accompanist.permissions.a
@k7
public interface j {

    @w0(parameters = 1)
    public static final class a implements j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f103110b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f103111a;

        public a(boolean z10) {
            this.f103111a = z10;
        }

        public static /* synthetic */ a c(a aVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = aVar.f103111a;
            }
            return aVar.b(z10);
        }

        public final boolean a() {
            return this.f103111a;
        }

        @NotNull
        public final a b(boolean z10) {
            return new a(z10);
        }

        public final boolean d() {
            return this.f103111a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f103111a == ((a) obj).f103111a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f103111a);
        }

        @NotNull
        public String toString() {
            return "Denied(shouldShowRationale=" + this.f103111a + ')';
        }
    }

    @w0(parameters = 1)
    public static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f103112a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f103113b = 0;

        private b() {
        }
    }
}
