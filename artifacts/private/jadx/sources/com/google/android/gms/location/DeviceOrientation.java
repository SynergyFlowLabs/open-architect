package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.q3;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "DeviceOrientationCreator")
@SafeParcelable.g({2, 3})
public class DeviceOrientation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceOrientation> CREATOR = new z0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAttitude", id = 1)
    private final float[] f109513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getHeadingDegrees", id = 4)
    private final float f109514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getHeadingErrorDegrees", id = 5)
    private final float f109515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getElapsedRealtimeNs", id = 6)
    private final long f109516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getFieldMask", id = 7)
    private final byte f109517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getConservativeHeadingErrorVonMisesKappa", id = 8)
    private final float f109518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getConservativeHeadingErrorDegrees", id = 9)
    private final float f109519g;

    @SafeParcelable.b
    DeviceOrientation(@SafeParcelable.e(id = 1) float[] fArr, @SafeParcelable.e(id = 4) float f10, @SafeParcelable.e(id = 5) float f11, @SafeParcelable.e(id = 6) long j10, @SafeParcelable.e(id = 7) byte b10, @SafeParcelable.e(id = 8) float f12, @SafeParcelable.e(id = 9) float f13) {
        W2(fArr);
        boolean z10 = true;
        q3.a(f10 >= 0.0f && f10 < 360.0f);
        q3.a(f11 >= 0.0f && f11 <= 180.0f);
        q3.a(f13 >= 0.0f && f13 <= 180.0f);
        if (j10 < 0) {
            z10 = false;
        }
        q3.a(z10);
        this.f109513a = fArr;
        this.f109514b = f10;
        this.f109515c = f11;
        this.f109518f = f12;
        this.f109519g = f13;
        this.f109516d = j10;
        this.f109517e = (byte) (((byte) (((byte) (b10 | com.google.common.base.c.f116465r)) | 4)) | 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void W2(float[] fArr) {
        boolean z10 = true;
        q3.b(fArr != null && fArr.length == 4, "Input attitude array should be of length 4.");
        if (Float.isNaN(fArr[0]) || Float.isNaN(fArr[1]) || Float.isNaN(fArr[2]) || Float.isNaN(fArr[3])) {
            z10 = false;
        }
        q3.b(z10, "Input attitude cannot contain NaNs.");
    }

    final /* synthetic */ byte B2() {
        return this.f109517e;
    }

    final /* synthetic */ float D2() {
        return this.f109518f;
    }

    @NonNull
    @xl.d
    public float[] O1() {
        return (float[]) this.f109513a.clone();
    }

    @xl.d
    public float T1() {
        return this.f109519g;
    }

    final /* synthetic */ float U2() {
        return this.f109519g;
    }

    @xl.d
    public final boolean a() {
        return (this.f109517e & 32) != 0;
    }

    @xl.d
    public long b2() {
        return this.f109516d;
    }

    @xl.d
    public float e2() {
        return this.f109514b;
    }

    @xl.d
    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientation)) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) obj;
        return Float.compare(this.f109514b, deviceOrientation.f109514b) == 0 && Float.compare(this.f109515c, deviceOrientation.f109515c) == 0 && (a() == deviceOrientation.a() && (!a() || Float.compare(this.f109518f, deviceOrientation.f109518f) == 0)) && (n2() == deviceOrientation.n2() && (!n2() || Float.compare(T1(), deviceOrientation.T1()) == 0)) && this.f109516d == deviceOrientation.f109516d && Arrays.equals(this.f109513a, deviceOrientation.f109513a);
    }

    @xl.d
    public float f2() {
        return this.f109515c;
    }

    @xl.d
    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Float.valueOf(this.f109514b), Float.valueOf(this.f109515c), Float.valueOf(this.f109519g), Long.valueOf(this.f109516d), this.f109513a, Byte.valueOf(this.f109517e));
    }

    @xl.d
    public boolean n2() {
        return (this.f109517e & com.google.common.primitives.t.f119782a) != 0;
    }

    final /* synthetic */ float[] q2() {
        return this.f109513a;
    }

    final /* synthetic */ float s2() {
        return this.f109514b;
    }

    @NonNull
    @xl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceOrientation[");
        sb2.append("attitude=");
        sb2.append(Arrays.toString(this.f109513a));
        sb2.append(", headingDegrees=");
        sb2.append(this.f109514b);
        sb2.append(", headingErrorDegrees=");
        sb2.append(this.f109515c);
        if (n2()) {
            sb2.append(", conservativeHeadingErrorDegrees=");
            sb2.append(this.f109519g);
        }
        sb2.append(", elapsedRealtimeNs=");
        sb2.append(this.f109516d);
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    final /* synthetic */ float u2() {
        return this.f109515c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.x(parcel, 1, O1(), false);
        int i11 = 1 ^ 4;
        i6.b.w(parcel, 4, e2());
        i6.b.w(parcel, 5, f2());
        i6.b.K(parcel, 6, b2());
        i6.b.l(parcel, 7, this.f109517e);
        i6.b.w(parcel, 8, this.f109518f);
        i6.b.w(parcel, 9, T1());
        i6.b.b(parcel, iA);
    }

    final /* synthetic */ long z2() {
        return this.f109516d;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float[] f109520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f109521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f109522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f109523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f109524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f109525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f109526g;

        public a(@NonNull DeviceOrientation deviceOrientation) {
            this.f109524e = (byte) 0;
            DeviceOrientation.W2(deviceOrientation.q2());
            this.f109520a = Arrays.copyOf(deviceOrientation.q2(), deviceOrientation.q2().length);
            f(deviceOrientation.s2());
            g(deviceOrientation.u2());
            d(deviceOrientation.U2());
            e(deviceOrientation.z2());
            this.f109525f = deviceOrientation.D2();
            this.f109524e = deviceOrientation.B2();
        }

        @NonNull
        public DeviceOrientation a() {
            return new DeviceOrientation(this.f109520a, this.f109521b, this.f109522c, this.f109523d, this.f109524e, this.f109525f, this.f109526g);
        }

        @NonNull
        public a b() {
            this.f109526g = 180.0f;
            int i10 = this.f109524e & com.fasterxml.jackson.core.json.a.f102489k;
            this.f109525f = 0.0f;
            this.f109524e = (byte) (((byte) i10) & org.msgpack.core.h.a.J);
            return this;
        }

        @NonNull
        public a c(@NonNull float[] fArr) {
            DeviceOrientation.W2(fArr);
            System.arraycopy(fArr, 0, this.f109520a, 0, fArr.length);
            return this;
        }

        @NonNull
        public a d(float f10) {
            boolean z10 = false;
            if (f10 >= 0.0f && f10 <= 180.0f) {
                z10 = true;
            }
            q3.b(z10, "conservativeHeadingErrorDegrees should be between 0 and 180.");
            this.f109526g = f10;
            this.f109524e = (byte) (this.f109524e | com.google.common.primitives.t.f119782a);
            Parcelable.Creator<DeviceOrientation> creator = DeviceOrientation.CREATOR;
            this.f109525f = f10 < 180.0f ? (float) (2.0d / (1.0d - Math.cos(Math.toRadians(f10)))) : 0.0f;
            this.f109524e = (byte) (this.f109524e | 32);
            return this;
        }

        @NonNull
        public a e(long j10) {
            q3.b(j10 >= 0, "elapsedRealtimeNs should be greater than or equal to 0.");
            this.f109523d = j10;
            return this;
        }

        @NonNull
        public a f(float f10) {
            boolean z10 = false;
            if (f10 >= 0.0f && f10 < 360.0f) {
                z10 = true;
            }
            q3.b(z10, "headingDegrees should be greater than or equal to 0 and less than 360.");
            this.f109521b = f10;
            return this;
        }

        @NonNull
        public a g(float f10) {
            boolean z10 = false;
            if (f10 >= 0.0f && f10 <= 180.0f) {
                z10 = true;
            }
            q3.b(z10, "headingErrorDegrees should be between 0 and 180.");
            this.f109522c = f10;
            return this;
        }

        public a(@NonNull float[] fArr, float f10, float f11, long j10) {
            this.f109524e = (byte) 0;
            DeviceOrientation.W2(fArr);
            this.f109520a = Arrays.copyOf(fArr, fArr.length);
            f(f10);
            g(f11);
            e(j10);
            this.f109525f = 0.0f;
            this.f109526g = 180.0f;
            this.f109524e = (byte) 0;
        }
    }
}
