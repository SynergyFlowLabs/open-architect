package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f96353f = "ThumbStreamOpener";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f96354g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f96355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f96356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f96357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ContentResolver f96358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<ImageHeaderParser> f96359e;

    e(List<ImageHeaderParser> list, d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, ContentResolver contentResolver) {
        this(list, f96354g, dVar, bVar, contentResolver);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    @p0
    private String b(@NonNull Uri uri) throws Throwable {
        Cursor cursorA;
        Cursor cursor = null;
        try {
            cursorA = this.f96356b.a(uri);
            if (cursorA != null) {
                try {
                    try {
                        if (cursorA.moveToFirst()) {
                            String string = cursorA.getString(0);
                            cursorA.close();
                            return string;
                        }
                    } catch (SecurityException unused) {
                        if (Log.isLoggable(f96353f, 3)) {
                            Objects.toString(uri);
                        }
                        if (cursorA != null) {
                            cursorA.close();
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorA;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorA != null) {
                cursorA.close();
            }
            return null;
        } catch (SecurityException unused2) {
            cursorA = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private boolean c(File file) {
        return this.f96355a.a(file) && 0 < this.f96355a.c(file);
    }

    int a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            inputStreamOpenInputStream = this.f96358d.openInputStream(uri);
            return f.b(this.f96359e, inputStreamOpenInputStream, this.f96357c);
        } catch (IOException | NullPointerException unused) {
            if (Log.isLoggable(f96353f, 3)) {
                Objects.toString(uri);
            }
            return -1;
        } finally {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    public InputStream d(Uri uri) throws Throwable {
        String strB = b(uri);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        File fileB = this.f96355a.b(strB);
        if (!c(fileB)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileB);
        try {
            return this.f96358d.openInputStream(uriFromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
        }
    }

    e(List<ImageHeaderParser> list, a aVar, d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, ContentResolver contentResolver) {
        this.f96355a = aVar;
        this.f96356b = dVar;
        this.f96357c = bVar;
        this.f96358d = contentResolver;
        this.f96359e = list;
    }
}
