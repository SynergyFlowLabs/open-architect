package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.u1;
import kotlin.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class UArraysKt___UArraysJvmKt$asList$1 extends AbstractList<u1> implements RandomAccess {
    final /* synthetic */ int[] $this_asList;

    UArraysKt___UArraysJvmKt$asList$1(int[] iArr) {
        this.$this_asList = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof u1) {
            return m940containsWZ4Q5Ns(((u1) obj).z0());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m940containsWZ4Q5Ns(int i10) {
        return v1.m(this.$this_asList, i10);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return u1.c(m941getpVg5ArA(i10));
    }

    /* JADX INFO: renamed from: get-pVg5ArA, reason: not valid java name */
    public int m941getpVg5ArA(int i10) {
        return v1.t(this.$this_asList, i10);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return v1.v(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof u1) {
            return m942indexOfWZ4Q5Ns(((u1) obj).z0());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-WZ4Q5Ns, reason: not valid java name */
    public int m942indexOfWZ4Q5Ns(int i10) {
        return ArraysKt.indexOf(this.$this_asList, i10);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return v1.B(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof u1) {
            return m943lastIndexOfWZ4Q5Ns(((u1) obj).z0());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-WZ4Q5Ns, reason: not valid java name */
    public int m943lastIndexOfWZ4Q5Ns(int i10) {
        return ArraysKt.lastIndexOf(this.$this_asList, i10);
    }
}
