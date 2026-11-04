package com.google.firebase.perf.metrics;

import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f124017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f124018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f124019c;

        public a(int i10, int i11, int i12) {
            this.f124017a = i10;
            this.f124018b = i11;
            this.f124019c = i12;
        }

        public a a(a aVar) {
            return new a(this.f124017a - aVar.d(), this.f124018b - aVar.c(), this.f124019c - aVar.b());
        }

        public int b() {
            return this.f124019c;
        }

        public int c() {
            return this.f124018b;
        }

        public int d() {
            return this.f124017a;
        }
    }

    @NonNull
    public static a a(@p0 SparseIntArray[] sparseIntArrayArr) {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        int i12 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                i13 += iValueAt;
                if (iKeyAt > 700) {
                    i11 += iValueAt;
                }
                if (iKeyAt > 16) {
                    i10 += iValueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new a(i12, i10, i11);
    }
}
