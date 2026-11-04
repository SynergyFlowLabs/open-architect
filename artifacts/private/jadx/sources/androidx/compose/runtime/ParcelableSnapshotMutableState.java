package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.a({"BanParcelableUsage"})
final class ParcelableSnapshotMutableState<T> extends t6<T> implements Parcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f35285g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f35286h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f35287i = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final b f35284f = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new a();

    public static final class a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            u6 u6VarO;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i10 = parcel.readInt();
            if (i10 == 0) {
                u6VarO = w6.o();
            } else if (i10 == 1) {
                u6VarO = w6.z();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Unsupported MutableState policy " + i10 + " was restored");
                }
                u6VarO = w6.v();
            }
            return new ParcelableSnapshotMutableState<>(value, u6VarO);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState<Object>[] newArray(int i10) {
            return new ParcelableSnapshotMutableState[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void a() {
        }

        private b() {
        }
    }

    public ParcelableSnapshotMutableState(T t10, @NotNull u6<T> u6Var) {
        super(t10, u6Var);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        u6<T> u6VarC = c();
        if (Intrinsics.areEqual(u6VarC, w6.o())) {
            i11 = 0;
        } else if (Intrinsics.areEqual(u6VarC, w6.z())) {
            i11 = 1;
        } else {
            if (!Intrinsics.areEqual(u6VarC, w6.v())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
