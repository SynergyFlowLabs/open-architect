package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@w0(21)
class h extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f50905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f50906d;

    h(@p0 a aVar, Context context, Uri uri) {
        super(aVar);
        this.f50905c = context;
        this.f50906d = uri;
    }

    private static void w(@p0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                b.a(autoCloseable);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    @p0
    private static Uri x(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean a() {
        return e.a(this.f50905c, this.f50906d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean b() {
        return e.b(this.f50905c, this.f50906d);
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public a c(String str) {
        Uri uriX = x(this.f50905c, this.f50906d, "vnd.android.document/directory", str);
        if (uriX != null) {
            return new h(this, this.f50905c, uriX);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public a d(String str, String str2) {
        Uri uriX = x(this.f50905c, this.f50906d, str, str2);
        if (uriX != null) {
            return new h(this, this.f50905c, uriX);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f50905c.getContentResolver(), this.f50906d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean f() {
        return e.d(this.f50905c, this.f50906d);
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public String k() {
        return e.f(this.f50905c, this.f50906d);
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public String m() {
        return e.h(this.f50905c, this.f50906d);
    }

    @Override // androidx.documentfile.provider.a
    public Uri n() {
        return this.f50906d;
    }

    @Override // androidx.documentfile.provider.a
    public boolean o() {
        return e.i(this.f50905c, this.f50906d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean q() {
        return e.j(this.f50905c, this.f50906d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean r() {
        return e.k(this.f50905c, this.f50906d);
    }

    @Override // androidx.documentfile.provider.a
    public long s() {
        return e.l(this.f50905c, this.f50906d);
    }

    @Override // androidx.documentfile.provider.a
    public long t() {
        return e.m(this.f50905c, this.f50906d);
    }

    @Override // androidx.documentfile.provider.a
    public a[] u() {
        ContentResolver contentResolver = this.f50905c.getContentResolver();
        Uri uri = this.f50906d;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
            while (cursorQuery.moveToNext()) {
                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f50906d, cursorQuery.getString(0)));
            }
        } catch (Exception e10) {
            e10.toString();
        } finally {
            w(cursorQuery);
        }
        Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
        a[] aVarArr = new a[uriArr.length];
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            aVarArr[i10] = new h(this, this.f50905c, uriArr[i10]);
        }
        return aVarArr;
    }

    @Override // androidx.documentfile.provider.a
    public boolean v(String str) {
        try {
            Uri uriRenameDocument = DocumentsContract.renameDocument(this.f50905c.getContentResolver(), this.f50906d, str);
            if (uriRenameDocument != null) {
                this.f50906d = uriRenameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
