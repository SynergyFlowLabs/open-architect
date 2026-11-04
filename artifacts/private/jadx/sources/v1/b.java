package v1;

import androidx.datastore.core.g;
import androidx.datastore.core.h;
import java.io.IOException;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> implements h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<g, T> f381324a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function1<? super g, ? extends T> produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.f381324a = produceNewData;
    }

    @Override // androidx.datastore.core.h
    @Nullable
    public Object a(@NotNull g gVar, @NotNull d<? super T> dVar) throws IOException {
        return this.f381324a.invoke(gVar);
    }
}
