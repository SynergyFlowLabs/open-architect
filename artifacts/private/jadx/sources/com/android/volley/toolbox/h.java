package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f89554e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<byte[]> f89555a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<byte[]> f89556b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f89557c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f89558d;

    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public h(int i10) {
        this.f89558d = i10;
    }

    private synchronized void c() {
        while (this.f89557c > this.f89558d) {
            try {
                byte[] bArrRemove = this.f89555a.remove(0);
                this.f89556b.remove(bArrRemove);
                this.f89557c -= bArrRemove.length;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f89556b.size(); i11++) {
            byte[] bArr = this.f89556b.get(i11);
            if (bArr.length >= i10) {
                this.f89557c -= bArr.length;
                this.f89556b.remove(i11);
                this.f89555a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length <= this.f89558d) {
                    this.f89555a.add(bArr);
                    int iBinarySearch = Collections.binarySearch(this.f89556b, bArr, f89554e);
                    if (iBinarySearch < 0) {
                        iBinarySearch = (-iBinarySearch) - 1;
                    }
                    this.f89556b.add(iBinarySearch, bArr);
                    this.f89557c += bArr.length;
                    c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
