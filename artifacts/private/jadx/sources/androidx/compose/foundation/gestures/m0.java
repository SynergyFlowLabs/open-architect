package androidx.compose.foundation.gestures;

import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f14804a = a.f14805a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f14805a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final androidx.compose.animation.core.o<Float> f14806b = androidx.compose.animation.core.p.r(0.0f, 0.0f, null, 7, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final m0 f14807c = new C0081a();

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.m0$a$a, reason: collision with other inner class name */
        public static final class C0081a implements m0 {
            C0081a() {
            }
        }

        private a() {
        }

        public final float a(float f10, float f11, float f12) {
            float f13 = f11 + f10;
            if (f10 >= 0.0f && f13 <= f12) {
                return 0.0f;
            }
            if (f10 < 0.0f && f13 > f12) {
                return 0.0f;
            }
            float f14 = f13 - f12;
            return Math.abs(f10) < Math.abs(f14) ? f10 : f14;
        }

        @NotNull
        public final m0 b() {
            return f14807c;
        }

        @NotNull
        public final androidx.compose.animation.core.o<Float> c() {
            return f14806b;
        }
    }

    @kotlin.l(message = "Animation spec customization is no longer supported.")
    static /* synthetic */ void c() {
    }

    @kotlin.l(message = "Animation spec customization is no longer supported.")
    @NotNull
    default androidx.compose.animation.core.o<Float> a() {
        return f14804a.c();
    }

    default float b(float f10, float f11, float f12) {
        return f14804a.a(f10, f11, f12);
    }
}
