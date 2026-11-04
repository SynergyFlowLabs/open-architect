package io.intercom.android.sdk.ui.coil;

import android.content.Context;
import android.graphics.Bitmap;
import coil.c;
import coil.decode.d0;
import coil.decode.u;
import coil.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntercomImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomImageLoader.kt\nio/intercom/android/sdk/ui/coil/IntercomImageLoaderKt\n+ 2 ImageLoader.kt\ncoil/ImageLoader$Builder\n*L\n1#1,35:1\n192#2:36\n*S KotlinDebug\n*F\n+ 1 IntercomImageLoader.kt\nio/intercom/android/sdk/ui/coil/IntercomImageLoaderKt\n*L\n19#1:36\n*E\n"})
public final class IntercomImageLoaderKt {

    @Nullable
    private static j imageLoader;

    @NotNull
    public static final j getImageLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (imageLoader == null) {
            j.a aVarI = new j.a(context).i(Bitmap.Config.ARGB_8888);
            c.a aVar = new c.a();
            aVar.a(new u.a(false, 1, null));
            aVar.a(new d0.b());
            aVar.a(new PdfDecoder.Factory());
            imageLoader = aVarI.t(aVar.i()).l();
        }
        j jVar = imageLoader;
        Intrinsics.checkNotNull(jVar);
        return jVar;
    }
}
