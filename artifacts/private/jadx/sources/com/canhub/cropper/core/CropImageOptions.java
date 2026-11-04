package com.canhub.cropper.core;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.l;
import androidx.datastore.preferences.protobuf.e0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCropImageOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageOptions.kt\ncom/canhub/cropper/core/CropImageOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,601:1\n1#2:602\n*E\n"})
public class CropImageOptions implements Parcelable {
    public static final int S3 = 360;

    @oj.f
    @Nullable
    public Rect A3;

    @oj.f
    public int B3;

    @oj.f
    public boolean C3;

    @oj.f
    public boolean D3;

    @oj.f
    public boolean E3;

    @oj.f
    public int F3;

    @oj.f
    public boolean G3;

    @oj.f
    public float H1;

    @oj.f
    public boolean H3;

    @oj.f
    @Nullable
    public CharSequence I3;

    @oj.f
    public int J3;

    @oj.f
    public boolean K3;

    @oj.f
    public boolean L3;

    @oj.f
    @Nullable
    public String M3;

    @oj.f
    @Nullable
    public List<String> N3;

    @oj.f
    public float O3;

    @l
    @oj.f
    public int P3;

    @oj.f
    @Nullable
    public String Q3;

    @oj.f
    public int X;

    @oj.f
    public int Y;

    @oj.f
    public float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public boolean f97517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public boolean f97518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public CropImageView.d f97519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public CropImageView.b f97520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    public float f97521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    public float f97522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    public float f97523g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @l
    @oj.f
    public int f97524g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oj.f
    @NotNull
    public CropImageView.e f97525h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @oj.f
    public int f97526h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oj.f
    @NotNull
    public CropImageView.l f97527i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @oj.f
    public float f97528i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oj.f
    public boolean f97529j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @l
    @oj.f
    public int f97530j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oj.f
    public boolean f97531k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @l
    @oj.f
    public int f97532k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oj.f
    public boolean f97533l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @oj.f
    public int f97534l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l
    @oj.f
    public int f97535m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @oj.f
    public int f97536m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @oj.f
    public boolean f97537n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @oj.f
    public int f97538n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @oj.f
    public boolean f97539o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @oj.f
    public int f97540o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @l
    @oj.f
    public int f97541p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @oj.f
    public float f97542p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @oj.f
    public float f97543p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @oj.f
    public int f97544p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @oj.f
    public int f97545q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @oj.f
    @NotNull
    public CharSequence f97546r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @oj.f
    public boolean f97547s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @l
    @oj.f
    public int f97548s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @oj.f
    public int f97549t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @oj.f
    @Nullable
    public Uri f97550t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @oj.f
    @NotNull
    public Bitmap.CompressFormat f97551u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @oj.f
    public float f97552v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @oj.f
    public int f97553v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @oj.f
    public boolean f97554w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @oj.f
    public int f97555w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @oj.f
    public int f97556x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @oj.f
    @NotNull
    public CropImageView.k f97557y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @oj.f
    public boolean f97558z3;

    @NotNull
    public static final b R3 = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new a();

