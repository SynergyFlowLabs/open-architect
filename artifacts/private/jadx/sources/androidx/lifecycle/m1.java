package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleAttacher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
public final class m1 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final r1 f52446a;

    public m1(@NotNull r1 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f52446a = provider;
    }

    @Override // androidx.lifecycle.j0
    public void e(@NotNull o0 source, @NotNull c0.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == c0.a.ON_CREATE) {
            source.getLifecycle().g(this);
            this.f52446a.e();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
