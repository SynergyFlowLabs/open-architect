package com.planner5d.library.spaces.entity;

import androidx.compose.runtime.internal.w0;
import com.squareup.moshi.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 1)
@i(generateAdapter = true)
public final class AddressSearchResult {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f230145d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f230146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f230147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f230148c;

    public AddressSearchResult(@NotNull String formatted, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(formatted, "formatted");
        this.f230146a = formatted;
        this.f230147b = str;
        this.f230148c = str2;
    }

    public static /* synthetic */ AddressSearchResult e(AddressSearchResult addressSearchResult, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = addressSearchResult.f230146a;
        }
        if ((i10 & 2) != 0) {
            str2 = addressSearchResult.f230147b;
        }
        if ((i10 & 4) != 0) {
            str3 = addressSearchResult.f230148c;
        }
        return addressSearchResult.d(str, str2, str3);
    }

    @NotNull
    public final String a() {
        return this.f230146a;
    }

    @Nullable
    public final String b() {
        return this.f230147b;
    }

    @Nullable
    public final String c() {
        return this.f230148c;
    }

    @NotNull
    public final AddressSearchResult d(@NotNull String formatted, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(formatted, "formatted");
        return new AddressSearchResult(formatted, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressSearchResult)) {
            return false;
        }
        AddressSearchResult addressSearchResult = (AddressSearchResult) obj;
        return Intrinsics.areEqual(this.f230146a, addressSearchResult.f230146a) && Intrinsics.areEqual(this.f230147b, addressSearchResult.f230147b) && Intrinsics.areEqual(this.f230148c, addressSearchResult.f230148c);
    }

    @NotNull
    public final String f() {
        return this.f230146a;
    }

    @Nullable
    public final String g() {
        return this.f230147b;
    }

    @Nullable
    public final String h() {
        return this.f230148c;
    }

    public int hashCode() {
        int iHashCode = this.f230146a.hashCode() * 31;
        String str = this.f230147b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f230148c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AddressSearchResult(formatted=" + this.f230146a + ", mainText=" + this.f230147b + ", secondaryText=" + this.f230148c + ")";
    }
}
