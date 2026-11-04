package androidx.core.view;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
class s1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f48941f = 100;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f48942g = 20;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f48943h = 40;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f48944a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f48945b = new long[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f48946c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48947d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48948e = 0;

    s1() {
    }

    private void b() {
        this.f48947d = 0;
        this.f48946c = 0.0f;
    }

    private float f() {
        long[] jArr;
        long j10;
        int i10 = this.f48947d;
        if (i10 < 2) {
            return 0.0f;
        }
        int i11 = this.f48948e;
        int i12 = ((i11 + 20) - (i10 - 1)) % 20;
        long j11 = this.f48945b[i11];
        while (true) {
            jArr = this.f48945b;
            j10 = jArr[i12];
            if (j11 - j10 <= f48941f) {
                break;
            }
            this.f48947d--;
            i12 = (i12 + 1) % 20;
        }
        int i13 = this.f48947d;
        if (i13 < 2) {
            return 0.0f;
        }
        if (i13 == 2) {
            int i14 = (i12 + 1) % 20;
            long j12 = jArr[i14];
            if (j10 == j12) {
                return 0.0f;
            }
            return this.f48944a[i14] / (j12 - j10);
        }
        float fAbs = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f48947d - 1; i16++) {
            int i17 = i16 + i12;
            long[] jArr2 = this.f48945b;
            long j13 = jArr2[i17 % 20];
            int i18 = (i17 + 1) % 20;
            if (jArr2[i18] != j13) {
                i15++;
                float fG = g(fAbs);
                float f10 = this.f48944a[i18] / (this.f48945b[i18] - j13);
                fAbs += (f10 - fG) * Math.abs(f10);
                if (i15 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return g(fAbs);
    }

    private static float g(float f10) {
        return (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
    }

    void a(@NonNull MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f48947d != 0 && eventTime - this.f48945b[this.f48948e] > f48943h) {
            b();
        }
        int i10 = (this.f48948e + 1) % 20;
        this.f48948e = i10;
        int i11 = this.f48947d;
        if (i11 != 20) {
            this.f48947d = i11 + 1;
        }
        this.f48944a[i10] = motionEvent.getAxisValue(26);
        this.f48945b[this.f48948e] = eventTime;
    }

    void c(int i10) {
        d(i10, Float.MAX_VALUE);
    }

    void d(int i10, float f10) {
        float f11 = f() * i10;
        this.f48946c = f11;
        if (f11 < (-Math.abs(f10))) {
            this.f48946c = -Math.abs(f10);
        } else {
            if (this.f48946c > Math.abs(f10)) {
                this.f48946c = Math.abs(f10);
            }
        }
    }

    float e(int i10) {
        if (i10 != 26) {
            return 0.0f;
        }
        return this.f48946c;
    }
}
