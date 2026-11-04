package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import kotlin.q1;
import kotlin.r1;

/* JADX INFO: loaded from: classes11.dex */
final class UArraysKt___UArraysKt$withIndex$3 extends l0 implements Function0<Iterator<? extends q1>> {
    final /* synthetic */ byte[] $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UArraysKt___UArraysKt$withIndex$3(byte[] bArr) {
        super(0);
        this.$this_withIndex = bArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Iterator<? extends q1> invoke() {
        return r1.C(this.$this_withIndex);
    }
}
