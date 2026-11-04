package androidx.media3.exoplayer.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f64714b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f64715c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f64716d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f64717e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f64718f = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f64719a;

    class a implements Parcelable.Creator<Requirements> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Requirements[] newArray(int i10) {
            return new Requirements[i10];
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public Requirements(int i10) {
        this.f64719a = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    private int c(Context context) {
        if (!l()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) androidx.media3.common.util.a.g(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && k(connectivityManager)) {
            return (o() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0;
        }
        return this.f64719a & 3;
    }

    private boolean h(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private boolean i(Context context) {
        PowerManager powerManager = (PowerManager) androidx.media3.common.util.a.g(context.getSystemService("power"));
        if (k1.f61540a >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        return !powerManager.isInteractive();
    }

    private static boolean k(ConnectivityManager connectivityManager) {
        if (k1.f61540a < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            return networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException unused) {
            return true;
        }
    }

    private boolean m(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    public boolean a(Context context) {
        return e(context) == 0;
    }

    public Requirements b(int i10) {
        int i11 = this.f64719a;
        int i12 = i10 & i11;
        return i12 == i11 ? this : new Requirements(i12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e(Context context) {
        int iC = c(context);
        if (g() && !h(context)) {
            iC |= 8;
        }
        if (j() && !i(context)) {
            iC |= 4;
        }
        return (!n() || m(context)) ? iC : iC | 16;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f64719a == ((Requirements) obj).f64719a;
    }

    public int f() {
        return this.f64719a;
    }

    public boolean g() {
        return (this.f64719a & 8) != 0;
    }

    public int hashCode() {
        return this.f64719a;
    }

    public boolean j() {
        return (this.f64719a & 4) != 0;
    }

    public boolean l() {
        return (this.f64719a & 1) != 0;
    }

    public boolean n() {
        return (this.f64719a & 16) != 0;
    }

    public boolean o() {
        return (this.f64719a & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f64719a);
    }
}
