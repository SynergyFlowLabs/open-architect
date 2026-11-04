package androidx.media3.extractor.text.ssa;

import android.text.TextUtils;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f68579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f68580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f68581e;

    private a(int i10, int i11, int i12, int i13, int i14) {
        this.f68577a = i10;
        this.f68578b = i11;
        this.f68579c = i12;
        this.f68580d = i13;
        this.f68581e = i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x003e  */
    @p0
    public static a a(String str) {
        androidx.media3.common.util.a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strG = com.google.common.base.c.g(strArrSplit[i14].trim());
            strG.getClass();
            switch (strG) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i13 = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new a(i10, i11, i12, i13, strArrSplit.length);
    }
}
