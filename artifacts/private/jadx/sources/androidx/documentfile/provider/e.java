package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@w0(19)
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50900a = "DocumentFile";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f50901b = 512;

    private e() {
    }

    public static boolean a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(g(context, uri));
    }

    public static boolean b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String strG = g(context, uri);
        int iN = n(context, uri, "flags", 0);
        if (TextUtils.isEmpty(strG)) {
            return false;
        }
        if ((iN & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(strG) || (iN & 8) == 0) {
            return (TextUtils.isEmpty(strG) || (iN & 2) == 0) ? false : true;
        }
        return true;
    }

    private static void c(@p0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                b.a(autoCloseable);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
                boolean z10 = cursorQuery.getCount() > 0;
                c(cursorQuery);
                return z10;
            } catch (Exception e10) {
                e10.toString();
                c(cursorQuery);
                return false;
            }
        } catch (Throwable th2) {
            c(cursorQuery);
            throw th2;
        }
    }

    public static long e(Context context, Uri uri) {
        return o(context, uri, "flags", 0L);
    }

    @p0
    public static String f(Context context, Uri uri) {
        return p(context, uri, "_display_name", null);
    }

    @p0
    private static String g(Context context, Uri uri) {
        return p(context, uri, "mime_type", null);
    }

    @p0
    public static String h(Context context, Uri uri) {
        String strG = g(context, uri);
        if ("vnd.android.document/directory".equals(strG)) {
            strG = null;
        }
        return strG;
    }

    public static boolean i(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(g(context, uri));
    }

    public static boolean j(Context context, Uri uri) {
        String strG = g(context, uri);
        if (!"vnd.android.document/directory".equals(strG) && !TextUtils.isEmpty(strG)) {
            return true;
        }
        return false;
    }

    public static boolean k(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (e(context, uri) & 512) != 0;
    }

    public static long l(Context context, Uri uri) {
        return o(context, uri, "last_modified", 0L);
    }

    public static long m(Context context, Uri uri) {
        return o(context, uri, "_size", 0L);
    }

    private static int n(Context context, Uri uri, String str, int i10) {
        return (int) o(context, uri, str, i10);
    }

    private static long o(Context context, Uri uri, String str, long j10) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    c(cursorQuery);
                    return j10;
                }
                long j11 = cursorQuery.getLong(0);
                c(cursorQuery);
                return j11;
            } catch (Exception e10) {
                e10.toString();
                c(cursorQuery);
                return j10;
            }
        } catch (Throwable th2) {
            c(cursorQuery);
            throw th2;
        }
        c(cursorQuery);
        throw th2;
    }

    @p0
    private static String p(Context context, Uri uri, String str, @p0 String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    c(cursorQuery);
                    return str2;
                }
                String string = cursorQuery.getString(0);
                c(cursorQuery);
                return string;
            } catch (Exception e10) {
                e10.toString();
                c(cursorQuery);
                return str2;
            }
        } catch (Throwable th2) {
            c(cursorQuery);
            throw th2;
        }
        c(cursorQuery);
        throw th2;
    }
}
