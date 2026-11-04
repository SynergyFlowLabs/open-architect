package kotlin.collections;

import com.rabbitmq.tools.jsonrpc.j;
import java.util.Iterator;
import kotlin.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = j.f266120g)
public interface Grouping<T, K> {
    K keyOf(T t10);

    @NotNull
    Iterator<T> sourceIterator();
}
