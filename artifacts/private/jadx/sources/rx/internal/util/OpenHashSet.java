package rx.internal.util;

import a0.b;
import java.util.Arrays;
import rx.functions.Action1;
import rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: classes14.dex */
public final class OpenHashSet<T> {
    private static final int INT_PHI = -1640531527;
    T[] keys;
    final float loadFactor;
    int mask;
    int maxSize;
    int size;

    public OpenHashSet() {
        this(16, 0.75f);
    }

    static int mix(int i10) {
        int i11 = i10 * INT_PHI;
        return i11 ^ (i11 >>> 16);
    }

    public boolean add(T t10) {
        T t11;
        T[] tArr = this.keys;
        int i10 = this.mask;
        int iMix = mix(t10.hashCode()) & i10;
        T t12 = tArr[iMix];
        if (t12 != null) {
            if (t12.equals(t10)) {
                return false;
            }
            do {
                iMix = (iMix + 1) & i10;
                t11 = tArr[iMix];
                if (t11 == null) {
                }
            } while (!t11.equals(t10));
            return false;
        }
        tArr[iMix] = t10;
        int i11 = this.size + 1;
        this.size = i11;
        if (i11 >= this.maxSize) {
            rehash();
        }
        return true;
    }

    public void clear(Action1<? super T> action1) {
        if (this.size == 0) {
            return;
        }
        T[] tArr = this.keys;
        for (b bVar : tArr) {
            if (bVar != null) {
                action1.call(bVar);
            }
        }
        Arrays.fill(tArr, (Object) null);
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    void rehash() {
        T t10;
        T[] tArr = this.keys;
        int length = tArr.length;
        int i10 = length << 1;
        int i11 = i10 - 1;
        T[] tArr2 = (T[]) new Object[i10];
        int i12 = this.size;
        while (true) {
            int i13 = i12 - 1;
            if (i12 == 0) {
                this.mask = i11;
                this.maxSize = (int) (i10 * this.loadFactor);
                this.keys = tArr2;
                return;
            }
            do {
                length--;
                t10 = tArr[length];
            } while (t10 == null);
            int iMix = mix(t10.hashCode()) & i11;
            if (tArr2[iMix] != null) {
                do {
                    iMix = (iMix + 1) & i11;
                } while (tArr2[iMix] != null);
            }
            tArr2[iMix] = tArr[length];
            i12 = i13;
        }
    }

    public boolean remove(T t10) {
        T t11;
        T[] tArr = this.keys;
        int i10 = this.mask;
        int iMix = mix(t10.hashCode()) & i10;
        T t12 = tArr[iMix];
        if (t12 == null) {
            return false;
        }
        if (t12.equals(t10)) {
            return removeEntry(iMix, tArr, i10);
        }
        do {
            iMix = (iMix + 1) & i10;
            t11 = tArr[iMix];
            if (t11 == null) {
                return false;
            }
        } while (!t11.equals(t10));
        return removeEntry(iMix, tArr, i10);
    }

    boolean removeEntry(int i10, T[] tArr, int i11) {
        int i12;
        T t10;
        this.size--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                t10 = tArr[i12];
                if (t10 != null) {
                    int iMix = mix(t10.hashCode()) & i11;
                    if (i10 > i12) {
                        if (i10 >= iMix && iMix > i12) {
                            break;
                        }
                        i13 = i12 + 1;
                    } else {
                        if (i10 >= iMix || iMix > i12) {
                            break;
                            break;
                        }
                        i13 = i12 + 1;
                    }
                } else {
                    tArr[i10] = null;
                    return true;
                }
            }
            tArr[i10] = t10;
            i10 = i12;
        }
    }

    public void terminate() {
        this.size = 0;
        this.keys = (T[]) new Object[0];
    }

    public T[] values() {
        return this.keys;
    }

    public OpenHashSet(int i10) {
        this(i10, 0.75f);
    }

    public OpenHashSet(int i10, float f10) {
        this.loadFactor = f10;
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i10);
        this.mask = iRoundToPowerOfTwo - 1;
        this.maxSize = (int) (f10 * iRoundToPowerOfTwo);
        this.keys = (T[]) new Object[iRoundToPowerOfTwo];
    }
}
