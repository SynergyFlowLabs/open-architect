package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "CloudMessageCreator")
public final class CloudMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f105743c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f105744d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f105745e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(id = 1)
    final Intent f105746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f105747b;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @SafeParcelable.b
    @g6.a
    public CloudMessage(@NonNull @SafeParcelable.e(id = 1) Intent intent) {
        this.f105746a = intent;
    }

    private static int W2(@p0 String str) {
        if (Objects.equals(str, "high")) {
            return 1;
        }
        return Objects.equals(str, "normal") ? 2 : 0;
    }

    @p0
    public String B2() {
        return this.f105746a.getStringExtra(com.google.firebase.messaging.e.d.f123516g);
    }

    public int D2() {
        Bundle extras = this.f105746a.getExtras();
        Object obj = extras != null ? extras.get(com.google.firebase.messaging.e.d.f123518i) : null;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                "Invalid TTL: ".concat(String.valueOf(obj));
            }
        }
        return 0;
    }

    @p0
    public String O1() {
        return this.f105746a.getStringExtra(com.google.firebase.messaging.e.d.f123514e);
    }

    @NonNull
    public synchronized Map<String, String> T1() {
        try {
            if (this.f105747b == null) {
                Bundle extras = this.f105746a.getExtras();
                androidx.collection.a aVar = new androidx.collection.a();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        Object obj = extras.get(str);
                        if (obj instanceof String) {
                            String str2 = (String) obj;
                            if (!str.startsWith(com.google.firebase.messaging.e.d.f123510a) && !str.equals("from") && !str.equals(com.google.firebase.messaging.e.d.f123513d) && !str.equals(com.google.firebase.messaging.e.d.f123514e)) {
                                aVar.put(str, str2);
                            }
                        }
                    }
                }
                this.f105747b = aVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f105747b;
    }

    @p0
    final Integer U2() {
        if (this.f105746a.hasExtra(com.google.firebase.messaging.e.d.f123524o)) {
            return Integer.valueOf(this.f105746a.getIntExtra(com.google.firebase.messaging.e.d.f123524o, 0));
        }
        return null;
    }

    @p0
    public String b2() {
        return this.f105746a.getStringExtra("from");
    }

    @NonNull
    public Intent e2() {
        return this.f105746a;
    }

    @p0
    public String f2() {
        String stringExtra = this.f105746a.getStringExtra(com.google.firebase.messaging.e.d.f123517h);
        return stringExtra == null ? this.f105746a.getStringExtra(com.google.firebase.messaging.e.d.f123515f) : stringExtra;
    }

    @p0
    public String n2() {
        return this.f105746a.getStringExtra(com.google.firebase.messaging.e.d.f123513d);
    }

    public int p2() {
        String stringExtra = this.f105746a.getStringExtra(com.google.firebase.messaging.e.d.f123520k);
        if (stringExtra == null) {
            stringExtra = this.f105746a.getStringExtra(com.google.firebase.messaging.e.d.f123522m);
        }
        return W2(stringExtra);
    }

    public int q2() {
        String stringExtra = this.f105746a.getStringExtra(com.google.firebase.messaging.e.d.f123521l);
        if (stringExtra == null) {
            if (Objects.equals(this.f105746a.getStringExtra(com.google.firebase.messaging.e.d.f123523n), "1")) {
                return 2;
            }
            stringExtra = this.f105746a.getStringExtra(com.google.firebase.messaging.e.d.f123522m);
        }
        return W2(stringExtra);
    }

    @p0
    public byte[] s2() {
        return this.f105746a.getByteArrayExtra(com.google.firebase.messaging.e.d.f123512c);
    }

    @p0
    public String u2() {
        return this.f105746a.getStringExtra(com.google.firebase.messaging.e.d.f123526q);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 1, this.f105746a, i10, false);
        i6.b.b(parcel, iA);
    }

    public long z2() {
        Bundle extras = this.f105746a.getExtras();
        Object obj = extras != null ? extras.get(com.google.firebase.messaging.e.d.f123519j) : null;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                "Invalid sent time: ".concat(String.valueOf(obj));
            }
        }
        return 0L;
    }
}
