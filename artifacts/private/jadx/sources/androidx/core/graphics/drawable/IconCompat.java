package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.d0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.core.util.o;
import androidx.core.util.t;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class IconCompat extends CustomVersionedParcelable {
    private static final String A = "IconCompat";
    public static final int B = -1;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 3;
    public static final int F = 4;
    public static final int G = 5;
    public static final int H = 6;
    private static final float I = 0.25f;
    private static final float J = 0.6666667f;
    private static final float K = 0.9166667f;
    private static final float L = 0.010416667f;
    private static final float M = 0.020833334f;
    private static final int N = 61;
    private static final int O = 30;

    @l1
    static final String P = "type";

    @l1
    static final String Q = "obj";

    @l1
    static final String R = "int1";

    @l1
    static final String S = "int2";

    @l1
    static final String T = "tint_list";

    @l1
    static final String U = "tint_mode";

    @l1
    static final String V = "string1";
    static final PorterDuff.Mode W = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int f47754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f47755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    @p0
    public byte[] f47756s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    @p0
    public Parcelable f47757t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public int f47758u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public int f47759v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    @p0
    public ColorStateList f47760w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    PorterDuff.Mode f47761x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    @p0
    public String f47762y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    @p0
    public String f47763z;

    @w0(23)
    static class a {
        private a() {
        }

        @p0
        static IconCompat a(@NonNull Context context, @NonNull Icon icon) {
            int iE = e(icon);
            if (iE == 2) {
                String strD = d(icon);
                try {
                    return IconCompat.y(IconCompat.C(context, strD), strD, c(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            }
            if (iE == 4) {
                return IconCompat.u(f(icon));
            }
            if (iE == 6) {
                return IconCompat.r(f(icon));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f47755r = icon;
            return iconCompat;
        }

        static IconCompat b(@NonNull Object obj) {
            t.l(obj);
            int iE = e(obj);
            if (iE == 2) {
                return IconCompat.y(null, d(obj), c(obj));
            }
            if (iE == 4) {
                return IconCompat.u(f(obj));
            }
            if (iE == 6) {
                return IconCompat.r(f(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f47755r = obj;
            return iconCompat;
        }

        @d0
        @v
        static int c(@NonNull Object obj) {
            return c.a(obj);
        }

        @p0
        static String d(@NonNull Object obj) {
            return c.b(obj);
        }

        static int e(@NonNull Object obj) {
            return c.c(obj);
        }

        @p0
        static Uri f(@NonNull Object obj) {
            return c.d(obj);
        }

        static Drawable g(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon h(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f47754q) {
                case -1:
                    return (Icon) iconCompat.f47755r;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f47755r);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.B(), iconCompat.f47758u);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f47755r, iconCompat.f47758u, iconCompat.f47759v);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f47755r);
                    break;
                case 5:
                    iconCreateWithBitmap = b.b((Bitmap) iconCompat.f47755r);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.D());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.D());
                        }
                        InputStream inputStreamE = iconCompat.E(context);
                        if (inputStreamE == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.D());
                        }
                        iconCreateWithBitmap = b.b(BitmapFactory.decodeStream(inputStreamE));
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f47760w;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f47761x;
            if (mode != IconCompat.W) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    @w0(26)
    static class b {
        private b() {
        }

        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @w0(28)
    static class c {
        private c() {
        }

        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @w0(30)
    static class d {
        private d() {
        }

        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface e {
    }

    @b1({b1.a.LIBRARY})
    public IconCompat() {
        this.f47754q = -1;
        int i10 = 6 ^ 0;
        this.f47756s = null;
        this.f47757t = null;
        this.f47758u = 0;
        this.f47759v = 0;
        this.f47760w = null;
        this.f47761x = W;
        this.f47762y = null;
    }

    static Resources C(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            String.format("Unable to find pkg=%s for icon", str);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Drawable G(Context context) {
        switch (this.f47754q) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f47755r);
            case 2:
                String strB = B();
                if (TextUtils.isEmpty(strB)) {
                    strB = context.getPackageName();
                }
                try {
                    return androidx.core.content.res.i.g(C(context, strB), this.f47758u, context.getTheme());
                } catch (RuntimeException unused) {
                    String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f47758u), this.f47755r);
                }
                break;
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f47755r, this.f47758u, this.f47759v));
            case 4:
                InputStream inputStreamE = E(context);
                if (inputStreamE != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamE));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), p((Bitmap) this.f47755r, false));
            case 6:
                InputStream inputStreamE2 = E(context);
                if (inputStreamE2 != null) {
                    return b.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamE2)));
                }
                return null;
            default:
                return null;
        }
    }

    private static String O(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @p0
    public static IconCompat l(@NonNull Bundle bundle) {
        int i10 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i10);
        iconCompat.f47758u = bundle.getInt(R);
        iconCompat.f47759v = bundle.getInt(S);
        iconCompat.f47763z = bundle.getString(V);
        if (bundle.containsKey(T)) {
            iconCompat.f47760w = (ColorStateList) bundle.getParcelable(T);
        }
        if (bundle.containsKey(U)) {
            iconCompat.f47761x = PorterDuff.Mode.valueOf(bundle.getString(U));
        }
        switch (i10) {
            case -1:
            case 1:
            case 5:
                iconCompat.f47755r = bundle.getParcelable(Q);
                return iconCompat;
            case 0:
            default:
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f47755r = bundle.getString(Q);
                return iconCompat;
            case 3:
                iconCompat.f47755r = bundle.getByteArray(Q);
                return iconCompat;
        }
    }

    @w0(23)
    @p0
    public static IconCompat m(@NonNull Context context, @NonNull Icon icon) {
        t.l(icon);
        return a.a(context, icon);
    }

    @w0(23)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public static IconCompat n(@NonNull Icon icon) {
        return a.b(icon);
    }

    @w0(23)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public static IconCompat o(@NonNull Icon icon) {
        if (a.e(icon) == 2 && a.c(icon) == 0) {
            return null;
        }
        return a.b(icon);
    }

    @l1
    static Bitmap p(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * J);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = K * f11;
        if (z10) {
            float f13 = L * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * M, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @NonNull
    public static IconCompat q(@NonNull Bitmap bitmap) {
        o.d(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f47755r = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat r(@NonNull Uri uri) {
        o.d(uri);
        return s(uri.toString());
    }

    @NonNull
    public static IconCompat s(@NonNull String str) {
        o.d(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f47755r = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat t(@NonNull Bitmap bitmap) {
        o.d(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f47755r = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat u(@NonNull Uri uri) {
        o.d(uri);
        return v(uri.toString());
    }

    @NonNull
    public static IconCompat v(@NonNull String str) {
        o.d(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f47755r = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat w(@NonNull byte[] bArr, int i10, int i11) {
        o.d(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f47755r = bArr;
        iconCompat.f47758u = i10;
        iconCompat.f47759v = i11;
        return iconCompat;
    }

    @NonNull
    public static IconCompat x(@NonNull Context context, @v int i10) {
        o.d(context);
        return y(context.getResources(), context.getPackageName(), i10);
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static IconCompat y(@p0 Resources resources, @NonNull String str, @v int i10) {
        o.d(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f47758u = i10;
        if (resources != null) {
            try {
                iconCompat.f47755r = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f47755r = str;
        }
        iconCompat.f47763z = str;
        return iconCompat;
    }

    @v
    public int A() {
        int i10 = this.f47754q;
        if (i10 == -1) {
            return a.c(this.f47755r);
        }
        if (i10 == 2) {
            return this.f47758u;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @NonNull
    public String B() {
        int i10 = this.f47754q;
        if (i10 == -1) {
            return a.d(this.f47755r);
        }
        if (i10 == 2) {
            String str = this.f47763z;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f47755r).split(":", -1)[0] : this.f47763z;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    @NonNull
    public Uri D() {
        int i10 = this.f47754q;
        if (i10 == -1) {
            return a.f(this.f47755r);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f47755r);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @b1({b1.a.LIBRARY_GROUP})
    @p0
    public InputStream E(@NonNull Context context) {
        Uri uriD = D();
        String scheme = uriD.getScheme();
        if (FirebaseAnalytics.d.P.equals(scheme) || com.facebook.share.internal.k.f101891c.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriD);
            } catch (Exception unused) {
                uriD.toString();
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f47755r));
            } catch (FileNotFoundException unused2) {
                uriD.toString();
            }
        }
        return null;
    }

    @p0
    public Drawable F(@NonNull Context context) {
        k(context);
        return a.g(N(context), context);
    }

    @NonNull
    public IconCompat H(@androidx.annotation.l int i10) {
        return J(ColorStateList.valueOf(i10));
    }

    @NonNull
    public IconCompat J(@p0 ColorStateList colorStateList) {
        this.f47760w = colorStateList;
        return this;
    }

    @NonNull
    public IconCompat K(@p0 PorterDuff.Mode mode) {
        this.f47761x = mode;
        return this;
    }

    @NonNull
    public Bundle L() {
        Bundle bundle = new Bundle();
        switch (this.f47754q) {
            case -1:
                bundle.putParcelable(Q, (Parcelable) this.f47755r);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable(Q, (Bitmap) this.f47755r);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(Q, (String) this.f47755r);
                break;
            case 3:
                bundle.putByteArray(Q, (byte[]) this.f47755r);
                break;
        }
        bundle.putInt("type", this.f47754q);
        bundle.putInt(R, this.f47758u);
        bundle.putInt(S, this.f47759v);
        bundle.putString(V, this.f47763z);
        ColorStateList colorStateList = this.f47760w;
        if (colorStateList != null) {
            bundle.putParcelable(T, colorStateList);
        }
        PorterDuff.Mode mode = this.f47761x;
        if (mode != W) {
            bundle.putString(U, mode.name());
        }
        return bundle;
    }

    @NonNull
    @w0(23)
    @Deprecated
    public Icon M() {
        return N(null);
    }

    @NonNull
    @w0(23)
    public Icon N(@p0 Context context) {
        return a.h(this, context);
    }

    public int c() {
        int i10 = this.f47754q;
        return i10 == -1 ? a.e(this.f47755r) : i10;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void d() {
        this.f47761x = PorterDuff.Mode.valueOf(this.f47762y);
        int i10 = 7 ^ 0;
        switch (this.f47754q) {
            case -1:
                Parcelable parcelable = this.f47757t;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f47755r = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f47757t;
                if (parcelable2 != null) {
                    this.f47755r = parcelable2;
                    return;
                }
                byte[] bArr = this.f47756s;
                this.f47755r = bArr;
                this.f47754q = 3;
                this.f47758u = 0;
                this.f47759v = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f47756s, Charset.forName("UTF-16"));
                this.f47755r = str;
                if (this.f47754q == 2 && this.f47763z == null) {
                    this.f47763z = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f47755r = this.f47756s;
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void f(boolean z10) {
        this.f47762y = this.f47761x.name();
        switch (this.f47754q) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f47757t = (Parcelable) this.f47755r;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f47757t = (Parcelable) this.f47755r;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f47755r;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f47756s = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f47756s = ((String) this.f47755r).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f47756s = (byte[]) this.f47755r;
                return;
            case 4:
            case 6:
                this.f47756s = this.f47755r.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void j(@NonNull Intent intent, @p0 Drawable drawable, @NonNull Context context) {
        Bitmap bitmapCopy;
        Bitmap bitmapCreateBitmap;
        k(context);
        int i10 = this.f47754q;
        if (i10 == 1) {
            bitmapCopy = (Bitmap) this.f47755r;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i10 != 2) {
            int i11 = 3 >> 5;
            if (i10 != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmapCopy = p((Bitmap) this.f47755r, true);
        } else {
            try {
                Context contextCreatePackageContext = context.createPackageContext(B(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.f47758u));
                    return;
                }
                Drawable drawableL = androidx.core.content.d.l(contextCreatePackageContext, this.f47758u);
                if (drawableL.getIntrinsicWidth() <= 0 || drawableL.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                    bitmapCreateBitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(drawableL.getIntrinsicWidth(), drawableL.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawableL.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                drawableL.draw(new Canvas(bitmapCreateBitmap));
                bitmapCopy = bitmapCreateBitmap;
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IllegalArgumentException("Can't find package " + this.f47755r, e10);
            }
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void k(@NonNull Context context) {
        Object obj;
        int identifier;
        if (this.f47754q != 2 || (obj = this.f47755r) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4) || this.f47758u == (identifier = C(context, B()).getIdentifier(str4, str3, str5))) {
                return;
            }
            this.f47758u = identifier;
        }
    }

    @NonNull
    public String toString() {
        if (this.f47754q == -1) {
            return String.valueOf(this.f47755r);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(O(this.f47754q));
        switch (this.f47754q) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f47755r).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f47755r).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f47763z);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(A())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f47758u);
                if (this.f47759v != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f47759v);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f47755r);
                break;
        }
        if (this.f47760w != null) {
            sb2.append(" tint=");
            sb2.append(this.f47760w);
        }
        if (this.f47761x != W) {
            sb2.append(" mode=");
            sb2.append(this.f47761x);
        }
        sb2.append(")");
        return sb2.toString();
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public Bitmap z() {
        int i10 = this.f47754q;
        if (i10 == -1) {
            Object obj = this.f47755r;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f47755r;
        }
        if (i10 == 5) {
            return p((Bitmap) this.f47755r, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    IconCompat(int i10) {
        this.f47756s = null;
        this.f47757t = null;
        this.f47758u = 0;
        this.f47759v = 0;
        this.f47760w = null;
        this.f47761x = W;
        this.f47762y = null;
        this.f47754q = i10;
    }
}
