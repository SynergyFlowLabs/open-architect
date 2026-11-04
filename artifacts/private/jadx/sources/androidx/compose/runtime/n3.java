package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface n3<T> extends n7<T> {
    T component1();

    @NotNull
    Function1<T, Unit> component2();

    @Override // androidx.compose.runtime.n7
    T getValue();

    void setValue(T t10);
}
