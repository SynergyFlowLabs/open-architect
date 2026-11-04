package u9;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f381200f = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f381201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f381202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[][] f381203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f381204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f381205e;

    public b(int i10, int i11) {
        this.f381201a = i10;
        this.f381202b = i11;
        if (i10 <= 0) {
            throw new IllegalArgumentException("sampleBufSize is invalid.");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("numAxes is invalid.");
        }
        this.f381203c = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i10, i11);
    }

    public void a(float[] fArr) {
        if (fArr.length < this.f381202b) {
            throw new IllegalArgumentException("values.length is less than # of axes.");
        }
        this.f381204d = (this.f381204d + 1) % this.f381201a;
        for (int i10 = 0; i10 < this.f381202b; i10++) {
            this.f381203c[this.f381204d][i10] = fArr[i10];
        }
        this.f381205e++;
    }

    public float b(int i10) {
        if (!f()) {
            throw new IllegalStateException("Average not available. Not enough samples.");
        }
        if (i10 < 0 || i10 >= this.f381202b) {
            int i11 = this.f381202b - 1;
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("axis must be between 0 and ");
            sb2.append(i11);
            throw new IllegalStateException(sb2.toString());
        }
        float f10 = 0.0f;
        int i12 = 0;
        while (true) {
            int i13 = this.f381201a;
            if (i12 >= i13) {
                return f10 / i13;
            }
            f10 += this.f381203c[i12][i10];
            i12++;
        }
    }

    public float c() {
        float fMax = 0.0f;
        for (int i10 = 0; i10 < this.f381202b; i10++) {
            fMax = Math.max(fMax, d(i10));
        }
        return fMax;
    }

    public float d(int i10) {
        if (i10 < 0 || i10 >= this.f381202b) {
            int i11 = this.f381202b - 1;
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("axis must be between 0 and ");
            sb2.append(i11);
            throw new IllegalStateException(sb2.toString());
        }
        float fB = b(i10);
        float fMax = 0.0f;
        for (int i12 = 0; i12 < this.f381201a; i12++) {
            fMax = Math.max(Math.abs(this.f381203c[i12][i10] - fB), fMax);
        }
        return fMax;
    }

    public void e() {
        this.f381205e = 0;
        this.f381204d = 0;
    }

    public boolean f() {
        return this.f381205e >= this.f381201a;
    }
}
