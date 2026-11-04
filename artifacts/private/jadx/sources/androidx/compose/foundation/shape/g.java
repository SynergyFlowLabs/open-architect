package androidx.compose.foundation.shape;

import androidx.annotation.g0;
import androidx.compose.runtime.k7;
import androidx.compose.ui.platform.q2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final f f18739a = new a();

    public static final class a implements f, q2 {
        a() {
        }

        @Override // androidx.compose.foundation.shape.f
        public float a(long j10, androidx.compose.ui.unit.d dVar) {
            return 0.0f;
        }

        @Override // androidx.compose.ui.platform.q2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String b() {
            return "ZeroCornerSize";
        }

        public String toString() {
            return "ZeroCornerSize";
        }
    }

    @k7
    @NotNull
    public static final f a(float f10) {
        return new m(f10);
    }

    @k7
    @NotNull
    public static final f b(@g0(from = 0, to = 100) int i10) {
        return new l(i10);
    }

    @k7
    @NotNull
    public static final f c(float f10) {
        return new j(f10, null);
    }

    @NotNull
    public static final f d() {
        return f18739a;
    }

    @k7
    public static /* synthetic */ void e() {
    }
}
