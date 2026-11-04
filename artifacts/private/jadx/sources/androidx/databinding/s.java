package androidx.databinding;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class s extends i<y.a, y, b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f49430h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f49431i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f49432j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f49433k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f49434l = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final androidx.core.util.s.c<b> f49429g = new androidx.core.util.s.c<>(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final i.a<y.a, y, b> f49435m = new a();

    class a extends i.a<y.a, y, b> {
        a() {
        }

        @Override // androidx.databinding.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(y.a aVar, y yVar, int i10, b bVar) {
            if (i10 == 1) {
                aVar.c(yVar, bVar.f49436a, bVar.f49437b);
                return;
            }
            if (i10 == 2) {
                aVar.f(yVar, bVar.f49436a, bVar.f49437b);
                return;
            }
            if (i10 == 3) {
                aVar.g(yVar, bVar.f49436a, bVar.f49438c, bVar.f49437b);
            } else if (i10 != 4) {
                aVar.a(yVar);
            } else {
                aVar.h(yVar, bVar.f49436a, bVar.f49437b);
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f49438c;

        b() {
        }
    }

    public s() {
        super(f49435m);
    }

    private static b q(int i10, int i11, int i12) {
        b bVarAcquire = f49429g.acquire();
        if (bVarAcquire == null) {
            bVarAcquire = new b();
        }
        bVarAcquire.f49436a = i10;
        bVarAcquire.f49438c = i11;
        bVarAcquire.f49437b = i12;
        return bVarAcquire;
    }

    @Override // androidx.databinding.i
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public synchronized void h(@NonNull y yVar, int i10, b bVar) {
        super.h(yVar, i10, bVar);
        if (bVar != null) {
            f49429g.a(bVar);
        }
    }

    public void s(@NonNull y yVar) {
        h(yVar, 0, null);
    }

    public void t(@NonNull y yVar, int i10, int i11) {
        h(yVar, 1, q(i10, 0, i11));
    }

    public void u(@NonNull y yVar, int i10, int i11) {
        h(yVar, 2, q(i10, 0, i11));
    }

    public void v(@NonNull y yVar, int i10, int i11, int i12) {
        h(yVar, 3, q(i10, i11, i12));
    }

    public void w(@NonNull y yVar, int i10, int i11) {
        h(yVar, 4, q(i10, 0, i11));
    }
}
