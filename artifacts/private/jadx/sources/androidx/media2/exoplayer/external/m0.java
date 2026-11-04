package androidx.media2.exoplayer.external;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m0 f55312e = new m0(1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f55313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f55314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f55316d;

    public m0(float speed) {
        this(speed, 1.0f, false);
    }

    public long a(long timeMs) {
        return timeMs * ((long) this.f55316d);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.f55313a == m0Var.f55313a && this.f55314b == m0Var.f55314b && this.f55315c == m0Var.f55315c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.f55313a)) * 31) + Float.floatToRawIntBits(this.f55314b)) * 31) + (this.f55315c ? 1 : 0);
    }

    public m0(float speed, float pitch) {
        this(speed, pitch, false);
    }

    public m0(float speed, float pitch, boolean skipSilence) {
        androidx.media2.exoplayer.external.util.a.a(speed > 0.0f);
        androidx.media2.exoplayer.external.util.a.a(pitch > 0.0f);
        this.f55313a = speed;
        this.f55314b = pitch;
        this.f55315c = skipSilence;
        this.f55316d = Math.round(speed * 1000.0f);
    }
}
