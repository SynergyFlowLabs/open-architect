package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47813a = "TypefaceCompatUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f47814b = ".font";

    private h0() {
    }

    public static void a(@p0 Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @p0
    public static ByteBuffer b(@NonNull Context context, @NonNull Resources resources, int i10) {
        File fileE = e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (c(fileE, resources, i10)) {
                return g(fileE);
            }
            return null;
        } finally {
            fileE.delete();
        }
    }

    public static boolean c(@NonNull File file, @NonNull Resources resources, int i10) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i10);
            try {
                boolean zD = d(file, inputStreamOpenRawResource);
                a(inputStreamOpenRawResource);
                return zD;
            } catch (Throwable th2) {
                th = th2;
                a(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean d(@NonNull File file, @NonNull InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = inputStream.read(bArr);
                        if (i10 == -1) {
                            a(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i10);
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    e.getMessage();
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    @p0
    public static File e(@NonNull Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = f47814b + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @p0
    public static ByteBuffer f(@NonNull Context context, @p0 CancellationSignal cancellationSignal, @NonNull Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @p0
    private static ByteBuffer g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    public static Map<Uri, ByteBuffer> h(@NonNull Context context, @NonNull androidx.core.provider.h.c[] cVarArr, @p0 CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (androidx.core.provider.h.c cVar : cVarArr) {
            if (cVar.b() == 0) {
                Uri uriD = cVar.d();
                if (!map.containsKey(uriD)) {
                    map.put(uriD, f(context, cancellationSignal, uriD));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
