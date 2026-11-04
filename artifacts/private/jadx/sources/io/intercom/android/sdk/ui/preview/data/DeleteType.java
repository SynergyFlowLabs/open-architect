package io.intercom.android.sdk.ui.preview.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import gk.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@d
public abstract class DeleteType implements Parcelable {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class Delete extends DeleteType {
        public static final int $stable = 0;

        @NotNull
        public static final Delete INSTANCE = new Delete();

        @NotNull
        public static final Parcelable.Creator<Delete> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Delete> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Delete createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Delete.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Delete[] newArray(int i10) {
                return new Delete[i10];
            }
        }

        private Delete() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @w0(parameters = 1)
    public static final class None extends DeleteType {
        public static final int $stable = 0;

        @NotNull
        public static final None INSTANCE = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<None> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None[] newArray(int i10) {
                return new None[i10];
            }
        }

        private None() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @w0(parameters = 1)
    public static final class Remove extends DeleteType {
        public static final int $stable = 0;

        @NotNull
        public static final Remove INSTANCE = new Remove();

        @NotNull
        public static final Parcelable.Creator<Remove> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Remove> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Remove createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Remove.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Remove[] newArray(int i10) {
                return new Remove[i10];
            }
        }

        private Remove() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ DeleteType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DeleteType() {
    }
}
