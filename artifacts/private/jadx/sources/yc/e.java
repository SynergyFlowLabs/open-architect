package yc;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yc.b;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 2)
public final class e<T extends b> extends c<d<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f395373b = 0;

    @Override // androidx.recyclerview.widget.k.f
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object c(@NotNull d<T> oldItem, @NotNull d<T> newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return (oldItem.a() == newItem.a() || !Intrinsics.areEqual(oldItem.c(), newItem.c())) ? super.c(oldItem, newItem) : new a.C2534a(newItem.a());
    }
}
