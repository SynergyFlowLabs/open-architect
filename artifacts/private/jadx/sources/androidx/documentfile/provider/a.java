package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f50898b = "DocumentFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final a f50899a;

    a(@p0 a aVar) {
        this.f50899a = aVar;
    }

    @NonNull
    public static a h(@NonNull File file) {
        return new f(null, file);
    }

    @p0
    public static a i(@NonNull Context context, @NonNull Uri uri) {
        return new g(null, context, uri);
    }

    @p0
    public static a j(@NonNull Context context, @NonNull Uri uri) {
        return new h(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public static boolean p(@NonNull Context context, @p0 Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public abstract boolean a();

    public abstract boolean b();

    @p0
    public abstract a c(@NonNull String str);

    @p0
    public abstract a d(@NonNull String str, @NonNull String str2);

    public abstract boolean e();

    public abstract boolean f();

    @p0
    public a g(@NonNull String str) {
        for (a aVar : u()) {
            if (str.equals(aVar.k())) {
                return aVar;
            }
        }
        return null;
    }

    @p0
    public abstract String k();

    @p0
    public a l() {
        return this.f50899a;
    }

    @p0
    public abstract String m();

    @NonNull
    public abstract Uri n();

    public abstract boolean o();

    public abstract boolean q();

    public abstract boolean r();

    public abstract long s();

    public abstract long t();

    @NonNull
    public abstract a[] u();

    public abstract boolean v(@NonNull String str);
}
