package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f48719b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48720c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f48721d = 1001;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f48722e = 1002;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f48723f = 1003;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f48724g = 1004;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f48725h = 1006;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f48726i = 1007;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f48727j = 1008;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f48728k = 1009;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f48729l = 1010;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f48730m = 1011;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f48731n = 1012;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f48732o = 1013;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f48733p = 1014;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f48734q = 1015;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f48735r = 1016;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f48736s = 1017;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f48737t = 1018;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f48738u = 1019;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f48739v = 1020;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f48740w = 1021;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f48741x = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointerIcon f48742a;

    @androidx.annotation.w0(24)
    static class a {
        private a() {
        }

        static PointerIcon a(Bitmap bitmap, float f10, float f11) {
            return PointerIcon.create(bitmap, f10, f11);
        }

        static PointerIcon b(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }

        static PointerIcon c(Resources resources, int i10) {
            return PointerIcon.load(resources, i10);
        }
    }

    private f1(PointerIcon pointerIcon) {
        this.f48742a = pointerIcon;
    }

    @NonNull
    public static f1 a(@NonNull Bitmap bitmap, float f10, float f11) {
        return new f1(a.a(bitmap, f10, f11));
    }

    @NonNull
    public static f1 c(@NonNull Context context, int i10) {
        return new f1(a.b(context, i10));
    }

    @NonNull
    public static f1 d(@NonNull Resources resources, int i10) {
        return new f1(a.c(resources, i10));
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public Object b() {
        return this.f48742a;
    }
}
