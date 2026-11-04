package com.planner5d.library.services.utility;

import com.planner5d.android.libtess2.Tessellator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class j3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f225290b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f225289a = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final com.planner5d.library.math.h f225291c = new com.planner5d.library.math.h(new a());

    public static final class a implements com.planner5d.library.math.h.a {
        a() {
        }

        @Override // com.planner5d.library.math.h.a
        public float[] a(float[][] contours) {
            Intrinsics.checkNotNullParameter(contours, "contours");
            float[] fArrA = new Tessellator().a(contours);
            Intrinsics.checkNotNullExpressionValue(fArrA, "tessellate(...)");
            return fArrA;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private j3() {
    }
}