    public static final class a implements Parcelable.Creator<CropImageOptions> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CropImageOptions createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CropImageOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CropImageOptions[] newArray(int i10) {
            return new CropImageOptions[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public CropImageOptions() {
        this.Q3 = "";
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f97518b = true;
        this.f97517a = true;
        this.f97519c = CropImageView.d.RECTANGLE;
        this.f97520d = CropImageView.b.RECTANGLE;
        int i10 = 3 & (-1);
        this.f97526h3 = -1;
        this.f97521e = TypedValue.applyDimension(1, 10.0f, displayMetrics);
        this.f97522f = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f97523g = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f97525h = CropImageView.e.ON_TOUCH;
        this.f97527i = CropImageView.l.FIT_CENTER;
        this.f97529j = true;
        this.f97533l = true;
        this.f97535m = f.f97764a;
        this.f97537n = true;
        this.f97539o = false;
        this.f97547s = true;
        this.f97549t = 4;
        this.f97552v = 0.1f;
        this.f97554w = false;
        this.X = 1;
        this.Y = 1;
        this.Z = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f97541p0 = Color.argb(170, 255, 255, 255);
        this.f97542p1 = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.H1 = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.f97543p2 = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.f97524g3 = -1;
        this.f97528i3 = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.f97530j3 = Color.argb(170, 255, 255, 255);
        this.f97532k3 = Color.argb(119, 0, 0, 0);
        this.f97534l3 = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f97536m3 = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f97538n3 = 40;
        this.f97540o3 = 40;
        this.f97544p3 = e0.d.f50105p1;
        this.f97545q3 = e0.d.f50105p1;
        this.f97546r3 = "";
        this.f97548s3 = 0;
        this.f97550t3 = null;
        this.f97551u3 = Bitmap.CompressFormat.JPEG;
        this.f97553v3 = 90;
        this.f97555w3 = 0;
        this.f97556x3 = 0;
        this.f97557y3 = CropImageView.k.NONE;
        this.f97558z3 = false;
        this.A3 = null;
        this.B3 = -1;
        this.C3 = true;
        this.D3 = true;
        this.E3 = false;
        this.F3 = 90;
        this.G3 = false;
        this.H3 = false;
        this.I3 = null;
        this.J3 = 0;
        this.K3 = false;
        this.L3 = false;
        this.M3 = null;
        this.N3 = CollectionsKt.emptyList();
        this.O3 = TypedValue.applyDimension(2, 20.0f, displayMetrics);
        this.P3 = -1;
        this.f97531k = false;
    }

    public final void a() {
        if (this.f97549t < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if (this.f97523g < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        float f10 = this.f97552v;
        if (f10 < 0.0f || f10 >= 0.5d) {
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if (this.X <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.Y <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.Z < 0.0f) {
            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if (this.f97542p1 < 0.0f) {
            throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if (this.f97528i3 < 0.0f) {
            throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if (this.f97536m3 < 0) {
            throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        int i10 = this.f97538n3;
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        int i11 = this.f97540o3;
        if (i11 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if (this.f97544p3 < i10) {
            throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if (this.f97545q3 < i11) {
            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if (this.f97555w3 < 0) {
            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if (this.f97556x3 < 0) {
            throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        int i12 = this.F3;
        if (i12 < 0 || i12 > 360) {
            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeByte(this.f97518b ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f97517a ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f97519c.ordinal());
        dest.writeInt(this.f97520d.ordinal());
        dest.writeFloat(this.f97521e);
        dest.writeFloat(this.f97522f);
        dest.writeFloat(this.f97523g);
        dest.writeInt(this.f97525h.ordinal());
        dest.writeInt(this.f97527i.ordinal());
        dest.writeByte(this.f97529j ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f97533l ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f97535m);
        dest.writeByte(this.f97537n ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f97539o ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f97547s ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f97549t);
        dest.writeFloat(this.f97552v);
        dest.writeByte(this.f97554w ? (byte) 1 : (byte) 0);
        dest.writeInt(this.X);
        dest.writeInt(this.Y);
        dest.writeFloat(this.Z);
        dest.writeInt(this.f97541p0);
        dest.writeFloat(this.f97542p1);
        dest.writeFloat(this.H1);
        dest.writeFloat(this.f97543p2);
        dest.writeInt(this.f97524g3);
        dest.writeInt(this.f97526h3);
        dest.writeFloat(this.f97528i3);
        dest.writeInt(this.f97530j3);
        dest.writeInt(this.f97532k3);
        dest.writeInt(this.f97534l3);
        dest.writeInt(this.f97536m3);
        dest.writeInt(this.f97538n3);
        dest.writeInt(this.f97540o3);
        dest.writeInt(this.f97544p3);
        dest.writeInt(this.f97545q3);
        TextUtils.writeToParcel(this.f97546r3, dest, i10);
        dest.writeInt(this.f97548s3);
        dest.writeParcelable(this.f97550t3, i10);
        dest.writeString(this.f97551u3.name());
        dest.writeInt(this.f97553v3);
        dest.writeInt(this.f97555w3);
        dest.writeInt(this.f97556x3);
        dest.writeInt(this.f97557y3.ordinal());
        dest.writeInt(this.f97558z3 ? 1 : 0);
        dest.writeParcelable(this.A3, i10);
        dest.writeInt(this.B3);
        dest.writeByte(this.C3 ? (byte) 1 : (byte) 0);
        dest.writeByte(this.D3 ? (byte) 1 : (byte) 0);
        dest.writeByte(this.E3 ? (byte) 1 : (byte) 0);
        dest.writeInt(this.F3);
        dest.writeByte(this.G3 ? (byte) 1 : (byte) 0);
        dest.writeByte(this.H3 ? (byte) 1 : (byte) 0);
        TextUtils.writeToParcel(this.I3, dest, i10);
        dest.writeInt(this.J3);
        dest.writeByte(this.K3 ? (byte) 1 : (byte) 0);
        dest.writeByte(this.L3 ? (byte) 1 : (byte) 0);
        dest.writeString(this.M3);
        dest.writeStringList(this.N3);
        dest.writeFloat(this.O3);
        dest.writeInt(this.P3);
        dest.writeString(this.Q3);
        dest.writeByte(this.f97531k ? (byte) 1 : (byte) 0);
    }

    protected CropImageOptions(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.Q3 = "";
        this.f97518b = parcel.readByte() != 0;
        this.f97517a = parcel.readByte() != 0;
        this.f97519c = CropImageView.d.values()[parcel.readInt()];
        this.f97520d = CropImageView.b.values()[parcel.readInt()];
        this.f97521e = parcel.readFloat();
        this.f97522f = parcel.readFloat();
        this.f97523g = parcel.readFloat();
        this.f97525h = CropImageView.e.values()[parcel.readInt()];
        this.f97527i = CropImageView.l.values()[parcel.readInt()];
        this.f97529j = parcel.readByte() != 0;
        this.f97533l = parcel.readByte() != 0;
        this.f97535m = parcel.readInt();
        this.f97537n = parcel.readByte() != 0;
        this.f97539o = parcel.readByte() != 0;
        this.f97547s = parcel.readByte() != 0;
        this.f97549t = parcel.readInt();
        this.f97552v = parcel.readFloat();
        this.f97554w = parcel.readByte() != 0;
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readFloat();
        this.f97541p0 = parcel.readInt();
        this.f97542p1 = parcel.readFloat();
        this.H1 = parcel.readFloat();
        this.f97543p2 = parcel.readFloat();
        this.f97524g3 = parcel.readInt();
        this.f97526h3 = parcel.readInt();
        this.f97528i3 = parcel.readFloat();
        this.f97530j3 = parcel.readInt();
        this.f97532k3 = parcel.readInt();
        this.f97534l3 = parcel.readInt();
        this.f97536m3 = parcel.readInt();
        this.f97538n3 = parcel.readInt();
        this.f97540o3 = parcel.readInt();
        this.f97544p3 = parcel.readInt();
        this.f97545q3 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f97546r3 = (CharSequence) creator.createFromParcel(parcel);
        this.f97548s3 = parcel.readInt();
        this.f97550t3 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        String string = parcel.readString();
        Intrinsics.checkNotNull(string);
        this.f97551u3 = Bitmap.CompressFormat.valueOf(string);
        this.f97553v3 = parcel.readInt();
        this.f97555w3 = parcel.readInt();
        this.f97556x3 = parcel.readInt();
        this.f97557y3 = CropImageView.k.values()[parcel.readInt()];
        this.f97558z3 = parcel.readByte() != 0;
        this.A3 = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.B3 = parcel.readInt();
        this.C3 = parcel.readByte() != 0;
        this.D3 = parcel.readByte() != 0;
        this.E3 = parcel.readByte() != 0;
        this.F3 = parcel.readInt();
        this.G3 = parcel.readByte() != 0;
        this.H3 = parcel.readByte() != 0;
        this.I3 = (CharSequence) creator.createFromParcel(parcel);
        this.J3 = parcel.readInt();
        this.K3 = parcel.readByte() != 0;
        this.L3 = parcel.readByte() != 0;
        this.M3 = parcel.readString();
        this.N3 = parcel.createStringArrayList();
        this.O3 = parcel.readFloat();
        this.P3 = parcel.readInt();
        String string2 = parcel.readString();
        Intrinsics.checkNotNull(string2);
        this.Q3 = string2;
        this.f97531k = parcel.readByte() != 0;
    }
}
