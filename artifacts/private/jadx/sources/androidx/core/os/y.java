package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class y {

    static class a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z<T> f48091a;

        a(z<T> zVar) {
            this.f48091a = zVar;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.f48091a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i10) {
            return this.f48091a.newArray(i10);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f48091a.createFromParcel(parcel, classLoader);
        }
    }

    private y() {
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> a(z<T> zVar) {
        return new a(zVar);
    }
}
