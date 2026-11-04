package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static HashMap f107875f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Object f107880k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static boolean f107881l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f107870a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f107871b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f107872c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f107873d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f107874e = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final HashMap f107876g = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final HashMap f107877h = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final HashMap f107878i = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final HashMap f107879j = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String[] f107882m = new String[0];

    static {
        int i10 = 2 << 0;
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (x0.class) {
            try {
                String str3 = null;
                if (f107875f == null) {
                    f107874e.set(false);
                    f107875f = new HashMap(16, 1.0f);
                    f107880k = new Object();
                    f107881l = false;
                    contentResolver.registerContentObserver(f107870a, true, new w0(null));
                } else if (f107874e.getAndSet(false)) {
                    f107875f.clear();
                    f107876g.clear();
                    f107877h.clear();
                    f107878i.clear();
                    f107879j.clear();
                    f107880k = new Object();
                    f107881l = false;
                }
                Object obj = f107880k;
                if (f107875f.containsKey(str)) {
                    String str4 = (String) f107875f.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = f107882m.length;
                Cursor cursorQuery = contentResolver.query(f107870a, null, null, new String[]{str}, null);
                if (cursorQuery == null) {
                    return null;
                }
                try {
                    if (!cursorQuery.moveToFirst()) {
                        c(obj, str, null);
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(1);
                    cursorQuery.close();
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    c(obj, str, string);
                    if (string != null) {
                        return string;
                    }
                    return null;
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (x0.class) {
            try {
                if (obj == f107880k) {
                    f107875f.put(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
