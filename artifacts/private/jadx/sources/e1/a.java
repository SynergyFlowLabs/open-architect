package e1;

import androidx.compose.runtime.internal.w0;
import d1.h;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public class a<T> implements h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f274602b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Collection<T> f274603a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Collection<? extends T> collection) {
        this.f274603a = collection;
    }

    @Override // d1.h
    @NotNull
    public Sequence<T> O1() {
        return CollectionsKt.asSequence(this.f274603a);
    }
}
