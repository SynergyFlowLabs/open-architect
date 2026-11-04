package com.canhub.cropper.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCropImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/core/CropImageView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Pair.kt\nandroidx/core/util/PairKt\n*L\n1#1,1991:1\n1#2:1992\n66#3:1993\n78#3:1994\n*S KotlinDebug\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/core/CropImageView\n*L\n1001#1:1993\n1001#1:1994\n*E\n"})
public final class CropImageView extends FrameLayout implements CropOverlayView.b {

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @NotNull
    public static final a f97559z3 = new a(null);
    private float H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ImageView f97560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final CropOverlayView f97561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Matrix f97562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Matrix f97563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ProgressBar f97564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final float[] f97565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final float[] f97566g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f97567g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private com.canhub.cropper.core.e f97568h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f97569h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Bitmap f97570i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private int f97571i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f97572j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private h f97573j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f97574k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @Nullable
    private g f97575k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f97576l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @Nullable
    private i f97577l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f97578m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @Nullable
    private j f97579m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f97580n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @Nullable
    private f f97581n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f97582o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @Nullable
    private Uri f97583o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f97584p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private String f97585p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f97586p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private int f97587p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private float f97588q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private float f97589r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f97590s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private float f97591s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private l f97592t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @Nullable
    private RectF f97593t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private int f97594u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f97595v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private boolean f97596v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f97597w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @Nullable
    private WeakReference<com.canhub.cropper.core.b> f97598w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @Nullable
    private WeakReference<com.canhub.cropper.core.a> f97599x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @Nullable
    private Uri f97600y3;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i10, int i11, int i12) {
            if (i10 != Integer.MIN_VALUE) {
                return i10 != 1073741824 ? i12 : i11;
            }
            return Math.min(i12, i11);
        }

        private a() {
        }
    }

    public enum b {
        RECTANGLE,
        OVAL;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f97604d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f97604d;
        }
    }

    @SourceDebugExtension({"SMAP\nCropImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/core/CropImageView$CropResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1991:1\n1#2:1992\n*E\n"})
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Bitmap f97605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Uri f97606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final Bitmap f97607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final Uri f97608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private final Exception f97609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final float[] f97610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private final Rect f97611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private final Rect f97612h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f97613i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f97614j;

        public c(@Nullable Bitmap bitmap, @Nullable Uri uri, @Nullable Bitmap bitmap2, @Nullable Uri uri2, @Nullable Exception exc, @NotNull float[] cropPoints, @Nullable Rect rect, @Nullable Rect rect2, int i10, int i11) {
            Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
            this.f97605a = bitmap;
            this.f97606b = uri;
            this.f97607c = bitmap2;
            this.f97608d = uri2;
            this.f97609e = exc;
            this.f97610f = cropPoints;
            this.f97611g = rect;
            this.f97612h = rect2;
            this.f97613i = i10;
            this.f97614j = i11;
        }

        public static /* synthetic */ String m(c cVar, Context context, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUriFilePath");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return cVar.l(context, z10);
        }

        @Nullable
        public final Bitmap a() {
            return this.f97607c;
        }

        @Nullable
        public final Bitmap b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Bitmap bitmap = this.f97607c;
            if (bitmap != null) {
                return bitmap;
            }
            try {
                return MediaStore.Images.Media.getBitmap(context.getContentResolver(), this.f97608d);
            } catch (Exception unused) {
                return null;
            }
        }

        @NotNull
        public final float[] c() {
            return this.f97610f;
        }

        @Nullable
        public final Rect e() {
            return this.f97611g;
        }

        @Nullable
        public final Exception f() {
            return this.f97609e;
        }

        @Nullable
        public final Bitmap g() {
            return this.f97605a;
        }

        @Nullable
        public final Uri h() {
            return this.f97606b;
        }

        public final int i() {
            return this.f97613i;
        }

        public final int j() {
            return this.f97614j;
        }

        @Nullable
        public final Uri k() {
            return this.f97608d;
        }

        @Nullable
        public final String l(@NotNull Context context, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Uri uri = this.f97608d;
            if (uri != null) {
                return a5.a.d(context, uri, z10);
            }
            return null;
        }

        @Nullable
        public final Rect n() {
            return this.f97612h;
        }

        public final boolean o() {
            return this.f97609e == null;
        }
    }

    public enum d {
        RECTANGLE,
        OVAL,
        RECTANGLE_VERTICAL_ONLY,
        RECTANGLE_HORIZONTAL_ONLY;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f97620f = kotlin.enums.c.c(k());

        static {
            int i10 = 4 | 2;
        }

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f97620f;
        }
    }

    public enum e {
        OFF,
        ON_TOUCH,
        ON;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f97625e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f97625e;
        }
    }

    public interface f {
        void a(@NotNull CropImageView cropImageView, @NotNull c cVar);
    }

    public interface g {
        void a(@Nullable Rect rect);
    }

    public interface h {
        void a(@Nullable Rect rect);
    }

    public interface i {
        void a();
    }

    public interface j {
        void a(@NotNull CropImageView cropImageView, @NotNull Uri uri, @Nullable Exception exc);
    }

    public enum k {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f97632g = kotlin.enums.c.c(k());

        static {
            boolean z10 = false & false;
        }

        @NotNull
        public static kotlin.enums.a<k> l() {
            return f97632g;
        }
    }

    public enum l {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f97638f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<l> l() {
            return f97638f;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public CropImageView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void A(Bitmap bitmap, int i10, Uri uri, int i11, int i12) {
        Bitmap bitmap2 = this.f97570i;
        if (bitmap2 == null || !Intrinsics.areEqual(bitmap2, bitmap)) {
            e();
            this.f97570i = bitmap;
            this.f97560a.setImageBitmap(bitmap);
            this.f97583o3 = uri;
            this.f97590s = i10;
            this.f97587p3 = i11;
            this.f97574k = i12;
            b(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f97561b;
            if (cropOverlayView != null) {
                cropOverlayView.u();
                B();
            }
        }
    }

    private final void B() {
        CropOverlayView cropOverlayView = this.f97561b;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.f97597w || this.f97570i == null) ? 4 : 0);
        }
    }

    private final void F() {
        int i10 = 0;
        boolean z10 = this.f97567g3 && ((this.f97570i == null && this.f97598w3 != null) || this.f97599x3 != null);
        ProgressBar progressBar = this.f97564e;
        if (!z10) {
            i10 = 4;
        }
        progressBar.setVisibility(i10);
    }

    private final void H(boolean z10) {
        if (this.f97570i != null && !z10) {
            float f10 = this.f97587p3 * 100.0f;
            com.canhub.cropper.core.c cVar = com.canhub.cropper.core.c.f97737a;
            float fE = f10 / cVar.E(this.f97566g);
            float fA = (this.f97587p3 * 100.0f) / cVar.A(this.f97566g);
            CropOverlayView cropOverlayView = this.f97561b;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.y(getWidth(), getHeight(), fE, fA);
        }
        CropOverlayView cropOverlayView2 = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView2);
        cropOverlayView2.w(z10 ? null : this.f97565f, getWidth(), getHeight());
    }

    private final void b(float f10, float f11, boolean z10, boolean z11) {
        Bitmap bitmap = this.f97570i;
        if (bitmap != null) {
            if (f10 <= 0.0f || f11 <= 0.0f) {
                return;
            }
            this.f97562c.invert(this.f97563d);
            CropOverlayView cropOverlayView = this.f97561b;
            Intrinsics.checkNotNull(cropOverlayView);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            this.f97563d.mapRect(cropWindowRect);
            this.f97562c.reset();
            float f12 = 2;
            this.f97562c.postTranslate((f10 - bitmap.getWidth()) / f12, (f11 - bitmap.getHeight()) / f12);
            u();
            int i10 = this.f97574k;
            if (i10 > 0) {
                com.canhub.cropper.core.c cVar = com.canhub.cropper.core.c.f97737a;
                this.f97562c.postRotate(i10, cVar.x(this.f97565f), cVar.y(this.f97565f));
                u();
            }
            com.canhub.cropper.core.c cVar2 = com.canhub.cropper.core.c.f97737a;
            float fMin = Math.min(f10 / cVar2.E(this.f97565f), f11 / cVar2.A(this.f97565f));
            l lVar = this.f97592t;
            if (lVar == l.FIT_CENTER || ((lVar == l.CENTER_INSIDE && fMin < 1.0f) || (fMin > 1.0f && this.f97569h3))) {
                this.f97562c.postScale(fMin, fMin, cVar2.x(this.f97565f), cVar2.y(this.f97565f));
                u();
            } else if (lVar == l.CENTER_CROP) {
                this.f97588q3 = Math.max(getWidth() / cVar2.E(this.f97565f), getHeight() / cVar2.A(this.f97565f));
            }
            float f13 = this.f97576l ? -this.f97588q3 : this.f97588q3;
            float f14 = this.f97578m ? -this.f97588q3 : this.f97588q3;
            this.f97562c.postScale(f13, f14, cVar2.x(this.f97565f), cVar2.y(this.f97565f));
            u();
            this.f97562c.mapRect(cropWindowRect);
            if (this.f97592t == l.CENTER_CROP && z10 && !z11) {
                this.f97589r3 = 0.0f;
                this.f97591s3 = 0.0f;
            } else if (z10) {
                this.f97589r3 = f10 > cVar2.E(this.f97565f) ? 0.0f : Math.max(Math.min((f10 / f12) - cropWindowRect.centerX(), -cVar2.B(this.f97565f)), getWidth() - cVar2.C(this.f97565f)) / f13;
                this.f97591s3 = f11 <= cVar2.A(this.f97565f) ? Math.max(Math.min((f11 / f12) - cropWindowRect.centerY(), -cVar2.D(this.f97565f)), getHeight() - cVar2.w(this.f97565f)) / f14 : 0.0f;
            } else {
                this.f97589r3 = Math.min(Math.max(this.f97589r3 * f13, -cropWindowRect.left), (-cropWindowRect.right) + f10) / f13;
                this.f97591s3 = Math.min(Math.max(this.f97591s3 * f14, -cropWindowRect.top), (-cropWindowRect.bottom) + f11) / f14;
            }
            this.f97562c.postTranslate(this.f97589r3 * f13, this.f97591s3 * f14);
            cropWindowRect.offset(this.f97589r3 * f13, this.f97591s3 * f14);
            this.f97561b.setCropWindowRect(cropWindowRect);
            u();
            this.f97561b.invalidate();
            if (z11) {
                com.canhub.cropper.core.e eVar = this.f97568h;
                Intrinsics.checkNotNull(eVar);
                eVar.a(this.f97565f, this.f97562c);
                this.f97560a.startAnimation(this.f97568h);
            } else {
                this.f97560a.setImageMatrix(this.f97562c);
            }
            H(false);
        }
    }

    private final void e() {
        Bitmap bitmap = this.f97570i;
        if (bitmap != null && (this.f97590s > 0 || this.f97583o3 != null)) {
            Intrinsics.checkNotNull(bitmap);
            bitmap.recycle();
        }
        this.f97570i = null;
        this.f97590s = 0;
        this.f97583o3 = null;
        this.f97587p3 = 1;
        this.f97574k = 0;
        this.f97588q3 = 1.0f;
        this.f97589r3 = 0.0f;
        this.f97591s3 = 0.0f;
        this.f97562c.reset();
        this.f97593t3 = null;
        this.f97594u3 = 0;
        this.f97560a.setImageBitmap(null);
        B();
    }

    public static /* synthetic */ void g(CropImageView cropImageView, Bitmap.CompressFormat compressFormat, int i10, int i11, int i12, k kVar, Uri uri, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i13 & 2) != 0) {
            i10 = 90;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        if ((i13 & 16) != 0) {
            kVar = k.RESIZE_INSIDE;
        }
        if ((i13 & 32) != 0) {
            uri = null;
        }
        cropImageView.f(compressFormat, i10, i11, i12, kVar, uri);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    private final void l(boolean z10, boolean z11) {
        float fMax;
        int width = getWidth();
        int height = getHeight();
        if (this.f97570i == null || width <= 0 || height <= 0) {
            return;
        }
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        if (!z10) {
            float f10 = 1.0f;
            if (this.f97569h3 || this.f97588q3 > 1.0f) {
                if (this.f97588q3 < this.f97571i3) {
                    float f11 = width;
                    if (cropWindowRect.width() < f11 * 0.5f) {
                        float f12 = height;
                        if (cropWindowRect.height() < 0.5f * f12) {
                            fMax = Math.min(this.f97571i3, Math.min(f11 / ((cropWindowRect.width() / this.f97588q3) / 0.64f), f12 / ((cropWindowRect.height() / this.f97588q3) / 0.64f)));
                        } else {
                            fMax = 0.0f;
                        }
                    } else {
                        fMax = 0.0f;
                    }
                } else {
                    fMax = 0.0f;
                }
                if (this.f97588q3 > 1.0f) {
                    float f13 = width;
                    if (cropWindowRect.width() > f13 * 0.65f || cropWindowRect.height() > height * 0.65f) {
                        fMax = Math.max(1.0f, Math.min(f13 / ((cropWindowRect.width() / this.f97588q3) / 0.51f), height / ((cropWindowRect.height() / this.f97588q3) / 0.51f)));
                    }
                }
                if (this.f97569h3) {
                    f10 = fMax;
                }
                if (f10 > 0.0f && f10 != this.f97588q3) {
                    if (z11) {
                        if (this.f97568h == null) {
                            this.f97568h = new com.canhub.cropper.core.e(this.f97560a, this.f97561b);
                        }
                        com.canhub.cropper.core.e eVar = this.f97568h;
                        Intrinsics.checkNotNull(eVar);
                        eVar.b(this.f97565f, this.f97562c);
                    }
                    this.f97588q3 = f10;
                    b(width, height, true, z11);
                }
            }
        } else if (cropWindowRect.left < 0.0f || cropWindowRect.top < 0.0f || cropWindowRect.right > width || cropWindowRect.bottom > height) {
            b(width, height, false, false);
        }
        i iVar = this.f97577l3;
        if (iVar == null || z10) {
            return;
        }
        Intrinsics.checkNotNull(iVar);
        iVar.a();
    }

    private final void u() {
        float[] fArr = this.f97565f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Bitmap bitmap = this.f97570i;
        Intrinsics.checkNotNull(bitmap);
        int i10 = 2 ^ 2;
        fArr[2] = bitmap.getWidth();
        float[] fArr2 = this.f97565f;
        fArr2[3] = 0.0f;
        Bitmap bitmap2 = this.f97570i;
        Intrinsics.checkNotNull(bitmap2);
        fArr2[4] = bitmap2.getWidth();
        float[] fArr3 = this.f97565f;
        Bitmap bitmap3 = this.f97570i;
        Intrinsics.checkNotNull(bitmap3);
        fArr3[5] = bitmap3.getHeight();
        float[] fArr4 = this.f97565f;
        fArr4[6] = 0.0f;
        Bitmap bitmap4 = this.f97570i;
        Intrinsics.checkNotNull(bitmap4);
        fArr4[7] = bitmap4.getHeight();
        this.f97562c.mapPoints(this.f97565f);
        float[] fArr5 = this.f97566g;
        fArr5[0] = 0.0f;
        fArr5[1] = 0.0f;
        fArr5[2] = 100.0f;
        fArr5[3] = 0.0f;
        fArr5[4] = 100.0f;
        fArr5[5] = 100.0f;
        fArr5[6] = 0.0f;
        fArr5[7] = 100.0f;
        this.f97562c.mapPoints(fArr5);
    }

    public final void C(@Nullable Bitmap bitmap, @Nullable androidx.exifinterface.media.a aVar) {
        int iB;
        Bitmap bitmap2;
        if (bitmap == null || aVar == null) {
            iB = 0;
            bitmap2 = bitmap;
        } else {
            com.canhub.cropper.core.c.b bVarG = com.canhub.cropper.core.c.f97737a.G(bitmap, aVar);
            Bitmap bitmapA = bVarG.a();
            iB = bVarG.b();
            this.f97576l = bVarG.c();
            this.f97578m = bVarG.d();
            this.f97572j = bVarG.b();
            bitmap2 = bitmapA;
        }
        int i10 = iB;
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(null);
        A(bitmap2, 0, null, 1, i10);
    }

    public final void D(int i10, int i11) {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.z(i10, i11);
    }

    public final void E(int i10, int i11) {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.A(i10, i11);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final void G(int r22, int r23, @org.jetbrains.annotations.NotNull com.canhub.cropper.core.CropImageView.k r24, @org.jetbrains.annotations.NotNull android.graphics.Bitmap.CompressFormat r25, int r26, @org.jetbrains.annotations.Nullable android.net.Uri r27) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.core.CropImageView.G(int, int, com.canhub.cropper.core.CropImageView$k, android.graphics.Bitmap$CompressFormat, int, android.net.Uri):void");
    }

    @Override // com.canhub.cropper.core.CropOverlayView.b
    public void a(boolean z10) {
        l(z10, true);
        h hVar = this.f97573j3;
        if (hVar != null && !z10) {
            hVar.a(getCropRect());
        }
        g gVar = this.f97575k3;
        if (gVar == null || !z10) {
            return;
        }
        gVar.a(getCropRect());
    }

    public final void c() {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setAspectRatioX(1);
        this.f97561b.setAspectRatioY(1);
        setFixedAspectRatio(false);
    }

    public final void d() {
        e();
        CropOverlayView cropOverlayView = this.f97561b;
        if (cropOverlayView != null) {
            cropOverlayView.setInitialCropWindowRect(null);
        }
    }

    public final void f(@NotNull Bitmap.CompressFormat saveCompressFormat, int i10, int i11, int i12, @NotNull k options, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(saveCompressFormat, "saveCompressFormat");
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f97581n3 == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        G(i11, i12, options, saveCompressFormat, i10, uri);
    }

    @NotNull
    public final Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        return new Pair<>(Integer.valueOf(cropOverlayView.getAspectRatioX()), Integer.valueOf(this.f97561b.getAspectRatioY()));
    }

    @Nullable
    public final b getCornerShape() {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        return cropOverlayView.getCornerShape();
    }

    @NotNull
    public final String getCropLabelText() {
        return this.f97585p1;
    }

    public final int getCropLabelTextColor() {
        return this.f97586p2;
    }

    public final float getCropLabelTextSize() {
        return this.H1;
    }

    @NotNull
    public final float[] getCropPoints() {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        float f10 = cropWindowRect.left;
        float f11 = cropWindowRect.top;
        float f12 = cropWindowRect.right;
        float f13 = cropWindowRect.bottom;
        float[] fArr = {f10, f11, f12, f11, f12, f13, f10, f13};
        this.f97562c.invert(this.f97563d);
        this.f97563d.mapPoints(fArr);
        float[] fArr2 = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr2[i10] = fArr[i10] * this.f97587p3;
        }
        return fArr2;
    }

    @Nullable
    public final Rect getCropRect() {
        int i10 = this.f97587p3;
        Bitmap bitmap = this.f97570i;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i10;
        int height = bitmap.getHeight() * i10;
        com.canhub.cropper.core.c cVar = com.canhub.cropper.core.c.f97737a;
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        return cVar.z(cropPoints, width, height, cropOverlayView.p(), this.f97561b.getAspectRatioX(), this.f97561b.getAspectRatioY());
    }

    @Nullable
    public final d getCropShape() {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        return cropOverlayView.getCropShape();
    }

    @Nullable
    public final RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f97561b;
        if (cropOverlayView != null) {
            return cropOverlayView.getCropWindowRect();
        }
        return null;
    }

    @Nullable
    public final Bitmap getCroppedImage() {
        return k(0, 0, k.NONE);
    }

    @Nullable
    public final Uri getCustomOutputUri() {
        return this.f97600y3;
    }

    @Nullable
    public final e getGuidelines() {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        return cropOverlayView.getGuidelines();
    }

    public final int getImageResource() {
        return this.f97590s;
    }

    @Nullable
    public final Uri getImageUri() {
        return this.f97583o3;
    }

    public final int getMaxZoom() {
        return this.f97571i3;
    }

    public final int getRotatedDegrees() {
        return this.f97574k;
    }

    @NotNull
    public final l getScaleType() {
        return this.f97592t;
    }

    @Nullable
    public final Rect getWholeImageRect() {
        int i10 = this.f97587p3;
        Bitmap bitmap = this.f97570i;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i10, bitmap.getHeight() * i10);
    }

    public final void h() {
        this.f97576l = !this.f97576l;
        b(getWidth(), getHeight(), true, false);
    }

    public final void i() {
        this.f97578m = !this.f97578m;
        b(getWidth(), getHeight(), true, false);
    }

    @Nullable
    public final Bitmap j(int i10, int i11) {
        return k(i10, i11, k.RESIZE_INSIDE);
    }

    @Nullable
    public final Bitmap k(int i10, int i11, @NotNull k options) {
        Bitmap bitmapA;
        Intrinsics.checkNotNullParameter(options, "options");
        Bitmap bitmap = this.f97570i;
        if (bitmap == null) {
            return null;
        }
        k kVar = k.NONE;
        int i12 = options != kVar ? i10 : 0;
        int i13 = options != kVar ? i11 : 0;
        if (this.f97583o3 == null || (this.f97587p3 <= 1 && options != k.SAMPLING)) {
            com.canhub.cropper.core.c cVar = com.canhub.cropper.core.c.f97737a;
            float[] cropPoints = getCropPoints();
            int i14 = this.f97574k;
            CropOverlayView cropOverlayView = this.f97561b;
            Intrinsics.checkNotNull(cropOverlayView);
            bitmapA = cVar.h(bitmap, cropPoints, i14, cropOverlayView.p(), this.f97561b.getAspectRatioX(), this.f97561b.getAspectRatioY(), this.f97576l, this.f97578m).a();
        } else {
            Intrinsics.checkNotNull(bitmap);
            int width = bitmap.getWidth() * this.f97587p3;
            Bitmap bitmap2 = this.f97570i;
            Intrinsics.checkNotNull(bitmap2);
            int height = bitmap2.getHeight() * this.f97587p3;
            com.canhub.cropper.core.c cVar2 = com.canhub.cropper.core.c.f97737a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Uri uri = this.f97583o3;
            float[] cropPoints2 = getCropPoints();
            int i15 = this.f97574k;
            CropOverlayView cropOverlayView2 = this.f97561b;
            Intrinsics.checkNotNull(cropOverlayView2);
            bitmapA = cVar2.e(context, uri, cropPoints2, i15, width, height, cropOverlayView2.p(), this.f97561b.getAspectRatioX(), this.f97561b.getAspectRatioY(), i12, i13, this.f97576l, this.f97578m).a();
        }
        return com.canhub.cropper.core.c.f97737a.H(bitmapA, i12, i13, options);
    }

    public final boolean m() {
        return this.f97569h3;
    }

    public final boolean n() {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        return cropOverlayView.p();
    }

    public final boolean o() {
        return this.f97576l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f97580n <= 0 || this.f97582o <= 0) {
            H(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f97580n;
        layoutParams.height = this.f97582o;
        setLayoutParams(layoutParams);
        if (this.f97570i == null) {
            H(true);
            return;
        }
        float f10 = i12 - i10;
        float f11 = i13 - i11;
        b(f10, f11, true, false);
        RectF rectF = this.f97593t3;
        if (rectF == null) {
            if (this.f97596v3) {
                this.f97596v3 = false;
                l(false, false);
                return;
            }
            return;
        }
        int i14 = this.f97594u3;
        if (i14 != this.f97572j) {
            this.f97574k = i14;
            b(f10, f11, true, false);
            this.f97594u3 = 0;
        }
        this.f97562c.mapRect(this.f97593t3);
        CropOverlayView cropOverlayView = this.f97561b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropWindowRect(rectF);
        }
        l(false, false);
        CropOverlayView cropOverlayView2 = this.f97561b;
        if (cropOverlayView2 != null) {
            cropOverlayView2.n();
        }
        this.f97593t3 = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int width;
        int height;
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        Bitmap bitmap = this.f97570i;
        if (bitmap == null) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (size2 == 0) {
            size2 = bitmap.getHeight();
        }
        double width2 = size < bitmap.getWidth() ? ((double) size) / ((double) bitmap.getWidth()) : Double.POSITIVE_INFINITY;
        double height2 = size2 < bitmap.getHeight() ? ((double) size2) / ((double) bitmap.getHeight()) : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height2 == Double.POSITIVE_INFINITY) {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        } else if (width2 <= height2) {
            height = (int) (((double) bitmap.getHeight()) * width2);
            width = size;
        } else {
            width = (int) (((double) bitmap.getWidth()) * height2);
            height = size2;
        }
        a aVar = f97559z3;
        int iB = aVar.b(mode, size, width);
        int iB2 = aVar.b(mode2, size2, height);
        this.f97580n = iB;
        this.f97582o = iB2;
        setMeasuredDimension(iB, iB2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable state) {
        CropImageView cropImageView;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        if (this.f97598w3 == null && this.f97583o3 == null && this.f97570i == null && this.f97590s == 0) {
            Bundle bundle = (Bundle) state;
            Parcelable parcelable = bundle.getParcelable("LOADED_IMAGE_URI");
            if (parcelable != null) {
                String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                if (string == null) {
                    cropImageView = this;
                } else {
                    com.canhub.cropper.core.c cVar = com.canhub.cropper.core.c.f97737a;
                    Pair<String, WeakReference<Bitmap>> pairR = cVar.r();
                    if (pairR != null) {
                        bitmap = Intrinsics.areEqual(pairR.first, string) ? (Bitmap) ((WeakReference) pairR.second).get() : null;
                    } else {
                        bitmap = null;
                    }
                    cVar.J(null);
                    if (bitmap == null || bitmap.isRecycled()) {
                        cropImageView = this;
                    } else {
                        cropImageView = this;
                        cropImageView.A(bitmap, 0, (Uri) parcelable, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                    }
                }
                if (cropImageView.f97583o3 == null) {
                    cropImageView.setImageUriAsync((Uri) parcelable);
                    Unit unit = Unit.f312394a;
                }
            } else {
                cropImageView = this;
                int i10 = bundle.getInt("LOADED_IMAGE_RESOURCE");
                if (i10 > 0) {
                    cropImageView.setImageResource(i10);
                    Unit unit2 = Unit.f312394a;
                } else {
                    Uri uri = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                    if (uri != null) {
                        cropImageView.setImageUriAsync(uri);
                        Unit unit3 = Unit.f312394a;
                    }
                }
            }
            int i11 = bundle.getInt("DEGREES_ROTATED");
            cropImageView.f97594u3 = i11;
            cropImageView.f97574k = i11;
            Rect rect = (Rect) bundle.getParcelable("INITIAL_CROP_RECT");
            if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                CropOverlayView cropOverlayView = cropImageView.f97561b;
                Intrinsics.checkNotNull(cropOverlayView);
                cropOverlayView.setInitialCropWindowRect(rect);
            }
            RectF rectF = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
            if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                cropImageView.f97593t3 = rectF;
            }
            CropOverlayView cropOverlayView2 = cropImageView.f97561b;
            Intrinsics.checkNotNull(cropOverlayView2);
            String string2 = bundle.getString("CROP_SHAPE");
            Intrinsics.checkNotNull(string2);
            cropOverlayView2.setCropShape(d.valueOf(string2));
            cropImageView.f97569h3 = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
            cropImageView.f97571i3 = bundle.getInt("CROP_MAX_ZOOM");
            cropImageView.f97576l = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
            cropImageView.f97578m = bundle.getBoolean("CROP_FLIP_VERTICALLY");
            boolean z10 = bundle.getBoolean("SHOW_CROP_LABEL");
            cropImageView.f97584p0 = z10;
            cropImageView.f97561b.setCropperTextLabelVisibility(z10);
        } else {
            cropImageView = this;
        }
        super.onRestoreInstanceState(((Bundle) state).getParcelable("instanceState"));
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Uri uriL;
        if (this.f97583o3 == null && this.f97570i == null && this.f97590s < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        if (this.f97595v && this.f97583o3 == null && this.f97590s < 1) {
            com.canhub.cropper.core.c cVar = com.canhub.cropper.core.c.f97737a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            uriL = cVar.L(context, this.f97570i, this.f97600y3);
        } else {
            uriL = this.f97583o3;
        }
        if (uriL != null && this.f97570i != null) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            com.canhub.cropper.core.c.f97737a.J(new Pair<>(string, new WeakReference(this.f97570i)));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", string);
        }
        WeakReference<com.canhub.cropper.core.b> weakReference = this.f97598w3;
        if (weakReference != null) {
            Intrinsics.checkNotNull(weakReference);
            com.canhub.cropper.core.b bVar = weakReference.get();
            if (bVar != null) {
                bundle.putParcelable("LOADING_IMAGE_URI", bVar.l());
            }
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uriL);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f97590s);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f97587p3);
        bundle.putInt("DEGREES_ROTATED", this.f97574k);
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getInitialCropWindowRect());
        com.canhub.cropper.core.c cVar2 = com.canhub.cropper.core.c.f97737a;
        cVar2.v().set(this.f97561b.getCropWindowRect());
        this.f97562c.invert(this.f97563d);
        this.f97563d.mapRect(cVar2.v());
        bundle.putParcelable("CROP_WINDOW_RECT", cVar2.v());
        d cropShape = this.f97561b.getCropShape();
        Intrinsics.checkNotNull(cropShape);
        bundle.putString("CROP_SHAPE", cropShape.name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f97569h3);
        bundle.putInt("CROP_MAX_ZOOM", this.f97571i3);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f97576l);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f97578m);
        bundle.putBoolean("SHOW_CROP_LABEL", this.f97584p0);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f97596v3 = i12 > 0 && i13 > 0;
    }

    public final boolean p() {
        return this.f97578m;
    }

    public final boolean q() {
        return this.f97595v;
    }

    public final boolean r() {
        return this.f97584p0;
    }

    public final boolean s() {
        return this.f97597w;
    }

    public final void setAutoZoomEnabled(boolean z10) {
        if (this.f97569h3 != z10) {
            this.f97569h3 = z10;
            l(false, false);
            CropOverlayView cropOverlayView = this.f97561b;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean z10) {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        if (cropOverlayView.x(z10)) {
            int i10 = 6 ^ 0;
            l(false, false);
            this.f97561b.invalidate();
        }
    }

    public final void setCornerShape(@Nullable b bVar) {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        Intrinsics.checkNotNull(bVar);
        cropOverlayView.setCropCornerShape(bVar);
    }

    public final void setCropLabelText(@NotNull String cropLabelText) {
        Intrinsics.checkNotNullParameter(cropLabelText, "cropLabelText");
        this.f97585p1 = cropLabelText;
        CropOverlayView cropOverlayView = this.f97561b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelText(cropLabelText);
        }
    }

    public final void setCropLabelTextColor(int i10) {
        this.f97586p2 = i10;
        CropOverlayView cropOverlayView = this.f97561b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextColor(i10);
        }
    }

    public final void setCropLabelTextSize(float f10) {
        this.H1 = getCropLabelTextSize();
        CropOverlayView cropOverlayView = this.f97561b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextSize(f10);
        }
    }

    public final void setCropRect(@Nullable Rect rect) {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(rect);
    }

    public final void setCropShape(@Nullable d dVar) {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        Intrinsics.checkNotNull(dVar);
        cropOverlayView.setCropShape(dVar);
    }

    public final void setCustomOutputUri(@Nullable Uri uri) {
        this.f97600y3 = uri;
    }

    public final void setFixedAspectRatio(boolean z10) {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setFixedAspectRatio(z10);
    }

    public final void setFlippedHorizontally(boolean z10) {
        if (this.f97576l != z10) {
            this.f97576l = z10;
            b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setFlippedVertically(boolean z10) {
        if (this.f97578m != z10) {
            this.f97578m = z10;
            b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setGuidelines(@Nullable e eVar) {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        Intrinsics.checkNotNull(eVar);
        cropOverlayView.setGuidelines(eVar);
    }

    public final void setImageBitmap(@Nullable Bitmap bitmap) {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(null);
        A(bitmap, 0, null, 1, 0);
    }

    public final void setImageResource(int i10) {
        if (i10 != 0) {
            CropOverlayView cropOverlayView = this.f97561b;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            A(BitmapFactory.decodeResource(getResources(), i10), i10, null, 1, 0);
        }
    }

    public final void setImageUriAsync(@Nullable Uri uri) {
        com.canhub.cropper.core.b bVar;
        if (uri != null) {
            WeakReference<com.canhub.cropper.core.b> weakReference = this.f97598w3;
            if (weakReference != null) {
                Intrinsics.checkNotNull(weakReference);
                bVar = weakReference.get();
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.k();
            }
            e();
            CropOverlayView cropOverlayView = this.f97561b;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            WeakReference<com.canhub.cropper.core.b> weakReference2 = new WeakReference<>(new com.canhub.cropper.core.b(context, this, uri));
            this.f97598w3 = weakReference2;
            Intrinsics.checkNotNull(weakReference2);
            com.canhub.cropper.core.b bVar2 = weakReference2.get();
            Intrinsics.checkNotNull(bVar2);
            bVar2.n();
            F();
        }
    }

    public final void setMaxZoom(int i10) {
        if (this.f97571i3 == i10 || i10 <= 0) {
            return;
        }
        this.f97571i3 = i10;
        l(false, false);
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.invalidate();
    }

    public final void setMultiTouchEnabled(boolean z10) {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        if (cropOverlayView.B(z10)) {
            l(false, false);
            this.f97561b.invalidate();
        }
    }

    public final void setOnCropImageCompleteListener(@Nullable f fVar) {
        this.f97581n3 = fVar;
    }

    public final void setOnCropWindowChangedListener(@Nullable i iVar) {
        this.f97577l3 = iVar;
    }

    public final void setOnSetCropOverlayMovedListener(@Nullable g gVar) {
        this.f97575k3 = gVar;
    }

    public final void setOnSetCropOverlayReleasedListener(@Nullable h hVar) {
        this.f97573j3 = hVar;
    }

    public final void setOnSetImageUriCompleteListener(@Nullable j jVar) {
        this.f97579m3 = jVar;
    }

    public final void setRotatedDegrees(int i10) {
        int i11 = this.f97574k;
        if (i11 != i10) {
            y(i10 - i11);
        }
    }

    public final void setSaveBitmapToInstanceState(boolean z10) {
        this.f97595v = z10;
    }

    public final void setScaleType(@NotNull l scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (scaleType != this.f97592t) {
            this.f97592t = scaleType;
            this.f97588q3 = 1.0f;
            this.f97591s3 = 0.0f;
            this.f97589r3 = 0.0f;
            CropOverlayView cropOverlayView = this.f97561b;
            if (cropOverlayView != null) {
                cropOverlayView.u();
            }
            requestLayout();
        }
    }

    public final void setShowCropLabel(boolean z10) {
        if (this.f97584p0 != z10) {
            this.f97584p0 = z10;
            CropOverlayView cropOverlayView = this.f97561b;
            if (cropOverlayView != null) {
                cropOverlayView.setCropperTextLabelVisibility(z10);
            }
        }
    }

    public final void setShowCropOverlay(boolean z10) {
        if (this.f97597w != z10) {
            this.f97597w = z10;
            B();
        }
    }

    public final void setShowProgressBar(boolean z10) {
        if (this.f97567g3 != z10) {
            this.f97567g3 = z10;
            F();
        }
    }

    public final void setSnapRadius(float f10) {
        if (f10 >= 0.0f) {
            CropOverlayView cropOverlayView = this.f97561b;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setSnapRadius(f10);
        }
    }

    public final boolean t() {
        return this.f97567g3;
    }

    public final void v(@NotNull com.canhub.cropper.core.a.C0876a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f97599x3 = null;
        F();
        f fVar = this.f97581n3;
        if (fVar != null) {
            fVar.a(this, new c(this.f97570i, this.f97583o3, result.a(), result.d(), result.b(), getCropPoints(), getCropRect(), getWholeImageRect(), getRotatedDegrees(), result.c()));
        }
    }

    public final void w(@NotNull com.canhub.cropper.core.b.C0878b result) {
        CropImageView cropImageView;
        Intrinsics.checkNotNullParameter(result, "result");
        this.f97598w3 = null;
        F();
        if (result.c() == null) {
            this.f97572j = result.b();
            this.f97576l = result.d();
            this.f97578m = result.e();
            cropImageView = this;
            cropImageView.A(result.a(), 0, result.g(), result.f(), result.b());
        } else {
            cropImageView = this;
        }
        j jVar = cropImageView.f97579m3;
        if (jVar != null) {
            jVar.a(cropImageView, result.g(), result.c());
        }
    }

    public final void x() {
        this.f97588q3 = 1.0f;
        this.f97589r3 = 0.0f;
        this.f97591s3 = 0.0f;
        this.f97574k = this.f97572j;
        int i10 = 4 << 0;
        this.f97576l = false;
        this.f97578m = false;
        b(getWidth(), getHeight(), false, false);
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.v();
    }

    public final void y(int i10) {
        if (this.f97570i != null) {
            int i11 = i10 < 0 ? (i10 % CropImageOptions.S3) + CropImageOptions.S3 : i10 % CropImageOptions.S3;
            CropOverlayView cropOverlayView = this.f97561b;
            Intrinsics.checkNotNull(cropOverlayView);
            boolean z10 = !cropOverlayView.p() && ((46 <= i11 && i11 < 135) || (216 <= i11 && i11 < 305));
            com.canhub.cropper.core.c cVar = com.canhub.cropper.core.c.f97737a;
            cVar.v().set(this.f97561b.getCropWindowRect());
            RectF rectFV = cVar.v();
            float fHeight = (z10 ? rectFV.height() : rectFV.width()) / 2.0f;
            RectF rectFV2 = cVar.v();
            float fWidth = (z10 ? rectFV2.width() : rectFV2.height()) / 2.0f;
            if (z10) {
                boolean z11 = this.f97576l;
                this.f97576l = this.f97578m;
                this.f97578m = z11;
            }
            this.f97562c.invert(this.f97563d);
            cVar.t()[0] = cVar.v().centerX();
            cVar.t()[1] = cVar.v().centerY();
            cVar.t()[2] = 0.0f;
            cVar.t()[3] = 0.0f;
            cVar.t()[4] = 1.0f;
            cVar.t()[5] = 0.0f;
            this.f97563d.mapPoints(cVar.t());
            this.f97574k = (this.f97574k + i11) % CropImageOptions.S3;
            b(getWidth(), getHeight(), true, false);
            this.f97562c.mapPoints(cVar.u(), cVar.t());
            float fSqrt = this.f97588q3 / ((float) Math.sqrt(Math.pow(cVar.u()[4] - cVar.u()[2], 2.0d) + Math.pow(cVar.u()[5] - cVar.u()[3], 2.0d)));
            this.f97588q3 = fSqrt;
            this.f97588q3 = Math.max(fSqrt, 1.0f);
            b(getWidth(), getHeight(), true, false);
            this.f97562c.mapPoints(cVar.u(), cVar.t());
            float fSqrt2 = (float) Math.sqrt(Math.pow(cVar.u()[4] - cVar.u()[2], 2.0d) + Math.pow(cVar.u()[5] - cVar.u()[3], 2.0d));
            float f10 = fHeight * fSqrt2;
            float f11 = fWidth * fSqrt2;
            cVar.v().set(cVar.u()[0] - f10, cVar.u()[1] - f11, cVar.u()[0] + f10, cVar.u()[1] + f11);
            this.f97561b.u();
            this.f97561b.setCropWindowRect(cVar.v());
            b(getWidth(), getHeight(), true, false);
            l(false, false);
            this.f97561b.n();
        }
    }

    public final void z(int i10, int i11) {
        CropOverlayView cropOverlayView = this.f97561b;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setAspectRatioX(i10);
        this.f97561b.setAspectRatioY(i11);
        setFixedAspectRatio(true);
    }

    public /* synthetic */ CropImageView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public CropImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Bundle bundleExtra;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f97562c = new Matrix();
        this.f97563d = new Matrix();
        this.f97565f = new float[8];
        this.f97566g = new float[8];
        this.f97597w = true;
        this.f97585p1 = "";
        this.H1 = 20.0f;
        this.f97586p2 = -1;
        this.f97567g3 = true;
        this.f97569h3 = true;
        this.f97587p3 = 1;
        this.f97588q3 = 1.0f;
        CropImageOptions cropImageOptions = null;
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (intent != null && (bundleExtra = intent.getBundleExtra(CropImage.f97508d)) != null) {
            cropImageOptions = (CropImageOptions) bundleExtra.getParcelable(CropImage.f97507c);
        }
        if (cropImageOptions == null) {
            cropImageOptions = new CropImageOptions();
            if (attributeSet != null) {
                int i10 = 2 >> 0;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y4.b.s.Bf, 0, 0);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                try {
                    cropImageOptions.f97554w = typedArrayObtainStyledAttributes.getBoolean(y4.b.s.Qf, cropImageOptions.f97554w);
                    cropImageOptions.X = typedArrayObtainStyledAttributes.getInteger(y4.b.s.Df, cropImageOptions.X);
                    cropImageOptions.Y = typedArrayObtainStyledAttributes.getInteger(y4.b.s.Ef, cropImageOptions.Y);
                    cropImageOptions.f97527i = l.values()[typedArrayObtainStyledAttributes.getInt(y4.b.s.f394884hg, cropImageOptions.f97527i.ordinal())];
                    cropImageOptions.f97537n = typedArrayObtainStyledAttributes.getBoolean(y4.b.s.Ff, cropImageOptions.f97537n);
                    cropImageOptions.f97539o = typedArrayObtainStyledAttributes.getBoolean(y4.b.s.f394812eg, cropImageOptions.f97539o);
                    cropImageOptions.f97547s = typedArrayObtainStyledAttributes.getBoolean(y4.b.s.Nf, cropImageOptions.f97547s);
                    cropImageOptions.f97549t = typedArrayObtainStyledAttributes.getInteger(y4.b.s.Zf, cropImageOptions.f97549t);
                    cropImageOptions.f97519c = d.values()[typedArrayObtainStyledAttributes.getInt(y4.b.s.f394907ig, cropImageOptions.f97519c.ordinal())];
                    cropImageOptions.f97520d = b.values()[typedArrayObtainStyledAttributes.getInt(y4.b.s.Cf, cropImageOptions.f97520d.ordinal())];
                    cropImageOptions.f97521e = typedArrayObtainStyledAttributes.getDimension(y4.b.s.Pf, cropImageOptions.f97521e);
                    cropImageOptions.f97525h = e.values()[typedArrayObtainStyledAttributes.getInt(y4.b.s.Tf, cropImageOptions.f97525h.ordinal())];
                    cropImageOptions.f97522f = typedArrayObtainStyledAttributes.getDimension(y4.b.s.f395004mg, cropImageOptions.f97522f);
                    cropImageOptions.f97523g = typedArrayObtainStyledAttributes.getDimension(y4.b.s.f395028ng, cropImageOptions.f97523g);
                    cropImageOptions.f97552v = typedArrayObtainStyledAttributes.getFloat(y4.b.s.Wf, cropImageOptions.f97552v);
                    cropImageOptions.f97526h3 = typedArrayObtainStyledAttributes.getInteger(y4.b.s.Of, cropImageOptions.f97526h3);
                    cropImageOptions.Z = typedArrayObtainStyledAttributes.getDimension(y4.b.s.Mf, cropImageOptions.Z);
                    cropImageOptions.f97541p0 = typedArrayObtainStyledAttributes.getInteger(y4.b.s.Lf, cropImageOptions.f97541p0);
                    cropImageOptions.f97542p1 = typedArrayObtainStyledAttributes.getDimension(y4.b.s.Kf, cropImageOptions.f97542p1);
                    cropImageOptions.H1 = typedArrayObtainStyledAttributes.getDimension(y4.b.s.Jf, cropImageOptions.H1);
                    cropImageOptions.f97543p2 = typedArrayObtainStyledAttributes.getDimension(y4.b.s.If, cropImageOptions.f97543p2);
                    cropImageOptions.f97524g3 = typedArrayObtainStyledAttributes.getInteger(y4.b.s.Hf, cropImageOptions.f97524g3);
                    cropImageOptions.f97528i3 = typedArrayObtainStyledAttributes.getDimension(y4.b.s.Vf, cropImageOptions.f97528i3);
                    cropImageOptions.f97530j3 = typedArrayObtainStyledAttributes.getInteger(y4.b.s.Uf, cropImageOptions.f97530j3);
                    cropImageOptions.f97532k3 = typedArrayObtainStyledAttributes.getInteger(y4.b.s.Gf, cropImageOptions.f97532k3);
                    cropImageOptions.f97529j = typedArrayObtainStyledAttributes.getBoolean(y4.b.s.f394932jg, this.f97597w);
                    cropImageOptions.f97533l = typedArrayObtainStyledAttributes.getBoolean(y4.b.s.f394980lg, this.f97567g3);
                    cropImageOptions.f97535m = typedArrayObtainStyledAttributes.getInteger(y4.b.s.f394836fg, cropImageOptions.f97535m);
                    cropImageOptions.f97542p1 = typedArrayObtainStyledAttributes.getDimension(y4.b.s.Kf, cropImageOptions.f97542p1);
                    cropImageOptions.f97534l3 = (int) typedArrayObtainStyledAttributes.getDimension(y4.b.s.f394788dg, cropImageOptions.f97534l3);
                    cropImageOptions.f97536m3 = (int) typedArrayObtainStyledAttributes.getDimension(y4.b.s.f394763cg, cropImageOptions.f97536m3);
                    cropImageOptions.f97538n3 = (int) typedArrayObtainStyledAttributes.getFloat(y4.b.s.f394738bg, cropImageOptions.f97538n3);
                    cropImageOptions.f97540o3 = (int) typedArrayObtainStyledAttributes.getFloat(y4.b.s.f394713ag, cropImageOptions.f97540o3);
                    cropImageOptions.f97544p3 = (int) typedArrayObtainStyledAttributes.getFloat(y4.b.s.Yf, cropImageOptions.f97544p3);
                    cropImageOptions.f97545q3 = (int) typedArrayObtainStyledAttributes.getFloat(y4.b.s.Xf, cropImageOptions.f97545q3);
                    cropImageOptions.G3 = typedArrayObtainStyledAttributes.getBoolean(y4.b.s.Rf, cropImageOptions.G3);
                    cropImageOptions.H3 = typedArrayObtainStyledAttributes.getBoolean(y4.b.s.Rf, cropImageOptions.H3);
                    cropImageOptions.O3 = typedArrayObtainStyledAttributes.getDimension(y4.b.s.f395100qg, cropImageOptions.O3);
                    cropImageOptions.P3 = typedArrayObtainStyledAttributes.getInteger(y4.b.s.f395076pg, cropImageOptions.P3);
                    cropImageOptions.Q3 = typedArrayObtainStyledAttributes.getString(y4.b.s.f395052og);
                    cropImageOptions.f97531k = typedArrayObtainStyledAttributes.getBoolean(y4.b.s.f394956kg, cropImageOptions.f97531k);
                    this.f97595v = typedArrayObtainStyledAttributes.getBoolean(y4.b.s.f394860gg, this.f97595v);
                    if (typedArrayObtainStyledAttributes.hasValue(y4.b.s.Df) && typedArrayObtainStyledAttributes.hasValue(y4.b.s.Df) && !typedArrayObtainStyledAttributes.hasValue(y4.b.s.Qf)) {
                        cropImageOptions.f97554w = true;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
            }
        }
        cropImageOptions.a();
        this.f97592t = cropImageOptions.f97527i;
        this.f97569h3 = cropImageOptions.f97537n;
        this.f97571i3 = cropImageOptions.f97549t;
        this.H1 = cropImageOptions.O3;
        this.f97584p0 = cropImageOptions.f97531k;
        this.f97597w = cropImageOptions.f97529j;
        this.f97567g3 = cropImageOptions.f97533l;
        this.f97576l = cropImageOptions.G3;
        this.f97578m = cropImageOptions.H3;
        View viewInflate = LayoutInflater.from(context).inflate(y4.b.l.G, (ViewGroup) this, true);
        ImageView imageView = (ImageView) viewInflate.findViewById(y4.b.i.f393038e);
        this.f97560a = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView = (CropOverlayView) viewInflate.findViewById(y4.b.i.f393018c);
        this.f97561b = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(this);
        cropOverlayView.setInitialAttributeValues(cropImageOptions);
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(y4.b.i.f393028d);
        this.f97564e = progressBar;
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(cropImageOptions.f97535m));
        F();
    }
}
