package androidx.compose.foundation.gestures;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<m0> f14890a = androidx.compose.runtime.a1.l(new Function1() { // from class: androidx.compose.foundation.gestures.n0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return o0.b((androidx.compose.runtime.v0) obj);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final m0 f14891b = new a();

    public static final class a implements m0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f14892b = 0.3f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f14893c;

        a() {
        }

        @Override // androidx.compose.foundation.gestures.m0
        public float b(float f10, float f11, float f12) {
            float fAbs = Math.abs((f11 + f10) - f10);
            boolean z10 = fAbs <= f12;
            float f13 = (this.f14892b * f12) - (this.f14893c * fAbs);
            float f14 = f12 - f13;
            if (z10 && f14 < fAbs) {
                f13 = f12 - fAbs;
            }
            return f10 - f13;
        }

        public final float d() {
            return this.f14893c;
        }

        public final float e() {
            return this.f14892b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 b(androidx.compose.runtime.v0 v0Var) {
        return !((Context) v0Var.H0(AndroidCompositionLocals_androidKt.g())).getPackageManager().hasSystemFeature("android.software.leanback") ? m0.f14804a.b() : f14891b;
    }

    @NotNull
    public static final androidx.compose.runtime.m4<m0> c() {
        return f14890a;
    }

    @androidx.compose.foundation.b2
    public static /* synthetic */ void d() {
    }

    @NotNull
    public static final m0 e() {
        return f14891b;
    }

    public static /* synthetic */ void f() {
    }
}
