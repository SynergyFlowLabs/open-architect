package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends BasePendingResult<e> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f105907r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f105908s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f105909t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p[] f105910u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Object f105911v;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f105912a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l f105913b;

        public a(@NonNull l lVar) {
            this.f105913b = lVar;
        }

        @NonNull
        public <R extends v> f<R> a(@NonNull p<R> pVar) {
            f<R> fVar = new f<>(this.f105912a.size());
            this.f105912a.add(pVar);
            return fVar;
        }

        @NonNull
        public d b() {
            return new d(this.f105912a, this.f105913b, null);
        }
    }

    /* synthetic */ d(List list, l lVar, d0 d0Var) {
        super(lVar);
        this.f105911v = new Object();
        int size = list.size();
        this.f105907r = size;
        p[] pVarArr = new p[size];
        this.f105910u = pVarArr;
        if (list.isEmpty()) {
            o(new e(Status.f105886f, pVarArr));
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            p pVar = (p) list.get(i10);
            this.f105910u[i10] = pVar;
            pVar.c(new c0(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.p
    public void f() {
        super.f();
        int i10 = 0;
        while (true) {
            p[] pVarArr = this.f105910u;
            if (i10 >= pVarArr.length) {
                return;
            }
            pVarArr[i10].f();
            i10++;
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @NonNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public e k(@NonNull Status status) {
        return new e(status, this.f105910u);
    }
}
