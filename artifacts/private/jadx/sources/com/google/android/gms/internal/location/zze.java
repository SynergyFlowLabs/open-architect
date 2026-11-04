package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ClientIdentityCreator")
@SafeParcelable.g({2, 5})
@SourceDebugExtension({"SMAP\nClientIdentity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientIdentity.kt\ncom/google/android/gms/libs/identity/ClientIdentity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,598:1\n335#1:600\n339#1:601\n1#2:599\n1747#3,3:602\n12271#4,2:605\n12474#4,2:607\n13309#4,2:609\n*S KotlinDebug\n*F\n+ 1 ClientIdentity.kt\ncom/google/android/gms/libs/identity/ClientIdentity\n*L\n255#1:600\n264#1:601\n278#1:602,3\n284#1:605,2\n292#1:607,2\n301#1:609,2\n*E\n"})
public final class zze extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getUid", id = 1)
    private final int f108229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPackageName", id = 3)
    @NotNull
    private final String f108230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAttributionTag", id = 4)
    @Nullable
    private final String f108231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getListenerId", id = 6)
    @Nullable
    private final String f108232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getClientFeatures", id = 8)
    @NotNull
    private final List f108233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getImpersonator", id = 7)
    @Nullable
    private final zze f108234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final d2 f108228g = new d2(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<zze> CREATOR = new z3();

    static {
        Process.myUid();
        Process.myPid();
    }

    @SafeParcelable.b
    @kotlin.l(level = kotlin.n.ERROR, message = "only for Parcelable.Creator")
    public zze(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 3) @NotNull String packageName, @SafeParcelable.e(id = 4) @Nullable String str, @SafeParcelable.e(id = 6) @Nullable String str2, @SafeParcelable.e(id = 8) @Nullable List list, @SafeParcelable.e(id = 7) @Nullable zze zzeVar) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (zzeVar != null && zzeVar.a()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f108229a = i10;
        this.f108230b = packageName;
        this.f108231c = str;
        if (str2 == null) {
            str2 = zzeVar != null ? zzeVar.f108232d : null;
        }
        this.f108232d = str2;
        if (list == null) {
            list = zzeVar != null ? zzeVar.f108233e : null;
            if (list == null) {
                list = w3.s();
                Intrinsics.checkNotNullExpressionValue(list, "of(...)");
            }
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        w3 w3VarT = w3.t(list);
        Intrinsics.checkNotNullExpressionValue(w3VarT, "copyOf(...)");
        this.f108233e = w3VarT;
        this.f108234f = zzeVar;
    }

    @xl.d
    public final boolean a() {
        return this.f108234f != null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            if (this.f108229a == zzeVar.f108229a && Intrinsics.areEqual(this.f108230b, zzeVar.f108230b) && Intrinsics.areEqual(this.f108231c, zzeVar.f108231c) && Intrinsics.areEqual(this.f108232d, zzeVar.f108232d) && Intrinsics.areEqual(this.f108234f, zzeVar.f108234f) && Intrinsics.areEqual(this.f108233e, zzeVar.f108233e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108229a), this.f108230b, this.f108231c, this.f108232d, this.f108234f});
    }

    @NotNull
    public final String toString() {
        int length = this.f108230b.length() + 18;
        String str = this.f108231c;
        StringBuilder sb2 = new StringBuilder(length + (str != null ? str.length() : 0));
        sb2.append(this.f108229a);
        sb2.append("/");
        sb2.append(this.f108230b);
        String str2 = this.f108231c;
        if (str2 != null) {
            sb2.append("[");
            if (StringsKt.u2(str2, this.f108230b, false, 2, null)) {
                sb2.append((CharSequence) str2, this.f108230b.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        if (this.f108232d != null) {
            sb2.append("/");
            String str3 = this.f108232d;
            sb2.append(Integer.toHexString(str3 != null ? str3.hashCode() : 0));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int i11 = this.f108229a;
        int iA = i6.b.a(dest);
        i6.b.F(dest, 1, i11);
        boolean z10 = false | false;
        i6.b.Y(dest, 3, this.f108230b, false);
        i6.b.Y(dest, 4, this.f108231c, false);
        i6.b.Y(dest, 6, this.f108232d, false);
        i6.b.S(dest, 7, this.f108234f, i10, false);
        i6.b.d0(dest, 8, this.f108233e, false);
        i6.b.b(dest, iA);
    }
}
