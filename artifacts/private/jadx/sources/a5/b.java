package a5;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.m1;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:40:0x00ec A[Catch: Exception -> 0x0075, TryCatch #7 {Exception -> 0x0075, blocks: (B:6:0x0035, B:12:0x006d, B:40:0x00ec, B:42:0x00f1, B:43:0x00f4, B:32:0x00dd, B:35:0x00e4), top: B:48:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f1 A[Catch: Exception -> 0x0075, TryCatch #7 {Exception -> 0x0075, blocks: (B:6:0x0035, B:12:0x006d, B:40:0x00ec, B:42:0x00f1, B:43:0x00f4, B:32:0x00dd, B:35:0x00e4), top: B:48:0x0035 }] */
    @m1
    @NotNull
    public static final Uri a(@NotNull Context context, @NotNull File file) throws Throwable {
        FileOutputStream fileOutputStream;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        String str = context.getPackageName() + z4.a.f400218b;
        try {
            Uri uriForFile = FileProvider.getUriForFile(context, str, file);
            Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
            return uriForFile;
        } catch (Exception e10) {
            try {
                e10.getMessage();
                File file2 = new File(new File(context.getCacheDir(), z4.a.f400219c), file.getName());
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(file2);
                        try {
                            kotlin.io.b.l(fileInputStream2, fileOutputStream, 0, 2, null);
                            Uri uriForFile2 = FileProvider.getUriForFile(context, str, file2);
                            Intrinsics.checkNotNullExpressionValue(uriForFile2, "getUriForFile(...)");
                            fileInputStream2.close();
                            fileOutputStream.close();
                            return uriForFile2;
                        } catch (Exception e11) {
                            e = e11;
                            fileInputStream = fileInputStream2;
                            try {
                                e.getMessage();
                                String str2 = "content://" + str + "/files/my_images/";
                                Files.createDirectories(Paths.get(str2, new String[0]), new FileAttribute[0]);
                                Uri uri = Uri.parse(str2 + file.getName());
                                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                return uri;
                            } catch (Throwable th2) {
                                th = th2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        fileOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                    }
                } catch (Exception e13) {
                    e = e13;
                    fileOutputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream = null;
                }
            } catch (Exception e14) {
                e14.getMessage();
                Uri uriFromFile = Uri.fromFile(file);
                Intrinsics.checkNotNullExpressionValue(uriFromFile, "fromFile(...)");
                return uriFromFile;
            }
        }
    }
}
