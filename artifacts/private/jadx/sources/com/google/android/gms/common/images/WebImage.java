package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "WebImageCreator")
public final class WebImage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<WebImage> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f106438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getUrl", id = 2)
    private final Uri f106439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getWidth", id = 3)
    private final int f106440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getHeight", id = 4)
    private final int f106441d;

    @SafeParcelable.b
    WebImage(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) Uri uri, @SafeParcelable.e(id = 3) int i11, @SafeParcelable.e(id = 4) int i12) {
        this.f106438a = i10;
        this.f106439b = uri;
        this.f106440c = i11;
        this.f106441d = i12;
    }

    public int O1() {
        return this.f106441d;
    }

    @NonNull
    public Uri T1() {
        return this.f106439b;
    }

    public int b2() {
        return this.f106440c;
    }

    @NonNull
    @g6.a
    public JSONObject e2() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f106439b.toString());
            jSONObject.put("width", this.f106440c);
            jSONObject.put("height", this.f106441d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (u.b(this.f106439b, webImage.f106439b) && this.f106440c == webImage.f106440c && this.f106441d == webImage.f106441d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return u.c(this.f106439b, Integer.valueOf(this.f106440c), Integer.valueOf(this.f106441d));
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f106440c), Integer.valueOf(this.f106441d), this.f106439b.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f106438a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        int i12 = 1 & 2;
        i6.b.S(parcel, 2, T1(), i10, false);
        i6.b.F(parcel, 3, b2());
        i6.b.F(parcel, 4, O1());
        i6.b.b(parcel, iA);
    }

    public WebImage(@NonNull Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebImage(@NonNull Uri uri, int i10, int i11) throws IllegalArgumentException {
        this(1, uri, i10, i11);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @g6.a
    public WebImage(@NonNull JSONObject jSONObject) throws IllegalArgumentException {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        this(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }
}
