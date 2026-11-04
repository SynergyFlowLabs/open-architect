package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import com.google.common.base.t;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b1
    public static final d f61409c = new d(l6.F(), 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f61410d = k1.c1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f61411e = k1.c1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l6<a> f61412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b1
    public final long f61413b;

    @b1
    public d(List<a> list, long j10) {
        this.f61412a = l6.w(list);
        this.f61413b = j10;
    }

    private static l6<a> a(List<a> list) {
        l6.a aVarS = l6.s();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).f61378d == null) {
                aVarS.a(list.get(i10));
            }
        }
        return aVarS.e();
    }

    @b1
    public static d b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f61410d);
        return new d(parcelableArrayList == null ? l6.F() : androidx.media3.common.util.i.d(new b(), parcelableArrayList), bundle.getLong(f61411e));
    }

    @b1
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f61410d, androidx.media3.common.util.i.i(a(this.f61412a), new t() { // from class: androidx.media3.common.text.c
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return ((a) obj).c();
            }
        }));
        bundle.putLong(f61411e, this.f61413b);
        return bundle;
    }
}
