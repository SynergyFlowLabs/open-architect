package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48100a = "tree";

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f48101a = 512;

        private a() {
        }
    }

    @w0(21)
    private static class b {
        private b() {
        }

        static Uri a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        static Uri b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        static Uri c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        public static Uri d(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        static Uri e(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        static String f(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        static Uri g(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.c$c, reason: collision with other inner class name */
    @w0(24)
    private static class C0399c {
        private C0399c() {
        }

        static boolean a(@NonNull Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        static boolean b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    private c() {
    }

    @p0
    public static Uri a(@NonNull String str, @p0 String str2) {
        return b.a(str, str2);
    }

    @p0
    public static Uri b(@NonNull Uri uri, @NonNull String str) {
        return b.b(uri, str);
    }

    @p0
    public static Uri c(@NonNull String str, @NonNull String str2) {
        return DocumentsContract.buildDocumentUri(str, str2);
    }

    @p0
    public static Uri d(@NonNull Uri uri, @NonNull String str) {
        return b.c(uri, str);
    }

    @p0
    public static Uri e(@NonNull String str, @NonNull String str2) {
        return b.d(str, str2);
    }

    @p0
    public static Uri f(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str, @NonNull String str2) throws FileNotFoundException {
        return b.e(contentResolver, uri, str, str2);
    }

    @p0
    public static String g(@NonNull Uri uri) {
        return DocumentsContract.getDocumentId(uri);
    }

    @p0
    public static String h(@NonNull Uri uri) {
        return b.f(uri);
    }

    public static boolean i(@NonNull Context context, @p0 Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public static boolean j(@NonNull Uri uri) {
        return C0399c.a(uri);
    }

    public static boolean k(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull Uri uri2) throws FileNotFoundException {
        return C0399c.b(contentResolver, uri, uri2);
    }

    @p0
    public static Uri l(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        return b.g(contentResolver, uri, str);
    }
}
