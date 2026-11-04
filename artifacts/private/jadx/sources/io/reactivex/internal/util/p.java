package io.reactivex.internal.util;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class p<T> implements dj.c<List<T>, List<T>, List<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator<? super T> f303497a;

    public p(Comparator<? super T> comparator) {
        this.f303497a = comparator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0041, code lost:
    
        r3 = null;
     */
    @Override // dj.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<T> apply(java.util.List<T> r7, java.util.List<T> r8) throws java.lang.Exception {
        /*
            r6 = this;
            r5 = 2
            int r0 = r7.size()
            r5 = 0
            int r1 = r8.size()
            r5 = 7
            int r0 = r0 + r1
            r5 = 2
            if (r0 != 0) goto L15
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            return r6
        L15:
            java.util.ArrayList r1 = new java.util.ArrayList
            r5 = 0
            r1.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
            java.util.Iterator r8 = r8.iterator()
            r5 = 7
            boolean r0 = r7.hasNext()
            r5 = 5
            r2 = 0
            if (r0 == 0) goto L32
            java.lang.Object r0 = r7.next()
            r5 = 3
            goto L34
        L32:
            r0 = r2
            r0 = r2
        L34:
            r5 = 3
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r8.next()
            goto L41
        L40:
            r3 = r2
        L41:
            r5 = 0
            if (r0 == 0) goto L71
            if (r3 == 0) goto L71
            java.util.Comparator<? super T> r4 = r6.f303497a
            r5 = 7
            int r4 = r4.compare(r0, r3)
            r5 = 6
            if (r4 >= 0) goto L61
            r1.add(r0)
            boolean r0 = r7.hasNext()
            r5 = 3
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r7.next()
            goto L41
        L5f:
            r0 = r2
            goto L41
        L61:
            r1.add(r3)
            r5 = 6
            boolean r3 = r8.hasNext()
            r5 = 0
            if (r3 == 0) goto L40
            java.lang.Object r3 = r8.next()
            goto L41
        L71:
            if (r0 == 0) goto L86
            r1.add(r0)
        L76:
            boolean r6 = r7.hasNext()
            r5 = 3
            if (r6 == 0) goto L98
            r5 = 0
            java.lang.Object r6 = r7.next()
            r1.add(r6)
            goto L76
        L86:
            r1.add(r3)
        L89:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L98
            java.lang.Object r6 = r8.next()
            r5 = 4
            r1.add(r6)
            goto L89
        L98:
            r5 = 6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.p.apply(java.util.List, java.util.List):java.util.List");
    }
}
