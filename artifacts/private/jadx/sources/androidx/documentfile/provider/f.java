package androidx.documentfile.provider;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.p0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class f extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f50902c;

    f(@p0 a aVar, File file) {
        super(aVar);
        this.f50902c = file;
    }

    private static boolean w(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zW = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zW &= w(file2);
                }
                if (!file2.delete()) {
                    file2.toString();
                    zW = false;
                }
            }
        }
        return zW;
    }

    private static String x(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(iLastIndexOf + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // androidx.documentfile.provider.a
    public boolean a() {
        return this.f50902c.canRead();
    }

    @Override // androidx.documentfile.provider.a
    public boolean b() {
        return this.f50902c.canWrite();
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public a c(String str) {
        File file = new File(this.f50902c, str);
        if (file.isDirectory() || file.mkdir()) {
            return new f(this, file);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public a d(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f50902c, str2);
        try {
            file.createNewFile();
            return new f(this, file);
        } catch (IOException e10) {
            e10.toString();
            return null;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean e() {
        w(this.f50902c);
        return this.f50902c.delete();
    }

    @Override // androidx.documentfile.provider.a
    public boolean f() {
        return this.f50902c.exists();
    }

    @Override // androidx.documentfile.provider.a
    public String k() {
        return this.f50902c.getName();
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public String m() {
        if (this.f50902c.isDirectory()) {
            return null;
        }
        return x(this.f50902c.getName());
    }

    @Override // androidx.documentfile.provider.a
    public Uri n() {
        return Uri.fromFile(this.f50902c);
    }

    @Override // androidx.documentfile.provider.a
    public boolean o() {
        return this.f50902c.isDirectory();
    }

    @Override // androidx.documentfile.provider.a
    public boolean q() {
        return this.f50902c.isFile();
    }

    @Override // androidx.documentfile.provider.a
    public boolean r() {
        return false;
    }

    @Override // androidx.documentfile.provider.a
    public long s() {
        return this.f50902c.lastModified();
    }

    @Override // androidx.documentfile.provider.a
    public long t() {
        return this.f50902c.length();
    }

    @Override // androidx.documentfile.provider.a
    public a[] u() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = this.f50902c.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                arrayList.add(new f(this, file));
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    @Override // androidx.documentfile.provider.a
    public boolean v(String str) {
        File file = new File(this.f50902c.getParentFile(), str);
        if (!this.f50902c.renameTo(file)) {
            return false;
        }
        this.f50902c = file;
        return true;
    }
}
