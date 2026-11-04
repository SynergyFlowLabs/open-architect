package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39630a = 0;

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean a(@NotNull c<?> cVar);

    @Nullable
    public abstract <T> T b(@NotNull c<T> cVar);

    public abstract <T> void c(@NotNull c<T> cVar, T t10);

    private i() {
    }
}
