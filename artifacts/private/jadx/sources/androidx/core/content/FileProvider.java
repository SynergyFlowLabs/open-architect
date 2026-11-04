package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.n1;
import androidx.annotation.w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";

    @androidx.annotation.b0("mLock")
    private String mAuthority;

    @androidx.annotation.b0("mLock")
    @androidx.annotation.p0
    private b mLocalPathStrategy;

    @NonNull
    private final Object mLock;
    private final int mResourceId;
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");

    @androidx.annotation.b0("sCache")
    private static final HashMap<String, b> sCache = new HashMap<>();

    @w0(21)
    static class a {
        private a() {
        }

        static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    interface b {
        Uri a(File file);

        File b(Uri uri);
    }

    static class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f47482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap<String, File> f47483b = new HashMap<>();

        c(String str) {
            this.f47482a = str;
        }

        private boolean d(@NonNull String str, @NonNull String str2) {
            String strH = FileProvider.h(str);
            String strH2 = FileProvider.h(str2);
            if (strH.equals(strH2)) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strH2);
            sb2.append('/');
            return strH.startsWith(sb2.toString());
        }

        @Override // androidx.core.content.FileProvider.b
        public Uri a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f47483b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (d(canonicalPath, path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme(FirebaseAnalytics.d.P).authority(this.f47482a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.b
        public File b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.f47483b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (d(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        void c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f47483b.put(str, file.getCanonicalFile());
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e10);
            }
        }
    }

    public FileProvider() {
        this(0);
    }

    private static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] b(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        return objArr2;
    }

    private static String[] c(String[] strArr, int i10) {
        String[] strArr2 = new String[i10];
        System.arraycopy(strArr, 0, strArr2, 0, i10);
        return strArr2;
    }

    @NonNull
    private b d() {
        b bVar;
        synchronized (this.mLock) {
            try {
                androidx.core.util.o.e(this.mAuthority, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.mLocalPathStrategy == null) {
                    this.mLocalPathStrategy = e(getContext(), this.mAuthority, this.mResourceId);
                }
                bVar = this.mLocalPathStrategy;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    private static b e(Context context, String str, int i10) {
        b bVarG;
        HashMap<String, b> map = sCache;
        synchronized (map) {
            try {
                bVarG = map.get(str);
                if (bVarG == null) {
                    try {
                        try {
                            bVarG = g(context, str, i10);
                            map.put(str, bVarG);
                        } catch (IOException e10) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                        }
                    } catch (XmlPullParserException e11) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVarG;
    }

    private static int f(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                return 704643072;
            }
            if ("rw".equals(str)) {
                return 939524096;
            }
            if ("rwt".equals(str)) {
                return 1006632960;
            }
            throw new IllegalArgumentException("Invalid mode: " + str);
        }
        return 738197504;
    }

    private static b g(Context context, String str, int i10) throws XmlPullParserException, IOException {
        c cVar = new c(str);
        XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i10);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next == 1) {
                return cVar;
            }
            int i11 = 1 & 2;
            if (next == 2) {
                String name = fileProviderPathsMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, ATTR_PATH);
                if (TAG_ROOT_PATH.equals(name)) {
                    externalStorageDirectory = DEVICE_ROOT;
                } else if (TAG_FILES_PATH.equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if (TAG_CACHE_PATH.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (TAG_EXTERNAL.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if (TAG_EXTERNAL_FILES.equals(name)) {
                    File[] fileArrN = d.n(context, null);
                    if (fileArrN.length > 0) {
                        externalStorageDirectory = fileArrN[0];
                    }
                } else if (TAG_EXTERNAL_CACHE.equals(name)) {
                    File[] fileArrM = d.m(context);
                    if (fileArrM.length > 0) {
                        externalStorageDirectory = fileArrM[0];
                    }
                } else if (TAG_EXTERNAL_MEDIA.equals(name)) {
                    File[] fileArrA = a.a(context);
                    if (fileArrA.length > 0) {
                        externalStorageDirectory = fileArrA[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    cVar.c(attributeValue, a(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    @l1
    static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, @androidx.annotation.p0 ProviderInfo providerInfo, int i10) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i10 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(META_DATA_FILE_PROVIDER_PATHS, i10);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    public static Uri getUriForFile(@NonNull Context context, @NonNull String str, @NonNull File file) {
        return e(context, str, 0).a(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static String h(@NonNull String str) {
        if (str.length() > 0 && str.charAt(str.length() - 1) == '/') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.i
    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        int i10 = 2 & 0;
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.mLock) {
            try {
                this.mAuthority = str;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        HashMap<String, b> map = sCache;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @androidx.annotation.p0 String str, @androidx.annotation.p0 String[] strArr) {
        return d().b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.p0
    public String getType(@NonNull Uri uri) {
        File fileB = d().b(uri);
        int iLastIndexOf = fileB.getName().lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileB.getName().substring(iLastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.p0
    public String getTypeAnonymous(@NonNull Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, @NonNull ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @e.a({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(d().b(uri), f(str));
    }

    @Override // android.content.ContentProvider
    @NonNull
    public Cursor query(@NonNull Uri uri, @androidx.annotation.p0 String[] strArr, @androidx.annotation.p0 String str, @androidx.annotation.p0 String[] strArr2, @androidx.annotation.p0 String str2) {
        int i10;
        File fileB = d().b(uri);
        String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = queryParameter == null ? fileB.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i11] = "_size";
                    i10 = i11 + 1;
                    objArr[i11] = Long.valueOf(fileB.length());
                }
            }
            i11 = i10;
        }
        String[] strArrC = c(strArr3, i11);
        Object[] objArrB = b(objArr, i11);
        MatrixCursor matrixCursor = new MatrixCursor(strArrC, 1);
        matrixCursor.addRow(objArrB);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @NonNull ContentValues contentValues, @androidx.annotation.p0 String str, @androidx.annotation.p0 String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected FileProvider(@n1 int i10) {
        this.mLock = new Object();
        this.mResourceId = i10;
    }

    @NonNull
    @e.a({"StreamFiles"})
    public static Uri getUriForFile(@NonNull Context context, @NonNull String str, @NonNull File file, @NonNull String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }
}
