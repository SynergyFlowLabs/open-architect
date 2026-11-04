package androidx.compose.foundation.gestures.snapping;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface o {

    @w0(parameters = 1)
    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f15099a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f15100b = 0;

        private a() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.o
        public int a(int i10, int i11, int i12, int i13, int i14, int i15) {
            return (((i10 - i12) - i13) / 2) - (i11 / 2);
        }

        @NotNull
        public String toString() {
            return "Center";
        }
    }

    @w0(parameters = 1)
    public static final class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f15101a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f15102b = 0;

        private b() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.o
        public int a(int i10, int i11, int i12, int i13, int i14, int i15) {
            return ((i10 - i12) - i13) - i11;
        }

        @NotNull
        public String toString() {
            return "End";
        }
    }

    @w0(parameters = 1)
    public static final class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f15103a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f15104b = 0;

        private c() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.o
        public int a(int i10, int i11, int i12, int i13, int i14, int i15) {
            return 0;
        }

        @NotNull
        public String toString() {
            return "Start";
        }
    }

    int a(int i10, int i11, int i12, int i13, int i14, int i15);
}
