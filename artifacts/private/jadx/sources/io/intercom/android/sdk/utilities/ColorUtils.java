package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.core.content.d;
import androidx.core.graphics.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;

/* JADX INFO: loaded from: classes13.dex */
public class ColorUtils {
    private static final double ACCESSIBILITY_CONTRAST_RATIO = 4.5d;
    private static final float BRIGHTNESS_CUTOFF = 0.7f;
    private static final char COLOR_PREFIX = '#';
    private static final String SHORT_COLOR_REGEX = String.format("%s([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])", Character.valueOf(COLOR_PREFIX));
    private static final int SHORT_COLOR_WITH_PREFIX_LENGTH = 4;

    public static int buttonBackgroundColorVariant(int i10) {
        float[] fArr = new float[3];
        h.q(i10, fArr);
        float f10 = fArr[2];
        float f11 = 0.95f - f10;
        float f12 = f10 - 0.85f;
        double d10 = f10;
        if (d10 > 0.9d) {
            return darkenColor(i10, f12);
        }
        return d10 < 0.35d ? lightenColor(i10, f11) : lightenColor(i10, f11);
    }

    public static int buttonTextColorVariant(int i10) {
        float[] fArr = new float[3];
        h.q(i10, fArr);
        float f10 = fArr[2];
        float f11 = f10 - 0.3f;
        double d10 = f10;
        return (d10 <= 0.9d && d10 < 0.35d) ? i10 : darkenColor(i10, f11);
    }

    @n
    private static int darkColorRes() {
        return R.color.intercom_accessibility_black;
    }

    public static int darkenColor(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        fArr[2] = fArr[2] * 0.79f;
        return Color.HSVToColor(fArr);
    }

    public static int desaturateColor(int i10, float f10) {
        float[] fArr = {0.0f, f, 0.0f};
        h.q(i10, fArr);
        float f11 = fArr[1] - f10;
        fArr[1] = Math.max(0.0f, Math.min(f11, 1.0f));
        return h.a(fArr);
    }

    public static boolean isColorLight(String str) {
        return h.n(Color.parseColor(str)) > 0.699999988079071d;
    }

    public static boolean isComparedColorsLowerThanAccessibilityContrastRatio(@l int i10, @l int i11) {
        return h.m(i10, i11) < 4.5d;
    }

    public static int lightenColor(int i10) {
        return Color.argb(Color.alpha(i10), (Color.red(i10) + 255) / 2, (Color.green(i10) + 255) / 2, (Color.blue(i10) + 255) / 2);
    }

    public static ColorFilter newGreyscaleFilter() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        return new ColorMatrixColorFilter(colorMatrix);
    }

    @l
    public static int parseColor(@NonNull String str) {
        if (str.length() == 4 && str.charAt(0) == '#') {
            str = str.replaceAll(SHORT_COLOR_REGEX, String.format("%s$1$1$2$2$3$3", Character.valueOf(COLOR_PREFIX)));
        }
        return Color.parseColor(str);
    }

    @l
    public static int primaryOrBlackAccessibility(Context context, AppConfig appConfig) {
        return isColorLight(appConfig.getPrimaryColor()) ? d.g(context, R.color.intercom_accessibility_black) : appConfig.getPrimaryColor();
    }

    @l
    private static int primaryOrBlackColor(Context context, AppConfig appConfig) {
        return appConfig.isPrimaryColorRenderDarkText() ? d.g(context, R.color.intercom_black) : appConfig.getPrimaryColor();
    }

    @l
    public static int primaryOrDarkColor(Context context, AppConfig appConfig) {
        return appConfig.isPrimaryColorRenderDarkText() ? d.g(context, darkColorRes()) : appConfig.getPrimaryColor();
    }

    public static void setImageColorWhiteOrBlack(ImageView imageView, boolean z10) {
        imageView.setColorFilter(whiteOrBlackColor(imageView.getContext(), z10));
    }

    public static void setTextColorPrimaryOrBlack(TextView textView, AppConfig appConfig) {
        int iPrimaryOrBlackColor = primaryOrBlackColor(textView.getContext(), appConfig);
        textView.setTextColor(iPrimaryOrBlackColor);
        textView.setLinkTextColor(iPrimaryOrBlackColor);
    }

    public static void setTextColorPrimaryOrDark(TextView textView, AppConfig appConfig) {
        int iPrimaryOrDarkColor = primaryOrDarkColor(textView.getContext(), appConfig);
        textView.setTextColor(iPrimaryOrDarkColor);
        textView.setLinkTextColor(iPrimaryOrDarkColor);
    }

    public static void setTextColorWhiteOrBlack(TextView textView, boolean z10) {
        int iWhiteOrBlackColor = whiteOrBlackColor(textView.getContext(), z10);
        textView.setTextColor(iWhiteOrBlackColor);
        textView.setLinkTextColor(iWhiteOrBlackColor);
    }

    public static void setTextColorWhiteOrDark(TextView textView, boolean z10) {
        int iWhiteOrDarkColor = whiteOrDarkColor(textView.getContext(), z10);
        textView.setTextColor(iWhiteOrDarkColor);
        textView.setLinkTextColor(iWhiteOrDarkColor);
    }

    @l
    public static int whiteOrBlackAccessibility(Context context, AppConfig appConfig) {
        return isColorLight(appConfig.getPrimaryColor()) ? d.g(context, R.color.intercom_accessibility_black) : d.g(context, R.color.intercom_white);
    }

    @l
    public static int whiteOrBlackColor(Context context, boolean z10) {
        return d.g(context, z10 ? R.color.intercom_accessibility_black : R.color.intercom_white);
    }

    @l
    public static int whiteOrDarkColor(Context context, boolean z10) {
        return z10 ? d.g(context, darkColorRes()) : d.g(context, R.color.intercom_white);
    }

    public static boolean isColorLight(@l int i10) {
        return 1.05d / (h.n(i10) + 0.05d) < 4.5d;
    }

    public static int darkenColor(int i10, float f10) {
        float[] fArr = {0.0f, 0.0f, f};
        h.q(i10, fArr);
        float f11 = fArr[2] - f10;
        fArr[2] = Math.max(0.0f, Math.min(f11, 1.0f));
        return h.a(fArr);
    }

    public static int lightenColor(int i10, float f10) {
        float[] fArr = {0.0f, 0.0f, f};
        h.q(i10, fArr);
        float f11 = fArr[2] + f10;
        fArr[2] = Math.max(0.0f, Math.min(f11, 1.0f));
        return h.a(fArr);
    }
}
