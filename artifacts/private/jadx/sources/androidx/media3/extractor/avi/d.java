package androidx.media3.extractor.avi;

import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;

/* JADX INFO: loaded from: classes3.dex */
final class d implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f67082h = "AviStreamHeaderChunk";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f67087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f67088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f67089g;

    private d(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f67083a = i10;
        this.f67084b = i11;
        this.f67085c = i12;
        this.f67086d = i13;
        this.f67087e = i14;
        this.f67088f = i15;
        this.f67089g = i16;
    }

    public static d e(o0 o0Var) {
        int iW = o0Var.w();
        o0Var.b0(12);
        int iW2 = o0Var.w();
        int iW3 = o0Var.w();
        int iW4 = o0Var.w();
        o0Var.b0(4);
        int iW5 = o0Var.w();
        int iW6 = o0Var.w();
        o0Var.b0(4);
        return new d(iW, iW2, iW3, iW4, iW5, iW6, o0Var.w());
    }

    public long a() {
        return k1.X1(this.f67087e, ((long) this.f67085c) * 1000000, this.f67086d);
    }

    public float b() {
        return this.f67086d / this.f67085c;
    }

    @Override // androidx.media3.extractor.avi.a
    public int c() {
        return b.F;
    }

    public int d() {
        int i10 = this.f67083a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        z.n(f67082h, "Found unsupported streamType fourCC: " + Integer.toHexString(this.f67083a));
        int i11 = 0 & (-1);
        return -1;
    }
}
