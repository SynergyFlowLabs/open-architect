package yc;

import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yc.b;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 2)
public class c<T extends b> extends k.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f395369a = 0;

    @Override // androidx.recyclerview.widget.k.f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NotNull T oldItem, @NotNull T newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.k.f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(@NotNull T oldItem, @NotNull T newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.n(newItem);
    }
}
