package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Uri f101978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Uri f101979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f101980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f101981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final d f101982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final c f101977g = new c(null);

    @f
    @NotNull
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new b();

    public static final class a extends ShareMessengerActionButton.a<ShareMessengerURLActionButton, a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private Uri f101983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f101984c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private Uri f101985d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private d f101986e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f101987f;

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public ShareMessengerURLActionButton build() {
            return new ShareMessengerURLActionButton(this, null);
        }

        @Nullable
        public final Uri g() {
            return this.f101985d;
        }

        public final boolean h() {
            return this.f101987f;
        }

        @Nullable
        public final Uri i() {
            return this.f101983b;
        }

        @Nullable
        public final d j() {
            return this.f101986e;
        }

        public final boolean k() {
            return this.f101984c;
        }

        @Override // com.facebook.share.model.ShareMessengerActionButton.a
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a a(@Nullable ShareMessengerURLActionButton shareMessengerURLActionButton) {
            return shareMessengerURLActionButton == null ? this : s(shareMessengerURLActionButton.f()).o(shareMessengerURLActionButton.h()).m(shareMessengerURLActionButton.b()).u(shareMessengerURLActionButton.g()).q(shareMessengerURLActionButton.e());
        }

        @NotNull
        public final a m(@Nullable Uri uri) {
            this.f101985d = uri;
            return this;
        }

        public final void n(@Nullable Uri uri) {
            this.f101985d = uri;
        }

        @NotNull
        public final a o(boolean z10) {
            this.f101984c = z10;
            return this;
        }

        public final void p(boolean z10) {
            this.f101984c = z10;
        }

        @NotNull
        public final a q(boolean z10) {
            this.f101987f = z10;
            return this;
        }

        public final void r(boolean z10) {
            this.f101987f = z10;
        }

        @NotNull
        public final a s(@Nullable Uri uri) {
            this.f101983b = uri;
            return this;
        }

        public final void t(@Nullable Uri uri) {
            this.f101983b = uri;
        }

        @NotNull
        public final a u(@Nullable d dVar) {
            this.f101986e = dVar;
            return this;
        }

        public final void v(@Nullable d dVar) {
            this.f101986e = dVar;
        }
    }

    public static final class b implements Parcelable.Creator<ShareMessengerURLActionButton> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareMessengerURLActionButton createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShareMessengerURLActionButton(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareMessengerURLActionButton[] newArray(int i10) {
            return new ShareMessengerURLActionButton[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public enum d {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] dVarArrValuesCustom = values();
            return (d[]) Arrays.copyOf(dVarArrValuesCustom, dVarArrValuesCustom.length);
        }
    }

    public /* synthetic */ ShareMessengerURLActionButton(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Nullable
    public final Uri b() {
        return this.f101979c;
    }

    @l(message = "getIsMessengerExtensionURL is deprecated. Use isMessengerExtensionURL instead", replaceWith = @b1(expression = "isMessengerExtensionURL", imports = {}))
    public final boolean c() {
        return this.f101980d;
    }

    public final boolean e() {
        return this.f101981e;
    }

    @Nullable
    public final Uri f() {
        return this.f101978b;
    }

    @Nullable
    public final d g() {
        return this.f101982f;
    }

    public final boolean h() {
        return this.f101980d;
    }

    @Override // com.facebook.share.model.ShareMessengerActionButton, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeParcelable(this.f101978b, 0);
        dest.writeByte(this.f101980d ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.f101979c, 0);
        dest.writeSerializable(this.f101982f);
        dest.writeByte(this.f101980d ? (byte) 1 : (byte) 0);
    }

    private ShareMessengerURLActionButton(a aVar) {
        super(aVar);
        this.f101978b = aVar.i();
        this.f101980d = aVar.k();
        this.f101979c = aVar.g();
        this.f101982f = aVar.j();
        this.f101981e = aVar.h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMessengerURLActionButton(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f101978b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f101980d = parcel.readByte() != 0;
        this.f101979c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f101982f = (d) parcel.readSerializable();
        this.f101981e = parcel.readByte() != 0;
    }
}
