package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.y1;
import kotlin.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class UArraysKt___UArraysJvmKt$asList$2 extends AbstractList<y1> implements RandomAccess {
    final /* synthetic */ long[] $this_asList;

    UArraysKt___UArraysJvmKt$asList$2(long[] jArr) {
        this.$this_asList = jArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof y1) {
            return m944containsVKZWuLQ(((y1) obj).z0());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m944containsVKZWuLQ(long j10) {
        return z1.m(this.$this_asList, j10);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return y1.c(m945getsVKNKU(i10));
    }

    /* JADX INFO: renamed from: get-s-VKNKU, reason: not valid java name */
    public long m945getsVKNKU(int i10) {
        return z1.t(this.$this_asList, i10);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return z1.v(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof y1) {
            return m946indexOfVKZWuLQ(((y1) obj).z0());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-VKZWuLQ, reason: not valid java name */
    public int m946indexOfVKZWuLQ(long j10) {
        return ArraysKt.indexOf(this.$this_asList, j10);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return z1.B(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof y1) {
            return m947lastIndexOfVKZWuLQ(((y1) obj).z0());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-VKZWuLQ, reason: not valid java name */
    public int m947lastIndexOfVKZWuLQ(long j10) {
        return ArraysKt.lastIndexOf(this.$this_asList, j10);
    }
}
