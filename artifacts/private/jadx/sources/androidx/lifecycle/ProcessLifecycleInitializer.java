package androidx.lifecycle;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ProcessLifecycleInitializer implements androidx.startup.b<o0> {
    @Override // androidx.startup.b
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o0 create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        androidx.startup.a aVarE = androidx.startup.a.e(context);
        Intrinsics.checkNotNullExpressionValue(aVarE, "getInstance(...)");
        if (!aVarE.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        i0.a(context);
        ProcessLifecycleOwner.b bVar = ProcessLifecycleOwner.f52139i;
        bVar.c(context);
        return bVar.a();
    }

    @Override // androidx.startup.b
    @NotNull
    public List<Class<? extends androidx.startup.b<?>>> dependencies() {
        return CollectionsKt.emptyList();
    }
}
