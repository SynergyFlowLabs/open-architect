package androidx.compose.foundation;

import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f18176a = a.f18177a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f18177a = new a();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int c(float f10, androidx.compose.ui.unit.d dVar, int i10, int i11) {
            return kotlin.math.b.L0(f10 * i11);
        }

        @NotNull
        public final p3 b(final float f10) {
            return new p3() { // from class: androidx.compose.foundation.o3
                @Override // androidx.compose.foundation.p3
                public final int a(androidx.compose.ui.unit.d dVar, int i10, int i11) {
                    return p3.a.c(f10, dVar, i10, i11);
                }
            };
        }
    }

    int a(@NotNull androidx.compose.ui.unit.d dVar, int i10, int i11);
}
