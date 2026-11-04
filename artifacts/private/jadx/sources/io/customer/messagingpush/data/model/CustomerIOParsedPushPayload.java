package io.customer.messagingpush.data.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class CustomerIOParsedPushPayload implements Parcelable {

    @NotNull
    public static final a CREATOR = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bundle f288423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f288424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f288425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f288426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f288427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f288428f;

    public static final class a implements Parcelable.Creator<CustomerIOParsedPushPayload> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomerIOParsedPushPayload createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomerIOParsedPushPayload(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CustomerIOParsedPushPayload[] newArray(int i10) {
            return new CustomerIOParsedPushPayload[i10];
        }

        private a() {
        }
    }

    public CustomerIOParsedPushPayload(@NotNull Bundle extras, @Nullable String str, @NotNull String cioDeliveryId, @NotNull String cioDeliveryToken, @NotNull String title, @NotNull String body) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(cioDeliveryId, "cioDeliveryId");
        Intrinsics.checkNotNullParameter(cioDeliveryToken, "cioDeliveryToken");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f288423a = extras;
        this.f288424b = str;
        this.f288425c = cioDeliveryId;
        this.f288426d = cioDeliveryToken;
        this.f288427e = title;
        this.f288428f = body;
    }

    public static /* synthetic */ CustomerIOParsedPushPayload i(CustomerIOParsedPushPayload customerIOParsedPushPayload, Bundle bundle, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bundle = customerIOParsedPushPayload.f288423a;
        }
        if ((i10 & 2) != 0) {
            str = customerIOParsedPushPayload.f288424b;
        }
        if ((i10 & 4) != 0) {
            str2 = customerIOParsedPushPayload.f288425c;
        }
        if ((i10 & 8) != 0) {
            str3 = customerIOParsedPushPayload.f288426d;
        }
        if ((i10 & 16) != 0) {
            str4 = customerIOParsedPushPayload.f288427e;
        }
        if ((i10 & 32) != 0) {
            str5 = customerIOParsedPushPayload.f288428f;
        }
        String str6 = str4;
        String str7 = str5;
        return customerIOParsedPushPayload.h(bundle, str, str2, str3, str6, str7);
    }

    @NotNull
    public final Bundle a() {
        return this.f288423a;
    }

    @Nullable
    public final String b() {
        return this.f288424b;
    }

    @NotNull
    public final String c() {
        return this.f288425c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String e() {
        return this.f288426d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerIOParsedPushPayload)) {
            return false;
        }
        CustomerIOParsedPushPayload customerIOParsedPushPayload = (CustomerIOParsedPushPayload) obj;
        if (Intrinsics.areEqual(this.f288423a, customerIOParsedPushPayload.f288423a) && Intrinsics.areEqual(this.f288424b, customerIOParsedPushPayload.f288424b) && Intrinsics.areEqual(this.f288425c, customerIOParsedPushPayload.f288425c) && Intrinsics.areEqual(this.f288426d, customerIOParsedPushPayload.f288426d) && Intrinsics.areEqual(this.f288427e, customerIOParsedPushPayload.f288427e) && Intrinsics.areEqual(this.f288428f, customerIOParsedPushPayload.f288428f)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String f() {
        return this.f288427e;
    }

    @NotNull
    public final String g() {
        return this.f288428f;
    }

    @NotNull
    public final CustomerIOParsedPushPayload h(@NotNull Bundle extras, @Nullable String str, @NotNull String cioDeliveryId, @NotNull String cioDeliveryToken, @NotNull String title, @NotNull String body) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(cioDeliveryId, "cioDeliveryId");
        Intrinsics.checkNotNullParameter(cioDeliveryToken, "cioDeliveryToken");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        return new CustomerIOParsedPushPayload(extras, str, cioDeliveryId, cioDeliveryToken, title, body);
    }

    public int hashCode() {
        int iHashCode = this.f288423a.hashCode() * 31;
        String str = this.f288424b;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f288425c.hashCode()) * 31) + this.f288426d.hashCode()) * 31) + this.f288427e.hashCode()) * 31) + this.f288428f.hashCode();
    }

    @NotNull
    public final String j() {
        return this.f288428f;
    }

    @NotNull
    public final String k() {
        return this.f288425c;
    }

    @NotNull
    public final String l() {
        return this.f288426d;
    }

    @Nullable
    public final String m() {
        return this.f288424b;
    }

    @NotNull
    public final Bundle n() {
        return this.f288423a;
    }

    @NotNull
    public final String o() {
        return this.f288427e;
    }

    @NotNull
    public String toString() {
        return "CustomerIOParsedPushPayload(extras=" + this.f288423a + ", deepLink=" + this.f288424b + ", cioDeliveryId=" + this.f288425c + ", cioDeliveryToken=" + this.f288426d + ", title=" + this.f288427e + ", body=" + this.f288428f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeBundle(this.f288423a);
        parcel.writeString(this.f288424b);
        parcel.writeString(this.f288425c);
        parcel.writeString(this.f288426d);
        parcel.writeString(this.f288427e);
        parcel.writeString(this.f288428f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomerIOParsedPushPayload(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Bundle bundle = parcel.readBundle(Bundle.class.getClassLoader());
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        String string = parcel.readString();
        String string2 = parcel.readString();
        String str = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        String str2 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        String str3 = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        this(bundle2, string, str, str2, str3, string5 == null ? "" : string5);
    }
}
