package androidx.activity.result;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.a({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IntentSender f10001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Intent f10002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final c f10000e = new c(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final IntentSender f10005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private Intent f10006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f10008d;

        /* JADX INFO: renamed from: androidx.activity.result.IntentSenderRequest$a$a, reason: collision with other inner class name */
        @Retention(RetentionPolicy.SOURCE)
        @jj.e(jj.a.SOURCE)
        private @interface InterfaceC0027a {
        }

        public a(@NotNull IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.f10005a = intentSender;
        }

        @NotNull
        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.f10005a, this.f10006b, this.f10007c, this.f10008d);
        }

        @NotNull
        public final a b(@Nullable Intent intent) {
            this.f10006b = intent;
            return this;
        }

        @NotNull
        public final a c(int i10, int i11) {
            this.f10008d = i10;
            this.f10007c = i11;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(@NotNull PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    public static final class b implements Parcelable.Creator<IntentSenderRequest> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new IntentSenderRequest(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void a() {
        }

        private c() {
        }
    }

    public IntentSenderRequest(@NotNull IntentSender intentSender, @Nullable Intent intent, int i10, int i11) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f10001a = intentSender;
        this.f10002b = intent;
        this.f10003c = i10;
        this.f10004d = i11;
    }

    @Nullable
    public final Intent a() {
        return this.f10002b;
    }

    public final int b() {
        return this.f10003c;
    }

    public final int c() {
        return this.f10004d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final IntentSender e() {
        return this.f10001a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f10001a, i10);
        dest.writeParcelable(this.f10002b, i10);
        dest.writeInt(this.f10003c);
        dest.writeInt(this.f10004d);
    }

    public /* synthetic */ IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(intentSender, (i12 & 2) != 0 ? null : intent, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.checkNotNull(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
