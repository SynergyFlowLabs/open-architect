package rx.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class LinkedArrayList {
    final int capacityHint;
    Object[] head;
    int indexInTail;
    volatile int size;
    Object[] tail;

    public LinkedArrayList(int i10) {
        this.capacityHint = i10;
    }

    public void add(Object obj) {
        if (this.size == 0) {
            Object[] objArr = new Object[this.capacityHint + 1];
            this.head = objArr;
            this.tail = objArr;
            objArr[0] = obj;
            this.indexInTail = 1;
            this.size = 1;
            return;
        }
        int i10 = this.indexInTail;
        int i11 = this.capacityHint;
        if (i10 != i11) {
            this.tail[i10] = obj;
            this.indexInTail = i10 + 1;
            this.size++;
        } else {
            Object[] objArr2 = new Object[i11 + 1];
            objArr2[0] = obj;
            this.tail[i11] = objArr2;
            this.tail = objArr2;
            this.indexInTail = 1;
            this.size++;
        }
    }

    public int capacityHint() {
        return this.capacityHint;
    }

    public Object[] head() {
        return this.head;
    }

    public int indexInTail() {
        return this.indexInTail;
    }

    public int size() {
        return this.size;
    }

    public Object[] tail() {
        return this.tail;
    }

    List<Object> toList() {
        int i10 = this.capacityHint;
        int i11 = this.size;
        ArrayList arrayList = new ArrayList(i11 + 1);
        Object[] objArrHead = head();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            arrayList.add(objArrHead[i13]);
            i12++;
            i13++;
            if (i13 == i10) {
                objArrHead = (Object[]) objArrHead[i10];
                i13 = 0;
            }
        }
        return arrayList;
    }

    public String toString() {
        return toList().toString();
    }
}
