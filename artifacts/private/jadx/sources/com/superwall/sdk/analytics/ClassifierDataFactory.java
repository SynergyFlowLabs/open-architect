package com.superwall.sdk.analytics;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.content.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface ClassifierDataFactory {

    @SourceDebugExtension({"SMAP\nDefaultClassifierDataFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultClassifierDataFactory.kt\ncom/superwall/sdk/analytics/ClassifierDataFactory$DefaultImpls\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,119:1\n10072#2:120\n10494#2,5:121\n*S KotlinDebug\n*F\n+ 1 DefaultClassifierDataFactory.kt\ncom/superwall/sdk/analytics/ClassifierDataFactory$DefaultImpls\n*L\n41#1:120\n41#1:121,5\n*E\n"})
    public static final class DefaultImpls {
        public static long advertisedMemory(@NotNull ClassifierDataFactory classifierDataFactory) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            getActivityManager(classifierDataFactory).getMemoryInfo(memoryInfo);
            if (Build.VERSION.SDK_INT >= 34 && ((memoryInfo.advertisedMem - memoryInfo.totalMem) * ((long) 100)) / memoryInfo.advertisedMem <= 30) {
                return memoryInfo.advertisedMem;
            }
            return memoryInfo.totalMem;
        }

        @NotNull
        public static List<String> codecs(@NotNull ClassifierDataFactory classifierDataFactory) {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
                CollectionsKt.addAll(arrayList, ArraysKt.toList(supportedTypes));
            }
            return arrayList;
        }

        private static ActivityManager getActivityManager(ClassifierDataFactory classifierDataFactory) {
            Object objS = d.s(classifierDataFactory.context(), ActivityManager.class);
            Intrinsics.checkNotNull(objS, "null cannot be cast to non-null type android.app.ActivityManager");
            return (ActivityManager) objS;
        }

        @NotNull
        public static CPUInfo.Data getCpuInfo(@NotNull ClassifierDataFactory classifierDataFactory) {
            return new CPUInfo().getCpuData();
        }

        @NotNull
        public static DeviceClassifier.Orientation getOrientation(@NotNull ClassifierDataFactory classifierDataFactory) {
            int i10 = classifierDataFactory.context().getResources().getConfiguration().orientation;
            if (i10 != 1) {
                return i10 != 2 ? DeviceClassifier.Orientation.UNDEFINED : DeviceClassifier.Orientation.LANDSCAPE;
            }
            return DeviceClassifier.Orientation.PORTRAIT;
        }

        public static int getScreenHeight(@NotNull ClassifierDataFactory classifierDataFactory) {
            if (Build.VERSION.SDK_INT < 30) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager(classifierDataFactory).getDefaultDisplay().getMetrics(displayMetrics);
                return displayMetrics.heightPixels;
            }
            WindowMetrics currentWindowMetrics = getWindowManager(classifierDataFactory).getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars()), "getInsetsIgnoringVisibility(...)");
            return currentWindowMetrics.getBounds().height();
        }

        public static double getScreenSize(@NotNull ClassifierDataFactory classifierDataFactory) {
            Point point = new Point();
            getWindowManager(classifierDataFactory).getDefaultDisplay().getRealSize(point);
            DisplayMetrics displayMetrics = classifierDataFactory.context().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
            return Math.round(Math.sqrt(Math.pow(((double) point.x) / ((double) displayMetrics.xdpi), 2.0d) + Math.pow(((double) point.y) / ((double) displayMetrics.ydpi), 2.0d)) * 10.0d) / 10.0d;
        }

        public static int getScreenWidth(@NotNull ClassifierDataFactory classifierDataFactory) {
            if (Build.VERSION.SDK_INT < 30) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager(classifierDataFactory).getDefaultDisplay().getMetrics(displayMetrics);
                return displayMetrics.widthPixels;
            }
            WindowMetrics currentWindowMetrics = getWindowManager(classifierDataFactory).getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars()), "getInsetsIgnoringVisibility(...)");
            return currentWindowMetrics.getBounds().width();
        }

        private static WindowManager getWindowManager(ClassifierDataFactory classifierDataFactory) {
            Object objS = d.s(classifierDataFactory.context(), WindowManager.class);
            Intrinsics.checkNotNull(objS, "null cannot be cast to non-null type android.view.WindowManager");
            return (WindowManager) objS;
        }

        public static boolean isTabletMinWidth(@NotNull ClassifierDataFactory classifierDataFactory) {
            return classifierDataFactory.context().getResources().getConfiguration().smallestScreenWidthDp >= 600;
        }
    }

    long advertisedMemory();

    @NotNull
    List<String> codecs();

    @NotNull
    Context context();

    @NotNull
    CPUInfo.Data getCpuInfo();

    @NotNull
    DeviceClassifier.Orientation getOrientation();

    int getScreenHeight();

    double getScreenSize();

    int getScreenWidth();

    boolean isTabletMinWidth();
}
