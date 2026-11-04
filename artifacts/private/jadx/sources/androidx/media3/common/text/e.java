package androidx.media3.common.text;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import androidx.annotation.p0;
import androidx.media3.common.util.k1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f61414a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f61415b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f61416c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f61417d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f61418e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f61419f = k1.c1(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f61420g = k1.c1(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f61421h = k1.c1(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f61422i = k1.c1(3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f61423j = k1.c1(4);

    private e() {
    }

    public static ArrayList<Bundle> a(Spanned spanned) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
            arrayList.add(b(spanned, hVar, 1, hVar.b()));
        }
        for (k kVar : (k[]) spanned.getSpans(0, spanned.length(), k.class)) {
            arrayList.add(b(spanned, kVar, 2, kVar.b()));
        }
        for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
            arrayList.add(b(spanned, fVar, 3, null));
        }
        for (l lVar : (l[]) spanned.getSpans(0, spanned.length(), l.class)) {
            arrayList.add(b(spanned, lVar, 4, lVar.b()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i10, @p0 Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f61419f, spanned.getSpanStart(obj));
        bundle2.putInt(f61420g, spanned.getSpanEnd(obj));
        bundle2.putInt(f61421h, spanned.getSpanFlags(obj));
        bundle2.putInt(f61422i, i10);
        if (bundle != null) {
            bundle2.putBundle(f61423j, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i10 = bundle.getInt(f61419f);
        int i11 = bundle.getInt(f61420g);
        int i12 = bundle.getInt(f61421h);
        int i13 = bundle.getInt(f61422i, -1);
        Bundle bundle2 = bundle.getBundle(f61423j);
        if (i13 == 1) {
            spannable.setSpan(h.a((Bundle) androidx.media3.common.util.a.g(bundle2)), i10, i11, i12);
            return;
        }
        if (i13 == 2) {
            spannable.setSpan(k.a((Bundle) androidx.media3.common.util.a.g(bundle2)), i10, i11, i12);
        } else if (i13 == 3) {
            spannable.setSpan(new f(), i10, i11, i12);
        } else {
            if (i13 != 4) {
                return;
            }
            spannable.setSpan(l.a((Bundle) androidx.media3.common.util.a.g(bundle2)), i10, i11, i12);
        }
    }
}
