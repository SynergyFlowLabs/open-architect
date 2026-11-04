package io.reactivex.internal.operators.flowable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class v<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<? extends T>[] f300347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f300348c;

    static final class a<T> extends io.reactivex.internal.subscriptions.i implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final long f300349t = -8158322871608889516L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300350j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final org.reactivestreams.u<? extends T>[] f300351k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final boolean f300352l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final AtomicInteger f300353m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f300354n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        List<Throwable> f300355o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        long f300356s;

        a(org.reactivestreams.u<? extends T>[] uVarArr, boolean z10, org.reactivestreams.v<? super T> vVar) {
            super(false);
            this.f300350j = vVar;
            this.f300351k = uVarArr;
            this.f300352l = z10;
            this.f300353m = new AtomicInteger();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            h(wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300353m.getAndIncrement() == 0) {
                org.reactivestreams.u<? extends T>[] uVarArr = this.f300351k;
                int length = uVarArr.length;
                int i10 = this.f300354n;
                while (i10 != length) {
                    org.reactivestreams.u<? extends T> uVar = uVarArr[i10];
                    if (uVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.f300352l) {
                            this.f300350j.onError(nullPointerException);
                            return;
                        }
                        List arrayList = this.f300355o;
                        if (arrayList == null) {
                            arrayList = new ArrayList((length - i10) + 1);
                            this.f300355o = arrayList;
                        }
                        arrayList.add(nullPointerException);
                        i10++;
                    } else {
                        long j10 = this.f300356s;
                        if (j10 != 0) {
                            this.f300356s = 0L;
                            g(j10);
                        }
                        uVar.e(this);
                        i10++;
                        this.f300354n = i10;
                        if (this.f300353m.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list = this.f300355o;
                if (list == null) {
                    this.f300350j.onComplete();
                } else if (list.size() == 1) {
                    this.f300350j.onError(list.get(0));
                } else {
                    this.f300350j.onError(new io.reactivex.exceptions.a(list));
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f300352l) {
                this.f300350j.onError(th2);
                return;
            }
            List arrayList = this.f300355o;
            if (arrayList == null) {
                arrayList = new ArrayList((this.f300351k.length - this.f300354n) + 1);
                this.f300355o = arrayList;
            }
            arrayList.add(th2);
            onComplete();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f300356s++;
            this.f300350j.onNext(t10);
        }
    }

    public v(org.reactivestreams.u<? extends T>[] uVarArr, boolean z10) {
        this.f300347b = uVarArr;
        this.f300348c = z10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        a aVar = new a(this.f300347b, this.f300348c, vVar);
        vVar.l(aVar);
        aVar.onComplete();
    }
}
