package androidx.media2.exoplayer.external.video.spherical;

import androidx.annotation.b1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f57892e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f57893f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f57894g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f57895h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f57896i = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f57897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f57898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f57900d;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c[] f57901a;

        public b(c... subMeshes) {
            this.f57901a = subMeshes;
        }

        public c a(int index) {
            return this.f57901a[index];
        }

        public int b() {
            return this.f57901a.length;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f57902e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f57904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f57905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f57906d;

        public c(int textureId, float[] vertices, float[] textureCoords, int mode) {
            this.f57903a = textureId;
            androidx.media2.exoplayer.external.util.a.a(((long) vertices.length) * 2 == ((long) textureCoords.length) * 3);
            this.f57905c = vertices;
            this.f57906d = textureCoords;
            this.f57904b = mode;
        }

        public int a() {
            return this.f57905c.length / 3;
        }
    }

    public d(b mesh, int stereoMode) {
        this(mesh, mesh, stereoMode);
    }

    public static d a(float radius, int latitudes, int longitudes, float verticalFovDegrees, float horizontalFovDegrees, int stereoMode) {
        int i10;
        int i11 = latitudes;
        androidx.media2.exoplayer.external.util.a.a(radius > 0.0f);
        androidx.media2.exoplayer.external.util.a.a(i11 >= 1);
        androidx.media2.exoplayer.external.util.a.a(longitudes >= 1);
        androidx.media2.exoplayer.external.util.a.a(verticalFovDegrees > 0.0f && verticalFovDegrees <= 180.0f);
        androidx.media2.exoplayer.external.util.a.a(horizontalFovDegrees > 0.0f && horizontalFovDegrees <= 360.0f);
        float radians = (float) Math.toRadians(verticalFovDegrees);
        float radians2 = (float) Math.toRadians(horizontalFovDegrees);
        float f10 = radians / i11;
        float f11 = radians2 / longitudes;
        int i12 = longitudes + 1;
        int i13 = ((i12 * 2) + 2) * i11;
        float[] fArr = new float[i13 * 3];
        float[] fArr2 = new float[i13 * 2];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i11) {
            float f12 = radians / 2.0f;
            float f13 = (i14 * f10) - f12;
            int i17 = i14 + 1;
            float f14 = (i17 * f10) - f12;
            int i18 = 0;
            while (i18 < i12) {
                float f15 = radians;
                float f16 = radians2;
                int i19 = 0;
                int i20 = 2;
                while (i19 < i20) {
                    float f17 = f10;
                    float f18 = i18 * f11;
                    float f19 = f11;
                    float f20 = f13;
                    double d10 = radius;
                    double d11 = (f18 + 3.1415927f) - (f16 / 2.0f);
                    double d12 = i19 == 0 ? f13 : f14;
                    fArr[i15] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                    fArr[i15 + 1] = (float) (d10 * Math.sin(d12));
                    int i21 = i15 + 3;
                    fArr[i15 + 2] = (float) (d10 * Math.cos(d11) * Math.cos(d12));
                    fArr2[i16] = f18 / f16;
                    int i22 = i16 + 2;
                    fArr2[i16 + 1] = ((i14 + i19) * f17) / f15;
                    if ((i18 == 0 && i19 == 0) || (i18 == longitudes && i19 == 1)) {
                        System.arraycopy(fArr, i15, fArr, i21, 3);
                        i15 += 6;
                        i10 = 2;
                        System.arraycopy(fArr2, i16, fArr2, i22, 2);
                        i16 += 4;
                    } else {
                        i10 = 2;
                        i15 = i21;
                        i16 = i22;
                    }
                    i19++;
                    i20 = i10;
                    f10 = f17;
                    f11 = f19;
                    f13 = f20;
                }
                i18++;
                radians2 = f16;
                radians = f15;
                f10 = f10;
            }
            i11 = latitudes;
            i14 = i17;
        }
        return new d(new b(new c(0, fArr, fArr2, 1)), stereoMode);
    }

    public static d b(int stereoMode) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, stereoMode);
    }

    public d(b leftMesh, b rightMesh, int stereoMode) {
        this.f57897a = leftMesh;
        this.f57898b = rightMesh;
        this.f57899c = stereoMode;
        this.f57900d = leftMesh == rightMesh;
    }
}
