package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.firebase.inappmessaging.model.MessageType;

/* JADX INFO: loaded from: classes5.dex */
@r8.d
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f122378b = 327938;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f122379c = 327970;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f122380a = 65824;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f122381a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f122381a = iArr;
            try {
                iArr[MessageType.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122381a[MessageType.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122381a[MessageType.IMAGE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f122381a[MessageType.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static String a(MessageType messageType, int i10) {
        if (i10 == 1) {
            int i11 = a.f122381a[messageType.ordinal()];
            if (i11 == 1) {
                return t8.a.f376219a;
            }
            if (i11 == 2) {
                return t8.a.f376221c;
            }
            if (i11 == 3) {
                return t8.a.f376223e;
            }
            if (i11 != 4) {
                return null;
            }
            return t8.a.f376225g;
        }
        int i12 = a.f122381a[messageType.ordinal()];
        if (i12 == 1) {
            return t8.a.f376220b;
        }
        if (i12 == 2) {
            return t8.a.f376222d;
        }
        if (i12 == 3) {
            return t8.a.f376224f;
        }
        if (i12 != 4) {
            return null;
        }
        return t8.a.f376226h;
    }

    @s8.b(t8.a.f376226h)
    @r8.e
    @s8.a
    public com.google.firebase.inappmessaging.display.internal.k b(DisplayMetrics displayMetrics) {
        com.google.firebase.inappmessaging.display.internal.k.a aVarQ = com.google.firebase.inappmessaging.display.internal.k.q();
        Float fValueOf = Float.valueOf(0.3f);
        com.google.firebase.inappmessaging.display.internal.k.a aVarM = aVarQ.i(fValueOf).j(fValueOf).g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.5f))).h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f))).k(48).l(Integer.valueOf(this.f122380a)).n(-1).m(-2);
        Boolean bool = Boolean.TRUE;
        return aVarM.d(bool).b(bool).c(bool).a();
    }

    @s8.b(t8.a.f376225g)
    @r8.e
    @s8.a
    public com.google.firebase.inappmessaging.display.internal.k c(DisplayMetrics displayMetrics) {
        com.google.firebase.inappmessaging.display.internal.k.a aVarQ = com.google.firebase.inappmessaging.display.internal.k.q();
        Float fValueOf = Float.valueOf(0.3f);
        com.google.firebase.inappmessaging.display.internal.k.a aVarM = aVarQ.i(fValueOf).j(fValueOf).g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.5f))).h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f))).k(48).l(Integer.valueOf(this.f122380a)).n(-1).m(-2);
        Boolean bool = Boolean.TRUE;
        return aVarM.d(bool).b(bool).c(bool).a();
    }

    @s8.b(t8.a.f376222d)
    @r8.e
    @s8.a
    public com.google.firebase.inappmessaging.display.internal.k d(DisplayMetrics displayMetrics) {
        com.google.firebase.inappmessaging.display.internal.k.a aVarM = com.google.firebase.inappmessaging.display.internal.k.q().g(Integer.valueOf((int) (((double) displayMetrics.heightPixels) * 0.8d))).h(Integer.valueOf(displayMetrics.widthPixels)).i(Float.valueOf(1.0f)).j(Float.valueOf(0.5f)).k(17).l(Integer.valueOf(f122379c)).n(-2).m(-2);
        Boolean bool = Boolean.FALSE;
        return aVarM.d(bool).b(bool).c(bool).a();
    }

    @s8.b(t8.a.f376221c)
    @r8.e
    @s8.a
    public com.google.firebase.inappmessaging.display.internal.k e(DisplayMetrics displayMetrics) {
        com.google.firebase.inappmessaging.display.internal.k.a aVarM = com.google.firebase.inappmessaging.display.internal.k.q().g(Integer.valueOf((int) (((double) displayMetrics.heightPixels) * 0.8d))).h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.7f))).i(Float.valueOf(0.6f)).j(Float.valueOf(1.0f)).e(Float.valueOf(0.1f)).f(Float.valueOf(0.9f)).k(17).l(Integer.valueOf(f122379c)).n(-2).m(-2);
        Boolean bool = Boolean.FALSE;
        return aVarM.d(bool).b(bool).c(bool).a();
    }

    @r8.e
    DisplayMetrics f(Application application) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) application.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    @s8.b(t8.a.f376224f)
    @r8.e
    @s8.a
    public com.google.firebase.inappmessaging.display.internal.k g(DisplayMetrics displayMetrics) {
        com.google.firebase.inappmessaging.display.internal.k.a aVarH = com.google.firebase.inappmessaging.display.internal.k.q().g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.9f))).h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f)));
        Float fValueOf = Float.valueOf(0.8f);
        com.google.firebase.inappmessaging.display.internal.k.a aVarM = aVarH.j(fValueOf).i(fValueOf).k(17).l(Integer.valueOf(f122378b)).n(-2).m(-2);
        Boolean bool = Boolean.FALSE;
        return aVarM.d(bool).b(bool).c(bool).a();
    }

    @s8.b(t8.a.f376220b)
    @r8.e
    @s8.a
    public com.google.firebase.inappmessaging.display.internal.k h(DisplayMetrics displayMetrics) {
        com.google.firebase.inappmessaging.display.internal.k.a aVarI = com.google.firebase.inappmessaging.display.internal.k.q().g(Integer.valueOf((int) (((double) displayMetrics.heightPixels) * 0.8d))).h(Integer.valueOf(displayMetrics.widthPixels)).i(Float.valueOf(1.0f));
        Float fValueOf = Float.valueOf(0.4f);
        com.google.firebase.inappmessaging.display.internal.k.a aVarM = aVarI.j(fValueOf).e(Float.valueOf(0.6f)).f(fValueOf).k(17).l(Integer.valueOf(f122378b)).n(-1).m(-1);
        Boolean bool = Boolean.FALSE;
        return aVarM.d(bool).b(bool).c(bool).a();
    }

    @s8.b(t8.a.f376219a)
    @r8.e
    @s8.a
    public com.google.firebase.inappmessaging.display.internal.k i(DisplayMetrics displayMetrics) {
        com.google.firebase.inappmessaging.display.internal.k.a aVarE = com.google.firebase.inappmessaging.display.internal.k.q().g(Integer.valueOf((int) (((double) displayMetrics.heightPixels) * 0.8d))).h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.7f))).i(Float.valueOf(0.6f)).e(Float.valueOf(0.1f));
        Float fValueOf = Float.valueOf(0.9f);
        com.google.firebase.inappmessaging.display.internal.k.a aVarM = aVarE.j(fValueOf).f(fValueOf).k(17).l(Integer.valueOf(f122378b)).n(-1).m(-2);
        Boolean bool = Boolean.FALSE;
        return aVarM.d(bool).b(bool).c(bool).a();
    }

    @s8.b(t8.a.f376223e)
    @r8.e
    @s8.a
    public com.google.firebase.inappmessaging.display.internal.k j(DisplayMetrics displayMetrics) {
        com.google.firebase.inappmessaging.display.internal.k.a aVarH = com.google.firebase.inappmessaging.display.internal.k.q().g(Integer.valueOf((int) (displayMetrics.heightPixels * 0.9f))).h(Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f)));
        Float fValueOf = Float.valueOf(0.8f);
        com.google.firebase.inappmessaging.display.internal.k.a aVarM = aVarH.j(fValueOf).i(fValueOf).k(17).l(Integer.valueOf(f122378b)).n(-2).m(-2);
        Boolean bool = Boolean.FALSE;
        return aVarM.d(bool).b(bool).c(bool).a();
    }
}
