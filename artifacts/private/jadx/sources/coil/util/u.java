package coil.util;

import android.os.SystemClock;
import androidx.annotation.m1;
import java.io.File;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHardwareBitmaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardwareBitmaps.kt\ncoil/util/FileDescriptorCounter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 Logs.kt\ncoil/util/-Logs\n*L\n1#1,215:1\n18#2:216\n21#3,4:217\n*S KotlinDebug\n*F\n+ 1 HardwareBitmaps.kt\ncoil/util/FileDescriptorCounter\n*L\n87#1:216\n90#1:217,4\n*E\n"})
final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f87867b = "FileDescriptorCounter";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f87868c = 800;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f87869d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f87870e = 30000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u f87866a = new u();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final File f87871f = new File("/proc/self/fd");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f87872g = 30;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f87873h = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f87874i = true;

    private u() {
    }

    private final boolean a() {
        int i10 = f87872g;
        f87872g = i10 + 1;
        return i10 >= 30 || SystemClock.uptimeMillis() > f87873h + ((long) 30000);
    }

    @m1
    public final synchronized boolean b(@Nullable z zVar) {
        try {
            if (a()) {
                f87872g = 0;
                f87873h = SystemClock.uptimeMillis();
                String[] list = f87871f.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z10 = length < 800;
                f87874i = z10;
                if (!z10 && zVar != null && zVar.g() <= 5) {
                    zVar.h(f87867b, 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f87874i;
    }
}
