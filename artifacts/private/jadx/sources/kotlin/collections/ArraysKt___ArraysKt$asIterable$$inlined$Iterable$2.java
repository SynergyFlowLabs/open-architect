package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j;
import qj.a;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24037#2:18\n*E\n"})
public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$2 implements Iterable<Byte>, a {
    final /* synthetic */ byte[] $this_asIterable$inlined;

    public ArraysKt___ArraysKt$asIterable$$inlined$Iterable$2(byte[] bArr) {
        this.$this_asIterable$inlined = bArr;
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return j.b(this.$this_asIterable$inlined);
    }
}
