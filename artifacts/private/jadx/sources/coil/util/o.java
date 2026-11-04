package coil.util;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import androidx.annotation.w0;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/-VideoUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dimension.kt\ncoil/size/-Dimensions\n*L\n1#1,69:1\n1#2:70\n57#3:71\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncoil/util/-VideoUtils\n*L\n63#1:71\n*E\n"})
@oj.i(name = "-VideoUtils")
public final class o {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87853a;

        static {
            int[] iArr = new int[coil.size.h.values().length];
            try {
                iArr[coil.size.h.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[coil.size.h.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f87853a = iArr;
        }
    }

    @Nullable
    public static final Bitmap a(@NotNull MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, @NotNull Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 30) {
            return mediaMetadataRetriever.getFrameAtTime(j10, i10);
        }
        MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
        bitmapParams.setPreferredConfig(config);
        return mediaMetadataRetriever.getFrameAtTime(j10, i10, bitmapParams);
    }

    @w0(27)
    @Nullable
    public static final Bitmap b(@NotNull MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, @NotNull Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 30) {
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, i11, i12);
        }
        MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
        bitmapParams.setPreferredConfig(config);
        return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, i11, i12, bitmapParams);
    }

    public static final int c(@NotNull coil.size.i iVar, @NotNull coil.size.h hVar, @NotNull Function0<Integer> function0) {
        return coil.size.b.f(iVar) ? function0.invoke().intValue() : d(iVar.e(), hVar);
    }

    public static final int d(@NotNull coil.size.c cVar, @NotNull coil.size.h hVar) {
        if (cVar instanceof coil.size.c.a) {
            return ((coil.size.c.a) cVar).f87767a;
        }
        int i10 = a.f87853a[hVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new k0();
    }

    public static final <T> T e(@NotNull MediaMetadataRetriever mediaMetadataRetriever, @NotNull Function1<? super MediaMetadataRetriever, ? extends T> function1) throws IOException {
        try {
            T tInvoke = function1.invoke(mediaMetadataRetriever);
            h0.d(1);
            mediaMetadataRetriever.close();
            return tInvoke;
        } finally {
            h0.d(1);
            mediaMetadataRetriever.close();
            h0.c(1);
        }
    }

    public static final int f(@NotNull coil.size.i iVar, @NotNull coil.size.h hVar, @NotNull Function0<Integer> function0) {
        return coil.size.b.f(iVar) ? function0.invoke().intValue() : d(iVar.f(), hVar);
    }
}
