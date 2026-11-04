package com.canhub.cropper.core;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class CropImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CropImage f97505a = new CropImage();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f97506b = "CROP_IMAGE_EXTRA_SOURCE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f97507c = "CROP_IMAGE_EXTRA_OPTIONS";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f97508d = "CROP_IMAGE_EXTRA_BUNDLE";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f97509e = "CROP_IMAGE_EXTRA_RESULT";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f97510f = 200;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f97511g = 201;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f97512h = 2011;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f97513i = 203;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f97514j = 204;

    public static final class a extends CropImageView.c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public static final a f97516k = new a();

        private a() {
            super(null, null, null, null, new d.a(), new float[0], null, null, 0, 0);
        }
    }

    private CropImage() {
    }

    public static /* synthetic */ String c(CropImage cropImage, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return cropImage.b(context, z10);
    }

    @n
    @NotNull
    public static final Uri d(@NotNull Context context, @Nullable Intent intent) {
        String action;
        Intrinsics.checkNotNullParameter(context, "context");
        Uri data = intent != null ? intent.getData() : null;
        return (data == null || ((action = intent.getAction()) != null && Intrinsics.areEqual(action, "android.media.action.IMAGE_CAPTURE")) || data == null) ? f97505a.a(context) : data;
    }

    @n
    @NotNull
    public static final String e(@NotNull Context context, @Nullable Intent intent, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a5.a.d(context, d(context, intent), z10);
    }

    public static /* synthetic */ String f(Context context, Intent intent, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return e(context, intent, z10);
    }

    @NotNull
    public final Uri a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        try {
            String str = context.getPackageName() + z4.a.f400218b;
            Intrinsics.checkNotNull(externalFilesDir);
            return FileProvider.getUriForFile(context, str, new File(externalFilesDir.getPath(), "pickImageResult.jpeg"));
        } catch (Exception unused) {
            Intrinsics.checkNotNull(externalFilesDir);
            return Uri.fromFile(new File(externalFilesDir.getPath(), "pickImageResult.jpeg"));
        }
    }

    @NotNull
    public final String b(@NotNull Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a5.a.d(context, a(context), z10);
    }

    @NotNull
    public final Bitmap g(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        boolean z10 = true & false;
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawOval(new RectF(0.0f, 0.0f, width, height), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static class ActivityResult extends CropImageView.c implements Parcelable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public static final b f97515k = new b(null);

        @oj.f
        @NotNull
        public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

        public static final class a implements Parcelable.Creator<ActivityResult> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ActivityResult createFromParcel(Parcel in) {
                Intrinsics.checkNotNullParameter(in, "in");
                return new ActivityResult(in);
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

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityResult(@Nullable Uri uri, @Nullable Uri uri2, @Nullable Exception exc, @Nullable float[] fArr, @Nullable Rect rect, int i10, @Nullable Rect rect2, int i11) {
            super(null, uri, null, uri2, exc, fArr, rect, rect2, i10, i11);
            Intrinsics.checkNotNull(fArr);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(h(), i10);
            dest.writeParcelable(k(), i10);
            dest.writeSerializable(f());
            dest.writeFloatArray(c());
            dest.writeParcelable(e(), i10);
            dest.writeParcelable(n(), i10);
            dest.writeInt(i());
            dest.writeInt(j());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        protected ActivityResult(@NotNull Parcel in) {
            Intrinsics.checkNotNullParameter(in, "in");
            Uri uri = (Uri) in.readParcelable(Uri.class.getClassLoader());
            Uri uri2 = (Uri) in.readParcelable(Uri.class.getClassLoader());
            Exception exc = (Exception) in.readSerializable();
            float[] fArrCreateFloatArray = in.createFloatArray();
            Intrinsics.checkNotNull(fArrCreateFloatArray);
            super(null, uri, null, uri2, exc, fArrCreateFloatArray, (Rect) in.readParcelable(Rect.class.getClassLoader()), (Rect) in.readParcelable(Rect.class.getClassLoader()), in.readInt(), in.readInt());
        }
    }
}
