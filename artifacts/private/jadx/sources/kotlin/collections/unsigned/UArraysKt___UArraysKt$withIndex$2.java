package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import kotlin.y1;
import kotlin.z1;

/* JADX INFO: loaded from: classes11.dex */
final class UArraysKt___UArraysKt$withIndex$2 extends l0 implements Function0<Iterator<? extends y1>> {
    final /* synthetic */ long[] $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UArraysKt___UArraysKt$withIndex$2(long[] jArr) {
        super(0);
        this.$this_withIndex = jArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Iterator<? extends y1> invoke() {
        return z1.C(this.$this_withIndex);
    }
}
