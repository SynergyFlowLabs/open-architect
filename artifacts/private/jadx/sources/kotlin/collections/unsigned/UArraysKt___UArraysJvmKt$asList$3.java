package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.q1;
import kotlin.r1;

/* JADX INFO: loaded from: classes11.dex */
public final class UArraysKt___UArraysJvmKt$asList$3 extends AbstractList<q1> implements RandomAccess {
    final /* synthetic */ byte[] $this_asList;

    UArraysKt___UArraysJvmKt$asList$3(byte[] bArr) {
        this.$this_asList = bArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof q1) {
            return m948contains7apg3OU(((q1) obj).x0());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m948contains7apg3OU(byte b10) {
        return r1.m(this.$this_asList, b10);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return q1.c(m949getw2LRezQ(i10));
    }

    /* JADX INFO: renamed from: get-w2LRezQ, reason: not valid java name */
    public byte m949getw2LRezQ(int i10) {
        return r1.t(this.$this_asList, i10);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return r1.v(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof q1) {
            return m950indexOf7apg3OU(((q1) obj).x0());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-7apg3OU, reason: not valid java name */
    public int m950indexOf7apg3OU(byte b10) {
        return ArraysKt.indexOf(this.$this_asList, b10);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return r1.B(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof q1) {
            return m951lastIndexOf7apg3OU(((q1) obj).x0());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-7apg3OU, reason: not valid java name */
    public int m951lastIndexOf7apg3OU(byte b10) {
        return ArraysKt.lastIndexOf(this.$this_asList, b10);
    }
}
