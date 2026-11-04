package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.a({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Intent f9999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f9997c = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    public static final class a implements Parcelable.Creator<ActivityResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i10) {
            return new ActivityResult[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void a() {
        }

        @oj.n
        @NotNull
        public final String b(int i10) {
            if (i10 != -1) {
                return i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
            }
            return "RESULT_OK";
        }

        private b() {
        }
    }

    public ActivityResult(int i10, @Nullable Intent intent) {
        this.f9998a = i10;
        this.f9999b = intent;
    }

    @oj.n
    @NotNull
    public static final String c(int i10) {
        return f9997c.b(i10);
    }

    @Nullable
    public final Intent a() {
        return this.f9999b;
    }

    public final int b() {
        return this.f9998a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public String toString() {
        return "ActivityResult{resultCode=" + f9997c.b(this.f9998a) + ", data=" + this.f9999b + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f9998a);
        dest.writeInt(this.f9999b == null ? 0 : 1);
        Intent intent = this.f9999b;
        if (intent != null) {
            intent.writeToParcel(dest, i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityResult(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
