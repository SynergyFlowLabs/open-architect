package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class j4 implements Sequence<i4> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40589b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<i4> f40590a = new ArrayList();

    public final void c(@NotNull String str, @Nullable Object obj) {
        this.f40590a.add(new i4(str, obj));
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<i4> iterator() {
        return this.f40590a.iterator();
    }
}
