package io.sentry.android.replay;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import io.sentry.p8;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 1)
public final class w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f305103g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f305104h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f305105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f305106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f305107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f305108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f305109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f305110f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(int i10) {
            int i11 = i10 % 16;
            return i11 <= 8 ? i10 - i11 : i10 + (16 - i11);
        }

        @NotNull
        public final w b(@NotNull Context context, @NotNull p8 sessionReplay, int i10, int i11) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sessionReplay, "sessionReplay");
            float f10 = i11;
            float f11 = i10;
            Pair pair = TuplesKt.to(Integer.valueOf(a(kotlin.math.b.L0((f10 / context.getResources().getDisplayMetrics().density) * sessionReplay.h().sizeScale))), Integer.valueOf(a(kotlin.math.b.L0((f11 / context.getResources().getDisplayMetrics().density) * sessionReplay.h().sizeScale))));
            int iIntValue = ((Number) pair.component1()).intValue();
            int iIntValue2 = ((Number) pair.component2()).intValue();
            return new w(iIntValue2, iIntValue, iIntValue2 / f11, iIntValue / f10, sessionReplay.d(), sessionReplay.h().bitRate);
        }

        private a() {
        }
    }

    public w(int i10, int i11, float f10, float f11, int i12, int i13) {
        this.f305105a = i10;
        this.f305106b = i11;
        this.f305107c = f10;
        this.f305108d = f11;
        this.f305109e = i12;
        this.f305110f = i13;
    }

    public static /* synthetic */ w h(w wVar, int i10, int i11, float f10, float f11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = wVar.f305105a;
        }
        if ((i14 & 2) != 0) {
            i11 = wVar.f305106b;
        }
        if ((i14 & 4) != 0) {
            f10 = wVar.f305107c;
        }
        if ((i14 & 8) != 0) {
            f11 = wVar.f305108d;
        }
        if ((i14 & 16) != 0) {
            i12 = wVar.f305109e;
        }
        if ((i14 & 32) != 0) {
            i13 = wVar.f305110f;
        }
        int i15 = i12;
        int i16 = i13;
        return wVar.g(i10, i11, f10, f11, i15, i16);
    }

    public final int a() {
        return this.f305105a;
    }

    public final int b() {
        return this.f305106b;
    }

    public final float c() {
        return this.f305107c;
    }

    public final float d() {
        return this.f305108d;
    }

    public final int e() {
        return this.f305109e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f305105a == wVar.f305105a && this.f305106b == wVar.f305106b && Float.compare(this.f305107c, wVar.f305107c) == 0 && Float.compare(this.f305108d, wVar.f305108d) == 0 && this.f305109e == wVar.f305109e && this.f305110f == wVar.f305110f;
    }

    public final int f() {
        return this.f305110f;
    }

    @NotNull
    public final w g(int i10, int i11, float f10, float f11, int i12, int i13) {
        return new w(i10, i11, f10, f11, i12, i13);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f305105a) * 31) + Integer.hashCode(this.f305106b)) * 31) + Float.hashCode(this.f305107c)) * 31) + Float.hashCode(this.f305108d)) * 31) + Integer.hashCode(this.f305109e)) * 31) + Integer.hashCode(this.f305110f);
    }

    public final int i() {
        return this.f305110f;
    }

    public final int j() {
        return this.f305109e;
    }

    public final int k() {
        return this.f305106b;
    }

    public final int l() {
        return this.f305105a;
    }

    public final float m() {
        return this.f305107c;
    }

    public final float n() {
        return this.f305108d;
    }

    @NotNull
    public String toString() {
        return "ScreenshotRecorderConfig(recordingWidth=" + this.f305105a + ", recordingHeight=" + this.f305106b + ", scaleFactorX=" + this.f305107c + ", scaleFactorY=" + this.f305108d + ", frameRate=" + this.f305109e + ", bitRate=" + this.f305110f + ')';
    }

    public w(float f10, float f11) {
        this(0, 0, f10, f11, 0, 0);
    }
}
