package androidx.paging;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 {
    public static final /* synthetic */ q1.e a(int i10, int i11, boolean z10, int i12, int i13) {
        return new q1.e.a().e(i10).f(i11).b(z10).c(i12).d(i13).a();
    }

    public static /* synthetic */ q1.e b(int i10, int i11, boolean z10, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = i10;
        }
        if ((i14 & 4) != 0) {
            z10 = true;
        }
        if ((i14 & 8) != 0) {
            i12 = i10 * 3;
        }
        if ((i14 & 16) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(i10, i11, z10, i12, i13);
    }
}
