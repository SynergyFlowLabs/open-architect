package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import kotlin.u1;
import kotlin.v1;

/* JADX INFO: loaded from: classes11.dex */
final class UArraysKt___UArraysKt$withIndex$1 extends l0 implements Function0<Iterator<? extends u1>> {
    final /* synthetic */ int[] $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UArraysKt___UArraysKt$withIndex$1(int[] iArr) {
        super(0);
        this.$this_withIndex = iArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Iterator<? extends u1> invoke() {
        return v1.C(this.$this_withIndex);
    }
}
