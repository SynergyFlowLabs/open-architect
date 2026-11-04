package kotlinx.coroutines.flow;

import kotlin.i1;
import kotlinx.coroutines.d2;

/* JADX INFO: loaded from: classes11.dex */
@i1(markerClass = {d2.class})
public interface k0<T> extends z0<T>, j0<T> {
    boolean compareAndSet(T t10, T t11);

    @Override // kotlinx.coroutines.flow.z0
    T getValue();

    void setValue(T t10);
}
