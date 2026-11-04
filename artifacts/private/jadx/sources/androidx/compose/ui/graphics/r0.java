package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38151b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ColorFilter f38152a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ r0 d(a aVar, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = d0.f37693b.z();
            }
            return aVar.c(j10, i10);
        }

        @k7
        @NotNull
        public final r0 a(@NotNull float[] fArr) {
            return new u0(fArr, (DefaultConstructorMarker) null);
        }

        @k7
        @NotNull
        public final r0 b(long j10, long j11) {
            return new a2(j10, j11, (DefaultConstructorMarker) null);
        }

        @k7
        @NotNull
        public final r0 c(long j10, int i10) {
            return new e0(j10, i10, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public r0(@NotNull ColorFilter colorFilter) {
        this.f38152a = colorFilter;
    }

    @NotNull
    public final ColorFilter a() {
        return this.f38152a;
    }
}
