package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.s;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class NavigationBarPresenter implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f113006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f113007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f113008c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f113009d;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f113010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        ParcelableSparseArray f113011b;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            parcel.writeInt(this.f113010a);
            parcel.writeParcelable(this.f113011b, 0);
        }

        SavedState(@NonNull Parcel parcel) {
            this.f113010a = parcel.readInt();
            this.f113011b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    public void a(int i10) {
        this.f113009d = i10;
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(@p0 androidx.appcompat.view.menu.g gVar, boolean z10) {
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean c(@p0 androidx.appcompat.view.menu.g gVar, @p0 j jVar) {
        return false;
    }

    public void d(@NonNull e eVar) {
        this.f113007b = eVar;
    }

    @Override // androidx.appcompat.view.menu.n
    @NonNull
    public Parcelable e() {
        SavedState savedState = new SavedState();
        savedState.f113010a = this.f113007b.getSelectedItemId();
        savedState.f113011b = com.google.android.material.badge.b.h(this.f113007b.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.n
    public void f(boolean z10) {
        if (this.f113008c) {
            return;
        }
        if (z10) {
            this.f113007b.d();
        } else {
            this.f113007b.s();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f113009d;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean h(@p0 androidx.appcompat.view.menu.g gVar, @p0 j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void i(@NonNull Context context, @NonNull androidx.appcompat.view.menu.g gVar) {
        this.f113006a = gVar;
        this.f113007b.a(gVar);
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(@p0 n.a aVar) {
    }

    public void k(boolean z10) {
        this.f113008c = z10;
    }

    @Override // androidx.appcompat.view.menu.n
    public void l(@NonNull Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f113007b.r(savedState.f113010a);
            this.f113007b.p(com.google.android.material.badge.b.g(this.f113007b.getContext(), savedState.f113011b));
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean m(@p0 s sVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    @p0
    public o n(@p0 ViewGroup viewGroup) {
        return this.f113007b;
    }
}
