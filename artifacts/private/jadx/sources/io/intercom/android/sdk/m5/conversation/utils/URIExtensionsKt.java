package io.intercom.android.sdk.m5.conversation.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.exifinterface.media.a;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.sentry.protocol.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.io.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class URIExtensionsKt {
    private static final MediaData.Media.Image getImageData(Uri uri, ContentResolver contentResolver, String str, String str2, long j10) throws IOException {
        int i10;
        int i11;
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            try {
                a aVar = new a(inputStreamOpenInputStream);
                int iP = aVar.p(a.f51545z, 480);
                int iP2 = aVar.p(a.f51536y, 640);
                int iP3 = aVar.p(a.D, 1);
                boolean z10 = iP3 == 6 || iP3 == 8;
                int i12 = z10 ? iP2 : iP;
                int i13 = z10 ? iP : iP2;
                Unit unit = Unit.f312394a;
                c.a(inputStreamOpenInputStream, null);
                i10 = i13;
                i11 = i12;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    c.a(inputStreamOpenInputStream, th2);
                    throw th3;
                }
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        return new MediaData.Media.Image(str2, i10, i11, j10, str, uri, null, 64, null);
    }

    @Nullable
    public static final MediaData.Media getMediaData(@NotNull Uri uri, @NotNull Context context, boolean z10) throws IOException {
        String string;
        MediaData.Media other;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            cursorQuery.moveToFirst();
            String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
            if (cursorQuery.getColumnIndex("mime_type") != -1) {
                string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"));
            } else {
                Intrinsics.checkNotNull(string2);
                if (StringsKt.V2(string2, ".jpg", false, 2, null)) {
                    string = "image/jpg";
                } else {
                    string = StringsKt.V2(string2, ".mp4", false, 2, null) ? "video/mp4" : "";
                }
            }
            String str = string;
            long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
            Intrinsics.checkNotNull(str);
            if (StringsKt.V2(str, "video", false, 2, null)) {
                Intrinsics.checkNotNull(string2);
                other = getVideoData(uri, context, string2, str, j10, z10);
            } else if (StringsKt.V2(str, "image", false, 2, null)) {
                Intrinsics.checkNotNull(contentResolver);
                Intrinsics.checkNotNull(string2);
                other = getImageData(uri, contentResolver, string2, str, j10);
            } else {
                Intrinsics.checkNotNull(string2);
                other = new MediaData.Media.Other(str, j10, string2, uri);
            }
            c.a(cursorQuery, null);
            return other;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(cursorQuery, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ MediaData.Media getMediaData$default(Uri uri, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return getMediaData(uri, context, z10);
    }

    @NotNull
    public static final MediaData.Media.Video getVideoData(@NotNull Uri uri, @NotNull Context context, @NotNull String fileName, @NotNull String mimeType, long j10, boolean z10) throws IOException {
        MediaData.Media.Image image;
        Integer intOrNull;
        Integer intOrNull2;
        Long lC1;
        Integer numValueOf = Integer.valueOf(com.rabbitmq.client.a.f264844o);
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        long jLongValue = (strExtractMetadata == null || (lC1 = StringsKt.c1(strExtractMetadata)) == null) ? 0L : lC1.longValue();
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
        int iIntValue = 0;
        int iIntValue2 = (strExtractMetadata2 == null || (intOrNull2 = StringsKt.toIntOrNull(strExtractMetadata2)) == null) ? 0 : intOrNull2.intValue();
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
        if (strExtractMetadata3 != null && (intOrNull = StringsKt.toIntOrNull(strExtractMetadata3)) != null) {
            iIntValue = intOrNull.intValue();
        }
        if (z10) {
            String str = "thumbnail_" + StringsKt.x5(fileName, ".", null, 2, null) + ".jpg";
            Pair pair = iIntValue > iIntValue2 ? TuplesKt.to(numValueOf, 240) : TuplesKt.to(240, numValueOf);
            Bitmap scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(0L, 2, Math.max(iIntValue2 / 2, ((Number) pair.component2()).intValue()), Math.max(iIntValue / 2, ((Number) pair.component1()).intValue()));
            if (scaledFrameAtTime != null) {
                File file = new File(context.getExternalCacheDir(), d.b.f306176b);
                file.mkdir();
                File file2 = new File(file, str);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                scaledFrameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri uriForFile = FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), file2);
                Intrinsics.checkNotNull(uriForFile);
                image = new MediaData.Media.Image("image/jpg", scaledFrameAtTime.getWidth(), scaledFrameAtTime.getHeight(), file2.length(), str, uriForFile, null, 64, null);
            }
            mediaMetadataRetriever.close();
            return new MediaData.Media.Video(mimeType, iIntValue2, iIntValue, j10, fileName, uri, jLongValue, image);
        }
        image = null;
        mediaMetadataRetriever.close();
        return new MediaData.Media.Video(mimeType, iIntValue2, iIntValue, j10, fileName, uri, jLongValue, image);
    }
}
