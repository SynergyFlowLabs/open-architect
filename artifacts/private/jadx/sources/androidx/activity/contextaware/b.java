package androidx.activity.contextaware;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nContextAwareHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAwareHelper.kt\nandroidx/activity/contextaware/ContextAwareHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<d> f9882a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private volatile Context f9883b;

    public final void a(@NotNull d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.f9883b;
        if (context != null) {
            listener.a(context);
        }
        this.f9882a.add(listener);
    }

    public final void b() {
        this.f9883b = null;
    }

    public final void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9883b = context;
        Iterator<d> it = this.f9882a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    @Nullable
    public final Context d() {
        return this.f9883b;
    }

    public final void e(@NotNull d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f9882a.remove(listener);
    }
}
