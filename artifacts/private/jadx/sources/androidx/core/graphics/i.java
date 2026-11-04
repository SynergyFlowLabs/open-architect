package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.annotation.w0;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"ClassVerificationFailure"})
public final class i {

    public static final class a implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, Unit> f47815a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(pj.n<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, Unit> nVar) {
            this.f47815a = nVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            this.f47815a.invoke(imageDecoder, imageInfo, source);
        }
    }

    public static final class b implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, Unit> f47816a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(pj.n<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, Unit> nVar) {
            this.f47816a = nVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            this.f47816a.invoke(imageDecoder, imageInfo, source);
        }
    }

    @w0(28)
    @NotNull
    public static final Bitmap a(@NotNull ImageDecoder.Source source, @NotNull pj.n<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, Unit> nVar) {
        return ImageDecoder.decodeBitmap(source, new a(nVar));
    }

    @w0(28)
    @NotNull
    public static final Drawable b(@NotNull ImageDecoder.Source source, @NotNull pj.n<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, Unit> nVar) {
        return ImageDecoder.decodeDrawable(source, new b(nVar));
    }
}
