package com.google.firebase.inappmessaging.display.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.g;
import com.google.firebase.platforminfo.h;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import v8.c;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class FirebaseInappmessagingDisplayLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<g<?>> getComponents() {
        return CollectionsKt.listOf(h.b(c.f381351a, "21.0.2"));
    }
}
