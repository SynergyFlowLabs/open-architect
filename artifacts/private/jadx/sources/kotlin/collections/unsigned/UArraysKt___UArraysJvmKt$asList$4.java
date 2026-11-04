package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.e2;
import kotlin.f2;

/* JADX INFO: loaded from: classes11.dex */
public final class UArraysKt___UArraysJvmKt$asList$4 extends AbstractList<e2> implements RandomAccess {
    final /* synthetic */ short[] $this_asList;

    UArraysKt___UArraysJvmKt$asList$4(short[] sArr) {
        this.$this_asList = sArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e2) {
            return m952containsxj2QHRw(((e2) obj).x0());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m952containsxj2QHRw(short s10) {
        return f2.m(this.$this_asList, s10);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return e2.c(m953getMh2AYeg(i10));
    }

    /* JADX INFO: renamed from: get-Mh2AYeg, reason: not valid java name */
    public short m953getMh2AYeg(int i10) {
        return f2.t(this.$this_asList, i10);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return f2.v(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof e2) {
            return m954indexOfxj2QHRw(((e2) obj).x0());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-xj2QHRw, reason: not valid java name */
    public int m954indexOfxj2QHRw(short s10) {
        return ArraysKt.indexOf(this.$this_asList, s10);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return f2.B(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof e2) {
            return m955lastIndexOfxj2QHRw(((e2) obj).x0());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-xj2QHRw, reason: not valid java name */
    public int m955lastIndexOfxj2QHRw(short s10) {
        return ArraysKt.lastIndexOf(this.$this_asList, s10);
    }
}
