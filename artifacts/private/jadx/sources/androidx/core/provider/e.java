package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.collection.d1;
import com.facebook.share.internal.k;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d1<d, ProviderInfo> f48102a = new d1<>(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator<byte[]> f48103b = new Comparator() { // from class: androidx.core.provider.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return e.a((byte[]) obj, (byte[]) obj2);
        }
    };

    private interface a {
        static a a(Context context, Uri uri) {
            return new c(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    private static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f48104a;

        b(Context context, Uri uri) {
            this.f48104a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // androidx.core.provider.e.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f48104a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // androidx.core.provider.e.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f48104a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    @w0(24)
    private static class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f48105a;

        c(Context context, Uri uri) {
            this.f48105a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // androidx.core.provider.e.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f48105a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // androidx.core.provider.e.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f48105a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f48106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f48107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<List<byte[]>> f48108c;

        d(String str, String str2, List<List<byte[]>> list) {
            this.f48106a = str;
            this.f48107b = str2;
            this.f48108c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Objects.equals(this.f48106a, dVar.f48106a) && Objects.equals(this.f48107b, dVar.f48107b) && Objects.equals(this.f48108c, dVar.f48108c);
        }

        public int hashCode() {
            return Objects.hash(this.f48106a, this.f48107b, this.f48108c);
        }
    }

    private e() {
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    @l1
    static void b() {
        f48102a.d();
    }

    private static List<byte[]> c(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean d(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> e(f fVar, Resources resources) {
        return fVar.b() != null ? fVar.b() : androidx.core.content.res.f.c(resources, fVar.c());
    }

    @NonNull
    static h.b f(@NonNull Context context, @NonNull List<f> list, @p0 CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        androidx.tracing.b.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                f fVar = list.get(i10);
                ProviderInfo providerInfoG = g(context.getPackageManager(), fVar, context.getResources());
                if (providerInfoG == null) {
                    h.b bVarB = h.b.b(1, null);
                    androidx.tracing.b.f();
                    return bVarB;
                }
                arrayList.add(h(context, fVar, providerInfoG.authority, cancellationSignal));
            }
            h.b bVarA = h.b.a(0, arrayList);
            androidx.tracing.b.f();
            return bVarA;
        } catch (Throwable th2) {
            androidx.tracing.b.f();
            throw th2;
        }
    }

    @l1
    @p0
    static ProviderInfo g(@NonNull PackageManager packageManager, @NonNull f fVar, @p0 Resources resources) throws PackageManager.NameNotFoundException {
        androidx.tracing.b.c("FontProvider.getProvider");
        try {
            List<List<byte[]>> listE = e(fVar, resources);
            d dVar = new d(fVar.f(), fVar.g(), listE);
            ProviderInfo providerInfoF = f48102a.f(dVar);
            if (providerInfoF != null) {
                androidx.tracing.b.f();
                return providerInfoF;
            }
            String strF = fVar.f();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strF, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strF);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(fVar.g())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strF + ", but package was not " + fVar.g());
            }
            List<byte[]> listC = c(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listC, f48103b);
            for (int i10 = 0; i10 < listE.size(); i10++) {
                ArrayList arrayList = new ArrayList(listE.get(i10));
                Collections.sort(arrayList, f48103b);
                if (d(listC, arrayList)) {
                    f48102a.j(dVar, providerInfoResolveContentProvider);
                    androidx.tracing.b.f();
                    return providerInfoResolveContentProvider;
                }
            }
            androidx.tracing.b.f();
            return null;
        } catch (Throwable th2) {
            androidx.tracing.b.f();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [androidx.core.provider.e$a] */
    /* JADX WARN: Type inference failed for: r16v8 */
    @NonNull
    @l1
    static h.c[] h(Context context, f fVar, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        a aVar;
        boolean z10;
        androidx.tracing.b.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme(FirebaseAnalytics.d.P).authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme(FirebaseAnalytics.d.P).authority(str).appendPath(k.f101891c).build();
            a aVarA = a.a(context, uriBuild);
            Cursor cursorB = null;
            try {
                String[] strArr = {"_id", h.a.f48134a, h.a.f48135b, h.a.f48136c, h.a.f48137d, h.a.f48138e, h.a.f48139f};
                androidx.tracing.b.c("ContentQueryWrapper.query");
                try {
                    try {
                        cursorB = aVarA.b(uriBuild, strArr, "query = ?", new String[]{fVar.h()}, null, cancellationSignal);
                        androidx.tracing.b.f();
                        if (cursorB == null || cursorB.getCount() <= 0) {
                            aVar = aVarA;
                        } else {
                            int columnIndex = cursorB.getColumnIndex(h.a.f48139f);
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorB.getColumnIndex("_id");
                            int columnIndex3 = cursorB.getColumnIndex(h.a.f48134a);
                            int columnIndex4 = cursorB.getColumnIndex(h.a.f48135b);
                            int columnIndex5 = cursorB.getColumnIndex(h.a.f48137d);
                            int columnIndex6 = cursorB.getColumnIndex(h.a.f48138e);
                            while (cursorB.moveToNext()) {
                                int i10 = columnIndex != -1 ? cursorB.getInt(columnIndex) : 0;
                                int i11 = columnIndex4 != -1 ? cursorB.getInt(columnIndex4) : 0;
                                Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorB.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorB.getLong(columnIndex3));
                                int i12 = columnIndex5 != -1 ? cursorB.getInt(columnIndex5) : 400;
                                if (columnIndex6 != -1) {
                                    z10 = true;
                                    if (cursorB.getInt(columnIndex6) != 1) {
                                        z10 = false;
                                    }
                                } else {
                                    z10 = false;
                                }
                                arrayList2.add(h.c.a(uriWithAppendedId, i11, i12, z10, i10));
                                aVarA = aVarA;
                            }
                            aVar = aVarA;
                            arrayList = arrayList2;
                        }
                        if (cursorB != null) {
                            cursorB.close();
                        }
                        aVar.close();
                        return (h.c[]) arrayList.toArray(new h.c[0]);
                    } finally {
                        androidx.tracing.b.f();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r16 = context;
                    if (cursorB != null) {
                        cursorB.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r16 = aVarA;
            }
        } catch (Throwable th4) {
            androidx.tracing.b.f();
            throw th4;
        }
    }
}
