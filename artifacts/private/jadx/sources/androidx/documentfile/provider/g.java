package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@w0(19)
class g extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f50903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f50904d;

    g(@p0 a aVar, Context context, Uri uri) {
        super(aVar);
        this.f50903c = context;
        this.f50904d = uri;
    }

    @Override // androidx.documentfile.provider.a
    public boolean a() {
        return e.a(this.f50903c, this.f50904d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean b() {
        return e.b(this.f50903c, this.f50904d);
    }

    @Override // androidx.documentfile.provider.a
    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.a
    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f50903c.getContentResolver(), this.f50904d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean f() {
        return e.d(this.f50903c, this.f50904d);
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public String k() {
        return e.f(this.f50903c, this.f50904d);
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public String m() {
        return e.h(this.f50903c, this.f50904d);
    }

    @Override // androidx.documentfile.provider.a
    public Uri n() {
        return this.f50904d;
    }

    @Override // androidx.documentfile.provider.a
    public boolean o() {
        return e.i(this.f50903c, this.f50904d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean q() {
        return e.j(this.f50903c, this.f50904d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean r() {
        return e.k(this.f50903c, this.f50904d);
    }

    @Override // androidx.documentfile.provider.a
    public long s() {
        return e.l(this.f50903c, this.f50904d);
    }

    @Override // androidx.documentfile.provider.a
    public long t() {
        return e.m(this.f50903c, this.f50904d);
    }

    @Override // androidx.documentfile.provider.a
    public a[] u() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.a
    public boolean v(String str) {
        throw new UnsupportedOperationException();
    }
}
