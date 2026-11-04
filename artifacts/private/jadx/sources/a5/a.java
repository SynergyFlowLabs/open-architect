package a5;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nGetFilePathFromUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetFilePathFromUri.kt\ncom/canhub/cropper/utils/GetFilePathFromUriKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
public final class a {
    private static final void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    private static final String b(Context context, Uri uri) {
        if (Intrinsics.areEqual(uri.getScheme(), FirebaseAnalytics.d.P)) {
            return MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
        }
        String path = uri.getPath();
        if (path != null) {
            return MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(path)).toString());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.FileOutputStream] */
    private static final File c(Context context, Uri uri, boolean z10) throws Throwable {
        ?? r10;
        FileOutputStream fileOutputStream;
        String strB = b(context, uri);
        if (strB == null) {
            strB = "";
        }
        String str = "temp_file_" + (z10 ? new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) : "") + "." + strB;
        File cacheDir = context.getCacheDir();
        File file = new File(cacheDir, str);
        file.createNewFile();
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        a(inputStreamOpenInputStream, fileOutputStream);
                    }
                    fileOutputStream.flush();
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                    fileOutputStream.close();
                    return file;
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    return file;
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = cacheDir;
                if (0 != 0) {
                    inputStreamOpenInputStream.close();
                }
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            r10 = 0;
            if (0 != 0) {
                inputStreamOpenInputStream.close();
            }
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
    }

    @NotNull
    public static final String d(@NotNull Context context, @NotNull Uri uri, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String path = uri.getPath();
        if (path == null || !StringsKt.V2(path, "file://", false, 2, null)) {
            String path2 = c(context, uri, z10).getPath();
            Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
            return path2;
        }
        String path3 = uri.getPath();
        Intrinsics.checkNotNull(path3);
        return path3;
    }
}
