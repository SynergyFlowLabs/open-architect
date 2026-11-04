package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.e2;
import kotlin.f2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;

/* JADX INFO: loaded from: classes11.dex */
final class UArraysKt___UArraysKt$withIndex$4 extends l0 implements Function0<Iterator<? extends e2>> {
    final /* synthetic */ short[] $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UArraysKt___UArraysKt$withIndex$4(short[] sArr) {
        super(0);
        this.$this_withIndex = sArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Iterator<? extends e2> invoke() {
        return f2.C(this.$this_withIndex);
    }
}
