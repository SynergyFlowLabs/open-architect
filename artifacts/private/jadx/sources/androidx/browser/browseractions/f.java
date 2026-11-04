package androidx.browser.browseractions;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.k1;
import androidx.annotation.p0;
import androidx.core.content.FileProvider;
import com.google.common.util.concurrent.t1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY})
@Deprecated
public final class f extends FileProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f11804a = "BrowserServiceFP";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f11805b = ".image_provider";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f11806c = "content";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f11807d = "image_provider";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f11808e = "image_provider_images/";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f11809f = ".png";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f11810g = "image_provider_uris";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f11811h = "last_cleanup_time";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static Object f11812i = new Object();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ContentResolver f11813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Uri f11814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.e f11815c;

        a(ContentResolver contentResolver, Uri uri, androidx.concurrent.futures.e eVar) {
            this.f11813a = contentResolver;
            this.f11814b = uri;
            this.f11815c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f11813a.openFileDescriptor(this.f11814b, "r");
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    this.f11815c.H(new FileNotFoundException());
                    return;
                }
                Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                parcelFileDescriptorOpenFileDescriptor.close();
                if (bitmapDecodeFileDescriptor == null) {
                    this.f11815c.H(new IOException("File could not be decoded."));
                } else {
                    this.f11815c.E(bitmapDecodeFileDescriptor);
                }
            } catch (IOException e10) {
                this.f11815c.H(e10);
            }
        }
    }

    private static class b extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f11816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f11817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f11818d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f11819a;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            f11816b = timeUnit.toMillis(7L);
            f11817c = timeUnit.toMillis(7L);
            f11818d = timeUnit.toMillis(1L);
        }

        b(Context context) {
            this.f11819a = context.getApplicationContext();
        }

        private static boolean b(File file) {
            return file.getName().endsWith("..png");
        }

        private static boolean c(SharedPreferences sharedPreferences) {
            return System.currentTimeMillis() > sharedPreferences.getLong(f.f11811h, System.currentTimeMillis()) + f11817c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            SharedPreferences sharedPreferences = this.f11819a.getSharedPreferences(this.f11819a.getPackageName() + f.f11805b, 0);
            if (!c(sharedPreferences)) {
                return null;
            }
            synchronized (f.f11812i) {
                try {
                    File file = new File(this.f11819a.getFilesDir(), f.f11807d);
                    if (!file.exists()) {
                        return null;
                    }
                    File[] fileArrListFiles = file.listFiles();
                    long jCurrentTimeMillis = System.currentTimeMillis() - f11816b;
                    boolean z10 = true;
                    for (File file2 : fileArrListFiles) {
                        if (b(file2) && file2.lastModified() < jCurrentTimeMillis && !file2.delete()) {
                            Objects.toString(file2.getAbsoluteFile());
                            z10 = false;
                        }
                    }
                    long jCurrentTimeMillis2 = z10 ? System.currentTimeMillis() : (System.currentTimeMillis() - f11817c) + f11818d;
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong(f.f11811h, jCurrentTimeMillis2);
                    editorEdit.apply();
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static class c extends AsyncTask<String, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f11820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f11821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bitmap f11822c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f11823d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.concurrent.futures.e<Uri> f11824e;

        c(Context context, String str, Bitmap bitmap, Uri uri, androidx.concurrent.futures.e<Uri> eVar) {
            this.f11820a = context.getApplicationContext();
            this.f11821b = str;
            this.f11822c = bitmap;
            this.f11823d = uri;
            this.f11824e = eVar;
        }

        private void c(File file) {
            FileOutputStream fileOutputStreamH;
            androidx.core.util.c cVar = new androidx.core.util.c(file);
            try {
                fileOutputStreamH = cVar.h();
                try {
                    this.f11822c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStreamH);
                    fileOutputStreamH.close();
                    cVar.c(fileOutputStreamH);
                    this.f11824e.E(this.f11823d);
                } catch (IOException e10) {
                    e = e10;
                    cVar.b(fileOutputStreamH);
                    this.f11824e.H(e);
                }
            } catch (IOException e11) {
                e = e11;
                fileOutputStreamH = null;
            }
        }

        private void d() {
            File file = new File(this.f11820a.getFilesDir(), f.f11807d);
            synchronized (f.f11812i) {
                try {
                    if (!file.exists() && !file.mkdir()) {
                        this.f11824e.H(new IOException("Could not create file directory."));
                        return;
                    }
                    File file2 = new File(file, this.f11821b + f.f11809f);
                    if (file2.exists()) {
                        this.f11824e.E(this.f11823d);
                    } else {
                        c(file2);
                    }
                    file2.setLastModified(System.currentTimeMillis());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            d();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r10) {
            new b(this.f11820a).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    private static Uri i(Context context, String str) {
        return new Uri.Builder().scheme("content").authority(context.getPackageName() + f11805b).path(f11808e + str + f11809f).build();
    }

    public static void j(@NonNull Intent intent, @p0 List<Uri> list, @NonNull Context context) {
        if (list == null || list.size() == 0) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        intent.addFlags(1);
        ClipData clipDataNewUri = ClipData.newUri(contentResolver, f11810g, list.get(0));
        for (int i10 = 1; i10 < list.size(); i10++) {
            clipDataNewUri.addItem(new ClipData.Item(list.get(i10)));
        }
        intent.setClipData(clipDataNewUri);
    }

    @NonNull
    public static t1<Bitmap> k(@NonNull ContentResolver contentResolver, @NonNull Uri uri) {
        androidx.concurrent.futures.e eVarN = androidx.concurrent.futures.e.N();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(contentResolver, uri, eVarN));
        return eVarN;
    }

    @NonNull
    @k1
    public static androidx.concurrent.futures.e<Uri> l(@NonNull Context context, @NonNull Bitmap bitmap, @NonNull String str, int i10) {
        String str2 = str + "_" + Integer.toString(i10);
        Uri uriI = i(context, str2);
        androidx.concurrent.futures.e<Uri> eVarN = androidx.concurrent.futures.e.N();
        new c(context, str2, bitmap, uriI, eVarN).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return eVarN;
    }
}
