package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class kh extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f108608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f108609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ lh f108610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh(lh lhVar, boolean z10, boolean z11) {
        super("log");
        Objects.requireNonNull(lhVar);
        this.f108610e = lhVar;
        this.f108608c = z10;
        this.f108609d = z11;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0088  */
    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ae A[LOOP:0: B:23:0x00a3->B:25:0x00ae, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.j
    public final p a(e5 e5Var, List list) {
        int i10;
        int i11;
        String strH;
        ArrayList arrayList;
        f6.b("log", 1, list);
        if (list.size() == 1) {
            lh lhVar = this.f108610e;
            lhVar.e().a(3, e5Var.a((p) list.get(0)).h(), Collections.EMPTY_LIST, this.f108608c, this.f108609d);
            return p.S1;
        }
        int iG = f6.g(e5Var.a((p) list.get(0)).m().doubleValue());
        if (iG != 2) {
            i10 = 3;
            if (iG == 3) {
                i11 = 1;
            } else if (iG == 5) {
                i11 = 5;
            } else if (iG == 6) {
                i11 = 2;
            }
            strH = e5Var.a((p) list.get(1)).h();
            if (list.size() == 2) {
                lh lhVar2 = this.f108610e;
                lhVar2.e().a(i11, strH, Collections.EMPTY_LIST, this.f108608c, this.f108609d);
                return p.S1;
            }
            arrayList = new ArrayList();
            for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
                arrayList.add(e5Var.a((p) list.get(i12)).h());
            }
            this.f108610e.e().a(i11, strH, arrayList, this.f108608c, this.f108609d);
            return p.S1;
        }
        i10 = 4;
        i11 = i10;
        strH = e5Var.a((p) list.get(1)).h();
        if (list.size() == 2) {
            lh lhVar3 = this.f108610e;
            lhVar3.e().a(i11, strH, Collections.EMPTY_LIST, this.f108608c, this.f108609d);
            return p.S1;
        }
        arrayList = new ArrayList();
        while (i12 < Math.min(list.size(), 5)) {
            arrayList.add(e5Var.a((p) list.get(i12)).h());
        }
        this.f108610e.e().a(i11, strH, arrayList, this.f108608c, this.f108609d);
        return p.S1;
    }
}
