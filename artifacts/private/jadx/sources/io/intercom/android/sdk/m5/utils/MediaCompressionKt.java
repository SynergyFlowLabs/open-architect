package io.intercom.android.sdk.m5.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.v;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.lightcompressor.CompressionListener;
import io.intercom.android.sdk.lightcompressor.VideoCompressor;
import io.intercom.android.sdk.lightcompressor.VideoQuality;
import io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.conversation.utils.URIExtensionsKt;
import io.intercom.android.sdk.utilities.BitmapUtilsKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class MediaCompressionKt {

    @NotNull
    private static final String compressedImagesFolderName = "compressed_images";

    @NotNull
    private static final String compressedVideosFolderName = "compressed_videos";

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.utils.MediaCompressionKt$getCompressedMediaData$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.utils.MediaCompressionKt", f = "MediaCompression.kt", i = {0, 0, 0}, l = {133}, m = "getCompressedMediaData", n = {"uncompressedMediaData", "context", "videoNameWithoutExtension"}, s = {"L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaCompressionKt.getCompressedMediaData(null, null, this);
        }
    }

    public static final void deleteCompressedMedia(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (uri.getPathSegments().contains(compressedVideosFolderName) || uri.getPathSegments().contains(compressedImagesFolderName)) {
            new File(uri.toString()).delete();
        }
    }

    private static final CompressedImageData getCompressedImageData(Uri uri, Context context, String str) throws Throwable {
        Throwable th2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        FileOutputStream fileOutputStream = null;
        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream.close();
        }
        options.inSampleSize = BitmapUtilsKt.calculateInSampleSize(options, v.e.B, 816);
        options.inJustDecodeBounds = false;
        InputStream inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
        if (inputStreamOpenInputStream2 != null) {
            inputStreamOpenInputStream2.close();
        }
        if (bitmapDecodeStream == null) {
            return null;
        }
        Bitmap bitmapDetermineBitmapRotation = BitmapUtilsKt.determineBitmapRotation(context, uri, bitmapDecodeStream);
        File file = new File(context.getCacheDir(), compressedImagesFolderName);
        file.mkdirs();
        File file2 = new File(file, str + ".jpg");
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            try {
                bitmapDetermineBitmapRotation.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream2);
                Uri uriFromFile = Uri.fromFile(file2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
                if (uriFromFile != null) {
                    return new CompressedImageData(uriFromFile, bitmapDetermineBitmapRotation.getWidth(), bitmapDetermineBitmapRotation.getHeight(), file2.length());
                }
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                }
                if (fileOutputStream == null) {
                    throw th2;
                }
                fileOutputStream.close();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public static final Object getCompressedMediaData(@NotNull MediaData.Media media, @NotNull Context context, @NotNull kotlin.coroutines.d<? super MediaData.Media> dVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object compressedVideoData;
        Context context2;
        String str;
        MediaData.Media.Video videoCopy$default;
        MediaData.Media media2 = media;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (!(media2 instanceof MediaData.Media.Video)) {
                if (!(media2 instanceof MediaData.Media.Image)) {
                    if (media2 instanceof MediaData.Media.Other) {
                        return media2;
                    }
                    throw new k0();
                }
                MediaData.Media.Image image = (MediaData.Media.Image) media2;
                String str2 = (String) CollectionsKt.first(StringsKt.split$default(image.getFileName(), new String[]{"."}, false, 0, 6, null));
                CompressedImageData compressedImageData = getCompressedImageData(image.getUri(), context, str2);
                if (compressedImageData == null) {
                    return image;
                }
                return new MediaData.Media.Image("image/jpg", compressedImageData.getWidth(), compressedImageData.getHeight(), compressedImageData.getSize(), str2 + ".jpg", compressedImageData.getUri(), image.getExifData());
            }
            try {
                String str3 = (String) CollectionsKt.first(StringsKt.split$default(((MediaData.Media.Video) media2).getFileName(), new String[]{"."}, false, 0, 6, null));
                Uri uri = ((MediaData.Media.Video) media2).getUri();
                anonymousClass1.L$0 = media2;
                anonymousClass1.L$1 = context;
                anonymousClass1.L$2 = str3;
                anonymousClass1.label = 1;
                compressedVideoData = getCompressedVideoData(uri, context, str3, anonymousClass1);
                if (compressedVideoData == objL) {
                    return objL;
                }
                context2 = context;
                str = str3;
            } catch (Throwable unused) {
                return (MediaData.Media.Video) media2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = (String) anonymousClass1.L$2;
            Context context3 = (Context) anonymousClass1.L$1;
            MediaData.Media media3 = (MediaData.Media) anonymousClass1.L$0;
            try {
                ResultKt.m(obj);
                str = str4;
                media2 = media3;
                compressedVideoData = obj;
                context2 = context3;
            } catch (Throwable unused2) {
                media2 = media3;
                return (MediaData.Media.Video) media2;
            }
        }
        Pair pair = (Pair) compressedVideoData;
        Uri uri2 = (Uri) pair.getFirst();
        if (uri2 != null) {
            MediaData.Media.Video videoData = URIExtensionsKt.getVideoData(uri2, context2, str + ".mp4", "video/mp4", ((Number) pair.getSecond()).longValue(), false);
            if (videoData != null && (videoCopy$default = MediaData.Media.Video.copy$default(videoData, null, 0, 0, 0L, null, null, 0L, ((MediaData.Media.Video) media2).getThumbnail(), 127, null)) != null) {
                return videoCopy$default;
            }
        }
        return (MediaData.Media.Video) media2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getCompressedVideoData(Uri uri, Context context, String str, kotlin.coroutines.d<? super Pair<? extends Uri, Long>> dVar) {
        final j jVar = new j(kotlin.coroutines.intrinsics.b.e(dVar));
        final Twig logger = LumberMill.getLogger();
        VideoCompressor.start$default(context, CollectionsKt.listOf(uri), false, null, new AppSpecificStorageConfiguration(compressedVideosFolderName), new Configuration(VideoQuality.LOW, false, null, false, false, null, null, CollectionsKt.listOf(str), g.f334652s, null), new CompressionListener() { // from class: io.intercom.android.sdk.m5.utils.MediaCompressionKt$getCompressedVideoData$2$1
            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onCancelled(int i10) {
                logger.internal("Video compression cancelled.");
                kotlin.coroutines.d<Pair<? extends Uri, Long>> dVar2 = jVar;
                Result.a aVar = Result.Companion;
                dVar2.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(new CancellationException())));
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onFailure(int i10, String failureMessage) {
                Intrinsics.checkNotNullParameter(failureMessage, "failureMessage");
                logger.internal("Video compression failed: " + failureMessage + '.');
                kotlin.coroutines.d<Pair<? extends Uri, Long>> dVar2 = jVar;
                Result.a aVar = Result.Companion;
                dVar2.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(new Throwable(failureMessage))));
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onProgress(int i10, float f10) {
                logger.internal("Video compression in progress: " + f10 + '.');
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onStart(int i10) {
                logger.internal("Video compression started.");
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onSuccess(int i10, long j10, String str2) {
                logger.internal("Video compression succeeded. Video saved in " + str2 + '.');
                Uri uriFromFile = Uri.fromFile(str2 != null ? new File(str2) : null);
                kotlin.coroutines.d<Pair<? extends Uri, Long>> dVar2 = jVar;
                Result.a aVar = Result.Companion;
                dVar2.resumeWith(Result.m785constructorimpl(TuplesKt.to(uriFromFile, Long.valueOf(j10))));
            }
        }, 8, null);
        Object objA = jVar.a();
        if (objA == kotlin.coroutines.intrinsics.b.l()) {
            h.c(dVar);
        }
        return objA;
    }
}
