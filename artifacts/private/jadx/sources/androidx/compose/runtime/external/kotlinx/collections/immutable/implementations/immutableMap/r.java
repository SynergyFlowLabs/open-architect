package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class r<K, V> extends e<K, V, K> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f35655e = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    public r(@NotNull u<K, V> uVar) {
        v[] vVarArr = new v[8];
        for (int i10 = 0; i10 < 8; i10++) {
            vVarArr[i10] = new x();
        }
        super(uVar, vVarArr);
    }
}
