package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j;
import qj.a;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n24093#2:18\n*E\n"})
public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9 implements Iterable<Character>, a {
    final /* synthetic */ char[] $this_asIterable$inlined;

    public ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9(char[] cArr) {
        this.$this_asIterable$inlined = cArr;
    }

    @Override // java.lang.Iterable
    public Iterator<Character> iterator() {
        return j.c(this.$this_asIterable$inlined);
    }
}
