package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.os.f;
import androidx.core.os.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class b extends a<Cursor> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c<Cursor>.a f52635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Uri f52636s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String[] f52637t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f52638u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String[] f52639v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f52640w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Cursor f52641x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private f f52642y;

    public b(@NonNull Context context) {
        super(context);
        this.f52635r = new c.a();
    }

    @Override // androidx.loader.content.a
    public void D() {
        super.D();
        synchronized (this) {
            try {
                f fVar = this.f52642y;
                if (fVar != null) {
                    fVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.c
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void f(Cursor cursor) {
        if (l()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f52641x;
        this.f52641x = cursor;
        if (m()) {
            super.f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @p0
    public String[] O() {
        return this.f52637t;
    }

    @p0
    public String P() {
        return this.f52638u;
    }

    @p0
    public String[] Q() {
        return this.f52639v;
    }

    @p0
    public String R() {
        return this.f52640w;
    }

    @NonNull
    public Uri S() {
        return this.f52636s;
    }

    @Override // androidx.loader.content.a
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Cursor J() {
        synchronized (this) {
            if (I()) {
                throw new u();
            }
            this.f52642y = new f();
        }
        try {
            Cursor cursorB = androidx.core.content.b.b(i().getContentResolver(), this.f52636s, this.f52637t, this.f52638u, this.f52639v, this.f52640w, this.f52642y);
            if (cursorB != null) {
                try {
                    cursorB.getCount();
                    cursorB.registerContentObserver(this.f52635r);
                } catch (RuntimeException e10) {
                    cursorB.close();
                    throw e10;
                }
            }
            synchronized (this) {
                this.f52642y = null;
            }
            return cursorB;
        } catch (Throwable th2) {
            synchronized (this) {
                try {
                    this.f52642y = null;
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // androidx.loader.content.a
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void K(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public void V(@p0 String[] strArr) {
        this.f52637t = strArr;
    }

    public void W(@p0 String str) {
        this.f52638u = str;
    }

    public void X(@p0 String[] strArr) {
        this.f52639v = strArr;
    }

    public void Y(@p0 String str) {
        this.f52640w = str;
    }

    public void Z(@NonNull Uri uri) {
        this.f52636s = uri;
    }

    @Override // androidx.loader.content.a, androidx.loader.content.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f52636s);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f52637t));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f52638u);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f52639v));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f52640w);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f52641x);
    }

    @Override // androidx.loader.content.c
    protected void r() {
        super.r();
        t();
        Cursor cursor = this.f52641x;
        if (cursor != null && !cursor.isClosed()) {
            this.f52641x.close();
        }
        this.f52641x = null;
    }

    @Override // androidx.loader.content.c
    protected void s() {
        Cursor cursor = this.f52641x;
        if (cursor != null) {
            f(cursor);
        }
        if (A() || this.f52641x == null) {
            h();
        }
    }

    @Override // androidx.loader.content.c
    protected void t() {
        b();
    }

    public b(@NonNull Context context, @NonNull Uri uri, @p0 String[] strArr, @p0 String str, @p0 String[] strArr2, @p0 String str2) {
        super(context);
        this.f52635r = new c.a();
        this.f52636s = uri;
        this.f52637t = strArr;
        this.f52638u = str;
        this.f52639v = strArr2;
        this.f52640w = str2;
    }
}
