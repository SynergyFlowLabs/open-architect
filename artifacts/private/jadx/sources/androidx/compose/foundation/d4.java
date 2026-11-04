package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f14136a = a.f14137a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f14137a = new a();

        private a() {
        }

        @k7
        @NotNull
        public final d4 a() {
            if (g3.d(0, 1, null)) {
                return f4.f14254b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    @NotNull
    c4 a(@NotNull View view, boolean z10, long j10, float f10, float f11, boolean z11, @NotNull androidx.compose.ui.unit.d dVar, float f12);

    boolean b();
}
