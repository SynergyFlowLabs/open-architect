package androidx.compose.ui.text.android.selection;

import android.text.SegmentFinder;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
@androidx.annotation.w0(34)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f41416a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41417b = 0;

    /* JADX INFO: renamed from: androidx.compose.ui.text.android.selection.a$a, reason: collision with other inner class name */
    public static final class C0332a extends SegmentFinder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f41418a;

        C0332a(e eVar) {
            this.f41418a = eVar;
        }

        public int nextEndBoundary(int i10) {
            return this.f41418a.d(i10);
        }

        public int nextStartBoundary(int i10) {
            return this.f41418a.b(i10);
        }

        public int previousEndBoundary(int i10) {
            return this.f41418a.a(i10);
        }

        public int previousStartBoundary(int i10) {
            return this.f41418a.c(i10);
        }
    }

    private a() {
    }

    @NotNull
    public final SegmentFinder a(@NotNull e eVar) {
        return androidx.compose.ui.text.android.a.a(new C0332a(eVar));
    }
}
