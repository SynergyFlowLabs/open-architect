package com.planner5d.library.services.backgroundexecutor;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class BackgroundExecutorThrowableContainer implements Parcelable {

    @NotNull
    public static final a CREATOR = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Throwable f223976a;

    @SourceDebugExtension({"SMAP\nBackgroundExecutorThrowableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackgroundExecutorThrowableContainer.kt\ncom/planner5d/library/services/backgroundexecutor/BackgroundExecutorThrowableContainer$CREATOR\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
    public static final class a implements Parcelable.Creator<BackgroundExecutorThrowableContainer> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackgroundExecutorThrowableContainer createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Throwable th2 = (Throwable) x.l(parcel, null, Throwable.class);
            if (th2 != null) {
                return new BackgroundExecutorThrowableContainer(th2);
            }
            return null;
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackgroundExecutorThrowableContainer[] newArray(int i10) {
            return new BackgroundExecutorThrowableContainer[i10];
        }

        private a() {
        }
    }

    public BackgroundExecutorThrowableContainer(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f223976a = throwable;
    }

    @NotNull
    public final Throwable a() {
        return this.f223976a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f223976a);
    }
}
