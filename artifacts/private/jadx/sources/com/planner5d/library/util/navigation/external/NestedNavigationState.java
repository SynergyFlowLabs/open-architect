package com.planner5d.library.util.navigation.external;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.d0;
import androidx.navigation.c2;
import com.planner5d.library.services.utility.k;
import gk.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@d
public final class NestedNavigationState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NestedNavigationState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f240219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Bundle f240220b;

    public static final class a implements Parcelable.Creator<NestedNavigationState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NestedNavigationState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NestedNavigationState(parcel.readInt(), parcel.readBundle(NestedNavigationState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NestedNavigationState[] newArray(int i10) {
            return new NestedNavigationState[i10];
        }
    }

    public NestedNavigationState(@d0 int i10, @Nullable Bundle bundle) {
        this.f240219a = i10;
        this.f240220b = bundle;
    }

    @Nullable
    public final Bundle a() {
        return this.f240220b;
    }

    public final int b() {
        return this.f240219a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NestedNavigationState) {
            NestedNavigationState nestedNavigationState = (NestedNavigationState) obj;
            if (this.f240219a == nestedNavigationState.f240219a && k.b(this.f240220b, nestedNavigationState.f240220b)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f240219a);
        dest.writeBundle(this.f240220b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NestedNavigationState(@NotNull c2 navigationDirection) {
        this(navigationDirection.e(), navigationDirection.d());
        Intrinsics.checkNotNullParameter(navigationDirection, "navigationDirection");
    }
}
