package com.planner5d.library.widget.editor.editor2d;

import android.graphics.Path;
import androidx.annotation.g0;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class a extends Path {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @g0(from = 3)
    private static final int f254857e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f254858f = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final float[][] f254861i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f254862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f254863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C1726a f254855c = new C1726a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f254856d = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final float[] f254859g = new float[7];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final float[] f254860h = new float[7];

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.editor2d.a$a, reason: collision with other inner class name */
    private static final class C1726a {
        public /* synthetic */ C1726a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void a() {
        }

        private static /* synthetic */ void b() {
        }

        private C1726a() {
        }
    }

    static {
        int i10 = 0;
        while (i10 < 7) {
            int i11 = i10 + 1;
            double d10 = 0.7853981633974483d * ((double) i11);
            f254859g[i10] = (float) Math.sin(d10);
            f254860h[i10] = (float) Math.cos(d10);
            i10 = i11;
        }
        float[][] fArr = new float[8][];
        int i12 = 0;
        for (int i13 = 8; i12 < i13; i13 = 8) {
            int i14 = i12 + 1;
            double d11 = ((double) i14) / 8.0d;
            double d12 = ((double) 1) - d11;
            double d13 = 3;
            double d14 = 2;
            fArr[i12] = new float[]{(float) Math.pow(d12, d13), (float) (d13 * d11 * Math.pow(d12, d14)), (float) (Math.pow(d11, d14) * d13 * d12), (float) Math.pow(d11, d13)};
            i12 = i14;
        }
        f254861i = fArr;
    }

    @Override // android.graphics.Path
    public void addCircle(float f10, float f11, float f12, @NotNull Path.Direction dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        moveTo(f10 + f12, f11);
        for (int i10 = 0; i10 < 7; i10++) {
            lineTo((f254860h[i10] * f12) + f10, (f254859g[i10] * f12) + f11);
        }
        close();
    }

    @Override // android.graphics.Path
    public void addOval(float f10, float f11, float f12, float f13, @NotNull Path.Direction dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        float f14 = 2;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        float f17 = (f10 + f12) / f14;
        float f18 = (f11 + f13) / f14;
        moveTo(f17 + f15, f18);
        for (int i10 = 0; i10 < 7; i10++) {
            lineTo((f254860h[i10] * f15) + f17, (f254859g[i10] * f16) + f18);
        }
        close();
    }

    @Override // android.graphics.Path
    public void arcTo(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
        float f16 = 2;
        double radians = Math.toRadians(f14);
        double d10 = (f10 + f12) / f16;
        double d11 = (f12 - f10) / f16;
        double d12 = (f11 + f13) / f16;
        double d13 = (f13 - f11) / f16;
        lineTo((float) ((Math.cos(radians) * d11) + d10), (float) ((Math.sin(radians) * d13) + d12));
        double radians2 = Math.toRadians(((double) f15) / 8.0d);
        int i10 = 1;
        while (i10 <= 8) {
            double d14 = (((double) i10) * radians2) + radians;
            lineTo((float) (d10 + (Math.cos(d14) * d11)), (float) ((Math.sin(d14) * d13) + d12));
            i10++;
            d11 = d11;
        }
    }

    @Override // android.graphics.Path
    public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = this.f254862a;
        float f17 = this.f254863b;
        for (int i10 = 0; i10 < 8; i10++) {
            float[] fArr = f254861i[i10];
            float f18 = fArr[0];
            float f19 = fArr[1];
            float f20 = fArr[2];
            float f21 = fArr[3];
            lineTo((f16 * f18) + (f10 * f19) + (f12 * f20) + (f14 * f21), (f18 * f17) + (f19 * f11) + (f20 * f13) + (f21 * f15));
        }
    }

    @Override // android.graphics.Path
    public void lineTo(float f10, float f11) {
        super.lineTo(f10, f11);
        this.f254862a = f10;
        this.f254863b = f11;
    }

    @Override // android.graphics.Path
    public void moveTo(float f10, float f11) {
        super.moveTo(f10, f11);
        this.f254862a = f10;
        this.f254863b = f11;
    }
}
