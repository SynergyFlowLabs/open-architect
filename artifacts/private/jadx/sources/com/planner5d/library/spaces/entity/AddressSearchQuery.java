package com.planner5d.library.spaces.entity;

import androidx.compose.runtime.internal.w0;
import com.squareup.moshi.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 1)
@i(generateAdapter = true)
public final class AddressSearchQuery {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f230136d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f230137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f230138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f230139c;

    public AddressSearchQuery(@Nullable String str, double d10, double d11) {
        this.f230137a = str;
        this.f230138b = d10;
        this.f230139c = d11;
    }

    public static /* synthetic */ AddressSearchQuery e(AddressSearchQuery addressSearchQuery, String str, double d10, double d11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = addressSearchQuery.f230137a;
        }
        if ((i10 & 2) != 0) {
            d10 = addressSearchQuery.f230138b;
        }
        if ((i10 & 4) != 0) {
            d11 = addressSearchQuery.f230139c;
        }
        return addressSearchQuery.d(str, d10, d11);
    }

    @Nullable
    public final String a() {
        return this.f230137a;
    }

    public final double b() {
        return this.f230138b;
    }

    public final double c() {
        return this.f230139c;
    }

    @NotNull
    public final AddressSearchQuery d(@Nullable String str, double d10, double d11) {
        return new AddressSearchQuery(str, d10, d11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressSearchQuery)) {
            return false;
        }
        AddressSearchQuery addressSearchQuery = (AddressSearchQuery) obj;
        return Intrinsics.areEqual(this.f230137a, addressSearchQuery.f230137a) && Double.compare(this.f230138b, addressSearchQuery.f230138b) == 0 && Double.compare(this.f230139c, addressSearchQuery.f230139c) == 0;
    }

    @Nullable
    public final String f() {
        return this.f230137a;
    }

    public final double g() {
        return this.f230138b;
    }

    public final double h() {
        return this.f230139c;
    }

    public int hashCode() {
        String str = this.f230137a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Double.hashCode(this.f230138b)) * 31) + Double.hashCode(this.f230139c);
    }

    @NotNull
    public String toString() {
        return "AddressSearchQuery(address=" + this.f230137a + ", latitude=" + this.f230138b + ", longitude=" + this.f230139c + ")";
    }

    public /* synthetic */ AddressSearchQuery(String str, double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? 0.0d : d10, (i10 & 4) != 0 ? 0.0d : d11);
    }
}
