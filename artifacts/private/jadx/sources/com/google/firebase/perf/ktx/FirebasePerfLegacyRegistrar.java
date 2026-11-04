package com.google.firebase.perf.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.g;
import com.google.firebase.perf.a;
import com.google.firebase.platforminfo.h;
import i9.b;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class FirebasePerfLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<g<?>> getComponents() {
        return CollectionsKt.listOf(h.b(b.f287044a, a.f123835g));
    }
}
